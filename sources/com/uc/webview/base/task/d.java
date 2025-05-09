package com.uc.webview.base.task;

import com.uc.webview.base.Log;
import com.uc.webview.base.task.ITaskExecutor;
import com.uc.webview.base.task.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14285a = "d";

    public static void b(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.uc.webview.base.task.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str2 = d.f14285a;
                    Log.w(str2, "runTask [" + str + "] failed", th);
                }
            }
        };
        try {
            b().execute(runnable2);
        } catch (Throwable th) {
            String str2 = f14285a;
            Log.w(str2, "postTask [" + str + "] failed", th);
            runnable2.run();
        }
    }

    private static c c(final String str, final Runnable runnable) {
        return new c() { // from class: com.uc.webview.base.task.d.2
            @Override // com.uc.webview.base.task.c
            public final void d() {
                runnable.run();
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return str;
            }
        };
    }

    public static c.a a(String str, Runnable runnable, long j) {
        return a(c(str, runnable), j);
    }

    public static c.a a(String str, Runnable runnable) {
        return a(c(str, runnable), 0L);
    }

    public static c.a a(c cVar) {
        return a(cVar, 0L);
    }

    private static ITaskExecutor b() {
        ITaskExecutor iTaskExecutor = ITaskExecutor.Instance.get();
        return iTaskExecutor != null ? iTaskExecutor : e.a();
    }

    public static c.a a(c cVar, long j) {
        try {
            c.a aVar = new c.a(cVar);
            if (j > 0) {
                String c = cVar.c();
                Log.d(c, "execute delay " + j + "ms");
                b().schedule(aVar, j);
            } else {
                b().execute(aVar);
            }
            return aVar;
        } catch (Throwable th) {
            String str = f14285a;
            Log.w(str, "postTask [" + cVar.c() + "] failed", th);
            try {
                cVar.call();
                return null;
            } catch (Throwable th2) {
                String str2 = f14285a;
                Log.w(str2, "runTask [" + cVar.c() + "] failed", th2);
                return null;
            }
        }
    }
}
