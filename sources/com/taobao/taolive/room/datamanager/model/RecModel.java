package com.taobao.taolive.room.datamanager.model;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import com.taobao.taolive.sdk.model.BaseRecModel;
import com.taobao.taolive.sdk.model.ContentType;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.Map;
import tb.cba;
import tb.fkx;
import tb.iba;
import tb.o3s;
import tb.t2o;
import tb.u90;
import tb.up6;
import tb.vx9;
import tb.yj4;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecModel extends BaseRecModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RecModel";
    public LiveDetailMessinfoResponseData.AdEurlParams adEurlParams;
    public LiveDetailMessinfoResponseData.AlimamaInfo2 adTransParams;
    public LiveDetailMessinfoResponseData.AlimamaInfo alimama;
    public long autoRecommendFastStart;
    public long autoRecommendInterval;
    public long autoRecommendIntervalFast;
    public long autoRecommendRepeat;
    public Map<String, String> explainDebugInfo;
    public TppParamFeedInfo feedExtraInfo;
    public String keyPointId;
    public boolean mIsSwitchintelligent;
    public Map<String, String> modelDebugInfo;
    public String productType;
    public String recommendBindId;
    public LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo;
    public LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
    public List<SideGudieInfo> sideGudieInfo;
    public String sjsdItemId;
    public String timeMovingId;
    public String timeMovingSpfPlayVideo;

    static {
        t2o.a(779092941);
    }

    public RecModel(LiveDetailMessinfoResponseData.RecVideo recVideo, boolean z, cba cbaVar) {
        this.liveId = recVideo.liveId;
        this.accountId = recVideo.accountId;
        this.imageUrl = recVideo.coverImg;
        this.actionUrl = u90.h(recVideo.nativeFeedDetailUrl, z9u.SOURCE_UPDOWNSWITCH);
        this.trackInfo = recVideo.trackInfo;
        this.alimama = recVideo.alimama;
        this.adTransParams = recVideo.adTransParams;
        this.adEurlParams = recVideo.adEurlParams;
        this.mIsSwitchintelligent = z;
        this.liveUrlList = recVideo.liveUrlList;
        this.h265 = recVideo.h265;
        this.rateAdapte = recVideo.rateAdapte;
        this.edgePcdn = recVideo.edgePcdn;
        this.mediaConfig = recVideo.mediaConfig;
        this.anchorId = recVideo.anchorId;
        this.mediaSourceType = recVideo.mediaSourceType;
        this.updownPromptText = recVideo.updownPromptText;
        this.updownRecommendDesc = recVideo.updownRecommendDesc;
        String str = recVideo.extendMap;
        this.extendMap = str;
        this.viewCount = recVideo.viewCount;
        this.supportPreLoad = recVideo.supportPreLoad;
        this.feedType = recVideo.feedType;
        this.clientReturnMap = recVideo.clientReturnMap;
        this.recommendBindId = recVideo.recommendBindId;
        this.timeMovingId = recVideo.timeMovingId;
        this.sjsdItemId = recVideo.sjsdItemId;
        this.keyPointId = recVideo.keyPointId;
        this.productType = recVideo.productType;
        this.timeMovingSpfPlayVideo = recVideo.timeMovingSpfPlayVideo;
        this.recommendCardInfo = recVideo.recommendCardInfo;
        this.reserveItemCardInfo = recVideo.reserveItemCardInfo;
        this.sideGudieInfo = recVideo.sideGudieInfo;
        this.modelDebugInfo = recVideo.modelDebugInfo;
        this.explainDebugInfo = recVideo.explainDebugInfo;
        this.autoRecommendInterval = recVideo.autoRecommendInterval;
        this.autoRecommendRepeat = recVideo.autoRecommendRepeat;
        JSONObject d = fkx.d(str);
        if (d != null) {
            try {
                this.autoRecommendIntervalFast = d.getIntValue("autoRecommendIntervalFast");
                this.autoRecommendFastStart = d.getIntValue("autoRecommendFastStart");
            } catch (Exception unused) {
                o3s.b(TAG, "autoRecommendIntervalFast or autoRecommendFastStart parse error");
            }
        }
        this.whiteUserDataMap = recVideo.whiteUserDataMap;
    }

    public static /* synthetic */ Object ipc$super(RecModel recModel, String str, Object... objArr) {
        if (str.hashCode() == 652452591) {
            return new Integer(super.getViewType());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/datamanager/model/RecModel");
    }

    @Override // com.taobao.taolive.sdk.model.BaseRecModel, com.taobao.taolive.sdk.controller.IRecyclerModel
    public int getViewType() {
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        if (this.recommendCardInfo == null && ((reserveItemCardInfo = this.reserveItemCardInfo) == null || reserveItemCardInfo.cardInfo == null)) {
            return super.getViewType();
        }
        return ContentType.Good_Card.ordinal();
    }

    public RecModel(boolean z, cba cbaVar) {
        VideoInfo c0;
        String queryParameter;
        if (!z && (c0 = up6.c0(vx9.d())) != null) {
            this.liveId = c0.liveId;
            AccountInfo accountInfo = c0.broadCaster;
            if (accountInfo != null) {
                this.accountId = accountInfo.accountId;
            }
            this.imageUrl = c0.coverImg;
            this.actionUrl = u90.h(c0.nativeFeedDetailUrl, z9u.SOURCE_UPDOWNSWITCH);
            String C = iba.C(cbaVar);
            if (!TextUtils.isEmpty(C)) {
                Uri parse = Uri.parse(C);
                if (!TextUtils.isEmpty(parse.getQueryParameter(yj4.PARAM_LIVE_AD_PARAMS))) {
                    this.actionUrl += "&liveAdParams=" + Uri.encode(queryParameter);
                }
                String queryParameter2 = parse.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.actionUrl += "&sjsdItemId=" + queryParameter2;
                }
                String queryParameter3 = parse.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    this.actionUrl += "&timeMovingItemId=" + queryParameter3;
                }
            }
            if (cbaVar != null) {
                this.trackInfo = cbaVar.k().q().H();
            }
            this.mIsSwitchintelligent = false;
            if ("1".equals(c0.roomStatus)) {
                this.liveUrlList = c0.liveUrlList;
            }
            this.h265 = c0.h265;
            this.rateAdapte = c0.rateAdapte;
            this.edgePcdn = c0.edgePcdn;
            this.mediaConfig = c0.mediaConfig;
            this.recommendBindId = c0.recommendBindId;
        }
    }
}
