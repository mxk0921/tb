package com.uc.webview.base.task;

import android.os.AsyncTask;
import com.uc.webview.base.Log;
import java.lang.Thread;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class e extends ITaskExecutor {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f14287a;
    private final ScheduledThreadPoolExecutor b;
    private final Thread.UncaughtExceptionHandler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f14291a = new e((byte) 0);
    }

    public /* synthetic */ e(byte b) {
        this();
    }

    public static e a() {
        return a.f14291a;
    }

    @Override // com.uc.webview.base.task.ITaskExecutor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // com.uc.webview.base.task.ITaskExecutor
    public final void schedule(Runnable runnable, long j) {
        this.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private e() {
        this.f14287a = new AtomicInteger(0);
        this.c = new Thread.UncaughtExceptionHandler() { // from class: com.uc.webview.base.task.e.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Log.w("Task.pl", thread.getName() + " uncaughtException", th);
            }
        };
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new ThreadFactory() { // from class: com.uc.webview.base.task.e.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return e.a(e.this, runnable);
            }
        }, new RejectedExecutionHandler() { // from class: com.uc.webview.base.task.e.3
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Log.w("Task.pl", "no available resource for ".concat(String.valueOf(runnable)));
                AsyncTask.execute(runnable);
            }
        });
        this.b = scheduledThreadPoolExecutor;
        try {
            scheduledThreadPoolExecutor.setMaximumPoolSize(5);
            scheduledThreadPoolExecutor.setKeepAliveTime(35L, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            Log.w("Task.pl", "config executor failed", th);
        }
    }

    public static /* synthetic */ Thread a(e eVar, Runnable runnable) {
        String a2 = f.a("pool-" + String.valueOf(eVar.f14287a.incrementAndGet()));
        Thread thread = new Thread(runnable, a2);
        thread.setUncaughtExceptionHandler(eVar.c);
        Log.d("Task.pl", "create: ".concat(String.valueOf(a2)));
        return thread;
    }
}
