package com.alipay.mobile.common.ipc.biz;

import android.os.DeadObjectException;
import com.alipay.mobile.common.ipc.api.IPCResultDesc;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IPCCallable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IIPCManager f3926a;
    public final Lock b = new ReentrantLock();

    public IPCCallable(IIPCManager iIPCManager) {
        this.f3926a = iIPCManager;
    }

    public IPCResult call(IPCParameter iPCParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCResult) ipChange.ipc$dispatch("700b181f", new Object[]{this, iPCParameter});
        }
        try {
            IIPCManager iIPCManager = this.f3926a;
            if (iIPCManager == null) {
                IPCResult iPCResult = new IPCResult();
                iPCResult.resultCode = 107;
                iPCResult.resultMsg = IPCResultDesc.RETURN_LOCAL_IPCMANAGER_IS_NULL_MSG;
                LogCatUtil.error("IPCCallable", "[call] ipcManager obj is null.");
                return iPCResult;
            } else if (iIPCManager instanceof IPCManagerService) {
                IPCManagerService iPCManagerService = (IPCManagerService) iIPCManager;
                if (iPCManagerService.hashRegister()) {
                    return iPCManagerService.callback(iPCParameter);
                }
                IPCResult iPCResult2 = new IPCResult();
                iPCResult2.resultCode = 1;
                iPCResult2.resultMsg = "Peer not registered";
                return iPCResult2;
            } else {
                ((ReentrantLock) this.b).lock();
                IPCResult call = this.f3926a.call(iPCParameter);
                ((ReentrantLock) this.b).unlock();
                if (call != null) {
                    return call;
                }
                throw new IllegalStateException("remote return ipcResult is null!");
            }
        } catch (Exception e) {
            LogCatUtil.error("IPCCallable", "[call] Exception: " + e.toString(), e);
            IPCResult iPCResult3 = new IPCResult();
            if (e instanceof DeadObjectException) {
                iPCResult3.resultCode = 201;
                iPCResult3.resultMsg = "android.os.DeadObjectException";
            } else {
                iPCResult3.resultCode = 200;
                iPCResult3.resultMsg = e.getMessage();
            }
            return iPCResult3;
        }
    }
}
