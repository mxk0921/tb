package tb;

import android.app.Activity;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class neq extends bsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ay4<x02, ? extends kae<?, ?>> n0;
    public ay4<gu1, ? extends pwc> o0;
    public ay4<gu1, ? extends tce> p0;
    public ay4<Activity, ? extends duc> q0;
    public boolean s0;
    public String u0;
    public boolean r0 = true;
    public final boolean t0 = true;

    static {
        t2o.a(993001499);
    }

    public neq() {
        t0(new ay4() { // from class: tb.moz
            @Override // tb.ay4
            public final Object a(Object obj) {
                meq v1;
                v1 = neq.v1(neq.this, (x02) obj);
                return v1;
            }
        });
        N0(false);
    }

    public static /* synthetic */ Object ipc$super(neq neqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/srp/SrpConfig");
    }

    public static final meq v1(neq neqVar, x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (meq) ipChange.ipc$dispatch("5b677c43", new Object[]{neqVar, x02Var});
        }
        ckf.g(neqVar, "this$0");
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        return new meq(activity, udeVar, neqVar.K(x02Var), x02Var.d, x02Var.e);
    }

    public final boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37fb5352", new Object[]{this})).booleanValue();
        }
        return this.r0;
    }

    public final ay4<Activity, ? extends duc> g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("97099d21", new Object[]{this});
        }
        ay4<Activity, ? extends duc> ay4Var = this.q0;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("listStateView");
        throw null;
    }

    public final String h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("caa75972", new Object[]{this});
        }
        return this.u0;
    }

    public final ay4<gu1, ? extends pwc> i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("b5e218be", new Object[]{this});
        }
        ay4<gu1, ? extends pwc> ay4Var = this.o0;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("sceneMuiseMod");
        throw null;
    }

    public final ay4<gu1, ? extends tce> j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("6240db98", new Object[]{this});
        }
        ay4<gu1, ? extends tce> ay4Var = this.p0;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("sceneWeexMod");
        throw null;
    }

    public final ay4<x02, ? extends kae<?, ?>> k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("c224894e", new Object[]{this});
        }
        ay4<x02, ? extends kae<?, ?>> ay4Var = this.n0;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y(u3b.UI_MODULE_SEARCH_BAR);
        throw null;
    }

    public final boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46d9cd05", new Object[]{this})).booleanValue();
        }
        return this.s0;
    }

    public final boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d98ec1b7", new Object[]{this})).booleanValue();
        }
        return this.t0;
    }

    public final void n1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305d5ba", new Object[]{this, new Boolean(z)});
        } else {
            this.r0 = z;
        }
    }

    public final void o1(ay4<Activity, ? extends duc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2ef671", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.q0 = ay4Var;
    }

    public final void p1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446ba9ac", new Object[]{this, str});
        } else {
            this.u0 = str;
        }
    }

    public final void q1(ay4<gu1, ? extends pwc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1865ee74", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.o0 = ay4Var;
    }

    public final void r1(ay4<gu1, ? extends tce> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826b7372", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.p0 = ay4Var;
    }

    public final void s1(ay4<x02, ? extends kae<?, ?>> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce18e9e4", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.n0 = ay4Var;
    }

    public final void t1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442d4eff", new Object[]{this, new Boolean(z)});
        } else {
            this.s0 = z;
        }
    }
}
