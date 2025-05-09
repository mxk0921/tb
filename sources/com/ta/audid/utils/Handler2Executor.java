package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Handler2Executor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger integer = new AtomicInteger();
    private ScheduledThreadPoolExecutor schedule;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class HandlerThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(966787089);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = Handler2Executor.access$000().getAndIncrement();
            return new Thread(runnable, "UtdidHandlerThread:" + andIncrement);
        }
    }

    static {
        t2o.a(966787088);
    }

    public Handler2Executor() {
        this.schedule = null;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new HandlerThreadFactory());
        this.schedule = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.schedule.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ AtomicInteger access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return integer;
    }

    public ScheduledFuture postDelayed(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("d963d110", new Object[]{this, runnable, new Long(j)});
        }
        return this.schedule.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
