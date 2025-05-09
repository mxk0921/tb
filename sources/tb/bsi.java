package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.childpage.MetaChildPageView;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.list.MetaListPresenter;
import com.taobao.android.meta.structure.list.MetaListView;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int C;
    public zib D;
    public boolean F;
    public boolean I;
    public pg3 J;
    public boolean N;
    public final lsi<Boolean> O;
    public boolean P;
    public final lsi<Boolean> Q;

    /* renamed from: a  reason: collision with root package name */
    public int f16601a;
    public final lsi<Boolean> a0;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean d0;
    public ay4<w02, WidgetViewHolder<?, ?>> e;
    public lcc e0;
    public ay4<w02, WidgetViewHolder<?, ?>> f;
    public boolean g;
    public boolean g0;
    public ay4<gu1, ? extends pwc> h;
    public boolean h0;
    public ay4<gu1, ? extends tce> i;
    public ay4<bsi, ? extends nuc> j;
    public final lsi<Boolean> j0;
    public ay4<bsi, ? extends xtc> k;
    public ay4<MetaListWidget, ? extends hsi> l;
    public boolean l0;
    public boolean m;
    public Integer m0;
    public boolean n;
    public vee o;
    public ay4<Void, BaseListView.a> y;
    public final ay4<bsi, ? extends csi> p = new ay4() { // from class: tb.bez
        @Override // tb.ay4
        public final Object a(Object obj) {
            csi p1;
            p1 = bsi.p1((bsi) obj);
            return p1;
        }
    };
    public ay4<bsi, ? extends cuc> q = new ay4() { // from class: tb.cez
        @Override // tb.ay4
        public final Object a(Object obj) {
            MetaListPresenter q1;
            q1 = bsi.q1((bsi) obj);
            return q1;
        }
    };
    public ay4<bsi, ? extends euc> r = new ay4() { // from class: tb.dez
        @Override // tb.ay4
        public final Object a(Object obj) {
            MetaListView r1;
            r1 = bsi.r1((bsi) obj);
            return r1;
        }
    };
    public ay4<Context, ? extends PartnerRecyclerView> s = new ay4() { // from class: tb.eez
        @Override // tb.ay4
        public final Object a(Object obj) {
            PartnerRecyclerView t1;
            t1 = bsi.t1((Context) obj);
            return t1;
        }
    };
    public final ay4<x02, MetaListWidget> t = new ay4() { // from class: tb.fez
        @Override // tb.ay4
        public final Object a(Object obj) {
            MetaListWidget s1;
            s1 = bsi.s1(bsi.this, (x02) obj);
            return s1;
        }
    };
    public ay4<x02, ? extends MetaChildPageWidget> u = new ay4() { // from class: tb.gez
        @Override // tb.ay4
        public final Object a(Object obj) {
            MetaChildPageWidget o1;
            o1 = bsi.o1(bsi.this, (x02) obj);
            return o1;
        }
    };
    public final ay4<bsi, ? extends rtc> v = new ay4() { // from class: tb.hez
        @Override // tb.ay4
        public final Object a(Object obj) {
            yri m1;
            m1 = bsi.m1((bsi) obj);
            return m1;
        }
    };
    public final ay4<bsi, ? extends stc> w = new ay4() { // from class: tb.iez
        @Override // tb.ay4
        public final Object a(Object obj) {
            MetaChildPageView n1;
            n1 = bsi.n1((bsi) obj);
            return n1;
        }
    };
    public final lsi<Integer> x = new lsi<>(0, false);
    public ttc z = new my6();
    public int A = p1p.a(6.0f);
    public final lsi<Integer> B = new lsi<>(0, false);
    public final lsi<ouc> E = new lsi<>(null);
    public boolean G = true;
    public int H = 3;
    public final lsi<Integer> K = new lsi<>(0, false);
    public final lsi<guc> L = new lsi<>(null, true);
    public boolean M = true;
    public final lsi<Integer> R = new lsi<>(0, false);
    public final lsi<Integer> S = new lsi<>(0, false);
    public final lsi<Integer> T = new lsi<>(0, false);
    public final lsi<Integer> U = new lsi<>(0, false);
    public final lsi<Integer> V = new lsi<>(-1, false);
    public final lsi<Integer> W = new lsi<>(-1, false);
    public final lsi<Integer> X = new lsi<>(0, false);
    public final lsi<Integer> Y = new lsi<>(0, false);
    public final lsi<Integer> Z = new lsi<>(10, false);
    public final lsi<kuc> b0 = new lsi<>(null);
    public boolean c0 = true;
    public boolean f0 = true;
    public int i0 = p1p.a(10.0f);
    public final lsi<Integer> k0 = new lsi<>(0, false);

    static {
        t2o.a(993001478);
    }

    public bsi() {
        Boolean bool = Boolean.FALSE;
        this.O = new lsi<>(bool, false);
        this.Q = new lsi<>(bool, false);
        this.a0 = new lsi<>(bool);
        this.j0 = new lsi<>(bool, false);
    }

    public static final yri m1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yri) ipChange.ipc$dispatch("5b5f5a94", new Object[]{bsiVar});
        }
        ckf.d(bsiVar);
        return new yri(bsiVar);
    }

    public static final MetaChildPageView n1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageView) ipChange.ipc$dispatch("8f38ce83", new Object[]{bsiVar});
        }
        ckf.d(bsiVar);
        return new MetaChildPageView(bsiVar);
    }

    public static final MetaChildPageWidget o1(bsi bsiVar, x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("7d32bfc8", new Object[]{bsiVar, x02Var});
        }
        ckf.g(bsiVar, "this$0");
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        return new MetaChildPageWidget(activity, udeVar, bsiVar.K(x02Var), x02Var.d, x02Var.e);
    }

    public static final csi p1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (csi) ipChange.ipc$dispatch("4d48f88e", new Object[]{bsiVar});
        }
        return new csi();
    }

    public static final MetaListPresenter q1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaListPresenter) ipChange.ipc$dispatch("55276778", new Object[]{bsiVar});
        }
        ckf.d(bsiVar);
        return new MetaListPresenter(bsiVar);
    }

    public static final MetaListView r1(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaListView) ipChange.ipc$dispatch("3fcf8199", new Object[]{bsiVar});
        }
        ckf.d(bsiVar);
        return new MetaListView(bsiVar);
    }

    public static final MetaListWidget s1(bsi bsiVar, x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaListWidget) ipChange.ipc$dispatch("d960920a", new Object[]{bsiVar, x02Var});
        }
        ckf.g(bsiVar, "this$0");
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        return new MetaListWidget(activity, udeVar, bsiVar.K(x02Var), x02Var.d, x02Var.e);
    }

    public static final PartnerRecyclerView t1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PartnerRecyclerView) ipChange.ipc$dispatch("d4fdf96d", new Object[]{context});
        }
        return new PartnerRecyclerView(context);
    }

    public final lsi<Integer> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("9ce3e60c", new Object[]{this});
        }
        return this.W;
    }

    public final void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc12c23c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("722fee32", new Object[]{this})).intValue();
        }
        return this.f16601a;
    }

    public final void B0(lcc lccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384d0a06", new Object[]{this, lccVar});
        } else {
            this.e0 = lccVar;
        }
    }

    public final lsi<Integer> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("532981f8", new Object[]{this});
        }
        return this.S;
    }

    public final void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17b0bd7", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public final lsi<Integer> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("88abe0c8", new Object[]{this});
        }
        return this.R;
    }

    public final void D0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee587d3", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final ay4<MetaListWidget, ? extends hsi> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("e5bbe3c", new Object[]{this});
        }
        return this.l;
    }

    public final void E0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b810db07", new Object[]{this, new Boolean(z)});
        } else {
            this.l0 = z;
        }
    }

    public final ay4<bsi, ? extends cuc> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("6477390f", new Object[]{this});
        }
        return this.q;
    }

    public final void F0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22130c18", new Object[]{this, new Integer(i)});
        } else {
            this.f16601a = i;
        }
    }

    public final lsi<Integer> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("4aed6963", new Object[]{this});
        }
        return this.x;
    }

    public final void G0(ay4<MetaListWidget, ? extends hsi> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373384e", new Object[]{this, ay4Var});
        } else {
            this.l = ay4Var;
        }
    }

    public final ay4<bsi, ? extends euc> H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("c94fdd8a", new Object[]{this});
        }
        return this.r;
    }

    public final void H0(ay4<bsi, ? extends cuc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c74d843", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.q = ay4Var;
    }

    public final ay4<x02, MetaListWidget> I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("6a6af40b", new Object[]{this});
        }
        return this.t;
    }

    public final void I0(ay4<bsi, ? extends euc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44215c0", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.r = ay4Var;
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("681ae85b", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b172bad1", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final acx<com.taobao.android.meta.data.a<asi, MetaResult<asi>>> K(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("4c8650", new Object[]{this, x02Var});
        }
        ckf.g(x02Var, "pack");
        acx acxVar = x02Var.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        return acxVar;
    }

    public final void K0(ay4<w02, WidgetViewHolder<?, ?>> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e588c6e", new Object[]{this, ay4Var});
        } else {
            this.e = ay4Var;
        }
    }

    public final ay4<w02, WidgetViewHolder<?, ?>> L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("dd816d84", new Object[]{this});
        }
        return this.e;
    }

    public final void L0(ay4<gu1, ? extends pwc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4614118c", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.h = ay4Var;
    }

    public final ay4<gu1, ? extends pwc> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("52a9383e", new Object[]{this});
        }
        ay4<gu1, ? extends pwc> ay4Var = this.h;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("muiseMod");
        throw null;
    }

    public final void M0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39663a9f", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e1a3cd", new Object[]{this})).booleanValue();
        }
        return this.N;
    }

    public final void N0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76847e0", new Object[]{this, new Boolean(z)});
        } else {
            this.M = z;
        }
    }

    public final lsi<Boolean> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("eaffebef", new Object[]{this});
        }
        return this.Q;
    }

    public final void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5249958", new Object[]{this, new Integer(i)});
        } else {
            this.C = i;
        }
    }

    public final lsi<Boolean> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("66c55c7f", new Object[]{this});
        }
        return this.a0;
    }

    public final void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd23ea94", new Object[]{this, new Boolean(z)});
        } else {
            this.c0 = z;
        }
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503f4104", new Object[]{this})).booleanValue();
        }
        return this.M;
    }

    public final void Q0(vee veeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca379cb4", new Object[]{this, veeVar});
        } else {
            this.o = veeVar;
        }
    }

    public final lsi<guc> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("b2074e5b", new Object[]{this});
        }
        return this.L;
    }

    public final void R0(ay4<Context, ? extends PartnerRecyclerView> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e673a4e1", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.s = ay4Var;
    }

    public final Drawable S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bd98c660", new Object[]{this});
        }
        return null;
    }

    public final void S0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db220de3", new Object[]{this, new Boolean(z)});
        } else {
            this.f0 = z;
        }
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad13558a", new Object[]{this})).intValue();
        }
        return this.C;
    }

    public final void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e79c82a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final lsi<Boolean> U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("ee2b3510", new Object[]{this});
        }
        return this.O;
    }

    public final void U0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7167c32", new Object[]{this, new Integer(i)});
        } else {
            this.i0 = i;
        }
    }

    public final boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47733438", new Object[]{this})).booleanValue();
        }
        return this.c0;
    }

    public final void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d544f", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final vee W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vee) ipChange.ipc$dispatch("debd95ee", new Object[]{this});
        }
        return this.o;
    }

    public final void W0(ay4<bsi, ? extends nuc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406abeb4", new Object[]{this, ay4Var});
        } else {
            this.j = ay4Var;
        }
    }

    public final ay4<Context, ? extends PartnerRecyclerView> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("8ec54049", new Object[]{this});
        }
        return this.s;
    }

    public final void X0(ay4<Void, BaseListView.a> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f8735b", new Object[]{this, ay4Var});
        } else {
            this.y = ay4Var;
        }
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebcd4a1", new Object[]{this})).booleanValue();
        }
        return this.f0;
    }

    public final void Y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334f9da7", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc0e97a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void Z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b22f40", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e262a44c", new Object[]{this})).booleanValue();
        }
        return this.g0;
    }

    public final lsi<kuc> a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("1a0c3af2", new Object[]{this});
        }
        return this.b0;
    }

    public final void a1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3c8dac", new Object[]{this, new Integer(i)});
        } else {
            this.H = i;
        }
    }

    public final pg3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pg3) ipChange.ipc$dispatch("27584f15", new Object[]{this});
        }
        return this.J;
    }

    public final int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6399670", new Object[]{this})).intValue();
        }
        return this.i0;
    }

    public final void b1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ffc536", new Object[]{this, new Integer(i)});
        } else {
            this.A = i;
        }
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("75c73176", new Object[]{this});
        }
        return this.m0;
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9240411d", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public final void c1(ay4<w02, WidgetViewHolder<?, ?>> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9b8a60", new Object[]{this, ay4Var});
        } else {
            this.f = ay4Var;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a3f303", new Object[]{this})).booleanValue();
        }
        return this.d0;
    }

    public final lsi<Integer> d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("56fcecc3", new Object[]{this});
        }
        return this.K;
    }

    public final void d1(ay4<gu1, ? extends tce> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73608d5a", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.i = ay4Var;
    }

    public final ay4<bsi, ? extends rtc> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("abc3e710", new Object[]{this});
        }
        return this.v;
    }

    public final ay4<bsi, ? extends nuc> e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("39b44616", new Object[]{this});
        }
        return this.j;
    }

    public final ay4<bsi, ? extends stc> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("53dcb2e9", new Object[]{this});
        }
        return this.w;
    }

    public final lsi<Boolean> f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("781e0c90", new Object[]{this});
        }
        return this.j0;
    }

    public final ay4<x02, ? extends MetaChildPageWidget> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("8517edaa", new Object[]{this});
        }
        return this.u;
    }

    public final ay4<Void, BaseListView.a> g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("1207daf7", new Object[]{this});
        }
        return this.y;
    }

    public final ttc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ttc) ipChange.ipc$dispatch("9dda99c7", new Object[]{this});
        }
        return this.z;
    }

    public final lsi<ouc> h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("e49fe273", new Object[]{this});
        }
        return this.E;
    }

    public final lsi<Integer> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("9141e3f3", new Object[]{this});
        }
        return this.k0;
    }

    public final lsi<Integer> i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("698b4c4c", new Object[]{this});
        }
        return this.Z;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48c589cb", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54c2965d", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61d0660a", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d60dfa4", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d9716d9", new Object[]{this})).booleanValue();
        }
        return this.h0;
    }

    public final int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("882513b6", new Object[]{this})).intValue();
        }
        return this.H;
    }

    public final ay4<bsi, ? extends csi> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("872a608", new Object[]{this});
        }
        return this.p;
    }

    public final int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8878654", new Object[]{this})).intValue();
        }
        return this.A;
    }

    public final ay4<bsi, ? extends xtc> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("6a4078f1", new Object[]{this});
        }
        ay4<bsi, ? extends xtc> ay4Var = this.k;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("footStateView");
        throw null;
    }

    public final ay4<w02, WidgetViewHolder<?, ?>> n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("5da554ea", new Object[]{this});
        }
        return this.f;
    }

    public final zib o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zib) ipChange.ipc$dispatch("5335a2c1", new Object[]{this});
        }
        return this.D;
    }

    public final ay4<gu1, ? extends tce> o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("8857cc18", new Object[]{this});
        }
        ay4<gu1, ? extends tce> ay4Var = this.i;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("weexMod");
        throw null;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf5a428", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c93100", new Object[]{this, new Boolean(z)});
        } else {
            this.g0 = z;
        }
    }

    public final lcc q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcc) ipChange.ipc$dispatch("a35ce388", new Object[]{this});
        }
        return this.e0;
    }

    public final void q0(pg3 pg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a92fce7", new Object[]{this, pg3Var});
        } else {
            this.J = pg3Var;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d1cb95", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public final void r0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab22f57c", new Object[]{this, num});
        } else {
            this.m0 = num;
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d67a10b1", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91fdf29", new Object[]{this, new Boolean(z)});
        } else {
            this.d0 = z;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9bbc5fd", new Object[]{this})).booleanValue();
        }
        return this.l0;
    }

    public final void t0(ay4<x02, ? extends MetaChildPageWidget> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b5ea08", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.u = ay4Var;
    }

    public final lsi<Integer> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("89782871", new Object[]{this});
        }
        return this.B;
    }

    public final void u0(ttc ttcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcc58cb", new Object[]{this, ttcVar});
            return;
        }
        ckf.g(ttcVar, "<set-?>");
        this.z = ttcVar;
    }

    public final lsi<Integer> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("998c4e5d", new Object[]{this});
        }
        return this.Y;
    }

    public final void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fff1461", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final lsi<Integer> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("6b69f683", new Object[]{this});
        }
        return this.X;
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0551902", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final lsi<Integer> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("af80e22b", new Object[]{this});
        }
        return this.U;
    }

    public final void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f18cf13", new Object[]{this, new Boolean(z)});
        } else {
            this.h0 = z;
        }
    }

    public final lsi<Integer> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("ebbca575", new Object[]{this});
        }
        return this.T;
    }

    public final void y0(ay4<bsi, ? extends xtc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd394a1", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.k = ay4Var;
    }

    public final lsi<Integer> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsi) ipChange.ipc$dispatch("44a8c125", new Object[]{this});
        }
        return this.V;
    }

    public final void z0(zib zibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b486602f", new Object[]{this, zibVar});
        } else {
            this.D = zibVar;
        }
    }
}
