package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.interactpanel;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.f;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.InteractiveComponent;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LinkageInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import tb.agf;
import tb.azd;
import tb.b1u;
import tb.bl9;
import tb.bte;
import tb.c84;
import tb.d9m;
import tb.giv;
import tb.ibt;
import tb.jbu;
import tb.nzc;
import tb.o3s;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.tws;
import tb.u6t;
import tb.ukr;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.vc;
import tb.yqq;
import tb.zfc;
import tb.zff;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractPanelFrameSDK extends BaseFrame implements agf, zfc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_PROJECT_SCREEN = "projectScreen";
    private static final String KEY_REFUND = "refund";
    private static final String KEY_SHARE = "share";
    private View mCover;
    private zff mInteractPanelView;
    private nzc mNegativeFeedbackHandler;
    private ViewGroup mRootView;
    private SmallWindowSettingDialog mSmallWindowSettingDialog;
    private InteractiveComponent pcgGift;
    private HashMap<String, VideoInfo.Feedback> mFeedbackHashMap = new HashMap<>();
    private boolean initCalled = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveDataModel f8685a;

        public a(TBLiveDataModel tBLiveDataModel) {
            this.f8685a = tBLiveDataModel;
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                InteractPanelFrameSDK.access$000(InteractPanelFrameSDK.this, this.f8685a);
            }
        }
    }

    static {
        t2o.a(295699934);
        t2o.a(806356595);
        t2o.a(806356131);
    }

    public InteractPanelFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ void access$000(InteractPanelFrameSDK interactPanelFrameSDK, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0a2ea6", new Object[]{interactPanelFrameSDK, tBLiveDataModel});
        } else {
            interactPanelFrameSDK.initNegativeFeedbackHandler(tBLiveDataModel);
        }
    }

    private boolean bcEntranceHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5153d2ac", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.A() == null || this.mFrameContext.A().abilityCompontent == null) {
            return false;
        }
        return !((ibt) this.mFrameContext.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link);
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        zff zffVar = this.mInteractPanelView;
        if (zffVar != null) {
            zffVar.destroy();
            this.mInteractPanelView = null;
        }
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        try {
            SmallWindowSettingDialog smallWindowSettingDialog = this.mSmallWindowSettingDialog;
            if (smallWindowSettingDialog != null) {
                if (smallWindowSettingDialog.isVisible()) {
                    this.mSmallWindowSettingDialog.dismissAllowingStateLoss();
                }
                this.mSmallWindowSettingDialog = null;
            }
        } catch (Exception unused) {
        }
    }

    public static boolean enableMultiLinkChatroomEnter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e105dfc0", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableMultiLinkChatroomEnterV2", "true"));
        }
        return false;
    }

    private String getItemIconUrl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa3c7fc0", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "https://gw.alicdn.com/imgextra/i2/O1CN012UjPlX266Lggx9ZOt_!!6000000007612-2-tps-108-108.png";
        }
        return "https://gw.alicdn.com/imgextra/i1/O1CN01wMyAxi1jd6r2C2I0G_!!6000000004570-2-tps-108-108.png";
    }

    private IInteractiveProxy.h getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("d5cdd132", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof t54) {
            return ((t54) ux9Var).z0();
        }
        return null;
    }

    private void init() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        IInteractiveProxy.h tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (!(tBLiveInteractiveManager == null || (tBLiveDataModel = this.mLiveDataModel) == null)) {
            this.mInteractPanelView = tBLiveInteractiveManager.m(this.mRootView, this.mCover, this.mLandscape, tBLiveDataModel.mVideoInfo);
            initData();
        }
        zff zffVar = this.mInteractPanelView;
        if (zffVar != null) {
            zffVar.init(this);
        }
    }

    private void initNegativeFeedbackHandler(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0bd4ea0", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.feedBackList != null && d9m.L() != null) {
            this.mNegativeFeedbackHandler = d9m.L().createNegativeFeedbackHandler(this.mContext, tBLiveDataModel, this.mFrameContext);
        }
    }

    public static /* synthetic */ Object ipc$super(InteractPanelFrameSDK interactPanelFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/interactpanel/InteractPanelFrameSDK");
        }
    }

    private boolean isEnableChatRoomLink() {
        VideoInfo videoInfo;
        LinkageInfo linkageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d864665", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || !"chatroom".equals(videoInfo.liveBizType) || !enableMultiLinkChatroomEnter() || (linkageInfo = this.mLiveDataModel.mVideoInfo.linkage) == null || !linkageInfo.bcChatroom) {
            return false;
        }
        return true;
    }

    private boolean isEnableJianbao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770d27e2", new Object[]{this})).booleanValue();
        }
        if (bcEntranceHidden() || d9m.d() == null || !d9m.d().enableLinkLive3()) {
            return false;
        }
        return d9m.d().enableJianBao(this.mFrameContext, this.mLiveDataModel);
    }

    private boolean isEnableLikeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97454c1b", new Object[]{this})).booleanValue();
        }
        if (bcEntranceHidden() || d9m.d() == null || !d9m.d().enableLinkLive3()) {
            return false;
        }
        return d9m.d().enableLiveLink(this.mFrameContext, this.mLiveDataModel);
    }

    private void updatePcgGiftItemIconUrl(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f236a5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!(z || bl9.g().e() == null || bl9.g().e().get(IGiftProxy.KEY) == null)) {
            d9m.m().clearGiftQueue();
        }
        this.pcgGift.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_Quality", getItemIconUrl(z));
        this.mInteractPanelView.addNativeComponent(this.pcgGift);
        if (z) {
            str = "已打开其他用户的礼物特效";
        } else {
            str = "已屏蔽其他用户的礼物特效";
        }
        b1u.b(this.mContext, str);
    }

    public boolean enableMiniPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b91706", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.A() == null || this.mFrameContext.A().abilityCompontent == null) {
            return true;
        }
        return ((ibt) this.mFrameContext.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        zff zffVar = this.mInteractPanelView;
        if (zffVar != null) {
            zffVar.hide();
        }
    }

    public void initNegativeFeedback(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        List<VideoInfo.Feedback> list;
        ATaoLiveOpenEntity A;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8878404a", new Object[]{this, tBLiveDataModel});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.A() == null || (A = this.mFrameContext.A()) == null || (azdVar = A.abilityCompontent) == null || ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback)) {
            if (bl9.g().b()) {
                initNegativeFeedbackHandler(tBLiveDataModel);
            } else {
                bl9.g().i(new a(tBLiveDataModel));
            }
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (list = videoInfo.feedBackList) == null)) {
                for (VideoInfo.Feedback feedback : list) {
                    if (VideoInfo.Feedback.TYPE_NOT_WATCH.equals(feedback.type)) {
                        addNotWatchClick(feedback);
                    } else if (VideoInfo.Feedback.TYPE_REDUCE_RECOMMEND.equals(feedback.type)) {
                        addReduceClick(feedback);
                    }
                }
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = viewGroup;
        this.mRootView = viewGroup;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
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

    @Override // tb.zfc
    public void setCoverView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfa0ef1", new Object[]{this, view});
        } else {
            this.mCover = view;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        zff zffVar = this.mInteractPanelView;
        if (zffVar != null) {
            zffVar.show();
        }
    }

    private void addShare(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47daaefe", new Object[]{this, tBLiveDataModel});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_SHARE_BUTTON, this.mFrameContext)) {
        } else {
            if (d9m.D().isRewardEnable(tBLiveDataModel, this.mFrameContext) || bte.d()) {
                InteractiveComponent interactiveComponent = new InteractiveComponent();
                interactiveComponent.isShowInInteractivePanel = true;
                interactiveComponent.interactivePanelDisplayOnly = true;
                interactiveComponent.isNeedShowEntrance = true;
                interactiveComponent.type = "native";
                interactiveComponent.showOrder = f.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;
                interactiveComponent.migrationFlag = true;
                interactiveComponent.iconAction = "event";
                interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_share", "https://gw.alicdn.com/imgextra/i3/O1CN0132064B29aWem9a9B9_!!6000000008084-2-tps-120-120.png");
                interactiveComponent.name = "share";
                interactiveComponent.fedName = "share";
                interactiveComponent.label = "分享";
                interactiveComponent.panelTitle = "分享";
                this.mInteractPanelView.addInteractComponent(interactiveComponent);
            }
        }
    }

    private void addNotWatchClick(VideoInfo.Feedback feedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19542f0c", new Object[]{this, feedback});
            return;
        }
        InteractiveComponent interactiveComponent = new InteractiveComponent();
        interactiveComponent.isShowInInteractivePanel = true;
        interactiveComponent.interactivePanelDisplayOnly = true;
        interactiveComponent.isNeedShowEntrance = true;
        interactiveComponent.type = "native";
        interactiveComponent.showOrder = 0;
        interactiveComponent.migrationFlag = true;
        interactiveComponent.iconAction = "event";
        interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_notWatchClick", "https://img.alicdn.com/imgextra/i1/O1CN012MSgKh1L138TYOYXv_!!6000000001238-2-tps-108-108.png");
        interactiveComponent.name = "notWatchClick";
        interactiveComponent.fedName = "notWatchClick";
        interactiveComponent.label = "不看Ta";
        interactiveComponent.panelTitle = "不看Ta";
        this.mInteractPanelView.addNativeComponent(interactiveComponent);
        this.mFeedbackHashMap.put(interactiveComponent.name, feedback);
    }

    private void addPip(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70312e76", new Object[]{this, tBLiveDataModel});
        } else if (!up6.q0(this.mFrameContext) && tBLiveDataModel != null && !tBLiveDataModel.mVideoInfo.closeXiaochuang) {
            boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_MINI_BUTTON, this.mFrameContext);
            boolean C0 = up6.C0(this.mFrameContext);
            if (!componentEntranceHidden && C0 && !this.mFrameContext.c()) {
                InteractiveComponent interactiveComponent = new InteractiveComponent();
                interactiveComponent.isShowInInteractivePanel = true;
                interactiveComponent.interactivePanelDisplayOnly = true;
                interactiveComponent.isNeedShowEntrance = true;
                interactiveComponent.type = "native";
                interactiveComponent.showOrder = 0;
                interactiveComponent.migrationFlag = true;
                interactiveComponent.iconAction = "event";
                interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_Pip", "https://img.alicdn.com/imgextra/i3/O1CN01YXDAnQ1ppN7asBMwb_!!6000000005409-2-tps-108-108.png");
                interactiveComponent.name = "pip";
                interactiveComponent.fedName = "pip";
                interactiveComponent.label = "小窗播放";
                interactiveComponent.panelTitle = "小窗播放";
                this.mInteractPanelView.addNativeComponent(interactiveComponent);
            }
        }
    }

    private void addProjectScreen(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8927c384", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.enableProjectScreen()) {
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_screen", "https://gw.alicdn.com/imgextra/i1/O1CN01kUbyKB26zlfa6qqK9_!!6000000007733-2-tps-108-108.png");
            interactiveComponent.name = KEY_PROJECT_SCREEN;
            interactiveComponent.fedName = KEY_PROJECT_SCREEN;
            interactiveComponent.label = "投屏";
            interactiveComponent.panelTitle = "投屏";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    private void addReduceClick(VideoInfo.Feedback feedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334c0062", new Object[]{this, feedback});
            return;
        }
        InteractiveComponent interactiveComponent = new InteractiveComponent();
        interactiveComponent.isShowInInteractivePanel = true;
        interactiveComponent.interactivePanelDisplayOnly = true;
        interactiveComponent.isNeedShowEntrance = true;
        interactiveComponent.type = "native";
        interactiveComponent.showOrder = 0;
        interactiveComponent.migrationFlag = true;
        interactiveComponent.iconAction = "event";
        interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_reduceClick", "https://img.alicdn.com/imgextra/i1/O1CN018LnYPz1wESVrzYZ3L_!!6000000006276-2-tps-108-108.png");
        interactiveComponent.name = "reduceClick";
        interactiveComponent.fedName = "reduceClick";
        interactiveComponent.label = "减少此内容";
        interactiveComponent.panelTitle = "减少此内容";
        this.mInteractPanelView.addNativeComponent(interactiveComponent);
        this.mFeedbackHashMap.put(interactiveComponent.name, feedback);
    }

    private void addRefund(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef120df9", new Object[]{this, tBLiveDataModel});
            return;
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REFUND_FOR_MINORS, this.mFrameContext);
        if (tws.y() && !componentEntranceHidden) {
            try {
                VideoInfo.AdmireInfo admireInfo = tBLiveDataModel.mVideoInfo.admireInfo;
                if (admireInfo == null) {
                    return;
                }
                if (admireInfo.juvenileRefund) {
                    InteractiveComponent interactiveComponent = new InteractiveComponent();
                    interactiveComponent.isShowInInteractivePanel = true;
                    interactiveComponent.interactivePanelDisplayOnly = true;
                    interactiveComponent.isNeedShowEntrance = true;
                    interactiveComponent.type = "native";
                    interactiveComponent.showOrder = 0;
                    interactiveComponent.migrationFlag = true;
                    interactiveComponent.iconAction = "event";
                    interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_refund", "https://gw.alicdn.com/imgextra/i1/O1CN01xGdE7n1hKfgpOiOn8_!!6000000004259-2-tps-108-108.png");
                    interactiveComponent.name = "refund";
                    interactiveComponent.fedName = "refund";
                    interactiveComponent.label = "未成年退款";
                    interactiveComponent.panelTitle = "未成年退款";
                    this.mInteractPanelView.addNativeComponent(interactiveComponent);
                }
            } catch (Exception e) {
                e.printStackTrace();
                o3s.b("InteractPanelFrameSDK", e.getMessage());
            }
        }
    }

    private void addReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743ddf3c", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REPORT_LIVE_ROOM, this.mFrameContext)) {
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_reportLiveRoom", "https://gw.alicdn.com/imgextra/i3/O1CN01nIYNPV1pppfsyeOm8_!!6000000005410-2-tps-108-108.png");
            interactiveComponent.name = "reportLiveRoom";
            interactiveComponent.fedName = "reportLiveRoom";
            interactiveComponent.label = "直播举报";
            interactiveComponent.panelTitle = "直播举报";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    private void addSmallWindowSetting(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295cad3a", new Object[]{this, tBLiveDataModel});
        } else if ((!vc.a() || !vc.h(this.mContext)) && enableMiniPlayer() && tBLiveDataModel != null && !tBLiveDataModel.mVideoInfo.closeXiaochuang) {
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_Window_Setting", "https://gw.alicdn.com/imgextra/i4/O1CN01EAQzZe1SymBWLoVKp_!!6000000002316-2-tps-108-108.png");
            interactiveComponent.name = "smallwindowsetting";
            interactiveComponent.fedName = "smallwindowsetting";
            interactiveComponent.label = "小窗设置";
            interactiveComponent.panelTitle = "小窗设置";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    private void initData() {
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        VideoInfo videoInfo3;
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else if (this.mInteractPanelView != null) {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (!(tBLiveDataModel == null || (videoInfo3 = tBLiveDataModel.mVideoInfo) == null || (admireInfo = videoInfo3.admireInfo) == null || !admireInfo.enableInvisibility)) {
                InteractiveComponent interactiveComponent = new InteractiveComponent();
                interactiveComponent.isShowInInteractivePanel = true;
                interactiveComponent.interactivePanelDisplayOnly = true;
                interactiveComponent.isNeedShowEntrance = true;
                interactiveComponent.type = "native";
                interactiveComponent.showOrder = 0;
                interactiveComponent.migrationFlag = true;
                interactiveComponent.iconAction = "event";
                interactiveComponent.iconUrl = "https://gw.alicdn.com/imgextra/i1/O1CN01aEBXi71JA5p8870Rr_!!6000000000987-2-tps-108-108.png";
                interactiveComponent.fedName = "bigRInvisibility";
                interactiveComponent.label = "打赏隐身";
                interactiveComponent.panelTitle = "打赏隐身";
                this.mInteractPanelView.addNativeComponent(interactiveComponent);
            }
            if (isEnableLikeLive()) {
                InteractiveComponent interactiveComponent2 = new InteractiveComponent();
                interactiveComponent2.isShowInInteractivePanel = true;
                interactiveComponent2.interactivePanelDisplayOnly = true;
                interactiveComponent2.isNeedShowEntrance = true;
                interactiveComponent2.type = "native";
                interactiveComponent2.showOrder = 100000;
                interactiveComponent2.migrationFlag = true;
                interactiveComponent2.iconAction = "event";
                interactiveComponent2.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_link", "https://gw.alicdn.com/imgextra/i3/O1CN01WoZ0pX1QqPd7NfhbA_!!6000000002027-2-tps-120-120.png");
                interactiveComponent2.name = "link";
                interactiveComponent2.fedName = "link";
                interactiveComponent2.label = "连麦";
                interactiveComponent2.panelTitle = "连麦";
                this.mInteractPanelView.addInteractComponent(interactiveComponent2);
            }
            if (isEnableChatRoomLink()) {
                InteractiveComponent interactiveComponent3 = new InteractiveComponent();
                interactiveComponent3.isShowInInteractivePanel = true;
                interactiveComponent3.interactivePanelDisplayOnly = true;
                interactiveComponent3.isNeedShowEntrance = true;
                interactiveComponent3.type = "native";
                interactiveComponent3.showOrder = 100000;
                interactiveComponent3.migrationFlag = true;
                interactiveComponent3.iconAction = "event";
                interactiveComponent3.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_chatroom_link", "https://img.alicdn.com/imgextra/i3/O1CN0144yCXl1euuG9YJGOq_!!6000000003932-2-tps-120-120.png");
                interactiveComponent3.name = "chatRoomLink";
                interactiveComponent3.fedName = "chatRoomLink";
                interactiveComponent3.label = "上麦";
                interactiveComponent3.panelTitle = "上麦";
                this.mInteractPanelView.addInteractComponent(interactiveComponent3);
            }
            if (isEnableJianbao()) {
                InteractiveComponent interactiveComponent4 = new InteractiveComponent();
                interactiveComponent4.isShowInInteractivePanel = true;
                interactiveComponent4.interactivePanelDisplayOnly = true;
                interactiveComponent4.isNeedShowEntrance = true;
                interactiveComponent4.type = "native";
                interactiveComponent4.showOrder = 0;
                interactiveComponent4.migrationFlag = true;
                interactiveComponent4.iconAction = "event";
                interactiveComponent4.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_jianbao", "https://gw.alicdn.com/tfs/TB19F4aWAY2gK0jSZFgXXc5OFXa-136-136.png");
                interactiveComponent4.name = "jianbao";
                interactiveComponent4.fedName = "jianbao";
                interactiveComponent4.label = "鉴宝";
                interactiveComponent4.panelTitle = "鉴宝";
                this.mInteractPanelView.addInteractComponent(interactiveComponent4);
            }
            TBLiveDataModel tBLiveDataModel2 = this.mLiveDataModel;
            if (!(tBLiveDataModel2 == null || (videoInfo2 = tBLiveDataModel2.mVideoInfo) == null || (!zga.e(videoInfo2.itemTransferInfo) && !d9m.D().isRewardEnable(this.mLiveDataModel, this.mFrameContext)))) {
                InteractiveComponent interactiveComponent5 = new InteractiveComponent();
                this.pcgGift = interactiveComponent5;
                interactiveComponent5.isShowInInteractivePanel = true;
                interactiveComponent5.interactivePanelDisplayOnly = true;
                interactiveComponent5.isNeedShowEntrance = true;
                interactiveComponent5.type = "native";
                interactiveComponent5.showOrder = 0;
                interactiveComponent5.migrationFlag = true;
                interactiveComponent5.iconAction = "event";
                interactiveComponent5.iconUrl = getItemIconUrl(c84.a(this.mContext));
                InteractiveComponent interactiveComponent6 = this.pcgGift;
                interactiveComponent6.name = "PcgGift";
                interactiveComponent6.fedName = "PcgGift";
                interactiveComponent6.label = "礼物特效";
                interactiveComponent6.panelTitle = "礼物特效";
                this.mInteractPanelView.addNativeComponent(interactiveComponent6);
            }
            TBLiveDataModel tBLiveDataModel3 = this.mLiveDataModel;
            if (!(tBLiveDataModel3 == null || (videoInfo = tBLiveDataModel3.mVideoInfo) == null || videoInfo.status != 0)) {
                InteractiveComponent interactiveComponent7 = new InteractiveComponent();
                interactiveComponent7.isShowInInteractivePanel = true;
                interactiveComponent7.interactivePanelDisplayOnly = true;
                interactiveComponent7.isNeedShowEntrance = true;
                interactiveComponent7.type = "native";
                interactiveComponent7.showOrder = 0;
                interactiveComponent7.migrationFlag = true;
                interactiveComponent7.iconAction = "event";
                interactiveComponent7.iconUrl = tws.D("TaoLiveConfig_InteractPanel2_Quality", "https://img.alicdn.com/imgextra/i2/O1CN018jEBrO1qYFwCT4Bww_!!6000000005507-2-tps-108-108.png");
                interactiveComponent7.name = "quality";
                interactiveComponent7.fedName = "quality";
                interactiveComponent7.label = "清晰度";
                interactiveComponent7.panelTitle = "清晰度";
                this.mInteractPanelView.addNativeComponent(interactiveComponent7);
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var == null || ux9Var.A() == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.mFrameContext.A().bizCode)) {
                addSmallWindowSetting(this.mLiveDataModel);
                addProjectScreen(this.mLiveDataModel);
            }
            addPip(this.mLiveDataModel);
            addRefund(this.mLiveDataModel);
            initNegativeFeedback(this.mLiveDataModel);
            addShare(this.mLiveDataModel);
            addReport();
        }
    }

    @Override // tb.agf
    public void OnClickInteractPanelNativeListener(String str) {
        VideoInfo videoInfo;
        VideoInfo.AdmireInfo admireInfo;
        String str2;
        nzc nzcVar;
        nzc nzcVar2;
        VideoInfo videoInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee2101", new Object[]{this, str});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        String C = ux9Var != null ? ux9Var.C() : null;
        if ("link".equals(str)) {
            sjr.g().c(uyg.EVENT_START_LINKLIVE, null, C);
        }
        if ("chatRoomLink".equals(str)) {
            sjr.g().c(uyg.EVENT_START_CHATROOM_LINK, null, C);
        } else if ("gift".equals(str)) {
            sjr.g().c("com.taobao.taolive.room.show_gift_list_window", null, C);
        } else if ("jianbao".equals(str)) {
            sjr.g().c(uyg.EVENT_START_JIANBAO, null, C);
        } else if ("quality".equals(str)) {
            sjr.g().c("com.taobao.taolive.room.start_quality", null, C);
        } else if ("pip".equals(str)) {
            this.mFrameContext.h().c(uyg.EVENT_START_SHOW_GLOBAL_MINILIVE, null, C);
            if (getTBLiveInteractiveManager() instanceof ukr) {
                jbu.d((ukr) getTBLiveInteractiveManager(), "ZoomToMiniPlay", new String[0]);
            }
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel != null && (videoInfo2 = tBLiveDataModel.mVideoInfo) != null && !TextUtils.isEmpty(videoInfo2.liveId)) {
                u6t.g("taolive_timemove_back", this.mLiveDataModel.mVideoInfo.liveId);
            }
        } else if ("notWatchClick".equals(str)) {
            VideoInfo.Feedback feedback = this.mFeedbackHashMap.get(str);
            if (feedback != null && (nzcVar2 = this.mNegativeFeedbackHandler) != null) {
                nzcVar2.b(feedback);
            }
        } else if ("reduceClick".equals(str)) {
            VideoInfo.Feedback feedback2 = this.mFeedbackHashMap.get(str);
            if (feedback2 != null && (nzcVar = this.mNegativeFeedbackHandler) != null) {
                nzcVar.a(feedback2);
            }
        } else if ("PcgGift".equals(str)) {
            if (this.pcgGift != null) {
                boolean z = !c84.a(this.mContext);
                if (!(bl9.g().e() == null || bl9.g().e().get(IGiftProxy.KEY) == null)) {
                    d9m.m().setGuestSendGiftEffectStatus(z);
                }
                c84.d(this.mContext, z);
                updatePcgGiftItemIconUrl(z);
            }
        } else if (TextUtils.equals("refund", str)) {
            if (giv.c().a() == 1) {
                str2 = "https://web.wapa.taobao.com/app/mtb/teenager-refund/home";
            } else {
                str2 = "https://web.m.taobao.com/app/mtb/teenager-refund/home";
            }
            Nav.from(this.mContext).toUri(tws.D("refund_url", str2));
        } else if (TextUtils.equals("share", str)) {
            sjr.g().c("com.taobao.taolive.room.more.share.click", null, C);
        } else if (KEY_PROJECT_SCREEN.equals(str)) {
            sjr.g().c(uyg.EVENT_PROJECT_SCREEN_SHOW, null, C);
        } else if ("smallwindowsetting".equals(str)) {
            if (this.mSmallWindowSettingDialog == null) {
                this.mSmallWindowSettingDialog = SmallWindowSettingDialog.Q2(this.mFrameContext);
            }
            if (this.mContext != null && !this.mSmallWindowSettingDialog.isVisible()) {
                this.mSmallWindowSettingDialog.show(((FragmentActivity) this.mContext).getSupportFragmentManager(), "smallWindowDialog");
            }
        } else if ("bigRInvisibility".equals(str)) {
            TBLiveDataModel tBLiveDataModel2 = this.mLiveDataModel;
            if (tBLiveDataModel2 != null && (videoInfo = tBLiveDataModel2.mVideoInfo) != null && (admireInfo = videoInfo.admireInfo) != null && admireInfo.invisibilityJumpInfo != null) {
                this.mFrameContext.h().e(uyg.EVENT_HANDLE_JUMP_INFO, this.mLiveDataModel.mVideoInfo.admireInfo.invisibilityJumpInfo);
            }
        } else if ("reportLiveRoom".equals(str)) {
            sjr.g().c("com.taobao.taolive.room.start_report_from_btns", null, C);
        }
    }
}
