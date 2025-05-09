package com.taobao.android.live.plugin.atype.flexalocal.giftwish;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.b0d;
import tb.cpr;
import tb.e9m;
import tb.f4s;
import tb.fkx;
import tb.giv;
import tb.j96;
import tb.n9a;
import tb.nh4;
import tb.nwb;
import tb.o3s;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.w2s;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GiftWishFrame extends BaseFrame implements s3c, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECK_GIFT_VOTE_PM_DATA = 10001;
    private static final int GIFT_VOTE_PM_END = 10002;
    public static final String GIFT_WISH_TAG = "GiftWishFrame";
    private static final String REQUEST_SCENE_COMPENSATE = "compensate_request";
    private static final String REQUEST_SCENE_INIT = "init_request";
    private List<String> activityTypes;
    private String liveId;
    private boolean mEnableGiftBannerShowPriority;
    private boolean mEnableShowGiftGalleryBanner;
    private boolean mEnableShowGiftVoteBanner;
    private boolean mEnableShowGiftWishBanner;
    private boolean mEnableShowRightBanner;
    private boolean mGiftVoteFinishStatus;
    private int mGiftVoteLevel;
    private int mGiftWishLevel;
    private JSONObject mPreGiftGalleryObject;
    private JSONObject mPreGiftVoteObject;
    private JSONObject mPreGiftWishObject;
    private FrameLayout mRootView;
    private String mSecretUserId;
    private String mRequestScene = REQUEST_SCENE_INIT;
    private final b0d mNetworkListener = new b();
    private final cpr.b mMessageListener = new c();
    private final Handler mGiftActivityCheckHandler = new Handler(this);
    private final Handler mGiftActivityEndHandler = new Handler(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(GiftWishFrame giftWishFrame) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/giftwish/GiftWishFrame$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (2998 == i) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                o3s.b(GiftWishFrame.GIFT_WISH_TAG, "response, onError");
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            String jSONObject = netResponse.getDataJsonObject().toString();
            if (!TextUtils.isEmpty(jSONObject)) {
                try {
                    JSONObject d = fkx.d(jSONObject);
                    if (d != null) {
                        if (GiftWishFrame.access$000(GiftWishFrame.this)) {
                            GiftWishFrame.access$102(GiftWishFrame.this, d.getJSONObject("giftWish"));
                        }
                        if (GiftWishFrame.access$200(GiftWishFrame.this)) {
                            GiftWishFrame.access$302(GiftWishFrame.this, d.getJSONObject("giftVote"));
                        }
                        if (GiftWishFrame.access$400(GiftWishFrame.this)) {
                            GiftWishFrame.access$502(GiftWishFrame.this, d.getJSONObject("giftGallery"));
                        }
                        if (GiftWishFrame.REQUEST_SCENE_INIT.equals(GiftWishFrame.access$600(GiftWishFrame.this)) && d.getJSONObject("giftVote") != null && "1".equals(d.getJSONObject("giftVote").getString("activityStatus"))) {
                            o3s.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSuccess: giftVote is end|result=" + jSONObject);
                            GiftWishFrame.access$302(GiftWishFrame.this, null);
                        }
                        GiftWishFrame giftWishFrame = GiftWishFrame.this;
                        GiftWishFrame.access$800(giftWishFrame, GiftWishFrame.access$700(giftWishFrame));
                    }
                    o3s.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSuccess: " + jSONObject);
                } catch (Throwable th) {
                    o3s.b(GiftWishFrame.GIFT_WISH_TAG, "response, fail:msg=" + th);
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                o3s.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSystemError");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (2998 == i && GiftWishFrame.access$900(GiftWishFrame.this) && (obj instanceof String)) {
                String str = (String) obj;
                try {
                    JSONObject d = fkx.d(str);
                    if (d != null) {
                        String string = d.getString("activityType");
                        JSONObject jSONObject = d.getJSONObject(AgooConstants.MESSAGE_BODY);
                        if (jSONObject != null) {
                            if ("giftWish".equals(string) && GiftWishFrame.access$000(GiftWishFrame.this)) {
                                GiftWishFrame.access$102(GiftWishFrame.this, jSONObject);
                                GiftWishFrame giftWishFrame = GiftWishFrame.this;
                                GiftWishFrame.access$1000(giftWishFrame, GiftWishFrame.access$700(giftWishFrame));
                            }
                            if ("giftGallery".equals(string) && GiftWishFrame.access$400(GiftWishFrame.this)) {
                                GiftWishFrame.access$502(GiftWishFrame.this, jSONObject);
                                GiftWishFrame giftWishFrame2 = GiftWishFrame.this;
                                GiftWishFrame.access$1000(giftWishFrame2, GiftWishFrame.access$700(giftWishFrame2));
                            }
                            if ("giftVote".equals(string) && GiftWishFrame.access$200(GiftWishFrame.this)) {
                                GiftWishFrame.access$1100(GiftWishFrame.this, jSONObject);
                            }
                            o3s.b(GiftWishFrame.GIFT_WISH_TAG, "pm message, onSuccess: " + str);
                        }
                    }
                } catch (Throwable th) {
                    o3s.b(GiftWishFrame.GIFT_WISH_TAG, "pm message, fail:msg=" + th);
                }
            }
        }
    }

    static {
        t2o.a(295698832);
        t2o.a(806355016);
    }

    public GiftWishFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ boolean access$000(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c524e0", new Object[]{giftWishFrame})).booleanValue();
        }
        return giftWishFrame.mEnableShowGiftWishBanner;
    }

    public static /* synthetic */ void access$1000(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e28d45", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.renderGiftWishDxView(jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$102(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e7c1dd1", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftWishObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void access$1100(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61eeb724", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.checkGiftVoteDataValid(jSONObject);
        }
    }

    public static /* synthetic */ boolean access$200(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d416e962", new Object[]{giftWishFrame})).booleanValue();
        }
        return giftWishFrame.mEnableShowGiftVoteBanner;
    }

    public static /* synthetic */ JSONObject access$302(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92a5f98f", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftVoteObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean access$400(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e268ade4", new Object[]{giftWishFrame})).booleanValue();
        }
        return giftWishFrame.mEnableShowGiftGalleryBanner;
    }

    public static /* synthetic */ JSONObject access$502(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6cfd54d", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftGalleryObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String access$600(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da4a527e", new Object[]{giftWishFrame});
        }
        return giftWishFrame.mRequestScene;
    }

    public static /* synthetic */ JSONObject access$700(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e2eb3c3", new Object[]{giftWishFrame});
        }
        return giftWishFrame.mergeGiftActivityDataAndBuildDxView();
    }

    public static /* synthetic */ void access$800(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cb708c", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.buildDxView(jSONObject);
        }
    }

    public static /* synthetic */ boolean access$900(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6351929", new Object[]{giftWishFrame})).booleanValue();
        }
        return giftWishFrame.mEnableShowRightBanner;
    }

    private void initGiftWishMessageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dc9721", new Object[]{this});
        } else {
            this.mFrameContext.t().l(this.mMessageListener, new a(this));
        }
    }

    public static /* synthetic */ Object ipc$super(GiftWishFrame giftWishFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/giftwish/GiftWishFrame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildDxView$12(JSONObject jSONObject, nwb nwbVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83242604", new Object[]{this, jSONObject, nwbVar, dXRootView});
        } else {
            renderGiftWishDxView(dXRootView, jSONObject, nwbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$13() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c78cef", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mPreGiftVoteObject;
        if (jSONObject != null && "0".equals(jSONObject.getString("activityStatus"))) {
            try {
                renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
            } catch (Throwable th) {
                o3s.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView error|msg=" + th.getMessage());
            }
        }
    }

    private JSONObject mergeGiftActivityDataAndBuildDxView() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b7b598", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        if (this.mGiftVoteLevel > this.mGiftWishLevel || (jSONObject2 = this.mPreGiftWishObject) == null || "-1".equals(jSONObject2.getString("activityStatus")) || !this.mEnableGiftBannerShowPriority) {
            buildGiftProgressJsonArray(this.mPreGiftVoteObject, jSONArray);
        }
        if (this.mGiftWishLevel > this.mGiftVoteLevel || (jSONObject = this.mPreGiftVoteObject) == null || "-1".equals(jSONObject.getString("activityStatus")) || !this.mEnableGiftBannerShowPriority) {
            buildGiftProgressJsonArray(this.mPreGiftWishObject, jSONArray);
            JSONObject jSONObject4 = this.mPreGiftWishObject;
            if (jSONObject4 != null) {
                for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!j96.KEY_BANNER_CARD_LIST.equals(key) && value != null) {
                        jSONObject3.put(key, value);
                    }
                }
            }
            JSONObject jSONObject5 = this.mPreGiftGalleryObject;
            if (jSONObject5 != null && this.mEnableShowGiftGalleryBanner) {
                buildGiftProgressJsonArray(jSONObject5, jSONArray);
            }
        }
        jSONObject3.put(j96.KEY_BANNER_CARD_LIST, (Object) jSONArray);
        return jSONObject3;
    }

    private void queryGiftWishData() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc874f30", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.liveId) && (list = this.activityTypes) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.activityTypes) {
                if ("giftWish".equals(str) || "giftVote".equals(str) || "giftGallery".equals(str)) {
                    arrayList.add(str);
                }
            }
            new n9a(this.mNetworkListener).K(this.liveId, arrayList);
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.mGiftActivityCheckHandler.removeMessages(10001);
        this.mGiftActivityEndHandler.removeMessages(10002);
        this.mPreGiftVoteObject = null;
        this.mPreGiftWishObject = null;
        this.mGiftVoteFinishStatus = false;
        sjr.g().b(this);
        this.mFrameContext.t().a(this.mMessageListener);
    }

    private void renderGiftWishDxView(DXRootView dXRootView, JSONObject jSONObject, nwb nwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41a6397", new Object[]{this, dXRootView, jSONObject, nwbVar});
        } else if (dXRootView == null) {
            o3s.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView: rankEntranceView is null!");
        } else if (this.mRootView == null) {
            o3s.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView: mRootView is null!");
        } else {
            Context context = this.mContext;
            if (context != null) {
                jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.SMALL));
            }
            this.mRootView.removeAllViews();
            nwbVar.renderDX(dXRootView, jSONObject);
            this.mRootView.addView(dXRootView);
            this.mRootView.setPadding(0, 0, w2s.c(this.mContext, 7.0f), w2s.c(this.mContext, 8.0f));
            sjr.g().c(uyg.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, null, this.mFrameContext.C());
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return GIFT_WISH_TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_gift_wish_banner_dx_flexalocal;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 10001) {
            JSONObject jSONObject2 = this.mPreGiftVoteObject;
            if (jSONObject2 != null && "0".equals(jSONObject2.getString("activityStatus"))) {
                this.mRequestScene = REQUEST_SCENE_COMPENSATE;
                queryGiftWishData();
            }
        } else if (i == 10002 && ((jSONObject = this.mPreGiftVoteObject) == null || !"0".equals(jSONObject.getString("activityStatus")))) {
            this.mPreGiftVoteObject = null;
            this.mGiftVoteFinishStatus = true;
            try {
                buildDxView(mergeGiftActivityDataAndBuildDxView());
            } catch (Throwable th) {
                o3s.b(GIFT_WISH_TAG, "GIFT_VOTE_PM_END error|msg=" + th.getMessage());
            }
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{j96.EVENT_GIFT_VOTE_REFRESH_DX};
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
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            this.liveId = videoInfo.liveId;
            this.mSecretUserId = videoInfo.secretUserId;
            this.mEnableShowRightBanner = nh4.H0();
            this.mEnableShowGiftWishBanner = nh4.F0();
            this.mEnableShowGiftVoteBanner = nh4.E0();
            this.mEnableShowGiftGalleryBanner = nh4.s1();
            this.mEnableGiftBannerShowPriority = nh4.O();
            JSONObject parseObject = JSON.parseObject(nh4.Y0());
            if (parseObject != null) {
                this.mGiftWishLevel = parseObject.getIntValue("giftWish");
                this.mGiftVoteLevel = parseObject.getIntValue("giftVote");
            }
            if (!TextUtils.isEmpty(this.liveId) && (list = tBLiveDataModel.mVideoInfo.activityTypes) != null && !list.isEmpty() && this.mEnableShowRightBanner) {
                this.activityTypes = tBLiveDataModel.mVideoInfo.activityTypes;
                this.mRequestScene = REQUEST_SCENE_INIT;
                queryGiftWishData();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        release();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (j96.EVENT_GIFT_VOTE_REFRESH_DX.equals(str) && (obj instanceof JSONObject) && (frameLayout = this.mRootView) != null) {
            frameLayout.postDelayed(new Runnable() { // from class: tb.j9a
                @Override // java.lang.Runnable
                public final void run() {
                    GiftWishFrame.this.lambda$onEvent$13();
                }
            }, 1000L);
            Handler handler = this.mGiftActivityCheckHandler;
            if (handler != null) {
                handler.removeMessages(10001);
                this.mGiftActivityCheckHandler.sendEmptyMessageDelayed(10001, 2000L);
            }
            Handler handler2 = this.mGiftActivityEndHandler;
            if (handler2 != null) {
                handler2.removeMessages(10002);
                this.mGiftActivityEndHandler.sendEmptyMessageDelayed(10002, 10000L);
            }
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
            sjr.g().a(this);
            initGiftWishMessageEvent();
            FrameLayout frameLayout = this.mRootView;
            if (frameLayout != null && frameLayout.getVisibility() == 8) {
                this.mRootView.setVisibility(0);
            }
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
        if (view instanceof FrameLayout) {
            this.mRootView = (FrameLayout) view;
        }
        FlexaLiveX.w("GiftWishFrame: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }

    private void buildDxView(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45644e42", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(j96.KEY_BANNER_CARD_LIST);
        if (jSONArray == null || jSONArray.isEmpty()) {
            FrameLayout frameLayout = this.mRootView;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            o3s.b(GIFT_WISH_TAG, "onEvent: renderDX error: bannerCardList is empty!");
            return;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        if (jSONObject2 == null) {
            o3s.b(GIFT_WISH_TAG, "onEvent: renderDX error: giftActivityBannerObj is null!");
            return;
        }
        String string = jSONObject2.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        if (TextUtils.isEmpty(string)) {
            o3s.b(GIFT_WISH_TAG, "onEvent: templateName is null!");
            return;
        }
        o3s.b(GIFT_WISH_TAG, "onEvent: renderDX" + jSONObject);
        final nwb b2 = giv.b();
        if (b2 == null) {
            o3s.b(GIFT_WISH_TAG, "onEvent: dxRenderEngine is null!");
        } else {
            b2.a(this.mContext, string, new nwb.a() { // from class: tb.l9a
                @Override // tb.nwb.a
                public final void a(DXRootView dXRootView) {
                    GiftWishFrame.this.lambda$buildDxView$12(jSONObject, b2, dXRootView);
                }
            });
        }
    }

    private void buildGiftProgressJsonArray(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a80eab", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONObject == null || jSONArray == null) {
            o3s.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftActivityItemObj is null or giftProgressJsonArray is null");
        } else {
            String string = jSONObject.getString("activityStatus");
            String string2 = jSONObject.getString("activityType");
            if ("-1".equals(string)) {
                o3s.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftActivityStatus result is break");
                return;
            }
            long longValue = jSONObject.getLongValue("endTime");
            if (!"giftVote".equals(string2) || !"1".equals(string) || f4s.a() - longValue <= 10000) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(j96.KEY_BANNER_CARD_LIST);
                if (!(jSONArray2 == null || jSONArray2.isEmpty())) {
                    for (int i = 0; i < jSONArray2.size(); i++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                        if (jSONObject2 != null) {
                            if (TextUtils.isEmpty(jSONObject2.getString("secretUserId")) || !jSONObject2.getString("secretUserId").equals(this.mSecretUserId)) {
                                jSONObject2.put("showBoostValue", (Object) Boolean.FALSE);
                            } else {
                                jSONObject2.put("showBoostValue", (Object) Boolean.TRUE);
                            }
                            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (!j96.KEY_BANNER_CARD_LIST.equals(key) && value != null) {
                                    jSONObject2.put(key, value);
                                }
                            }
                        }
                    }
                    jSONArray.addAll(jSONArray2);
                    return;
                }
                return;
            }
            o3s.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftVote giftActivityStatus is end and activityTime exceed 10s");
        }
    }

    private void checkGiftVoteDataValid(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa8c219", new Object[]{this, jSONObject});
        } else if (jSONObject != null && TextUtils.equals("1", jSONObject.getString("activityStatus")) && this.mGiftVoteFinishStatus) {
            o3s.b(GIFT_WISH_TAG, "checkGiftVoteDataValid giftVote activityStatus is end");
        } else if (jSONObject == null || this.mPreGiftVoteObject == null || !TextUtils.equals(jSONObject.getString("activityId"), this.mPreGiftVoteObject.getString("activityId")) || !TextUtils.equals(this.mPreGiftVoteObject.getString("activityStatus"), "0") || !TextUtils.equals(jSONObject.getString("activityStatus"), "1")) {
            if (jSONObject != null && TextUtils.equals("0", jSONObject.getString("activityStatus"))) {
                this.mGiftVoteFinishStatus = false;
            }
            if (jSONObject == null || this.mPreGiftVoteObject == null || TextUtils.equals(jSONObject.getString("activityId"), this.mPreGiftVoteObject.getString("activityId"))) {
                if (!(jSONObject == null || this.mPreGiftVoteObject == null || jSONObject.getJSONArray("groupProgressList") == null || this.mPreGiftVoteObject.getJSONArray("groupProgressList") == null || jSONObject.getJSONArray("groupProgressList").size() <= 1 || this.mPreGiftVoteObject.getJSONArray("groupProgressList").size() <= 1)) {
                    JSONArray jSONArray = jSONObject.getJSONArray("groupProgressList");
                    JSONArray jSONArray2 = this.mPreGiftVoteObject.getJSONArray("groupProgressList");
                    if (checkGiftVoteProgressValid(jSONArray.getJSONObject(0), jSONArray2.getJSONObject(0)) || checkGiftVoteProgressValid(jSONArray.getJSONObject(1), jSONArray2.getJSONObject(1))) {
                        o3s.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote progress is invalid");
                        return;
                    }
                }
                this.mPreGiftVoteObject = jSONObject;
                renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
                return;
            }
            this.mGiftVoteFinishStatus = false;
            this.mPreGiftVoteObject = jSONObject;
            buildDxView(mergeGiftActivityDataAndBuildDxView());
            o3s.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote activityId is new");
        } else {
            Handler handler = this.mGiftActivityEndHandler;
            if (handler != null) {
                handler.removeMessages(10001);
                this.mGiftActivityEndHandler.removeMessages(10002);
                this.mGiftActivityEndHandler.sendEmptyMessageDelayed(10002, 10000L);
            }
            this.mPreGiftVoteObject = jSONObject;
            renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
            o3s.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote activityStatus change end");
        }
    }

    private boolean checkGiftVoteProgressValid(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e9b698", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        return (jSONObject == null || jSONObject2 == null || jSONObject.getIntValue("progress") >= jSONObject2.getIntValue("progress")) ? false : true;
    }

    private void renderGiftWishDxView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0597da3", new Object[]{this, jSONObject});
            return;
        }
        nwb b2 = giv.b();
        if (b2 == null) {
            o3s.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView: dxRenderEngine is null!");
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        DXRootView dXRootView = (frameLayout == null || frameLayout.getChildAt(0) == null || !(this.mRootView.getChildAt(0) instanceof DXRootView)) ? null : (DXRootView) this.mRootView.getChildAt(0);
        if (dXRootView == null) {
            buildDxView(jSONObject);
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.SMALL));
        }
        b2.renderDX(dXRootView, jSONObject);
    }
}
