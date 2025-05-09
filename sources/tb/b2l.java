package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import tb.q2g;
import tb.voy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class b2l implements mic<kzk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16143a;

    static {
        t2o.a(1004536660);
        t2o.a(1002438734);
    }

    public b2l(String str) {
        this.f16143a = str;
        s2g.Companion.a();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.f16143a;
    }

    public final void b(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455ba9c", new Object[]{this, r2gVar});
            return;
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        String a2 = a();
        oyk oykVar = null;
        if (a2 != null) {
            oykVar = a2l.INSTANCE.g(a2);
            pus.INSTANCE.f("LifeCycle", a2, "event post before");
        } else {
            oykVar = null;
        }
        if (r2gVar.a() instanceof jzk) {
        }
        if (oykVar != null) {
            pus.INSTANCE.f("LifeCycle", a(), "event post , identifier:" + r2gVar.a() + " code:" + r2gVar.a().b());
            xyk j = oykVar.j();
            if (j != null) {
                toy b = toy.Companion.b();
                q2g.a aVar = q2g.Companion;
                voy.a aVar2 = voy.Companion;
                s2g a3 = r2gVar.a();
                ckf.e(a3, "null cannot be cast to non-null type com.taobao.kmp.nexus.arch.openArch.intent.OpenArchIntentIdentifier");
                j.e(b, aVar.a(aVar2.b((jzk) a3)), new kzk(r2gVar, a(), null, 4, null));
            }
            n1l N = oykVar.N();
            if (N != null) {
                N.j(new j1l(r2gVar.a().b()));
            }
        }
    }

    @Override // tb.mic
    public void d(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7fa0e2", new Object[]{this, r2gVar});
        } else {
            ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        a2l a2lVar = a2l.INSTANCE;
        a2lVar.n(this, "释放 State", a2lVar.g(a()));
        p(null);
    }

    @Override // tb.mic
    public e2g<kzk> i(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("c3ad9ac1", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return dyk.Companion.a(new kzk(r2gVar, a(), null, 4, null));
    }

    @Override // tb.mic
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.f16143a = str;
        }
    }

    @Override // tb.mic
    public void r(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7bcfe5", new Object[]{this, r2gVar});
            return;
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        b(r2gVar);
    }

    public /* synthetic */ b2l(String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str);
    }
}
