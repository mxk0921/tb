package com.alibaba.android.patronus.simplecookie;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.adk;
import tb.gxp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CookieManagerAdapter extends CookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private gxp mCookieManager = gxp.k();

    public static /* synthetic */ Object ipc$super(CookieManagerAdapter cookieManagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/patronus/simplecookie/CookieManagerAdapter");
    }

    @Override // android.webkit.CookieManager
    public boolean acceptCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9882a417", new Object[]{this})).booleanValue();
        }
        return this.mCookieManager.a();
    }

    @Override // android.webkit.CookieManager
    public boolean acceptThirdPartyCookies(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10d37d6", new Object[]{this, webView})).booleanValue();
        }
        try {
            return ((Boolean) adk.i(webView.getSettings()).d("getAcceptThirdPartyCookies").h()).booleanValue();
        } catch (Throwable th) {
            Log.wtf("CookieManagerAdapter", th);
            return false;
        }
    }

    @Override // android.webkit.CookieManager
    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.mCookieManager.f();
        }
    }

    @Override // android.webkit.CookieManager
    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        return this.mCookieManager.h(str);
    }

    @Override // android.webkit.CookieManager
    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        return this.mCookieManager.m();
    }

    @Override // android.webkit.CookieManager
    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            this.mCookieManager.o();
        }
    }

    @Override // android.webkit.CookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
            return;
        }
        this.mCookieManager.o();
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Boolean.TRUE);
        }
    }

    @Override // android.webkit.CookieManager
    public void removeExpiredCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b435cc", new Object[]{this});
        } else {
            this.mCookieManager.p();
        }
    }

    @Override // android.webkit.CookieManager
    public void removeSessionCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab37fd", new Object[]{this});
        } else {
            this.mCookieManager.q();
        }
    }

    @Override // android.webkit.CookieManager
    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a4878a", new Object[]{this, valueCallback});
            return;
        }
        this.mCookieManager.q();
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Boolean.TRUE);
        }
    }

    @Override // android.webkit.CookieManager
    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            this.mCookieManager.r(z);
        }
    }

    @Override // android.webkit.CookieManager
    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            this.mCookieManager.s(str, str2);
        }
    }

    @Override // android.webkit.CookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
            return;
        }
        this.mCookieManager.s(str, str2);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(Boolean.TRUE);
        }
    }

    @Override // android.webkit.CookieManager
    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dad8c4", new Object[]{this, webView, new Boolean(z)});
            return;
        }
        try {
            adk.i(webView.getSettings()).e("setAcceptThirdPartyCookies", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            Log.wtf("CookieManagerAdapter", th);
        }
    }
}
