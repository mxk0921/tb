package com.meizu.cloud.pushsdk.d.m;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f5795a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static a f5796a = new a();
    }

    private a() {
        this.f5795a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new d().a("io-pool-%d").a());
    }

    public static a a() {
        return b.f5796a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5795a.execute(runnable);
    }
}
