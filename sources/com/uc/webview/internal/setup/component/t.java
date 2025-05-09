package com.uc.webview.internal.setup.component;

import android.os.Handler;
import android.os.Looper;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.setup.component.c;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import com.uc.webview.internal.setup.o;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14440a = new AtomicBoolean(false);
    private static t b;
    private static U4Engine.UpgradingObserver c;
    private static Looper d;
    private static ICoreVersion j;
    private static final r k;
    private static b l;
    private final int e;
    private final int f;
    private final String g;
    private final g.a h;
    private x i;

    static {
        int a2 = n.a(0);
        k = new v(d(a2), a2, c.d());
    }

    private t(int i, int i2) {
        String d2 = d(i);
        this.g = d2;
        this.e = i;
        this.f = i2;
        this.h = new a(d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b(int r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.t.b(int):void");
    }

    public static /* synthetic */ void c(int i) {
        synchronized (t.class) {
            b = null;
        }
        a(i, false);
    }

    private static String d(int i) {
        return i == 110 ? "U4Patch" : "U4Patch1";
    }

    public static void a(U4Engine.UpgradingObserver upgradingObserver) {
        c = upgradingObserver;
        Looper myLooper = Looper.myLooper();
        d = myLooper;
        if (myLooper == null) {
            d = Looper.getMainLooper();
        }
    }

    public static void a(final int i) {
        ICoreVersion iCoreVersion;
        synchronized (t.class) {
            try {
                if (c == null || (iCoreVersion = j) == null || (iCoreVersion.getCoreFeature() & i) == 0) {
                    int a2 = n.a(i);
                    r rVar = k;
                    if (a2 != rVar.b) {
                        rVar.f14438a = d(a2);
                        rVar.b = a2;
                    }
                    rVar.a(-101, new d.j(new c.f(), i, v.a()));
                    com.uc.webview.base.task.c.a("U4Patch", new Runnable() { // from class: com.uc.webview.internal.setup.component.t.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.b(i);
                        }
                    }, null, 0L);
                    return;
                }
                h.a("U4Patch", "expectCoreFeature(%s) had patched", Integer.toBinaryString(i));
                new Handler(d).post(new Runnable() { // from class: com.uc.webview.internal.setup.component.t.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.c.onSuccess(t.j);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends g.c {
        private boolean c;

        public a(String str) {
            super(str);
        }

        @Override // com.uc.webview.internal.setup.component.g.c, com.uc.webview.internal.setup.component.g.a
        public final void a(int i, d.h hVar) {
            super.a(i, hVar);
            t.k.a(i, hVar);
            if (i != -455) {
                if (i != -162) {
                    if (i == -143) {
                        c.e();
                        return;
                    } else if (i != -140) {
                        return;
                    }
                }
                a(o.b().g().coreVersion(), i);
                c.e();
            } else if (hVar instanceof d.b) {
                d.b bVar = (d.b) hVar;
                if (!bVar.f14397a && !this.c && bVar.b && bVar.c / k.c > 0) {
                    this.c = true;
                    t.a(-148, false);
                }
            }
        }

        private void a(final ICoreVersion iCoreVersion, int i) {
            synchronized (t.class) {
                ICoreVersion unused = t.j = iCoreVersion;
            }
            t.c(i);
            if (t.c != null) {
                new Handler(t.d).post(new Runnable() { // from class: com.uc.webview.internal.setup.component.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.c.onSuccess(iCoreVersion);
                    }
                });
            }
        }

        @Override // com.uc.webview.internal.setup.component.g.c, com.uc.webview.internal.setup.component.g.a
        public final void a(ICoreVersion iCoreVersion) {
            a(iCoreVersion, BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM);
        }

        @Override // com.uc.webview.internal.setup.component.g.c, com.uc.webview.internal.setup.component.g.a
        public final void a(final int i, final int i2, final int i3) {
            t.c(i);
            if (t.c != null) {
                new Handler(t.d).post(new Runnable() { // from class: com.uc.webview.internal.setup.component.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        U4Engine.UpgradingObserver upgradingObserver = t.c;
                        int i4 = i;
                        upgradingObserver.onFailed(i4, String.format("{e1: %d, e2: %d, e3: %d}", Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i, boolean z) {
        if (l == null) {
            synchronized (t.class) {
                try {
                    if (l == null) {
                        b bVar = new b(z);
                        l = bVar;
                        bVar.a(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
