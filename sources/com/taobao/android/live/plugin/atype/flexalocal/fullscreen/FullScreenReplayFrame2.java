package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.d9m;
import tb.jlc;
import tb.n6m;
import tb.nh4;
import tb.o3s;
import tb.qr4;
import tb.rgd;
import tb.sjr;
import tb.t2o;
import tb.t6t;
import tb.u6t;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.wda;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullScreenReplayFrame2 extends AbsFullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenReplayFrame2";

    static {
        t2o.a(295698798);
    }

    public FullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    private void destroy() {
        jlc liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        if (rgd.b().a() != null && rgd.b().a().getLiveDetailMessInfo(this.mFrameContext) != null && (liveDetailMessInfo = rgd.b().a().getLiveDetailMessInfo(this.mFrameContext)) != null) {
            liveDetailMessInfo.onDestroy();
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        sjr.g().a(this);
        getMessageInfo();
    }

    private void initPlayRateGuideView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b04ec4", new Object[]{this});
        } else if (nh4.x0(up6.c0(this.mFrameContext)) && this.mLastPagePos == 0 && !t6t.b("playSpeedGuideHasShow")) {
            showPlayRateGuide();
        }
    }

    private void initReplayTextShift() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81021d85", new Object[]{this});
        } else {
            this.mFrameContext.i().g(this, "tl-live-replay-shift-text", (ViewStub) this.mFrontView.findViewById(R.id.taolive_replay_shift_stub));
        }
    }

    private void initVirtualAnchor() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG, this.mFrameContext) && (videoInfo = this.mLiveDetailData) != null && videoInfo.roomType == 8888) {
            this.mFrameContext.i().g(this, "tl-virtual-anchor", (ViewStub) this.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub));
        }
    }

    public static /* synthetic */ Object ipc$super(FullScreenReplayFrame2 fullScreenReplayFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1610016887:
                super.initGoodListFrame();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -213350091:
                super.initTopBar();
                return null;
            case 106400575:
                super.initBottomBar();
                return null;
            case 120719712:
                super.initDoubleClickFavView();
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            case 1087027639:
                super.clearComponent();
                return null;
            case 1502306574:
                return super.getControllerHolder((ViewGroup) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenReplayFrame2");
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void clearComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cab9b7", new Object[]{this});
        } else {
            super.clearComponent();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.m8c
    public Object getControllerHolder(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("598b610e", new Object[]{this, viewGroup});
        }
        if (!nh4.x0(up6.c0(this.mFrameContext))) {
            return super.getControllerHolder(viewGroup);
        }
        View view = this.mContainer;
        if (view == null || (frameLayout = (FrameLayout) view.findViewById(R.id.taolive_replay_back_playcontroller_layer)) == null) {
            return null;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i = R.layout.taolive_replay_progress_bar_preview_update;
        if (viewGroup == null) {
            viewGroup = frameLayout;
        }
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(i, viewGroup);
        qr4 qr4Var = new qr4();
        qr4Var.f26892a = viewGroup2.findViewById(R.id.taolive_video_bar_frame_layout);
        qr4Var.d = (TextView) viewGroup2.findViewById(R.id.video_controller_total_time);
        qr4Var.e = (TextView) viewGroup2.findViewById(R.id.video_controller_current_time);
        qr4Var.f = (SeekBar) viewGroup2.findViewById(R.id.video_controller_seekBar);
        qr4Var.k = R.drawable.taolive_video_fullscreen_icon;
        qr4Var.l = R.drawable.taolive_video_unfullscreen;
        return qr4Var;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else {
            super.handleMessage(message);
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

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
        } else if (nh4.w0(this.mLiveDataModel)) {
            this.mBottomBarView = this.mFrontView.findViewById(R.id.taolive_bottom_bar);
            BaseFrame createReplayBottomBarFrame = d9m.g().createReplayBottomBarFrame(this.mContext, this.mFrameContext, (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottombar_stub2));
            if (createReplayBottomBarFrame != null) {
                o3s.b(TAG, "initBottomBar mReplayBottomBarFrame is not null");
                addComponent(createReplayBottomBarFrame);
            }
        } else {
            super.initBottomBar();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        } else if (!nh4.w0(this.mLiveDataModel)) {
            super.initDoubleClickFavView();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
            return;
        }
        super.initGoodListFrame();
        if (wda.w()) {
            this.mFrameContext.i().g(this, "tl-showcase-common", (ViewStub) this.mFrontView.findViewById(R.id.taolive_good_showcase_replay_stub));
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

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        } else {
            super.initTopBar();
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_live_2_flexalocal, viewGroup);
        initAll();
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

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (FullScreenFrame.EVENT_ROOT_VIEW_CLICK.equals(str)) {
            if (this.mViewPager.getCurrentItem() == 0) {
                sjr.g().c(FullScreenFrame.EVENT_CLICK_ROOT_VIEW_FOR_REPLAY, null, this.mFrameContext.C());
            }
        } else if (TextUtils.equals(str, uyg.EVENT_SHOW_PLAY_SPEED_GUIDE) && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            initPlayRateGuideView();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i == 1) {
            init();
        }
    }

    public void showReplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a15fcb", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.mFrameContext);
        if (c0 != null && c0.publishCommentsUseMtop && c0.fetchCommentsUseMtop && !nh4.w0(this.mLiveDataModel)) {
            initChat();
            initInput();
            initFavor();
            initReplayTextShift();
        }
        initVirtualAnchor();
        initLiveAvatarNewCardFrame();
    }

    private void showPlayRateGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03ac832", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) this.mContext).isDestroyed() && ((Activity) this.mContext).getWindow().isActive()) {
            try {
                new n6m(this.mContext).e(isLandscape());
                u6t.e("playSpeedGuideHasShow", true);
            } catch (Exception e) {
                o3s.b(TAG, "showPlayRateGuide e:" + e.getMessage());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void showByStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85294ecd", new Object[]{this});
            return;
        }
        showReplay();
        VideoInfo c0 = up6.c0(this.mFrameContext);
        if (c0 != null && this.mLandscape && this.mFrontView != null && c0.publishCommentsUseMtop && c0.fetchCommentsUseMtop && !nh4.w0(this.mLiveDataModel)) {
            o3s.b(TAG, "showByStatus bottom set margin bottom 45dp");
            LinearLayout linearLayout = (LinearLayout) this.mFrontView.findViewById(R.id.taolive_bottom_bar);
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, this.mContext.getResources().getDimensionPixelSize(R.dimen.taolive_default_progressbar_heigh_flexalocal));
                }
            }
        }
    }
}
