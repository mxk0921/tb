package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b0 {
    private static b0 b = new b0();
    private static b0 c = new b0();
    private static b0 d = new b0();

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f5369a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f5370a;

        public a(Runnable runnable) {
            this.f5370a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f5370a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ThreadFactory {
        private static final AtomicInteger d = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f5371a;
        private final AtomicInteger b = new AtomicInteger(1);
        private final String c;

        public b() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f5371a = threadGroup;
            this.c = "FormalHASDK-base-" + d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f5371a;
            return new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
        }
    }

    static {
        new b0();
        new b0();
    }

    private b0() {
    }

    public static b0 a() {
        return d;
    }

    public static b0 b() {
        return c;
    }

    public static b0 c() {
        return b;
    }

    public void a(g gVar) {
        try {
            this.f5369a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
