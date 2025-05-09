package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qft;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TriggerStartSuccessTask<TResult> extends AbstractTask<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TResult result;

    static {
        t2o.a(677380174);
    }

    public TriggerStartSuccessTask(qft<TResult> qftVar, TResult tresult) {
        super(qftVar);
        this.result = tresult;
    }

    public static /* synthetic */ Object ipc$super(TriggerStartSuccessTask triggerStartSuccessTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/TriggerStartSuccessTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            getTaskWrapper().b(this.result);
        }
    }
}
