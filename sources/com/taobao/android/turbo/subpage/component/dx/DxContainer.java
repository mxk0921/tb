package com.taobao.android.turbo.subpage.component.dx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.k66;
import tb.ni8;
import tb.od0;
import tb.s18;
import tb.t2o;
import tb.tfs;
import tb.u18;
import tb.unf;
import tb.vfs;
import tb.w1a;
import tb.xhv;
import tb.y7;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DESTROY_DELAY = 2;
    public static final int DESTROY_IN_TIME = 1;
    public static final int DESTROY_NOT_DESTROY = 3;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f9798a;
    public DXRootView b;
    public DinamicXEngine c;
    public int d;
    public int e;
    public String f;
    public b g;
    public final boolean h;
    public final boolean i;
    public g1a<? super k66, xhv> j;
    public boolean k;
    public boolean l;
    public int m;
    public final w1a<unf, Boolean, Integer, xhv> n;
    public final Context o;
    public final String p;
    public final String q;
    public final String r;
    public static final a Companion = new a(null);
    public static final c s = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455727);
        }

        public a() {
        }

        public final DxContainer a(Context context, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DxContainer) ipChange.ipc$dispatch("fb0ec52c", new Object[]{this, context, str, str2, str3});
            }
            ckf.g(context, "context");
            ckf.g(str, "bizType");
            ckf.g(str2, PopConst.BRIDGE_KEY_BUSINESS_ID);
            ckf.g(str3, DxContainerActivity.PARAMS_NAMESPACE);
            if (ckf.b(vfs.g().e("weitao_switch", "openDxContainerVersionManager", "false"), "true")) {
                DxTemplateVersionManager.INSTANCE.m();
            }
            if (ckf.b(vfs.g().e("weitao_switch", "openDxContainerCache", "false"), "true")) {
                return DxContainer.b().f(context, str, str2, str3);
            }
            return new DxContainer(context, str, str2, str3, null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f9799a = new JSONObject();
        public final JSONObject b = new JSONObject();

        static {
            t2o.a(916455728);
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
            }
            return this.b;
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b86be6c5", new Object[]{this});
            }
            return this.f9799a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Handler f9800a;
        public final List<DxContainer> b = new ArrayList();
        public final List<DxContainer> c = new ArrayList();
        public long d = 120;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ DxContainer b;

            public a(DxContainer dxContainer) {
                this.b = dxContainer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.b(c.this).contains(this.b)) {
                    this.b.k();
                    c.b(c.this).remove(this.b);
                    c.a(c.this).remove(this.b);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c cVar = c.this;
                    String e = vfs.g().e("weitao_switch", "dxContainerDestroyDelayTime", "120");
                    ckf.f(e, "TNodeOrange.getInstance(…DestroyDelayTime\", \"120\")");
                    c.c(cVar, Long.parseLong(e));
                } catch (Throwable unused) {
                    tfs.e("DxContainer", "读取orange销毁延时配置异常");
                }
            }
        }

        static {
            t2o.a(916455729);
        }

        public static final /* synthetic */ List a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("91b4008c", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static final /* synthetic */ List b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("23b8fca9", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static final /* synthetic */ void c(c cVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34359023", new Object[]{cVar, new Long(j)});
            } else {
                cVar.d = j;
            }
        }

        public final Handler d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("b90bbf7d", new Object[]{this});
            }
            if (this.f9800a == null) {
                tfs.e("DxContainer", "创建cache 的Handler");
                this.f9800a = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f9800a;
            ckf.d(handler);
            return handler;
        }

        public final void e(DxContainer dxContainer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc78ac4", new Object[]{this, dxContainer, new Integer(i)});
                return;
            }
            ckf.g(dxContainer, NativeContainerProvider.DX_CONTAINER);
            tfs.e("DxContainer", "destroyDxContainer 标识为" + i);
            if (i == 1) {
                dxContainer.k();
                ((ArrayList) this.b).remove(dxContainer);
            } else if (i == 2) {
                ((ArrayList) this.c).add(dxContainer);
                d().postDelayed(new a(dxContainer), this.d * 1000);
            }
        }

        public final DxContainer f(Context context, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DxContainer) ipChange.ipc$dispatch("815f29a0", new Object[]{this, context, str, str2, str3});
            }
            ckf.g(context, "context");
            ckf.g(str, "bizType");
            ckf.g(str2, PopConst.BRIDGE_KEY_BUSINESS_ID);
            ckf.g(str3, DxContainerActivity.PARAMS_NAMESPACE);
            String str4 = str + '_' + str3 + '_' + str2;
            tfs.e("DxContainer", "obtainDxContainer 标识为：" + str4);
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                DxContainer dxContainer = (DxContainer) it.next();
                if (ckf.b(str4, dxContainer.t())) {
                    tfs.e("DxContainer", "obtainDxContainer 找到相同标识的容器，返回缓存");
                    if (((ArrayList) this.c).contains(dxContainer)) {
                        ((ArrayList) this.c).remove(dxContainer);
                    }
                    return dxContainer;
                }
            }
            tfs.e("DxContainer", "obtainDxContainer 没找到相同标识的容器，重新创建对象");
            DxContainer dxContainer2 = new DxContainer(context, str, str2, str3, null);
            ((ArrayList) this.b).add(dxContainer2);
            d().postDelayed(new b(), 1000L);
            return dxContainer2;
        }
    }

    static {
        t2o.a(916455726);
    }

    public DxContainer(Context context, String str, String str2, String str3) {
        this.o = context;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.f9798a = new FrameLayout(context);
        this.f = "";
        this.h = true;
        this.i = true;
        this.n = new DxContainer$updateListener$1(this);
    }

    public static final /* synthetic */ View a(DxContainer dxContainer, int i, int i2, DXTemplateItem dXTemplateItem, b bVar, long j, g1a g1aVar, w1a w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2488cb2e", new Object[]{dxContainer, new Integer(i), new Integer(i2), dXTemplateItem, bVar, new Long(j), g1aVar, w1aVar});
        }
        return dxContainer.p(i, i2, dXTemplateItem, bVar, j, g1aVar, w1aVar);
    }

    public static final /* synthetic */ c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("54d1dc8", new Object[0]);
        }
        return s;
    }

    public static final /* synthetic */ int c(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("571e9247", new Object[]{dxContainer})).intValue();
        }
        return dxContainer.d;
    }

    public static final /* synthetic */ int d(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6276cdfe", new Object[]{dxContainer})).intValue();
        }
        return dxContainer.e;
    }

    public static final /* synthetic */ b e(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e8f3e6f0", new Object[]{dxContainer});
        }
        return dxContainer.g;
    }

    public static final /* synthetic */ String f(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b9b1b82", new Object[]{dxContainer});
        }
        return dxContainer.f;
    }

    public static final /* synthetic */ DinamicXEngine g(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("3a6625e2", new Object[]{dxContainer});
        }
        return dxContainer.c;
    }

    public static final /* synthetic */ boolean h(DxContainer dxContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bfacbfa", new Object[]{dxContainer})).booleanValue();
        }
        return dxContainer.l;
    }

    public static final /* synthetic */ void i(DxContainer dxContainer, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b53402a", new Object[]{dxContainer, dXRootView});
        } else {
            dxContainer.b = dXRootView;
        }
    }

    public static final /* synthetic */ View j(DxContainer dxContainer, String str, String str2, String str3, String str4, d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f0e678f3", new Object[]{dxContainer, str, str2, str3, str4, d1aVar});
        }
        return dxContainer.G(str, str2, str3, str4, d1aVar);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onResume");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.s0();
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onStart");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.v0();
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onStop");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.w0();
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4b20fe3", new Object[]{this})).booleanValue();
        }
        return ckf.b(vfs.g().e("weitao_switch", "openDxContainerCache", "false"), "true");
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938195c3", new Object[]{this, str});
        } else if (this.h) {
            DxTemplateVersionManager.INSTANCE.r(str, this.n);
        }
    }

    public final void F(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{this, str, str2});
            return;
        }
        String[] strArr = {"errorMessage=" + str, "errorStack=" + str2};
        od0 D = od0.D();
        ckf.f(D, "AdapterFactory.instance()");
        D.d().a("TNode", 19997, "dxContainerError", null, null, (String[]) Arrays.copyOf(strArr, 2));
    }

    public final View H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e0b60ccd", new Object[]{this});
        }
        tfs.e("DxContainer", "显示loading页");
        return this.f9798a;
    }

    public final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2670a8a", new Object[]{this, str});
        } else if (this.h) {
            DxTemplateVersionManager.INSTANCE.t(str, this.n);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ebccc5", new Object[]{this});
        } else if (!this.l) {
            tfs.e("DxContainer", "callRealDestroy");
            I(this.f);
            this.l = true;
            try {
                DinamicXEngine dinamicXEngine = this.c;
                if (dinamicXEngine != null) {
                    g1a<? super k66, xhv> g1aVar = this.j;
                    if (g1aVar != null) {
                        dinamicXEngine.o1(new u18(g1aVar));
                    }
                    DinamicXEngine dinamicXEngine2 = this.c;
                    ckf.d(dinamicXEngine2);
                    dinamicXEngine2.q0();
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                tfs.e("DxContainer", "callRealDestroy Error:".concat(message));
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7351d079", new Object[]{this});
        } else if (this.c == null) {
            DXEngineConfig.b bVar = new DXEngineConfig.b(this.p);
            bVar.W(true);
            bVar.J(new y7(new zq(this.q, this.r), null));
            this.c = new DinamicXEngine(bVar.F());
            tfs.e("DxContainer", "createDXEngine 创建引擎：bizType:" + this.p + ",businessId:" + this.q + ",nameSpace:" + this.r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tb.s18] */
    public final View m(String str, String str2, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b4ea6f35", new Object[]{this, str, str2, d1aVar});
        }
        Context context = this.o;
        if (d1aVar != null) {
            d1aVar = new s18(d1aVar);
        }
        return ni8.b(context, str, "", str2, null, (ni8.c) d1aVar);
    }

    public final JSONObject q(b bVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5b3c0a6", new Object[]{this, bVar, str, new Long(j)});
        }
        JSONObject a2 = bVar.a();
        a2.put((JSONObject) "orangeParams", (String) u(str));
        a2.put((JSONObject) "renderTime", (String) Long.valueOf(j));
        a2.put((JSONObject) "readLocalIOTime", (String) Long.valueOf(DxTemplateVersionManager.INSTANCE.h()));
        return a2;
    }

    public final DXRootView r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("39124f9f", new Object[]{this});
        }
        return this.b;
    }

    public final DinamicXEngine s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.c;
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return this.p + '_' + this.r + '_' + this.q;
    }

    public final JSONObject u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b6929fb", new Object[]{this, str});
        }
        try {
            vfs g = vfs.g();
            JSONObject parseObject = JSON.parseObject(g.e("weitao_switch", str + "_config", "{}"));
            ckf.f(parseObject, "JSONObject.parseObject(orangeParamsString)");
            return parseObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onCreate");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.p0();
        }
    }

    public final void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24115721", new Object[]{this, new Integer(i)});
            return;
        }
        tfs.e("DxContainer", "onDestroy: 标记：" + i);
        if (D()) {
            s.e(this, i);
        } else {
            k();
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onPageAppear");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.t0(this.b);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbea805c", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onPageDisAppear");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.u0(this.b);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        tfs.e("DxContainer", "onPause");
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine != null) {
            dinamicXEngine.r0();
        }
    }

    public final View G(String str, String str2, String str3, String str4, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8315c428", new Object[]{this, str, str2, str3, str4, d1aVar});
        }
        tfs.e("DxContainer", "显示错误页");
        F(str3, str4);
        if (this.m < 1) {
            d1aVar.invoke();
            this.m++;
            return this.f9798a;
        }
        try {
            View m = m(str, str2, d1aVar);
            this.f9798a.removeAllViews();
            this.f9798a.addView(m);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            tfs.e("DxContainer", "错误页展示异常".concat(message));
        }
        return this.f9798a;
    }

    public final View o(int i, int i2, String str, b bVar, w1a<? super Boolean, ? super DXResult<DXRootView>, ? super DXResult<DXRootView>, xhv> w1aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("87aa5794", new Object[]{this, new Integer(i), new Integer(i2), str, bVar, w1aVar});
        }
        ckf.g(str, "name");
        tfs.e("DxContainer", "createView: name:".concat(str));
        if (!this.i || !ckf.b(this.f, str) || this.b == null) {
            unf i3 = DxTemplateVersionManager.INSTANCE.i(str);
            long c2 = i3 != null ? i3.c() : -1L;
            if (i3 == null || (str2 = i3.e()) == null) {
                str2 = "";
            }
            return n(i, i2, str, c2, str2, bVar, null, w1aVar);
        }
        this.f9798a.removeAllViews();
        this.f9798a.addView(this.b);
        tfs.e("DxContainer", "dxRootView 已经存在，复用该View");
        if (w1aVar != null) {
            w1aVar.invoke(Boolean.TRUE, null, null);
        }
        return this.f9798a;
    }

    public /* synthetic */ DxContainer(Context context, String str, String str2, String str3, a07 a07Var) {
        this(context, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [tb.q18] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.taobao.android.dinamicx.template.download.DXTemplateItem, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n(int r22, int r23, java.lang.String r24, long r25, java.lang.String r27, com.taobao.android.turbo.subpage.component.dx.DxContainer.b r28, tb.g1a<? super tb.k66, tb.xhv> r29, tb.w1a<? super java.lang.Boolean, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, tb.xhv> r30) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.subpage.component.dx.DxContainer.n(int, int, java.lang.String, long, java.lang.String, com.taobao.android.turbo.subpage.component.dx.DxContainer$b, tb.g1a, tb.w1a):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00eb, code lost:
        if (r2 != null) goto L_0x00f0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View p(int r22, int r23, com.taobao.android.dinamicx.template.download.DXTemplateItem r24, com.taobao.android.turbo.subpage.component.dx.DxContainer.b r25, long r26, tb.g1a<? super tb.k66, tb.xhv> r28, tb.w1a<? super java.lang.Boolean, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, ? super com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView>, tb.xhv> r29) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.subpage.component.dx.DxContainer.p(int, int, com.taobao.android.dinamicx.template.download.DXTemplateItem, com.taobao.android.turbo.subpage.component.dx.DxContainer$b, long, tb.g1a, tb.w1a):android.view.View");
    }
}
