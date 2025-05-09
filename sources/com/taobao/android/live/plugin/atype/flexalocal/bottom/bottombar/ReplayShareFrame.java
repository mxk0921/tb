package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponse;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b0d;
import tb.clo;
import tb.cv1;
import tb.e4h;
import tb.fgv;
import tb.g1v;
import tb.ggv;
import tb.giv;
import tb.haa;
import tb.jgf;
import tb.lip;
import tb.o3s;
import tb.rgd;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayShareFrame extends BaseFrame implements s3c, fgv.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_ACTION_MORE_SHARE_CLICK = "com.taobao.taolive.room.more.share.click";
    private static final String EVENT_ACTION_SHARE_CLICK = "com.taobao.taolive.room.share.click";
    private static final String EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG = "com.taolive.taolive.room.mediaplatform_addShareConfig";
    private static final String EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG = "com.taolive.taolive.room.mediaplatform_removeShareConfig";
    private static final String EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL = "com.taolive.taolive.room.mediaplatform_show_sharepanel";
    private static final String KEY_BUSINESS_ID = "business_id";
    private static final String TAG = "ReplayShareFrame";
    private String mInviteCode;
    private final e4h mLiveShareBusiness = new e4h(new a());
    private OrderList<lip> mShareConfigList;
    private Map<String, Integer> mShareConfigOrderMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                ReplayShareFrame.access$000(ReplayShareFrame.this, ((GetLiveShareConfigResponse) netBaseOutDo).getData());
            }
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
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Comparator<lip> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ReplayShareFrame replayShareFrame) {
        }

        /* renamed from: a */
        public int compare(lip lipVar, lip lipVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("11c8db6f", new Object[]{this, lipVar, lipVar2})).intValue();
            }
            if (TextUtils.equals(lipVar.b, lipVar2.b)) {
                return 0;
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Comparator<lip> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(ReplayShareFrame replayShareFrame) {
        }

        /* renamed from: a */
        public int compare(lip lipVar, lip lipVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("11c8db6f", new Object[]{this, lipVar, lipVar2})).intValue();
            }
            return lipVar.f23361a - lipVar2.f23361a;
        }
    }

    static {
        t2o.a(295698486);
        t2o.a(806355016);
        t2o.a(806356153);
    }

    public ReplayShareFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(ReplayShareFrame replayShareFrame, GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28bfcc8", new Object[]{replayShareFrame, getLiveShareConfigResponseData});
        } else {
            replayShareFrame.onRequestSuccess(getLiveShareConfigResponseData);
        }
    }

    private void addShareConfig(Map<String, String> map) {
        Map<String, Integer> map2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b4077e", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get(KEY_BUSINESS_ID);
            if (!TextUtils.isEmpty(str) && (map2 = this.mShareConfigOrderMap) != null && map2.containsKey(str)) {
                if (this.mShareConfigList == null) {
                    this.mShareConfigList = new OrderList<>(new b(this), new c(this));
                }
                lip lipVar = new lip();
                lipVar.b = str;
                lipVar.c = map.get("desc");
                lipVar.d = map.get("icon_url");
                Integer num = this.mShareConfigOrderMap.get(str);
                if (num != null) {
                    i = num.intValue();
                }
                lipVar.f23361a = i;
                this.mShareConfigList.offer(lipVar);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ReplayShareFrame replayShareFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/ReplayShareFrame");
        }
    }

    private void onRequestSuccess(GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323efa6c", new Object[]{this, getLiveShareConfigResponseData});
        } else if (getLiveShareConfigResponseData != null) {
            this.mInviteCode = getLiveShareConfigResponseData.shareInviteSlogan;
            List<String> list = getLiveShareConfigResponseData.shareIconBizCodes;
            if (!(list == null || list.isEmpty())) {
                this.mShareConfigOrderMap = new HashMap();
                for (int i = 0; i < getLiveShareConfigResponseData.shareIconBizCodes.size(); i++) {
                    this.mShareConfigOrderMap.put(getLiveShareConfigResponseData.shareIconBizCodes.get(i), Integer.valueOf(i));
                }
            }
        }
    }

    private void removeShareConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffed821", new Object[]{this, map});
        } else if (this.mShareConfigList != null && map != null) {
            String str = map.get(KEY_BUSINESS_ID);
            Iterator<lip> it = this.mShareConfigList.iterator();
            while (it.hasNext()) {
                lip next = it.next();
                if (next.b.equals(str)) {
                    this.mShareConfigList.remove(next);
                    return;
                }
            }
        }
    }

    private void requestInviteCodeNew(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbd370a", new Object[]{this, ux9Var});
        } else if (ux9Var instanceof clo) {
            clo cloVar = (clo) ux9Var;
            if (cloVar.t0() != null) {
                cloVar.t0().i(this);
            }
        }
    }

    private void requestInviteCodeOld(TBLiveDataModel tBLiveDataModel) {
        cv1 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0b39a2", new Object[]{this, tBLiveDataModel});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null && videoInfo.broadCaster != null) {
            GetLiveShareConfigRequest getLiveShareConfigRequest = new GetLiveShareConfigRequest();
            getLiveShareConfigRequest.liveId = videoInfo.liveId;
            getLiveShareConfigRequest.anchorId = videoInfo.broadCaster.accountId;
            if (!(giv.c().b() || (f = vx9.f(this.mFrameContext)) == null || f.k() == null || f.k().D() == null)) {
                getLiveShareConfigRequest.liveSource = f.k().q().L();
            }
            e4h e4hVar = this.mLiveShareBusiness;
            if (e4hVar != null) {
                e4hVar.K(getLiveShareConfigRequest);
            }
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

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG, EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG, "com.taolive.taolive.room.mediaplatform_show_sharepanel", EVENT_ACTION_SHARE_CLICK, EVENT_ACTION_MORE_SHARE_CLICK, "com.taobao.taolive.mute_notify_showcase"};
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
        this.mLiveDataModel = tBLiveDataModel;
        o3s.b(TAG, Constants.KEY_DATA_RECEIVED_TIME);
        this.mFrameContext.h().a(this);
        this.mFrameContext.z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "Share", observeUniqueIdentification());
        if (ggv.a()) {
            requestInviteCodeNew(this.mFrameContext);
        } else {
            requestInviteCodeOld(tBLiveDataModel);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG.equals(str)) {
            addShareConfig((Map) obj);
        } else if (EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG.equals(str)) {
            removeShareConfig((Map) obj);
        } else if ("com.taolive.taolive.room.mediaplatform_show_sharepanel".equals(str)) {
            showShare((Map) obj);
        } else if (EVENT_ACTION_SHARE_CLICK.equals(str)) {
            jgf.a(this.mLiveDataModel, this.mFrameContext, "share");
        } else if (EVENT_ACTION_MORE_SHARE_CLICK.equals(str)) {
            showShare(null);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            return;
        }
        GetLiveShareConfigResponseData getLiveShareConfigResponseData = (GetLiveShareConfigResponseData) JSON.parseObject(unImportantLiveInfoResponseData.shareData, GetLiveShareConfigResponseData.class);
        if (getLiveShareConfigResponseData != null) {
            onRequestSuccess(getLiveShareConfigResponseData);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    private void showShare(Map<String, String> map) {
        cv1 f;
        haa q;
        cv1 f2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbdfdfc", new Object[]{this, map});
            return;
        }
        HashMap hashMap = map;
        if (map == null) {
            HashMap hashMap2 = new HashMap();
            OrderList<lip> orderList = this.mShareConfigList;
            if (orderList == null || orderList.isEmpty()) {
                hashMap2.put("invite_code", this.mInviteCode);
                hashMap = hashMap2;
            } else {
                lip lipVar = this.mShareConfigList.get(0);
                hashMap2.put(KEY_BUSINESS_ID, lipVar.b);
                hashMap2.put("desc", lipVar.c);
                hashMap = hashMap2;
            }
        }
        hashMap.put(KEY_BUSINESS_ID, "zhibo_corner");
        if (rgd.b().a() != null) {
            rgd.b().a().showShare((Activity) this.mContext, this.mLandscape, hashMap);
        }
        HashMap hashMap3 = new HashMap();
        if (!(giv.c().b() || (f2 = vx9.f(this.mFrameContext)) == null || f2.k() == null || f2.k().q() == null)) {
            hashMap3.put("spm-url", f2.k().q().E());
        }
        if (rgd.b().a() != null) {
            z = rgd.b().a().enableNewSpm4Shop();
        }
        if (z) {
            hashMap3.put("spm-cnt", "a2141.23201685");
        } else if (this.mFrameContext.c()) {
            String liveAndHomeMixSpm = rgd.b().a() != null ? rgd.b().a().getLiveAndHomeMixSpm() : null;
            if (TextUtils.isEmpty(liveAndHomeMixSpm)) {
                hashMap3.put("spm-cnt", "a2141.8001249.1.1");
            } else {
                hashMap3.put("spm-cnt", liveAndHomeMixSpm);
            }
        } else {
            hashMap3.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!(giv.c().b() || (f = vx9.f(this.mFrameContext)) == null || f.k() == null || (q = f.k().q()) == null)) {
            q.E();
            hashMap3.put("entrySpm", q.n());
            hashMap3.put("livesource", q.L());
            hashMap3.put("entryLiveSource", q.g());
            hashMap3.put("entrySpmPre", q.o());
        }
        hashMap3.put("client", "taobao");
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_TaobaoLive", "Button-Button-DownShare");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_PAGE, "Page_TaobaoLiveWatch");
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        this.mFrameContext.h().c("com.taobao.taolive.room.start_share_from_btns", null, this.mFrameContext.C());
    }
}
