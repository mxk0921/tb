package com.uc.webview.base.task;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f14279a;

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.base.task.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ThreadFactoryC0832a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        String f14280a;
        int b;

        public ThreadFactoryC0832a(String str, int i) {
            this.f14280a = str;
            i = i <= 0 ? 1 : i;
            this.b = i > 10 ? 10 : i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f14280a);
            thread.setPriority(this.b);
            return thread;
        }
    }

    public a(String str) {
        this(str, Thread.currentThread().getPriority());
    }

    public final void a(Runnable runnable) {
        this.f14279a.execute(runnable);
    }

    private a(String str, int i) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0832a(str, i));
        this.f14279a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(35000L, TimeUnit.MILLISECONDS);
        this.f14279a.allowCoreThreadTimeOut(true);
    }
}
