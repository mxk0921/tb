package com.taobao.android.detail2.core.framework.data.model;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreloadInfo implements Serializable {
    public List<ImagePreloadInfo> images;
    public List<VideoPreloadInfo> videos;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ImagePreloadInfo implements Serializable {
        public String url;

        static {
            t2o.a(352321801);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class VideoPreloadInfo implements Serializable {
        public String url;
        public String videoId;
        public String videoThumbnailURL;

        static {
            t2o.a(352321802);
        }
    }

    static {
        t2o.a(352321800);
    }
}
