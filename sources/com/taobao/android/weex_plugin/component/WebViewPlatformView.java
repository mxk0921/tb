package com.taobao.android.weex_plugin.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.android.weex_plugin.component.webview.WXWebView;
import com.taobao.android.weex_plugin.component.webview.a;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WebViewPlatformView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mRootView;
    private com.taobao.android.weex_plugin.component.webview.a mWebView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.AbstractC0520a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.weex_plugin.component.webview.a.AbstractC0520a
        public void onError(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a4f5296", new Object[]{this, str, obj});
            } else {
                WebViewPlatformView.access$000(WebViewPlatformView.this, str, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.weex_plugin.component.webview.a.c
        public void onPageFinish(String str, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ed19512", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            jSONObject.put("canGoBack", (Object) Boolean.valueOf(z));
            jSONObject.put("canGoForward", (Object) Boolean.valueOf(z2));
            WebViewPlatformView.access$300(WebViewPlatformView.this, Constants.Event.PAGEFINISH, new JSONObject(jSONObject));
        }

        @Override // com.taobao.android.weex_plugin.component.webview.a.c
        public void onPageStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b123fb85", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            WebViewPlatformView.access$200(WebViewPlatformView.this, Constants.Event.PAGESTART, jSONObject);
        }

        @Override // com.taobao.android.weex_plugin.component.webview.a.c
        public void onReceivedTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("124d59e9", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", (Object) str);
            WebViewPlatformView.access$100(WebViewPlatformView.this, Constants.Event.RECEIVEDTITLE, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.weex_plugin.component.webview.a.b
        public void onMessage(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4cdeb5f6", new Object[]{this, map});
            } else {
                WebViewPlatformView.access$400(WebViewPlatformView.this, "message", new JSONObject(map));
            }
        }
    }

    public WebViewPlatformView(Context context, int i) {
        super(context, i);
        WXWebView wXWebView = new WXWebView(context, "");
        this.mWebView = wXWebView;
        this.mRootView = (FrameLayout) wXWebView.o();
        this.mWebView.c(new a());
        this.mWebView.b(new b());
        this.mWebView.a(new c());
    }

    public static /* synthetic */ void access$000(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ad5f9e", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$100(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3435029f", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$200(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bca5a0", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$300(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4448a1", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$400(WebViewPlatformView webViewPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecbeba2", new Object[]{webViewPlatformView, str, obj});
        } else {
            webViewPlatformView.fireEvent(str, obj);
        }
    }

    private com.taobao.android.weex_plugin.component.webview.a getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_plugin.component.webview.a) ipChange.ipc$dispatch("183f852", new Object[]{this});
        }
        return this.mWebView;
    }

    public static /* synthetic */ Object ipc$super(WebViewPlatformView webViewPlatformView, String str, Object... objArr) {
        if (str.hashCode() == 577536806) {
            super.dispose();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/WebViewPlatformView");
    }

    private void loadDataWithBaseURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c7d1f9", new Object[]{this, str});
        } else {
            getWebView().loadDataWithBaseURL(str);
        }
    }

    private void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            getWebView().loadUrl(str);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            com.taobao.android.weex_plugin.component.webview.a aVar = this.mWebView;
            if (aVar != null) {
                aVar.destroy();
            }
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mRootView;
    }

    @JSMethod
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else {
            getWebView().goBack();
        }
    }

    @JSMethod
    public void goForward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a026c4", new Object[]{this});
        } else {
            getWebView().goForward();
        }
    }

    @JSMethod
    public void postMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
        } else {
            getWebView().postMessage(obj);
        }
    }

    @JSMethod
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            getWebView().reload();
        }
    }

    @WXComponentProp(name = "src")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && getWebView() != null && !TextUtils.isEmpty(str)) {
            loadUrl(str);
        }
    }
}
