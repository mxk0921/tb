package com.alipay.mobile.common.transport.http;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EmptyAndroidCookieManager extends CookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EmptyAndroidCookieManager f4075a;

    private EmptyAndroidCookieManager() {
    }

    public static CookieManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("573147d7", new Object[0]);
        }
        EmptyAndroidCookieManager emptyAndroidCookieManager = f4075a;
        if (emptyAndroidCookieManager != null) {
            return emptyAndroidCookieManager;
        }
        synchronized (EmptyAndroidCookieManager.class) {
            try {
                EmptyAndroidCookieManager emptyAndroidCookieManager2 = f4075a;
                if (emptyAndroidCookieManager2 != null) {
                    return emptyAndroidCookieManager2;
                }
                EmptyAndroidCookieManager emptyAndroidCookieManager3 = new EmptyAndroidCookieManager();
                f4075a = emptyAndroidCookieManager3;
                return emptyAndroidCookieManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(EmptyAndroidCookieManager emptyAndroidCookieManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/EmptyAndroidCookieManager");
    }

    @Override // android.webkit.CookieManager
    public boolean acceptCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9882a417", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.webkit.CookieManager
    public boolean acceptThirdPartyCookies(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10d37d6", new Object[]{this, webView})).booleanValue();
        }
        return false;
    }

    @Override // android.webkit.CookieManager
    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        }
    }

    @Override // android.webkit.CookieManager
    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        return null;
    }

    @Override // android.webkit.CookieManager
    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.webkit.CookieManager
    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        }
    }

    @Override // android.webkit.CookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
        }
    }

    @Override // android.webkit.CookieManager
    public void removeExpiredCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b435cc", new Object[]{this});
        }
    }

    @Override // android.webkit.CookieManager
    public void removeSessionCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab37fd", new Object[]{this});
        }
    }

    @Override // android.webkit.CookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a4878a", new Object[]{this, valueCallback});
        }
    }

    @Override // android.webkit.CookieManager
    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // android.webkit.CookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dad8c4", new Object[]{this, webView, new Boolean(z)});
        }
    }

    @Override // android.webkit.CookieManager
    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        }
    }

    @Override // android.webkit.CookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
        }
    }
}
