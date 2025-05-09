package com.taobao.android.detail2.core.framework.data.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import tb.a7m;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainMediaInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Config config;
    public Data data;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Config implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean autoPlay;
        public boolean enablePreDownload;
        public boolean enableStreamOpti;
        public boolean muted;
        public boolean p2ff;

        static {
            t2o.a(352321795);
        }

        public static Config transformToConfigInfo(JSONObject jSONObject) {
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("1a88ad4b", new Object[]{jSONObject});
            }
            Config config = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                Config config2 = new Config();
                try {
                    config2.autoPlay = jSONObject.getBooleanValue(Constants.Name.AUTO_PLAY);
                    config2.muted = jSONObject.getBooleanValue("muted");
                    config2.p2ff = jSONObject.getBooleanValue("p2ff");
                    config2.enablePreDownload = jSONObject.getBooleanValue("enablePreDownload");
                    config2.enableStreamOpti = jSONObject.getBooleanValue("enableStreamOpti");
                    return config2;
                } catch (Throwable th2) {
                    th = th2;
                    config = config2;
                    txj.f("new_detail异常", "解析视频数据config异常", th);
                    return config;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Data implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bottomAreaHeight;
        public String contentId;
        public String dimension;
        public String interactiveId;
        public boolean isPosterFirstFrame;
        public String source;
        public String type;
        public String url;
        public String userId;
        public JSONObject utParams;
        public String videoId;
        public String videoPlayScenes;
        public org.json.JSONObject videoResourceObj;
        public String videoSource;
        public String videoThumbnailURL;

        static {
            t2o.a(352321796);
        }

        public static Data transformToDataInfo(JSONObject jSONObject) {
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Data) ipChange.ipc$dispatch("fc56653b", new Object[]{jSONObject});
            }
            Data data = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                Data data2 = new Data();
                try {
                    data2.dimension = jSONObject.getString("dimension");
                    JSONObject jSONObject2 = jSONObject.getJSONArray("data").getJSONObject(0);
                    data2.videoThumbnailURL = jSONObject2.getString("videoThumbnailURL");
                    data2.isPosterFirstFrame = jSONObject2.getBooleanValue("isPosterFirstFrame");
                    data2.videoId = jSONObject2.getString("videoId");
                    data2.url = jSONObject2.getString("url");
                    data2.videoSource = jSONObject2.getString("videoSource");
                    data2.videoPlayScenes = jSONObject2.getString(a7m.VIDEO_PLAY_SCENES);
                    data2.source = jSONObject2.getString("source");
                    data2.type = jSONObject2.getString("type");
                    data2.contentId = jSONObject2.getString("contentId");
                    data2.interactiveId = jSONObject2.getString("interactiveId");
                    data2.userId = jSONObject2.getString("userId");
                    data2.utParams = jSONObject.getJSONObject("extra");
                    data2.bottomAreaHeight = jSONObject.getString("bottomAreaHeight");
                    try {
                        data2.videoResourceObj = new org.json.JSONObject(jSONObject2.getString("videoResourceStr"));
                    } catch (Exception e) {
                        txj.f("new_detail异常", "解析播控异常", e);
                    }
                    return data2;
                } catch (Throwable th2) {
                    th = th2;
                    data = data2;
                    txj.f("new_detail异常", "解析视频数据data异常", th);
                    return data;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    static {
        t2o.a(352321794);
    }

    public static MainMediaInfo transformToMainMediaInfo(JSONObject jSONObject) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainMediaInfo) ipChange.ipc$dispatch("91c418e0", new Object[]{jSONObject});
        }
        MainMediaInfo mainMediaInfo = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            MainMediaInfo mainMediaInfo2 = new MainMediaInfo();
            try {
                mainMediaInfo2.type = jSONObject.getString("type");
                mainMediaInfo2.config = Config.transformToConfigInfo(jSONObject.getJSONObject("config"));
                mainMediaInfo2.data = Data.transformToDataInfo(jSONObject.getJSONObject("data"));
                return mainMediaInfo2;
            } catch (Throwable th2) {
                th = th2;
                mainMediaInfo = mainMediaInfo2;
                txj.f("new_detail异常", "解析视频数据异常", th);
                return mainMediaInfo;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
