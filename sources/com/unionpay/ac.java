package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ac extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f14530a;

    private ac(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.f14530a = webViewJavascriptBridge;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        new StringBuilder("shouldOverrideUrlLoading：").append(str);
        z = this.f14530a.mAllowScheme;
        if (z && !TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("HTTP")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f14530a.mContext.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public /* synthetic */ ac(WebViewJavascriptBridge webViewJavascriptBridge, byte b) {
        this(webViewJavascriptBridge);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
    }
}
