package com.taobao.android.live.plugin.atype.flexalocal.officialLive;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import java.util.HashMap;
import tb.b0d;
import tb.dg6;
import tb.g44;
import tb.giv;
import tb.gnk;
import tb.hgb;
import tb.hjr;
import tb.jkd;
import tb.kiv;
import tb.liv;
import tb.nh4;
import tb.nwb;
import tb.o3s;
import tb.qt9;
import tb.s3c;
import tb.sjr;
import tb.stk;
import tb.t2o;
import tb.t54;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.wmk;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OfficialLiveEntryFrame extends BaseFrame implements s3c, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_NAME = "taolive_officiallive_entry";
    private static final String TAG = "OfficialLiveEntryFrame";
    private static final int TRACK_TYPE_CLICK = 0;
    private static final int TRACK_TYPE_SHOW = 1;
    public DXRootView mDxRootView;
    private final hgb.a mIAppBackgroundListener = new a();
    public VideoInfo mVideoInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            } else if (nh4.t1()) {
                OfficialLiveEntryFrame.access$000(OfficialLiveEntryFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            String string = OfficialLiveEntryFrame.this.mContext.getResources().getString(R.string.taolive_comments_user_follow_fail_flexalocal);
            if (TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            kiv.c(OfficialLiveEntryFrame.this.mContext, str2);
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            VideoInfo.OfficialLiveInfo officialLiveInfo;
            AccountInfo accountInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            Context context = OfficialLiveEntryFrame.this.mContext;
            kiv.c(context, liv.c(context, jkdVar));
            if (!gnk.a().g(OfficialLiveEntryFrame.this.mVideoInfo) || (accountInfo = OfficialLiveEntryFrame.this.mVideoInfo.broadCaster) == null) {
                VideoInfo videoInfo = OfficialLiveEntryFrame.this.mVideoInfo;
                if (!(videoInfo == null || (officialLiveInfo = videoInfo.officialLiveInfo) == null)) {
                    officialLiveInfo.follow = "true";
                }
            } else {
                accountInfo.follow = true;
                o3s.b(hjr.KMPTag, "OfficialLiveEntryFrame kmp send");
                OfficialLiveEntryFrame officialLiveEntryFrame = OfficialLiveEntryFrame.this;
                new g44(officialLiveEntryFrame.mContext, officialLiveEntryFrame.mFrameContext).g("follow");
            }
            OfficialLiveEntryFrame.this.updateView();
        }
    }

    static {
        t2o.a(295699540);
        t2o.a(806355016);
        t2o.a(806355932);
    }

    public OfficialLiveEntryFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(OfficialLiveEntryFrame officialLiveEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68d38ec", new Object[]{officialLiveEntryFrame});
        } else {
            officialLiveEntryFrame.queryDetail();
        }
    }

    private HashMap<String, String> buildOfficialMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7904510d", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        VideoInfo videoInfo = this.mVideoInfo;
        if (!(videoInfo == null || videoInfo.broadCaster == null || !gnk.a().e(this.mVideoInfo))) {
            hashMap.put("feed_id", this.mVideoInfo.liveId);
            hashMap.put(z9u.KEY_ACCOUNT_ID, this.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mVideoInfo.officialLiveInfo.officialLive);
        }
        return hashMap;
    }

    private void handleOfficialAnchor() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abafe24f", new Object[]{this});
        } else if (gnk.a().e(this.mVideoInfo)) {
            if (gnk.a().g(this.mVideoInfo)) {
                VideoInfo videoInfo = this.mVideoInfo;
                str2 = videoInfo.liveId;
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    str = accountInfo.accountId;
                    str3 = accountInfo.encodeAccountId;
                } else {
                    str = "";
                    str3 = str;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = str;
                }
            } else {
                VideoInfo.OfficialLiveInfo officialLiveInfo = this.mVideoInfo.officialLiveInfo;
                str2 = officialLiveInfo.officialLiveId;
                str = officialLiveInfo.accountId;
                str3 = officialLiveInfo.encryptAnchorId;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accountId", (Object) str);
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) str3);
            jSONObject.put("liveId", (Object) str2);
            jSONObject.put("sourceType", (Object) "official-live");
            sjr.g().c("com.taobao.taolive.room.avatar_card_show", jSONObject, observeUniqueIdentification());
            trackClickHead();
        }
    }

    private void handleOfficialEntry() {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2198806", new Object[]{this});
        } else if (gnk.a().e(this.mVideoInfo)) {
            ux9 ux9Var = this.mFrameContext;
            if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("name", "@ali/alivemodx-offical-channel-playlist");
                z0.v("invoke-message-component", hashMap);
                trackClick();
            }
        }
    }

    private void handleOfficialFollow() {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d7d4b", new Object[]{this});
        } else if (gnk.a().e(this.mVideoInfo)) {
            qt9 qt9Var = new qt9();
            if (!gnk.a().g(this.mVideoInfo) || (accountInfo = (videoInfo = this.mVideoInfo).broadCaster) == null) {
                VideoInfo.OfficialLiveInfo officialLiveInfo = this.mVideoInfo.officialLiveInfo;
                qt9Var.c = officialLiveInfo.officialLiveId;
                qt9Var.f26917a = officialLiveInfo.accountId;
            } else {
                qt9Var.c = videoInfo.liveId;
                qt9Var.f26917a = accountInfo.accountId;
            }
            qt9Var.o = qt9.FOLLOW_ANCHOR_AVATAR;
            v2s.o().k().f(giv.f().r(qt9Var), new b());
            trackClickFollow();
        }
    }

    public static /* synthetic */ Object ipc$super(OfficialLiveEntryFrame officialLiveEntryFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/officialLive/OfficialLiveEntryFrame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDx$33(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ef67ff", new Object[]{this, dXRootView});
        } else {
            this.mDxRootView = dXRootView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$34(nwb nwbVar, JSONObject jSONObject, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a068af4", new Object[]{this, nwbVar, jSONObject, dXRootView});
            return;
        }
        this.mDxRootView = dXRootView;
        if (dXRootView != null) {
            nwbVar.renderDX(dXRootView, jSONObject);
            ((ViewGroup) this.mContainer).addView(this.mDxRootView);
            trackShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderDx$35() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f656a426", new Object[]{this});
            return;
        }
        final nwb b2 = giv.b();
        if (b2 != null && ((ViewGroup) this.mContainer).indexOfChild(this.mDxRootView) == -1) {
            final JSONObject jSONObject = (JSONObject) JSON.toJSON(this.mVideoInfo);
            if (!(jSONObject == null || (context = this.mContext) == null)) {
                jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.SMALL));
            }
            DXRootView dXRootView = this.mDxRootView;
            if (dXRootView == null) {
                sjr.g().a(this);
                b2.a(this.mContext, DX_TEMPLATE_NAME, new nwb.a() { // from class: tb.cnk
                    @Override // tb.nwb.a
                    public final void a(DXRootView dXRootView2) {
                        OfficialLiveEntryFrame.this.lambda$null$34(b2, jSONObject, dXRootView2);
                    }
                });
                return;
            }
            b2.renderDX(dXRootView, jSONObject);
            ((ViewGroup) this.mContainer).addView(this.mDxRootView);
            trackShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateView$36() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f90c23", new Object[]{this});
            return;
        }
        nwb b2 = giv.b();
        if (b2 != null) {
            JSONObject jSONObject = (JSONObject) JSON.toJSON(this.mVideoInfo);
            if (!(jSONObject == null || (context = this.mContext) == null)) {
                jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.SMALL));
            }
            b2.renderDX(this.mDxRootView, jSONObject);
        }
    }

    private void queryDetail() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a740", new Object[]{this});
        } else if (this.mVideoInfo != null && gnk.a().g(this.mVideoInfo)) {
            VideoInfo videoInfo = this.mVideoInfo;
            if (videoInfo.officialLiveInfo != null && !TextUtils.isEmpty(videoInfo.liveId)) {
                wmk wmkVar = new wmk(this);
                String str2 = this.mVideoInfo.officialLiveInfo.officialLiveId;
                ux9 ux9Var = this.mFrameContext;
                String str3 = null;
                if (ux9Var == null) {
                    str = null;
                } else {
                    str = up6.L(ux9Var);
                }
                ux9 ux9Var2 = this.mFrameContext;
                if (ux9Var2 != null) {
                    str3 = up6.r(ux9Var2);
                }
                wmkVar.K(str2, str, str3);
            }
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        v2s.o().f().b(this.mIAppBackgroundListener);
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            this.mDxRootView = null;
            this.mVideoInfo = null;
        }
    }

    private void trackChild(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b98c75", new Object[]{this, new Integer(i), str});
            return;
        }
        HashMap<String, String> buildOfficialMap = buildOfficialMap();
        buildOfficialMap.put("type", "officialEntry");
        if (giv.f() != null) {
            if (i == 0) {
                giv.f().m(this.mFrameContext, str, buildOfficialMap);
            } else {
                giv.f().p(this.mFrameContext, str, buildOfficialMap);
            }
        }
    }

    private void trackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else if (giv.f() != null) {
            giv.f().m(this.mFrameContext, "show_list", buildOfficialMap());
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "LiveAvatarNewFrame";
    }

    public void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
            return;
        }
        nwb b2 = giv.b();
        if (b2 != null) {
            b2.a(this.mContext, DX_TEMPLATE_NAME, new nwb.a() { // from class: tb.ymk
                @Override // tb.nwb.a
                public final void a(DXRootView dXRootView) {
                    OfficialLiveEntryFrame.this.lambda$createDx$33(dXRootView);
                }
            });
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_official_live_entry_dx_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, uyg.EVENT_ACTION_FOLLOW, uyg.EVENT_ACTION_UNFOLLOW, dg6.EVENT_OFFICIAL_FOLLOW, dg6.EVENT_OFFICIAL_ANCHOR_CLICK, dg6.EVENT_OFFICIAL_ENTRY_CLICK, uyg.EVENT_REFRESH_OFFICIAL_ENTRY_VIEW};
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (gnk.a().d(tBLiveDataModel)) {
            this.mVideoInfo = tBLiveDataModel.mVideoInfo;
            renderDx();
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

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            o3s.b(TAG, "official switch quest error");
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            o3s.b(TAG, "official switch quest error");
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
        sjr.g().a(this);
        v2s.o().f().a(this.mIAppBackgroundListener);
        createDx();
    }

    public void renderDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            view.post(new Runnable() { // from class: tb.ank
                @Override // java.lang.Runnable
                public final void run() {
                    OfficialLiveEntryFrame.this.lambda$renderDx$35();
                }
            });
        }
    }

    public void trackShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb9736f", new Object[]{this});
        } else if (gnk.a().e(this.mVideoInfo)) {
            if (giv.f() != null) {
                giv.f().p(this.mFrameContext, "show_list", buildOfficialMap());
            }
            trackShowFollow();
            trackShowHead();
        }
    }

    public void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView != null) {
            dXRootView.post(new Runnable() { // from class: tb.enk
                @Override // java.lang.Runnable
                public final void run() {
                    OfficialLiveEntryFrame.this.lambda$updateView$36();
                }
            });
        }
    }

    private void trackShowFollow() {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0c7cc0", new Object[]{this});
            return;
        }
        if (gnk.a().g(this.mVideoInfo)) {
            z = !this.mVideoInfo.broadCaster.follow;
            str = "former_follow";
        } else {
            z = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = dg6.EVENT_OFFICIAL_FOLLOW;
        }
        if (z) {
            trackChild(1, str);
        }
    }

    private void trackShowHead() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa09016f", new Object[]{this});
            return;
        }
        if (gnk.a().g(this.mVideoInfo)) {
            str = "former_icon";
        } else {
            str = "official_icon";
        }
        trackChild(1, str);
    }

    private void trackClickFollow() {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55167e95", new Object[]{this});
            return;
        }
        if (gnk.a().g(this.mVideoInfo)) {
            z = true ^ this.mVideoInfo.broadCaster.follow;
            str = "former_follow";
        } else {
            z = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = dg6.EVENT_OFFICIAL_FOLLOW;
        }
        if (z) {
            trackChild(0, str);
        }
    }

    private void trackClickHead() {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce37484", new Object[]{this});
            return;
        }
        if (gnk.a().g(this.mVideoInfo)) {
            z = true ^ this.mVideoInfo.broadCaster.follow;
            str = "former_icon";
        } else {
            z = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = "official_icon";
        }
        if (z) {
            trackChild(0, str);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (gnk.a().e(this.mVideoInfo) && this.mVideoInfo.broadCaster != null) {
            if (uyg.EVENT_REFRESH_OFFICIAL_ENTRY_VIEW.equals(str)) {
                updateView();
            } else if ((uyg.EVENT_ACTION_FOLLOW.equals(str) || uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME.equals(str)) && (obj instanceof String)) {
                if (obj.equals(this.mVideoInfo.broadCaster.accountId)) {
                    this.mVideoInfo.broadCaster.follow = true;
                    updateView();
                    o3s.b(hjr.KMPTag, "OfficialLiveEntryFrame on event kmp send");
                    new g44(this.mContext, this.mFrameContext).g("follow");
                } else if (obj.equals(this.mVideoInfo.officialLiveInfo.accountId)) {
                    this.mVideoInfo.officialLiveInfo.follow = "true";
                    updateView();
                }
            } else if (!uyg.EVENT_ACTION_UNFOLLOW.equals(str) || !(obj instanceof String)) {
                if (dg6.EVENT_OFFICIAL_FOLLOW.equals(str)) {
                    handleOfficialFollow();
                } else if (dg6.EVENT_OFFICIAL_ANCHOR_CLICK.equals(str)) {
                    handleOfficialAnchor();
                } else if (dg6.EVENT_OFFICIAL_ENTRY_CLICK.equals(str)) {
                    handleOfficialEntry();
                }
            } else if (obj.equals(this.mVideoInfo.broadCaster.accountId)) {
                this.mVideoInfo.broadCaster.follow = false;
                updateView();
            } else if (obj.equals(this.mVideoInfo.officialLiveInfo.accountId)) {
                this.mVideoInfo.officialLiveInfo.follow = "false";
                updateView();
            }
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject jSONObject;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo != null && netResponse != null && (jSONObject = (JSONObject) netBaseOutDo.getData()) != null) {
            String string = jSONObject.getString("liveId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("officialLiveInfo");
            if (jSONObject2 != null) {
                String string2 = jSONObject2.getString("officialLiveId");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && (videoInfo = this.mVideoInfo) != null && videoInfo.officialLiveInfo != null && !string.equals(videoInfo.liveId)) {
                    OfficialLiveSwitchNextMessage officialLiveSwitchNextMessage = new OfficialLiveSwitchNextMessage();
                    officialLiveSwitchNextMessage.officialLiveId = string2;
                    officialLiveSwitchNextMessage.targetLiveId = string;
                    officialLiveSwitchNextMessage.targetLiveDetailUrl = String.format(nh4.u1(), string2);
                    sjr.g().c("com.taobao.taolive.room.switch.official.live", officialLiveSwitchNextMessage, observeUniqueIdentification());
                }
            }
        }
    }
}
