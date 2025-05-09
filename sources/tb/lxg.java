package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.BroadcasterInfo;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779091988);
    }

    public static MediaData a(SimpleLiveInfo simpleLiveInfo) {
        ArrayList<QualitySelectItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("7c338a5e", new Object[]{simpleLiveInfo});
        }
        if (simpleLiveInfo == null || (arrayList = simpleLiveInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return null;
        }
        MediaData mediaData = new MediaData();
        if (simpleLiveInfo.roomStatus == 1) {
            int size = simpleLiveInfo.liveUrlList.size();
            mediaData.h265 = simpleLiveInfo.h265;
            BroadcasterInfo broadcasterInfo = simpleLiveInfo.broadCaster;
            if (broadcasterInfo != null) {
                mediaData.anchorId = broadcasterInfo.accountId;
            }
            mediaData.liveId = simpleLiveInfo.liveId;
            mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
            mediaData.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
                qualityLiveItem.definition = qualitySelectItem.definition;
                qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
                qualityLiveItem.h265Url = qualitySelectItem.h265Url;
                qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
                qualityLiveItem.name = qualitySelectItem.name;
                qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
                qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
                qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
                qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
                qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
                qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
                qualityLiveItem.recomm = qualitySelectItem.recomm;
                qualityLiveItem.newName = qualitySelectItem.newName;
                mediaData.liveUrlList.add(qualityLiveItem);
            }
        }
        return mediaData;
    }

    public static String b(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde207f7", new Object[]{arrayList});
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = new JSONObject();
                QualitySelectItem qualitySelectItem = arrayList.get(i);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_ARTPURL, (Object) qualitySelectItem.artpUrl);
                jSONObject.put("definition", (Object) qualitySelectItem.definition);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_FLVURL, (Object) qualitySelectItem.flvUrl);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_H265URL, (Object) qualitySelectItem.h265Url);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_HLSURL, (Object) qualitySelectItem.hlsUrl);
                jSONObject.put("name", (Object) qualitySelectItem.name);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl, (Object) qualitySelectItem.wholeH265FlvUrl);
                jSONObject.put(yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl, (Object) qualitySelectItem.wholeH265ArtpUrl);
                jSONObject.put("newDefinition", (Object) qualitySelectItem.newDefinition);
                jSONObject.put("recomm", (Object) qualitySelectItem.recomm);
                jSONObject.put("newName", (Object) qualitySelectItem.newName);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toJSONString();
    }

    public static LiveDetailMessinfoResponseData.RecVideo c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.RecVideo) ipChange.ipc$dispatch("9bb4b8a8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        LiveDetailMessinfoResponseData.RecVideo recVideo = new LiveDetailMessinfoResponseData.RecVideo();
        if (jSONObject.containsKey("liveId")) {
            recVideo.liveId = jSONObject.getString("liveId");
        }
        if (jSONObject.containsKey("accountId")) {
            recVideo.accountId = jSONObject.getString("accountId");
        }
        if (jSONObject.containsKey("recommendBindId")) {
            recVideo.recommendBindId = jSONObject.getString("recommendBindId");
        }
        if (jSONObject.containsKey(yj4.PARAM_COVER_IMG)) {
            recVideo.coverImg = jSONObject.getString(yj4.PARAM_COVER_IMG);
        }
        if (jSONObject.containsKey("viewCount")) {
            recVideo.viewCount = jSONObject.getLong("viewCount").longValue();
        }
        if (jSONObject.containsKey("nativeFeedDetailUrl")) {
            recVideo.nativeFeedDetailUrl = jSONObject.getString("nativeFeedDetailUrl");
        }
        if (jSONObject.containsKey("h265")) {
            recVideo.h265 = jSONObject.getBoolean("h265").booleanValue();
        }
        if (jSONObject.containsKey(yj4.PARAM_MEDIA_INFO_RATEADAPTE)) {
            recVideo.rateAdapte = jSONObject.getBoolean(yj4.PARAM_MEDIA_INFO_RATEADAPTE).booleanValue();
        }
        if (jSONObject.containsKey(yj4.PARAM_SJSD_ITEM_ID)) {
            recVideo.sjsdItemId = jSONObject.getString(yj4.PARAM_SJSD_ITEM_ID);
        }
        if (jSONObject.containsKey("liveUrlList")) {
            recVideo.liveUrlList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
            if (jSONArray != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    QualitySelectItem qualitySelectItem = new QualitySelectItem();
                    qualitySelectItem.artpUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_ARTPURL);
                    qualitySelectItem.definition = jSONObject2.getString("definition");
                    qualitySelectItem.flvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_FLVURL);
                    qualitySelectItem.h265Url = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_H265URL);
                    qualitySelectItem.hlsUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_HLSURL);
                    qualitySelectItem.name = jSONObject2.getString("name");
                    qualitySelectItem.wholeH265FlvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                    qualitySelectItem.wholeH265ArtpUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                    qualitySelectItem.newDefinition = jSONObject2.getString("newDefinition");
                    qualitySelectItem.recomm = jSONObject2.getString("recomm");
                    qualitySelectItem.newName = jSONObject2.getString("newName");
                    recVideo.liveUrlList.add(qualitySelectItem);
                }
            }
        }
        return recVideo;
    }
}
