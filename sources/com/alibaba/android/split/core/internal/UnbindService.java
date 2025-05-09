package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.odq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UnbindService extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ServiceManager serviceManager;

    static {
        t2o.a(677380175);
    }

    public UnbindService(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    public static /* synthetic */ Object ipc$super(UnbindService unbindService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/UnbindService");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (ServiceManager.getIInterface(this.serviceManager) != null) {
            if (this.serviceManager.isOptService()) {
                odq.b(ServiceManager.getContext(this.serviceManager), ServiceManager.getServiceConnection(this.serviceManager));
            } else {
                ServiceManager.getContext(this.serviceManager).unbindService(ServiceManager.getServiceConnection(this.serviceManager));
            }
            ServiceManager.setBinding(this.serviceManager);
            ServiceManager.setIInterface(this.serviceManager, null);
            ServiceManager.releaseServiceConnection(this.serviceManager);
        }
    }
}
