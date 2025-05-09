package com.taobao.taolivecontainer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import tb.nkr;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WVUCWebViewProxy extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nkr b;
    public WebViewClient c;

    static {
        t2o.a(1027604490);
    }

    public WVUCWebViewProxy(Context context, nkr nkrVar) {
        super(context);
        this.b = nkrVar;
    }

    public static /* synthetic */ Object ipc$super(WVUCWebViewProxy wVUCWebViewProxy, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1262473342:
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            case 1373550412:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivecontainer/WVUCWebViewProxy");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
    }

    public void b(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbf50a4", new Object[]{this, webViewClient});
        } else {
            this.c = webViewClient;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        WebViewClient webViewClient = this.c;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        WebViewClient webViewClient = this.c;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        WebViewClient webViewClient = this.c;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        if (hitTestResult != null) {
            i = hitTestResult.getType();
        } else {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        try {
            return Nav.from(this.mContext.get()).toUri(str);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, final String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        nkr nkrVar = this.b;
        if (nkrVar != null && nkrVar.k.e()) {
            v7t.d("WVUCWebViewProxy", "开始注入window._tl_x_prerender " + str);
            webView.evaluateJavascript(";window._tl_x_prerender=true;\nconsole.log(\"注入_tx_x_prerender\"+window._tl_x_prerender);", new ValueCallback<String>() { // from class: com.taobao.taolivecontainer.WVUCWebViewProxy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                        return;
                    }
                    v7t.d("WVUCWebViewProxy", "注入window._tl_x_prerender " + str);
                }
            });
        }
        nkr nkrVar2 = this.b;
        if (!(nkrVar2 == null || nkrVar2.e() == null)) {
            for (String str2 : this.b.e()) {
                webView.evaluateJavascript(str2, new ValueCallback<String>() { // from class: com.taobao.taolivecontainer.WVUCWebViewProxy.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onReceiveValue(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                            return;
                        }
                        v7t.d("WVUCWebViewProxy", "js 注入" + str3);
                    }
                });
            }
        }
        WebViewClient webViewClient = this.c;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }
}
