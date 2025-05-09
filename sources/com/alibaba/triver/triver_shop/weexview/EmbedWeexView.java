package com.alibaba.triver.triver_shop.weexview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.miniapp.downgrade.ShopEngineDowngrader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import tb.fxd;
import tb.gbe;
import tb.luw;
import tb.ogg;
import tb.pks;
import tb.pwr;
import tb.qjs;
import tb.t2o;
import tb.w74;
import tb.y9x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EmbedWeexView extends BaseEmbedView implements AppStartPoint, AppDestroyPoint, gbe, WXSDKInstance.v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "weex-view";
    public RenderContainer b;
    public Context c;
    public TRNestedRenderContainer d;
    public ViewTreeObserver e;
    public ViewTreeObserver.OnGlobalLayoutListener f;

    /* renamed from: a  reason: collision with root package name */
    public WXSDKInstance f3362a = null;
    public final List<WXSwipeLayout> g = new ArrayList();
    public FrameLayout h = null;
    public String i = "";
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public boolean r = false;
    public Timer s = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements OnWXScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrollStateChanged(View view, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrolled(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                EmbedWeexView.access$012(EmbedWeexView.this, i2);
                if (Math.abs(EmbedWeexView.access$100(EmbedWeexView.this) - EmbedWeexView.access$000(EmbedWeexView.this)) > 200) {
                    EmbedWeexView embedWeexView = EmbedWeexView.this;
                    EmbedWeexView.access$102(embedWeexView, EmbedWeexView.access$000(embedWeexView));
                    if (!(EmbedWeexView.access$200(EmbedWeexView.this) == null || EmbedWeexView.this.getOuterPage() == null || EmbedWeexView.this.getOuterPage().getRender() == null || !(EmbedWeexView.this.getOuterPage().getRender() instanceof fxd))) {
                        if (TextUtils.isEmpty(EmbedWeexView.access$300(EmbedWeexView.this))) {
                            EmbedWeexView.this.getOuterPage().getRender().evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__(" + qjs.f(EmbedWeexView.access$200(EmbedWeexView.this), EmbedWeexView.access$000(EmbedWeexView.this)) + ")}");
                        } else {
                            EmbedWeexView.this.getOuterPage().getRender().evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + EmbedWeexView.access$300(EmbedWeexView.this) + ")__'](" + qjs.f(EmbedWeexView.access$200(EmbedWeexView.this), EmbedWeexView.access$000(EmbedWeexView.this)) + ")}");
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            EmbedWeexView embedWeexView = EmbedWeexView.this;
            EmbedWeexView.access$500(embedWeexView, EmbedWeexView.access$400(embedWeexView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements WXSwipeLayout.OnRefreshOffsetChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
        public void onOffsetChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
                return;
            }
            try {
                if (!(i == EmbedWeexView.access$600(EmbedWeexView.this) || EmbedWeexView.this.getOuterPage() == null || EmbedWeexView.this.getOuterPage().getRender() == null || !(EmbedWeexView.this.getOuterPage().getRender() instanceof fxd))) {
                    if (EmbedWeexView.access$700(EmbedWeexView.this) != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) EmbedWeexView.access$700(EmbedWeexView.this).getLayoutParams();
                        layoutParams.topMargin = i;
                        EmbedWeexView.access$700(EmbedWeexView.this).setLayoutParams(layoutParams);
                    }
                    if (TextUtils.isEmpty(EmbedWeexView.access$300(EmbedWeexView.this))) {
                        EmbedWeexView.this.getOuterPage().getRender().evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__(" + qjs.f(EmbedWeexView.access$200(EmbedWeexView.this), -i) + ")}");
                    } else {
                        EmbedWeexView.this.getOuterPage().getRender().evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + EmbedWeexView.access$300(EmbedWeexView.this) + ")__'](" + qjs.f(EmbedWeexView.access$200(EmbedWeexView.this), -i) + ")}");
                    }
                    EmbedWeexView.access$602(EmbedWeexView.this, i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WXSwipeLayout f3367a;

        public d(WXSwipeLayout wXSwipeLayout) {
            this.f3367a = wXSwipeLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WXSwipeLayout wXSwipeLayout = this.f3367a;
            if (wXSwipeLayout != null) {
                wXSwipeLayout.finishPullRefresh();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3368a = 0;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/EmbedWeexView$6");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f3368a == 0) {
                    this.f3368a = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.f3368a >= 5000 && EmbedWeexView.access$800(EmbedWeexView.this) != null) {
                    EmbedWeexView.access$800(EmbedWeexView.this).cancel();
                }
                EmbedWeexView.access$900(EmbedWeexView.this);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(766510490);
        t2o.a(985661443);
        t2o.a(985661482);
    }

    public static /* synthetic */ int access$000(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dcd6fff", new Object[]{embedWeexView})).intValue();
        }
        return embedWeexView.p;
    }

    public static /* synthetic */ int access$012(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("850ab50b", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        int i2 = embedWeexView.p + i;
        embedWeexView.p = i2;
        return i2;
    }

    public static /* synthetic */ int access$100(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d20bdf9e", new Object[]{embedWeexView})).intValue();
        }
        return embedWeexView.q;
    }

    public static /* synthetic */ int access$102(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e45bc9ad", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        embedWeexView.q = i;
        return i;
    }

    public static /* synthetic */ Context access$200(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a60ff042", new Object[]{embedWeexView});
        }
        return embedWeexView.c;
    }

    public static /* synthetic */ String access$300(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de4bc4d7", new Object[]{embedWeexView});
        }
        return embedWeexView.l;
    }

    public static /* synthetic */ TRNestedRenderContainer access$400(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRNestedRenderContainer) ipChange.ipc$dispatch("36dff9a4", new Object[]{embedWeexView});
        }
        return embedWeexView.d;
    }

    public static /* synthetic */ void access$500(EmbedWeexView embedWeexView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4290034b", new Object[]{embedWeexView, view});
        } else {
            embedWeexView.d(view);
        }
    }

    public static /* synthetic */ int access$600(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7440db9", new Object[]{embedWeexView})).intValue();
        }
        return embedWeexView.o;
    }

    public static /* synthetic */ int access$602(EmbedWeexView embedWeexView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6295ef2", new Object[]{embedWeexView, new Integer(i)})).intValue();
        }
        embedWeexView.o = i;
        return i;
    }

    public static /* synthetic */ FrameLayout access$700(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f1c75454", new Object[]{embedWeexView});
        }
        return embedWeexView.h;
    }

    public static /* synthetic */ Timer access$800(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("c2c6b4f0", new Object[]{embedWeexView});
        }
        return embedWeexView.s;
    }

    public static /* synthetic */ void access$900(EmbedWeexView embedWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff5ca3", new Object[]{embedWeexView});
        } else {
            embedWeexView.k();
        }
    }

    public static /* synthetic */ Object ipc$super(EmbedWeexView embedWeexView, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/EmbedWeexView");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        try {
            WXSDKInstance wXSDKInstance = this.f3362a;
            if (wXSDKInstance != null) {
                wXSDKInstance.L0(new a());
                this.f3362a.p1(this);
                this.f3362a.registerRenderListener(this);
                View decorView = this.mOuterPage.getRender().getActivity().getWindow().getDecorView();
                if (decorView != null) {
                    ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                    this.e = viewTreeObserver;
                    b bVar = new b();
                    this.f = bVar;
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                }
            }
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
    }

    public final void c() {
        App app;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0f3391", new Object[]{this});
            return;
        }
        try {
            if (this.c != null && this.d != null) {
                if (!TextUtils.isEmpty(this.i) && this.i.indexOf("ignore2006=1") >= 0 && (app = this.mOuterApp) != null && (app.getAppContext().getContext() instanceof Activity)) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this.mOuterApp.getAppContext().getContext(), UTPageStatus.UT_H5_IN_WebView);
                }
                WVUCWebView wVUCWebView = new WVUCWebView(this.c);
                wVUCWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                wVUCWebView.loadUrl(this.i);
                this.d.removeAllViews();
                this.d.addView(wVUCWebView);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bfc0d0", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject.containsKey("url")) {
                this.i = jSONObject.getString("url");
            }
            if (jSONObject.containsKey("wxData")) {
                this.j = jSONObject.getString("wxData");
            }
            if (jSONObject.containsKey("weexViewId")) {
                this.l = jSONObject.getString("weexViewId");
            }
            if (jSONObject.containsKey("isWeb")) {
                this.k = Boolean.parseBoolean(String.valueOf(jSONObject.get("isWeb")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79431965", new Object[]{this, map});
            return;
        }
        try {
            if (map.containsKey("url")) {
                this.i = map.get("url");
            }
            if (map.containsKey("wxData")) {
                this.j = map.get("wxData");
            }
            if (map.containsKey("snapshot")) {
                this.m = Boolean.parseBoolean(map.get("snapshot"));
            }
            if (map.containsKey("weexViewId")) {
                this.l = map.get("weexViewId");
            }
            if (map.containsKey("isWeb")) {
                this.k = Boolean.parseBoolean(map.get("isWeb"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb14b2f", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = this.mOuterApp.getAppContext().getContext();
        }
        if (this.c != null && this.d == null) {
            TRNestedRenderContainer tRNestedRenderContainer = new TRNestedRenderContainer(this.c);
            this.d = tRNestedRenderContainer;
            tRNestedRenderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return TYPE;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a75df", new Object[]{this});
            return;
        }
        try {
            if (this.f3362a != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f);
                }
                this.f = null;
                this.e = null;
                this.f3362a.registerRenderListener(null);
                this.f3362a.p1(null);
            }
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e15f6d", new Object[]{this});
        } else if (this.f3362a != null) {
            RVLogger.d("EmbedWeexView", "renderWeexPage url is: " + this.i);
            ((ArrayList) this.g).clear();
            HashMap hashMap = new HashMap();
            hashMap.put("bundleUrl", this.i);
            this.f3362a.X0("WeexEmbedView", this.i, hashMap, this.j, WXRenderStrategy.APPEND_ASYNC);
        } else {
            RVLogger.d("EmbedWeexView", "renderWeexPage instance is null");
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bb8b21", new Object[]{this});
            return;
        }
        try {
            if (this.n && !this.r) {
                Timer timer = this.s;
                if (timer != null) {
                    timer.cancel();
                } else {
                    this.s = new Timer();
                }
                this.s.schedule(new e(), 100L, 100L);
                this.r = true;
            }
        } catch (Exception e2) {
            RVLogger.w(Log.getStackTraceString(e2));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d8921f", new Object[]{this});
            return;
        }
        try {
            if (((ConcurrentHashMap) this.f3362a.E().d).containsKey("wxInteraction")) {
                ((Long) ((ConcurrentHashMap) this.f3362a.E().d).get("wxInteraction")).longValue();
            }
        } catch (Exception e2) {
            RVLogger.w(Log.getStackTraceString(e2));
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
            return;
        }
        RVLogger.d("EmbedWeexView", "onAppDestroy");
        y9x.b();
        List<WXSwipeLayout> list = this.g;
        if (list != null) {
            ((ArrayList) list).clear();
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
            return;
        }
        try {
            if (pks.y(app)) {
                app.getStartParams().putBoolean("appFirstWeexPage", true);
            }
        } catch (Exception e2) {
            RVLogger.w(Log.getStackTraceString(e2));
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "onAttachedToWebView");
        WXSDKInstance wXSDKInstance = this.f3362a;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
    }

    @Override // com.taobao.weex.WXSDKInstance.v
    public void onCreateNestInstance(WXSDKInstance wXSDKInstance, NestedContainer nestedContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e5a76", new Object[]{this, wXSDKInstance, nestedContainer});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "destroy");
        try {
            WXSDKInstance wXSDKInstance = this.f3362a;
            if (wXSDKInstance != null) {
                wXSDKInstance.onActivityDestroy();
                this.f3362a = null;
            }
            Timer timer = this.s;
            if (timer != null) {
                timer.cancel();
            }
            ((ArrayList) this.g).clear();
            h();
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
        try {
            TRNestedRenderContainer tRNestedRenderContainer = this.d;
            if (tRNestedRenderContainer != null) {
                tRNestedRenderContainer.destroy();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "onDetachedToWebView");
        WXSDKInstance wXSDKInstance = this.f3362a;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityStop();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            str = "visible";
        } else {
            str = "invisible";
        }
        RVLogger.d("EmbedWeexView", "onWeexView visibility changed : ".concat(str));
    }

    @Override // tb.gbe
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
        } else if (WeexPageFragment.shouldDegrade(wXSDKInstance, str, str2)) {
            c();
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (jSONObject.getBoolean("triggerRefreshHide").booleanValue()) {
                Iterator it = ((ArrayList) this.g).iterator();
                while (it.hasNext()) {
                    WXSwipeLayout wXSwipeLayout = (WXSwipeLayout) it.next();
                    if (wXSwipeLayout != null) {
                        ((RVExecutorService) RVProxy.get(RVExecutorService.class)).getExecutor(ExecutorType.UI).execute(new d(wXSwipeLayout));
                    }
                }
            }
        } catch (Exception e2) {
            RVLogger.w(Log.getStackTraceString(e2));
        }
        RVLogger.d("EmbedWeexView", jSONObject.toJSONString());
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        RVLogger.d("EmbedWeexView", "onRecivedRender : " + jSONObject);
        e(jSONObject);
        if (this.f3362a != null && this.m && !TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.f3362a.getBundleUrl())) {
            i();
        }
    }

    @Override // tb.gbe
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.gbe
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else {
            j();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // tb.gbe
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "pause");
        WXSDKInstance wXSDKInstance = this.f3362a;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityPause();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        RVLogger.d("EmbedWeexView", "resume");
        WXSDKInstance wXSDKInstance = this.f3362a;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
        TRNestedRenderContainer tRNestedRenderContainer = this.d;
        if (tRNestedRenderContainer != null && Build.VERSION.SDK_INT >= 29) {
            tRNestedRenderContainer.invalidate();
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92c22d9", new Object[]{this, map});
            return;
        }
        RVLogger.e("EmbedWeexView", "getView snapshot false，url is " + this.i);
        RenderContainer renderContainer = new RenderContainer(this.c);
        this.b = renderContainer;
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WXSDKInstance wXSDKInstance = new WXSDKInstance(this.c);
        this.f3362a = wXSDKInstance;
        wXSDKInstance.setRenderContainer(this.b);
        this.f3362a.setUseSandBox(true);
        this.f3362a.y1(true);
        this.f3362a.a1(this.i);
        this.f3362a.registerRenderListener(this);
        this.d.removeAllViews();
        this.d.addView(this.b);
        Page outerPage = getOuterPage();
        if (outerPage != null) {
            ((ConcurrentHashMap) this.f3362a.E().j).put(luw.MINIAPP_ORI_URL_KEY, outerPage.getApp().getStartParams().getString("ori_url"));
        }
        this.f3362a.h1(luw.c());
        i();
        a();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        RVLogger.d("EmbedWeexView", "getView");
        g();
        f(map);
        if (this.c == null) {
            return null;
        }
        if (this.k) {
            c();
        } else {
            RVLogger.d("EmbedWeexView", "getView is snapshot");
            WXSDKInstance a2 = y9x.a();
            this.f3362a = a2;
            if (a2 != null && !this.m && !TextUtils.equals(this.i, a2.getBundleUrl())) {
                this.f3362a = null;
            }
            if (this.f3362a != null) {
                try {
                    LaunchMonitorData q = ogg.q(this.mOuterApp);
                    if (this.m && q != null) {
                        q.addPoint("weexSnapshotHit");
                    }
                    RVLogger.e("Render", "template version miss , will not use preload webView");
                    Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
                    if (applicationContext != null && w74.G(applicationContext)) {
                        Toast.makeText(applicationContext, "weex-view 命中Snapshot", 1).show();
                    }
                } catch (Throwable unused) {
                }
                this.f3362a.getContainerView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.i = this.f3362a.getBundleUrl();
                this.d.removeAllViews();
                this.d.addView(this.f3362a.getContainerView());
                a();
                j();
                RVLogger.e("EmbedWeexView", "weex-view命中Snapshot，url is：" + this.i);
            } else {
                b(map);
            }
        }
        this.d.setWeexViewID(this.l);
        this.d.setRender(getOuterPage().getRender());
        return this.d;
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        try {
            RVLogger.d("EmbedWeexView", "onAppStart");
            g();
            if (this.mOuterApp.getStartParams().containsKey("appFirstWeexPage")) {
                this.n = true;
                this.mOuterApp.getStartParams().remove("appFirstWeexPage");
            }
            if (!WXBridgeManager.getInstance().isJSFrameworkInit() && pwr.x()) {
                ShopEngineDowngrader.a(this.mOuterApp, (String) null);
            }
        } catch (Exception e2) {
            RVLogger.w(Log.getStackTraceString(e2));
        }
    }

    public final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995e7e1b", new Object[]{this, view});
            return;
        }
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof BounceRecyclerView) && ((BounceRecyclerView) childAt).getInnerView() != null) {
                        TRNestedRenderContainer tRNestedRenderContainer = this.d;
                        if (tRNestedRenderContainer != null) {
                            tRNestedRenderContainer.setRecyclerView(((BounceRecyclerView) childAt).getInnerView());
                            this.d.setUrl(this.i);
                        }
                        ((BounceRecyclerView) childAt).getInnerView().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.triver.triver_shop.weexview.EmbedWeexView.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                                if (str.hashCode() == -1177043419) {
                                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                                    return null;
                                }
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/EmbedWeexView$3");
                            }

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                                    return;
                                }
                                super.onScrolled(recyclerView, i2, i3);
                                if (recyclerView != null && ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0 && EmbedWeexView.access$400(EmbedWeexView.this) != null) {
                                    EmbedWeexView.access$400(EmbedWeexView.this).setScrollOnTop(true);
                                }
                            }
                        });
                    }
                    if (childAt instanceof WXSwipeLayout) {
                        WXSwipeLayout wXSwipeLayout = (WXSwipeLayout) childAt;
                        if (!((ArrayList) this.g).contains(wXSwipeLayout)) {
                            ((ArrayList) this.g).add(wXSwipeLayout);
                            if (TextUtils.indexOf(this.i, "isNestCategory=true") > 0) {
                                this.h = (FrameLayout) wXSwipeLayout.getParent().getParent().getParent().getParent().getParent().getParent().getParent();
                            }
                            wXSwipeLayout.addOnRefreshOffsetChangedListener(new c());
                        }
                    } else {
                        d(childAt);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
