package tb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.pop.PopPositionData;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.schedule.ViewProxy;
import java.util.List;
import tb.d0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class uq9 implements ulb, tsd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String x = "FluidCard";
    private static final int y = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f29555a;
    public final m83 b;
    public final n83 c;
    public final xq9 d;
    public final vh8 e;
    public final ihf f;
    private final w3q g = new w3q(this);
    public final ICardService h;
    private final ITrackService i;
    private final ILifecycleService j;
    private final IQuickOpenService k;
    private final IDataService l;
    private final IUsePreloadService m;
    private final IFeedsListService n;
    public Context o;
    public View p;
    public RecyclerViewHolder q;
    public com.taobao.android.fluid.framework.data.datamodel.a r;
    public a.d s;
    public boolean t;
    public String u;
    public u73 v;
    public iim w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends d0c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1387239154) {
                super.g(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/FluidCard$1");
        }

        @Override // tb.d0c.a, tb.d0c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
                return;
            }
            ir9.b(uq9.x, uq9.this.X() + " onLongClickCancel");
            uq9.this.c.c();
        }

        @Override // tb.d0c.a, tb.d0c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
                return;
            }
            ir9.b(uq9.x, uq9.this.X() + " onPendingClick");
            uq9.x(uq9.this).setAutoLock(true);
            uq9.this.h.getConfig().B(true);
            uq9.this.c.d();
        }

        @Override // tb.d0c.a, tb.d0c
        public boolean e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            ir9.b(uq9.x, uq9.this.X() + " onLongClick isScreenEdge = " + z);
            uq9.this.c.e(z);
            return true;
        }

        @Override // tb.d0c.a, tb.d0c
        public void f(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            ir9.b(uq9.x, uq9.this.X() + " onDoubleClick x,y = " + f + "," + f2);
            uq9.this.h.getConfig().B(false);
            uq9.x(uq9.this).setAutoLock(false);
            uq9.this.c.f(f, f2);
            if (!pto.h(uq9.this.f29555a)) {
                xau.m(uq9.F(uq9.this).getActiveCardCommonTrack());
            }
        }

        @Override // tb.d0c.a, tb.d0c
        public void g(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            super.g(f, f2);
            ir9.b(uq9.x, uq9.this.X() + " onTripleClick x,y = " + f + "," + f2);
            uq9.this.c.g(f, f2);
        }

        @Override // tb.d0c.a, tb.d0c
        public void h(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            ir9.b(uq9.x, uq9.this.X() + " onSingleClick x,y = " + f + "," + f2);
            uq9.x(uq9.this).setAutoLock(false);
            uq9.this.h.getConfig().B(false);
            uq9.this.c.h(f, f2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                uq9.this.n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    static {
        t2o.a(468713895);
        t2o.a(468713898);
        t2o.a(336592972);
    }

    public uq9(FluidContext fluidContext) {
        this.f29555a = fluidContext;
        this.j = (ILifecycleService) fluidContext.getService(ILifecycleService.class);
        this.i = (ITrackService) fluidContext.getService(ITrackService.class);
        this.h = (ICardService) fluidContext.getService(ICardService.class);
        this.k = (IQuickOpenService) fluidContext.getService(IQuickOpenService.class);
        this.m = (IUsePreloadService) fluidContext.getService(IUsePreloadService.class);
        this.n = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        this.l = (IDataService) fluidContext.getService(IDataService.class);
        this.b = new m83(fluidContext);
        this.c = new n83(fluidContext);
        this.d = new xq9(fluidContext, this);
        this.e = new vh8(fluidContext, this);
        this.f = new ihf(fluidContext, this);
        u0();
    }

    public static /* synthetic */ ITrackService F(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrackService) ipChange.ipc$dispatch("776bf04d", new Object[]{uq9Var});
        }
        return uq9Var.i;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a3f7c7", new Object[]{this});
            return;
        }
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.f29555a.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            a.d dVar = this.s;
            if (dVar == null || dVar.g() == null || !this.s.g().enableShareUpdate) {
                ir9.b(x, X() + "checkUpdateShareButton resetShareButtonIcon...");
                tab2ServiceDelegate.a();
                return;
            }
            ir9.b(x, X() + "checkUpdateShareButton updateShareButtonIcon...");
            tab2ServiceDelegate.b(this.s.g().shareIconUrl);
        }
    }

    private void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cebb89", new Object[]{this});
            return;
        }
        ct7 ct7Var = new ct7(new a());
        this.p.setTag(ct7Var);
        ViewProxy.setOnClickListener(this.p, ct7Var);
    }

    private com.taobao.android.fluid.framework.data.datamodel.pop.a t0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.pop.a) ipChange.ipc$dispatch("f8e21f82", new Object[]{this, jSONObject});
        }
        return new com.taobao.android.fluid.framework.data.datamodel.pop.a((PopPositionData) JSON.toJavaObject(jSONObject, PopPositionData.class));
    }

    private void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da50f0e2", new Object[]{this});
        } else {
            this.j.addPageLifecycleListener(this);
        }
    }

    public static /* synthetic */ IFeedsListService x(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFeedsListService) ipChange.ipc$dispatch("abe3a716", new Object[]{uq9Var});
        }
        return uq9Var.n;
    }

    @Override // tb.ulb
    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f31f3b", new Object[]{this})).intValue();
        }
        return M();
    }

    @Override // tb.tsd
    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
        } else {
            r0(str, t0(jSONObject));
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68be3b11", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.v == null) {
            u73 u73Var = new u73(this);
            this.v = u73Var;
            u73Var.a(new b());
        }
        u73 u73Var2 = this.v;
        if (u73Var2 != null) {
            u73Var2.b(z);
            ir9.b(x, "doAlphaAnimation, setTransparent = " + z);
            return;
        }
        ir9.b(x, "doAlphaAnimation, animator is null ");
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64efb6dc", new Object[]{this})).intValue();
        }
        RecyclerViewHolder f0 = f0();
        if (f0 != null) {
            return f0.getAdapterPosition();
        }
        return -1;
    }

    public m83 N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m83) ipChange.ipc$dispatch("6824012b", new Object[]{this});
        }
        return this.b;
    }

    public n83 O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n83) ipChange.ipc$dispatch("c67690cf", new Object[]{this});
        }
        return this.c;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.u;
    }

    public ViewGroup Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bfcb2c41", new Object[]{this});
        }
        return (ViewGroup) this.p;
    }

    public Context R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.o;
    }

    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f5131d", new Object[]{this});
        }
        return null;
    }

    @Override // tb.tsd
    public void S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
        } else {
            q0(t0(jSONObject));
        }
    }

    public xq9 T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq9) ipChange.ipc$dispatch("baf02f70", new Object[]{this});
        }
        return this.d;
    }

    public FluidContext U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("19e58b06", new Object[]{this});
        }
        return this.f29555a;
    }

    public ihf V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihf) ipChange.ipc$dispatch("338abac7", new Object[]{this});
        }
        return this.f;
    }

    public View W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e6cee057", new Object[]{this});
        }
        return this.p;
    }

    public String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbcebeb0", new Object[]{this});
        }
        return "[" + this.f29555a.getInstanceId() + "_第" + A() + "卡_" + y() + "_" + this.u + "] ";
    }

    public a.d Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("fadee65a", new Object[]{this});
        }
        return this.s;
    }

    public com.taobao.android.fluid.framework.data.datamodel.a Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("3ad1816c", new Object[]{this});
        }
        return this.r;
    }

    public int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe047e5f", new Object[]{this})).intValue();
        }
        return this.r.k;
    }

    public String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return this.s.c;
    }

    public w3q c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3q) ipChange.ipc$dispatch("4ae6a1f4", new Object[]{this});
        }
        return this.g;
    }

    public tzv d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzv) ipChange.ipc$dispatch("621f78a1", new Object[]{this});
        }
        if (Z() != null) {
            return Z().n();
        }
        return null;
    }

    public int e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6188449", new Object[]{this})).intValue();
        }
        return this.r.l;
    }

    public RecyclerViewHolder f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("b26bcd3e", new Object[]{this});
        }
        return this.q;
    }

    public int g0() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a027fe4", new Object[]{this})).intValue();
        }
        View view = this.p;
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            while (i < childCount) {
                if (((ViewGroup) this.p).getChildAt(i) instanceof DWPenetrateFrameLayout) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        ir9.b(x, "getWeexIndexInLayout:" + i);
        return i;
    }

    public final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return this.q.f7861a.j();
    }

    @Override // tb.ulb
    public View i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("56c836dd", new Object[]{this, viewGroup});
        }
        return LayoutInflater.from(viewGroup.getContext()).inflate(D(), viewGroup, false);
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        return this.q.f7861a.k();
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f65758", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee72d561", new Object[]{this})).booleanValue();
        }
        if (A() == 0) {
            return true;
        }
        return false;
    }

    public final void m0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd334ce", new Object[]{this, view});
            return;
        }
        if (view != null) {
            s0j.B(view);
        }
        View view2 = this.p;
        if (view2 != view) {
            s0j.B(view2);
        }
    }

    public void n0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63839c61", new Object[]{this, new Float(f)});
            return;
        }
        ihf ihfVar = this.f;
        if (ihfVar != null && ihfVar.R() != null) {
            this.f.R().F(f);
        }
    }

    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c09d33", new Object[]{this});
        }
    }

    @Override // tb.ulb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onAppear 回调方法");
        this.b.onAppear(this);
        this.h.onAppear(this);
    }

    @Override // tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        this.r = aVar;
        a.d e = aVar.e();
        this.s = e;
        boolean z = e != null && e.y() && this.s.D();
        this.t = z;
        View view = this.p;
        if (view instanceof FscrmidFavorFrameLayout) {
            ((FscrmidFavorFrameLayout) view).setEnableDoubleEvent(z);
        }
        a.d dVar = this.s;
        this.u = dVar != null ? dVar.f() : "";
        ir9.b(x, X() + "执行 onBindData 回调方法");
        if (this.k.isQuickOpenMode()) {
            this.h.incrementSessionId(this.r, false);
        } else {
            this.h.incrementSessionId(this.r, true);
        }
        this.b.onBindData(this, this.r, i);
        this.h.onBindData(this, this.r, i);
    }

    @Override // tb.ulb, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onCreate 回调方法");
    }

    @Override // tb.ulb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        if (v0()) {
            this.w = new iim(this);
        }
        this.q = recyclerViewHolder;
        View view = recyclerViewHolder.itemView;
        this.p = view;
        this.o = view.getContext();
        this.b.onCreateView(this, recyclerViewHolder);
        this.h.onCreateView(this, recyclerViewHolder);
        l0();
        if (this.p instanceof FscrmidFavorFrameLayout) {
            ncp j = ((IDataService) this.f29555a.getService(IDataService.class)).getConfig().j();
            if (j == null || j.d("enableNativeDoubleLike", true)) {
                z = true;
            }
            ir9.b(x, "enableNativeDoubleLike = " + z);
            ((FscrmidFavorFrameLayout) this.p).setEnableFavor(z);
        }
        if (A() == 1) {
            ((IAnalysisService) this.f29555a.getService(IAnalysisService.class)).getFluidInstanceAnalysis().f(FluidInstanceAnalysis.Stage.FIST_CARD.name());
        }
    }

    @Override // tb.ulb, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onDestroy 回调方法");
    }

    @Override // tb.ulb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onDisAppear 回调方法");
        this.b.onDisAppear(this);
        this.h.onDisAppear(this);
    }

    @Override // tb.ulb, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onPause 回调方法");
    }

    @Override // tb.ulb, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onRealStart 回调方法");
    }

    @Override // tb.ulb, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onRealStop 回调方法");
    }

    @Override // tb.ulb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onRecyclePlayer 回调方法");
        this.b.onRecycle(this);
        this.h.onRecycle(this);
    }

    @Override // tb.ulb, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onResume 回调方法");
        if (h0()) {
            e();
        }
    }

    @Override // tb.ulb, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onStart 回调方法");
    }

    @Override // tb.ulb, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ir9.b(x, X() + "执行 onStop 回调方法");
    }

    @Override // tb.ulb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onWillActive 回调方法");
        wq9.d(this);
        this.b.onWillActive(this);
        this.h.onWillActive(this);
    }

    @Override // tb.ulb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onWillDisActive 回调方法");
        this.b.onWillDisActive(this);
        this.h.onWillDisActive(this);
    }

    public void p0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfc8428", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && this.q.c0() != null) {
            this.q.c0().t0(i2, i);
        }
    }

    public void q0(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb0e0d1", new Object[]{this, aVar});
            return;
        }
        StringBuilder sb = new StringBuilder("评论联动onPopPositionChanged:");
        sb.append(aVar != null ? aVar.toString() : null);
        ir9.b(x, sb.toString());
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.j(aVar);
        }
    }

    public void r0(String str, com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d834b", new Object[]{this, str, aVar});
            return;
        }
        StringBuilder sb = new StringBuilder("评论联动onPopStateChanged:");
        sb.append(aVar != null ? aVar.toString() : null);
        sb.append(",state:");
        sb.append(str);
        ir9.b(x, sb.toString());
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.k(str, aVar);
        }
    }

    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268be14c", new Object[]{this});
        } else {
            p0(1001, M());
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return X();
    }

    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb0eb7d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ulb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onActive 回调方法。listCount=" + this.l.getTotalCount());
        int M = M();
        this.h.setActiveCard(this);
        this.h.setCurrentActiveCellPosition(M);
        if (!this.s.g().hasExposed && !this.s.y()) {
            ikf.INSTANCE.a(this.f29555a, this.r);
        }
        if (this.m.enableTab3UseCacheData()) {
            ejf.e(this.s.f());
        }
        IPreCacheService iPreCacheService = (IPreCacheService) this.f29555a.getService(IPreCacheService.class);
        if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
            iPreCacheService.exposedDeleteCacheData(this.s.f());
        }
        this.b.onActive(this);
        this.h.onActive(this);
        this.s.g().hasExposed = true;
        if (M != 0) {
            s0();
        }
        if (!(this instanceof prp) && !(this instanceof k5h)) {
            m0(this.p);
        }
        e();
    }

    @Override // tb.ulb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(x, X() + "执行 onDisActive 回调方法");
        a.d dVar = this.s;
        if (dVar != null) {
            dVar.F(false);
        }
        this.b.onDisActive(this);
        this.h.onDisActive(this);
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.n();
        }
    }

    @Override // tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            return;
        }
        this.r = aVar;
        a.d e = aVar.e();
        this.s = e;
        boolean z = e != null && e.y() && this.s.D();
        this.t = z;
        View view = this.p;
        if (view instanceof FscrmidFavorFrameLayout) {
            ((FscrmidFavorFrameLayout) view).setEnableDoubleEvent(z);
        }
        a.d dVar = this.s;
        this.u = dVar != null ? dVar.f() : "";
        ir9.b(x, X() + "执行 onBindData 回调方法");
        if (this.k.isInQuickOpenMode() && list != null && list.size() == 1 && (list.get(0) instanceof Long) && Long.valueOf(this.l.getQuickSecondRefreshMd5()).equals((Long) list.get(0))) {
            this.h.incrementSessionId(this.r, true);
        }
        this.b.onBindData(this, this.r, i, list);
        this.h.onBindData(this, this.r, i, list);
    }
}
