package com.unionpay;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class ab extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f14529a;

    private ab(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.f14529a = webViewJavascriptBridge;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.cancel();
        Toast.makeText(this.f14529a.mContext, str2, 0).show();
        return true;
    }

    public /* synthetic */ ab(WebViewJavascriptBridge webViewJavascriptBridge, byte b) {
        this(webViewJavascriptBridge);
    }
}
