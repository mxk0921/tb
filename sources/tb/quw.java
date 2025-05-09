package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class quw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PAGE_ANIM_BACK_NUM = "wxAnimationInBackCount";
    public static final String KEY_PAGE_PROPERTIES_BIZ_ID = "wxBizID";
    public static final String KEY_PAGE_PROPERTIES_BUBDLE_URL = "wxBundleUrl";
    public static final String KEY_PAGE_PROPERTIES_BUNDLE_TYPE = "wxBundleType";
    public static final String KEY_PAGE_PROPERTIES_CACHE_INFO = "wxZCacheInfo";
    public static final String KEY_PAGE_PROPERTIES_CACHE_TYPE = "wxCacheType";
    public static final String KEY_PAGE_PROPERTIES_CONTAINER_NAME = "wxContainerName";
    public static final String KEY_PAGE_PROPERTIES_INSTANCE_TYPE = "wxInstanceType";
    public static final String KEY_PAGE_PROPERTIES_JSLIB_VERSION = "wxJSLibVersion";
    public static final String KEY_PAGE_PROPERTIES_JS_FM_INI = "wxJsFrameworkInit";
    public static final String KEY_PAGE_PROPERTIES_PARENT_PAGE = "wxParentPage";
    public static final String KEY_PAGE_PROPERTIES_RENDER_TYPE = "wxRenderType";
    public static final String KEY_PAGE_PROPERTIES_REQUEST_TYPE = "wxRequestType";
    public static final String KEY_PAGE_PROPERTIES_UIKIT_TYPE = "wxUIKitType";
    public static final String KEY_PAGE_PROPERTIES_WEEX_VERSION = "wxSDKVersion";
    public static final String KEY_PAGE_STAGES_CONTAINER_READY = "wxContainerReady";
    public static final String KEY_PAGE_STAGES_CREATE_FINISH = "wxJSBundleCreateFinish";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_END = "wxCreateInstanceEnd";
    public static final String KEY_PAGE_STAGES_CREATE_INSTANCE_START = "wxCreateInstanceStart";
    public static final String KEY_PAGE_STAGES_CUSTOM_PREPROCESS_END = "wxCustomPreprocessEnd";
    public static final String KEY_PAGE_STAGES_CUSTOM_PREPROCESS_START = "wxCustomPreprocessStart";
    public static final String KEY_PAGE_STAGES_DESTROY = "wxDestroy";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_END = "wxEndDownLoadBundle";
    public static final String KEY_PAGE_STAGES_DOWN_BUNDLE_START = "wxStartDownLoadBundle";
    public static final String KEY_PAGE_STAGES_END_EXCUTE_BUNDLE = "wxEndExecuteBundle";
    public static final String KEY_PAGE_STAGES_FIRST_INTERACTION_VIEW = "wxFirstInteractionView";
    public static final String KEY_PAGE_STAGES_FSRENDER = "wxFsRender";
    public static final String KEY_PAGE_STAGES_INTERACTION = "wxInteraction";
    public static final String KEY_PAGE_STAGES_INTERACTION_TM = "wxInteractionTimeStamp";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_END = "wxEndLoadBundle";
    public static final String KEY_PAGE_STAGES_LOAD_BUNDLE_START = "wxStartLoadBundle";
    public static final String KEY_PAGE_STAGES_NEW_FSRENDER = "wxNewFsRender";
    public static final String KEY_PAGE_STAGES_REMOTE_INSTALL_END = "wxRemoteInstallEnd";
    public static final String KEY_PAGE_STAGES_REMOTE_INSTALL_START = "wxRemoteInstallStart";
    public static final String KEY_PAGE_STAGES_RENDER_ORGIGIN = "wxRenderTimeOrigin";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_END = "wxUnicornEngineInitEnd";
    public static final String KEY_PAGE_STAGES_UNICORN_ENGINE_INIT_START = "wxUnicornEngineInitStart";
    public static final String KEY_PAGE_STATS_ACTUAL_DOWNLOAD_TIME = "wxActualNetworkTime";
    public static final String KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE = "wxApiUseQJSByteCode";
    public static final String KEY_PAGE_STATS_BODY_RATIO = "wxBodyRatio";
    public static final String KEY_PAGE_STATS_BUNDLE_SIZE = "wxBundleSize";
    public static final String KEY_PAGE_STATS_CELL_DATA_UN_RECYCLE_NUM = "wxCellDataUnRecycleCount";
    public static final String KEY_PAGE_STATS_CELL_EXCEED_NUM = "wxCellExceedNum";
    public static final String KEY_PAGE_STATS_CELL_UN_RE_USE_NUM = "wxCellUnReUseCount";
    public static final String KEY_PAGE_STATS_COMPONENT_CREATE_COST = "wxComponentCost";
    public static final String KEY_PAGE_STATS_EMBED_COUNT = "wxEmbedCount";
    public static final String KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST = "wxExecJsCallBack";
    public static final String KEY_PAGE_STATS_FS_CALL_EVENT_NUM = "wxFSCallEventTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_JS_NUM = "wxFSCallJsTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_JS_TIME = "wxFSCallJsTotalTime";
    public static final String KEY_PAGE_STATS_FS_CALL_NATIVE_NUM = "wxFSCallNativeTotalNum";
    public static final String KEY_PAGE_STATS_FS_CALL_NATIVE_TIME = "wxFSCallNativeTotalTime";
    public static final String KEY_PAGE_STATS_FS_REQUEST_NUM = "wxFSRequestNum";
    public static final String KEY_PAGE_STATS_FS_TIMER_NUM = "wxFSTimerCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_FAIL_NUM = "wxImgLoadFailCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_NUM = "wxImgLoadCount";
    public static final String KEY_PAGE_STATS_IMG_LOAD_SUCCESS_NUM = "wxImgLoadSuccessCount";
    public static final String KEY_PAGE_STATS_IMG_UN_RECYCLE_NUM = "wxImgUnRecycleCount";
    public static final String KEY_PAGE_STATS_I_ALL_VIEW_COUNT = "wxInteractionAllViewCount";
    public static final String KEY_PAGE_STATS_I_COMPONENT_CREATE_COUNT = "wxInteractionComponentCreateCount";
    public static final String KEY_PAGE_STATS_I_SCREEN_VIEW_COUNT = "wxInteractionScreenViewCount";
    public static final String KEY_PAGE_STATS_JSLIB_INIT_TIME = "wxJSLibInitTime";
    public static final String KEY_PAGE_STATS_LARGE_IMG_COUNT = "wxLargeImgMaxCount";
    public static final String KEY_PAGE_STATS_LAYOUT_TIME = "wxLayoutTime";
    public static final String KEY_PAGE_STATS_MAX_COMPONENT_NUM = "wxMaxComponentCount";
    public static final String KEY_PAGE_STATS_MAX_DEEP_DOM = "wxMaxDeepVDomLayer";
    public static final String KEY_PAGE_STATS_MAX_DEEP_VIEW = "wxMaxDeepViewLayer";
    public static final String KEY_PAGE_STATS_NET_FAIL_NUM = "wxNetworkRequestFailCount";
    public static final String KEY_PAGE_STATS_NET_NUM = "wxNetworkRequestCount";
    public static final String KEY_PAGE_STATS_NET_SUCCESS_NUM = "wxNetworkRequestSuccessCount";
    public static final String KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE = "wxScriptUseQJSByteCode";
    public static final String KEY_PAGE_STATS_SCROLLER_NUM = "wxScrollerCount";
    public static final String KEY_PAGE_STATS_SDK_INIT_TASK_TIME = "wxSDKInitTaskTime";
    public static final String KEY_PAGE_STATS_SDK_INIT_TOTAL_TIME = "wxSDKInitTotalTime";
    public static final String KEY_PAGE_STATS_VIEW_CREATE_COST = "wxViewCost";
    public static final String KEY_PAGE_STATS_WAIT_INIT_TIME = "wxWaitInitTime";
    public static final String KEY_PAGE_STATS_WRONG_IMG_SIZE_COUNT = "wxWrongImgSizeCount";
    public static final String KEY_PAGE_TIMER_BACK_NUM = "wxTimerInBackCount";
    public static final String KEY_PROPERTIES_ERROR_CODE = "wxErrorCode";
    public static final String VALUE_BUNDLE_LOAD_LENGTH = "wxLoadedLength";
    public static final String VALUE_ERROR_CODE_DEFAULT = "0";
    public static final String WEEX_FIRSTSCREENPAINT = "Weex_firstScreenPaint";
    public static final String WEEX_PAGE_TOPIC = "weex_page";

    /* renamed from: a  reason: collision with root package name */
    public final String f26941a;
    public final bbe b;
    public boolean f;
    public Rect l;
    public String m;
    public boolean o;
    public double r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean k = false;
    public boolean n = false;
    public final Set<String> q = new CopyOnWriteArraySet();
    public boolean w = false;
    public boolean x = false;
    public volatile boolean y = true;
    public final Runnable z = new a();
    public final Runnable A = new b();
    public long B = 0;
    public final Map<String, Object> j = new ConcurrentHashMap();
    public final Map<String, Long> d = new ConcurrentHashMap();
    public final Handler p = new Handler(Looper.getMainLooper());
    public final Map<String, Double> c = new ConcurrentHashMap();
    public final Map<String, Object> e = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                quw.this.v();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                quw.this.u();
            }
        }
    }

    static {
        t2o.a(985661631);
    }

    public quw(String str) {
        this.f26941a = str;
        dgb apmGenerater = WXSDKManager.getInstance().getApmGenerater();
        if (apmGenerater != null) {
            bbe generateApmInstance = apmGenerater.generateApmInstance("weex_page");
            this.b = generateApmInstance;
            if (generateApmInstance != null) {
                generateApmInstance.onStart(str);
            }
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96b8f8e4", new Object[]{this});
        }
        Long l = (Long) ((ConcurrentHashMap) this.d).get("wxRenderTimeOrigin");
        Long l2 = (Long) ((ConcurrentHashMap) this.d).get("wxInteraction");
        Long l3 = (Long) ((ConcurrentHashMap) this.d).get(KEY_PAGE_STAGES_NEW_FSRENDER);
        StringBuilder sb = new StringBuilder();
        if (!(l == null || l2 == null)) {
            sb.append("interactiveTime " + (l2.longValue() - l.longValue()) + "ms");
        }
        if (l3 != null) {
            sb.append(" wxNewFsRender " + l3 + "ms");
        }
        return sb.toString();
    }

    public void B(String str, double d) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276b5fdc", new Object[]{this, str, new Double(d)});
        } else if (this.b != null) {
            if (((ConcurrentHashMap) this.c).containsKey(str)) {
                d2 = ((Double) ((ConcurrentHashMap) this.c).get(str)).doubleValue();
            } else {
                d2 = vu3.b.GEO_NOT_SUPPORT;
            }
            g(str, d2 + d);
        }
    }

    public void C(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55aae669", new Object[]{this, str, new Double(d)});
        } else if (this.b != null && !this.f) {
            B(str, d);
        }
    }

    public void D(String str, double d) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bb51c9", new Object[]{this, str, new Double(d)});
        } else if (this.b != null) {
            if (((ConcurrentHashMap) this.c).containsKey(str)) {
                d2 = ((Double) ((ConcurrentHashMap) this.c).get(str)).doubleValue();
            } else {
                d2 = vu3.b.GEO_NOT_SUPPORT;
            }
            if (d2 < d) {
                g(str, d);
            }
        }
    }

    public void E(Map<String, String> map) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a5c44", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    d = Double.valueOf(entry.getValue()).doubleValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    d = -1.0d;
                }
                if (d != -1.0d) {
                    ((ConcurrentHashMap) this.c).put(entry.getKey(), Double.valueOf(d));
                }
            }
        }
    }

    public void F(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c287c0d6", new Object[]{this, map});
        } else if (this.b != null && map != null) {
            f("wxRequestType", "wxRequestType", map);
            f("cacheType", KEY_PAGE_PROPERTIES_CACHE_TYPE, map);
            f("zCacheInfo", "wxZCacheInfo", map);
            g(KEY_PAGE_STATS_JSLIB_INIT_TIME, WXEnvironment.sJSLibInitTime);
            long j = WXEnvironment.sNEWSDKInitTime;
            if (j != 0) {
                g(KEY_PAGE_STATS_SDK_INIT_TOTAL_TIME, j);
            }
            long j2 = WXEnvironment.sSDKInitTaskTime;
            if (j2 != 0) {
                g(KEY_PAGE_STATS_SDK_INIT_TASK_TIME, j2);
            }
            e(KEY_PAGE_PROPERTIES_JS_FM_INI, Boolean.valueOf(WXEnvironment.JsFrameworkInit));
            Object obj = map.get("actualNetworkTime");
            if (obj instanceof Long) {
                B(KEY_PAGE_STATS_ACTUAL_DOWNLOAD_TIME, ((Long) obj).doubleValue());
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975772ee", new Object[]{this});
        } else {
            B(KEY_PAGE_STATS_IMG_LOAD_NUM, 1.0d);
        }
    }

    public void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fa7253", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            B(KEY_PAGE_STATS_IMG_LOAD_SUCCESS_NUM, 1.0d);
        } else {
            B(KEY_PAGE_STATS_IMG_LOAD_FAIL_NUM, 1.0d);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2b958f", new Object[]{this});
            return;
        }
        if (!this.f) {
            C(KEY_PAGE_STATS_FS_REQUEST_NUM, 1.0d);
        }
        B(KEY_PAGE_STATS_NET_NUM, 1.0d);
    }

    public void d(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6590b3", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            B(KEY_PAGE_STATS_NET_SUCCESS_NUM, 1.0d);
        } else {
            B(KEY_PAGE_STATS_NET_FAIL_NUM, 1.0d);
        }
    }

    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
        } else if (!this.h && str != null && obj != null) {
            ((ConcurrentHashMap) this.e).put(str, obj);
            if (this.y) {
                w(str, obj);
            }
        }
    }

    public final void f(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6671e962", new Object[]{this, str, str2, map});
            return;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            e(str2, obj);
        }
    }

    public void g(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d8318f", new Object[]{this, str, new Double(d)});
        } else if (!this.h && str != null) {
            ((ConcurrentHashMap) this.c).put(str, Double.valueOf(d));
            if (this.y) {
                y(str, d);
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fb1020", new Object[]{this});
        } else if (this.b != null) {
            r(KEY_PAGE_STAGES_NEW_FSRENDER);
            r(WEEX_FIRSTSCREENPAINT);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7d7fa3", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(this.A, 8000L);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            bbeVar.onAppear();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            bbeVar.onDisappear();
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6691b1b0", new Object[]{this, str});
        } else {
            s(str, WXUtils.getFixUnixTime());
        }
    }

    public void s(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0863e1", new Object[]{this, str, new Long(j)});
        } else if (!this.h && str != null) {
            ((ConcurrentHashMap) this.d).put(str, Long.valueOf(j));
            if (this.y) {
                x(str, j);
            }
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca3de5e", new Object[]{this});
            return;
        }
        Long l = (Long) ((ConcurrentHashMap) this.d).get("wxStartDownLoadBundle");
        Long l2 = (Long) ((ConcurrentHashMap) this.d).get("wxEndDownLoadBundle");
        Long l3 = (Long) ((ConcurrentHashMap) this.d).get("wxInteraction");
        Long l4 = (Long) ((ConcurrentHashMap) this.d).get(KEY_PAGE_STAGES_CONTAINER_READY);
        Long l5 = (Long) ((ConcurrentHashMap) this.d).get("wxEndLoadBundle");
        Long l6 = (Long) ((ConcurrentHashMap) this.d).get("wxEndExecuteBundle");
        Long l7 = (Long) ((ConcurrentHashMap) this.d).get(KEY_PAGE_STAGES_INTERACTION_TM);
        Double d = (Double) ((ConcurrentHashMap) this.c).get(KEY_PAGE_STATS_SCRIPT_USE_QJS_BYTE_CODE);
        Double d2 = (Double) ((ConcurrentHashMap) this.c).get(KEY_PAGE_STATS_API_USE_QJS_BYTE_CODE);
        if (!(l2 == null || l == null)) {
            WXLogUtils.e("test->", "downLoadTime: " + (l2.longValue() - l.longValue()));
        }
        if (!(l5 == null || l6 == null)) {
            WXLogUtils.e("test->", "bundleExecuteTime:" + (l6.longValue() - l5.longValue()));
        }
        if (!(l2 == null || l3 == null)) {
            WXLogUtils.e("test->", "renderTime: " + (l3.longValue() - l2.longValue()));
        }
        if (!(l4 == null || l3 == null)) {
            WXLogUtils.e("test->", "showTime: " + (l3.longValue() - l4.longValue()));
        }
        if (!(l4 == null || l7 == null)) {
            WXLogUtils.e("test->", "showTimeTM: " + (l7.longValue() - l4.longValue()));
        }
        if (d != null) {
            WXLogUtils.e("test->", "scriptUseQJSByteCode: " + d);
        }
        if (d2 != null) {
            WXLogUtils.e("test->", "apiUseQJSByteCode: " + d2);
        }
    }

    public final void w(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab810aa", new Object[]{this, str, obj});
            return;
        }
        IpChange ipChange2 = qtw.$ipChange;
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            bbeVar.a(str, obj);
        }
    }

    public final void x(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f6afaf", new Object[]{this, str, new Long(j)});
            return;
        }
        IpChange ipChange2 = qtw.$ipChange;
        if ("wxRenderTimeOrigin".equalsIgnoreCase(str)) {
            this.p.postDelayed(this.z, 8000L);
        }
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            bbeVar.onStage(str, j);
        }
    }

    public final void y(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e6b7f6", new Object[]{this, str, new Double(d)});
            return;
        }
        IpChange ipChange2 = qtw.$ipChange;
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            bbeVar.c(str, d);
        }
    }

    public void z(String str) {
        String str2;
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str) && (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f26941a)) != null) {
            str = wXSDKInstance.G().get("wxContainerName");
        }
        bbe bbeVar = this.b;
        if (bbeVar != null) {
            str = bbeVar.b(str);
        }
        this.m = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "emptyPageName";
        } else {
            str2 = this.m;
        }
        this.m = str2;
        e("wxBizID", str2);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd5ab8e", new Object[]{this});
        } else if (this.b != null) {
            this.f = true;
            r(KEY_PAGE_STAGES_FSRENDER);
        }
    }

    public void i(WXComponent wXComponent) {
        WXPerformance c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9fc427", new Object[]{this, wXComponent});
        } else if (this.b != null && wXComponent != null && wXComponent.getInstance() != null) {
            IpChange ipChange2 = qtw.$ipChange;
            if (this.b != null && (c0 = wXComponent.getInstance().c0()) != null) {
                long fixUnixTime = WXUtils.getFixUnixTime();
                long currentTimeMillis = System.currentTimeMillis();
                if (qtw.a()) {
                    wXComponent.getInstance().N();
                    wXComponent.getComponentType();
                    wXComponent.getRef();
                    Objects.toString(wXComponent.getStyles());
                    Objects.toString(wXComponent.getAttrs());
                }
                if (!this.i) {
                    r(KEY_PAGE_STAGES_FIRST_INTERACTION_VIEW);
                    this.i = true;
                }
                if (!this.k) {
                    long fixUnixTime2 = WXUtils.getFixUnixTime();
                    if (fixUnixTime2 - this.B > 50) {
                        IWXBridgeManager wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager();
                        if (wXBridgeManager != null) {
                            wXBridgeManager.onInteractionTimeUpdate(this.f26941a);
                        }
                        this.B = fixUnixTime2;
                    }
                    this.t = this.s;
                    this.v = this.u;
                    Double d = (Double) ((ConcurrentHashMap) this.c).get(KEY_PAGE_STATS_LAYOUT_TIME);
                    this.r = d == null ? vu3.b.GEO_NOT_SUPPORT : d.doubleValue();
                    c0.interactionTime = fixUnixTime - c0.renderUnixTimeOrigin;
                    c0.interactionRealUnixTime = System.currentTimeMillis();
                    s("wxInteraction", fixUnixTime);
                    s(KEY_PAGE_STAGES_INTERACTION_TM, currentTimeMillis);
                    B(KEY_PAGE_STATS_I_SCREEN_VIEW_COUNT, 1.0d);
                    D(KEY_PAGE_STATS_I_ALL_VIEW_COUNT, c0.localInteractionViewAddCount);
                    WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(this.f26941a);
                    if (sDKInstance != null) {
                        D(KEY_PAGE_STATS_I_COMPONENT_CREATE_COUNT, sDKInstance.c0().componentCount);
                    }
                }
            }
        }
    }

    public void l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca249742", new Object[]{this});
        } else if (this.y && !this.g) {
            this.g = true;
            bbe bbeVar = this.b;
            if (bbeVar != null) {
                bbeVar.onStart(this.f26941a);
                WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f26941a);
                if (wXSDKInstance == null) {
                    str = "unKnowUrl";
                } else {
                    str = wXSDKInstance.getBundleUrl();
                }
                e("wxBundleUrl", str);
                e("wxErrorCode", "0");
                e(KEY_PAGE_PROPERTIES_JSLIB_VERSION, WXEnvironment.JS_LIB_SDK_VERSION);
                e(KEY_PAGE_PROPERTIES_WEEX_VERSION, WXEnvironment.WXSDK_VERSION);
                e(KEY_PAGE_PROPERTIES_WEEX_VERSION, WXEnvironment.WXSDK_VERSION);
                if (wXSDKInstance != null) {
                    e(KEY_PAGE_PROPERTIES_UIKIT_TYPE, wXSDKInstance.W());
                }
                e("wxUseRuntimeApi", Boolean.valueOf(WXEnvironment.sUseRunTimeApi));
                if (wXSDKInstance != null && (wXSDKInstance.V() == WXRenderStrategy.DATA_RENDER_BINARY || wXSDKInstance.V() == WXRenderStrategy.DATA_RENDER)) {
                    e("wxRenderType", WXEnvironment.EAGLE);
                }
                if (wXSDKInstance != null) {
                    for (Map.Entry<String, String> entry : wXSDKInstance.G().entrySet()) {
                        e(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public void p() {
        bbe bbeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        } else if (this.b != null && !this.h) {
            new Handler(Looper.getMainLooper()).removeCallbacks(this.A);
            u();
            ((CopyOnWriteArraySet) this.q).clear();
            this.p.removeCallbacks(this.z);
            r("wxDestroy");
            if (this.g && (bbeVar = this.b) != null) {
                bbeVar.onEnd();
            }
            this.h = true;
            t();
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00c9e1e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y = true;
        if (z) {
            r("wxStartDownLoadBundle");
        }
        l();
        for (Map.Entry entry : ((ConcurrentHashMap) this.d).entrySet()) {
            x((String) entry.getKey(), ((Long) entry.getValue()).longValue());
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.c).entrySet()) {
            y((String) entry2.getKey(), ((Double) entry2.getValue()).doubleValue());
        }
        for (Map.Entry entry3 : ((ConcurrentHashMap) this.e).entrySet()) {
            w((String) entry3.getKey(), entry3.getValue());
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bab3a1", new Object[]{this});
        } else if (!this.w) {
            this.w = true;
            g(KEY_PAGE_STATS_VIEW_CREATE_COST, this.v);
            g(KEY_PAGE_STATS_COMPONENT_CREATE_COST, this.t);
            g(KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST, 0L);
            g(KEY_PAGE_STATS_LAYOUT_TIME, this.r);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67db8733", new Object[]{this});
        } else if (!this.x) {
            this.x = true;
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f26941a);
            if (wXSDKInstance != null) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("wxBizID", this.m);
                hashMap.put("wxBundleUrl", wXSDKInstance.getBundleUrl());
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("wxInteraction", Long.valueOf(wXSDKInstance.c0().interactionRealUnixTime));
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put(v4s.PARAM_UPLOAD_STAGE, hashMap2);
                hashMap3.put(wua.KEY_PROPERTIES, hashMap);
                wXSDKInstance.B("wx_apm", hashMap3);
            }
        }
    }
}
