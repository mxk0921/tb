package com.taobao.android.dinamicx;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.IDXApmManager;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.j;
import com.taobao.android.dinamicx.model.DXHandlerMap;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.model.DXParserMap;
import com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray;
import com.taobao.android.dinamicx.model.DXSyncLongSparseArray;
import com.taobao.android.dinamicx.model.DXWidgetNodeMap;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.s;
import com.taobao.android.dinamicx.widget.t;
import com.taobao.android.dxv4common.logic.dex.DXModuleManager;
import com.taobao.android.launcher.DinamicXLauncherV3;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ad5;
import tb.al6;
import tb.av5;
import tb.awb;
import tb.bv5;
import tb.cb5;
import tb.cwb;
import tb.d56;
import tb.dvb;
import tb.dw5;
import tb.dwb;
import tb.dx5;
import tb.eb5;
import tb.evb;
import tb.ew5;
import tb.ewb;
import tb.fvb;
import tb.fwb;
import tb.g46;
import tb.gfh;
import tb.gub;
import tb.h36;
import tb.hdb;
import tb.hm6;
import tb.hub;
import tb.hvb;
import tb.ic5;
import tb.iew;
import tb.iwb;
import tb.ixb;
import tb.iy5;
import tb.j18;
import tb.j66;
import tb.jg5;
import tb.ji6;
import tb.jvb;
import tb.k66;
import tb.ka6;
import tb.kb6;
import tb.kd5;
import tb.kub;
import tb.kwb;
import tb.la6;
import tb.lc6;
import tb.li6;
import tb.lub;
import tb.mub;
import tb.mv5;
import tb.mvb;
import tb.mwb;
import tb.nb5;
import tb.nv5;
import tb.ob5;
import tb.on6;
import tb.owb;
import tb.pb6;
import tb.ph5;
import tb.pwb;
import tb.qub;
import tb.qv5;
import tb.qvb;
import tb.r76;
import tb.ra6;
import tb.rn7;
import tb.rv5;
import tb.rvb;
import tb.rx5;
import tb.s26;
import tb.sb5;
import tb.t2o;
import tb.tc5;
import tb.tm6;
import tb.tvb;
import tb.tx5;
import tb.uw5;
import tb.vc5;
import tb.vu5;
import tb.w8;
import tb.wu5;
import tb.wvb;
import tb.xh6;
import tb.xv5;
import tb.xwb;
import tb.y7;
import tb.zg5;
import tb.zm6;
import tb.zq;
import tb.zub;
import tb.zvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DinamicXEngine extends ad5 implements j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENGINE_INIT_ERROR_LOG_KEY = "DinamicXInitError";
    public static volatile boolean M = false;
    public static boolean N = false;
    public static Context O = null;
    public static final String OPEN_TRACE_KEY_RENDER_TMPL = "renderForTemplate";
    public static j P = null;
    public static com.taobao.android.dinamicx.a Q = null;
    public static Class<? extends zvb> R = null;
    public static final int REFRESH_TYPE_LAYOUT = 1;
    public static final int REFRESH_TYPE_PARSE = 0;
    public static final String RENDER_TEMPLATE = "renderTemplateTime";
    public static long S = 0;
    public static final String URL_SKIP_VERSION_KEY = "skipV";
    public tm6 A;
    public final DXEngineConfig B;
    public volatile qvb C;
    public WeakReference<Activity> D = null;
    public fvb E;
    public bv5 F;
    public AbilityHubAdapter G;
    public Map<String, hdb> H;
    public Map<String, Map<String, w8>> I;
    public dvb J;
    public tx5 K;
    public d56 L;
    public li6 c;
    public vc5 d;
    public final DXLongSparseArray<evb> e;
    public final DXLongSparseArray<mvb> f;
    public final DXLongSparseArray<qub> g;
    public final DXLongSparseArray<qub> h;
    public final m i;
    public final com.taobao.android.dinamicx.d j;
    public final p k;
    public ThreadLocal<p> l;
    public final ph5 m;
    public final j66 n;
    public final k o;
    public kd5 p;
    public final boolean q;
    public ra6 r;
    private dw5 s;
    public cwb t;
    public HashMap<String, wvb> u;
    private ew5 v;
    public zvb w;
    public Map<String, ka6> x;
    public qv5 y;
    public hm6 z;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXRefreshType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements mv5.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rv5[] f7294a;

        public a(DinamicXEngine dinamicXEngine, rv5[] rv5VarArr) {
            this.f7294a = rv5VarArr;
        }

        @Override // tb.mv5.b
        public void a(rv5 rv5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bc5781", new Object[]{this, rv5Var});
            } else {
                this.f7294a[0] = rv5Var;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7295a;

        public b(String str) {
            this.f7295a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("initialize");
            f.a aVar = new f.a("Engine", "Engine_InitEnv", 30001);
            aVar.e = this.f7295a;
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
            DinamicXEngine.g(fVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7296a;
        public final /* synthetic */ DXRootView b;
        public final /* synthetic */ r76 c;

        public c(Context context, DXRootView dXRootView, r76 r76Var) {
            this.f7296a = context;
            this.b = dXRootView;
            this.c = r76Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DinamicXEngine dinamicXEngine = DinamicXEngine.this;
            Context context = this.f7296a;
            DXRootView dXRootView = this.b;
            r76 r76Var = this.c;
            dinamicXEngine.i1(context, dXRootView, r76Var.f27161a, r76Var.b, r76Var.c, r76Var.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRenderOptions f7297a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ DXTemplateItem c;
        public final /* synthetic */ JSONObject d;

        public d(DXRenderOptions dXRenderOptions, Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
            this.f7297a = dXRenderOptions;
            this.b = context;
            this.c = dXTemplateItem;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXRenderOptions dXRenderOptions = this.f7297a;
                if (eb5.G() && j18.HOMEPAGE_DX_MODULE.equals(DinamicXEngine.this.f15675a)) {
                    dXRenderOptions = this.f7297a != null ? new DXRenderOptions.b().A(4).G(this.f7297a.i()).t(this.f7297a.b()).E(this.f7297a.h()).y(this.f7297a.d()).q() : DXRenderOptions.DEFAULT_PRERENDER_X_OPTIONS;
                }
                DXRenderOptions dXRenderOptions2 = dXRenderOptions == null ? DXRenderOptions.DEFAULT_PRERENDER_OPTIONS : dXRenderOptions;
                DXRuntimeContext h = DinamicXEngine.h(DinamicXEngine.this, this.b, this.c, this.d, null, dXRenderOptions);
                if (h != null) {
                    h36.v("开始butter preRenderTemplate ", h.R());
                }
                DinamicXEngine.i(DinamicXEngine.this).z(h, dXRenderOptions2);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRenderOptions f7298a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ DXTemplateItem c;
        public final /* synthetic */ JSONObject d;

        public e(DXRenderOptions dXRenderOptions, Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
            this.f7298a = dXRenderOptions;
            this.b = context;
            this.c = dXTemplateItem;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXRenderOptions dXRenderOptions = this.f7298a;
                if (dXRenderOptions == null) {
                    dXRenderOptions = DXRenderOptions.DEFAULT_PRERENDER_OPTIONS;
                }
                DXRuntimeContext m0 = DinamicXEngine.this.m0(this.b, null, this.c, this.d, null, dXRenderOptions);
                if (m0 != null) {
                    h36.v("开始preRenderTemplate ", m0.R());
                }
                vc5 i = DinamicXEngine.i(DinamicXEngine.this);
                DinamicXEngine dinamicXEngine = DinamicXEngine.this;
                i.y(m0, dXRenderOptions, dinamicXEngine.k, dinamicXEngine.o, dinamicXEngine.m);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRenderOptions f7299a;
        public final /* synthetic */ DXWidgetNode b;
        public final /* synthetic */ View c;
        public final /* synthetic */ tc5 d;

        public f(DXRenderOptions dXRenderOptions, DXWidgetNode dXWidgetNode, View view, tc5 tc5Var) {
            this.f7299a = dXRenderOptions;
            this.b = dXWidgetNode;
            this.c = view;
            this.d = tc5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXRenderOptions q;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f7299a != null) {
                    q = new DXRenderOptions.b().A(1).B(this.f7299a.g()).s(this.f7299a.a()).G(this.f7299a.i()).t(this.f7299a.b()).E(this.f7299a.h()).u(this.f7299a.j()).v(this.f7299a.k()).q();
                } else {
                    q = new DXRenderOptions.b().A(1).B(4).q();
                }
                DinamicXEngine.i(DinamicXEngine.this).C(this.b.getDXRuntimeContext(), q, null, this.c, this.d);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRenderOptions f7300a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ DXTemplateItem c;
        public final /* synthetic */ JSONObject d;

        public g(DXRenderOptions dXRenderOptions, Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
            this.f7300a = dXRenderOptions;
            this.b = context;
            this.c = dXTemplateItem;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXRenderOptions dXRenderOptions;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f7300a != null) {
                    dXRenderOptions = new DXRenderOptions.b().A(1).B(this.f7300a.g()).s(this.f7300a.a()).G(this.f7300a.i()).t(this.f7300a.b()).E(this.f7300a.h()).u(this.f7300a.j()).v(this.f7300a.k()).y(this.f7300a.d()).F(this.f7300a.p()).r(this.f7300a.o()).q();
                } else {
                    dXRenderOptions = new DXRenderOptions.b().A(1).B(4).q();
                }
                DXRuntimeContext m0 = DinamicXEngine.this.m0(this.b, null, this.c, this.d, null, dXRenderOptions);
                h36.v("开始prefetchTemplate ", m0.R());
                vc5 i = DinamicXEngine.i(DinamicXEngine.this);
                DinamicXEngine dinamicXEngine = DinamicXEngine.this;
                i.B(m0, dXRenderOptions, dinamicXEngine.k, dinamicXEngine.o, dinamicXEngine.m);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(DinamicXEngine dinamicXEngine) {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements mv5.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rv5[] f7301a;

        public i(DinamicXEngine dinamicXEngine, rv5[] rv5VarArr) {
            this.f7301a = rv5VarArr;
        }

        @Override // tb.mv5.b
        public void a(rv5 rv5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bc5781", new Object[]{this, rv5Var});
            } else {
                this.f7301a[0] = rv5Var;
            }
        }
    }

    static {
        t2o.a(444596587);
        t2o.a(444596511);
    }

    public DinamicXEngine(DXEngineConfig dXEngineConfig) {
        super(new av5(dXEngineConfig));
        String str;
        this.q = true;
        String str2 = null;
        String d2 = dXEngineConfig.d();
        l(dXEngineConfig.d());
        DXTraceUtil.b("DXEngine#init");
        la6.b("开始构造DXEngine " + d2);
        Log.e(h36.TAG, "开始构造DXEngine " + d2);
        if (!M || x() == null) {
            if (!j0()) {
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
                f.a aVar = new f.a("Engine", "Engine_Init", com.taobao.android.dinamicx.f.DXError_EngineInitContextNUll);
                if (!M) {
                    str = "没有初始化";
                } else {
                    str = "context == null";
                }
                aVar.e = str;
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
                this.q = false;
                l0(fVar);
                str2 = str;
            } else {
                throw new RuntimeException("DinamicX not initialize");
            }
        }
        this.B = dXEngineConfig;
        try {
            this.b.w(this);
            if (eb5.E()) {
                this.e = new DXParserMap(com.taobao.android.dinamicx.g.f7313a);
                this.g = new DXWidgetNodeMap(com.taobao.android.dinamicx.g.b);
                this.f = new DXHandlerMap(com.taobao.android.dinamicx.g.c);
            } else {
                this.e = new DXLongSparseArray<>(com.taobao.android.dinamicx.g.e);
                this.g = g0();
                this.f = new DXLongSparseArray<>(com.taobao.android.dinamicx.g.f);
            }
            this.m = new ph5();
            this.n = new j66(d());
            p W = W();
            this.k = W;
            W.w(d().d);
            la6.b("Engine 构造 dxTemplateManager" + W);
            this.o = new k(this.b);
            this.i = b(this.b, W);
            if (dXEngineConfig.D()) {
                com.taobao.android.dinamicx.d dVar = new com.taobao.android.dinamicx.d(this.b, W);
                this.j = dVar;
                if (eb5.E()) {
                    this.h = new DXWidgetNodeMap(com.taobao.android.dinamicx.g.d);
                } else {
                    this.h = dVar.A(this.g);
                }
            }
        } catch (Throwable th) {
            this.q = false;
            com.taobao.android.dinamicx.f fVar2 = new com.taobao.android.dinamicx.f(this.f15675a);
            f.a aVar2 = new f.a("Engine", "Engine_Init", com.taobao.android.dinamicx.f.DXError_EngineInitException);
            aVar2.e = "30002 reason=" + str2 + "-" + xv5.a(th);
            ((ArrayList) fVar2.c).add(aVar2);
            ic5.p(fVar2);
            xv5.b(th);
            l0(fVar2);
        }
        H0(false);
        U();
        T();
        d0(dXEngineConfig);
        Z();
        if (!eb5.E()) {
            V(dXEngineConfig);
        }
        zg5.h3();
        Y(dXEngineConfig);
        f0();
        a0();
        s26.d(this);
        if (!eb5.E()) {
            e0();
        }
        b0();
        DXTraceUtil.b("DXEngine#init#nano");
        if (!eb5.E()) {
            c0();
        }
        DXTraceUtil.c();
        la6.b("完成构造DXEngine " + d2);
        Log.e(h36.TAG, "完成构造DXEngine " + d2);
        DXTraceUtil.c();
    }

    public static void G0(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14409c6", new Object[]{activity, new Boolean(z)});
            return;
        }
        try {
            h36.b(h36.TAG, "DinamicX processWindowChanged forceChange" + z);
            pb6.h(z, activity);
        } catch (Exception e2) {
            xv5.b(e2);
        }
    }

    public static void H0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da871d8", new Object[]{new Boolean(z)});
        } else {
            G0(null, z);
        }
    }

    public static void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca62b7ba", new Object[0]);
            return;
        }
        IDXApmManager b2 = com.taobao.android.dinamicx.g.b();
        if (b2 != null) {
            com.taobao.android.dinamicx.a aVar = new com.taobao.android.dinamicx.a();
            Q = aVar;
            b2.a(aVar);
            if (zg5.R4()) {
                L0(lc6.e());
            }
        }
    }

    public static void L0(IDXApmManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2bccb05", new Object[]{aVar});
            return;
        }
        com.taobao.android.dinamicx.a aVar2 = Q;
        if (aVar2 != null && aVar != null) {
            aVar2.a(aVar);
        }
    }

    public static void X0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560eeb1", new Object[]{context});
        } else if (zg5.Q3()) {
            j jVar = new j(zg5.R3());
            P = jVar;
            if (context != null) {
                context.registerComponentCallbacks(jVar);
            }
            if (j0()) {
                h36.g("DXConfigCenter", "全局 LowMemory 监听开");
            }
        } else if (j0()) {
            h36.g("DXConfigCenter", "全局 LowMemory 监听关");
        }
    }

    public static void Y0(j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f7f383", new Object[]{aVar});
            return;
        }
        j jVar = P;
        if (jVar != null && aVar != null) {
            jVar.e(aVar);
        }
    }

    public static void d1(List<xwb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510f88f4", new Object[]{list});
            return;
        }
        for (xwb xwbVar : list) {
            if (xwbVar != null && !TextUtils.isEmpty(xwbVar.getDxFunctionName())) {
                rvb.BUILD_IN_FUNC_MAP.put(xwbVar.getDxFunctionName(), uw5.R(xwbVar));
            }
        }
        list.clear();
    }

    public static /* synthetic */ void g(com.taobao.android.dinamicx.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8ffbe9", new Object[]{fVar});
        } else {
            l0(fVar);
        }
    }

    public static void g1(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6cf228", new Object[]{dXTemplateItem});
        } else if (dXTemplateItem != null) {
            DXTraceUtil.b("OnRenderEndCallback");
            if (com.taobao.android.dinamicx.g.f() != null && zg5.i5()) {
                com.taobao.android.dinamicx.g.f().a(dXTemplateItem);
            }
            DXTraceUtil.c();
        }
    }

    public static /* synthetic */ DXRuntimeContext h(DinamicXEngine dinamicXEngine, Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXButterRootView dXButterRootView, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("4d486b50", new Object[]{dinamicXEngine, context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions});
        }
        return dinamicXEngine.n0(context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions);
    }

    public static void h0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else {
            i0(context, null);
        }
    }

    public static /* synthetic */ vc5 i(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vc5) ipChange.ipc$dispatch("19aa57fc", new Object[]{dinamicXEngine});
        }
        return dinamicXEngine.d;
    }

    public static /* synthetic */ Object ipc$super(DinamicXEngine dinamicXEngine, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DinamicXEngine");
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return N;
    }

    public static void l0(com.taobao.android.dinamicx.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1078db65", new Object[]{fVar});
            return;
        }
        Log.e(ENGINE_INIT_ERROR_LOG_KEY, fVar.toString());
        la6.b(ENGINE_INIT_ERROR_LOG_KEY + fVar.toString());
    }

    public static void n(String str, DXTemplateItem dXTemplateItem, List<f.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b33de0", new Object[]{str, dXTemplateItem, list});
            return;
        }
        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(str);
        fVar.b = dXTemplateItem;
        fVar.c.addAll(list);
        ic5.p(fVar);
    }

    public static Context x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]);
        }
        return O;
    }

    public vc5 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vc5) ipChange.ipc$dispatch("3d54ca9a", new Object[]{this});
        }
        return this.d;
    }

    public void A0(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec05721", new Object[]{this, list});
        } else if (list != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                DXTemplateItem t = t(dXTemplateItem);
                if (t != null) {
                    h36.v("开始preload ", t.d());
                    this.i.o().r(m0(x(), null, dXTemplateItem, null, this.i, null));
                }
            }
        }
    }

    public cwb B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwb) ipChange.ipc$dispatch("7f4f4df1", new Object[]{this});
        }
        return this.t;
    }

    public void B0(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i2, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d2b56", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i2), dXRenderOptions});
        } else if (zg5.L3(this.f15675a) && !zg5.q4() && !zg5.n2() && this.d != null && dXTemplateItem != null) {
            dXTemplateItem.k(this.B.D());
            boolean i3 = dXTemplateItem.i(this.f15675a);
            h36.v("开始 preRenderTemplate ", dXTemplateItem.d() + " isButter=" + i3);
            if (i3) {
                this.d.N(new d(dXRenderOptions, context, dXTemplateItem, jSONObject));
            } else {
                this.d.N(new e(dXRenderOptions, context, dXTemplateItem, jSONObject));
            }
        }
    }

    public Map<String, ka6> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830d8271", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new ConcurrentHashMap();
        }
        return this.x;
    }

    public void C0(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i2, DXRenderOptions dXRenderOptions) {
        DXRenderOptions dXRenderOptions2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ee3d1c", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i2), dXRenderOptions});
        } else if (dXTemplateItem != null && !zg5.n2()) {
            dXTemplateItem.k(this.B.D());
            if (dXTemplateItem.i(this.f15675a)) {
                if (dXRenderOptions != null) {
                    dXRenderOptions2 = new DXRenderOptions.b().A(4).G(dXRenderOptions.i()).t(dXRenderOptions.b()).E(dXRenderOptions.h()).y(dXRenderOptions.d()).q();
                } else {
                    dXRenderOptions2 = DXRenderOptions.DEFAULT_PRERENDER_X_OPTIONS;
                }
                B0(context, dXTemplateItem, jSONObject, i2, dXRenderOptions2);
                return;
            }
            B0(context, dXTemplateItem, jSONObject, i2, dXRenderOptions);
        }
    }

    public ra6 D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ra6) ipChange.ipc$dispatch("120ff295", new Object[]{this});
        }
        return this.r;
    }

    public void D0(Context context, JSONObject jSONObject, DXTemplateItem dXTemplateItem, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d46f6ba", new Object[]{this, context, jSONObject, dXTemplateItem, new Integer(i2)});
        } else {
            E0(context, jSONObject, dXTemplateItem, i2, null);
        }
    }

    public p E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("f5d531f5", new Object[]{this});
        }
        if (!zg5.k5()) {
            return this.k;
        }
        p pVar = this.l.get();
        if (pVar != null) {
            return pVar;
        }
        p S2 = S();
        S2.w(d().d);
        this.l.set(S2);
        return S2;
    }

    public void E0(Context context, JSONObject jSONObject, DXTemplateItem dXTemplateItem, int i2, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e505da66", new Object[]{this, context, jSONObject, dXTemplateItem, new Integer(i2), dXRenderOptions});
        } else if (this.d != null && !zg5.n2() && !o0() && dXTemplateItem != null) {
            dXTemplateItem.k(this.B.D());
            if (!dXTemplateItem.i(this.f15675a)) {
                this.d.P(new g(dXRenderOptions, context, dXTemplateItem, jSONObject));
            }
        }
    }

    public hm6 F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hm6) ipChange.ipc$dispatch("f0fcceda", new Object[]{this});
        }
        return this.z;
    }

    public void F0(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, View view, tc5<DXRuntimeContext> tc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e15c47a", new Object[]{this, dXRuntimeContext, dXRenderOptions, view, tc5Var});
        } else if (this.d != null && !zg5.n2()) {
            DXWidgetNode a2 = jg5.a(dXRuntimeContext, dXRuntimeContext.f7292a);
            a2.setParentWidget(dXRuntimeContext.f7292a.getParentWidget());
            f fVar = new f(dXRenderOptions, a2, view, tc5Var);
            if (dXRenderOptions == null || dXRenderOptions.l()) {
                this.d.Q(fVar);
            } else {
                fVar.run();
            }
        }
    }

    public bv5 G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bv5) ipChange.ipc$dispatch("cd4a93b8", new Object[]{this});
        }
        return this.F;
    }

    public qv5 H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qv5) ipChange.ipc$dispatch("4d7cac71", new Object[]{this});
        }
        return this.y;
    }

    public tx5 I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tx5) ipChange.ipc$dispatch("35d5ec4c", new Object[]{this});
        }
        if (eb5.E() && this.K == null) {
            c0();
        }
        return this.K;
    }

    public dvb K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dvb) ipChange.ipc$dispatch("6fefb54f", new Object[]{this});
        }
        return this.J;
    }

    public fvb L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvb) ipChange.ipc$dispatch("f542b87", new Object[]{this});
        }
        return this.E;
    }

    public qvb M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb) ipChange.ipc$dispatch("4a78cc60", new Object[]{this});
        }
        return this.C;
    }

    public ewb N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewb) ipChange.ipc$dispatch("2747a865", new Object[]{this});
        }
        return null;
    }

    public boolean N0(String str, String str2, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51b51dbd", new Object[]{this, str, str2, w8Var})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || w8Var == null) {
            return false;
        }
        if (this.I == null) {
            this.I = new HashMap();
        }
        Map<String, w8> map = this.I.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.I.put(str, map);
        }
        map.put(str2, w8Var);
        return true;
    }

    public w8 O(String str, String str2) {
        Map<String, Map<String, w8>> map;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8) ipChange.ipc$dispatch("52c7b706", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (map = this.I) == null || (map2 = (Map) ((HashMap) map).get(str)) == null) {
            return null;
        }
        return (w8) map2.get(str2);
    }

    public void O0(dvb dvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f534c408", new Object[]{this, dvbVar});
        } else {
            this.J = dvbVar;
        }
    }

    public Map<String, hdb> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fed22d6", new Object[]{this});
        }
        return this.H;
    }

    public boolean P0(long j, qub qubVar) {
        DXLongSparseArray<qub> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd5c0b3", new Object[]{this, new Long(j), qubVar})).booleanValue();
        }
        if (j == 0 || qubVar == null || !d().D() || (dXLongSparseArray = this.h) == null) {
            return false;
        }
        dXLongSparseArray.put(j, this.j.B(j, qubVar));
        return true;
    }

    public tm6 R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tm6) ipChange.ipc$dispatch("ed691e97", new Object[]{this});
        }
        return this.A;
    }

    public void R0(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172ea2c9", new Object[]{this, fvbVar});
        } else {
            this.E = fvbVar;
        }
    }

    public void S0(String str, wvb wvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998e6d47", new Object[]{this, str, wvbVar});
        } else if (!TextUtils.isEmpty(str) && wvbVar != null) {
            if (this.u == null) {
                f().d();
            }
            this.u.put(str, wvbVar);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2268c52", new Object[]{this});
            return;
        }
        try {
            this.d = new vc5(this.b);
        } catch (Throwable th) {
            ic5.s(this.f15675a, null, "AsyncRender", "Async_Render_3.0_init_Crash", com.taobao.android.dinamicx.f.V3_ASYNC_RENDER_INIT_CRASH, xv5.a(th));
        }
    }

    public void T0(ra6 ra6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb991", new Object[]{this, ra6Var});
        } else if (ra6Var != null) {
            this.r = ra6Var;
        }
    }

    public void U0(DXRootView dXRootView, DXRootView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354ac94a", new Object[]{this, dXRootView, aVar});
        } else if (dXRootView != null) {
            dXRootView.registerDXRootViewLifeCycle(aVar);
        }
    }

    public void V(DXEngineConfig dXEngineConfig) {
        try {
            dw5 dw5Var = new dw5();
            this.s = dw5Var;
            this.b.u(dw5Var);
            this.u = new HashMap<>();
            Class<? extends zvb> cls = R;
            if (cls != null) {
                this.w = (zvb) cls.newInstance();
            }
            ew5 ew5Var = new ew5(this.u, this.w);
            this.v = ew5Var;
            this.b.v(ew5Var);
        } catch (Throwable th) {
            xv5.b(th);
            ic5.s(this.f15675a, null, "DX_SCRIPT", "DX_SCRIPT_ERROR", com.taobao.android.dinamicx.f.DXSCRIPT_INIT_ERROR, xv5.a(th));
        }
    }

    public boolean V0(long j, evb evbVar) {
        DXLongSparseArray<evb> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2c3e9a", new Object[]{this, new Long(j), evbVar})).booleanValue();
        }
        if (j == 0 || evbVar == null || (dXLongSparseArray = this.e) == null) {
            return false;
        }
        dXLongSparseArray.put(j, evbVar);
        if (evbVar instanceof nb5) {
            nb5 nb5Var = (nb5) evbVar;
            if (!TextUtils.isEmpty(nb5Var.getDxFunctionName())) {
                S0(nb5Var.getDxFunctionName(), nb5Var);
            }
        }
        return true;
    }

    public final p W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("3039961b", new Object[]{this});
        }
        p S2 = S();
        if (zg5.k5()) {
            ThreadLocal<p> threadLocal = new ThreadLocal<>();
            this.l = threadLocal;
            threadLocal.set(S2);
        }
        return S2;
    }

    public boolean W0(long j, mvb mvbVar) {
        DXLongSparseArray<mvb> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f93081", new Object[]{this, new Long(j), mvbVar})).booleanValue();
        }
        if (j == 0 || (dXLongSparseArray = this.f) == null || mvbVar == null) {
            return false;
        }
        dXLongSparseArray.put(j, mvbVar);
        return true;
    }

    public final void X() {
        try {
            Class<? extends cwb> a2 = com.taobao.android.dinamicx.g.s().a();
            if (a2 != null) {
                this.t = (cwb) a2.newInstance();
            }
        } catch (Throwable th) {
            xv5.b(th);
            ic5.s(this.f15675a, null, "DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", com.taobao.android.dinamicx.f.DXSCRIPT_V4_LOGIC_ERROR, xv5.a(th));
        }
    }

    public final void Y(DXEngineConfig dXEngineConfig) {
        DXVideoControlConfig<iew> dXVideoControlConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17824392", new Object[]{this, dXEngineConfig});
            return;
        }
        try {
            if (dXEngineConfig.t() != null) {
                dXVideoControlConfig = dXEngineConfig.t();
            } else {
                dXVideoControlConfig = DXVideoControlConfig.n();
            }
            this.z = new hm6(dXVideoControlConfig, this.f15675a);
            if (zg5.I4() && dXEngineConfig.F()) {
                this.z.e();
            }
        } catch (Throwable th) {
            String str = this.f15675a;
            ic5.s(str, null, "DX_Video_Control", "DX_Video_Control_Init_Crash", com.taobao.android.dinamicx.f.DX_VIDEO_CONTROL_INIT_CRASH, " initTime: " + S + " curTime: " + System.currentTimeMillis() + " trace: " + xv5.a(th));
        }
    }

    public boolean Z0(String str, hdb hdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d96fc12", new Object[]{this, str, hdbVar})).booleanValue();
        }
        if (this.H == null || TextUtils.isEmpty(str) || hdbVar == null) {
            return false;
        }
        ((ConcurrentHashMap) this.H).put(str, hdbVar);
        return true;
    }

    public lub a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lub) ipChange.ipc$dispatch("82729454", new Object[]{this});
        }
        return null;
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0dce20", new Object[]{this});
            return;
        }
        j jVar = P;
        if (jVar != null) {
            jVar.e(this);
        }
    }

    public void a1(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fbd62d", new Object[]{this, iwbVar});
        } else if (iwbVar != null) {
            try {
                j66 j66Var = this.n;
                if (j66Var != null) {
                    j66Var.j(iwbVar);
                }
            } catch (Throwable th) {
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(d().f7286a);
                f.a aVar = new f.a("Engine", "Engine_Register_Notification", com.taobao.android.dinamicx.f.DXERROR_REGISTER_NOTIFICATION_CRASH);
                aVar.e = xv5.a(th);
                fVar.c.add(aVar);
                ic5.p(fVar);
            }
        }
    }

    public void b1(ji6 ji6Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6ba3c8", new Object[]{this, ji6Var, new Long(j)});
        } else {
            this.c.f(ji6Var, j);
        }
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7023e6b", new Object[]{this});
            return;
        }
        this.L = new d56();
        this.K = new tx5(this.L);
    }

    public void c1(xwb xwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41df4b36", new Object[]{this, xwbVar});
        } else if (this.C != null) {
            this.C.a(xwbVar);
        } else if (eb5.E()) {
            rn7.a();
            k0();
            this.C.a(xwbVar);
        }
    }

    @Override // tb.ad5
    public DXEngineConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        return this.B;
    }

    public final void d0(DXEngineConfig dXEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b46c3", new Object[]{this, dXEngineConfig});
            return;
        }
        try {
            this.c = new li6(dXEngineConfig.s());
        } catch (Throwable th) {
            xv5.b(th);
            ic5.s(this.f15675a, null, "Engine", "Engine_Init", com.taobao.android.dinamicx.f.DXERROR_ENGINE_INIT_EXCEPTION_TIMER_ERROR, xv5.a(th));
        }
    }

    @Override // com.taobao.android.dinamicx.j.a
    public String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9b6d4", new Object[]{this});
        }
        if (!j0() || this.o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (f().m()) {
            str = f().g();
        } else {
            str = c();
        }
        sb.append(str);
        sb.append(" DinamicXEngine pipelineCacheSize: ");
        sb.append(this.o.k());
        return sb.toString();
    }

    public final void e0() {
        try {
            this.C = (qvb) com.taobao.android.dinamicx.g.s().c().getClass().newInstance();
            X();
            this.F = new bv5();
        } catch (Throwable th) {
            xv5.b(th);
            ic5.s(this.f15675a, null, "Engine", "Engine_InitEnv", com.taobao.android.dinamicx.f.DXError_INIT_V4, xv5.a(th));
        }
    }

    public boolean e1(long j, qub qubVar) {
        DXLongSparseArray<qub> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31e964d3", new Object[]{this, new Long(j), qubVar})).booleanValue();
        }
        if (j == 0 || qubVar == null || this.g == null) {
            return false;
        }
        if (d().D() && (dXLongSparseArray = this.h) != null) {
            dXLongSparseArray.put(j, this.j.B(j, qubVar));
        }
        this.g.put(j, qubVar);
        return true;
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f58ec7", new Object[]{this});
        } else {
            this.A = new tm6();
        }
    }

    public void f1(iwb iwbVar) {
        j66 j66Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6704436", new Object[]{this, iwbVar});
        } else if (iwbVar != null && (j66Var = this.n) != null) {
            j66Var.k(iwbVar);
        }
    }

    public final DXLongSparseArray<qub> g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("d6ef8550", new Object[]{this});
        }
        if (zg5.T3(this.f15675a)) {
            return new DXReadWriteLongSparseArray(com.taobao.android.dinamicx.g.g);
        }
        if (zg5.Y3(this.f15675a)) {
            return new DXSyncLongSparseArray(com.taobao.android.dinamicx.g.g);
        }
        return new DXLongSparseArray<>(com.taobao.android.dinamicx.g.g);
    }

    public DXResult<DXRootView> h1(Context context, JSONObject jSONObject, DXRootView dXRootView, int i2, int i3, Object obj) {
        Throwable th;
        DXTemplateItem dXTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("4819f085", new Object[]{this, context, jSONObject, dXRootView, new Integer(i2), new Integer(i3), obj});
        }
        try {
            dXTemplateItem = dXRootView.dxTemplateItem;
            try {
                return i1(context, dXRootView, dXTemplateItem, jSONObject, -1, new DXRenderOptions.b().G(i2).t(i3).y(obj).q());
            } catch (Throwable th2) {
                th = th2;
                xv5.b(th);
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
                fVar.b = dXTemplateItem;
                f.a aVar = new f.a("Engine", "Engine_Render", com.taobao.android.dinamicx.f.DXError_EngineRenderException);
                aVar.e = xv5.a(th);
                fVar.c.add(aVar);
                ic5.p(fVar);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            dXTemplateItem = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:26|27|(9:(3:160|29|(20:33|(1:37)|38|(2:40|41)(1:42)|43|44|157|45|(10:47|(1:49)|53|(1:60)|(1:64)|65|(30:70|(1:74)|75|82|(1:84)(1:85)|86|(1:93)(1:92)|94|(1:96)|97|162|(4:99|165|100|(5:102|103|104|105|106)(2:111|112))(1:113)|114|(2:116|(1:118))|(1:123)|(1:127)|128|(1:133)|134|(1:136)|137|138|163|139|(1:141)(1:144)|145|(1:147)|148|149|150)|76|77|78)|52|53|(1:55)|58|60|(2:62|64)|65|(33:67|70|(1:72)|74|75|82|(0)(0)|86|(1:88)|93|94|(0)|97|162|(0)(0)|114|(0)|(2:120|123)|(2:125|127)|128|(2:131|133)|134|(0)|137|138|163|139|(0)(0)|145|(0)|148|149|150)|76|77|78))|163|139|(0)(0)|145|(0)|148|149|150)|81|82|(0)(0)|86|(0)|93|94|(0)|97|162|(0)(0)|114|(0)|(0)|(0)|128|(0)|134|(0)|137|138) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0398, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c1 A[Catch: all -> 0x0398, TryCatch #3 {all -> 0x0398, blocks: (B:104:0x037c, B:112:0x03ac, B:114:0x03b9, B:116:0x03c1, B:118:0x03ca, B:120:0x03dc, B:123:0x03e2, B:125:0x03f6, B:127:0x03fc, B:128:0x041e, B:131:0x0426, B:133:0x042c, B:134:0x043b, B:136:0x0447, B:137:0x0458), top: B:162:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03dc A[Catch: all -> 0x0398, TryCatch #3 {all -> 0x0398, blocks: (B:104:0x037c, B:112:0x03ac, B:114:0x03b9, B:116:0x03c1, B:118:0x03ca, B:120:0x03dc, B:123:0x03e2, B:125:0x03f6, B:127:0x03fc, B:128:0x041e, B:131:0x0426, B:133:0x042c, B:134:0x043b, B:136:0x0447, B:137:0x0458), top: B:162:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f6 A[Catch: all -> 0x0398, TryCatch #3 {all -> 0x0398, blocks: (B:104:0x037c, B:112:0x03ac, B:114:0x03b9, B:116:0x03c1, B:118:0x03ca, B:120:0x03dc, B:123:0x03e2, B:125:0x03f6, B:127:0x03fc, B:128:0x041e, B:131:0x0426, B:133:0x042c, B:134:0x043b, B:136:0x0447, B:137:0x0458), top: B:162:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0447 A[Catch: all -> 0x0398, TryCatch #3 {all -> 0x0398, blocks: (B:104:0x037c, B:112:0x03ac, B:114:0x03b9, B:116:0x03c1, B:118:0x03ca, B:120:0x03dc, B:123:0x03e2, B:125:0x03f6, B:127:0x03fc, B:128:0x041e, B:131:0x0426, B:133:0x042c, B:134:0x043b, B:136:0x0447, B:137:0x0458), top: B:162:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x048c A[Catch: all -> 0x048a, TryCatch #4 {all -> 0x048a, blocks: (B:139:0x0472, B:144:0x048c, B:145:0x0494, B:147:0x04c0, B:148:0x04e5), top: B:163:0x0472 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c0 A[Catch: all -> 0x048a, TryCatch #4 {all -> 0x048a, blocks: (B:139:0x0472, B:144:0x048c, B:145:0x0494, B:147:0x04c0, B:148:0x04e5), top: B:163:0x0472 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d2 A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0192, B:47:0x020b, B:52:0x021b, B:53:0x0240, B:55:0x0246, B:58:0x024e, B:60:0x0254, B:62:0x0261, B:64:0x0265, B:65:0x0277, B:67:0x027d, B:70:0x0284, B:72:0x028a, B:74:0x0290, B:75:0x02a7, B:76:0x02ad, B:82:0x02c9, B:84:0x02d2, B:86:0x02d7, B:88:0x02f0, B:90:0x02f6, B:92:0x0300, B:94:0x033e, B:96:0x0342, B:97:0x0345), top: B:157:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f0 A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0192, B:47:0x020b, B:52:0x021b, B:53:0x0240, B:55:0x0246, B:58:0x024e, B:60:0x0254, B:62:0x0261, B:64:0x0265, B:65:0x0277, B:67:0x027d, B:70:0x0284, B:72:0x028a, B:74:0x0290, B:75:0x02a7, B:76:0x02ad, B:82:0x02c9, B:84:0x02d2, B:86:0x02d7, B:88:0x02f0, B:90:0x02f6, B:92:0x0300, B:94:0x033e, B:96:0x0342, B:97:0x0345), top: B:157:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0342 A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0192, B:47:0x020b, B:52:0x021b, B:53:0x0240, B:55:0x0246, B:58:0x024e, B:60:0x0254, B:62:0x0261, B:64:0x0265, B:65:0x0277, B:67:0x027d, B:70:0x0284, B:72:0x028a, B:74:0x0290, B:75:0x02a7, B:76:0x02ad, B:82:0x02c9, B:84:0x02d2, B:86:0x02d7, B:88:0x02f0, B:90:0x02f6, B:92:0x0300, B:94:0x033e, B:96:0x0342, B:97:0x0345), top: B:157:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView> i1(android.content.Context r35, com.taobao.android.dinamicx.DXRootView r36, com.taobao.android.dinamicx.template.download.DXTemplateItem r37, com.alibaba.fastjson.JSONObject r38, int r39, com.taobao.android.dinamicx.DXRenderOptions r40) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.DinamicXEngine.i1(android.content.Context, com.taobao.android.dinamicx.DXRootView, com.taobao.android.dinamicx.template.download.DXTemplateItem, com.alibaba.fastjson.JSONObject, int, com.taobao.android.dinamicx.DXRenderOptions):com.taobao.android.dinamicx.DXResult");
    }

    public void j(iwb iwbVar) {
        j66 j66Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6879", new Object[]{this, iwbVar});
        } else if (iwbVar != null && (j66Var = this.n) != null) {
            if (j66Var.e() == null) {
                this.n.j(new h(this));
            }
            this.n.b(iwbVar);
        }
    }

    public DXResult<DXRootView> j1(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("9d3c6429", new Object[]{this, dXRootView, jSONObject});
        }
        if (dXRootView != null) {
            try {
                if (!(dXRootView.getContext() == null || dXRootView.dxTemplateItem == null)) {
                    return h1(dXRootView.getContext(), jSONObject, dXRootView, pb6.j(), pb6.i(), null);
                }
            } catch (Throwable th) {
                if (j0()) {
                    th.printStackTrace();
                }
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
                if (dXRootView != null) {
                    fVar.b = dXRootView.dxTemplateItem;
                }
                f.a aVar = new f.a("Engine", "Engine_Render", com.taobao.android.dinamicx.f.DXError_EngineRenderException);
                aVar.e = xv5.a(th);
                fVar.c.add(aVar);
                ic5.p(fVar);
                return new DXResult<>(fVar);
            }
        }
        com.taobao.android.dinamicx.f fVar2 = new com.taobao.android.dinamicx.f(this.f15675a);
        f.a aVar2 = new f.a("Engine", "Engine_Render", com.taobao.android.dinamicx.f.DXError_EngineRenderException);
        aVar2.e = "dxRootView == null || dxRootView.getContext() == null || dxRootView.dxTemplateItem == null";
        fVar2.c.add(aVar2);
        ic5.p(fVar2);
        return new DXResult<>(fVar2);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c612a68", new Object[]{this});
            return;
        }
        qv5 qv5Var = this.y;
        if (qv5Var != null) {
            qv5Var.g();
        }
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb217c9", new Object[]{this});
        } else if (this.C == null) {
            synchronized (this) {
                try {
                    if (this.C == null) {
                        e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        k kVar = this.o;
        if (kVar != null) {
            kVar.h();
        }
        vc5 vc5Var = this.d;
        if (vc5Var != null) {
            vc5Var.F();
        }
        qv5 H = H();
        if (H != null) {
            H.r();
        }
    }

    public void l1(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62564fff", new Object[]{this, activity});
        } else {
            this.D = new WeakReference<>(activity);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d0abc", new Object[]{this});
            return;
        }
        zm6.g().e(this.f15675a);
        if (this.B.D()) {
            zm6.g().d(this.f15675a);
        }
    }

    public DXRuntimeContext m0(Context context, DXRootView dXRootView, DXTemplateItem dXTemplateItem, JSONObject jSONObject, m mVar, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("284c921", new Object[]{this, context, dXRootView, dXTemplateItem, jSONObject, mVar, dXRenderOptions});
        }
        DXRuntimeContext dXRuntimeContext = new DXRuntimeContext(this.b);
        kb6 kb6Var = new kb6(this.b);
        dXRuntimeContext.o = kb6Var;
        kb6Var.h = new WeakReference<>(context);
        kb6 kb6Var2 = dXRuntimeContext.o;
        kb6Var2.f = this.e;
        kb6Var2.g = new WeakReference<>(this.f);
        kb6 kb6Var3 = dXRuntimeContext.o;
        kb6Var3.e = this.g;
        kb6Var3.i = new WeakReference<>(this.m);
        dXRuntimeContext.o.j = new WeakReference<>(mVar);
        kb6 kb6Var4 = dXRuntimeContext.o;
        new WeakReference(this.n);
        kb6Var4.getClass();
        dXRuntimeContext.q = dXTemplateItem;
        dXRuntimeContext.o.q = new WeakReference<>(dXRootView);
        dXRuntimeContext.f0(jSONObject);
        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
        dXRuntimeContext.i = fVar;
        fVar.b = dXTemplateItem;
        dXRuntimeContext.l = 0;
        if (dXRenderOptions != null) {
            dXRuntimeContext.o.m = dXRenderOptions.d();
            dXRuntimeContext.o.n = dXRenderOptions.h();
            dXRuntimeContext.o.c = dXRenderOptions.f();
            dXRuntimeContext.o.f22533a = dXRenderOptions.i();
            dXRuntimeContext.o.b = dXRenderOptions.b();
        }
        return dXRuntimeContext;
    }

    public final void m1(DXTemplateItem dXTemplateItem, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8916084", new Object[]{this, dXTemplateItem, str, new Long(j), map});
        } else {
            ic5.u(0, this.f15675a, "Engine", str, dXTemplateItem, map, j, true);
        }
    }

    public final DXRuntimeContext n0(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXButterRootView dXButterRootView, DXRenderOptions dXRenderOptions) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a4dfcaf9", new Object[]{this, context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions});
        }
        if (dXButterRootView == null || dXButterRootView.getExpandWidgetNode() == null) {
            dXRuntimeContext = new DXRuntimeContext(this.b);
            dXRuntimeContext.o = new kb6(this.b);
            dXRuntimeContext.p = new DXRuntimeContext.a();
        } else {
            dXRuntimeContext = dXButterRootView.getExpandWidgetNode().getDXRuntimeContext();
            dXRuntimeContext.o.l = this.b;
        }
        dXRuntimeContext.o.h = new WeakReference<>(context);
        kb6 kb6Var = dXRuntimeContext.o;
        kb6Var.f = this.e;
        kb6Var.g = new WeakReference<>(this.f);
        kb6 kb6Var2 = dXRuntimeContext.o;
        kb6Var2.e = this.h;
        kb6Var2.i = new WeakReference<>(this.m);
        kb6 kb6Var3 = dXRuntimeContext.o;
        new WeakReference(this.n);
        kb6Var3.getClass();
        dXRuntimeContext.o.k = new WeakReference<>(this.j);
        dXRuntimeContext.o.q = new WeakReference<>(dXButterRootView);
        if (dXRenderOptions != null) {
            dXRuntimeContext.o.m = dXRenderOptions.d();
            dXRuntimeContext.o.n = dXRenderOptions.h();
            dXRuntimeContext.o.c = dXRenderOptions.f();
            dXRuntimeContext.o.f22533a = dXRenderOptions.i();
            dXRuntimeContext.o.b = dXRenderOptions.b();
        }
        DXRuntimeContext.a aVar = dXRuntimeContext.p;
        aVar.f7293a = dXTemplateItem;
        aVar.c = new com.taobao.android.dinamicx.f(this.f15675a);
        DXRuntimeContext.a aVar2 = dXRuntimeContext.p;
        aVar2.c.d = true;
        aVar2.b = jSONObject;
        return dXRuntimeContext;
    }

    public final void n1(DXTemplateItem dXTemplateItem, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7293ffa", new Object[]{this, dXTemplateItem, str, new Long(j), map});
        } else {
            ic5.w(0, this.f15675a, "Engine", str, dXTemplateItem, map, j, true);
        }
    }

    public DXResult<DXRootView> o(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("4cfaaed8", new Object[]{this, context, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            DXRootView dXRootView = new DXRootView(context);
            dXRootView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            dXRootView.dxTemplateItem = null;
            dXRootView.setBindingXManagerWeakReference(this.p);
            return new DXResult<>(dXRootView);
        }
        dXTemplateItem.k(this.B.D());
        if (dXTemplateItem.i(this.f15675a)) {
            return this.j.h(context, dXTemplateItem);
        }
        DXRootView dXRootView2 = new DXRootView(context);
        dXRootView2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        dXRootView2.dxTemplateItem = dXTemplateItem;
        dXRootView2.setBindingXManagerWeakReference(this.p);
        return new DXResult<>(dXRootView2);
    }

    public final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52be6724", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT != 28 || !zg5.A3()) {
            return false;
        }
        return true;
    }

    public void o1(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6a32a6", new Object[]{this, iwbVar});
        } else if (iwbVar != null) {
            try {
                j66 j66Var = this.n;
                if (j66Var != null) {
                    j66Var.m(iwbVar);
                }
            } catch (Throwable th) {
                xv5.a(th);
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(d().f7286a);
                f.a aVar = new f.a("Engine", "Engine_Register_Notification", com.taobao.android.dinamicx.f.DXERROR_UNREGISTER_NOTIFICATION_CRASH);
                aVar.e = xv5.a(th);
                fVar.c.add(aVar);
                ic5.p(fVar);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.j.a
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        on6.i().c(c());
        on6.i().e();
        k kVar = this.o;
        if (kVar != null) {
            kVar.h();
        }
        vc5 vc5Var = this.d;
        if (vc5Var != null) {
            vc5Var.F();
        }
        m();
    }

    public void p(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233f6469", new Object[]{this, list});
            return;
        }
        try {
            this.k.l(list, c());
        } catch (Throwable th) {
            if (j0()) {
                th.printStackTrace();
            }
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
            f.a aVar = new f.a("Engine", "Engine_Download", 30005);
            aVar.e = "downLoadTemplates error " + xv5.a(th);
            fVar.c.add(aVar);
            ic5.p(fVar);
            la6.b(aVar.e);
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void p1(ji6 ji6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0dcb95", new Object[]{this, ji6Var});
        } else {
            this.c.h(ji6Var);
        }
    }

    @Deprecated
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ba9353c", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        vc5 vc5Var = this.d;
        if (vc5Var != null) {
            vc5Var.v();
        }
        kd5 kd5Var = this.p;
        if (!(kd5Var == null || kd5Var.k() == null)) {
            this.p.k().d();
        }
        li6 li6Var = this.c;
        if (li6Var != null) {
            li6Var.d();
        }
        hm6 hm6Var = this.z;
        if (hm6Var != null) {
            hm6Var.c();
        }
        k();
        zvb zvbVar = this.w;
        if (zvbVar != null) {
            try {
                zvbVar.destroy();
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
        cwb cwbVar = this.t;
        if (cwbVar != null) {
            cwbVar.destroy();
        }
        ThreadLocal<p> threadLocal = this.l;
        if (threadLocal != null) {
            threadLocal.remove();
        }
        k kVar = this.o;
        if (kVar != null) {
            kVar.h();
        }
        j jVar = P;
        if (jVar != null) {
            jVar.h(this);
        }
        try {
            AbilityHubAdapter abilityHubAdapter = this.G;
            if (abilityHubAdapter != null) {
                abilityHubAdapter.n();
            }
        } catch (Exception e2) {
            xv5.d(e2);
        }
        s26.e(c());
    }

    public void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        vc5 vc5Var = this.d;
        if (vc5Var != null) {
            vc5Var.w();
        }
        s26.f(c());
    }

    public DXTemplateItem t(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("93b3119c", new Object[]{this, dXTemplateItem});
        }
        p pVar = this.k;
        if (pVar != null) {
            return pVar.n(dXTemplateItem);
        }
        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
        f.a aVar = new f.a("Engine", "Engine_Fetch", 30005);
        aVar.e = "fetchPresetTemplate dxTemplateManager == null";
        ((ArrayList) fVar.c).add(aVar);
        ic5.p(fVar);
        return null;
    }

    public void t0(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f64163", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            dXRootView.onRootViewAppear(-1);
        }
    }

    public DXTemplateItem u(DXTemplateItem dXTemplateItem) {
        xh6 xh6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12c999fb", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        try {
            x0(dXTemplateItem);
            if (this.k == null) {
                com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.f15675a);
                f.a aVar = new f.a("Engine", "Engine_Fetch", com.taobao.android.dinamicx.f.DXError_EngineFetchTemplate_ERROR);
                fVar.b = dXTemplateItem;
                aVar.e = "fetch Template  dxTemplateManager == null";
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
                return null;
            }
            long nanoTime = System.nanoTime();
            DXTemplateItem o = this.k.o(dXTemplateItem);
            HashMap hashMap = new HashMap();
            hashMap.put("exactVersion", "-1");
            if (o != null) {
                o.j();
                o.g = dXTemplateItem.g;
                hashMap.put("exactVersion", String.valueOf(o.b));
            }
            m1(dXTemplateItem, "Engine_Fetch", System.nanoTime() - nanoTime, hashMap);
            if (zg5.v2() && o != null && !o.f && (xh6Var = o.k) != null && !TextUtils.isEmpty(xh6Var.f31396a) && !new File(o.k.f31396a).exists()) {
                dx5.d().f(o.k.f31396a);
            }
            return o;
        } catch (Throwable th) {
            if (j0()) {
                th.printStackTrace();
            }
            com.taobao.android.dinamicx.f fVar2 = new com.taobao.android.dinamicx.f(this.f15675a);
            f.a aVar2 = new f.a("Engine", "Engine_Fetch", com.taobao.android.dinamicx.f.DXError_EngineFetchException);
            fVar2.b = dXTemplateItem;
            aVar2.e = xv5.a(th);
            ((ArrayList) fVar2.c).add(aVar2);
            ic5.p(fVar2);
            return null;
        }
    }

    public void u0(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db36825", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            dXRootView.onRootViewDisappear(-1);
        }
    }

    public y7 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        qv5 H = H();
        if (H != null) {
            return H.p();
        }
        return null;
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public AbilityHubAdapter w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("5c734b22", new Object[]{this});
        }
        return this.G;
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        vc5 vc5Var = this.d;
        if (vc5Var != null) {
            vc5Var.x();
        }
        s26.g(c());
    }

    public Activity y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.D;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void y0(DXRootView dXRootView, Object obj) {
        DXWidgetNode expandWidgetNode;
        JSONObject jSONObject;
        DXWidgetNode expandWidgetNode2;
        JSONObject jSONObject2;
        kd5 kd5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b141deb", new Object[]{this, dXRootView, obj});
            return;
        }
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj;
                String string = jSONObject3.getString("type");
                if ("BNDX".equalsIgnoreCase(string) && (kd5Var = this.p) != null) {
                    kd5Var.q(dXRootView, jSONObject3);
                } else if ("General".equalsIgnoreCase(string)) {
                    if (dXRootView != null && (expandWidgetNode2 = dXRootView.getExpandWidgetNode()) != null && (jSONObject2 = jSONObject3.getJSONObject("params")) != null) {
                        String string2 = jSONObject2.getString("targetId");
                        if (TextUtils.isEmpty(string2) && jSONObject2.containsKey("target")) {
                            string2 = jSONObject2.getString("target");
                        }
                        String string3 = jSONObject2.getString("method");
                        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
                        dXMsgCenterEvent.setParams(jSONObject2);
                        dXMsgCenterEvent.setTargetId(string2);
                        dXMsgCenterEvent.setType(string);
                        dXMsgCenterEvent.setMethod(string3);
                        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode2.queryWidgetNodeByUserId(string2);
                        if (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getReferenceNode() == null) {
                            expandWidgetNode2.sendBroadcastEvent(dXMsgCenterEvent);
                        } else {
                            queryWidgetNodeByUserId.postEvent(dXMsgCenterEvent);
                        }
                    }
                } else if (dXRootView != null && (expandWidgetNode = dXRootView.getExpandWidgetNode()) != null && (jSONObject = jSONObject3.getJSONObject("params")) != null) {
                    String string4 = jSONObject.getString("targetId");
                    DXMsgCenterEvent dXMsgCenterEvent2 = new DXMsgCenterEvent(-1747756056147111305L);
                    dXMsgCenterEvent2.setParams(jSONObject);
                    dXMsgCenterEvent2.setTargetId(string4);
                    dXMsgCenterEvent2.setType(string);
                    DXWidgetNode queryWidgetNodeByUserId2 = expandWidgetNode.queryWidgetNodeByUserId(string4);
                    if (queryWidgetNodeByUserId2 == null) {
                        expandWidgetNode.sendBroadcastEvent(dXMsgCenterEvent2);
                    } else {
                        queryWidgetNodeByUserId2.postEvent(dXMsgCenterEvent2);
                    }
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
            String c2 = c();
            if (TextUtils.isEmpty(c2)) {
                c2 = "dinamicx";
            }
            ic5.s(c2, null, "Engine", "Engine_Post_Message", com.taobao.android.dinamicx.f.ENGINE_POST_MSG_CRASH, xv5.a(th));
        }
    }

    public zvb z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvb) ipChange.ipc$dispatch("40692132", new Object[]{this});
        }
        return this.w;
    }

    public void I0(DXWidgetNode dXWidgetNode, int i2, DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b79247", new Object[]{this, dXWidgetNode, new Integer(i2), dXWidgetRefreshOption});
        } else if (dXWidgetNode != null) {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            if (i2 == 0) {
                dXWidgetNode.setNeedParse(dXWidgetRefreshOption);
            } else if (i2 == 1) {
                dXWidgetNode.setNeedLayout(dXWidgetRefreshOption);
            }
            h36.a("完成局部刷新");
        }
    }

    public final Application Q() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34fd6aa", new Object[]{this});
            return;
        }
        try {
            this.p = new kd5(this.b);
            if (j0()) {
                gfh.f19951a = false;
            }
        } catch (Throwable th) {
            xv5.b(th);
            ic5.s(this.f15675a, null, "DX_BindingX", "DX_BindingX_Crash", com.taobao.android.dinamicx.f.BINDINGX_INIT_CRASH, xv5.a(th));
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc39abbd", new Object[]{this});
            return;
        }
        try {
            this.y = new qv5(this.b);
        } catch (Throwable th) {
            xv5.c(th, false);
            ic5.s(this.f15675a, null, "DX_EventChain", "DX_EventChain_Crash", com.taobao.android.dinamicx.f.EVENTCHAIN_INIT_CRASH, xv5.a(th));
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5602c929", new Object[]{this});
            return;
        }
        this.G = new AbilityHubAdapter(new zq("bizId", "dx"), false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.H = concurrentHashMap;
        concurrentHashMap.putAll(com.taobao.android.dinamicx.g.x);
    }

    public DXResult<DXRootView> z0(Context context, DXTemplateItem dXTemplateItem) {
        DXRootView i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("a6c25ddb", new Object[]{this, context, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return o(context, null);
        }
        dXTemplateItem.k(this.B.D());
        if (!dXTemplateItem.i(this.f15675a)) {
            DXRootView k = zm6.g().k(context, dXTemplateItem, this.f15675a);
            if (k != null) {
                if (j0()) {
                    h36.t("命中3.0预加载view:  " + dXTemplateItem.toString());
                }
                h36.v("命中3.0预加载view:  " + dXTemplateItem.d());
                DXResult<DXRootView> dXResult = new DXResult<>(k);
                dXResult.g(1);
                return dXResult;
            }
        } else if (eb5.z() && (i2 = zm6.g().i(context, dXTemplateItem, this.f15675a)) != null) {
            if (j0()) {
                h36.t("命中dx3.0 butter预加载view:  " + dXTemplateItem);
            }
            h36.v("命中dx3.0 butter预加载view:  " + dXTemplateItem.d());
            DXResult<DXRootView> dXResult2 = new DXResult<>(i2);
            dXResult2.g(1);
            return dXResult2;
        }
        return o(context, dXTemplateItem);
    }

    public static synchronized void i0(Context context, iy5 iy5Var) {
        int i2 = 0;
        synchronized (DinamicXEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fade684", new Object[]{context, iy5Var});
                return;
            }
            try {
                DXTraceUtil.b("DXSDKV3Core#init");
                DXTraceUtil.b("DXSDKV3Core#init#tlog");
                mwb mwbVar = iy5Var.n;
                if (mwbVar != null) {
                    la6.g(mwbVar);
                }
                la6.b("开始初始化DX SDK Engine initialize ");
                DXTraceUtil.c();
                Log.e(h36.TAG, "开始初始化DX SDK Engine initialize ");
            } catch (Throwable th) {
                try {
                    if (j0()) {
                        th.printStackTrace();
                    }
                    String a2 = xv5.a(th);
                    la6.b("DX SDK 初始化失败发生异常 " + a2);
                    new Handler(Looper.getMainLooper()).postDelayed(new b(a2), 10000L);
                } catch (Throwable unused) {
                }
            }
            if (!M) {
                S = System.currentTimeMillis();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    O = applicationContext;
                } else {
                    O = context;
                }
                DXTraceUtil.b("DXSDKV3Core#init#appMonitor");
                N = iy5Var.v;
                kub kubVar = iy5Var.m;
                if (kubVar != null) {
                    ic5.l(kubVar);
                }
                DXTraceUtil.c();
                if (eb5.E()) {
                    DXTraceUtil.b("DXSDKV3Core#init#optparser");
                    com.taobao.android.dinamicx.g.f7313a.f22998a = iy5Var.f;
                    DXTraceUtil.c();
                } else {
                    DXTraceUtil.b("DXSDKV3Core#init#parser");
                    DXLongSparseArray<evb> dXLongSparseArray = iy5Var.e;
                    if (dXLongSparseArray != null) {
                        com.taobao.android.dinamicx.g.e.a(dXLongSparseArray);
                    }
                    DXTraceUtil.c();
                }
                dwb dwbVar = iy5Var.F;
                if (dwbVar != null) {
                    g46.c(dwbVar);
                }
                if (O == null) {
                    com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("initialize");
                    f.a aVar = new f.a("Engine", "SDK_InitEnv", com.taobao.android.dinamicx.f.DXError_SDKInitException);
                    String str = "";
                    if (applicationContext == null) {
                        str = "applicationContext == null";
                    }
                    aVar.e = str;
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                    l0(fVar);
                    la6.b(aVar.e);
                }
                DXTraceUtil.b("DXSDKV3Core#init#parsertonew");
                if (!eb5.E()) {
                    int i3 = 0;
                    while (true) {
                        DXLongSparseArray<evb> dXLongSparseArray2 = com.taobao.android.dinamicx.g.e;
                        if (i3 >= dXLongSparseArray2.size()) {
                            break;
                        }
                        evb valueAt = dXLongSparseArray2.valueAt(i3);
                        if ((valueAt instanceof nb5) && !TextUtils.isEmpty(((nb5) valueAt).getDxFunctionName())) {
                            dw5.g(((nb5) valueAt).getDxFunctionName(), (nb5) valueAt);
                        }
                        i3++;
                    }
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#handler");
                if (eb5.E()) {
                    com.taobao.android.dinamicx.g.c.f20960a = iy5Var.d;
                } else {
                    DXLongSparseArray<mvb> dXLongSparseArray3 = iy5Var.c;
                    if (dXLongSparseArray3 != null) {
                        com.taobao.android.dinamicx.g.f.a(dXLongSparseArray3);
                    }
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#handlertonew");
                if (!eb5.E()) {
                    while (true) {
                        DXLongSparseArray<mvb> dXLongSparseArray4 = com.taobao.android.dinamicx.g.f;
                        if (i2 >= dXLongSparseArray4.size()) {
                            break;
                        }
                        mvb valueAt2 = dXLongSparseArray4.valueAt(i2);
                        if ((valueAt2 instanceof ob5) && !TextUtils.isEmpty(((ob5) valueAt2).getDxFunctionName())) {
                            dw5.g(((ob5) valueAt2).getDxFunctionName(), (ob5) valueAt2);
                        }
                        i2++;
                    }
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#widgetNode");
                if (eb5.E()) {
                    com.taobao.android.dinamicx.g.b.H = iy5Var.h;
                    com.taobao.android.dinamicx.g.d.f20310a = iy5Var.j;
                } else {
                    DXLongSparseArray<qub> dXLongSparseArray5 = iy5Var.g;
                    if (dXLongSparseArray5 != null) {
                        com.taobao.android.dinamicx.g.g.a(dXLongSparseArray5);
                    }
                    DXLongSparseArray<qub> dXLongSparseArray6 = iy5Var.i;
                    if (dXLongSparseArray6 != null) {
                        com.taobao.android.dinamicx.g.h.a(dXLongSparseArray6);
                    }
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#impl");
                hvb hvbVar = iy5Var.l;
                if (hvbVar != null) {
                    com.taobao.android.dinamicx.g.i = hvbVar;
                }
                s sVar = iy5Var.o;
                if (sVar != null) {
                    com.taobao.android.dinamicx.g.j = sVar;
                }
                pwb pwbVar = iy5Var.q;
                if (pwbVar != null) {
                    com.taobao.android.dinamicx.g.k = pwbVar;
                }
                fwb fwbVar = iy5Var.r;
                if (fwbVar != null) {
                    com.taobao.android.dinamicx.g.l = fwbVar;
                }
                hub hubVar = iy5Var.z;
                if (hubVar != null) {
                    com.taobao.android.dinamicx.g.m = hubVar;
                    cb5.f16956a = hubVar;
                }
                zub zubVar = iy5Var.s;
                if (zubVar != null) {
                    com.taobao.android.dinamicx.g.p = zubVar;
                }
                s sVar2 = iy5Var.p;
                if (sVar2 != null) {
                    com.taobao.android.dinamicx.g.o = sVar2;
                }
                IDXHardwareInterface iDXHardwareInterface = iy5Var.A;
                if (iDXHardwareInterface != null) {
                    com.taobao.android.dinamicx.g.n = iDXHardwareInterface;
                }
                owb owbVar = iy5Var.B;
                if (owbVar != null) {
                    com.taobao.android.dinamicx.g.s = owbVar;
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#config");
                zg5.n5();
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#impl2");
                int i4 = iy5Var.x;
                if (i4 != 0) {
                    pb6.a(i4);
                }
                sb5 sb5Var = iy5Var.N;
                if (sb5Var != null) {
                    al6.p(sb5Var);
                }
                dvb dvbVar = iy5Var.t;
                if (dvbVar != null) {
                    DXDarkModeCenter.b = dvbVar;
                }
                tvb tvbVar = iy5Var.f21641a;
                if (tvbVar != null) {
                    rx5.f27661a = tvbVar;
                }
                Class<? extends zvb> cls = iy5Var.y;
                if (cls != null) {
                    R = cls;
                }
                jvb jvbVar = iy5Var.C;
                if (jvbVar != null) {
                    vu5.f30262a = jvbVar;
                }
                if (iy5Var.D != null) {
                    vu5.b = new wu5(iy5Var.D);
                }
                t tVar = iy5Var.E;
                if (tVar != null) {
                    com.taobao.android.dinamicx.g.q = tVar;
                }
                DXDarkModeCenter.f7285a = iy5Var.w;
                mub mubVar = iy5Var.G;
                if (mubVar != null) {
                    com.taobao.android.dinamicx.g.r = mubVar;
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#v4");
                if (eb5.E()) {
                    rn7.b(iy5Var.I, null, null);
                } else {
                    com.taobao.android.dinamicx.g.t = iy5Var.H;
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#impl3");
                IDXApmManager iDXApmManager = iy5Var.K;
                if (iDXApmManager != null) {
                    com.taobao.android.dinamicx.g.u = iDXApmManager;
                }
                List<xwb> list = iy5Var.k;
                if (list != null) {
                    d1(list);
                }
                gub gubVar = iy5Var.J;
                if (gubVar != null) {
                    eb5.J = gubVar;
                }
                kwb kwbVar = iy5Var.L;
                if (kwbVar != null) {
                    com.taobao.android.dinamicx.g.v = kwbVar;
                }
                ixb ixbVar = iy5Var.M;
                if (ixbVar != null) {
                    com.taobao.android.dinamicx.g.w = ixbVar;
                }
                awb awbVar = iy5Var.b;
                if (awbVar != null) {
                    com.taobao.android.dinamicx.g.y = awbVar;
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#initWhiteList");
                on6.i().k();
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#listener");
                X0(x());
                s26.l(x());
                s26.u();
                K0();
                if (!eb5.E()) {
                    DXModuleManager.getInstance().init();
                }
                DXTraceUtil.c();
                DXTraceUtil.b("DXSDKV3Core#init#ab");
                eb5.d();
                eb5.e();
                cb5.a();
                DXTraceUtil.c();
                M = true;
                Log.e(h36.TAG, "完成DX SDK Engine initialize");
                la6.b("完成DX SDK Engine initialize ");
                DXTraceUtil.c();
            }
        }
    }

    public boolean J0(long j, w8 w8Var) {
        qv5 qv5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9aec1e3", new Object[]{this, new Long(j), w8Var})).booleanValue();
        }
        if (j == 0 || w8Var == null || (qv5Var = this.y) == null) {
            return false;
        }
        qv5Var.p().i(String.valueOf(j), w8Var);
        return true;
    }

    public boolean M0(String str, w8 w8Var) {
        qv5 qv5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d68019ca", new Object[]{this, str, w8Var})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || w8Var == null || (qv5Var = this.y) == null) {
            return false;
        }
        qv5Var.p().i(str, w8Var);
        return true;
    }

    public boolean Q0(long j, qub qubVar) {
        DXLongSparseArray<qub> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee077e4c", new Object[]{this, new Long(j), qubVar})).booleanValue();
        }
        if (j == 0 || qubVar == null || (dXLongSparseArray = this.g) == null) {
            return false;
        }
        dXLongSparseArray.put(j, qubVar);
        return true;
    }

    public final void x0(DXTemplateItem dXTemplateItem) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a13a216", new Object[]{this, dXTemplateItem});
            return;
        }
        dXTemplateItem.d = new ArrayList();
        if (!TextUtils.isEmpty(dXTemplateItem.c)) {
            char[] charArray = dXTemplateItem.c.toCharArray();
            int length = charArray.length - 1;
            while (true) {
                if (length < 0) {
                    i2 = 0;
                    break;
                } else if (charArray[length] == '?') {
                    i2 = length + 1;
                    break;
                } else {
                    length--;
                }
            }
            if (i2 > 0) {
                StringBuilder sb = new StringBuilder();
                while (i2 < charArray.length) {
                    char c2 = charArray[i2];
                    if (c2 != '=') {
                        sb.append(c2);
                    } else if (sb.toString().equalsIgnoreCase(URL_SKIP_VERSION_KEY)) {
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = i2 + 1;
                        while (true) {
                            if (i3 < charArray.length) {
                                char c3 = charArray[i3];
                                if (c3 == '&') {
                                    sb.setLength(0);
                                    i2 = i3;
                                    break;
                                }
                                sb2.append(c3);
                                i3++;
                            } else {
                                break;
                            }
                        }
                        dXTemplateItem.d.add(sb2.toString());
                    } else {
                        sb.setLength(0);
                    }
                    i2++;
                }
            }
        }
    }

    public final p S() {
        dx5 dx5Var;
        p pVar = new p(this.b, O);
        if (!j0()) {
            return pVar;
        }
        try {
            Class<?> cls = Class.forName("com.taobao.android.dinamicx.DXDevTemplateManager");
            Method method = cls.getMethod("getDXDevFileManager", new Class[0]);
            p pVar2 = null;
            if (method != null) {
                method.setAccessible(true);
                dx5Var = (dx5) method.invoke(null, new Object[0]);
            } else {
                dx5Var = null;
            }
            Method method2 = cls.getMethod("newDXDevTemplateManager", av5.class, Context.class);
            if (method2 != null) {
                method2.setAccessible(true);
                pVar2 = (p) method2.invoke(null, this.b, O);
            }
            if (pVar2 == null || dx5Var == null) {
                return pVar;
            }
            dx5.l(dx5Var);
            return pVar2;
        } catch (Exception unused) {
            return pVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(String str) {
        try {
            if (zg5.h5() && !M) {
                DinamicXLauncherV3.class.getMethod("init", Application.class, HashMap.class).invoke(null, Q(), null);
                Log.e(h36.TAG, "DX 没有在启动任务初始化，补偿初始化" + str);
                la6.b("DX 没有在启动任务初始化，补偿初始化" + str);
                ic5.s(this.f15675a, null, "Engine", "Engine_InitEnv", com.taobao.android.dinamicx.f.DXError_INIT_30021, "进行dx sdkde 补偿初始化");
            }
        } catch (Exception e2) {
            la6.b(str + "DX 没有在启动任务初始化，补偿初始化" + xv5.a(e2));
        }
    }

    public rv5 r(String str, DXRootView dXRootView, JSONObject jSONObject, String str2, nv5 nv5Var) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("c8ab52a5", new Object[]{this, str, dXRootView, jSONObject, str2, nv5Var});
        }
        rv5[] rv5VarArr = {null};
        if (this.y == null) {
            rv5 a2 = rv5.a(-999, "eventChainManager ==  null");
            rv5VarArr[0] = a2;
            return a2;
        } else if (TextUtils.isEmpty(str)) {
            rv5 a3 = rv5.a(-998, "eventChainName 是空");
            rv5VarArr[0] = a3;
            return a3;
        } else {
            if (nv5Var != null && nv5Var.a() != null) {
                dXWidgetNode = nv5Var.a();
            } else if (dXRootView == null) {
                rv5 a4 = rv5.a(-997, "rootView 是空");
                rv5VarArr[0] = a4;
                return a4;
            } else {
                dXWidgetNode = dXRootView.getExpandWidgetNode();
            }
            if (dXWidgetNode == null) {
                rv5 a5 = rv5.a(-996, "rootExpandNode 是空");
                rv5VarArr[0] = a5;
                return a5;
            }
            if (!TextUtils.isEmpty(str2)) {
                dXWidgetNode = dXWidgetNode.queryWidgetNodeByUserId(str2);
            }
            new mv5(new i(this, rv5VarArr)).e(null, jSONObject != null ? new Object[]{str, jSONObject} : new Object[]{str}, dXWidgetNode.getDXRuntimeContext(), null);
            return rv5VarArr[0];
        }
    }

    public rv5 s(String str, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, JSONObject jSONObject, String str2, nv5 nv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("c941339e", new Object[]{this, str, dXWidgetNode, dXWidgetNode2, jSONObject, str2, nv5Var});
        }
        rv5[] rv5VarArr = {null};
        if (this.y == null) {
            rv5 a2 = rv5.a(-999, "eventChainManager ==  null");
            rv5VarArr[0] = a2;
            return a2;
        } else if (TextUtils.isEmpty(str)) {
            rv5 a3 = rv5.a(-998, "eventChainName 是空");
            rv5VarArr[0] = a3;
            return a3;
        } else {
            if (dXWidgetNode2 == null) {
                dXWidgetNode2 = dXWidgetNode;
            }
            new mv5(new a(this, rv5VarArr)).e(null, jSONObject != null ? new Object[]{str, jSONObject} : new Object[]{str}, dXWidgetNode.getDXRuntimeContext(), dXWidgetNode2);
            return rv5VarArr[0];
        }
    }
}
