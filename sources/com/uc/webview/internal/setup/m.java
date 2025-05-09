package com.uc.webview.internal.setup;

import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.b;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.internal.setup.c;
import com.uc.webview.internal.setup.verify.d;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    final l f14483a;
    int b = 0;
    private final String c;
    private final boolean d;
    private final n e;
    private final a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        l a(l lVar, l lVar2);
    }

    public m(n nVar, a aVar, boolean z) {
        String str;
        String str2;
        String str3;
        if (z) {
            str = "RCIDP";
        } else {
            str = "RCID";
        }
        this.c = str;
        this.d = z;
        this.e = nVar;
        this.f = aVar;
        l a2 = a(nVar, aVar);
        this.f14483a = a2;
        if (!z || a2 != null) {
            if (!a2.A()) {
                a2.a(a2.k());
            }
            if (z) {
                StringBuilder sb = new StringBuilder("preDecidedRCI: ");
                if (a2 != null) {
                    str3 = a2.b();
                } else {
                    str3 = "null";
                }
                sb.append(str3);
                sb.append(", reason:");
                sb.append(this.b);
                Log.i(str, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder("decided");
            if (a2 != null) {
                str2 = a2.toString();
            } else {
                str2 = "null";
            }
            sb2.append(str2);
            sb2.append(", reason:");
            sb2.append(this.b);
            Log.i(str, sb2.toString());
            if (!a2.isFirstUsed()) {
                c d = o.d();
                File t = a2.t();
                d.a();
                if (d.c && !c.a(t)) {
                    synchronized (d.b) {
                        d.e = new c.a(t);
                    }
                }
                if (d.b()) {
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED, 1L);
                    Log.d(str, "createRCI: maybe damaged");
                    b.a("wk_ucbsMainNativeMaybeDamaged", "true");
                    a2.a(false);
                    d.c();
                    d.b(a2);
                }
            }
            com.uc.webview.base.task.d.a(str + "-MK", new Runnable() { // from class: com.uc.webview.internal.setup.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar;
                    com.uc.webview.base.io.c u;
                    l lVar = m.this.f14483a;
                    if (lVar.A() && (u = lVar.u()) != null) {
                        u.b();
                    }
                    String path = lVar.path();
                    b.a("wk_ucbsRCIBase", lVar.c());
                    if (path == null) {
                        path = "null";
                    }
                    b.a("ucbsRCIDir", path);
                    long j = 0;
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.IS_REUSED, lVar.isReUsed() ? 1L : 0L);
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.IS_FIRST_USED, lVar.isFirstUsed() ? 1L : 0L);
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.INTEGRATION_TYPE, lVar.integrationType());
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.CAPABILITY_TYPE, lVar.f());
                    if (!lVar.A()) {
                        j = 1;
                    }
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.NEED_VERIFY, j);
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.DECIDE_RCI_REASON, mVar.b);
                }
            });
        }
    }

    public static m a(n nVar) {
        return new m(nVar, null, true);
    }

    private l a(n nVar, a aVar) {
        l lVar;
        l a2;
        try {
            lVar = l.a(nVar);
        } catch (UCKnownException e) {
            if (this.d) {
                lVar = null;
            } else {
                throw e;
            }
        }
        if (lVar == null || !lVar.g()) {
            i a3 = i.a(nVar.c);
            if (a3 == null) {
                this.b = 0;
                return lVar;
            }
            if (!this.d) {
                String str = this.c;
                Log.d(str, "prepareToDecide {\n  initializingRCI: " + a(lVar) + "\n  existingRCI: " + a(a3) + "\n}");
            }
            if (lVar != null && lVar.a(a3)) {
                this.b = 5;
                a3.y();
                return a3;
            } else if (aVar == null || (a2 = aVar.a(lVar, a3)) == null) {
                this.b = a3.b;
                return a3.f14471a ? a3 : lVar;
            } else {
                this.b = a2 == lVar ? 3 : 4;
                return a2;
            }
        } else {
            lVar.a(true);
            this.b = 2;
            return lVar;
        }
    }

    private static String a(l lVar) {
        return lVar != null ? lVar.b() : "null";
    }
}
