package com.taobao.android.litecreator.sdk.editor.data;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.sdk.editor.Serialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiVideoClips extends Serialize {
    public List<MediaResource> data;

    static {
        t2o.a(511705433);
    }

    public MultiVideoClips() {
        this.data = new ArrayList();
    }

    public MultiVideoClips(List<MediaResource> list) {
        new ArrayList();
        this.data = list;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class MediaResource implements Serializable {
        public static final String KEY_CHANGE_SOURCE_ALBUM = "2";
        public static final String KEY_CHANGE_SOURCE_DEFAULT = "0";
        public static final String KEY_CHANGE_SOURCE_RECOMMEND = "1";
        public static final String KEY_CHANGE_SOURCE_RECORD = "3";
        public static final String MEDIA_TYPE_IMAGE = "image";
        public static final String MEDIA_TYPE_VIDEO = "video";
        public Map<String, String> clipExtendInfo;
        public String clipId;
        public String cropRatio;
        public long durationMs;
        public float frameRate;
        public int height;
        public float isMute;
        public int mediaId;
        public String path;
        public String subClipId;
        public int width;
        public long originDurationMs = 0;
        public long clipDurationMs = 0;
        public long startTimeMs = 0;
        public long endTimeMs = 0;
        public JSONObject extra = new JSONObject();
        public String mediaType = "video";
        public String clipSource = "0";

        static {
            t2o.a(511705434);
        }

        public MediaResource() {
        }

        public MediaResource(String str, long j, int i, int i2, float f) {
            this.path = str;
            this.durationMs = j;
            this.width = i;
            this.height = i2;
            this.frameRate = f;
        }
    }
}
