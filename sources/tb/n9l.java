package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n9l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SUBSCRIBE_MSG_LIST = "MSG_REFRESH_UI,MSG_REFRESH,MSG_SCROLL_CHANGE_QUICK,SHOW_SINGLE_TAG_IF_NEED,AR_MAKE_UP_COMPLETED,TBRatePicOnAlbumClicked,MSG_REFRESH_FLOATS,MSG_REFRESH_TAB,MSG_TAG_LIST_STATUS,MSG_SCROLL_CHANGE,subscribe_click_share_msg,pre_request_buyshower_data,MSG_FEEDBACK_UPDATE";
    public static final String ENABLE_ALI_TEXT_STYLE = "enableALiTextStyle";
    public static final String ENABLE_FRAGMENT_RECOVERY = "enableFragmentRecovery";
    public static final String ENABLE_RATE_CPU_BOOST = "enableCPUBoost";
    public static final String ENABLE_RATE_INFO_ERROR = "enableReportRateInfoError";
    public static final String ENABLE_RATE_ITEM_ID_ERROR = "enableReportItemIdError";
    public static final String ENABLE_RATE_LIST_IMAGE_PRELOAD_IN_NAV = "enableRateListImagePreloadInNavRectify";
    public static final String ENABLE_RATE_LIST_PERFORMANCE = "enableRateListPerformance";
    public static final String ENABLE_RATE_LIST_REFACTOR = "enableRateListRefactor";
    public static final String ENABLE_RATE_LIST_WEEX_PRERENDER = "enableRateListPreRender";
    public static final String ENABLE_RATE_LIST_WEEX_PRE_REQUEST = "enableRateListPreRequest";
    public static final String ENABLE_RATE_PAGER_PERFORMANCE = "enableRatePagerPerformance";
    public static final String FIRST_FRAME_END_TIME_TRACK_ENABLE = "firstFrameTopEndTimeRateEnable";
    public static final String FIRST_FRAME_LONG_TAIL_TRACK_ENABLE = "FirstFrameLongTailTrackRateEnable";
    public static final String FIRST_FRAME_START_TIME_TRACK_ENABLE = "firstFrameTopStartTimeRateEnable";
    public static final String FIRST_FRAME_TRACK_ENABLE = "firstFrameTopRateEnable";
    public static final String FIRST_FRAME_TRACK_IMAGE_SIZE = "firstFrameTopRateImageSize";
    public static final String FIRST_FRAME_TRACK_TIMEOUT_TIME = "firstFrameTimeout";
    public static final String FIRST_FRAME_TRACK_TOP_RATE = "firstFrameTopRate";
    public static final String FLING_VELOCTIY = "flingVelocity";
    public static final String HIDE_LOADING = "hideLoading";
    public static final n9l INSTANCE = new n9l();
    public static final String JS_TRACK_ERROR_RATE_REPORT_SAMPLE = "js_track_error_rate_report_sample";
    public static final String JS_TRACK_PRE_REPORT_SAMPLE = "js_track_pref_report_sample";
    public static final String JS_TRACK_REPORT_SAMPLE = "js_track_report_sample";
    public static final String JS_TRACK_SUCCESS_RATE_REPORT_SAMPLE = "js_track_success_rate_report_sample";
    public static final String KEY_SUBSCRIBE_MSG_LIST = "subscribeMsgList";
    public static final String LOADING_VIEW_FIRST_FRAME_TRACK_ENABLE = "loadingViewFirstFrameTopRateEnable";
    public static final String LOADING_VIEW_FIRST_FRAME_TRACK_TOP_RATE = "loadingViewFirstFrameTopRate";
    public static final String NEW_EVENT_HANDLER = "isNewEventChainHandler";
    public static final String OPEN_FLING_VELOCTIY = "openFlingVelocity";
    public static final String OPEN_GRAY_NEW_DIFF = "openGrayNewDiff";
    public static final String OPEN_LOADING_VIEW_TRACK = "openLoadingViewTrack";
    public static final String OPEN_NEW_DIFF = "openNewDiff";
    public static final String OPEN_PRE_RENDER = "openPreRender";
    public static final String OPEN_RATE_PAGER_ADD_PURCHASE = "openRatePagerAddPurchase";
    public static final String OPEN_VIDEO_CONTROL = "openVideoControl";
    public static final String OPEN_VIDEO_CONTROL_APPEND = "openVideoControlAppend";
    public static final String PAGE_ANIM_DURATION = "page_anim_duration";
    public static final String PAGE_ANIM_DURATION_WEEX = "weex_page_anim_duration";
    public static final String PRE_RENDER_MIN_VERSION = "preRenderMinVersion";
    public static final String PRE_REQUEST_DELAY_CALLBACK = "enablePreRequestDelayCallback";
    public static final String RATE_LIST_PAGE_ANIM_DURATION = "rate_list_page_anim_duration";
    public static final String RATE_LIST_POP_ANIM_DURATION = "rate_list_pop_anim_duration";
    public static final String RATE_LIST_POP_ANIM_DURATION_WEEX = "rate_list_weex_pop_anim_duration";
    public static final String RATE_LIST_WEEX_URL = "rateListWeexUrl";
    public static final String RELEASE_DX_ENGINE_WHEN_DESTROY = "releaseDXEngineWhenDestroy";
    public static final String SCROLL_THROTTLE_DURATION = "scrollThrottleDuration";
    public static final String USER_TEXTSIZE_STRATEGY = "textSizeStrategy";
    public static final String WEEX_FORMAL_URL = "https://meta.m.taobao.com/app/taobao-ugc-community/rate-list/?wh_weex=true&weex_mode=dom";

    public final String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1533333f", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, RATE_LIST_WEEX_URL, WEEX_FORMAL_URL);
        ckf.f(config, "OrangeConfig.getInstance…EEX_URL, WEEX_FORMAL_URL)");
        return config;
    }

    public final JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cdbd1ef1", new Object[]{this});
        }
        if (dx1.Companion.c()) {
            return o();
        }
        return q();
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfb516bb", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, SCROLL_THROTTLE_DURATION, "100");
        ckf.f(config, "OrangeConfig.getInstance…THROTTLE_DURATION, \"100\")");
        Integer m = ssq.m(config);
        if (m != null) {
            return m.intValue();
        }
        return 100;
    }

    public final int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dae8b951", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_TRACK_TOP_RATE, "2");
        ckf.f(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"2\")");
        return Integer.parseInt(config);
    }

    public final int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3871502", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_TRACK_IMAGE_SIZE, "3");
        ckf.f(config, "OrangeConfig.getInstance…ME_TRACK_IMAGE_SIZE, \"3\")");
        return Integer.parseInt(config);
    }

    public final long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d078ccf4", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_TRACK_TIMEOUT_TIME, IDecisionResult.ENGINE_ERROR);
        ckf.f(config, "OrangeConfig.getInstance…ACK_TIMEOUT_TIME, \"5000\")");
        return Long.parseLong(config);
    }

    public final long G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79147086", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, PAGE_ANIM_DURATION_WEEX, "250");
        ckf.f(config, "OrangeConfig.getInstance…NIM_DURATION_WEEX, \"250\")");
        return Long.parseLong(config);
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae278d47", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "is_enable_ipad_opt", "false"));
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8dadcc2", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_ALI_TEXT_STYLE, "true"));
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8f80c11", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, NEW_EVENT_HANDLER, "true"));
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9afc8c09", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, USER_TEXTSIZE_STRATEGY, "true"), "true");
    }

    public final float N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a2d678a", new Object[]{this})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, JS_TRACK_PRE_REPORT_SAMPLE, "0.01");
        ckf.f(config, "OrangeConfig.getInstance…RE_REPORT_SAMPLE, \"0.01\")");
        return Float.parseFloat(config);
    }

    public final float O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37c7a803", new Object[]{this})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, JS_TRACK_ERROR_RATE_REPORT_SAMPLE, "1");
        ckf.f(config, "OrangeConfig.getInstance…_RATE_REPORT_SAMPLE, \"1\")");
        return Float.parseFloat(config);
    }

    public final float P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1156041", new Object[]{this})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, JS_TRACK_REPORT_SAMPLE, "1");
        ckf.f(config, "OrangeConfig.getInstance…TRACK_REPORT_SAMPLE, \"1\")");
        return Float.parseFloat(config);
    }

    public final float Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("598b4be", new Object[]{this})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, JS_TRACK_SUCCESS_RATE_REPORT_SAMPLE, "0.0001");
        ckf.f(config, "OrangeConfig.getInstance…_REPORT_SAMPLE, \"0.0001\")");
        return Float.parseFloat(config);
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdd33795", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_END_TIME_TRACK_ENABLE, "true"));
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3d3a1ae", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_START_TIME_TRACK_ENABLE, "true"));
    }

    public final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6719d8f", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_TRACK_ENABLE, "true"));
    }

    public final boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d823a562", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, LOADING_VIEW_FIRST_FRAME_TRACK_ENABLE, "true"));
    }

    public final boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de068bf", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_LOADING_VIEW_TRACK, "true"));
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f6cb74", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_RATE_PAGER_ADD_PURCHASE, "true"));
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b71257", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_VIDEO_CONTROL, "true"));
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("228926c2", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "enableDataModelOpt", "true"));
    }

    public final int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45267619", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, PRE_RENDER_MIN_VERSION, "789");
        ckf.f(config, "OrangeConfig.getInstance…ENDER_MIN_VERSION, \"789\")");
        return Integer.parseInt(config);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a454006b", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_LONG_TAIL_TRACK_ENABLE, "true"));
    }

    public final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f2c92e", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "releaseDXEngineWhenDestroy", "true"));
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2008ea33", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_FRAGMENT_RECOVERY, "true"));
    }

    public final List<String> c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6347cdab", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, KEY_SUBSCRIBE_MSG_LIST, DEFAULT_SUBSCRIBE_MSG_LIST);
        if (config != null) {
            return wsq.z0(config, new String[]{","}, false, 0, 6, null);
        }
        return null;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a6ecf8", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_LIST_IMAGE_PRELOAD_IN_NAV, "true"));
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a8878b8", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_PAGER_PERFORMANCE, "true"));
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("381a295a", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "enableDetailPreRequest", "true"));
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ceb23a", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_LIST_PERFORMANCE, "true"));
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2527bbae", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_LIST_REFACTOR, "false"));
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6655579", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_LIST_WEEX_PRE_REQUEST, "true"));
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa4e50e", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_ITEM_ID_ERROR, "true"));
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("133ca8ae", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, ENABLE_RATE_INFO_ERROR, "true"));
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("244928cd", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "enableRateFeatureDowngrade", "true"));
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc367f7d", new Object[]{this});
        }
        if (dx1.Companion.c()) {
            return "tb_rate_list_layout_multi";
        }
        return "tb_rate_list_layout";
    }

    public final JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b9f9a39d", new Object[]{this});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "tb_rate_list_layout_multi", "{\"name\": \"tb_rate_list_layout_multi\",\"version\": \"48\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout_multi/1741162933011/tb_rate_list_layout_multi.zip\"}"));
        } catch (Exception unused) {
            return JSON.parseObject("{\"name\": \"tb_rate_list_layout_multi\",\"version\": \"48\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout_multi/1741162933011/tb_rate_list_layout_multi.zip\"}");
        }
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9f99c3c", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, LOADING_VIEW_FIRST_FRAME_TRACK_TOP_RATE, "1");
        ckf.f(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"1\")");
        return Integer.parseInt(config);
    }

    public final JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1b73f5a6", new Object[]{this});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "tb_rate_list_layout", "{\"name\": \"tb_rate_list_layout\",\"version\": \"1061\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout/1740044159766/tb_rate_list_layout.zip\"}"));
        } catch (Exception unused) {
            return JSON.parseObject("{\"name\": \"tb_rate_list_layout\",\"version\": \"1061\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout/1740044159766/tb_rate_list_layout.zip\"}");
        }
    }

    public final JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aa6ffda6", new Object[]{this});
        }
        return B();
    }

    public final JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37b9af15", new Object[]{this});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "tb_rate_list_layout_outline", "{\"name\": \"tb_rate_list_layout_outline\",\"version\": \"21\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout_outline/1735029110531/tb_rate_list_layout_outline.zip\"}"));
        } catch (Exception unused) {
            return JSON.parseObject("{\"name\": \"tb_rate_list_layout_outline\",\"version\": \"21\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout_outline/1735029110531/tb_rate_list_layout_outline.zip\"}");
        }
    }

    public final long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("864dd1e5", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, PAGE_ANIM_DURATION, "150");
        ckf.f(config, "OrangeConfig.getInstance…AGE_ANIM_DURATION, \"150\")");
        return Long.parseLong(config);
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d304fd6", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "pre_request_api_name", "mtop.taobao.rate.detaillist.preload");
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f811599", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "pre_request_api_version", "1.0");
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71afdd91", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FIRST_FRAME_TRACK_TOP_RATE, "5");
        ckf.f(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"5\")");
        return Integer.parseInt(config);
    }

    public final long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84a736a3", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, RATE_LIST_PAGE_ANIM_DURATION, "250");
        ckf.f(config, "OrangeConfig.getInstance…AGE_ANIM_DURATION, \"250\")");
        return Long.parseLong(config);
    }

    public final long y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5963897d", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, RATE_LIST_POP_ANIM_DURATION, "150");
        ckf.f(config, "OrangeConfig.getInstance…POP_ANIM_DURATION, \"150\")");
        return Long.parseLong(config);
    }

    public final long z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461881bc", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, RATE_LIST_POP_ANIM_DURATION_WEEX, "250");
        ckf.f(config, "OrangeConfig.getInstance…NIM_DURATION_WEEX, \"250\")");
        return Long.parseLong(config);
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7a90326", new Object[]{this})).booleanValue();
        }
        if (!K() || !Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_GRAY_NEW_DIFF, "true"))) {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_NEW_DIFF, "false"));
        }
        return true;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d732c99d", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, FLING_VELOCTIY, "2500");
        ckf.f(config, "OrangeConfig.getInstance…, FLING_VELOCTIY, \"2500\")");
        Integer m = ssq.m(config);
        if (m != null) {
            return m.intValue();
        }
        return 0;
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee4b525", new Object[]{this})).booleanValue();
        }
        return onm.INSTANCE.b() && Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, "hideLoading", "true"));
    }

    public final boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[]{this})).booleanValue();
        }
        try {
            Mtop instance = Mtop.instance(null);
            ckf.f(instance, "Mtop.instance(null as Context?)");
            String str = instance.getMtopConfig().appVersion;
            ckf.f(str, "Mtop.instance(null as Co…t?).mtopConfig.appVersion");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Object[] array = wsq.z0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            if (array != null) {
                return ((String[]) array).length >= 4;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ca793a", new Object[]{this})).booleanValue();
        }
        return ufp.INSTANCE.a() && n() > 0 && Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(u38.NAME_SPACE, OPEN_FLING_VELOCTIY, "false"));
    }
}
