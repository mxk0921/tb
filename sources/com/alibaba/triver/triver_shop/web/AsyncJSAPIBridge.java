package com.alibaba.triver.triver_shop.web;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.AsyncJavascriptInterface;
import com.uc.webview.export.JavascriptInterface;
import com.uc.webview.export.extension.JSInterface;
import java.io.Serializable;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AsyncJSAPIBridge extends JSInterface implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ShopBaseWebView webView;

    static {
        t2o.a(766510475);
    }

    public AsyncJSAPIBridge(ShopBaseWebView shopBaseWebView) {
        ckf.g(shopBaseWebView, "webView");
        this.webView = shopBaseWebView;
    }

    public static /* synthetic */ Object ipc$super(AsyncJSAPIBridge asyncJSAPIBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/web/AsyncJSAPIBridge");
    }

    private final void sendJSResult(String str, JSInterface.JSRoute jSRoute, boolean z, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319c253a", new Object[]{this, str, jSRoute, new Boolean(z), str2, str3, str4});
            return;
        }
        if (z) {
            str5 = "true";
        } else {
            str5 = "false";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        jSRoute.send(new String[]{str5, str2, str3, str4, str}, null);
    }

    public static /* synthetic */ void sendJSResult$default(AsyncJSAPIBridge asyncJSAPIBridge, String str, JSInterface.JSRoute jSRoute, boolean z, String str2, String str3, String str4, int i, Object obj) {
        boolean z2;
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6599390c", new Object[]{asyncJSAPIBridge, str, jSRoute, new Boolean(z), str2, str3, str4, new Integer(i), obj});
            return;
        }
        if ((4 & i) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((8 & i) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i & 32) != 0) {
            str7 = "";
        } else {
            str7 = str4;
        }
        asyncJSAPIBridge.sendJSResult(str, jSRoute, z2, str5, str6, str7);
    }

    public final ShopBaseWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopBaseWebView) ipChange.ipc$dispatch("463804cc", new Object[]{this});
        }
        return this.webView;
    }

    @AsyncJavascriptInterface
    @JavascriptInterface
    public final void invokeNativeMethod(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f9221f", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.webView.setApiCallByAsyncBridge(true);
        this.webView.apiCall(new AsyncJSAPIBridge$invokeNativeMethod$1(this, str, str2, str3, str4, getJSRoute()));
    }
}
