package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qft;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TriggerStartFailureTask extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Exception exception;

    static {
        t2o.a(677380173);
    }

    public TriggerStartFailureTask(qft qftVar, Exception exc) {
        super(qftVar);
        this.exception = exc;
    }

    public static /* synthetic */ Object ipc$super(TriggerStartFailureTask triggerStartFailureTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/TriggerStartFailureTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            getTaskWrapper().c(this.exception);
        }
    }
}
