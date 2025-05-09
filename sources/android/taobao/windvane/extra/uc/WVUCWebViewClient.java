package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.taobao.windvane.ha.UCHAManager;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.weaver.prefetch.a;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import com.uc.webview.export.extension.StorageUtils;
import com.uc.webview.export.extension.UCExtension;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.a7e;
import tb.brw;
import tb.bsw;
import tb.ctw;
import tb.dtw;
import tb.e4r;
import tb.eqw;
import tb.gtw;
import tb.hqw;
import tb.jpw;
import tb.lab;
import tb.lqw;
import tb.ltw;
import tb.srw;
import tb.ssw;
import tb.t2o;
import tb.trw;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.x74;
import tb.xru;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SANDBOX_TAG = "WVUCWebViewClient.sandbox";
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_SMS = "sms:";
    public static final String SCHEME_TEL = "tel:";
    private static final String TAG = "WVUCWebViewClient";
    public boolean isError;
    public WeakReference<Context> mContext;
    private Handler mRenderProcessHandler;
    private String pageStartUrl;
    public int crashCount = 0;
    private boolean useOldBridge = false;
    private Runnable mCrashCountReseter = new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            v7t.d(WVUCWebViewClient.SANDBOX_TAG, "crash count reset - " + WVUCWebViewClient.this.crashCount);
            WVUCWebViewClient.this.crashCount = 0;
        }
    };

    static {
        t2o.a(989856144);
    }

    public WVUCWebViewClient(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    private void checkJsFspMetaInfo(final WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67f90ed", new Object[]{this, wVUCWebView});
            return;
        }
        String metaDataScript = getMetaDataScript(new String[]{"WV.Meta.Performance.JSFSP"});
        if (metaDataScript != null && wVUCWebView != null) {
            wVUCWebView.evaluateJavascript(metaDataScript, new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    try {
                        JSONObject metaObject = WVUCWebViewClient.getMetaObject(str);
                        if (!(metaObject == null || wVUCWebView == null)) {
                            lab labVar = (lab) jpw.c().a(lab.class);
                            if (labVar == null || !metaObject.has("WV.Meta.Performance.JSFSP")) {
                                if (labVar != null) {
                                    wVUCWebView.setTag(labVar.d(), labVar.a());
                                }
                                v7t.a(WVUCWebViewClient.TAG, "no JSFSP setTag " + SystemClock.uptimeMillis());
                            } else if (TextUtils.isEmpty(metaObject.optString("WV.Meta.Performance.JSFSP"))) {
                                wVUCWebView.setTag(labVar.d(), labVar.a());
                                v7t.a(WVUCWebViewClient.TAG, "no version setTag " + SystemClock.uptimeMillis());
                            } else if (!wVUCWebView.isReportedFSP()) {
                                wVUCWebView.setTag(labVar.d(), labVar.f());
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(WVUCWebViewClient wVUCWebViewClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2109781315:
                return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCWebViewClient");
        }
    }

    public void getPageNameForFalco(final WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2882d8ec", new Object[]{this, wVUCWebView});
            return;
        }
        String metaDataScript = getMetaDataScript(new String[]{"WV.Meta.Falco.PageName"});
        if (!TextUtils.isEmpty(metaDataScript) && wVUCWebView != null) {
            wVUCWebView.evaluateJavascript(metaDataScript, new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    try {
                        JSONObject metaObject = WVUCWebViewClient.getMetaObject(str);
                        if (!(metaObject == null || wVUCWebView == null)) {
                            String optString = metaObject.optString("WV.Meta.Falco.PageName");
                            if (!TextUtils.isEmpty(optString)) {
                                wVUCWebView.setFalcoPageName(optString);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void onResourceReceivedZCacheInfo(String str, ltw ltwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a146f9ac", new Object[]{this, str, ltwVar});
        }
    }

    public void setPageStartUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf18aef", new Object[]{this, str});
        } else {
            this.pageStartUrl = str;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("992b8103", new Object[]{this, webView, webResourceRequest});
        }
        if (webView == null || webView.getCurrentViewCoreType() != 3) {
            return null;
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            v7t.d(TAG, "shouldInterceptRequest, invalid request.");
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        if (WVUCPrecacheManager.getInstance().hasPrecacheDoc(uri)) {
            WVUCPrecacheManager.getInstance().clearPrecacheDoc(uri);
            return null;
        } else if (!(webView instanceof IWVWebView)) {
            return null;
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!(webView instanceof WVUCWebView) || ((WVUCWebView) webView).getUCExtension() == null) {
                i = 2;
            }
            WebResourceResponse shouldInterceptRequestInternal = shouldInterceptRequestInternal(webView, uri, lqw.d().f(1008, (IWVWebView) webView, uri, webResourceRequest.getRequestHeaders(), Integer.valueOf(i)));
            if (uri != null && uri.contains("x-ssr=true")) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("url", (Object) uri);
                jSONObject.put("cost", (Object) Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                y71.commitSuccess("ssrInterceptCost", jSONObject.toJSONString());
            }
            return shouldInterceptRequestInternal;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        v7t.d(TAG, "WVUCWebViewClient.shouldOverrideUrlLoading, url = " + str);
        if (webView instanceof WVUCWebView) {
            WVUCWebView wVUCWebView = (WVUCWebView) webView;
            wVUCWebView.wpData.setPageCurrentStatus("shouldOverrideUrlLoading");
            wVUCWebView.wpData.timeLoadurl = System.currentTimeMillis();
            try {
                ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_pageRedirect", Boolean.TRUE);
            } catch (Exception e) {
                v7t.d(TAG, "report H5_pageRedirect error: " + x74.i(e));
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("_wvPgName");
                if (!TextUtils.isEmpty(queryParameter)) {
                    ((WVUCWebView) webView).setFalcoPageName(queryParameter);
                }
            } catch (Throwable th) {
                v7t.d(TAG, x74.i(th));
            }
        }
        if (gtw.g(str) && ssw.c(str, (a7e) webView)) {
            String b = eqw.c().b();
            if (TextUtils.isEmpty(b)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("cause", "ACCESS_FORBIDDEN");
                hashMap.put("url", str);
                ((WVUCWebView) webView).onMessage(402, hashMap);
            } else {
                webView.loadUrl(b);
            }
            return true;
        } else if (ctw.a(str, this.mContext.get(), (a7e) webView)) {
            v7t.d(TAG, "shouldOverrideUrlLoading filter url=" + str);
            y71.commitFail(y71.MONITOR_POINT_URL_CONFIG_FILTER_TYPE, 3, "WVUCWebView.shouldOverrideUrlLoading", str);
            return true;
        } else if ((webView instanceof IWVWebView) && lqw.d().f(1003, (IWVWebView) webView, str, new Object[0]).f22859a) {
            return true;
        } else {
            Context context = webView.getContext();
            if (str.startsWith("mailto:") || str.startsWith("tel:") || str.startsWith(SCHEME_SMS)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    if (context != null) {
                        context.startActivity(intent);
                    }
                } catch (ActivityNotFoundException e2) {
                    v7t.e(TAG, "shouldOverrideUrlLoading: ActivityNotFoundException, url=".concat(str), e2, new Object[0]);
                }
                return true;
            }
            WVUCWebView wVUCWebView2 = (WVUCWebView) webView;
            wVUCWebView2.wvh5PPManager.receiveHtmlUrl(str);
            wVUCWebView2.pageTracker.shouldOverrideUrlLoading(wVUCWebView2, str);
            wVUCWebView2.pageTracker.blockURLStart();
            try {
                if ((webView instanceof IWVWebView) && dtw.a() != null && dtw.a().isOpenURLIntercept()) {
                    if (dtw.a().isNeedupdateURLRule(false)) {
                        dtw.a().updateURLRule();
                    }
                    if (dtw.a().shouldOverrideUrlLoading(context, (IWVWebView) webView, str)) {
                        v7t.i(TAG, "intercept url : ".concat(str));
                        ((WVUCWebView) webView).pageTracker.blockURLEnd();
                        return true;
                    }
                }
            } catch (Exception e3) {
                v7t.d(TAG, "shouldOverrideUrlLoading: doFilter error, " + e3.getMessage());
            }
            wVUCWebView2.pageTracker.blockURLEnd();
            if (webView instanceof WVUCWebView) {
                UCNetworkDelegate.getInstance().onUrlChange(wVUCWebView2, str);
                wVUCWebView2.setCachedUrl(str);
            }
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("userAgent", webView.getSettings().getUserAgentString());
                a.d().f(str, hashMap2);
            } catch (Throwable th2) {
                v7t.e(TAG, "failed to call prefetch: " + th2.getMessage(), th2, new Object[0]);
                th2.printStackTrace();
            }
            wVUCWebView2.updateCurId();
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public static JSONObject getMetaObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e0441e19", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1);
            }
            return new JSONObject(str.replace("\\", ""));
        } catch (Exception unused) {
            return null;
        }
    }

    private void tryPreCacheResources(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b895a88", new Object[]{this, webView});
            return;
        }
        if (WVUCPrecacheManager.canClearPrecache()) {
            WVUCPrecacheManager.resetClearConfig();
            StorageUtils.clearPrecacheResources(null);
            WVUCPrecacheManager.setHasPrecache(false);
        }
        if (WVUCPrecacheManager.canPrecache()) {
            WVUCPrecacheManager.resetClearConfig();
            WVUCPrecacheManager.resetPrecacheConfig();
            HashSet<String> preMemCacheUrlSet = WVUCPrecacheManager.preMemCacheUrlSet();
            if (preMemCacheUrlSet != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> it = preMemCacheUrlSet.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    WebResourceResponse shouldInterceptRequest = shouldInterceptRequest(webView, new WebResourceRequest(next, new HashMap()));
                    if (shouldInterceptRequest != null) {
                        hashMap.put(next, shouldInterceptRequest);
                    }
                }
                if (hashMap.size() > 0) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(TBImageFlowMonitor.TTL_ERROR_MAX_AGE, "3600");
                    hashMap2.put("ignoreQuery", "1");
                    StorageUtils.precacheResources(hashMap, hashMap2);
                    WVUCPrecacheManager.setHasPrecache(true);
                }
            }
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        boolean z = webView instanceof WVUCWebView;
        if (z) {
            ((WVUCWebView) webView).wpData.setPageCurrentStatus("onPageStarted");
        }
        v7t.d(TAG, "onPageStarted : " + str);
        this.pageStartUrl = str;
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.wvfspManager.navigationDidStart();
        wVUCWebView.wvh5PPManager.pageDidStartLoad();
        wVUCWebView.pageTracker.onPageStarted(wVUCWebView, str);
        Context _getContext = ((IWVWebView) webView)._getContext();
        if (_getContext instanceof Activity) {
            UCHAManager.getInstance().initApmCallback(str, _getContext.getClass().getSimpleName());
        }
        if (webView instanceof PreRenderWebView) {
            xru.d().i(webView);
        }
        this.isError = false;
        if (trw.getPerformanceMonitor() != null) {
            trw.getPerformanceMonitor().didPageStartLoadAtTime(str, System.currentTimeMillis());
        }
        if (z) {
            lqw.d().f(1001, (IWVWebView) webView, str, bitmap);
            WVUCWebView wVUCWebView2 = (WVUCWebView) webView;
            wVUCWebView2.onMessage(400, null);
            wVUCWebView2.mPageStart = System.currentTimeMillis();
        }
        WVJsBridge.g().l();
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean onRenderProcessGone(final WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4378e4", new Object[]{this, webView, renderProcessGoneDetail})).booleanValue();
        }
        v7t.d(SANDBOX_TAG, "onRenderProcessGone webview:" + webView + ", crash:" + renderProcessGoneDetail.didCrash() + ", priority:" + renderProcessGoneDetail.rendererPriorityAtExit() + ", crash count:" + this.crashCount);
        int i = this.crashCount;
        if (i >= vpw.commonConfig.G) {
            if (trw.getWvMonitorInterface() != null) {
                trw.getWvMonitorInterface().commitWebMultiType(webView.getUrl(), WVCore.getInstance().getUsedWebMulti(), -1);
                WVCore.getInstance().updateIsolatePolicy(webView.getContext(), false);
            }
            this.crashCount = 0;
            v7t.e(SANDBOX_TAG, "onRenderProcessGone webview:" + webView.getClass().getSimpleName() + ", crash:" + renderProcessGoneDetail.didCrash(), new Throwable(), new Object[0]);
            return false;
        } else if (webView != null) {
            this.crashCount = i + 1;
            if (this.mRenderProcessHandler == null) {
                this.mRenderProcessHandler = new Handler(Looper.getMainLooper());
            }
            this.mRenderProcessHandler.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!webView.isDestroied()) {
                        WebView webView2 = webView;
                        if ((webView2 instanceof WVUCWebView) && vpw.commonConfig.c1) {
                            WVUCWebView wVUCWebView = (WVUCWebView) webView2;
                            String currentUrl = wVUCWebView.getCurrentUrl();
                            wVUCWebView.pageTracker.onPageRenderProcessTerminate(currentUrl);
                            AppMonitor.Alarm.commitFail("WindVane", "webProcessTerminated", currentUrl, "1", renderProcessGoneDetail.didCrash() + ":" + renderProcessGoneDetail.rendererPriorityAtExit());
                        }
                        WebView webView3 = webView;
                        if (webView3 instanceof WVUCWebView) {
                            ((WVUCWebView) webView3).refreshWhenForeground();
                        } else {
                            webView3.reload();
                        }
                    }
                }
            }, 200L);
            this.mRenderProcessHandler.removeCallbacks(this.mCrashCountReseter);
            this.mRenderProcessHandler.postDelayed(this.mCrashCountReseter, 20000L);
            return true;
        } else {
            v7t.d(SANDBOX_TAG, "onRenderProcessGone - WebView is null");
            return false;
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        String sslError2 = sslError.toString();
        String url = sslError.getUrl();
        v7t.d(TAG, "onReceivedSslError  url: " + url + "errorMsg:" + sslError2);
        HashMap hashMap = new HashMap(1);
        hashMap.put("url", url);
        hashMap.put("msg", "ssl error: " + sslError2);
        ((WVUCWebView) webView).wpData.addProbableReason(hashMap.toString());
        String url2 = webView.getUrl();
        if (webView instanceof WVUCWebView) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("cause", "SSL_ERROR");
            hashMap2.put("url", url2);
            ((WVUCWebView) webView).onMessage(402, hashMap2);
        }
        if (webView instanceof IWVWebView) {
            lqw.d().f(1006, (IWVWebView) webView, url2, sslError2);
        }
        if (trw.getErrorMonitor() != null) {
            trw.getErrorMonitor().didOccurNativeError(url2, 1006, sslError2);
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public static String getMetaDataScript(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1d9058", new Object[]{strArr});
        }
        String str = "(function(){var d=document,r={}";
        String str2 = "";
        for (int i = 0; i < strArr.length; i++) {
            str = str + String.format(",n%d='%s',e%d=d.getElementById(n%d)", Integer.valueOf(i), strArr[i], Integer.valueOf(i), Integer.valueOf(i));
            str2 = str2 + String.format("if(e%d){r[n%d]=e%d.getAttribute('value')}", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";" + str2 + "return JSON.stringify(r);})()");
        return sb.toString();
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        v7t.d(TAG, "Receive error, code: " + i + "; desc: " + str + "; url: " + str2);
        String url = webView.getUrl();
        WVUCWebView wVUCWebView = (WVUCWebView) webView;
        wVUCWebView.wvh5PPManager.pageDidFailLoadWithError(String.valueOf(i), str);
        wVUCWebView.pageTracker.onPageReceivedError(wVUCWebView, str, i);
        wVUCWebView.wpData.addProbableReason(str);
        if ((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !x74.m(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str2);
            hashMap.put("msg", "errCode = [" + i + "]; errMsg" + str);
            if (((i > -16 && i < 0) || i == -80 || i == -50) && (url == null || url.equals(str2))) {
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cause", str + " [" + i + "]");
                hashMap2.put("url", str2);
                this.isError = true;
                webView.setVisibility(4);
                wVUCWebView.onMessage(402, hashMap2);
            }
        }
        if ((!(webView instanceof IWVWebView) || !lqw.d().f(1005, (IWVWebView) webView, str2, Integer.valueOf(i), str, str2).f22859a) && trw.getErrorMonitor() != null) {
            hqw errorMonitor = trw.getErrorMonitor();
            if (url != null) {
                str2 = url;
            }
            errorMonitor.didOccurNativeError(str2, i, str);
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onPageFinished(final WebView webView, final String str) {
        String str2;
        WVUCWebView wVUCWebView;
        String str3;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        v7t.d(TAG, "onPageFinished : " + str);
        wpw wpwVar = vpw.commonConfig;
        if (wpwVar.H2) {
            brw.commit();
        }
        if (webView instanceof WVUCWebView) {
            ((WVUCWebView) webView).wpData.setPageCurrentStatus("onPageFinished");
        }
        vpw.b();
        if (!TextUtils.isEmpty(wpwVar.u0)) {
            vpw.b();
            webView.evaluateJavascript(wpwVar.u0, new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str4});
                        return;
                    }
                    v7t.d(WVUCWebViewClient.TAG, "JSTfsp receiveValue " + str4);
                }
            });
            v7t.d(TAG, "JSTfsp evaluate");
        }
        try {
            if (webView instanceof WVUCWebView) {
                getPageNameForFalco((WVUCWebView) webView);
                checkJsFspMetaInfo((WVUCWebView) webView);
            } else {
                v7t.d(TAG, "view is " + webView);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        UCExtension uCExtension = webView.getUCExtension();
        if (vpw.commonConfig.G1) {
            e4r.a(webView.getContext());
            str2 = e4r.c();
        } else {
            str2 = null;
        }
        WVUCWebView wVUCWebView2 = (WVUCWebView) webView;
        wVUCWebView2.wvh5PPManager.setH5SysCoreVersion(str2);
        boolean z = webView instanceof WVUCWebView;
        if (z) {
            wVUCWebView2.wvh5PPManager.setWebViewPreCreated(wVUCWebView2.isPreCreated());
        }
        wVUCWebView2.wvh5PPManager.pageDidFinishLoad(str, webView);
        if (!bsw.b().a().d() || str.startsWith("http")) {
            wVUCWebView2.pageTracker.onPageFinished(wVUCWebView2, str);
        }
        String jsCodeForFSP = wVUCWebView2.wvfspManager.jsCodeForFSP();
        if (!TextUtils.isEmpty(jsCodeForFSP)) {
            webView.loadUrl(jsCodeForFSP);
        }
        try {
            Context _getContext = ((WVUCWebView) webView)._getContext();
            if (((WVUCWebView) webView).isStatusBarImmersive() && _getContext != null && _getContext.getResources() != null && (identifier = _getContext.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                int dimensionPixelSize = _getContext.getResources().getDimensionPixelSize(identifier);
                int i = _getContext.getResources().getDisplayMetrics().widthPixels;
                ((WVUCWebView) webView).evaluateJavascript("document.body.style.setProperty('--safe-area-inset-top', '" + ((dimensionPixelSize / i) * 100.0d) + "vw')");
            }
        } catch (Throwable unused) {
        }
        wVUCWebView2.wvfspManager.navigationDidFinishWithURL(str);
        final long currentTimeMillis = System.currentTimeMillis();
        if (!this.isError && webView.getVisibility() == 4) {
            this.isError = false;
            webView.setVisibility(0);
        }
        super.onPageFinished(webView, str);
        if (z) {
            wVUCWebView2.setCurrentUrl(str, "onPageFinished");
            wVUCWebView2.onMessage(401, null);
        }
        if (webView instanceof IWVWebView) {
            IWVWebView iWVWebView = (IWVWebView) webView;
            lqw.d().f(1002, iWVWebView, str, new Object[0]);
            iWVWebView.fireEvent("WindVaneReady", "{'version':'8.5.0'}");
        }
        if (trw.getPerformanceMonitor() != null) {
            wVUCWebView = wVUCWebView2;
            str3 = str2;
            trw.getPerformanceMonitor().didGetPageStatusCode(str, -1, uCExtension != null ? uCExtension.isLoadFromCachedPage() : false ? 72 : WVUCWebView.getFromType(), null, null, null, null, null);
        } else {
            wVUCWebView = wVUCWebView2;
            str3 = str2;
        }
        webView.evaluateJavascript("(function(p){if(!p||!p.timing)return;var t=p.timing,s=t.navigationStart,sc=t.secureConnectionStart,dc=t.domComplete,les=t.loadEventStart,lee=t.loadEventEnd;return JSON.stringify({dns:t.domainLookupEnd-t.domainLookupStart,c:t.connectEnd-t.connectStart,scs:sc>0?sc-s:0,req:t.requestStart-s,rps:t.responseStart-s,rpe:t.responseEnd-s,dl:t.domLoading-s,dcl:t.domContentLoadedEventEnd-s,dc:dc>0?dc-s:0,les:les>0?les-s:0,lee:lee>0?lee-s:0})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str4});
                } else if (trw.getPerformanceMonitor() != null) {
                    trw.getPerformanceMonitor().didPagePerformanceInfo(str, str4);
                    trw.getPerformanceMonitor().didPageFinishLoadAtTime(str, currentTimeMillis);
                }
            }
        });
        v7t.i(TAG, str + " LayerType : " + webView.getLayerType());
        wpw wpwVar2 = vpw.commonConfig;
        if (!wpwVar2.C && webView.getCurrentViewCoreType() == 2) {
            webView.evaluateJavascript("javascript:(function(f){if(f.__windvane__.call) return true; else return false})(window)", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str4});
                        return;
                    }
                    v7t.i("WVJsBridge", "has windvane :" + str4);
                    if ("false".equals(str4)) {
                        WebView webView2 = webView;
                        webView2.loadUrl("javascript:" + WVBridgeEngine.WINDVANE_CORE_JS);
                    }
                }
            });
        }
        String str4 = "";
        if (webView.getCurrentViewCoreType() == 3) {
            y71.commitSuccess(y71.MONITOR_POINT_WEB_CORE_TYPE_BY_PV, str);
            String ucDetailVersion = UCDefaultUserAgent.getUcDetailVersion();
            if (trw.getWvMonitorInterface() != null) {
                srw wvMonitorInterface = trw.getWvMonitorInterface();
                String valueOf = String.valueOf(wpwVar2.r);
                if (ucDetailVersion != null) {
                    str4 = ucDetailVersion;
                }
                wvMonitorInterface.commitCoreTypeByPV(valueOf, "U4", str4, str);
            }
            if (uCExtension != null && !wVUCWebView.isStaticWebView()) {
                if (!x74.l(webView.getContext())) {
                    trw.getWvMonitorInterface().commitWebMultiTypeByPV("0", "0", "-1", "0", "0", "-1");
                } else {
                    uCExtension.getCoreStatus(2, new ValueCallback<Object>() { // from class: android.taobao.windvane.extra.uc.WVUCWebViewClient.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("c60988b0", new Object[]{this, obj});
                            } else if (obj instanceof Map) {
                                Map map = (Map) obj;
                                if (trw.getWvMonitorInterface() != null) {
                                    trw.getWvMonitorInterface().commitWebMultiTypeByPV(String.valueOf(WVCore.getInstance().getUsedWebMulti()), (String) map.get("rt"), (String) map.get("rtWhy"), String.valueOf(WVCore.getInstance().getUsedGpuMulti()), (String) map.get("gt"), (String) map.get("gtWhy"));
                                }
                            }
                        }
                    });
                }
            }
        } else {
            y71.commitFail(y71.MONITOR_POINT_WEB_CORE_TYPE_BY_PV, webView.getCurrentViewCoreType(), str3 == null ? str4 : str3, str);
            if (trw.getWvMonitorInterface() != null) {
                srw wvMonitorInterface2 = trw.getWvMonitorInterface();
                String valueOf2 = String.valueOf(wpwVar2.r);
                if (str3 != null) {
                    str4 = str3;
                }
                wvMonitorInterface2.commitCoreTypeByPV(valueOf2, TimeCalculator.PLATFORM_ANDROID, str4, str);
            }
        }
        if (WVCore.getInstance().isUCSupport()) {
            tryPreCacheResources(webView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0317 A[Catch: all -> 0x02f9, TryCatch #1 {all -> 0x02f9, blocks: (B:75:0x027d, B:77:0x029a, B:79:0x02a4, B:80:0x02bd, B:92:0x0300, B:94:0x030a, B:96:0x0317, B:97:0x033a, B:100:0x034e, B:102:0x0370, B:103:0x0373, B:106:0x037d, B:81:0x02be, B:83:0x02c5, B:85:0x02de, B:86:0x02f5), top: B:128:0x027d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033a A[Catch: all -> 0x02f9, TRY_LEAVE, TryCatch #1 {all -> 0x02f9, blocks: (B:75:0x027d, B:77:0x029a, B:79:0x02a4, B:80:0x02bd, B:92:0x0300, B:94:0x030a, B:96:0x0317, B:97:0x033a, B:100:0x034e, B:102:0x0370, B:103:0x0373, B:106:0x037d, B:81:0x02be, B:83:0x02c5, B:85:0x02de, B:86:0x02f5), top: B:128:0x027d, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.uc.webview.export.WebResourceResponse shouldInterceptRequestInternal(com.uc.webview.export.WebView r19, java.lang.String r20, tb.kqw r21) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebViewClient.shouldInterceptRequestInternal(com.uc.webview.export.WebView, java.lang.String, tb.kqw):com.uc.webview.export.WebResourceResponse");
    }

    @Override // com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{this, webView, str});
        }
        if (webView == null || webView.getCurrentViewCoreType() == 3 || !(webView instanceof IWVWebView)) {
            return null;
        }
        if ((webView instanceof WVUCWebView) && ((WVUCWebView) webView).getUCExtension() != null) {
            i = 3;
        }
        return shouldInterceptRequestInternal(webView, str, lqw.d().f(1004, (IWVWebView) webView, str, Integer.valueOf(i)));
    }

    @Override // com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        try {
            if (webView instanceof WVUCWebView) {
                ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_pageRedirect", Boolean.TRUE);
            }
        } catch (Exception e) {
            v7t.d(TAG, "report H5_pageRedirect error: " + x74.i(e));
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
