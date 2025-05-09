package com.alipay.mobile.common.transport.http.cookie;

import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayNetCookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AlipayNetCookieManager b;

    /* renamed from: a  reason: collision with root package name */
    public IAlipayNetCookieManager f4089a;

    public AlipayNetCookieManager() {
        this.f4089a = null;
        this.f4089a = new AlipayNetDefaultCookieManager();
    }

    public static AlipayNetCookieManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieManager) ipChange.ipc$dispatch("11505875", new Object[0]);
        }
        AlipayNetCookieManager alipayNetCookieManager = b;
        if (alipayNetCookieManager != null) {
            return alipayNetCookieManager;
        }
        synchronized (AlipayNetCookieManager.class) {
            try {
                AlipayNetCookieManager alipayNetCookieManager2 = b;
                if (alipayNetCookieManager2 != null) {
                    return alipayNetCookieManager2;
                }
                AlipayNetCookieManager alipayNetCookieManager3 = new AlipayNetCookieManager();
                b = alipayNetCookieManager3;
                return alipayNetCookieManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.f4089a.flush();
        }
    }

    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        return this.f4089a.getCookie(str);
    }

    public boolean hasCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        return this.f4089a.hasCookies();
    }

    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            this.f4089a.removeAllCookie();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed82aadf", new Object[]{this, valueCallback});
        } else {
            this.f4089a.removeAllCookies(valueCallback);
        }
    }

    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            this.f4089a.setAcceptCookie(z);
        }
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f92d587", new Object[]{this, str, str2, valueCallback});
        } else {
            this.f4089a.setCookie(str, str2, valueCallback);
        }
    }

    public synchronized void setCustomCookieManager(IAlipayNetCookieManager iAlipayNetCookieManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68164a5", new Object[]{this, iAlipayNetCookieManager});
            return;
        }
        if (iAlipayNetCookieManager != null) {
            this.f4089a = iAlipayNetCookieManager;
        }
    }

    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            this.f4089a.setCookie(str, str2);
        }
    }
}
