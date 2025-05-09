package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.bl9;
import tb.bte;
import tb.czd;
import tb.d9m;
import tb.giv;
import tb.hw0;
import tb.o3s;
import tb.or;
import tb.rbt;
import tb.s3c;
import tb.t2o;
import tb.u3s;
import tb.ux9;
import tb.uyg;
import tb.x2o;
import tb.zu1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BottomBarFrame3 extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_GOODS_LIST_SHOWING = "com.taobao.taolive.room.goods_list_showing";
    private static final String EVENT_SEND_MORE_LIVE_STATUS = "taolive.more.live.status";
    private static final String EVENT_START_QUALITY = "com.taobao.taolive.room.start_quality";
    private static final String EVENT_START_REPORT = "com.taobao.taolive.room.start_report_from_btns";
    private static final String EVENT_TAOLIVE_ROOM_CLEAR_SCREEN = "com.taobao.taolive.room.clean_screen";
    private static final String TAG = "BottomBarFrame3";
    public static int sBottomBarBottomDP;
    public static int sBottomBarLeftDP = 12;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener = new a();
    private DialogFragment qualityDialog;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            BottomBarFrame3.sBottomBarBottomDP = hw0.t(BottomBarFrame3.this.mContext, marginLayoutParams.topMargin + marginLayoutParams.height + marginLayoutParams.bottomMargin);
            View view2 = BottomBarFrame3.this.mContainer;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                BottomBarFrame3.access$000(BottomBarFrame3.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                BottomBarFrame3.access$100(BottomBarFrame3.this);
            }
        }
    }

    static {
        t2o.a(295698442);
        t2o.a(806355016);
    }

    public BottomBarFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(BottomBarFrame3 bottomBarFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35031437", new Object[]{bottomBarFrame3});
        } else {
            bottomBarFrame3.initRewardFreeGift();
        }
    }

    public static /* synthetic */ void access$100(BottomBarFrame3 bottomBarFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0ad938", new Object[]{bottomBarFrame3});
        } else {
            bottomBarFrame3.initQualityDialog();
        }
    }

    private void adjustLayoutParams() {
        ux9 ux9Var;
        ATaoLiveOpenEntity A;
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (!(giv.c().b() || (ux9Var = this.mFrameContext) == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
            Float l = ((rbt) A.uiCompontent).b().l();
            if (l != null && l.floatValue() > 0.0f && l.floatValue() <= 500.0f) {
                marginLayoutParams.bottomMargin = (int) l.floatValue();
            }
            if (or.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) && l != null && l.floatValue() > -200.0f && l.floatValue() <= 500.0f) {
                marginLayoutParams.bottomMargin = l.intValue();
            }
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    private void initBottomInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367c3e36", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_COMMENT_INPUT_BUTTON, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-input", (ViewStub) findViewById(R.id.taolive_bottombar_iput_stub));
        }
    }

    private void initFavorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530fd2a8", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_LIKE_BUTTON, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-favor", (ViewStub) findViewById(R.id.taolive_bottombar_favor_count_stub));
        }
    }

    private void initGoodsIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2098a6c6", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_GOOD_ENTRANCE, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-goods-icon", (ViewStub) findViewById(R.id.taolive_bottombar_goods_icon_stub));
        }
    }

    private void initMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacddb50", new Object[]{this});
        } else if (!giv.c().b() && bte.a(this.mFrameContext)) {
            MuteFrame muteFrame = new MuteFrame(this.mContext, this.mFrameContext);
            muteFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_bottom_mute_stub));
            addComponent(muteFrame);
        }
    }

    private void initQualityDialog() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e7e4fe", new Object[]{this});
        } else if (this.mFrameContext != null && (tBLiveDataModel = this.mLiveDataModel) != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.liveId != null) {
            DialogFragment dialogFragment = this.qualityDialog;
            if ((dialogFragment == null || !dialogFragment.isVisible()) && d9m.L() != null) {
                this.qualityDialog = d9m.L().createTaoliveQualityDialog(this.mFrameContext, this.mLiveDataModel.mVideoInfo.liveId, this.mLandscape);
            }
        }
    }

    private void initReward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4fd166", new Object[]{this});
        } else if (!u3s.b() && !ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REWARD_BUTTON, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-reward", (ViewStub) findViewById(R.id.taolive_bottombar_reward_icon_stub));
            if (bl9.g().b()) {
                initRewardFreeGift();
            } else {
                bl9.g().i(new b());
            }
        }
    }

    private void initRewardFreeGift() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8977642", new Object[]{this});
            return;
        }
        zu1.b("tl-reward-free-gift", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_FREE_GIFT_FRAME));
        this.mFrameContext.i().g(this, "tl-reward-free-gift", (ViewStub) findViewById(R.id.taolive_bottombar_reward_free_gift_stub));
    }

    private void initShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
        } else {
            this.mFrameContext.i().g(this, "tl-bottom-share", (ViewStub) findViewById(R.id.taolive_bottombar_share_stub));
        }
    }

    public static /* synthetic */ Object ipc$super(BottomBarFrame3 bottomBarFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/BottomBarFrame3");
        }
    }

    private void showQualityDialog() {
        DialogFragment dialogFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ca66b1", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if ((context instanceof FragmentActivity) && (dialogFragment = this.qualityDialog) != null) {
            dialogFragment.show(((FragmentActivity) context).getSupportFragmentManager(), "qualityDialog");
        }
    }

    private void showReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20ffe98", new Object[]{this});
        } else if (this.mFrameContext.x() != null) {
            x2o.c(this.mContext, this.mLiveDataModel, this.mFrameContext.x().getCurrentPosition(), this.mLandscape);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "BottomBarFrame3";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-bar-native";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_live_layout2_showcase_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.start_report_from_btns", EVENT_SEND_MORE_LIVE_STATUS, EVENT_START_QUALITY, "com.taobao.taolive.room.clean_screen", EVENT_GOODS_LIST_SHOWING, uyg.EVENT_CLEAR_SCREEN_NEW};
    }

    @Override // tb.s3c
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
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.h().b(this);
        View view = this.mContainer;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.h().a(this);
        adjustLayoutParams();
        initMore();
        initMute();
        this.mContainer.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        if (getFrameContext() != null && !TextUtils.isEmpty(getFrameContext().i) && tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && !TextUtils.equals(getFrameContext().i, tBLiveDataModel.mVideoInfo.liveId)) {
            o3s.b("BottomBarFrame3", "liveId is not equals error liveId:" + tBLiveDataModel.mVideoInfo.liveId + " correct liveId：" + this.mFrameContext.i);
            giv.f().m(this.mFrameContext, "UpDownSwitchBottomBarError", new HashMap());
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.start_report_from_btns".equals(str)) {
            showReport();
        } else if (!EVENT_START_QUALITY.equals(str)) {
        } else {
            if (bl9.g().b()) {
                initQualityDialog();
                showQualityDialog();
                return;
            }
            bl9.g().i(new c());
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        initGoodsIcon();
        initBottomInput();
        initFavorCount();
        initShare();
        initReward();
    }

    private void initMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fec68c", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            int i = videoInfo.status;
            if ((i == 0 || i == 3 || i == 1) && !ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_MORE_BUTTON, this.mFrameContext)) {
                this.mFrameContext.i().g(this, "tl-bottom-more", (ViewStub) findViewById(R.id.taolive_bottombar_more_stub));
            }
        }
    }
}
