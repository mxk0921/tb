package com.taobao.android.weex_plugin.component.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_plugin.component.webview.a;
import com.taobao.tao.Globals;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.w4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXWebView implements com.taobao.android.weex_plugin.component.webview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int k = Build.VERSION.SDK_INT;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9996a;
    public final String b;
    public AliWVUCWebView c;
    public ProgressBar d;
    public Handler e;
    public final ArrayList<String> f = new ArrayList<>();
    public a.AbstractC0520a g;
    public a.c h;
    public a.b i;
    public final boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class AliWVUCWebView extends WVUCWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public a onScrollChangeListener;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public interface a {
        }

        public AliWVUCWebView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(AliWVUCWebView aliWVUCWebView, String str, Object... objArr) {
            if (str.hashCode() == -173536977) {
                super.OnScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/webview/WXWebView$AliWVUCWebView");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebView
        public void OnScrollChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5a8092f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                super.OnScrollChanged(i, i2, i3, i4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1262473342:
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                case -332805219:
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                case 534767588:
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                case 1373550412:
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/webview/WXWebView$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (WXWebView.d(WXWebView.this) != null) {
                WXWebView.d(WXWebView.this).onPageFinish(str, webView.canGoBack(), webView.canGoForward());
            }
            if (WXWebView.f(WXWebView.this) != null) {
                WXWebView wXWebView = WXWebView.this;
                StringBuilder sb = new StringBuilder("javascript:(window.postMessage = function(message, targetOrigin) {if (message == null || !targetOrigin) return;");
                if (WXWebView.g()) {
                    str2 = "prompt('__WEEX_WEB_VIEW_BRIDGE://postMessage?message=' + JSON.stringify(message) + '&targetOrigin=' + targetOrigin)";
                } else {
                    str2 = "__WEEX_WEB_VIEW_BRIDGE.postMessage(JSON.stringify(message), targetOrigin);";
                }
                sb.append(str2);
                sb.append("})");
                WXWebView.h(wXWebView, sb.toString());
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            if (WXWebView.d(WXWebView.this) != null) {
                WXWebView.d(WXWebView.this).onPageStart(str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            if (WXWebView.i(WXWebView.this) != null) {
                WXWebView.i(WXWebView.this).onError("error", "page error");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (WXWebView.i(WXWebView.this) != null) {
                WXWebView.i(WXWebView.this).onError("error", "ssl error");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            if (str == null || ((WXWebView.j(WXWebView.this) != null && WXWebView.j(WXWebView.this).contains(str)) || str.contains(WXWebView.k()) || !WXWebView.l(WXWebView.this) || this.mContext.get() == null)) {
                return false;
            }
            WXWebView.this.s(this.mContext.get(), str);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == -1540056808) {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == 220271772) {
                return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_plugin/component/webview/WXWebView$2");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                return;
            }
            super.onProgressChanged(webView, i);
            WXWebView wXWebView = WXWebView.this;
            if (i == 100) {
                z = false;
            }
            WXWebView.m(wXWebView, z);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            super.onReceivedTitle(webView, str);
            if (WXWebView.d(WXWebView.this) != null) {
                WXWebView.d(WXWebView.this).onReceivedTitle(webView.getTitle());
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            Uri parse = Uri.parse(str2);
            if (!TextUtils.equals(parse.getScheme(), "__WEEX_WEB_VIEW_BRIDGE")) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            if (TextUtils.equals(parse.getAuthority(), "postMessage")) {
                WXWebView.e(WXWebView.this, parse.getQueryParameter("message"), parse.getQueryParameter("targetOrigin"));
                jsPromptResult.confirm("success");
            } else {
                jsPromptResult.confirm("fail");
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @JavascriptInterface
        @com.uc.webview.export.JavascriptInterface
        public void postMessage(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb9c3a62", new Object[]{this, str, str2});
            } else {
                WXWebView.e(WXWebView.this, str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<WXWebView> f9999a;

        public /* synthetic */ d(WXWebView wXWebView, a aVar) {
            this(wXWebView);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/webview/WXWebView$MessageHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 1 && this.f9999a.get() != null && WXWebView.f(this.f9999a.get()) != null) {
                WXWebView.f(this.f9999a.get()).onMessage((Map) message.obj);
            }
        }

        public d(WXWebView wXWebView) {
            this.f9999a = new WeakReference<>(wXWebView);
        }
    }

    public WXWebView(Context context, String str) {
        this.j = true;
        this.f9996a = context;
        this.b = str;
        this.j = w4x.s("web_fix_overwriting_url", true, true);
    }

    public static /* synthetic */ a.c d(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("890503c0", new Object[]{wXWebView});
        }
        return wXWebView.h;
    }

    public static /* synthetic */ void e(WXWebView wXWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10c0eca", new Object[]{wXWebView, str, str2});
        } else {
            wXWebView.r(str, str2);
        }
    }

    public static /* synthetic */ a.b f(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("c19f5379", new Object[]{wXWebView});
        }
        return wXWebView.i;
    }

    public static /* synthetic */ boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void h(WXWebView wXWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4c2415", new Object[]{wXWebView, str});
        } else {
            wXWebView.n(str);
        }
    }

    public static /* synthetic */ a.AbstractC0520a i(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.AbstractC0520a) ipChange.ipc$dispatch("1952305b", new Object[]{wXWebView});
        }
        return wXWebView.g;
    }

    public static /* synthetic */ ArrayList j(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8daa99e7", new Object[]{wXWebView});
        }
        return wXWebView.f;
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("542dd222", new Object[0]);
        }
        return "forceWx=true";
    }

    public static /* synthetic */ boolean l(WXWebView wXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1ae7613", new Object[]{wXWebView})).booleanValue();
        }
        return wXWebView.j;
    }

    public static /* synthetic */ void m(WXWebView wXWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08efb04", new Object[]{wXWebView, new Boolean(z)});
        } else {
            wXWebView.t(z);
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6a011f", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void b(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0145d", new Object[]{this, cVar});
        } else {
            this.h = cVar;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void c(a.AbstractC0520a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed0921d", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (p() != null) {
            p().destroy();
            this.c = null;
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else if (p() != null) {
            p().goBack();
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void goForward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a026c4", new Object[]{this});
        } else if (p() != null) {
            p().goForward();
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void loadDataWithBaseURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c7d1f9", new Object[]{this, str});
        } else if (p() != null) {
            p().loadDataWithBaseURL(this.b, str, "text/html", "utf-8", null);
        }
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (p() != null) {
            p().loadUrl(str);
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa1e8b3", new Object[]{this, str});
        } else if (k < 19) {
            this.c.loadUrl(str);
        } else {
            this.c.evaluateJavascript(str, null);
        }
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.f9996a);
        frameLayout.setBackgroundColor(-1);
        this.c = new AliWVUCWebView(this.f9996a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.c.setLayoutParams(layoutParams);
        frameLayout.addView(this.c);
        q(this.c);
        this.d = new ProgressBar(this.f9996a);
        t(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        this.d.setLayoutParams(layoutParams2);
        layoutParams2.gravity = 17;
        frameLayout.addView(this.d);
        this.e = new d(this, null);
        return frameLayout;
    }

    public final AliWVUCWebView p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliWVUCWebView) ipChange.ipc$dispatch("7a686588", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void postMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
        } else if (p() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) "message");
                jSONObject.put("data", obj);
                jSONObject.put(TriggerChannelService.EXTRA_ORIGIN, (Object) this.b);
                n("javascript:(function () {var initData = " + jSONObject.toString() + ";try {var event = new MessageEvent('message', initData);window.dispatchEvent(event);} catch (e) {}})();");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void q(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1570c351", new Object[]{this, wVUCWebView});
            return;
        }
        WebSettings settings = wVUCWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        wVUCWebView.setWebViewClient(new a(this.f9996a));
        wVUCWebView.setWebChromeClient(new b());
        wVUCWebView.addJavascriptInterface(new c(), "__WEEX_WEB_VIEW_BRIDGE");
    }

    @Override // com.taobao.android.weex_plugin.component.webview.a
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else if (p() != null) {
            p().reload();
        }
    }

    public void s(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f353ab46", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str) && !Nav.from(Globals.getApplication()).toUri(str.trim())) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }

    public final void t(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cf0564", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.d;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    public final void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49fb43", new Object[]{this, str, str2});
        } else if (str != null && str2 != null && this.i != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("data", JSON.parse(str));
                hashMap.put(TriggerChannelService.EXTRA_ORIGIN, str2);
                hashMap.put("type", "message");
                Message message = new Message();
                message.what = 1;
                message.obj = hashMap;
                this.e.sendMessage(message);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
