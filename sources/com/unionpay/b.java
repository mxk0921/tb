package com.unionpay;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14531a;
    final /* synthetic */ WebViewJavascriptBridge b;

    public b(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.b = webViewJavascriptBridge;
        this.f14531a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.mWebView.loadUrl(this.f14531a);
    }
}
