package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356227);
    }

    public static MediaData b(VideoInfo videoInfo) {
        ArrayList<QualitySelectItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("57750bb3", new Object[]{videoInfo});
        }
        if (videoInfo == null || (arrayList = videoInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return null;
        }
        MediaData mediaData = new MediaData();
        int i = videoInfo.status;
        if (i != 0) {
            if (i == 1) {
                mediaData.h265 = false;
                mediaData.rateAdapte = false;
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    mediaData.anchorId = accountInfo.accountId;
                }
                mediaData.liveId = videoInfo.liveId;
                mediaData.mediaSourceType = videoInfo.pushFeature;
                mediaData.liveUrlList = new ArrayList<>();
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.replayUrl = videoInfo.replayUrl;
                mediaData.liveUrlList.add(qualityLiveItem);
            } else if (i != 3) {
                if (i == 4) {
                    mediaData.h265 = false;
                    mediaData.rateAdapte = false;
                    AccountInfo accountInfo2 = videoInfo.broadCaster;
                    if (accountInfo2 != null) {
                        mediaData.anchorId = accountInfo2.accountId;
                    }
                    mediaData.liveId = videoInfo.liveId;
                    mediaData.mediaSourceType = videoInfo.pushFeature;
                    mediaData.liveUrlList = new ArrayList<>();
                    MediaData.QualityLiveItem qualityLiveItem2 = new MediaData.QualityLiveItem();
                    qualityLiveItem2.videoUrl = videoInfo.tidbitsUrl;
                    mediaData.liveUrlList.add(qualityLiveItem2);
                }
            }
            return mediaData;
        }
        int size = videoInfo.liveUrlList.size();
        mediaData.h265 = videoInfo.h265;
        mediaData.rateAdapte = videoInfo.rateAdapte;
        mediaData.edgePcdn = videoInfo.edgePcdn;
        mediaData.mediaConfig = videoInfo.mediaConfig;
        AccountInfo accountInfo3 = videoInfo.broadCaster;
        if (accountInfo3 != null) {
            mediaData.anchorId = accountInfo3.accountId;
        }
        mediaData.liveId = videoInfo.liveId;
        mediaData.mediaSourceType = videoInfo.pushFeature;
        mediaData.liveUrlList = new ArrayList<>();
        for (int i2 = 0; i2 < size; i2++) {
            QualitySelectItem qualitySelectItem = videoInfo.liveUrlList.get(i2);
            MediaData.QualityLiveItem qualityLiveItem3 = new MediaData.QualityLiveItem();
            qualityLiveItem3.artpUrl = qualitySelectItem.artpUrl;
            qualityLiveItem3.definition = qualitySelectItem.definition;
            qualityLiveItem3.flvUrl = qualitySelectItem.flvUrl;
            qualityLiveItem3.h265Url = qualitySelectItem.h265Url;
            qualityLiveItem3.hlsUrl = qualitySelectItem.hlsUrl;
            qualityLiveItem3.name = qualitySelectItem.name;
            qualityLiveItem3.bfrtcUrl = qualitySelectItem.bfrtcUrl;
            qualityLiveItem3.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
            qualityLiveItem3.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
            qualityLiveItem3.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
            qualityLiveItem3.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
            qualityLiveItem3.unit = qualitySelectItem.unit;
            qualityLiveItem3.unitType = qualitySelectItem.unitType;
            qualityLiveItem3.newDefinition = qualitySelectItem.newDefinition;
            qualityLiveItem3.recomm = qualitySelectItem.recomm;
            qualityLiveItem3.newName = qualitySelectItem.newName;
            qualityLiveItem3.liveStreamStatsInfo = qualitySelectItem.liveStreamStatsInfo;
            qualityLiveItem3.additionUrlMap = qualitySelectItem.additionUrlMap;
            qualityLiveItem3.extInfo = qualitySelectItem.extInfo;
            mediaData.liveUrlList.add(qualityLiveItem3);
            if (i2 == 0) {
                mediaData.dataTracks = qualitySelectItem.dataTracks;
            }
        }
        return mediaData;
    }

    public static MediaData a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("a90a96", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            MediaData mediaData = new MediaData();
            if (jSONObject.containsKey("h265")) {
                mediaData.h265 = jSONObject.getBoolean("h265").booleanValue();
            }
            if (jSONObject.containsKey(yj4.PARAM_MEDIA_INFO_RATEADAPTE)) {
                mediaData.rateAdapte = jSONObject.getBoolean(yj4.PARAM_MEDIA_INFO_RATEADAPTE).booleanValue();
            }
            if (jSONObject.containsKey("accountId")) {
                mediaData.anchorId = jSONObject.getString("accountId");
            }
            if (jSONObject.containsKey("liveId")) {
                mediaData.liveId = jSONObject.getString("liveId");
            }
            if (TextUtils.isEmpty(mediaData.liveId) && jSONObject.containsKey("feedId")) {
                mediaData.liveId = jSONObject.getString("feedId");
            }
            if (jSONObject.containsKey("pushFeature")) {
                mediaData.mediaSourceType = jSONObject.getString("pushFeature");
            }
            if (jSONObject.containsKey("mediaConfig")) {
                mediaData.mediaConfig = jSONObject.getString("mediaConfig");
            }
            mediaData.liveUrlList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
            if (jSONArray != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                    qualityLiveItem.artpUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_ARTPURL);
                    qualityLiveItem.definition = jSONObject2.getString("definition");
                    qualityLiveItem.flvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_FLVURL);
                    qualityLiveItem.h265Url = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_H265URL);
                    qualityLiveItem.hlsUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_HLSURL);
                    qualityLiveItem.name = jSONObject2.getString("name");
                    qualityLiveItem.wholeH265FlvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                    qualityLiveItem.wholeH265ArtpUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                    qualityLiveItem.bfrtcUrl = jSONObject2.getString(MediaConstant.BFRTC_URL_NAME);
                    qualityLiveItem.liveUrlMiniBfrtc = jSONObject2.getString("liveUrlMiniBfrtc");
                    qualityLiveItem.rtcLiveUrl = jSONObject2.getString(MediaConstant.RTCLIVE_URL_NAME);
                    qualityLiveItem.unit = jSONObject2.getString(mh1.PRICE_UNIT);
                    qualityLiveItem.unitType = jSONObject2.getString("unitType");
                    qualityLiveItem.newDefinition = jSONObject2.getString("newDefinition");
                    qualityLiveItem.recomm = jSONObject2.getString("recomm");
                    qualityLiveItem.newName = jSONObject2.getString("newName");
                    qualityLiveItem.liveStreamStatsInfo = jSONObject2.getString("liveStreamStatsInfo");
                    qualityLiveItem.additionUrlMap = jSONObject2.getString("additionUrlMap");
                    qualityLiveItem.extInfo = jSONObject2.getString("extInfo");
                    mediaData.liveUrlList.add(qualityLiveItem);
                    if (i == 0) {
                        mediaData.dataTracks = jSONObject2.getString("dataTracks");
                    }
                }
            }
            return mediaData;
        } catch (Exception unused) {
            return null;
        }
    }
}
