package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.downgrade.Downgrade;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_ACTIVATE_DATA = "closeActivateData2019";
    public static final String ENABLE_CART_SKU_V2 = "enableCartSkuV2";
    public static final String ENABLE_IN_SHOP_HISTORY_ELDER = "enableInShopHistoryElder";
    public static final String ENABLE_IN_SHOP_SEARCH_DOOR_V2 = "enableInShopSearchDoorV2";
    public static final String ENABLE_MAIN_SRP_LIFECYCLE_LOG = "enableMainSrpLifeCycleLog";
    public static final String ENABLE_NEW_SECTION = "enableNewSectionV1";
    public static final String ENABLE_SEARCH_DOOR_ELDER_VOICE_ASSISTANT = "enableSearchDoorElderVoiceAssistantV2";
    public static final String ENABLE_SEARCH_ELDER = "enableSearchElderV2";
    public static final String ENABLE_SHOP_SEARCH_ELDER = "enableShopSearchElder";
    public static final String ENABLE_SRP_ELDER_VOICE_ASSISTANT = "enableSRPElderVoiceAssistantV2";
    public static final String ENABLE_SRP_FULL_TRACE = "enableSRPFullTrace";
    public static final String ENABLE_SRP_VOICE_FROM_VERIFY = "enableSRPVoiceFromVerify";
    public static final String SEARCH_BIZ_NAME = "search_biz";
    public static final String SEARCH_GROUP_NAME = "search";

    /* renamed from: a  reason: collision with root package name */
    public static int f25141a = 3;

    static {
        t2o.a(815792246);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6822021", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "luBanHost", "picasso.alicdn.com");
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4ed59f", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "coverLoadingView", "true"));
    }

    public static boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c4d3f2e", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "outerBeanJsonType", "true"), "true");
    }

    public static boolean A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90969cc5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "uniErrorView", "true"), "true");
    }

    public static String[] B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("de7d7242", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "mainSearchEnable2021DecoTab", "all/ifashion");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558e53ce", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableCrashReporter", "true"), "true");
    }

    public static boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38e26527", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "trackP4pExpose", "true"));
    }

    public static boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("721adeae", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "updateOtherTabParams", "true"), "true");
    }

    public static String[] C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4e9a3f6b", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "mainSearchShareUnEnableChannel", "hongbaosrp");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c184721", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableCunTao", "false"));
    }

    public static boolean C1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41172697", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, str, "true"));
    }

    public static boolean C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("753bbcad", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "templateCache", "true"));
    }

    public static String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d6e55c7", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "mainSrpShareUrl", "");
        return TextUtils.isEmpty(l) ? h1p.SEARCHLIST_H5 : l;
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7871585a", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "darkRecreate", "true"));
    }

    public static boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abba6266", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "disablePltNewUserGuide", ""), "true");
    }

    public static boolean D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41fadd67", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "useDefaultTheme", "true"));
    }

    public static int E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf956b00", new Object[]{new Integer(i)})).intValue();
        }
        String l = l(SEARCH_BIZ_NAME, "maxDisplayHistoryCount", "");
        return TextUtils.isEmpty(l) ? i : Math.min(40, srl.e(l, i));
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17eebde5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableDetailPreRequest", "true"), "true");
    }

    public static boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd739bb9", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "recordSrpResult", "true"));
    }

    public static boolean E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b7ff1df", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableUserBehaviorRecord", ""));
    }

    public static int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f6207fd", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(l(SEARCH_BIZ_NAME, "aiHistoryMaxCnt", "10"));
        } catch (Exception unused) {
            return 10;
        }
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6f24", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "downgradeSceneAlpha", "true"));
    }

    public static boolean F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb639d9", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableRecyclerToolbar", "false"));
    }

    public static boolean F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("859e606b", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableWeexPZSpm", "true"), "true");
    }

    public static int G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b89ce2c6", new Object[]{new Integer(i)})).intValue();
        }
        String l = l(SEARCH_BIZ_NAME, "maxHistoryCount", "");
        return TextUtils.isEmpty(l) ? i : Math.min(40, srl.e(l, i));
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("202dd6c", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "filterEagleCard", "true"));
    }

    public static boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a71cc9af", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "refreshLocationUsingCache", "true"), "true");
    }

    public static boolean G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a02c36e9", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableXslPreload", ""));
    }

    public static String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9db9c9d6", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "limitErrorSubTitle", Localization.q(R.string.taobao_app_1005_1_16675));
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68b874de", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "auctionExposeAsync", "true"));
    }

    public static boolean H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("280b708c", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "removeUnusedTemplate", "true"));
    }

    public static void H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a38333a", new Object[0]);
            return;
        }
        l("image_search", "adv_banner", "");
        l("image_search", "flp_config", "");
        l("image_search", "find_config", "");
    }

    public static String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61cfbfec", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "limitErrorMainTitle", Localization.q(R.string.taobao_app_1005_1_16644));
    }

    public static boolean I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfebf21b", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "abortRenderWhenDestroy", "true"), "true");
    }

    public static String[] J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("59af2f8d", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "newSearchJumpBlackParams", "");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    @Deprecated
    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c692c4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableFilterBtnNewDefaultSelectedLogicV2", "true"), "true");
    }

    public static boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f6cf11", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "reportClipboardPasteV2", "true"));
    }

    public static void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e03257", new Object[0]);
        } else {
            f25141a = srl.e(l(SEARCH_BIZ_NAME, "videoPlaySampleRate", "3"), 1);
        }
    }

    public static String[] K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f0316b52", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "pageInfoWhiteParams", "from/channelSrp/filterTag");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e3461c3", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableFilterPopupDecorView", "true"), "true");
    }

    public static boolean K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("806444c5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableRequestFallback", "true"), "true");
    }

    public static boolean K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54126d3e", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "useNdMultiTypePreload", "true"));
    }

    public static float L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea495de6", new Object[0])).floatValue();
        }
        return srl.d(l(SEARCH_BIZ_NAME, "imageRatio", "0.75"), 0.75f);
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c248daf", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "isFireVisibleEventToWeex", "true"));
    }

    public static boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f3d543", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, AddressKinshipBridge.ACTION_REQUEST_LOCATION_PERMISSION, "true"), "true");
    }

    public static int L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a129662", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(l(SEARCH_BIZ_NAME, "scrollStateThreshold", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81be3fb2", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "pltNewUserGuideText", "");
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48a2cb47", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "fixConnectivityManagerLeaks", "true"), "true");
    }

    public static boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4ab53d", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SRP_ELDER_VOICE_ASSISTANT, "true"));
    }

    public static boolean M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5872afe4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "detailPreloadUsingUrl", "true"), "true");
    }

    public static long N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19be4273", new Object[0])).longValue();
        }
        return srl.g(l(SEARCH_BIZ_NAME, "pltNewUserGuideInterval", String.valueOf((long) pqw.DEFAULT_MAX_AGE)), pqw.DEFAULT_MAX_AGE);
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a5b2531", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "fixSceneHeaderScroll", "true"), "true");
    }

    public static boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c8d3d", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SRP_FULL_TRACE, "true"));
    }

    public static String O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e646fc2", new Object[]{str});
        }
        return l("search_preload_biz", str, "");
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6147d13a", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableForceBreakLine", "true"), "true");
    }

    public static boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22988a4c", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSRPJumpKeywordFixed", "true"), "true");
    }

    public static int P(int i) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7e0d20", new Object[]{new Integer(i)})).intValue();
        }
        String l = l("search", "preloadPageValue2019", "");
        return (!TextUtils.isEmpty(l) && (e = srl.e(l, i)) >= -1) ? e : i;
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b22c39f", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableForceSetTheme", "false"));
    }

    public static boolean P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c883ba67", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSRPPageRebuild", "true"), "true");
    }

    public static String[] Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8d353453", new Object[0]);
        }
        try {
            return l(SEARCH_BIZ_NAME, "refreshTips", "下拉刷新,释放刷新,为你推荐一组新商品,为你推荐一组新商品").split(",");
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("653b96b7", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableH5PZSpm", "true"), "true");
    }

    public static boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd3697a1", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSRPPopHack", "true"), "true");
    }

    public static String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98319daa", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "requestFallbackBlackCodeList", "");
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e86ebca", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableImageSearchGuideV2", "false"));
    }

    public static boolean R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b4a90e6", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSRPSystemRebuildTrack", "true"), "true");
    }

    public static String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d1b7e2f", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "requestFallbackBlackParams", "");
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d868251", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_IN_SHOP_HISTORY_ELDER, "true"), "true");
    }

    public static boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52810a3e", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SRP_VOICE_FROM_VERIFY, "true"));
    }

    public static Set<String> T() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("38dc853f", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "headerReuseWhiteList", "");
        if (TextUtils.isEmpty(l)) {
            return Collections.emptySet();
        }
        try {
            HashSet hashSet = new HashSet();
            for (String str : l.split(",")) {
                int indexOf = str.indexOf("@");
                if (indexOf > 0) {
                    hashSet.add(str.substring(0, indexOf));
                } else {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Exception unused) {
            return Collections.emptySet();
        }
    }

    public static final boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede9b40", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableInShopNDParamsTransfer", "true"), "true");
    }

    public static boolean T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58dc86e6", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "sceneHeaderNestedScroll", "true"), "true");
    }

    public static String[] U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("7374322f", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "searchDoorPhotoSearchChannelBlackList", "localSearch/Uxianshiyong/baiyibutie");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6d127c2", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_IN_SHOP_SEARCH_DOOR_V2, "true"), "true");
    }

    @Deprecated
    public static boolean U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2180f63", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSceneHeaderTopLogicSameWithIOS", "true"), "true");
    }

    public static String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4aefc86", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "searchButtonPromotionGifConfig", "");
    }

    @Deprecated
    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e31bfa", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableInShopTopBarWidthFixV2", "true"), "true");
    }

    public static boolean V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d114c8c", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "sceneHeaderWrapContent", "true"), "true");
    }

    public static int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe376b61", new Object[0])).intValue();
        }
        String l = l(SEARCH_BIZ_NAME, "searchDoorBXFeatureLengthMaxValue", "1024");
        if (TextUtils.isEmpty(l)) {
            return 1024;
        }
        return srl.e(l, 1024);
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e8b571", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableInshopDynamicCard", ""));
    }

    public static boolean W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fa1690", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchDoorBGWordsBXFeature", "true"), "true");
    }

    public static String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc7d631d", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "doorChannelSet", "");
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd5f1e2d", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableInshopOverScroll", ""));
    }

    public static boolean X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b50a7b5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchDoorBGWordsRefresh", "true"), "true");
    }

    public static String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53ed5661", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "searchDoorQueryIntercept", "");
    }

    public static boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f250e1b8", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "disableInshopPassAllParams", ""), "true");
    }

    public static boolean Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda06d56", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SEARCH_DOOR_ELDER_VOICE_ASSISTANT, "true"));
    }

    public static String[] Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1f72979e", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "searchDoorPhotoSearchChannelBlackList", "localSearch/Uxianshiyong/baiyibutie");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1c3c67", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "disableInshopComponentInit", ""), "true");
    }

    public static boolean Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6ffaa27", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "disableSearchDoorIconHint", ""), "true");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c0cc8ea", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "clearExternalFrom", "true"));
    }

    public static long a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56dc33bb", new Object[0])).longValue();
        }
        return Math.max(Math.min(srl.d(l(SEARCH_BIZ_NAME, "searchDoorKeyboardPresentDelay", ""), 0.3f), 2.0f), 0.3f) * 1000.0f;
    }

    public static boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d6feb5f", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableJarvisLastPageExpose", ""));
    }

    public static boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b64069", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "searchDoorInitiativeLocate", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c0796cd", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "disableMusPageChange", "false"));
    }

    public static String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e4cacb4", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "searchDoorOpt", "enable");
    }

    public static boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f1014ff", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "disableJstPrefetch", ""), "true");
    }

    public static boolean b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f4e67b4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchDoorMainPageBXFeature", "true"), "true");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce5e564", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "loadLibraryBeforeCheckBundle", "true"), "true");
    }

    public static String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd26c6c0", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "searchParamsBlackList", "utparam&URL_REFERER_ORIGIN&_navigation_params");
    }

    public static boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27bfdcdb", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "lazyLoadScroll", "true"));
    }

    public static boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e322fc3d", new Object[0])).booleanValue();
        }
        return I0("disableSearchDoorRealTab");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65cac6dd", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig("shop_triver_common_config", "enableRefreshCountryCodeInShopModule", "true"));
    }

    public static String d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6079d42b", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "templateSkeletonConfig", "");
    }

    public static boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58cdffdd", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableListAnimator", "true"), "true");
    }

    public static boolean d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b34b9890", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchDoorSuggestBXFeature", "true"), "true");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ab5d44a", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "closeGoodPrice", "true"), "false");
    }

    public static String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e67418d5", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "templateSkeletonDarkConfig", "");
    }

    public static boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d5ec91e", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableLocalImageGuideV1", "false"));
    }

    public static boolean e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef72645", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchDoorSuggestTrack", "true"), "true");
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d1550eb", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("taowise", "ai_input_config", "");
    }

    public static int f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c199cd1d", new Object[0])).intValue();
        }
        return f25141a;
    }

    public static boolean f1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20010e1c", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, str, "false"), "true");
    }

    public static boolean f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e45286b5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "searchDoorRecyclPool", "true"), "true");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fac6de91", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "aiSearchDoorAppId", "36935");
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b317efa", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "aacCallLogin", "true"));
    }

    public static boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43f4d37", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "lowDevicePerfOn", "true"), "true");
    }

    public static boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4fa74", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SEARCH_ELDER, "true"));
    }

    public static JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd78c3b8", new Object[0]);
        }
        String l = l("taowise", "ai_tab_configs", "");
        if (TextUtils.isEmpty(l)) {
            return null;
        }
        try {
            return JSON.parseObject(l);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f4f28de", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", CLOSE_ACTIVATE_DATA, "false"));
    }

    public static boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99e9b099", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableMUSFixedParamsGot", "true"), "true");
    }

    public static boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8fa2e9", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableSearchHistory", "false"));
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("798f0f99", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "addWidgetUrl", "https://web.m.taobao.com/app/starlink/widget-web/guide?id=124");
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6df7cbfd", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableActivityResult", "false"));
    }

    public static boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dab1f15", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "musRouteFallback", "false"), "true");
    }

    public static boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce6839e3", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSearchTLogTrack", "true"), "true");
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("799cf71d", new Object[0])).longValue();
        }
        String a2 = ri7.a();
        if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "low")) {
            String l = l(SEARCH_BIZ_NAME, "bxScrollingReportInterval_low", "");
            if (TextUtils.isEmpty(l)) {
                return 200L;
            }
            return qrl.g(l, 200L);
        }
        String l2 = l(SEARCH_BIZ_NAME, "bxScrollingReportInterval", "");
        if (TextUtils.isEmpty(l2)) {
            return 100L;
        }
        return qrl.g(l2, 100L);
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db453c96", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableAddressWidgetBGWhite", "true"), "true");
    }

    public static boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee997b0", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_MAIN_SRP_LIFECYCLE_LOG, "true"), "true");
    }

    public static boolean j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48a2ac84", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableShareSearch", "false"));
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4ced12a", new Object[0])).intValue();
        }
        return srl.e(l(SEARCH_BIZ_NAME, "blurImageRadius", "200"), 25);
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96b250be", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "enableAutoPlay", "true"));
    }

    public static boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f46f13b", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "mainTabUseWua", "true"));
    }

    public static boolean k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa5500a", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, ENABLE_SHOP_SEARCH_ELDER, "true"));
    }

    public static String l(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("427a2c7f", new Object[]{str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(I2(str, str2), str2, str3);
    }

    public static boolean l0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ad52abd", new Object[0])).booleanValue();
        }
        String a2 = ri7.a();
        if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "low")) {
            str = "reportBHXVisualItems_low";
        } else {
            str = "reportBHXVisualItems";
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, str, "true"));
    }

    public static boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3791ff8d", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "markGrayTemplatesV2", "true"), "true");
    }

    public static boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcdeb467", new Object[0])).booleanValue();
        }
        if (!TextUtils.equals("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance()) || !C1("lowDisableSkeleton")) {
            return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "skeletonLoading", "true"));
        }
        return false;
    }

    public static final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73194c22", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "searchCoudanRedirectUrl", "https://pages.tmall.com/wow/a/act/tmall/dailygroup/2883/wupr?wh_pid=daily-257100&disableNav=YES");
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16c42ec6", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "enableBUFSPvFeature", "true"));
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb6b5b4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "metaNotifyEnabledV1", "false"), "true");
    }

    public static boolean m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e84b9ae", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "speechSwitch", "true"));
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("147bc2c2", new Object[0])).intValue();
        }
        return srl.e(l(SEARCH_BIZ_NAME, "coverLoadingDelay", "200"), 200);
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e4a32f7", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "metaBlockFocus", "false"), "true");
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b8bed46", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "miniSearch2021", "true"), "true");
    }

    public static boolean n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c8cdb7", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "srpAsync", "true"));
    }

    public static float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("344cdaa0", new Object[0])).floatValue();
        }
        return 2.0f;
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ff205b6", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableBxFeature", "true"), "true");
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d89ba5e3", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableMiniSearch", "true"), "true");
    }

    public static boolean o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7bd430", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSrpPerformance", "true"), "true");
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bda3ef99", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "defaultThemeConfig", "{\"skinPic\":\"https://gw.alicdn.com/imgextra/i3/O1CN014AmXRj1KLMx37Og4J_!!6000000001147-0-tps-1125-808.jpg\",\"skinColor\":\"#F2F2F2\",\"actionbarTextColor\":\"#111111\",\"actionBarBackgroundColor\":\"#FFFFFF\",\"statusBarStyle\":\"0\",\"naviStyle\":\"1\",\"isComplexTexture\":\"false\"}");
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94e75240", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "enableBxPopupRequest", "true"));
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("854730f3", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "miniTopHeader", "true"), "true");
    }

    public static boolean p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b191124a", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "srpPreload", "true"));
    }

    public static String[] q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("dd1ee695", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "elderVoiceSRPFromWhiteParams", "active_grayHair");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bbbf09d", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_CART_SKU_V2, "true"), "true");
    }

    public static boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("548cddda", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableMuiseGSensorAbility", "true"), "true");
    }

    public static boolean q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b547490d", new Object[0])).booleanValue();
        }
        return "true".equals(l(SEARCH_BIZ_NAME, "standaloneChannelSrpAppId", "true"));
    }

    public static String[] r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a8d0b16", new Object[0]);
        }
        String l = l(SEARCH_BIZ_NAME, "elderVoiceSearchDoorFromWhiteParams", "active_grayHair");
        if (TextUtils.isEmpty(l)) {
            return new String[0];
        }
        return l.split("/");
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350002e1", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "cartTrackP4p", "true"));
    }

    public static boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("662ecfa4", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "multiWindowPerf", "true"));
    }

    @Deprecated
    public static boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9379de", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableSubscribeSRPOptimize", "true"), "true");
    }

    public static org.json.JSONObject s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("41e145c6", new Object[]{str});
        }
        String l = l(SEARCH_BIZ_NAME, "mtopErrorTitleConfig", "");
        if (TextUtils.isEmpty(l)) {
            return null;
        }
        try {
            return new org.json.JSONObject(l).optJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4b42834", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "metaCheckGap", "true"), "true");
    }

    public static boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02c83ec", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableMusFilterRefreshList", "true"), "true");
    }

    public static boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d9d20e", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig("shop_triver_common_config", "supportInshopOverseaSearch", "true"));
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ca4a764", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "gallerySrpBgUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01f6x5nt1rLGDjKUGlS_!!6000000005614-2-tps-750-1624.png");
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeedcbea", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, AddressKinshipBridge.ACTION_CHECK_LOCATION_PERMISSION, "true"), "true");
    }

    public static boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2af0a681", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "m3OpenLoadMore", "true"));
    }

    public static boolean t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b9a165", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "tabPageState", "true"));
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("279f07b1", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "inshopPltUrl", h1p.PAILITAO_URL);
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6caf47c2", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "disableChitu", "false"));
    }

    @Deprecated
    public static boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32aa9510", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableNativeFilterFix", "true"), "true");
    }

    public static boolean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d566c51", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l("search", "closeOtherTabSearchHint2019", "false"));
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93fa99f6", new Object[0]);
        }
        return l(SEARCH_BIZ_NAME, "inshopRequestParamsWhiteList", "");
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c8da69", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "muiseDarkMode", "true"), "true");
    }

    public static boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314cdc88", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "negativeFeedbackEnable", "true"), "true");
    }

    public static boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78c207b5", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableTagBack", "true"), "true");
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84434642", new Object[0])).intValue();
        }
        return srl.e(OrangeConfig.getInstance().getConfig(SEARCH_BIZ_NAME, "ipTopHeaderBottom", "142"), SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR);
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8208ae3e", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "fixColdLaunchPv", "true"));
    }

    public static boolean w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c611775", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableNewInstanceTagSearch", "true"), "true");
    }

    public static boolean w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d842ae", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "addTaoPPParmas", "true"));
    }

    public static long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4f2b301", new Object[0])).longValue();
        }
        return srl.g(l(SEARCH_BIZ_NAME, "jarvisFeatureTimeout", "1000"), 1000L);
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e310f9", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableCommonDynamicCardInsert", "true"), "true");
    }

    public static boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63447534", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "nsCellHeightFallback", "false"), "true");
    }

    public static boolean x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("279d25ad", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "templateDelay", "true"));
    }

    public static int y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab36d5d3", new Object[]{new Integer(i)})).intValue();
        }
        String l = l("search", "locationCacheTime", "");
        return TextUtils.isEmpty(l) ? i : srl.e(l, i);
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff6e35d4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableCommonDynamicCardInsertJarvis", "true"), "true");
    }

    public static boolean y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cba1ddd", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_NEW_SECTION, "true"), "true");
    }

    public static boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48c11867", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableTemplatePreload", "true"), "true");
    }

    public static float z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85e6a977", new Object[0])).floatValue();
        }
        String l = l(SEARCH_BIZ_NAME, "lowDeviceImageDivideConfig", "");
        if (TextUtils.isEmpty(l)) {
            return o();
        }
        try {
            return srl.d(new org.json.JSONObject(l).getString(String.valueOf(Build.VERSION.SDK_INT)), o());
        } catch (Exception unused) {
            return o();
        }
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f167dea", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, ENABLE_NEW_SECTION, "true"), "true");
    }

    public static boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55485d19", new Object[0])).booleanValue();
        }
        return TextUtils.equals(l(SEARCH_BIZ_NAME, "enableNonItemClickTrace", "true"), "true");
    }

    public static boolean z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c017fd64", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", l(SEARCH_BIZ_NAME, "textHelperNewSwitch", "true"));
    }

    public static boolean I0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3773799d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("true", l("search", str, "false"));
    }

    public static String I2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf0814e5", new Object[]{str, str2});
        }
        if (Localization.p()) {
            return str;
        }
        try {
            for (String str3 : OrangeConfig.getInstance().getConfig(SEARCH_BIZ_NAME, "i18nCfg_" + str, "pltNewUserGuideText,mtopErrorTitleConfig,limitErrorMainTitle,limitErrorSubTitle").split(",")) {
                if (TextUtils.equals(str3, str2)) {
                    return str + "_en";
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }
}
