package com.meizu.cloud.pushsdk.d.m;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f5799a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static c f5800a = new c();
    }

    private c() {
        this.f5799a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d().a("single-pool-%d").a());
    }

    public static c a() {
        return b.f5800a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5799a.execute(runnable);
    }
}
