package com.alipay.mobile.common.ipc.biz;

import android.content.Context;
import android.os.RemoteException;
import com.alipay.mobile.common.ipc.api.IPCCallManager;
import com.alipay.mobile.common.ipc.api.IPCContextManager;
import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IPCContextManagerImpl implements IPCContextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IPCCallManager f3927a;
    public ServiceBeanManager b;
    public LocalCallManager c;
    public IIPCManager d;
    public IIPCCallBack e;

    public IIPCCallBack getIIPCCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IIPCCallBack) ipChange.ipc$dispatch("eb59c6af", new Object[]{this});
        }
        if (this.e == null) {
            IPCCallBackService iPCCallBackService = new IPCCallBackService();
            iPCCallBackService.setLocalCallManager(getLocalCallManager());
            this.e = iPCCallBackService;
        }
        return this.e;
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public IPCCallManager getIpcCallManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCCallManager) ipChange.ipc$dispatch("35b9b3b8", new Object[]{this});
        }
        IPCCallManager iPCCallManager = this.f3927a;
        if (iPCCallManager != null) {
            return iPCCallManager;
        }
        synchronized (this) {
            try {
                IPCCallManager iPCCallManager2 = this.f3927a;
                if (iPCCallManager2 != null) {
                    return iPCCallManager2;
                }
                IPCCallManagerImpl iPCCallManagerImpl = new IPCCallManagerImpl();
                this.f3927a = iPCCallManagerImpl;
                return iPCCallManagerImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public LocalCallManager getLocalCallManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalCallManager) ipChange.ipc$dispatch("5e876198", new Object[]{this});
        }
        LocalCallManager localCallManager = this.c;
        if (localCallManager != null) {
            return localCallManager;
        }
        synchronized (this) {
            try {
                LocalCallManager localCallManager2 = this.c;
                if (localCallManager2 != null) {
                    return localCallManager2;
                }
                LocalCallManagerImpl localCallManagerImpl = new LocalCallManagerImpl(getServiceBeanManager());
                this.c = localCallManagerImpl;
                return localCallManagerImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public ServiceBeanManager getServiceBeanManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceBeanManager) ipChange.ipc$dispatch("4fe70858", new Object[]{this});
        }
        ServiceBeanManager serviceBeanManager = this.b;
        if (serviceBeanManager != null) {
            return serviceBeanManager;
        }
        synchronized (this) {
            try {
                ServiceBeanManager serviceBeanManager2 = this.b;
                if (serviceBeanManager2 != null) {
                    return serviceBeanManager2;
                }
                ServiceBeanManagerImpl serviceBeanManagerImpl = new ServiceBeanManagerImpl();
                this.b = serviceBeanManagerImpl;
                return serviceBeanManagerImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public void init(Context context, IIPCManager iIPCManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c75aff", new Object[]{this, context, iIPCManager});
            return;
        }
        context.getClass();
        this.d = iIPCManager;
        getIpcCallManager().setIIPCManager(this.d);
        IIPCManager iIPCManager2 = this.d;
        if (iIPCManager2 instanceof IPCManagerService) {
            ((IPCManagerService) iIPCManager2).setLocalCallManager(getLocalCallManager());
            return;
        }
        try {
            iIPCManager2.registerCallBack(getIIPCCallBack());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCContextManager
    public synchronized void resetIIPCManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ade7372", new Object[]{this});
            return;
        }
        LogCatUtil.info("IPCContextManagerImpl", "resetIIPCManager !");
        this.d = null;
        getIpcCallManager().setIIPCManager(null);
        LogCatUtil.info("IPCContextManager", "[resetIIPCManager] reset iIpcManager to null.");
    }
}
