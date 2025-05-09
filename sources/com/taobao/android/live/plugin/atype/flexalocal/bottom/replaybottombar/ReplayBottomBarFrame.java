package com.taobao.android.live.plugin.atype.flexalocal.bottom.replaybottombar;

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
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayMuteFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayShareFrame;
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
import tb.nh4;
import tb.o3s;
import tb.or;
import tb.rbt;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.x2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayBottomBarFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_START_QUALITY = "com.taobao.taolive.room.start_quality";
    private static final String EVENT_START_REPORT = "com.taobao.taolive.room.start_report_from_btns";
    private static final String TAG = "ReplayBottomBarFrame";
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
            BottomBarFrame3.sBottomBarBottomDP = hw0.t(ReplayBottomBarFrame.this.mContext, marginLayoutParams.topMargin + marginLayoutParams.height + marginLayoutParams.bottomMargin);
            View view2 = ReplayBottomBarFrame.this.mContainer;
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
                ReplayBottomBarFrame.access$000(ReplayBottomBarFrame.this);
            }
        }
    }

    static {
        t2o.a(295698558);
        t2o.a(806355016);
    }

    public ReplayBottomBarFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(ReplayBottomBarFrame replayBottomBarFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66543618", new Object[]{replayBottomBarFrame});
        } else {
            replayBottomBarFrame.initQualityDialog();
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

    private void initBackToLiveBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cbd4005", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REPLAY_BACK_TO_LIVE_ENTRANCE, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-back-to-live", (ViewStub) findViewById(R.id.taolive_bottombar_back_to_live_stub));
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
            ReplayMuteFrame replayMuteFrame = new ReplayMuteFrame(this.mContext, this.mFrameContext);
            replayMuteFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_bottom_mute_stub));
            addComponent(replayMuteFrame);
        }
    }

    private void initPlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69f904", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REPLAY_PLAY_BUTTON, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-bottom-play", (ViewStub) findViewById(R.id.taolive_bottombar_play_stub));
        }
    }

    private void initPlayRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1917deb", new Object[]{this});
        } else {
            this.mFrameContext.i().g(this, "tl-replay-rate", (ViewStub) findViewById(R.id.taolive_bottombar_rate_stub));
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

    private void initShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
        } else {
            addComponent(new ReplayShareFrame(this.mContext, this.mFrameContext));
        }
    }

    public static /* synthetic */ Object ipc$super(ReplayBottomBarFrame replayBottomBarFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/replaybottombar/ReplayBottomBarFrame");
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
        return "ReplayBottomBarFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-replay";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_replay_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.start_report_from_btns", EVENT_START_QUALITY};
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
        initMute();
        initMore();
        if (nh4.A0()) {
            initPlayRate();
        }
        this.mContainer.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        if (getFrameContext() != null && !TextUtils.isEmpty(getFrameContext().i) && tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && !TextUtils.equals(getFrameContext().i, tBLiveDataModel.mVideoInfo.liveId)) {
            o3s.b("ReplayBottomBarFrame", "liveId is not equals error liveId:" + tBLiveDataModel.mVideoInfo.liveId + " correct liveId：" + this.mFrameContext.i);
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
            bl9.g().i(new b());
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
        initPlayIcon();
        initBackToLiveBtn();
        initGoodsIcon();
        initShare();
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
                this.mFrameContext.i().g(this, "tl-bottom-more-2", (ViewStub) findViewById(R.id.taolive_bottombar_more_stub));
            }
        }
    }
}
