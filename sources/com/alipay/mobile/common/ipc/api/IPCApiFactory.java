package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.biz.IPCContextManagerImpl;
import com.alipay.mobile.common.ipc.biz.IPCManagerService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IPCApiFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IPCContextManager f3921a;
    public static IIPCManager b;

    public static final IPCContextManager getIPCContextManager() {
        return (IPCContextManager) IPCContextManagerImpl.class.newInstance();
    }

    public static final IIPCManager getIPCManager() {
        int i = IPCManagerService.f3928a;
        return (IIPCManager) IPCManagerService.class.newInstance();
    }

    public static final IPCContextManager getSingletonIPCContextManager() {
        IPCContextManager iPCContextManager = f3921a;
        if (iPCContextManager != null) {
            return iPCContextManager;
        }
        synchronized (IPCApiFactory.class) {
            try {
                IPCContextManager iPCContextManager2 = f3921a;
                if (iPCContextManager2 != null) {
                    return iPCContextManager2;
                }
                IPCContextManager iPCContextManager3 = (IPCContextManager) IPCContextManagerImpl.class.newInstance();
                f3921a = iPCContextManager3;
                return iPCContextManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final IIPCManager getSingletonIPCManager() {
        IIPCManager iIPCManager = b;
        if (iIPCManager != null) {
            return iIPCManager;
        }
        synchronized (IIPCManager.class) {
            try {
                IIPCManager iIPCManager2 = b;
                if (iIPCManager2 != null) {
                    return iIPCManager2;
                }
                int i = IPCManagerService.f3928a;
                IIPCManager iIPCManager3 = (IIPCManager) IPCManagerService.class.newInstance();
                b = iIPCManager3;
                return iIPCManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ServiceBeanManager getSingletonServiceBeanManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceBeanManager) ipChange.ipc$dispatch("4d7b797", new Object[0]);
        }
        try {
            return getSingletonIPCContextManager().getServiceBeanManager();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
