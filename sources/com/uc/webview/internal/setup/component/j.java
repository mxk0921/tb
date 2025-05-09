package com.uc.webview.internal.setup.component;

import com.uc.webview.base.f;
import com.uc.webview.base.task.c;
import com.uc.webview.internal.setup.component.k;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j implements k.c {
    private static final Map<String, j> l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final String f14413a;
    private final String c;
    private final String d;
    private final Object e;
    private final String f;
    private final int g;
    private int j;
    private Runnable k;
    private final Set<k.c> b = new HashSet();
    private int h = 0;
    private int i = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final C0842a f14417a;
        static final C0842a b;

        /* compiled from: Taobao */
        /* renamed from: com.uc.webview.internal.setup.component.j$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class C0842a {

            /* renamed from: a  reason: collision with root package name */
            final Class<?> f14418a;
            final Method b;

            public C0842a(Class<?> cls, Method method) {
                this.f14418a = cls;
                this.b = method;
            }
        }

        static {
            String[] strArr = {"com.uc.pars.api.Pars$PackageListener", "com.uc.pars.api.Pars$ParsPackageCallback"};
            Class<?> a2 = k.a("com.uc.pars.api.Pars$IPackageInfo");
            C0842a aVar = null;
            C0842a aVar2 = null;
            for (int i = 0; i < 2; i++) {
                Class<?> a3 = k.a(strArr[i]);
                if (a3 != null) {
                    if (aVar == null && a2 != null) {
                        try {
                            Method a4 = f.a(k.f14419a, "downloadBundle", a2, Boolean.TYPE, a3);
                            if (a4 != null) {
                                aVar = new C0842a(a3, a4);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (aVar2 == null) {
                        try {
                            Method a5 = f.a(k.f14419a, "downloadBundle", String.class, a3);
                            if (a5 != null) {
                                aVar2 = new C0842a(a3, a5);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    if (!(aVar == null || aVar2 == null)) {
                        break;
                    }
                }
            }
            f14417a = aVar;
            b = aVar2;
        }

        public static boolean a() {
            return b == null;
        }

        public static /* synthetic */ void a(j jVar, String str, Object obj) throws Exception {
            l lVar = new l(jVar);
            C0842a aVar = f14417a;
            if (aVar == null || obj == null) {
                String unused = jVar.f14413a;
                C0842a aVar2 = b;
                f.a((Object) null, aVar2.b, new Object[]{str, Proxy.newProxyInstance(aVar2.f14418a.getClassLoader(), new Class[]{aVar2.f14418a}, lVar)});
                return;
            }
            String unused2 = jVar.f14413a;
            f.a((Object) null, aVar.b, new Object[]{obj, Boolean.FALSE, Proxy.newProxyInstance(aVar.f14418a.getClassLoader(), new Class[]{aVar.f14418a}, lVar)});
        }
    }

    private j(p pVar, f fVar) {
        this.f14413a = "U4Pars:DL:" + pVar.f14436a;
        this.c = pVar.f14436a;
        this.d = pVar.f;
        this.e = fVar.f14405a;
        this.f = pVar.g;
        this.g = c.a(pVar.b, fVar.i);
    }

    private void d() {
        if (this.h == 0) {
            synchronized (this) {
                try {
                    if (this.h == 0) {
                        this.h = 1;
                        if (this.k == null) {
                            this.k = new Runnable() { // from class: com.uc.webview.internal.setup.component.j.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c.a(j.this.f14413a, new Runnable() { // from class: com.uc.webview.internal.setup.component.j.2.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            j.b(j.this);
                                        }
                                    });
                                }

                                public final String toString() {
                                    return "下载 " + j.this.d;
                                }
                            };
                        }
                        m.a(this.k, this.g);
                        try {
                            a.a(this, this.d, this.e);
                        } catch (Exception e) {
                            String str = this.c;
                            Object[] objArr = {this.d, e};
                            if (!h.a(5)) {
                                String a2 = h.a("DownloadBundle(%s) exception", objArr);
                                Throwable a3 = h.a(objArr);
                                if (a3 != null) {
                                    h.a(5, str, a2, a3);
                                } else {
                                    h.a(5, str, a2, null);
                                }
                            }
                            b(1);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.uc.webview.internal.setup.component.k.c
    public final boolean b() {
        return false;
    }

    private void c() {
        this.b.clear();
        m.a(this.k);
        this.k = null;
    }

    public final void a(k.e eVar) {
        if (eVar != null) {
            a(k.b(this.f));
        } else {
            b(2);
        }
    }

    @Override // com.uc.webview.internal.setup.component.k.c
    public final void b(int i) {
        synchronized (this) {
            try {
                this.h = 3;
                this.j = i;
                for (k.c cVar : this.b) {
                    cVar.b(i);
                }
                c();
                this.h = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.uc.webview.internal.setup.component.k.c
    public final void a() {
        synchronized (this) {
            try {
                this.h = 1;
                for (k.c cVar : this.b) {
                    cVar.a();
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
                this.j = i;
                this.h = 4;
                for (k.c cVar : this.b) {
                    cVar.c(i);
                }
                c();
                this.h = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.uc.webview.internal.setup.component.k.c
    public final void a(int i) {
        if (i != this.i) {
            this.i = i;
            synchronized (this) {
                try {
                    for (k.c cVar : this.b) {
                        cVar.a(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void b(j jVar) {
        synchronized (jVar) {
            try {
                if (jVar.h <= 1) {
                    synchronized (jVar) {
                        for (k.c cVar : jVar.b) {
                            cVar.b();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.uc.webview.internal.setup.component.k.c
    public final void a(k.f fVar) {
        if (this.h != 2) {
            synchronized (this) {
                try {
                    if (this.h != 2) {
                        this.h = 2;
                        for (k.c cVar : this.b) {
                            cVar.a(fVar);
                        }
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static j a(p pVar, f fVar) {
        j jVar;
        Map<String, j> map = l;
        synchronized (map) {
            try {
                jVar = map.get(pVar.f);
                if (jVar == null) {
                    jVar = new j(pVar, fVar);
                    map.put(pVar.f, jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static void a(p pVar, f fVar, final k.c cVar) {
        j a2 = a(pVar, fVar);
        if (cVar != null) {
            c.a(a2.c, new Runnable() { // from class: com.uc.webview.internal.setup.component.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(j.this, cVar);
                }
            });
            return;
        }
        a2.d();
    }

    public static /* synthetic */ void a(j jVar, k.c cVar) {
        synchronized (jVar) {
            try {
                if (jVar.h < 2) {
                    jVar.b.add(cVar);
                }
                int i = jVar.h;
                if (i == 3) {
                    cVar.b(jVar.j);
                } else if (i == 4) {
                    cVar.c(jVar.j);
                } else if (i == 2) {
                    cVar.a();
                    int i2 = jVar.i;
                    if (i2 >= 0) {
                        cVar.a(i2);
                    }
                    cVar.a(k.b(jVar.f));
                } else if (i == 1) {
                    cVar.a();
                    int i3 = jVar.i;
                    if (i3 >= 0) {
                        cVar.a(i3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jVar.d();
    }
}
