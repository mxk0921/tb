package tb;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eqo {
    public static void a(WebSettings webSettings) {
        webSettings.setAllowContentAccess(false);
    }

    public static void b(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void c(WebSettings webSettings) {
        webSettings.setGeolocationEnabled(false);
    }

    public static void d(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public static void e(WebView webView) {
        WebSettings settings = webView.getSettings();
        b(settings);
        f(webView);
        c(settings);
        d(settings);
        a(settings);
    }

    public static void f(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }
}
