package com.taobao.android.icart.weex.instance;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.performance.CartWeexPerformance;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.megadesign.view.LoadingView;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.b6x;
import tb.c9x;
import tb.ckf;
import tb.d1a;
import tb.h15;
import tb.hav;
import tb.j2e;
import tb.j6x;
import tb.jt2;
import tb.m9u;
import tb.na3;
import tb.ne3;
import tb.o9x;
import tb.pb6;
import tb.pg1;
import tb.q6x;
import tb.qnm;
import tb.rb3;
import tb.t2o;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseHybridInstance implements j2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final List<String> p = yz3.m("startTime.update", "receive.prefetch", "preload.update", "listTop");

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f8066a;
    public final CartWeexPerformance d;
    public final String e;
    public Activity f;
    public boolean g;
    public BaseICartFragmentProxy h;
    public boolean i;
    public volatile WeexInstance j;
    public final boolean l;
    public boolean m;
    public volatile boolean n;
    public LoadingView o;
    public final CopyOnWriteArrayList<d1a<xhv>> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<d1a<xhv>> c = new CopyOnWriteArrayList<>();
    public final AtomicBoolean k = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478151005);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151006);
            t2o.a(982515791);
        }

        public b() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            BaseHybridInstance.this.G(true);
            String str2 = BaseHybridInstance.this.name() + " onRenderFailed type=" + weexErrorType + ", errorMsg=" + str;
            hav.d(c9x.TAG, str2);
            BaseICartFragmentProxy i = BaseHybridInstance.this.i();
            if (i != null) {
                i.a(str2);
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            } else {
                BaseHybridInstance.this.K(true);
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            BaseICartFragmentProxy i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            BaseHybridInstance.this.G(true);
            String str2 = BaseHybridInstance.this.name() + " onScriptException type=" + weexErrorType + ", errorMsg=" + str;
            hav.d(c9x.TAG, str2);
            if (OrangeUtil.INSTANCE.isJSExceptionDowngrade() && (i = BaseHybridInstance.this.i()) != null) {
                i.a(str2);
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            BaseHybridInstance.this.G(true);
            String str2 = BaseHybridInstance.this.name() + " onInitFailed type=" + weexErrorType + ", errorMsg=" + str;
            hav.d(c9x.TAG, str2);
            BaseICartFragmentProxy i = BaseHybridInstance.this.i();
            if (i != null) {
                i.a(str2);
            }
        }
    }

    public BaseHybridInstance(boolean z) {
        FrameLayout frameLayout = new FrameLayout(Globals.getApplication());
        this.f8066a = frameLayout;
        CartWeexPerformance cartWeexPerformance = new CartWeexPerformance();
        this.d = cartWeexPerformance;
        this.e = "";
        this.l = z;
        this.e = rb3.INSTANCE.c();
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.icart_weex_root_view);
        cartWeexPerformance.F(z);
    }

    public static final /* synthetic */ void n(BaseHybridInstance baseHybridInstance, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24fabdbf", new Object[]{baseHybridInstance, str, str2, jSONObject});
        } else {
            baseHybridInstance.u(str, str2, jSONObject);
        }
    }

    public final CartWeexPerformance A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartWeexPerformance) ipChange.ipc$dispatch("cb569b16", new Object[]{this});
        }
        return this.d;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6655445", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final JSONObject C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82c3cfa6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (l()) {
            return jSONObject;
        }
        BaseICartFragmentProxy baseICartFragmentProxy = this.h;
        QueryParamsManager i = baseICartFragmentProxy != null ? baseICartFragmentProxy.i() : null;
        if (i != null) {
            jSONObject.put((JSONObject) "pageName", i.o());
            jSONObject.put((JSONObject) "cartFrom", i.f());
            jSONObject.put((JSONObject) na3.sKeyFeedFlowType, i.k());
            JSONObject g = i.g();
            if (g != null) {
                jSONObject.put((JSONObject) "cartSortParams", (String) g);
            }
            String e = i.e();
            if (e != null) {
                jSONObject.put((JSONObject) "cartCustomExParam", e);
            }
            String n = i.n();
            if (n != null) {
                jSONObject.put((JSONObject) "onceCustomExParams", n);
            }
            String l = i.l();
            if (l != null) {
                jSONObject.put((JSONObject) "holdCustomExParams", l);
            }
            if (i.v()) {
                jSONObject.put((JSONObject) "removeRecmd", (String) Boolean.valueOf(i.v()));
            }
            if (i.t()) {
                jSONObject.put((JSONObject) RequestConfig.IS_FULL_DATA_QUERY, (String) Boolean.valueOf(i.t()));
            }
            if (i.u()) {
                jSONObject.put((JSONObject) "isPrehot", (String) Boolean.valueOf(i.u()));
            }
            if (i.b()) {
                jSONObject.put((JSONObject) "disableFirstPageCache", (String) Boolean.valueOf(i.b()));
            }
        }
        return jSONObject;
    }

    public abstract WeexInstance D(String str);

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf0e3cc", new Object[]{this});
            return;
        }
        ne3.a aVar = new ne3.a("initWithURL");
        h15 tag = aVar.tag("未获取到ZCache/内置文件，使用initWithURL");
        tag.message("当前url=" + c9x.Companion.b()).dimension("d1", String.valueOf(OrangeUtil.INSTANCE.isLoadRawFile())).dimension("d2", name());
        ne3.Companion.c(aVar);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d234ee7", new Object[]{this});
            return;
        }
        f("startTime.update", this.d.e());
        if (this instanceof qnm) {
            j2e.a.a(this, "preload.update", null, 2, null);
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f807dfe", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void H(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54367c73", new Object[]{this, activity});
        } else {
            this.f = activity;
        }
    }

    public final void I(BaseICartFragmentProxy baseICartFragmentProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cbfd08", new Object[]{this, baseICartFragmentProxy});
        } else {
            this.h = baseICartFragmentProxy;
        }
    }

    public final void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6049cbf", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd7d1c2", new Object[]{this, new Boolean(z)});
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7febfc52", new Object[]{this});
        } else {
            rb3.d(this.e);
        }
    }

    @Override // tb.j2e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a1f88d", new Object[]{this});
        } else if (this.j == null) {
            hav.d(c9x.TAG, "showRecoverSurface instance is null, return");
        } else {
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#showRecoverSurface");
            long currentTimeMillis = System.currentTimeMillis();
            WeexInstance weexInstance = this.j;
            q6x q6xVar = weexInstance != null ? (q6x) weexInstance.getExtend(q6x.class) : null;
            if (q6xVar == null) {
                ne3.c.e(ne3.Companion, "GetWeexInstanceUnicornExtError", "showRecoverSurface获取weexInstanceUnicornExt为null", 0.0f, 4, null);
            } else {
                q6xVar.a();
            }
            ne3.c.h(ne3.Companion, c9x.TAG, "ShowRecoverSurface", System.currentTimeMillis() - currentTimeMillis, 0.0f, 8, null);
            aVar.b("Cart#showRecoverSurface");
        }
    }

    @Override // tb.j2e
    public void b(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47475f5", new Object[]{this, str, str2, jSONObject});
            return;
        }
        ckf.g(str, "callbackID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        synchronized (this) {
            if (!this.n) {
                ArrayList arrayList = new ArrayList();
                this.b.add(new BaseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1(arrayList, this, str2, str, jSONObject));
                if (!p.contains(str2)) {
                    ne3.c cVar = ne3.Companion;
                    ne3.c.e(cVar, "DispatchEventNotBizReady", "preMethods=" + arrayList + ",currentMethod=" + str2, 0.0f, 4, null);
                }
                return;
            }
            xhv xhvVar = xhv.INSTANCE;
            u(str, str2, jSONObject);
        }
    }

    @Override // tb.j2e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b64cf1", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    @Override // tb.j2e
    public void d(Activity activity) {
        Context context;
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5303bdf9", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        this.f = activity;
        WeexInstance weexInstance2 = this.j;
        if (weexInstance2 != null) {
            context = weexInstance2.getContext();
        } else {
            context = null;
        }
        if ((context instanceof Application) && (weexInstance = this.j) != null) {
            weexInstance.resetContext(activity);
        }
    }

    @Override // tb.j2e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.k.getAndSet(true)) {
            WeexInstance weexInstance = this.j;
            if (weexInstance != null) {
                weexInstance.destroy();
            }
            L();
            this.f8066a.removeAllViews();
        }
    }

    @Override // tb.j2e
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9502b18", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.j2e
    public void f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75fd43f", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "method");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        b("", str, jSONObject);
    }

    @Override // tb.j2e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5fae55", new Object[]{this});
        } else if (!this.n) {
            synchronized (this) {
                try {
                    hav.d(c9x.TAG, "callBizReady");
                    this.n = true;
                    Iterator<T> it = this.b.iterator();
                    while (it.hasNext()) {
                        ((d1a) it.next()).invoke();
                    }
                    this.b.clear();
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.j2e
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.j2e
    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.j2e
    public LoadingView getLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoadingView) ipChange.ipc$dispatch("87349190", new Object[]{this});
        }
        if (this.o == null) {
            Application application = Globals.getApplication();
            ckf.f(application, "Globals.getApplication()");
            this.o = new LoadingView(application);
        }
        LoadingView loadingView = this.o;
        ckf.d(loadingView);
        return loadingView;
    }

    @Override // tb.j2e
    public ViewGroup getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.f8066a;
    }

    @Override // tb.j2e
    public CartWeexPerformance h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartWeexPerformance) ipChange.ipc$dispatch("9a39f9d7", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.j2e
    public BaseICartFragmentProxy i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("336a5ca1", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.j2e
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70be4c64", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.j2e
    public void k(BaseICartFragmentProxy baseICartFragmentProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7891dc3f", new Object[]{this, baseICartFragmentProxy});
            return;
        }
        ckf.g(baseICartFragmentProxy, pg1.ATOM_proxy);
        this.h = baseICartFragmentProxy;
    }

    @Override // tb.j2e
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e360ef", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    @Override // tb.j2e
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4fcadb", new Object[]{this});
        } else if (this.j == null) {
            this.c.add(new BaseHybridInstance$reportEnterWeexPage$1(this));
        } else {
            F();
            this.d.g();
        }
    }

    public final void o() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeeaaef", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            view = weexInstance.getRootView();
        } else {
            view = null;
        }
        if (view != null && this.f8066a.indexOfChild(view) == -1) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            }
            RecyclerView recyclerView = new RecyclerView(Globals.getApplication());
            recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(0, 0));
            recyclerView.setDescendantFocusability(131072);
            this.f8066a.addView(recyclerView);
            this.f8066a.addView(view);
        }
    }

    @Override // tb.j2e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.j2e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.m) {
            WeexInstance weexInstance = this.j;
            if (weexInstance != null) {
                weexInstance.onActivityPause();
            }
            this.m = false;
        }
    }

    @Override // tb.j2e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.m) {
            this.m = true;
            WeexInstance weexInstance = this.j;
            if (weexInstance != null) {
                weexInstance.onActivityResume();
            }
        }
    }

    @Override // tb.j2e
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
    }

    @Override // tb.j2e
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b143439", new Object[]{this});
        } else {
            rb3.INSTANCE.a(this.e, this);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51bb68d", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        if (this.j == null) {
            this.d.v(name());
            this.d.t(this instanceof qnm);
            q();
            WeexInstance D = D(str + "&mainInstanceID=" + this.e);
            if (D != null) {
                this.j = D;
                this.d.i(System.currentTimeMillis());
                hav.d(c9x.TAG, "正常实例创建完成 instanceID=" + this.e);
                o();
            }
        }
    }

    public final void u(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae55e0ff", new Object[]{this, str, str2, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "method", str2);
        jSONObject2.put((JSONObject) "params", (String) jSONObject);
        if (str.length() > 0) {
            jSONObject2.put((JSONObject) "callbackID", str);
        }
        hav.d(c9x.TAG, "dispatchEvent method=" + str2 + " callbackID=" + str);
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "CartBridge", o9x.c().b(jSONObject2));
        }
    }

    public void v() {
        q6x q6xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ae4f5", new Object[]{this});
        } else if (this.j == null) {
            this.c.add(new BaseHybridInstance$forcePreRender$1(this));
        } else {
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#forcePreRender");
            this.d.I(System.currentTimeMillis());
            WeexInstance weexInstance = this.j;
            if (weexInstance != null) {
                q6xVar = (q6x) weexInstance.getExtend(q6x.class);
            } else {
                q6xVar = null;
            }
            if (q6xVar == null) {
                ne3.c.e(ne3.Companion, "GetWeexInstanceUnicornExtError", "forcePreRender获取weexInstanceUnicornExt为null", 0.0f, 4, null);
            } else {
                q6xVar.h(new c(q6xVar));
            }
            this.d.H(System.currentTimeMillis());
            this.d.i(System.currentTimeMillis());
            aVar.b("Cart#forcePreRender");
        }
    }

    public final int w() {
        Fragment fragmentForTag;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb59a687", new Object[]{this})).intValue();
        }
        if (!l()) {
            return pb6.r(Globals.getApplication());
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o == null || (fragmentForTag = o.getFragmentForTag("homePage")) == null || (view = fragmentForTag.getView()) == null) {
            return pb6.r(Globals.getApplication());
        }
        return view.getHeight();
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53d5f607", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "disable_canvas", (String) Boolean.TRUE);
        return jSONObject;
    }

    public final Activity y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3806435b", new Object[]{this});
        }
        return this.f;
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12896dd2", new Object[]{this});
        }
        return this.e;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements q6x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q6x f8068a;

        public c(q6x q6xVar) {
            this.f8068a = q6xVar;
        }

        @Override // tb.q6x.a
        public final void a(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed79b586", new Object[]{this, new Integer(i)});
            } else if (i != 0) {
                ne3.c cVar = ne3.Companion;
                StringBuilder sb = new StringBuilder("result=");
                sb.append(i);
                sb.append("，unicornComponent是否为null=");
                if (this.f8068a.f() != null) {
                    z = false;
                }
                sb.append(z);
                ne3.c.e(cVar, "ForcePreRenderError", sb.toString(), 0.0f, 4, null);
            }
        }
    }

    public final void p(b6x.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1791baad", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "result");
        if (this.k.get()) {
            aVar.destroy();
            return;
        }
        this.d.w(System.currentTimeMillis());
        synchronized (this) {
            try {
                Context context = this.f;
                if (context == null) {
                    context = Globals.getApplication();
                }
                this.j = aVar.b(context);
                long currentTimeMillis = System.currentTimeMillis();
                this.d.J(currentTimeMillis);
                this.d.i(currentTimeMillis);
                xhv xhvVar = xhv.INSTANCE;
            } catch (Exception e) {
                ne3.c.b(ne3.Companion, "AsyncInstanceAcceptError", e, 0.0f, 4, null);
                this.g = true;
                BaseICartFragmentProxy i = i();
                if (i != null) {
                    i.a("AsyncInstanceAcceptError");
                }
            }
        }
        StringBuilder sb = new StringBuilder("异步创建实例");
        if (this.j != null) {
            str = ResultCode.MSG_SUCCESS;
        } else {
            str = ResultCode.MSG_FAILED;
        }
        sb.append(str);
        sb.append(",instanceID=");
        sb.append(this.e);
        hav.d(c9x.TAG, sb.toString());
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((d1a) it.next()).invoke();
        }
        this.c.clear();
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r5 != null) goto L_0x0050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
        if (r4 != null) goto L_0x00aa;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.android.weex.WeexValue s(tb.jt2 r10) {
        /*
            r9 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.icart.weex.instance.BaseHybridInstance.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "f2d5da0d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r9
            r3[r0] = r10
            java.lang.Object r10 = r1.ipc$dispatch(r2, r3)
            com.taobao.android.weex.WeexValue r10 = (com.taobao.android.weex.WeexValue) r10
            return r10
        L_0x0018:
            java.lang.String r1 = "cacheBean"
            tb.ckf.g(r10, r1)
            tb.m9u$a r1 = tb.m9u.Companion
            java.lang.String r2 = "Cart#decorateToWeexValue"
            r1.a(r2)
            com.alibaba.fastjson.JSONObject r10 = r10.a()
            java.lang.String r3 = "Cart#hideItems"
            r1.a(r3)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r4 = r9.d
            long r5 = java.lang.System.currentTimeMillis()
            r4.r(r5)
            com.taobao.android.icart.weex.prefetch.ColdStartPrefetch r4 = com.taobao.android.icart.weex.prefetch.ColdStartPrefetch.INSTANCE
            com.alibaba.fastjson.JSONObject r5 = r4.g()
            r6 = 0
            if (r5 == 0) goto L_0x004a
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r5 = r6
        L_0x0047:
            if (r5 == 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            tb.nb3 r5 = tb.nb3.INSTANCE
            com.alibaba.fastjson.JSONObject r5 = r5.b()
        L_0x0050:
            java.lang.String r7 = "hideItems"
            r10.put(r7, r5)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r5 = r9.d
            long r7 = java.lang.System.currentTimeMillis()
            r5.q(r7)
            r1.b(r3)
            java.lang.String r3 = "Cart#queryParams"
            r1.a(r3)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r5 = r9.d
            long r7 = java.lang.System.currentTimeMillis()
            r5.A(r7)
            java.lang.String r5 = "queryParams"
            com.alibaba.fastjson.JSONObject r7 = r9.C()
            r10.put(r5, r7)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r5 = r9.d
            long r7 = java.lang.System.currentTimeMillis()
            r5.z(r7)
            r1.b(r3)
            java.lang.String r3 = "Cart#globalStatus"
            r1.a(r3)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r5 = r9.d
            long r7 = java.lang.System.currentTimeMillis()
            r5.p(r7)
            com.alibaba.fastjson.JSONObject r4 = r4.f()
            if (r4 == 0) goto L_0x00a4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r4 = r6
        L_0x00a1:
            if (r4 == 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            com.taobao.android.icart.weex.call.CartMegaManager r4 = com.taobao.android.icart.weex.call.CartMegaManager.INSTANCE
            com.alibaba.fastjson.JSONObject r4 = com.taobao.android.icart.weex.call.CartMegaManager.h(r4, r6, r0, r6)
        L_0x00aa:
            java.lang.String r0 = "globalStatus"
            r10.put(r0, r4)
            com.taobao.android.icart.weex.performance.CartWeexPerformance r0 = r9.d
            long r4 = java.lang.System.currentTimeMillis()
            r0.o(r4)
            r1.b(r3)
            tb.o9x r0 = tb.o9x.c()
            com.taobao.android.weex.WeexValue r10 = r0.b(r10)
            r1.b(r2)
            java.lang.String r0 = "obj"
            tb.ckf.f(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.weex.instance.BaseHybridInstance.s(tb.jt2):com.taobao.android.weex.WeexValue");
    }

    public final String t(String str, jt2 jt2Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0041a33", new Object[]{this, str, jt2Var});
        }
        ckf.g(str, "url");
        ckf.g(jt2Var, "cacheBean");
        if (this.i) {
            str = str.concat("&isPrefetchQueryForClick=true");
        }
        byte[] b2 = jt2Var.b();
        if (b2 != null) {
            if (b2.length == 0) {
                z = true;
            }
            if (!z) {
                str = str + "&resource_type=" + jt2Var.c();
            }
        }
        if (l()) {
            return str;
        }
        return str + "&cartSecondPage=true";
    }

    static {
        t2o.a(478151004);
        t2o.a(478151011);
    }
}
