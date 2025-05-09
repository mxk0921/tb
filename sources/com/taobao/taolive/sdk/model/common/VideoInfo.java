package com.taobao.taolive.sdk.model.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.MillionbabyInfo;
import com.taobao.taolive.sdk.model.interact.ShareDo;
import com.taobao.taolive.sdk.model.interact.Sharer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.t2o;
import tb.y6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIVE_STATUS_END = 1;
    public static final int LIVE_STATUS_LIVE = 0;
    public static final int LIVE_STATUS_NONE_EXISTS = -1;
    public static final int LIVE_STATUS_PAUSE = 3;
    public static final int LIVE_STATUS_UNSTART = 4;
    public static final String ROOM_STATUS_LIVE = "1";
    public static final String ROOM_STATUS_PRELIVE = "0";
    public static final String ROOM_STATUS_REPLAY = "2";
    public static final String STREAM_STATUS_LIVE = "1";
    public static final String STREAM_STATUS_PAUSE = "0";
    public AccessInfo accessInfo;
    public AccountTag accountTag;
    public String activityIds;
    public List<String> activityTypes;
    public AdmireInfo admireInfo;
    public AlimamaEnjoyFirst alimamaEnjoyFirst;
    public String anchorNotice;
    public String avatarPopupUrl;
    public String backgroundImageURL;
    public String backgroundImageUrlV2;
    public boolean bcIdentify;
    public boolean bcLiveLinkage;
    public LiveShowCaseBenefit benefit;
    public String bizCode;
    public BizInfo bizInfo;
    public AccountInfo broadCaster;
    public String cartsEntranceUrl;
    public String channel;
    public JSONObject clientInteracts;
    public boolean closeAddOneComment;
    public boolean closeLeftAndRightSlide;
    public boolean closeUpAndDownSlide;
    public boolean closeXiaochuang;
    public ArrayList<CommentIcon> commentIcons;
    public int commentSwitchStatus;
    public CommonGrayAbConfig commonGrayAbConfig;
    public ArrayList<ConventionItem> conventionList;
    public String coverImg;
    public String coverImg169;
    public ArrayList<LiveItem> curItemList;
    public int curItemNum;
    public CurPreLiveInfo curPreLiveInfo;
    public String dataSource;
    public DegradeInfo degradeInfo;
    public String descInfo;
    public DTGroupBuyingInfo diantaoGroupBuyingInfo;
    public String disPatchTrackInfo;
    public String dispatchItemID;
    public String displayExtParams;
    public DiantaoDisplayInfo displayInfo;
    public DynamicRender dynamicRender;
    public boolean edgePcdn;
    public boolean enableHideWatchNums;
    public boolean enableReplyStyleUpgrade;
    public int extraBizType;
    public List<ExtraGoodsTabItem> extraGoodsTabList;
    public ArrayList<ItemListTabInfo> extraWeexUrlList;
    public FavorHighlightCommentSwitch favorHighlightCommentSwitch;
    public String favorIcon;
    public String favorImg;
    public List<Feedback> feedBackList;
    public boolean fetchCommentsUseLMSDK;
    public boolean fetchCommentsUseMtop;
    public boolean fetchItemCardRealTimeData;
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
    public boolean hasAddCart;
    public String hasItemSearchEntrance;
    public boolean hasSei;
    public String headWeex;
    public String[] hiddenElementList;
    public HashMap<String, String> hierarchyIcons;
    public String holdItemIds;
    public ArrayList<LiveItem> hotItemList;
    public List<ImportantEventItem> importantEventList;
    public InfoCard infoCard;
    public int inputCodeLevel;
    public String inputStreamUrl;
    public boolean intelligence;
    public String intelligenceSceneUrl;
    public ArrayList<String> interacts;
    public boolean isAD;
    public String itemCategoryEnabled;
    public String itemCheck1111;
    public JSONObject itemConfigInfo;
    public String itemHoldType;
    public String itemListShowType;
    public String itemListType;
    public String itemNoBeauty;
    public JSONObject itemTransferInfo;
    public String itemid;
    public long joinCount;
    public boolean landScape;
    public String latestPreLiveId;
    public String latestPreLiveStartTime;
    public String latestPreLiveStartTimeDesc;
    public boolean latestPreUserSubscribe;
    public LinkageInfo linkage;
    public boolean linklivePower;
    public String liveBizType;
    public String liveConfigForStream;
    public String liveId;
    public String liveIntroduction;
    public boolean liveIsdestroy;
    public boolean liveLinkage;
    public ArrayList<LiveMarketingInfo> liveMarketingInfo;
    public LivePlayExtendMap livePlayExtendMap;
    public SubLiveInfo liveSubView;
    public JSONArray liveTags;
    public String liveTemplateId;
    public String liveUrl;
    public String liveUrlHls;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String livexShareCardUrl;
    public String location;
    public int maxItemNum;
    public String mediaConfig;
    public String menuWeex;
    public MillionbabyInfo millionBaby;
    public MoreLiveTips moreLiveTips;
    private y6j mtopResult;
    public String nativeFeedDetailUrl;
    public String nbItemStatus;
    public boolean needFetchCdn;
    public long newRoomType;
    public HashMap<String, String> newtonParamsMap;
    public String noSjsdReason;
    public OfficialLiveInfo officialLiveInfo;
    public String openReportUrl;
    public JSONObject originalData;
    public String paidLiveType;
    public String playErrorRedirectUrl;
    public String playModeLandscape;
    public String playModePortrait;
    public MillionbabyInfo.PlayerSetting playerSetting;
    public JSONObject pmContext;
    public ArrayList<LiveItem> popItemCardList;
    public String positionForVideo;
    public long praiseCount;
    public boolean presentHierarchy;
    public ProjectScreenInfo projectScreenInfo;
    public boolean publishCommentsUseMtop;
    public List<LivePunishInfo> punishInfoList;
    public String pushFeature;
    public String pushUserId;
    public boolean rateAdapte;
    public String recExtParams;
    public String recommendBindId;
    public String recommendReason;
    public String relatedAccountId;
    public String relatedAccountType;
    public String replayCutFrameUrl;
    public String replayUrl;
    public String reportUrl;
    public String reportUrlPopLayer;
    public RoomExtendInfo roomExtend;
    public String roomNum;
    public String roomStatus;
    public int roomType;
    public String sceneType;
    public String screenRecordingAllowed;
    public boolean secKillHitPublishToLiveItemList;
    public boolean secSkillNeedLimit;
    public String secretUserId;
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
    public boolean subscribeQueryEnable;
    public String superLiveAtmosphereUrl;
    public String switchMap;
    public JSONObject switchTagMap;
    public TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
    public long taolivePv;
    public String taolivePvFormat;
    public TBTVProgramInfo tbtvLiveDO;
    public JSONObject tcpContext;
    public HashMap<String, String> theme;
    public String themeAction;
    public String tidbitsUrl;
    public LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
    public String timeMovingPlayUrl;
    public String timeMovingTypeInfo;
    public String timePlayUrl;
    public String title;
    public String toast;
    public List<GoodTopEntrance> topBarEntranceUrl;
    public String topic;
    public long totalJoinCount;
    public String trackInfo;
    public Boolean trialBroadcast;
    public String tvChannelId;
    public int type;
    public boolean useNewRecommendsApi;
    public long viewCount;
    public String viewCountFormat;
    public HashMap<String, String> visitorIdentity;
    public String voiceSilent;
    public int vr3dfovlat;
    public int vr3dfovlng;
    public int vr3dtype;
    public int vrType;
    public WeexBundleUrl weexBundleUrl;
    public boolean groupBuy = true;
    public int status = -1;
    public boolean mIsTimeMove = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AccessInfo implements INetDataObject {
        public boolean access;
        public String accessType;
        public String poplayerUrl;

        static {
            t2o.a(806356258);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AccountTag implements INetDataObject {
        public String backgroundUrl;
        public String tagIcon;
        public String tagName;
        public String title;

        static {
            t2o.a(806356259);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ActivityInfo implements INetDataObject {
        public String activityPosition;
        public boolean onlyOneOpen;
        public String scriptUrl;
        public String scriptUrl4LandScape;
        public String type;

        static {
            t2o.a(806356260);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AdmireInfo implements INetDataObject {
        public String accountJumpUrl;
        public boolean contributionEnabled;
        public boolean enableGiftMultiSend;
        public boolean enableInvisibility;
        public FreeGiftInfo freeGift;
        public String giftIcon;
        public String giftIconNewStyle;
        public boolean giftIsNeedBackGround;
        public boolean hasFansClub;
        public JSONObject invisibilityJumpInfo;
        public boolean isFeedCat;
        public boolean juvenileRefund;

        static {
            t2o.a(806356261);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AlimamaEnjoyFirst implements INetDataObject {
        public String eurl;
        public String ifs;

        static {
            t2o.a(806356262);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BizInfo implements INetDataObject {
        public ArrayList<ActivityInfo> data;

        static {
            t2o.a(806356263);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommentIcon implements INetDataObject {
        public String icon;
        public String name;

        static {
            t2o.a(806356264);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommonGrayAbConfig implements INetDataObject {
        public String enableCleanScreenHideGoodsIcon;

        static {
            t2o.a(806356265);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CurPreLiveInfo implements INetDataObject {
        public String curPreLiveId;
        public String curPreLiveStartTimeDesc;
        public boolean curPreUserSubscribe;

        static {
            t2o.a(806356266);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DTGroupBuyingInfo implements INetDataObject {
        public boolean enableGroupBuying;
        public String iconUrl;
        public boolean isAnimateIcon;
        public String jumpUrl;
        public String tagBackgroundColor;
        public String tagText;
        public String tagTextColor;

        static {
            t2o.a(806356267);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DegradeInfo implements INetDataObject {
        public boolean cdnDegrade;
        public String degradeUrl;

        static {
            t2o.a(806356268);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DiantaoDisplayInfo implements INetDataObject {
        public DiantaoOfficialAtmosphereInfo diantaoOfficialAtmosphereInfo;
        public int diantaoRoomType;

        static {
            t2o.a(806356269);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DiantaoOfficialAtmosphereInfo implements INetDataObject {
        public String taoLiveIcon;

        static {
            t2o.a(806356270);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DynamicRender implements INetDataObject {
        public String h5DynamicRenderUrl;
        public String h5DynamicRenderVersion;
        public String weexDynamicRenderUrl;
        public String weexDynamicRenderUrl4LandScape;

        static {
            t2o.a(806356271);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ExtraGoodsTabItem implements INetDataObject {
        public String anchorTab;
        public String bizType;
        public String showCart;
        public String showOrderList;
        public String showSearch;
        public String showTab;
        public List<String> showTopBarType;
        public String title;
        public String type;
        public String url;

        static {
            t2o.a(806356272);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class FavorHighlightCommentSwitch implements INetDataObject {
        public String enable;

        static {
            t2o.a(806356273);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Feedback implements INetDataObject {
        public static final String TYPE_NOT_WATCH = "BROADCASTER";
        public static final String TYPE_REDUCE_RECOMMEND = "KIND_OF_BROADCASTER";
        public String icon;
        public int id;
        public String text;
        public String type;

        static {
            t2o.a(806356274);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class FirstRenderInfo implements INetDataObject {
        public int highPlayIndex;
        public int lowPlayIndex;
        public long switchDelay;

        static {
            t2o.a(806356275);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class FreeGiftInfo implements INetDataObject {
        public String bizType;
        public String giftIcon;
        public String giftId;
        public boolean isMaxFreeCount;
        public String source;
        public int sumCount;
        public String tabId;
        public float timePerCycle;
        public String toast;

        static {
            t2o.a(806356276);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GoodTopEntrance implements INetDataObject {
        public String entranceUrl;
        public String title;
        public int type;

        static {
            t2o.a(806356277);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class InfoCard implements INetDataObject {
        public String infoCardId;
        public String infoCardItemBusinessInfo;
        public String infoCardType;
        public String infoCardUrl;
        public String infoCardUrlV2;

        static {
            t2o.a(806356278);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ItemListTabInfo implements INetDataObject {
        public String title;
        public String url;

        static {
            t2o.a(806356279);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LiveMarketingInfo implements INetDataObject {
        public String title;
        public String type;
        public String url;

        static {
            t2o.a(806356280);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LivePlayExtendMap implements INetDataObject {
        public String landscapeAspect;

        static {
            t2o.a(806356281);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LivePunishInfo implements INetDataObject {
        public String actionType;
        public String punishType;
        public String reason;

        static {
            t2o.a(806356282);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LiveShowCaseBenefit implements INetDataObject {
        public String benefitItemList;
        public LiveShowCaseDiscount discountUIModel;

        static {
            t2o.a(806356283);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LiveShowCaseDiscount implements INetDataObject {
        public String discountAmount;
        public String discountSubtitle;
        public String discountTitle;
        public String rightText;

        static {
            t2o.a(806356284);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MoreLiveTips implements INetDataObject {
        public String imageUrl;
        public String modType;
        public String picTip;
        public String showEntry;
        public String title;

        static {
            t2o.a(806356285);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class OfficialLiveInfo implements INetDataObject {
        public String accountId;
        public String accountName;
        public String activityName;
        public String activityStatus;
        public String encryptAnchorId;
        public String follow;
        public String officialHeadImg;
        public String officialLive;
        public String officialLiveId;
        public String officialLiveTopic;
        public String praiseCount;
        public String pvCount;
        public List<AccountInfo.BroadCasterTag> viconInfos;
        public List<String> vicons;
        public String viewCountFormat;

        static {
            t2o.a(806356286);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ProjectScreenInfo implements INetDataObject {
        public String enableProjectScreen;
        public String projectScreenPlayUrl;
        public String projectScreenPlayUrlBackup;

        static {
            t2o.a(806356287);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class RoomExtendInfo implements INetDataObject {
        public boolean chaoliu;

        static {
            t2o.a(806356288);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class StaticRender implements INetDataObject {
        public String weexStaticRenderUrl;
        public String weexStaticRenderUrl4LandScape;

        static {
            t2o.a(806356289);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface StreamStatus {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SubLiveInfo implements INetDataObject {
        public String mainIcon;
        public String mainTitle;
        public String subIcon;
        public ArrayList<QualitySelectItem> subLiveUrlList;
        public String subTitle;

        static {
            t2o.a(806356291);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TaoLiveAtmosphereInfo implements INetDataObject {
        public boolean taoLiveHideMenu;
        public String taoLiveHideMenuPic;
        public String taoLiveIcon;
        public String taoLiveIconJumpUrl;
        public String taoLiveLandScapeIcon;
        public String taoLiveLandScapeMenuBackgroundPic;

        static {
            t2o.a(806356292);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WeexBundleUrl implements INetDataObject {
        public String goodsListClient;
        public String hostDashboard;
        public String hostToolsPortrait;
        public String landscapeBundle;
        public String livingBundle;
        public String preBundle;

        static {
            t2o.a(806356293);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356257);
        t2o.a(806355930);
    }

    public y6j getMtopResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6j) ipChange.ipc$dispatch("c1e74f38", new Object[]{this});
        }
        return this.mtopResult;
    }

    public boolean isOfficialLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("982b80cc", new Object[]{this})).booleanValue();
        }
        OfficialLiveInfo officialLiveInfo = this.officialLiveInfo;
        if (officialLiveInfo == null || TextUtils.isEmpty(officialLiveInfo.officialLive) || !"1".equals(this.roomStatus)) {
            return false;
        }
        return true;
    }

    public void setMtopResult(y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511629f2", new Object[]{this, y6jVar});
        } else {
            this.mtopResult = y6jVar;
        }
    }

    public boolean enableProjectScreen() {
        ProjectScreenInfo projectScreenInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3477bad", new Object[]{this})).booleanValue();
        }
        if (!"1".equals(this.roomStatus) || (projectScreenInfo = this.projectScreenInfo) == null || !"true".equals(projectScreenInfo.enableProjectScreen)) {
            return false;
        }
        return !TextUtils.isEmpty(this.projectScreenInfo.projectScreenPlayUrl) || !TextUtils.isEmpty(this.projectScreenInfo.projectScreenPlayUrlBackup);
    }

    public boolean isOfficialType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b5b881a", new Object[]{this})).booleanValue();
        }
        return isOfficialLive() && "official".equals(this.officialLiveInfo.officialLive);
    }
}
