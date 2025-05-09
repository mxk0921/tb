package com.taobao.taolive.movehighlight.screen.frame;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.topbar.TopBarProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.TimeShiftItemTimeShiftDXFrame;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.TimeShiftSingFrame;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame;
import com.taobao.taolive.movehighlight.utils.TimeMovingType;
import com.taobao.taolive.movehighlight.view.ClickableViewHighlight;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.bl9;
import tb.cxa;
import tb.d9m;
import tb.dxa;
import tb.gu3;
import tb.sbu;
import tb.t2o;
import tb.u6t;
import tb.uea;
import tb.uwa;
import tb.ux9;
import tb.v2s;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightFullScreenFrame extends FullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ClearScreenDXFrame clearScreenDXFrame;
    private int mLastPagePos = 0;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public final String timeShiftCleanScreenGuard = "timeShiftCleanScreenGuard";
    public final String timeShiftPlayRateGuard = "timeShiftPlayRateGuard";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gu3.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dxa f13099a;

        public a(dxa dxaVar) {
            this.f13099a = dxaVar;
        }

        @Override // tb.gu3.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e19a8c4", new Object[]{this});
            } else if (HighlightFullScreenFrame.access$000(HighlightFullScreenFrame.this) == 0 && this.f13099a.j() != null) {
                this.f13099a.j().b(Boolean.valueOf(true ^ HighlightFullScreenFrame.this.isClearScreen));
                sbu.k(HighlightFullScreenFrame.this.mFrameContext, "timeshift_clear_screen_enter", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gu3.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dxa f13100a;

        public b(dxa dxaVar) {
            this.f13100a = dxaVar;
        }

        @Override // tb.gu3.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e19a8c4", new Object[]{this});
            } else if (this.f13100a.j() != null) {
                sbu.k(HighlightFullScreenFrame.this.mFrameContext, "timeshift_clear_screen_leave", null);
                this.f13100a.j().b(Boolean.FALSE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HighlightFullScreenFrame.access$100(HighlightFullScreenFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                HighlightFullScreenFrame.access$200(HighlightFullScreenFrame.this);
            }
        }
    }

    static {
        t2o.a(779092700);
    }

    public HighlightFullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ int access$000(HighlightFullScreenFrame highlightFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3bab8d6", new Object[]{highlightFullScreenFrame})).intValue();
        }
        return highlightFullScreenFrame.mLastPagePos;
    }

    public static /* synthetic */ void access$100(HighlightFullScreenFrame highlightFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae39b24", new Object[]{highlightFullScreenFrame});
        } else {
            highlightFullScreenFrame.showGuideRunnable();
        }
    }

    public static /* synthetic */ void access$200(HighlightFullScreenFrame highlightFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20c7d65", new Object[]{highlightFullScreenFrame});
        } else {
            highlightFullScreenFrame.initTBLiveXBackFrameInner();
        }
    }

    private void initATypeSubscribeCardFrame() {
        BaseFrame createSubscribeCardFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27450305", new Object[]{this});
        } else if (d9m.e() != null && (createSubscribeCardFrame = d9m.e().createSubscribeCardFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mContainer.findViewById(R.id.taolive_subscribe_card_cover), (ViewGroup) this.mContainer.findViewById(R.id.taolive_subscribe_card_detail_container))) != null) {
            addComponent(createSubscribeCardFrame);
        }
    }

    private void initAtypeTopBar() {
        Class<? extends BaseFrame> topBarFrame3Class = TopBarProxy.getInstance().getTopBarFrame3Class();
        if (topBarFrame3Class != null) {
            try {
                BaseFrame baseFrame = (BaseFrame) topBarFrame3Class.getConstructor(Context.class, ux9.class).newInstance(this.mContext, this.mFrameContext);
                baseFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub));
                addComponent(baseFrame);
            } catch (Exception unused) {
            }
        }
    }

    private void initAtypeWaterMark() {
        Class<? extends BaseFrame> watermarkFrame3Class = d9m.y().getWatermarkFrame3Class();
        if (watermarkFrame3Class != null) {
            try {
                BaseFrame baseFrame = (BaseFrame) watermarkFrame3Class.getConstructor(Context.class, ux9.class).newInstance(this.mContext, this.mFrameContext);
                baseFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_room_watermark));
                addComponent(baseFrame);
            } catch (Exception unused) {
            }
        }
    }

    private void initTBLiveXBackFrameInner() {
        BaseFrame createRightBackwardTipsFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db5ce65", new Object[]{this});
        } else if (d9m.e() != null && (createRightBackwardTipsFrame = d9m.e().createRightBackwardTipsFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createRightBackwardTipsFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.taolive_x_back_frame_stub));
            addComponent(createRightBackwardTipsFrame);
        }
    }

    private void initTopFakeBarFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcb70db", new Object[]{this});
            return;
        }
        BaseFrame topFakeBarFrame = d9m.y().getTopFakeBarFrame(this.mContext, this.mFrameContext);
        if (topFakeBarFrame != null) {
            topFakeBarFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub));
            addComponent(topFakeBarFrame);
        }
    }

    public static /* synthetic */ Object ipc$super(HighlightFullScreenFrame highlightFullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1664844779:
                super.handleRoomCleanScreen(objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 1087027639:
                super.clearComponent();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/screen/frame/HighlightFullScreenFrame");
        }
    }

    private void showGuideRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800794c3", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) this.mContext).isDestroyed() && ((Activity) this.mContext).getWindow().isActive()) {
            try {
                String a2 = u6t.a("timeShiftCleanScreenGuard");
                String a3 = u6t.a("timeShiftPlayRateGuard");
                if (!"true".equals(a2)) {
                    d9m.y().showClearScreenGuide(this.mContext);
                    u6t.d("timeShiftCleanScreenGuard", "true");
                } else if (!"true".equals(a3)) {
                    d9m.y().showPlayRateScreenGuide(this.mContext);
                    u6t.d("timeShiftPlayRateGuard", "true");
                }
            } catch (Exception unused) {
            }
        }
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

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void handleRoomCleanScreen(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc47c15", new Object[]{this, obj});
            return;
        }
        super.handleRoomCleanScreen(obj);
        ClearScreenDXFrame clearScreenDXFrame = this.clearScreenDXFrame;
        if (clearScreenDXFrame != null) {
            clearScreenDXFrame.setVisibility(this.isClearScreen);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initAvatarCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca50c940", new Object[]{this});
            return;
        }
        BaseFrame liveAvatarNewFrame = d9m.y().getLiveAvatarNewFrame(this.mContext, false, this.mLiveDataModel);
        liveAvatarNewFrame.createView((ViewStub) this.mContainer.findViewById(R.id.taolive_highlight_avatar_card_container));
        addComponent(liveAvatarNewFrame);
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
            return;
        }
        dxa b2 = dxa.b(this.mFrameContext);
        this.mViewPager.setOnClearClickListener(new a(b2), this.mLandscape);
        View view = this.mViewPagerBackground;
        if (view instanceof ClickableViewHighlight) {
            ((ClickableViewHighlight) view).setOnSingleClickListener(new b(b2));
        }
    }

    public void initClearScreenDXFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17c63b7", new Object[]{this});
        } else if (this.clearScreenDXFrame == null) {
            ClearScreenDXFrame clearScreenDXFrame = new ClearScreenDXFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
            this.clearScreenDXFrame = clearScreenDXFrame;
            clearScreenDXFrame.onCreateView2((ViewGroup) this.mContainer.findViewById(R.id.taolive_highlight_clear_screen));
            addComponent(this.clearScreenDXFrame);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
        } else if (this.mLiveDetailData != null) {
            uea ueaVar = new uea((Activity) this.mContext, this.mFrameContext, this.mLiveDetailData.liveId, this.mLandscape, this.mLiveDataModel, this.mContainer.findViewById(R.id.taolive_goods_list_cover));
            ueaVar.e((ViewGroup) this.mContainer.findViewById(R.id.taolive_goods_list_weex_container));
            addComponent(ueaVar.b());
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        } else {
            initAtypeWaterMark();
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initSubscribeCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9cebd1", new Object[]{this});
        } else {
            initATypeSubscribeCardFrame();
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initTBLiveXBackFrame(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b2a00e", new Object[]{this, videoInfo});
        } else if (!yqq.h(v2s.o().p().b("tblive", "enableLiveRoomBackward", "true"))) {
        } else {
            if (bl9.g().b()) {
                initTBLiveXBackFrameInner();
            } else {
                bl9.g().i(new d());
            }
        }
    }

    public void initTimeShiftBabyListDX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90358094", new Object[]{this});
            return;
        }
        TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame = new TimeShiftItemTimeShiftDXFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftItemTimeShiftDXFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftItemTimeShiftDXFrame);
    }

    public void initTimeShiftContentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7ba0", new Object[]{this});
            return;
        }
        TimeShiftContentFrame timeShiftContentFrame = new TimeShiftContentFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftContentFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftContentFrame);
    }

    public void initTimeShiftSingleDX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37705488", new Object[]{this});
            return;
        }
        TimeShiftSingFrame timeShiftSingFrame = new TimeShiftSingFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftSingFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftSingFrame);
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO, this.mFrameContext)) {
            initAtypeTopBar();
        } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.P.bizCode)) {
            initTopFakeBarFrame();
            initAtypeTopBar();
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.isClearScreen) {
            sbu.k(this.mFrameContext, "timeshift_clear_screen_leave", null);
        }
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_live_2_highlight, viewGroup);
        initAll();
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        this.isClearScreen = false;
        this.mViewPager.setVisibility(0);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        } else {
            super.onStatusChange(i, obj);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void showHighlightGuide(VideoInfo videoInfo) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d46841", new Object[]{this, videoInfo});
        } else if (uwa.J() && (handler = this.mMainHandler) != null) {
            handler.postDelayed(new c(), 5000L);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initHighligtFrame(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84011f5", new Object[]{this, videoInfo});
        } else if (v2s.o().I("timeShift")) {
            cxa.c = false;
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null && ux9Var.g && !TimeMovingType.checkContentTimeMove(videoInfo)) {
                initTimeShiftSingleDX();
                ux9 ux9Var2 = this.mFrameContext;
                if (ux9Var2 != null && !ux9Var2.f) {
                    initClearScreenDXFrame();
                }
            } else if (TimeMovingType.checkContentTimeMove(videoInfo)) {
                initTimeShiftContentFrame();
                cxa.c = true;
            } else {
                initTimeShiftBabyListDX();
            }
        }
    }
}
