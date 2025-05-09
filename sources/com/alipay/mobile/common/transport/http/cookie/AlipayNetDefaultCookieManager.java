package com.alipay.mobile.common.transport.http.cookie;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayNetDefaultCookieManager implements IAlipayNetCookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static CookieManager f4091a;

    public static CookieManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("febbc41", new Object[0]);
        }
        CookieManager cookieManager = f4091a;
        if (cookieManager != null) {
            return cookieManager;
        }
        synchronized (AlipayNetDefaultCookieManager.class) {
            CookieManager cookieManager2 = f4091a;
            if (cookieManager2 != null) {
                return cookieManager2;
            }
            CookieManager instance = CookieManager.getInstance();
            f4091a = instance;
            return instance;
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            a().flush();
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        return a().getCookie(str);
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        return a().hasCookies();
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            a().removeAllCookie();
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
        } else {
            a().removeAllCookies(valueCallback);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            a().setAcceptCookie(z);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
        } else {
            a().setCookie(str, str2, valueCallback);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieManager
    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            a().setCookie(str, str2);
        }
    }
}
