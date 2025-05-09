package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TaskExecutor instance;
    private static Handler2Executor mHandler2Executor;

    static {
        t2o.a(966787097);
    }

    public static synchronized TaskExecutor getInstance() {
        synchronized (TaskExecutor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaskExecutor) ipChange.ipc$dispatch("b0710a35", new Object[0]);
            }
            if (instance == null) {
                mHandler2Executor = new Handler2Executor();
                instance = new TaskExecutor();
            }
            return instance;
        }
    }

    public final ScheduledFuture schedule(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("9b56a2dc", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null) {
            try {
                if (!scheduledFuture.isDone()) {
                    scheduledFuture.cancel(true);
                }
            } catch (Exception unused) {
                return scheduledFuture;
            }
        }
        return mHandler2Executor.postDelayed(runnable, j);
    }
}
