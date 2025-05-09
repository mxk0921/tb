package com.meizu.cloud.pushsdk.d;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private String f5787a = null;
    private Boolean b = null;
    private Integer c = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThreadFactory f5788a;
        final /* synthetic */ String b;
        final /* synthetic */ AtomicLong c;
        final /* synthetic */ Boolean d;
        final /* synthetic */ Integer e;
        final /* synthetic */ Thread.UncaughtExceptionHandler f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f5788a = threadFactory;
            this.b = str;
            this.c = atomicLong;
            this.d = bool;
            this.e = num;
            this.f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f5788a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                newThread.setName(String.format(str, Long.valueOf(this.c.getAndIncrement())));
            }
            Boolean bool = this.d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    public j a(String str) {
        String.format(str, 0);
        this.f5787a = str;
        return this;
    }

    public ThreadFactory a() {
        return a(this);
    }

    private static ThreadFactory a(j jVar) {
        String str = jVar.f5787a;
        Boolean bool = jVar.b;
        Integer num = jVar.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = jVar.d;
        ThreadFactory threadFactory = jVar.e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }
}
