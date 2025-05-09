package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.qft;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbstractTask<TResult> implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean silence;
    private qft<TResult> taskResultSender;

    static {
        t2o.a(677380109);
    }

    public AbstractTask() {
        this.taskResultSender = null;
    }

    public abstract void execute();

    public final qft getTaskWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qft) ipChange.ipc$dispatch("438e0e13", new Object[]{this});
        }
        return this.taskResultSender;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            execute();
        } catch (Exception e) {
            if (this.taskResultSender != null) {
                this.taskResultSender.c(e);
            }
        }
    }

    public AbstractTask(qft<TResult> qftVar) {
        this.taskResultSender = qftVar;
    }
}
