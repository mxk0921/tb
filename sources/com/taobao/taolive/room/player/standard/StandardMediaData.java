package com.taobao.taolive.room.player.standard;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.MediaData;
import tb.fkx;
import tb.o3s;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StandardMediaData implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public AtmosphereInfo atmosphereInfo;
    public boolean edgePcdn;
    public boolean h265;
    public String liveId;
    public JSONArray liveUrlList;
    public String mediaConfig;
    public String mediaSourceType;
    public boolean rateAdapte;
    public int status;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AtmosphereInfo implements INetDataObject {
        public String resUrl;
        public String title;

        static {
            t2o.a(779093146);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779093145);
        t2o.a(806355930);
    }

    public static StandardMediaData generate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StandardMediaData) ipChange.ipc$dispatch("c38c2d78", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            StandardMediaData standardMediaData = new StandardMediaData();
            if (jSONObject.containsKey("h265")) {
                standardMediaData.h265 = jSONObject.getBoolean("h265").booleanValue();
            }
            if (jSONObject.containsKey(yj4.PARAM_MEDIA_INFO_RATEADAPTE)) {
                standardMediaData.rateAdapte = jSONObject.getBoolean(yj4.PARAM_MEDIA_INFO_RATEADAPTE).booleanValue();
            }
            if (jSONObject.containsKey("accountId")) {
                standardMediaData.anchorId = jSONObject.getString("accountId");
            }
            if (jSONObject.containsKey("liveId")) {
                standardMediaData.liveId = jSONObject.getString("liveId");
            }
            if (TextUtils.isEmpty(standardMediaData.liveId) && jSONObject.containsKey("feedId")) {
                standardMediaData.liveId = jSONObject.getString("feedId");
            }
            if (jSONObject.containsKey("pushFeature")) {
                standardMediaData.mediaSourceType = jSONObject.getString("pushFeature");
            }
            if (jSONObject.containsKey("mediaConfig")) {
                standardMediaData.mediaConfig = jSONObject.getString("mediaConfig");
            }
            if (jSONObject.containsKey("liveUrlList")) {
                standardMediaData.liveUrlList = jSONObject.getJSONArray("liveUrlList");
            }
            return standardMediaData;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MediaData{liveUrlList=" + this.liveUrlList + ", h265=" + this.h265 + ", anchorId=" + this.anchorId + ", liveId=" + this.liveId + ", status=" + this.status + '}';
    }

    public static StandardMediaData generate(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StandardMediaData) ipChange.ipc$dispatch("6a4d8a38", new Object[]{mediaData});
        }
        if (mediaData == null) {
            return null;
        }
        try {
            StandardMediaData standardMediaData = new StandardMediaData();
            standardMediaData.liveUrlList = JSON.parseArray(fkx.i(mediaData.liveUrlList));
            standardMediaData.liveId = mediaData.liveId;
            standardMediaData.anchorId = mediaData.anchorId;
            return standardMediaData;
        } catch (Exception e) {
            o3s.b("StandardMediaData", "StandardMediaData,generate MediaData exception:" + e);
            return null;
        }
    }

    public static StandardMediaData generate(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StandardMediaData) ipChange.ipc$dispatch("1e6e045f", new Object[]{simpleVideoInfo});
        }
        if (simpleVideoInfo == null) {
            return null;
        }
        try {
            StandardMediaData standardMediaData = new StandardMediaData();
            standardMediaData.liveUrlList = JSON.parseArray(fkx.i(simpleVideoInfo.liveUrlList));
            standardMediaData.liveId = simpleVideoInfo.liveId;
            standardMediaData.anchorId = simpleVideoInfo.accountId;
            return standardMediaData;
        } catch (Exception unused) {
            return null;
        }
    }

    public static StandardMediaData generate(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StandardMediaData) ipChange.ipc$dispatch("9aa58015", new Object[]{videoInfo});
        }
        if (videoInfo == null) {
            return null;
        }
        try {
            StandardMediaData standardMediaData = new StandardMediaData();
            standardMediaData.liveUrlList = JSON.parseArray(fkx.i(videoInfo.liveUrlList));
            standardMediaData.liveId = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                standardMediaData.anchorId = accountInfo.accountId;
            }
            return standardMediaData;
        } catch (Exception unused) {
            return null;
        }
    }
}
