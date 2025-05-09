package com.meizu.cloud.pushsdk.f.c.h;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f5867a = null;
    private static int b = 2;

    public static ExecutorService a() {
        synchronized (b.class) {
            try {
                if (f5867a == null) {
                    f5867a = Executors.newScheduledThreadPool(b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5867a;
    }

    public static Future a(Callable callable) {
        return a().submit(callable);
    }

    public static void a(int i) {
        b = i;
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }
}
