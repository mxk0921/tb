package com.taobao.android.fluid.business.usertrack;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.fscrmid.nav.ShotVideoNavProcessor;
import com.taobao.tao.log.logger.CustomEventLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.atb;
import tb.az9;
import tb.b93;
import tb.bpk;
import tb.c7c;
import tb.d5w;
import tb.f9e;
import tb.g2e;
import tb.g2h;
import tb.ggs;
import tb.h3e;
import tb.i0v;
import tb.ici;
import tb.ir9;
import tb.nwv;
import tb.o74;
import tb.oau;
import tb.omm;
import tb.pep;
import tb.pto;
import tb.qau;
import tb.qtm;
import tb.ryr;
import tb.s0j;
import tb.s19;
import tb.sob;
import tb.sz3;
import tb.t19;
import tb.t2o;
import tb.uq9;
import tb.uyr;
import tb.vn8;
import tb.vt6;
import tb.wfc;
import tb.wlb;
import tb.xau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TrackService implements ITrackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TrackService";
    private final DefaultFluidInstance fluidInstance;
    private ICardService mCardService;
    private final o74 mCommonTrackManager;
    private IContainerService mContainerService;
    private int mCurrentPlayProgress;
    private final FluidContext mFluidContext;
    private boolean mHasUploadUT;
    private int mMaxSlideIndexPublicMode;
    private long mNavElapsdorealTime;
    private long mNavStartTime;
    private PageStartTimeBean mPageCreateTimeBean;
    private t19 mPageFastTracker;
    private VideoTracker mPageVideoTracker;
    private boolean mProcessFromLauncherFlag;
    private String mRecordContentId;
    private int mRecordCount;
    private ISceneConfigService mSceneConfigService;
    private int mSessionPlayTime;
    private long mStayStartTime;
    private int mTab3ComponentDisappearTimes;
    private RenderTrackUtils.a mTrackerRenderInfo;
    private i0v mUtCallback;
    private a.b mVideoTrackserPageInfo;
    public static int sTab3ColdDisAppearTimes = 0;
    private static boolean hasCachedStage = false;
    private final HashMap<String, String> mPageUtProperties = new HashMap<>();
    private boolean pageBeginTracked = false;
    private boolean mIsTab3PageFirstEnter = true;
    private boolean mIsPageFirstEnter = true;
    private boolean mIsFirstSetUTParams = true;
    private boolean mIsFirstSetAdapter = true;
    private final oau mTrackServiceConfig = new oau();
    private g2e trackTint = qau.p();

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
                s0j.C(TrackService.access$000(TrackService.this), 0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements wfc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.wfc
        public void b(FluidInstanceConfig fluidInstanceConfig, pep pepVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a84556", new Object[]{this, fluidInstanceConfig, pepVar});
                return;
            }
            if (vt6.h(pepVar.d, pepVar.c)) {
                xau.W(TrackService.access$000(TrackService.this), TrackService.this.getPageUtProperties());
            }
            if (fluidInstanceConfig.getUtCallback() != null) {
                TrackService.access$102(TrackService.this, fluidInstanceConfig.getUtCallback());
            }
            ir9.b(TrackService.TAG, "onSceneConfigChanged 设置mUtCallback = " + TrackService.access$100(TrackService.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements sob {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f7689a;

            public a(Map map) {
                this.f7689a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                xau.Z(TrackService.this.getPageUtProperties(), this.f7689a);
                if (TrackService.access$100(TrackService.this) != null) {
                    TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), this.f7689a);
                }
            }
        }

        public c() {
        }

        @Override // tb.sob
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2af43359", new Object[]{this, map});
                return;
            }
            xau.Z(TrackService.this.getPageUtProperties(), map);
            ir9.b(TrackService.TAG, "更新2001，mUtCallback = " + TrackService.access$100(TrackService.this));
            if (TrackService.access$100(TrackService.this) != null) {
                TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), map);
            }
            az9.o(new a(map), 3001, az9.n(300), "valuespace_common_track");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                HashMap hashMap = new HashMap();
                hashMap.put(xau.PROPERTY_MAX_INDEX_NORMAL, String.valueOf(nwv.t(Integer.valueOf(TrackService.access$200(TrackService.this)), 0)));
                xau.Z(TrackService.this.getPageUtProperties(), hashMap);
                ir9.b(TrackService.TAG, "更新2001，mUtCallback = " + TrackService.access$100(TrackService.this));
                if (TrackService.access$100(TrackService.this) != null) {
                    TrackService.access$100(TrackService.this).a(TrackService.this.getPageUtProperties(), hashMap);
                }
            }
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1249298707) {
                super.onDisActive((uq9) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/TrackService$4");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
                return;
            }
            xau.q(TrackService.this.getThisCardCommonTrack(uq9Var), uq9Var.T().f(), ((IDataService) TrackService.access$000(TrackService.this).getService(IDataService.class)).isTab3CacheEnable());
            vn8.h(TrackService.access$000(TrackService.this), uq9Var.f0().getAdapterPosition());
            s19.f(uq9Var, uq9Var.P());
            s19.c(uq9Var, "appear");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
                return;
            }
            super.onDisActive(uq9Var);
            long access$400 = TrackService.access$400(TrackService.this);
            xau.B(uq9Var, TrackService.this.getActiveCardCommonTrack(), access$400);
            if (b93.f() && (uq9Var instanceof PictureAlbumCard)) {
                xau.L(TrackService.access$000(TrackService.this), uq9Var.P(), TrackService.this.getActiveCardCommonTrack(), access$400);
            }
            s19.c(uq9Var, "disactive");
            TrackService.access$500(TrackService.this);
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
                return;
            }
            s19.c(uq9Var, "disappear");
            s19.g(uq9Var, uq9Var.S());
        }

        @Override // tb.wlb.a, tb.wlb
        public void onWillActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            } else {
                s19.c(uq9Var, "willActive");
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onWillDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            } else {
                s19.c(uq9Var, "willDisactive");
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            Set<String> q = ((ICardService) TrackService.access$000(TrackService.this).getService(ICardService.class)).getConfig().q();
            if (!(q == null || uq9Var.Y() == null)) {
                q.add(uq9Var.Y().hashCode() + uq9Var.Y().f());
                int size = q.size() - 1;
                int access$200 = TrackService.access$200(TrackService.this);
                if (access$200 == 0) {
                    TrackService.access$202(TrackService.this, size);
                } else if (access$200 < size) {
                    TrackService.access$202(TrackService.this, size);
                }
                az9.o(new a(), 3001, az9.n(300), "valuespace_max_slide_index");
            }
            Map<String, String> thisCardCommonTrack = TrackService.this.getThisCardCommonTrack(uq9Var);
            xau.q(thisCardCommonTrack, uq9Var.T().f(), ((IDataService) TrackService.access$000(TrackService.this).getService(IDataService.class)).isTab3CacheEnable());
            TrackService.access$302(TrackService.this, SystemClock.uptimeMillis());
            xau.A(TrackService.access$000(TrackService.this), thisCardCommonTrack, uq9Var);
            s19.e(uq9Var);
            s19.c(uq9Var, "active");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements c7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
                return;
            }
            FluidContext access$000 = TrackService.access$000(TrackService.this);
            if (uq9Var != null) {
                i = uq9Var.T().f();
            }
            d5w.s(access$000, 1, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends bpk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public f9e f7693a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends f9e.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 1836096032) {
                    super.onVideoProgressChanged((uq9) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/TrackService$6$1");
            }

            @Override // tb.f9e.a, tb.f9e
            public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                super.onVideoProgressChanged(uq9Var, i, i2, i3);
                int i4 = i / 1000;
                if (i4 - TrackService.access$600(TrackService.this) == 1) {
                    TrackService.access$708(TrackService.this);
                }
                if (i4 != TrackService.access$600(TrackService.this)) {
                    TrackService.access$602(TrackService.this, i4);
                }
            }
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -1022287256) {
                super.m((uq9) objArr[0], (uq9) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/TrackService$6");
        }

        @Override // tb.bpk.a, tb.bpk
        public void m(uq9 uq9Var, uq9 uq9Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3112268", new Object[]{this, uq9Var, uq9Var2});
                return;
            }
            super.m(uq9Var, uq9Var2);
            if (this.f7693a == null) {
                this.f7693a = new a();
            }
            if (uq9Var2 instanceof ici) {
                ((ici) uq9Var).F0().removeVideoPlayerListener(this.f7693a);
            }
            if (uq9Var instanceof ici) {
                ((ici) uq9Var).F0().addVideoPlayerListener(this.f7693a);
            }
        }
    }

    static {
        t2o.a(468713564);
        t2o.a(468713563);
    }

    public TrackService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.fluidInstance = (DefaultFluidInstance) fluidContext;
        this.mCommonTrackManager = new o74(fluidContext);
    }

    public static /* synthetic */ FluidContext access$000(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("b2e99232", new Object[]{trackService});
        }
        return trackService.mFluidContext;
    }

    public static /* synthetic */ i0v access$100(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0v) ipChange.ipc$dispatch("dcb43ad2", new Object[]{trackService});
        }
        return trackService.mUtCallback;
    }

    public static /* synthetic */ i0v access$102(TrackService trackService, i0v i0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0v) ipChange.ipc$dispatch("f13701fd", new Object[]{trackService, i0vVar});
        }
        trackService.mUtCallback = i0vVar;
        return i0vVar;
    }

    public static /* synthetic */ int access$200(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cdafa4b", new Object[]{trackService})).intValue();
        }
        return trackService.mMaxSlideIndexPublicMode;
    }

    public static /* synthetic */ int access$202(TrackService trackService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b46cb5c", new Object[]{trackService, new Integer(i)})).intValue();
        }
        trackService.mMaxSlideIndexPublicMode = i;
        return i;
    }

    public static /* synthetic */ long access$302(TrackService trackService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d576573d", new Object[]{trackService, new Long(j)})).longValue();
        }
        trackService.mStayStartTime = j;
        return j;
    }

    public static /* synthetic */ long access$400(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c859ea4e", new Object[]{trackService})).longValue();
        }
        return trackService.getStayTime();
    }

    public static /* synthetic */ void access$500(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1619625b", new Object[]{trackService});
        } else {
            trackService.stopMetrics();
        }
    }

    public static /* synthetic */ int access$600(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63d8da4f", new Object[]{trackService})).intValue();
        }
        return trackService.mCurrentPlayProgress;
    }

    public static /* synthetic */ int access$602(TrackService trackService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1404ebd8", new Object[]{trackService, new Integer(i)})).intValue();
        }
        trackService.mCurrentPlayProgress = i;
        return i;
    }

    public static /* synthetic */ int access$708(TrackService trackService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e147458", new Object[]{trackService})).intValue();
        }
        int i = trackService.mSessionPlayTime;
        trackService.mSessionPlayTime = 1 + i;
        return i;
    }

    private Map<String, String> getCardTint(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7199bee", new Object[]{this, uq9Var});
        }
        if (uq9Var == null) {
            uq9Var = ((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard();
        }
        if (uq9Var != null) {
            return getCardTint(uq9Var.Y());
        }
        return null;
    }

    private long getStayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79833cb7", new Object[]{this})).longValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.mStayStartTime;
        if (uptimeMillis <= 0) {
            return 0L;
        }
        return uptimeMillis;
    }

    private boolean isEnableTab3CorrectStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("303813db", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTab3CorrectStartTime", true);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void addCommonTrackChangedListener(sob sobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93e0363", new Object[]{this, sobVar});
        } else {
            this.mCommonTrackManager.g(sobVar);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void commitTintFail(String str, String str2, Map map, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3938e94b", new Object[]{this, str, str2, map, uq9Var});
            return;
        }
        Map<String, String> cardTint = getCardTint(uq9Var);
        if (!(map == null || cardTint == null)) {
            map.putAll(cardTint);
        }
        this.trackTint.g(g2e.MODULE_FULL_PAGE, str, str2, map);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getActiveCardCommonTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a4044d0", new Object[]{this});
        }
        return this.mCommonTrackManager.h(((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard());
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public oau getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oau) ipChange.ipc$dispatch("ee73023d", new Object[]{this});
        }
        return this.mTrackServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getDPVCommonTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb5f02c8", new Object[]{this});
        }
        return this.mCommonTrackManager.i(((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard());
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getMaxSlideIndexPublicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9216e275", new Object[]{this})).intValue();
        }
        return this.mMaxSlideIndexPublicMode;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public long getNavElapsdorealTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("317aa2c1", new Object[]{this})).longValue();
        }
        return this.mNavElapsdorealTime;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public long getNavStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue();
        }
        return this.mNavStartTime;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public PageStartTimeBean getPageCreateTimeBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("2d4cad30", new Object[]{this});
        }
        return this.mPageCreateTimeBean;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public t19 getPageFastTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19) ipChange.ipc$dispatch("2b716a24", new Object[]{this});
        }
        return this.mPageFastTracker;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public final Map<String, String> getPageUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73e0e373", new Object[]{this});
        }
        return getPageUtProperties();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public HashMap<String, String> getPageUtProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c45ab7c1", new Object[]{this});
        }
        return this.mPageUtProperties;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public VideoTracker getPageVideoTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("47f07db3", new Object[]{this});
        }
        return this.mPageVideoTracker;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getRecordContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae4b012c", new Object[]{this});
        }
        return this.mRecordContentId;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getRecordCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19c38682", new Object[]{this})).intValue();
        }
        return this.mRecordCount;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getSessionPlayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84b4a69b", new Object[]{this})).intValue();
        }
        return this.mSessionPlayTime;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public int getTab3ComponentDisappearTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b095fe6", new Object[]{this})).intValue();
        }
        return this.mTab3ComponentDisappearTimes;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getThisCardCommonTrack(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ff8a189", new Object[]{this, uq9Var});
        }
        return this.mCommonTrackManager.h(uq9Var);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getTintAllTrackInfoWithCard(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1496166c", new Object[]{this, uq9Var});
        }
        Map<String, String> e2 = this.trackTint.e();
        Map<String, String> cardTint = getCardTint(uq9Var);
        if (cardTint != null) {
            e2.putAll(cardTint);
        }
        return e2;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public Map<String, String> getTintAllTrackInfoWithDetail(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97193446", new Object[]{this, dVar});
        }
        Map<String, String> e2 = this.trackTint.e();
        Map<String, String> cardTint = getCardTint(dVar);
        if (cardTint != null) {
            e2.putAll(cardTint);
        }
        return e2;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public g2e getTrackTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("2eb6f185", new Object[]{this});
        }
        return this.trackTint;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public RenderTrackUtils.a getTrackerRenderInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderTrackUtils.a) ipChange.ipc$dispatch("970c615e", new Object[]{this});
        }
        return this.mTrackerRenderInfo;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getUtparamPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c157d6e", new Object[]{this});
        }
        return this.mCommonTrackManager.j();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public String getUtparamUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35c56222", new Object[]{this});
        }
        return this.mCommonTrackManager.k();
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public a.b getVideoTrackerPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("4361f131", new Object[]{this});
        }
        return this.mVideoTrackserPageInfo;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isFirstSetAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63c893de", new Object[]{this})).booleanValue();
        }
        return this.mIsFirstSetAdapter;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isFirstSetUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfe827ec", new Object[]{this})).booleanValue();
        }
        return this.mIsFirstSetUTParams;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isPageFirstEnter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73dd4dcc", new Object[]{this})).booleanValue();
        }
        return this.mIsPageFirstEnter;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public boolean isProcessFromLauncherFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79863f06", new Object[]{this})).booleanValue();
        }
        return this.mProcessFromLauncherFlag;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ir9.b(TAG, "APMdata onCreate");
        resetTab3EnterPageStartTime();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        new g2h(this.mFluidContext);
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mSceneConfigService = (ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class);
        ir9.b(TAG, "onCreateService mUtCallback ");
        if (this.mFluidContext.getInstanceConfig().getUtCallback() != null) {
            this.mUtCallback = this.mFluidContext.getInstanceConfig().getUtCallback();
            ir9.b(TAG, "onCreateService 设置mUtCallback = " + this.mUtCallback);
        }
        this.mSceneConfigService.addInstanceConfigChangedListener(new b());
        this.mCommonTrackManager.l(this.mFluidContext);
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        ryr.b(this.mFluidContext.getContext(), pto.b(this.mFluidContext), s0j.GG_VIDEOTAB_PAGE_INIT);
        s0j.a(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW);
        ir9.b(TAG, "DefaultFluidInstance()初始化 PickPreloadController初始化 ");
        xau.p(getActiveCardCommonTrack(), com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.d(this.mFluidContext));
        s0j.d(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW);
        addCommonTrackChangedListener(new c());
        this.mCardService.addCardLifecycleListener((wlb.a) new d());
        this.mContainerService.addFirstCardRenderListener(new e());
        if (b93.m()) {
            ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).addCardChangeListener(new f());
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        s19.t(this.mFluidContext);
        vn8.e(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b(TAG, "onPauseMedia: uploadPreDWLeaveUT");
        uploadPreDWLeaveUT(((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).findPreAttachedDWInstance());
        reportTintInfo();
        uq9 activeCard = this.mCardService.getActiveCard();
        if (activeCard != null && activeCard.h0()) {
            ir9.b(TAG, "页面disappear，卡片处于active状态且tab被选中，position: " + activeCard.M());
            long stayTime = getStayTime();
            xau.B(activeCard, getActiveCardCommonTrack(), stayTime);
            if (b93.f() && (activeCard instanceof PictureAlbumCard)) {
                xau.L(this.mFluidContext, activeCard.P(), getActiveCardCommonTrack(), stayTime);
            }
        }
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        HashMap hashMap = new HashMap();
        hashMap.put(xau.PROPERTY_IS_FINISH, String.valueOf(iLifecycleService.isFinish()));
        xau.X(this.mFluidContext, getPageUtProperties(), Boolean.valueOf(iLifecycleService.isFinish()));
        ir9.b(TAG, "更新2001，mUtCallback = " + this.mUtCallback);
        i0v i0vVar = this.mUtCallback;
        if (i0vVar != null) {
            i0vVar.a(getPageUtProperties(), hashMap);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b(TAG, "APMdata onResume ");
        if (!((IContainerService) this.mFluidContext.getService(IContainerService.class)).isLoading() && !pto.n(this.mFluidContext) && !pto.l(this.mFluidContext)) {
            ((ITrackService) this.mFluidContext.getService(ITrackService.class)).setPageStartTime(this.mFluidContext);
        }
        uyr.mMainHander.post(new a());
        uq9 activeCard = this.mCardService.getActiveCard();
        if (activeCard != null && activeCard.h0()) {
            ir9.b(TAG, "页面appear，卡片处于active状态且tab被选中，position: " + activeCard.M());
            this.mStayStartTime = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void removeCommonTrackChangedListener(sob sobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d07946", new Object[]{this, sobVar});
        } else {
            this.mCommonTrackManager.m(sobVar);
        }
    }

    public void reportTintInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771de9a4", new Object[]{this});
        } else {
            CustomEventLogger.builder("tab2", "tintInfo").setData(((ITrackService) this.mFluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithCard(null)).log();
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void resetTab3EnterPageStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1229c", new Object[]{this});
        } else if (pto.g(this.mFluidContext) && isEnableTab3CorrectStartTime() && this.mIsTab3PageFirstEnter) {
            this.mIsTab3PageFirstEnter = false;
            setPageStartTime(this.mFluidContext);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setFirstSetAdapter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c147d72", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFirstSetAdapter = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setFirstSetUTParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf900bb4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFirstSetUTParams = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageCreateTimeBean(PageStartTimeBean pageStartTimeBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8ac38a", new Object[]{this, pageStartTimeBean});
        } else {
            this.mPageCreateTimeBean = pageStartTimeBean;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageFastTracker(t19 t19Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329ca87e", new Object[]{this, t19Var});
        } else {
            this.mPageFastTracker = t19Var;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageFirstEnter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1df3d4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsPageFirstEnter = z;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public PageStartTimeBean setPageStartTime(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("18bd1382", new Object[]{this, fluidContext});
        }
        PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
        if (pageCreateTimeBean == null) {
            pageCreateTimeBean = new PageStartTimeBean();
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageCreateTimeBean(pageCreateTimeBean);
        }
        pageCreateTimeBean.pageStartTime = System.currentTimeMillis();
        return pageCreateTimeBean;
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setPageVideoTracker(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5d61b", new Object[]{this, videoTracker});
        } else {
            this.mPageVideoTracker = videoTracker;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setRecordContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53cf932", new Object[]{this, str});
        } else {
            this.mRecordContentId = str;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setRecordCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2aa5360", new Object[]{this, new Integer(i)});
        } else {
            this.mRecordCount = i;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setTab3ComponentDisappearTimes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84c0e7c", new Object[]{this, new Integer(i)});
        } else {
            this.mTab3ComponentDisappearTimes = i;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setTrackerRenderInfo(RenderTrackUtils.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3556ecc0", new Object[]{this, aVar});
        } else {
            this.mTrackerRenderInfo = aVar;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void setVideoTrackerPageInfo(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d029f827", new Object[]{this, bVar});
        } else {
            this.mVideoTrackserPageInfo = bVar;
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void trackPageStart() {
        IPreloadService iPreloadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5246668f", new Object[]{this});
            return;
        }
        s0j.a(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART);
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.A(this.mFluidContext, ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams());
        long j = ShotVideoNavProcessor.b;
        if (j > 0) {
            this.mNavElapsdorealTime = j;
            this.mNavStartTime = ShotVideoNavProcessor.c;
            RenderTrackUtils.a(this.mFluidContext, RenderTrackUtils.pageNav);
            ShotVideoNavProcessor.b();
        }
        RenderTrackUtils.a(this.mFluidContext, RenderTrackUtils.pageCreate);
        VideoTracker videoTracker = this.mPageVideoTracker;
        if (!(!((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).enableTab3UseCacheData() || videoTracker == null || (iPreloadService = (IPreloadService) this.mFluidContext.getService(IPreloadService.class)) == null || iPreloadService.getPreloadVideoTrackerManager() == null)) {
            iPreloadService.getPreloadVideoTrackerManager().g(videoTracker);
        }
        this.mProcessFromLauncherFlag = qtm.j();
        s0j.d(s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void triggerTrackStayTime(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71de4431", new Object[]{this, uq9Var});
            return;
        }
        long stayTime = getStayTime();
        ir9.b(TAG, "自定义上报停留时长 triggerTrackStayTime stayTime=" + stayTime);
        if (b93.f() && (uq9Var instanceof PictureAlbumCard)) {
            xau.L(this.mFluidContext, uq9Var.P(), getActiveCardCommonTrack(), stayTime);
        }
        if (uq9Var != null && uq9Var.h0()) {
            this.mStayStartTime = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService
    public void updateCommonTrack(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee91127", new Object[]{this, map});
        } else {
            this.mCommonTrackManager.o(map);
        }
    }

    private void stopMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6c1668", new Object[]{this});
            return;
        }
        try {
            h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
            if (tab2ServiceDelegate != null) {
                tab2ServiceDelegate.q(s0j.MTS_VALUE_SWITCH_CARD);
                tab2ServiceDelegate.e("tab2EndType", s0j.MTS_VALUE_SWITCH_CARD);
                tab2ServiceDelegate.j(false, s0j.MTS_VALUE_SWITCH_CARD, null);
            }
        } catch (Throwable th) {
            ir9.c(TAG, "stopMetrics error", th);
        }
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ryr.b(this.mFluidContext.getContext(), pto.b(this.mFluidContext), "gg_videoTab_page_enter");
        if (!hasCachedStage) {
            ggs.e("TAB2_VIDEO_PRELOAD_STAGE", "tabStart");
            hasCachedStage = true;
        }
        if (!this.pageBeginTracked) {
            this.pageBeginTracked = true;
            trackPageStart();
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.B(this.mFluidContext);
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.mFluidContext.getInstanceConfig().getFluidOriginUrl());
        ryr.d(this.mFluidContext.getContext(), pto.b(this.mFluidContext), "gg_videoTab_page_enter", hashMap);
    }

    @Override // com.taobao.android.fluid.business.usertrack.ITrackService, tb.o6d
    public void onStop() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ir9.b(TAG, "onStop: uploadPreDWLeaveUT");
        s19.r(this.mFluidContext);
        vn8.d(this.mFluidContext);
        String str = null;
        try {
            str = ((IDataService) this.mFluidContext.getService(IDataService.class)).getRecommendRequestId();
            j = System.currentTimeMillis() - ((IDataService) this.mFluidContext.getService(IDataService.class)).getStartRecommendtime();
        } catch (Throwable unused) {
            j = 0;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.U(this.mFluidContext, "fullpage_stop", String.valueOf(j), "", "", str);
        this.mSessionPlayTime = 0;
    }

    public void uploadPreDWLeaveUT(atb atbVar) {
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338e09fb", new Object[]{this, atbVar});
        } else if (oau.f(this.fluidInstance) && !this.mHasUploadUT) {
            this.mHasUploadUT = true;
            ir9.b(TAG, "PickPreloadController，uploadPreDWLeaveUT");
            HashMap hashMap = new HashMap();
            if (((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface() != null) {
                obj = ((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface().getUTObject();
            } else {
                obj = this.mFluidContext.getContext();
            }
            if (obj instanceof Activity) {
                Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(this.mFluidContext).getPageAllProperties((Activity) obj);
                if (!sz3.b(pageAllProperties)) {
                    hashMap.putAll(pageAllProperties);
                }
            }
            if (((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).isFinish()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(xau.PROPERTY_IS_FINISH, str);
            String str2 = ((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).getmPrePlayerVideoId();
            boolean isLocalOrCacheVideo = ((IUsePreloadService) this.mFluidContext.getService(IUsePreloadService.class)).isLocalOrCacheVideo(atbVar);
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            HashMap<String, String> c2 = omm.c(str2, ((ISceneConfigService) this.fluidInstance.getService(ISceneConfigService.class)).getSessionExtParams().b(), isLocalOrCacheVideo);
            Map<? extends String, ? extends String> b2 = omm.b(isLocalOrCacheVideo);
            long tab3LauncherPrePlayerStartTime = ((IUsePreloadService) this.fluidInstance.getService(IUsePreloadService.class)).getTab3LauncherPrePlayerStartTime();
            if (tab3LauncherPrePlayerStartTime > 0) {
                long currentTimeMillis = System.currentTimeMillis() - tab3LauncherPrePlayerStartTime;
                ir9.b(TAG, "PickPreloadController，pause上报埋点，起播到dw销毁的时间：" + currentTimeMillis);
                b2.put("duration", Long.valueOf(currentTimeMillis));
                b2.put("duration_time", Long.valueOf(currentTimeMillis));
                b2.put("playTime", Long.valueOf(currentTimeMillis));
            }
            b2.put("play_token", ((IUsePreloadService) this.fluidInstance.getService(IUsePreloadService.class)).getPlayerPlayToken());
            c2.putAll(hashMap);
            c2.putAll(b2);
            s0j.e(s0j.GG_VIDEOTAB_VIDEO_PLAY_END_UT, c2);
            s0j.e(s0j.GG_VIDEOTAB_VIDEO_LEAVE_UT, hashMap);
        }
    }

    private Map<String, String> getCardTint(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac513887", new Object[]{this, dVar});
        }
        if (dVar == null || !oau.k()) {
            return null;
        }
        Object e2 = vt6.e(dVar.d, "grayParamsCard");
        if (!(e2 instanceof JSONObject)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : ((JSONObject) e2).entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        hashMap.put("grayid", dVar.f());
        return hashMap;
    }
}
