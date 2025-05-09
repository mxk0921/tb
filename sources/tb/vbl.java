package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.taolive.room.service.IPlayPublicService;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CLOSE_VALUE = "false";
    public static final String DEFAULT_OPEN_VALUE = "true";
    public static final String ORANGE_GROUP = b5m.E().a();

    static {
        t2o.a(912262823);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4300d1ec", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enableDetailLightoffDxNew", "true"));
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a149fe", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_test_retry", "false"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9fe8a44", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enableDetectMemoryWhenDestroy", "true");
        tgh.b("OrangeUtils", "Activity销毁之后检测头图是否有内存泄漏, enableDetectMemoryWhenDestroy = " + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60bb2187", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_touchdown", "true");
        tgh.b("OrangeUtils", "Orange enableTouchDownEvent:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("857a31f3", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_downgrade_h5_shrink", "false"));
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3973ad9d", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_upgrade_tb_player_sdk", "0");
        tgh.b("OrangeUtils", "enableUpgradeTBPlayerSDK =" + config);
        return l92.b(config);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995c03f3", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "error_page_use_mtop_code", "false"));
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a27166", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_video_autoplay", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e08deb9", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_fix_pad_rate_restore", "false"));
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c91955", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "not_auto_play_video_low_device", "false"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238b5e63", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_float_bottom_dx", "true"));
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b6bcd0", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_water_mask_trace", "true"));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dafa3c5", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_float_replace_url_params", "true"));
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a93ac7", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_weex_component_leak", "true"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf25bf03", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return true;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_fold_device_single_column", "true"));
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31f8ad9d", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "disable_invoke_sku_newpage", "false"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c9d45e7", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_force_size_light_off_video_auto_play", "true"));
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b7ec38", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enableWeexSkuV3PreloadNew", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6d0b5e", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_gif_container_opt", "true"));
    }

    public static List<String> J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f50dc377", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return null;
        }
        String config = b.getConfig(ORANGE_GROUP, "detail_search_white_switch_list", "search,shopsearch");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        return Arrays.asList(config.split(","));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d59b85", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_global_barrage", "true"));
    }

    public static String K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbca0181", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return "search,newDetail,cart";
        }
        return b.getConfig(ORANGE_GROUP, "batch_preload_channel_white_list", "search,newDetail,cart");
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d7ebb2", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_hide_title_tag", "false"));
    }

    public static String[] L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8a1e1264", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return "utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME,picurl,reservePrice,p4p_url".split(",");
        }
        return b.getConfig(ORANGE_GROUP, "detail_request_params_black_list", "utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME,picurl,reservePrice,p4p_url").split(",");
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("469f9113", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_i18n_preload", "true"));
    }

    public static JSONObject M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4c9ea6", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return null;
        }
        try {
            return JSON.parseObject(b.getConfig(ORANGE_GROUP, "new_structure", ""));
        } catch (Throwable th) {
            tgh.c("OrangeUtils", "getNewArchitectureConfig() error", th);
            return null;
        }
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c66490e5", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return true;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_ignore_error_receive_data", "true"));
    }

    public static float N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a815d4a5", new Object[0])).floatValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return 1.5f;
        }
        return Float.parseFloat(b.getConfig(ORANGE_GROUP, "recommend_first_request_position", IPlayPublicService.PlayRate.PLAY_SPEED_1_5X));
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e27fe58e", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_inside_anim_opt", "true"));
    }

    public static String O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d5ce173", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return "12";
        }
        return b.getConfig(ORANGE_GROUP, "recommend_paging_request_position", "12");
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f578cd8c", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_inside_barrage", "true");
        tgh.b("OrangeUtils", "Orange enableInsideBarrage:" + config);
        return Boolean.parseBoolean(config);
    }

    public static String P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f78447a", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return "https://pages-g.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&hybrid=true&id=";
        }
        return b.getConfig(ORANGE_GROUP, "redirect_base_h5_url", "https://pages-g.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&hybrid=true&id=");
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6ed3474", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enableInsideNewHeightAB", "true"));
    }

    public static List<String> Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3568431f", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return null;
        }
        String config = b.getConfig(ORANGE_GROUP, "spring_main_request_degrade_black_list", "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        tgh.b("OrangeUtils", "春晚限流，主接口降级, 黑名单: " + config);
        return Arrays.asList(config.split(","));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d7c776", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enableLightoffSplitScreenFix", "true"));
    }

    public static List<String> R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("932ad335", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return null;
        }
        String config = b.getConfig(ORANGE_GROUP, "spring_preload_request_degrade_black_list", "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        tgh.b("OrangeUtils", "春晚限流，导航预加载降级, 黑名单: " + config);
        return Arrays.asList(config.split(","));
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f2c1d0", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_main_pic_support_live_photo", "true"));
    }

    public static String[] S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("60cf530a", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return "referrer,utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,picurl,reservePrice,p4p_url".split(",");
        }
        return b.getConfig(ORANGE_GROUP, "url_params_black_list_for_share", "referrer,utparam,list_param,%22list_param,search_keyword,eurl,price,title,pic_path,afc_link,utparamcnt,tk_cps_param,tkFlag,tk_cps_ut,relationId,union_lens,picurl,reservePrice,p4p_url").split(",");
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a292c1ad", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_main_request_batch_preload", "true"));
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d842e", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable2H5WhenException", "false");
        tgh.b("OrangeUtils", "端侧异常是否降级到H5, enable2H5WhenException = " + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1746e6e", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_main_request_degrade", "false"));
    }

    public static boolean U0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a977afd1", new Object[]{jSONObject})).booleanValue();
        }
        Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sForceNewArchitecture));
        return false;
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3439b96", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_modify_rate_itemId", "true"));
    }

    public static boolean V0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2629447", new Object[]{jSONObject})).booleanValue();
        }
        return i1(jSONObject, M0());
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624f406f", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_mtop_header_map", "true");
        tgh.b("OrangeUtils", "Orange enable_mtop_header_map:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9d13dd2", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_collect_pop_layer", "true"));
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5ae5154", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_nav_preload", "true"));
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14f40bad", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return l92.b(b.getConfig(ORANGE_GROUP, "newUserBehaviorRatio", "10000"));
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13dc2cf7", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_new_collect_interface", "true"));
    }

    public static boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc095b14", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return l92.b(b.getConfig(ORANGE_GROUP, "UBFRatio", "10000"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d42f052a", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_new_recommend_style", "true"));
    }

    public static boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6676ea0", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "prohibit_pic_video_double_report", "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b29314", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "close_wvhw_list", "");
        if (!TextUtils.isEmpty(config)) {
            if (config.contains("," + Build.MODEL.toLowerCase(Locale.getDefault()) + ",")) {
                return true;
            }
        }
        return false;
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfd213ea", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_obtain_keywords_from_global_rate", "false"));
    }

    public static boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ba808f", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "rollback_fix_hint_banner", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b6bfb", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_add_subItemId", "true");
        tgh.b("OrangeUtils", "是否允许增加subItemId作为供应商id = " + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18c62ff", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_open_inner_sku", "true"));
    }

    public static int b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("414aec3", new Object[0])).intValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return Integer.parseInt("10000");
        }
        String config = b.getConfig(ORANGE_GROUP, "skuCountLimitForPreload", "10000");
        tgh.b("OrangeUtils", "Orange skuCountLimitForPreload:" + config);
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            tgh.b("OrangeUtils", "Orange skuCountLimitForPreload exception");
            return Integer.parseInt("10000");
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89e75b35", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_adjust_desc_height", "true"));
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70e54a5d", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_open_rate_with_new_data_model", "true"));
    }

    public static int c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71b0df20", new Object[0])).intValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return Integer.parseInt("10");
        }
        String config = b.getConfig(ORANGE_GROUP, "skuV3CountLimitForPreload", "10");
        tgh.b("OrangeUtils", "Orange skuV3CountLimitForPreload:" + config);
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            tgh.b("OrangeUtils", "Orange skuV3CountLimitForPreload exception");
            return Integer.parseInt("10");
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a7b6866", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_adjust_detail_desc_height", "true"));
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9eb76ab", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_openWW_with_DigitalId", "true"));
    }

    public static boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f0f212", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "weex2ConvertToNewWeex2", "0");
        tgh.b("OrangeUtils", "升级weex2, weex2ConvertToNewWeex2=" + config);
        return l92.b(config);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0125691", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_adjust_render_order", "true"));
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de1d3269", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_opt_bitmap_recycler", "true"));
    }

    public static boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c336062", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "weex1ConvertToNewWeex2", "0");
        tgh.b("OrangeUtils", "升级weex2, weex1ConvertToNewWeex2=" + config);
        return l92.b(config);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78505a7b", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_adv_add_to_cart_new_anim", "true"));
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf21299", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_pad_adapt_new_recommend", "false"));
    }

    public static boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d03966", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_height_scale_image", "0");
        if (!h1()) {
            return false;
        }
        if (l92.b(config) || o91.c()) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("230f7439", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_liftup_sku", "true");
        tgh.b("OrangeUtils", "Orange enableAutoShowSku:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c36ce124", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_pic_container_opt", "true"));
    }

    public static boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5227cf74", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_high_quality_image", "0");
        if (!h1()) {
            return false;
        }
        if (l92.b(config) || o91.c()) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c7b21d", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_newArc_batch_preload", "true"));
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0a2e6f", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_pre_request_opt", "true"));
    }

    public static boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("653d7d47", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "improve_image_quality", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fd85041", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_bottombar_cart_refresh", "true"));
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfbf3bcb", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_detail_v3_preload_data_clip", "true"));
    }

    public static boolean i1(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d3e7b11", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        return true;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a4262bb", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_bottombar_downgrade", "false"));
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f339c6c6", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_preload_rate_instance", "true"));
    }

    public static boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3bf182", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "disable_pre_update_item", "false"));
    }

    public static boolean k() {
        AliConfigInterface b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84e3298", new Object[0])).booleanValue();
        }
        if (j() && (b = yo0.b()) != null) {
            return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_bottombar_empty_downgrade", "false"));
        }
        return false;
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac96bf24", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_rate_float", "true"));
    }

    public static boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefae362", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_add_taogold_item", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1547d22", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_cache_address_bundle", "true"));
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482687a5", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_rate_prefetch", "true"));
    }

    public static boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634789c", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_cache_page_key", "false"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19834f82", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_ccrc_activate", "true"));
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecf9b158", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_redirect_default_url", "true");
        tgh.b("OrangeUtils", "重定向默认url, enable_redirect_default_url=" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12aabdc1", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_same_price_params_not_update", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d7195c", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_change_share_view", "true"));
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f803ad5f", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_redirect_use_ssr", "false"));
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65e89891", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_single_use_cache", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca07588d", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_clearpreweex_onupdate", "true");
        tgh.b("OrangeUtils", "主屏切地址或穿越场景，清理已经预加载的weex实例，enable_clearpreweex_onupdate=" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a380cf31", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_replace_live_icon_float", "true"));
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab080f99", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_tab_transition_animator", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb028414", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_close_global_live_view", "true"));
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13825089", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_report_error_use_mtop", "true"));
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea25327b", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_use_thread_safe_list", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6aa4be7", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_collect_use_new_favorite", "true"));
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624a1824", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_scroll_log_print", "false"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92fb60b8", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_component_fatigue", "true");
        tgh.b("OrangeUtils", "是否允许组件疲劳度功能启动: " + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d2cfcb", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_scroller_finish_abort", "true"));
    }

    public static boolean s() {
        AliConfigInterface b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("723c90df", new Object[0])).booleanValue();
        }
        if (j() && (b = yo0.b()) != null) {
            return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_dxbottombar_rendererror_downgrade", "false"));
        }
        return false;
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f047e016", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_set_h5_error_page", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d253ffa", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_data_cropping", "true");
        tgh.b("OrangeUtils", "主接口数据协议剪裁, enable_data_cropping=" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e2bdd9f", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enableSinglePicCenter", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb1e47c", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_decouple_item_click", "true"));
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("519310b5", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_sku_anr_fix", "true");
        tgh.b("OrangeUtils", "Orange enableSkuAnrFix:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("970047ca", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enable_delete_oneProductMM_modify_itemId_ratio", "100");
        tgh.b("OrangeUtils", "允许删除回刷详情时一品多商非降级强制赋值平台id的逻辑, 逐步放量: " + config);
        return l92.b(config);
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8188d114", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "enableSkuJsonDataFix", "false");
        tgh.b("OrangeUtils", "Orange enableSkuJsonDataFix:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df2be37c", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_delete_preload_cache", "true"));
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f888e9b", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "spring_main_request_degrade_ratio", "0");
        tgh.b("OrangeUtils", "春晚限流，主接口降级, 逐步放量: " + config);
        return l92.b(config);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e31a2af", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_desc_anchor_point_show", "true"));
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddaf22d1", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        String config = b.getConfig(ORANGE_GROUP, "update_detail_enable_stream", "true");
        tgh.b("OrangeUtils", "Orange enableStreamCustomApi:" + config);
        return Boolean.parseBoolean(config);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2728f04e", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_desc_prefetch_image_opt", "true"));
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a3f8cef", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_nav_support_festival", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56be989b", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_desc_themis_rum", "true"));
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0d6c2b7", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(ORANGE_GROUP, "enable_suspected_ai_desc", "true"));
    }
}
