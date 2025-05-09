package tb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.extension.page.DefaultScreenShotPageExtension;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.taobao.themis.web.runtime.TMSWebViewClient;
import com.taobao.themis.web.runtime.WebPageExtension;
import com.taobao.themis.web.runtime.WebViewInitDataInterface;
import kotlin.Pair;
import tb.cqc;
import tb.w5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qes extends d9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WVUCWebView e;
    public String f;
    public final boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends WVUCWebView.TouchEventHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f26705a;

        public b(ITMSPage iTMSPage) {
            this.f26705a = iTMSPage;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -934763565) {
                return super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue());
            }
            if (hashCode == 1199469325) {
                return super.coreDispatchTouchEvent((MotionEvent) objArr[0]);
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/web/runtime/TMSWebRender$2");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebView.TouchEventHandler
        public Boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("477e730d", new Object[]{this, motionEvent});
            }
            if (this.f26705a.getExtension(rbe.class) != null) {
                izw o1 = ((rbe) this.f26705a.getExtension(rbe.class)).o1();
                if (o1 != null) {
                    return o1.a(motionEvent);
                }
                jzw gestureListener = ((rbe) this.f26705a.getExtension(rbe.class)).getGestureListener();
                if (gestureListener != null) {
                    gestureListener.dispatchTouchEvent(motionEvent);
                    return null;
                }
            }
            if (!(motionEvent.getAction() != 0 || qes.q1(qes.this) == null || qes.q1(qes.this).getParent() == null)) {
                qes.q1(qes.this).getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.coreDispatchTouchEvent(motionEvent);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebView.TouchEventHandler
        public Boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c848a3d3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
            }
            if (this.f26705a.getExtension(rbe.class) != null) {
                izw o1 = ((rbe) this.f26705a.getExtension(rbe.class)).o1();
                if (o1 != null) {
                    return o1.b(i, i2, i3, i4, i5, i6, i7, i8, z);
                }
                jzw gestureListener = ((rbe) this.f26705a.getExtension(rbe.class)).getGestureListener();
                if (gestureListener != null) {
                    gestureListener.a(i, i2, i3, i4, i5, i6, i7, i8, z);
                    return null;
                }
            }
            if (!(qes.q1(qes.this) == null || qes.q1(qes.this).getParent() == null)) {
                if (q9s.Y()) {
                    if (i2 != 0 && ((i4 == 0 && i2 <= 0) || (i2 > 0 && i4 >= i6))) {
                        qes.q1(qes.this).getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (i != 0 && ((i3 == 0 && i <= 0) || (i > 0 && i3 >= i5))) {
                        qes.q1(qes.this).getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    qes.q1(qes.this).getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements cqc.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cqc f26706a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ bbs d;
        public final /* synthetic */ ocs e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ygv f26707a;

            public a(ygv ygvVar) {
                this.f26707a = ygvVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (qes.q1(qes.this) == null || qes.q1(qes.this).isDestroied()) {
                    c.this.f26706a.invalid();
                } else {
                    mcs.e(mcs.MODULE_LAUNCH_PAGE, "ON_FINISH_MAINDOCUMENT_EXTENSION", ncs.d(qes.r1(qes.this)), ncs.c(qes.s1(qes.this)), new JSONObject());
                    Integer b = this.f26707a.b();
                    if (b != null) {
                        qes.q1(qes.this).setPrefetchInfo(new qqm(c.this.b, b.intValue()));
                    }
                    c cVar = c.this;
                    qes.t1(qes.this, cVar.c, cVar.d, cVar.b, cVar.e);
                }
            }
        }

        public c(cqc cqcVar, String str, Activity activity, bbs bbsVar, ocs ocsVar) {
            this.f26706a = cqcVar;
            this.b = str;
            this.c = activity;
            this.d = bbsVar;
            this.e = ocsVar;
        }

        @Override // tb.cqc.c
        public void a(ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8000ea", new Object[]{this, ygvVar});
            } else {
                CommonExtKt.n(new a(ygvVar));
            }
        }
    }

    static {
        t2o.a(850395168);
    }

    public qes(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        int i;
        bbs bbsVar;
        this.g = false;
        Activity I = this.d.I();
        if (I != null) {
            iTMSPage.x(new WebPageExtension(iTMSPage));
            iTMSPage.x(new ct2());
            iTMSPage.x(new DefaultScreenShotPageExtension(iTMSPage));
            IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
            if (iWebAdapter != null) {
                iWebAdapter.registerPlugins();
            }
            this.f = iTMSPage.c();
            w5d w5dVar = (w5d) iTMSPage.getExtension(w5d.class);
            if (w5dVar != null) {
                w5dVar.A(new a());
            }
            String str = this.f;
            if (!q9s.d2() || TextUtils.isEmpty(str)) {
                i = 3;
            } else {
                int i2 = 2;
                if (str.contains("webview_strategy=system")) {
                    TMSLogger.f("Themis/WebRenderer", "use system core, reason: query param");
                    i = 2;
                } else {
                    i = 3;
                }
                if (i == 3 && q9s.f4(str)) {
                    f8d X = this.d.X();
                    no8 f = h8s.f(I, "systemWebViewABV2");
                    if (f.d()) {
                        i2 = (WVCore.getInstance().isUCSupport() || !h4r.a(I)) ? i : i2;
                        TMSLogger.f("Themis/WebRenderer", "use system core, reason: config, isU4=" + (i2 == 3));
                        i = i2;
                    } else {
                        TMSLogger.f("Themis/WebRenderer", "don't use system core, reason: not enabled");
                    }
                    X.onProperty("systemWebViewABV2", f.b());
                }
            }
            WVUCWebView.Builder realUrl = new WVUCWebView.Builder().setCoreType(i).setContext(I).setEnablePreCreate(true).setEnablePrerender(true).setEnableAsyncJSAPIChannel(q9s.B()).setRealUrl(this.f);
            if (this.d.O() == TMSContainerType.EMBEDDED || q9s.n0()) {
                realUrl.setTouchEventHandler(new b(iTMSPage));
            }
            y1(realUrl);
            if (q9s.S1()) {
                realUrl.setPid(ncs.c(iTMSPage));
            }
            WVUCWebView build = realUrl.build();
            this.e = build;
            build.getWebViewContext().setThemis(true);
            if (iTMSPage.getExtension(rbe.class) != null) {
                ((rbe) iTMSPage.getExtension(rbe.class)).W(this.e);
            }
            this.e.putExternalContext("themis_page", iTMSPage);
            rrb rrbVar = (rrb) iTMSPage.getInstance().getExtension(rrb.class);
            if (rrbVar != null) {
                this.e.putExternalContext("themis_data_extension", rrbVar);
            }
            String str2 = this.e.getUserAgentString() + " " + TMSInstanceExtKt.o(this.d);
            this.e.setUserAgentString(iWebAdapter != null ? iWebAdapter.getUserAgent(str2) : str2);
            if (!q9s.P() || (bbsVar = this.d) == null || !TMSInstanceExtKt.d(bbsVar)) {
                Integer p = qml.p(iTMSPage);
                if (p != null) {
                    this.e.setBackgroundColor(p.intValue());
                }
            } else {
                this.e.setBackgroundColor(0);
            }
            pgd pgdVar = (pgd) iTMSPage.getExtension(pgd.class);
            if (this.e.getCurrentViewCoreType() == 3) {
                TMSLogger.b("Themis/WebRenderer", "use u4 core");
                if (pgdVar != null) {
                    pgdVar.F("kernelType", "UC", TMSRumTarget.CONTAINER);
                }
            } else {
                TMSLogger.b("Themis/WebRenderer", "use system core");
                if (pgdVar != null) {
                    pgdVar.F("kernelType", "System", TMSRumTarget.CONTAINER);
                }
            }
            boolean j = o9s.j(I);
            this.g = j;
            TMSLogger.b("Themis/WebRenderer", "pauseWebViewOnStop=" + j);
            this.d.X().onProperty("wvWriteChunkAsyncAB", h8s.s(this.d.I()).b());
        }
    }

    public static /* synthetic */ Object ipc$super(qes qesVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2088493082:
                super.onViewDisappear();
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1073542112:
                super.onViewAppear();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/runtime/TMSWebRender");
        }
    }

    public static /* synthetic */ WVUCWebView q1(qes qesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("33039109", new Object[]{qesVar});
        }
        return qesVar.e;
    }

    public static /* synthetic */ bbs r1(qes qesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("41fe5763", new Object[]{qesVar});
        }
        return qesVar.d;
    }

    public static /* synthetic */ ITMSPage s1(qes qesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("6e8aecd1", new Object[]{qesVar});
        }
        return qesVar.f17670a;
    }

    public static /* synthetic */ void t1(qes qesVar, Activity activity, bbs bbsVar, String str, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f5a7a7", new Object[]{qesVar, activity, bbsVar, str, ocsVar});
        } else {
            qesVar.u1(activity, bbsVar, str, ocsVar);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void D0(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b91c0a1", new Object[]{this, str, str2, json});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            if (json == null) {
                json = new JSONObject();
            }
            wVUCWebView.evaluateJavascript(n9s.b(str, str2, json));
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            if (json == null) {
                str2 = "{}";
            } else {
                str2 = json.toJSONString();
            }
            wVUCWebView.fireEvent(str, str2);
        }
        WVUCWebView wVUCWebView2 = this.e;
        if (wVUCWebView2 != null) {
            if (json == null) {
                json = new JSONObject();
            }
            wVUCWebView2.evaluateJavascript(n9s.a(str, json));
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            if (json == null) {
                str2 = "{}";
            } else {
                str2 = json.toJSONString();
            }
            wVUCWebView.fireEvent(str, str2);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            try {
                ViewParent parent = wVUCWebView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.e);
                }
                this.e.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.e = null;
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
        return this.e;
    }

    @Override // tb.d9s, tb.qcs
    public void i0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a50b91", new Object[]{this, str, obj});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            wVUCWebView.evaluateJavascript("document.documentElement.style.setProperty('" + str + "', '" + obj + "');", null);
        }
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        if (o9s.e(this.e, SurfaceView.class) != null) {
            TMSLogger.b("Themis/WebRenderer", "can't get page snapshot due to SurfaceView");
            return null;
        } else if (o9s.e(this.e, TextureView.class) != null) {
            TMSLogger.b("Themis/WebRenderer", "can't get page snapshot due to TextureView");
            return null;
        } else {
            WVUCWebView wVUCWebView = this.e;
            return f9s.a(wVUCWebView, wVUCWebView.getWidth(), this.e.getHeight(), 0, 0);
        }
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null && !wVUCWebView.isDestroied()) {
            this.e.evaluateJavascript(str, null);
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
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            wVUCWebView.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        super.onViewAppear();
        onResume();
    }

    @Override // tb.d9s, tb.qcs
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        super.onViewDisappear();
        onPause();
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        Activity I;
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        if (!(!q9s.H1() || this.d.getExtension(x9b.class) == null || (I = this.d.I()) == null || (intent = I.getIntent()) == null)) {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString) && !TextUtils.equals(dataString, this.f)) {
                TMSLogger.b("极简链路", "use latest url " + dataString);
                vxm vxmVar = vxm.b;
                vxmVar.e().a("tms_afc_redirect", Boolean.TRUE);
                vxmVar.e().a("tms_afc_redirect_time", Long.valueOf(o9s.c(System.currentTimeMillis())));
                this.d.w0(dataString);
                this.f = dataString;
            }
        }
        pcs pcsVar = new pcs();
        pcsVar.f26018a = this.f;
        x1(pcsVar, this.b);
    }

    public final void v1(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de78a49", new Object[]{this, activity});
            return;
        }
        String a2 = ew8.a();
        if (!TextUtils.isEmpty(a2)) {
            w1(a2);
        }
        w1(n9s.f(this.f17670a));
        if (q9s.L0()) {
            w1(qml.e(this.f17670a, false));
        }
        rbe rbeVar = (rbe) this.f17670a.getExtension(rbe.class);
        if (rbeVar != null) {
            for (String str : rbeVar.z0()) {
                w1(str);
            }
        }
        no8 b2 = z9.b(activity);
        if (b2.d()) {
            w1(z9.a());
        }
        TMSLogger.b("Themis/WebRenderer", "hookALabelAB group: " + b2.b());
    }

    public void w1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26403027", new Object[]{this, str});
            return;
        }
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            try {
                if (wVUCWebView.getWebViewContext().isClientPrerender()) {
                    this.e.evaluateJavascript(str, null);
                } else {
                    this.e.injectJsEarly(str);
                }
            } catch (Exception unused) {
                TMSLogger.b("Themis/WebRenderer", "injectOrEvaluateJS error");
            }
        }
    }

    public void x1(pcs pcsVar, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268c2a01", new Object[]{this, pcsVar, ocsVar});
        } else if (pcsVar == null) {
            TMSLogger.b("Themis/WebRenderer", "renderOptions is null");
        } else if (TextUtils.isEmpty(pcsVar.f26018a)) {
            TMSLogger.b("Themis/WebRenderer", "fail to render because of empty url");
        } else if (this.e == null) {
            TMSLogger.b("Themis/WebRenderer", "fail to render because of null webView.");
        } else {
            bbs bbsVar = this.d;
            if (bbsVar == null) {
                TMSLogger.b("Themis/WebRenderer", "fail to render because of null TMSInstance.");
                return;
            }
            try {
                WebStartParams a2 = ses.a(bbsVar);
                if (!(a2 == null || a2.getInitData() == null || !q9s.t())) {
                    this.e.addJavascriptInterface(new WebViewInitDataInterface(a2.getInitData()), "__inject_data__");
                }
            } catch (Exception unused) {
            }
            Activity I = bbsVar.I();
            if (I == null) {
                TMSLogger.b("Themis/WebRenderer", "failed to loadUrl because of null activity.");
                return;
            }
            v1(I);
            if (this.e.getWebViewContext().isClientPrerender()) {
                TMSLogger.b("Themis/WebRenderer", "fail to render because of prerender success.");
                this.e.getWebViewContext().setRealUrl(pcsVar.f26018a);
                return;
            }
            cqc cqcVar = (cqc) this.f17670a.getExtension(cqc.class);
            String str = pcsVar.f26018a;
            if (cqcVar == null || !cqcVar.A0()) {
                u1(I, bbsVar, str, ocsVar);
                return;
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, "ON_BIND_MAINDOCUMENT_EXTENSION", ncs.d(this.d), ncs.c(this.f17670a), new JSONObject());
            cqcVar.Q(new c(cqcVar, str, I, bbsVar, ocsVar));
        }
    }

    public final void y1(WVUCWebView.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eb8df1", new Object[]{this, builder});
            return;
        }
        ITMSPage iTMSPage = this.f17670a;
        builder.setWebViewPageModel(new res(this, CommonExtKt.m(iTMSPage.getInstance()), iTMSPage));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements w5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.w5d.c
        public int getPriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return 9;
        }

        @Override // tb.w5d.c
        public boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89a4e043", new Object[]{this, iTMSPage, tMSBackPressedType})).booleanValue();
            }
            WVUCWebView q1 = qes.q1(qes.this);
            if (q1 == null) {
                return false;
            }
            String url = q1.getUrl();
            if (!TextUtils.isEmpty(url)) {
                try {
                    Uri g = ies.g(url);
                    if (g != null) {
                        if ("true".equals(g.getQueryParameter("disallowback"))) {
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            boolean back = q1.back();
            String url2 = q1.getUrl();
            if (!back || TextUtils.equals(url2, "about:blank")) {
                z = false;
            }
            TMSLogger.b("Themis/WebRenderer", "interceptBack ret=" + z + ", currentUrl=" + url2);
            return z;
        }
    }

    @Override // tb.d9s, tb.qcs
    public void reload(pcs pcsVar) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961bd7e0", new Object[]{this, pcsVar});
            return;
        }
        if (pcsVar == null) {
            pcsVar = new pcs();
            pcsVar.f26018a = this.f;
        }
        if (q9s.V() && (!q9s.P() || (bbsVar = this.d) == null || !TMSInstanceExtKt.d(bbsVar))) {
            try {
                String d = ies.d(pcsVar.f26018a, InstanceStartParams.KEY_PAGE_BG_COLOR, true);
                if (!TextUtils.isEmpty(d)) {
                    this.e.setBackgroundColor(Color.parseColor(d));
                }
            } catch (Throwable th) {
                TMSLogger.d("Themis/WebRenderer", th);
            }
        }
        x1(pcsVar, this.b);
    }

    public final void u1(Activity activity, bbs bbsVar, String str, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a5e47e", new Object[]{this, activity, bbsVar, str, ocsVar});
            return;
        }
        this.e.setWebViewClient(new TMSWebViewClient(activity, ocsVar, this.f17670a, this.e.getPrefetchInfo()));
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter != null) {
            this.e.setWebChromeClient(iWebAdapter.getWebChromeClient(this.f17670a));
        }
        TMSLogger.b("Themis/WebRenderer", "loadUrl " + str);
        if (ocsVar != null) {
            ocsVar.onRenderReady();
        }
        if (q9s.a2()) {
            kwd kwdVar = (kwd) this.f17670a.getExtension(kwd.class);
            boolean isFirstPage = kwdVar != null ? kwdVar.isFirstPage() : false;
            if (TMSSolutionType.UNIAPP == bbsVar.a0() && !isFirstPage && !this.f17670a.getPageParams().l()) {
                tc.c(this.e, false);
            }
        }
        String a2 = qml.a(this.f17670a);
        String f = qml.f(this.f17670a);
        this.e.getWebViewContext().setCustomMegaBizId(a2);
        this.e.getWebViewContext().setCustomMegaNamespace(f);
        if (this.d.a0() == TMSSolutionType.MINIGAME && !TextUtils.isEmpty(f) && !TextUtils.isEmpty(a2)) {
            this.e.setAbilityHubAdapter(new AbilityHubAdapter(new zq(a2, f).a(this.d.I())));
        }
        gld m = CommonExtKt.m(bbsVar);
        if (m != null) {
            m.C("engineInitEnd");
        }
        this.e.loadUrl(str);
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null && !this.g) {
            wVUCWebView.onPause();
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WebView.onPause")));
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
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WebView.onResume")));
    }

    @Override // tb.d9s, tb.qcs
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WVUCWebView wVUCWebView = this.e;
        if (wVUCWebView != null && this.g) {
            wVUCWebView.onPause();
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WebView.onPause")));
        }
    }
}
