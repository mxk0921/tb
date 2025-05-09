package com.taobao.themis.kernel.extension.page.rum;

import android.os.SystemClock;
import android.taobao.windvane.export.network.Request;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.falco.u;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import mtopsdk.mtop.intf.Mtop;
import tb.aud;
import tb.ccs;
import tb.ckf;
import tb.dyd;
import tb.f8d;
import tb.gld;
import tb.h8s;
import tb.i2c;
import tb.jwd;
import tb.kwd;
import tb.mop;
import tb.o9s;
import tb.oz8;
import tb.pgd;
import tb.q9s;
import tb.qml;
import tb.s7d;
import tb.t2o;
import tb.tz8;
import tb.u1a;
import tb.uy8;
import tb.wsq;
import tb.xhv;
import tb.ztd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class RUMPageExtension implements pgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13576a;
    public m g;
    public uy8 h;
    public u.a m;
    public boolean o;
    public boolean p;
    public String b = "";
    public final ConcurrentHashMap<String, Long> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> d = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> e = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> f = new ConcurrentHashMap<>();
    public boolean i = true;
    public final ConcurrentHashMap<String, Long> j = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> k = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<String> l = new CopyOnWriteArraySet<>();
    public TMSEmbedPresentModeType n = TMSEmbedPresentModeType.CARD;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            t2o.a(846200837);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.MIX.ordinal()] = 1;
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 2;
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 3;
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 4;
            iArr[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 5;
            iArr[TMSSolutionType.WIDGET.ordinal()] = 6;
            iArr[TMSSolutionType.WEEX.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TMSRumTarget.values().length];
            iArr2[TMSRumTarget.CUSTOM.ordinal()] = 1;
            iArr2[TMSRumTarget.STANDARD.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else {
                RUMPageExtension.g(RUMPageExtension.this, mVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            tz8.a d;
            tz8.a f;
            tz8.a g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                return;
            }
            RUMPageExtension.g(RUMPageExtension.this, mVar);
            if (!q9s.H()) {
                long z = mVar.z();
                tz8 tz8Var = FalcoGlobalTracer.get();
                RUMPageExtension rUMPageExtension = RUMPageExtension.this;
                m mVar2 = null;
                if (!(tz8Var == null || (d = tz8Var.d(m.MODULE, "tap")) == null || (f = d.f(mVar)) == null || (g = f.g(z)) == null)) {
                    mVar2 = g.e();
                }
                RUMPageExtension.g(rUMPageExtension, mVar2);
                m a2 = RUMPageExtension.a(RUMPageExtension.this);
                if (a2 != null) {
                    a2.r0(mVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else {
                RUMPageExtension.g(RUMPageExtension.this, mVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements u1a<Integer, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f13580a;
        public final /* synthetic */ RUMPageExtension b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements m.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RUMPageExtension f13581a;

            public a(RUMPageExtension rUMPageExtension) {
                this.f13581a = rUMPageExtension;
            }

            @Override // com.taobao.falco.m.a
            public final void a(m mVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                } else {
                    RUMPageExtension.g(this.f13581a, mVar);
                }
            }
        }

        public e(u uVar, RUMPageExtension rUMPageExtension) {
            this.f13580a = uVar;
            this.b = rUMPageExtension;
        }

        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
                return;
            }
            this.f13580a.b(RUMPageExtension.f(this.b));
            this.f13580a.c(RUMPageExtension.f(this.b), new a(this.b));
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
            a(num.intValue(), str);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements aud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f13582a;
        public final /* synthetic */ RUMPageExtension b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements m.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RUMPageExtension f13583a;

            public a(RUMPageExtension rUMPageExtension) {
                this.f13583a = rUMPageExtension;
            }

            @Override // com.taobao.falco.m.a
            public final void a(m mVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
                } else {
                    RUMPageExtension.g(this.f13583a, mVar);
                }
            }
        }

        public f(u uVar, RUMPageExtension rUMPageExtension) {
            this.f13582a = uVar;
            this.b = rUMPageExtension;
        }

        @Override // tb.aud
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40cb1832", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.f13582a.b(RUMPageExtension.f(this.b));
            this.f13582a.c(RUMPageExtension.f(this.b), new a(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else {
                RUMPageExtension.g(RUMPageExtension.this, mVar);
            }
        }
    }

    static {
        t2o.a(846200836);
        t2o.a(839909680);
    }

    public RUMPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13576a = iTMSPage;
    }

    public static /* synthetic */ long S(RUMPageExtension rUMPageExtension, m mVar, gld gldVar, String str, long j, boolean z, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27a9dfae", new Object[]{rUMPageExtension, mVar, gldVar, str, new Long(j), new Boolean(z), new Integer(i), obj})).longValue();
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return rUMPageExtension.P(mVar, gldVar, str, j, z2);
    }

    public static final /* synthetic */ m a(RUMPageExtension rUMPageExtension) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("322be47a", new Object[]{rUMPageExtension}) : rUMPageExtension.g;
    }

    public static final /* synthetic */ CopyOnWriteArraySet d(RUMPageExtension rUMPageExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("5027362b", new Object[]{rUMPageExtension});
        }
        return rUMPageExtension.l;
    }

    public static final /* synthetic */ u.a f(RUMPageExtension rUMPageExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u.a) ipChange.ipc$dispatch("8aa1a357", new Object[]{rUMPageExtension});
        }
        return rUMPageExtension.m;
    }

    public static final /* synthetic */ void g(RUMPageExtension rUMPageExtension, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faeac36a", new Object[]{rUMPageExtension, mVar});
        } else {
            rUMPageExtension.g = mVar;
        }
    }

    @Override // tb.pgd
    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2a6903", new Object[]{this, str});
            return;
        }
        ckf.g(str, "renderType");
        this.b = str;
    }

    @Override // tb.pgd
    public void G0() {
        m V;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd052cb", new Object[]{this});
            return;
        }
        try {
            if (q9s.M1()) {
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
                m r = B0();
                if (r != null) {
                    q0();
                    i2c i2cVar = (i2c) this.f13576a.getExtension(i2c.class);
                    if (!(i2cVar == null || (V = i2cVar.V()) == null)) {
                        e0(V, currentTimeMillis);
                    }
                    if (this.i && this.o) {
                        z = true;
                    }
                    e0(r, currentTimeMillis);
                    h(r, currentTimeMillis, z);
                    if (z && this.p) {
                        r.finish();
                    }
                }
            }
        } catch (Exception e2) {
            TMSLogger.b("RUMPageExtension", ckf.p("commitPageRUM error ", e2.getMessage()));
        }
    }

    @Override // tb.pgd
    public String H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2da1f050", new Object[]{this});
        }
        m r = B0();
        if (r == null) {
            return null;
        }
        return r.getFalcoId();
    }

    public final String O() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22571f6a", new Object[]{this});
        }
        TMSSolutionType a0 = this.f13576a.getInstance().a0();
        if (a0 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[a0.ordinal()];
        }
        switch (i) {
            case 1:
                return "MIX";
            case 2:
                return "MINIGAME";
            case 3:
                return "UNIAPP";
            case 4:
            default:
                return "WEB_SINGLE_PAGE";
            case 5:
                return "CLUSTER_WIDGET";
            case 6:
                return "WIDGET";
            case 7:
                return "WEEX";
        }
    }

    public final long P(m mVar, gld gldVar, String str, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("737a7446", new Object[]{this, mVar, gldVar, str, new Long(j), new Boolean(z)})).longValue();
        }
        long g2 = gldVar.g(str);
        if (!z) {
            j = 0;
        }
        return g2 + j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6391219d", new Object[]{this});
        }
        TMSSolutionType a0 = this.f13576a.getInstance().a0();
        switch (a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()]) {
            case 2:
                return "canvas";
            case 3:
                if (ckf.b(this.f13576a.getPageParams().e().j(), "weex")) {
                    return "weex";
                }
                break;
            case 5:
            case 6:
                return "widget";
            case 7:
                return "weex";
        }
        return "h5";
    }

    public final String V() {
        ITMSPage L0;
        ITMSPage L02;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c097cf4", new Object[]{this});
        }
        s7d s7dVar = (s7d) this.f13576a.getExtension(s7d.class);
        ztd ztdVar = null;
        if (((s7dVar == null || (L02 = s7dVar.L0()) == null) ? null : (dyd) L02.getExtension(dyd.class)) != null) {
            return "tabSelected";
        }
        s7d s7dVar2 = (s7d) this.f13576a.getExtension(s7d.class);
        if (!(s7dVar2 == null || (L0 = s7dVar2.L0()) == null)) {
            ztdVar = (ztd) L0.getExtension(ztd.class);
        }
        if (ztdVar != null) {
            return "tabSelected";
        }
        return "push";
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            pgd.a.c(this);
        }
    }

    public final void g0(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d21da24", new Object[]{this, mVar});
        } else if (this.j.size() != 0 || this.k.size() != 0) {
            if (this.j.containsKey("pageFspTime")) {
                mVar.u(this.j.get("pageFspTime"));
            }
            if (this.j.containsKey("pageFFSPTime")) {
                mVar.G(this.j.get("pageFFSPTime"));
            }
            if (this.k.containsKey("pageLevel")) {
                mVar.N(String.valueOf(this.k.get("pageLevel")));
            }
            if (this.j.containsKey("pageFcpTime")) {
                mVar.q0(this.j.get("pageFcpTime"));
            }
            if (this.j.containsKey("pageCreateStart")) {
                mVar.c0(this.j.get("pageCreateStart"));
            }
            if (this.j.containsKey("pageCreateEnd")) {
                mVar.K(this.j.get("pageCreateEnd"));
            }
            if (this.j.containsKey("engineInitStart")) {
                mVar.P(this.j.get("engineInitStart"));
            }
            if (this.j.containsKey("engineInitEnd")) {
                mVar.J(this.j.get("engineInitEnd"));
            }
            if (this.j.containsKey("userActionStart")) {
                mVar.a0(this.j.get("userActionStart"));
            }
            if (this.j.containsKey("routeStart")) {
                mVar.V(this.j.get("routeStart"));
            }
            if (this.j.containsKey("routeEnd")) {
                mVar.U(this.j.get("routeEnd"));
            }
            if (this.j.containsKey("firstFrameRenderStart")) {
                mVar.L(this.j.get("firstFrameRenderStart"));
            }
            if (this.j.containsKey("firstFrameRenderEnd")) {
                mVar.w(this.j.get("firstFrameRenderEnd"));
            }
            if (this.k.containsKey("containerColdLaunch")) {
                mVar.q(o9s.l(String.valueOf(this.k.get("containerColdLaunch"))));
            }
            if (this.k.containsKey("techStack")) {
                mVar.Z(String.valueOf(this.k.get("techStack")));
            }
            if (this.k.containsKey("pageType")) {
                mVar.F(String.valueOf(this.k.get("pageType")));
            }
            if (this.k.containsKey("renderType")) {
                mVar.i(String.valueOf(this.k.get("renderType")));
            }
            if (this.k.containsKey("kernelType")) {
                mVar.R(String.valueOf(this.k.get("kernelType")));
            }
            if (this.k.containsKey("pageURL")) {
                mVar.l0(String.valueOf(this.k.get("pageURL")));
            }
            if (this.k.containsKey("fromPageName")) {
                mVar.Q(String.valueOf(this.k.get("fromPageName")));
            }
            if (this.k.containsKey("fromPageURL")) {
                mVar.B(String.valueOf(this.k.get("fromPageURL")));
            }
            if (this.k.containsKey("topic")) {
                mVar.h0(String.valueOf(this.k.get("topic")));
            }
            if (this.k.containsKey("transitionType")) {
                mVar.t0(String.valueOf(this.k.get("transitionType")));
            }
            if (this.j.containsKey("pageFFSPTime")) {
                mVar.G(this.j.get("pageFFSPTime"));
            }
            if (this.k.containsKey("pageName")) {
                mVar.y(String.valueOf(this.k.get("pageName")));
            }
            if (this.k.containsKey("isFirstLoad")) {
                mVar.M(o9s.l(String.valueOf(this.k.get("isFirstLoad"))));
            }
        }
    }

    @Override // tb.pgd
    public void i1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e801bc2", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4299881a", new Object[]{this});
            return;
        }
        this.l.add("H5_first_navigationStart");
        this.l.add("H5_navigationStart");
        this.l.add("H5_fetchStart");
        this.l.add("H5_responseEnd");
        this.l.add("H5_domContentLoadedEventStart");
        this.l.add("H5_loadEventStart");
        this.l.add("H5_loadEventEnd");
        this.l.add("H5_interceptStart");
        this.l.add("H5_interceptEnd");
        this.l.add("H5_receiveResponse");
        this.l.add("H5_startLoad");
        this.l.add("H5_firstPaint");
        this.l.add("H5_JST_FCP");
        this.l.add("H5_JST_displayedTime");
        this.l.add("H5_JST_displayedTime_SSR");
        this.l.add("renderMode");
        this.l.add("H5_isPreCreated");
        this.l.add("H5_isFinished");
        this.l.add("H5_JST_FSP_VER");
        this.l.add("engineLoadBundleStart");
        this.l.add("engineLoadBundleEnd");
        this.l.add("containerInitEnd");
    }

    /* renamed from: n */
    public uy8 q0() {
        tz8.a d2;
        tz8.a f2;
        tz8.a g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("1ed1f878", new Object[]{this});
        }
        uy8 uy8Var = this.h;
        if (uy8Var != null) {
            return uy8Var;
        }
        m mVar = this.g;
        uy8 uy8Var2 = null;
        if (mVar == null && (mVar = M()) == null) {
            return null;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (!(tz8Var == null || (d2 = tz8Var.d("themis_load", "tap")) == null || (f2 = d2.f(mVar)) == null || (g2 = f2.g(mVar.z())) == null)) {
            uy8Var2 = g2.d();
        }
        this.h = uy8Var2;
        return uy8Var2;
    }

    @Override // tb.pgd
    public void p1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9327c847", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    /* renamed from: r */
    public m B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("2dd67e91", new Object[]{this});
        }
        m mVar = this.g;
        if (mVar != null) {
            return mVar;
        }
        m M = M();
        this.g = M;
        return M;
    }

    public final String s(ITMSPage iTMSPage) {
        ITMSPage L0;
        ITMSPage L02;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("995c782f", new Object[]{this, iTMSPage});
        }
        if (iTMSPage.getInstance().O() == TMSContainerType.EMBEDDED) {
            return WXBasicComponentType.EMBED;
        }
        s7d s7dVar = (s7d) iTMSPage.getExtension(s7d.class);
        ztd ztdVar = null;
        if (((s7dVar == null || (L02 = s7dVar.L0()) == null) ? null : (dyd) L02.getExtension(dyd.class)) != null) {
            return "tab";
        }
        s7d s7dVar2 = (s7d) iTMSPage.getExtension(s7d.class);
        if (!(s7dVar2 == null || (L0 = s7dVar2.L0()) == null)) {
            ztdVar = (ztd) L0.getExtension(ztd.class);
        }
        if (ztdVar != null) {
            return "swiper";
        }
        return "page";
    }

    @Override // tb.pgd
    public void w(TMSEmbedPresentModeType tMSEmbedPresentModeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce6a3c7", new Object[]{this, tMSEmbedPresentModeType});
            return;
        }
        ckf.g(tMSEmbedPresentModeType, "embedType");
        if (tMSEmbedPresentModeType != TMSEmbedPresentModeType.POP || this.m == null) {
            TMSLogger.b("RUMPageExtension", "don't create span");
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            TMSLogger.b("RUMPageExtension", "tracer is null");
            return;
        }
        u h = tz8Var.h();
        h.b(this.m);
        this.n = tMSEmbedPresentModeType;
        h.c(this.m, new b());
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            pgd.a.a(this);
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        tz8 tz8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        pgd.a.b(this, iTMSPage);
        l();
        if (iTMSPage.getInstance().a0() == TMSSolutionType.WEEX) {
            this.i = false;
        }
        if (iTMSPage.getInstance().O() != TMSContainerType.EMBEDDED && (tz8Var = FalcoGlobalTracer.get()) != null) {
            tz8Var.j(new c());
        }
    }

    public final m M() {
        tz8.a d2;
        tz8.a f2;
        tz8.a g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("2cd6ddd6", new Object[]{this});
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (this.f13576a.getInstance().O() == TMSContainerType.EMBEDDED) {
            i2c i2cVar = (i2c) this.f13576a.getInstance().getExtension(i2c.class);
            m mVar = null;
            m V = i2cVar == null ? null : i2cVar.V();
            if (V == null) {
                return null;
            }
            long z = V.z();
            if (!(tz8Var == null || (d2 = tz8Var.d(m.MODULE, "tap")) == null || (f2 = d2.f(V)) == null || (g2 = f2.g(z)) == null)) {
                mVar = g2.e();
            }
            this.g = mVar;
            if (mVar != null) {
                mVar.r0(V);
            }
            m mVar2 = this.g;
            if (mVar2 != null) {
                mVar2.a0(Long.valueOf(z));
            }
            this.p = true;
        }
        return this.g;
    }

    @Override // tb.pgd
    public void a(String str, Long l) {
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3774160", new Object[]{this, str, l});
        } else if (str != null && l != null && (mVar = this.g) != null) {
            String str2 = this.b;
            Locale locale = Locale.ROOT;
            ckf.f(locale, "ROOT");
            String upperCase = str2.toUpperCase(locale);
            ckf.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
            if ((TextUtils.equals(upperCase, Mtop.Id.SSR) || TextUtils.equals(upperCase, "STREAMSSR")) && TextUtils.equals("H5_JST_displayedTime_SSR", str)) {
                mVar.u(Long.valueOf(l.longValue() + currentTimeMillis));
            } else if (TextUtils.equals(str, "H5_JST_displayedTime")) {
                mVar.u(Long.valueOf(l.longValue() + currentTimeMillis));
            }
        }
    }

    @Override // tb.pgd
    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197b24d4", new Object[]{this});
        } else if (TMSEmbedPresentModeType.POP == this.n) {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null) {
                TMSLogger.b("RUMPageExtension", "tracer is null");
                return;
            }
            u h = tz8Var.h();
            u.a aVar = new u.a();
            aVar.e = false;
            aVar.c = this.f13576a.c();
            aVar.f10480a = this.f13576a.hashCode();
            aVar.d = "back";
            h.e(aVar);
            h.b(aVar);
        }
    }

    @Override // tb.pgd
    public void F(String str, Object obj, TMSRumTarget tMSRumTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd89f0f8", new Object[]{this, str, obj, tMSRumTarget});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        ckf.g(tMSRumTarget, "target");
        int i = a.$EnumSwitchMapping$1[tMSRumTarget.ordinal()];
        if (i == 1) {
            this.e.put(str, obj);
        } else if (i != 2) {
            this.d.put(str, obj);
        } else {
            this.k.put(str, obj);
        }
    }

    @Override // tb.pgd
    public void J(TMSEmbedPresentModeType tMSEmbedPresentModeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5026f3dd", new Object[]{this, tMSEmbedPresentModeType});
            return;
        }
        ckf.g(tMSEmbedPresentModeType, "embedType");
        this.n = tMSEmbedPresentModeType;
        TMSEmbedPresentModeType tMSEmbedPresentModeType2 = TMSEmbedPresentModeType.POP;
        if (tMSEmbedPresentModeType == tMSEmbedPresentModeType2) {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null) {
                TMSLogger.b("RUMPageExtension", "tracer is null");
                return;
            }
            u h = tz8Var.h();
            u.a aVar = new u.a();
            this.m = aVar;
            aVar.e = true;
            aVar.c = this.f13576a.c();
            u.a aVar2 = this.m;
            if (aVar2 != null) {
                aVar2.f10480a = this.f13576a.hashCode();
            }
            u.a aVar3 = this.m;
            if (aVar3 != null) {
                aVar3.d = "modal";
            }
            if (tMSEmbedPresentModeType == tMSEmbedPresentModeType2) {
                if (aVar3 != null) {
                    aVar3.d = "popOver";
                }
                if (aVar3 != null) {
                    aVar3.e = false;
                }
            }
            h.e(aVar3);
        }
    }

    @Override // tb.pgd
    public void R0(String str, long j, TMSRumTarget tMSRumTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88152e4b", new Object[]{this, str, new Long(j), tMSRumTarget});
            return;
        }
        ckf.g(str, "key");
        ckf.g(tMSRumTarget, "target");
        int i = a.$EnumSwitchMapping$1[tMSRumTarget.ordinal()];
        if (i == 1) {
            this.f.put(str, Long.valueOf(j));
        } else if (i != 2) {
            this.c.put(str, Long.valueOf(j));
        } else {
            this.j.put(str, Long.valueOf(j));
        }
    }

    @Override // tb.pgd
    public void onViewAppear() {
        ITMSPage L0;
        ztd ztdVar;
        ITMSPage L02;
        dyd dydVar;
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        kwd kwdVar = (kwd) this.f13576a.getExtension(kwd.class);
        if ((kwdVar == null || !kwdVar.isFirstPage()) && (mVar = this.g) != null) {
            mVar.a0(Long.valueOf(System.currentTimeMillis()));
        }
        if (q9s.H()) {
            if (this.n == TMSEmbedPresentModeType.PAGE || this.f13576a.getInstance().c0().isFragmentContainer()) {
                tz8 tz8Var = FalcoGlobalTracer.get();
                if (tz8Var != null) {
                    tz8Var.j(new d());
                }
            } else if (this.f13576a.getInstance().O() != TMSContainerType.EMBEDDED && this.m == null) {
                tz8 tz8Var2 = FalcoGlobalTracer.get();
                if (tz8Var2 == null) {
                    TMSLogger.b("RUMPageExtension", "tracer is null");
                    return;
                }
                u h = tz8Var2.h();
                u.a aVar = new u.a();
                this.m = aVar;
                kwd kwdVar2 = (kwd) this.f13576a.getExtension(kwd.class);
                aVar.e = kwdVar2 != null && kwdVar2.isFirstPage();
                u.a aVar2 = this.m;
                if (aVar2 != null) {
                    aVar2.c = this.f13576a.c();
                }
                u.a aVar3 = this.m;
                if (aVar3 != null) {
                    aVar3.f10480a = this.f13576a.hashCode();
                }
                u.a aVar4 = this.m;
                if (aVar4 != null) {
                    aVar4.b = "com.taobao.themis.container.app.TMSActivity";
                }
                if (aVar4 != null) {
                    aVar4.d = "tabSelected";
                }
                if (this.f13576a.getInstance().c0().isFragmentContainer()) {
                    u.a aVar5 = this.m;
                    if (aVar5 != null) {
                        aVar5.e = false;
                    }
                    if (aVar5 != null) {
                        aVar5.b = "com.taobao.themis.taobao.container.fragment.TMSTBHomeFragment";
                    }
                }
                h.e(this.m);
                s7d s7dVar = (s7d) this.f13576a.getExtension(s7d.class);
                if (!(s7dVar == null || (L02 = s7dVar.L0()) == null || (dydVar = (dyd) L02.getExtension(dyd.class)) == null)) {
                    dydVar.C(new e(h, this));
                }
                s7d s7dVar2 = (s7d) this.f13576a.getExtension(s7d.class);
                if (!(s7dVar2 == null || (L0 = s7dVar2.L0()) == null || (ztdVar = (ztd) L0.getExtension(ztd.class)) == null)) {
                    ztdVar.l0(new f(h, this));
                }
                kwd kwdVar3 = (kwd) this.f13576a.getExtension(kwd.class);
                if (kwdVar3 != null && kwdVar3.isFirstPage()) {
                    h.b(this.m);
                    h.c(this.m, new g());
                }
            }
        }
    }

    public final void e0(m mVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b021f376", new Object[]{this, mVar, new Long(j)});
            return;
        }
        gld m = CommonExtKt.m(this.f13576a.getInstance());
        if (m != null) {
            if (this.f13576a.getInstance().O() == TMSContainerType.EMBEDDED || !qml.z(this.f13576a)) {
                mVar.V(Long.valueOf(mVar.z()));
                mVar.U(Long.valueOf(mVar.z()));
            }
            kwd kwdVar = (kwd) this.f13576a.getExtension(kwd.class);
            if (kwdVar != null && kwdVar.isFirstPage()) {
                if (m.w(mop.KEY_CONTAINER_START)) {
                    mVar.D(Long.valueOf(o9s.n(m.Q(mop.KEY_CONTAINER_START))));
                    uy8 uy8Var = this.h;
                    if (uy8Var != null) {
                        uy8Var.f("containerInitStart", Long.valueOf(o9s.n(m.Q(mop.KEY_CONTAINER_START))));
                    }
                }
                if (m.R("pageCreateEnd")) {
                    mVar.r(Long.valueOf(m.g("pageCreateEnd")));
                    uy8 uy8Var2 = this.h;
                    if (uy8Var2 != null) {
                        uy8Var2.f("containerInitEnd", Long.valueOf(m.g("pageCreateEnd")));
                    }
                }
                if (m.R("engineInitStart")) {
                    mVar.P(Long.valueOf(m.g("engineInitStart")));
                    uy8 uy8Var3 = this.h;
                    if (uy8Var3 != null) {
                        uy8Var3.f(IMultiTabPerformanceListener.ON_ENGINE_INIT_START, Long.valueOf(m.g("engineInitStart")));
                    }
                }
                if (m.R("engineInitEnd")) {
                    mVar.J(Long.valueOf(m.g("engineInitEnd")));
                    uy8 uy8Var4 = this.h;
                    if (uy8Var4 != null) {
                        uy8Var4.f(IMultiTabPerformanceListener.ON_ENGINE_INIT_END, Long.valueOf(m.g("engineInitEnd")));
                    }
                }
                if (m.R("pageCreateStart")) {
                    mVar.c0(Long.valueOf(m.g("pageCreateStart")));
                    uy8 uy8Var5 = this.h;
                    if (uy8Var5 != null) {
                        uy8Var5.f("pageCreateS", Long.valueOf(m.g("pageCreateStart")));
                    }
                }
                if (m.R("pageCreateEnd")) {
                    mVar.K(Long.valueOf(m.g("pageCreateEnd")));
                    uy8 uy8Var6 = this.h;
                    if (uy8Var6 != null) {
                        uy8Var6.f("pageCreateE", Long.valueOf(m.g("pageCreateEnd")));
                    }
                }
            }
            String str2 = this.b;
            Locale locale = Locale.ROOT;
            ckf.f(locale, "ROOT");
            String upperCase = str2.toUpperCase(locale);
            ckf.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if ((TextUtils.equals(upperCase, Mtop.Id.SSR) || TextUtils.equals(upperCase, "STREAMSSR")) && m.R("H5_JST_displayedTime_SSR")) {
                mVar.u(Long.valueOf(m.g("H5_JST_displayedTime_SSR") + j));
                uy8 uy8Var7 = this.h;
                if (uy8Var7 != null) {
                    uy8Var7.f("fsp", Long.valueOf(m.g("H5_JST_displayedTime_SSR") + j));
                }
            } else if (m.R("H5_JST_displayedTime")) {
                mVar.u(Long.valueOf(m.g("H5_JST_displayedTime") + j));
                uy8 uy8Var8 = this.h;
                if (uy8Var8 != null) {
                    uy8Var8.f("fsp", Long.valueOf(m.g("H5_JST_displayedTime") + j));
                }
            }
            if (m.R("H5_JST_FCP") && this.f13576a.getInstance().a0() != TMSSolutionType.MINIGAME) {
                mVar.q0(Long.valueOf(m.g("H5_JST_FCP") + j));
                uy8 uy8Var9 = this.h;
                if (uy8Var9 != null) {
                    uy8Var9.f("fcp", Long.valueOf(m.g("H5_JST_FCP") + j));
                }
            }
            if (m.R("Canvas_FirstFrameTime")) {
                mVar.q0(Long.valueOf(m.g("Canvas_FirstFrameTime")));
                uy8 uy8Var10 = this.h;
                if (uy8Var10 != null) {
                    uy8Var10.f("fcp", Long.valueOf(m.g("Canvas_FirstFrameTime")));
                }
            }
            if (m.w("renderStrategy")) {
                mVar.i(m.Q("renderStrategy"));
            }
            if (m.R(Request.StageName.DOCUMENT_REQUEST_START)) {
                mVar.e0(Long.valueOf(m.g(Request.StageName.DOCUMENT_REQUEST_START) + j));
            }
            if (m.R("H5_JST_FFSP")) {
                mVar.G(Long.valueOf(m.g("H5_JST_FFSP") + j));
                uy8 uy8Var11 = this.h;
                if (uy8Var11 != null) {
                    uy8Var11.f("ffsp", Long.valueOf(m.g("H5_JST_FFSP") + j));
                }
            }
            if (m.R(Request.StageName.DOCUMENT_REQUEST_END)) {
                mVar.E(Long.valueOf(m.g(Request.StageName.DOCUMENT_REQUEST_END) + j));
            }
            if (this.d.containsKey("kernelType")) {
                mVar.R(String.valueOf(this.d.get("kernelType")));
            }
            TMSSolutionType a0 = this.f13576a.getInstance().a0();
            int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
            if (i == 1 || i == 2) {
                str = this.f13576a.getInstance().L();
            } else if (i != 3) {
                str = "unKnow";
            } else {
                str = this.f13576a.getInstance().d0();
            }
            mVar.f0(str);
            uy8 uy8Var12 = this.h;
            if (uy8Var12 != null) {
                uy8Var12.X("containerAppId", str);
            }
            mVar.F(s(this.f13576a));
            mVar.Z(T());
            if (ckf.b(T(), "h5")) {
                String upperCase2 = upperCase.toUpperCase(locale);
                ckf.f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                mVar.i(upperCase2);
            }
            mVar.t0(V());
            if (this.f13576a.c().length() > 0) {
                mVar.l0(this.f13576a.c());
            }
            g0(mVar);
        }
    }

    public final oz8 h(m mVar, long j, boolean z) {
        gld gldVar;
        Object obj;
        String str;
        uy8 uy8Var;
        gld gldVar2;
        String str2;
        uy8 uy8Var2;
        gld gldVar3;
        gld gldVar4;
        String str3;
        String str4;
        ITMSPage L0;
        ITMSPage L02;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("4d122070", new Object[]{this, mVar, new Long(j), new Boolean(z)});
        }
        uy8 n = q0();
        ztd ztdVar = null;
        if (n == null) {
            return null;
        }
        gld m = CommonExtKt.m(this.f13576a.getInstance());
        if (m == null) {
            return n;
        }
        kwd kwdVar = (kwd) this.f13576a.getExtension(kwd.class);
        n.S("isFirstPage", kwdVar != null && kwdVar.isFirstPage());
        if (m.R(Request.StageName.DOCUMENT_NETWORK_TTFB)) {
            obj = kwd.class;
            gldVar = m;
            str = "RUMPageExtension";
            uy8Var = n;
            uy8Var.f(Request.StageName.DOCUMENT_NETWORK_TTFB, Long.valueOf(S(this, mVar, m, Request.StageName.DOCUMENT_NETWORK_TTFB, j, false, 16, null)));
        } else {
            obj = kwd.class;
            gldVar = m;
            str = "RUMPageExtension";
            uy8Var = n;
        }
        uy8Var.S(ccs.KEY_IS_HOME_PAGE, qml.z(this.f13576a));
        String L = this.f13576a.getInstance().L();
        if (L != null && !wsq.a0(L)) {
            uy8Var.X("miniappId", this.f13576a.getInstance().L());
        }
        if (this.f13576a.getInstance().a0() == TMSSolutionType.UNIAPP) {
            uy8Var.X("uniappId", this.f13576a.getInstance().d0());
        }
        if (this.f13576a.getInstance().a0() == TMSSolutionType.MINIGAME) {
            uy8Var.X("techStack", T());
        }
        try {
            uy8Var.f("tmsEarlyInitTime", Long.valueOf(h8s.sTMSEarlyInitTime.get()));
        } catch (Throwable th) {
            TMSLogger.d(str, th);
        }
        if (this.d.containsKey("serverTraceId")) {
            uy8Var.X("documentServerTraceId", String.valueOf(this.d.get("serverTraceId")));
        }
        if (gldVar.R(Request.StageName.DOCUMENT_TTFB)) {
            gldVar2 = gldVar;
            str2 = str;
            uy8Var2 = uy8Var;
            uy8Var2.f(Request.StageName.DOCUMENT_TTFB, Long.valueOf(S(this, mVar, gldVar, Request.StageName.DOCUMENT_TTFB, j, false, 16, null)));
        } else {
            gldVar2 = gldVar;
            str2 = str;
            uy8Var2 = uy8Var;
        }
        if (gldVar2.w("webPageFirstLoad")) {
            uy8Var2.S("webPageFirstLoad", o9s.l(gldVar2.Q("webPageFirstLoad")));
            mVar.M(o9s.l(gldVar2.Q("webPageFirstLoad")));
        }
        if (gldVar2.R(Request.StageName.DOCUMENT_PREFETCH_CONSUME)) {
            gldVar3 = gldVar2;
            uy8Var2.f(Request.StageName.DOCUMENT_PREFETCH_CONSUME, Long.valueOf(S(this, mVar, gldVar2, Request.StageName.DOCUMENT_PREFETCH_CONSUME, j, false, 16, null)));
        } else {
            gldVar3 = gldVar2;
        }
        if (gldVar3.w("documentPrefetchHit")) {
            uy8Var2.S("documentPrefetchHit", o9s.l(gldVar3.Q("documentPrefetchHit")));
        }
        if (gldVar3.w("H5_snapshotMatchType")) {
            uy8Var2.X("firstChunkCache", gldVar3.Q("H5_snapshotMatchType"));
        }
        kwd kwdVar2 = (kwd) this.f13576a.getExtension(obj);
        if (kwdVar2 != null && kwdVar2.isFirstPage()) {
            f8d X = this.f13576a.getInstance().X();
            gldVar4 = gldVar3;
            X.a(new RUMPageExtension$buildChildSpan$1$1(uy8Var2, j, mVar));
            X.d(new RUMPageExtension$buildChildSpan$1$2(X, uy8Var2));
            if (gldVar4.R("instanceInitStart") && qml.z(this.f13576a)) {
                uy8Var2.f("instanceInitStart", Long.valueOf(P(mVar, gldVar4, "instanceInitStart", j, false)));
            }
            if (gldVar4.R("instanceInitEnd") && qml.z(this.f13576a)) {
                uy8Var2.f("instanceInitEnd", Long.valueOf(P(mVar, gldVar4, "instanceInitEnd", j, false)));
            }
            if (gldVar4.R("manifestParseStart")) {
                uy8Var2.f("manifestParseStart", Long.valueOf(P(mVar, gldVar4, "manifestParseStart", j, false)));
            }
            if (gldVar4.R("manifestParseEnd")) {
                uy8Var2.f("manifestParseEnd", Long.valueOf(P(mVar, gldVar4, "manifestParseEnd", j, false)));
            }
            if (gldVar4.R("ucGpuProcessReady")) {
                uy8Var2.f("ucGpuProcessReady", Long.valueOf(S(this, mVar, gldVar4, "ucGpuProcessReady", j, false, 16, null)));
            }
            if (gldVar4.R("ucRenderProcessReady")) {
                uy8Var2.f("ucRenderProcessReady", Long.valueOf(S(this, mVar, gldVar4, "ucGpuProcessReady", j, false, 16, null)));
            }
            if (gldVar4.R("H5_first_navigationStart")) {
                mVar.J(Long.valueOf(gldVar4.g("H5_first_navigationStart") + j));
            }
        } else {
            gldVar4 = gldVar3;
        }
        for (Map.Entry<String, Long> entry : this.c.entrySet()) {
            if (this.l.contains(entry.getKey())) {
                uy8Var2.f(entry.getKey(), entry.getValue());
            } else {
                this.f.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Object> entry2 : this.d.entrySet()) {
            if (this.l.contains(entry2.getKey())) {
                uy8Var2.X(entry2.getKey(), entry2.getValue().toString());
            } else {
                this.e.put(entry2.getKey(), entry2.getValue());
            }
        }
        s7d s7dVar = (s7d) this.f13576a.getExtension(s7d.class);
        dyd dydVar = (s7dVar == null || (L02 = s7dVar.L0()) == null) ? null : (dyd) L02.getExtension(dyd.class);
        s7d s7dVar2 = (s7d) this.f13576a.getExtension(s7d.class);
        if (!(s7dVar2 == null || (L0 = s7dVar2.L0()) == null)) {
            ztdVar = (ztd) L0.getExtension(ztd.class);
        }
        if (dydVar != null) {
            str3 = "tms_tab_" + dydVar.O0(this.f13576a);
        } else {
            str3 = "tms_";
        }
        if (ztdVar != null) {
            str3 = str3 + "swiper_" + ztdVar.X();
        }
        if (dydVar == null && ztdVar == null) {
            str3 = ckf.p(str3, "0");
        }
        uy8Var2.X("pageLevel", str3);
        if (gldVar4.R("packageStepStart")) {
            uy8Var2.f("packageStepStart", Long.valueOf(P(mVar, gldVar4, "packageStepStart", j, false)));
        }
        if (gldVar4.R("packageStepFinish")) {
            uy8Var2.f("packageStepFinish", Long.valueOf(P(mVar, gldVar4, "packageStepFinish", j, false)));
        }
        if (gldVar4.R("appInfoStepStart")) {
            uy8Var2.f("appInfoStepStart", Long.valueOf(P(mVar, gldVar4, "appInfoStepStart", j, false)));
        }
        if (gldVar4.R("frameworkPackageFinish")) {
            uy8Var2.f("frameworkPackageFinish", Long.valueOf(P(mVar, gldVar4, "frameworkPackageFinish", j, false)));
        }
        if (gldVar4.R("appInfoStepFinish")) {
            uy8Var2.f("appInfoStepFinish", Long.valueOf(P(mVar, gldVar4, "appInfoStepFinish", j, false)));
        }
        if (gldVar4.w("isAppInfoLocal")) {
            uy8Var2.S("isAppInfoLocal", o9s.l(gldVar4.Q("isAppInfoLocal")));
        }
        if (gldVar4.w("appInfoStrategy")) {
            uy8Var2.X("appInfoStrategy", gldVar4.Q("appInfoStrategy"));
        }
        if (gldVar4.w("mainPackageStrategy")) {
            uy8Var2.X("mainPackageStrategy", gldVar4.Q("mainPackageStrategy"));
        }
        if (gldVar4.w("frameworkPackageStrategy")) {
            uy8Var2.X("frameworkPackageStrategy", gldVar4.Q("frameworkPackageStrategy"));
        }
        if (gldVar4.R("engineLoadBundleStart")) {
            uy8Var2.f("engineLoadBundleStart", Long.valueOf(P(mVar, gldVar4, "engineLoadBundleStart", j, false)));
        }
        if (gldVar4.R("engineLoadBundleEnd")) {
            uy8Var2.f("engineLoadBundleEnd", Long.valueOf(P(mVar, gldVar4, "engineLoadBundleEnd", j, false)));
        }
        jwd jwdVar = (jwd) this.f13576a.getExtension(jwd.class);
        uy8Var2.S("hitSnapshot", jwdVar == null ? false : jwdVar.isHitSnapshot());
        try {
            gldVar4.d(new RUMPageExtension$buildChildSpan$4(uy8Var2, this));
            gldVar4.a(new RUMPageExtension$buildChildSpan$5(uy8Var2, j, this));
            if (this.e.size() != 0) {
                uy8Var2.X("tmsCustomProperties", JSON.toJSONString(this.e));
            }
            if (this.f.size() != 0) {
                uy8Var2.X("tmsCustomStages", JSON.toJSONString(this.f));
            }
        } catch (Exception e2) {
            TMSLogger.b(str2, ckf.p("IRUMPageExtension error ", e2.getMessage()));
        }
        if (this.f13576a.getInstance().a0() == TMSSolutionType.MINIGAME) {
            String f2 = this.f13576a.getInstance().S().f("canvasRuntimeType");
            if (f2 == null) {
                str4 = "";
            } else {
                str4 = f2.toLowerCase();
                ckf.f(str4, "this as java.lang.String).toLowerCase()");
            }
            uy8Var2.X("engineType", str4);
        }
        uy8Var2.X("solution", O());
        if (z) {
            uy8Var2.finish();
        }
        return uy8Var2;
    }
}
