package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder;
import com.taobao.search.musie.RcmdMuiseViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class o6p extends box {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792298);
    }

    public o6p(yko ykoVar) {
        ckf.g(ykoVar, "core");
        K0(new ay4() { // from class: tb.inz
            @Override // tb.ay4
            public final Object a(Object obj) {
                WidgetViewHolder I1;
                I1 = o6p.I1((w02) obj);
                return I1;
            }
        });
        c1(new ay4() { // from class: tb.jnz
            @Override // tb.ay4
            public final Object a(Object obj) {
                WidgetViewHolder J1;
                J1 = o6p.J1((w02) obj);
                return J1;
            }
        });
        L0(new ay4() { // from class: tb.knz
            @Override // tb.ay4
            public final Object a(Object obj) {
                vin K1;
                K1 = o6p.K1((gu1) obj);
                return K1;
            }
        });
        d1(new ay4() { // from class: tb.lnz
            @Override // tb.ay4
            public final Object a(Object obj) {
                b7x L1;
                L1 = o6p.L1((gu1) obj);
                return L1;
            }
        });
        y0(new ay4() { // from class: tb.mnz
            @Override // tb.ay4
            public final Object a(Object obj) {
                eox M1;
                M1 = o6p.M1((bsi) obj);
                return M1;
            }
        });
        W0(new ay4() { // from class: tb.nnz
            @Override // tb.ay4
            public final Object a(Object obj) {
                qox N1;
                N1 = o6p.N1((bsi) obj);
                return N1;
            }
        });
        p0(o4p.n0());
    }

    public static final WidgetViewHolder I1(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("b9a1a191", new Object[]{w02Var});
        }
        return new RcmdMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
    }

    public static final WidgetViewHolder J1(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("923293b0", new Object[]{w02Var});
        }
        return new BaseSrpListWeexCellViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
    }

    public static final vin K1(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vin) ipChange.ipc$dispatch("59dc78cf", new Object[]{gu1Var});
        }
        return new vin(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
    }

    public static final b7x L1(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b7x) ipChange.ipc$dispatch("237f8918", new Object[]{gu1Var});
        }
        return new b7x(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
    }

    public static final eox M1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eox) ipChange.ipc$dispatch("8747dfd4", new Object[]{bsiVar});
        }
        return new eox();
    }

    public static final qox N1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qox) ipChange.ipc$dispatch("fa1f20eb", new Object[]{bsiVar});
        }
        return new qox();
    }

    public static /* synthetic */ Object ipc$super(o6p o6pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/SearchXslConfig");
    }
}
