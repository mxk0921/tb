package com.taobao.avplayer;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import tb.a7m;
import tb.a95;
import tb.asc;
import tb.aub;
import tb.ctb;
import tb.cub;
import tb.d75;
import tb.htb;
import tb.mtb;
import tb.nj9;
import tb.nsb;
import tb.o95;
import tb.q75;
import tb.qsb;
import tb.qtb;
import tb.rtb;
import tb.sge;
import tb.t2o;
import tb.tfb;
import tb.xau;
import tb.xsb;
import tb.ytb;
import tb.ztb;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWInstance implements ytb, ctb, aub {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "dw";
    private static final long INVALID = -1;
    private nsb mCloseViewClickListener;
    private View mCoverView;
    private FrameLayout.LayoutParams mCoverViewLayoutParams;
    public DWContext mDWContext;
    private DWLifecycleType mDWLifecycleType;
    private a95 mDWPicController;
    private f mDWVideoController;
    private boolean mDestroy;
    private nj9 mExternFirstRenderAdapter;
    private boolean mHideCloseView;
    private xsb mHookStartListener;
    private InnerStartFuncListener mInnerStartListener;
    private asc mMediaPlayLifeCycleListener;
    private qtb mPicViewClickListener;
    private FrameLayout mRootView;
    private qtb mRootViewClickListener;
    private rtb mRootViewTouchListener;
    private boolean mSetup;
    private ztb mVideoLifecycleListener;
    private ytb mVideoLifecycleListener2;
    public aub mVideoLoopCompleteListener;
    private cub mVideoPlayTimeListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DWInstance.access$000(DWInstance.this) != null) {
                DWInstance.access$000(DWInstance.this).requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DWInstance.access$100(DWInstance.this) != null) {
                DWInstance.access$100(DWInstance.this).O0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$avplayer$DWInstanceType;

        static {
            int[] iArr = new int[DWInstanceType.values().length];
            $SwitchMap$com$taobao$avplayer$DWInstanceType = iArr;
            try {
                iArr[DWInstanceType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$avplayer$DWInstanceType[DWInstanceType.PIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f10095a;
        public String b;

        static {
            t2o.a(452984922);
        }

        public d(Activity activity) {
            e eVar = new e();
            this.f10095a = eVar;
            eVar.c = activity;
            eVar.k0 = DWInstance.COMPONENT_NAME;
        }

        public d B(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("14d9755d", new Object[]{this, dWVideoScreenType});
            }
            this.f10095a.G = dWVideoScreenType;
            return this;
        }

        public d D(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e84b59de", new Object[]{this, new Long(j)});
            }
            this.f10095a.e = j;
            return this;
        }

        public d E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8638d866", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.getClass();
            return this;
        }

        public d F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("3e50cb41", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.getClass();
            return this;
        }

        public d I(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("26d25349", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.g0 = z;
            return this;
        }

        public d J(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("937d830e", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.v = z;
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWInstance Builder, sbt=" + this.f10095a.g + ", setMute=" + this.f10095a.v);
            return this;
        }

        public d L(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ae15a261", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.a0 = z;
            return this;
        }

        public d M(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6be5abae", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.getClass();
            return this;
        }

        public d N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("9798b3cb", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.z = z;
            return this;
        }

        public d O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("3d7bcad2", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.B = z;
            return this;
        }

        public d P(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5e90dde", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.C = z;
            return this;
        }

        public d Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a03aba39", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.y = z;
            return this;
        }

        public d R(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("86d01a84", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.J = z;
            return this;
        }

        public d S(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("468f1fe9", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.D = z;
            return this;
        }

        public d U(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ab769172", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.F = z;
            return this;
        }

        public d W(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("21288372", new Object[]{this, str});
            }
            this.f10095a.b = str;
            return this;
        }

        public d Y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f463b46e", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.n0 = z;
            return this;
        }

        public d Z(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a68624d3", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.M = z;
            return this;
        }

        public void a(sge sgeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("466a0ad1", new Object[]{this, sgeVar});
            } else {
                this.f10095a.i0 = sgeVar;
            }
        }

        public d a0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5eb14bee", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.L = z;
            return this;
        }

        public d b0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8a620505", new Object[]{this, str});
            }
            this.f10095a.h = str;
            return this;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b30f571", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.b)) {
                e eVar = this.f10095a;
                eVar.k0 = this.b + "." + this.f10095a.k0;
                this.b = "";
            }
        }

        public d c0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1d0567c8", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.E = z;
            return this;
        }

        public d d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("14bcdd9", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.T = z;
            return this;
        }

        public d d0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("cf066c56", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.w = z;
            return this;
        }

        public d e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d4b8377", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.S = z;
            return this;
        }

        public d e0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1b64e578", new Object[]{this, str});
            }
            this.f10095a.n = str;
            return this;
        }

        public d f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d4f9c325", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.R = z;
            return this;
        }

        public d f0(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("91e5ab9b", new Object[]{this, hashMap});
            }
            this.f10095a.u = hashMap;
            return this;
        }

        public d g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e384e938", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.P = z;
            return this;
        }

        public d g0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e031b82c", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.m0 = z;
            return this;
        }

        public d h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("802c787c", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.V = z;
            return this;
        }

        public d h0(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("173f254b", new Object[]{this, new Long(j)});
            }
            this.f10095a.f = j;
            return this;
        }

        public d i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1a8ad5e2", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.W = z;
            return this;
        }

        public d j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5be24c30", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.O = z;
            return this;
        }

        public d k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a468deb9", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.X = z;
            return this;
        }

        public d k0(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("99ee557a", new Object[]{this, dWAspectRatio});
            }
            this.f10095a.h0 = dWAspectRatio;
            return this;
        }

        public d l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f178dd5", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.Q = z;
            return this;
        }

        public d l0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("2d8db25b", new Object[]{this, str});
            }
            this.f10095a.j = str;
            return this;
        }

        public d m0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("994301f0", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.f0 = z;
            return this;
        }

        public d n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5ff1ff1", new Object[]{this, str});
            }
            this.f10095a.g = str;
            return this;
        }

        public d n0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("29921bdb", new Object[]{this, str});
            }
            this.f10095a.i = str;
            return this;
        }

        public d o0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("de6a91cf", new Object[]{this, str});
            }
            this.f10095a.Y = str;
            return this;
        }

        public d p0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e971cc59", new Object[]{this, str});
            }
            this.f10095a.d = str;
            return this;
        }

        public d q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("5796b21d", new Object[]{this, str});
            }
            this.f10095a.H = str;
            return this;
        }

        public d q0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("87c06f68", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getScreenWidth();
            }
            this.f10095a.l = i;
            return this;
        }

        public d s(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("27bea9ae", new Object[]{this, dWInstanceType});
            }
            this.f10095a.j0 = dWInstanceType;
            return this;
        }

        public d t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ad789b5a", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.getClass();
            return this;
        }

        public d u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8ecaebdf", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.getClass();
            return this;
        }

        public d v(q75 q75Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4cb859d7", new Object[]{this, q75Var});
            }
            this.f10095a.A = q75Var;
            return this;
        }

        public d w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("7df1acb7", new Object[]{this, new Boolean(z)});
            }
            this.f10095a.N = z;
            return this;
        }

        public d x(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("cb27458d", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getRealPxByWidth(600.0f);
            }
            this.f10095a.m = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {
        public q75 A;
        public String H;
        public boolean O;
        public boolean P;
        public boolean Q;
        public boolean R;
        public boolean S;
        public boolean T;
        public boolean V;
        public boolean W;
        public boolean X;
        public String Y;
        public boolean a0;
        public String b;
        public Activity c;
        public String d;
        public boolean f0;
        public String g;
        public boolean g0;
        public String h;
        public DWAspectRatio h0;
        public String i;
        public sge i0;
        public String j;
        public String k0;
        public int l;
        public int m;
        public String n;
        public Map<String, String> u;
        public boolean w;
        public boolean y;
        public boolean z;
        public long e = -1;
        public long f = -1;
        public boolean v = true;
        public boolean B = true;
        public boolean C = true;
        public boolean D = true;
        public boolean E = false;
        public boolean F = false;
        public DWVideoScreenType G = DWVideoScreenType.NORMAL;
        public boolean J = false;
        public boolean L = false;
        public boolean M = true;
        public boolean N = true;
        public final int b0 = -1;
        public final int c0 = -1;
        public final int d0 = -1;
        public final int e0 = -1;
        public DWInstanceType j0 = DWInstanceType.VIDEO;
        public boolean m0 = false;
        public boolean n0 = true;

        static {
            t2o.a(452984923);
        }
    }

    static {
        t2o.a(452984918);
        t2o.a(452985011);
        t2o.a(452985037);
        t2o.a(452985012);
        try {
            Application application = MediaSystemUtils.sApplication;
            if (application != null) {
                a7m.d(application);
            }
        } catch (Throwable unused) {
            AVSDKLog.e("TBDWInstance", "Player Proxy init ERROR");
        }
        AVSDKLog.d("TBDWInstance", "  Player Proxy init ");
    }

    public DWInstance(e eVar) {
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, " DWInstance init");
        }
        DWContext dWContext = new DWContext(eVar.c);
        this.mDWContext = dWContext;
        dWContext.mUsingInterface = eVar.k0;
        String str = "";
        dWContext.mPlayContext = new MediaPlayControlContext(eVar.c, str);
        MediaPlayControlContext mediaPlayControlContext = this.mDWContext.mPlayContext;
        DWContext dWContext2 = this.mDWContext;
        mediaPlayControlContext.mTBVideoSourceAdapter = new o95(dWContext2);
        MediaPlayControlContext mediaPlayControlContext2 = dWContext2.mPlayContext;
        mediaPlayControlContext2.mConfigGroup = "DWInteractive";
        mediaPlayControlContext2.mEmbed = false;
        mediaPlayControlContext2.setVideoUrl(eVar.d);
        DWContext dWContext3 = this.mDWContext;
        dWContext3.mInteractiveId = eVar.e;
        dWContext3.mInteractiveParms = null;
        dWContext3.addIctTempCallback(eVar.i0);
        this.mDWContext.setNeedAD(false);
        DWContext dWContext4 = this.mDWContext;
        dWContext4.mContentId = eVar.H;
        dWContext4.mCid = null;
        dWContext4.setNeedAfterAD(false);
        DWContext dWContext5 = this.mDWContext;
        dWContext5.mPlayContext.mLocalVideo = false;
        dWContext5.setNeedGesture(eVar.J);
        this.mDWContext.setVideoAspectRatio(eVar.h0);
        this.mDWContext.setNeedMSG(false);
        this.mDWContext.setNeedCloseUT(eVar.B);
        this.mDWContext.setNeedFirstPlayUT(eVar.C);
        this.mDWContext.setInitScreenType(eVar.G);
        this.mDWContext.setHideNormalGoodsView(false);
        this.mDWContext.setRecommendVideoOnlyShowFullscreen(false);
        this.mDWContext.setUserInfoAdapter(null);
        this.mDWContext.setHiddenMiniProgressBar(eVar.P);
        this.mDWContext.setHiddenToastView(eVar.Q);
        this.mDWContext.setHiddenGestureView(eVar.S);
        this.mDWContext.setHiddenNetworkErrorView(eVar.V);
        this.mDWContext.setHiddenPlayErrorView(eVar.W);
        this.mDWContext.setHiddenThumbnailPlayBtn(eVar.X);
        this.mDWContext.setHiddenLoading(eVar.R);
        this.mDWContext.setNeedSmallWindow(false);
        this.mDWContext.setMiniProgressAnchorShown(eVar.g0);
        this.mDWContext.setActivityToggleForLandscape(false);
        DWContext dWContext6 = this.mDWContext;
        dWContext6.mUserId = eVar.f;
        dWContext6.mShowPlayRate = true;
        int i = eVar.l;
        dWContext6.mWidth = i;
        int i2 = eVar.m;
        dWContext6.mHeight = i2;
        dWContext6.mNormalWidth = i;
        dWContext6.mNormalHeight = i2;
        dWContext6.mDWImageAdapter = null;
        dWContext6.mNetworkAdapter = null;
        dWContext6.mUTAdapter = null;
        dWContext6.mConfigAdapter = null;
        dWContext6.mConfigParamsAdapter = null;
        dWContext6.mDWAlarmAdapter = null;
        MediaPlayControlContext mediaPlayControlContext3 = dWContext6.mPlayContext;
        String str2 = eVar.g;
        mediaPlayControlContext3.mFrom = str2;
        dWContext6.mFrom = str2;
        String str3 = eVar.j;
        mediaPlayControlContext3.mVideoId = str3;
        dWContext6.mVideoId = str3;
        mediaPlayControlContext3.setMediaInfoParams(null);
        this.mDWContext.setVideoToken(eVar.Y);
        this.mDWContext.mPlayContext.setVideoToken(eVar.Y);
        DWContext dWContext7 = this.mDWContext;
        MediaPlayControlContext mediaPlayControlContext4 = dWContext7.mPlayContext;
        String str4 = eVar.i;
        mediaPlayControlContext4.mVideoSource = str4;
        dWContext7.mVideoSource = str4;
        dWContext7.mInVideoDetail = false;
        dWContext7.mute(eVar.v);
        DWContext dWContext8 = this.mDWContext;
        dWContext8.mMuteIconDisplay = eVar.a0;
        dWContext8.mMuteIconLeftMargin = eVar.b0;
        dWContext8.mMuteIconRightMargin = eVar.c0;
        dWContext8.mMuteIconBottomMargin = eVar.d0;
        dWContext8.mMuteIconTopMargin = eVar.e0;
        dWContext8.showInteractive(eVar.w);
        this.mDWContext.setNeedFrontCover(eVar.y);
        this.mDWContext.setFrontCoverData(eVar.A);
        this.mDWContext.setNeedBackCover(eVar.z);
        this.mDWContext.setBacktCover(null);
        this.mDWContext.setPlayScenes(eVar.b);
        this.mDWContext.setPauseInBackground(false);
        DWContext dWContext9 = this.mDWContext;
        dWContext9.mNeedScreenButton = eVar.D;
        dWContext9.mNeedVideoCache = eVar.F;
        dWContext9.setShowGoodsList(eVar.E);
        DWContext dWContext10 = this.mDWContext;
        dWContext10.mScene = eVar.h;
        dWContext10.mLoop = eVar.f0;
        dWContext10.mHiddenPlayingIcon = eVar.O;
        dWContext10.mHideController = eVar.T;
        dWContext10.mHookKeyBackToggleEvent = false;
        dWContext10.mMuteDisplay = false;
        dWContext10.mPanoType = 0;
        dWContext10.mStartPos = 0;
        dWContext10.mHttpHeader = null;
        dWContext10.mBackgroundVideo = false;
        dWContext10.setInstanceType(eVar.j0);
        this.mDWContext.setSourcePageName(eVar.n);
        DWContext dWContext11 = this.mDWContext;
        dWContext11.mAudioOnly = false;
        dWContext11.mUseShortAudioFocus = eVar.m0;
        dWContext11.mReleaseShortFocusWhenPause = eVar.n0;
        if (!dWContext11.isNeedSmallWindow()) {
            this.mRootView = new FrameLayout(this.mDWContext.getActivity());
        }
        this.mDWLifecycleType = DWLifecycleType.BEFORE;
        initAdapter(eVar);
        this.mDWContext.genPlayToken();
        DWContext dWContext12 = this.mDWContext;
        dWContext12.mPlayContext.updateLogContextPlayToken(dWContext12.getPlayToken());
        DWContext dWContext13 = this.mDWContext;
        qsb qsbVar = dWContext13.mConfigParamsAdapter;
        if (qsbVar != null) {
            str = ((d75) qsbVar).a(dWContext13.getActivity());
        }
        this.mDWContext.setInstantSeekingEnable(true);
        this.mDWContext.setPlayRateBtnEnable(true);
        DWContext dWContext14 = this.mDWContext;
        dWContext14.setRID(str + "_" + System.currentTimeMillis());
        this.mDWContext.setFullScreenMode(false);
        this.mDWContext.setReportShown(eVar.L);
        this.mDWContext.setReportFullScreenShown(eVar.M);
        this.mDWContext.setGoodsListFullScreenShown(eVar.N);
        this.mDWContext.setGoodsListFullScreenShown(eVar.N);
        setup(eVar);
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, " DWInstance end");
        }
    }

    public static /* synthetic */ FrameLayout access$000(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("34e7b401", new Object[]{dWInstance});
        }
        return dWInstance.mRootView;
    }

    public static /* synthetic */ f access$100(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("bda5126c", new Object[]{dWInstance});
        }
        return dWInstance.mDWVideoController;
    }

    private void destroyPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396447fa", new Object[]{this});
            return;
        }
        a95 a95Var = this.mDWPicController;
        if (a95Var != null && a95Var.c() != null) {
            this.mDWPicController.c().setVisibility(8);
            this.mDWPicController.b();
            this.mDWPicController = null;
        }
    }

    private void destroyVideoMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f91d86b", new Object[]{this});
            return;
        }
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            this.mRootView.removeView(fVar.Y());
            this.mDWVideoController.T();
            this.mDWVideoController = null;
        }
    }

    private void initControlParams(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1885723", new Object[]{this, eVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_initControlParams);
        eVar.getClass();
    }

    private void initPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9924", new Object[]{this});
            return;
        }
        this.mDWContext.setInstanceType(DWInstanceType.PIC);
        a95 a95Var = new a95(this.mDWContext);
        this.mDWPicController = a95Var;
        a95Var.e(this.mPicViewClickListener);
        DWContext dWContext = this.mDWContext;
        this.mRootView.addView(this.mDWPicController.c(), new FrameLayout.LayoutParams(dWContext.mWidth, dWContext.mHeight));
    }

    private void initPlayExpUTParams(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950a3ef8", new Object[]{this, eVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_initPlayExpUTParams);
        eVar.getClass();
    }

    private void initUTParams(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c3d861", new Object[]{this, eVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mDWContext.mInteractiveId != -1) {
            hashMap.put("interactId", this.mDWContext.mInteractiveId + "");
        }
        long j = this.mDWContext.mUserId;
        if (j != -1) {
            hashMap.put("userId", String.valueOf(j));
        }
        if (!TextUtils.isEmpty(this.mDWContext.mFrom)) {
            hashMap.put("page", this.mDWContext.mFrom.toLowerCase());
        }
        if (!TextUtils.isEmpty(this.mDWContext.mContentId)) {
            hashMap.put("contentId", this.mDWContext.mContentId);
        }
        hashMap.put(xau.PROPERTY_VIDEO_ID, this.mDWContext.mVideoId + "");
        hashMap.put("videoSource", this.mDWContext.mVideoSource + "");
        hashMap.put("mediaType", "1");
        Map<String, String> map = eVar.u;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.mDWContext.addUtParams(hashMap);
    }

    private void initVideoMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b8715", new Object[]{this});
        } else if (!this.mDestroy) {
            this.mDWContext.setInstanceType(DWInstanceType.VIDEO);
            if (this.mDWVideoController == null) {
                f fVar = new f(this.mDWContext);
                this.mDWVideoController = fVar;
                nj9 nj9Var = this.mExternFirstRenderAdapter;
                if (nj9Var != null) {
                    fVar.t0(nj9Var);
                    this.mExternFirstRenderAdapter = null;
                }
                setDWLifecycleType(this.mDWLifecycleType);
                DWContext dWContext = this.mDWContext;
                this.mRootView.addView(this.mDWVideoController.Y(), 0, new FrameLayout.LayoutParams(dWContext.mWidth, dWContext.mHeight));
                this.mDWContext.getVideo().l(this);
                this.mDWContext.getVideo().g(this);
                this.mDWVideoController.s0(this.mCloseViewClickListener);
                this.mDWVideoController.B0(this.mRootViewClickListener);
                this.mDWVideoController.u0(this.mRootViewTouchListener);
                this.mDWVideoController.v0(this.mHookStartListener);
                if (this.mHideCloseView) {
                    this.mDWVideoController.Z();
                } else {
                    this.mDWVideoController.E0();
                }
                if (this.mDWContext.isHideController()) {
                    this.mDWVideoController.a0();
                } else {
                    this.mDWVideoController.F0();
                }
                View view = this.mCoverView;
                if (view != null) {
                    this.mDWVideoController.A(view, this.mCoverViewLayoutParams);
                }
                this.mDWVideoController.n0(this);
            }
        }
    }

    public void addCustomParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_addCustomParams);
        this.mDWContext.addCustomParams(hashMap);
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_addFullScreenCustomView);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.B(view);
        }
    }

    public void addPlayExpUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_addPlayExpUtParams);
        this.mDWContext.addPlayExpUtParams(hashMap);
    }

    public void addUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65ae46", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_addUtParams);
        this.mDWContext.addUtParams(hashMap);
    }

    public void asyncPrepareVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_asyncPrepareVideo);
        if (this.mDWVideoController != null && this.mDWContext.getInstanceType() == DWInstanceType.VIDEO) {
            this.mDWVideoController.E();
        }
    }

    public void bindWindow(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c507bd3", new Object[]{this, window});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_bindWindow);
        this.mDWContext.bindWindow(window);
    }

    public void closeVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_closeVideo);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.F();
        }
    }

    public void commitEndForMultiplexing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_commitEndForMultiplexing);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.K();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_destroy);
        if (!this.mDestroy) {
            this.mDestroy = true;
            f fVar = this.mDWVideoController;
            if (fVar != null) {
                fVar.T();
                this.mDWVideoController = null;
            }
            DWContext dWContext = this.mDWContext;
            if (dWContext != null) {
                dWContext.destroy();
            }
            a95 a95Var = this.mDWPicController;
            if (a95Var != null) {
                a95Var.b();
            }
            this.mVideoLoopCompleteListener = null;
            this.mRootView = null;
        }
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getCurrentPosition);
        f fVar = this.mDWVideoController;
        if (fVar == null || fVar.z()) {
            return 0;
        }
        return this.mDWContext.getVideo().getCurrentPosition();
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getDuration);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || dWContext.getVideo() == null) {
            return 0L;
        }
        return this.mDWContext.getVideo().getDuration();
    }

    public DWInstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstanceType) ipChange.ipc$dispatch("43ddfe31", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getInstanceType);
        return this.mDWContext.getInstanceType();
    }

    public Map<String, String> getPlayerQos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getPlayerQos);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            return fVar.V();
        }
        return null;
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getVideoState);
        if (this.mDWContext.getVideo() == null) {
            return 0;
        }
        return this.mDWContext.getVideo().getVideoState();
    }

    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_getView);
        return this.mRootView;
    }

    public void hideCloseView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417f1ca2", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_hideCloseView);
        this.mHideCloseView = true;
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.Z();
        }
    }

    public void hideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_hideController);
        this.mDWContext.hideControllerView(true);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.a0();
        }
    }

    public void hideGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_hideGoodsListView);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.b0();
        }
    }

    public void hideMiniProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b911c234", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_hideMiniProgressBar);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.c0();
        }
    }

    public void hideTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_hideTopEventView);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.d0();
        }
    }

    public void initAdapter(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c19897", new Object[]{this, eVar});
        }
    }

    public boolean isFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_isFullScreen);
        if (this.mDWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_isMute);
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || !dWContext.isMute()) {
            return false;
        }
        return true;
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_mute);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWInstance this=" + this + ", mute=" + z);
        this.mDWContext.mute(z);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.f0(z);
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        a95 a95Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onLifecycleChanged);
        if (dWLifecycleType == DWLifecycleType.AFTER) {
            if (this.mVideoLifecycleListener != null && getVideoState() == 4) {
                this.mVideoLifecycleListener.onVideoComplete();
            }
            if (this.mVideoLifecycleListener2 != null && getVideoState() == 4) {
                this.mVideoLifecycleListener2.onVideoComplete();
            }
        } else if (dWLifecycleType == DWLifecycleType.MID) {
            a95 a95Var2 = this.mDWPicController;
            if (a95Var2 != null) {
                a95Var2.c().setVisibility(4);
            }
        } else if (dWLifecycleType == DWLifecycleType.BEFORE && (a95Var = this.mDWPicController) != null) {
            a95Var.c().setVisibility(0);
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onLoopCompletion);
        aub aubVar = this.mVideoLoopCompleteListener;
        if (aubVar != null) {
            aubVar.onLoopCompletion();
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoClose);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoClose();
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoClose();
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaClose();
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoComplete);
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaComplete();
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoError);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoError(obj, i, i2);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoError(obj, i, i2);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            ascVar.onMediaError((IMediaPlayer) obj, i, i2);
        } else {
            ascVar.onMediaError(null, i, i2);
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoInfo);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoInfo(obj, (int) j, (int) j2);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoInfo(obj, j, j2, j3, obj2);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            ascVar.onMediaInfo((IMediaPlayer) obj, j, j2, j3, obj2);
        } else {
            ascVar.onMediaInfo(null, j, j2, j3, obj2);
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoPause);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoPause(z);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoPause(z);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaPause(z);
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoPlay);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " onVideoPlay");
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoPlay();
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoPlay();
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaPlay();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoPrepared);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoPrepared(obj);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoPrepared(obj);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar == null) {
            return;
        }
        if (obj instanceof IMediaPlayer) {
            ascVar.onMediaPrepared((IMediaPlayer) obj);
        } else {
            ascVar.onMediaPrepared(null);
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoProgressChanged);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoProgressChanged(i, i2, i3);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoProgressChanged(i, i2, i3);
        }
        if (this.mVideoPlayTimeListener != null) {
            f fVar = this.mDWVideoController;
            if (fVar != null) {
                j = fVar.X();
            } else {
                j = -1;
            }
            this.mVideoPlayTimeListener.onVideoPlayTimeChanged(j);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaProgressChanged(i, i2, i3);
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoScreenChanged);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar == null) {
            return;
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            ztbVar.onVideoNormalScreen();
        } else {
            ztbVar.onVideoFullScreen();
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoSeekTo);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoSeekTo(i);
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoSeekTo(i);
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaSeekTo(i);
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_onVideoStart);
        ztb ztbVar = this.mVideoLifecycleListener;
        if (ztbVar != null) {
            ztbVar.onVideoStart();
        }
        ytb ytbVar = this.mVideoLifecycleListener2;
        if (ytbVar != null) {
            ytbVar.onVideoStart();
        }
        asc ascVar = this.mMediaPlayLifeCycleListener;
        if (ascVar != null) {
            ascVar.onMediaStart();
        }
    }

    public void orientationDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a29e37f", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_orientationDisable);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.i0();
        }
    }

    public void orientationEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42dfe7a", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_orientationEnable);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.j0();
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_pauseVideo);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.k0();
        }
    }

    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_playVideo);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.l0();
        }
    }

    public void preDownload(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb6e9f1", new Object[]{this, new Integer(i)});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_preDownload);
        }
    }

    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_prepareToFirstFrame);
        if (this.mDWVideoController != null && this.mDWContext.getInstanceType() == DWInstanceType.VIDEO) {
            this.mDWVideoController.m0();
        }
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_removeFullScreenCustomView);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.p0();
        }
    }

    public void replay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79d80ee", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_replay);
        f fVar = this.mDWVideoController;
        if (fVar != null && !fVar.z() && this.mDWContext.getInstanceType() != DWInstanceType.PIC) {
            this.mDWVideoController.q0();
        }
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_seekTo);
        f fVar = this.mDWVideoController;
        if (fVar != null && !fVar.z() && this.mDWContext.getInstanceType() != DWInstanceType.PIC) {
            this.mDWVideoController.r0(i);
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else if (!this.mSetup) {
            this.mDWContext.mFrom = str;
        }
    }

    public void setDWLifecycleType(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d45060", new Object[]{this, dWLifecycleType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setDWLifecycleType);
        this.mDWLifecycleType = dWLifecycleType;
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.y0(dWLifecycleType);
        }
    }

    public void setFirstRenderAdapter(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setFirstRenderAdapter);
        DWContext dWContext = this.mDWContext;
        if (dWContext != null) {
            if (nj9Var != null) {
                dWContext.setNeedCommitUserToFirstFrame(true);
            } else {
                dWContext.setNeedCommitUserToFirstFrame(false);
            }
        }
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.t0(nj9Var);
        } else {
            this.mExternFirstRenderAdapter = nj9Var;
        }
    }

    public void setFrame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setFrame);
        DWContext dWContext = this.mDWContext;
        dWContext.mWidth = i;
        dWContext.mHeight = i2;
        if (!dWContext.isFloating()) {
            DWContext dWContext2 = this.mDWContext;
            dWContext2.mNormalWidth = i;
            dWContext2.mNormalHeight = i2;
        }
        if (this.mDWVideoController != null && this.mRootView != null) {
            DWContext dWContext3 = this.mDWContext;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dWContext3.mWidth, dWContext3.mHeight);
            if (this.mDWVideoController.Y().getParent() == null) {
                this.mRootView.addView(this.mDWVideoController.Y(), layoutParams);
            } else {
                this.mDWVideoController.Y().getLayoutParams().width = this.mDWContext.mWidth;
                this.mDWVideoController.Y().getLayoutParams().height = this.mDWContext.mHeight;
            }
            FrameLayout frameLayout = this.mRootView;
            if (frameLayout != null) {
                frameLayout.post(new a());
            }
            FrameLayout frameLayout2 = this.mRootView;
            if (frameLayout2 != null) {
                frameLayout2.post(new b());
            }
        }
    }

    public void setHookRootViewTouchListener(rtb rtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c33a5", new Object[]{this, rtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setHookRootViewTouchListener);
        this.mRootViewTouchListener = rtbVar;
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.u0(rtbVar);
        }
    }

    public void setIDWMutedChangeListener(htb htbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb02b4", new Object[]{this, htbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setIDWMutedChangeListener);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.w0(htbVar);
        }
    }

    public void setIVideoLoopCompleteListener(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setIVideoLoopCompleteListener);
        this.mVideoLoopCompleteListener = aubVar;
    }

    public void setInstanceType(DWInstanceType dWInstanceType) {
        DWInstanceType dWInstanceType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setInstanceType);
        if (!this.mDestroy) {
            DWInstanceType instanceType = this.mDWContext.getInstanceType();
            DWInstanceType dWInstanceType3 = DWInstanceType.PIC;
            if (instanceType == dWInstanceType3 && dWInstanceType == (dWInstanceType2 = DWInstanceType.VIDEO)) {
                this.mDWContext.setInstanceType(dWInstanceType2);
                initVideoMode();
            } else if (this.mDWContext.getInstanceType() == DWInstanceType.VIDEO && dWInstanceType == dWInstanceType3) {
                this.mDWContext.setInstanceType(dWInstanceType3);
                if (this.mDWPicController == null) {
                    initPicMode();
                } else {
                    this.mDWVideoController.y0(DWLifecycleType.BEFORE);
                }
            }
        }
    }

    public void setNeedGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a6efbc", new Object[]{this, new Boolean(z)});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setNeedGesture);
        }
    }

    public void setNormalControllerListener(mtb mtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100d063a", new Object[]{this, mtbVar});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setNormalControllerListener);
        }
    }

    public void setOpenVolumeFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setOpenVolumeFadeIn);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.z0(z);
        }
    }

    public void setPicViewClickListener(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setPicViewClickListener);
        this.mPicViewClickListener = qtbVar;
        a95 a95Var = this.mDWPicController;
        if (a95Var != null) {
            a95Var.e(qtbVar);
        }
    }

    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setPlayRate);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.A0(f);
        }
    }

    public void setRootViewClickListener(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setRootViewClickListener);
        this.mRootViewClickListener = qtbVar;
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.B0(qtbVar);
        }
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setShowNotWifiHint);
        this.mDWContext.setShowNotWifiHint(z);
    }

    public void setUTParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setUTParams);
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && hashMap != null) {
            dWContext.addUtParams(hashMap);
        }
    }

    public void setVideoBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVideoBackgroundColor);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.C0(i);
        }
    }

    public void setVideoLifecycleListener(ztb ztbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d7471c", new Object[]{this, ztbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVideoLifecycleListener);
        this.mVideoLifecycleListener = ztbVar;
    }

    public void setVideoLifecycleListener2(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVideoLifecycleListener2);
        this.mVideoLifecycleListener2 = ytbVar;
    }

    public void setVideoPlayTimeListener(cub cubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb08e2a", new Object[]{this, cubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVideoPlayTimeListener);
        this.mVideoPlayTimeListener = cubVar;
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVideoUrl);
        if (!this.mSetup) {
            DWContext dWContext = this.mDWContext;
            Map<String, String> map = dWContext.mHttpHeader;
            if (map != null) {
                dWContext.mPlayContext.setRequestHeader(map);
            }
            this.mDWContext.mPlayContext.setVideoUrl(str);
        }
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_setVolume);
        }
    }

    public void showController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_showController);
        this.mDWContext.hideControllerView(false);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.F0();
        }
    }

    public void showMiniProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a13c99", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_showMiniProgressBar);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.H0();
        }
    }

    public void showOrHideInteractive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_showOrHideInteractive);
        this.mDWContext.showInteractive(z);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.I0(z);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_start);
        if (this.mDWVideoController != null && this.mDWContext.getInstanceType() == DWInstanceType.VIDEO) {
            if (this.mInnerStartListener == null) {
                InnerStartFuncListenerImpl innerStartFuncListenerImpl = new InnerStartFuncListenerImpl();
                this.mInnerStartListener = innerStartFuncListenerImpl;
                this.mDWVideoController.x0(innerStartFuncListenerImpl);
            }
            this.mDWVideoController.K0();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("tbplayer_start_time", String.valueOf(System.currentTimeMillis()));
            addPlayExpUtParams(hashMap);
        }
    }

    public void toggleScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_toggleScreen);
        f fVar = this.mDWVideoController;
        if (fVar != null) {
            fVar.N0();
        }
    }

    public void unbindWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c058f6d", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_unbindWindow);
        this.mDWContext.unbindWindow();
    }

    private boolean checkParams() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mDWContext.mFrom) || TextUtils.isEmpty(this.mDWContext.mVideoSource) || TextUtils.isEmpty(this.mDWContext.mVideoId)) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "缺少必填参数 bizCode、videoSource、videoId！！");
        }
        if (TextUtils.isEmpty(this.mDWContext.mFrom)) {
            this.mDWContext.mFrom = "default";
        }
        if (TextUtils.isEmpty(this.mDWContext.mVideoSource)) {
            DWContext dWContext = this.mDWContext;
            dWContext.mPlayContext.mVideoSource = "TBVideo";
            dWContext.mVideoSource = "TBVideo";
        }
        if (!TextUtils.isEmpty(this.mDWContext.mPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.mDWContext.getVideoId()) && "TBVideo".equals(this.mDWContext.getVideoSource())) {
            try {
                String rawPath = new URI(this.mDWContext.mPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i) {
                    DWContext dWContext2 = this.mDWContext;
                    MediaPlayControlContext mediaPlayControlContext = dWContext2.mPlayContext;
                    String substring = rawPath.substring(i, lastIndexOf2);
                    mediaPlayControlContext.mVideoId = substring;
                    dWContext2.mVideoId = substring;
                }
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(this.mDWContext.mVideoId);
    }

    public void setup(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c6a0f9", new Object[]{this, eVar});
            return;
        }
        this.mSetup = true;
        if (!checkParams()) {
            if (MediaSystemUtils.isApkDebuggable()) {
                String str = "";
                if (this.mDWContext.getUTParams() != null) {
                    for (Map.Entry<String, String> entry : this.mDWContext.getUTParams().entrySet()) {
                        str = str + entry.getKey() + "=" + entry.getValue() + ";";
                    }
                }
                if (this.mDWContext != null) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, " please set mBizCode , mVideoSource and  mVideoId parameters" + str);
                }
            } else if (this.mDWContext != null) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "please set mBizCode , mVideoSource and  mVideoId parameters" + this.mDWContext.mPlayContext.getVideoUrl());
            }
        }
        initUTParams(eVar);
        initPlayExpUTParams(eVar);
        initControlParams(eVar);
        int i = c.$SwitchMap$com$taobao$avplayer$DWInstanceType[this.mDWContext.getInstanceType().ordinal()];
        if (i == 1) {
            initVideoMode();
        } else if (i == 2) {
            initPicMode();
        }
    }
}
