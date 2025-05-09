package com.taobao.android.live.plugin.atype.flexalocal.input.member;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.b0d;
import tb.ccc;
import tb.fmi;
import tb.jyw;
import tb.mmi;
import tb.rgd;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.yj4;
import tb.zf1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MemberGuideFrame2 extends BaseFrame implements ccc, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_UI = 10001;
    private mmi messageChannel;
    private final Runnable mRunnable = new a();
    private final jyw mHandler = new jyw(this);

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
            TBLiveDataModel tBLiveDataModel = MemberGuideFrame2.this.mLiveDataModel;
            VideoInfo videoInfo = tBLiveDataModel != null ? tBLiveDataModel.mVideoInfo : null;
            if (videoInfo != null && videoInfo.broadCaster != null && rgd.b().a() != null && !rgd.b().a().userActionManagerHasUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member")) {
                rgd.b().a().userActionManagerAddUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member");
                MemberGuideFrame2.access$000(MemberGuideFrame2.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            Message obtainMessage = MemberGuideFrame2.access$100(MemberGuideFrame2.this).obtainMessage();
            obtainMessage.what = 10001;
            obtainMessage.obj = obj;
            MemberGuideFrame2.access$100(MemberGuideFrame2.this).sendMessage(obtainMessage);
        }
    }

    static {
        t2o.a(295699433);
        t2o.a(806356161);
        t2o.a(806355932);
    }

    @Deprecated
    public MemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public static /* synthetic */ void access$000(MemberGuideFrame2 memberGuideFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45275c3", new Object[]{memberGuideFrame2});
        } else {
            memberGuideFrame2.showJoinMemberCard();
        }
    }

    public static /* synthetic */ jyw access$100(MemberGuideFrame2 memberGuideFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyw) ipChange.ipc$dispatch("e71e9fde", new Object[]{memberGuideFrame2});
        }
        return memberGuideFrame2.mHandler;
    }

    public static /* synthetic */ Object ipc$super(MemberGuideFrame2 memberGuideFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/member/MemberGuideFrame2");
        }
    }

    private void joinMemberFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd5010", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", (Object) "加入会员，解锁专属权益");
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_CHAT_RENDERS_ENHANCE, "joinMember");
        jSONObject.put("extendVal", (Object) hashMap);
        sjr g = sjr.g();
        ux9 ux9Var = this.mFrameContext;
        g.c(uyg.EVENT_SEND_COMMENT, jSONObject, ux9Var == null ? null : ux9Var.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInstall$39(BaseFrame baseFrame, BaseFrame.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70c1216", new Object[]{this, baseFrame, bVar});
            return;
        }
        if (getContainerView() != null) {
            getContainerView().setVisibility(0);
        }
        invokeFrameLifecycle(baseFrame, bVar);
    }

    private void procMessageCallback(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdadf59", new Object[]{this, obj});
        } else if ((obj instanceof JSONObject) && ((JSONObject) obj).getString("name").equals("authSuccess")) {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            VideoInfo videoInfo = tBLiveDataModel != null ? tBLiveDataModel.mVideoInfo : null;
            if (videoInfo != null && videoInfo.broadCaster != null) {
                new zf1(this).K(videoInfo.liveId, videoInfo.broadCaster.accountId);
            }
        }
    }

    private void showJoinMemberCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd8b5f8", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msgType", "10086");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "alivemodx-live-join-member-card");
        jSONObject.put("messageSubType", "10086");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", "start");
        jSONObject2.put("name", "alivemodx-live-join-member-card");
        jSONObject2.put("type", "h5_v2");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("delayDuration", (Object) Integer.valueOf((int) RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND));
        String liveDetailMessInfoGetSNSNick = (rgd.b().a() == null || !rgd.b().a().liveDetailMessInfoIsLegal()) ? null : rgd.b().a().liveDetailMessInfoGetSNSNick();
        if (TextUtils.isEmpty(liveDetailMessInfoGetSNSNick)) {
            liveDetailMessInfoGetSNSNick = v2s.o().u().getNick();
        }
        jSONObject3.put("userNick", (Object) liveDetailMessInfoGetSNSNick);
        jSONObject2.put("data", (Object) jSONObject3);
        jSONArray.add(jSONObject2);
        jSONObject.put("components", (Object) jSONArray);
        hashMap.put("data", jSONObject.toJSONString());
        if (rgd.b().a() != null) {
            rgd.b().a().tbLiveContainerManagerNotifyMsg("TBLiveWeex.Event.callInteractiveMessageComponent", hashMap);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        mmi mmiVar = this.messageChannel;
        if (mmiVar != null) {
            mmiVar.a();
            this.messageChannel = null;
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 10001) {
            procMessageCallback(message.obj);
        }
    }

    public void init(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34137d0", new Object[]{this, tBLiveDataModel});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel != null ? tBLiveDataModel.mVideoInfo : null;
        if (videoInfo != null && videoInfo.broadCaster != null && videoInfo.shopHasVip && !videoInfo.shopVip && videoInfo.followBroadCaster) {
            this.mHandler.postDelayed(this.mRunnable, 10000L);
        }
        this.messageChannel = new mmi(this.mContext, "member_auth_poplayer", new b());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
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
        init(tBLiveDataModel);
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

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            joinMemberFeedback();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onInstall(final BaseFrame baseFrame, ViewStub viewStub, ViewGroup viewGroup, final BaseFrame.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af54f52", new Object[]{this, baseFrame, viewStub, viewGroup, bVar});
            return;
        }
        Runnable kkiVar = new Runnable() { // from class: tb.kki
            @Override // java.lang.Runnable
            public final void run() {
                MemberGuideFrame2.this.lambda$onInstall$39(baseFrame, bVar);
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            kkiVar.run();
        } else {
            ADaemon.postMainLooper(kkiVar, new long[0]);
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
            init(this.mLiveDataModel);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        AtmosphereRealResponseData atmosphereRealResponseData;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof AtmosphereRealResponse) && (atmosphereRealResponseData = (AtmosphereRealResponseData) netBaseOutDo.getData()) != null) {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel != null) {
                videoInfo = tBLiveDataModel.mVideoInfo;
            } else {
                videoInfo = null;
            }
            if (videoInfo != null) {
                videoInfo.commentIcons = atmosphereRealResponseData.commentIcons;
            }
        }
        joinMemberFeedback();
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public MemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
