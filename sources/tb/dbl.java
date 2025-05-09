package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPEN_NAV_PROCESSOR = "open_Nav_Processor";
    public static final String ORANGE_CONFIG_NEW_NO_MAP_WEATHER_DEVICE_CONFIG = "logistic_detail_no_map_weather_device_config";
    public static final String ORANGE_CONFIG_NEW_NO_WEATHER_DEVICE_CONFIG = "logistic_detail_no_weather_device_config";
    public static final String ORANGE_CONFIG_NEW_NO_WEATHER_DEVICE_DEAULT_CONFIG = "{\"deviceScore\":70,\"rule\":[]}";
    public static final String ORANGE_CONFIG_WEATHER_DEFAULT_URL = "{\"W01\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/gaowen.zip?__md__=gaowen\",\"W02\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W03\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W04\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/thunder.zip?__md__=thunder\",\"W05\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W06\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/cold.zip?__md__=cold\",\"W07\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/yun.zip?__md__=yun\",\"W08\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/sand.zip?__md__=sand\",\"W09\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/wu.zip?__md__=wu\",\"W08_MAP\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.66/android/sand_map.zip?__md__=sand_map\",\"W09_MAP\":\"https://g.alicdn.com/ch/logistic_detail_weather/0.0.62/android/wu_map.zip?__md__=wu_map\"}";
    public static final String ORANGE_CONFIG_WEATHER_URL = "logistic_detail_weather_url_20180921";
    public static final String ORANGE_NO_MAP_DEVICE_CONFIG = "logistic_detail_no_map_device_config";
    public static final String ORANGE_OD_NO_MAP_DEVICE_CONFIG = "order_detail_no_map_config";
    public static final String ORANGE_PARTICAL_WEATHER_OPENGL_CONFIG = "logistic_detail_map_partical_weather_opengl_config_521";
    public static final String O_DETAIL_NAV_H5 = "oDetail_nav_h5";
    public static final String O_LIST_H5 = "oList_h5";
    public static final String O_LIST_V2 = "oList_V2_Open";

    static {
        t2o.a(713031925);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e063a4e3", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babelorder", "oList_NewH5Url", "https://market.m.taobao.com/app/dinamic/h5-tb-olist/index.html?isNew=false");
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1b84ade", new Object[0]);
        }
        if (v9v.i(wbl.NEW_BABEL_ORDER, "enableStreamRequest", false)) {
            return CoreConstants.API_NAME_STREAM_LIST_V2;
        }
        return CoreConstants.API_NAME_LIST_V2;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82a3892", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "reNavWhenFindDirectTo", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12574c9c", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "OD_Preload_GD", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c018fe", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_use_background", "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2080dc2", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "appendRedirectOD4TradeHybridParam", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7338c3e2", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "disableRecycleViewAnimator", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c600be2c", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "enableRedirectToOrderDetail4", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7cc8b4", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_dowgradeH5_retV1", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f616a47", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oList_dowgradeH5_retV1", "false"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc8c3d9", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_enable_redirect_when_close_page", "true"));
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0849ad3", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_detail_url", "https://m.duanqu.com/?_ariver_appid=11509317&page=pages%2Flogistic%2Flogistic%3FappName%3DTAOBAOMINIAPP%26querySourceId%3D68719480945");
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb96cd4d", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babelorder", O_LIST_H5, "");
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f723d1f9", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babelorder", "oDetail_h5", "");
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d732c99d", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("babelorder", n9l.FLING_VELOCTIY, "2500"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ce6fd1", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_detail_url", "https://page.cainiao.com/mcn/common-logistics/web/index.html?wx_navbar_transparent=true&disableNav=YES&titleVisible=false#/?source=taobao&querySourceId=68719480944&showTitle=true&tradeId=");
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0ca9bd8", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babel_order_logisitics", "logistic_package_list_url", "https://meta.m.taobao.com/app/dinamic/tb-logistics/home?renderType=2&is_loading=0");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c72ea624", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "ODetail_AssembleUrl", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88aa81bc", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "catch_dispatch_dme", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bed4af", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "is_destroy_orderweexview", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34310523", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", O_DETAIL_NAV_H5, "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8073d8f9", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", O_LIST_V2, "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("125e8e6e", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", OPEN_NAV_PROCESSOR, "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a19c948", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "isRemoveVHItemParentV1", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebee55", new Object[0])).booleanValue();
        }
        if (qp0.b() == 2) {
            return true;
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832cc2dd", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_RecommendLoading", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79eb9110", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "asyncParseRpcResponse", "false"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ca793a", new Object[0])).booleanValue();
        }
        return t() && "true".equals(OrangeConfig.getInstance().getConfig("babelorder", n9l.OPEN_FLING_VELOCTIY, "false"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("421ef09b", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "pData", "false"));
    }

    public static String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bb2376", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babelorder", "oDetail_NewH5Url", "https://market.m.taobao.com/app/dinamic/h5-tb-odetail/index.html?isNew=false");
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20c2c311", new Object[0]);
        }
        return CoreConstants.API_NAME_DETAIL_V2;
    }
}
