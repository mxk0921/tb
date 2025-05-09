package com.taobao.themis.web.runtime;

import android.app.Activity;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.ace;
import tb.bbs;
import tb.cc8;
import tb.cce;
import tb.ckf;
import tb.fu;
import tb.gaf;
import tb.i04;
import tb.izw;
import tb.jnd;
import tb.jzw;
import tb.kzw;
import tb.m3e;
import tb.rbe;
import tb.sbe;
import tb.t2o;
import tb.zsc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WebPageExtension implements rbe, jnd, gaf, zsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13790a;
    public fu b;
    public jzw c;
    public WVUCWebView d;
    public boolean e;
    public kzw f;
    public final List<sbe> g = new ArrayList();
    public final List<String> h = new ArrayList();
    public ace.a i;
    public b j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(850395183);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements m3e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WVUCWebView f13791a;
        public izw b;

        static {
            t2o.a(850395184);
            t2o.a(850395153);
        }

        public b(WVUCWebView wVUCWebView) {
            ckf.g(wVUCWebView, "mWebView");
            this.f13791a = wVUCWebView;
        }

        @Override // tb.m3e
        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("84483de3", new Object[]{this});
            }
            View coreView = this.f13791a.getCoreView();
            ckf.f(coreView, "mWebView.coreView");
            return coreView;
        }

        @Override // tb.m3e
        public void b(izw izwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbfbbf4a", new Object[]{this, izwVar});
                return;
            }
            ckf.g(izwVar, DataReceiveMonitor.CB_LISTENER);
            this.b = izwVar;
        }

        public final izw c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (izw) ipChange.ipc$dispatch("d5b8b371", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.m3e
        public int getContentHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
            }
            return this.f13791a.getContentHeight();
        }
    }

    static {
        t2o.a(850395182);
        t2o.a(850395164);
        t2o.a(839909687);
        t2o.a(839909660);
        t2o.a(839909622);
    }

    public WebPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13790a = iTMSPage;
    }

    public static final /* synthetic */ void a(WebPageExtension webPageExtension, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1244b751", new Object[]{webPageExtension, new Boolean(z)});
        } else {
            webPageExtension.e = z;
        }
    }

    @Override // tb.pbe
    public void E0(fu fuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cef85a", new Object[]{this, fuVar});
            return;
        }
        ckf.g(fuVar, "interceptor");
        this.b = fuVar;
    }

    @Override // tb.rbe
    public fu F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fu) ipChange.ipc$dispatch("67f58014", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            rbe.a.b(this, iTMSPage);
        }
    }

    @Override // tb.rbe
    public kzw I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kzw) ipChange.ipc$dispatch("6750c2fb", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.pbe
    public void M0(jzw jzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6ba36c", new Object[]{this, jzwVar});
            return;
        }
        ckf.g(jzwVar, DataReceiveMonitor.CB_LISTENER);
        this.c = jzwVar;
    }

    @Override // tb.rbe
    public cc8 U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cc8) ipChange.ipc$dispatch("ea2f1023", new Object[]{this});
        }
        return null;
    }

    @Override // tb.rbe
    public void W(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409923bc", new Object[]{this, wVUCWebView});
            return;
        }
        ckf.g(wVUCWebView, "webView");
        this.d = wVUCWebView;
        ace webViewContext = wVUCWebView.getWebViewContext();
        if (webViewContext != null) {
            webViewContext.setMegaHandler(this.i);
        }
        this.j = new b(wVUCWebView);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            rbe.a.c(this);
        }
    }

    @Override // tb.rbe
    public Map<String, Long> d1() {
        cce cceVar;
        WVWebViewPageModel wVWebViewPageModel;
        ace webViewContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8658c9e7", new Object[]{this});
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null || (webViewContext = wVUCWebView.getWebViewContext()) == null) {
            cceVar = null;
        } else {
            cceVar = webViewContext.getWebViewPageModel();
        }
        if (cceVar instanceof WVWebViewPageModel) {
            wVWebViewPageModel = (WVWebViewPageModel) cceVar;
        } else {
            wVWebViewPageModel = null;
        }
        if (wVWebViewPageModel == null) {
            return null;
        }
        return wVWebViewPageModel.getStageMap();
    }

    @Override // tb.pbe
    public m3e e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m3e) ipChange.ipc$dispatch("9e278838", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.pbe
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            return;
        }
        ckf.g(str, "script");
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            y(str);
            return;
        }
        ckf.d(wVUCWebView);
        wVUCWebView.evaluateJavascript(str, valueCallback);
    }

    public final ITMSPage f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f13790a;
    }

    @Override // tb.pbe
    public void f1(kzw kzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f82a9c4", new Object[]{this, kzwVar});
            return;
        }
        ckf.g(kzwVar, DataReceiveMonitor.CB_LISTENER);
        this.f = kzwVar;
    }

    @Override // tb.zsc
    public String getBusinessId() {
        ace webViewContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null || (webViewContext = wVUCWebView.getWebViewContext()) == null) {
            return null;
        }
        return webViewContext.getMegaBizId();
    }

    @Override // tb.rbe
    public jzw getGestureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzw) ipChange.ipc$dispatch("e7f52ca3", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.rbe
    public izw o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (izw) ipChange.ipc$dispatch("5ce172bd", new Object[]{this});
        }
        b bVar = this.j;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }

    @Override // tb.gaf
    public void requestFocus() {
        final View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null && !wVUCWebView.isDestroied() && (view = wVUCWebView.getView()) != null) {
            view.requestFocus();
            wVUCWebView.evaluateJavascript("(function() { return !!document.querySelector('[autofocus]'); })();", new ValueCallback() { // from class: com.taobao.themis.web.runtime.WebPageExtension$requestFocus$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public final void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    try {
                        bbs instance = WebPageExtension.this.f().getInstance();
                        if (ckf.b("true", str)) {
                            Activity I = instance.I();
                            ckf.f(I, "instance.activity");
                            TMSLogger.f("WebViewAutofocus", "Page contains an element with autofocus.");
                            Object systemService = I.getSystemService("input_method");
                            if (systemService != null) {
                                ((InputMethodManager) systemService).showSoftInput(view, 1);
                                WebPageExtension.a(WebPageExtension.this, true);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        }
                        TMSLogger.f("WebViewAutofocus", "No autofocus element on the page.");
                    } catch (Exception unused) {
                        TMSLogger.b("WebViewAutofocus", "WebViewAutofocus error");
                    }
                }
            });
        }
    }

    @Override // tb.jnd
    public void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.evaluateJavascript("window.scrollTo({top: 0, left: 0, behavior: 'smooth'});", null);
        }
    }

    @Override // tb.rbe
    public void setMegaHandler(ace.a aVar) {
        ace aceVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd7303", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "handler");
        this.i = aVar;
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            aceVar = null;
        } else {
            aceVar = wVUCWebView.getWebViewContext();
        }
        if (aceVar != null) {
            aceVar.setMegaHandler(aVar);
        }
    }

    @Override // tb.rbe
    public WebResourceResponse t(WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("86a721d7", new Object[]{this, webResourceRequest});
        }
        ckf.g(webResourceRequest, "request");
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            WebResourceResponse t = ((sbe) it.next()).t(webResourceRequest);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    @Override // tb.rbe
    public Map<String, Object> t0() {
        cce cceVar;
        WVWebViewPageModel wVWebViewPageModel;
        ace webViewContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("deb64b65", new Object[]{this});
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null || (webViewContext = wVUCWebView.getWebViewContext()) == null) {
            cceVar = null;
        } else {
            cceVar = webViewContext.getWebViewPageModel();
        }
        if (cceVar instanceof WVWebViewPageModel) {
            wVWebViewPageModel = (WVWebViewPageModel) cceVar;
        } else {
            wVWebViewPageModel = null;
        }
        if (wVWebViewPageModel == null) {
            return null;
        }
        return wVWebViewPageModel.getPropertyMap();
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            rbe.a.a(this);
        }
    }

    @Override // tb.rbe
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf072ac", new Object[]{this, str});
            return;
        }
        ckf.g(str, "script");
        ((ArrayList) this.h).add(str);
    }

    @Override // tb.rbe
    public void z(sbe sbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e795dc", new Object[]{this, sbeVar});
            return;
        }
        ckf.g(sbeVar, "interceptor");
        ((ArrayList) this.g).add(sbeVar);
    }

    @Override // tb.rbe
    public List<String> z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("533e406a", new Object[]{this});
        }
        List<String> B0 = i04.B0(this.h);
        ((ArrayList) this.h).clear();
        return B0;
    }

    @Override // tb.gaf
    public void j1() {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0dd92", new Object[]{this});
        } else if (this.e && (wVUCWebView = this.d) != null) {
            try {
                if (!wVUCWebView.isDestroied()) {
                    View view = wVUCWebView.getView();
                    if (view != null) {
                        view.clearFocus();
                        Object systemService = view.getContext().getSystemService("input_method");
                        if (systemService != null) {
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        }
                    }
                    this.e = false;
                }
            } catch (Exception unused) {
                TMSLogger.b("WebPageExtension", "clearFocus error");
            }
        }
    }
}
