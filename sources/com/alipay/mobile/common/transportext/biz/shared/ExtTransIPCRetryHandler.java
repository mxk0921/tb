package com.alipay.mobile.common.transportext.biz.shared;

import android.os.SystemClock;
import com.alipay.mobile.common.ipc.api.IPCException;
import com.alipay.mobile.common.ipc.api.IPCRetryHandler;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.mmtp.BindEventListenerManger;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtTransIPCRetryHandler implements IPCRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4209a = {"isAmnetActiveted"};

    @Override // com.alipay.mobile.common.ipc.api.IPCRetryHandler
    public boolean retryIPCCall(Method method, Object[] objArr, IPCException iPCException, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a52ef99f", new Object[]{this, method, objArr, iPCException, new Integer(i)})).booleanValue();
        }
        LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. method=[" + method.getName() + "], ipcException=" + iPCException.toString() + ", retryTimes:" + i);
        if (i > 5) {
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. retryTimes > 5 , no retry");
            return false;
        }
        int i2 = iPCException.errorCode;
        if (i2 == 201) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            BindPushServiceManager instance = BindPushServiceManager.BindPushServiceFactory.getInstance();
            instance.unbindService();
            BindEventListenerManger.getInstance().waitToUnBinded();
            instance.bindService();
            BindEventListenerManger.getInstance().waitToBinded();
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. errorCode=DEAD_OBJECT_ERROR,  retry result = " + instance.isBindedService() + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            BindPushServiceManager instance2 = BindPushServiceManager.BindPushServiceFactory.getInstance();
            for (int i3 = 0; i3 < 1; i3++) {
                String str = f4209a[i3];
                if (str.equals(method.getName())) {
                    LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "[retryIPCCall] No more retry. methodName = ".concat(str));
                    instance2.bindService();
                    return true;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            for (int i4 = 0; i4 < 3 && !instance2.isBindedService(); i4++) {
                instance2.bindService();
                BindEventListenerManger.getInstance().waitToBinded();
            }
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. errorCode=IPC_NO_BINDER_CODE, retry result = " + instance2.isBindedService() + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime2));
            return true;
        }
    }
}
