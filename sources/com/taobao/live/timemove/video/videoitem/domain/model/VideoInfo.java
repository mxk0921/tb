package com.taobao.live.timemove.video.videoitem.domain.model;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VideoInfo implements INetDataObject {
    public static final int LIVE_STATUS_END = 1;
    public static final int LIVE_STATUS_LIVE = 0;
    public static final int LIVE_STATUS_NONE_EXISTS = -1;
    public static final int LIVE_STATUS_PAUSE = 3;
    public static final int LIVE_STATUS_UNSTART = 4;
    public AccessInfo accessInfo;
    public AccountTag accountTag;
    public String activityIds;
    public String anchorNotice;
    public String avatarPopupUrl;
    public String backgroundImageURL;
    public boolean bcIdentify;
    public boolean bcLiveLinkage;
    public LiveShowCaseBenefit benefit;
    public String bizCode;
    public BizInfo bizInfo;
    public AccountInfo broadCaster;
    public String channel;
    public boolean closeLeftAndRightSlide;
    public boolean closeUpAndDownSlide;
    public ArrayList<CommentIcon> commentIcons;
    public String coverImg;
    public String coverImg169;
    public ArrayList<LiveItem> curItemList;
    public int curItemNum;
    public DegradeInfo degradeInfo;
    public String descInfo;
    public DynamicRender dynamicRender;
    public boolean edgePcdn;
    public int extraBizType;
    public ArrayList<ItemListTabInfo> extraWeexUrlList;
    public String favorIcon;
    public String favorImg;
    public boolean fetchCommentsUseLMSDK;
    public boolean fetchCommentsUseMtop;
    public boolean fetchItemUseCdn;
    public String fetchItemUseCdnUrl;
    public String fetchMSGCdnUrl;
    public FirstRenderInfo firstRenderInfo;
    public boolean followBroadCaster;
    public boolean forceCommentsUseCdn;
    public boolean fullScreen;
    public String gameId;
    public boolean groupBuyShare;
    public boolean h265;
    public boolean hasSei;
    public String headWeex;
    public String[] hiddenElementList;
    public HashMap<String, String> hierarchyIcons;
    public InfoCard infoCard;
    public int inputCodeLevel;
    public String inputStreamUrl;
    public ArrayList<String> interacts;
    public String itemCheck1111;
    public String itemListType;
    public String itemid;
    public long joinCount;
    public boolean landScape;
    public String latestPreLiveId;
    public boolean linklivePower;
    public String liveId;
    public boolean liveLinkage;
    public ArrayList<LiveMarketingInfo> liveMarketingInfo;
    public SubLiveInfo liveSubView;
    public String liveTemplateId;
    public String liveUrl;
    public String liveUrlHls;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String location;
    public int maxItemNum;
    public String mediaConfig;
    public String menuWeex;
    public MoreLiveTips moreLiveTips;
    public String nativeFeedDetailUrl;
    public boolean needFetchCdn;
    public long newRoomType;
    public String openReportUrl;
    public String playErrorRedirectUrl;
    public String positionForVideo;
    public long praiseCount;
    public boolean presentHierarchy;
    public boolean publishCommentsUseMtop;
    public String pushFeature;
    public String pushUserId;
    public boolean rateAdapte;
    public String relatedAccountId;
    public String relatedAccountType;
    public String replayUrl;
    public String reportUrl;
    public String reportUrlPopLayer;
    public RoomExtendInfo roomExtend;
    public String roomNum;
    public String roomStatus;
    public int roomType;
    public String sceneType;
    public String shareType;
    public String shareUrl;
    public ShareDo shareUrlDO;
    public Sharer sharer;
    public boolean shopHasVip;
    public boolean shopVip;
    public boolean showQueryExplain;
    public LiveItem sourceGood;
    public long startTime;
    public StaticRender staticRender;
    public String streamStatus;
    public String switchMap;
    public TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
    public long taolivePv;
    public HashMap<String, String> theme;
    public String themeAction;
    public String tidbitsUrl;
    public String timeMovingPlayUrl;
    public String timePlayUrl;
    public String title;
    public String topic;
    public long totalJoinCount;
    public String trackInfo;
    public int type;
    public boolean useNewRecommendsApi;
    public long viewCount;
    public HashMap<String, String> visitorIdentity;
    public int vr3dfovlat;
    public int vr3dfovlng;
    public int vr3dtype;
    public int vrType;
    public WeexBundleUrl weexBundleUrl;
    public boolean groupBuy = true;
    public int status = -1;
    public boolean mIsTimeMove = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AccessInfo implements INetDataObject {
        public boolean access;
        public String accessType;
        public String poplayerUrl;

        static {
            t2o.a(779092219);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AccountTag implements INetDataObject {
        public String backgroundUrl;
        public String tagIcon;
        public String tagName;
        public String title;

        static {
            t2o.a(779092220);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ActivityInfo implements INetDataObject {
        public String activityPosition;
        public boolean onlyOneOpen;
        public String scriptUrl;
        public String scriptUrl4LandScape;
        public String type;

        static {
            t2o.a(779092221);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BizInfo implements INetDataObject {
        public ArrayList<ActivityInfo> data;

        static {
            t2o.a(779092222);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class CommentIcon implements INetDataObject {
        public String icon;
        public String name;

        static {
            t2o.a(779092223);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class DegradeInfo implements INetDataObject {
        public boolean cdnDegrade;
        public String degradeUrl;

        static {
            t2o.a(779092224);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class DynamicRender implements INetDataObject {
        public String h5DynamicRenderUrl;
        public String weexDynamicRenderUrl;
        public String weexDynamicRenderUrl4LandScape;

        static {
            t2o.a(779092225);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class FirstRenderInfo implements INetDataObject {
        public int highPlayIndex;
        public int lowPlayIndex;
        public long switchDelay;

        static {
            t2o.a(779092226);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class InfoCard implements INetDataObject {
        public String infoCardId;
        public String infoCardItemBusinessInfo;
        public String infoCardType;
        public String infoCardUrl;
        public String infoCardUrlV2;

        static {
            t2o.a(779092227);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ItemListTabInfo implements INetDataObject {
        public String title;
        public String url;

        static {
            t2o.a(779092228);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LiveMarketingInfo implements INetDataObject {
        public String title;
        public String type;
        public String url;

        static {
            t2o.a(779092229);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LiveShowCaseBenefit implements INetDataObject {
        public String benefitItemList;
        public LiveShowCaseDiscount discountUIModel;

        static {
            t2o.a(779092230);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LiveShowCaseDiscount implements INetDataObject {
        public String discountAmount;
        public String discountSubtitle;
        public String discountTitle;
        public String rightText;

        static {
            t2o.a(779092231);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MoreLiveTips implements INetDataObject {
        public String modType;
        public String picTip;

        static {
            t2o.a(779092232);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class RoomExtendInfo implements INetDataObject {
        public boolean chaoliu;

        static {
            t2o.a(779092233);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StaticRender implements INetDataObject {
        public String weexStaticRenderUrl;
        public String weexStaticRenderUrl4LandScape;

        static {
            t2o.a(779092234);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SubLiveInfo implements INetDataObject {
        public String mainIcon;
        public String mainTitle;
        public String subIcon;
        public ArrayList<QualitySelectItem> subLiveUrlList;
        public String subTitle;

        static {
            t2o.a(779092235);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TaoLiveAtmosphereInfo implements INetDataObject {
        public boolean taoLiveHideMenu;
        public String taoLiveHideMenuPic;
        public String taoLiveIcon;
        public String taoLiveIconJumpUrl;
        public String taoLiveLandScapeIcon;
        public String taoLiveLandScapeMenuBackgroundPic;

        static {
            t2o.a(779092236);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class WeexBundleUrl implements INetDataObject {
        public String goodsListClient;
        public String hostDashboard;
        public String hostToolsPortrait;
        public String landscapeBundle;
        public String livingBundle;
        public String preBundle;

        static {
            t2o.a(779092237);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092218);
        t2o.a(806355930);
    }
}
