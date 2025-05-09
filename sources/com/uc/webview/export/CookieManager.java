package com.uc.webview.export;

import android.webkit.ValueCallback;
import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.ICookieManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CookieManager {
    private static HashMap<Integer, CookieManager> sInstances;
    private ICookieManager mCookieManager;

    private CookieManager(ICookieManager iCookieManager) {
        this.mCookieManager = iCookieManager;
    }

    public static boolean allowFileSchemeCookies() {
        return getInstance().allowFileSchemeCookiesImpl();
    }

    private boolean allowFileSchemeCookiesImpl() {
        return this.mCookieManager.allowFileSchemeCookiesImpl();
    }

    public static CookieManager getInstance() {
        return getInstance(e.a());
    }

    public static void setAcceptFileSchemeCookies(boolean z) {
        getInstance().setAcceptFileSchemeCookiesImpl(z);
    }

    private void setAcceptFileSchemeCookiesImpl(boolean z) {
        this.mCookieManager.setAcceptFileSchemeCookiesImpl(z);
    }

    public boolean acceptCookie() {
        return this.mCookieManager.acceptCookie();
    }

    public boolean acceptThirdPartyCookies(WebView webView) {
        return this.mCookieManager.acceptThirdPartyCookies(webView);
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public void flush() {
        this.mCookieManager.flush();
    }

    public String getCookie(String str) {
        return this.mCookieManager.getCookie(str);
    }

    public void getCookiesCount(ValueCallback<Integer> valueCallback) {
        if (valueCallback != null) {
            this.mCookieManager.getCookiesCount(valueCallback);
        }
    }

    public boolean hasCookies() {
        return this.mCookieManager.hasCookies();
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeAllCookies(valueCallback);
    }

    public void removeCookiesForDomains(String[] strArr, ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeCookiesForDomains(strArr, valueCallback);
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeSessionCookies(valueCallback);
    }

    public void setAcceptCookie(boolean z) {
        this.mCookieManager.setAcceptCookie(z);
    }

    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        this.mCookieManager.setAcceptThirdPartyCookies(webView, z);
    }

    public void setCookie(String str, String str2) {
        this.mCookieManager.setCookie(str, str2);
    }

    public String toString() {
        return "CookieManager@" + hashCode() + "[" + this.mCookieManager + "]";
    }

    public static CookieManager getInstance(WebView webView) {
        return getInstance(webView.getCurrentViewCoreType());
    }

    public void getCookie(String str, ValueCallback<String> valueCallback) {
        if (valueCallback != null) {
            this.mCookieManager.getCookie(str, valueCallback);
        }
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.setCookie(str, str2, valueCallback);
    }

    private static synchronized CookieManager getInstance(int i) throws RuntimeException {
        CookieManager cookieManager;
        synchronized (CookieManager.class) {
            try {
                if (sInstances == null) {
                    sInstances = new HashMap<>();
                }
                cookieManager = sInstances.get(Integer.valueOf(i));
                if (cookieManager == null) {
                    cookieManager = new CookieManager(b.a(i));
                    sInstances.put(Integer.valueOf(i), cookieManager);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cookieManager;
    }
}
