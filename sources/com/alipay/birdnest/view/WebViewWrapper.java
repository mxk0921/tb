package com.alipay.birdnest.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBWebView;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WebViewWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WebView f3838a;
    public View b;
    public String c = MspGlobalDefine.ALIPAYS_SCHEME;
    public final BirdNestEngine.UiWidgetProvider d;
    public final Map<String, String> e;

    public WebViewWrapper(BirdNestEngine.UiWidgetProvider uiWidgetProvider, Map<String, String> map) {
        this.d = uiWidgetProvider;
        this.e = map;
    }

    public void a(Context context, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, BirdNestEngine.UiWidgetProvider.CreateCallback createCallback) {
        IpChange ipChange = Platform.$ipChange;
        try {
            AssetManager assets = context.getResources().getAssets();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            try {
                Resources resources = context.getApplicationContext().getResources();
                declaredMethod.invoke(assets, context.createPackageContext(resources.getString(resources.getIdentifier("android:string/config_webViewPackageName", "string", "android")), 0).getApplicationInfo().sourceDir);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            FBLogger.e(WebViewWrapper.class.getName(), th);
        }
        WebView webView = new WebView(context);
        this.f3838a = webView;
        webView.setWebViewClient(new WebViewClient() { // from class: com.alipay.birdnest.view.WebViewWrapper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/birdnest/view/WebViewWrapper$2");
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c6488b44", new Object[]{this, webView2, str})).booleanValue();
                }
                webView2.loadUrl(str);
                return true;
            }
        });
        try {
            Method method = webView.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(webView, "searchBoxJavaBridge_");
                method.invoke(webView, "accessibility");
                method.invoke(webView, "accessibilityTraversal");
            }
        } catch (Exception unused2) {
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setScrollBarStyle(0);
        webView.setScrollbarFadingEnabled(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.alipay.birdnest.view.WebViewWrapper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/birdnest/view/WebViewWrapper$3");
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c6488b44", new Object[]{this, webView2, str})).booleanValue();
                }
                webView2.loadUrl(str);
                return true;
            }
        });
        ((FBWebView.AnonymousClass1) createCallback).onSuccess(this.f3838a, null);
    }
}
