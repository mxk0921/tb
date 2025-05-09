package android.taobao.windvane.webview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.a7e;
import tb.btw;
import tb.ctw;
import tb.dtw;
import tb.e4r;
import tb.gtw;
import tb.hqw;
import tb.lqw;
import tb.srw;
import tb.ssw;
import tb.t2o;
import tb.trw;
import tb.v7t;
import tb.vpw;
import tb.wpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWebViewClient";
    public boolean isError;
    public Context mContext;
    private String currentUrl = null;
    private long mPageFinshTime = 0;
    public WebViewClient extraWebViewClient = null;

    static {
        t2o.a(989856483);
    }

    public WVWebViewClient(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ long access$000(WVWebViewClient wVWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bedeecf3", new Object[]{wVWebViewClient})).longValue();
        }
        return wVWebViewClient.mPageFinshTime;
    }

    public static /* synthetic */ Object ipc$super(WVWebViewClient wVWebViewClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -496040708) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        } else if (hashCode == 61247803) {
            return super.shouldInterceptRequest((WebView) objArr[0], (String) objArr[1]);
        } else {
            if (hashCode == 1835642644) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/webview/WVWebViewClient");
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
            return;
        }
        v7t.i(TAG, "onPageFinished : " + str);
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        if (!TextUtils.isEmpty(wpwVar.u0)) {
            vpw.b();
            webView.evaluateJavascript(wpwVar.u0, new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    v7t.d(WVWebViewClient.TAG, "JSTfsp receiveValue " + str2);
                }
            });
            v7t.d(TAG, "JSTfsp evaluate");
        }
        this.mPageFinshTime = System.currentTimeMillis();
        if (!this.isError && webView.getVisibility() == 4) {
            this.isError = false;
            webView.setVisibility(0);
        }
        super.onPageFinished(webView, str);
        if (webView instanceof WVWebView) {
            ((WVWebView) webView).setCurrentUrl(str, "onPageFinished");
        }
        if (webView instanceof IWVWebView) {
            lqw.d().f(1002, (IWVWebView) webView, str, new Object[0]);
        }
        final WVWebView wVWebView = (WVWebView) webView;
        if (v7t.h()) {
            v7t.l(TAG, "Page finish: " + str);
        }
        String str2 = null;
        wVWebView.onMessage(401, null);
        wVWebView.fireEvent("WindVaneReady", "{'version':'8.5.0'}");
        wVWebView.evaluateJavascript("(function(p){if(!p||!p.timing)return;var t=p.timing,s=t.navigationStart,sc=t.secureConnectionStart,dc=t.domComplete,lee=t.loadEventEnd;return JSON.stringify({dns:t.domainLookupEnd-t.domainLookupStart,c:t.connectEnd-t.connectStart,scs:sc>0?sc-s:0,req:t.requestStart-s,rps:t.responseStart-s,rpe:t.responseEnd-s,dl:t.domLoading-s,dcl:t.domContentLoadedEventEnd-s,dc:dc>0?dc-s:0,lee:lee>0?lee-s:0})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                } else if (trw.getPerformanceMonitor() != null) {
                    trw.getPerformanceMonitor().didPagePerformanceInfo(str, str3);
                    trw.getPerformanceMonitor().didPageFinishLoadAtTime(str, WVWebViewClient.access$000(WVWebViewClient.this));
                }
            }
        });
        wVWebView.evaluateJavascript("javascript:(function(f){if(f.__windvane__.call) return true; else return false})(window)", new ValueCallback<String>() { // from class: android.taobao.windvane.webview.WVWebViewClient.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onReceiveValue(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                    return;
                }
                v7t.i("WVJsBridge", "has windvane :" + str3);
                if ("false".equals(str3)) {
                    WVWebView wVWebView2 = wVWebView;
                    wVWebView2.loadUrl("javascript:" + WVBridgeEngine.WINDVANE_CORE_JS);
                }
            }
        });
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
        if (wpwVar.G1) {
            e4r.a(webView.getContext());
            str2 = e4r.c();
        }
        if (trw.getWvMonitorInterface() != null) {
            srw wvMonitorInterface = trw.getWvMonitorInterface();
            String valueOf = String.valueOf(wpwVar.r);
            if (str2 == null) {
                str2 = "";
            }
            wvMonitorInterface.commitCoreTypeByPV(valueOf, "WVAndroid", str2, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
            return;
        }
        this.isError = false;
        if (webView instanceof IWVWebView) {
            lqw.d().f(1001, (IWVWebView) webView, str, bitmap);
        }
        if (v7t.h()) {
            v7t.i(TAG, "onPageStarted : " + str);
        }
        this.currentUrl = str;
        ((WVWebView) webView).onMessage(400, null);
        if (trw.getPerformanceMonitor() != null) {
            trw.getPerformanceMonitor().didPageStartLoadAtTime(str, System.currentTimeMillis());
        }
        WVJsBridge.g().l();
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        String sslError2 = sslError.toString();
        if (v7t.h()) {
            v7t.d(TAG, "onReceivedSslError  url: " + sslError.getUrl() + "errorMsg:" + sslError2);
        }
        String url = webView.getUrl();
        if (webView instanceof IWVWebView) {
            lqw.d().f(1006, (IWVWebView) webView, url, sslError2);
        }
        if (trw.getErrorMonitor() != null) {
            trw.getErrorMonitor().didOccurNativeError(url, 1006, sslError2);
        }
        WebViewClient webViewClient = this.extraWebViewClient;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.webview.WVWebViewClient.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
        }
        if (gtw.g(str) && ssw.c(str, (a7e) webView)) {
            String b = btw.c().b();
            if (TextUtils.isEmpty(b)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("cause", "ACCESS_FORBIDDEN");
                hashMap.put("url", str);
                ((WVWebView) webView).onMessage(402, hashMap);
            } else {
                webView.loadUrl(b);
            }
            return true;
        } else if (ctw.a(str, this.mContext, (a7e) webView)) {
            v7t.d(TAG, "shouldOverrideUrlLoading filter url=" + str);
            return true;
        } else {
            if (v7t.h()) {
                v7t.l(TAG, "shouldOverrideUrlLoading: " + str);
            }
            if ((webView instanceof IWVWebView) && lqw.d().f(1003, (IWVWebView) webView, str, new Object[0]).f22859a) {
                return true;
            }
            if (str.startsWith("mailto:") || str.startsWith("tel:")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    this.mContext.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    v7t.d(TAG, "shouldOverrideUrlLoading: ActivityNotFoundException, url=".concat(str));
                }
                return true;
            }
            try {
                if ((webView instanceof IWVWebView) && dtw.a() != null && dtw.a().isOpenURLIntercept()) {
                    if (dtw.a().isNeedupdateURLRule(false)) {
                        dtw.a().updateURLRule();
                    }
                    if (dtw.a().shouldOverrideUrlLoading(this.mContext, (IWVWebView) webView, str)) {
                        if (v7t.h()) {
                            v7t.l(TAG, "intercept url: ".concat(str));
                        }
                        return true;
                    }
                }
            } catch (Exception e) {
                v7t.d(TAG, "shouldOverrideUrlLoading: doFilter error, " + e.getMessage());
            }
            if (webView instanceof WVWebView) {
                ((WVWebView) webView).setCurrentUrl(str, "shouldOverrideUrlLoading");
            }
            v7t.i(TAG, "shouldOverrideUrlLoading : ".concat(str));
            WebViewClient webViewClient = this.extraWebViewClient;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1314a5", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        if (v7t.h()) {
            v7t.d(TAG, "Receive error, code: " + i + "; desc: " + str + "; url: " + str2);
        }
        if (!(webView instanceof IWVWebView) || !lqw.d().f(1005, (IWVWebView) webView, str2, Integer.valueOf(i), str, str2).f22859a) {
            String url = webView.getUrl();
            if (url == null || url.equals(str2)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("cause", str + " [" + i + "]");
                hashMap.put("url", str2);
                ((WVWebView) webView).onMessage(402, hashMap);
                this.isError = true;
                webView.setVisibility(4);
            }
            if (trw.getErrorMonitor() != null) {
                hqw errorMonitor = trw.getErrorMonitor();
                if (url == null) {
                    url = str2;
                }
                errorMonitor.didOccurNativeError(url, i, str);
            }
            WebViewClient webViewClient = this.extraWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            }
        }
    }
}
