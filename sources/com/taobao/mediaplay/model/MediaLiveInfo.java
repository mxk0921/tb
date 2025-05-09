package com.taobao.mediaplay.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.Serializable;
import java.util.ArrayList;
import tb.mh1;
import tb.t2o;
import tb.tfb;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaLiveInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public boolean edgePcdn;
    public boolean h265;
    public String liveId;
    public ArrayList<QualityLiveItem> liveUrlList;
    public JSONArray liveUrlListJson;
    public MediaConfig mMediaConfigData;
    public String mediaConfig;
    public String mediaSourceType;
    public boolean rateAdapte;

    static {
        t2o.a(774897776);
    }

    public void updateLiveUrlList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c03bd47", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            try {
                this.liveUrlList = new ArrayList<>();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    QualityLiveItem qualityLiveItem = new QualityLiveItem();
                    qualityLiveItem.artpUrl = jSONObject.getString(yj4.PARAM_MEDIA_INFO_ARTPURL);
                    qualityLiveItem.definition = jSONObject.getString("definition");
                    qualityLiveItem.flvUrl = jSONObject.getString(yj4.PARAM_MEDIA_INFO_FLVURL);
                    qualityLiveItem.h265Url = jSONObject.getString(yj4.PARAM_MEDIA_INFO_H265URL);
                    qualityLiveItem.hlsUrl = jSONObject.getString(yj4.PARAM_MEDIA_INFO_HLSURL);
                    qualityLiveItem.name = jSONObject.getString("name");
                    qualityLiveItem.wholeH265FlvUrl = jSONObject.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                    qualityLiveItem.wholeH265ArtpUrl = jSONObject.getString(yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                    qualityLiveItem.bfrtcUrl = jSONObject.getString(MediaConstant.BFRTC_URL_NAME);
                    qualityLiveItem.liveUrlMiniBfrtc = jSONObject.getString("liveUrlMiniBfrtc");
                    qualityLiveItem.rtcLiveUrl = jSONObject.getString(MediaConstant.RTCLIVE_URL_NAME);
                    qualityLiveItem.unit = jSONObject.getString(mh1.PRICE_UNIT);
                    qualityLiveItem.unitType = jSONObject.getString("unitType");
                    qualityLiveItem.newDefinition = jSONObject.getString("newDefinition");
                    qualityLiveItem.recomm = jSONObject.getString("recomm");
                    qualityLiveItem.newName = jSONObject.getString("newName");
                    if (jSONObject.getString("liveStreamStatsInfo") != null) {
                        qualityLiveItem.liveStreamStatsInfo = (LiveStreamStatsInfo) JSON.parseObject(jSONObject.getString("liveStreamStatsInfo"), LiveStreamStatsInfo.class);
                    }
                    if (jSONObject.getString("additionUrlMap") != null) {
                        qualityLiveItem.additionUrlMap = jSONObject.getString("additionUrlMap");
                    }
                    if (jSONObject.getString("extInfo") != null) {
                        qualityLiveItem.extInfo = jSONObject.getString("extInfo");
                    }
                    this.liveUrlList.add(qualityLiveItem);
                }
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updateMediaLiveInfo success.");
            } catch (Exception e) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updateMediaLiveInfoWithPCResult failed!" + e.toString());
            }
        }
    }
}
