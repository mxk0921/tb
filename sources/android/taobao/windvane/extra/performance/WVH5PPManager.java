package android.taobao.windvane.extra.performance;

import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVRunningCoreInfo;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.pool.PreCreateInfo;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.taobao.windvane.util.DeviceUtils;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.uc.webview.export.WebView;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.acd;
import tb.avt;
import tb.bsw;
import tb.cce;
import tb.jpw;
import tb.lab;
import tb.oba;
import tb.t2o;
import tb.tc;
import tb.trw;
import tb.v7t;
import tb.vpw;
import tb.x74;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVH5PPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "H5PP";
    public static final int WV_H5PP_ZCache_State_Hit = 2;
    public static final int WV_H5PP_ZCache_State_NotHit = 1;
    public static final int WV_H5PP_ZCache_State_NotUse = 0;
    private static int identify = 0;
    private String errorCode;
    private String errorMessage;
    private long h5_PP_T1;
    private long h5_PP_T1_uptime;
    private long h5_PP_TTI;
    private long h5_PP_initEnd;
    private long h5_PP_initEnd_uptime;
    private long h5_PP_initStart;
    private long h5_PP_initStart_uptime;
    private long h5_PP_loadRequest;
    private long h5_PP_loadRequest_uptime;
    private long h5_PP_startLoad;
    private long h5_PP_startLoad_uptime;
    private String h5_sys_core_version;
    private String htmlUrl;
    private int htmlZCacheState;
    private WVPagePerformance pagePerformance;
    private IWVWebView webView;
    private boolean webViewPreCreated = false;

    static {
        t2o.a(989855994);
    }

    public WVH5PPManager(IWVWebView iWVWebView) {
        this.webView = iWVWebView;
    }

    public static /* synthetic */ WVPagePerformance access$000(WVH5PPManager wVH5PPManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPagePerformance) ipChange.ipc$dispatch("2cd5c67c", new Object[]{wVH5PPManager});
        }
        return wVH5PPManager.pagePerformance;
    }

    public static /* synthetic */ IWVWebView access$100(WVH5PPManager wVH5PPManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("cd5cd630", new Object[]{wVH5PPManager});
        }
        return wVH5PPManager.webView;
    }

    private String getH5CoreTypeString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32b2af91", new Object[]{this, new Integer(i)});
        }
        if (i == 2) {
            return "Sys";
        }
        return "U4";
    }

    private void stageIfNonZero(lab labVar, View view, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c9cdf5", new Object[]{this, labVar, view, str, new Long(j)});
        } else if (j > 0 && (view instanceof WVUCWebView)) {
            cce webViewPageModel = ((WVUCWebView) view).getWebViewContext().getWebViewPageModel();
            if ("H5_navigationStart".equals(str)) {
                webViewPageModel.onStageIfAbsent("H5_first_navigationStart", j);
            }
            webViewPageModel.onStage(str, j);
        }
    }

    private void takeW3CPP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149eada7", new Object[]{this});
        } else if (this.pagePerformance != null) {
            this.webView.evaluateJavascript("(function(performance){var timing=performance&&performance.timing;return timing&&JSON.stringify({ns:timing.navigationStart,fs:timing.fetchStart,rs:timing.requestStart,re:timing.responseEnd,dl:timing.domLoading,dc:timing.domComplete,ds:timing.domContentLoadedEventStart,ls:timing.loadEventStart,le:timing.loadEventEnd})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.performance.WVH5PPManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "{}";
                    }
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str.replace("\\", ""));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_navigationStart(jSONObject.optLong(NotificationStyle.NOTIFICATION_STYLE));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_fetchStart(jSONObject.optLong(RVStartParams.KEY_FULLSCREEN_SHORT));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_responseEnd(jSONObject.optLong("re"));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_domContentLoadedEventStart(jSONObject.optLong("ds"));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_loadEventStart(jSONObject.optLong(RVStartParams.KEY_LANDSCAPE_SHORT));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_loadEventEnd(jSONObject.optLong("le"));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_requestStart(jSONObject.optLong("rs"));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_domLoading(jSONObject.optLong("dl"));
                        WVH5PPManager.access$000(WVH5PPManager.this).setH5_PP_domComplete(jSONObject.optLong("dc"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (WVH5PPManager.access$100(WVH5PPManager.this) instanceof View) {
                        vpw.b();
                        if (vpw.commonConfig.Q0) {
                            WVH5PPManager wVH5PPManager = WVH5PPManager.this;
                            wVH5PPManager.uploadPPInfo((View) WVH5PPManager.access$100(wVH5PPManager));
                        }
                    }
                }
            });
        }
    }

    private void uploadHSCInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a71e4c", new Object[]{this});
        } else if (trw.getWvPerformanceMonitorInterface() != null) {
            trw.getWvPerformanceMonitorInterface().recordFSP(this.pagePerformance.getUrl(), this.pagePerformance.getH5_PP_T2() - this.h5_PP_loadRequest);
            trw.getWvPerformanceMonitorInterface().recordTTI(this.pagePerformance.getUrl(), this.h5_PP_TTI);
        }
    }

    public String jsCodeForUserPP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dae6debb", new Object[]{this});
        }
        return "javascript:(function(){var observer=new PerformanceObserver(function(list,obj){for(var entry of list.getEntries()){if(entry.entryType=='paint'&&entry.name=='first-paint'){console.log('hybrid://WVPerformance:FP/receiveFPTime?{\"time\":'+entry.startTime+'}')}if(entry.entryType=='longtask'){console.log('hybrid://WVPerformance:TTI/receiveTTITime?{\"time\":'+(entry.startTime+entry.duration)+'}')}}});observer.observe({entryTypes:['longtask','paint']})})()";
    }

    public void pageDidFailLoadWithError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df62d2a9", new Object[]{this, str, str2});
            return;
        }
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public void pageDidFinishIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3ca4e6", new Object[]{this});
        }
    }

    public void pageDidFinishLoad(String str, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985c38e0", new Object[]{this, str, webView});
            return;
        }
        uploadInfo();
        WVPagePerformance wVPagePerformance = new WVPagePerformance();
        this.pagePerformance = wVPagePerformance;
        wVPagePerformance.setH5_PP_startLoad(this.h5_PP_startLoad);
        this.pagePerformance.setH5_PP_startLoad_uptime(this.h5_PP_startLoad_uptime);
        this.pagePerformance.setH5_PP_finishLoad(System.currentTimeMillis());
        this.pagePerformance.setH5_PP_finishLoad_uptime(SystemClock.uptimeMillis());
        this.pagePerformance.setUrl(str);
        this.pagePerformance.setH5_PP_T1(this.h5_PP_T1);
        this.pagePerformance.setH5_PP_T1_uptime(this.h5_PP_T1_uptime);
        this.pagePerformance.setH5_PP_errorCode(this.errorCode);
        this.pagePerformance.setH5_PP_errorMessage(this.errorMessage);
        this.pagePerformance.setH5_Core_Type_Str(getH5CoreTypeString(webView.getCurrentViewCoreType()));
        this.pagePerformance.setH5_Core_Type(webView.getCurrentViewCoreType());
        takeW3CPP();
        this.pagePerformance.setH5_PP_isFinished(true);
        vpw.b();
        if (!vpw.commonConfig.Q0) {
            uploadPPInfo(webView);
        }
        this.errorCode = null;
        this.errorMessage = null;
    }

    public void pageDidLoadRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f8d40", new Object[]{this});
            return;
        }
        this.h5_PP_loadRequest = System.currentTimeMillis();
        this.h5_PP_loadRequest_uptime = SystemClock.uptimeMillis();
    }

    public void pageDidStartIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05ba97", new Object[]{this});
        }
    }

    public void pageDidStartLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d395e75f", new Object[]{this});
            return;
        }
        WVPagePerformance wVPagePerformance = this.pagePerformance;
        if (wVPagePerformance != null) {
            wVPagePerformance.setH5_PP_TTI(this.h5_PP_TTI);
            this.h5_PP_TTI = 0L;
        }
        this.h5_PP_startLoad = System.currentTimeMillis();
        this.h5_PP_startLoad_uptime = SystemClock.uptimeMillis();
    }

    public void receiveFPTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb03403", new Object[]{this, new Long(j)});
            return;
        }
        WVPagePerformance wVPagePerformance = this.pagePerformance;
        if (wVPagePerformance != null) {
            wVPagePerformance.setH5_PP_FP(j);
        }
    }

    public void receiveHtmlUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912cdd32", new Object[]{this, str});
        } else {
            this.htmlUrl = str;
        }
    }

    public void receiveHtmlZCacheState(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e96b8b", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = this.htmlUrl;
        if (str2 != null && str2.equals(str)) {
            this.htmlZCacheState = i;
        }
    }

    public void receiveTTITime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a86b0a", new Object[]{this, new Long(j)});
        } else if (j - this.h5_PP_TTI <= 5000) {
            this.h5_PP_TTI = j;
        }
    }

    public void recordFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4183b2b", new Object[]{this, new Long(j)});
            return;
        }
        WVPagePerformance wVPagePerformance = this.pagePerformance;
        if (wVPagePerformance != null) {
            wVPagePerformance.setH5_PP_FSP(j);
            this.pagePerformance.setH5_PP_FSP_uptime(avt.a(j));
        }
    }

    public void recordUCT1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dbe361", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_T1 = j;
        this.h5_PP_T1_uptime = avt.a(j);
    }

    public void recordUCT2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b90bc00", new Object[]{this, new Long(j)});
            return;
        }
        WVPagePerformance wVPagePerformance = this.pagePerformance;
        if (wVPagePerformance != null) {
            wVPagePerformance.setH5_PP_T2(j);
            this.pagePerformance.setH5_PP_T2_uptime(avt.a(j));
        }
    }

    public void setH5SysCoreVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5401a2c", new Object[]{this, str});
        } else {
            this.h5_sys_core_version = str;
        }
    }

    public void setWebViewPreCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed04131", new Object[]{this, new Boolean(z)});
        } else {
            this.webViewPreCreated = z;
        }
    }

    public void uploadInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabdc356", new Object[]{this});
        } else if (this.pagePerformance != null) {
            uploadHSCInfo();
            if (bsw.b().a().f() && !bsw.b().a().g()) {
                this.pagePerformance.getUrl();
                this.pagePerformance.getH5_PP_isFinished();
                this.pagePerformance.getH5_PP_errorCode();
                this.pagePerformance.getH5_PP_errorMessage();
                this.pagePerformance.getH5_PP_startLoad();
                this.pagePerformance.getH5_PP_navigationStart();
                this.pagePerformance.getH5_PP_fetchStart();
                this.pagePerformance.getH5_PP_responseEnd();
                this.pagePerformance.getH5_PP_domContentLoadedEventStart();
                this.pagePerformance.getH5_PP_loadEventStart();
                this.pagePerformance.getH5_PP_loadEventEnd();
                this.pagePerformance.getH5_PP_FP();
                this.pagePerformance.getH5_PP_FSP();
                this.pagePerformance.getH5_PP_TTI();
                this.pagePerformance.getH5_PP_T1();
                this.pagePerformance.getH5_PP_T2();
                this.pagePerformance.getH5_PP_finishLoad();
            }
        }
    }

    public void uploadPPInfo(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aaf3fc", new Object[]{this, view});
        } else {
            uploadToNativeApm(view);
        }
    }

    public void webViewDidFinishInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9093a90", new Object[]{this});
            return;
        }
        this.h5_PP_initEnd = System.currentTimeMillis();
        this.h5_PP_initEnd_uptime = SystemClock.uptimeMillis();
    }

    public void webViewDidStartInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a45c13", new Object[]{this});
            return;
        }
        this.h5_PP_initStart = System.currentTimeMillis();
        this.h5_PP_initStart_uptime = SystemClock.uptimeMillis();
    }

    public void uploadToNativeApm(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f36300", new Object[]{this, view});
            return;
        }
        try {
            if ((view instanceof IPerformance) && ((IPerformance) view).isPreInit()) {
                return;
            }
            if ((view instanceof acd) && ((acd) view).isPreRender()) {
                return;
            }
            if (vpw.commonConfig.J2 || tc.a(view)) {
                lab labVar = (lab) jpw.c().a(lab.class);
                if (labVar != null) {
                    if (view instanceof WVUCWebView) {
                        cce webViewPageModel = ((WVUCWebView) view).getWebViewContext().getWebViewPageModel();
                        webViewPageModel.onProperty("H5_URL", this.pagePerformance.getUrl());
                        webViewPageModel.onProperty("H5_process", x74.h(yaa.n));
                        webViewPageModel.onProperty("H5_isFinished", Boolean.valueOf(this.pagePerformance.getH5_PP_isFinished()));
                        webViewPageModel.onProperty("H5_errorCode", this.pagePerformance.getH5_PP_errorCode());
                        webViewPageModel.onProperty("H5_errorMessage", this.pagePerformance.getH5_PP_errorMessage());
                        webViewPageModel.onProperty("H5_htmlZCacheState", Integer.valueOf(this.htmlZCacheState));
                        webViewPageModel.onProperty("H5_coreType", Integer.valueOf(this.pagePerformance.getH5_Core_Type()));
                        webViewPageModel.onProperty("H5_coreTypeStr", this.pagePerformance.getH5_Core_Type_Str());
                        webViewPageModel.onProperty("H5_sysCoreVersion", this.h5_sys_core_version);
                        webViewPageModel.onProperty("H5_isPreCreatedWebView", Boolean.valueOf(this.webViewPreCreated));
                        String coreVersion = WVRunningCoreInfo.getCoreVersion();
                        if (coreVersion != null) {
                            webViewPageModel.onProperty("H5_sdkCoreVersion", coreVersion);
                        }
                        try {
                            webViewPageModel.onProperty("H5_deviceScore", Integer.valueOf(DeviceUtils.a()));
                            for (Map.Entry<String, String> entry : oba.a().entrySet()) {
                                if (entry != null) {
                                    webViewPageModel.onPropertyIfAbsent(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Exception unused) {
                        }
                        PreCreateInfo preCreateInfo = ((WVUCWebView) view).getWebViewContext().getPreCreateInfo();
                        if (preCreateInfo != null) {
                            webViewPageModel.onStageIfAbsent("H5_preCreateStart", preCreateInfo.getCreateStartTime());
                            webViewPageModel.onStageIfAbsent("H5_preCreateEnd", preCreateInfo.getCreateEndTime());
                            webViewPageModel.onPropertyIfAbsent("H5_isFirstCreate", Boolean.valueOf(preCreateInfo.isFirst()));
                            if (preCreateInfo.getLoadUrlStartTime() != null) {
                                webViewPageModel.onStageIfAbsent("H5_preCreateLoadUrlStart", preCreateInfo.getLoadUrlStartTime().longValue());
                            }
                            if (preCreateInfo.getLoadUrlEndTime() != null) {
                                webViewPageModel.onStageIfAbsent("H5_preCreateLoadUrlEnd", preCreateInfo.getLoadUrlEndTime().longValue());
                            }
                        }
                    }
                    stageIfNonZero(labVar, view, "H5_initStart", this.h5_PP_initStart_uptime);
                    stageIfNonZero(labVar, view, "H5_initEnd", this.h5_PP_initEnd_uptime);
                    stageIfNonZero(labVar, view, "H5_loadRequest", this.h5_PP_loadRequest_uptime);
                    stageIfNonZero(labVar, view, "H5_startLoad", this.pagePerformance.getH5_PP_startLoad_uptime());
                    stageIfNonZero(labVar, view, "H5_navigationStart", this.pagePerformance.getH5_PP_navigationStart_uptime());
                    stageIfNonZero(labVar, view, "H5_fetchStart", this.pagePerformance.getH5_PP_fetchStart_uptime());
                    stageIfNonZero(labVar, view, "H5_responseEnd", this.pagePerformance.getH5_PP_responseEnd_uptime());
                    stageIfNonZero(labVar, view, "H5_domLoading", this.pagePerformance.h5_PP_domLoading_uptime);
                    stageIfNonZero(labVar, view, "H5_domContentLoadedEventStart", this.pagePerformance.getH5_PP_domContentLoadedEventStart_uptime());
                    stageIfNonZero(labVar, view, "H5_loadEventStart", this.pagePerformance.getH5_PP_loadEventStart_uptime());
                    stageIfNonZero(labVar, view, "H5_loadEventEnd", this.pagePerformance.getH5_PP_loadEventEnd_uptime());
                    stageIfNonZero(labVar, view, "H5_firstPaint", this.pagePerformance.getH5_PP_FP_uptime());
                    stageIfNonZero(labVar, view, "H5_firstScreenPaint", this.pagePerformance.getH5_PP_FSP_uptime());
                    stageIfNonZero(labVar, view, "H5_timeToInteractive", this.pagePerformance.getH5_PP_TTI_uptime());
                    stageIfNonZero(labVar, view, "H5_finishLoad", this.pagePerformance.getH5_PP_finishLoad_uptime());
                    stageIfNonZero(labVar, view, "H5_coreInitStart", UCInitializerInfo.a().b(0));
                    stageIfNonZero(labVar, view, "H5_coreInitSuccess", UCInitializerInfo.a().b(7));
                    stageIfNonZero(labVar, view, "H5_coreInitFail", UCInitializerInfo.a().b(8));
                    stageIfNonZero(labVar, view, "ucRenderProcessReady", UCInitializerInfo.a().b(9));
                    stageIfNonZero(labVar, view, "ucGpuProcessReady", UCInitializerInfo.a().b(10));
                    stageIfNonZero(labVar, view, "H5_firstPreCreateStart", UCInitializerInfo.a().b(11));
                    stageIfNonZero(labVar, view, "H5_firstPreCreateEnd", UCInitializerInfo.a().b(12));
                    return;
                }
                return;
            }
            v7t.d(TAG, "enableReportApm is false");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
