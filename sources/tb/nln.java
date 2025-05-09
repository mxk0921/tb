package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.model.TaoLiveKtAdEurlParams;
import com.taobao.kmp.live.updown.model.TaoLiveKtAdTransParams;
import com.taobao.kmp.live.updown.model.TaoLiveKtAlimamaInfo;
import com.taobao.kmp.live.updown.model.TaoLiveKtLiveUrlItem;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092943);
    }

    public static ArrayList<QualitySelectItem> b(List<TaoLiveKtLiveUrlItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ad221bc4", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList<QualitySelectItem> arrayList = new ArrayList<>();
        for (TaoLiveKtLiveUrlItem taoLiveKtLiveUrlItem : list) {
            QualitySelectItem qualitySelectItem = new QualitySelectItem();
            qualitySelectItem.name = taoLiveKtLiveUrlItem.getName();
            qualitySelectItem.flvUrl = taoLiveKtLiveUrlItem.getFlvUrl();
            qualitySelectItem.h265Url = taoLiveKtLiveUrlItem.getH265Url();
            qualitySelectItem.artpUrl = taoLiveKtLiveUrlItem.getArtpUrl();
            qualitySelectItem.hlsUrl = taoLiveKtLiveUrlItem.getHlsUrl();
            qualitySelectItem.wholeH265FlvUrl = taoLiveKtLiveUrlItem.getWholeH265FlvUrl();
            qualitySelectItem.wholeH265ArtpUrl = taoLiveKtLiveUrlItem.getWholeH265ArtpUrl();
            qualitySelectItem.definition = taoLiveKtLiveUrlItem.getDefinition();
            qualitySelectItem.bfrtcUrl = taoLiveKtLiveUrlItem.getBfrtcUrl();
            qualitySelectItem.rtcLiveUrl = taoLiveKtLiveUrlItem.getRtcLiveUrl();
            qualitySelectItem.liveUrlMiniBfrtc = taoLiveKtLiveUrlItem.getLiveUrlMiniBfrtc();
            qualitySelectItem.unit = taoLiveKtLiveUrlItem.getUnit();
            qualitySelectItem.unitType = taoLiveKtLiveUrlItem.getUnitType();
            qualitySelectItem.dataTracks = taoLiveKtLiveUrlItem.getDataTracks();
            qualitySelectItem.newDefinition = taoLiveKtLiveUrlItem.getNewDefinition();
            qualitySelectItem.recomm = taoLiveKtLiveUrlItem.getRecomm();
            qualitySelectItem.newName = taoLiveKtLiveUrlItem.getNewName();
            qualitySelectItem.liveStreamStatsInfo = fkx.i(taoLiveKtLiveUrlItem.getLiveStreamStatsInfo());
            qualitySelectItem.additionUrlMap = fkx.i(taoLiveKtLiveUrlItem.getAdditionUrlMap());
            qualitySelectItem.extInfo = taoLiveKtLiveUrlItem.getExtInfo();
            arrayList.add(qualitySelectItem);
        }
        return arrayList;
    }

    public static LiveDetailMessinfoResponseData.RecommendCardInfo c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.RecommendCardInfo) ipChange.ipc$dispatch("976f2cf4", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = new LiveDetailMessinfoResponseData.RecommendCardInfo();
        if (map.get("dxTemplateName") instanceof String) {
            recommendCardInfo.dxTemplateName = (String) map.get("dxTemplateName");
        }
        if (map.get(ksl.PARSER_KEY_DX_DATA) instanceof JSONObject) {
            recommendCardInfo.dxData = (JSONObject) map.get(ksl.PARSER_KEY_DX_DATA);
        }
        return recommendCardInfo;
    }

    public static LiveDetailMessinfoResponseData.ReserveItemCardInfo d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.ReserveItemCardInfo) ipChange.ipc$dispatch("fe42f4e", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo = new LiveDetailMessinfoResponseData.ReserveItemCardInfo();
        try {
            if (map.get("cardInfo") instanceof Map) {
                reserveItemCardInfo.cardInfo = c((Map) map.get("cardInfo"));
            }
            if (map.get("bottomInfo") instanceof Map) {
                reserveItemCardInfo.bottomInfo = c((Map) map.get("bottomInfo"));
            }
        } catch (Exception e) {
            x5t.h("RecModelConvertUtil", "ReserveItemCardInfoConvert catchException = " + e.getMessage());
        }
        return reserveItemCardInfo;
    }

    public static LiveDetailMessinfoResponseData.AdEurlParams e(TaoLiveKtAdEurlParams taoLiveKtAdEurlParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AdEurlParams) ipChange.ipc$dispatch("3f008225", new Object[]{taoLiveKtAdEurlParams});
        }
        if (taoLiveKtAdEurlParams == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.AdEurlParams adEurlParams = new LiveDetailMessinfoResponseData.AdEurlParams();
        adEurlParams.eurl = taoLiveKtAdEurlParams.getEurl();
        adEurlParams.pay_time = taoLiveKtAdEurlParams.getPay_time();
        return adEurlParams;
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo2 f(TaoLiveKtAdTransParams taoLiveKtAdTransParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("ac76e8ba", new Object[]{taoLiveKtAdTransParams});
        }
        if (taoLiveKtAdTransParams == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2 = new LiveDetailMessinfoResponseData.AlimamaInfo2();
        if (taoLiveKtAdTransParams.getAction_list() != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            alimamaInfo2.action_list = arrayList;
            arrayList.addAll(taoLiveKtAdTransParams.getAction_list());
        }
        alimamaInfo2.pay_url = taoLiveKtAdTransParams.getPay_url();
        alimamaInfo2.adLiveId = taoLiveKtAdTransParams.getAdLiveId();
        alimamaInfo2.eurl = taoLiveKtAdTransParams.getEurl();
        return alimamaInfo2;
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo g(TaoLiveKtAlimamaInfo taoLiveKtAlimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("e86ed918", new Object[]{taoLiveKtAlimamaInfo});
        }
        if (taoLiveKtAlimamaInfo == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = new LiveDetailMessinfoResponseData.AlimamaInfo();
        alimamaInfo.clickid = taoLiveKtAlimamaInfo.getClickid();
        alimamaInfo.interactiveid = taoLiveKtAlimamaInfo.getInteractiveid();
        alimamaInfo.context = taoLiveKtAlimamaInfo.getContext();
        alimamaInfo.ifsUrl = taoLiveKtAlimamaInfo.getIfsUrl();
        alimamaInfo.pid = taoLiveKtAlimamaInfo.getPid();
        alimamaInfo.pay_time = taoLiveKtAlimamaInfo.getPay_time();
        alimamaInfo.clickInfo = taoLiveKtAlimamaInfo.getClickInfo();
        alimamaInfo.eurl = taoLiveKtAlimamaInfo.getEurl();
        return alimamaInfo;
    }

    public static Map<String, String> h(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7546e368", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                hashMap.put(entry.getKey(), (String) value);
            }
        }
        return hashMap;
    }

    public static RecModel a(TaoLiveKtSwitchModel taoLiveKtSwitchModel, cba cbaVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("cdf89b2", new Object[]{taoLiveKtSwitchModel, cbaVar});
        }
        RecModel recModel = new RecModel(true, cbaVar);
        if (taoLiveKtSwitchModel == null) {
            return recModel;
        }
        recModel.mTaoLiveKtSwitchModel = taoLiveKtSwitchModel;
        recModel.originData = taoLiveKtSwitchModel.getOriginData();
        recModel.isFirst = taoLiveKtSwitchModel.isFirst();
        recModel.visit = taoLiveKtSwitchModel.getVisit();
        recModel.liveId = taoLiveKtSwitchModel.getLiveId();
        recModel.accountId = taoLiveKtSwitchModel.getAccountId();
        recModel.imageUrl = taoLiveKtSwitchModel.getCoverImg();
        if (taoLiveKtSwitchModel.getActionUrl() != null) {
            str = taoLiveKtSwitchModel.getActionUrl();
        } else {
            str = u90.h(taoLiveKtSwitchModel.getNativeFeedDetailUrl(), z9u.SOURCE_UPDOWNSWITCH);
        }
        recModel.actionUrl = str;
        taoLiveKtSwitchModel.setActionUrl(str);
        recModel.trackInfo = taoLiveKtSwitchModel.getTrackInfo();
        recModel.alimama = g(taoLiveKtSwitchModel.getAlimama());
        recModel.adTransParams = f(taoLiveKtSwitchModel.getAdTransParams());
        recModel.adEurlParams = e(taoLiveKtSwitchModel.getAdEurlParams());
        recModel.mIsSwitchintelligent = false;
        recModel.liveUrlList = b(taoLiveKtSwitchModel.getLiveUrlList());
        recModel.h265 = taoLiveKtSwitchModel.getH265();
        recModel.rateAdapte = taoLiveKtSwitchModel.getRateAdapte();
        recModel.edgePcdn = taoLiveKtSwitchModel.getEdgePcdn();
        recModel.mediaConfig = taoLiveKtSwitchModel.getMediaConfig();
        recModel.anchorId = taoLiveKtSwitchModel.getAnchorId();
        recModel.mediaSourceType = taoLiveKtSwitchModel.getMediaSourceType();
        recModel.updownPromptText = taoLiveKtSwitchModel.getUpdownPromptText();
        recModel.extendMap = taoLiveKtSwitchModel.getExtendMap();
        recModel.viewCount = taoLiveKtSwitchModel.getViewCount();
        recModel.supportPreLoad = taoLiveKtSwitchModel.getSupportPreLoad();
        recModel.feedType = taoLiveKtSwitchModel.getFeedType();
        recModel.clientReturnMap = taoLiveKtSwitchModel.getClientReturnMap();
        recModel.recommendBindId = taoLiveKtSwitchModel.getRecommendBindId();
        recModel.timeMovingId = taoLiveKtSwitchModel.getTimeMovingId();
        recModel.sjsdItemId = taoLiveKtSwitchModel.getSjsdItemId();
        recModel.keyPointId = taoLiveKtSwitchModel.getKeyPointId();
        recModel.productType = taoLiveKtSwitchModel.getProductType();
        recModel.timeMovingSpfPlayVideo = taoLiveKtSwitchModel.getTimeMovingSpfPlayVideo();
        recModel.recommendCardInfo = c(taoLiveKtSwitchModel.getRecommendCardInfo());
        recModel.reserveItemCardInfo = d(taoLiveKtSwitchModel.getReserveItemCardInfo());
        recModel.modelDebugInfo = h(taoLiveKtSwitchModel.getModelDebugInfo());
        recModel.whiteUserDataMap = taoLiveKtSwitchModel.getWhiteUserDataMap();
        return recModel;
    }
}
