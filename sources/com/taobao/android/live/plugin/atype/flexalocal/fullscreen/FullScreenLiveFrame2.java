package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.good.GoodProxy;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import tb.bl9;
import tb.cpr;
import tb.d9m;
import tb.f51;
import tb.giv;
import tb.gnk;
import tb.hjr;
import tb.jlc;
import tb.lvs;
import tb.nh4;
import tb.noo;
import tb.o3s;
import tb.rgd;
import tb.s9z;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.to8;
import tb.u3s;
import tb.uo8;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.vwl;
import tb.w0u;
import tb.xco;
import tb.yac;
import tb.yiv;
import tb.zqq;
import tb.zu1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullScreenLiveFrame2 extends AbsFullScreenFrame implements cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenLiveFrame2";
    private uo8.a baseExplainBehaviorCache;
    private uo8.a expExplainBehaviorCache;
    public BaseFrame liveLinkFrame3;
    private ValueAnimator lowerComponentUpAnimator;
    public BaseFrame mChatRoomLinkFrame;
    private View mLinkBlankTempView;
    public BaseFrame mMultiAnchorLinkFrame;
    public BaseFrame mMultiPKLinkFrame;
    public BaseFrame mPKLinkFrame;
    private View mStopLink;
    private Runnable preInflateRunnable;
    private s9z sabAtmosphereController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseFrame f8474a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0447a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0447a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FullScreenLiveFrame2 fullScreenLiveFrame2 = FullScreenLiveFrame2.this;
                fullScreenLiveFrame2.addComponent(fullScreenLiveFrame2.mMultiPKLinkFrame);
            }
        }

        public a(BaseFrame baseFrame) {
            this.f8474a = baseFrame;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f8474a.keepViewStubWithoutInflate((ViewStub) FullScreenLiveFrame2.this.mFrontView.findViewById(R.id.taolive_multi_pk_link_stub));
            FullScreenLiveFrame2.this.weakHandler.postDelayed(new RunnableC0447a(), 34L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ViewParent parent = FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this).getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this));
                    o3s.d(FullScreenLiveFrame2.TAG, "addMultiLinkView remove success" + FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this));
                }
                View containerView = FullScreenLiveFrame2.this.mBlankFrame.getContainerView();
                if (containerView instanceof ViewGroup) {
                    ((ViewGroup) containerView).addView(FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this), 0);
                    o3s.d(FullScreenLiveFrame2.TAG, "addMultiLinkView add success" + FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this));
                }
            } catch (Exception e) {
                o3s.b(FullScreenLiveFrame2.TAG, "addMultiLinkView catch exception:" + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseFrame f8477a;

        public c(BaseFrame baseFrame) {
            this.f8477a = baseFrame;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                BaseFrame baseFrame = FullScreenLiveFrame2.this.mBlankFrame;
                if (baseFrame != null) {
                    baseFrame.hide();
                }
                ViewParent parent = FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this).getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this));
                    o3s.d(FullScreenLiveFrame2.TAG, "removeMultiLinkView remove success" + FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this));
                }
                View containerView = this.f8477a.getContainerView();
                if (containerView instanceof ViewGroup) {
                    ((ViewGroup) containerView).addView(FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this), -1);
                    FullScreenLiveFrame2.access$202(FullScreenLiveFrame2.this, null);
                    o3s.d(FullScreenLiveFrame2.TAG, "removeMultiLinkView add success");
                }
            } catch (Exception e) {
                o3s.b(FullScreenLiveFrame2.TAG, "removeMultiLinkView catch exception:" + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseFrame f8478a;

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
                FullScreenLiveFrame2 fullScreenLiveFrame2 = FullScreenLiveFrame2.this;
                fullScreenLiveFrame2.addComponent(fullScreenLiveFrame2.mPKLinkFrame);
            }
        }

        public d(BaseFrame baseFrame) {
            this.f8478a = baseFrame;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f8478a.keepViewStubWithoutInflate((ViewStub) FullScreenLiveFrame2.this.mFrontView.findViewById(R.id.taolive_pk_link_stub));
            FullScreenLiveFrame2.this.weakHandler.postDelayed(new a(), 34L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                FullScreenLiveFrame2.this.initPrivateVipFrame();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                FullScreenLiveFrame2.access$000(FullScreenLiveFrame2.this);
            } catch (Throwable th) {
                FlexaLiveX.w("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenLiveFrame2$5");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1004 || i == 880000279) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) FullScreenLiveFrame2.this.mBottomBarView.getLayoutParams();
            marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            FullScreenLiveFrame2.this.mBottomBarView.setLayoutParams(marginLayoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sjr.g().c(uyg.f, null, FullScreenLiveFrame2.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sjr.g().c(uyg.f, null, FullScreenLiveFrame2.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                FullScreenLiveFrame2.access$100(FullScreenLiveFrame2.this);
            } catch (Throwable th) {
                FlexaLiveX.w("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(295698784);
        t2o.a(806356196);
        t2o.a(806355016);
    }

    public FullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ void access$000(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2306cc36", new Object[]{fullScreenLiveFrame2});
        } else {
            fullScreenLiveFrame2.installRemoteRewardPanelInner();
        }
    }

    public static /* synthetic */ void access$100(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8561e315", new Object[]{fullScreenLiveFrame2});
        } else {
            fullScreenLiveFrame2.installRemoteNoticeFrame4inner();
        }
    }

    public static /* synthetic */ View access$200(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("58b47d36", new Object[]{fullScreenLiveFrame2});
        }
        return fullScreenLiveFrame2.mLinkBlankTempView;
    }

    public static /* synthetic */ View access$202(FullScreenLiveFrame2 fullScreenLiveFrame2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d8f9f8a2", new Object[]{fullScreenLiveFrame2, view});
        }
        fullScreenLiveFrame2.mLinkBlankTempView = view;
        return view;
    }

    private void bottomGuideEvadeRuleCheck(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8033e1af", new Object[]{this, obj});
        } else if (!(obj instanceof String) || !"isTab2".equals(obj) || this.weakHandler == null) {
            if (ruleCheckPass()) {
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var == null || ux9Var.j() == null || !this.mFrameContext.j().d()) {
                    o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验通过");
                    sjr.g().c(uyg.b, obj, observeUniqueIdentification());
                    return;
                }
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验通过，但当前有引导正在展示，放弃本次展示");
            } else if (!nh4.Q() || this.weakHandler == null) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，不能展示");
                sjr.g().c(uyg.i, obj, observeUniqueIdentification());
            } else {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，3s轮询校验");
                this.weakHandler.postDelayed(new j(), 3000L);
            }
        } else if (nh4.M0()) {
            this.weakHandler.postDelayed(new i(), nh4.w1() * 1000);
        } else {
            o3s.b(TAG, "BottomSlideNewGuideFrame 冒头推直播引导tab2关闭不展示");
        }
    }

    private void destroy() {
        jlc liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().a(this);
        }
        if (!(rgd.b().a() == null || rgd.b().a().getLiveDetailMessInfo(this.mFrameContext) == null || (liveDetailMessInfo = rgd.b().a().getLiveDetailMessInfo(this.mFrameContext)) == null)) {
            liveDetailMessInfo.onDestroy();
        }
        this.weakHandler.removeCallbacksAndMessages(null);
    }

    private void getMessageInfo() {
        jlc liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f2126", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.mFrameContext);
        if (c0 != null && c0.broadCaster != null && rgd.b().a() != null && rgd.b().a().getLiveDetailMessInfo(this.mFrameContext) != null && (liveDetailMessInfo = rgd.b().a().getLiveDetailMessInfo(this.mFrameContext)) != null) {
            liveDetailMessInfo.b(this.mFrameContext);
            liveDetailMessInfo.start(c0.broadCaster.accountId, c0.liveId);
        }
    }

    private void init() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        sjr.g().a(this);
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().l(this, new g(this));
        }
        getMessageInfo();
        ux9 ux9Var2 = this.mFrameContext;
        if (ux9Var2 != null && ux9Var2.o() != null && (view = this.mFrontView) != null) {
            this.mFrameContext.a(view.findViewById(R.id.taolive_left_top_container));
        }
    }

    private void initLinkLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6dfabd", new Object[]{this});
            return;
        }
        if (!this.mLandscape) {
            View findViewById = this.mFrontView.findViewById(R.id.taolive_stoplink_large);
            this.mStopLink = findViewById;
            ViewProxy.setOnClickListener(findViewById, this);
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_BC_LINK_WATCH, this.mFrameContext);
        boolean componentEntranceHidden2 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_BC_LINK_BIZ, this.mFrameContext);
        if (!componentEntranceHidden && !componentEntranceHidden2 && this.liveLinkFrame3 == null) {
            initLinkLiveFrame();
        }
    }

    private void initLowerComponentAnimator(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8cec09", new Object[]{this, new Integer(i2)});
        } else if (this.mBottomBarView != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
            this.lowerComponentUpAnimator = ofInt;
            ofInt.setDuration(300L);
            this.lowerComponentUpAnimator.addUpdateListener(new h());
        }
    }

    private void installMultiPKLinkFrame(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64d0ca9", new Object[]{this, baseFrame});
        } else if (yiv.b()) {
            this.mFrontView.requestLayout();
            this.weakHandler.post(new a(baseFrame));
        } else {
            baseFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_multi_pk_link_stub));
            addComponent(this.mMultiPKLinkFrame);
        }
    }

    private void installPKLinkFrame(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357db66", new Object[]{this, baseFrame});
        } else if (yiv.c()) {
            this.mFrontView.requestLayout();
            this.weakHandler.post(new d(baseFrame));
        } else {
            baseFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_pk_link_stub));
            addComponent(this.mPKLinkFrame);
        }
    }

    private void installRemoteNoticeFrame4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f650e47", new Object[]{this});
            return;
        }
        try {
            if (bl9.g().b()) {
                installRemoteNoticeFrame4inner();
            } else {
                bl9.g().i(new k());
            }
        } catch (Throwable th) {
            FlexaLiveX.w("[FullScreenLiveFrame2#registerRemoteFrame]  error: " + th.getMessage());
        }
    }

    private void installRemoteNoticeFrame4inner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16461d", new Object[]{this});
        } else if (d9m.v().getNoticeFrame4Class() != null) {
            zu1.b("tl-notice-4", d9m.v().getNoticeFrame4Class());
            this.mFrameContext.i().g(this, "tl-notice-4", (ViewStub) this.mFrontView.findViewById(R.id.taolive_notice4_stub));
        }
    }

    private void installRemoteRewardPanelInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c522a9", new Object[]{this});
        } else if (d9m.e() != null && d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME) != null) {
            zu1.b("tl-reward-panel", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME));
            this.mFrameContext.i().g(this, "tl-reward-panel", (ViewStub) this.mContainer.findViewById(R.id.taolive_room_reward_panel_stub));
            FlexaLiveX.w("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled] REWARD_FRAME success: ");
            if (((t54) this.mFrameContext).x0() != null) {
                ((t54) this.mFrameContext).x0().d(new xco.a() { // from class: tb.p0a
                    @Override // tb.xco.a
                    public final View getView() {
                        View lambda$installRemoteRewardPanelInner$42;
                        lambda$installRemoteRewardPanelInner$42 = FullScreenLiveFrame2.this.lambda$installRemoteRewardPanelInner$42();
                        return lambda$installRemoteRewardPanelInner$42;
                    }
                });
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FullScreenLiveFrame2 fullScreenLiveFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -597982134:
                super.clearComponents();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenLiveFrame2");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View lambda$initRewardPanel$41() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c46d2ee2", new Object[]{this});
        }
        return this.mContainer.findViewById(R.id.taolive_bottom_bar_wrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View lambda$installRemoteRewardPanelInner$42() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2e8211c6", new Object[]{this});
        }
        return this.mContainer.findViewById(R.id.taolive_reward_x_card_frame);
    }

    private boolean ruleCheckPass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10540ba8", new Object[]{this})).booleanValue();
        }
        if (this.isClearScreen) {
            o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，正在清屏状态");
            return false;
        }
        s9z s9zVar = this.sabAtmosphereController;
        if (s9zVar == null || !s9zVar.isShowing()) {
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var == null) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，mFrameContext is null");
                return false;
            } else if (!(ux9Var.k() instanceof yac)) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，mFrameContext.getGoodLiveContext() 不是 IGoodLiveContext");
                return false;
            } else if (d9m.n() == null) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，PluginProxyManager.getGoodProxy() is null");
                return false;
            } else if (d9m.n().isListShow((yac) this.mFrameContext.k())) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，宝贝口袋正在展示");
                return false;
            } else if (this.mFrameContext.G()) {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，商品详情正在展示");
                return false;
            } else if (!this.mFrameContext.N()) {
                return true;
            } else {
                o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，播放器存在位移");
                return false;
            }
        } else {
            o3s.b(TAG, "BottomSlideNewGuideFrame 互斥组件校验不通过，爆品氛围正在展示");
            return false;
        }
    }

    private void showLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a5d190", new Object[]{this});
            return;
        }
        initMultiLinkFrame();
        initPKLinkFrame();
        initMultiPKLinkFrame();
        initVoiceRoomFrame();
        initLiveAvatarNewCardFrame();
        initInteractiveSystemComponent();
        initChat();
        initInput();
        initMemberGuide();
        initFavorEffect();
        if (!up6.m0(this.mFrameContext)) {
            initMessageCard();
        }
        initVirtualAnchor();
        initFavor();
        initShowCase();
        initNotice();
        if (!this.mLandscape) {
            initB2BConnectingView();
        }
        initNewGiftArea();
        initImportantArea();
        initSubscribeLive();
        initTopSelectComment();
        initRankLiveEntrance();
        initLiveEndRecommend();
        initOfficialLiveEntry();
        initProjectScreen();
        initRewardPanel();
        initBTypeOtherFrame();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void addLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b74207", new Object[]{this});
            return;
        }
        addLinkViewToBlankPage(this.mMultiAnchorLinkFrame);
        addLinkViewToBlankPage(this.mPKLinkFrame);
        addLinkViewToBlankPage(this.mMultiPKLinkFrame);
        addLinkViewToBlankPage(this.mChatRoomLinkFrame);
    }

    public void addLinkViewToBlankPage(BaseFrame baseFrame) {
        View containerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb5defb", new Object[]{this, baseFrame});
        } else if (baseFrame != null && this.mBlankFrame != null && (containerView = baseFrame.getContainerView()) != null) {
            if (containerView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) containerView;
                if (viewGroup.getChildCount() > 0) {
                    this.mLinkBlankTempView = viewGroup.getChildAt(0);
                }
            }
            if (this.mLinkBlankTempView != null) {
                new Handler(Looper.getMainLooper()).post(new b());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
            return;
        }
        super.clearComponents();
        this.liveLinkFrame3 = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.ccc
    public void handleMessage(Message message) {
        Message message2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        super.handleMessage(message);
        int i2 = message.what;
        if (i2 == 2147483645) {
            this.mFrameContext.i().g(this, "tl-project-screen-icon", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_icon_container));
            message2 = Message.obtain(this.weakHandler);
            message2.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_SEARCH;
        } else if (i2 == 2147483644) {
            message2 = Message.obtain(this.weakHandler);
            message2.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_OPT;
            this.mFrameContext.i().g(this, "tl-project-screen-search", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_container));
        } else {
            if (i2 == 2147483643) {
                this.mFrameContext.i().g(this, "tl-project-screen-opt", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_opt_container));
            }
            message2 = null;
        }
        if (message2 != null) {
            this.mFrontView.requestLayout();
            this.weakHandler.sendMessage(message2);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void hideLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9dbf34", new Object[]{this});
            return;
        }
        BaseFrame baseFrame = this.mMultiAnchorLinkFrame;
        if (baseFrame != null && baseFrame.viewCreated && baseFrame.getContainerView().getVisibility() != 8) {
            this.mMultiAnchorLinkFrame.getContainerView().setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183da678", new Object[]{this});
            return;
        }
        initView();
        setUpView();
        if (up6.B0(this.mFrameContext)) {
            initDoubleClickFavView();
        }
    }

    public void initFavorEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a68346", new Object[]{this});
        } else if (!vwl.e().c() && lvs.f() && !this.mLandscape) {
            this.mFrameContext.i().c(this, "tl-favor-effect", this.mFrontView.findViewById(R.id.taolive_favor_effect_stub));
        }
    }

    public void initImportantArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e812da6", new Object[]{this});
            return;
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_GIFT_SHOW, this.mFrameContext);
        boolean componentEntranceHidden2 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_IMPORTANT_NOTICE, this.mFrameContext);
        boolean componentEntranceHidden3 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_ATMOS_ENTER, this.mFrameContext);
        if (!componentEntranceHidden && !componentEntranceHidden2 && !componentEntranceHidden3 && rgd.b().a() != null && rgd.b().a().instanceofTBLiveBizDataModel(this.mLiveDataModel)) {
            this.mFrameContext.i().g(this, "tl-important-event", (ViewStub) this.mFrontView.findViewById(R.id.taolive_important_event_stub));
        }
    }

    public void initInteractiveSystemComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b0c03", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_INTIMACY_ENTRANCE, this.mFrameContext)) {
        } else {
            if ((vc.i(this.mContext) || vc.d(this.mContext) || !this.mLandscape) && rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
                this.mFrameContext.i().c(this, "tl-intimacy", this.mFrontView.findViewById(R.id.taolive_interactive_system_frame));
            }
        }
    }

    public void initLinkLiveFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b84cade", new Object[]{this});
            return;
        }
        BaseFrame createLiveLinkFrame3AndCreateView = d9m.d().createLiveLinkFrame3AndCreateView(this.mContext, this.mFrameContext, this.mLiveDataModel, (ViewStub) this.mContainer.findViewById(R.id.taolive_video_linklive3_stub));
        this.liveLinkFrame3 = createLiveLinkFrame3AndCreateView;
        addComponent(createLiveLinkFrame3AndCreateView);
    }

    public void initLiveEndRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c040864", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mFrameContext.i().g(this, "tl-live-end-recommend", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_end_recommend_container));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initMediaPlatform() {
        BaseFrame createMediaPlatformFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else if (rgd.b().a() != null && (createMediaPlatformFrame2 = rgd.b().a().createMediaPlatformFrame2(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createMediaPlatformFrame2.onCreateView(null);
            addComponent(createMediaPlatformFrame2);
        }
    }

    public void initMemberGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432b54d9", new Object[]{this});
        } else if (!vwl.e().c()) {
            addComponent(d9m.o().getMemberGuideFrame2(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext));
        }
    }

    public void initMessageCard() {
        VideoInfo c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fcf58e", new Object[]{this});
        } else if (!nh4.g() || (c0 = up6.c0(this.mFrameContext)) == null || c0.fullScreen) {
        } else {
            if ((!c0.landScape || !up6.v0(this.mFrameContext)) && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_NOTICE, this.mFrameContext)) {
                this.mFrameContext.i().g(this, "tl-message-card", (ViewStub) this.mFrontView.findViewById(R.id.taolive_messageCard_stub));
            }
        }
    }

    public void initMultiLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef30d511", new Object[]{this});
        } else if (!vwl.e().c() && !this.mLandscape && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH, this.mFrameContext)) {
            BaseFrame multiLinkFrame = d9m.t().getMultiLinkFrame(this.mContext, this.mFrameContext);
            this.mMultiAnchorLinkFrame = multiLinkFrame;
            if (multiLinkFrame != null) {
                multiLinkFrame.keepViewStubWithoutInflate((ViewStub) this.mFrontView.findViewById(R.id.taolive_multi_anchor_link_stub));
                addComponent(this.mMultiAnchorLinkFrame);
                return;
            }
            o3s.d(TAG, "initMultiLinkFrame, frame = null");
        }
    }

    public void initMultiPKLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae235136", new Object[]{this});
        } else if (lvs.h() && !this.mLandscape) {
            BaseFrame multiPkLinkFrame = d9m.u().getMultiPkLinkFrame(this.mContext, this.mFrameContext);
            this.mMultiPKLinkFrame = multiPkLinkFrame;
            if (multiPkLinkFrame != null) {
                installMultiPKLinkFrame(multiPkLinkFrame);
            } else {
                o3s.d(TAG, "initPKLinkFrame, frame = null");
            }
        }
    }

    public void initNewGiftArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2690274", new Object[]{this});
        } else if (!vwl.e().c() && rgd.b().a() != null && rgd.b().a().instanceofTBLiveBizDataModel(this.mLiveDataModel)) {
            this.mFrameContext.i().g(this, "tl-room-gift", (ViewStub) this.mFrontView.findViewById(R.id.taolive_gift_stub));
        }
    }

    public void initNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eada1c8f", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (gnk.a().d(this.mLiveDataModel)) {
                o3s.b(TAG, "initNotice return:[isOfficialLive is true]");
            } else if (this.mFrameContext.c()) {
                o3s.b(TAG, "initNotice return:[enableLiveAndHomeMix is true]");
            } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_TOP_NOTICE, this.mFrameContext)) {
                this.mFrameContext.i().c(this, "tl-notice", this.mFrontView.findViewById(R.id.taolive_notice_stub));
            } else if (isEnableNotice4()) {
                installRemoteNoticeFrame4();
            } else {
                this.mFrameContext.i().g(this, "tl-notice", (ViewStub) this.mFrontView.findViewById(R.id.taolive_notice_stub));
            }
        }
    }

    public void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else if (!vwl.e().c() && !gnk.a().b(this.mFrameContext, this.mLiveDataModel) && gnk.a().d(this.mLiveDataModel)) {
            this.mFrameContext.i().g(this, "tl-official-live-entry", (ViewStub) this.mFrontView.findViewById(R.id.taolive_official_live_entry_stub));
        }
    }

    public void initPKLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178c74f", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (!this.mLandscape || lvs.e()) {
                BaseFrame pkLinkFrame = d9m.z().getPkLinkFrame(this.mContext, this.mFrameContext);
                this.mPKLinkFrame = pkLinkFrame;
                if (pkLinkFrame != null) {
                    installPKLinkFrame(pkLinkFrame);
                } else {
                    o3s.d(TAG, "initPKLinkFrame, frame = null");
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initPrivateVip() {
        VideoInfo c0;
        VideoInfo.AccessInfo accessInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d451", new Object[]{this});
        } else if (vwl.e().c() || !lvs.t() || (c0 = up6.c0(this.mFrameContext)) == null || (accessInfo = c0.accessInfo) == null) {
        } else {
            if (accessInfo.access) {
                if (TextUtils.equals("PRIVATE", accessInfo.accessType)) {
                    str = "欢迎进入会员专属直播间";
                } else if (TextUtils.equals("VIP", c0.accessInfo.accessType)) {
                    str = "欢迎" + v2s.o().u().getNick() + "\n进入您的专属直播间！";
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    w0u.b(this.mContext, str);
                }
            } else if (bl9.g().b()) {
                initPrivateVipFrame();
            } else {
                bl9.g().i(new e());
            }
        }
    }

    public void initPrivateVipFrame() {
        BaseFrame createPrivateVipFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbcdca", new Object[]{this});
        } else if (d9m.e() != null && (createPrivateVipFrame = d9m.e().createPrivateVipFrame(this.mContext, this.mLandscape, this.mLiveDataModel, (ViewStub) this.mFrontView.findViewById(R.id.taolive_privatevip_container_stub))) != null) {
            addComponent(createPrivateVipFrame);
        }
    }

    public void initProjectScreen() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2aa7bc", new Object[]{this});
        } else if (!vwl.e().c() && (tBLiveDataModel = this.mLiveDataModel) != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.enableProjectScreen()) {
            Message obtain = Message.obtain(this.weakHandler);
            obtain.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_ICON;
            this.weakHandler.sendMessageDelayed(obtain, 500L);
        }
    }

    public void initRankLiveEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f0c5", new Object[]{this});
        } else if (!u3s.b() && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_BANNER, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl_rank_live_entrance", (ViewStub) this.mFrontView.findViewById(R.id.taolive_rank_live_entrance));
        }
    }

    public void initRewardPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e0f2ec", new Object[]{this});
        } else if (!vwl.e().c() && !u3s.b()) {
            try {
                if (bl9.g().b()) {
                    installRemoteRewardPanelInner();
                } else {
                    bl9.g().i(new f());
                }
            } catch (Throwable th) {
                FlexaLiveX.w("[FullScreenLiveFrame2#registerRemoteFrame]  error: " + th.getMessage());
            }
            if (((t54) this.mFrameContext).x0() != null) {
                ((t54) this.mFrameContext).x0().c(new xco.a() { // from class: tb.r0a
                    @Override // tb.xco.a
                    public final View getView() {
                        View lambda$initRewardPanel$41;
                        lambda$initRewardPanel$41 = FullScreenLiveFrame2.this.lambda$initRewardPanel$41();
                        return lambda$initRewardPanel$41;
                    }
                });
            }
        }
    }

    public void initShowCase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a87b04", new Object[]{this});
            return;
        }
        o3s.d(TAG, "initShowCase.");
        if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, ComponentGroupConfig.RIGHT_BOTTOM_RIGHT_GOODS_CARD, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-showcase-common", (ViewStub) this.mFrontView.findViewById(R.id.taolive_good_showcase_common_stub));
        }
    }

    public void initSubscribeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ad3ad", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_FANS_PUSH, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl_7days_subscribe", (ViewStub) this.mFrontView.findViewById(R.id.taolive_subscribe_live));
        }
    }

    public void initTopSelectComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127e0d25", new Object[]{this});
        } else if (!vwl.e().c() && !isLandscape()) {
            this.mFrameContext.i().g(this, "tl-top-select_comment", (ViewStub) this.mFrontView.findViewById(R.id.taolive_top_select_comment));
            this.mFrameContext.o0((ViewGroup) this.mFrontView.findViewById(R.id.taolive_left_top_container));
        }
    }

    public void initVirtualAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else if (!vwl.e().c() && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG, this.mFrameContext) && this.mLiveDetailData.roomType == 8888) {
            this.mFrameContext.i().g(this, "tl-virtual-anchor", (ViewStub) this.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub));
        }
    }

    public void initVoiceRoomFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134b61f7", new Object[]{this});
        } else if (!vwl.e().c() && lvs.a() && !this.mLandscape) {
            BaseFrame voiceRoomFrame = d9m.N().getVoiceRoomFrame(this.mContext, this.mFrameContext);
            this.mChatRoomLinkFrame = voiceRoomFrame;
            if (voiceRoomFrame != null) {
                voiceRoomFrame.keepViewStubWithoutInflate((ViewStub) this.mFrontView.findViewById(R.id.taolive_voice_room_link_stub));
                addComponent(this.mChatRoomLinkFrame);
                return;
            }
            o3s.d(TAG, "initVoiceRoomFrame, frame = null");
        }
    }

    public void notifyEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac201459", new Object[]{this});
        } else {
            hideKeyboard();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        ux9 ux9Var;
        s9z s9zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.workerHandler.removeCallbacks(this.preInflateRunnable);
        if (nh4.D0() && (s9zVar = this.sabAtmosphereController) != null) {
            s9zVar.clear();
        }
        if (nh4.D() && (ux9Var = this.mFrameContext) != null) {
            long c2 = uo8.c(ux9Var);
            uo8.e(this.expExplainBehaviorCache, this.mFrameContext.R, "exp", c2);
            uo8.e(this.baseExplainBehaviorCache, this.mFrameContext.S, "base", c2);
            this.expExplainBehaviorCache = null;
            this.baseExplainBehaviorCache = null;
            uo8.a(this.mFrameContext);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == rgd.b().c(IRRoomProxy.R_ID_TAOLIVE_BTN_HOME)) {
            if (v2s.o().I("finishActivity")) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                    return;
                }
                return;
            }
            sjr.g().c(FullScreenFrame.EVENT_ACTION_GOTO_HOME, null, this.mFrameContext.C());
        } else if (view.getId() != R.id.taolive_stoplink_large) {
            super.onClick(view);
        } else if (this.liveLinkFrame3 != null && d9m.d() != null) {
            d9m.d().liveLinkFrame3ShowStopLinkDialog(this.liveLinkFrame3);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        ConcurrentHashMap<Integer, View> concurrentHashMap = FullScreenFrame.m.sCachedPool;
        int i2 = R.layout.taolive_frame_live_2_flexalocal;
        if (concurrentHashMap.containsKey(Integer.valueOf(i2))) {
            View view = concurrentHashMap.get(Integer.valueOf(i2));
            if (view == null || view.getContext() != this.mContext) {
                this.mContainer = LayoutInflater.from(this.mContext).inflate(i2, viewGroup);
            } else {
                viewGroup.addView(concurrentHashMap.remove(Integer.valueOf(i2)));
                this.mContainer = viewGroup;
                v2s.o().A().c(FullScreenFrame.m.TAG, "R.layout.taolive_frame_live2_flexalocal 使用预创建的");
            }
        } else {
            this.mContainer = LayoutInflater.from(this.mContext).inflate(i2, viewGroup);
        }
        initAll();
        FullScreenFrame.m.a aVar = new FullScreenFrame.m.a(i2, this.mContext, "R.layout.taolive_frame_live_2_flexalocal");
        this.preInflateRunnable = aVar;
        this.workerHandler.postDelayed(aVar, f51.DEF_MAX_ASYNC_SECONDS);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        ux9 ux9Var;
        IUniversalProxy.c volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ux9 ux9Var2 = this.mFrameContext;
        if (!(ux9Var2 == null || ux9Var2.s() == null)) {
            this.mFrameContext.s().g();
        }
        if (!(tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null)) {
            o3s.d(TAG, "onDataReceived start mute onItemShow");
            if (!(d9m.L() == null || (volumeChangeUploadManager = d9m.L().getVolumeChangeUploadManager()) == null)) {
                volumeChangeUploadManager.a(tBLiveDataModel.mVideoInfo.liveId);
            }
        }
        if (nh4.D() && (ux9Var = this.mFrameContext) != null) {
            long c2 = uo8.c(ux9Var);
            this.baseExplainBehaviorCache = new uo8.a(c2);
            this.expExplainBehaviorCache = new uo8.a(c2);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i2), obj});
            return;
        }
        super.onStatusChange(i2, obj);
        if (i2 == 1) {
            init();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public boolean removeLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28e9056e", new Object[]{this})).booleanValue();
        }
        if (removeLinkViewToBlankPage(this.mMultiAnchorLinkFrame) || removeLinkViewToBlankPage(this.mPKLinkFrame) || removeLinkViewToBlankPage(this.mMultiPKLinkFrame) || removeLinkViewToBlankPage(this.mChatRoomLinkFrame)) {
            return true;
        }
        return false;
    }

    public boolean removeLinkViewToBlankPage(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae5b0a62", new Object[]{this, baseFrame})).booleanValue();
        }
        if (baseFrame == null || this.mBlankFrame == null) {
            return true;
        }
        if (this.mLinkBlankTempView == null) {
            return nh4.J();
        }
        new Handler(Looper.getMainLooper()).post(new c(baseFrame));
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void showByStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85294ecd", new Object[]{this});
        } else {
            showLive();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void showLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31de6ef", new Object[]{this});
            return;
        }
        BaseFrame baseFrame = this.mMultiAnchorLinkFrame;
        if (baseFrame != null && baseFrame.viewCreated && baseFrame.getContainerView().getVisibility() != 0) {
            this.mMultiAnchorLinkFrame.getContainerView().setVisibility(0);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public void onEvent(String str, Object obj) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_LINKLIVE_START.equals(str)) {
            o3s.d(TAG, "enableLinkLive3, big stop link button gone");
            View view = this.mStopLink;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (uyg.EVENT_LINKLIVE_STOP.equals(str)) {
            View view2 = this.mStopLink;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
            if (this.mIsEnd) {
                notifyEnd();
            } else {
                initLinkLive();
            }
        } else if (FullScreenFrame.EVENT_ADD_TIPS_VIEW.equals(str)) {
            if ((obj instanceof View) && this.mFrontView != null) {
                View view3 = (View) obj;
                ViewParent parent = view3.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view3);
                }
                ((ViewGroup) this.mFrontView).addView(view3, 0);
            }
        } else if (FullScreenFrame.EVENT_LINKLIVE_INIT.equals(str)) {
            if (up6.d0(this.mFrameContext) == VideoStatus.VIDEO_NORMAL_STATUS) {
                initLinkLive();
            }
        } else if (nh4.D0() && "com.taobao.taolive.room.init_sab_atmosphere".equals(str) && (obj instanceof LiveItem)) {
            if (this.sabAtmosphereController == null && (this.mFrontView instanceof ViewGroup)) {
                if (vwl.e().g()) {
                    this.sabAtmosphereController = GoodProxy.getInstance().createAtmosphere(this.mContext, this.mFrameContext, (ViewGroup) this.mFrontView);
                } else {
                    this.sabAtmosphereController = new noo(this.mContext, this.mFrameContext, (ViewGroup) this.mFrontView);
                }
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var == null || ux9Var.j() == null || !this.mFrameContext.j().d()) {
                s9z s9zVar = this.sabAtmosphereController;
                if (s9zVar != null) {
                    if (s9zVar.isShowing()) {
                        this.sabAtmosphereController.dismiss();
                    }
                    this.sabAtmosphereController.b((LiveItem) obj, false);
                    return;
                }
                return;
            }
            sjr.g().c(uyg.d, obj, observeUniqueIdentification());
        } else if (nh4.D0() && "com.taobao.taolive.room.dismiss_sab_atmosphere".equals(str)) {
            s9z s9zVar2 = this.sabAtmosphereController;
            if (s9zVar2 != null && s9zVar2.isShowing()) {
                this.sabAtmosphereController.dismiss();
            }
        } else if (nh4.W() && "com.taobao.taolive.room.hot_item_subscribe_success".equals(str) && (obj instanceof String[])) {
            s9z s9zVar3 = this.sabAtmosphereController;
            if (s9zVar3 != null) {
                s9zVar3.a((String[]) obj);
            }
        } else if (TextUtils.equals(str, uyg.EVENT_CHANGE_CONTAINER_OFFSET)) {
            o3s.b(TAG, "沉浸式收到业务主动调用容器Offset方法，handleContainerOffset");
            handleContainerOffset(obj);
        } else if (TextUtils.equals(str, uyg.f)) {
            bottomGuideEvadeRuleCheck(obj);
        } else if (TextUtils.equals(str, uyg.c)) {
            if (obj instanceof Integer) {
                initLowerComponentAnimator((int) (((((Integer) obj).intValue() + hjr.a()) * this.mContext.getResources().getDisplayMetrics().widthPixels) / 750.0f));
                ValueAnimator valueAnimator2 = this.lowerComponentUpAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        } else if (TextUtils.equals(str, uyg.d)) {
            ux9 ux9Var2 = this.mFrameContext;
            if (ux9Var2 != null && ux9Var2.j() != null && this.mFrameContext.j().d() && (valueAnimator = this.lowerComponentUpAnimator) != null) {
                valueAnimator.reverse();
            }
        } else {
            super.onEvent(str, obj);
        }
    }

    public boolean isEnableNotice4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b681295a", new Object[]{this})).booleanValue();
        }
        if (nh4.l0()) {
            return zqq.c(v2s.o().p().b("tblive-reward", "enableShowTopRewardNotice", "true"));
        }
        return !this.mLandscape && zqq.c(v2s.o().p().b("tblive-reward", "enableShowTopRewardNotice", "true"));
    }

    @Override // tb.gtc
    public void onMessageReceived(int i2, Object obj) {
        ExplainBehaviorReportMessage explainBehaviorReportMessage;
        List<ExplainBehaviorReportMessage.Segment> list;
        uo8.a aVar;
        Queue<to8> queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i2), obj});
        } else if (i2 == 1004) {
            if (giv.f() != null) {
                giv.f().p(this.mFrameContext, "afterlive_end_notify", null);
            }
            this.mIsEnd = true;
            if (up6.d0(this.mFrameContext) == VideoStatus.VIDEO_NORMAL_STATUS) {
                notifyEnd();
            }
        } else if (i2 == 880000279 && nh4.D() && (obj instanceof ExplainBehaviorReportMessage) && (list = (explainBehaviorReportMessage = (ExplainBehaviorReportMessage) obj).segmentList) != null && !list.isEmpty() && this.mFrameContext != null) {
            if (TextUtils.equals(explainBehaviorReportMessage.explainType, "base")) {
                aVar = this.baseExplainBehaviorCache;
            } else {
                aVar = this.expExplainBehaviorCache;
            }
            uo8.d(explainBehaviorReportMessage, aVar);
            List<ExplainBehaviorReportMessage.Segment> list2 = explainBehaviorReportMessage.segmentList;
            if (TextUtils.equals(explainBehaviorReportMessage.explainType, "base")) {
                queue = this.mFrameContext.S;
            } else {
                queue = this.mFrameContext.R;
            }
            uo8.g(list2, queue, explainBehaviorReportMessage.explainType);
            if (explainBehaviorReportMessage.segmentList.size() == 2) {
                uo8.h(explainBehaviorReportMessage.segmentList.get(0), explainBehaviorReportMessage.explainType, "endExplainGoods", false);
                uo8.h(explainBehaviorReportMessage.segmentList.get(1), explainBehaviorReportMessage.explainType, "startExplainGoods", false);
            }
        }
    }
}
