package com.taobao.themis.inside.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.ed7;
import tb.fu;
import tb.kab;
import tb.mes;
import tb.n4d;
import tb.p8s;
import tb.q9s;
import tb.rbe;
import tb.t2o;
import tb.tsq;
import tb.vbe;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultWebAdapter;", "Lcom/taobao/themis/web/runtime/IWebAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Lcom/uc/webview/export/WebView;", "webview", "Ltb/xhv;", "onPageStarted", "(Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/uc/webview/export/WebView;)V", "", "url", "", "shouldOverrideUrlLoading", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)Z", "Lcom/uc/webview/export/WebResourceRequest;", "webResourceRequest", "(Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/uc/webview/export/WebResourceRequest;)Z", "request", "Lcom/uc/webview/export/WebResourceResponse;", "shouldInterceptRequest", "(Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/uc/webview/export/WebResourceRequest;)Lcom/uc/webview/export/WebResourceResponse;", "userAgent", "getUserAgent", "(Ljava/lang/String;)Ljava/lang/String;", "registerPlugins", "Lcom/uc/webview/export/WebChromeClient;", "getWebChromeClient", "(Lcom/taobao/themis/kernel/page/ITMSPage;)Lcom/uc/webview/export/WebChromeClient;", "Ltb/vbe;", "a", "Ltb/vbe;", "getGlobalUrlInterceptor", "()Ltb/vbe;", "globalUrlInterceptor", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultWebAdapter implements IWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vbe f13522a = new a();

    static {
        t2o.a(837812259);
        t2o.a(850395163);
    }

    public final vbe getGlobalUrlInterceptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vbe) ipChange.ipc$dispatch("d0c2055", new Object[]{this});
        }
        return this.f13522a;
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public String getUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e170aa6b", new Object[]{this, str});
        }
        ckf.g(str, "userAgent");
        return str;
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public WebChromeClient getWebChromeClient(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebChromeClient) ipChange.ipc$dispatch("d6fc9c5f", new Object[]{this, iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        return new mes(iTMSPage);
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public void onPageStarted(ITMSPage iTMSPage, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308426b5", new Object[]{this, iTMSPage, webView});
            return;
        }
        ckf.g(iTMSPage, "page");
        ckf.g(webView, "webview");
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public WebResourceResponse shouldInterceptRequest(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("cb886102", new Object[]{this, iTMSPage, webResourceRequest});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(webResourceRequest, "request");
        rbe rbeVar = (rbe) iTMSPage.getExtension(rbe.class);
        if (rbeVar == null) {
            return null;
        }
        return rbeVar.t(webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(ITMSPage iTMSPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edbe04c", new Object[]{this, iTMSPage, str})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ckf.g(str, "url");
        kab kabVar = (kab) iTMSPage.getExtension(kab.class);
        if (kabVar != null) {
            kabVar.H();
        }
        rbe rbeVar = (rbe) iTMSPage.getExtension(rbe.class);
        fu F0 = rbeVar == null ? null : rbeVar.F0();
        Activity I = iTMSPage.getInstance().I();
        ckf.f(I, "page.getInstance().activity");
        if (F0 == null || !((ed7.b.RunnableC0913b.C0914b) F0).a(I, str)) {
            return ((a) this.f13522a).a(I, str);
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements vbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0769a Companion = new C0769a(null);

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.inside.adapter.DefaultWebAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0769a {
            static {
                t2o.a(837812261);
            }

            public /* synthetic */ C0769a(a07 a07Var) {
                this();
            }

            public C0769a() {
            }
        }

        static {
            t2o.a(837812260);
            t2o.a(850395157);
        }

        @Override // tb.vbe
        public boolean a(Context context, String str) {
            Uri uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d724263", new Object[]{this, context, str})).booleanValue();
            }
            ckf.g(context, "context");
            ckf.g(str, "url");
            TMSLogger.f("GlobalUrlInterceptor", ckf.p("shouldOverrideUrlLoadingImpl ", str));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                uri = Uri.parse(str);
                try {
                    if (ckf.b("true", uri.getQueryParameter("hybrid"))) {
                        return false;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                uri = null;
            }
            if (Login.isLoginUrl(str) || Login.isLogoutUrl(str)) {
                return true;
            }
            if (tsq.x("http://www.taobao.com", str, true) || tsq.x("http://www.taobao.com/", str, true) || tsq.x("https://www.taobao.com", str, true) || tsq.x("https://www.taobao.com/", str, true) || tsq.x("www.taobao.com", str, true) || tsq.x("www.taobao.com/", str, true)) {
                if (q9s.D2()) {
                    INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
                    if (iNavigatorAdapter != null) {
                        INavigatorAdapter.b.a(iNavigatorAdapter, context, "http://m.taobao.com/index.htm", null, null, null, 28, null);
                    }
                } else {
                    Nav.from(context).toUri("http://m.taobao.com/index.htm");
                }
                return true;
            } else if (uri == null || ckf.b(uri.getScheme(), "http") || ckf.b(uri.getScheme(), "https") || !q9s.j1()) {
                return false;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("disallowLoopback", "true");
                hashMap.put("allowEscape", "true");
                INavigatorAdapter iNavigatorAdapter2 = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
                if (iNavigatorAdapter2 == null) {
                    return false;
                }
                String uri2 = uri.toString();
                ckf.f(uri2, "uri.toString()");
                return iNavigatorAdapter2.openURL(context, uri2, null, null, hashMap);
            }
        }
    }

    public final boolean a(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        Uri url;
        bbs instance;
        INavigatorAdapter iNavigatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a0fc71d", new Object[]{this, iTMSPage, webResourceRequest})).booleanValue();
        }
        if (!q9s.i1() || webResourceRequest.isRedirect() || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        String scheme = url.getScheme();
        if (!ckf.b(scheme, "http") && !ckf.b(scheme, "https")) {
            Activity activity = null;
            if (!(iTMSPage == null || (instance = iTMSPage.getInstance()) == null)) {
                activity = instance.I();
            }
            if (!(activity == null || (iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class)) == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("disallowLoopback", "true");
                hashMap.put("allowEscape", "true");
                String uri = url.toString();
                ckf.f(uri, "uri.toString()");
                return iNavigatorAdapter.openURL(activity, uri, null, null, hashMap);
            }
        }
        return false;
    }

    public final boolean b(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        Uri url;
        Activity I;
        INavigatorAdapter iNavigatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62cfe6b7", new Object[]{this, iTMSPage, webResourceRequest})).booleanValue();
        }
        if (!q9s.a3("themis_common_config", "enableNavWhenRedirect", Boolean.TRUE) || iTMSPage == null || (url = webResourceRequest.getUrl()) == null || (I = iTMSPage.getInstance().I()) == null || !webResourceRequest.isRedirect() || (iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class)) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("disallowLoopback", "true");
        String uri = url.toString();
        ckf.f(uri, "uri.toString()");
        boolean openURL = iNavigatorAdapter.openURL(I, uri, null, null, hashMap);
        if (openURL) {
            n4d n4dVar = (n4d) iTMSPage.getInstance().getExtension(n4d.class);
            if (n4dVar != null) {
                n4dVar.H();
            }
            iTMSPage.getInstance().W().f(true);
        }
        return openURL;
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public boolean shouldOverrideUrlLoading(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f3d12", new Object[]{this, iTMSPage, webResourceRequest})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ckf.g(webResourceRequest, "webResourceRequest");
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return false;
        }
        String uri = url.toString();
        ckf.f(uri, "url.toString()");
        if (!shouldOverrideUrlLoading(iTMSPage, uri) && !a(iTMSPage, webResourceRequest)) {
            return b(iTMSPage, webResourceRequest);
        }
        return true;
    }
}
