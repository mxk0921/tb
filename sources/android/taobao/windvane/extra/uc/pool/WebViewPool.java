package android.taobao.windvane.extra.uc.pool;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import android.taobao.windvane.extra.uc.WVGlobalState;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.webkit.CookieManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.qos.QoSHandler;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebView;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bba;
import tb.d7n;
import tb.h8s;
import tb.icn;
import tb.jpw;
import tb.lab;
import tb.lcn;
import tb.mrt;
import tb.q9s;
import tb.r9u;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.y71;
import tb.yt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WebViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Themis/Performance/Render";
    private static volatile Context sApplicationContext;
    private static final LinkedList<WVUCWebView> sWebViewPool = new LinkedList<>();
    private static final AtomicBoolean sInitialized = new AtomicBoolean(false);
    private static CancelableTask sLastTask = null;
    private static boolean sIsFirstPreCreate = true;
    private static final AtomicBoolean sReportedSystemWebViewInitCost = new AtomicBoolean(false);

    static {
        t2o.a(989856165);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            reportSystemWebViewInitCostAsync();
        }
    }

    public static /* synthetic */ void access$100(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c58948", new Object[]{new Long(j), new Boolean(z)});
        } else {
            preCreateWebViewWithDelay(j, z);
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            preCreateWebView();
        }
    }

    private static void preCreateWebView() {
        Long l;
        Long l2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a91921", new Object[0]);
        } else if (sApplicationContext != null) {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.V1) {
                int i = wpwVar.b2;
                if (i <= 0) {
                    i = 1;
                }
                LinkedList<WVUCWebView> linkedList = sWebViewPool;
                if (linkedList.size() < i && WVCore.getInstance().isUCSupport()) {
                    boolean urlHasBeenLoaded = WVGlobalState.urlHasBeenLoaded();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z = sIsFirstPreCreate;
                    if (z) {
                        UCInitializerInfo.a().c(11);
                    }
                    sIsFirstPreCreate = false;
                    MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(sApplicationContext);
                    r9u.b("WVUCWebView#preCreateWebView");
                    final WVUCWebView wVUCWebView = new WVUCWebView(mutableContextWrapper);
                    r9u.d();
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    wVUCWebView.setPreCreated(true);
                    if (urlHasBeenLoaded) {
                        linkedList.push(wVUCWebView);
                        l2 = null;
                        l = null;
                    } else {
                        l2 = Long.valueOf(SystemClock.uptimeMillis());
                        wVUCWebView.setWebViewClient(new WVUCWebViewClient(mutableContextWrapper) { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                                if (str.hashCode() == -332805219) {
                                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                                    return null;
                                }
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/pool/WebViewPool$2");
                            }

                            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                            public void onPageFinished(WebView webView, String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                                    return;
                                }
                                r9u.b("WVUCWebView#preCreateWebView#onPageFinished");
                                super.onPageFinished(webView, str);
                                lcn.a(RVLLevel.Info, WebViewPool.TAG).j("onPageFinished").f();
                                WebViewPool.access$200();
                                try {
                                    wVUCWebView.destroy();
                                } catch (Exception e) {
                                    lcn.a(RVLLevel.Error, WebViewPool.TAG).j("destroy").a("error", e.getMessage()).f();
                                }
                                r9u.d();
                            }
                        });
                        r9u.b("WVUCWebView#preCreateWebView#loadDataWithBaseURL");
                        wVUCWebView.loadDataWithBaseURL(null, TemplateDocument.CONTENT, "text/html", "utf-8", null);
                        r9u.d();
                        l = Long.valueOf(SystemClock.uptimeMillis());
                    }
                    wVUCWebView.getWebViewContext().setPreCreateInfo(new PreCreateInfo(uptimeMillis, uptimeMillis2, z, l2, l));
                    lcn.a(RVLLevel.Info, TAG).j("preCreate").a("createCost", Long.valueOf(uptimeMillis2 - uptimeMillis)).a("loadUrlCost", Long.valueOf((l2 == null || l == null) ? 0L : l.longValue() - l2.longValue())).a("isFirstCreate", Boolean.valueOf(z)).a("type", "webview").a("urlHasBeenLoaded", Boolean.valueOf(urlHasBeenLoaded)).f();
                    if (z) {
                        UCInitializerInfo.a().c(12);
                        reportWebViewCreateInfo();
                    }
                }
            }
        }
    }

    private static void preCreateWebViewWithDelay(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda9dcfa", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (z) {
                try {
                    CancelableTask cancelableTask = sLastTask;
                    if (cancelableTask != null) {
                        cancelableTask.cancel();
                    }
                } catch (Exception e) {
                    lcn.a(RVLLevel.Error, TAG).j("preCreate").a("error", e.getMessage()).f();
                    return;
                }
            }
            CancelableTask cancelableTask2 = new CancelableTask() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/pool/WebViewPool$3");
                }

                @Override // android.taobao.windvane.extra.uc.pool.CancelableTask
                public void doRun() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4e76a87", new Object[]{this});
                    } else {
                        WebViewPool.access$200();
                    }
                }

                @Override // android.taobao.windvane.extra.uc.pool.CancelableTask
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        lcn.a(RVLLevel.Info, WebViewPool.TAG).j("cancel").f();
                    }
                }
            };
            sLastTask = cancelableTask2;
            if (i == 0 && bba.a(sApplicationContext) && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                cancelableTask2.run();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(cancelableTask2, j);
            }
        }
    }

    private static void reportSystemWebViewInitCostAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605f8110", new Object[0]);
        } else if (sReportedSystemWebViewInitCost.compareAndSet(false, true)) {
            mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        CookieManager.getInstance();
                    } catch (Throwable unused) {
                        v7t.d(WebViewPool.TAG, "fail to get cookie manager");
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cost", (Object) Long.valueOf(uptimeMillis2));
                    y71.commitSuccess("wv_system_webview_init", jSONObject);
                    v7t.i(WebViewPool.TAG, "init system webview cost: " + uptimeMillis2);
                }
            });
        }
    }

    private static void reportWebViewCreateInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7690af6", new Object[0]);
            return;
        }
        try {
            lab labVar = (lab) jpw.c().a(lab.class);
            if (labVar != null) {
                labVar.c(null, "H5_ucParamStart", UCInitializerInfo.a().b(14));
                labVar.c(null, "H5_ucParamEnd", UCInitializerInfo.a().b(15));
                labVar.c(null, "H5_beforeInit", UCInitializerInfo.a().b(13));
                labVar.c(null, "H5_extractStart", UCInitializerInfo.a().b(3));
                labVar.c(null, "H5_extractFinish", UCInitializerInfo.a().b(4));
                labVar.c(null, "H5_dexReady", UCInitializerInfo.a().b(5));
                labVar.c(null, "H5_nativeReady", UCInitializerInfo.a().b(6));
                labVar.c(null, "H5_initSuccess", UCInitializerInfo.a().b(7));
                labVar.c(null, "H5_precreateTaskScheduled", UCInitializerInfo.a().b(16));
                labVar.c(null, "H5_firstPreCreateStart", UCInitializerInfo.a().b(11));
                labVar.c(null, "H5_firstPreCreateEnd", UCInitializerInfo.a().b(12));
            }
        } catch (Throwable unused) {
        }
    }

    public static WVUCWebView acquirePreCreateWebView(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("c4b04b86", new Object[]{context});
        }
        WVUCWebView poll = sWebViewPool.poll();
        if (poll != null) {
            Context context2 = poll.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
            z = true;
        }
        lcn.a(RVLLevel.Info, TAG).j("acquire").a("type", "webview").a("hitCache", Boolean.valueOf(z)).f();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hitCache", (Object) Boolean.valueOf(z));
        y71.commitSuccess("WVWebViewPreCreate", jSONObject.toJSONString());
        preCreateWebViewWithDelay(vpw.commonConfig.a2, true);
        return poll;
    }

    public static synchronized void setUp(Context context) {
        final boolean z;
        boolean z2 = false;
        synchronized (WebViewPool.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ac527a4", new Object[]{context});
                return;
            }
            UCInitializerInfo.a().c(16);
            if (context != null) {
                if (sInitialized.compareAndSet(false, true)) {
                    if (context instanceof Application) {
                        sApplicationContext = context;
                    } else {
                        sApplicationContext = context.getApplicationContext();
                    }
                    final long j = 0;
                    try {
                        j = q9s.r3("themis_common_config", "wvWebPreCreateInitialDelay", 0);
                        z = h8s.b(context);
                    } catch (Exception e) {
                        lcn.f(RVLLevel.Error, TAG, "getIntConfigLocal error: " + e.getMessage());
                        z = false;
                    }
                    if (bba.a(context)) {
                        WVCoreSettings.getInstance().setCoreEventCallback2(new yt4() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                if (str.hashCode() == 1847240272) {
                                    super.onUCCorePrepared();
                                    return null;
                                }
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/pool/WebViewPool$1");
                            }

                            @Override // tb.zt4
                            public void onUCCorePrepared() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                                    return;
                                }
                                super.onUCCorePrepared();
                                if (z) {
                                    QoSHandler a2 = d7n.a();
                                    if (a2 != null) {
                                        a2.a(1, new Runnable() { // from class: android.taobao.windvane.extra.uc.pool.WebViewPool.1.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    return;
                                                }
                                                WebViewPool.access$000();
                                                WebViewPool.access$100(j, false);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                WebViewPool.access$000();
                                WebViewPool.access$100(j, false);
                            }
                        });
                    } else {
                        reportSystemWebViewInitCostAsync();
                        preCreateWebViewWithDelay(vpw.commonConfig.a2, false);
                    }
                    if (sApplicationContext != null) {
                        z2 = true;
                    }
                    icn j2 = lcn.a(RVLLevel.Info, TAG).j("setUp");
                    wpw wpwVar = vpw.commonConfig;
                    j2.a("enable", Boolean.valueOf(wpwVar.V1)).a("webViewCreateDelayTimeMs", Long.valueOf(wpwVar.a2)).a("initialDelay", Long.valueOf(j)).a("success", Boolean.valueOf(z2)).a("enableUseQosHandler", Boolean.valueOf(z)).f();
                }
            }
        }
    }
}
