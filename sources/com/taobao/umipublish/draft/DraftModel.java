package com.taobao.umipublish.draft;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DraftModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODE_LITE = "lite";
    public static final String MODE_MAIN = "main";
    public static final String MODE_QUICK_PUBLISH = "quick";
    public boolean autoSave;
    public String biz;
    public long creationTimestamp;
    public String draftId;
    public String draftOriginBiz;
    public String draftOriginId;
    public UmiPublishMonitor.UmiPublishTracker.ExtraInfo extraInfo;
    public String failedCode;
    public Meta meta;
    public long modificationTimestamp;
    public String rawJson;
    public String userId;
    public Map<String, String> urlParams = new HashMap();
    public String version = "3";
    public Map<String, String> localPathToCdnUrl = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Content implements Serializable {
        public String text;

        static {
            t2o.a(944766995);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Photo implements Serializable {
        public JSONObject extra_info;
        public String height;
        public String localUrl;
        public String originFilePath;
        public JSONObject stat_info;
        public List<UGCLabel> tags;
        public String taopaiDraftId;
        public String width;
        public String xgcImageDraft;

        static {
            t2o.a(944766997);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class UGCLabel implements Serializable {
        public float posX;
        public float posY;
        public String tagName;
        public int type = 0;
        public int direction = 0;

        static {
            t2o.a(944766998);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Video implements Serializable {
        public int coverHeight;
        public String coverLocalUrl;
        public String coverOriginFile;
        public int coverWidth;
        public JSONObject cover_stat_info;
        public JSONObject extra_info;
        public String videoLocalUrl;
        public String videoOriginFile;
        public JSONObject video_stat_info;
        public String xgcVideoDraft;

        static {
            t2o.a(944766999);
        }
    }

    static {
        t2o.a(944766994);
    }

    public static DraftModel parseFromJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("81b61e0a", new Object[]{str});
        }
        return (DraftModel) JSON.parseObject(str, DraftModel.class);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Meta implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Content content;
        public String draftId;
        public Content shortTitle;
        public String type;
        public String mode = "main";
        public List<Video> videos = new ArrayList();
        public List<Photo> photos = new ArrayList();

        static {
            t2o.a(944766996);
        }

        public Meta(String str) {
            this.type = str;
        }

        @JSONField(serialize = false)
        public JSONObject toJson() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
            }
            return (JSONObject) JSON.toJSON(this);
        }

        public Meta() {
        }
    }
}
