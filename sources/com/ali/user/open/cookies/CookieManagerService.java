package com.ali.user.open.cookies;

import com.ali.user.open.core.WebViewProxy;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.webview.DefaultWebViewProxy;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CookieManagerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private CookieManagerService() {
    }

    public static WebViewProxy getWebViewProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebViewProxy) ipChange.ipc$dispatch("17ce08fe", new Object[0]);
        }
        WebViewProxy webViewProxy = KernelContext.mWebViewProxy;
        if (webViewProxy != null) {
            return webViewProxy;
        }
        return DefaultWebViewProxy.getInstance();
    }
}
