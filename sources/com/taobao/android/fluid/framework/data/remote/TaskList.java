package com.taobao.android.fluid.framework.data.remote;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.l2o;
import tb.q0j;
import tb.t2o;
import tb.vaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaskList implements Serializable {
    @JSONField(name = "tasks")
    public List<Task> tasks;
    @JSONField(name = "userId")
    public String userId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class BackParams implements Serializable {
        @JSONField(name = "subId")
        public String subId;
        @JSONField(name = vaj.KEY_TAB_ID)
        public String tabId;

        static {
            t2o.a(468714237);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Data implements Serializable {
        @JSONField(name = "contentId")
        public String contentId;
        @JSONField(name = "failedCode")
        public String failedCode;
        @JSONField(name = "publishInfo")
        public PublishInfo publishInfo;
        @JSONField(name = "type")
        public String type;

        static {
            t2o.a(468714238);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ExtraParams implements Serializable {
        @JSONField(name = "online_time")
        public String online_time;
        @JSONField(name = "videoHeight")
        public String videoHeight;
        @JSONField(name = "videoWidth")
        public String videoWidth;

        static {
            t2o.a(468714239);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class InputInfo implements Serializable {
        @JSONField(name = q0j.SCENE_MEDIA_PLAYER)
        public List<Media> media;
        @JSONField(name = "music")
        public Music music;

        static {
            t2o.a(468714240);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Media implements Serializable {
        @JSONField(name = "height")
        public String height;
        @JSONField(name = "mediaType")
        public String mediaType;
        @JSONField(name = "path")
        public String path;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "width")
        public String width;

        static {
            t2o.a(468714241);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Music implements Serializable {
        @JSONField(name = "audioId")
        public String audioId;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "path")
        public String path;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "vendorType")
        public int vendorType;

        static {
            t2o.a(468714242);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class PublishInfo implements Serializable {
        @JSONField(name = "extraParams")
        public ExtraParams extraParams;
        @JSONField(name = "inputInfo")
        public InputInfo inputInfo;

        static {
            t2o.a(468714243);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Task implements Serializable {
        @JSONField(name = "backParams")
        public BackParams backParams;
        @JSONField(name = "data")
        public Data data;
        @JSONField(name = "progress")
        public String progress;
        @JSONField(name = "status")
        public String status;
        @JSONField(name = l2o.COL_TASK)
        public String taskId;
        @JSONField(name = "type")
        public int type;

        static {
            t2o.a(468714244);
        }
    }

    static {
        t2o.a(468714236);
    }
}
