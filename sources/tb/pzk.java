package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pzk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String ENABLEAUTOCOMPENSATION = "enableCompensation";
    public static final String PERFROMINTENTERROR0 = "intent identifier 类型错误";
    public static final String PERFROMINTENTERROR1 = "不能调用只允许调用一次的生命周期";
    public static final String PERFROMINTENTERROR2 = "不能连续调用两次相同的生命周期";

    /* renamed from: a  reason: collision with root package name */
    public final Set<jzk> f26412a = new LinkedHashSet();
    public jzk b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536532);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536531);
    }

    public pzk(String str) {
        new dp7();
    }

    public static final String h(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1512b2f3", new Object[]{r2gVar});
        }
        return "不需要检查的类型 identifier:" + r2gVar.a() + " code:" + r2gVar.a().b();
    }

    public static final String i(pzk pzkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83a735af", new Object[]{pzkVar});
        }
        return "lastIntent change " + pzkVar.b;
    }

    public final boolean c(r2g r2gVar) {
        jzk jzkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ac4c6d0", new Object[]{this, r2gVar})).booleanValue();
        }
        s2g a2 = r2gVar.a();
        if (a2 instanceof jzk) {
            jzkVar = (jzk) a2;
        } else {
            jzkVar = null;
        }
        if (jzkVar == null) {
            return false;
        }
        jzk.a aVar = jzk.Companion;
        if (kfp.h(aVar.C(), aVar.B(), aVar.x(), aVar.w(), aVar.s(), aVar.r(), aVar.n(), aVar.m()).contains(jzkVar)) {
            return true;
        }
        Set<jzk> set = this.f26412a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (jzk jzkVar2 : set) {
            if (ckf.b(jzkVar2, jzkVar)) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c26d70c", new Object[]{this, r2gVar})).booleanValue();
        }
        return ckf.b(this.b, r2gVar.a());
    }

    public final jzk e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("48a5f6b8", new Object[]{this});
        }
        return this.b;
    }

    public final boolean f(r2g r2gVar) {
        jzk jzkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b32068", new Object[]{this, r2gVar})).booleanValue();
        }
        s2g a2 = r2gVar.a();
        if (a2 instanceof jzk) {
            jzkVar = (jzk) a2;
        } else {
            jzkVar = null;
        }
        if (jzkVar == null) {
            return true;
        }
        jzk.a aVar = jzk.Companion;
        return kfp.h(aVar.o(), aVar.p(), aVar.q(), aVar.d(), aVar.z(), aVar.A(), aVar.t(), aVar.e(), aVar.i(), aVar.g(), aVar.j(), aVar.h(), aVar.f()).contains(jzkVar);
    }

    public final e2g<kzk> g(final r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("819a4844", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (f(r2gVar)) {
            pus.INSTANCE.i("LifeCycle", null, new d1a() { // from class: tb.nzk
                @Override // tb.d1a
                public final Object invoke() {
                    String h;
                    h = pzk.h(r2g.this);
                    return h;
                }
            });
            return e2g.Companion.b(new kzk(r2gVar, null, null, 6, null));
        }
        s2g a2 = r2gVar.a();
        jzk jzkVar = a2 instanceof jzk ? (jzk) a2 : null;
        if (jzkVar == null) {
            return e2g.Companion.a(new kzk(r2gVar, null, PERFROMINTENTERROR0, 2, null));
        }
        if (!c(r2gVar)) {
            pus pusVar = pus.INSTANCE;
            pusVar.g("LifeCycle", null, "调用了不允许调用  identifier:" + r2gVar.a() + " code:" + r2gVar.a().b());
            return e2g.Companion.a(new kzk(r2gVar, null, PERFROMINTENTERROR1, 2, null));
        } else if (d(r2gVar)) {
            pus pusVar2 = pus.INSTANCE;
            pusVar2.g("LifeCycle", null, "同一个生命周期不允许调用多次  identifier:" + r2gVar.a() + " code:" + r2gVar.a().b());
            return e2g.Companion.a(new kzk(r2gVar, null, PERFROMINTENTERROR2, 2, null));
        } else {
            this.f26412a.add(jzkVar);
            this.b = jzkVar;
            pus.INSTANCE.i("LiveEngine", "", new d1a() { // from class: tb.ozk
                @Override // tb.d1a
                public final Object invoke() {
                    String i;
                    i = pzk.i(pzk.this);
                    return i;
                }
            });
            return e2g.Companion.b(new kzk(r2gVar, null, null, 6, null));
        }
    }
}
