package tb;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.r;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d6w implements u8e, dub, qtb, ytb, aub, j0q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String s = "DWInstanceManager";
    public static int t = 0;
    public static String u = "";
    private final FluidContext b;
    private final prp c;
    private final IContainerService d;
    private final IFeedsListService e;
    private long f;
    private long g;
    private boolean h;
    private atb i;
    private PageStartTimeBean j;
    private int k;
    private int l;
    private String m;
    private final c2g n;
    public int p;
    public long q;
    private HashMap<String, String> r;

    /* renamed from: a  reason: collision with root package name */
    private final Set<atb> f17626a = new HashSet();
    private boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17627a;

        public a(boolean z) {
            this.f17627a = z;
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            if (!this.f17627a) {
                return d6w.m(d6w.this);
            }
            ir9.a("重置时间戳", "setFirstRenderAdapter:" + d6w.l(d6w.this).pageStartTime);
            return d6w.l(d6w.this).pageStartTime;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f17628a;

        public b(atb atbVar) {
            this.f17628a = atbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f17628a.pauseVideo();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f17629a;

        public c(atb atbVar) {
            this.f17629a = atbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            atb atbVar = this.f17629a;
            if (atbVar != null) {
                atbVar.destroy();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements IMediaService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.fluid.framework.media.IMediaService.a
        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3036fc9", new Object[]{this});
            } else if (d6w.o(d6w.this) != null) {
                d6w.x(d6w.this);
                d6w.F(d6w.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f17631a;

        public e(ViewGroup viewGroup) {
            this.f17631a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f17631a.getWidth() == 0 || this.f17631a.getHeight() == 0) {
                HashMap<String, String> c = xau.c(true, d6w.G(d6w.this).P(), (ViewGroup) d6w.G(d6w.this).W(), this.f17631a);
                ir9.b(d6w.s, "requestLayout in onVideoStart for size is 0, property: " + JSON.toJSONString(c));
                d6w.G(d6w.this).P1(this.f17631a);
                xau.Q(c);
            }
        }
    }

    static {
        t2o.a(468714076);
        t2o.a(468714071);
        t2o.a(452985015);
        t2o.a(452985045);
        t2o.a(452985011);
        t2o.a(452985012);
        t2o.a(468714141);
    }

    public d6w(prp prpVar) {
        FluidContext U = prpVar.U();
        this.b = U;
        this.c = prpVar;
        IContainerService iContainerService = (IContainerService) U.getService(IContainerService.class);
        this.d = iContainerService;
        this.n = new c2g(prpVar);
        if (iContainerService == null) {
            FluidException.throwServiceNotFoundException(U, IContainerService.class);
        }
        this.e = (IFeedsListService) U.getService(IFeedsListService.class);
        prpVar.N().addCardLifecycleListener(this);
    }

    public static /* synthetic */ void F(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffc44e6", new Object[]{d6wVar});
        } else {
            d6wVar.h0();
        }
    }

    public static /* synthetic */ prp G(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("f6c8ac7b", new Object[]{d6wVar});
        }
        return d6wVar.c;
    }

    private boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f82c9a8", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableClearShareDwInstance", true);
    }

    private boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e2bb5fd", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableRequestMediaPlayerMute", true);
    }

    private String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab588e81", new Object[]{this});
        }
        prp prpVar = this.c;
        int M = prpVar != null ? prpVar.M() : -1;
        prp prpVar2 = this.c;
        String str = "null";
        String P = prpVar2 != null ? prpVar2.P() : str;
        atb atbVar = this.i;
        if (atbVar != null) {
            str = atbVar.t();
        }
        return "@ pos:" + M + "  contentId:" + P + "  dwToken:" + str;
    }

    private boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b238510e", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCutSeek0", false);
    }

    private boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e954ff00", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDestoryMissMatchDW", true);
    }

    private boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bd0b61e", new Object[]{this})).booleanValue();
        }
        if (!eps.c()) {
            return this.e.isFastScroll();
        }
        if (this.e.getListSpeed() == 2) {
            return true;
        }
        return false;
    }

    private boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7bcb8", new Object[]{this})).booleanValue();
        }
        if (((ILifecycleService) this.c.U().getService(ILifecycleService.class)).getPageState() > 2) {
            return true;
        }
        return false;
    }

    private void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf76218", new Object[]{this});
            return;
        }
        this.i.g(this);
        this.i.j(this);
    }

    private void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5566828", new Object[]{this});
        } else {
            this.i.d(this);
        }
    }

    private void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f11a5f", new Object[]{this});
        } else {
            this.i.D(this);
        }
    }

    private void k0() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7ded0b", new Object[]{this});
            return;
        }
        int f = this.c.T().f();
        if (this.c.A1().m() == f && xau.w(this.c.U()) == f) {
            z = false;
        } else {
            z = true;
        }
        if (this.c.D1() != null && z) {
            ir9.a(prp.TAG, "PickPreloadController，onStartMedia updateIndex=:" + f + " OldIndex=" + this.c.A1().m());
            this.i.e(this.c.A1().n(this.c.D1()));
            this.i.c(d5w.k(this.c.U(), f, this.c.D1().f7800a, false, true));
            this.c.A1().u(f);
        }
    }

    public static /* synthetic */ PageStartTimeBean l(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("492809f5", new Object[]{d6wVar});
        }
        return d6wVar.j;
    }

    private void l0(String... strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f3b62c", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            HashMap<String, String> hashMap = new HashMap<>();
            while (true) {
                int i2 = i + 1;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i], strArr[i2]);
                i += 2;
            }
            atb atbVar = this.i;
            if (atbVar != null) {
                atbVar.c(hashMap);
                return;
            }
            if (this.r == null) {
                this.r = new HashMap<>();
            }
            this.r.putAll(hashMap);
        }
    }

    public static /* synthetic */ long m(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a6e607d", new Object[]{d6wVar})).longValue();
        }
        return d6wVar.f;
    }

    private String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea441fed", new Object[]{this});
        }
        ir9.b(prp.TAG, "onRequestMediaPlayer(),id" + this.c.D1().t());
        s0j.a(s0j.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
        String b2 = pto.b(this.c.U());
        ryr.b(this.c.R(), b2, "gg_videoMutiTab_createDWInstance");
        this.c.A1().t(System.currentTimeMillis());
        this.f = 0L;
        return b2;
    }

    public static /* synthetic */ atb o(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("77d3fb7b", new Object[]{d6wVar});
        }
        return d6wVar.i;
    }

    public static /* synthetic */ void x(d6w d6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ccf8c7", new Object[]{d6wVar});
        } else {
            d6wVar.i0();
        }
    }

    @Override // tb.u8e
    public Set<atb> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7a983551", new Object[]{this});
        }
        return this.f17626a;
    }

    @Override // tb.u8e
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49ad52b", new Object[]{this});
        } else if (this.i != null) {
            b5w.F(this.c, "finished");
            int a2 = d69.a(this.c.U());
            if (a2 == 1) {
                this.i.setVideoLoop(false);
                this.c.F0().onVideoStateChanged(this.c, 3);
                this.c.G0().onVideoStateChanged(this.c, 3);
                if (a2 == 1) {
                    ((IFeedsListService) this.b.getService(IFeedsListService.class)).publicNextVideo();
                }
            } else {
                this.i.setVideoLoop(true);
                this.c.V0(false);
                this.c.F0().onVideoStateChanged(this.c, 2);
                this.c.G0().onVideoStateChanged(this.c, 2);
                e0();
            }
            this.c.y1().l0();
        }
    }

    @Override // tb.u8e
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d01db5e", new Object[]{this});
            return;
        }
        try {
            this.i.q("guangguang", true, this.c.A1().n(this.c.D1()));
        } catch (Throwable th) {
            ir9.c(prp.TAG, "", th);
            s19.d(this.c, "errorSwitch");
        }
    }

    @Override // tb.u8e
    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43daec24", new Object[]{this})).booleanValue();
        }
        if (t < 3) {
            return true;
        }
        return false;
    }

    @Override // tb.u8e
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43dfbcac", new Object[]{this})).booleanValue();
        }
        return this.c.w1().m();
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1930402b", new Object[]{this});
        } else {
            s();
        }
    }

    public void S(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f4cce", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
                nwv.A0(new e(viewGroup), akt.w2("ShortVideo.ensureLayoutDelayTime", 100));
            }
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb0baa3e", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6993566c", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    @Override // tb.u8e
    public atb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("26b6f08b", new Object[]{this});
        }
        return null;
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        if (this.i.getVideoState() == 2) {
            return true;
        }
        return false;
    }

    @Override // tb.u8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        atb atbVar = this.i;
        if (atbVar != null) {
            atbVar.b();
        }
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db072b54", new Object[]{this});
        } else {
            ((IContainerService) this.c.U().getService(IContainerService.class)).addSizedChangeListener(this);
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdfa3ea", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.v(this.c);
        e59.f(this.c.r1());
    }

    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb745a4", new Object[]{this});
            return;
        }
        IMediaService iMediaService = (IMediaService) this.c.U().getService(IMediaService.class);
        if (this.i != null && iMediaService != null && iMediaService.getCurrentPlayInstance() == this.i) {
            iMediaService.setCurrentPlayInstance(null);
        }
    }

    @Override // tb.u8e
    public atb getDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("3f62c678", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.u8e
    public int getVideoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72dc8105", new Object[]{this})).intValue();
        }
        return this.k;
    }

    @Override // tb.u8e
    public int getVideoProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbd9778c", new Object[]{this})).intValue();
        }
        return this.l;
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        this.c.F0().hook(this.c);
        this.c.G0().hook(this.c);
        return false;
    }

    @Override // tb.u8e
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        atb atbVar = this.i;
        if (atbVar == null || atbVar.getVideoState() != 1) {
            return false;
        }
        return true;
    }

    @Override // tb.u8e
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182fe307", new Object[]{this, str});
        } else {
            this.c.w1().F(str, true);
        }
    }

    public void j0(atb atbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef52513", new Object[]{this, atbVar, new Boolean(z)});
            return;
        }
        IMediaService iMediaService = (IMediaService) this.c.U().getService(IMediaService.class);
        if (!z && iMediaService != null) {
            iMediaService.setCurrentPlayInstance(atbVar);
            iMediaService.setOnStateChangeFromSmallWindowToNormal(new d());
        }
    }

    @Override // tb.u8e
    public int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e26ced8", new Object[]{this, new Integer(i)})).intValue();
        }
        return ahw.b(this.c.y1().d0(), i);
    }

    @Override // tb.u8e
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854e018c", new Object[]{this});
        }
        return u;
    }

    @Override // tb.u8e, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_ACTIVE_TS, String.valueOf(System.currentTimeMillis()));
        this.f = System.currentTimeMillis();
        this.g = SystemClock.uptimeMillis();
    }

    @Override // tb.u8e, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_APPEAR_TS, String.valueOf(System.currentTimeMillis()));
        try {
            khl.b(this.b, this.i.getView(), this.c.G1().b(), "appear", T());
        } catch (Exception unused) {
            ir9.b(s, "resumep2ff fail" + T());
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        C();
        c0();
        this.j = hol.a(this.c.U());
    }

    @Override // tb.u8e, tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else {
            l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_DISATIVE_TS, String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_DISAPPEAR_TS, String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        this.c.F0().onLoopCompletion(this.c);
        this.c.G0().onLoopCompletion(this.c);
    }

    @Override // tb.u8e, tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
        } else if (this.i != null) {
            ir9.b(prp.TAG, "onPauseMedia(),id=" + this.c.P());
            az9.o(new b(this.i), 3003, 200L, "video_pause");
        }
    }

    @Override // tb.u8e, tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.u8e, tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.u8e, tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        ir9.b(s, "videotrack video onVideoClose");
        this.c.F0().onVideoClose(this.c);
        this.c.G0().onVideoClose(this.c);
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        ir9.b(s, "videotrack video onVideoComplete");
        this.c.F0().onVideoComplete(this.c);
        this.c.G0().onVideoComplete(this.c);
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.F0().onVideoError(this.c, obj, i, i2);
        this.c.G0().onVideoError(this.c, obj, i, i2);
        atb atbVar = this.i;
        if (atbVar != null) {
            this.c.m0(atbVar.getView());
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ir9.b(s, "videoplaystate oprogressloading onVideoPlay");
        this.c.F0().onVideoPlay(this.c);
        this.c.G0().onVideoPlay(this.c);
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        ir9.b(s, "videotrack video onVideoScreenChanged");
        this.c.F0().onVideoScreenChanged(this.c, dWVideoScreenType);
        this.c.G0().onVideoScreenChanged(this.c, dWVideoScreenType);
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(s, "videoplaystate videotrack video onVideoSeekTo(). mSeekBarLayer.mCurrentProgress=" + this.c.y1().W() + " seekTo=" + i);
        this.c.F0().onVideoSeekTo(this.c, i);
        this.c.G0().onVideoSeekTo(this.c, i);
        this.p = i;
        this.q = System.currentTimeMillis();
    }

    @Override // tb.u8e, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_WILL_ACTIVE_TS, String.valueOf(System.currentTimeMillis()));
        boolean X = X();
        ir9.b(s, "CardLifecycle video cardo ShortVideoCard.onWillActive " + this.c.M() + " isFastScroll=" + X);
        if (X) {
            z();
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_WILL_DISACTIVE_TS, String.valueOf(System.currentTimeMillis()));
        f0();
        this.c.U1(false);
    }

    @Override // tb.u8e
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38660bd", new Object[]{this});
            return;
        }
        i0();
        h0();
    }

    @Override // tb.u8e
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411cba09", new Object[]{this});
        } else if (this.i != null) {
            boolean isFirstSetAdapter = ((ITrackService) this.b.getService(ITrackService.class)).isFirstSetAdapter();
            ((ITrackService) this.b.getService(ITrackService.class)).setFirstSetAdapter(false);
            this.i.l(new a(isFirstSetAdapter));
        }
    }

    @Override // tb.u8e
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31293b6", new Object[]{this});
        } else if (W()) {
            if (Q()) {
                r e2 = this.c.v1().e();
                if (e2 != null) {
                    ir9.b(prp.TAG, "isContentValid为false，双列流续播播放器清空");
                    ViewGroup K = e2.K();
                    if (K != null && (K.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) K.getParent()).removeView(K);
                    }
                    e2.y();
                }
                String h = ogi.e().h(this.b.getInstanceConfig().getPreCoverKey());
                g7m.o().e(true, h);
                ogi.e().c();
                g7m.o().f(h);
            }
            atb dWInstance = ((ISharePlayerService) this.c.U().getService(ISharePlayerService.class)).getDWInstance();
            if (dWInstance != null) {
                ViewGroup view = dWInstance.getView();
                if (view != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                dWInstance.destroy();
                ((ISharePlayerService) this.c.U().getService(ISharePlayerService.class)).setDWInstance(null);
            }
        }
    }

    @Override // tb.u8e
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        atb atbVar = this.i;
        if (atbVar != null) {
            atbVar.setPlayRate(f);
        }
    }

    @Override // tb.u8e
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c546b5b7", new Object[]{this});
        }
        return this.c.w1().o();
    }

    @Override // tb.u8e
    public void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f)});
            return;
        }
        ir9.b(mer.TAG, "videotrack 11 video setPlayerVolume " + f + " ; mute:" + mfj.u(this.c.U()));
        if (this.i != null && !mfj.u(this.c.U())) {
            this.i.setVolume(f);
        }
    }

    @Override // tb.u8e
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
            return;
        }
        atb atbVar = this.i;
        if (atbVar != null && (map instanceof HashMap)) {
            atbVar.e((HashMap) map);
        }
    }

    @Override // tb.dub
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b78bc7", new Object[]{this});
            return;
        }
        this.c.F0().onPreCompletion(this.c);
        this.c.G0().onPreCompletion(this.c);
        d0();
    }

    @Override // tb.u8e
    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf700a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        atb atbVar = this.i;
        if (atbVar != null) {
            atbVar.w(i, z);
        }
    }

    @Override // tb.u8e
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7aa3ec", new Object[]{this});
        } else if (this.i != null && a0()) {
            this.i.playVideo();
        }
    }

    private void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aff9d06", new Object[]{this});
            return;
        }
        try {
            if (this.c.Z().n() instanceof fsp) {
                ((fsp) this.c.Z().n()).O(true);
            }
        } catch (Exception e2) {
            ir9.c(s, "markVCardVideoStarted error", e2);
        }
    }

    private void m0(String str, boolean z, boolean z2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed1db96", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        s0j.f(this.c.R(), this.i, this.c.U());
        long currentTimeMillis = System.currentTimeMillis();
        s0j.m(this.c.U(), currentTimeMillis - this.c.A1().l());
        this.c.A1().t(currentTimeMillis);
        ir9.a(prp.TAG, "video count=" + t);
        this.c.t1().a();
        this.c.T().r(false);
        s0j.d(s0j.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "1";
        } else if (z2) {
            str2 = "2";
        } else {
            str2 = "0";
        }
        hashMap.put("dwType", str2);
        ryr.d(this.c.R(), str, "gg_videoMutiTab_createDWInstance", hashMap);
    }

    private void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4577024", new Object[]{this});
            return;
        }
        TUrlImageView loadingImage = ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).getLoadingImage();
        if (loadingImage != null) {
            int i = R.id.fluid_sdk_tag_prerender_videosize_object;
            if (loadingImage.getTag(i) instanceof r8e) {
                this.i.getView().setTag(i, loadingImage.getTag(i));
                this.c.G1().g("reuse-loading", false);
                loadingImage.setTag(i, null);
            }
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        HashMap<String, String> hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_BIND_TS, String.valueOf(System.currentTimeMillis()));
        if (!this.c.j0()) {
            P();
        }
    }

    @Override // tb.u8e, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        l0(atb.EXP_KEY_FULL_PAGE_CARD_LIFE_RECYCLE_TS, String.valueOf(System.currentTimeMillis()));
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.g;
        long j2 = uptimeMillis - j;
        if (j > 0) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("gg_card_stay_time", String.valueOf(j2));
            pcw.z(this.i, hashMap);
        }
        ir9.b(s, "onRecycle  elapsedTime=" + j2 + " ; stayTimeStart=" + this.g);
        this.g = 0L;
    }

    @Override // tb.j0q
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.c.D1() != null) {
            ir9.b(prp.TAG, "全屏页内部画幅计算，收到sizeChange回调");
            this.c.G1().g("onTabletRotate", true);
            ir9.a(prp.TAG, "onRequestMediaByViewSharePlayer 增加videoView");
        }
        atb atbVar = this.i;
        if (atbVar != null) {
            ViewGroup view = atbVar.getView();
            FrameLayout.LayoutParams b2 = this.c.G1().b();
            view.setLayoutParams(b2);
            ir9.b(s, "rotate update, view: " + view + " ,layoutParams width:" + b2.width + " height:" + b2.height);
            this.i.f(b2.width, b2.height);
        }
    }

    @Override // tb.u8e, tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(prp.TAG, "videotrack oprogressloading video onStopMedia,id=" + this.c.P());
        this.c.z1().e = false;
        if (this.i != null) {
            if (V()) {
                this.i.seekTo(0);
            }
            prp prpVar = this.c;
            prpVar.onPauseMedia(prpVar);
            f0();
        }
        this.c.y1().t0(0.0f);
        this.c.y1().z0(0, 0);
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(s, "videoplaystate oprogressloading onVideoPause b=" + z);
        this.c.F0().onVideoPause(this.c, z);
        this.c.F0().onVideoStateChanged(this.c, 0);
        this.c.G0().onVideoPause(this.c, z);
        this.c.G0().onVideoStateChanged(this.c, 0);
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.c.F0().onVideoStart(this.c);
        this.c.G0().onVideoStart(this.c);
        this.c.F0().onVideoStateChanged(this.c, 1);
        ir9.b(s, "videoplaystate oprogressloading onVideoStart");
        atb atbVar = this.i;
        ViewGroup view = atbVar != null ? atbVar.getView() : null;
        if (view != null) {
            this.c.m0(view);
            S(view);
        }
    }

    private boolean I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84204210", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!M(z) || !N() || !O() || Z()) {
            return false;
        }
        if (!this.o || this.i.getVideoState() != 1) {
            return true;
        }
        ir9.b(s, "onStartMedia,videoAppearPlay如果是appear提前播放，再次调用start的时候需要将播放器声音还原:" + this.o + ", mDWInstance.getVideoState():" + this.i.getVideoState());
        this.i.mute(mfj.u(this.b));
        this.o = false;
        j0(this.i, false);
        return false;
    }

    private boolean M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a30f17e1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.i == null || pcw.d(this.b)) {
            return false;
        }
        if (!this.i.E() || z) {
            return true;
        }
        ir9.b(s, "checkDWInstance videoAppearPlay isPausedBeforeDisappear：" + this.i.E() + "，forcePlay：" + z);
        return false;
    }

    private boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbac21d", new Object[]{this})).booleanValue();
        }
        if (!kgv.INSTANCE.f(this.b)) {
            return true;
        }
        ir9.b(s, "videoAppearPlay VideoProcess VideoComponentsController.onStartMedia(), UnderageModeHelper 青少年模式时间限制，禁止播放");
        return false;
    }

    private boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe7a67f", new Object[]{this})).booleanValue();
        }
        boolean z = l9f.f().b;
        if (!this.c.O1() || (this.i.getVideoState() != 1 && (z || this.i.getVideoState() != 8))) {
            return true;
        }
        ir9.b(s, "videoAppearPlay onStartMedia,innerSharePlayerBackToFullVideoPage:" + z + ", mDWInstance.getVideoState():" + this.i.getVideoState() + ",mIsWillActive:" + this.c.O1());
        return false;
    }

    public void d0() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734d5b5a", new Object[]{this});
        } else if (this.i != null) {
            xau.u();
            ir9.b(prp.TAG, "playerlifecycle IVideoPreCompleteListener.onPreCompletion id:" + this.c.P());
            b5w.F(this.c, "finished");
            ICollectionService iCollectionService = (ICollectionService) this.b.getService(ICollectionService.class);
            kon.h collectionNextVideo = iCollectionService != null ? iCollectionService.getCollectionNextVideo() : null;
            boolean o = this.c.t1().c().o();
            boolean z3 = collectionNextVideo != null && !o && !this.c.w1().d && !iCollectionService.checkDialogPopup();
            if (z3) {
                iCollectionService.playCollectionNextVideo();
            }
            ir9.b(prp.TAG, "【onDWVideoPreComplete】playCollectionNext, canPlayCollectionNextVideo: " + z3 + "，isLandscape: " + o);
            int a2 = d69.a(this.c.U());
            if (a2 == 1) {
                this.i.setVideoLoop(false);
                this.c.F0().onVideoStateChanged(this.c, 3);
                this.c.G0().onVideoStateChanged(this.c, 3);
                if (!z3) {
                    if (this.c.M1()) {
                        this.c.z1().v("finished", "next", this.c);
                    } else {
                        ((IFeedsListService) this.b.getService(IFeedsListService.class)).publicNextVideo();
                        z = true;
                        ir9.b(prp.TAG, "trackPlayCompleted nextVideo=" + a2 + ",isHookVideoEndGuidePersonPage=" + this.c.M1());
                        if (a2 != 2 || this.c.M1() || z3) {
                            z2 = true;
                        }
                        xau.T(this.c.U(), z, z2);
                        this.c.y1().l0();
                    }
                }
            } else {
                this.i.setVideoLoop(false);
                if (!z3) {
                    if (this.c.M1()) {
                        this.c.z1().v("finished", "loop", this.c);
                    } else {
                        this.i.setVideoLoop(true);
                        e0();
                    }
                }
                this.c.F0().onVideoStateChanged(this.c, 2);
                this.c.G0().onVideoStateChanged(this.c, 2);
            }
            z = false;
            ir9.b(prp.TAG, "trackPlayCompleted nextVideo=" + a2 + ",isHookVideoEndGuidePersonPage=" + this.c.M1());
            if (a2 != 2) {
            }
            z2 = true;
            xau.T(this.c.U(), z, z2);
            this.c.y1().l0();
        }
    }

    @Override // tb.u8e, tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        this.c.B1().U();
        if (this.i != null) {
            ir9.b(prp.TAG, "PickPreloadController，cflog CardLifecycle onRecyclePlayer " + this.c.M() + ",id=" + this.c.P());
            this.c.s1().d = false;
            if (this.c.F1().R() != null) {
                this.c.x1().T(this.c.F1().R(), z);
                this.c.F1().V(null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            az9.o(new c(this.i), 3003, 200L, "video_destroy");
            s0j.j(this.c.U(), System.currentTimeMillis() - currentTimeMillis);
            this.f17626a.remove(this.i);
            this.i = null;
            t--;
            ir9.a(prp.TAG, "video count=" + t);
        }
    }

    @Override // tb.u8e, tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
        } else if (this.i == null && this.c.D1() != null) {
            if (this.c.Z() != null) {
                com.taobao.android.fluid.framework.data.datamodel.a Z = this.c.Z();
                l0(atb.EXP_KEY_FULL_PAGE_PREDOWNLOAD_START_TS, String.valueOf(Z.e));
                l0(atb.EXP_KEY_FULL_PAGE_PREDOWNLOAD_FINISH_TS, String.valueOf(Z.f));
                l0(atb.EXP_KEY_FULL_PAGE_PREDOWNLOAD_SIZE, String.valueOf(Z.g));
                l0(atb.EXP_KEY_FULL_PAGE_PREDOWNLOAD_CANEL_INFO, String.valueOf(Z.i));
                l0(atb.EXP_KEY_FULL_PAGE_PREDOWNLOAD_ERROR_INFO, String.valueOf(Z.h));
            }
            l0(atb.EXP_KEY_FULL_PAGE_IS_FINGER_LEAVE_PLAY, "true");
            l0(atb.EXP_KEY_FULL_PAGE_IS_APPEAR_PLAY, String.valueOf(c5w.a()));
            this.c.T1(false);
            String n0 = n0();
            this.c.s1().w();
            boolean b2 = this.c.v1().b();
            boolean l = this.c.s1().l();
            ir9.b(s, "isSharePlayerView:" + b2 + ",isInnerSharePlayerView:" + l);
            if (b2) {
                this.i = this.c.v1().a();
                this.m = "continuePlayOutside";
            } else if (l) {
                this.i = this.c.s1().k();
                this.m = "continuePlayInside";
            }
            if (this.c.o1().a()) {
                ir9.b(s, "预创建");
                this.i = this.c.o1().b();
                z = this.c.o1().e();
                this.c.G1().g("reuse-precreate", false);
            } else if (this.i == null || (!b2 && !l)) {
                this.i = this.c.m1().d();
                this.m = "normal";
                o0();
                r();
                z = false;
            } else {
                this.c.s1().v(this.i, b2, l);
                s0j.d(s0j.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            s0j.i(this.c.U(), currentTimeMillis - this.c.A1().l());
            this.c.A1().t(currentTimeMillis);
            ViewParent parent = this.c.B1().Q().getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c.B1().Q());
            }
            if (akt.p2("ShortVideo.enableClosePlayFadeIn", true)) {
                this.i.n(false);
            }
            if (R()) {
                mfj.z(this.c.U(), this.i, this.c.U().getContext(), mfj.u(this.c.U()));
            }
            ICollectionService iCollectionService = (ICollectionService) this.b.getService(ICollectionService.class);
            if (!iCollectionService.checkDialogPopup() || !iCollectionService.checkPopupFisrtTime() || !iCollectionService.checkResizeVideo()) {
                ir9.b(s, "设置了封面图，yes");
                this.i.s(this.c.B1().Q());
            } else {
                ir9.b(s, "设置了封面图，false");
            }
            p();
            this.i.getView().setTag(R.id.fluid_sdk_content_key, this.c.P());
            this.c.F1().V(this.i.getView());
            this.c.F1().U(this.c.F1().R(), this.c.G1().b());
            s19.x(this.c, this.i.t());
            if (!z) {
                if (chi.a()) {
                    if (!pto.g(this.c.U()) && !d69.b()) {
                        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.W(this.c, "play");
                        ir9.b(prp.TAG, "[上下滑] videoplaystate videotrack IDWVideoLifecycleListener FirstFrame onRequestMediaPlayer dw.start(). index=" + this.c.M());
                        this.i.start();
                    }
                } else if (!X()) {
                    b0();
                    this.i.prepareToFirstFrame();
                    ir9.b(s, "[上下滑] p2ff addview result:" + khl.a(this.b, this.i, this.d.getMainContentView(), T()) + T());
                } else {
                    ir9.b(prp.TAG, "[上下滑] ignore prepareToFirstFrame() for fast scroll.. index=" + this.c.M());
                }
            }
            this.c.y1().x0(this.c.D1().d());
            t++;
            prp prpVar = this.c;
            prpVar.E.put("totalTime", String.valueOf(prpVar.D1().d() / 1000));
            this.c.E.put(tmu.CURRENT_TIME, "0");
            if (this.i != null && sz3.e(this.r)) {
                this.i.c(this.r);
                this.r.clear();
                this.r = null;
            }
            m0(n0, z, b2);
        }
    }

    @Override // tb.u8e, tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        ir9.b(prp.TAG, "VideoProcess ShortVideoCard.onStartMedia(), forcePlay:" + z + ",id:" + this.c.P());
        this.c.z1().e = false;
        if (I(z)) {
            b5w.F(this.c, "play");
            k0();
            this.o = c5w.b(this.b, this.i, z2);
            ir9.b(s, "onStartMedia,videoAppearPlay是否是提前起播并设置播放器静音:" + this.o);
            r e2 = this.c.v1().e();
            if (this.c.v1().b()) {
                e2.V(mfj.u(this.c.U()));
                if (a0()) {
                    this.i.playVideo();
                } else {
                    b0();
                    this.i.start();
                }
            } else if (a0()) {
                this.i.playVideo();
            } else {
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.W(this.c, "play");
                b0();
                this.i.start();
                this.i.c(d5w.w(true));
            }
            j0(this.i, z2);
            g0();
            ir9.a("changfeng", "VideoProcess ShortVideoCard.onStartMedia() end");
            prp prpVar = this.c;
            if (prpVar.D1() != null) {
                str = this.c.D1().t();
            } else {
                str = "";
            }
            v5w.a(prpVar, str);
            v5w.b(this.c);
            l9f.f().b = false;
            c2g c2gVar = this.n;
            if (c2gVar != null) {
                c2gVar.e();
            }
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        this.c.F0().onVideoPrepared(this.c, obj);
        this.c.G0().onVideoPrepared(this.c, obj);
        this.c.s1().d = false;
        ir9.b(s, "videoplaystate IDWVideoLifecycleListener onVideoPrepared() " + this.i);
        if ((chi.a() && !this.c.h0() && !this.c.O1() && this.i != null) || (this.i != null && ((ILifecycleService) this.c.U().getService(ILifecycleService.class)).getPageState() > 2)) {
            ir9.b(s, "IDWVideoLifecycleListener onVideoPrepared() pauseVideo");
            this.i.pauseVideo();
        }
        atb atbVar = this.i;
        if (atbVar != null && !this.o) {
            atbVar.mute(mfj.u(this.c.U()));
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = i / 1000;
        if (this.l != i4) {
            this.k = i3 / 1000;
            this.l = i4;
        }
        this.c.F0().onVideoProgressChanged(this.c, i, i2, i3);
        this.c.G0().onVideoProgressChanged(this.c, i, i2, i3);
        boolean t2 = this.c.s1().t();
        if (t2) {
            ir9.a(s, "onVideoProgressChanged，全屏页收到双列流是否首帧渲染完成：" + t2 + "，开关是否打开：" + chi.c());
            ((IContainerService) this.b.getService(IContainerService.class)).onFirstCardRenderSuccess(this.c);
            this.h = true;
            this.c.s1().j(true);
        }
        if (this.p > 0 && this.c.y1().W() != i && i > this.p) {
            this.p = -1;
            ir9.b(s, "seek到进度条变化的时间差：" + (System.currentTimeMillis() - this.q));
        }
        this.c.y1().p0(i);
        this.c.y1().o0(i2);
        this.c.y1().w0(i3);
        if (!this.c.y1().i0()) {
            this.c.y1().u0(0.0f, Math.max(i3, 0));
            this.c.y1().t0(i);
            this.c.y1().z0(i, i3);
        }
        if (this.c.z1().d != i4) {
            this.c.z1().G(i3 / 1000, this.c.z1().d);
        }
        c2g c2gVar = this.n;
        if (c2gVar != null) {
            c2gVar.o(i);
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        this.c.F0().onVideoInfo(this.c, obj, j, j2, j3, obj2);
        this.c.G0().onVideoInfo(this.c, obj, j, j2, j3, obj2);
        if (3 == j && (atbVar = this.i) != null) {
            this.c.m0(atbVar.getView());
        } else if (13000 == j) {
            ir9.b(s, "p2ff success" + T());
            atb atbVar2 = this.i;
            if (atbVar2 != null) {
                try {
                    khl.b(this.b, atbVar2.getView(), this.c.G1().b(), "p2ff success", T());
                } catch (Exception unused) {
                    ir9.b(s, "resumep2ff fail" + T());
                }
            }
        }
    }
}
