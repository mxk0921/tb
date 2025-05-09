package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.dxhandler.DXTaoLiveEndRecommendActionEventHandler;
import com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.HashMap;
import tb.b0d;
import tb.bwq;
import tb.cpr;
import tb.czd;
import tb.d9m;
import tb.giv;
import tb.gt9;
import tb.hw0;
import tb.ikr;
import tb.o3s;
import tb.pb6;
import tb.pyg;
import tb.qt9;
import tb.rbt;
import tb.t2o;
import tb.ux9;
import tb.v2s;
import tb.vx9;
import tb.x0u;
import tb.xca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveEndRecommendFrame extends BaseFrame implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveEndRecommendFrame";
    private final cpr.b mMessageListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(LiveEndRecommendFrame liveEndRecommendFrame) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/liveend/LiveEndRecommendFrame$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1004 || i == 1006) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 1004) {
                LiveEndRecommendFrame.access$000(LiveEndRecommendFrame.this);
            } else if (i == 1006) {
                o3s.b(LiveEndRecommendFrame.TAG, "anchorLeave");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(LiveEndRecommendFrame liveEndRecommendFrame) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                o3s.b(LiveEndRecommendFrame.TAG, "resume onClick listener");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8607a;
        public final /* synthetic */ String b;

        public d(JSONObject jSONObject, String str) {
            this.f8607a = jSONObject;
            this.b = str;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            o3s.b(LiveEndRecommendFrame.TAG, "querySubscribe onNext");
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                this.f8607a.put("isPreview", (Object) "false");
                LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, this.b, this.f8607a);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            o3s.b(LiveEndRecommendFrame.TAG, "querySubscribe onError");
            this.f8607a.put("isPreview", (Object) "true");
            LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, this.b, this.f8607a);
        }
    }

    static {
        t2o.a(295699504);
        t2o.a(806355932);
    }

    public LiveEndRecommendFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(LiveEndRecommendFrame liveEndRecommendFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eeb5d6", new Object[]{liveEndRecommendFrame});
        } else {
            liveEndRecommendFrame.startRequestLiveEndData();
        }
    }

    public static /* synthetic */ void access$100(LiveEndRecommendFrame liveEndRecommendFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e87d1", new Object[]{liveEndRecommendFrame, str, jSONObject});
        } else {
            liveEndRecommendFrame.renderDXView(str, jSONObject);
        }
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

    public static /* synthetic */ Object ipc$super(LiveEndRecommendFrame liveEndRecommendFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/liveend/LiveEndRecommendFrame");
        }
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
        }
        try {
            reportPageShow(jSONObject);
        } catch (Exception e) {
            o3s.b(TAG, "reportPageShow error:" + e.getMessage());
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
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            str = "";
        } else {
            str = videoInfo.liveId;
        }
        if (!giv.c().b()) {
            vx9.f(this.mFrameContext);
        }
        new pyg(this).K(str, "");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_live_end_recommend_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.t() != null) {
            this.mFrameContext.t().a(this.mMessageListener);
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
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().l(this.mMessageListener, new a(this));
        }
        ikr.f().e().W0(DXTaoLiveEndRecommendActionEventHandler.DX_EVENT_TAOLIVEENDRECOMMENDACTION, new DXTaoLiveEndRecommendActionEventHandler(tBLiveDataModel));
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            x0u.a(this.mContext, "网络开小差了");
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo != null && (netBaseOutDo.getData() instanceof LiveEndRecommendDataBean)) {
            startRendEndView((LiveEndRecommendDataBean) netBaseOutDo.getData());
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            x0u.a(this.mContext, "网络开小差了");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        } else {
            super.onViewCreated(view);
        }
    }

    private void startRendEndView(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2978d8", new Object[]{this, liveEndRecommendDataBean});
            return;
        }
        inflateViewOnNeed();
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(0);
            this.mContainer.setBackgroundColor(Color.parseColor("#32323C"));
            ViewProxy.setOnClickListener(this.mContainer, new c(this));
            final String str = liveEndRecommendDataBean.dxTemplateName;
            final JSONObject jSONObject = liveEndRecommendDataBean.dxData;
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
                String string = jSONObject.getString("preLiveId");
                if (TextUtils.isEmpty(string)) {
                    renderDXView(str, jSONObject);
                } else if (giv.c().b()) {
                    bwq.c(string, "taoLiveStartNotify", null, "tblive_inline", new IObserverX() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                        public void onComplete() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                        public void onError(Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                                return;
                            }
                            jSONObject.put("isPreview", (Object) "true");
                            LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                        }

                        @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                        public void onNext(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                            } else if ((obj instanceof SubScribeCenterResultDTO) && "SUCCESS".equals(((SubScribeCenterResultDTO) obj).getRetCode())) {
                                jSONObject.put("isPreview", (Object) "false");
                                LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                            }
                        }
                    });
                } else {
                    SubscribeUtils.INSTANCE.querySubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new d(jSONObject, str));
                }
            }
        }
    }

    private void reportPageShow(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a983bc9", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString(gt9.MTOP_ISFOLLOW);
        HashMap<String, String> hashMap = new HashMap<>();
        if (TextUtils.equals(string, "true")) {
            hashMap.put("follow_type", "follow");
        } else {
            hashMap.put("follow_type", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED);
        }
        if (TextUtils.equals(jSONObject.getString("isPreview"), "true")) {
            hashMap.put("order_type", "order");
        } else {
            hashMap.put("order_type", "unorder");
        }
        if (jSONObject.containsKey("recommendList")) {
            JSONArray jSONArray = jSONObject.getJSONArray("recommendList");
            StringBuilder sb = new StringBuilder();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (i != 0) {
                            sb.append("_");
                        }
                        sb.append(jSONObject2.getString("liveId"));
                    }
                }
                hashMap.put("recommendLiveId", sb.toString());
            }
        }
        if (giv.f() != null) {
            giv.f().p(this.mFrameContext, "off_live-exp", hashMap);
        }
    }
}
