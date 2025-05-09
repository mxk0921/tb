package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.kmp.kernel.serviceinterface.KSMTOPRequestMethod;
import com.taobao.nanocompose.megability.ability.MTOPRequestMethod;
import com.taobao.nanocompose.megability.ability.MTOPResponseType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lqr extends u1<thc> implements thc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438768);
        t2o.a(1002438808);
    }

    public lqr() {
        this(null, 1, null);
    }

    public static final xhv g0(Map map, Map map2, Map map3, KSMTOPRequestMethod kSMTOPRequestMethod, final String str, final String str2, final lqr lqrVar, final g1a g1aVar, final u1a u1aVar, final g1a g1aVar2, fth fthVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6948c964", new Object[]{map, map2, map3, kSMTOPRequestMethod, str, str2, lqrVar, g1aVar, u1aVar, g1aVar2, fthVar});
        }
        ckf.g(fthVar, "$this$requestData");
        fthVar.x(map);
        Iterator<E> it = MTOPRequestMethod.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ckf.b(((MTOPRequestMethod) obj).getRawValue(), kSMTOPRequestMethod.getRawValue())) {
                break;
            }
        }
        MTOPRequestMethod mTOPRequestMethod = (MTOPRequestMethod) obj;
        if (mTOPRequestMethod == null) {
            mTOPRequestMethod = MTOPRequestMethod.GET;
        }
        fthVar.A(mTOPRequestMethod);
        fthVar.H("live");
        fthVar.y(map2);
        fthVar.z(map3);
        fthVar.F(MTOPResponseType.JSON);
        fthVar.E(new g1a() { // from class: tb.eqr
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv j0;
                lqr lqrVar2 = lqrVar;
                g1a g1aVar3 = g1aVar;
                j0 = lqr.j0(str, str2, lqrVar2, g1aVar3, u1aVar, (eth) obj2);
                return j0;
            }
        });
        fthVar.D(new g1a() { // from class: tb.fqr
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv m0;
                lqr lqrVar2 = lqrVar;
                g1a g1aVar3 = g1aVar2;
                m0 = lqr.m0(str, str2, lqrVar2, g1aVar3, u1aVar, (eth) obj2);
                return m0;
            }
        });
        fthVar.C(new g1a() { // from class: tb.gqr
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv h0;
                String str3 = str2;
                g1a g1aVar3 = g1aVar2;
                h0 = lqr.h0(str, str3, g1aVar3, u1aVar, (bi8) obj2);
                return h0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv h0(String str, String str2, final g1a g1aVar, final u1a u1aVar, final bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("beef6b46", new Object[]{str, str2, g1aVar, u1aVar, bi8Var});
        }
        ckf.g(bi8Var, AdvanceSetting.NETWORK_TYPE);
        pus pusVar = pus.INSTANCE;
        pusVar.k("TBMtopService", "", "use mega mtop request onError apiName:" + str + " version:" + str2);
        cvs.Companion.e(new d1a() { // from class: tb.jqr
            @Override // tb.d1a
            public final Object invoke() {
                xhv i0;
                i0 = lqr.i0(g1a.this, u1aVar, bi8Var);
                return i0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv i0(g1a g1aVar, u1a u1aVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("16a0686a", new Object[]{g1aVar, u1aVar, bi8Var});
        }
        if (g1aVar != null) {
            l0g l0gVar = new l0g();
            j0g j0gVar = new j0g();
            j0gVar.g(bi8Var.a());
            j0gVar.d(bi8Var.b());
            l0gVar.i(j0gVar);
            g1aVar.invoke(l0gVar);
        }
        if (u1aVar != null) {
            l0g l0gVar2 = new l0g();
            j0g j0gVar2 = new j0g();
            j0gVar2.g(bi8Var.a());
            j0gVar2.d(bi8Var.b());
            l0gVar2.i(j0gVar2);
            u1aVar.invoke(l0gVar2, Boolean.FALSE);
        }
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(lqr lqrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBMtopService");
    }

    public static final xhv j0(final String str, final String str2, final lqr lqrVar, final g1a g1aVar, final u1a u1aVar, final eth ethVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1d76ed1", new Object[]{str, str2, lqrVar, g1aVar, u1aVar, ethVar});
        }
        ckf.g(ethVar, AdvanceSetting.NETWORK_TYPE);
        pus.INSTANCE.i("TBMtopService", "", new d1a() { // from class: tb.hqr
            @Override // tb.d1a
            public final Object invoke() {
                String k0;
                k0 = lqr.k0(str, str2);
                return k0;
            }
        });
        cvs.Companion.e(new d1a() { // from class: tb.iqr
            @Override // tb.d1a
            public final Object invoke() {
                xhv l0;
                l0 = lqr.l0(lqr.this, ethVar, g1aVar, u1aVar);
                return l0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final String k0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a466887f", new Object[]{str, str2});
        }
        return "use mega mtop request onReceiveData apiName:" + str + " version:" + str2;
    }

    public static final xhv l0(lqr lqrVar, eth ethVar, g1a g1aVar, u1a u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("969c05a6", new Object[]{lqrVar, ethVar, g1aVar, u1aVar});
        }
        l0g f0 = lqrVar.f0(ethVar);
        if (g1aVar != null) {
            g1aVar.invoke(f0);
        }
        if (u1aVar != null) {
            u1aVar.invoke(f0, Boolean.TRUE);
        }
        return xhv.INSTANCE;
    }

    public static final xhv m0(String str, String str2, final lqr lqrVar, final g1a g1aVar, final u1a u1aVar, final eth ethVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2d41d80f", new Object[]{str, str2, lqrVar, g1aVar, u1aVar, ethVar});
        }
        ckf.g(ethVar, AdvanceSetting.NETWORK_TYPE);
        pus pusVar = pus.INSTANCE;
        pusVar.k("TBMtopService", "", "use mega mtop request onFailure apiName:" + str + " version:" + str2);
        cvs.Companion.e(new d1a() { // from class: tb.kqr
            @Override // tb.d1a
            public final Object invoke() {
                xhv n0;
                n0 = lqr.n0(lqr.this, ethVar, g1aVar, u1aVar);
                return n0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv n0(lqr lqrVar, eth ethVar, g1a g1aVar, u1a u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("463b6b66", new Object[]{lqrVar, ethVar, g1aVar, u1aVar});
        }
        l0g f0 = lqrVar.f0(ethVar);
        if (g1aVar != null) {
            g1aVar.invoke(f0);
        }
        if (u1aVar != null) {
            u1aVar.invoke(f0, Boolean.FALSE);
        }
        return xhv.INSTANCE;
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.k();
    }

    public final j0g d0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0g) ipChange.ipc$dispatch("dd4c8128", new Object[]{this, obj});
        }
        if (!(obj instanceof cth)) {
            return null;
        }
        j0g j0gVar = new j0g();
        cth cthVar = (cth) obj;
        j0gVar.f(cthVar.d());
        j0gVar.e(cthVar.c());
        j0gVar.d(cthVar.b());
        j0gVar.g(cthVar.e());
        j0gVar.c(cthVar.a());
        return j0gVar;
    }

    public final m0g e0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0g) ipChange.ipc$dispatch("666bc40c", new Object[]{this, obj});
        }
        if (!(obj instanceof gth)) {
            return null;
        }
        m0g m0gVar = new m0g();
        gth gthVar = (gth) obj;
        m0gVar.c(gthVar.b());
        m0gVar.b(gthVar.a());
        m0gVar.e(gthVar.g());
        m0gVar.d(gthVar.c());
        m0gVar.h(gthVar.f());
        m0gVar.f(gthVar.d());
        m0gVar.g(gthVar.e());
        return m0gVar;
    }

    public final l0g f0(eth ethVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l0g) ipChange.ipc$dispatch("cd39aec9", new Object[]{this, ethVar});
        }
        l0g l0gVar = new l0g();
        l0gVar.l(ethVar.f());
        l0gVar.h(ethVar.c());
        l0gVar.n(ethVar.h());
        l0gVar.f(ethVar.a());
        l0gVar.k(ethVar.e());
        l0gVar.m(e0(ethVar.g()));
        l0gVar.g(ethVar.b());
        l0gVar.i(d0(ethVar.d()));
        k0g k0gVar = new k0g();
        k0gVar.d(Long.valueOf(bvt.d(ftt.Companion)));
        l0gVar.j(k0gVar);
        return l0gVar;
    }

    public lqr(asb asbVar) {
        super(asbVar);
    }

    public /* synthetic */ lqr(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }

    @Override // tb.thc
    public void g(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, g1a<? super l0g, xhv> g1aVar, g1a<? super l0g, xhv> g1aVar2, u1a<? super l0g, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7437541", new Object[]{this, str, str2, map, map2, map3, g1aVar, g1aVar2, u1aVar});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "version");
        d(str, str2, map, map2, map3, KSMTOPRequestMethod.GET, g1aVar, g1aVar2, u1aVar);
    }

    @Override // tb.thc
    public void i(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, g1a<? super l0g, xhv> g1aVar, g1a<? super l0g, xhv> g1aVar2, u1a<? super l0g, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f5ead", new Object[]{this, str, str2, map, map2, map3, g1aVar, g1aVar2, u1aVar});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "version");
        d(str, str2, map, map2, map3, KSMTOPRequestMethod.POST, g1aVar, g1aVar2, u1aVar);
    }

    @Override // tb.thc
    public boolean f(l0g l0gVar) {
        List<String> d;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("150796e3", new Object[]{this, l0gVar})).booleanValue();
        }
        ckf.g(l0gVar, "r");
        return l0gVar.b() == null && (d = l0gVar.d()) != null && (str = (String) i04.c0(d)) != null && tsq.I(str, "SUCCESS", false, 2, null);
    }

    @Override // tb.thc
    public void d(final String str, final String str2, final Map<String, ? extends Object> map, final Map<String, ? extends Object> map2, final Map<String, ? extends Object> map3, final KSMTOPRequestMethod kSMTOPRequestMethod, final g1a<? super l0g, xhv> g1aVar, final g1a<? super l0g, xhv> g1aVar2, final u1a<? super l0g, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7edc69", new Object[]{this, str, str2, map, map2, map3, kSMTOPRequestMethod, g1aVar, g1aVar2, u1aVar});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "version");
        ckf.g(kSMTOPRequestMethod, "method");
        ath.INSTANCE.d(str, str2, new g1a() { // from class: tb.dqr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv g0;
                g1a g1aVar3 = g1aVar;
                u1a u1aVar2 = u1aVar;
                g0 = lqr.g0(map, map2, map3, kSMTOPRequestMethod, str, str2, this, g1aVar3, u1aVar2, g1aVar2, (fth) obj);
                return g0;
            }
        });
    }
}
