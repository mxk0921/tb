package com.ali.user.open.core.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MemberWebView extends WebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = MemberWebView.class.getSimpleName();
    private String appCacheDir;
    private Map<String, Object> nameToObj = new HashMap();

    static {
        t2o.a(71303283);
    }

    public MemberWebView(Context context) {
        super(context);
        initSettings(context);
    }

    public static /* synthetic */ Object ipc$super(MemberWebView memberWebView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/MemberWebView");
    }

    public final void addBridgeObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4583696", new Object[]{this, str, obj});
        } else {
            this.nameToObj.put(str, obj);
        }
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        }
    }

    public Object getBridgeObj(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2371ffc9", new Object[]{this, str});
        }
        return this.nameToObj.get(str);
    }

    private void initSettings(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667bacae", new Object[]{this, context});
            return;
        }
        WebSettings settings = getSettings();
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception unused) {
        }
        settings.setSavePassword(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSupportZoom(false);
        settings.setSaveFormData(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        this.appCacheDir = context.getApplicationContext().getDir("cache", 0).getPath();
        settings.setAllowFileAccess(true);
        if (CommonUtils.isNetworkAvailable(context)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setBuiltInZoomControls(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebView.setWebContentsDebuggingEnabled(SDKLogger.isDebugEnabled());
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            settings.setMixedContentMode(0);
        } catch (Throwable unused2) {
        }
        final IWebViewClient iWebViewClient = (IWebViewClient) context;
        setWebViewClient(new BaseWebViewClient() { // from class: com.ali.user.open.core.webview.MemberWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -827498937) {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                } else if (hashCode == 1835642644) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/open/core/webview/MemberWebView$1");
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                iWebViewClient.onPageFinished(str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cead5e47", new Object[]{this, webView, str, bitmap});
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                iWebViewClient.onPageStarted(str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c6488b44", new Object[]{this, webView, str})).booleanValue();
                }
                return iWebViewClient.shouldOverrideUrlLoading(str);
            }
        });
        setWebChromeClient(new BridgeWebChromeClient() { // from class: com.ali.user.open.core.webview.MemberWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -650605876) {
                    super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/MemberWebView$2");
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9388acc", new Object[]{this, webView, str});
                    return;
                }
                super.onReceivedTitle(webView, str);
                iWebViewClient.onReceivedTitle(str);
            }
        });
        setDownloadListener(new UccDownloadListener(context));
    }

    public MemberWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initSettings(context);
    }
}
