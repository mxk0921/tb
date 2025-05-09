package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.r2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cn4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17166a;
    public final IContainerService b;
    public final IFeedsListService c;
    public final IDataService d;
    public final IUsePreloadService e;
    public final ISceneConfigService f;
    public final ISharePlayerService g;
    public final km4 h;
    public final p8p i;
    public final IIntelligenceService k;
    public final IQuickOpenService l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public String q;
    public boolean r;
    public cl4 s;
    public Runnable t;
    public RotateAnimation u;
    public int v;
    @Deprecated
    public int w;
    public boolean x;
    public boolean y;
    public boolean z = true;
    public final y6d j = X();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.b("ContainerRenderManager", "PickPreloadControllerNew,3s后强制隐藏loading");
            cn4.this.E();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements x5b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.x5b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd92d595", new Object[]{this});
            } else {
                cn4.a(cn4.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements j0q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.j0q
        public void onSizeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i != 0 && i2 != 0) {
                if (cn4.b(cn4.this).getInstanceConfig().isFullscreenDisplay()) {
                    i2 = cn4.this.u().getMeasuredHeight();
                }
                cn4.this.h0(i, i2);
                cn4.this.g0();
                cn4.a(cn4.this).onSizeChanged(i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements c7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17170a;

        public d(boolean z) {
            this.f17170a = z;
        }

        @Override // tb.c7c
        public void onFirstCardRenderFailed(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb19bec", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.c7c
        public void onFirstCardRenderSuccess(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
                return;
            }
            ir9.b("ContainerRenderManager", "PickPreloadController，Muti,收到首帧回调,updateGraymaskVisible:");
            if (this.f17170a) {
                cn4.this.H();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean isDetailRequestSuccess = cn4.c(cn4.this).isDetailRequestSuccess();
            boolean isTransitionAnimEnd = cn4.d(cn4.this).isTransitionAnimEnd();
            if (isDetailRequestSuccess && isTransitionAnimEnd) {
                boolean isStillShareVideo = cn4.e(cn4.this).isStillShareVideo();
                if (!hn4.i(cn4.b(cn4.this)) && !isStillShareVideo) {
                    ir9.b("ContainerRenderManager", "observeListener,onAnimationEnd_hideLoading");
                    cn4.this.I();
                }
                cn4 cn4Var = cn4.this;
                cn4Var.p0(cn4.c(cn4Var).getDetailMediaSetDataList(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends r2e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f17172a;

        public f(cn4 cn4Var, Runnable runnable) {
            this.f17172a = runnable;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/container/render/ContainerRenderManager$6");
        }

        @Override // tb.r2e.a, tb.r2e
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            } else {
                this.f17172a.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements dzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f17173a;

        public g(cn4 cn4Var, Runnable runnable) {
            this.f17173a = runnable;
        }

        @Override // tb.dzb
        public void onDetailRequestSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cae82b", new Object[]{this});
            } else {
                this.f17173a.run();
            }
        }
    }

    static {
        t2o.a(468714155);
    }

    public cn4(FluidContext fluidContext, p8p p8pVar, km4 km4Var) {
        this.f17166a = fluidContext;
        this.i = p8pVar;
        this.b = (IContainerService) fluidContext.getService(IContainerService.class);
        this.c = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        this.d = (IDataService) fluidContext.getService(IDataService.class);
        this.e = (IUsePreloadService) fluidContext.getService(IUsePreloadService.class);
        this.f = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        this.g = (ISharePlayerService) fluidContext.getService(ISharePlayerService.class);
        this.k = (IIntelligenceService) fluidContext.getService(IIntelligenceService.class);
        this.l = (IQuickOpenService) fluidContext.getService(IQuickOpenService.class);
        this.h = km4Var;
        this.n = s6o.v(fluidContext.getContext());
        this.o = p91.b(fluidContext.getContext(), pto.g(fluidContext), fluidContext);
        ir9.b("ContainerRenderManager", "[画幅]ContainerRenderManager mWindowHeight=" + this.o);
    }

    public static /* synthetic */ km4 a(cn4 cn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (km4) ipChange.ipc$dispatch("334959db", new Object[]{cn4Var});
        }
        return cn4Var.h;
    }

    public static /* synthetic */ FluidContext b(cn4 cn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("7bdac099", new Object[]{cn4Var});
        }
        return cn4Var.f17166a;
    }

    public static /* synthetic */ IDataService c(cn4 cn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDataService) ipChange.ipc$dispatch("82561ad7", new Object[]{cn4Var});
        }
        return cn4Var.d;
    }

    public static /* synthetic */ IQuickOpenService d(cn4 cn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IQuickOpenService) ipChange.ipc$dispatch("7ba97f2e", new Object[]{cn4Var});
        }
        return cn4Var.l;
    }

    public static /* synthetic */ ISharePlayerService e(cn4 cn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISharePlayerService) ipChange.ipc$dispatch("d57cf7ad", new Object[]{cn4Var});
        }
        return cn4Var.g;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f20b1da7", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public final void C(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160ce102", new Object[]{this, aVar});
            return;
        }
        pep sessionParams = this.f.getSessionParams();
        if (sessionParams != null && aVar != null && (e2 = aVar.e()) != null && sg7.FAKE_CONTENT_ID.equals(sessionParams.d)) {
            this.q = sessionParams.d;
            sessionParams.d = e2.f();
        }
    }

    public final void D(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772de98a", new Object[]{this, aVar});
        } else if (hn4.i(this.f17166a) && aVar != null && (e2 = aVar.e()) != null && !e2.y()) {
            H();
            ij9.j(this.f17166a);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28d5843", new Object[]{this});
            return;
        }
        ir9.b("ContainerRenderManager", "PickPreloadControllerNew,隐藏loading");
        this.b.toggleCacheLoading(false);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f916c2", new Object[]{this});
        } else {
            nwv.A0(new a(), 3000L);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
            return;
        }
        cl4 cl4Var = this.s;
        if (cl4Var == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            cl4Var.B();
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32bd72f", new Object[]{this});
            return;
        }
        cl4 cl4Var = this.s;
        if (cl4Var == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            cl4Var.C();
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else if (this.s == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            ir9.b("ContainerRenderManager", "hideLoading");
            this.s.D();
        }
    }

    public final void J(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fe16d0", new Object[]{this, list});
            return;
        }
        String x = x();
        boolean b2 = ogi.e().b(x);
        boolean o = l9f.f().o(x);
        if (!b2 && !o) {
            z = false;
        }
        com.taobao.android.fluid.framework.data.datamodel.a h = com.taobao.android.fluid.framework.data.datamodel.a.h(list);
        if (z || !V()) {
            n0(list);
            return;
        }
        FluidContext fluidContext = this.f17166a;
        atb c2 = ij9.c(fluidContext, fluidContext.getContext(), h.e().K(), qv4.c().b(x).l(), 0, 0, null, null, null, null, false);
        if (c2 != null) {
            ((ISharePlayerService) this.f17166a.getService(ISharePlayerService.class)).setDWInstance(c2);
        }
    }

    public void L(DefaultPageType defaultPageType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a68d1c", new Object[]{this, defaultPageType, str, obj});
            return;
        }
        cl4 cl4Var = this.s;
        if (cl4Var == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            cl4Var.F(defaultPageType, str, obj);
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056517a", new Object[]{this});
        } else if (j()) {
            ((IInteractionService) this.f17166a.getService(IInteractionService.class)).initCollectionPoplayer();
        }
    }

    public final void N(Context context, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fb567", new Object[]{this, context, multiTabLayout});
            return;
        }
        igs.a("initContainerView");
        long currentTimeMillis = System.currentTimeMillis();
        this.p = this.b.getWeexActionBarHeight();
        this.s = new cl4(this.f17166a, multiTabLayout);
        this.c.renderList(context);
        f();
        this.i.g();
        this.s.u().setHorizontalSlideCallback(new b());
        this.s.u().setSizeChangedCallback(new c());
        ir9.a("ContainerRenderManager", "generateLayout, inflateTime=" + (System.currentTimeMillis() - currentTimeMillis));
        i(context);
        Y();
        igs.c();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb41367", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a e2 = this.j.e(this.f17166a);
        if (e2 != null) {
            ((IQuickOpenService) this.f17166a.getService(IQuickOpenService.class)).setQuickOpenMode(true);
            ((IInteractionService) this.f17166a.getService(IInteractionService.class)).initGlobalInteractHandler();
            ArrayList arrayList = new ArrayList();
            arrayList.add(e2);
            p0(arrayList, true);
        }
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35b4c8b", new Object[]{this})).booleanValue();
        }
        return this.d.isDetailMTopSuccess();
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e84f1ba", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableUseFirstFrameRenderObserve", true);
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("408dd926", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4223cef4", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d190ed9c", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue();
        }
        return this.d.isDetailLoading();
    }

    public final boolean V() {
        rv4 b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9535d425", new Object[]{this})).booleanValue();
        }
        String x = x();
        if (!TextUtils.isEmpty(x) && (b2 = qv4.c().b(x)) != null && b2.l() != null && b2.l().startsWith("file://")) {
            return true;
        }
        return false;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d8229e7", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final y6d X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6d) ipChange.ipc$dispatch("b5f9c302", new Object[]{this});
        }
        return new l7k();
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576dfad6", new Object[]{this});
        } else if (Q()) {
            this.b.addFirstCardRenderListener(new d(hn4.i(this.f17166a)));
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913a2a77", new Object[]{this});
            return;
        }
        e eVar = new e();
        ((IQuickOpenService) this.f17166a.getService(IQuickOpenService.class)).addTransitionAnimListener((r2e.a) new f(this, eVar));
        this.d.addDetailRequestSuccessListener(new g(this, eVar));
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
            return;
        }
        l();
        this.m = true;
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            c0(null, false);
        }
    }

    public void d0(Map map, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5aba011", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        ir9.b("ContainerRenderManager", "[dataRequest]PickPreloadControllerNew，refresh(),请求detail，args=" + map + "; isHaveExtraParams=" + z + "; excludeVideoinfo=" + z2 + "; fresh=" + z3);
        this.d.fetchContentDetail(map, z, z2, z3, null);
    }

    public void e0(d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a5d82d", new Object[]{this, d5nVar});
            return;
        }
        ir9.b("ContainerRenderManager", "[dataRequest]PickPreloadControllerNew，下拉刷新,请求detail");
        this.d.fetchContentDetail(null, false, false, true, d5nVar);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9257c15c", new Object[]{this});
            return;
        }
        View contentView = this.c.getContentView();
        if (contentView != null && contentView.getParent() == null) {
            this.s.h(contentView);
        }
    }

    public void f0(Context context, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d56149d", new Object[]{this, context, multiTabLayout});
            return;
        }
        igs.a("renderContainer");
        ir9.b("ContainerRenderManager", "[render]renderContainer");
        s0j.a(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER);
        K();
        Z();
        this.j.d(this.f17166a);
        N(context, multiTabLayout);
        O();
        if (pto.l(this.f17166a)) {
            s0j.a(s0j.GG_VIDEOTAB_VIDEO_LEAVE_UT);
        }
        M();
        s0j.d(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER);
        igs.c();
    }

    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332e5c49", new Object[]{this});
            return;
        }
        boolean e2 = pcw.e(hn4.o(this.f17166a), this.n, this.o);
        this.x = e2;
        if (f2k.d(this.f17166a)) {
            this.v = 0;
        } else if (b93.n(this.f17166a)) {
            FluidContext fluidContext = this.f17166a;
            this.v = bbw.c(fluidContext, fluidContext.getContext(), pto.q(this.f17166a));
        } else if (hn4.o(this.f17166a) || this.p == 0) {
            this.v = h(e2);
        }
        if (hn4.o(this.f17166a) || this.p == 0) {
            this.w = h(e2);
        }
    }

    @Deprecated
    public int h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("506c2027", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            if (f2k.d(this.f17166a)) {
                return pr9.q(pcw.k(this.f17166a));
            }
            return s6o.S(this.f17166a.getContext(), pcw.k(this.f17166a));
        } else if (f2k.d(this.f17166a)) {
            return pr9.q(pcw.n(this.f17166a));
        } else {
            return s6o.S(this.f17166a.getContext(), pcw.n(this.f17166a));
        }
    }

    public void h0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dfd207", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.n = i;
            this.o = i2;
            ir9.b("ContainerRenderManager", "[画幅]setContainerSize mWindowHeight=" + this.o);
        }
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a169e", new Object[]{this, context});
            return;
        }
        this.r = this.f17166a.getInstanceConfig().isDynamicProfileMode();
        y6d y6dVar = this.j;
        FluidContext fluidContext = this.f17166a;
        y6dVar.c(fluidContext, context, ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface(), this.b.getContentView(), this.r);
    }

    public void i0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba95dba", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b595368", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableDxLoadBeforeDetial", true);
    }

    public void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
            return;
        }
        cl4 cl4Var = this.s;
        if (cl4Var == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            cl4Var.K(z);
        }
    }

    public void k() {
        cl4 cl4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb440dbf", new Object[]{this});
            return;
        }
        if (!this.d.isDetailLoading() && !pto.n(this.f17166a) && !pto.l(this.f17166a)) {
            ir9.b("ContainerRenderManager", "[dataRequest]PickPreloadControllerNew，进入视频全屏页resume(),请求detail");
            this.d.fetchContentDetail(null, false, false);
        }
        l();
        if (meu.d()) {
            this.u = this.j.b();
        }
        RotateAnimation rotateAnimation = this.u;
        if (rotateAnimation != null && (cl4Var = this.s) != null) {
            cl4Var.M(rotateAnimation);
        }
    }

    public void k0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e1f497", new Object[]{this, runnable});
        } else {
            this.t = runnable;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65041ea6", new Object[]{this});
            return;
        }
        Runnable runnable = this.t;
        if (runnable != null) {
            runnable.run();
            this.t = null;
        }
    }

    public void l0(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32339d69", new Object[]{this, rotateAnimation});
        } else {
            this.u = rotateAnimation;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue();
        }
        return this.v;
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529213ea", new Object[]{this});
            return;
        }
        cl4 cl4Var = this.s;
        if (cl4Var == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        } else {
            cl4Var.L();
        }
    }

    public ViewStub n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d0fd0b33", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.o();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public int o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a869bbf", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.s == null) {
            ir9.b("ContainerRenderManager", "容器 Container 未初始化");
            return -1;
        }
        ir9.b("ContainerRenderManager", "Native 顶部view隐藏,visibility," + i);
        return this.s.p(i);
    }

    public ViewGroup p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ac1ca7d", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.q();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public void p0(List<com.taobao.android.fluid.framework.data.datamodel.a> list, boolean z) {
        cl4 cl4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e64763", new Object[]{this, list, new Boolean(z)});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a h = com.taobao.android.fluid.framework.data.datamodel.a.h(list);
        C(h);
        ir9.b("ContainerRenderManager", "PickPreloadControllerNew 更新UI");
        if (!z().e) {
            this.f.getSlidePageLockConfigure().a(false, true);
        }
        ncp z2 = z();
        if (!(z2 == null || z2.s || (cl4Var = this.s) == null)) {
            cl4Var.N(z2.D);
        }
        f();
        this.j.a(this.f17166a, list, z);
        if (z2 != null && !TextUtils.isEmpty(z2.c) && !hn4.a(this.f17166a)) {
            ((IInteractionService) this.f17166a.getService(IInteractionService.class)).initGlobalH5MessageHandler(h);
        }
        D(h);
    }

    public cl4 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cl4) ipChange.ipc$dispatch("62a52904", new Object[]{this});
        }
        return this.s;
    }

    public final void q0(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b8b4c2", new Object[]{this, map, new Boolean(z)});
        } else if (this.e.enableTab3UseCacheData() && sz3.e(map)) {
            if (z) {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.E(this.f17166a, "2");
            } else if (nwv.o(map.get("isRefresh"), false)) {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.E(this.f17166a, "1");
            }
        }
    }

    public ViewGroup r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.u();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public ViewStub s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("5c6546fa", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.v();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public View t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf789d8f", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.w();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public DefaultGestureCollectorDelegateLayout u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("c86db4d0", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.y();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    public View v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c38e826", new Object[]{this});
        }
        cl4 cl4Var = this.s;
        if (cl4Var != null) {
            return cl4Var.z();
        }
        ir9.b("ContainerRenderManager", "容器 Container 未初始化");
        return null;
    }

    @Deprecated
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60f7394d", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c0b1464", new Object[]{this});
        }
        return this.f17166a.getInstanceConfig().getPreCoverKey();
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8a86f6c", new Object[]{this});
        }
        return this.q;
    }

    public final ncp z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ncp) ipChange.ipc$dispatch("c343035d", new Object[]{this});
        }
        return this.d.getConfig().j();
    }

    public void c0(Map map, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b75d1", new Object[]{this, map, new Boolean(z)});
            return;
        }
        q0(map, z);
        StringBuilder sb = new StringBuilder("[dataRequest]PickPreloadControllerNew，refresh(),请求detail，args=");
        sb.append(map);
        sb.append("; isHavePonit ");
        if (z) {
            str = "小红点";
        } else {
            str = "正常刷新";
        }
        sb.append(str);
        ir9.b("ContainerRenderManager", sb.toString());
        this.d.fetchContentDetail(map, z, true);
    }

    public void g(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bcee4b", new Object[]{this, list, list2});
        } else if (this.s != null) {
            if (list != null) {
                for (String str : list) {
                    if ("topbar".equals(str)) {
                        this.s.k(0);
                    }
                }
            }
            if (list2 != null) {
                for (String str2 : list2) {
                    if ("topbar".equals(str2)) {
                        this.s.k(4);
                    }
                }
            }
        }
    }

    public final void K() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else if (!this.d.isDetailLoading() && this.f17166a.getInstanceConfig().isOnCreateToRequest() && !pto.l(this.f17166a)) {
            pep sessionParams = this.f.getSessionParams();
            if (sessionParams == null || sg7.FAKE_CONTENT_ID.equals(sessionParams.d) || V() || this.g.isEnableSharePlayer()) {
                z = false;
            } else {
                if (hn4.e()) {
                    ir9.b("ContainerRenderManager", "进入视频全屏页renderContainer initData,请求videoInfo");
                    this.d.fetchVideoInfoAndPrecreateDwInstance();
                }
                z = true;
            }
            ir9.b("ContainerRenderManager", "[dataRequest]PickPreloadControllerNew，进入视频全屏页renderContainer initData,请求detail");
            this.d.fetchContentDetail(null, false, z, false, null);
        }
    }

    public final boolean n0(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("742e1cbb", new Object[]{this, list})).booleanValue();
        }
        ntm k = ((IUsePreloadService) this.f17166a.getService(IUsePreloadService.class)).getConfig().k();
        com.taobao.android.fluid.framework.data.datamodel.a h = com.taobao.android.fluid.framework.data.datamodel.a.h(list);
        if (h != null) {
            if (h.e().C()) {
                ir9.b("ContainerRenderManager", "视频场景不需要移除预创建播放器");
                z = true;
            } else {
                z = false;
            }
            if (!z || k == null) {
                z2 = false;
            } else {
                boolean equals = TextUtils.equals(h.e() != null ? h.e().f() : null, k.b);
                z2 = !equals;
                atb atbVar = k.f24942a;
                ir9.b("ContainerRenderManager", "PickPreloadControllerNew,tryUsePreDWInstanceFromLauncher:" + atbVar + ",needDestoryDW:" + z2);
                if (equals && atbVar != null) {
                    ir9.b("ContainerRenderManager", "PickPreloadControllerNew,VideoProcess usePreDWInstanceFromLauncher 使用预加载播放器 cachePreloadDWInstance=" + atbVar);
                    ((IMediaService) this.f17166a.getService(IMediaService.class)).setUseDefaultValueCreateDW(true);
                    ((ISharePlayerService) this.f17166a.getService(ISharePlayerService.class)).setDWInstance(atbVar);
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.H(this.f17166a, "1");
                    k.g();
                    return true;
                }
            }
            if (!z || z2) {
                ((IUsePreloadService) this.f17166a.getService(IUsePreloadService.class)).removePreAttachedDWInstance(true);
                return true;
            }
        }
        return false;
    }

    public void o0(boolean z, List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84720bd0", new Object[]{this, new Boolean(z), list});
            return;
        }
        igs.a("updateView");
        mfj.o(this.f17166a);
        if (!j()) {
            ((IInteractionService) this.f17166a.getService(IInteractionService.class)).initCollectionPoplayer();
        }
        ir9.b("ContainerRenderManager", "PickPreloadControllerNew VideoProcess DefaultFluidInstance updateView()");
        s0j.a(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW);
        ryr.b(this.f17166a.getContext(), pto.b(this.f17166a), "gg_videoMutiTab_ui2VideoPlay");
        J(list);
        boolean isDetailRequestSuccess = this.d.isDetailRequestSuccess();
        boolean isTransitionAnimEnd = this.l.isTransitionAnimEnd();
        if (isDetailRequestSuccess && isTransitionAnimEnd) {
            ir9.b("ContainerRenderManager", "updateView,detailSuccess && animationEnd_hideLoading");
            I();
            p0(list, false);
        } else if (this.e.ismTab3QuickRender()) {
            p0(list, false);
        }
        StringBuilder sb = new StringBuilder("PickPreloadControllerNew，需要启动监听：");
        if (!isDetailRequestSuccess || !isTransitionAnimEnd) {
            z2 = true;
        }
        sb.append(z2);
        ir9.b("ContainerRenderManager", sb.toString());
        ncp z3 = z();
        if (pto.g(this.f17166a) && p91.m(this.f17166a.getContext()) && z3 != null && z3.F && !f2k.d(this.f17166a)) {
            this.y = true;
            g0();
        }
        F();
        s0j.d(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW);
        this.h.j();
        igs.c();
    }
}
