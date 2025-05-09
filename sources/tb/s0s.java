package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s0s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UncaughtCrashManager f27734a;

    public s0s(UncaughtCrashManager uncaughtCrashManager) {
        this.f27734a = uncaughtCrashManager;
    }

    public static UncaughtCrashManager h(x0s x0sVar, koq koqVar, j1s j1sVar, r2o r2oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashManager) ipChange.ipc$dispatch("aff4245c", new Object[]{x0sVar, koqVar, j1sVar, r2oVar});
        }
        k1s m = m(x0sVar, koqVar, j1sVar, r2oVar);
        TCrashSDK.instance().setUncaughtCrashManager(m);
        return m;
    }

    public static j1s i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1s) ipChange.ipc$dispatch("85bfdabb", new Object[0]);
        }
        i1s i1sVar = new i1s();
        i1sVar.b();
        return i1sVar;
    }

    public static r2o j(x0s x0sVar, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2o) ipChange.ipc$dispatch("4fd5d63a", new Object[]{x0sVar, koqVar});
        }
        return new p1s(x0sVar, koqVar);
    }

    public static s0s k(x0s x0sVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0s) ipChange.ipc$dispatch("3d5ce67", new Object[]{x0sVar, map});
        }
        koq l = l(x0sVar, map);
        r2o j = j(x0sVar, l);
        UncaughtCrashManager h = h(x0sVar, l, i(), j);
        new nla().a(new a8h(x0sVar, l, j)).a(new i0s(x0sVar, l, j)).a(new pb2(x0sVar, l)).execute();
        ovg.a(x0sVar, l);
        return new s0s(h);
    }

    public static koq l(x0s x0sVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koq) ipChange.ipc$dispatch("a25428c1", new Object[]{x0sVar, map});
        }
        return poq.b(x0sVar, map);
    }

    public static /* synthetic */ void o(j1s j1sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a13c6be", new Object[]{j1sVar, str});
        } else {
            j1sVar.a("java", new File(str).getName());
        }
    }

    public static /* synthetic */ void p(r2o r2oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108b543b", new Object[]{r2oVar, str});
        } else {
            r2oVar.a(o1s.b(new File(str), "java"));
        }
    }

    public static /* synthetic */ void q(j1s j1sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef5b8fc", new Object[]{j1sVar, str});
        } else {
            j1sVar.a("native", str);
        }
    }

    public static /* synthetic */ void r(x0s x0sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d54d0da", new Object[]{x0sVar, str});
        } else {
            m5v.b(x0sVar, str, "native");
        }
    }

    public static /* synthetic */ void s(j1s j1sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7ab3a", new Object[]{j1sVar, str});
        } else {
            j1sVar.a("anr", str);
        }
    }

    public static /* synthetic */ void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f69c203", new Object[]{str});
        } else {
            l1s.c().a("STAGE_ANR_HAPPENED", "TCrash", "anr");
        }
    }

    public static /* synthetic */ void u(r2o r2oVar, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfe9631", new Object[]{r2oVar, file, new Boolean(z)});
        } else if (z) {
            r2oVar.a(o1s.b(file, "anr"));
            l1s.c().a("STAGE_ANR_HAPPENED_SEND", "TCrash", "anr");
        }
    }

    public UncaughtCrashManager n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashManager) ipChange.ipc$dispatch("313bd483", new Object[]{this});
        }
        return this.f27734a;
    }

    public static k1s m(final x0s x0sVar, koq koqVar, final j1s j1sVar, final r2o r2oVar) {
        igv igvVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1s) ipChange.ipc$dispatch("9b9978b7", new Object[]{x0sVar, koqVar, j1sVar, r2oVar});
        }
        i1r a2 = o1r.a(x0sVar.g());
        if (koqVar.defaultValue()) {
            z = a2.b("supportTCrash2Again", koqVar.defaultValue());
        } else if (!a2.b("supportTCrash2Again", koqVar.defaultValue()) || !a2.b("UseNewTCrashAb", koqVar.defaultValue())) {
            z = false;
        }
        k1s k1sVar = new k1s(x0sVar, z);
        boolean b = a2.b("cancelNoThreadNameIgnore", koqVar.defaultValue());
        hyf h = k1sVar.c().h(new ny8()).h(new akx()).h(new wjo(x0sVar));
        if (b) {
            igvVar = new co6();
        } else {
            igvVar = new d6k();
        }
        h.h(igvVar);
        da2 da2Var = new da2(x0sVar.g());
        x4s x4sVar = new x4s();
        k1sVar.c().l(new y0s(x0sVar)).i(da2Var).i(new rbk(x0sVar, koqVar)).i(new wln(x0sVar.g())).i(new jb0(x0sVar)).i(new kr2(x0sVar, koqVar)).i(x4sVar).g(new OnFileCreatedListener() { // from class: tb.k0s
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                s0s.o(j1s.this, str);
            }
        }).o(new aqk() { // from class: tb.l0s
            @Override // tb.aqk
            public final void onCompleted(String str) {
                s0s.p(r2o.this, str);
            }
        });
        k1sVar.d().e(new OnFileCreatedListener() { // from class: tb.m0s
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                s0s.q(j1s.this, str);
            }
        }).r(new aqk() { // from class: tb.n0s
            @Override // tb.aqk
            public final void onCompleted(String str) {
                s0s.r(x0s.this, str);
            }
        });
        k1sVar.d().d(da2Var).d(x4sVar).c(new OnFileCreatedListener() { // from class: tb.o0s
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                s0s.s(j1s.this, str);
            }
        }).c(new OnFileCreatedListener() { // from class: tb.p0s
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                s0s.t(str);
            }
        }).q(new xz0(x0sVar, koqVar, new q0s(r2oVar)));
        UncaughtCrashHeader uncaughtCrashHeader = k1sVar.getUncaughtCrashHeader();
        Application g = x0sVar.g();
        uncaughtCrashHeader.getClass();
        g.registerActivityLifecycleCallbacks(new f61(x0sVar, new r0s(uncaughtCrashHeader)));
        return k1sVar;
    }
}
