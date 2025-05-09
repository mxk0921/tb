package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.media.MediaConstant;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final q9s INSTANCE = new q9s();

    static {
        t2o.a(839909965);
    }

    @JvmStatic
    public static final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5417ddc", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAspectFixRatio", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baf8765b", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableGameFullScreen", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bbf0310", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptimizedWeexV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4233183", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableAsyncJSAPI", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf567d3", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableGameLandScapeTitleBarHeight", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("804d4d49", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enablePageOrientation", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee6e0b62", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUseABTest", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a696fd55", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAudioSingleTimer", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357bb9ae", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableGameSendMtopCustomHeader", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e74fef15", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableParseTemplate", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1981d42a", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableUseGetRealPage", Boolean.TRUE);
    }

    @JvmStatic
    public static final String C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32cf6549", new Object[0]);
        }
        return I3("themis_common_config", "getPubOperateGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/iconguide?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bdbb009", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAutoSPM", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf10d289", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableGameStopService", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d986811", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enablePopPageExitContainer", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa352d5b", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableUseNavAdapter", Boolean.TRUE);
    }

    @JvmStatic
    public static final String D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f4d9488", new Object[0]);
        }
        return I3("themis_common_config", "getPubRecommendIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/newhomeiconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31d8a0d", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAutoUpdateNextPageUTParams", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fddec49d", new Object[0])).booleanValue();
        }
        return a3("ariver_common_config", "enableGlobalSecondFloor", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76e83ec6", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enablePrefetchWeex", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c886015", new Object[0])).booleanValue();
        }
        return b3("themis_graphics_android", "enableV8JSRuntime", Boolean.TRUE);
    }

    @JvmStatic
    public static final long E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf302cfe", new Object[0])).longValue();
        }
        return v3("themis_common_config", "getPubTeenagerTimeLockLimitDuration", 2400000L);
    }

    @JvmStatic
    public static final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3eac2a2", new Object[0])).booleanValue();
        }
        return a3("hudong_common_config", "enableCacheTrafficTagging", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70664350", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableH5UseDefaultTitleBar", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29959f20", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enablePubSubPage", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c58b450c", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableWXDisableKeyboardTransform", Boolean.FALSE);
    }

    @JvmStatic
    public static final long F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87e5c4bf", new Object[0])).longValue();
        }
        return v3("themis_common_config", "getPubTeenagerTimeLockLoopDuration", 10000L);
    }

    @JvmStatic
    public static final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efe32ae2", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableCanvasInitStep", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75763793", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enablePubTeenagerProtect", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ebd0972", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableWaitWebReady", Boolean.TRUE);
    }

    @JvmStatic
    public static final String G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4305fa05", new Object[0]);
        }
        return I3("themis_common_config", "getPubUserActiveIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/homeiconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c94d7fe9", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableChangeHierarchyLevelV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1583da3f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableHttpErrorPageFallbackForAllSolutions", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4fa155b", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableRecheckH5Url", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("736f3b97", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableWebViewAsyncLoad", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a553b30f", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableWeex2GetCurrentPageSnapshot", Boolean.FALSE);
    }

    @JvmStatic
    public static final String I3(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2d81b52", new Object[]{str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        ckf.g(str3, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(str, str2, str3);
        ckf.f(configByGroupAndName, "getNotNull(IConfigAdapte…   defaultValue\n        )");
        return configByGroupAndName;
    }

    @JvmStatic
    public static final boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82fe2cf0", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableInheritDocumentTitle", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74b3e4b6", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableReloadGameWhenPageResize", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f59665f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableWeexAsyncCreate", Boolean.TRUE);
    }

    @JvmStatic
    public static final String J3(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b0bdb19", new Object[]{str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        ckf.g(str3, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(str, str2, str3);
        ckf.f(configByGroupAndNameFromLocal, "getNotNull(IConfigAdapte…efaultValue\n            )");
        return configByGroupAndNameFromLocal;
    }

    @JvmStatic
    public static final boolean K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d07419de", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableReloadUrl", Boolean.TRUE);
    }

    @JvmStatic
    public static final long K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a3c909", new Object[0])).longValue();
        }
        return u3("themis_common_config", "topAppPreloadCheckInterval", 86400L);
    }

    @JvmStatic
    public static final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11fcbcfa", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableCreateExtensionBeforeInit", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb7d6b36", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableInjectBuiltinVariable", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaf6d7f3", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableReportCacheHitRate", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("938d3476", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableWidgetLazyInit", Boolean.TRUE);
    }

    @JvmStatic
    public static final String L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf7a191c", new Object[0]);
        }
        return I3(g51.GROUP_UNI_APP_WEEX_THEMIS_CONFIG, g51.KEY_UNI_APP_WEEX_LAYOUT_NG_WHITE_LIST, "tb-trade/supercart/chaoshi_cart");
    }

    @JvmStatic
    public static final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5c67409", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableDelayWeexApmReportTimeV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0ffd10", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enable_instance_control", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e11f017e", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableReportRum", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ab73deb", new Object[0])).booleanValue();
        }
        return a3("widget_common_config", "enableThemisWidgetRenderMode", Boolean.TRUE);
    }

    @JvmStatic
    public static final String M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3df4fc", new Object[0]);
        }
        return I3(g51.GROUP_UNI_APP_WEEX_THEMIS_CONFIG, g51.KEY_UNI_APP_WEEX_MODULE_WHITE_LIST, "windvane,weexdebug,stream");
    }

    @JvmStatic
    public static final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("394ab534", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableDispatchWebHttpError", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e9f232", new Object[0])).booleanValue();
        }
        return b3("themis_white_list_config", "enableInterceptorPageClosePermissionControl", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d236837c", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableReportUtOnCreate", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a496342a", new Object[0])).booleanValue();
        }
        return b3("widget_common_config", "enableWidgetReportMonitor", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b179af", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableDowngradeUniAppWhenMainfestHasErrorV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44f2e5bb", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableJumpToTBHomeWithAnim", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881149bd", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableReportWeexRum", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a632fc", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "fixMixTinyAppPreFetch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c2d89f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableEmbedWebTransparent", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean P0(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecf668ed", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String J3 = J3("ariver_common_config", "enableLandScapeAppIdList", "");
            if (!TextUtils.isEmpty(J3)) {
                jSONArray = JSON.parseArray(J3);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @JvmStatic
    public static final boolean P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d452c43", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSafeAreaTop", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c02fcc", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "fixSwiperDocumentPreload", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8d3b1a", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "home_page_task_add_weex", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("456791c3", new Object[0])).booleanValue();
        }
        return a3("themis_game_config", "enableEnginePlugin", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8910ed06", new Object[0])).booleanValue();
        }
        return ckf.b(J3("themis_common_config", "enableLinkInitHomePage", "true"), "true");
    }

    @JvmStatic
    public static final boolean Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8ea3c6d", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "fixUniAppPubTitleColor", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8644e5f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableExitAllPageWhenNavToHome", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f59d1", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableListenGameRenderResize", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f10b8e2", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "fixWeexBuiltinCssEnv", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834a2667", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableManifestCombo", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e890a5", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableSetParentIdToWebView", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ca3dc71", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "forbidHideTinyAppTitleBar", Boolean.FALSE);
    }

    @JvmStatic
    public static final int S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7be4bd2", new Object[0])).intValue();
        }
        return q3("themis_common_config", "lastVisitManifestDuration", RemoteMessageConst.MAX_TTL);
    }

    @JvmStatic
    public static final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea29e171", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixAFCNavToOtherACNotLaunch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd914893", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableManifestNavPrefetch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean T1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cffabac4", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        if (!a3("ariver_common_config", "enableShouldOverrideUrlLoading", Boolean.TRUE)) {
            return false;
        }
        String J3 = J3("ariver_common_config", "enableShouldOverrideUrlLoadingBlackList", "");
        if (J3 == null || J3.length() == 0 || !wsq.O(J3, str, false, 2, null)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d73553f9", new Object[0])).booleanValue();
        }
        return a3("widget_common_config", "forceLayoutNGV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a7b418", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableShowDowngradeTips", Boolean.FALSE);
    }

    @JvmStatic
    public static final int U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c50df744", new Object[0])).intValue();
        }
        return q3("themis_common_config", "manifestComboMaxCount", 32);
    }

    @JvmStatic
    public static final boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871518b7", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixBgColor", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a724bb53", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableShowError", Boolean.TRUE);
    }

    @JvmStatic
    public static final String V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd790de1", new Object[0]);
        }
        return I3("group_windmill_common", "aboutUrlForWeb", "http://market.m.taobao.com/app/mtb/taobao-app-more/pages/about");
    }

    @JvmStatic
    public static final boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0021f3", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixCanvasProviderWasCovered", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418fe25c", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableManifestPreset", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("289cf9b7", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableShowErrorWidget", Boolean.TRUE);
    }

    @JvmStatic
    public static final String W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18c99620", new Object[0]);
        }
        return I3(g51.GROUP_TMS_APP_INFO_CONFIG, g51.KEY_CACHE_TIME_GLOBAL, "");
    }

    @JvmStatic
    public static final boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9de6f9", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableManifestVariable", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35868240", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableShowPubOperateGuide", Boolean.FALSE);
    }

    @JvmStatic
    public static final String X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad685276", new Object[0]);
        }
        return I3(g51.GROUP_TMS_APP_INFO_CONFIG, g51.KEY_EXPIRE_LIST, "");
    }

    @JvmStatic
    public static final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cc4b58f", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixDefaultWebGesture", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b1b884c", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "useMegaAudio", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf5b6bf", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableShowUpgradeTips", Boolean.TRUE);
    }

    @JvmStatic
    public static final String Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba426d04", new Object[0]);
        }
        if (l1()) {
            return TMSDBAdapter.APPINFO_TABLE;
        }
        return TMSDBAdapter.APPINFO_TABLE_OLD;
    }

    @JvmStatic
    public static final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be6be98d", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixErrorPageClickThrough", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40af2f26", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableMegaPreloadAppInfo", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d1d2a2", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSinglePageWebMetaGet", Boolean.TRUE);
    }

    @JvmStatic
    public static final String Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddadb080", new Object[0]);
        }
        return I3("themis_common_config", "auth_device_local_map", "");
    }

    @JvmStatic
    public static final String Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2099a0a3", new Object[0]);
        }
        return I3("themis_common_config", "preloadAPIWhiteList", "");
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d350c1c", new Object[0]);
        }
        return J3("themis_common_config", "afcEnterTMSBlackList", "");
    }

    @JvmStatic
    public static final boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f902581", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixExpBucketIsolate", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean a1(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e479470", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String J3 = J3("ariver_common_config", "enableMegaPreloadAppInfoList", "['8251537']");
            if (!TextUtils.isEmpty(J3)) {
                jSONArray = JSON.parseArray(J3);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @JvmStatic
    public static final boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ae1c5fb", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSkipAPMReport", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean a3(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fdb02", new Object[]{str, str2, bool})).booleanValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        return ckf.b(((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(str, str2, bool == null ? null : bool.toString()), "true");
    }

    @JvmStatic
    public static final boolean a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75720973", new Object[0])).booleanValue();
        }
        return a3("ariver_common_config", "ICONChangeSkipTBHomeControl", Boolean.FALSE);
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28273981", new Object[0]);
        }
        return J3("themis_common_config", "appinfoPreloadList", "");
    }

    @JvmStatic
    public static final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5325354d", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixForceWindowRatio", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc0b45b1", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableMegaStorage", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e4a77e", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableSkipHandleOnNewIntent", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean b3(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc668ff", new Object[]{str, str2, bool})).booleanValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        return ckf.b("true", ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(str, str2, bool == null ? null : bool.toString()));
    }

    @JvmStatic
    public static final String b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e629b676", new Object[0]);
        }
        return J3("themis_common_config", "systemWebViewUrlListV1", "");
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47c09fac", new Object[0]);
        }
        return I3("hudong_common_config", "cacheTrafficTaggingWhiteList", "");
    }

    @JvmStatic
    public static final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a848083e", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixFragmentAnim", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a772ec27", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableLoadPlugin", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c5e89", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSourceMap", Boolean.TRUE);
    }

    @JvmStatic
    public static final String c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2333e2fd", new Object[0]);
        }
        return I3("triver_common_config", "addGifResUrl", "https://gw.alicdn.com/imgextra/i3/O1CN01N4uheO1C79kCibG68_!!6000000000033-54-tps-590-400.apng");
    }

    @JvmStatic
    public static final String c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1394ea80", new Object[0]);
        }
        return I3("ariver_common_config", "teenagerProtectionWindowUrl", "https://market.m.taobao.com/app/polygon/minor-protection-page/index.html?appId=");
    }

    @JvmStatic
    public static final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6cedeb", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixGetSystemInfoHeightError", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef9191f", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableMixFullScreen", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5451da5", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSpecifyWebViewCoreV1", Boolean.TRUE);
    }

    @JvmStatic
    public static final double d3(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7a19ea8", new Object[]{str, str2, new Double(d)})).doubleValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        try {
            String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(str, str2, String.valueOf(d));
            ckf.f(configByGroupAndName, "getNotNull(IConfigAdapte….toString()\n            )");
            return Double.parseDouble(configByGroupAndName);
        } catch (Throwable th) {
            TMSLogger.c("TMSConfigUtils", "getIntConfig has error", th);
            return d;
        }
    }

    @JvmStatic
    public static final String d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bc6d03c", new Object[0]);
        }
        return I3("themis_common_config", "themis_domain_white_list", "");
    }

    @JvmStatic
    public static final boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9b7863", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixLifeCycle", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e525da5", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableMixPlayer", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e184df3", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSupportEmbedPageErrorV2", Boolean.FALSE);
    }

    @JvmStatic
    public static final String e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2f1b06e", new Object[0]);
        }
        return J3("themis_common_config", "tms_web_load_interceptor", "{\"account\":[\"https://www.alipay.com/webviewbridge\"]}");
    }

    @JvmStatic
    public static final String e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("778a994d", new Object[0]);
        }
        return J3("themis_common_config", "uniAppBlackListV2", "null");
    }

    @JvmStatic
    public static final boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13491ba3", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixManifestDefaultTitle", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("179fd207", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableSupportTinyError", Boolean.FALSE);
    }

    @JvmStatic
    public static final int f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881e56ff", new Object[0])).intValue();
        }
        return r3("themis_common_config", "uniapp_fallback_default_min_document_size", 20);
    }

    @JvmStatic
    public static final boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac54bec7", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixMixUrlRepeatV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e109d8", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableModifyAbilityHubCallback", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7573b1f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableSwiperSubPageQuery", Boolean.TRUE);
    }

    @JvmStatic
    public static final List<String> g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f5f2b601", new Object[0]);
        }
        try {
            Object parseObject = JSON.parseObject(J3("themis_common_config", "uniapp_fallback_default_required_elements", "[\"head\", \"meta\", \"body\"]"), (Type) List.class, new Feature[0]);
            ckf.f(parseObject, "parseObject<List<String>…gLocal, List::class.java)");
            return (List) parseObject;
        } catch (Throwable th) {
            TMSLogger.b("TMSConfigUtils", ckf.p("getFallBackDefaultRequiredElements error ", th.getMessage()));
            return yz3.l(eme.IMAGE_TYPE_HEAD, "meta", AgooConstants.MESSAGE_BODY);
        }
    }

    @JvmStatic
    public static final long g4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e129249c", new Object[0])).longValue();
        }
        return u3("themis_common_config", "waitUCReadyTimeout", 3000L);
    }

    @JvmStatic
    public static final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95fb143c", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixPageResizeListenerAPI", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25b18a8d", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableMtopEnv", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cce2e76", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableTMSMiniKernel", Boolean.TRUE);
    }

    @JvmStatic
    public static final int h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2973a515", new Object[0])).intValue();
        }
        return q3("themis_common_config", "pageFallbackStrategyMode", 1);
    }

    @JvmStatic
    public static final boolean i(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1551583", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String J3 = J3("ariver_common_config", "disableBackHomeAppIdList", "");
            if (!TextUtils.isEmpty(J3)) {
                jSONArray = JSON.parseArray(J3);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.c("TMSConfigUtils", ckf.p("disableBackHome, ", e.getMessage()), e);
        }
        return false;
    }

    @JvmStatic
    public static final boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64633885", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNavNonHttpUrl", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa48138", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableTabBarAccessibility", Boolean.TRUE);
    }

    @JvmStatic
    public static final String i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7ed14fb", new Object[0]);
        }
        return I3("themis_common_config", "getGameStopServiceGuideUrl", "https://web.m.taobao.com/app/miniapp-biz/stop-service-announcement/announcement?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final String i4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77099f6a", new Object[0]);
        }
        return J3("themis_common_config", "clientPreRenderWhiteList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    @JvmStatic
    public static final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c717136", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "disableBackJumpAllowed", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34cdd9", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixRenderStatusError", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122b7aa6", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNavWhenNonHttp", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1deb5625", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableTabBarNumberChange", Boolean.TRUE);
    }

    @JvmStatic
    public static final String j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7370d86", new Object[0]);
        }
        return J3("themis_graphics_android", "gameV8BlackList", "['3000000102776865','3000000111923735']");
    }

    @JvmStatic
    public static final long j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7866e0c", new Object[0])).longValue();
        }
        return v3("themis_common_config", "InstancePreRenderPoolCacheLiveTime", 5000L);
    }

    @JvmStatic
    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77f8c578", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixShareApi", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10516d7e", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixRunScene", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5030a787", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableNavigateSpm", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("358a3dea", new Object[0])).booleanValue();
        }
        return a3("ariver_common_config", "enableTeenagerProtection", Boolean.TRUE);
    }

    @JvmStatic
    public static final String k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79f3f49c", new Object[0]);
        }
        return J3("themis_graphics_android", "gameV8WhiteList", "");
    }

    @JvmStatic
    public static final int k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af27b433", new Object[0])).intValue();
        }
        return r3("themis_common_config", "InstancePreRenderPoolCacheSize", 1);
    }

    @JvmStatic
    public static final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed6dc7a1", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "disableEmbedModifyStatusBar", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e868d30f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixScopeAuthDiffs", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9098d31b", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableNewAPPInfoDB", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f2df59", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableThemisH5LegacyErrorView", Boolean.TRUE);
    }

    @JvmStatic
    public static final String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f00e3b1", new Object[0]);
        }
        return I3("ariver_common_config", "globalMenuCommentUrl", "https://m.duanqu.com?_ariver_appid=3000000002007701&enableKeepAlive=NO&page=pages/experience/experience");
    }

    @JvmStatic
    public static final String l4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b86b24", new Object[0]);
        }
        return J3("ariver_common_config", "keepAliveWhiteList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    @JvmStatic
    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("622cbba0", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "disableGlobalResourcePool", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df68efab", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixScreenShotAbnormalV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dec5875d", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNewDefaultTitleBarStyle", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c7078f", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableTinyAppNoviceVersion", Boolean.FALSE);
    }

    @JvmStatic
    public static final String m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5039ba9", new Object[0]);
        }
        return I3("ariver_common_config", "globalSecondFloorUrl", "https://market.m.taobao.com/app/tbhome/secondfloor/home?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&bgContainerColor=%2300ffffff");
    }

    @JvmStatic
    public static final int m4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61f8285c", new Object[0])).intValue();
        }
        return r3("ariver_common_config", "keepAliveWhiteMaxCount", 3);
    }

    @JvmStatic
    public static final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5255b7a", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "disableLinkBackX", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4340fdfc", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixScrollConflict", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2d2a42c", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNewFragmentSwitch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae59ba6", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableTinyAppPermissionCheck", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean n4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e528d9", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enablePubNewIconFont", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61641b00", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "disableSinglePageModifyWindowOnResume", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3820806b", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixSwiperLifecycle", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed10153", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNewMainDocumentPrefetch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563a774e", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableTinyAppWebPreRender", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9f9af68", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enablePushPageIFSHandleUrl", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1e67ffb", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixSwiperPagePreload", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ca9bdf", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableAPMTORUM", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18572e", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableTinyAppWeexSnapShot", Boolean.TRUE);
    }

    @JvmStatic
    public static final String p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11ba5ec7", new Object[0]);
        }
        return I3("ariver_common_config", "TBHomeIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/iconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean p4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b84af54", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableReportFspInDestroy", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa166957", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAbilityHubDestroy", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5448170", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableFixSwiperTitleBar", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7022c6a9", new Object[0])).booleanValue();
        }
        return a3("ariver_common_config", "enableTipsTimesExceeded", Boolean.TRUE);
    }

    @JvmStatic
    public static final int q3(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3171ed40", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        try {
            String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(str, str2, String.valueOf(i));
            ckf.f(configByGroupAndName, "getNotNull(IConfigAdapte….toString()\n            )");
            return Integer.parseInt(configByGroupAndName);
        } catch (Throwable th) {
            TMSLogger.c("TMSConfigUtils", "getIntConfig has error", th);
            return i;
        }
    }

    @JvmStatic
    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f14cc3d", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAbilityHubNameSpaceUseCanvas", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59c9c269", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFixUniAppDocumentNotHit", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbcd5678", new Object[0])).booleanValue();
        }
        return a3("homepage_switch", "enableNewMiniAppApi", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d18aa5", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableTopAppPreload", Boolean.TRUE);
    }

    @JvmStatic
    public static final int r3(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f559576b", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(str, str2, String.valueOf(i));
            ckf.f(configByGroupAndNameFromLocal, "getNotNull(IConfigAdapte…tring()\n                )");
            return Integer.parseInt(configByGroupAndNameFromLocal);
        } catch (Throwable th) {
            TMSLogger.c("TMSConfigUtils", "getIntConfig has error", th);
            return i;
        }
    }

    @JvmStatic
    public static final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88dee341", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableAddIgnoreQueries", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c6cd796", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableNewOutLink", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f992cbe", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUTSubPageUrlFix", Boolean.TRUE);
    }

    @JvmStatic
    public static final int s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f59ae167", new Object[0])).intValue();
        }
        return q3("themis_common_config", "getJumpToHomeAnimDeviceScore", 5);
    }

    @JvmStatic
    public static final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e581a7a3", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableAddInitData", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615eca64", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFoldOrPadAutoRotation", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d17db38f", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableNewPopWindow", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2ba4ff", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUniApp", Boolean.TRUE);
    }

    @JvmStatic
    public static final int t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bc3749d", new Object[0])).intValue();
        }
        return q3("themis_common_config", "getJumpToHomeAnimDuration", 500);
    }

    @JvmStatic
    public static final boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2afe2b75", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFoldRelaunch", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b34682a7", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptGMAPISerialize", Boolean.TRUE);
    }

    @JvmStatic
    public static final long u3(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9e555a9", new Object[]{str, str2, new Long(j)})).longValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        try {
            String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(str, str2, String.valueOf(j));
            ckf.f(configByGroupAndName, "getNotNull(IConfigAdapte….toString()\n            )");
            return Long.parseLong(configByGroupAndName);
        } catch (Throwable th) {
            TMSLogger.c("TMSConfigUtils", "getLongConfig has error", th);
            return j;
        }
    }

    @JvmStatic
    public static final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f8f7dae", new Object[0])).booleanValue();
        }
        return a3("ariver_common_config", "enableAddToDesktop", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf754dd5", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableForbidMuteApi", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae118dbf", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptGMAsyncAPI", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1f1ab1", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppNavPrefetch", Boolean.TRUE);
    }

    @JvmStatic
    public static final long v3(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ee33730", new Object[]{str, str2, new Long(j)})).longValue();
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "key");
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(str, str2, String.valueOf(j));
            ckf.f(configByGroupAndNameFromLocal, "getNotNull(IConfigAdapte….toString()\n            )");
            return Long.parseLong(configByGroupAndNameFromLocal);
        } catch (Throwable th) {
            TMSLogger.c("TMSConfigUtils", "getLongConfig has error", th);
            return j;
        }
    }

    @JvmStatic
    public static final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3caf1a1d", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAddUniAppPoints", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c587f478", new Object[0])).booleanValue();
        }
        return a3("themis_white_list_config", "enableFragmentBearThemis", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("114a0994", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptGMSyncAPI", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9bb972", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppPrefetchV2", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f640792a", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableAdjustTitlePosEnv", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d76957", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableFragmentDestroyView", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42c148e", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptLifeCycleSticky", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf127424", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppPubShareUrl", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("690d7558", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableAppInfoDefaultCache", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21b1e545", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableGameAPIDomainWhiteListController", Boolean.FALSE);
    }

    @JvmStatic
    public static final boolean y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d5eb04", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptimizedStartupV1", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bc8fd13", new Object[0])).booleanValue();
        }
        return a3("themis_common_config", "enable_appinfo_force_update", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("494ce940", new Object[0])).booleanValue();
        }
        return b3("themis_common_config", "enableOptimizedUniappV2", Boolean.FALSE);
    }

    @JvmStatic
    public static final String z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f38d015", new Object[0]);
        }
        return I3("themis_common_config", "getPermissionCheckWhiteList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    public final boolean A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb9d6e58", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableUpdateManifestFromZCache", Boolean.FALSE);
    }

    public final String B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f00864d5", new Object[]{this});
        }
        return I3("themis_common_config", "getPubAddIconTipsUrl", "poplayer://tinyAppAddHomeGuideBanner");
    }

    public final boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7e46dc8", new Object[]{this})).booleanValue();
        }
        return b3("themis_game_config", "enableHighPerformanceGame", Boolean.TRUE);
    }

    public final String H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38482221", new Object[]{this});
        }
        return I3("themis_common_config", "getShowReVisitGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/backintercept?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d72774f", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableCheckPageVersion", Boolean.TRUE);
    }

    public final boolean I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c506b8d9", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableReloadButton", Boolean.TRUE);
    }

    public final boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba96c4a5", new Object[]{this})).booleanValue();
        }
        return b3("widget_common_config", "enableChooseAddress", Boolean.TRUE);
    }

    public final boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e331c94", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableInitZCacheWhenAFC", Boolean.TRUE);
    }

    public final boolean K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef05c782", new Object[]{this})).booleanValue();
        }
        return a3("widget_common_config", "enableWidgetBgColor", Boolean.TRUE);
    }

    public final String N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("374565a1", new Object[]{this});
        }
        return I3("themis_common_config", "ZCacheManifestMockUrl", "");
    }

    public final String O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee83abb", new Object[]{this});
        }
        return I3("themis_game_config", "highPerformanceGameList", "");
    }

    public final boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41afebf0", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableSaveDeprecatedVersion", Boolean.TRUE);
    }

    public final boolean R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7db65a6a", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableSerialRequestFootAndHomePage", Boolean.TRUE);
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331d2694", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableFixAFCLinkLeak", Boolean.TRUE);
    }

    public final String T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e52863f1", new Object[]{this});
        }
        return I3("triver_common_config", "cardCouponUrl", "https://huodong.m.taobao.com/act/talent/live.html?screenOrientation=landscape&");
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc8db1e0", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableFixAsyncWeexRenderStatusError", Boolean.TRUE);
    }

    public final boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd211e2", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableManifestPreloadV2", Boolean.FALSE);
    }

    public final int U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14e269f1", new Object[]{this})).intValue();
        }
        return q3("themis_game_config", "gameLoadingTimeOut", 10);
    }

    public final boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("830571a3", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableManifestPreloadUrl", Boolean.FALSE);
    }

    public final String V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bde549", new Object[]{this});
        }
        return I3("triver_common_config", "cardCouponUrl", "http://tm.m.taobao.com/order/order_detail.htm?");
    }

    public final String W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ca8a16", new Object[]{this});
        }
        return I3("triver_common_config", "cardCouponUrl", "http://tm.m.taobao.com/list.htm?");
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6252af0", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableFixCheckManifest", Boolean.TRUE);
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24932a60", new Object[]{this});
        }
        return I3("triver_common_config", "cardCouponUrl", "https://pages.tmall.com/wow/a/act/tmall/dailygroup/1318/upr?wh_pid=daily-186059&wh_weex=false&");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da502dea", new Object[]{this})).booleanValue();
        }
        return a3("widget_common_config", "destroyGlobalEngine", Boolean.TRUE);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb5318d7", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "disableAsyncManifestRequest", Boolean.FALSE);
    }

    public final String h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34609c16", new Object[]{this});
        }
        return I3("themis_game_config", "webGameIndexUrl", "https://fe.m.taobao.com/app/dust/game-solution/home");
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a27233", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableFixQueryEncodeV2", Boolean.TRUE);
    }

    public final String o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d31cef02", new Object[]{this});
        }
        return J3("themis_common_config", "getHuDongSpringUrlRule", "");
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8516c7e6", new Object[]{this})).booleanValue();
        }
        return b3("widget_common_config", "disableWidgetAuthRefusedScopes", Boolean.TRUE);
    }

    public final boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81fe226e", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableNewManifestUrl", Boolean.FALSE);
    }

    public final boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12924524", new Object[]{this})).booleanValue();
        }
        return b3("widget_common_config", "enableFixWidgetAppInfo", Boolean.TRUE);
    }

    public final boolean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73a15db", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppForceReloadV2", Boolean.TRUE);
    }

    public final int w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("799c3f9c", new Object[]{this})).intValue();
        }
        return q3("themis_common_config", "getManifestPreloadShuffleTime", 600);
    }

    public final String x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2cd13ae", new Object[]{this});
        }
        return I3("themis_common_config", "manifestPreloadUrl", "https://app-manifest.m.taobao.com/wow/z/uniapp/");
    }

    public final boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c1d6fb6", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppRapidMode", Boolean.TRUE);
    }

    public final int y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dab9e4bf", new Object[]{this})).intValue();
        }
        return q3("widget_common_config", "getMaxEngineInstance", 5);
    }

    public final boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("700b2d4a", new Object[]{this})).booleanValue();
        }
        return b3("themis_common_config", "enableGameForceUpdate", Boolean.FALSE);
    }

    public final boolean z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b40bca", new Object[]{this})).booleanValue();
        }
        return a3("themis_common_config", "enableUniAppReloadButton", Boolean.TRUE);
    }

    @JvmStatic
    public static final boolean f1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b652a1", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return wsq.O(I3("themis_common_config", "enableMixPlayerAppIds", ""), str, false, 2, null);
    }

    @JvmStatic
    public static final Set<Integer> n3(String str) {
        String J3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("736e91f7", new Object[]{str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            J3 = J3("themis_common_config", str, "");
        } catch (Exception e) {
            TMSLogger.c("TMSABTestUtils", "getHttpErrorCode error", e);
        }
        if (J3.length() == 0) {
            return linkedHashSet;
        }
        String substring = J3.substring(1, J3.length() - 1);
        ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        for (String str2 : wsq.z0(substring, new String[]{","}, false, 0, 6, null)) {
            linkedHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        }
        return linkedHashSet;
    }

    @JvmStatic
    public static final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3570a228", new Object[]{str})).booleanValue();
        }
        if (!INSTANCE.R3(str)) {
            return false;
        }
        return b3("themis_common_config", "enableAddSessionId", Boolean.FALSE);
    }

    @JvmStatic
    public static final String A3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b3d26a5", new Object[]{str});
        }
        ckf.g(str, "appId");
        String str2 = "";
        String J3 = J3("pha_switch_themis_config", ckf.p("appId_", str), str2);
        Map j = a.j(jpu.a("6579080", "https://outfliggys.m.taobao.com/tb/uniappdowngrade?uniapp_id=1011089&uniapp_page=uniappdowngrade"), jpu.a("8536719", "https://m.taopiaopiao.com/tickets/moviemain/pages/home/index.html?uniapp_id=1011720&uniapp_page=home"), jpu.a("17588434", "https://mo.m.taobao.com/union2/xinxiang?uniapp_id=1011728&uniapp_page=fod-home"), jpu.a("3000000057060663", "https://pages-fast.m.taobao.com/wow/z/tmall-sports/xingchaodong/FzjiyXWGpNj4YXAPAzkk?x-ssr=true&disableNav=YES&status_bar_transparent=true&uniapp_id=1012211&uniapp_page=home"), jpu.a("12721076", "https://pages-fast.m.taobao.com/wow/z/rank/default/fMZG235a36aPN3FfEkPc?x-ssr=true&disableNav=YES&status_bar_transparent=true&x-preload=true&disableProgress=true&uniapp_id=1012205&uniapp_page=tmallrank"), jpu.a("1000004", "https://pages-fast.m.taobao.com/wow/z/ihomeshop/jiyoujia-stream/home?x-ssr=true&x-preload=true&wh_act_nativebar=useSeqMode&tabBarHeight=160&uniapp_id=1011665&uniapp_page=home"), jpu.a("3000000086587283", "https://pages-fast.m.taobao.com/wow/z/rank/default/godshophome?x-ssr=true&disableNav=YES&status_bar_transparent=true&x-preload=true&disableProgress=true&uniapp_id=1012251&uniapp_page=shop_rank_main"), jpu.a("3000000093510282", "https://pages-fast.m.taobao.com/wow/z/uniapp/1012917/window?showTaskPanel=true"), jpu.a("6528465", "https://pages-fast.m.taobao.com/wow/z/uniapp/1012915/index?lpCustom=sourceSecondFloor"), jpu.a("3000000088770721", "https://miaosuda.taobao.com/wow/z/b2c-msd/default/QnMjZHMiAfpmPpPyKxZt?wh_showError=true&disableNav=YES&disableMSDHeader=YES&disableMSDFooter=YES&prefetchKey=msd_zebra_prefetch&x-preload=true&uniapp_page=msd_shop_idx&uniapp_id=1012153&uniapp_page=msd_shop_idx"));
        if (!wsq.a0(J3)) {
            return J3;
        }
        String str3 = (String) j.get(str);
        if (str3 != null) {
            str2 = str3;
        }
        return str2;
    }

    @JvmStatic
    public static final boolean I0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e294dd4e", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        String J3 = J3("themis_common_config", "enableIgnore2006List", "");
        return (J3 == null || J3.length() == 0 || !wsq.O(J3, str, false, 2, null)) ? false : true;
    }

    @JvmStatic
    public static final boolean Q3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cfd8dca", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "name");
        return wsq.O(J3("themis_common_config", "themis_launch_black_list", "null"), str, false, 2, null);
    }

    @JvmStatic
    public static final boolean X3(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3418afdd", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "url");
        try {
            String J3 = J3("themis_white_list_config", "pageCloseInterceptorWhiteListWithSinglePage", "");
            if (J3.length() == 0) {
                return false;
            }
            if (!ckf.b(J3, "*")) {
                List<String> split = new Regex(",").split(J3, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = i04.v0(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = yz3.i();
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        if (wsq.O(str, str2, false, 2, null)) {
                        }
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean Y3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615690f7", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "uniAppId");
        for (String str2 : wsq.z0(J3("themis_white_list_config", "pageCloseInterceptorWhiteListWithUniApp", ""), new String[]{","}, false, 0, 6, null)) {
            if (wsq.O(str2, str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean e(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e446bb37", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        if (str.length() == 0) {
            return false;
        }
        try {
            String J3 = J3("triver_white_list_config", "closeWindowAccessList", "");
            if (!TextUtils.isEmpty(J3)) {
                jSONArray = JSON.parseArray(J3);
                jSONArray.add("3000000083541514");
                jSONArray.add("22129413");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.c("TMSConfigUtils", ckf.p("checkCloseWindowAccessList, ", e.getMessage()), e);
        }
        return false;
    }

    @JvmStatic
    public static final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ea4d1f6", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "apiName");
        if (str.length() == 0) {
            return false;
        }
        try {
            String J3 = J3("themis_common_config", "tinyAppPermissionCheckList", "");
            JSONArray parseArray = !TextUtils.isEmpty(J3) ? JSON.parseArray(J3) : null;
            if (parseArray != null) {
                if (parseArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.c("TMSConfigUtils", ckf.p("enableTinyAppPermissionCheck, ", e.getMessage()), e);
        }
        return false;
    }

    @JvmStatic
    public static final boolean f4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4827ef8", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "url");
        ArrayList arrayList = new ArrayList();
        for (Object obj : wsq.z0(b4(), new String[]{","}, false, 0, 6, null)) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (wsq.O(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e449a489", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "appId");
        return !wsq.O(I3("themis_common_config", "disableCheckPermissionList", ""), str, false, 2, null);
    }

    public final boolean R3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7204c3", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return wsq.O(str, "pages-fast.m.taobao.com/wow/z/app/ug/crowd/newuser", false, 2, null) || wsq.O(str, "web.m.taobao.com/app/ug/crowd-weex2/newuser-foreign", false, 2, null);
    }
}
