package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rhj extends frh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rhj H;
    public boolean I;
    public rhj O;
    public boolean S;
    public boolean U;
    public String V;
    public JSONObject W;
    public JSONObject X;
    public int Z;
    public int a0;
    public String b0;
    public String c0;
    public Boolean d0;
    public final List<BaseCellBean> J = new ArrayList(1);
    public final List<BaseCellBean> K = new ArrayList(1);
    public final List<BaseCellBean> L = new ArrayList(1);
    public final List<BaseCellBean> M = new ArrayList(1);
    public final List<BaseCellBean> N = new ArrayList();
    public boolean P = true;
    public int Q = -1;
    public boolean R = true;
    public boolean T = true;
    public final HashMap<String, Object> Y = new HashMap<>();
    public int e0 = -1;

    static {
        t2o.a(815792901);
    }

    public static /* synthetic */ Object ipc$super(rhj rhjVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 111541155:
                super.L((osi) objArr[0]);
                return null;
            case 151050901:
                super.e();
                return null;
            case 2022597206:
                super.D();
                return null;
            case 2077600179:
                super.x((asi) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/ns/NSCombo");
        }
    }

    public final int A1(int i, List<? extends BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c52380d3", new Object[]{this, new Integer(i), list})).intValue();
        }
        for (BaseCellBean baseCellBean : list) {
            baseCellBean.comboIndex = i;
            i++;
        }
        return i;
    }

    @Override // tb.asi
    public void B(BaseCellBean baseCellBean, BaseCellBean baseCellBean2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542cc80a", new Object[]{this, baseCellBean, baseCellBean2});
            return;
        }
        ckf.g(baseCellBean2, "newBean");
        ((ArrayList) this.N).set(i04.f0(this.N, baseCellBean), baseCellBean2);
        baseCellBean2.combo = this;
        if (m() || baseCellBean2.isSection) {
            z = true;
        }
        K(z);
        H(true);
    }

    public final void B1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4482d7ad", new Object[]{this});
            return;
        }
        rhj rhjVar = this.H;
        if (rhjVar != null) {
            this.U = true;
            J(rhjVar.l());
            T().page = rhjVar.T().page;
            T().rn = rhjVar.T().rn;
            T().totalPage = rhjVar.T().totalPage;
            T().totalResult = rhjVar.T().totalResult;
            T().pageTraceArgs = rhjVar.T().pageTraceArgs;
            T().style = rhjVar.T().style;
            N(rhjVar.p());
            P(rhjVar.s());
            if (s() == MetaState.UPDATING) {
                z = true;
            }
            this.S = z;
            ((ArrayList) this.J).clear();
            ((ArrayList) this.K).clear();
            ((ArrayList) this.L).clear();
            ((ArrayList) this.M).clear();
            ((ArrayList) this.N).clear();
            H0(rhjVar.J, this.J);
            H0(rhjVar.K, this.K);
            H0(rhjVar.L, this.L);
            H0(rhjVar.M, this.M);
            H0(rhjVar.N, this.N);
            o0().clear();
            o0().putAll(rhjVar.o0());
            r().copy(rhjVar.r());
            rhj rhjVar2 = rhjVar.O;
            if (rhjVar2 != null) {
                x(rhjVar2);
            }
        }
    }

    @Override // tb.frh, tb.y64, tb.asi
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.D();
        this.c0 = null;
        this.b0 = null;
        this.Z = 0;
        this.a0 = 0;
        J(null);
    }

    public final void E1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779966b", new Object[]{this, new Boolean(z)});
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        c(this.J);
        c(this.K);
        c(this.M);
        c(this.N);
        c(this.L);
    }

    public final rhj G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhj) ipChange.ipc$dispatch("4d42635", new Object[]{this});
        }
        rhj rhjVar = new rhj();
        rhjVar.H = this;
        rhjVar.T().pageTraceArgs = T().pageTraceArgs;
        rhjVar.T().pageTraceName = T().pageTraceName;
        rhjVar.T().pageName = T().pageName;
        rhjVar.N(p());
        rhjVar.F(h());
        rhjVar.I = this.I;
        rhjVar.V = this.V;
        JSONObject jSONObject = null;
        rhjVar.J(null);
        JSONObject jSONObject2 = this.W;
        if (jSONObject2 != null) {
            jSONObject = new JSONObject();
            jSONObject.putAll(jSONObject2);
        }
        rhjVar.W = jSONObject;
        return rhjVar;
    }

    public final void H0(List<? extends BaseCellBean> list, List<BaseCellBean> list2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64be034", new Object[]{this, list, list2});
            return;
        }
        for (BaseCellBean baseCellBean : list) {
            BaseCellBean copy = baseCellBean.copy();
            copy.combo = this;
            list2.add(copy);
            if (m() || baseCellBean.isSection) {
                z = true;
            } else {
                z = false;
            }
            K(z);
        }
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6a4b6a", new Object[]{this});
            return;
        }
        this.T = false;
        H(true);
    }

    public final String J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.V;
    }

    public final boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fec35e20", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    @Override // tb.asi
    public void L(osi<asi> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a5fba3", new Object[]{this, osiVar});
        } else if (osiVar != null) {
            Map<String, String> n = osiVar.n();
            if (!ckf.b(n != null ? n.get("searchType") : null, "preload")) {
                super.L(osiVar);
            }
        }
    }

    public final boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cefdd5c", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public final HashMap<String, Object> M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ec945742", new Object[]{this});
        }
        return this.Y;
    }

    public final List<BaseCellBean> N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4552b70", new Object[]{this});
        }
        return this.K;
    }

    public final List<BaseCellBean> O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7af3506d", new Object[]{this});
        }
        return this.L;
    }

    public final List<BaseCellBean> P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("34324a3b", new Object[]{this});
        }
        return this.J;
    }

    public final boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81fd7559", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    @Override // tb.frh, tb.y64, tb.asi
    public void R(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512668c4", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        rhj rhjVar = (rhj) asiVar;
        q0(asiVar);
        X(rhjVar.T());
        this.Z = rhjVar.Z;
        this.a0 = rhjVar.a0;
        this.b0 = rhjVar.b0;
        this.c0 = rhjVar.c0;
        ((ArrayList) this.N).clear();
        ((ArrayList) this.N).addAll(rhjVar.N);
        J(asiVar.l());
        ((ArrayList) this.M).clear();
        ((ArrayList) this.M).addAll(rhjVar.M);
        this.R = true;
        this.P = true;
        H(true);
        q0(asiVar);
    }

    public final JSONObject R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("931140a9", new Object[]{this});
        }
        return this.X;
    }

    @Override // tb.y64
    public void S(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f564d36", new Object[]{this, baseCellBean});
            return;
        }
        ckf.g(baseCellBean, WXBasicComponentType.CELL);
        ((ArrayList) this.N).clear();
        ((ArrayList) this.N).add(baseCellBean);
        baseCellBean.combo = this;
        H(true);
    }

    public final int S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.a0;
    }

    public final String T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad0b7ea", new Object[]{this});
        }
        return this.b0;
    }

    public final List<BaseCellBean> U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a0d5f9ce", new Object[]{this});
        }
        return this.M;
    }

    public final List<BaseCellBean> V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7729054", new Object[]{this});
        }
        return this.N;
    }

    public final int W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5328eb3", new Object[]{this})).intValue();
        }
        return this.Z;
    }

    public final String X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc80f957", new Object[]{this});
        }
        return this.c0;
    }

    public final JSONObject Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e68ff7a", new Object[]{this});
        }
        return this.W;
    }

    public final rhj Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhj) ipChange.ipc$dispatch("2c7cd14e", new Object[]{this});
        }
        return this.H;
    }

    public final int b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c768976", new Object[]{this})).intValue();
        }
        rhj rhjVar = this.O;
        if (rhjVar == null) {
            return 0;
        }
        ckf.d(rhjVar);
        return ((ArrayList) rhjVar.N).size();
    }

    public final Boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("14b15cf", new Object[]{this});
        }
        return this.d0;
    }

    public final int d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13749ead", new Object[]{this})).intValue();
        }
        return this.e0;
    }

    @Override // tb.asi
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900da95", new Object[]{this});
            return;
        }
        t().clear();
        int A1 = A1(0, this.J);
        c(this.J);
        int A12 = A1(A1, this.K);
        c(this.K);
        A1(A12, this.M);
        c(this.M);
        A1(0, this.N);
        c(this.N);
        if (w() && this.H == null) {
            A1(0, this.L);
            c(this.L);
        }
        super.e();
    }

    public final boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b689ada6", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public final boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b7a8557", new Object[]{this})).booleanValue();
        }
        if (l() != null) {
            Boolean l = l();
            ckf.d(l);
            if (l.booleanValue()) {
                return true;
            }
        }
        if (T().page >= T().totalPage) {
            return true;
        }
        return false;
    }

    public final boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3521433b", new Object[]{this})).booleanValue();
        }
        return this.R;
    }

    public final void h1(rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe36678", new Object[]{this, rhjVar});
            return;
        }
        ckf.g(rhjVar, "combo");
        ((ArrayList) this.J).clear();
        ((ArrayList) this.L).clear();
        ((ArrayList) this.J).addAll(rhjVar.J);
        ((ArrayList) this.L).addAll(rhjVar.L);
    }

    public final void i1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ba29", new Object[]{this, new Boolean(z)});
        }
    }

    public final void j1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d0b7fc", new Object[]{this, new Integer(i)});
        } else {
            this.Q = i;
        }
    }

    public final void k1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.V = str;
        }
    }

    public final void l1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c65f0", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public final void m1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4888193", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public final void o1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a18e93", new Object[]{this, jSONObject});
        } else {
            this.X = jSONObject;
        }
    }

    public final void p1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else {
            this.a0 = i;
        }
    }

    public final void q1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5649ce34", new Object[]{this, str});
        } else {
            this.b0 = str;
        }
    }

    public final void r1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f622b7", new Object[]{this, new Integer(i)});
        } else {
            this.Z = i;
        }
    }

    public final void s1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63481eff", new Object[]{this, str});
        } else {
            this.c0 = str;
        }
    }

    public final void t1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e084a", new Object[]{this, jSONObject});
        } else {
            this.W = jSONObject;
        }
    }

    @Override // tb.y64, tb.asi
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2b2258a", new Object[]{this})).booleanValue();
        }
        if (this.N.isEmpty() || (((ArrayList) this.N).get(0) instanceof SrpStateCell)) {
            return false;
        }
        return true;
    }

    public final void u1(rhj rhjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a163e5bb", new Object[]{this, rhjVar});
        } else {
            this.O = rhjVar;
        }
    }

    @Override // tb.y64, tb.asi
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        if (!this.T) {
            return true;
        }
        if (this.U) {
            return false;
        }
        if (l() != null) {
            Boolean l = l();
            ckf.d(l);
            if (l.booleanValue()) {
                return true;
            }
        }
        if (this.H == null) {
            int i = this.Q;
            if (i <= 0) {
                return true;
            }
            int i2 = T().totalPage;
            if (1 <= i2 && i2 < i) {
                i = T().totalPage;
            }
            if (T().page >= i) {
                return true;
            }
            return false;
        } else if (T().page >= T().totalPage) {
            return true;
        } else {
            return false;
        }
    }

    public final void w1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eea83b5", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    @Override // tb.y64, tb.asi
    public void x(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd5a9b3", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        super.x(asiVar);
        rhj rhjVar = (rhj) asiVar;
        this.U = false;
        ((ArrayList) this.N).addAll(rhjVar.N);
        this.Z += rhjVar.Z;
        this.a0 += rhjVar.a0;
        this.b0 = rhjVar.b0;
        this.c0 = rhjVar.c0;
        q0(asiVar);
    }

    public final void x1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4159faf", new Object[]{this, bool});
        } else {
            this.d0 = bool;
        }
    }

    public final void y1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf611fd", new Object[]{this, new Integer(i)});
        } else {
            this.e0 = i;
        }
    }

    public final void z1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabf6be6", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }
}
