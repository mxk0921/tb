package com.taobao.android.weex_framework.performance;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.weex.WeexInstanceImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dwh;
import tb.egb;
import tb.ice;
import tb.k3x;
import tb.rce;
import tb.t2o;
import tb.tae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WMInstanceApm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PAGE_METRIC_CSS_PARSE_TIME = "wxMtrcCSSParseTime";
    public static final String KEY_PAGE_METRIC_CSS_TEXT_SIZE = "wxMtrcCSSTextSize";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK0 = "wxMtrcDOMBatchTask0";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK1 = "wxMtrcDOMBatchTask1";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK2 = "wxMtrcDOMBatchTask2";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK3 = "wxMtrcDOMBatchTask3";
    public static final String KEY_PAGE_METRIC_DOM_BATCH_TASK4 = "wxMtrcDOMBatchTask4";
    public static final String KEY_PAGE_METRIC_DOM_FLUSH_TIME = "wxMtrcDOMFlushTime";
    public static final String KEY_PAGE_METRIC_JS_MEM_AVG = "wxMtrcJSMemAvg";
    public static final String KEY_PAGE_METRIC_JS_MEM_MAX = "wxMtrcJSMemMax";
    public static final String KEY_PAGE_METRIC_JS_MEM_ROOT_VIEW_FIRST_ADDED = "wxMtrcJSMemRootViewFirstAdded";
    public static final String KEY_PAGE_METRIC_MAIN_SCRIPT_TIME = "wxMtrcMainScriptTime";
    public static final String KEY_PAGE_METRIC_NODE_COUNT_AVG = "wxMtrcNodeAvg";
    public static final String KEY_PAGE_METRIC_NODE_COUNT_MAX = "wxMtrcNodeMax";
    public static final String KEY_PAGE_METRIC_RENDER_MEM_AVG = "wxMtrcRenderMemAvg";
    public static final String KEY_PAGE_METRIC_RENDER_MEM_MAX = "wxMtrcRenderMemMax";
    public static final String KEY_PAGE_METRIC_SDK_INIT_TIME = "wxMtrcSDKInitTime";
    public static final String KEY_PAGE_METRIC_TASK_ALL_TASK_COUNT = "wxMtrcTaskAllCount";
    public static final String KEY_PAGE_METRIC_TASK_ALL_TIME = "wxMtrcTaskAllTime";
    public static final String KEY_PAGE_METRIC_TASK_BASELINE_SPAN = "wxMtrcTaskBaselineSpan";
    public static final String KEY_PAGE_METRIC_TASK_BG_TASK_COUNT = "wxMtrcTaskBgCount";
    public static final String KEY_PAGE_METRIC_TASK_BG_TASK_TIME = "wxMtrcTaskBgTime";
    public static final String KEY_PAGE_METRIC_TASK_BUSY_RATIO = "wxMtrcTaskBusyRatio";
    public static final String KEY_PAGE_METRIC_TASK_T0_AVG = "wxMtrcTaskT0avg";
    public static final String KEY_PAGE_METRIC_TASK_T0_COUNT = "wxMtrcTaskT0count";
    public static final String KEY_PAGE_METRIC_TASK_T1_AVG = "wxMtrcTaskT1avg";
    public static final String KEY_PAGE_METRIC_TASK_T1_COUNT = "wxMtrcTaskT1count";
    public static final String KEY_PAGE_METRIC_TASK_T2_AVG = "wxMtrcTaskT2avg";
    public static final String KEY_PAGE_METRIC_TASK_T2_COUNT = "wxMtrcTaskT2count";
    public static final String KEY_PAGE_METRIC_TASK_T3_AVG = "wxMtrcTaskT3avg";
    public static final String KEY_PAGE_METRIC_TASK_T3_COUNT = "wxMtrcTaskT3count";
    public static final String KEY_PAGE_PROPERTIES_BIZ_ID = "wxBizID";
    public static final String KEY_PAGE_PROPERTIES_BUNDLE_URL = "wxBundleUrl";
    public static final String KEY_PAGE_PROPERTIES_BYTECODE_VERSION = "wxBytecodeVersion";
    public static final String KEY_PAGE_PROPERTIES_CONTAINER_NAME = "wxContainerName";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER = "wxInstancePreRender";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_TYPE = "wxInstanceType";
    public static final String KEY_PAGE_PROPERTIES_RENDER_TYPE = "wxRenderType";
    public static final String KEY_PAGE_PROPERTIES_REQUEST_TYPE = "wxRequestType";
    public static final String KEY_PAGE_PROPERTIES_RUM_PAGE_TYPE = "wxRumPageType";
    public static final String KEY_PAGE_PROPERTIES_ZCACHE_INFO = "wxZCacheInfo";
    public static final String KEY_PAGE_STAGES_APP_LAUNCH_START = "wxAppLaunchStartTime";
    public static final String KEY_PAGE_STAGES_AREA_COVERAGE = "wxUnicornAreaCoverage";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_END = "wxCreateInstanceEnd";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_START = "wxCreateInstanceStart";
    public static final String KEY_PAGE_STAGES_CUSTOM_START_TIME = "wxCustomStart";
    public static final String KEY_PAGE_STAGES_DESTROY = "wxDestroy";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_END = "wxEndDownLoadBundle";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_START = "wxStartDownLoadBundle";
    public static final String KEY_PAGE_STAGES_END_EXECUTE_BUNDLE = "wxEndExecuteBundle";
    public static final String KEY_PAGE_STAGES_FCP = "wxFCP";
    public static final String KEY_PAGE_STAGES_FFSP = "wxFFSP";
    public static final String KEY_PAGE_STAGES_FIRST_ADD_TO_VIEW = "wxFirstAddToView";
    public static final String KEY_PAGE_STAGES_FIRST_PAGE_HIDE = "wxFirstPageHide";
    public static final String KEY_PAGE_STAGES_FIRST_VIEW_DISAPPEAR = "wxFirstViewDisappear";
    public static final String KEY_PAGE_STAGES_FPS = "wxFPS";
    public static final String KEY_PAGE_STAGES_INTERACTION = "wxInteraction";
    public static final String KEY_PAGE_STAGES_INTERACTION_OPT = "wxInteractionOpt";
    public static final String KEY_PAGE_STAGES_INTERACTION_SCREEN_RATIO = "wxInteractionScreenRatio";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_END = "wxEndLoadBundle";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_START = "wxStartLoadBundle";
    public static final String KEY_PAGE_STAGES_NAV_START = "wxNavigationStart";
    public static final String KEY_PAGE_STAGES_PROCESS_START = "wxProcessStartTime";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION = "wxInteractionRaster";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION_OPT = "wxInteractionRasterOpt";
    public static final String KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO = "wxInteractionRasterScreenRatio";
    public static final String KEY_PAGE_STAGES_RENDER_END = "wxRenderEnd";
    public static final String KEY_PAGE_STAGES_RENDER_ORGIGIN = "wxRenderTimeOrigin";
    public static final String KEY_PAGE_STAGES_RENDER_START = "wxRenderStart";
    public static final String KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT = "wxSamePixelMaxCount";
    public static final String KEY_PAGE_STAGES_SNAPSHOT_LOAD = "wxSplashSnapshotLoad";
    public static final String KEY_PAGE_STAGES_SNAPSHOT_UNLOAD = "wxSplashSnapshotUnload";
    public static final String KEY_PAGE_STAGES_STANDARD_CONTAINER_START = "wxContainerStart";
    public static final String KEY_PAGE_STAGES_STANDARD_NAVIGATION_START = "NavigationStart";
    public static final String KEY_PAGE_STAGES_STANDARD_NAV_START = "NavStart";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_END = "wxUnicornEngineInitEnd";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_START = "wxUnicornEngineInitStart";
    public static final String KEY_PROPERTIES_ERROR_CODE = "wxErrorCode";
    public static final String VALUE_ERROR_CODE_DEFAULT = "0";
    public static final String WEEX_PAGE_TOPIC = "weex_page";

    /* renamed from: a  reason: collision with root package name */
    public final k3x f9986a;
    public final String b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final tae e;
    public static final String KEY_PAGE_PROPERTIES_JS_BUNDLE_VERSION = "wxJSBundleVersion";
    public static final String KEY_PAGE_PROPERTIES_ABTEST_INFO = "wxABTestInfo";
    public static final String KEY_PAGE_PROPERTIES_BIZ_INFO_TAG = "wxBizInfoTag";
    public static final String KEY_PAGE_PROPERTIES_ENGINE_INFO_TAG = "wxEngineInfoTag";
    public static final String KEY_PAGE_PROPERTIES_START_UP_DISTANCE = "wxStartUpDistance";
    public static final String KEY_PAGE_PROPERTIES_IS_FIRST_LOAD = "wxIsFirstLoad";
    public static final String KEY_PAGE_PROPERTIES_IS_FIRST_LOAD_VIEW = "wxIsFirstLoadView";
    public static final String KEY_PAGE_PROPERTIES_LAUNCH_TYPE = "wxLaunchType";
    public static final String[] f = {"wxBizID", "wxBundleUrl", "wxContainerName", "wxInstanceType", "wxRenderType", "wxRequestType", KEY_PAGE_PROPERTIES_JS_BUNDLE_VERSION, "wxZCacheInfo", KEY_PAGE_PROPERTIES_ABTEST_INFO, KEY_PAGE_PROPERTIES_BIZ_INFO_TAG, KEY_PAGE_PROPERTIES_ENGINE_INFO_TAG, KEY_PAGE_PROPERTIES_START_UP_DISTANCE, KEY_PAGE_PROPERTIES_IS_FIRST_LOAD, KEY_PAGE_PROPERTIES_IS_FIRST_LOAD_VIEW, KEY_PAGE_PROPERTIES_LAUNCH_TYPE};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Stages {
        STANDARD_NAV_START(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_NAV_START),
        STANDARD_CONTAINER_START(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_CONTAINER_START),
        NAV_START(WMInstanceApm.KEY_PAGE_STAGES_NAV_START),
        STANDARD_NAVIGATION_START(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_NAVIGATION_START),
        DOWN_BUNDLE_START("wxStartDownLoadBundle"),
        DOWN_BUNDLE_END("wxEndDownLoadBundle"),
        RENDER_ORGIGIN("wxRenderTimeOrigin"),
        LOAD_BUNDLE_START("wxStartLoadBundle"),
        LOAD_BUNDLE_END("wxEndLoadBundle"),
        INTERACTION("wxInteraction"),
        INTERACTION_OPT(WMInstanceApm.KEY_PAGE_STAGES_INTERACTION_OPT),
        INTERACTION_SCREEN_RATIO(WMInstanceApm.KEY_PAGE_STAGES_INTERACTION_SCREEN_RATIO),
        RASTER_INTERACTION(WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION),
        RASTER_INTERACTION_OPT(WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT),
        RASTER_INTERACTION_SCREEN_RATIO(WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO),
        FIRST_ADD_TO_VIEW(WMInstanceApm.KEY_PAGE_STAGES_FIRST_ADD_TO_VIEW),
        DESTROY("wxDestroy"),
        END_EXECUTE_BUNDLE("wxEndExecuteBundle"),
        CREATE_PLATFORM_INSTANCE_START("wxCreatePlatformInstanceStart"),
        CREATE_INSTANCE_START("wxCreateInstanceStart"),
        CREATE_INSTANCE_END("wxCreateInstanceEnd"),
        UNICORN_ENGINE_INIT_START("wxUnicornEngineInitStart"),
        UNICORN_ENGINE_INIT_END("wxUnicornEngineInitEnd"),
        AREA_COVERAGE(WMInstanceApm.KEY_PAGE_STAGES_AREA_COVERAGE),
        SAME_PIXEL_MAX_COUNT(WMInstanceApm.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT),
        RENDER_START(WMInstanceApm.KEY_PAGE_STAGES_RENDER_START),
        RENDER_END(WMInstanceApm.KEY_PAGE_STAGES_RENDER_END),
        FPS(WMInstanceApm.KEY_PAGE_STAGES_FPS),
        PROCESS_START(WMInstanceApm.KEY_PAGE_STAGES_PROCESS_START),
        APP_LAUNCH_START(WMInstanceApm.KEY_PAGE_STAGES_APP_LAUNCH_START),
        FIRST_VIEW_DISAPPEAR(WMInstanceApm.KEY_PAGE_STAGES_FIRST_VIEW_DISAPPEAR),
        FIRST_PAGE_HIDE(WMInstanceApm.KEY_PAGE_STAGES_FIRST_PAGE_HIDE),
        LAST_DOM_UPDATE("wxLastDOMUpdate"),
        UI_RENDER_FINISH("wxUIRenderFinish"),
        UI_FIRST_INSERT("wxUIFirstInsert"),
        FCP(WMInstanceApm.KEY_PAGE_STAGES_FCP),
        FFSP(WMInstanceApm.KEY_PAGE_STAGES_FFSP),
        SNAPSHOT_LOAD(WMInstanceApm.KEY_PAGE_STAGES_SNAPSHOT_LOAD),
        SNAPSHOT_UNLOAD(WMInstanceApm.KEY_PAGE_STAGES_SNAPSHOT_UNLOAD),
        METRIC_TASK_BASELINE_SPAN(WMInstanceApm.KEY_PAGE_METRIC_TASK_BASELINE_SPAN),
        METRIC_TASK_T0_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_T0_COUNT),
        METRIC_TASK_T1_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_T1_COUNT),
        METRIC_TASK_T2_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_T2_COUNT),
        METRIC_TASK_T3_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_T3_COUNT),
        METRIC_TASK_T0_AVG(WMInstanceApm.KEY_PAGE_METRIC_TASK_T0_AVG),
        METRIC_TASK_T1_AVG(WMInstanceApm.KEY_PAGE_METRIC_TASK_T1_AVG),
        METRIC_TASK_T2_AVG(WMInstanceApm.KEY_PAGE_METRIC_TASK_T2_AVG),
        METRIC_TASK_T3_AVG(WMInstanceApm.KEY_PAGE_METRIC_TASK_T3_AVG),
        METRIC_TASK_BG_TASK_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_BG_TASK_COUNT),
        METRIC_TASK_BG_TASK_TIME(WMInstanceApm.KEY_PAGE_METRIC_TASK_BG_TASK_TIME),
        METRIC_TASK_ALL_TIME(WMInstanceApm.KEY_PAGE_METRIC_TASK_ALL_TIME),
        METRIC_TASK_ALL_TASK_COUNT(WMInstanceApm.KEY_PAGE_METRIC_TASK_ALL_TASK_COUNT),
        METRIC_TASK_BUSY_RATIO(WMInstanceApm.KEY_PAGE_METRIC_TASK_BUSY_RATIO),
        METRIC_JS_MEM_AVG(WMInstanceApm.KEY_PAGE_METRIC_JS_MEM_AVG),
        METRIC_JS_MEM_MAX(WMInstanceApm.KEY_PAGE_METRIC_JS_MEM_MAX),
        METRIC_JS_MEM_ROOT_VIEW_FIRST_ADDED(WMInstanceApm.KEY_PAGE_METRIC_JS_MEM_ROOT_VIEW_FIRST_ADDED),
        METRIC_NODE_COUNT_AVG(WMInstanceApm.KEY_PAGE_METRIC_NODE_COUNT_AVG),
        METRIC_NODE_COUNT_MAX(WMInstanceApm.KEY_PAGE_METRIC_NODE_COUNT_MAX),
        METRIC_RENDER_MEM_AVG(WMInstanceApm.KEY_PAGE_METRIC_RENDER_MEM_AVG),
        METRIC_RENDER_MEM_MAX(WMInstanceApm.KEY_PAGE_METRIC_RENDER_MEM_MAX),
        METRIC_CSS_TEXT_SIZE(WMInstanceApm.KEY_PAGE_METRIC_CSS_TEXT_SIZE),
        METRIC_CSS_PARSE_TIME(WMInstanceApm.KEY_PAGE_METRIC_CSS_PARSE_TIME),
        METRIC_DOM_FLUSH_TIME(WMInstanceApm.KEY_PAGE_METRIC_DOM_FLUSH_TIME),
        METRIC_MAIN_SCRIPT_TIME(WMInstanceApm.KEY_PAGE_METRIC_MAIN_SCRIPT_TIME),
        METRIC_DOM_BATCH_TASK0(WMInstanceApm.KEY_PAGE_METRIC_DOM_BATCH_TASK0),
        METRIC_DOM_BATCH_TASK1(WMInstanceApm.KEY_PAGE_METRIC_DOM_BATCH_TASK1),
        METRIC_DOM_BATCH_TASK2(WMInstanceApm.KEY_PAGE_METRIC_DOM_BATCH_TASK2),
        METRIC_DOM_BATCH_TASK3(WMInstanceApm.KEY_PAGE_METRIC_DOM_BATCH_TASK3),
        METRIC_DOM_BATCH_TASK4(WMInstanceApm.KEY_PAGE_METRIC_DOM_BATCH_TASK4),
        METRIC_UI_ENGINE_SETUP_TIME("wxMtrcUIEngineSetup"),
        METRIC_UI_FONT_SETUP_TIME("wxMtrcUIFontSetup"),
        METRIC_UI_FIRST_INSERT_DELAY("wxMtrcUIFirstInsertDelay"),
        METRIC_ASYNC_SHELL_WAITING("wxMtrcAsyncShellWaiting"),
        METRIC_LAST_DOM_UPDATE_ATTACH("wxMtrcLastDOMUpdateAttach"),
        METRIC_LAST_DOM_UPDATE_DETACH("wxMtrcLastDOMUpdateDetach"),
        METRIC_LAST_DOM_UPDATE_MOVE("wxMtrcLastDOMUpdateMove"),
        METRIC_LAST_DOM_UPDATE_NODE_COUNT("wxMtrcLastDOMUpdateNodeCount");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String key;

        Stages(String str) {
            this.key = str;
        }

        public static /* synthetic */ Object ipc$super(Stages stages, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/performance/WMInstanceApm$Stages");
        }

        public static Stages valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Stages) ipChange.ipc$dispatch("15831d8b", new Object[]{str});
            }
            return (Stages) Enum.valueOf(Stages.class, str);
        }
    }

    public WMInstanceApm(WeexInstanceImpl weexInstanceImpl, egb egbVar) {
        String valueOf = String.valueOf(weexInstanceImpl.getInstanceId());
        this.b = valueOf;
        if (egbVar != null) {
            tae generateApmInstance = egbVar.generateApmInstance("weex_page");
            this.e = generateApmInstance;
            if (generateApmInstance != null) {
                generateApmInstance.e(valueOf, weexInstanceImpl);
            }
        }
        this.f9986a = weexInstanceImpl.getInstanceConfig().g();
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static String k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c28c254", new Object[]{new Integer(i)});
        }
        String[] strArr = f;
        int length = strArr.length;
        if (i < 0 || i >= length) {
            return FactoryType.TYPE_INVALID;
        }
        return strArr[i];
    }

    public static String l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1733b2f", new Object[]{new Integer(i)});
        }
        int length = Stages.values().length;
        if (i < 0 || i >= length) {
            return FactoryType.TYPE_INVALID;
        }
        return Stages.values()[i].key;
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.b(str, map);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11efdb1", new Object[]{this, str, str2});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.a(str, str2);
            this.e.h(Integer.parseInt(this.b), str, str2);
            k3x k3xVar = this.f9986a;
            if (k3xVar != null) {
                try {
                    k3xVar.a(str, str2);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        }
    }

    public void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e8ed6", new Object[]{this, str, new Long(j)});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.onStage(str, j);
            k3x k3xVar = this.f9986a;
            if (k3xVar != null) {
                try {
                    k3xVar.c(str, j);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        }
    }

    public void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c53970", new Object[]{this, str, new Long(j)});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.onStage(str, j);
            this.e.i(Integer.parseInt(this.b), str, j);
            k3x k3xVar = this.f9986a;
            if (k3xVar != null) {
                try {
                    k3xVar.c(str, j);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        }
    }

    public tae e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tae) ipChange.ipc$dispatch("a3cb3445", new Object[]{this});
        }
        return this.e;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        } else if (this.e != null && !this.c.getAndSet(true)) {
            this.e.onEnd();
            k3x k3xVar = this.f9986a;
            if (k3xVar != null) {
                try {
                    k3xVar.b();
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91525537", new Object[]{this});
        } else if (this.e != null && !this.d.getAndSet(true)) {
            this.e.g();
        }
    }

    public void h(int i, View view, JSONObject jSONObject, rce rceVar, ice iceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40896dc3", new Object[]{this, new Integer(i), view, jSONObject, rceVar, iceVar});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.f(i, view, jSONObject, rceVar, iceVar);
        }
    }

    public void i(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57111ae", new Object[]{this, new Integer(i), str, new Long(j)});
            return;
        }
        tae taeVar = this.e;
        if (taeVar != null) {
            taeVar.i(i, str, j);
        }
    }

    static {
        t2o.a(982516198);
    }
}
