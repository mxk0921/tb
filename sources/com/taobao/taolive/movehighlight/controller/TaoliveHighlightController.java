package com.taobao.taolive.movehighlight.controller;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;
import tb.air;
import tb.bl9;
import tb.bxa;
import tb.bxl;
import tb.by9;
import tb.cba;
import tb.ccc;
import tb.cdr;
import tb.cqk;
import tb.cv1;
import tb.cxa;
import tb.cxg;
import tb.d4s;
import tb.d9m;
import tb.dxa;
import tb.f7a;
import tb.fhf;
import tb.fkx;
import tb.fxa;
import tb.gif;
import tb.gq0;
import tb.gxa;
import tb.iba;
import tb.igq;
import tb.iw0;
import tb.iz1;
import tb.jyw;
import tb.k0e;
import tb.l6t;
import tb.lmg;
import tb.m6t;
import tb.ms0;
import tb.mxa;
import tb.ncc;
import tb.nwa;
import tb.o1j;
import tb.pgf;
import tb.pvs;
import tb.q0k;
import tb.qk8;
import tb.qvs;
import tb.sj9;
import tb.t2o;
import tb.t54;
import tb.ubt;
import tb.up6;
import tb.uwa;
import tb.ux9;
import tb.v2s;
import tb.vx9;
import tb.wwa;
import tb.x5t;
import tb.y2h;
import tb.yj4;
import tb.z6m;
import tb.z9u;
import tb.zyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoliveHighlightController extends BaseFrame implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TaoliveHighlightController.class.getSimpleName();
    private ms0 alimamaQZTManager;
    private qk8 eventLiveListener;
    private fxa highlightPlayInfo;
    private AliUrlImageView mBackgroundImage;
    private iz1 mBasePreloadRequest;
    private String mCoverImage;
    private ux9 mFrameContext;
    private jyw mHandler;
    private boolean mHideUI;
    private String mHighlightUrl;
    private String mId;
    private boolean mLandscapeVideo;
    private String mLiveSource;
    private JSONObject mMediaInfo;
    private bxl mPerfomenceTrackManager;
    private ViewGroup mRoomLayout;
    private String mSjsdItemId;
    private IInteractiveProxy.h mTBLiveInteractiveManager;
    private o1j mTaoliveShowByStatus;
    private String mTimeMovingItemId;
    private String mTrackId;
    private String mUserId;
    private k0e mVideoFrame;
    private boolean mFirstFrameRendered = false;
    private boolean mEnterRequest = true;
    private String mToken = "";
    private final l6t mPMController = new l6t();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements f7a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cv1 f13080a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.movehighlight.controller.TaoliveHighlightController$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0749a implements ISmartLandingProxy.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cqk f13081a;

            public C0749a(cqk cqkVar) {
                this.f13081a = cqkVar;
            }

            @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
            public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
                }
                String access$000 = TaoliveHighlightController.access$000();
                StringBuilder sb = new StringBuilder("getComponentList onTaskActionListener popId ");
                sb.append(str2);
                sb.append(" actionData ");
                sb.append(jSONObject);
                sb.append(" benefitAliveList ");
                sb.append(jSONArray);
                sb.append(" ");
                sb.append(jSONObject2 != null ? Integer.valueOf(jSONObject2.size()) : null);
                x5t.d(access$000, sb.toString());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("benefitAliveList", (Object) jSONArray);
                jSONObject3.put("smartLandingActionData", (Object) jSONObject);
                jSONObject3.put("componentListData", (Object) jSONObject2);
                if (a.this.f13080a.u != null) {
                    jSONObject3.put("enableSmartlanding", (Object) Boolean.TRUE);
                    JSONObject a2 = a.this.f13080a.u.a();
                    if (a2 != null && "dx_smart".equals(a2.getString("actionType"))) {
                        jSONObject3.put("smartLayerActionData", (Object) a2);
                    }
                }
                this.f13081a.R1(jSONObject3);
                return true;
            }
        }

        public a(TaoliveHighlightController taoliveHighlightController, cv1 cv1Var) {
            this.f13080a = cv1Var;
        }

        @Override // tb.f7a
        public void a(cqk cqkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b741b85", new Object[]{this, cqkVar});
            } else {
                this.f13080a.u.j(true, "targetAlive", new C0749a(cqkVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(Object obj);
    }

    static {
        t2o.a(779092617);
        t2o.a(806356161);
    }

    public TaoliveHighlightController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
        this.mFrameContext = ux9Var;
        bindData(tBLiveDataModel);
        dxa.b(this.mFrameContext).s(new bxa());
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ ux9 access$100(TaoliveHighlightController taoliveHighlightController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("fad9ad0c", new Object[]{taoliveHighlightController});
        }
        return taoliveHighlightController.mFrameContext;
    }

    private void initFrameInstaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365bb4d2", new Object[]{this});
            return;
        }
        by9 by9Var = new by9(this.mContext, sj9.s(), false);
        by9Var.start();
        by9Var.i(new lmg(this.mContext, this.mLiveDataModel, this.mFrameContext));
        by9Var.a(new q0k(this.mContext, this.mFrameContext));
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.U(by9Var);
        }
    }

    private void initRoomScreenManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afa86dd", new Object[]{this});
            return;
        }
        if (this.mTaoliveShowByStatus == null) {
            o1j k = new o1j.c().l(isLandscape()).n(this.mContext).o(this.mHandler).p(this.mHideUI).q(this.mLiveDataModel).r(this).s(this.mPerfomenceTrackManager).t(this.mRoomLayout).u(this.mVideoFrame).m(this.mBackgroundImage).k();
            this.mTaoliveShowByStatus = k;
            k.d();
        }
        o1j o1jVar = this.mTaoliveShowByStatus;
        if (o1jVar != null) {
            o1jVar.g(this.mHideUI);
            this.mLandscape = this.mLiveDataModel.mVideoInfo.landScape;
            this.mTaoliveShowByStatus.f(isLandscape());
            this.mTaoliveShowByStatus.h(this.mLiveDataModel);
        }
    }

    public static /* synthetic */ Object ipc$super(TaoliveHighlightController taoliveHighlightController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/controller/TaoliveHighlightController");
        }
    }

    private boolean isActivityDestroy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("724cd64", new Object[]{this, context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    private void redirRoom(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1721cf5", new Object[]{this, tBLiveDataModel});
        } else if (!gq0.q(this.mContext, tBLiveDataModel.mVideoInfo)) {
            showByStatus(tBLiveDataModel);
            igq.n().p("lockScroll", "redirRoom:lockScroll:false");
        } else if (dxa.b(this.mFrameContext).f() != null) {
            dxa.b(this.mFrameContext).f().d(this.mFrameContext, null);
        }
    }

    private void subscribePM(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcc13c7", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && "1".equals(videoInfo.roomStatus)) {
            if (d4s.e("enableHighLightPmWatchID", true)) {
                up6.Y0(cxg.c(tBLiveDataModel.mVideoInfo), this.mFrameContext);
            }
            VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
            String str = videoInfo2.channel;
            boolean equals = "1".equals(videoInfo2.roomStatus);
            VideoInfo videoInfo3 = tBLiveDataModel.mVideoInfo;
            m6t m6tVar = new m6t(str, equals, videoInfo3.topic, videoInfo3.liveId, new b(tBLiveDataModel));
            m6tVar.u(this.mFrameContext.n());
            m6tVar.q(pvs.j0());
            this.mPMController.y(m6tVar);
        }
    }

    private void unSubscribePM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc09f5", new Object[]{this});
            return;
        }
        if (d4s.e("enableHighLightPmWatchID", true)) {
            up6.Y0("", this.mFrameContext);
        }
        this.mPMController.B();
    }

    private void updateParams(VideoInfo videoInfo) {
        TBTVProgramInfo tBTVProgramInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b197f57", new Object[]{this, videoInfo});
        } else if (videoInfo != null) {
            this.mId = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                this.mUserId = accountInfo.accountId;
            }
            this.mLandscapeVideo = videoInfo.landScape;
            if (up6.x0(this.mFrameContext) && (tBTVProgramInfo = videoInfo.tbtvLiveDO) != null) {
                videoInfo.landScape = tBTVProgramInfo.landScape;
                videoInfo.millionBaby = tBTVProgramInfo.millionBaby;
            }
        }
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        o1j o1jVar = this.mTaoliveShowByStatus;
        if (o1jVar == null || !(o1jVar.c() instanceof FullScreenFrame)) {
            return null;
        }
        return ((FullScreenFrame) this.mTaoliveShowByStatus.c()).getUbeeContainer();
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public void initFrameLayout(k0e k0eVar, ViewGroup viewGroup, AliUrlImageView aliUrlImageView, bxl bxlVar, fxa fxaVar, iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146028e9", new Object[]{this, k0eVar, viewGroup, aliUrlImageView, bxlVar, fxaVar, iz1Var});
            return;
        }
        viewGroup.removeAllViews();
        this.mVideoFrame = k0eVar;
        this.mRoomLayout = viewGroup;
        this.mBackgroundImage = aliUrlImageView;
        this.mPerfomenceTrackManager = bxlVar;
        this.highlightPlayInfo = fxaVar;
        this.mHandler = new jyw(this);
        this.eventLiveListener = new qk8(this.mLiveDataModel, this.mLandscape, this.mContext, this.mFrameContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        bindData(tBLiveDataModel);
        super.onBindData(tBLiveDataModel);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        ms0 ms0Var;
        qk8 qk8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (uwa.B() && (qk8Var = this.eventLiveListener) != null) {
            qk8Var.a();
            this.eventLiveListener = null;
        }
        if (qvs.k() && (ms0Var = this.alimamaQZTManager) != null) {
            ms0Var.e();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
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
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        o1j o1jVar = this.mTaoliveShowByStatus;
        if (o1jVar != null) {
            o1jVar.l(this.mFrameContext);
        }
        qk8 qk8Var = this.eventLiveListener;
        if (qk8Var != null) {
            qk8Var.a();
            this.eventLiveListener = null;
        }
        IInteractiveProxy.h hVar = this.mTBLiveInteractiveManager;
        if (hVar != null) {
            hVar.destroy();
            this.mTBLiveInteractiveManager = null;
        }
        if (uwa.d()) {
            dxa.b(this.mFrameContext).a();
        }
        cxa.c = false;
        unSubscribePM();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        if (bl9.g().b() && d9m.e().getBackwardX() != null) {
            d9m.e().getBackwardX().b(this.mLiveDataModel, vx9.f(this.mFrameContext));
        }
        super.onDidDisappear();
        cxa.c = false;
        k0e k0eVar = this.mVideoFrame;
        if (k0eVar != null) {
            k0eVar.K(false);
        }
        if (uwa.C() && (viewGroup = this.mRoomLayout) != null) {
            viewGroup.setVisibility(8);
        }
        unSubscribePM();
    }

    public void setmBasePreloadRequest(iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5429d09b", new Object[]{this, iz1Var});
        }
    }

    public void updateHighlightPlayInfo(fxa fxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9332f96", new Object[]{this, fxaVar});
        } else {
            this.highlightPlayInfo = fxaVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ncc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveDataModel f13082a;

        public b(TBLiveDataModel tBLiveDataModel) {
            this.f13082a = tBLiveDataModel;
        }

        @Override // tb.ncc
        public Map<String, String> getHeartParams() {
            String str;
            AccountInfo accountInfo;
            JSONObject jSONObject;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            if ((TaoliveHighlightController.access$100(TaoliveHighlightController.this).j() instanceof cba) && !TextUtils.isEmpty(((cba) TaoliveHighlightController.access$100(TaoliveHighlightController.this).j()).Y())) {
                hashMap.put(yj4.PARAM_PM_PARAMS, ((cba) TaoliveHighlightController.access$100(TaoliveHighlightController.this).j()).Y());
            }
            Map<String, String> map = this.f13082a.mInitParams;
            if (map != null && !TextUtils.isEmpty(map.get(yj4.PARAM_IGNORE_PV))) {
                hashMap.put(yj4.PARAM_IGNORE_PV, this.f13082a.mInitParams.get(yj4.PARAM_IGNORE_PV));
            }
            VideoInfo videoInfo = this.f13082a.mVideoInfo;
            if (!(videoInfo == null || (jSONObject = videoInfo.pmContext) == null)) {
                hashMap.put("pmContext", jSONObject.toJSONString());
            }
            VideoInfo videoInfo2 = this.f13082a.mVideoInfo;
            if (!(videoInfo2 == null || (accountInfo = videoInfo2.broadCaster) == null)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
                hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(this.f13082a.mVideoInfo.status));
                hashMap.put("feed_id", this.f13082a.mVideoInfo.liveId);
                hashMap.put("liveServerParams", this.f13082a.mVideoInfo.trackInfo);
                hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(this.f13082a.mVideoInfo.roomType));
                hashMap.put("newRoomType", String.valueOf(this.f13082a.mVideoInfo.newRoomType));
                hashMap.put("roomStatus", this.f13082a.mVideoInfo.roomStatus);
                hashMap.put("streamStatus", this.f13082a.mVideoInfo.streamStatus);
                if (this.f13082a.mVideoInfo.isOfficialType()) {
                    hashMap.put("officialLiveId", this.f13082a.mVideoInfo.officialLiveInfo.officialLiveId);
                    hashMap.put("officialAccountId", this.f13082a.mVideoInfo.officialLiveInfo.accountId);
                }
            }
            if (TaoliveHighlightController.access$100(TaoliveHighlightController.this) != null) {
                hashMap.put("liveToken", TaoliveHighlightController.access$100(TaoliveHighlightController.this).p());
            }
            if (TaoliveHighlightController.access$100(TaoliveHighlightController.this) != null) {
                hashMap.put("pmSession", TaoliveHighlightController.access$100(TaoliveHighlightController.this).p());
            }
            String a0 = up6.a0(TaoliveHighlightController.access$100(TaoliveHighlightController.this));
            if (!"tpp_88".equals(iba.B(vx9.f(TaoliveHighlightController.access$100(TaoliveHighlightController.this)))) || TextUtils.isEmpty(up6.z(TaoliveHighlightController.access$100(TaoliveHighlightController.this)))) {
                hashMap.put("trackInfo", a0);
            } else {
                JSONObject d = fkx.d(Uri.decode(up6.z(TaoliveHighlightController.access$100(TaoliveHighlightController.this))));
                if (d == null || d.getString("trackInfo") == null) {
                    hashMap.put("trackInfo", a0);
                } else {
                    hashMap.put("trackInfo", d.getString("trackInfo"));
                }
            }
            hashMap.put("clickid", up6.i(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            hashMap.put("livesource", iba.B(vx9.f(TaoliveHighlightController.access$100(TaoliveHighlightController.this))));
            hashMap.put("entry_source", up6.r(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            if ((!hashMap.containsKey("spm-url") || TextUtils.isEmpty((CharSequence) hashMap.get("spm-url"))) && (TaoliveHighlightController.access$100(TaoliveHighlightController.this) instanceof air)) {
                hashMap.put("spm-url", up6.U(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            }
            hashMap.put("isAD", String.valueOf(up6.j0(TaoliveHighlightController.access$100(TaoliveHighlightController.this)) ? 1 : 0));
            hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(up6.I(TaoliveHighlightController.access$100(TaoliveHighlightController.this))));
            if (up6.d(TaoliveHighlightController.access$100(TaoliveHighlightController.this)) != null) {
                i = 1;
            }
            hashMap.put("isAdTransParams", String.valueOf(i));
            hashMap.put("isChatRoom", String.valueOf(up6.o0(this.f13082a, TaoliveHighlightController.access$100(TaoliveHighlightController.this)) ? 1 : 0));
            if (!TextUtils.isEmpty(this.f13082a.mVideoInfo.timeMovingPlayUrl)) {
                str = "smartpoint";
            } else {
                str = "default";
            }
            hashMap.put("scene", str);
            hashMap.put("kandianid", up6.p(TaoliveHighlightController.access$100(TaoliveHighlightController.this)) + "_" + up6.H(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            hashMap.put("watchid", up6.g0(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            if (TaoliveHighlightController.access$100(TaoliveHighlightController.this) instanceof air) {
                hashMap.put(yj4.PARAM_PVID, up6.P(TaoliveHighlightController.access$100(TaoliveHighlightController.this)));
            }
            return hashMap;
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
        if (this.eventLiveListener == null) {
            this.eventLiveListener = new qk8(this.mLiveDataModel, this.mLandscape, this.mContext, this.mFrameContext);
        }
        TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && i == 1) {
            igq.n().p(TAG, "STATUS_INIT_SUCCESS");
            Map<String, String> map = tBLiveDataModel.mInitParams;
            if (map != null) {
                iba.j1(map.get("spm"), vx9.f(this.mFrameContext));
                iba.p1(tBLiveDataModel.mInitParams.get("trackInfo"), vx9.f(this.mFrameContext));
                iba.V0(tBLiveDataModel.mInitParams.get(yj4.PARAM_TRACK_LIVEOPRT_ID), vx9.f(this.mFrameContext));
            }
            if (bl9.g().b() && d9m.e().getBackwardX() != null) {
                d9m.e().getBackwardX().c(this.mLiveDataModel, vx9.f(this.mFrameContext), this.mFrameContext);
            }
            v2s.o().A().a("vanda", "STATUS_INIT_SUCCESS info = " + obj);
            bxl bxlVar = this.mPerfomenceTrackManager;
            if (bxlVar != null) {
                bxlVar.i(this.mTrackId);
            }
            System.currentTimeMillis();
            bxl bxlVar2 = this.mPerfomenceTrackManager;
            if (bxlVar2 != null) {
                bxlVar2.B(this.mTrackId);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            AccountInfo accountInfo = tBLiveDataModel.mVideoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
            }
            Context context = this.mContext;
            if ((context instanceof Activity) && ((Activity) context).getIntent() != null) {
                hashMap.put(yj4.PARAM_MEDIA_INFO_LIVEURL, ((Activity) this.mContext).getIntent().getDataString());
            }
            hashMap.put("livesource", iba.B(vx9.f(this.mFrameContext)));
            hashMap.put("live_id", tBLiveDataModel.mVideoInfo.liveId);
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(tBLiveDataModel.mVideoInfo.roomType));
            hashMap.put("newRoomType", String.valueOf(tBLiveDataModel.mVideoInfo.newRoomType));
            hashMap.put("isLandScape", String.valueOf(up6.v0(this.mFrameContext)));
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                ux9Var.X(true);
                if (this.mFrameContext.j() != null) {
                    this.mFrameContext.j().F(this.mFrameContext.j().h());
                    this.mFrameContext.j().D(yj4.LIVE_TYPE_KANDIAN);
                }
            }
            if (this.mTBLiveInteractiveManager == null) {
                this.mTBLiveInteractiveManager = d9m.p().createInteractiveManager(this.mContext, this.mFrameContext, this.mCreateViewTime);
            }
            sj9.a(this.mFrameContext);
            cv1 f = vx9.f(this.mFrameContext);
            this.mTBLiveInteractiveManager.l(this.mLiveDataModel.mVideoInfo, up6.r(this.mFrameContext), this.mLiveSource, hashMap, (f == null || f.u == null) ? null : new a(this, f));
            this.mTBLiveInteractiveManager.e(new gif(this.mFrameContext));
            this.mTBLiveInteractiveManager.A(new pgf(this.mFrameContext, this));
            this.mTBLiveInteractiveManager.a(new fhf());
            this.mTBLiveInteractiveManager.r(new y2h(this.mContext, this.mFrameContext));
            this.mTBLiveInteractiveManager.h(new zyg(this.mContext, this.mFrameContext, this.mLiveDataModel));
            ((t54) this.mFrameContext).F0(this.mTBLiveInteractiveManager);
            if (qvs.k()) {
                if (this.alimamaQZTManager == null) {
                    this.alimamaQZTManager = new ms0(this.mFrameContext);
                }
                this.alimamaQZTManager.d();
            }
            redirRoom(this.mLiveDataModel);
            subscribePM(tBLiveDataModel);
            mxa.c("", this.mFrameContext, "timeMovingItemId=" + this.mTimeMovingItemId, "sjsdItemId=" + this.mSjsdItemId);
        }
    }

    private void bindData(TBLiveDataModel tBLiveDataModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0bc887", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null) {
            String str = tBLiveDataModel.mInitParams.get(yj4.PARAM_HIDE_UI);
            this.mHideUI = !TextUtils.isEmpty(str) && Boolean.parseBoolean(str);
            String str2 = tBLiveDataModel.mInitParams.get(yj4.PARAM_SJSD_ITEM_ID);
            this.mSjsdItemId = str2;
            iba.h1(str2, vx9.f(this.mFrameContext));
            this.mTimeMovingItemId = tBLiveDataModel.mInitParams.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
            String str3 = tBLiveDataModel.mInitParams.get(yj4.PARAM_LANDSCAPE_VIDEO);
            if (TextUtils.isEmpty(str3) || !Boolean.parseBoolean(str3)) {
                z = false;
            }
            this.mLandscapeVideo = z;
            this.mToken = tBLiveDataModel.mInitParams.get(yj4.PARAM_PLAYER_TOKEN);
            this.mLiveSource = tBLiveDataModel.mInitParams.get("livesource");
            this.mMediaInfo = null;
            try {
                String str4 = tBLiveDataModel.mInitParams.get(yj4.PARAM_CUSTOM_PLAY_CTRL);
                if (!TextUtils.isEmpty(str4)) {
                    this.mMediaInfo = fkx.d(str4);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void showByStatus(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        String str;
        String str2;
        String str3;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo2;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4349f686", new Object[]{this, tBLiveDataModel});
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            iba.u1(iw0.a(context, 78.0f), vx9.f(this.mFrameContext));
            if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
                if (this.mEnterRequest) {
                    this.mEnterRequest = false;
                    iba.m0(videoInfo.liveId, vx9.f(this.mFrameContext));
                }
                fxa fxaVar = this.highlightPlayInfo;
                String str4 = (fxaVar == null || TextUtils.isEmpty(fxaVar.c)) ? null : this.highlightPlayInfo.c;
                if (uwa.g()) {
                    if (TextUtils.isEmpty(str4) && (timeMovingPlayInfo3 = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo) != null && !TextUtils.isEmpty(timeMovingPlayInfo3.keyPointId)) {
                        str4 = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.keyPointId;
                    }
                    if (TextUtils.isEmpty(this.mSjsdItemId) && (timeMovingPlayInfo2 = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo) != null && !TextUtils.isEmpty(timeMovingPlayInfo2.sjsdItemId)) {
                        this.mSjsdItemId = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.sjsdItemId;
                    }
                }
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null) {
                    ux9Var.f = uwa.H() && (timeMovingPlayInfo = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo) != null && "2".equals(timeMovingPlayInfo.timeMovingUIVersion);
                    Map<String, String> map = tBLiveDataModel.mInitParams;
                    if (map != null) {
                        str3 = map.get(yj4.PARAM_TIMEMOVE_SINGLE_CARD);
                    } else {
                        str3 = "false";
                    }
                    ux9 ux9Var2 = this.mFrameContext;
                    if (!uwa.v(this.mLiveSource) && !"true".equals(str3)) {
                        z = false;
                    }
                    ux9Var2.g = z;
                    if (this.mFrameContext.l() instanceof wwa) {
                        ((wwa) this.mFrameContext.l()).e = this.mFrameContext.g ? 1 : 0;
                    }
                }
                dxa b2 = dxa.b(this.mFrameContext);
                b2.q(new z6m(this.mSjsdItemId, this.mContext, this.mVideoFrame));
                initFrameInstaller();
                if (b2.f() != null) {
                    b2.f().i(this.mFrameContext, tBLiveDataModel);
                }
                IpChange ipChange2 = qvs.$ipChange;
                up6.c(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
                cv1 f = vx9.f(this.mFrameContext);
                boolean z2 = f instanceof cba;
                if (z2) {
                    cba cbaVar = (cba) f;
                    if (TextUtils.isEmpty(cbaVar.F)) {
                        cbaVar.F = mxa.b(iba.B(vx9.f(this.mFrameContext)));
                    }
                }
                ux9 ux9Var3 = this.mFrameContext;
                if (ux9Var3 != null && (ux9Var3.l() instanceof wwa)) {
                    ((wwa) this.mFrameContext.l()).c = 0;
                }
                gxa.c(this.mFrameContext, null);
                if (this.highlightPlayInfo != null) {
                    LiveItem.TimeMovingPlayInfo timeMovingPlayInfo4 = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo;
                    if (timeMovingPlayInfo4 != null) {
                        gxa.c(this.mFrameContext, timeMovingPlayInfo4.spfPlayVideo);
                    }
                    this.mVideoFrame.j(this.mCoverImage, this.mContext, this.mFirstFrameRendered, this.mLandscapeVideo, this.mPerfomenceTrackManager, this.mTrackId, this.mToken, this.highlightPlayInfo, this.mFrameContext);
                }
                if (!TextUtils.isEmpty(this.mSjsdItemId)) {
                    str = this.mSjsdItemId;
                } else {
                    str = this.mTimeMovingItemId;
                }
                up6.S0(str, this.mFrameContext);
                if (uwa.A()) {
                    if (!TextUtils.isEmpty(this.mSjsdItemId)) {
                        str2 = this.mSjsdItemId;
                    } else {
                        str2 = this.mTimeMovingItemId;
                    }
                    this.mSjsdItemId = str2;
                }
                updateParams(tBLiveDataModel.mVideoInfo);
                if (b2.f() != null) {
                    b2.f().h(this.mFrameContext, tBLiveDataModel);
                }
                initRoomScreenManager();
                k0e k0eVar = this.mVideoFrame;
                if (k0eVar != null) {
                    k0eVar.f(tBLiveDataModel, this.mId, this.mUserId);
                }
                o1j o1jVar = this.mTaoliveShowByStatus;
                ux9 ux9Var4 = this.mFrameContext;
                o1jVar.i(ux9Var4, tBLiveDataModel.mVideoInfo, this.mSjsdItemId, str4, null, ux9Var4);
                LiveItem.TimeMovingPlayInfo timeMovingPlayInfo5 = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo;
                if (timeMovingPlayInfo5 == null || TextUtils.isEmpty(timeMovingPlayInfo5.timeMovingId)) {
                    LiveItem b3 = ubt.b(tBLiveDataModel.mVideoInfo, this.mSjsdItemId);
                    if (b3 != null) {
                        ubt.f(b3, this.mFrameContext);
                    }
                } else {
                    up6.N0(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.timeMovingId, this.mFrameContext);
                    ux9 ux9Var5 = this.mFrameContext;
                    if ((ux9Var5 instanceof cdr) && ((cdr) ux9Var5).p0) {
                        iba.l0(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.timeMovingId, vx9.f(ux9Var5));
                    }
                }
                cxa.f17408a = RecModel.MEDIA_TYPE_TIMEMOVE;
                if (b2.f() != null) {
                    if (nwa.a(this.mFrameContext).c() != null) {
                        nwa.a(this.mFrameContext).c().a(z2 ? (cba) f : null, this.mContext, "Page_TaobaoLiveWatch");
                    }
                    b2.f().k(this.mFrameContext);
                    b2.f().l(this.mFrameContext);
                }
                ViewGroup viewGroup = this.mRoomLayout;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
            }
        }
    }
}
