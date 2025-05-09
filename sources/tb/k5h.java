package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.live.livestatus.LiveStatus;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.f4h;
import tb.y4h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class k5h extends ici implements f4h.d, csc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "直播卡";
    private static final String U = "LiveVideoCard";
    private final wwg L;
    private final f4h O;
    private a.c P;
    private boolean R;
    private String S;
    private Runnable T = new a();
    public final vq9 H = new vq9(this);
    private final vwg I = new vwg(this);
    private final hxg J = new hxg(this);
    private final r9w K = new r9w(this);
    private final p2h N = new p2h(this);
    private n5h Q = new n5h(this);
    private final y4h M = new y4h();

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
            } else {
                ((ICardService) k5h.b1(k5h.this).getService(ICardService.class)).notifyCardHealthyChange(k5h.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements y4h.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f22417a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveStatus f22418a;

            public a(LiveStatus liveStatus) {
                this.f22418a = liveStatus;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TextUtils.equals(k5h.this.j1(), this.f22418a.getId())) {
                    ir9.b(k5h.U, "[直播状态检查] 执行自动下滑。");
                    ((IFeedsListService) k5h.e1(k5h.this).getService(IFeedsListService.class)).publicNextVideo();
                }
            }
        }

        public b(Set set) {
            this.f22417a = set;
        }

        public void a(LiveStatus liveStatus) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ef404c", new Object[]{this, liveStatus});
                return;
            }
            try {
                str = ((IFeedsListService) k5h.c1(k5h.this).getService(IFeedsListService.class)).getActiveCard().P();
            } catch (Exception e) {
                ir9.b(k5h.U, "[直播状态检查] activeCardContentid 获取当前卡片异常, " + e.getMessage());
                str = "";
            }
            ir9.b(k5h.U, "[直播状态检查] checkLiveStatusAndSlideDown activeCardContentid=" + str + " vs " + liveStatus.getId() + "; liveStatus=" + liveStatus);
            if (TextUtils.equals(str, liveStatus.getId()) && TextUtils.equals(liveStatus.getRoomStatus(), "2")) {
                ir9.b(k5h.U, "[直播状态检查] checkLiveStatusAndSlideDown 直播已下线，自动下滑");
                h1u.a(k5h.d1(k5h.this), "直播已结束");
                this.f22417a.add(k5h.this.j1());
                uyr.c(new a(liveStatus), b93.y());
            }
        }
    }

    static {
        t2o.a(468713959);
        t2o.a(468714525);
        t2o.a(468713975);
        t2o.a(468714534);
    }

    public k5h(FluidContext fluidContext) {
        super(fluidContext);
        this.L = new wwg(fluidContext, this);
        f4h f4hVar = new f4h(this);
        this.O = f4hVar;
        this.B.addMediaPlayerListener(this);
        f4hVar.d(this);
    }

    private void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a638c29", new Object[]{this});
        } else if (this.J.getDWInstance() != null) {
            if (this.J.getDWInstance().getVideoState() == 2) {
                this.J.getDWInstance().playVideo();
            } else {
                this.J.getDWInstance().start();
            }
            this.J.getDWInstance().c(d5w.w(true));
        }
    }

    public static /* synthetic */ FluidContext b1(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("c59d9ac0", new Object[]{k5hVar});
        }
        return k5hVar.f29555a;
    }

    public static /* synthetic */ FluidContext c1(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("3bb3bd1f", new Object[]{k5hVar});
        }
        return k5hVar.f29555a;
    }

    public static /* synthetic */ Context d1(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("22e6c582", new Object[]{k5hVar});
        }
        return k5hVar.o;
    }

    public static /* synthetic */ FluidContext e1(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("27e001dd", new Object[]{k5hVar});
        }
        return k5hVar.f29555a;
    }

    public static /* synthetic */ Object ipc$super(k5h k5hVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1836003525:
                super.onWillDisActive((uq9) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1249298707:
                super.onDisActive((uq9) objArr[0]);
                return null;
            case -1123719365:
                super.onStopMedia((uq9) objArr[0]);
                return null;
            case -372824644:
                super.onDisAppear((uq9) objArr[0]);
                return null;
            case -147728739:
                super.onActive((uq9) objArr[0]);
                return null;
            case 549494067:
                super.o0();
                return null;
            case 610311722:
                super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 715537612:
                super.onRecycle((uq9) objArr[0]);
                return null;
            case 728745324:
                super.onAppear((uq9) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1174610341:
                super.onPauseMedia((uq9) objArr[0]);
                return null;
            case 1531961849:
                super.onStartMedia((uq9) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return null;
            case 2063982600:
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            case 2072452071:
                super.onRecyclePlayer((uq9) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/LiveVideoCard");
        }
    }

    private boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ca2890c", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDisactiveDestroyLive", true);
    }

    private void s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a9a8ee", new Object[]{this});
            return;
        }
        uyr.a(this.T);
        uyr.c(this.T, 1000);
    }

    private void w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2543ffa7", new Object[]{this});
            return;
        }
        x1();
        t1();
    }

    public void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a689cdb", new Object[]{this});
        } else if (this.J.getDWInstance() != null) {
            mfj.A(this.f29555a, this.J.getDWInstance());
        }
    }

    @Override // tb.ulb
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a3ace76", new Object[]{this})).intValue();
        }
        return R.layout.fluid_sdk_ly_livevideo_card;
    }

    @Override // tb.ulb
    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5435485a", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // tb.uq9
    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f5131d", new Object[]{this});
        }
        return j1();
    }

    @Override // tb.ici
    public void Z0(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        } else {
            this.I.d0(bool, bool2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        } else if (this.J.getDWInstance() != null) {
            this.J.getDWInstance().b();
        }
    }

    public boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dec7d8d", new Object[]{this})).booleanValue();
        }
        return this.R;
    }

    public void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7efa9", new Object[]{this});
        } else if (b93.d()) {
            Set<String> offlineLiveIdList = ((ICardService) this.f29555a.getService(ICardService.class)).getOfflineLiveIdList();
            if (offlineLiveIdList.contains(j1())) {
                ir9.b(U, "[直播状态检查] checkLiveStatusAndSlideDown 改直播已下滑过，无需重复自动下滑");
            } else {
                this.M.a(j1(), null, new b(offlineLiveIdList));
            }
        }
    }

    public vwg h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwg) ipChange.ipc$dispatch("63539624", new Object[]{this});
        }
        return this.I;
    }

    @Override // tb.csc
    public boolean hook(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e726267f", new Object[]{this, uq9Var})).booleanValue();
        }
        xau.n(((ITrackService) this.f29555a.getService(ITrackService.class)).getActiveCardCommonTrack());
        wq9.e(this, this.P.f());
        return false;
    }

    public String i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ed102e4", new Object[]{this});
        }
        return this.S;
    }

    public String j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87aa0aef", new Object[]{this});
        }
        a.c cVar = this.P;
        if (cVar != null) {
            return cVar.g();
        }
        return "";
    }

    @Override // tb.ici
    public void k(qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec31384", new Object[]{this, qy0Var});
        }
    }

    public hxg k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hxg) ipChange.ipc$dispatch("5ca9fb39", new Object[]{this});
        }
        return this.J;
    }

    @Override // tb.f4h.d
    public void l(jgi jgiVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a464cafe", new Object[]{this, jgiVar, bitmap});
            return;
        }
        ir9.b(U, "onAddCurrentFrameToVideoView mediaPlayViewProxy=" + jgiVar + ", currentFrame=" + bitmap);
        if (!(jgiVar == null || jgiVar.e() == null)) {
            bitmap = jgiVar.a();
        }
        this.I.M(bitmap);
    }

    public a.c l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("b2c2595e", new Object[]{this});
        }
        return this.P;
    }

    public f4h m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4h) ipChange.ipc$dispatch("3ad40c0f", new Object[]{this});
        }
        return this.O;
    }

    public wwg n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wwg) ipChange.ipc$dispatch("e1bc29b8", new Object[]{this});
        }
        return this.L;
    }

    @Override // tb.ici, tb.uq9
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c09d33", new Object[]{this});
            return;
        }
        super.o0();
        P0();
    }

    public r9w o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9w) ipChange.ipc$dispatch("de7b248d", new Object[]{this});
        }
        return this.K;
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        super.onActive(uq9Var);
        t1();
        P0();
        V0(false);
        A1();
        x1();
        s1();
        g1();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        super.onAppear(uq9Var);
        this.L.j(System.currentTimeMillis());
        ir9.b("tbVideoSdkLiveCard", "doAppear 时间=" + this.L.f());
        onShowCover(this);
    }

    @Override // tb.ici, tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        super.onBindData(uq9Var, aVar, i);
        a.d e = aVar.e();
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.l(this.f29555a, this);
        this.P = e.J();
        onDataUpdate(this);
        onShowCover(this);
        this.Q.j();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else {
            super.onCreateView(uq9Var, recyclerViewHolder);
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        w1();
        onRecyclePlayer(this, true);
        this.D = false;
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        super.onDisActive(uq9Var);
        w1();
        this.L.k(false);
        X0();
        if (q1()) {
            this.J.i(this);
        }
        this.O.l();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        super.onDisAppear(uq9Var);
        w1();
        this.J.i(this);
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ir9.b(U, "onPause");
        w1();
        this.I.X();
        this.J.i(this);
    }

    @Override // tb.ici, tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        super.onPauseMedia(uq9Var);
        if (this.J.getDWInstance() != null) {
            this.J.getDWInstance().pauseVideo();
            wq9.f(this, "pause");
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        super.onRecycle(uq9Var);
        w1();
        onRecyclePlayer(this, true);
        this.D = false;
    }

    @Override // tb.ici, tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        super.onRecyclePlayer(uq9Var, z);
        this.J.i(this);
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (h0()) {
            v1();
            g1();
        }
        this.J.g = false;
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // tb.ici, tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.onStartMedia(uq9Var, z, z2);
        atb dWInstance = this.J.getDWInstance();
        if (dWInstance != null && !pcw.d(this.f29555a)) {
            boolean f = k1().f();
            boolean g = k1().g();
            ir9.b(U, "onStartMedia,直播预热需要移动提前创建的view到cell上，前提条件是：1. 直播预热开启 2. 直播预热成功，mCanUseLivWarmup:" + f + ",mIsLiveWarmUpSuccess:" + g);
            if (f && g) {
                u1();
            } else if (f) {
                ir9.b(U, "onStartMedia,使用了预热功能，但是没有收到预测成功的回调，强制调用startMedia");
                u1();
                B1();
                x1();
                return;
            }
            if (!uwg.b(dWInstance)) {
                B1();
            }
        }
    }

    @Override // tb.ici, tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        super.onStopMedia(uq9Var);
        if (this.J.getDWInstance() != null) {
            this.J.getDWInstance().pauseVideo();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        super.onWillDisActive(uq9Var);
        uyr.a(this.T);
    }

    public ViewGroup p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d48ed864", new Object[]{this});
        }
        if (k1() == null || k1().getDWInstance() == null) {
            return null;
        }
        return k1().getDWInstance().getView();
    }

    public void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d494e78", new Object[]{this});
            return;
        }
        hxg hxgVar = this.J;
        if (hxgVar != null) {
            hxgVar.g = true;
        }
    }

    public void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f80d60f", new Object[]{this});
            return;
        }
        n5h n5hVar = this.Q;
        if (n5hVar != null) {
            n5hVar.l();
        }
    }

    @Override // tb.ici
    public void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f)});
        } else if (this.J.getDWInstance() != null) {
            this.J.getDWInstance().setVolume(f);
        }
    }

    @Override // tb.ici
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
        } else if (this.J.getDWInstance() != null && (map instanceof HashMap)) {
            this.J.getDWInstance().e((HashMap) map);
        }
    }

    public void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a934624b", new Object[]{this});
            return;
        }
        y1(false);
        k1().l(false);
        k1().m(false);
    }

    @Override // tb.ulb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc13a868", new Object[]{this});
        }
        return CARD_NAME;
    }

    public void y1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c2d1ed", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    public void z1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afef3b7a", new Object[]{this, str});
        } else {
            this.S = str;
        }
    }

    private void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905b411f", new Object[]{this});
            return;
        }
        ViewGroup p1 = p1();
        if (p1 != null) {
            if (!nwv.o(p1.getTag(R.id.fluid_sdk_live_view_to_decorView), false)) {
                ir9.b(U, "[直播预热]removePreLoadVideoViewToCell,videoView未移动到decorView上，无需重新移动");
                return;
            }
            if (p1.getParent() instanceof ViewGroup) {
                ((ViewGroup) p1.getParent()).removeView(p1);
            }
            ir9.b(U, "removePreLoadVideoViewToCell");
            h1().Y(p1, h1().R());
        }
        this.R = false;
    }

    private void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f03988", new Object[]{this});
            return;
        }
        ir9.b(U, "requestMediaAndStartPlayer");
        this.I.X();
        P0();
        V0(false);
        A1();
    }
}
