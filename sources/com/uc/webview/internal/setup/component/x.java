package com.uc.webview.internal.setup.component;

import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.internal.setup.component.c;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import com.uc.webview.internal.setup.component.k;
import com.uc.webview.internal.setup.component.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x {
    static final /* synthetic */ boolean l = true;

    /* renamed from: a  reason: collision with root package name */
    final String f14445a;
    boolean b;
    final g.a c;
    final w[] d;
    final d.k e;
    long f;
    w h;
    boolean i;
    Runnable j;
    private final u m;
    boolean g = true;
    final AtomicBoolean k = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements k.b {
        private boolean b;

        private a() {
        }

        private boolean c() {
            if (x.this.i || x.this.b || this.b) {
                return true;
            }
            return false;
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final boolean a(int i) {
            if (c()) {
                return true;
            }
            d.C0841d dVar = new d.C0841d("", i);
            y.d();
            dVar.b();
            x.this.c.a(-451, dVar);
            return false;
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final void b() {
            if (!c()) {
                this.b = true;
                int j = x.j(x.this);
                if (j != 0) {
                    x.this.c.a(-148, new d.m(x.this.a(), j));
                }
            }
        }

        public /* synthetic */ a(x xVar, byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0026 A[SYNTHETIC] */
        @Override // com.uc.webview.internal.setup.component.k.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.x.a.a(int, boolean):boolean");
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final boolean a() {
            return !c();
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final void a(d.h hVar) {
            if (!c()) {
                x.this.c.a(-450, hVar);
            }
        }
    }

    public x(String str, g.a aVar, w[] wVarArr, u uVar, d.k kVar) {
        this.f14445a = str;
        this.c = aVar;
        this.d = wVarArr;
        this.m = uVar;
        this.e = kVar;
    }

    public static /* synthetic */ void e(x xVar) {
        String str = xVar.f14445a;
        w wVar = xVar.h;
        HashSet hashSet = new HashSet();
        n nVar = wVar.f14444a.c.f14412a;
        if (nVar != null) {
            hashSet.add(nVar);
        }
        n nVar2 = wVar.f14444a.c.b;
        if (nVar2 != null) {
            hashSet.add(nVar2);
        }
        n nVar3 = wVar.b;
        if (nVar3 != null) {
            hashSet.add(nVar3);
        }
        new o(str, hashSet, new o.c() { // from class: com.uc.webview.internal.setup.component.x.2
            @Override // com.uc.webview.internal.setup.component.o.c
            public final void a(Set<n> set) {
            }

            @Override // com.uc.webview.internal.setup.component.o.c
            public final void a(boolean z, Set<n> set) {
                x.a(x.this, z);
            }

            @Override // com.uc.webview.internal.setup.component.o.c
            public final void a(int i, d.h hVar) {
                x.this.c.a(i, hVar);
                if (i == -406) {
                    x.this.c.a(-149, hVar);
                }
            }
        }).a();
    }

    public static /* synthetic */ void h(x xVar) {
        int i;
        long j;
        if (l || xVar.i) {
            c.g gVar = new c.g();
            int i2 = 0;
            if (xVar.m.a(xVar.h.b.d)) {
                i = BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC;
            } else if (gVar.c.equals(xVar.h.b.d.i)) {
                i = -162;
            } else {
                i = 0;
            }
            final d.n nVar = new d.n(xVar.h);
            if (i != 0) {
                xVar.c.a(i, nVar);
                return;
            }
            synchronized (xVar) {
                try {
                    xVar.j = new Runnable() { // from class: com.uc.webview.internal.setup.component.x.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (x.this.j != null) {
                                synchronized (x.this) {
                                    try {
                                        if (x.this.j != null) {
                                            x.this.j = null;
                                            if (!x.this.b) {
                                                x.this.c.a(-161, nVar);
                                                x.e(x.this);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    };
                    if (!xVar.g) {
                        j = 0;
                    } else {
                        long a2 = c.a(xVar.f);
                        int c = c.c();
                        if (c >= 10) {
                            i2 = c / 10;
                        }
                        j = a2 / (i2 + 1);
                    }
                    nVar.e(j);
                    xVar.c.a(-160, nVar);
                    y.a(j);
                    com.uc.webview.base.task.c.a(xVar.f14445a, xVar.j, new s(xVar.c), j);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static /* synthetic */ int j(x xVar) {
        int i = 0;
        if (xVar.i) {
            return 0;
        }
        w[] wVarArr = xVar.d;
        int length = wVarArr.length;
        int i2 = 0;
        while (i < length) {
            w wVar = wVarArr[i];
            int b = wVar.b();
            if (b == 0) {
                if (wVar.b.d == null) {
                    b = -263;
                } else {
                    b = -264;
                }
            }
            xVar.c.a(-269, new d.l(wVar, b));
            i++;
            i2 = b;
        }
        return i2;
    }

    public final Collection<n> a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            w[] wVarArr = this.d;
            if (i >= wVarArr.length) {
                return arrayList;
            }
            arrayList.addAll(wVarArr[i].a());
            i++;
        }
    }

    public final boolean b() {
        if (this.i) {
            return true;
        }
        for (w wVar : this.d) {
            i iVar = wVar.f14444a;
            if (!iVar.a()) {
                for (n nVar : iVar.b) {
                    if (nVar.d != null) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static /* synthetic */ void a(x xVar, boolean z) {
        xVar.c.a(BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB, new d.n(xVar.h, z));
        if (xVar.h.a(xVar.c)) {
            xVar.h.a(xVar.c, xVar.m);
        }
    }
}
