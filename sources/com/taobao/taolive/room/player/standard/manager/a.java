package com.taobao.taolive.room.player.standard.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.player.so.SoFetchController;
import com.taobao.taolive.room.player.standard.TrackMistakeController;
import com.taobao.taolive.room.player.standard.manager.a;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.BaseRecModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;
import tb.b3d;
import tb.b5l;
import tb.bte;
import tb.bxl;
import tb.cdr;
import tb.cmc;
import tb.e7m;
import tb.ejr;
import tb.giv;
import tb.hw0;
import tb.k6m;
import tb.k9d;
import tb.l6m;
import tb.m8c;
import tb.m9d;
import tb.mo1;
import tb.nwb;
import tb.o3s;
import tb.pvs;
import tb.qr4;
import tb.rbu;
import tb.sr4;
import tb.t2o;
import tb.tz3;
import tb.ujv;
import tb.up6;
import tb.ux9;
import tb.x5t;
import tb.xtt;
import tb.yh6;
import tb.yj4;
import tb.ytt;
import tb.z1i;
import tb.z2h;
import tb.z3h;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class a implements IPlayPublicService, BaseStatePlayer.j, mo1.b, e7m, TrackMistakeController.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h f13215a;
    public final BaseStatePlayer b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.room.player.standard.manager.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0753a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0753a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.P(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13217a;

        public b(String str) {
            this.f13217a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((VideoFrameErrorController) a.this.f13215a.g).h(this.f13217a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.this.n1();
            a.P(a.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f13219a;
        public final /* synthetic */ FrameLayout b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.player.standard.manager.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0754a implements nwb.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nwb f13220a;
            public final /* synthetic */ JSONObject b;

            public C0754a(nwb nwbVar, JSONObject jSONObject) {
                this.f13220a = nwbVar;
                this.b = jSONObject;
            }

            @Override // tb.nwb.a
            public void a(DXRootView dXRootView) {
                FrameLayout frameLayout;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                } else if (this.f13220a != null && dXRootView != null && (frameLayout = d.this.b) != null) {
                    frameLayout.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    d.this.b.addView(dXRootView, layoutParams);
                    this.f13220a.renderDX(dXRootView, this.b);
                }
            }
        }

        public d(Object obj, FrameLayout frameLayout) {
            this.f13219a = obj;
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a aVar = a.this;
            VideoInfo videoInfo = aVar.f13215a.m;
            if (videoInfo != null && videoInfo.landScape) {
                aVar.k();
                a aVar2 = a.this;
                aVar2.f13215a.n = true;
                if (aVar2.r0() != null) {
                    a.this.r0().hideController();
                }
                nwb b = giv.b();
                if (b != null) {
                    Object obj = this.f13219a;
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String string = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                        if (!TextUtils.isEmpty(string)) {
                            b.a(a.this.f13215a.e, string, new C0754a(b, jSONObject));
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f13221a;

        public e(FrameLayout frameLayout) {
            this.f13221a = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.Q(a.this, this.f13221a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements k9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(a aVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public BaseStatePlayer.j f13223a;
        public bxl b;
        public String c;
        public cdr d;
        public Context e;
        public z3h f;
        public com.taobao.taolive.sdk.ui.component.a g;
        public Handler h;
        public ViewGroup i;
        public View j;
        public View k;
        public TBLiveDataModel l;
        public VideoInfo m;
        public boolean n;
        public SurfaceView o;
        public boolean p = false;
        public PlayerController2 q;
        public mo1 r;
        public TrackMistakeController s;
        public TrackMistakeController.c t;
        public boolean u;

        static {
            t2o.a(779093168);
        }

        public static /* synthetic */ boolean a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11f3a0c4", new Object[]{hVar})).booleanValue();
            }
            return hVar.u;
        }

        public static /* synthetic */ boolean b(h hVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f13757d6", new Object[]{hVar, new Boolean(z)})).booleanValue();
            }
            hVar.u = z;
            return z;
        }
    }

    static {
        t2o.a(779093159);
        t2o.a(806355778);
        t2o.a(779093197);
        t2o.a(779093143);
        t2o.a(779093501);
        t2o.a(779093156);
    }

    public a(Context context, cdr cdrVar) {
        h hVar = new h();
        this.f13215a = hVar;
        hVar.d = cdrVar;
        hVar.e = context;
        BaseStatePlayer d0 = d0(context, cdrVar);
        this.b = d0;
        if (!(cdrVar == null || cdrVar.w0() == null)) {
            d0.g1(cdrVar.w0().imageUrl);
        }
        d0.z1(this);
        d0.t1(this);
        hVar.g = new VideoFrameErrorController();
        hVar.h = new Handler(Looper.getMainLooper());
        hVar.r = new mo1(this, p0());
        hVar.s = new TrackMistakeController(this, p0());
        x1();
        q1();
        o1(cdrVar);
        G0();
    }

    public static boolean M0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22c5c51", new Object[]{ux9Var})).booleanValue();
        }
        if (!(ux9Var instanceof cdr) || ux9Var.A() == null || ux9Var.A().bizCode == null) {
            return false;
        }
        return TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(ux9Var.A().bizCode);
    }

    public static /* synthetic */ void P(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a156e6c6", new Object[]{aVar});
        } else {
            aVar.F0();
        }
    }

    public static /* synthetic */ void Q(a aVar, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839490ca", new Object[]{aVar, frameLayout});
        } else {
            aVar.K1(frameLayout);
        }
    }

    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5fb2ca", new Object[]{this});
            return;
        }
        PlayerController2 r0 = r0();
        if (r0 != null) {
            r0.setDefaultControllerHolder(this.f13215a.d);
            if (up6.t0(this.f13215a.d)) {
                r0.showController(2);
            } else {
                r0.showController(1);
            }
            r0.setPlayRateDefault();
            r0.setPlayRateViewShow(pvs.j2());
            r0.setFullScreen(false);
            r0.refreshController();
        }
    }

    public void A1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e46aedb", new Object[]{this, new Long(j)});
        } else {
            this.b.D1(j);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void B(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32275e", new Object[]{this, new Long(j)});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.P1(j);
        }
    }

    public void B0(BaseFrame baseFrame, VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990ef8de", new Object[]{this, baseFrame, videoInfo, new Boolean(z)});
            return;
        }
        PlayerController2 r0 = r0();
        if (r0 != null) {
            m8c m8cVar = (m8c) baseFrame;
            if (!z) {
                new xtt(this.f13215a.d, videoInfo.liveId);
            }
            r0.setUpdateControllerHolder(this.f13215a.d, (qr4) m8cVar.getControllerHolder(null), true, D0());
            r0.setFullScreen(false);
        }
    }

    public final void B1(String str, String str2) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ebf2c5", new Object[]{this, str, str2});
            return;
        }
        O0("showNewErrorView,errorViewType=" + str + ",mCommonVariables.mErrorController:" + this.f13215a.g);
        I1();
        if (this.f13215a.g != null) {
            O0("currentPlayerState:" + ((VideoFrameErrorController) this.f13215a.g).f());
            VideoFrameErrorController.PlayerErrorState f2 = ((VideoFrameErrorController) this.f13215a.g).f();
            VideoFrameErrorController.PlayerErrorState playerErrorState = VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_LIVE_PUNISH;
            if (f2 == playerErrorState) {
                O0("当前处于直播拉停态，不接受后续的错误处理");
                return;
            }
            TBLiveDataModel tBLiveDataModel = this.f13215a.l;
            if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || TextUtils.equals(videoInfo.roomStatus, "1")) {
                str.hashCode();
                if (str.equals(VideoFrameErrorController.ErrorViewType.LIVE_PUNISH)) {
                    O0("showNewErrorView,LIVE_PUNISH,拉停");
                    ((VideoFrameErrorController) this.f13215a.g).b(playerErrorState);
                } else if (!str.equals(VideoFrameErrorController.ErrorViewType.ANCHOR_LEAVE)) {
                    ((VideoFrameErrorController) this.f13215a.g).b(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_OTHER);
                } else {
                    ((VideoFrameErrorController) this.f13215a.g).b(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_ANCHOR_LEAVE);
                }
            } else {
                ((VideoFrameErrorController) this.f13215a.g).b(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END);
            }
            this.f13215a.h.postDelayed(new b(str2), 500L);
            if (((VideoFrameErrorController) this.f13215a.g).g() != null) {
                ViewProxy.setOnClickListener(((VideoFrameErrorController) this.f13215a.g).g(), new c());
            }
        }
    }

    public abstract boolean C0();

    public void C1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdf9145", new Object[]{this, str, str2});
            return;
        }
        boolean equals = TextUtils.equals(str, VideoFrameErrorController.ErrorViewType.ANCHOR_LEAVE);
        O0("showVideoError,isAnchorLeave=" + equals);
        if (equals) {
            S1("0");
        }
        if (!L0() || K0()) {
            B1(str, str2);
            return;
        }
        O0("showVideoError,isShopTab3,isLivePunish:" + K0());
        F0();
    }

    public boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca37cbe2", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.p0();
        }
        return false;
    }

    public void D1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e5d90", new Object[]{this, new Boolean(z)});
        } else if (j0() != null) {
            O0("播放优化,startBackupPlayTask，needDelay = " + z);
            j0().f(z);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void E(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347568e2", new Object[]{this, ux9Var, b3dVar});
        }
    }

    public boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb285479", new Object[]{this})).booleanValue();
        }
        h hVar = this.f13215a;
        if (hVar != null) {
            return h.a(hVar);
        }
        return false;
    }

    public void E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ac8ac3", new Object[]{this});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.s != null) {
            O0("串流监控,startDelayCheckMistakeTask");
            this.f13215a.s.d();
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c364636", new Object[]{this});
        } else if (this.f13215a.k != null) {
            O0("hideVideoError");
            this.f13215a.k.setVisibility(8);
        }
    }

    public void F1(FrameLayout frameLayout, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2dae03d", new Object[]{this, frameLayout, obj});
        } else if (frameLayout != null && frameLayout.getVisibility() != 0) {
            frameLayout.post(new d(obj, frameLayout));
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void G(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90da300", new Object[]{this, gVar});
        } else {
            this.b.x(gVar);
        }
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259c934d", new Object[]{this});
            return;
        }
        h hVar = this.f13215a;
        z3h z3hVar = new z3h(hVar.d, hVar.e);
        u1(z3hVar);
        z3hVar.d(this);
    }

    public void G1(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce38f0", new Object[]{this, videoInfo});
            return;
        }
        this.f13215a.m = videoInfo;
        i1();
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995cbfd5", new Object[]{this});
            return;
        }
        s1(false);
        f0(false);
    }

    public boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e04a9b7", new Object[]{this})).booleanValue();
        }
        return this.b.u0();
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer.j
    public void I(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed575feb", new Object[]{this, new Integer(i), map});
            return;
        }
        if (i == 2) {
            F0();
        } else if (i == 8) {
            Y0();
        } else if (i == 5) {
            Z0();
        } else if (i == 6) {
            X0(map);
        }
        BaseStatePlayer.j jVar = this.f13215a.f13223a;
        if (jVar != null) {
            jVar.I(i, map);
        }
    }

    public boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4054bb64", new Object[]{this})).booleanValue();
        }
        if (this.b.V() == 6) {
            return true;
        }
        return false;
    }

    public void I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f061a964", new Object[]{this});
        } else if (j0() != null) {
            O0("播放优化,stopBackupPlayTask");
            j0().g();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68c39db0", new Object[]{this})).booleanValue();
        }
        if (w0() == null || !w0().f()) {
            return false;
        }
        return true;
    }

    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        h hVar = this.f13215a;
        if (hVar.e == null || hVar.d == null) {
            return false;
        }
        return true;
    }

    public void J1(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b7e701", new Object[]{this, frameLayout});
        } else if (frameLayout != null && frameLayout.getVisibility() != 8 && frameLayout.getChildCount() != 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                K1(frameLayout);
            } else {
                frameLayout.post(new e(frameLayout));
            }
        }
    }

    public final boolean K0() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478d0cb6", new Object[]{this})).booleanValue();
        }
        h hVar = this.f13215a;
        if (hVar == null || (cdrVar = hVar.d) == null) {
            return false;
        }
        return cdrVar.a1();
    }

    public final void K1(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df580a9", new Object[]{this, frameLayout});
            return;
        }
        h hVar = this.f13215a;
        VideoInfo videoInfo = hVar.m;
        if (videoInfo != null && videoInfo.landScape && frameLayout != null) {
            hVar.n = false;
            l();
            if (r0() != null) {
                r0().showController();
            }
            frameLayout.setVisibility(8);
            frameLayout.removeAllViews();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void L(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29f410f", new Object[]{this, context, str});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.O1(context, str);
        }
    }

    public final boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("595bc429", new Object[]{this})).booleanValue();
        }
        h hVar = this.f13215a;
        if (hVar != null) {
            return M0(hVar.d);
        }
        return false;
    }

    public void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e625511", new Object[]{this});
            return;
        }
        PlayerController2 r0 = r0();
        if (r0 != null) {
            r0.toggleScreen(true, false);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9262f5", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.M1();
        }
    }

    public void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73d121d", new Object[]{this});
        } else {
            N1(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void N(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628c4780", new Object[]{this, dVar});
        } else {
            this.b.y(dVar);
        }
    }

    public void N1(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf508a83", new Object[]{this, layoutParams});
            return;
        }
        ViewGroup viewGroup = this.f13215a.i;
        if (viewGroup != null && layoutParams != null) {
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void O(IMediaPlayer.AspectRatio aspectRatio, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da28620d", new Object[]{this, aspectRatio, new Boolean(z)});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.d != null) {
            o3s.b("BaseMediaManager", "VideoViewController updatePlayerContentModeAndSetBgImage 向FrameContext中设置值mode =" + aspectRatio + " needSetBgImage = " + z);
            this.f13215a.d.l1(aspectRatio);
            this.f13215a.d.k1(z);
        }
    }

    public void O0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.f13215a.d != null) {
            x5t.h("BaseMediaManager", p0() + " " + str);
        }
    }

    public void O1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc549bad", new Object[]{this, str});
        } else {
            this.b.R1(str);
        }
    }

    public void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c0f4c", new Object[]{this});
            return;
        }
        M1();
        this.f13215a.j.setBackgroundColor(0);
    }

    public void Q0(ujv ujvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ca2e7b", new Object[]{this, ujvVar});
        } else if (ujvVar != null) {
            if (!TextUtils.isEmpty(ujvVar.c)) {
                try {
                    this.f13215a.j.setBackgroundColor(Color.parseColor(ujvVar.c));
                } catch (Exception e2) {
                    o3s.b("BaseMediaManager", "multipleLinkUpdate bgColor error:" + e2.getMessage());
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hw0.i(), (int) (hw0.i() / ujvVar.f29423a));
            layoutParams.topMargin = ujvVar.b;
            N1(layoutParams);
        }
    }

    public void Q1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e417d27a", new Object[]{this, str, str2});
            return;
        }
        bxl bxlVar = this.f13215a.b;
        if (bxlVar != null) {
            bxlVar.z(str);
            this.f13215a.b.u(str2);
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33893726", new Object[]{this});
        } else {
            S(false);
        }
    }

    public void R1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfef77c1", new Object[]{this, str});
        } else {
            this.b.S1(str);
        }
    }

    public void S(boolean z) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9e606e", new Object[]{this, new Boolean(z)});
            return;
        }
        O0("addVideoView");
        if (z && (viewGroup = this.f13215a.i) != null) {
            viewGroup.removeAllViews();
        }
        T();
    }

    public void S0(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64408af5", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.f13215a.l = tBLiveDataModel;
        k1();
    }

    public void S1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f647d8", new Object[]{this, str});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.d != null) {
            StringBuilder sb = new StringBuilder();
            VideoInfo c0 = up6.c0(this.f13215a.d);
            if (c0 != null) {
                sb.append("roomStatus=");
                sb.append(c0.roomStatus);
                sb.append(",streamStatus=");
                if (TextUtils.isEmpty(str)) {
                    str = c0.streamStatus;
                }
                sb.append(str);
            }
            String sb2 = sb.toString();
            O0("live updateStatusPlayerExpParams = " + sb2);
            R1(sb2);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8794bdd2", new Object[]{this});
            return;
        }
        ViewGroup u0 = u0();
        if (u0 == null) {
            O0("addVideoView2ContentView videoView is null");
        } else if (((ViewGroup) u0.getParent()) != this.f13215a.i) {
            U(u0);
        } else {
            O0("videoView parent 和 mCommonVariables.mContentView 相同");
            i0(u0);
        }
    }

    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        O0("onPause");
        if (w0() != null) {
            w0().onPause();
        }
    }

    public void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        O0("onResume");
        if (w0() == null || !w0().f()) {
            l();
        } else if (w0() != null) {
            w0().e();
        }
        if (w0() != null) {
            w0().onResume();
            w0().c();
        }
    }

    public void V() {
        SurfaceView surfaceView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2675315e", new Object[]{this});
            return;
        }
        h hVar = this.f13215a;
        ViewGroup viewGroup = hVar.i;
        if (!(viewGroup == null || (surfaceView = hVar.o) == null)) {
            viewGroup.removeView(surfaceView);
            this.f13215a.o.setVisibility(8);
        }
        if (this.f13215a.i != null && u0() != null) {
            if (u0().getParent() == null) {
                this.f13215a.i.addView(u0(), 0, new ViewGroup.LayoutParams(-1, -1));
            }
            G1(this.f13215a.m);
            u0().setVisibility(0);
        }
    }

    public void W0(VideoInfo videoInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3de46bc", new Object[]{this, videoInfo});
            return;
        }
        boolean c0 = c0(videoInfo);
        StringBuilder sb = new StringBuilder("onStatusEnd,isLivePunish:");
        sb.append(videoInfo != null ? Boolean.valueOf(c0) : null);
        O0(sb.toString());
        if (c0) {
            str = VideoFrameErrorController.ErrorViewType.LIVE_PUNISH;
        } else {
            str = VideoFrameErrorController.ErrorViewType.ANCHOR_LEAVE;
        }
        C1(str, null);
        this.b.N(0L);
    }

    public void X(SurfaceView surfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977c45f", new Object[]{this, surfaceView});
            return;
        }
        k();
        if (!(this.f13215a.i == null || u0() == null)) {
            this.f13215a.i.removeView(u0());
            u0().setVisibility(8);
        }
        if (surfaceView != null) {
            this.f13215a.o = surfaceView;
            surfaceView.setVisibility(0);
            if (this.f13215a.o.getParent() == null) {
                h hVar = this.f13215a;
                hVar.i.addView(hVar.o, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public void X0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7880e7", new Object[]{this, map});
        } else if (J0()) {
            C1(VideoFrameErrorController.ErrorViewType.ERROR_STATE_OTHER, b1(map));
        }
    }

    public LiveMediaManager Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveMediaManager) ipChange.ipc$dispatch("91dae9cc", new Object[]{this});
        }
        return new LiveMediaManager(this.f13215a);
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d4d940", new Object[]{this});
            return;
        }
        o3s.b("BaseMediaManager", "收到错误到恢复播放的消息，隐藏errorView");
        F0();
    }

    public com.taobao.taolive.room.player.standard.manager.b Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.room.player.standard.manager.b) ipChange.ipc$dispatch("b1a4b896", new Object[]{this});
        }
        return new com.taobao.taolive.room.player.standard.manager.b(this.f13215a);
    }

    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53c6bb5", new Object[]{this});
            return;
        }
        if (z1i.a().b()) {
            F0();
        } else {
            z1i.a().c(new RunnableC0753a());
        }
        com.taobao.taolive.sdk.ui.component.a aVar = this.f13215a.g;
        if (aVar != null) {
            ((VideoFrameErrorController) aVar).a(true);
            ((VideoFrameErrorController) this.f13215a.g).n();
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        return this.b.Y();
    }

    public com.taobao.taolive.room.player.standard.manager.d a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.room.player.standard.manager.d) ipChange.ipc$dispatch("b3f7f28", new Object[]{this});
        }
        return new com.taobao.taolive.room.player.standard.manager.d(this.f13215a);
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        return this.b.c0();
    }

    public void b0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cd3a8e", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            g(map);
        }
    }

    public String b1(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea6081e4", new Object[]{this, map});
        }
        if (!tz3.b(map)) {
            return sr4.e(map.get(BaseStatePlayer.KEY_ERROR_CODE), null);
        }
        return null;
    }

    public boolean c0(VideoInfo videoInfo) {
        cdr cdrVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfdf5f6", new Object[]{this, videoInfo})).booleanValue();
        }
        int q0 = q0();
        if (q0 == -1 ? !z2h.a(videoInfo) : q0 != 1) {
            z = false;
        }
        h hVar = this.f13215a;
        if (!(hVar == null || (cdrVar = hVar.d) == null)) {
            cdrVar.g1(z);
        }
        return z;
    }

    public abstract void c1();

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void d(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01f600", new Object[]{this, cVar});
        } else {
            this.b.t(cVar);
        }
    }

    public abstract BaseStatePlayer d0(Context context, cdr cdrVar);

    public void d1() {
        h hVar;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39886a27", new Object[]{this});
        } else if (pvs.y0() && (hVar = this.f13215a) != null && (cdrVar = hVar.d) != null) {
            boolean Z0 = cdrVar.Z0();
            VideoInfo c0 = up6.c0(this.f13215a.d);
            if (c0 != null && c0.landScape && c0.publishCommentsUseMtop && c0.fetchCommentsUseMtop && !Z0 && q0() == 2) {
                O0("拉停，半屏直播间竖屏模式，重新加载播放器控制条");
                PlayerController2 r0 = r0();
                if (r0 != null) {
                    r0.setDefaultControllerHolder(this.f13215a.d);
                    r0.showController(3);
                }
            }
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public VideoStatus e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("da300dcb", new Object[]{this});
        }
        return up6.d0(this.f13215a.d);
    }

    public IMediaPlayer.AspectRatio e0() {
        h hVar;
        cdr cdrVar;
        IMediaPlayer.AspectRatio U0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.AspectRatio) ipChange.ipc$dispatch("381ca04a", new Object[]{this});
        }
        if (!pvs.d0() || this.b == null || (hVar = this.f13215a) == null || (cdrVar = hVar.d) == null || (U0 = cdrVar.U0()) == null) {
            return null;
        }
        boolean c1 = cdrVar.c1();
        this.b.o1(c1);
        o3s.b("BaseMediaManager", "VideoViewController updatePlayerContentModeAndSetBgImage setCoustomerRationTypeAndNeedBgImg，业务设置的ratioType = " + U0 + "，needSetBgImage = " + c1);
        return U0;
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void f(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bedf90c", new Object[]{this, eVar});
        } else {
            this.b.u(eVar);
        }
    }

    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923bed9f", new Object[]{this, new Boolean(z)});
            return;
        }
        O0("直播未销毁排查,destroyPlay,needChangeState=" + z);
        if (w0() != null) {
            w0().destroy();
        }
        if (this.f13215a != null) {
            F0();
            mo1 mo1Var = this.f13215a.r;
            if (mo1Var != null) {
                mo1Var.g();
                this.f13215a.r = null;
            }
            TrackMistakeController trackMistakeController = this.f13215a.s;
            if (trackMistakeController != null) {
                trackMistakeController.e();
                this.f13215a.s = null;
            }
            com.taobao.taolive.sdk.ui.component.a aVar = this.f13215a.g;
            if (aVar != null) {
                ((VideoFrameErrorController) aVar).p();
            }
            Handler handler = this.f13215a.h;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            PlayerController2 playerController2 = this.f13215a.q;
            if (playerController2 != null) {
                playerController2.destroy();
                this.f13215a.q = null;
            }
        }
        if (z) {
            this.b.N(0L);
        } else {
            this.b.T0();
        }
        g1();
    }

    public void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
        } else if (w0() != null) {
            w0().d();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else {
            this.b.H(map);
        }
    }

    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392c0cc", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.N(0L);
            g1();
        }
    }

    public void g1() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388fe023", new Object[]{this});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.i != null) {
            ViewGroup u0 = u0();
            if (!(u0 == null || (viewGroup = (ViewGroup) u0.getParent()) == null)) {
                viewGroup.removeView(u0);
            }
            this.f13215a.i.removeView(u0());
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public long getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        return this.b.U();
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.b.W();
    }

    @Override // tb.v4q
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.b.g0();
    }

    @Override // tb.v4q
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.b.k0();
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void h(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfc0fb", new Object[]{this, ux9Var, b3dVar});
        }
    }

    public final boolean h0(cdr cdrVar) {
        VideoInfo J0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("960edf98", new Object[]{this, cdrVar})).booleanValue();
        }
        if (!pvs.f0() || cdrVar == null || (J0 = cdrVar.J0()) == null) {
            return false;
        }
        boolean z = J0.landScape;
        boolean equals = TextUtils.equals(J0.roomStatus, "2");
        if (!z || !equals) {
            return false;
        }
        return true;
    }

    public final void h1(int i, int i2) {
        boolean z;
        String str;
        String str2;
        BaseStatePlayer baseStatePlayer;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7027cc62", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        h hVar = this.f13215a;
        if (hVar == null || (cdrVar = hVar.d) == null || cdrVar.w0() == null) {
            str = null;
            z = false;
        } else {
            BaseRecModel w0 = this.f13215a.d.w0();
            z = w0.isFirst;
            str = w0.liveId;
        }
        k6m b2 = l6m.c().b(p0());
        if (!(b2 == null || (baseStatePlayer = this.b) == null)) {
            b2.g = baseStatePlayer.Y();
            b2.i = str;
        }
        StringBuilder sb = new StringBuilder("-9999999_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        sb.append(str2);
        l6m.c().f(p0(), sb.toString());
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefd31dc", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("BaseMediaManager", "setIndependentMute mute = " + z + " false mLiveContextKey = " + this.f13215a.d.p());
        cdr cdrVar = this.f13215a.d;
        if (!(cdrVar == null || cdrVar.j() == null)) {
            this.f13215a.d.j().n0(z);
        }
        this.b.n1(z);
    }

    public final void i0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f4cce", new Object[]{this, viewGroup});
            return;
        }
        final ViewGroup s0 = s0();
        if (viewGroup != null && s0 != null) {
            O0("ensureLayout，当前videoView的宽高为：" + s0.getWidth() + ",H:" + s0.getHeight());
            if (s0.getWidth() <= 1 || s0.getHeight() <= 1) {
                z1i.a().d(new Runnable() { // from class: tb.rx1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.m(s0);
                    }
                }, 100L);
            }
        }
    }

    public final void i1() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
            return;
        }
        j1();
        h hVar = this.f13215a;
        com.taobao.taolive.sdk.ui.component.a aVar = hVar.g;
        if (aVar != null) {
            ((VideoFrameErrorController) aVar).r(hVar.l);
            h hVar2 = this.f13215a;
            ((VideoFrameErrorController) hVar2.g).d(up6.G(hVar2.d));
            TBLiveDataModel tBLiveDataModel = this.f13215a.l;
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || TextUtils.equals(videoInfo.roomStatus, "1"))) {
                ((VideoFrameErrorController) this.f13215a.g).b(VideoFrameErrorController.PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END);
            }
            ((VideoFrameErrorController) this.f13215a.g).n();
        }
    }

    @Override // tb.v4q
    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        return this.b.x0();
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        if (this.b.V() == 2 || this.b.V() == 5) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public boolean j() {
        h hVar;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce366a1", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer == null || (hVar = this.f13215a) == null || (cdrVar = hVar.d) == null) {
            return false;
        }
        boolean X = baseStatePlayer.X(cdrVar);
        o3s.b("BaseMediaManager", "getLiveRoomMute  ret = " + X + " mLiveContextKey = " + this.f13215a.d.p());
        return X;
    }

    public mo1 j0() {
        mo1 mo1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mo1) ipChange.ipc$dispatch("3bce7a66", new Object[]{this});
        }
        h hVar = this.f13215a;
        if (hVar == null || (mo1Var = hVar.r) == null) {
            return null;
        }
        return mo1Var;
    }

    public void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdba55fa", new Object[]{this});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.g != null) {
            O0("重置错误页状态");
            ((VideoFrameErrorController) this.f13215a.g).p();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe989d1", new Object[]{this});
        } else if (!this.f13215a.n) {
            if (!ejr.g() || !this.f13215a.d.j().t()) {
                c1();
            }
        }
    }

    public BaseStatePlayer k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("aca03704", new Object[]{this});
        }
        return this.b;
    }

    public void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1e48f", new Object[]{this});
            return;
        }
        O0("resetMute");
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.n1(j());
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d10508", new Object[]{this});
            return;
        }
        O0("resumePlay");
        if (!this.f13215a.n) {
            if (ejr.g() && this.f13215a.d.j().t()) {
                return;
            }
            if (K0()) {
                O0("resumePlay，isLivePunish当前处于拉停，不走resumePlayInner方法");
                return;
            }
            m1();
            O0("resumePlay，addVideoView");
            R();
        }
    }

    public h l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ade3d3a0", new Object[]{this});
        }
        return this.f13215a;
    }

    public final void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb96fa5", new Object[]{this});
            return;
        }
        O0("resetMute isIndependentMuteABOpen true");
        if (b5l.a(this.f13215a.d)) {
            O0("resetMute enableResetMuteFromSettingWhenResume true");
            boolean f2 = bte.f();
            O0("resetMute result liveRoomMute = " + f2);
            i(f2);
        }
    }

    public final /* synthetic */ void m(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b843759", new Object[]{this, viewGroup});
        } else if (viewGroup.getWidth() <= 1 || viewGroup.getHeight() <= 1) {
            h1(viewGroup.getWidth(), viewGroup.getHeight());
            O0("ensureLayout，宽高为0，需要重新添加下布局");
            BaseStatePlayer baseStatePlayer = this.b;
            if (baseStatePlayer != null) {
                baseStatePlayer.E(u0(), viewGroup);
            }
            U(u0());
        }
    }

    public int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d25640a7", new Object[]{this})).intValue();
        }
        return this.b.S();
    }

    public abstract void m1();

    @Override // tb.v4q
    public void n(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d5dfee", new Object[]{this, hVar});
        } else {
            this.b.z(hVar);
        }
    }

    public Bitmap n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.T();
        }
        return null;
    }

    public void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        g0();
        this.b.I1();
        S(false);
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad3159a", new Object[]{this, new Boolean(z)});
        } else {
            this.b.k1(z);
        }
    }

    public abstract int o0();

    public final void o1(cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc02d78c", new Object[]{this, cdrVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.F();
            r1(cdrVar);
        }
    }

    @Override // tb.e7m
    public void onInstallReadyRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68affaa8", new Object[]{this});
        } else if (SoFetchController.b()) {
            O0("onInstallReadyRetry,so解析错误，进行重试");
            n1();
        }
    }

    @Override // tb.e7m
    public void onNotInstallPlayError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f1674", new Object[]{this});
        }
    }

    public String p0() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("570dc107", new Object[]{this});
        }
        h hVar = this.f13215a;
        if (hVar == null || (cdrVar = hVar.d) == null) {
            return null;
        }
        return cdrVar.p();
    }

    public void p1(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f297bbae", new Object[]{this, view, viewGroup});
            return;
        }
        h hVar = this.f13215a;
        hVar.i = viewGroup;
        hVar.j = view;
        hVar.k = viewGroup.findViewById(R.id.taolive_video_error_new);
        h hVar2 = this.f13215a;
        com.taobao.taolive.sdk.ui.component.a aVar = hVar2.g;
        if (aVar != null) {
            ((VideoFrameErrorController) aVar).j(hVar2.d, hVar2.e, hVar2.k);
        }
    }

    @Override // tb.v4q
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.b.R0();
        }
    }

    @Override // tb.v4q
    public void q(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80efd3c0", new Object[]{this, fVar});
        } else {
            this.b.w(fVar);
        }
    }

    public int q0() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d6c1814", new Object[]{this})).intValue();
        }
        h hVar = this.f13215a;
        if (hVar == null || (cdrVar = hVar.d) == null) {
            return -1;
        }
        int T0 = cdrVar.T0();
        O0("PM拉停状态:" + T0);
        return T0;
    }

    public final void q1() {
        IMediaPlayer.AspectRatio e0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbd3a75", new Object[]{this});
        } else if (this.b != null && (e0 = e0()) != null) {
            o3s.b("BaseMediaManager", "VideoViewController updatePlayerContentModeAndSetBgImage updateRationType，设置播放器裁切方式customRationType：" + e0);
            this.b.u1(e0);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void r(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df95dc74", new Object[]{this, cVar});
        } else {
            this.b.C(cVar);
        }
    }

    public PlayerController2 r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerController2) ipChange.ipc$dispatch("a36731e6", new Object[]{this});
        }
        h hVar = this.f13215a;
        if (hVar.q == null) {
            hVar.q = new PlayerController2(this.f13215a.e);
        }
        this.f13215a.q.bindListener(this);
        return this.f13215a.q;
    }

    public final void r1(cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429ec049", new Object[]{this, cdrVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.i1(h0(cdrVar));
        }
    }

    @Override // tb.v4q
    public void s(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97d43b0", new Object[]{this, bVar});
        } else {
            this.b.v(bVar);
        }
    }

    public ViewGroup s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f204cabd", new Object[]{this});
        }
        View j0 = this.b.j0();
        if (j0 instanceof ViewGroup) {
            return (ViewGroup) j0;
        }
        return null;
    }

    public void s1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ad80bd", new Object[]{this, new Boolean(z)});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null) {
            h.b(hVar, z);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void seekTo(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645bea", new Object[]{this, new Long(j)});
        } else {
            this.b.c1((int) j, false);
        }
    }

    @Override // tb.v4q
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.b.n1(z);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void setPlayRate(float f2) {
        cdr cdrVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        h hVar = this.f13215a;
        if (!(hVar == null || (cdrVar = hVar.d) == null)) {
            z = cdrVar.b1();
        }
        this.b.q1(f2, z);
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else if (w0() != null) {
            w0().setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    @Override // tb.v4q
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.b.I1();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public float t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50466f21", new Object[]{this})).floatValue();
        }
        return this.b.Z();
    }

    public int t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bfb9a2e", new Object[]{this})).intValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.a0();
        }
        return 0;
    }

    public void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8bc3b", new Object[]{this});
            return;
        }
        z3h z3hVar = this.f13215a.f;
        if (z3hVar != null) {
            z3hVar.d(this);
        } else {
            G0();
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("985c30bf", new Object[]{this})).booleanValue();
        }
        return this.b.v0();
    }

    public ViewGroup u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a2aaf312", new Object[]{this});
        }
        return this.b.l0();
    }

    public void u1(z3h z3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7efd88f", new Object[]{this, z3hVar});
        } else {
            this.f13215a.f = z3hVar;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e21febc", new Object[]{this});
        }
    }

    public String v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacc3d02", new Object[]{this});
        }
        return this.b.c0();
    }

    public void v1(String str, bxl bxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefb920f", new Object[]{this, str, bxlVar});
            return;
        }
        h hVar = this.f13215a;
        hVar.b = bxlVar;
        hVar.c = str;
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        return a();
    }

    public cmc w0() {
        z3h z3hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cmc) ipChange.ipc$dispatch("f752e138", new Object[]{this});
        }
        h hVar = this.f13215a;
        if (hVar == null || (z3hVar = hVar.f) == null) {
            return null;
        }
        return z3hVar.b();
    }

    public void w1(BaseStatePlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb09693", new Object[]{this, iVar});
        } else {
            this.b.p1(iVar);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public View x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1daf8c58", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.N1();
        }
        return null;
    }

    public BaseStatePlayer.WarmState x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer.WarmState) ipChange.ipc$dispatch("5db22047", new Object[]{this});
        }
        return this.b.m0();
    }

    public final void x1() {
        String str;
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225e3f4a", new Object[]{this});
            return;
        }
        cdr cdrVar = this.f13215a.d;
        if (!(cdrVar == null || (aTaoLiveOpenEntity = cdrVar.P) == null || (str2 = aTaoLiveOpenEntity.bizCode) == null)) {
            if (str2.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString())) {
                str = "shopLiveTab";
            } else if (this.f13215a.d.P.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString())) {
                str = "shopCardLive";
            } else if (this.f13215a.d.P.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString())) {
                str = "shop2fLive";
            }
            this.b.A1(str);
        }
        str = "LiveRoom";
        this.b.A1(str);
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService
    public void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73ddc20", new Object[]{this, context});
        } else {
            H();
        }
    }

    public void y0(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e92e4", new Object[]{this, baseFrame});
        } else if (baseFrame instanceof m8c) {
            m8c m8cVar = (m8c) baseFrame;
            PlayerController2 r0 = r0();
            if (r0 != null) {
                r0.setControllerHolder((qr4) m8cVar.getControllerHolder(null));
                r0.setPlayRateDefault();
                r0.showController(2);
                r0.setPlayRateListener(new f());
                r0.setIPlayForwardListener(new g(this));
            }
            m8cVar.setBackView(this.f13215a.i);
        }
    }

    public void y1(BaseStatePlayer.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce64a55", new Object[]{this, jVar});
        } else {
            this.f13215a.f13223a = jVar;
        }
    }

    @Override // tb.v4q
    public void z(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560f6140", new Object[]{this, iVar});
        } else {
            this.b.B(iVar);
        }
    }

    public void z0(BaseFrame baseFrame, VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c344d02", new Object[]{this, baseFrame, videoInfo, new Boolean(z)});
        } else if (baseFrame instanceof m8c) {
            m8c m8cVar = (m8c) baseFrame;
            PlayerController2 r0 = r0();
            if (r0 != null) {
                if (!z) {
                    new xtt(this.f13215a.d, videoInfo.liveId);
                }
                r0.setUpdateControllerHolder(this.f13215a.d, (qr4) m8cVar.getControllerHolder(null), false, D0());
                r0.showController(2);
            }
            m8cVar.setBackView(this.f13215a.i);
        }
    }

    public void z1(TrackMistakeController.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a82a52", new Object[]{this, cVar});
        } else {
            this.f13215a.t = cVar;
        }
    }

    public void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3668f8", new Object[]{this, new Boolean(z)});
            return;
        }
        O0("onBackupPlay，播放优化,frameReadyStartPlayOpt");
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            if (baseStatePlayer.p0()) {
                O0("播放优化 frameReadyStartPlayOpt return 已经有首帧");
                I1();
                return;
            }
            long i0 = this.b.i0();
            O0("播放优化frameReadyStartPlayOpt,videoState = " + i0);
            if (i0 != 1) {
                this.b.J1(true);
                if (z) {
                    this.b.Y0();
                }
                O0("播放优化frameReadyStartPlay，addVideoView");
                R();
            }
        }
    }

    public final void U(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44bafc2", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
            O0("videoView未null添加view失败");
        } else {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            O0("添加view");
            viewGroup.setId(R.id.taolive_state_player_view_root);
            this.f13215a.i.addView(viewGroup, 0, layoutParams);
        }
    }

    public void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        O0("onStart");
        l1();
        this.f13215a.p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    @Override // com.taobao.taolive.room.service.IPlayPublicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.room.player.standard.manager.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = "b386decb"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L_0x0019:
            com.taobao.taolive.room.player.standard.manager.a$h r0 = r10.f13215a
            tb.cdr r0 = r0.d
            com.taobao.taolive.sdk.model.common.VideoInfo r0 = tb.up6.c0(r0)
            java.lang.String r1 = "BaseMediaManager"
            r2 = -1
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.liveConfigForStream
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x004f
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r4 = "ntpStartLiveOffset"
            long r4 = tb.m3s.f(r0, r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "获取NTP,getLatestRenderFrameNTP mVideoBaseNTP = "
            r0.<init>(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            tb.o3s.b(r1, r0)
            goto L_0x0050
        L_0x004f:
            r4 = r2
        L_0x0050:
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer r0 = r10.b
            if (r0 == 0) goto L_0x0071
            float r0 = r0.h0()
            r6 = 1000(0x3e8, float:1.401E-42)
            float r6 = (float) r6
            float r6 = r6 * r0
            long r6 = (long) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "获取NTP,getLatestRenderFrameNTP videoRenderPts = "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            tb.o3s.b(r1, r0)
            goto L_0x0072
        L_0x0071:
            r6 = r2
        L_0x0072:
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            long r4 = r4 + r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "获取NTP,getLatestRenderFrameNTP finalNtp = "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = "，playerPts= "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            tb.o3s.b(r1, r0)
            return r4
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.player.standard.manager.a.d():long");
    }

    public void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c664e", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null && baseStatePlayer.I1()) {
            s1(true);
            O0("prePlay起播调用成功，开始播放优化");
            D1(true);
        }
    }

    @Override // com.taobao.taolive.room.service.IPlayPublicService, tb.v4q
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this}) : u0();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements m9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.m9d
        public boolean a(int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c1881ff", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1) {
                str = IPlayPublicService.PlayRate.PLAY_SPEED_1_5X;
            } else if (i == 2) {
                str = "2";
            } else {
                str = "1";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            rbu.K(a.this.f13215a.d, "MultiSpeed", hashMap);
            return false;
        }
    }

    public void H1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db114eb2", new Object[]{this, new Boolean(z)});
        } else if (this.b != null) {
            if (!pvs.q()) {
                O0("播放优化,降级起播逻辑");
                this.b.I1();
            } else if (z) {
                O0("播放优化,isUrlMistake错误，强制起播");
                D1(false);
            } else if (this.b.I1()) {
                O0("起播调用成功,开始播放优化任务");
                D1(true);
            }
        }
    }

    public void P1(bxl bxlVar, String str) {
        RecModel V0;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dd755", new Object[]{this, bxlVar, str});
        } else if (bxlVar != null) {
            cdr cdrVar = this.f13215a.d;
            String str2 = (cdrVar == null || cdrVar.w0() == null || (map = (V0 = this.f13215a.d.w0()).initParams) == null || zqq.a(map.get(yj4._PARAM_PLAY_MODE))) ? null : V0.initParams.get(yj4._PARAM_PLAY_MODE);
            int m0 = m0();
            if (m0 == 0) {
                if (zqq.a(str)) {
                    str = "playerViewToken";
                }
                if (x0() == BaseStatePlayer.WarmState.WARMED) {
                    bxlVar.r("warmuped");
                } else if (x0() == BaseStatePlayer.WarmState.WARMING) {
                    bxlVar.r("warmuping");
                } else {
                    BaseStatePlayer baseStatePlayer = this.b;
                    if (!(baseStatePlayer instanceof ytt) || ((ytt) baseStatePlayer).X1() != 1) {
                        BaseStatePlayer baseStatePlayer2 = this.b;
                        if (!(baseStatePlayer2 instanceof ytt) || ((ytt) baseStatePlayer2).X1() != 2) {
                            if (zqq.a(str2)) {
                                str2 = "viewToken";
                            }
                            bxlVar.r(str2);
                        } else {
                            bxlVar.r("p2ffing");
                        }
                    } else {
                        bxlVar.r("p2ffed");
                    }
                }
                bxlVar.z(str);
            } else if (m0 == 1) {
                if (zqq.a(str)) {
                    str = "autoPlayerViewToken";
                }
                if (x0() == BaseStatePlayer.WarmState.WARMED) {
                    bxlVar.r("warmuped");
                } else if (x0() == BaseStatePlayer.WarmState.WARMING) {
                    bxlVar.r("warmuping");
                } else {
                    if (zqq.a(str2)) {
                        str2 = "viewToken";
                    }
                    bxlVar.r(str2);
                }
                bxlVar.z(str);
            } else if (m0 == 2) {
                bxlVar.r("defaultInit");
            }
        }
    }

    public void W(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f975af03", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.f13215a;
        if (hVar != null && hVar.d != null) {
            com.taobao.taolive.sdk.ui.component.a aVar = hVar.g;
            if (aVar != null) {
                if (i != 1) {
                    z = false;
                }
                ((VideoFrameErrorController) aVar).c(z);
            }
            O0("拉停来自PM消息");
            this.f13215a.d.j1(i);
        }
    }

    public void a1(boolean z, RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fd4b70", new Object[]{this, new Boolean(z), recModel});
        } else if (J0()) {
            O0("onStop");
            if (!(w0() == null || recModel == null)) {
                w0().b(recModel.liveId, z, false, false);
            }
            this.f13215a.p = true;
        }
    }

    public a(h hVar) {
        this.f13215a = hVar;
        hVar.r = new mo1(this, p0());
        hVar.s = new TrackMistakeController(this, p0());
        BaseStatePlayer d0 = d0(hVar.e, hVar.d);
        this.b = d0;
        cdr cdrVar = hVar.d;
        if (!(cdrVar == null || cdrVar.w0() == null)) {
            d0.g1(hVar.d.w0().imageUrl);
        }
        d0.z1(this);
        d0.t1(this);
        x1();
        q1();
        o1(hVar.d);
        t1();
    }
}
