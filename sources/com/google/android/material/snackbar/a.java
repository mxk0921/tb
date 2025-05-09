package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static a e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5148a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new C0256a());
    public c c;
    public c d;

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0256a implements Handler.Callback {
        public C0256a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void dismiss(int i);

        void show();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f5150a;
        public int b;
        public boolean c;

        public c(int i, b bVar) {
            this.f5150a = new WeakReference<>(bVar);
            this.b = i;
        }

        public boolean a(b bVar) {
            if (bVar == null || this.f5150a.get() != bVar) {
                return false;
            }
            return true;
        }
    }

    public static a c() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.f5150a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.dismiss(i);
        return true;
    }

    public void b(b bVar, int i) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    a(this.c, i);
                } else if (h(bVar)) {
                    a(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.f5148a) {
            try {
                if (this.c != cVar) {
                    if (this.d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean g;
        synchronized (this.f5148a) {
            g = g(bVar);
        }
        return g;
    }

    public boolean f(b bVar) {
        boolean z;
        synchronized (this.f5148a) {
            try {
                if (!g(bVar) && !h(bVar)) {
                    z = false;
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean g(b bVar) {
        c cVar = this.c;
        if (cVar == null || !cVar.a(bVar)) {
            return false;
        }
        return true;
    }

    public final boolean h(b bVar) {
        c cVar = this.d;
        if (cVar == null || !cVar.a(bVar)) {
            return false;
        }
        return true;
    }

    public void i(b bVar) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    this.c = null;
                    if (this.d != null) {
                        o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    m(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        m(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(c cVar) {
        int i = cVar.b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = 1500;
                } else {
                    i = 2750;
                }
            }
            Handler handler = this.b;
            handler.removeCallbacksAndMessages(cVar);
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
        }
    }

    public void n(int i, b bVar) {
        synchronized (this.f5148a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    cVar.b = i;
                    this.b.removeCallbacksAndMessages(cVar);
                    m(this.c);
                    return;
                }
                if (h(bVar)) {
                    this.d.b = i;
                } else {
                    this.d = new c(i, bVar);
                }
                c cVar2 = this.c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.c = null;
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.f5150a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.c = null;
            }
        }
    }
}
