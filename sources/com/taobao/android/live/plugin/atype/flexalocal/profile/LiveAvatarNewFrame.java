package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import tb.b0d;
import tb.dt9;
import tb.et9;
import tb.ewg;
import tb.fkx;
import tb.giv;
import tb.gnk;
import tb.gwg;
import tb.h2t;
import tb.hnf;
import tb.huk;
import tb.hw0;
import tb.jkd;
import tb.kiv;
import tb.lca;
import tb.n2s;
import tb.nh4;
import tb.o3s;
import tb.p3u;
import tb.qt9;
import tb.rg0;
import tb.s3c;
import tb.sjr;
import tb.st9;
import tb.stk;
import tb.t2o;
import tb.t54;
import tb.uo8;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.voj;
import tb.vuf;
import tb.vx9;
import tb.wfv;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarNewFrame extends BaseFrame implements s3c, b0d, huk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_AVATAR_ACCOUNT_ID = "accountId";
    public static final String LIVE_AVATAR_ENCODE_ACCOUNT_ID = "encodeAccountId";
    public static final String LIVE_AVATAR_LIVE_ID = "liveId";
    public static final String LIVE_AVATAR_SOURCE_TYPE = "sourceType";
    private static final String LIVE_AVATAR_SOURCE_TYPE_LIVE = "live";
    public static final String LIVE_OPEN_WEB_VIEW_PARAMS = "_form=tblive-base-openWebview";
    private static final String TAG = "LiveAvatarNewFrame";
    private et9 followChangeListener;
    private ewg mBusiness;
    private View mCardRootView;
    public View mCover;
    private View mCoverView;
    private LiveAvatarInfoCardResponseData mData;
    private TBLiveDataModel mDataModel;
    private String mExternalAccountId;
    private String mExternalLiveId;
    public vuf mJoinGroupBusiness;
    private LiveAvatarNewView mLiveAvatarNewView;
    private String mSourceType;
    private ViewStub mViewStub;
    private boolean widgetInstalled;
    private boolean mNeedDegree = true;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private String newStyle = "true";

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
            LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).updateData(LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this), LiveAvatarNewFrame.access$300(LiveAvatarNewFrame.this), LiveAvatarNewFrame.access$600(LiveAvatarNewFrame.this));
            LiveAvatarNewFrame.this.mContainer.setVisibility(0);
            LiveAvatarNewFrame.access$800(LiveAvatarNewFrame.this);
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
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                str = netResponse.getRetMsg() + ",加群失败，请重试";
            } else {
                str = "加群失败，请重试";
            }
            kiv.c(LiveAvatarNewFrame.this.mContext, str);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            kiv.c(LiveAvatarNewFrame.this.mContext, "加群成功，空闲时多回来唠嗑吧");
            if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this) != null && LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo != null) {
                LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo.isInChatGroup = "true";
                try {
                    LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo.chatGroupID = netResponse.getDataJsonObject().getJSONObject("value").getString("groupId");
                } catch (JSONException e) {
                    o3s.b(LiveAvatarNewFrame.TAG, e.getMessage());
                }
                if (LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) != null) {
                    LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshTopUi(LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this), false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(LiveAvatarNewFrame liveAvatarNewFrame) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements stk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.stk
            public void a(jkd jkdVar) {
                String str;
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                    return;
                }
                if (LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) != null) {
                    LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshFollowStatus(false);
                }
                if (nh4.A(LiveAvatarNewFrame.this.mFrameContext)) {
                    kiv.a(LiveAvatarNewFrame.this.mContext, ((wfv) jkdVar).f30670a, false);
                } else {
                    kiv.c(LiveAvatarNewFrame.this.mContext, ((wfv) jkdVar).f30670a);
                }
                sjr g = sjr.g();
                String valueOf = String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this));
                ux9 ux9Var = LiveAvatarNewFrame.this.mFrameContext;
                if (ux9Var == null) {
                    str = null;
                } else {
                    str = ux9Var.C();
                }
                g.c(uyg.EVENT_ACTION_UNFOLLOW, valueOf, str);
                LiveAvatarNewFrame liveAvatarNewFrame = LiveAvatarNewFrame.this;
                ux9 ux9Var2 = liveAvatarNewFrame.mFrameContext;
                String access$300 = LiveAvatarNewFrame.access$300(liveAvatarNewFrame);
                if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags == null || LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags.isEmpty()) {
                    z = false;
                }
                gwg.m(ux9Var2, access$300, z);
            }

            @Override // tb.stk
            public void onFailure(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                } else {
                    kiv.c(LiveAvatarNewFrame.this.mContext, "取消关注失败，请重试");
                }
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            qt9 qt9Var = new qt9();
            qt9Var.f26917a = String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this));
            qt9Var.c = LiveAvatarNewFrame.this.getLiveId();
            v2s.o().k().h(qt9Var, new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            String str;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            if (nh4.A(LiveAvatarNewFrame.this.mFrameContext)) {
                kiv.a(LiveAvatarNewFrame.this.mContext, ((st9) jkdVar).f28260a, true);
            } else {
                kiv.c(LiveAvatarNewFrame.this.mContext, ((st9) jkdVar).f28260a);
            }
            sjr g = sjr.g();
            String valueOf = String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this));
            ux9 ux9Var = LiveAvatarNewFrame.this.mFrameContext;
            if (ux9Var == null) {
                str = null;
            } else {
                str = ux9Var.C();
            }
            g.c(uyg.EVENT_ACTION_FOLLOW, valueOf, str);
            LiveAvatarNewFrame liveAvatarNewFrame = LiveAvatarNewFrame.this;
            ux9 ux9Var2 = liveAvatarNewFrame.mFrameContext;
            String access$300 = LiveAvatarNewFrame.access$300(liveAvatarNewFrame);
            if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags == null || LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags.isEmpty()) {
                z = false;
            }
            gwg.e(ux9Var2, access$300, z);
            uo8.f(LiveAvatarNewFrame.this.mFrameContext, "follow", 0L);
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8632a;

        public f(String str) {
            this.f8632a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof hnf) {
                boolean z = ((hnf) jkdVar).f20761a;
                HashMap hashMap = new HashMap();
                hashMap.put("accountId", this.f8632a);
                hashMap.put("accountType", null);
                hashMap.put("followSource", null);
                ux9 ux9Var = LiveAvatarNewFrame.this.mFrameContext;
                if (ux9Var != null && ux9Var.j() != null && LiveAvatarNewFrame.this.mFrameContext.j().r() != null && (LiveAvatarNewFrame.this.mFrameContext.j().r() instanceof ATaoLiveOpenEntity)) {
                    if (z) {
                        LiveAvatarNewFrame.this.mFrameContext.j().r().accessListener(AccessListenerEnum.onFollowAction, hashMap);
                    } else {
                        LiveAvatarNewFrame.this.mFrameContext.j().r().accessListener(AccessListenerEnum.onUnfollowAciton, hashMap);
                    }
                }
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements et9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.et9
        public void onFollowChange(dt9 dt9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb93c2e5", new Object[]{this, dt9Var});
            } else if (dt9Var != null && !TextUtils.isEmpty(dt9Var.f18052a) && TextUtils.equals(dt9Var.f18052a, LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this)) && LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) != null) {
                LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshFollowStatus(dt9Var.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LiveAvatarNewFrame.access$400(LiveAvatarNewFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IInteractiveProxy.h z0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (LiveAvatarNewFrame.access$500(LiveAvatarNewFrame.this)) {
                ux9 ux9Var = LiveAvatarNewFrame.this.mFrameContext;
                if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
                    String str = LiveAvatarNewFrame.this.mLiveDataModel.mVideoInfo.broadCaster.profileJumpConfig.get(rg0.JUMP_URL);
                    if (str != null && !str.contains(LiveAvatarNewFrame.LIVE_OPEN_WEB_VIEW_PARAMS)) {
                        str = str.concat("&_form=tblive-base-openWebview");
                    }
                    if (hw0.l()) {
                        kiv.c(LiveAvatarNewFrame.this.mContext, "橱窗预渲染完成");
                    }
                    o3s.b(LiveAvatarNewFrame.TAG, "preRenderWebView：" + str);
                    z0.t(str);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LiveAvatarNewFrame.access$602(LiveAvatarNewFrame.this, v2s.o().H().a("88"));
            o3s.b(LiveAvatarNewFrame.TAG, "widgetInstalled: " + LiveAvatarNewFrame.access$600(LiveAvatarNewFrame.this));
            LiveAvatarNewFrame.access$700(LiveAvatarNewFrame.this);
        }
    }

    static {
        t2o.a(295699572);
        t2o.a(806355016);
        t2o.a(806355932);
        t2o.a(806355884);
    }

    public LiveAvatarNewFrame(Context context) {
        super(context);
    }

    public static /* synthetic */ LiveAvatarInfoCardResponseData access$000(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("f22d4543", new Object[]{liveAvatarNewFrame});
        }
        return liveAvatarNewFrame.mData;
    }

    public static /* synthetic */ LiveAvatarNewView access$100(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarNewView) ipChange.ipc$dispatch("e79a8de6", new Object[]{liveAvatarNewFrame});
        }
        return liveAvatarNewFrame.mLiveAvatarNewView;
    }

    public static /* synthetic */ String access$200(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16cc0f1c", new Object[]{liveAvatarNewFrame});
        }
        return liveAvatarNewFrame.getAccountId();
    }

    public static /* synthetic */ String access$300(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf58cf7b", new Object[]{liveAvatarNewFrame});
        }
        return liveAvatarNewFrame.mSourceType;
    }

    public static /* synthetic */ void access$400(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2ee186", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.resetView();
        }
    }

    public static /* synthetic */ boolean access$500(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aabb4b", new Object[]{liveAvatarNewFrame})).booleanValue();
        }
        return liveAvatarNewFrame.needOpenShopWindow();
    }

    public static /* synthetic */ boolean access$600(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae26950c", new Object[]{liveAvatarNewFrame})).booleanValue();
        }
        return liveAvatarNewFrame.widgetInstalled;
    }

    public static /* synthetic */ boolean access$602(LiveAvatarNewFrame liveAvatarNewFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("740f930e", new Object[]{liveAvatarNewFrame, new Boolean(z)})).booleanValue();
        }
        liveAvatarNewFrame.widgetInstalled = z;
        return z;
    }

    public static /* synthetic */ void access$700(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a26ec9", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.updateView();
        }
    }

    public static /* synthetic */ void access$800(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1e488a", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.showProfileTrack();
        }
    }

    private qt9 buildFollowParams() {
        FandomInfo fandomInfo;
        AccountInfo accountInfo;
        VideoInfo videoInfo;
        AccountInfo accountInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("ea71fb2d", new Object[]{this});
        }
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = getAccountId();
        qt9Var.c = getLiveId();
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo2 = videoInfo.broadCaster) == null)) {
            qt9Var.b = accountInfo2.type;
        }
        if (!(tBLiveDataModel == null || (fandomInfo = tBLiveDataModel.mFandomInfo) == null || (accountInfo = fandomInfo.broadCaster) == null)) {
            qt9Var.b = accountInfo.type;
        }
        return qt9Var;
    }

    private void checkFollowFormMtop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b753ef76", new Object[]{this, str});
            return;
        }
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = str;
        if (v2s.o().k() != null) {
            v2s.o().k().c(qt9Var, new f(str));
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null) {
            liveAvatarNewView.destroy();
        }
        if (nh4.h0()) {
            View view = this.mCardRootView;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
        }
        v2s.o().k().g(this.followChangeListener);
        vuf vufVar = this.mJoinGroupBusiness;
        if (vufVar != null) {
            vufVar.destroy();
            this.mJoinGroupBusiness = null;
        }
        if (vc.a() && vc.h(this.mContext)) {
            vc.l(this);
        }
        this.mMainHandler.removeCallbacksAndMessages(null);
    }

    private String getAccountId() {
        FandomInfo fandomInfo;
        AccountInfo accountInfo;
        VideoInfo videoInfo;
        AccountInfo accountInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mExternalAccountId)) {
            return this.mExternalAccountId;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (accountInfo2 = videoInfo.broadCaster) != null) {
            return accountInfo2.accountId;
        }
        if (tBLiveDataModel == null || (fandomInfo = tBLiveDataModel.mFandomInfo) == null || (accountInfo = fandomInfo.broadCaster) == null) {
            return null;
        }
        return accountInfo.accountId;
    }

    private void gotoFollowAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6272d0", new Object[]{this});
            return;
        }
        qt9 buildFollowParams = buildFollowParams();
        buildFollowParams.o = "live";
        v2s.o().k().f(buildFollowParams, new e());
    }

    private void gotoUnFollowAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8669ec9", new Object[]{this});
            return;
        }
        n2s n2sVar = new n2s(this.mContext, R.style.TLLive_Permission_Dialog_AType);
        n2sVar.e(this.mContext.getString(R.string.taolive_personal_unfollow_dialog_title_flexalocal));
        if (this.mData.topFollow) {
            n2sVar.b(this.mContext.getString(R.string.taolive_personal_unfollow_dialog_content_flexalocal));
        }
        n2sVar.d(this.mContext.getString(R.string.taolive_personal_unfollow_pos_tv_flexalocal), new d()).c(this.mContext.getString(R.string.taolive_personal_unfollow_nag_tv_flexalocal), new c(this));
        n2sVar.show();
    }

    private void inflateViewOnRequired() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac79091", new Object[]{this});
            return;
        }
        ViewStub viewStub = this.mViewStub;
        if (viewStub != null && (viewStub.getParent() instanceof ViewGroup)) {
            this.mViewStub.setLayoutResource(getLayoutResId());
            View inflate = this.mViewStub.inflate();
            this.mContainer = inflate;
            onViewCreated(inflate);
            LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
            if (liveAvatarNewView != null && (tBLiveDataModel = this.mDataModel) != null) {
                liveAvatarNewView.onDataReceived(tBLiveDataModel);
            }
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        sjr.g().a(this);
        if (this.mFrameContext == null) {
            this.mFrameContext = vx9.d();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "ShopWindow", observeUniqueIdentification());
        }
        this.followChangeListener = new g();
        v2s.o().k().b(this.followChangeListener);
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarNewFrame liveAvatarNewFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarNewFrame");
        }
    }

    private boolean isOpenRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c88b29a", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.P == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(this.mFrameContext.P.bizCode)) {
            return false;
        }
        return true;
    }

    private void joinGroupOrJumpGroup() {
        LiveAvatarInfoCardResponseData.ChatGroupInfo chatGroupInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13719a0", new Object[]{this});
            return;
        }
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData != null && liveAvatarInfoCardResponseData.chatGroupInfo != null) {
            gwg.c(this.mFrameContext, this.mSourceType, isFollow());
            if (!TextUtils.equals(this.mData.chatGroupInfo.isInChatGroup, "true")) {
                if (this.mJoinGroupBusiness == null) {
                    this.mJoinGroupBusiness = new vuf(new b());
                }
                LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData2 = this.mData;
                if (liveAvatarInfoCardResponseData2 != null && (chatGroupInfo = liveAvatarInfoCardResponseData2.chatGroupInfo) != null) {
                    this.mJoinGroupBusiness.K(chatGroupInfo.chatGroupID);
                }
            } else if (!TextUtils.isEmpty(this.mData.chatGroupInfo.chatGroupID)) {
                Context context = this.mContext;
                voj.a(context, "//tb.cn/n/im/chat?sessionid=" + this.mData.chatGroupInfo.chatGroupID);
                hide();
            }
        }
    }

    private boolean needOpenShopWindow() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        Map<String, String> map;
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d5c9831", new Object[]{this})).booleanValue();
        }
        if (!nh4.m0() || (tBLiveDataModel = this.mLiveDataModel) == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.broadCaster == null || gnk.a().e(this.mLiveDataModel.mVideoInfo) || (map = this.mLiveDataModel.mVideoInfo.broadCaster.profileJumpConfig) == null || !map.containsKey(rg0.JUMP_URL)) {
            return false;
        }
        if (!giv.c().b() && !checkOpenBiz()) {
            return false;
        }
        if (((!giv.c().b() || this.mFrameContext.E().e() == VideoStatus.VIDEO_TIMESHIFT_STATUS) && (giv.c().b() || (ux9Var = this.mFrameContext) == null || ux9Var.x() == null || VideoStatus.VIDEO_TIMESHIFT_STATUS == this.mFrameContext.x().e())) || vc.i(this.mContext) || vc.d(this.mContext) || isLandscape()) {
            return false;
        }
        return true;
    }

    private void prerenderShowWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6b59ad", new Object[]{this});
        } else {
            this.mMainHandler.postDelayed(new i(), nh4.a1() * 1000);
        }
    }

    private void request(boolean z, String str) {
        FandomInfo fandomInfo;
        AccountInfo accountInfo;
        VideoInfo videoInfo;
        AccountInfo accountInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df61f448", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.mNeedDegree = z;
        this.mSourceType = str;
        lca.b = str;
        if (this.mBusiness == null) {
            this.mBusiness = new ewg(this);
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (accountInfo2 = videoInfo.broadCaster) != null) {
            long h2 = zqq.h(accountInfo2.accountId);
            long h3 = zqq.h(this.mLiveDataModel.mVideoInfo.liveId);
            String str2 = this.mLiveDataModel.mVideoInfo.broadCaster.encodeAccountId;
            if (TextUtils.isEmpty(str2)) {
                str2 = String.valueOf(h2);
            }
            this.mBusiness.K(h3, h2, str2, this.mSourceType, isOpenRoom());
        } else if (tBLiveDataModel != null && (fandomInfo = tBLiveDataModel.mFandomInfo) != null && (accountInfo = fandomInfo.broadCaster) != null) {
            long h4 = zqq.h(accountInfo.accountId);
            String str3 = accountInfo.encodeAccountId;
            if (TextUtils.isEmpty(str3)) {
                str3 = String.valueOf(h4);
            }
            this.mBusiness.K(0L, h4, str3, this.mSourceType, isOpenRoom());
        }
    }

    private void resetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        View view = this.mCardRootView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            if (this.mLandscape) {
                this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView, true);
            } else {
                this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView);
            }
        }
    }

    private void showProfileTrack() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fdc1c6", new Object[]{this});
            return;
        }
        boolean isFollow = isFollow();
        ux9 ux9Var = this.mFrameContext;
        String str = this.mSourceType;
        List<LiveAvatarInfoCardResponseData.AnchorTag> list = this.mData.anchorTags;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!p3u.f(this.mFrameContext, this.mLiveDataModel) || !isFollow()) {
            z2 = false;
        } else {
            z2 = true;
        }
        gwg.g(ux9Var, isFollow, str, z, z2, this.widgetInstalled);
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else if (this.mLiveAvatarNewView != null) {
            this.mMainHandler.post(new a());
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
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        this.mViewStub = viewStub;
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_new_avatar_card_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public String getLiveId() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mExternalLiveId)) {
            return this.mExternalLiveId;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return null;
        }
        return videoInfo.liveId;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(8);
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null) {
            liveAvatarNewView.hide();
        }
    }

    public boolean isFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8867c86", new Object[]{this})).booleanValue();
        }
        if (this.mLiveDataModel == null) {
            return false;
        }
        return v2s.o().k().e(buildFollowParams());
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.avatar_card_show", uyg.EVENT_AVATAR_CARD__HIDE, "com.taobao.taolive.anchor_avatar_follow_changed", "com.taobao.taolive.room.install_widget_success", "com.taobao.taolive.anchor_avatar_join_group", "com.taobao.taolive.anchor_avatar_favorite_result", uyg.EVENT_OPEN_WIDGET_INSTALL_GUIDE, uyg.EVENT_H5_CONTAINER_DESTROY};
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
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        LiveAvatarNewView liveAvatarNewView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (!(tBLiveDataModel == null || (liveAvatarNewView = this.mLiveAvatarNewView) == null)) {
            liveAvatarNewView.onDataReceived(tBLiveDataModel);
        }
        init();
        this.mDataModel = tBLiveDataModel;
        if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (jSONObject = videoInfo.originalData) == null || (jSONObject2 = jSONObject.getJSONObject("intimacyData")) == null)) {
            this.newStyle = jSONObject2.getString("enableNewStyle");
        }
        if (p3u.b(tBLiveDataModel, this.mContext)) {
            prerenderShowWindow();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.b0d
    public void onError(int i2, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
            return;
        }
        o3s.d(TAG, "request onError");
        tryUpdateViewOrJumpAccount();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null) {
            liveAvatarNewView.isShowing();
        }
    }

    @Override // tb.huk
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else {
            hide();
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
            return;
        }
        o3s.d(TAG, "request onSuccess");
        if (netBaseOutDo instanceof LiveAvatarInfoCardResponse) {
            this.mData = ((LiveAvatarInfoCardResponse) netBaseOutDo).getData();
            if (p3u.f(this.mFrameContext, this.mLiveDataModel)) {
                Coordinator.execute(new j());
            } else {
                updateView();
            }
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i2, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
            return;
        }
        o3s.d(TAG, "request onSystemError");
        tryUpdateViewOrJumpAccount();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mContainer = view;
        this.mCardRootView = view.findViewById(R.id.taolive_avatar_card_detail_container_new);
        this.mCoverView = view.findViewById(R.id.taolive_avatar_card_cover_new);
        if (view instanceof ViewGroup) {
            this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView);
        }
        if (vc.a() && vc.h(this.mContext)) {
            vc.k(this);
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
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(0);
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null) {
            liveAvatarNewView.show();
            showProfileTrack();
        }
    }

    private void saveShopWindowPrerenderList(TBLiveDataModel tBLiveDataModel) {
        TBLiveDataModel tBLiveDataModel2;
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24fc18d4", new Object[]{this, tBLiveDataModel});
        } else if (nh4.R() && (tBLiveDataModel2 = this.mLiveDataModel) != null && (videoInfo = tBLiveDataModel2.mVideoInfo) != null && (accountInfo = videoInfo.broadCaster) != null && accountInfo.accountId != null) {
            String str = tBLiveDataModel.mVideoInfo.broadCaster.accountId;
            List c2 = p3u.c(this.mContext);
            if (c2 == null) {
                c2 = new ArrayList();
            }
            c2.remove(str);
            c2.add(str);
            if (c2.size() > nh4.b1()) {
                c2.remove(0);
            }
            String i2 = fkx.i(c2);
            if (i2 != null) {
                SharedPreferences.Editor edit = this.mContext.getSharedPreferences("taolive", 0).edit();
                edit.putString("shopWindowPrerenderList", i2);
                edit.apply();
            }
        }
    }

    private void tryUpdateViewOrJumpAccount() {
        LiveAvatarNewView liveAvatarNewView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbe6e9a", new Object[]{this});
            return;
        }
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData == null || (liveAvatarNewView = this.mLiveAvatarNewView) == null) {
            if (!TextUtils.isEmpty(this.mDataModel.mVideoInfo.broadCaster.accountInfoUrl)) {
                v2s.o().v().b(this.mContext, this.mDataModel.mVideoInfo.broadCaster.accountInfoUrl, null);
            } else {
                Toast.makeText(this.mContext, "出错啦，请稍后再试～", 0).show();
            }
            hide();
            return;
        }
        liveAvatarNewView.updateData(liveAvatarInfoCardResponseData, this.mSourceType, this.widgetInstalled);
    }

    private boolean checkOpenBiz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec2b84c", new Object[]{this})).booleanValue();
        }
        return (!h2t.INSTANCE.k() || !"true".equals(this.newStyle)) ? this.mFrameContext != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(this.mFrameContext.P.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.P.bizCode) : this.mFrameContext != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.P.bizCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.onEvent(java.lang.String, java.lang.Object):void");
    }

    public LiveAvatarNewFrame(Context context, boolean z) {
        super(context, z);
    }

    private void requestWithAccountId(String str, String str2, String str3, String str4) {
        long j2;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb180e2", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.mNeedDegree = true;
        this.mSourceType = str4;
        lca.b = str4;
        if (this.mBusiness == null) {
            this.mBusiness = new ewg(this);
        }
        long j3 = 0;
        try {
            j2 = Long.parseLong(str);
            try {
                j3 = Long.parseLong(str2);
            } catch (Exception e3) {
                e2 = e3;
                o3s.b(TAG, "requestWithAccountId catch exception:" + e2.getMessage());
                this.mBusiness.K(j2, j3, str3, this.mSourceType, isOpenRoom());
            }
        } catch (Exception e4) {
            e2 = e4;
            j2 = 0;
        }
        this.mBusiness.K(j2, j3, str3, this.mSourceType, isOpenRoom());
    }

    public LiveAvatarNewFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public LiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public LiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
