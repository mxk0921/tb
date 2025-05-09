package tb;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.f3;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADVANCE_AUTODETECT_EXPERIMENT = "tbAndroidPltAdvanceAutodetectV4";
    public static final String REALTIME_SEARCH_EXPERIMENT = "tbAndroidPltEnableRealtimeSearchEntrance";
    public static final String SMART_LENS = "tbAndroidPltEnableSmartAutoDetectV2";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, ImageRule> f23320a = null;
    public static final String b = "image_search";

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d2ddc0c", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableAsyncLoadXSearch_V2", "true"), true);
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a19944f5", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableIrpZxsAppendQueryText", "true"), true);
    }

    public static boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("930ada41", new Object[0])).booleanValue();
        }
        return Boolean.TRUE.equals(Z1("forceCaptureDegrade"));
    }

    public static String[] A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c82cedef", new Object[0]);
        }
        String e2 = e2("tbAndroidPltIrpOuterTrafficValidKeys", "picurl/tfskey");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static String A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb5f2b2e", new Object[0]);
        }
        String Y1 = Y1("SmartDetectAlgoConfig");
        return !TextUtils.isEmpty(Y1) ? Y1 : e3("tbAndroidPltSmartDetectAlgoConfig", "");
    }

    public static boolean A4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23142c68", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("sessionReleaseClose", ""));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39cf4fc3", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableAsyncUt", "true"), true);
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df1b1f81", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableKillRealtimeSearchOnTrimMemory", "enable");
    }

    public static long B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bf157b", new Object[0])).longValue();
        }
        return qrl.g(e3("tbAndroidPltAdvanceObjectDetectSilenceTimeV4", "1000"), 1000L);
    }

    public static int B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("404510d0", new Object[0])).intValue();
        }
        return qrl.e(e2("irpQuickSearchIntervalTime", "60000"), 60000);
    }

    public static String B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b6e9b4", new Object[0]);
        }
        return e3("tbAndroidPltSmartLensBackTipConfigV2", "baseline");
    }

    public static boolean B4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd1d899", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("shopMuiseEnable", "true"), "true");
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5afbcec", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableAutoDetectIrpScanCaptureMerge", "enable");
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c8155a5", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableLoadCaptureTemplateMainThread", "false"), false);
    }

    public static long C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b0dfc1", new Object[0])).longValue();
        }
        String Y1 = Y1("ScanTimeout");
        if (!TextUtils.isEmpty(Y1)) {
            return qrl.g(Y1, 1500L);
        }
        return qrl.g(e2("albumIrpScanCaptureMergeTimeoutConfigV2", "1500"), 1500L);
    }

    public static String[] C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a87f14f4", new Object[0]);
        }
        String e2 = e2("irpRegionEditImgRequestSizeConfig", "224/224");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static String C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dde9176d", new Object[0]);
        }
        return e2("SmartLensTipConfig", "");
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc95da7a", new Object[0])).booleanValue();
        }
        return qrl.a(e2("autodetectPerfRecord", "true"), true);
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("663525e6", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableLoadLocalImgWithCache", "enable");
    }

    public static String D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beedbb5c", new Object[0]);
        }
        return e2("albumOuterPsSourceBlackList", "");
    }

    public static String[] D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d8c52a5d", new Object[0]);
        }
        String e2 = e2("irpServerPassParamKeys", "busiKey/n/maxn/vm/m/biz_type/setSpApp/closepict/page/client/utd_id/newPhotoSearch/subSearchType/sversion/musPageVersion/extraParams/rainbow/plt_autodetect_extraInfo/faceCount/face/debug/watermark/videoWatermark/full_region_size/cameraMode/barCode/pssource/photofrom/passThroughParams/regionChanged/pltSession/seller_id/hasCropedImage/sellid/shopId/sellerId/sellerid/shopid/itemid/item_id/shop_id/originalRegion/region/picurl/cmt/screenshotsAppSrc/imgClientChannel/imgClientDetectExtraInfo");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static float D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cf35cad", new Object[0])).floatValue();
        }
        return qrl.d(e2("smartLensZoomTargetRatio", "0.25"), 0.25f);
    }

    public static boolean D4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef032a9", new Object[0])).booleanValue();
        }
        String e2 = e2("irpScreenshotFloatBrandBlackList", "xiaomi;");
        return e2.contains(Build.BRAND + ";");
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5b122d7", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableBaseMnnUnitThreadOpt", "enable");
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c60e3733", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableLoadXSearchInScreenRecordActivity", "baseline");
    }

    public static String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99321b5e", new Object[0]);
        }
        if (ri7.c()) {
            return oen.k(Collections.singletonList(SMART_LENS));
        }
        return oen.j();
    }

    public static String[] E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5e65aed1", new Object[0]);
        }
        String e2 = e2("tbAndroidPltIrpRequestExtraParamsPassPSSourceKeys", "pplActivity");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static long E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddc774e", new Object[0])).longValue();
        }
        return qrl.g(e2("sameFrameThreshold", "200"), 200L);
    }

    public static boolean E4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a62e70dc", new Object[0])).booleanValue();
        }
        String e2 = e2("irpScreenshotFloatOSVersionBlackList", "31;");
        return e2.contains(Build.VERSION.SDK_INT + ";");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a955af5", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableBottomAreaAnimationOpt", "true"), true);
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5853b98c", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableMnnExecutorCacheV2", "baseline");
    }

    public static String F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[0]);
        }
        return e2("tppApiBackup", "mtop.relationrecommend.PailitaoRecommend.recommend");
    }

    public static String F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ff03107", new Object[0]);
        }
        return e2("pltIrpScanLineAddress", "https://gw.alicdn.com/imgextra/i1/O1CN01fuqmVY1w25sVp4FP0_!!6000000006249-2-tps-750-196.png");
    }

    public static String F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0744402", new Object[0]);
        }
        return e2("originTransLangList", "[    {\"自动\": \"auto\"},    {\"英文\": \"en\"},    {\"日语\": \"ja\"},    {\"韩语\": \"ko\"},    {\"泰语\": \"th\"},    {\"俄语\": \"ru\"},    {\"德语\": \"de\"},    {\"西语\": \"es\"},    {\"法语\": \"fr\"},    {\"葡萄牙语\": \"pt\"},    {\"越南语\": \"vi\"},    {\"印尼语\": \"id\"},    {\"土耳其语\": \"tr\"},    {\"意大利语\": \"it\"}]");
    }

    public static boolean F4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5afc87", new Object[0])).booleanValue();
        }
        return T3("tbAndroidIrpUseCache", "baseline");
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31a45907", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableBottomAreaVisibleOpt", "enable");
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e1e14ff", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableMnnExecutorCounters_v2", "enable");
    }

    public static String G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[0]);
        }
        return e2("tppApiVerBackup", "1.0");
    }

    public static String G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bff958c", new Object[0]);
        }
        return e2("irpServerPicUrlPrefix", "https://img.alicdn.com/imgextra/");
    }

    public static String G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a41d392d", new Object[0]);
        }
        return e2("targetTransLangList", "[{\"中文\":\"zh\"}, {\"英文\":\"en\"}]");
    }

    public static boolean G4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43370e88", new Object[0])).booleanValue();
        }
        return !TextUtils.equals("false", e2("watermarkDetect", ""));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4c22c7", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableCallHasTmplCacheInMainThreadV2", "disable");
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bf3c265", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltMnnUseLocalAlgoModelCacheV6", "enable");
    }

    public static String H1(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b67e74", new Object[]{str});
        }
        if (Localization.o()) {
            String n2 = n2();
            if (!TextUtils.isEmpty(n2)) {
                return n2;
            }
        }
        if (O4(str)) {
            str2 = R2();
        } else {
            str2 = "21834";
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String str3 = "";
        String e2 = e2("appIdConfig", str3);
        if (TextUtils.isEmpty(e2)) {
            return str2;
        }
        String[] split = e2.split(";");
        if (split.length <= 0) {
            return str2;
        }
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String[] split2 = split[i].split(":");
            if (split2.length >= 2) {
                String str4 = split2[0];
                String str5 = split2[1];
                if (str.equals(str4) && !TextUtils.isEmpty(str5)) {
                    str3 = str5;
                    break;
                }
            }
            i++;
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public static String H2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51dafaa3", new Object[]{str});
        }
        String e2 = e2("irpWebUrl", str);
        return TextUtils.isEmpty(e2) ? str : e2;
    }

    public static JSONObject H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("11ad730", new Object[0]);
        }
        try {
            return new JSONObject(e2("videoTrackModel", ""));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean H4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2c02196", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("lockJump");
        return Z1 != null && Z1.booleanValue();
    }

    public static boolean I() {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34b7d267", new Object[0])).booleanValue();
        }
        return !u4() && (e = qrl.e(e3(ADVANCE_AUTODETECT_EXPERIMENT, "3"), -1)) >= 0 && (e & 1) > 0;
    }

    public static boolean I0() {
        Boolean Z1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d384678", new Object[0])).booleanValue();
        }
        return caa.q() && (Z1 = Z1("mockDisableAdvanceDetector")) != null && Z1.booleanValue();
    }

    public static String I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1df4645c", new Object[0]);
        }
        String Y1 = Y1("AutoDetectAlgoConfig");
        return !TextUtils.isEmpty(Y1) ? Y1 : e3("tbAndroidPltAutoDetectAlgoConfig", "");
    }

    public static long I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaf4d39a", new Object[0])).longValue();
        }
        return qrl.e(d3("tbAndroidPltLatestAlbumImageTimeInterval"), 1) * 60;
    }

    public static String I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15987808", new Object[0]);
        }
        String Y1 = Y1("transSettingUrl");
        return !TextUtils.isEmpty(Y1) ? Y1 : e2("transSettingUrl", "https://web.m.taobao.com/app/asr-pages-cloud/plt-translate-option-page/home?pha=true");
    }

    public static boolean I4() {
        Boolean Z1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0903f9c", new Object[0])).booleanValue();
        }
        if (!jld.a() || (Z1 = Z1("mockAlinnBuildFailed")) == null) {
            return false;
        }
        return Z1.booleanValue();
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a311ce96", new Object[0])).booleanValue();
        }
        if (jld.a()) {
            return true;
        }
        return T3("tbAndroidPltEnableCamera1ExposureCompensation", "baseline");
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a75e8374", new Object[0])).booleanValue();
        }
        if (Z1(u63.DIMENSION_NEW_CAPTURE) != null) {
            return true;
        }
        if (u4() && !K0()) {
            return false;
        }
        if ((caa.s() || caa.t()) && !e1()) {
            return false;
        }
        if (!Localization.o() || d1()) {
            return T3("tbAndroidPltEnableNewCapture_V3", "baseline");
        }
        return false;
    }

    public static float J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4166e86", new Object[0])).floatValue();
        }
        return qrl.d(e2("autoDetectRegionThreshold", "0.5"), 0.5f);
    }

    public static String J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8463dda9", new Object[0]);
        }
        return e2("marketingTabTemplateUrl", "");
    }

    public static int J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ec9bce", new Object[0])).intValue();
        }
        return qrl.e(e2("translateAbilityConfig", "1"), 1);
    }

    public static boolean J4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e260a227", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("stop_frame_input");
        if (Z1 == null) {
            return true;
        }
        return !Z1.booleanValue();
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6a48a35", new Object[0])).booleanValue();
        }
        if (g4()) {
            return false;
        }
        return T3("tbAndroidPltEnableCamera2_v3", "disable");
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be4d287", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableNewCaptureInLowDevice", "enable");
    }

    public static String K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1c529de", new Object[0]);
        }
        if (Localization.o()) {
            return e2("barcodeApiNameI18n", "mtop.relationrecommend.PailitaoRecommend.recommend");
        }
        return e2("barcodeApiName", "mtop.relationrecommend.PailitaoRecommend.recommend");
    }

    public static int K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cd4e97c", new Object[0])).intValue();
        }
        return qrl.e(e2("videoMaxObjectCount", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE), 20);
    }

    public static String K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cae4ea15", new Object[0]);
        }
        return e2("pltTranslateAppId", "37747");
    }

    public static boolean K4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be96e604", new Object[0])).booleanValue();
        }
        return Z1("mockForceSilentMode") != null;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae974270", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("CaptureAddBottomViewOpt");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return qrl.a(e2("enableCaptureAddBottomViewOpt", "true"), true);
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91c7751", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableNewExecutorOnLoadImage", "enable");
    }

    public static String L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5899e91", new Object[0]);
        }
        if (Localization.o()) {
            return e2("barcodeApiVersionI18n", "1.0");
        }
        return e2("barcodeApiVersion", "1.0");
    }

    public static int L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ebbb9b", new Object[0])).intValue();
        }
        return qrl.e(e2("videoMaxDuration", "30"), 30);
    }

    public static int L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf64c882", new Object[0])).intValue();
        }
        return qrl.e(e2("translateExtraInfo", "7"), 7);
    }

    public static com.alibaba.fastjson.JSONObject L4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("8f8aaf6b", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return new com.alibaba.fastjson.JSONObject();
        }
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be2036e5", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableScanLongAlbumImageInIrp", "true"), true);
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373e1609", new Object[0])).booleanValue();
        }
        return TextUtils.isEmpty(e2("useNewIrpNotSafeDialog", ""));
    }

    public static String M1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae8bdbce", new Object[]{str});
        }
        if (Localization.o()) {
            return e2("cameraRejectHintI18N", str);
        }
        return e2("cameraRejectHint", str);
    }

    public static int M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d529440", new Object[0])).intValue();
        }
        return qrl.e(e2("maxWatermarkSize", "307200"), f3.e);
    }

    public static String M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add83186", new Object[0]);
        }
        if (!s()) {
            return "";
        }
        return e3("tbAndroidPltEnableTrustTerminalAlgorithm", "");
    }

    public static boolean M4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c330e58", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltStopInputFrameWhenPaused", "enable");
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a42e79", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("enableCaptureAutoScreenChange");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return qrl.a(e2("EnableCaptureScreenChangeOnFolderDeviceOrPadV2", "true"), true);
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2632068", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableOldMnnExecutorSaveAlgoModel", "enable");
    }

    public static String N1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebd7ecc9", new Object[]{new Boolean(z)});
        }
        if (z) {
            return d3("tbAndroidSysCameraYolo");
        }
        return d3("tbAndroidPltCameraYolo");
    }

    public static int N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7faa8e4", new Object[0])).intValue();
        }
        return qrl.e(e2("memoryLevelValueOfDestroyRealtime", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE), 20);
    }

    public static int N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2496b83c", new Object[0])).intValue();
        }
        return qrl.e(e2("objectDetectMinCnt", "2"), 2);
    }

    public static boolean N4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcc15023", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("testIrpCustomBgHeader");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return false;
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8b763f", new Object[0])).booleanValue();
        }
        return "true".equals(e2("enableCaptureDegradeToast", "true"));
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78386b45", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableOnNewIntent", "enable");
    }

    public static int O1(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fd54272", new Object[]{activity})).intValue();
        }
        if (caa.s() || caa.t()) {
            return CaptureBottomAreaView.Y(activity);
        }
        return 4;
    }

    public static String O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3c41143", new Object[0]);
        }
        return e2("mnnCidBlackList", "");
    }

    public static int O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("336939b5", new Object[0])).intValue();
        }
        return qrl.e(e2("videoHighLightStep", IDecisionResult.ENGINE_ERROR), 5000);
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2121a9c3", new Object[0])).booleanValue();
        }
        if (ri7.c()) {
            return T3("tbAndroidPltCaptureJumpHintV2", "");
        }
        return false;
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b04fd8", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableOpenCameraOnCreate", "enable");
    }

    public static int P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a27a8a0", new Object[0])).intValue();
        }
        return qrl.e(e2("captureLoadAlbumRecursionCount", "5"), 5);
    }

    public static int P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cdde53d", new Object[0])).intValue();
        }
        return qrl.e(e3("tbAndroidPltMnnExtraInfoMaxLength", "1000"), 1000);
    }

    public static String P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5187f928", new Object[0]);
        }
        return e2("videoOssNameSpace", "videosearch");
    }

    public static boolean P4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d1782f1", new Object[0])).booleanValue();
        }
        if (q4() || g4() || !wyn.INSTANCE.g()) {
            return false;
        }
        String d3 = d3("tbAndroidPltVideoSearch3");
        return TextUtils.isEmpty(d3) || TextUtils.equals("enable", d3);
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a22ea05", new Object[0])).booleanValue();
        }
        return "enable".equalsIgnoreCase(e2("enableCaptureMuisePerformanceMonitor", "enable"));
    }

    public static boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e4df9", new Object[0])).booleanValue();
        }
        if (jld.a()) {
            return true;
        }
        return T3("tbAndroidPltEnableOutCleanUnusedHistoryImage", "baseline");
    }

    public static long Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc526328", new Object[0])).longValue();
        }
        return qrl.g(e2("captureNewStyleSilenceTime", "1000"), 1000L);
    }

    public static String Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce92ec05", new Object[0]);
        }
        return e2("mus_page_version", "0.1.7");
    }

    public static String Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad025e99", new Object[0]);
        }
        return d3("tbAndroidPltVideoYolo");
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a77ab67", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltCaptureMusRequestDelay", "");
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34b7479f", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableTakePhotoIrpScanCaptureMergeV2", "enable");
    }

    public static int R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf49bdac", new Object[0])).intValue();
        }
        String d3 = d3("tbAndroidPltCaptureNewStyleConfigV2");
        if (TextUtils.isEmpty(d3)) {
            d3 = "0";
        }
        return qrl.e(d3, 0);
    }

    public static String R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a7df67", new Object[0]);
        }
        return e2("newAppId", "24695");
    }

    public static String R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d06eb70", new Object[0]);
        }
        String Y1 = Y1("metasightARUrl");
        return TextUtils.isEmpty(Y1) ? e2("xrPageMusTemplateUrl", "https://g.alicdn.com/tb-webb-widget/plt_scene_ar_activity_widget/0.0.2/weex/home.v20.wlm") : Y1;
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6b63588", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableCaptureNewBackIcon", "");
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70dff07e", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnablePltAlbumDecodeCondition", "enable");
    }

    public static String S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("408ce343", new Object[0]);
        }
        return e2("captureAlbumPopIntensHint", "你可能想搜的截图商品");
    }

    public static Boolean S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5992e9d9", new Object[0]);
        }
        String d3 = d3("tbAndroidPltEnableNewCapture_V3");
        if (TextUtils.isEmpty(d3)) {
            return null;
        }
        return Boolean.valueOf("enable".equals(d3));
    }

    public static YuvDiffCheckerConfig S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvDiffCheckerConfig) ipChange.ipc$dispatch("b1e246ea", new Object[0]);
        }
        String e2 = e2("yuvDiffCheckerConfig", "{}");
        if (TextUtils.isEmpty(e2)) {
            return new YuvDiffCheckerConfig();
        }
        try {
            return (YuvDiffCheckerConfig) JSON.parseObject(e2).toJavaObject(YuvDiffCheckerConfig.class);
        } catch (Exception unused) {
            return new YuvDiffCheckerConfig();
        }
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce0f6b8", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableCapturePerformanceMonitor", "enable");
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa7545be", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableAISearchHeardCardScrollOpt", "true"), true);
    }

    public static String T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeba9bd8", new Object[0]);
        }
        return e2("captureTab3TemplateUrlInCdn", "https://g.alicdn.com/asr-pages/plt_camera_page_tab3/0.0.1/weex/home.v20.wlm");
    }

    public static float T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36583015", new Object[0])).floatValue();
        }
        return qrl.d(e3("tbAndroidPltNewDarkFrameThreshold", "0.2f"), 0.2f);
    }

    public static boolean T3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d24b6c7", new Object[]{str, str2})).booleanValue();
        }
        String d3 = d3(str);
        if (!TextUtils.isEmpty(d3)) {
            str2 = d3;
        }
        return TextUtils.equals(str2, "enable");
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3ebbd80", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableCapturePreloadOnDestroy", "enable");
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef60098", new Object[0])).booleanValue();
        }
        if (!SearchSdk.sInited) {
            SearchSdk.init();
        }
        String b3 = b3("tbAndroidPltElderAdaptV2");
        if (TextUtils.isEmpty(b3)) {
            return false;
        }
        boolean f = cvr.INSTANCE.f();
        boolean z = caa.c().getResources().getConfiguration().fontScale >= Y2();
        if ("V1".equals(b3)) {
            return f || z;
        }
        if ("V2".equals(b3)) {
            return f;
        }
        return false;
    }

    public static long U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70e69b5f", new Object[0])).longValue();
        }
        return qrl.g(e2("captureTemplatePreloadInterval", "120000"), 120000L);
    }

    public static long U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a75bd66b", new Object[0])).longValue();
        }
        return qrl.g(e3("tbAndroidPltNewDeviceStableThreshold", "1000L"), 1000L);
    }

    public static boolean U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d621046", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("disableAlbumAnimation", "true"), "true");
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c240ea2c", new Object[0])).booleanValue();
        }
        if (Localization.o()) {
            return false;
        }
        return T3("tbAndroidPltEnableCaptureTab3V2", "baseline");
    }

    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dbc7ce1", new Object[0])).booleanValue();
        }
        if (g4()) {
            return false;
        }
        Boolean Z1 = Z1("enableRealTime");
        if (Z1 == null || !Z1.booleanValue()) {
            return t4() && T3(REALTIME_SEARCH_EXPERIMENT, "");
        }
        return true;
    }

    public static String V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("428d5876", new Object[0]);
        }
        if (Localization.o()) {
            return e2("captureI18NTemplateUrlInCdn", "https://g.alicdn.com/tmall-ovs-rax/i18n-camera-page-2023/0.0.60/weex/home.v20.wlm");
        }
        return e2("captureTemplateUrlInCdn", "https://g.alicdn.com/asr-pages/camera-page-2023/0.0.49/weex/home.v20.wlm");
    }

    public static int V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bb2c87d", new Object[0])).intValue();
        }
        return qrl.e(e3("tbAndroidPltNewFrameDiffThreshold", "10"), 10);
    }

    public static boolean V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58f0986d", new Object[0])).booleanValue();
        }
        return !TextUtils.equals("false", e2("watermarkAlbumDetect", "true"));
    }

    public static Boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc7e244f", new Object[0]);
        }
        if (Localization.o()) {
            return Boolean.FALSE;
        }
        if (caa.t() || caa.s()) {
            return Boolean.FALSE;
        }
        if (caa.q()) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(T3("tbAndroidPltEnableCaptureTranslateV4", "enable"));
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0d399d", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("regionCache");
        if (Z1 == null || !Z1.booleanValue()) {
            return T3("tbAndroidPltEnableRegionPageCachedData", "");
        }
        return true;
    }

    public static com.alibaba.fastjson.JSONObject W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("acaf7a71", new Object[0]);
        }
        return L4(e2("captureTips", "{}"));
    }

    public static int W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67ee4f2c", new Object[0])).intValue();
        }
        return qrl.e(e3("tbAndroidPltNewFrameUpdateTimeThreshold", "25"), 25);
    }

    public static boolean W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("635997ef", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("appendPageSpm", "true"), "true");
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d8d8d51", new Object[0])).booleanValue();
        }
        return !u4() && qrl.a(e2("tbAndroidPltEnableChannelDetectPreload", "true"), true);
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31f78c6b", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableReleaseCroServiceOnWorkerThread", "enable");
    }

    public static String X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c29be0", new Object[0]);
        }
        if (Localization.o()) {
            return Y1("orangeCameraI18nFallbackUrl");
        }
        return Y1("orangeCameraNewUrl");
    }

    public static YuvDiffCheckerConfig X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvDiffCheckerConfig) ipChange.ipc$dispatch("a97b5256", new Object[0]);
        }
        String e2 = e2("newYuvDiffCheckerConfig", "{}");
        if (TextUtils.isEmpty(e2)) {
            return new YuvDiffCheckerConfig();
        }
        try {
            return (YuvDiffCheckerConfig) JSON.parseObject(e2).toJavaObject(YuvDiffCheckerConfig.class);
        } catch (Exception unused) {
            return new YuvDiffCheckerConfig();
        }
    }

    public static boolean X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("257a6007", new Object[0])).booleanValue();
        }
        if (a() && !Localization.o()) {
            return T3("tbAndroidPltCaptureAlbumPopIntens", "");
        }
        return false;
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b304598", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableClearCaptureApmDataOnStop", "true"), true);
    }

    public static boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d484e8", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableRtCardCollision", "enable");
    }

    public static String Y1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d806acf", new Object[]{str});
        }
        if (!rv6.a()) {
            return null;
        }
        if (!SearchSdk.sInited) {
            SearchSdk.init();
        }
        try {
            return sr3.b(str, j3p.g());
        } catch (Exception unused) {
            return null;
        }
    }

    public static float Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9c99684", new Object[0])).floatValue();
        }
        return qrl.d(e2("elderTriggerSysFontSize", "1.4"), 1.4f);
    }

    public static boolean Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5cbc7ed", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("pltImageCacheOn", "true"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7392de", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltClearMnnAlgoModel_v3", "disable");
    }

    public static boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81e186", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableRtCardInCenterAreaJudge", "enable");
    }

    public static Boolean Z1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("791fee7c", new Object[]{str});
        }
        if (!rv6.a()) {
            return null;
        }
        if (!SearchSdk.sInited) {
            SearchSdk.init();
        }
        try {
            String b2 = sr3.b(str, j3p.g());
            if (TextUtils.isEmpty(b2)) {
                return null;
            }
            return Boolean.valueOf("true".equals(b2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bb29198", new Object[0])).intValue();
        }
        return qrl.e(e2("pltInitDelayTime", "0"), 0);
    }

    public static boolean Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8cb6f7", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("convertArgbEnabled", "true"), "true");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae83c265", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b05feb9", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableClientFaceDetect", "");
    }

    public static boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded9aa4c", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableRtCardScreenEdge", "enable");
    }

    public static long a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1aa9139", new Object[0])).longValue();
        }
        return qrl.g(e2("clientChannelDetectTimeout", "300"), 300L);
    }

    public static String a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27392ff", new Object[0]);
        }
        return e2("qrNotFoundHint", Localization.q(R.string.taobao_app_1007_1_19023));
    }

    public static boolean a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ba65aa", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("cropGuideEnabled", "true"), "true");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57b64845", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltDestroyCaptureHybridViewWhenTimeout", "false"), false);
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66973ade", new Object[0])).booleanValue();
        }
        if (Localization.o()) {
            return false;
        }
        Boolean Z1 = Z1("enableComponentLoadOpt");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        if (g4()) {
            return T3("tbAndroidPltEnableFolderAndPadPerformOptV6", "disable");
        }
        return T3("tbAndroidPltEnablePhoneCapturePerformOptV6", "disable");
    }

    public static boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2eedf4", new Object[0])).booleanValue();
        }
        if (caa.q()) {
            return true;
        }
        return T3("tbAndroidPltSaveMnnAlgoModel_v2", "enable");
    }

    public static long b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f621d7fd", new Object[0])).longValue();
        }
        return qrl.g(e2("clientFaceDetectTimeout", "300"), 300L);
    }

    public static String b3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29d63647", new Object[]{str});
        }
        return c3(str, "");
    }

    public static boolean b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae25eca0", new Object[0])).booleanValue();
        }
        if (caa.q()) {
            return true;
        }
        return TextUtils.equals(d3("tbAndroidAutoDetectDiffThreshold"), "enable");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b505c5", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("disableAutoDetect");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return false;
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9200a9c4", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("IrpSearchAllowance");
        if (Z1 == null || !Z1.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31f6c08", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableScaleAlbumAnchor", "true"), true);
    }

    public static String c3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ffc1dfd", new Object[]{str, str2});
        }
        String e = e0.e(str, str2);
        v5s v5sVar = new v5s();
        v5sVar.b("testName", str);
        v5sVar.b("testConfigValue", e);
        TLogTracker.g("RainbowConfig", v5sVar);
        return e;
    }

    public static boolean c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5816479", new Object[0])).booleanValue();
        }
        return qrl.a(e2("disableCaptureUTFix", ""), false);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe3a3be", new Object[0])).booleanValue();
        }
        return "true".equals(e2("disableBoxPreParse", ""));
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b7ec92", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableDeleteCachedImageFile", "enable");
    }

    public static boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("272e9417", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableNewCaptureInI18N", "enable");
    }

    public static String d3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ae3a6f", new Object[]{str});
        }
        return e3(str, "");
    }

    public static boolean d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d2a674", new Object[0])).booleanValue();
        }
        if (caa.q()) {
            return true;
        }
        return TextUtils.equals(d3("tbAndroidPltElderVersion"), "enable");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a81470b6", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("disableCenterCheck", "false"), "true");
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2af7ed6", new Object[0])).booleanValue();
        }
        if (jld.a()) {
            return true;
        }
        return T3("tbAndroidPltEnableDeleteUnusedHistoryImage", "baseline");
    }

    public static boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a36a6f8", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableNewCaptureInMultiScreenDevice", "enable");
    }

    public static String e2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return f2(b, str, str2);
    }

    public static String e3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1fa6825", new Object[]{str, str2});
        }
        return e0.e(str, str2);
    }

    public static boolean e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("293b2aa4", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableMnnInitInMainSearchImmediatelyV4", "true"), true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5ccc5e", new Object[0])).booleanValue();
        }
        return TextUtils.equals(d3("tbAndroidVideoSearchAutoPop"), "baseline");
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6022dc", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableDestoryThreadDispatcherOpt", "enable");
    }

    public static boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf3be1a", new Object[0])).booleanValue();
        }
        return qrl.a(e2("ScanAnchorBitmapOpt", "true"), true);
    }

    public static String f2(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public static long f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf1dc0d", new Object[0])).longValue();
        }
        return qrl.e(e2("realtimeGoIrpDelayTime", "3"), 3);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27127cf3", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("disable_face");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return false;
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ea270", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("capturePreloadV5");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableDynamicCaptureTemplatePreload_V6", "true"), true);
    }

    public static boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1846ee3b", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableScanBizInitOptV2", "true"), true);
    }

    public static float g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8ebac01", new Object[0])).floatValue();
        }
        return qrl.d(e3("tbAndroidPltDarkFrameThreshold", "0.1"), 0.1f);
    }

    public static boolean g4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a13659", new Object[0])).booleanValue();
        }
        if (caa.s() || caa.t()) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a58f323", new Object[0])).booleanValue();
        }
        return "enable".equals(e2("disableCaptureNewImageLoader", ""));
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49cee06", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnablePltCodeDirectNav", "enable");
    }

    public static boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64e41cc9", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableScanBizInitSync", "false"), false);
    }

    public static int h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40367827", new Object[0])).intValue();
        }
        return qrl.e(e2("detectFinishPopDelay", "2000"), 2000);
    }

    public static int h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bd5baa9", new Object[0])).intValue();
        }
        return qrl.e(e2("recentImageDiff", "120"), 120);
    }

    public static boolean h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b33eba6e", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("enableHardwareDecode");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return TextUtils.equals("enable", d3("tbAndroidPltHardwareDecodeV2"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4928d", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("irpTitleBarGuideDisabled", ""));
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90c38681", new Object[0])).booleanValue();
        }
        return !u4() && T3("tbAndroidPltEnableExtraInfoWhenTakePhoto", "enable");
    }

    public static boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2bdd005", new Object[0])).booleanValue();
        }
        if (jld.a()) {
            return true;
        }
        return T3("tbAndroidPltEnableScanCodeFrameMonitor", "enable");
    }

    public static Long i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("fd9b4d23", new Object[0]);
        }
        if (u4()) {
            return Long.valueOf(qrl.g(e2("dynamicCaptureLoadTimeLimitOnLowDevice", "4000"), Constants.STARTUP_TIME_LEVEL_1));
        }
        return Long.valueOf(qrl.g(e2("dynamicCaptureLoadTimeLimit", "3000"), 3000L));
    }

    public static int i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("482337b8", new Object[0])).intValue();
        }
        return qrl.e(e2("recentImageDuration", "5500"), 5500);
    }

    public static boolean i4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27112bf4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("irpBackPopDisabled", "false"), "true");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1c5680", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableModelStorageOpt", "enable");
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7139bce1", new Object[0])).booleanValue();
        }
        if (t4()) {
            return T3("tbAndroidPltEnableScanCodeInPaiTab_new_High", "baseline");
        }
        if (v4()) {
            return T3("tbAndroidPltEnableScanCodeInPaiTab_new_Medium", "baseline");
        }
        return T3("tbAndroidPltEnableScanCodeInPaiTab_new_Low", "baseline");
    }

    public static boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdbe3b13", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableScanLongAlbumImageV2", "enable");
    }

    public static int j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deb3acad", new Object[0])).intValue();
        }
        return qrl.e(e2("videoFramePerSecond", "2"), 2);
    }

    public static int j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("256073e", new Object[0])).intValue();
        }
        return qrl.e(e2("recheckMaxCnt", "3"), 3);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f56bfdb6", new Object[0])).booleanValue();
        }
        return "true".equals(e2("disableQuickSetting", ""));
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37215714", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableGapDeviceUseDefaultDetector", "true"), true);
    }

    public static boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("903acfdb", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableScanModeOpt", "true"), true);
    }

    public static long k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef87ab5d", new Object[0])).longValue();
        }
        return qrl.g(e2("featureExtractTimeout", "500"), 500L);
    }

    public static float k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59f3bfc8", new Object[0])).floatValue();
        }
        return qrl.d(e2("rtAreaRateStep", "0.06f"), 0.06f);
    }

    public static boolean k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e005331b", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableIrpOuterTrafficEmptyKey", "");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d9de0f", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("restrainRegionDisable", "false"), "true");
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4a2eb4", new Object[0])).booleanValue();
        }
        if (jld.a()) {
            return true;
        }
        return T3("tbAndroidPltEnableHistoryStorageOpt", "baseline");
    }

    public static boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e33638d4", new Object[0])).booleanValue();
        }
        if (D4() || E4()) {
            return false;
        }
        if (caa.s() && !y4()) {
            return false;
        }
        if (!caa.t() || z4()) {
            return T3("tbAndroidPltEnableScreenshotFloatBtnV2", "");
        }
        return false;
    }

    public static boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b19969e9", new Object[0])).booleanValue();
        }
        return "true".equals(e2("irpForceDegree", "false"));
    }

    public static float l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70e0135d", new Object[0])).floatValue();
        }
        return qrl.d(e2("rtBigCardAreaRateThreshold", "0.4"), 0.4f);
    }

    public static boolean l4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c42d954d", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableIrpOuterTraffic", "enable");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37eca49", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableGlobalCircleSearch", "disable");
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24891712", new Object[0])).booleanValue();
        }
        if (Z1("enableIdentifyRegionRect") != null) {
            return true;
        }
        return false;
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("915f055f", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableSetAlbumAdapterOptV2", "baseline");
    }

    public static long m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("817ee29a", new Object[0])).longValue();
        }
        Boolean Z1 = Z1("useTestHistoryPeriod");
        if (Z1 == null || !Z1.booleanValue()) {
            return qrl.g(e2("historyValidPeriod", "15724800000L"), 15724800000L);
        }
        return 3600000L;
    }

    public static float m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6c47eb4", new Object[0])).floatValue();
        }
        return qrl.d(e2("RtCardInCenterStepThreshold", "0.1f"), 0.1f);
    }

    public static boolean m4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48744d5", new Object[0])).booleanValue();
        }
        return "true".equals(e2("irpPopModeEnabled", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a9d962d", new Object[0])).booleanValue();
        }
        return "true".equals(e2("irpAlbumPreLoadoptimizeDisabled", ""));
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bca3db36", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableIndividualCameraThread", "false"), false);
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d549754d", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableSetSurfaceLayoutParamsAgain", "false"), false);
    }

    public static String n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38122711", new Object[0]);
        }
        return e2("i18nAppId", "47900");
    }

    public static float n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edaa9bee", new Object[0])).floatValue();
        }
        return qrl.d(e2("RtCardScreenEdgeDetectThreshold", "0.45f"), 0.45f);
    }

    public static boolean n4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a3edb34", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableIrpSaveHistoryNewLogic", "true"), true);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13ee4344", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableAIWidgetCheck", "enable");
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("592cdc16", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltInsertTaskCidToAlgo", "enable");
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63d0f221", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableSilenceTimeDynamicConfig", "enable");
    }

    public static long o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be908c76", new Object[0])).longValue();
        }
        return qrl.g(e3("tbAndroidPltImageFlowMinChangeHintInterval", "500"), 500L);
    }

    public static int o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2a6ed89", new Object[0])).intValue();
        }
        return qrl.e(e2("realtimeCardCacheNumber", "10"), 10);
    }

    public static boolean o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2a4d02", new Object[0])).booleanValue();
        }
        return "true".equals(e2("irpScreenShotListenEnabled", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92153b11", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableAbstractThrowableMsg", "enable");
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3adcf32c", new Object[0])).booleanValue();
        }
        if (!u4() && !Localization.o()) {
            return true;
        }
        return false;
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d29063", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("smartLens");
        if (Z1 != null && Z1.booleanValue()) {
            return true;
        }
        if (Localization.o()) {
            return false;
        }
        return T3(SMART_LENS, "");
    }

    public static ImageRule p2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("13a9509d", new Object[]{str});
        }
        if (f23320a == null) {
            HashMap hashMap = new HashMap();
            f23320a = hashMap;
            hashMap.put(ImageRule.NET_TYPE_WIFI, new ImageRule(ImageRule.NET_TYPE_WIFI));
            f23320a.put(ImageRule.NET_TYPE_4G, new ImageRule(ImageRule.NET_TYPE_4G));
            f23320a.put(ImageRule.NET_TYPE_3G, new ImageRule(ImageRule.NET_TYPE_3G));
            f23320a.put(ImageRule.NET_TYPE_2G, new ImageRule(ImageRule.NET_TYPE_2G));
            f23320a.put(ImageRule.NET_TYPE_OTHER, new ImageRule(ImageRule.NET_TYPE_OTHER));
        }
        ImageRule imageRule = f23320a.get(str);
        if (imageRule == null) {
            return new ImageRule(str);
        }
        return imageRule;
    }

    public static int p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3064085", new Object[0])).intValue();
        }
        return qrl.e(d3("tbAndroidPltRtObjectBitmapScaleHeight"), 512);
    }

    public static boolean p4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d42ef97a", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("localImageDisabled", "false"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a84bd7c", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableActivityInitOpt", "true"), true);
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("970f9bc5", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableIrpDarkModeOptimize", "enable");
    }

    public static boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c47755", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableStartPreviewOpt", "true"), true);
    }

    public static String[] q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6483050", new Object[0]);
        }
        String e2 = e2("tbAndroidPltIrpCompatibleModePSSourceKeys", "order_invaliditem");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static int q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5469ec5c", new Object[0])).intValue();
        }
        return qrl.e(d3("tbAndroidPltRtObjectBitmapScaleWidth"), ArtcParams.SD244pVideoParams.WIDTH);
    }

    public static boolean q4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd997f5b", new Object[0])).booleanValue();
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        return downgradeStrategy != null && TextUtils.equals("degrade", downgradeStrategy.getTacticsPerformance());
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453a9d73", new Object[0])).booleanValue();
        }
        return !u4() && qrl.a(e2("tbAndroidPltEnableAdvanceObjectDetectPreload", "true"), true);
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efaef7e", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltIrpHeaderHide", "");
    }

    public static boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac65ab8c", new Object[0])).booleanValue();
        }
        if (u4()) {
            return false;
        }
        return T3("tbAndroidPltEnableMnnBlackFrameDetect", "enable");
    }

    public static String r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a095c331", new Object[0]);
        }
        return e2("irpDRSAppId", "31730");
    }

    public static long r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ac68ab8", new Object[0])).longValue();
        }
        return qrl.e(e2("realtimeCardExpireDate", "1000"), 1000);
    }

    public static boolean r4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffa1c7b3", new Object[0])).booleanValue();
        }
        if (TextUtils.isEmpty(J2())) {
            return false;
        }
        return T3("tbAndroidPltMarketingTab", "baseline");
    }

    public static boolean s() {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a38c60f", new Object[0])).booleanValue();
        }
        return !u4() && (e = qrl.e(e3(ADVANCE_AUTODETECT_EXPERIMENT, "3"), -1)) >= 0 && (e & 2) > 0 && !u4();
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a9134d3", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("tbAndroidPltIrpPageUTFixedParamsEnabled", "true"), "true");
    }

    public static boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fad631b8", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltTurnOffFlashWhenFlipCamera", "enable");
    }

    public static String s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d122c301", new Object[0]);
        }
        String Y1 = Y1("identifyWeex2");
        if (!TextUtils.isEmpty(Y1)) {
            return Y1;
        }
        String f = PltTemplatesManager.f(PltTemplatesManager.KEY_IRP_IDENTIFY);
        return !TextUtils.isEmpty(f) ? f : e2("irpIdentifyTemplateDefault", "https://g.alicdn.com/tb-webb-widget-cloud/plt-identifyall-disambiguation-card/0.0.9/muise/main.v21.wlm");
    }

    public static float s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5fc8b36", new Object[0])).floatValue();
        }
        return qrl.d(e2("rtSmallCardAreaRateThreshold", "0.2"), 0.2f);
    }

    public static boolean s4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e78385f5", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltMetaSearchV1", "baseline");
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22378be4", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("albumCrashFixed", "true"));
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ced1f7c", new Object[0])).booleanValue();
        }
        if (Localization.o()) {
            return false;
        }
        return T3("tbAndroidPltIrpQuickSearch", "");
    }

    public static boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a9ade7f", new Object[0])).booleanValue();
        }
        return T3("tbUniversalPssourceNotnull", "enable");
    }

    public static String t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b51caf7", new Object[0]);
        }
        return e3("tbAndroidPltIrpImgCompressConfigVersion", "V1");
    }

    public static long t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4d955d7", new Object[0])).longValue();
        }
        return qrl.g(e2("pltRuntimePermTipSilenceInterval", "3"), 3L);
    }

    public static boolean t4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9475b66", new Object[0])).booleanValue();
        }
        return ri7.a().equalsIgnoreCase("high");
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad76719", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766ec8a2", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableIrpRebuild", "");
    }

    public static boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("466dca61", new Object[0])).booleanValue();
        }
        return "true".equals(e2("enableUpdateUtLogMapProperties", "true"));
    }

    public static int u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79b60bce", new Object[0])).intValue();
        }
        return qrl.e(e3("tbAndroidPltIrpImgCompressRate", "70"), 70);
    }

    public static String u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("998df47a", new Object[0]);
        }
        return e2("pltScanCodeAnchorAddress", "https://gw.alicdn.com/imgextra/i4/O1CN01Fl3q1p1xNuMFlq21s_!!6000000006432-54-tps-100-100.apng");
    }

    public static boolean u4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f239db2", new Object[0])).booleanValue();
        }
        return ri7.a().equalsIgnoreCase("low");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c13ec3", new Object[0])).booleanValue();
        }
        return qrl.a(e2("tbAndroidPltEnableAlbumPreprocess", "true"), true);
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e20aa5", new Object[0])).booleanValue();
        }
        return "true".equals(e2("IrpRequestExtraParamsPassNewLogicEnabled", "true"));
    }

    public static boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3164b6b", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(e2("tbAndroidPltEnableUploadLocationOnMtop", ""));
    }

    public static String v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb7dbac6", new Object[0]);
        }
        String w2 = w2();
        if (!TextUtils.isEmpty(w2)) {
            return w2;
        }
        String f = PltTemplatesManager.f(PltTemplatesManager.e());
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        if (Localization.o()) {
            return e2("irpI18NMuiseUrl2023Default", "https://g.alicdn.com/tmall-ovs-rax/i18n-image-search-2022/1.0.44/weex/home.v20.wlm");
        }
        return e2("irpMuiseUrl2023Default", "https://g.alicdn.com/imagesearch-page/image-search-2022/1.0.50/weex/home.v20.wlm");
    }

    public static long v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93453938", new Object[0])).longValue();
        }
        String Y1 = Y1("ScanTimeout");
        if (!TextUtils.isEmpty(Y1)) {
            return qrl.g(Y1, 1500L);
        }
        return qrl.g(e2("ScanCodeTimeConfigOnTakePhoto", "1500"), 1500L);
    }

    public static boolean v4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e0d1cb9", new Object[0])).booleanValue();
        }
        return ri7.a().equalsIgnoreCase("medium");
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebc141d", new Object[0])).booleanValue();
        }
        return T3("tbAndroidAlbumUpdateOptimize", "");
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269f8205", new Object[0])).booleanValue();
        }
        return qrl.a(e2("enableVideoIrpPreload", "true"), true);
    }

    public static String w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb0b811b", new Object[0]);
        }
        if (Localization.o()) {
            return Y1("orangeNewMuiseSrpUrl2023I18n");
        }
        return Y1("orangeNewMuiseSrpUrl2023");
    }

    public static String w3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69dd37bb", new Object[]{new Boolean(z)});
        }
        if (z) {
            return Localization.q(R.string.taobao_app_1007_1_33711);
        }
        if (Localization.o()) {
            return e2("scanHintI18N", Localization.q(R.string.taobao_app_1007_1_19839));
        }
        return e2("scanHint", Localization.q(R.string.taobao_app_1007_1_18932));
    }

    public static boolean w4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0e2d45c", new Object[0])).booleanValue();
        }
        String e2 = e2("permission_req_opt_enable", "");
        return TextUtils.isEmpty(e2) || "true".equals(e2);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8754c9", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableAlbumVExcutorLoadThumbnail", "");
    }

    public static long x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f3d83a", new Object[0])).longValue();
        }
        return qrl.g(e2("irpAlbumScanLongImageTimeoutConfig", "3000"), 3000L);
    }

    public static boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36efea", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableWatermarkNewLogic", "disable");
    }

    public static String x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a2115", new Object[0]);
        }
        return e2("IrpNotSafeDialogTip", Localization.q(R.string.taobao_app_1007_1_19013));
    }

    public static String x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b62cf1a", new Object[0]);
        }
        return e2("screenShotConfig", "1200_1200_70");
    }

    public static boolean x4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f426f38", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", e2("remoteImageFallback", "false"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49d13a31", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("alinnStorageOpt");
        if (Z1 != null) {
            return Z1.booleanValue();
        }
        return T3("tbAndroidPltEnableModelStorageOpt_V2", "baseline");
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf2fdeb6", new Object[0])).booleanValue();
        }
        return "true".equals(e2("enableCaptureTemplatePreload", "true"));
    }

    public static boolean y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aab1e6e", new Object[0])).booleanValue();
        }
        Boolean Z1 = Z1("forbid_frame_scan_code");
        if (Z1 == null) {
            return false;
        }
        return Z1.booleanValue();
    }

    public static String[] y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3ac786d0", new Object[0]);
        }
        String e2 = e2("tbAndroidPltIrpOuterTrafficValidKeys", "item_id");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static int y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79dbd69a", new Object[0])).intValue();
        }
        return qrl.e(e2("screenshotsAbandonFrameCount", "1"), 1);
    }

    public static boolean y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("762a644", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("irpScreenshotFloatInFoldEnable", ""), "true");
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68f35558", new Object[0])).booleanValue();
        }
        return T3("tbAndroidPltEnableAsyncChannelDetect", "enable");
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7a4f77a", new Object[0])).booleanValue();
        }
        return "true".equals(e2("irpUserDataCheckEnable", "true"));
    }

    public static boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e699f171", new Object[0])).booleanValue();
        }
        if (Z1(ParamsConstants.Key.PARAM_FORCE_NATIVE) != null) {
            return true;
        }
        return false;
    }

    public static String[] z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1921fe3b", new Object[0]);
        }
        String e2 = e2("tbAndroidPltIrpOuterTrafficPSSourceKeysV2", "");
        if (TextUtils.isEmpty(e2)) {
            return new String[0];
        }
        return e2.split("/");
    }

    public static long z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2012bb", new Object[0])).longValue();
        }
        return qrl.g(d3("tbAndroidPltSilentTimeInPermissionScene"), 1500L);
    }

    public static boolean z4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e37a580c", new Object[0])).booleanValue();
        }
        return TextUtils.equals(e2("irpScreenshotFloatInPadEnable", ""), "true");
    }

    public static boolean C4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74004c28", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String e2 = e2("irpDRSPSSourceBlackList", "");
        return e2.contains(str + "/");
    }

    public static boolean O4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e0a258", new Object[]{str})).booleanValue();
        }
        String e2 = e2("new_scene_source", "");
        if (TextUtils.isEmpty(e2) || TextUtils.isEmpty(str)) {
            return false;
        }
        return e2.contains(str);
    }

    public static String g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb57cb5c", new Object[0]);
        }
        long f3 = f3();
        try {
            return String.format(e2("realtimeGoIrpTipFormat", Localization.q(R.string.taobao_app_1007_1_19015)), Long.valueOf(f3));
        } catch (Exception unused) {
            return f3 + Localization.q(R.string.taobao_app_1007_1_19010);
        }
    }

    public static String d2(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6db17b3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String e2 = e2("componentConfig", "huichang_618fushi:plt_more_clothing_api");
        if (TextUtils.isEmpty(e2)) {
            return "";
        }
        String[] split = e2.split(";");
        if (split.length <= 0) {
            return "";
        }
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String[] split2 = split[i].split(":");
            if (split2.length >= 2) {
                String str3 = split2[0];
                str2 = split2[1];
                if (str.equals(str3) && !TextUtils.isEmpty(str2)) {
                    break;
                }
            }
            i++;
        }
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public static boolean f4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a38282f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String e2 = e2("watermarkDetectWhiteList", "anma1;anma2;");
        if (TextUtils.isEmpty(e2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";");
        return e2.contains(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j4(java.lang.String r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lg4.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "1726c0da"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0019:
            java.lang.String r2 = "pltLoading"
            java.lang.Boolean r2 = Z1(r2)
            if (r2 == 0) goto L_0x0029
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x0029:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0080
            java.lang.String r2 = "irpLoadingOptimizeWhiteList"
            java.lang.String r3 = "push;1111xianshang;haiguan;dhhdpa;"
            java.lang.String r2 = e2(r2, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r5 = ";"
            if (r4 != 0) goto L_0x0058
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            if (r2 != 0) goto L_0x007f
            java.lang.String r2 = "irpLoadingOptimizeWhiteListV2"
            java.lang.String r2 = e2(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0080
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r5)
            java.lang.String r6 = r3.toString()
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x0080
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = r2
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            return r1
        L_0x0083:
            java.lang.String r6 = "tbAndroidPltIrpLoadingOptimize"
            java.lang.String r0 = ""
            boolean r6 = T3(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lg4.j4(java.lang.String):boolean");
    }

    static {
        t2o.a(481296916);
    }
}
