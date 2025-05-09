package com.taobao.browser.webview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.text.TextUtils;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.orange.OrangeConfig;
import tb.ejh;
import tb.im2;
import tb.n7r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserCommonWebViewClient extends WVWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserCommonWebViewClient";
    private WVWebView mWebView = null;
    private ejh mHelper = null;

    static {
        t2o.a(619708670);
    }

    public BrowserCommonWebViewClient(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(BrowserCommonWebViewClient browserCommonWebViewClient, String str, Object... objArr) {
        if (str.hashCode() == -968324284) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/webview/BrowserCommonWebViewClient");
    }

    @Deprecated
    public final boolean isIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb1822a", new Object[]{this, str, strArr})).booleanValue();
        }
        return im2.b(str, strArr);
    }

    @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
        }
        this.mWebView = (WVWebView) webView;
        if (!checkLoginIntercept(str) && !super.shouldOverrideUrlLoading(webView, str)) {
            return false;
        }
        return true;
    }

    public boolean checkLoginIntercept(String str) {
        WVWebView wVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c7ce56", new Object[]{this, str})).booleanValue();
        }
        if (n7r.b(str)) {
            ejh ejhVar = new ejh();
            this.mHelper = ejhVar;
            ejhVar.f18616a = str;
            Bundle bundle = new Bundle();
            if (this.mContext == null || (wVWebView = this.mWebView) == null) {
                return false;
            }
            String url = wVWebView.getUrl();
            if (TextUtils.isEmpty(url)) {
                new StringBuilder("weburl1:").append(url);
                url = this.mHelper.c("");
                new StringBuilder("weburl2:").append(url);
            }
            bundle.putString(LoginConstants.BROWSER_REF_URL, url);
            String config = OrangeConfig.getInstance().getConfig("WindVane", "enable_refresh_cookies", "true");
            if (config != null && "true".equals(config)) {
                bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
            }
            LoginBroadcastReceiver.a((Activity) this.mContext, this.mWebView, this.mHelper, 102);
            Login.login(true, bundle);
            return true;
        } else if (!Login.isLogoutUrl(str)) {
            return false;
        } else {
            ejh ejhVar2 = new ejh();
            this.mHelper = ejhVar2;
            ejhVar2.f18616a = str;
            LoginBroadcastReceiver.a((Activity) this.mContext, this.mWebView, ejhVar2, 103);
            Login.logout(false);
            return true;
        }
    }
}
