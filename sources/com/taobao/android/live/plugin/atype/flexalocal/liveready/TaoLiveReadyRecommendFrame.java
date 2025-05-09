package com.taobao.android.live.plugin.atype.flexalocal.liveready;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendDataBean;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.b0d;
import tb.czd;
import tb.d9m;
import tb.giv;
import tb.gt9;
import tb.hw0;
import tb.o3s;
import tb.pb6;
import tb.pyg;
import tb.qt9;
import tb.rbt;
import tb.t2o;
import tb.ux9;
import tb.v2s;
import tb.vx9;
import tb.xca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveReadyRecommendFrame extends BaseFrame implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveReadyRecommendFrame";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TaoLiveReadyRecommendFrame taoLiveReadyRecommendFrame) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                o3s.b(TaoLiveReadyRecommendFrame.TAG, "resume onClick listener");
            }
        }
    }

    static {
        t2o.a(295699517);
        t2o.a(806355932);
    }

    public TaoLiveReadyRecommendFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    private qt9 buildFollowParams() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("ea71fb2d", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null) {
            return new qt9();
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return new qt9();
        }
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo != null) {
            str = accountInfo.accountId;
            str2 = accountInfo.type;
        } else {
            str = "";
            str2 = str;
        }
        String str3 = videoInfo.liveId;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new qt9();
        }
        qt9 qt9Var = new qt9();
        qt9Var.c = str3;
        qt9Var.b = str2;
        qt9Var.f26917a = str;
        qt9Var.o = qt9.FOLLOW_COMMENT;
        return giv.f().r(qt9Var);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveReadyRecommendFrame taoLiveReadyRecommendFrame, String str, Object... objArr) {
        if (str.hashCode() == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/liveready/TaoLiveReadyRecommendFrame");
    }

    private void renderDXView(String str, JSONObject jSONObject) {
        czd czdVar;
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a7ff30", new Object[]{this, str, jSONObject});
            return;
        }
        DXRootView createDX = d9m.n().createDX(this.mContext, str);
        if (createDX != null) {
            d9m.n().renderDX(createDX, jSONObject);
        }
        if ((this.mContainer instanceof FrameLayout) && createDX != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ATaoLiveOpenEntity A = this.mFrameContext.A();
            if (!(A == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null || (f = ((rbt) A.uiCompontent).b().f()) == null)) {
                layoutParams.topMargin = (int) (layoutParams.topMargin + f.floatValue());
            }
            ((ViewGroup) this.mContainer).addView(createDX, layoutParams);
            this.mContainer.setVisibility(0);
        }
    }

    private void startRequestLiveEndData() {
        String str;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbe6d13", new Object[]{this});
            return;
        }
        this.mContainer.setBackgroundColor(Color.parseColor("#32323C"));
        ViewProxy.setOnClickListener(this.mContainer, new a(this));
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            str = "";
        } else {
            str = videoInfo.liveId;
        }
        vx9.f(this.mFrameContext);
        new pyg(this).K(str, "");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-live-ready-recommend";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_live_ready_recommend_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        Boolean bool = tBLiveDataModel.mVideoInfo.trialBroadcast;
        if (bool != null && bool.booleanValue()) {
            this.mLiveDataModel = tBLiveDataModel;
            d9m.n().getDynamicXEngine().W0(DXTaoLiveEndRecommendActionEventHandler.DX_EVENT_TAOLIVEENDRECOMMENDACTION, new DXTaoLiveEndRecommendActionEventHandler(tBLiveDataModel));
            startRequestLiveEndData();
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            o3s.b(TAG, "LiveEndRecommendRequest onError");
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo != null && (netBaseOutDo.getData() instanceof LiveEndRecommendDataBean)) {
            startRendReadyView((LiveEndRecommendDataBean) netBaseOutDo.getData());
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            o3s.b(TAG, "LiveEndRecommendRequest onSystemError");
        }
    }

    private void startRendReadyView(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f112ae60", new Object[]{this, liveEndRecommendDataBean});
            return;
        }
        String str = liveEndRecommendDataBean.dxTemplateName;
        JSONObject jSONObject = liveEndRecommendDataBean.dxData;
        int max = Math.max(xca.b, xca.c);
        int f = hw0.f();
        if (jSONObject != null) {
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var == null || ux9Var.A() == null || this.mFrameContext.A().bizCode == null || (!this.mFrameContext.A().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString()) && !this.mFrameContext.A().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString()))) {
                jSONObject.put("topOffset", (Object) String.valueOf(Math.round((max * 375) / pb6.s(this.mContext))));
            } else {
                jSONObject.put("topOffset", (Object) 0);
            }
            jSONObject.put("height", (Object) String.valueOf(Math.round((hw0.b(this.mContext, f) * 375) / pb6.s(this.mContext))));
            jSONObject.put(gt9.MTOP_ISFOLLOW, (Object) String.valueOf(v2s.o().k().e(buildFollowParams())));
            renderDXView(str, jSONObject);
        }
    }
}
