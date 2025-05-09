package com.uc.webview.internal.setup.component;

import anet.channel.util.ErrorConstant;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.cq1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    final c f14432a;
    final Set<n> b;
    private final String c;
    private final Set<n> d = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f14435a;
        final o b;
        final n c;
        final d.a d;

        public a(o oVar, n nVar, int i) {
            int i2;
            this.b = oVar;
            this.c = nVar;
            d.a aVar = new d.a(nVar);
            this.d = aVar;
            this.f14435a = i;
            c cVar = oVar.f14432a;
            if (i == 0) {
                i2 = ErrorConstant.ERROR_GET_PROCESS_NULL;
            } else {
                i2 = cq1.SIGN;
            }
            cVar.a(i2, aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends a implements k.c {
        boolean e;

        public b(o oVar, n nVar) {
            this(oVar, nVar, 0);
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final void a() {
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final void b(int i) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        this.e = true;
                        this.d.a();
                        o.a(this.b, ErrorConstant.ERROR_IO_EXCEPTION, i, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final void c(int i) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        this.e = true;
                        this.d.a();
                        o.a(this.b, ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION, i, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public b(o oVar, n nVar, int i) {
            super(oVar, nVar, i);
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final void a(int i) {
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final void a(k.f fVar) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        this.e = true;
                        this.d.a();
                        int a2 = this.b.a(fVar, this);
                        if (a2 != -9) {
                            o.a(this.b, ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION, a2, this);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.uc.webview.internal.setup.component.k.c
        public final boolean b() {
            d.f fVar = new d.f(this.c);
            y.d();
            fVar.b();
            this.b.f14432a.a(-119, fVar);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(int i, d.h hVar);

        void a(Set<n> set);

        void a(boolean z, Set<n> set);
    }

    public o(String str, Set<n> set, c cVar) {
        this.c = str;
        this.f14432a = cVar;
        this.b = set;
    }

    public final void a() {
        for (n nVar : this.b) {
            if (!nVar.b) {
                if (!nVar.e()) {
                    this.d.add(nVar);
                } else {
                    this.f14432a.a(nVar.f14431a.b == 99 ? -127 : -126, new d.f(nVar));
                }
            }
        }
        if (this.d.isEmpty()) {
            a(true);
            return;
        }
        this.f14432a.a(this.d);
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            k.a(nVar2.f14431a, nVar2.d, new b(this, nVar2));
        }
    }

    private void a(final boolean z) {
        com.uc.webview.base.task.c.a(this.c, new Runnable() { // from class: com.uc.webview.internal.setup.component.o.1
            @Override // java.lang.Runnable
            public final void run() {
                o oVar = o.this;
                oVar.f14432a.a(z, oVar.b);
            }
        }, null);
    }

    public final int a(k.f fVar, a aVar) {
        synchronized (this.d) {
            try {
                if (!this.d.contains(aVar.c)) {
                    return -9;
                }
                int a2 = aVar.c.a(fVar);
                aVar.d.a();
                if (!(a2 == -401 || a2 == -251)) {
                    if (a2 == -9) {
                        this.f14432a.a(aVar.f14435a == 0 ? -109 : BSError.BSDIFF_PATCH_FAILED, aVar.d);
                        this.d.remove(aVar.c);
                        if (this.d.isEmpty()) {
                            a(false);
                        }
                    }
                    return a2;
                }
                this.f14432a.a(a2, aVar.d);
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(o oVar, int i, int i2, final a aVar) {
        synchronized (oVar.d) {
            try {
                if (oVar.d.contains(aVar.c)) {
                    final int i3 = aVar.f14435a + 1;
                    oVar.f14432a.a(i, new d.e(aVar.c, i2));
                    if (i3 > 2) {
                        d.a aVar2 = aVar.d;
                        y.d();
                        aVar2.b();
                        oVar.f14432a.a(ErrorConstant.ERROR_CONNECT_EXCEPTION, aVar.d);
                        return;
                    }
                    com.uc.webview.base.task.c.a(oVar.c, new Runnable() { // from class: com.uc.webview.internal.setup.component.o.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            n nVar = aVar.c;
                            k.a(nVar.f14431a, nVar.d, new b(o.this, nVar, i3));
                        }
                    }, null, 3000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
