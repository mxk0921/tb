package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ServiceConnectedTask extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IBinder iBinder;
    private ServiceConnectionImpl serviceConnection;

    static {
        t2o.a(677380155);
    }

    public ServiceConnectedTask(ServiceConnectionImpl serviceConnectionImpl, IBinder iBinder) {
        this.serviceConnection = serviceConnectionImpl;
        this.iBinder = iBinder;
    }

    public static /* synthetic */ Object ipc$super(ServiceConnectedTask serviceConnectedTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/ServiceConnectedTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ServiceManager serviceManager = this.serviceConnection.mServiceManager;
        ServiceManager.setIInterface(serviceManager, (IInterface) ServiceManager.getBinderCreator(serviceManager).createBinder(this.iBinder));
        ServiceManager.linkToDeath(this.serviceConnection.mServiceManager);
        ServiceManager.setBinding(this.serviceConnection.mServiceManager);
        for (Runnable runnable : ServiceManager.getTaskList(this.serviceConnection.mServiceManager)) {
            runnable.run();
        }
        ServiceManager.getTaskList(this.serviceConnection.mServiceManager).clear();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ServiceConnectedTask{}";
    }
}
