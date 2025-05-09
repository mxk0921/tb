package com.taobao.android.fluid.framework.data.datamodel;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaContentDetailData implements IMTOPDataObject, Serializable {
    public Account account;
    public Map adParam;
    public BGInteractive bginteractive;
    public Map businessExtraMap;
    public String cardType;
    public JSONObject collectionData;
    public Config config;
    public Content content;
    public Map contentAdParams;
    public int contentBottomGap;
    public Map contentPassParams;
    public float continuousSequenceNumber;
    public int currentDataVersion;
    public boolean enableShareUpdate;
    public boolean hasExposed;
    public String id;
    public int index;
    public boolean isLocalPreCacheVideo;
    public PlayletInfo playletInfo;
    public int progressBarBottomGapMore;
    public String publishStatus;
    public int relativeIndex;
    public int sequenceNumber;
    public String shareIconUrl;
    public boolean slideUpIncludeMultiCard;
    public int slideUpTransparency;
    public TopTitle topTitle;
    public String trackInfo;
    public String type;
    public String utLogMapEdge;
    public Map<String, String> utPairs;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class Account implements IMTOPDataObject, Serializable {
        public String avatar;
        public String followCountFmt;
        public Boolean followed;
        public String iconExtraText;
        public String idStr;
        public String keyName;
        public String name;
        public String targetUrl;

        static {
            t2o.a(468714189);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class BGInteractive implements IMTOPDataObject, Serializable {
        public int status = 0;

        static {
            t2o.a(468714190);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Config implements IMTOPDataObject, Serializable {
        public boolean collectionRelatedFlowRec;
        public boolean disableInTimeRec4Content;
        public boolean disableRecord;
        public String forbidPreDownload;
        public String shareUrl;
        public String slidePageUrl;

        static {
            t2o.a(468714191);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class Content implements IMTOPDataObject, Serializable {
        public String coverUrl;
        public List<JSONObject> elements;
        public String errorType;
        public String errorUtpairs;
        public String id;
        public String interactiveId;
        public boolean isSecondPageUpBar;
        public List<String> itemIds;
        public Material material;
        public String music;
        public MusicInfoVO musicInfoVO;
        public List<Pic> picAlbum;
        public String status;
        public String summary;
        public String title;
        public VideoElement videoElement;
        public boolean isValid = true;
        public String errorText = "";
        public String errorUrl = "";

        static {
            t2o.a(468714192);
            t2o.a(589299906);
        }

        private String translateNewLineTlog(String str) {
            if (str == null) {
                return null;
            }
            return str.replace("\n", "[n]");
        }

        public String toString() {
            return "Content{id='" + this.id + "', title='" + translateNewLineTlog(this.title) + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Interaction implements IMTOPDataObject, Serializable {
        public InteractionItem collect;
        public InteractionItem comment;
        public InteractionItem disLike;
        public InteractionItem follow;
        public InteractionItem lead2Purchase;
        public InteractionItem like;
        public InteractionItem oralFollow;
        public InteractionItem play;
        public InteractionItem praise;
        public InteractionItem share;
        public InteractionItem view;

        static {
            t2o.a(468714193);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class InteractionItem implements IMTOPDataObject, Serializable {
        public int count;
        public String countFmt;
        public String link;
        public String namespace;
        public String targetId;

        static {
            t2o.a(468714194);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Material implements IMTOPDataObject, Serializable {
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "loadingUrl")
        public String loadingUrl;
        @JSONField(name = "url")
        public String url;

        static {
            t2o.a(468714195);
            t2o.a(589299906);
        }

        public String toString() {
            return "Material{cover='" + this.cover + "', id='" + this.id + "', url='" + this.url + "', loadingUrl='" + this.loadingUrl + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class MusicInfoVO implements IMTOPDataObject, Serializable {
        public List<AudioResources> audioResources;
        @JSONField(name = "businessExtraMap")
        public Map businessExtraMap;
        public String fromType;
        public MusicParams musicParams;
        public String uploadMusicActor;
        public int uploadMusicId;
        public String uploadMusicName;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class AudioResources implements IMTOPDataObject, Serializable {
            public int audioId;
            public String cacheKey;
            public int duration;
            public int fileSize;
            public String format;
            public int quality;
            public int rate;
            public String type;
            public String url;

            static {
                t2o.a(468714197);
                t2o.a(589299906);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class MusicParams implements IMTOPDataObject, Serializable {
            public PlayPairs playPairs;
            public int venderType;

            static {
                t2o.a(468714198);
                t2o.a(589299906);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class PlayPairs implements IMTOPDataObject, Serializable {
            public long endTime;
            public long startTime;

            static {
                t2o.a(468714199);
                t2o.a(589299906);
            }
        }

        static {
            t2o.a(468714196);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class Pic implements IMTOPDataObject, Serializable {
        public String height;
        public String picType;
        public String type;
        public String url;
        public JSONObject videoResourceJsonObj;
        public String width;

        static {
            t2o.a(468714200);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class PlayletInfo implements IMTOPDataObject, Serializable {
        public String contentPayableImgUrl;
        public boolean free;
        public boolean locked;
        public String tagHeight;
        public String tagWidth;

        static {
            t2o.a(468714201);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TopTitle implements IMTOPDataObject, Serializable {
        @JSONField(name = "iconPosition")
        public String iconPosition;
        @JSONField(name = "icon")
        public String iconUrl;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "type")
        public String type;
        @JSONField(name = "typeTag")
        public String typeTag;

        static {
            t2o.a(468714202);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(468714188);
        t2o.a(589299906);
    }

    public String toString() {
        return "MediaContentDetailData{type='" + this.type + "', content=" + this.content + '}';
    }
}
