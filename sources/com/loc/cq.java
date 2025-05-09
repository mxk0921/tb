package com.loc;

import android.text.TextUtils;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cq implements ThreadFactory {
    private static final int k;
    private static final int l;
    private static final int m;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f5634a;
    private final ThreadFactory b;
    private final Thread.UncaughtExceptionHandler c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final int g;
    private final int h;
    private final BlockingQueue<Runnable> i;
    private final int j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ThreadFactory f5636a;
        private Thread.UncaughtExceptionHandler b;
        private String c;
        private Integer d;
        private Boolean e;
        private int f = cq.l;
        private int g = cq.m;
        private int h = 30;
        private BlockingQueue<Runnable> i;

        public final a a(String str) {
            this.c = str;
            return this;
        }

        private void b() {
            this.f5636a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public final cq a() {
            cq cqVar = new cq(this, (byte) 0);
            b();
            return cqVar;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        k = availableProcessors;
        l = Math.max(2, Math.min(availableProcessors - 1, 4));
        m = (availableProcessors * 2) + 1;
    }

    private cq(a aVar) {
        this.b = aVar.f5636a == null ? Executors.defaultThreadFactory() : aVar.f5636a;
        int i = aVar.f;
        this.g = i;
        int i2 = m;
        this.h = i2;
        if (i2 >= i) {
            this.j = aVar.h;
            this.i = aVar.i == null ? new LinkedBlockingQueue<>(256) : aVar.i;
            this.d = TextUtils.isEmpty(aVar.c) ? "amap-threadpool" : aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
            this.c = aVar.b;
            this.f5634a = new AtomicLong();
            return;
        }
        throw new NullPointerException("maxPoolSize must > corePoolSize!");
    }

    private ThreadFactory g() {
        return this.b;
    }

    private String h() {
        return this.d;
    }

    private Boolean i() {
        return this.f;
    }

    private Integer j() {
        return this.e;
    }

    private Thread.UncaughtExceptionHandler k() {
        return this.c;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final BlockingQueue<Runnable> c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        new Runnable() { // from class: com.loc.cq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        };
        Thread newThread = g().newThread(runnable);
        if (h() != null) {
            Long valueOf = Long.valueOf(this.f5634a.incrementAndGet());
            newThread.setName(String.format(h() + "-%d", valueOf));
        }
        if (k() != null) {
            newThread.setUncaughtExceptionHandler(k());
        }
        if (j() != null) {
            newThread.setPriority(j().intValue());
        }
        if (i() != null) {
            newThread.setDaemon(i().booleanValue());
        }
        return newThread;
    }

    public /* synthetic */ cq(a aVar, byte b) {
        this(aVar);
    }
}
