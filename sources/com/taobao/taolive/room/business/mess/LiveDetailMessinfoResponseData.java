package com.taobao.taolive.room.business.mess;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.klc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveDetailMessinfoResponseData implements INetDataObject, klc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ActivityInfo activity;
    public Map<String, ArrayList<ActivityInfo>> bizInfo;
    public String hasLive;
    public LiveHeadBanner liveHeadBanner;
    public String powerMessageKey;
    public String snsNick;
    public SponsorData sponsor;
    public String streamStatus;
    public TBTVData tbtvMenuBanner;
    public String timerInteractive;
    public ArrayList<RecVideo> upDownVideo;
    public HashMap<String, String> visitorIdentity;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ActivityInfo implements INetDataObject {
        public String activityPosition;
        public String bizData;
        public String bizType;
        public String enterAnimation;
        public String exitAnimation;
        public String modal;
        public String msgUuid;
        public String onlyOneOpen;
        public String scriptUrl;
        public String type;

        static {
            t2o.a(806355682);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AdEurlParams implements INetDataObject {
        public String eurl;
        public long pay_time;

        static {
            t2o.a(806355683);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Advs implements INetDataObject {
        public long endTime;
        public String logoUrl;
        public String missionId;
        public String shopId;
        public String shopUrl;
        public long startTime;

        static {
            t2o.a(806355684);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AlimamaInfo implements INetDataObject {
        public Map<String, Object> clickInfo;
        public String clickid;
        public String context;
        public String eurl;
        public String ifsUrl;
        public String interactiveid;
        public long pay_time;
        public String pid;

        static {
            t2o.a(806355685);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AlimamaInfo2 implements INetDataObject {
        public ArrayList<String> action_list;
        public String adLiveId;
        public String eurl;
        public String pay_url;

        static {
            t2o.a(806355686);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DxData implements INetDataObject {
        static {
            t2o.a(806355687);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LiveHeadBanner implements INetDataObject {
        public String bkUrl;
        public String iconUrl;
        public String title;

        static {
            t2o.a(806355688);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class RecVideo implements INetDataObject {
        public String accountId;
        public AdEurlParams adEurlParams;
        public AlimamaInfo2 adTransParams;
        public AlimamaInfo alimama;
        public String anchorId;
        public long autoRecommendInterval;
        public long autoRecommendRepeat;
        public HashMap<String, Object> clientReturnMap;
        public String coverImg;
        public boolean edgePcdn;
        public Map<String, String> explainDebugInfo;
        public String extendMap;
        public String feedType;
        public boolean h265;
        public String keyPointId;
        public String liveId;
        public ArrayList<QualitySelectItem> liveUrlList;
        public String mediaConfig;
        public String mediaSourceType;
        public Map<String, String> modelDebugInfo;
        public String nativeFeedDetailUrl;
        public String productType;
        public boolean rateAdapte;
        public String recommendBindId;
        public RecommendCardInfo recommendCardInfo;
        public ReserveItemCardInfo reserveItemCardInfo;
        public List<SideGudieInfo> sideGudieInfo;
        public String sjsdItemId;
        public int supportPreLoad;
        public String timeMovingId;
        public String timeMovingSpfPlayVideo;
        public String title;
        public String trackInfo;
        public String updownPromptText;
        public String updownRecommendDesc;
        public long viewCount;
        public Map<String, Object> whiteUserDataMap;

        static {
            t2o.a(806355689);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class RecommendCardInfo implements INetDataObject {
        public JSONObject dxData;
        public String dxTemplateName;

        static {
            t2o.a(806355690);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ReserveItemCardInfo implements INetDataObject {
        public RecommendCardInfo bottomInfo;
        public RecommendCardInfo cardInfo;

        static {
            t2o.a(806355691);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SponsorData implements INetDataObject {
        public ArrayList<Advs> advs = new ArrayList<>();

        static {
            t2o.a(806355692);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TBTVData implements INetDataObject {
        public String bigLogo;
        public String bubbleBkUrl;
        public String menuUrl;
        public String preLive;
        public String smallLogo;
        public String supportNewLogo;
        public String supportNewUrl;
        public String supportUrl;

        static {
            t2o.a(806355693);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806355681);
        t2o.a(806355930);
        t2o.a(806355680);
    }

    @Override // tb.klc
    public String hasLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8135338", new Object[]{this});
        }
        return this.hasLive;
    }
}
