package tb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.DefaultScreenShotPageExtension;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.taobao.themis.web.runtime.TMSWebScripts;
import com.uc.webview.export.WebView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import kotlin.Deprecated;
import kotlin.Result;

/* compiled from: Taobao */
@Deprecated(message = "replace with TMSWebRender")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pds extends d9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final String e;
    public final ViewGroup f;
    public WVUCWebView g;
    public final boolean h = o9s.j(this.d.I());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(840957963);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends qds {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ITMSPage iTMSPage, ocs ocsVar, String str) {
            super(iTMSPage, ocsVar, str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/mix/h5_render/TMSTinyH5Render$render$4$1");
            }
        }

        @Override // tb.qds, android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            jwd jwdVar;
            ace webViewContext;
            WVUCWebView s1;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (q9s.L1() && (s1 = pds.s1(pds.this)) != null) {
                s1.evaluateJavascript(TMSWebScripts.CACHE_STATISTICS_JS);
            }
            ITMSPage q1 = pds.q1(pds.this);
            if (q1 != null && (jwdVar = (jwd) q1.getExtension(jwd.class)) != null) {
                WVUCWebView s12 = pds.s1(pds.this);
                if (!(s12 == null || (webViewContext = s12.getWebViewContext()) == null)) {
                    z = webViewContext.isHitSnapshot();
                }
                jwdVar.setHitSnapshot(z);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            TMSLogger.f("TMSTinyH5Render", "onReceivedError " + i + ' ' + ((Object) str2));
            if (q9s.f2()) {
                if (i == -205) {
                    lcs.Companion.a().add(Integer.valueOf(i));
                }
                if (((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !x74.m(str2)) && ((i > -16 && i < 0) || i == -80 || i == -50)) {
                    String url = webView == null ? null : webView.getUrl();
                    if (url == null || ckf.b(url, str2)) {
                        if (!(webView instanceof WVUCWebView) || !((WVUCWebView) webView).getWebViewContext().isHitSnapshot()) {
                            if (webView != null) {
                                webView.loadUrl("about:blank", null);
                            }
                            if (webView != null) {
                                webView.setVisibility(4);
                            }
                            ocs r1 = pds.r1(pds.this);
                            String p = ckf.p("TMS_ERR_WEB_", Integer.valueOf(i));
                            r1.b(p, ((Object) str) + " [" + i + ']');
                            return;
                        }
                        ocs r12 = pds.r1(pds.this);
                        r12.b("TMS_ERR_WEB_WIDGET", ((Object) str) + " [" + i + ']');
                        return;
                    }
                }
            }
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/h5_render/TMSTinyH5Render$render$4$2");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            tll pageContext;
            y0e titleBar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            super.onReceivedTitle(webView, str);
            if (q9s.J0()) {
                if (str == null || !tsq.I(str, "http", false, 2, null)) {
                    ITMSPage q1 = pds.q1(pds.this);
                    if (qml.d(q1) && !q1.getPageParams().a() && (pageContext = q1.getPageContext()) != null && (titleBar = pageContext.getTitleBar()) != null) {
                        titleBar.setTitle(str, "");
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d extends c40 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gld f26033a;
        public final /* synthetic */ ITMSPage c;

        public d(gld gldVar, ITMSPage iTMSPage) {
            this.f26033a = gldVar;
            this.c = iTMSPage;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 428975361) {
                super.onProperty((String) objArr[0], objArr[1]);
                return null;
            } else if (hashCode == 1805974292) {
                super.onStage((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/mix/h5_render/TMSTinyH5Render$reportRumData$1");
            }
        }

        @Override // tb.c40, tb.cce
        public void onProperty(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
                return;
            }
            ckf.g(str, "name");
            ckf.g(obj, "value");
            super.onProperty(str, obj);
            gld gldVar = this.f26033a;
            if (gldVar != null) {
                gldVar.D(str, obj.toString());
            }
        }

        @Override // tb.c40, tb.cce
        public void onStage(String str, long j) {
            pgd pgdVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
                return;
            }
            ckf.g(str, "name");
            super.onStage(str, j);
            gld gldVar = this.f26033a;
            if (gldVar != null) {
                gldVar.f(str, j);
            }
            if (!q9s.p4()) {
                return;
            }
            if ((TextUtils.equals(str, "H5_JST_displayedTime_SSR") || TextUtils.equals(str, "H5_JST_displayedTime")) && (pgdVar = (pgd) this.c.getExtension(pgd.class)) != null) {
                pgdVar.a(str, Long.valueOf(j));
            }
        }
    }

    static {
        t2o.a(840957962);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pds(ITMSPage iTMSPage, String str, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        this.e = str;
        FrameLayout frameLayout = new FrameLayout(iTMSPage.getInstance().I());
        this.f = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        try {
            f8d X = this.d.X();
            ckf.f(X, "mInstance.performanceMonitor");
            X.onProperty("wvWriteChunkAsyncAB", h8s.s(this.d.I()).b());
        } catch (Exception e) {
            TMSLogger.c("TMSTinyH5Render", "performanceMonitor.onProperty", e);
        }
        iTMSPage.x(new ct2());
        iTMSPage.x(new DefaultScreenShotPageExtension(iTMSPage));
    }

    public static /* synthetic */ Object ipc$super(pds pdsVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1684946783:
                super.D0((String) objArr[0], (String) objArr[1], (JSON) objArr[2]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 392282426:
                super.X0((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1192889117:
                super.s();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/h5_render/TMSTinyH5Render");
        }
    }

    public static final /* synthetic */ ITMSPage q1(pds pdsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8916b46", new Object[]{pdsVar});
        }
        return pdsVar.f17670a;
    }

    public static final /* synthetic */ ocs r1(pds pdsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ocs) ipChange.ipc$dispatch("8661d7f4", new Object[]{pdsVar});
        }
        return pdsVar.b;
    }

    public static final /* synthetic */ WVUCWebView s1(pds pdsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("71d3f078", new Object[]{pdsVar});
        }
        return pdsVar.g;
    }

    @Override // tb.d9s, tb.qcs
    public void D0(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b91c0a1", new Object[]{this, str, str2, json});
            return;
        }
        ckf.g(str, "target");
        ckf.g(str2, "event");
        super.D0(str, str2, json);
        if (json == null) {
            json = new JSONObject();
        }
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null) {
            wVUCWebView.evaluateJavascript(n9s.b(str, str2, json));
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        if (json == null) {
            json = new JSONObject();
        }
        if (this.g != null) {
            String str2 = "\n                (function() {\n                   var customEvent = new CustomEvent('message', { detail: " + ((Object) json.toJSONString()) + " });\n                   customEvent.origin = 'Triver';\n                   customEvent.data = {\"event\": \"" + str + "\"};\n                   dispatchEvent(customEvent);\n                })()\n            ";
            WVUCWebView wVUCWebView = this.g;
            ckf.d(wVUCWebView);
            wVUCWebView.evaluateJavascript(str2);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        super.X0(str, json);
        if (json == null) {
            json = new JSONObject();
        }
        if (this.g != null) {
            String str2 = "\n                (function() {\n                   dispatchEvent(new CustomEvent('" + str + "', { detail: " + ((Object) json.toJSONString()) + " }));\n                })()\n            ";
            WVUCWebView wVUCWebView = this.g;
            ckf.d(wVUCWebView);
            wVUCWebView.evaluateJavascript(str2);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null) {
            try {
                ckf.d(wVUCWebView);
                ViewParent parent = wVUCWebView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                WVUCWebView wVUCWebView2 = this.g;
                ckf.d(wVUCWebView2);
                wVUCWebView2.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.g = null;
        }
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "WEB";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        if (o9s.e(this.f, SurfaceView.class) != null) {
            TMSLogger.b("TMSTinyH5Render", "can't get page snapshot due to SurfaceView");
            return null;
        } else if (o9s.e(this.f, TextureView.class) != null) {
            TMSLogger.b("TMSTinyH5Render", "can't get page snapshot due to TextureView");
            return null;
        } else {
            ViewGroup viewGroup = this.f;
            return f9s.a(viewGroup, viewGroup.getWidth(), this.f.getHeight(), 0, 0);
        }
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null) {
            ckf.d(wVUCWebView);
            wVUCWebView.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null && !this.h) {
            wVUCWebView.onPause();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null) {
            ckf.d(wVUCWebView);
            wVUCWebView.onResume();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WVUCWebView wVUCWebView = this.g;
        if (wVUCWebView != null && this.h) {
            wVUCWebView.onPause();
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }

    public final void t1(WVUCWebView wVUCWebView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd6b44", new Object[]{this, wVUCWebView});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null) {
            str = null;
        } else {
            str = iEnvironmentService.getAppVersion();
        }
        if (str != null && str.length() != 0) {
            String str2 = ((Object) wVUCWebView.getSettings().getUserAgentString()) + ' ' + TMSInstanceExtKt.o(this.d);
            IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
            if (iWebAdapter != null) {
                str2 = iWebAdapter.getUserAgent(str2);
            }
            wVUCWebView.getSettings().setUserAgentString(str2);
        }
    }

    public final void u1(WVUCWebView.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eb8df1", new Object[]{this, builder});
            return;
        }
        ITMSPage iTMSPage = this.f17670a;
        builder.setWebViewPageModel(new d(CommonExtKt.m(iTMSPage.getInstance()), iTMSPage));
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        int i;
        WVUCWebView.Builder builder;
        Object obj;
        WVUCWebView wVUCWebView;
        mdd m1;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.s();
        IpChange ipChange2 = rds.$ipChange;
        if (qml.z(this.f17670a)) {
            this.d.S().a("homePageRenderType", "PHA");
        }
        if (this.d.I() != null && !TextUtils.isEmpty(this.d.e0())) {
            mab mabVar = (mab) this.f17670a.getExtension(mab.class);
            if (!(mabVar == null || (m1 = mabVar.m1()) == null)) {
                m1.a("h5InitCompleted", Boolean.valueOf(WVCore.getInstance().isUCSupport()));
            }
            String L = this.d.L();
            ckf.f(L, "mInstance.appId");
            if (q9s.I0(L)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this.d.I(), UTPageStatus.UT_H5_IN_WebView);
            }
            TMSLogger.b("TMSTinyH5Render", "create webview start");
            String str = this.e;
            ace aceVar = null;
            if (!q9s.d2() || TextUtils.isEmpty(str)) {
                i = 3;
            } else {
                ckf.d(str);
                int i2 = 2;
                if (wsq.O(str, "webview_strategy=system", false, 2, null)) {
                    TMSLogger.f("TMSTinyH5Render", "use system core, reason: query param");
                    i = 2;
                } else {
                    i = 3;
                }
                if (i == 3 && q9s.f4(str)) {
                    f8d X = this.d.X();
                    ckf.f(X, "mInstance.performanceMonitor");
                    no8 f = h8s.f(this.d.I(), "systemWebViewABV2");
                    if (f.d()) {
                        if (WVCore.getInstance().isUCSupport() || !h4r.a(this.d.I())) {
                            i2 = i;
                        }
                        TMSLogger.f("TMSTinyH5Render", ckf.p("use system core, reason: config, isU4=", Boolean.valueOf(i2 == 3)));
                        i = i2;
                    } else {
                        TMSLogger.f("TMSTinyH5Render", "don't use system core, reason: not enabled");
                    }
                    X.onProperty("systemWebViewABV2", f.b());
                }
            }
            pgd pgdVar = (pgd) this.f17670a.getExtension(pgd.class);
            if (i == 3) {
                if (pgdVar != null) {
                    pgdVar.F("kernelType", "UC", TMSRumTarget.CONTAINER);
                }
            } else if (pgdVar != null) {
                pgdVar.F("kernelType", "System", TMSRumTarget.CONTAINER);
            }
            if (q9s.o2()) {
                builder = new WVUCWebView.Builder().setCoreType(i).setContext(this.d.I()).setEnablePreCreate(true);
            } else {
                builder = new WVUCWebView.Builder().setCoreType(i).setContext(this.d.I());
            }
            builder.setEnableAsyncJSAPIChannel(q9s.B());
            u1(builder);
            if (q9s.S1()) {
                builder.setPid(ncs.c(this.f17670a));
            }
            WVUCWebView build = builder.build();
            if (build == null) {
                build = null;
            } else {
                build.getWebViewContext().setThemis(true);
            }
            this.g = build;
            if (build != null) {
                aceVar = build.getWebViewContext();
            }
            if (aceVar != null) {
                aceVar.setCustomMegaBizId(qml.a(this.f17670a));
            }
            WVUCWebView wVUCWebView2 = this.g;
            ckf.d(wVUCWebView2);
            wVUCWebView2.putExternalContext("themis_page", this.f17670a);
            mgg S = this.d.S();
            WVUCWebView wVUCWebView3 = this.g;
            ckf.d(wVUCWebView3);
            if (wVUCWebView3.getCurrentViewCoreType() == 3) {
                z = false;
            }
            S.a("downgradeSystemWeb", String.valueOf(z));
            WVUCWebView wVUCWebView4 = this.g;
            ckf.d(wVUCWebView4);
            wVUCWebView4.setWebViewClient(new b(this.f17670a, this.b, this.d.L()));
            WVUCWebView wVUCWebView5 = this.g;
            ckf.d(wVUCWebView5);
            wVUCWebView5.setWebChromeClient(new c());
            WVUCWebView wVUCWebView6 = this.g;
            ckf.d(wVUCWebView6);
            t1(wVUCWebView6);
            WVUCWebView wVUCWebView7 = this.g;
            ckf.d(wVUCWebView7);
            if (wVUCWebView7.getCurrentViewCoreType() == 3) {
                TMSLogger.b("TMSTinyH5Render", "use u4 core");
            } else {
                TMSLogger.b("TMSTinyH5Render", "use system core");
            }
            String a2 = ew8.a();
            if (!TextUtils.isEmpty(a2)) {
                WVUCWebView wVUCWebView8 = this.g;
                ckf.d(wVUCWebView8);
                wVUCWebView8.injectJsEarly(a2);
            }
            String d2 = n9s.d(this.f17670a);
            WVUCWebView wVUCWebView9 = this.g;
            ckf.d(wVUCWebView9);
            wVUCWebView9.injectJsEarly(d2);
            String f2 = n9s.f(this.f17670a);
            String L2 = this.d.L();
            ckf.f(L2, "mInstance.appId");
            if (h8s.y(L2)) {
                WVUCWebView wVUCWebView10 = this.g;
                ckf.d(wVUCWebView10);
                wVUCWebView10.injectJsEarly(n9s.c());
            }
            WVUCWebView wVUCWebView11 = this.g;
            ckf.d(wVUCWebView11);
            wVUCWebView11.injectJsEarly(f2);
            WVUCWebView wVUCWebView12 = this.g;
            if (wVUCWebView12 != null) {
                wVUCWebView12.injectJsEarly(qml.e(this.f17670a, false));
            }
            try {
                Activity I = this.d.I();
                ckf.f(I, "mInstance.activity");
                if (z9.b(I).d() && (wVUCWebView = this.g) != null) {
                    wVUCWebView.injectJsEarly(z9.a());
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (Result.m1111exceptionOrNullimpl(obj) != null) {
                TMSLogger.b("TMSTinyH5Render", "fail to hook A label behaviour");
            }
            gld m = CommonExtKt.m(this.d);
            if (m != null) {
                m.C("engineInitEnd");
            }
            IpChange ipChange3 = rds.$ipChange;
            WVUCWebView wVUCWebView13 = this.g;
            if (wVUCWebView13 != null) {
                wVUCWebView13.loadUrl(this.e);
                WVUCWebView wVUCWebView14 = this.g;
                ckf.d(wVUCWebView14);
                wVUCWebView14.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f.removeAllViews();
                this.f.addView(this.g);
            }
        }
    }
}
