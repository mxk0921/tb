package com.uc.webview.export;

import android.content.Context;
import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IWebViewDatabase;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebViewDatabase {
    private static HashMap<Integer, WebViewDatabase> sInstances;
    private IWebViewDatabase mWebViewDatabase;

    private WebViewDatabase(IWebViewDatabase iWebViewDatabase) {
        this.mWebViewDatabase = iWebViewDatabase;
    }

    public static WebViewDatabase getInstance(Context context) throws RuntimeException {
        return getInstance(context, e.a());
    }

    public void clearFormData() {
        this.mWebViewDatabase.clearFormData();
    }

    public void clearHttpAuthUsernamePassword() {
        this.mWebViewDatabase.clearHttpAuthUsernamePassword();
    }

    @Deprecated
    public void clearUsernamePassword() {
        this.mWebViewDatabase.clearUsernamePassword();
    }

    public boolean hasFormData() {
        return this.mWebViewDatabase.hasFormData();
    }

    public boolean hasHttpAuthUsernamePassword() {
        return this.mWebViewDatabase.hasHttpAuthUsernamePassword();
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        return this.mWebViewDatabase.hasUsernamePassword();
    }

    public static WebViewDatabase getInstance(Context context, WebView webView) throws RuntimeException {
        return getInstance(context, webView.getCurrentViewCoreType());
    }

    private static synchronized WebViewDatabase getInstance(Context context, int i) throws RuntimeException {
        synchronized (WebViewDatabase.class) {
            try {
                if (sInstances == null) {
                    sInstances = new HashMap<>();
                }
                WebViewDatabase webViewDatabase = sInstances.get(Integer.valueOf(i));
                if (webViewDatabase == null) {
                    IWebViewDatabase a2 = b.a(context, i);
                    if (a2 == null) {
                        return null;
                    }
                    webViewDatabase = new WebViewDatabase(a2);
                    sInstances.put(Integer.valueOf(i), webViewDatabase);
                }
                return webViewDatabase;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
