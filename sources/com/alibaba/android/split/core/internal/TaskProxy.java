package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qft;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TaskProxy extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AbstractTask mAbstractTask;
    private ServiceManager mServiceManager;

    static {
        t2o.a(677380172);
    }

    public TaskProxy(ServiceManager serviceManager, qft qftVar, AbstractTask abstractTask) {
        super(qftVar);
        this.mServiceManager = serviceManager;
        this.mAbstractTask = abstractTask;
    }

    public static /* synthetic */ Object ipc$super(TaskProxy taskProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/TaskProxy");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            ServiceManager.execute(this.mServiceManager, this.mAbstractTask);
        }
    }
}
