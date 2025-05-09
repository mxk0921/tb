package com.uc.webview.internal.setup;

import android.content.Context;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.f;
import com.uc.webview.base.i;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.c;
import com.uc.webview.internal.setup.verify.d;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    final AtomicBoolean f14488a = new AtomicBoolean(false);
    final AtomicBoolean b = new AtomicBoolean(false);
    b c;
    private final o d;
    private HashMap<Integer, a> e;

    public p(o oVar) {
        this.d = oVar;
    }

    public final ClassLoader a(File file) {
        if (file == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (a.f14489a) {
            try {
                String absolutePath = file.getAbsolutePath();
                int hashCode = absolutePath.hashCode();
                HashMap<Integer, a> hashMap = this.e;
                a aVar = hashMap != null ? hashMap.get(Integer.valueOf(hashCode)) : null;
                if (aVar == null) {
                    Log.d("Setup.prl", "no dex preload for ".concat(absolutePath));
                    return null;
                }
                aVar.d = currentTimeMillis;
                long j = 0;
                if (aVar.e > 0) {
                    aVar.d();
                }
                ClassLoader classLoader = aVar.c;
                this.e.remove(Integer.valueOf(hashCode));
                Log.d("Setup.prl", "csLoader:".concat(String.valueOf(classLoader)));
                if (classLoader != null) {
                    j = 1;
                }
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.USE_PRELOAD_CORE_DEX, j);
                return classLoader;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(File file) {
        if (file != null) {
            synchronized (a.f14489a) {
                try {
                    if (this.e != null) {
                        String absolutePath = file.getAbsolutePath();
                        Log.d("Setup.prl", " removeLoader:".concat(String.valueOf(absolutePath)));
                        this.e.remove(Integer.valueOf(absolutePath.hashCode()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f14489a = new Object();
        public File b;
        public ClassLoader c;

        private a() {
            super((byte) 0);
            this.b = null;
            this.c = null;
        }

        @Override // com.uc.webview.internal.setup.p.c
        public final int a() {
            return StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME;
        }

        @Override // com.uc.webview.internal.setup.p.c
        public final int b() {
            return StartupTimingKeys.PRELOAD_CORE_DEX_WAIT_TIME;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f14490a = new Object();
        public int b;
        public File c;

        private b() {
            super((byte) 0);
            this.b = 0;
            this.c = null;
        }

        @Override // com.uc.webview.internal.setup.p.c
        public final int a() {
            return StartupTimingKeys.PRELOAD_CORE_LIB_LEAD_TIME;
        }

        @Override // com.uc.webview.internal.setup.p.c
        public final int b() {
            return StartupTimingKeys.PRELOAD_CORE_LIB_WAIT_TIME;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private long f14491a;
        long d;
        long e;

        private c() {
            this.d = 0L;
            this.e = 0L;
            this.f14491a = 0L;
        }

        public abstract int a();

        public abstract int b();

        public final void c() {
            this.f14491a = System.currentTimeMillis();
            if (this.d > 0) {
                d();
            }
        }

        public final void d() {
            if (this.d > 0) {
                com.uc.webview.base.timing.a.a(a(), this.d - this.e);
                com.uc.webview.base.timing.a.a(b(), this.f14491a - this.d);
            }
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    public final l b(Context context, File file) {
        l g = this.d.g();
        if (g == null) {
            n a2 = n.a();
            a2.c = context.getApplicationContext();
            if (file != null) {
                if (file.isFile()) {
                    a2.e = file;
                } else if (file.isDirectory()) {
                    a2.g = file;
                }
            }
            g = m.a(a2).f14483a;
        }
        StringBuilder sb = new StringBuilder("maybeRci:");
        sb.append(g != null ? g.b() : "null");
        sb.append(", target:");
        sb.append(file);
        Log.d("Setup.prl", sb.toString());
        return g;
    }

    public final ClassLoader a(l lVar, int i, Object[] objArr) {
        return a(EnvInfo.getContext(), lVar, i, objArr);
    }

    public final ClassLoader a(Context context, l lVar, int i, Object[] objArr) {
        if (!this.f14488a.get() || lVar == null || !lVar.a(this.d.g())) {
            ClassLoader classLoader = p.class.getClassLoader();
            if (lVar.l()) {
                Log.d("Setup.prl", "loadDex: thick");
                return classLoader;
            }
            File p = lVar.p();
            if (p == null || !p.exists()) {
                if (objArr != null && objArr.length > 0) {
                    objArr[0] = 8;
                }
                return null;
            }
            synchronized (a.f14489a) {
                try {
                    int hashCode = p.getAbsolutePath().hashCode();
                    HashMap<Integer, a> hashMap = this.e;
                    a aVar = hashMap != null ? hashMap.get(Integer.valueOf(hashCode)) : null;
                    if (aVar != null) {
                        Log.d("Setup.prl", "loadDex: repeat for " + aVar.c);
                        return aVar.c;
                    }
                    a aVar2 = new a((byte) 0);
                    aVar2.e = System.currentTimeMillis();
                    TraceEvent scoped = TraceEvent.scoped("Setup.prl.dex");
                    try {
                        d.a(context, lVar.t(), p, i);
                        File B = lVar.B();
                        Log.i("Setup.prl", "loadDex:" + B.getAbsolutePath());
                        ClassLoader a2 = i.a(B, lVar.q(), lVar.r(), classLoader);
                        a(a2);
                        if (scoped != null) {
                            scoped.close();
                        }
                        if (a2 != null) {
                            aVar2.b = B;
                            aVar2.c = a2;
                            if (this.e == null) {
                                this.e = new HashMap<>();
                            }
                            this.e.put(Integer.valueOf(hashCode), aVar2);
                            Log.d("Setup.prl", "loadDex: ok for " + aVar2.c);
                            aVar2.c();
                        }
                        return a2;
                    } catch (Throwable th) {
                        if (scoped != null) {
                            try {
                                scoped.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            Log.d("Setup.prl", "loadDex: use running");
            return this.d.h();
        }
    }

    public final boolean a(Context context, File file) {
        Throwable th;
        HashMap<Integer, a> hashMap;
        a aVar;
        if (this.b.get()) {
            return true;
        }
        synchronized (b.f14490a) {
            l lVar = null;
            try {
                a((l) null, false);
                b bVar = this.c;
                int i = bVar.b;
                if (!(i == 1 || i == 2)) {
                    l b2 = b(context, file);
                    if (b2 == null) {
                        a(b2, true);
                        return false;
                    }
                    try {
                        ClassLoader coreClassLoader = b2.coreClassLoader();
                        if (coreClassLoader == null) {
                            synchronized (a.f14489a) {
                                File p = b2.p();
                                if (!(p == null || (hashMap = this.e) == null || (aVar = hashMap.get(Integer.valueOf(p.getAbsolutePath().hashCode()))) == null)) {
                                    coreClassLoader = aVar.c;
                                }
                            }
                        }
                        if (coreClassLoader == null) {
                            this.c.b = 3;
                            a(b2, true);
                            return false;
                        } else if (!a(b2, coreClassLoader)) {
                            a(b2, true);
                            return false;
                        } else {
                            TraceEvent scoped = TraceEvent.scoped("Setup.prl.lib");
                            File r = b2.r();
                            if (((Boolean) f.a(null, a(coreClassLoader), "preloadSo", new Class[]{String.class}, new Object[]{r != null ? r.getAbsolutePath() : null})).booleanValue()) {
                                b bVar2 = this.c;
                                bVar2.b = 1;
                                bVar2.c = r;
                                if (scoped != null) {
                                    scoped.close();
                                }
                                a(b2, true);
                                return true;
                            }
                            if (scoped != null) {
                                scoped.close();
                            }
                            this.c.b = 6;
                            a(b2, true);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lVar = b2;
                        a(lVar, true);
                        throw th;
                    }
                }
                bVar.b = 2;
                a((l) null, true);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private boolean a(l lVar, ClassLoader classLoader) {
        boolean z;
        File t = lVar.t();
        if ((t == null || !GlobalSettings.getBoolValue(85)) ? false : new c.a(t).a()) {
            this.c.b = 4;
            return false;
        }
        if (!lVar.k()) {
            try {
                z = d.a(lVar.t(), lVar.r(), 1, classLoader, false);
            } catch (Throwable unused) {
                z = false;
            }
            if (!z) {
                this.c.b = 5;
                return false;
            }
        }
        return true;
    }

    private void a(l lVar, boolean z) {
        this.d.a(16, z);
        if (this.c == null) {
            this.c = new b((byte) 0);
        }
        if (z) {
            Log.d("Setup.prl", "onLoadLibFinish rci:" + lVar.b() + ", status:" + this.c.b);
            this.c.c();
            com.uc.webview.base.timing.a.a((int) StartupTimingKeys.USE_PRELOAD_CORE_SO, (long) this.c.b);
            return;
        }
        this.c.e = System.currentTimeMillis();
    }

    private static Class a(ClassLoader classLoader) {
        try {
            return Class.forName(IStartupController.CORE_CLASS_STARTUP_CONTROLLER, true, classLoader);
        } catch (Throwable th) {
            Log.w("Setup.prl", "entryFailed", th);
            return null;
        }
    }
}
