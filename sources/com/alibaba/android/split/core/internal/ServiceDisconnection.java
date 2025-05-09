package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ServiceDisconnection extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceConnectionImpl mServiceConnection;

    static {
        t2o.a(677380157);
    }

    public ServiceDisconnection(ServiceConnectionImpl serviceConnectionImpl) {
        this.mServiceConnection = serviceConnectionImpl;
    }

    public static /* synthetic */ Object ipc$super(ServiceDisconnection serviceDisconnection, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/ServiceDisconnection");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ServiceManager.unlinkToDeath(this.mServiceConnection.mServiceManager);
        ServiceManager.setIInterface(this.mServiceConnection.mServiceManager, null);
        ServiceManager.setBinding(this.mServiceConnection.mServiceManager);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ServiceDisconnection{}";
    }
}
