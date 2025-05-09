package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.NetworkUtils;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class od7 implements ozc, ntc, xyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25310a;
    public ze7 b;
    public RelativeLayout c;
    public final DetailHybridWebView d;
    public final View e;
    public String f;
    public vyb g;
    public rc7 h;
    public rc7 i;
    public final ff7 m;
    public lcd n;
    public boolean r;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean o = true;
    public final float p = vbl.N0();
    public final boolean q = vbl.Z();
    public boolean s = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DetailHybridWebView.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(od7 od7Var) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fc8e175", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements DetailHybridWebView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.c
        public void a(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            HashMap hashMap = new HashMap();
            if (od7.f(od7.this)) {
                tgh.b("DescNativeDegradeH5", "from native degrade, descUrl:" + od7.g(od7.this) + ", url:" + str2 + ", errorCode:" + i + ", errorMsg:" + str);
            } else {
                tgh.b("DescNativeDegradeH5", "don't from native degrade, descUrl:" + od7.g(od7.this) + ", url:" + str2 + ", errorCode:" + i + ", errorMsg:" + str);
            }
            hashMap.put("itemId", od7.h(od7.this).c);
            hashMap.put("errorCode", String.valueOf(i));
            hashMap.put("errorMsg", str);
            hashMap.put("url", str2);
            hashMap.put("isFromNativeDegrade", String.valueOf(od7.f(od7.this)));
            if (od7.i(od7.this) != null) {
                hashMap.put("sellerId", od7.i(od7.this).i().c("sellerId"));
            }
            bw7.b(hashMap, -900004, "H5图文详情加载失败");
            od7.j(od7.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements DetailHybridWebView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f25312a;

        public c(long j) {
            this.f25312a = j;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.d
        public void a(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            } else if (webView.getProgress() == 100) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25312a;
                PerformanceUtils.l(od7.l(od7.this), "descH5LoadTime", elapsedRealtime);
                tgh.b("DescH5Controller", "view.getProgress:" + webView.getProgress() + "|" + od7.m(od7.this).getContentHeight() + "cost:" + elapsedRealtime);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements DetailHybridWebView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.b
        public void a(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e50218a", new Object[]{this, webView, str});
            } else {
                od7.j(od7.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends ux1 {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String HIDE_ERROR = "hideError";
        public static final String SHOW_ERROR = "showError";
        public final String b;

        static {
            t2o.a(912262555);
        }

        public e(String str) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/DescWebController$WebShowStatusMessage");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(912262550);
        t2o.a(912261426);
        t2o.a(912261362);
        t2o.a(912262556);
    }

    public od7(Context context, ff7 ff7Var) {
        this.f25310a = context;
        DetailHybridWebView.registerPlugins();
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            this.c = (RelativeLayout) g.j(context, R.layout.tt_detail_desc_web, null, true);
        } else {
            this.c = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_web, (ViewGroup) null);
        }
        this.c.setDescendantFocusability(393216);
        DetailHybridWebView detailHybridWebView = (DetailHybridWebView) this.c.findViewById(R.id.detail_main_bottompage_webview);
        this.d = detailHybridWebView;
        detailHybridWebView.setVerticalScrollBarEnabled(false);
        this.e = this.c.findViewById(R.id.detail_main_bottompage_empty);
        detailHybridWebView.setHeightChangedListener(new a(this));
        if (ff7Var != null) {
            this.m = ff7Var;
            o(ff7Var.e);
        }
        y(context);
    }

    public static /* synthetic */ boolean f(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8deff615", new Object[]{od7Var})).booleanValue();
        }
        return od7Var.k;
    }

    public static /* synthetic */ String g(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94a68a8e", new Object[]{od7Var});
        }
        return od7Var.f;
    }

    public static /* synthetic */ ff7 h(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ff7) ipChange.ipc$dispatch("75a7d25a", new Object[]{od7Var});
        }
        return od7Var.m;
    }

    public static /* synthetic */ ze7 i(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ec442a6", new Object[]{od7Var});
        }
        return od7Var.b;
    }

    public static /* synthetic */ boolean j(od7 od7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9dfb9a1", new Object[]{od7Var, new Boolean(z)})).booleanValue();
        }
        od7Var.getClass();
        return z;
    }

    public static /* synthetic */ Context l(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d32f9e4e", new Object[]{od7Var});
        }
        return od7Var.f25310a;
    }

    public static /* synthetic */ DetailHybridWebView m(od7 od7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailHybridWebView) ipChange.ipc$dispatch("176d2d4a", new Object[]{od7Var});
        }
        return od7Var.d;
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    @Override // tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (!this.j) {
            v();
        }
    }

    @Override // tb.xyb
    public void b(lcd lcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37f6", new Object[]{this, lcdVar});
        } else {
            this.n = lcdVar;
        }
    }

    @Override // tb.xyb
    public void c(ze7 ze7Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da58e47", new Object[]{this, ze7Var});
            return;
        }
        this.b = ze7Var;
        this.r = DataUtils.T(ze7Var);
        if (!nj7.h() || vbl.f0()) {
            z = false;
        }
        this.s = z;
    }

    @Override // tb.xyb
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca9b6fa", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    @Override // tb.ozc
    public void destroy() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.c != null) {
            int i = 0;
            while (true) {
                if (i >= this.c.getChildCount()) {
                    linearLayout = null;
                    break;
                } else if (this.c.getChildAt(i) instanceof LinearLayout) {
                    linearLayout = (LinearLayout) this.c.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            if (linearLayout != null) {
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    ViewProxy.setOnClickListener(linearLayout.getChildAt(i2), null);
                }
                linearLayout.removeAllViews();
            }
            this.c.removeAllViews();
            this.c = null;
        }
        if (this.d != null) {
            UserBehaviorTracker.m(this.f25310a, "detail_desc_max_scroll", String.valueOf(p()));
            try {
                DetailHybridWebView.unregisterPlugins();
                this.d.destroy();
            } catch (Throwable th) {
                tgh.c("[WebView-Destroy]DescH5Controller", "WebView-Destroy error", th);
            }
        }
        z(this.f25310a);
    }

    @Override // tb.xyb
    public void e(vyb vybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b655b5f", new Object[]{this, vybVar});
        } else {
            this.g = vybVar;
        }
    }

    @Override // tb.ozc
    public View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view});
        }
        return this.c;
    }

    @Override // tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (i == Integer.MAX_VALUE) {
                this.d.getCoreView().scrollTo(0, this.d.getContentHeight());
            } else if (i == 0) {
                this.d.getCoreView().scrollTo(0, 0);
            }
        } catch (Exception unused) {
        }
    }

    public final String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e617d4d3", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(itw.URL_SEPARATOR) || !u()) {
            return str;
        }
        return uyv.HTTPS_SCHEMA.concat(str);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27d179", new Object[]{this, str});
        } else if (this.m != null && !TextUtils.isEmpty(str)) {
            boolean z = this.m.g;
            String a2 = aov.a(str, "newdetail", "1");
            this.f = a2;
            String a3 = aov.a(a2, "fromdetail", "1");
            this.f = a3;
            String a4 = aov.a(a3, "shopRec", "false");
            this.f = a4;
            String a5 = aov.a(a4, "relatedRec", "false");
            this.f = a5;
            String a6 = aov.a(a5, "hideFullBtn", "true");
            this.f = a6;
            String a7 = aov.a(a6, "hideBtmLine", "true");
            this.f = a7;
            this.f = aov.a(a7, "hidPriceDesc", String.valueOf(z));
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3024a98", new Object[]{this})).intValue();
        }
        try {
            return this.d.getCoreView().getScrollY();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50573147", new Object[]{this});
            return;
        }
        vyb vybVar = this.g;
        if (vybVar != null) {
            vybVar.error();
        }
    }

    @Override // tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        try {
            return this.d.getCoreView();
        } catch (Exception e2) {
            tgh.c("DescH5Controller", "getScrollItemView  error", e2);
            return this.d;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc866a1", new Object[]{this});
            return;
        }
        vyb vybVar = this.g;
        if (vybVar != null) {
            vybVar.start();
        }
    }

    @Override // tb.ozc
    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9588d6ca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            DetailHybridWebView detailHybridWebView = this.d;
            if (detailHybridWebView != null) {
                detailHybridWebView.onPause();
            }
        } catch (Exception e2) {
            tgh.c("DescH5Controller", "mWebView.onPause error", e2);
        }
        if (this.h != null && this.i == null) {
            this.i = new rc7("disappear", this.h.c(), new RuntimeAbilityParam[0]);
        }
        rc7 rc7Var = this.i;
        if (rc7Var != null) {
            q84.f(this.f25310a, rc7Var);
        }
        if (this.l) {
            this.l = false;
            tgh.b("DescH5Controller", "commitUserMotionForDesc:disappear");
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a148805c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7389eb0", new Object[]{this});
            return;
        }
        tgh.b("DescH5Controller", "desc loadUrl start");
        SystemClock.uptimeMillis();
        if (this.d != null && !TextUtils.isEmpty(this.f) && !this.j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.j = true;
            this.e.setVisibility(8);
            vyb vybVar = this.g;
            if (vybVar != null) {
                vybVar.start();
            }
            this.f = aov.a(this.f, "network", String.valueOf(NetworkUtils.b(b5m.z().a())));
            this.d.setDescLoadErrorListener(new b());
            this.d.setDescLoadFinishListener(new c(elapsedRealtime));
            this.d.setDescStartLoadListener(new d());
            this.d.loadUrl(n(this.f));
        }
    }

    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else {
            x();
        }
    }

    public final void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
        } else {
            q84.i(context, e.class, this);
        }
    }

    public final void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4859fcf6", new Object[]{this, context});
        } else {
            q84.l(context, e.class);
        }
    }

    public final void x() {
        lcd lcdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82666fba", new Object[]{this});
            return;
        }
        DetailHybridWebView detailHybridWebView = this.d;
        if (detailHybridWebView != null && this.q && this.r && !this.s) {
            try {
                int scrollY = detailHybridWebView.getCoreView().getScrollY();
                int contentHeight = this.d.getContentHeight();
                int e2 = mr7.e(this.f25310a);
                if (this.o) {
                    float f = this.p;
                    float f2 = e2;
                    if (contentHeight > f * f2 && contentHeight - scrollY <= f * f2 && (lcdVar = this.n) != null) {
                        lcdVar.a();
                        this.o = false;
                        tgh.b("DescH5Controller", "H5图文详情提前发推荐请求");
                    }
                }
            } catch (Exception e3) {
                tgh.b("DescH5Controller", "preloadRecommend error: " + e3);
            }
        }
    }

    @Override // tb.ozc
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        if (!this.j) {
            a();
        }
        try {
            DetailHybridWebView detailHybridWebView = this.d;
            if (detailHybridWebView != null) {
                detailHybridWebView.onResume();
            }
        } catch (Exception e2) {
            tgh.c("DescH5Controller", "mWebView.onResume error", e2);
        }
        if (this.h == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trackPage", (Object) VesselViewHolder.UT_SHOW_ARG1);
            jSONObject.put("spm", (Object) "a2141.7631564.1999077549");
            this.h = new rc7("ut_exposure", jSONObject, new RuntimeAbilityParam[0]);
        }
        q84.f(this.f25310a, this.h);
        this.l = true;
        tgh.b("DescH5Controller", "commitUserMotionForDesc:appear");
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (!(dtcVar instanceof e)) {
            return false;
        }
        String a2 = ((e) dtcVar).a();
        if (e.SHOW_ERROR.equals(a2)) {
            q();
        } else if (e.HIDE_ERROR.equals(a2)) {
            s();
        }
        return true;
    }
}
