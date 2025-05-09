package com.meizu.cloud.pushsdk.d.m;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f5797a;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.d.m.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0279b {

        /* renamed from: a  reason: collision with root package name */
        private static b f5798a = new b();
    }

    private b() {
        this.f5797a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d().a((Integer) 10).a("message-pool-%d").a());
    }

    public static b a() {
        return C0279b.f5798a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5797a.execute(runnable);
    }
}
