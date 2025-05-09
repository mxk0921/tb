package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oyk extends m2g<f3d, xyk, cyk, s2l, hyk, x1l, fyk, kzk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public n1l j;
    public eyk k;
    public uxk l;

    static {
        t2o.a(1004536511);
    }

    public oyk(fyk fykVar) {
        super(fykVar);
    }

    public static final xyk G(oyk oykVar, hic hicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xyk) ipChange.ipc$dispatch("1bede225", new Object[]{oykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        return new xyk(oykVar.g());
    }

    public static final cyk H(oyk oykVar, hic hicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyk) ipChange.ipc$dispatch("b99d5b1e", new Object[]{oykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        return new cyk(oykVar.g());
    }

    public static final hyk I(oyk oykVar, hic hicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyk) ipChange.ipc$dispatch("530cd834", new Object[]{oykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        return new hyk(oykVar.g());
    }

    public static final x1l J(oyk oykVar, hic hicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x1l) ipChange.ipc$dispatch("afc18f24", new Object[]{oykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        return new x1l(oykVar.g());
    }

    public static final s2l K(oyk oykVar, hic hicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2l) ipChange.ipc$dispatch("50a1239b", new Object[]{oykVar, hicVar});
        }
        ckf.g(hicVar, AdvanceSetting.NETWORK_TYPE);
        return new s2l(oykVar.g());
    }

    public static /* synthetic */ Object ipc$super(oyk oykVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683216384) {
            super.y();
            return null;
        } else if (hashCode == 2024047597) {
            super.f();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kmp/nexus/arch/openArch/entity/OpenArchEntity");
        }
    }

    public Map<s2g, mic<kzk>> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("564c3c39", new Object[]{this});
        }
        return new LinkedHashMap();
    }

    public final void F() {
        xyk xykVar;
        cyk cykVar;
        hyk hykVar;
        x1l x1lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c653e368", new Object[]{this});
            return;
        }
        fyk g = g();
        s2l s2lVar = null;
        if (g != null) {
            xykVar = (xyk) g.g(new g1a() { // from class: tb.jyk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xyk G;
                    G = oyk.G(oyk.this, (hic) obj);
                    return G;
                }
            });
        } else {
            xykVar = null;
        }
        if (xykVar != null) {
            xykVar.b();
        }
        u(xykVar);
        fyk g2 = g();
        if (g2 != null) {
            cykVar = (cyk) g2.a(new g1a() { // from class: tb.kyk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    cyk H;
                    H = oyk.H(oyk.this, (hic) obj);
                    return H;
                }
            });
        } else {
            cykVar = null;
        }
        if (cykVar != null) {
            cykVar.b();
        }
        q(cykVar);
        fyk g3 = g();
        if (g3 != null) {
            hykVar = (hyk) g3.b(new g1a() { // from class: tb.lyk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    hyk I;
                    I = oyk.I(oyk.this, (hic) obj);
                    return I;
                }
            });
        } else {
            hykVar = null;
        }
        if (hykVar != null) {
            hykVar.b();
        }
        t(hykVar);
        fyk g4 = g();
        if (g4 != null) {
            x1lVar = (x1l) g4.h(new g1a() { // from class: tb.myk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    x1l J;
                    J = oyk.J(oyk.this, (hic) obj);
                    return J;
                }
            });
        } else {
            x1lVar = null;
        }
        if (x1lVar != null) {
            x1lVar.b();
        }
        w(x1lVar);
        fyk g5 = g();
        if (g5 != null) {
            s2lVar = (s2l) g5.j(new g1a() { // from class: tb.nyk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    s2l K;
                    K = oyk.K(oyk.this, (hic) obj);
                    return K;
                }
            });
        }
        if (s2lVar != null) {
            s2lVar.j(E());
        }
        if (s2lVar != null) {
            s2lVar.b();
        }
        x(s2lVar);
        this.j = new n1l(g());
        this.k = new eyk(g());
        this.l = new uxk(g());
    }

    public final uxk L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uxk) ipChange.ipc$dispatch("75d874be", new Object[]{this});
        }
        return this.l;
    }

    public final eyk M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyk) ipChange.ipc$dispatch("5765b182", new Object[]{this});
        }
        return this.k;
    }

    public final n1l N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1l) ipChange.ipc$dispatch("e729dda2", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.m2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        xyk j = j();
        if (j != null) {
            j.e(toy.Companion.c(), q2g.Companion.a("OpenArch_WhenInstanceWillRelease"), null);
        }
        super.f();
        n1l n1lVar = this.j;
        if (n1lVar != null) {
            n1lVar.f();
        }
        eyk eykVar = this.k;
        if (eykVar != null) {
            eykVar.f();
        }
        uxk uxkVar = this.l;
        if (uxkVar != null) {
            uxkVar.f();
        }
    }

    @Override // tb.m2g
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
            return;
        }
        super.y();
        F();
    }
}
