package com.uc.webview.base.task;

import android.os.SystemClock;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.timing.TraceEvent;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class c implements Callable<C0833c> {
    private final C0833c c = new C0833c();

    /* renamed from: a  reason: collision with root package name */
    public b f14283a = null;
    private a d = null;
    public boolean b = true;
    private AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends FutureTask<C0833c> {
        public a(c cVar) {
            super(cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public void a() {
        }

        public void a(UCKnownException uCKnownException) {
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.base.task.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class C0833c {

        /* renamed from: a  reason: collision with root package name */
        public long f14284a = System.currentTimeMillis();
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long e = 0;
        public UCKnownException f = null;
    }

    public static void a(String str, Runnable runnable) {
        a(str, runnable, null, 0L);
    }

    public final void b() throws UCKnownException {
        UCKnownException e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.e.get();
        try {
            a aVar = this.d;
            if (aVar != null) {
                aVar.get();
            }
            if (!z) {
                String e2 = e();
                Log.d(e2, "waitForFinished cost:" + (System.currentTimeMillis() - currentTimeMillis));
            }
            e = null;
        } catch (UCKnownException e3) {
            e = e3;
        } catch (Throwable th) {
            try {
                UCKnownException uCKnownException = new UCKnownException(th);
                if (!z) {
                    String e4 = e();
                    Log.d(e4, "waitForFinished cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                e = uCKnownException;
            } finally {
                if (!z) {
                    String e5 = e();
                    Log.d(e5, "waitForFinished cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
        }
        C0833c cVar = this.c;
        if (cVar.f == null) {
            cVar.f = e;
        } else {
            Log.w(e(), "waitForFinished failed", e);
        }
        UCKnownException uCKnownException2 = this.c.f;
        if (uCKnownException2 != null) {
            throw uCKnownException2;
        }
    }

    public final String c() {
        return e();
    }

    public abstract void d();

    public abstract String e();

    public int f() {
        return -1;
    }

    /* renamed from: g */
    public final C0833c call() throws Exception {
        String str;
        TraceEvent traceEvent;
        this.c.b = System.currentTimeMillis();
        this.c.c = SystemClock.currentThreadTimeMillis();
        Log.i(e(), "onStart");
        try {
            if (f() != -1) {
                traceEvent = TraceEvent.scoped(f());
            } else {
                traceEvent = TraceEvent.scoped(e());
            }
            try {
                d();
                if (traceEvent != null) {
                    traceEvent.close();
                }
            } catch (Throwable th) {
                if (traceEvent != null) {
                    try {
                        traceEvent.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (UCKnownException e) {
            this.c.f = e;
        } catch (Throwable th3) {
            this.c.f = new UCKnownException(th3);
        }
        C0833c cVar = this.c;
        boolean z = cVar.f == null;
        cVar.d = System.currentTimeMillis();
        this.c.e = SystemClock.currentThreadTimeMillis();
        this.e.set(true);
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = "onSuccess";
        } else {
            str = "onFailed";
        }
        sb.append(str);
        sb.append(" wait:");
        C0833c cVar2 = this.c;
        sb.append(cVar2.b - cVar2.f14284a);
        sb.append(", run:");
        C0833c cVar3 = this.c;
        sb.append(cVar3.d - cVar3.b);
        sb.append("/");
        C0833c cVar4 = this.c;
        sb.append(cVar4.e - cVar4.c);
        String sb2 = sb.toString();
        if (z) {
            Log.i(e(), sb2);
        } else if (ErrorCode.isUnknownError(this.c.f.errCode())) {
            Log.w(e(), sb2, this.c.f);
        } else {
            String e2 = e();
            Log.w(e2, sb2 + ", error:" + this.c.f.errMsg());
        }
        b bVar = this.f14283a;
        if (bVar != null) {
            if (z) {
                bVar.a();
            } else {
                bVar.a(this.c.f);
            }
        }
        return this.c;
    }

    public static void a(String str, Runnable runnable, b bVar) {
        a(str, runnable, bVar, 0L);
    }

    public static void a(final String str, final Runnable runnable, b bVar, long j) {
        c cVar = new c() { // from class: com.uc.webview.base.task.c.1
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ C0833c call() throws Exception {
                return call();
            }

            @Override // com.uc.webview.base.task.c
            public final void d() {
                runnable.run();
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return str;
            }
        };
        if (bVar != null) {
            cVar.f14283a = bVar;
        }
        if (j > 0) {
            cVar.b = true;
            cVar.a(j);
            return;
        }
        cVar.b = true;
        cVar.a();
    }

    public c a() {
        return a(0L);
    }

    public final c a(long j) {
        Throwable th;
        if (this.b) {
            this.d = d.a(this, j);
        } else {
            try {
                call();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            C0833c cVar = this.c;
            if (cVar.f == null && th != null) {
                cVar.f = new UCKnownException(th);
            }
            UCKnownException uCKnownException = this.c.f;
            if (uCKnownException != null) {
                throw uCKnownException;
            }
        }
        return this;
    }
}
