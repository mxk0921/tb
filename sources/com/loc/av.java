package com.loc;

import android.content.Context;
import android.os.Looper;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class av extends as implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.loc.av.2

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5576a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f5576a.getAndIncrement()) { // from class: com.loc.av.2.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                    }
                }
            };
        }
    };

    private av(Context context) {
        this.d = context;
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.b = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
                return;
            }
            String obj = defaultUncaughtExceptionHandler.toString();
            if (obj.startsWith("com.amap.apis.utils.core.dynamiccore") || (obj.indexOf("com.amap.api") == -1 && obj.indexOf("com.loc") == -1)) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
                return;
            }
            this.c = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized void b() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        synchronized (av.class) {
            try {
                ExecutorService executorService = e;
                if (executorService != null) {
                    executorService.shutdown();
                }
                bl.a();
                if (as.f5571a != null) {
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    as asVar = as.f5571a;
                    if (defaultUncaughtExceptionHandler == asVar && (uncaughtExceptionHandler = asVar.b) != null) {
                        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                    }
                }
                as.f5571a = null;
            }
        }
    }

    public static void c() {
        WeakReference<Context> weakReference = g;
        if (weakReference == null || weakReference.get() == null) {
            as asVar = as.f5571a;
            if (asVar != null) {
                asVar.a();
                return;
            }
            return;
        }
        at.a(g.get());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            a(th, 0, null, null);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                } catch (Throwable unused) {
                }
                this.b.uncaughtException(thread, th);
            }
        }
    }

    public static synchronized av a(Context context, w wVar) throws k {
        synchronized (av.class) {
            if (wVar == null) {
                throw new k("sdk info is null");
            } else if (wVar.a() == null || "".equals(wVar.a())) {
                throw new k("sdk name is invalid");
            } else if (!f.add(Integer.valueOf(wVar.hashCode()))) {
                return (av) as.f5571a;
            } else {
                as asVar = as.f5571a;
                if (asVar == null) {
                    as.f5571a = new av(context);
                } else {
                    asVar.c = false;
                }
                as asVar2 = as.f5571a;
                asVar2.a(wVar, asVar2.c);
                return (av) as.f5571a;
            }
        }
    }

    public static void b(w wVar, String str, String str2) {
        try {
            as asVar = as.f5571a;
            if (asVar != null) {
                asVar.a(wVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Throwable th, String str, String str2) {
        try {
            as asVar = as.f5571a;
            if (asVar != null) {
                asVar.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.loc.as
    public final void a() {
        at.a(this.d);
    }

    public static void a(w wVar, String str, k kVar) {
        if (kVar != null) {
            a(wVar, str, kVar.c(), kVar.d(), kVar.e(), kVar.b());
        }
    }

    @Override // com.loc.as
    public final void a(w wVar, String str, String str2) {
        aw.a(wVar, this.d, str2, str);
    }

    public static void a(w wVar, String str, String str2, String str3, String str4) {
        a(wVar, str, str2, str3, "", str4);
    }

    public static void a(w wVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (as.f5571a != null) {
                as.f5571a.a(wVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.loc.as
    public final void a(final w wVar, final boolean z) {
        try {
            cr.a().b(new cs() { // from class: com.loc.av.1
                @Override // com.loc.cs
                public final void a() {
                    try {
                        synchronized (Looper.getMainLooper()) {
                            at.a(wVar);
                        }
                        if (z) {
                            aw.a(av.this.d);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.loc.as
    public final void a(Throwable th, int i, String str, String str2) {
        aw.a(this.d, th, i, str, str2);
    }
}
