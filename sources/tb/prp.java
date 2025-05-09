package tb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.video.manager.CardMissVideoStatusManager;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.f9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class prp extends ici implements cob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_MISS_VIDEO_STATUS_PAUSE = "Pause";
    public static final String CARD_MISS_VIDEO_STATUS_RECYCLE = "Recycle";
    public static final String CARD_MISS_VIDEO_STATUS_STOP = "Stop";
    public static final String CARD_NAME = "视频卡";
    public static final int MAX_VIDEO_DELAY_TIME = 600;
    public static final String SCENCE_NAME = "guangguang";
    public static final String TAG = "ShortVideoCard";
    public static final String TAG_SHARE_PLAYER = "AVSDK_VideoComponentsControllSharePlayer";
    public static final Handler mHandler = new Handler(Looper.getMainLooper());
    private static final int r0 = 0;
    private static final int s0 = 17;
    private final d5w I;
    private final yfo X;
    private final a6w Y;
    private final m8w Z;
    private final nja a0;
    private final l8p b0;
    private final n8p c0;
    private h6m e0;
    private a.e f0;
    private boolean h0;
    private boolean i0;
    private int l0;
    private String m0;
    private d7m o0;
    private IFeedsListService p0;
    private int q0;
    private final Handler d0 = new a(Looper.getMainLooper());
    private boolean g0 = false;
    private final Handler j0 = new b(Looper.getMainLooper());
    @Deprecated
    private boolean k0 = false;
    private boolean n0 = false;
    private final d6w K = new d6w(this);
    private final CardMissVideoStatusManager L = new CardMissVideoStatusManager(this);
    private final q9w M = new q9w(this);
    private final a85 O = new a85(this);
    private final e85 P = new e85(this);
    private final obf Q = new obf(this);
    private final hgl R = new hgl(this);
    private final nfj S = new nfj(this);
    private final wfg N = new wfg(this);
    private final b5w J = new b5w(this);
    private final i6m T = new i6m(this);
    private final vq9 H = new vq9(this);
    private final ha7 U = new ha7(this);
    private final d59 V = new d59(this);
    private final spn W = new spn(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/ShortVideoCard$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            prp.this.P0();
            ir9.b(prp.TAG, "[上下滑] onPreloadVideoPlayerHandler videoAppearPlay 请求播放器,appeared:" + prp.this.i0() + "，position=" + prp.this.M());
            if (prp.this.i0()) {
                c5w.c(prp.b1(prp.this), prp.c1(prp.this), prp.this.M());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/ShortVideoCard$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            prp.d1(prp.this);
            prp.this.O0(true);
            prp.this.T0();
            prp.e1(prp.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends f9e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2043369346) {
                super.onVideoStart((uq9) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/ShortVideoCard$3");
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            prp.g1(prp.this, i);
            if (!eps.b()) {
                if (prp.this.n1() != null) {
                    z = prp.this.n1().U();
                }
                boolean f = prp.i1(prp.this).f();
                if (!z && !f) {
                    ((IUsePreloadService) prp.this.U().getService(IUsePreloadService.class)).startPreloadVideo(prp.this.Z(), i, i3, i2);
                }
            } else if (prp.f1(prp.this).b(i, i2, i3)) {
                prp.h1(prp.this).notifyCardHealthyChange(prp.this, prp.f1(prp.this).a());
            }
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoStart(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
                return;
            }
            super.onVideoStart(uq9Var);
            prp.f1(prp.this).c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            prp.this.P0();
            prp.this.V0(false);
            prp.j1(prp.this, true);
        }
    }

    static {
        t2o.a(468713991);
        t2o.a(468714525);
        t2o.a(468713688);
    }

    public prp(FluidContext fluidContext) {
        super(fluidContext);
        this.o0 = null;
        this.p0 = null;
        this.q0 = 0;
        this.I = new d5w(fluidContext, this);
        this.X = new yfo(fluidContext, this);
        this.Y = new a6w(fluidContext, this);
        this.Z = new m8w(fluidContext, this);
        this.a0 = new nja(fluidContext, this);
        this.b0 = new l8p(fluidContext, this);
        this.c0 = new n8p(fluidContext, this);
        this.o0 = new d7m();
        this.p0 = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        this.q0 = eps.n(fluidContext);
    }

    public static /* synthetic */ FluidContext b1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("8ee4a027", new Object[]{prpVar});
        }
        return prpVar.f29555a;
    }

    public static /* synthetic */ ici c1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ici) ipChange.ipc$dispatch("ec2d330b", new Object[]{prpVar});
        }
        return prpVar.l();
    }

    public static /* synthetic */ void d1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f91e503", new Object[]{prpVar});
        } else {
            prpVar.Q1();
        }
    }

    public static /* synthetic */ boolean e1(prp prpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a48dd2", new Object[]{prpVar, new Boolean(z)})).booleanValue();
        }
        prpVar.i0 = z;
        return z;
    }

    public static /* synthetic */ d7m f1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d7m) ipChange.ipc$dispatch("3e26cf85", new Object[]{prpVar});
        }
        return prpVar.o0;
    }

    public static /* synthetic */ int g1(prp prpVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("add2a8ae", new Object[]{prpVar, new Integer(i)})).intValue();
        }
        prpVar.l0 = i;
        return i;
    }

    public static /* synthetic */ ICardService h1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICardService) ipChange.ipc$dispatch("4a10d18c", new Object[]{prpVar});
        }
        return prpVar.h;
    }

    public static /* synthetic */ a85 i1(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a85) ipChange.ipc$dispatch("fce5bfaa", new Object[]{prpVar});
        }
        return prpVar.O;
    }

    public static /* synthetic */ Object ipc$super(prp prpVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2035233037:
                super.onShowCover((uq9) objArr[0]);
                return null;
            case -1836003525:
                super.onWillDisActive((uq9) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1408618771:
                super.onRequestMediaPlayer((uq9) objArr[0]);
                return null;
            case -1249298707:
                super.onDisActive((uq9) objArr[0]);
                return null;
            case -1123719365:
                super.onStopMedia((uq9) objArr[0]);
                return null;
            case -1077203903:
                return super.Q();
            case -775309827:
                return new Integer(super.H0());
            case -372824644:
                super.onDisAppear((uq9) objArr[0]);
                return null;
            case -228339441:
                super.onWillActive((uq9) objArr[0]);
                return null;
            case -147728739:
                super.onActive((uq9) objArr[0]);
                return null;
            case 417248746:
                super.onDataUpdate((uq9) objArr[0]);
                return null;
            case 573675291:
                super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue(), (List) objArr[3]);
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
            case 1316894249:
                super.onShowFirstCover((uq9) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (Drawable) objArr[3], (String) objArr[4]);
                return null;
            case 1431518332:
                super.onUTPairsUpdate((uq9) objArr[0]);
                return null;
            case 1531961849:
                super.onStartMedia((uq9) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1669569633:
                super.n0(((Number) objArr[0]).floatValue());
                return null;
            case 2063982600:
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            case 2072452071:
                super.onRecyclePlayer((uq9) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/ShortVideoCard");
        }
    }

    public static /* synthetic */ boolean j1(prp prpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("741870ad", new Object[]{prpVar, new Boolean(z)})).booleanValue();
        }
        prpVar.h0 = z;
        return z;
    }

    public static int k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89abddfa", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("delayDestroyTimeoutForGuangGuangPick", "60"));
        } catch (Throwable th) {
            ir9.c(TAG, "", th);
            return 60;
        }
    }

    private ici l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ici) ipChange.ipc$dispatch("bf353c48", new Object[]{this});
        }
        return this;
    }

    private LinearLayout.LayoutParams q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("210963ec", new Object[]{this});
        }
        return new LinearLayout.LayoutParams(-1, 0, 1.0f);
    }

    public d5w A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d5w) ipChange.ipc$dispatch("e971b07f", new Object[]{this});
        }
        return this.I;
    }

    public a6w B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a6w) ipChange.ipc$dispatch("f4e9ad6e", new Object[]{this});
        }
        return this.Y;
    }

    public int C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b8ca37", new Object[]{this})).intValue();
        }
        return this.l0;
    }

    @Override // tb.ulb
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a3ace76", new Object[]{this})).intValue();
        }
        return R.layout.fluid_sdk_ly_shortvideo_card;
    }

    public a.e D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.e) ipChange.ipc$dispatch("2500012e", new Object[]{this});
        }
        return this.f0;
    }

    public String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.m0;
    }

    public m8w F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8w) ipChange.ipc$dispatch("bb294534", new Object[]{this});
        }
        return this.Z;
    }

    public q9w G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q9w) ipChange.ipc$dispatch("2e148aed", new Object[]{this});
        }
        return this.M;
    }

    @Override // tb.ici
    public int H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1c9b5fd", new Object[]{this})).intValue();
        }
        if (getDWInstance() != null) {
            return getDWInstance().getVideoState();
        }
        return super.H0();
    }

    public String H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4f3e859", new Object[]{this});
        }
        a.e eVar = this.f0;
        if (eVar != null) {
            return eVar.t();
        }
        return "null";
    }

    public a.e I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.e) ipChange.ipc$dispatch("9bbd6c8d", new Object[]{this});
        }
        return this.f0;
    }

    @Override // tb.ulb
    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5435485a", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37cd450b", new Object[]{this})).booleanValue();
        }
        return this.i0;
    }

    public boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c199ffe", new Object[]{this})).booleanValue();
        }
        return this.k0;
    }

    public boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c772f322", new Object[]{this})).booleanValue();
        }
        return this.n0;
    }

    public boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("788305cd", new Object[]{this})).booleanValue();
        }
        return this.h0;
    }

    public void P1(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5e40e9", new Object[]{this, viewGroup});
            return;
        }
        atb dWInstance = getDWInstance();
        VideoRoundCornerLayout Q = this.X.Q();
        if (dWInstance != null && dWInstance.getView() == viewGroup && viewGroup.getParent() == Q) {
            ViewGroup viewGroup2 = (ViewGroup) this.p.findViewById(R.id.favor_frame);
            viewGroup2.forceLayout();
            Q.forceLayout();
            viewGroup.forceLayout();
            this.p.forceLayout();
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewGroup2);
                viewGroup3.addView(viewGroup2, 0, q1());
            }
            viewGroup2.removeView(Q);
            viewGroup2.addView(Q, 0, qrp.h());
            Q.removeView(viewGroup);
            Q.addView(viewGroup, 0, this.M.b());
            this.p.requestLayout();
        }
    }

    @Override // tb.uq9
    public ViewGroup Q() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bfcb2c41", new Object[]{this});
        }
        View view = this.p;
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.favor_frame)) == null) {
            return super.Q();
        }
        return viewGroup;
    }

    public void R1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bcc075", new Object[]{this, new Boolean(z)});
        } else {
            this.i0 = z;
        }
    }

    @Override // tb.uq9
    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f5131d", new Object[]{this});
        }
        return this.m0;
    }

    public void S1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d1e152", new Object[]{this, new Boolean(z)});
        } else {
            this.k0 = z;
        }
    }

    public void T1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ccd53e", new Object[]{this, new Boolean(z)});
        } else {
            this.n0 = z;
        }
    }

    public void U1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84515ff3", new Object[]{this, new Boolean(z)});
        } else {
            this.h0 = z;
        }
    }

    @Override // tb.ici
    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af2faec0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ici
    public void Z0(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        } else {
            this.a0.Q(bool, bool2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        } else {
            this.K.b();
        }
    }

    public atb getDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("3f62c678", new Object[]{this});
        }
        return this.K.getDWInstance();
    }

    @Override // tb.uq9, tb.ulb
    public View i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("56c836dd", new Object[]{this, viewGroup});
        }
        ir9.b(TAG, "CardLifecycle ShortVideoCard.getCardLayoutView ");
        return new qrp().f(viewGroup.getContext());
    }

    @Override // tb.ici
    public void k(qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec31384", new Object[]{this, qy0Var});
        }
    }

    public CardMissVideoStatusManager l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardMissVideoStatusManager) ipChange.ipc$dispatch("36056d78", new Object[]{this});
        }
        return this.L;
    }

    @Override // tb.cob
    public void m(String str, com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36613d49", new Object[]{this, str, aVar});
            return;
        }
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.k(str, aVar);
        }
    }

    public a85 m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a85) ipChange.ipc$dispatch("de654a98", new Object[]{this});
        }
        return this.O;
    }

    @Override // tb.uq9
    public void n0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63839c61", new Object[]{this, new Float(f)});
            return;
        }
        super.n0(f);
        View Y = y1().Y();
        if (Y != null) {
            Y.setAlpha(f);
        }
    }

    public d6w n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d6w) ipChange.ipc$dispatch("54046da7", new Object[]{this});
        }
        return this.K;
    }

    @Override // tb.cob
    public void o(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc2a93", new Object[]{this, aVar});
            return;
        }
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.j(aVar);
        }
    }

    public e85 o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e85) ipChange.ipc$dispatch("6afbda58", new Object[]{this});
        }
        return this.P;
    }

    @Override // tb.ici, tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        igs.a("onBindData");
        super.onBindData(uq9Var, aVar, i);
        ir9.b(TAG, "onBindData position:" + i);
        this.M.g("onbind", false);
        a.d e = aVar.e();
        this.m0 = e != null ? e.O() : "";
        mca globalState = ((ISceneConfigService) this.f29555a.getService(ISceneConfigService.class)).getGlobalState();
        int M = M();
        this.f0 = e.K();
        onDataUpdate(uq9Var);
        J1(i, globalState, M);
        Q1();
        K1(globalState, M);
        s0j.d(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA);
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        igs.a("onCreateView");
        super.onCreateView(uq9Var, recyclerViewHolder);
        ir9.b(TAG, "CardLifecycle ShortVideoCard.onCreateView ");
        s0j.a(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT);
        this.e0 = new h6m(this, this.X.Q(), this.Y.Q(), this.b0.Y());
        s0j.d(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT);
        this.B.addVideoPlayerListener((f9e.a) new c());
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onDataUpdate");
        super.onDataUpdate(uq9Var);
        this.X.S();
        this.X.Q().setTag(R.id.fluid_sdk_content_key, P());
        this.b0.C0();
        iim iimVar = this.w;
        if (iimVar != null) {
            iimVar.r(this);
        }
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ir9.b(TAG, "PageLifecycle video page ShortVideoCard.onDestroy " + M());
        if (this.t) {
            Q1();
            O0(false);
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onDisAppear");
        super.onDisAppear(uq9Var);
        if (!this.t) {
            igs.c();
            return;
        }
        Q1();
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onPauseMedia");
        super.onPauseMedia(uq9Var);
        this.K.onPauseMedia(uq9Var);
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onRecycle");
        super.onRecycle(uq9Var);
        if (!this.t) {
            igs.c();
            return;
        }
        Q1();
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        igs.a("onRecyclePlayer");
        super.onRecyclePlayer(uq9Var, z);
        this.K.onRecyclePlayer(uq9Var, z);
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onRequestMediaPlayer");
        super.onRequestMediaPlayer(uq9Var);
        this.K.onRequestMediaPlayer(uq9Var);
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (pto.o(this.f29555a) && this.t && h0() && this.i0) {
            this.i0 = false;
            V0(false);
        }
    }

    @Override // tb.ici, tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onShowCover");
        super.onShowCover(uq9Var);
        this.Y.S();
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        igs.a("onShowFirstCover");
        super.onShowFirstCover(uq9Var, i, i2, drawable, str);
        this.Y.T(i, i2, drawable, str);
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        igs.a("onStartMedia");
        super.onStartMedia(uq9Var, z, z2);
        this.K.onStartMedia(uq9Var, z, z2);
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onStopMedia");
        super.onStopMedia(uq9Var);
        this.K.onStopMedia(uq9Var);
        igs.c();
    }

    @Override // tb.ici, tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
            return;
        }
        super.onUTPairsUpdate(uq9Var);
        if (this.K.getDWInstance() != null && this.f0 != null) {
            this.K.E();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onWillActive");
        super.onWillActive(uq9Var);
        if (!this.t) {
            igs.c();
            return;
        }
        Q1();
        az9.o(new d(), 3003, az9.n(200), "startMedia");
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onWillDisActive");
        super.onWillDisActive(uq9Var);
        this.o0.d();
        igs.c();
    }

    public Handler p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9421074a", new Object[]{this});
        }
        return this.j0;
    }

    public d59 r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d59) ipChange.ipc$dispatch("58263436", new Object[]{this});
        }
        return this.V;
    }

    public obf s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obf) ipChange.ipc$dispatch("d6c0762e", new Object[]{this});
        }
        return this.Q;
    }

    public wfg t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wfg) ipChange.ipc$dispatch("11632398", new Object[]{this});
        }
        return this.N;
    }

    @Override // tb.ici
    public void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f)});
        } else {
            this.K.u(f);
        }
    }

    @Override // tb.ici
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
        } else {
            this.K.update12003UtParams(map);
        }
    }

    @Override // tb.uq9
    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb0eb7d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public hgl v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hgl) ipChange.ipc$dispatch("50cac3f2", new Object[]{this});
        }
        return this.R;
    }

    public i6m w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6m) ipChange.ipc$dispatch("ec0703a5", new Object[]{this});
        }
        return this.T;
    }

    public yfo x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yfo) ipChange.ipc$dispatch("7035380f", new Object[]{this});
        }
        return this.X;
    }

    @Override // tb.ulb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc13a868", new Object[]{this});
        }
        return CARD_NAME;
    }

    public l8p y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l8p) ipChange.ipc$dispatch("16f98854", new Object[]{this});
        }
        return this.b0;
    }

    public b5w z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5w) ipChange.ipc$dispatch("8a49a03a", new Object[]{this});
        }
        return this.J;
    }

    private void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f80d60f", new Object[]{this});
            return;
        }
        ir9.b(TAG, "videoAppearPlay,removePreCreatePlayerMessages");
        this.d0.removeMessages(0);
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onActive");
        super.onActive(uq9Var);
        ((ICollectionService) this.f29555a.getService(ICollectionService.class)).setVideoResizeForCollectionPopLayer(this.f29555a, this.w, this.p, this);
        if (!this.t) {
            igs.c();
        } else if (((ILifecycleService) this.f29555a.getService(ILifecycleService.class)).getPageState() == 5) {
            igs.c();
        } else {
            ir9.b(TAG, "CardLifecycle video cardo ShortVideoCard.onActive ,adFlag:" + o83.a(this) + ",position:" + M() + " title=" + o83.b(this));
            s0j.a(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE);
            Q1();
            P0();
            V0(false);
            s0j.d(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE);
            ((ICardService) this.f29555a.getService(ICardService.class)).setCardPrivateViewForegroundTime(System.currentTimeMillis());
            this.o0.c();
            igs.c();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        igs.a(h9z.EVENT_ON_APPEAR);
        super.onAppear(uq9Var);
        ir9.b(TAG, "CardLifecycle video cardo ShortVideoCard.onAppear videoAppearPlay" + M() + " mVideoId=" + this.m0);
        if (!this.t) {
            igs.c();
            return;
        }
        this.M.e();
        s0j.a(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR);
        Q1();
        T0();
        boolean isFastScroll = ((IFeedsListService) this.f29555a.getService(IFeedsListService.class)).isFastScroll();
        ir9.b(TAG, "onAppear,videoAppearPlay isFastScroll:" + isFastScroll);
        if (!isFastScroll) {
            this.d0.sendEmptyMessageDelayed(0, 17L);
        }
        s0j.d(s0j.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR);
        igs.c();
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onDisActive");
        super.onDisActive(uq9Var);
        if (!this.t) {
            igs.c();
            return;
        }
        ((ICardService) this.f29555a.getService(ICardService.class)).setCardPrivateViewForegroundTime(0L);
        this.n0 = false;
        igs.c();
    }

    private void J1(int i, mca mcaVar, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c81b99", new Object[]{this, new Integer(i), mcaVar, new Integer(i2)});
            return;
        }
        boolean z2 = mcaVar.b;
        if (!z2 || i != 0) {
            z = false;
        }
        this.g0 = z;
        if (!z2 || i2 != 0) {
            T0();
            return;
        }
        rv4 b2 = qv4.c().b(this.f29555a.getInstanceConfig().getPreCoverKey());
        if (b2 == null) {
            b2 = this.f29555a.getInstanceConfig().getCoverObject();
        }
        if (b2 == null || (b2.c() == null && b2.f() == null)) {
            T0();
            return;
        }
        ir9.a(TAG_SHARE_PLAYER, "onBindData coverObject != null && (coverObject.getCover() != null || coverObject.getFirstFrameUrl()!=null");
        Drawable c2 = b2.c();
        if (b2.e() != null) {
            ir9.a(TAG_SHARE_PLAYER, "onBindData coverObject.getFirstFrame() != null,getFirstFrame:" + b2.e());
            c2 = b2.e();
        }
        U0(b2.m(), b2.g(), c2, b2.f());
    }

    private void K1(mca mcaVar, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b2baf1", new Object[]{this, mcaVar, new Integer(i)});
            return;
        }
        Q1();
        if (!mcaVar.b || i != 0) {
            int i3 = this.q0;
            if (i3 == 1) {
                i2 = eps.i();
            } else if (i3 <= 1) {
                i2 = -1;
            } else if (Math.abs(i - this.p0.getLastAppearCardPos()) <= 1) {
                i2 = eps.i();
            } else {
                i2 = eps.j();
            }
            ir9.b(TAG, "requestMediaPlayerIfNeeded delay:" + i2 + " , " + i);
            if (i2 >= 0) {
                if (i2 == 0) {
                    P0();
                } else {
                    this.d0.sendEmptyMessageDelayed(0, i2);
                }
            } else if (eps.e() && Z() != null && (Z().n() instanceof fsp) && ((fsp) Z().n()).P()) {
                ir9.b(TAG, "hit card warm up createdw");
                P0();
            } else if (this.K.K()) {
                int c2 = zk1.c();
                if (c2 > 0 && c2 < 600) {
                    this.d0.sendEmptyMessageDelayed(0, c2);
                } else if (c2 == 0) {
                    P0();
                }
            }
        } else {
            mcaVar.b = false;
            P0();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ir9.b(TAG, "PageLifecycle video page ShortVideoCard.onPauseMedia " + M());
        if (pto.g(this.f29555a)) {
            if (!this.t || !h0()) {
                return;
            }
            if (oau.e()) {
                ir9.b("PickPreloadController", "onPageDisappear(),commitEndForMultiplexing,id=" + P());
                ir9.b("PickPreloadController", "onPauseMedia(),commitEndForMultiplexing");
                Q1();
                b();
                xau.u();
            } else {
                int k1 = k1();
                if (k1 > 0) {
                    this.j0.removeMessages(0);
                    this.j0.sendEmptyMessageDelayed(0, k1 * 1000);
                }
            }
        } else if (pto.o(this.f29555a)) {
            if (this.t && h0()) {
                O0(true);
                T0();
                this.i0 = true;
            } else {
                return;
            }
        }
        this.h0 = false;
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            return;
        }
        igs.a("onBindDataPayloads");
        super.onBindData(uq9Var, aVar, i, list);
        this.M.g("onbind", false);
        a.d e = aVar.e();
        ir9.b(TAG, "CardLifecycle ShortVideoCard.onBindData 2 position:" + i);
        this.f0 = e.K();
        this.g0 = false;
        onDataUpdate(uq9Var);
        a1();
        igs.c();
    }
}
