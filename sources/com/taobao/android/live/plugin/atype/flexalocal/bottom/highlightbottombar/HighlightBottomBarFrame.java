package com.taobao.android.live.plugin.atype.flexalocal.bottom.highlightbottombar;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayMuteFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayPlayFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ReplayRateFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.bte;
import tb.c7m;
import tb.giv;
import tb.pcc;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HighlightBottomBarFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HighlightBottomBarFrame";
    public boolean currentCleanStatus = false;
    public HighlightBackToliveFrame highlightBackToliveFrame;
    private pcc mHighlightDxManager;
    private JSONObject mJsonObject;
    private c7m mVideoFrame;
    private View playControllerView;
    public BaseFrame playFrame;
    public BaseFrame playRateFrame;
    public BaseFrame replayMuteFrame;

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
            HighlightBottomBarFrame.access$000(HighlightBottomBarFrame.this);
            HighlightBottomBarFrame highlightBottomBarFrame = HighlightBottomBarFrame.this;
            HighlightBottomBarFrame.access$200(highlightBottomBarFrame, HighlightBottomBarFrame.access$100(highlightBottomBarFrame));
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
            BaseFrame baseFrame;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HighlightBottomBarFrame highlightBottomBarFrame = HighlightBottomBarFrame.this;
            if (highlightBottomBarFrame.currentCleanStatus && (baseFrame = highlightBottomBarFrame.replayMuteFrame) != null && baseFrame.getContainerView() != null) {
                HighlightBottomBarFrame.this.replayMuteFrame.getContainerView().setVisibility(4);
            }
        }
    }

    static {
        t2o.a(295698555);
        t2o.a(806355016);
    }

    public HighlightBottomBarFrame(Context context, ux9 ux9Var, pcc pccVar, JSONObject jSONObject, c7m c7mVar, View view) {
        super(context, ux9Var);
        this.mHighlightDxManager = pccVar;
        this.mJsonObject = jSONObject;
        this.mVideoFrame = c7mVar;
        this.playControllerView = view;
    }

    public static /* synthetic */ void access$000(HighlightBottomBarFrame highlightBottomBarFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68e82d4", new Object[]{highlightBottomBarFrame});
        } else {
            highlightBottomBarFrame.initBackToLiveBtn();
        }
    }

    public static /* synthetic */ JSONObject access$100(HighlightBottomBarFrame highlightBottomBarFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb455f13", new Object[]{highlightBottomBarFrame});
        }
        return highlightBottomBarFrame.mJsonObject;
    }

    public static /* synthetic */ void access$200(HighlightBottomBarFrame highlightBottomBarFrame, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3818c6e", new Object[]{highlightBottomBarFrame, obj});
        } else {
            highlightBottomBarFrame.changeBottomPlayStatus(obj);
        }
    }

    private void bottomCleanHandler(boolean z) {
        String str;
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd612c21", new Object[]{this, new Boolean(z)});
            return;
        }
        this.currentCleanStatus = z;
        HighlightBackToliveFrame highlightBackToliveFrame = this.highlightBackToliveFrame;
        if (!(highlightBackToliveFrame == null || highlightBackToliveFrame.getContainerView() == null)) {
            View containerView = this.highlightBackToliveFrame.getContainerView();
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            containerView.setVisibility(i2);
        }
        BaseFrame baseFrame = this.playRateFrame;
        if (!(baseFrame == null || baseFrame.getContainerView() == null || this.playRateFrame.getContainerView().getVisibility() == 8)) {
            View containerView2 = this.playRateFrame.getContainerView();
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            containerView2.setVisibility(i);
        }
        BaseFrame baseFrame2 = this.replayMuteFrame;
        if (!(baseFrame2 == null || baseFrame2.getContainerView() == null || this.replayMuteFrame.getContainerView().getVisibility() == 8)) {
            View containerView3 = this.replayMuteFrame.getContainerView();
            if (z) {
                i3 = 4;
            }
            containerView3.setVisibility(i3);
        }
        sjr g = sjr.g();
        if (z) {
            str = "com.taobao.taolive.room.recommend.good.card.did.appear";
        } else {
            str = "com.taobao.taolive.room.recommend.good.card.did.disappear";
        }
        g.c(str, null, this.mFrameContext.C());
    }

    private void changeBottomPlayStatus(Object obj) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb66684", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            boolean booleanValue = ((JSONObject) obj).getBooleanValue("itemIsSpeaking");
            BaseFrame baseFrame2 = this.playFrame;
            if (!(baseFrame2 == null || baseFrame2.getContainerView() == null || (baseFrame = this.playRateFrame) == null || baseFrame.getContainerView() == null)) {
                if (booleanValue) {
                    this.playFrame.getContainerView().setVisibility(8);
                    this.playRateFrame.getContainerView().setVisibility(8);
                    View view = this.playControllerView;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    this.playFrame.getContainerView().setVisibility(0);
                    this.playRateFrame.getContainerView().setVisibility(0);
                    View view2 = this.playControllerView;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                }
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                ux9Var.h().e(uyg.EVENT_HIGHLIGHT_NOTIFY_CARD_RENDER, Boolean.valueOf(booleanValue));
            }
        }
    }

    private void initBackToLiveBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cbd4005", new Object[]{this});
            return;
        }
        HighlightBackToliveFrame highlightBackToliveFrame = new HighlightBackToliveFrame(this.mContext, this.mFrameContext, this.mJsonObject);
        this.highlightBackToliveFrame = highlightBackToliveFrame;
        highlightBackToliveFrame.createView((ViewStub) findViewById(R.id.taolive_highlight_bottombar_back_to_live));
        addComponent(this.highlightBackToliveFrame);
    }

    private void initGoodsIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2098a6c6", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.i() != null) {
            this.mFrameContext.i().g(this, "tl-bottom-goods-icon", (ViewStub) findViewById(R.id.taolive_highlight_bottombar_goods_icon_stub));
        }
    }

    private void initMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacddb50", new Object[]{this});
        } else if (!giv.c().b() && bte.a(this.mFrameContext)) {
            ReplayMuteFrame replayMuteFrame = new ReplayMuteFrame(this.mContext, this.mFrameContext);
            this.replayMuteFrame = replayMuteFrame;
            replayMuteFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_highlight_bottom_mute_stub));
            addComponent(this.replayMuteFrame);
        }
    }

    private void initPlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69f904", new Object[]{this});
        } else if (this.mContext != null && this.mFrameContext != null) {
            ReplayPlayFrame replayPlayFrame = new ReplayPlayFrame(this.mContext, this.mFrameContext, this.mVideoFrame);
            this.playFrame = replayPlayFrame;
            replayPlayFrame.createView((ViewStub) findViewById(R.id.taolive_highlight_bottombar_play_stub));
            addComponent(this.playFrame);
        }
    }

    private void initPlayRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1917deb", new Object[]{this});
        } else if (this.mContext != null && this.mFrameContext != null) {
            ReplayRateFrame replayRateFrame = new ReplayRateFrame(this.mContext, this.mFrameContext);
            this.playRateFrame = replayRateFrame;
            replayRateFrame.createView((ViewStub) findViewById(R.id.taolive_highlight_bottombar_rate_stub));
            addComponent(this.playRateFrame);
        }
    }

    public static /* synthetic */ Object ipc$super(HighlightBottomBarFrame highlightBottomBarFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/highlightbottombar/HighlightBottomBarFrame");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-highligt";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_highlight_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_HIGHLIGHT_CHANGE_BOTTOM_STATUS, uyg.EVENT_HIGHLIGHT_BOTTOM_CLEAN_NOTIFY};
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
        initPlayIcon();
        initPlayRate();
        initGoodsIcon();
        initMute();
        View view = this.mContainer;
        if (view != null) {
            view.post(new a());
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        if (uyg.EVENT_HIGHLIGHT_CHANGE_BOTTOM_STATUS.equals(str)) {
            changeBottomPlayStatus(obj);
        }
        if (uyg.EVENT_HIGHLIGHT_BOTTOM_CLEAN_NOTIFY.equals(str) && obj != null) {
            bottomCleanHandler(((Boolean) obj).booleanValue());
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        View view = this.mContainer;
        if (view != null) {
            view.post(new b());
        }
    }
}
