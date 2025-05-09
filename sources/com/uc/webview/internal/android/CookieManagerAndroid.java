package com.uc.webview.internal.android;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.interfaces.ICookieManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CookieManagerAndroid implements ICookieManager {
    private CookieManager mCookieManager = getSystemCookieManager();

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized boolean acceptCookie() {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager == null) {
            return false;
        }
        return cookieManager.acceptCookie();
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public boolean acceptThirdPartyCookies(WebView webView) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            return cookieManager.acceptThirdPartyCookies((android.webkit.WebView) webView.getCoreView());
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public boolean allowFileSchemeCookiesImpl() {
        if (this.mCookieManager != null) {
            return CookieManager.allowFileSchemeCookies();
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void flush() {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.flush();
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized String getCookie(String str) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie(str);
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void getCookiesCount(ValueCallback<Integer> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(-1);
        }
    }

    public CookieManager getSystemCookieManager() {
        try {
            return CookieManager.getInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized boolean hasCookies() {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager == null) {
            return false;
        }
        return cookieManager.hasCookies();
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.removeAllCookies(valueCallback);
        } else {
            cookieManager.removeAllCookie();
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeCookiesForDomains(String[] strArr, ValueCallback<Boolean> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Boolean.FALSE);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.removeSessionCookies(valueCallback);
        } else {
            cookieManager.removeSessionCookie();
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public synchronized void setAcceptCookie(boolean z) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.setAcceptCookie(z);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setAcceptFileSchemeCookiesImpl(boolean z) {
        if (this.mCookieManager != null) {
            CookieManager.setAcceptFileSchemeCookies(z);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.setAcceptThirdPartyCookies((android.webkit.WebView) webView.getCoreView(), z);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setCookie(String str, String str2) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = this.mCookieManager;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2, valueCallback);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICookieManager
    public void getCookie(String str, ValueCallback<String> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(getCookie(str));
        }
    }
}
