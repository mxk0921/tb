package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f24731a;
    public static final String b = "https://img.alicdn.com/imgextra/i3/O1CN01Dm6qQK1qIgdTWsuGp_!!6000000005473-2-tps-90-90.png";

    static {
        t2o.a(295700127);
    }

    public static boolean A(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f504e56", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var == null || ux9Var.A() == null || ux9Var.A().abilityCompontent == null || !((ibt) ux9Var.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast)) {
            return false;
        }
        return true;
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d87c6d5", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableReplayRate", Boolean.TRUE).booleanValue();
    }

    public static long A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7a71a4a", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "taoliveGoodsRecommendPushItemDelayTime", "15"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bdf4994", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableDisplaySupportKandianChannel", true) || !d4s.e("enableKandianAlive", true)) {
            return false;
        }
        return true;
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e60413d7", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableReplayRateDegrade", Boolean.FALSE).booleanValue();
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae21674", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableDoubleClickFavorOpt", "true"));
    }

    public static String C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a574627a", new Object[0]);
        }
        if (giv.c().b()) {
            return "20240625";
        }
        return i9l.b("tblive", "enableSMLDATAppVersion", "20241211");
    }

    public static boolean C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3b1a36", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "useNewNativeGoodList2", "true")) && !q1();
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1668a4c5", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableExplainGoodsBehaviorReport", "true"));
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("939e365e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSabAtmosphere", "true"));
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3430d1", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowGiftVoteBanner", "true"));
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3efc464e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowGiftWishBanner", "true"));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b097df", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableFavorAnimDelayShow", "true"));
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b33ded9", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowRankLiveEntrance", "true"));
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("511351b3", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowRightBanner", "true"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("105d1554", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixAnchorFrameLeak", true);
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("116c7533", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableSimilarRecommendGuide", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f72bf98", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixBlankFrameHide", true);
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81c2d5f6", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSmartLayer", "true"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d5f06", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixUserTaskInterceptTouchEvent", true);
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b6e018", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSmartLayerFrameContext", "true"));
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72234deb", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableTab2UpDownNextLiveGuide", "true"));
    }

    public static boolean N(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b777804", new Object[]{ux9Var})).booleanValue();
        }
        if (!or.a(ux9Var, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || !yga.e()) {
            return false;
        }
        return true;
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5c7039", new Object[0])).booleanValue();
        }
        if (f24731a == null) {
            if (v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableTaoLiveDelayComponents", "true"))) {
                z = true;
            }
            f24731a = Boolean.valueOf(z);
        }
        return f24731a.booleanValue();
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aed56ad", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableGiftBannerShowPriorityConfig", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d222af2e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("goodlist", "enableHongbaoUrge", "true"));
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b850c468", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableUpDownNextLiveGuide", "true"));
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66610c9b", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableGuideRuleCheckPolling", "true"));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("262147fb", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableH5ProfileCardPrerender", "true"));
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1ee217", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableWidgetOpt", "true")) && !giv.c().b();
    }

    public static boolean S(VideoInfo videoInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e9761f", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (jSONObject = videoInfo.itemConfigInfo) == null || jSONObject.getBooleanValue("enableShowImportantEvent")) {
            return false;
        }
        return true;
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf20095", new Object[0])).booleanValue();
        }
        return d4s.e("enableCleanScreenHideGoodsIcon", true);
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd6003cd", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(i9l.b("tblive", "fixUploadCaseFeedList", "true"));
        }
        return true;
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9191bb50", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableHideGoodsPopTask", "true"));
    }

    public static String U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8178d2a2", new Object[0]);
        }
        return v2s.o().p().b("tblive", "belovedFansEnterBgImage", "https://gw.alicdn.com/imgextra/i3/O1CN012XgIrC1wVrZInwtkT_!!6000000006314-54-tps-630-66.apng");
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ef883b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableHighlightTcp", "true"));
    }

    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48eb0d2d", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableItemQueryParams", "false"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb1ee1d8", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableHotItemSubscribe", "true"));
    }

    public static int W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70ae1001", new Object[0])).intValue();
        }
        return yqq.o(i9l.b("tblive", "explainGoodsBehaviorListMaxSize", "15"));
    }

    public static long X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358b4e4f", new Object[0])).longValue();
        }
        return yqq.n(i9l.b("tblive", "favorAnimDelayShowTime", IDecisionResult.ENGINE_ERROR), 5000L);
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56b3ca88", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "NeedCleanScreenForImmersiveExp", "true")) && yqq.h(v2s.o().c().b("TBLiveCleanScreenExp", "NeedCleanScreenForImmersiveExp", "enabled", "true"));
    }

    public static String Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("683c47a4", new Object[0]);
        }
        return v2s.o().p().b("tblive", "giftBannerShowPriorityConfig", "{\"giftWish\":\"100\",\"giftVote\":\"200\",\"giftGallery\":\"200\"}");
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("146efd40", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableImportantFrameOffline", "true")) && yqq.h(v2s.o().c().c("taolive", "enableChatNoiseReduction", "enable", "true"));
    }

    public static String Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91fafe2f", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "goodsDefaultCpsTcpInfo", "{\"taobao\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"},\"tmall\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"}}");
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f3284f7", new Object[0]);
        }
        return v2s.o().p().b("tblive", "avatarFooterIconUrl", "https://gw.alicdn.com/imgextra/i2/O1CN01EwzzbC1gPQIDJ8PSf_!!6000000004134-2-tps-16-26.png");
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a97206", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().c().b("taolive", "enableImportantHiddenForLandscape", "enable", "true"));
    }

    public static int a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d369e2ba", new Object[0])).intValue();
        }
        return yqq.l(i9l.b("tblive", "h5ProfileCardPrerenderDelay", "7"), 7);
    }

    public static Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6b628425", new Object[0]);
        }
        return Integer.valueOf(yqq.l(i9l.b("tblive", "bottomSlideNewGuideHeightNew", "172"), 172));
    }

    public static int b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a5e6917", new Object[0])).intValue();
        }
        return yqq.l(i9l.b("tblive", "h5ProfileCardPrerenderMaxRecordCount", "10"), 10);
    }

    public static Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("51ef596c", new Object[0]);
        }
        return Integer.valueOf(yqq.l(i9l.b("tblive", "bottomSlideNewGuideHeightOld", "188"), 188));
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee70f11b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL, "true"));
    }

    public static int c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b70da0c", new Object[0])).intValue();
        }
        return yqq.l(i9l.b("tblive", "hotSaleDelayTime", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE), 20);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ed05c7", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "checkGoodsDefaultCpsTcpInfo", "true"));
    }

    public static String d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be24170e", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "needReplaceInsideUrls", "h5.m.taobao.com/awp/core/detail.htm");
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbd14e46", new Object[0])).intValue();
        }
        return yqq.l(i9l.b("tblive", "cleanScreenGuideShowDelayTime", "60"), 60);
    }

    public static int e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e68d4122", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "sabAtmosphereLimitTime", "10"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8e86cc1", new Object[0])).booleanValue();
        }
        return d4s.e("enableAtTopFix", true);
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea809b2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLandscapeSeekBarSlideFix", "true"));
    }

    public static int f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7616e552", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "sabAtmosphereMaxShowFrequency", "1"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cda556ee", new Object[0])).booleanValue();
        }
        u9b c = v2s.o().c();
        if (c != null) {
            return "true".equals(c.b("taolive", "displayMessageCard", "enable", "true"));
        }
        return true;
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3b29a4", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableLandscapeWidgetFix", "true"));
    }

    public static String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c3d9a84", new Object[0]);
        }
        return v2s.o().p().b("tblive", "tcpAddSabAtmosphereKeyList", "showPriority,isStressShow,reasonRightType,reasonSubRightType,sabItemLevel,smallCardItemType,realtimeBoostType,millionGroupBuy,tmcFlashDrop,selfFlashDrop,tmcFlashDrop_ordinary,tmcFlashDrop_Official,itemType");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b2c9ebb", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enable88VipEntrance", "true"));
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c32b1d", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableLiveAvatarDestroy", "true"));
    }

    public static String h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e20f7", new Object[0]);
        }
        return v2s.o().p().b("tblive", "superedFansEnterBgImage", "https://gw.alicdn.com/imgextra/i3/O1CN01nBDioM21jfaZPRj75_!!6000000007021-54-tps-630-66.apng");
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e004a7", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enable_live_insidedetail", "true"));
    }

    public static int i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffd81c90", new Object[0])).intValue();
        }
        return vvs.e("tblive", "taskCountSwithRadomMax", 5);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57f234e0", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableAddHotAtmosphereTcpTrace", "true"));
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94c7a0fb", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveItemPopViewAnimation", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0b1336", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableAddNewtonsEncryptionParams", "true"));
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("821024b", new Object[0])).booleanValue();
        }
        return d4s.e("enableMergeNoticeFrame", true);
    }

    public static String l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa0c10dd", new Object[0]);
        }
        if (v2s.o().p() == null) {
            return b;
        }
        return v2s.o().p().b("tblive", "widgetIconUrl", b);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32b87616", new Object[0])).booleanValue();
        }
        return d4s.e("enableAnchorInfoFlashFix", true);
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881f521b", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableMixProfile", "true"));
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0282986", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "hideAliveWhenNewUserPanelShow", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c97954", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableAppendNewtonsParams", "true"));
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9743b4", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableModifyNewtonsParams", "true"));
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc55c68c", new Object[0])).booleanValue();
        }
        return d4s.e("disableAvatarViewInflate", false);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8dd40e8", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableBottomAtmosphereClickFix", "true"));
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c9b6838", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableMonitorSizeChangeFix", "true"));
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f532d2d2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enable_insidedetail_low", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b09bf0a", new Object[0])).booleanValue();
        }
        return d4s.e("enableChatAIInteractive", true);
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a22961be", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableNTPFrameTime", "true"));
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("183994bb", new Object[0])).booleanValue();
        }
        return d4s.e("isRevertDoubleSubscribeInstall", false);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ab26167", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableChatFrameHeightFix", "true"));
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf63e6", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableNewGLPageShowBottomAtmosphere", "true"));
    }

    public static boolean q1() {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d00a711e", new Object[0])).booleanValue();
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (!(c0 == null || (accountInfo = c0.broadCaster) == null)) {
            String str = accountInfo.accountId;
            try {
                for (String str2 : v2s.o().p().b("tblive", "topAnchors", "null").split(";")) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8d4de0f", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableNewUserZoneCard", "true"));
    }

    public static String r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef6eb84b", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "liveRoomExtraSaltParam", "581BEC0C930BF1AFEB40B4A08C8FB142");
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("444896db", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableOfficialAnchorInfoUIFix", "true"));
    }

    public static boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("472171ec", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowGiftGalleryBanner", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f87bafad", new Object[0])).booleanValue();
        }
        return d4s.e("enableChatViewConfig", true);
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9743dd1f", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableOfficialBusinessParams", "true"));
    }

    public static boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e24efc", new Object[0])).booleanValue();
        }
        if (giv.c().b()) {
            return false;
        }
        if (v2s.o().p() != null) {
            return yqq.h(i9l.b("tblive", "officialLiveSwitchCheckAtOnce", "true"));
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd67fb15", new Object[0])).booleanValue();
        }
        return v2s.o().p() != null && !giv.c().b() && yqq.h(v2s.o().p().b("tblive", "enableCleanScreenGuideNew", "false"));
    }

    public static String u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60b0ef06", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return i9l.b("tblive", "officialLiveSwitchTargetUrl", "http://h5.m.taobao.com/taolive/video.html?id=%s&livesource=guanfangtai&productType=live&ignoreSameLive=true&forceRefresh=true");
        }
        return "http://h5.m.taobao.com/taolive/video.html?id=%s&livesource=guanfangtai&productType=live&ignoreSameLive=true&forceRefresh=true";
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee630248", new Object[0])).booleanValue();
        }
        if (!hjr.o()) {
            return false;
        }
        return h2t.INSTANCE.r();
    }

    public static boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec882ebd", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "TBLiveReplaceItemUrlParam", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7db268fa", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableShowCommentGiftEffect", "true"));
    }

    public static int w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93b33b6", new Object[0])).intValue();
        }
        return vvs.e("tblive", "tab2BottomGuideDelayTime", 2);
    }

    public static long x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cfb1297", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "taoliveGoodsRecommendDelayTime", "30"));
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d3cc72", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePopClickErrorFix", "true"));
    }

    public static long y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46b14378", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "taoliveGoodsRecommendPushGroupCount", "3"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5881e0c6", new Object[0])).booleanValue();
        }
        return hjr.g();
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835aafa4", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableRemoveAccountViewBackground", Boolean.TRUE).booleanValue();
    }

    public static long z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcce62f9", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "taoliveGoodsRecommendPullInterval", "300"));
    }

    public static boolean k0(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7c8e3fc", new Object[]{tBLiveDataModel})).booleanValue();
        }
        return v2s.o().p() != null && !giv.c().b() && w0(tBLiveDataModel) && yqq.h(v2s.o().p().b("tblive", "enableLongPressPlayRate", "true"));
    }

    public static boolean w0(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60ed816c", new Object[]{tBLiveDataModel})).booleanValue();
        }
        if (giv.c().b()) {
            return false;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        return vvs.b("tblive", "enablePlaybackV2RoomComponent", true) && ((c0 == null || !"2".equals(c0.roomStatus)) ? false : c0.enableReplyStyleUpgrade);
    }

    public static boolean x0(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8407e625", new Object[]{videoInfo})).booleanValue();
        }
        if (giv.c().b()) {
            return false;
        }
        return vvs.b("tblive", "enablePlaybackV2RoomPlayController", true) && ((videoInfo == null || !"2".equals(videoInfo.roomStatus)) ? false : videoInfo.enableReplyStyleUpgrade);
    }
}
