package com.ali.user.open.core.webview;

import android.webkit.CookieManager;
import com.ali.user.open.core.WebViewProxy;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DefaultWebViewProxy implements WebViewProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DefaultWebViewProxy instance = null;

    static {
        t2o.a(71303273);
        t2o.a(71303173);
    }

    private DefaultWebViewProxy() {
    }

    public static DefaultWebViewProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultWebViewProxy) ipChange.ipc$dispatch("1e021be3", new Object[0]);
        }
        if (instance == null) {
            synchronized (DefaultWebViewProxy.class) {
                try {
                    if (instance == null) {
                        instance = new DefaultWebViewProxy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable unused) {
        }
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public String getCookie(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        CookieManager instance2 = CookieManager.getInstance();
        instance2.setAcceptCookie(true);
        return instance2.getCookie(".taobao.com");
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void removeAllCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void removeExpiredCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b435cc", new Object[]{this});
        } else {
            CookieManager.getInstance().removeExpiredCookie();
        }
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void removeSessionCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab37fd", new Object[]{this});
        } else {
            CookieManager.getInstance().removeSessionCookie();
        }
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void setAcceptCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            CookieManager.getInstance().setAcceptCookie(z);
        }
    }

    @Override // com.ali.user.open.core.WebViewProxy
    public void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
        } else {
            CookieManager.getInstance().setCookie(str, str2);
        }
    }
}
