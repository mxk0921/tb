package com.taobao.tao.infoflow.multitab.nativetab;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.recommend4.recyclerview.NestedStaggeredGridLayoutManager;
import com.taobao.tao.recommend4.recyclerview.R4StaggeredGridLayoutManager;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService;
import java.lang.ref.WeakReference;
import tb.c4b;
import tb.d11;
import tb.d9j;
import tb.fnn;
import tb.fve;
import tb.gnn;
import tb.h2b;
import tb.khd;
import tb.kis;
import tb.ks8;
import tb.rwc;
import tb.slj;
import tb.t2o;
import tb.vaj;
import tb.z4a;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NativeContainerProvider implements rwc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_CONTAINER = "dxContainer";
    public static final String MULTI_NATIVE_INFOFLOW_CID_PREFIX = "recommend_multi_channel_";
    public static final d11 n = new d11("mtop.taobao.wireless.home.category", "1.0");

    /* renamed from: a  reason: collision with root package name */
    public fnn f12443a;
    public WeakReference<FrameLayout> b;
    public JSONObject c;
    public IMultiTabPerformanceListener e;
    public String g;
    public int h;
    public slj k;
    public volatile boolean d = false;
    public int f = -1;
    public int i = 0;
    public int j = 0;
    public final RecyclerView.OnChildAttachStateChangeListener l = new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
            } else {
                NativeContainerProvider.i(NativeContainerProvider.this);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
            }
        }
    };
    public final View.OnLayoutChangeListener m = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (NativeContainerProvider.g(NativeContainerProvider.this) >= NativeContainerProvider.j(NativeContainerProvider.this).getRecyclerView().getChildCount()) {
                if (NativeContainerProvider.k(NativeContainerProvider.this) != null) {
                    if (NativeContainerProvider.l(NativeContainerProvider.this) == 1) {
                        NativeContainerProvider.n(NativeContainerProvider.this);
                        NativeContainerProvider.k(NativeContainerProvider.this).h(IMultiTabPerformanceListener.ON_FCP_END, System.currentTimeMillis());
                    }
                    if (NativeContainerProvider.l(NativeContainerProvider.this) == 2) {
                        NativeContainerProvider.k(NativeContainerProvider.this).h(IMultiTabPerformanceListener.ON_FSP_END, System.currentTimeMillis());
                    }
                }
                NativeContainerProvider.h(NativeContainerProvider.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends ks8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 476351799) {
                super.a(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/nativetab/NativeContainerProvider$4");
        }

        @Override // tb.ks8
        public void a(boolean z) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c648d37", new Object[]{this, new Boolean(z)});
                return;
            }
            super.a(z);
            NativeContainerProvider nativeContainerProvider = NativeContainerProvider.this;
            if (!z) {
                i = 2;
            }
            NativeContainerProvider.m(nativeContainerProvider, i);
            NativeContainerProvider.p(NativeContainerProvider.this);
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            if (NativeContainerProvider.q(NativeContainerProvider.this) != null) {
                IMultiTabStabilityListener q = NativeContainerProvider.q(NativeContainerProvider.this);
                q.a(IMultiTabStabilityListener.ON_RENDER, NativeContainerProvider.r(NativeContainerProvider.this) + "_" + NativeContainerProvider.s(NativeContainerProvider.this), "renderError");
            }
            NativeContainerProvider.p(NativeContainerProvider.this);
            d9j.c("NativeContainerProvider", "信息流首屏或分页存在错误");
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            NativeContainerProvider.p(NativeContainerProvider.this);
            if (NativeContainerProvider.l(NativeContainerProvider.this) == 2) {
                NativeContainerProvider.k(NativeContainerProvider.this).h(IMultiTabPerformanceListener.ON_REQUEST_END, System.currentTimeMillis());
            }
        }
    }

    static {
        t2o.a(729809461);
        t2o.a(729809441);
    }

    public static /* synthetic */ int g(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b66acdaf", new Object[]{nativeContainerProvider})).intValue();
        }
        return nativeContainerProvider.i;
    }

    public static /* synthetic */ int h(NativeContainerProvider nativeContainerProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd14ef8", new Object[]{nativeContainerProvider, new Integer(i)})).intValue();
        }
        nativeContainerProvider.i = i;
        return i;
    }

    public static /* synthetic */ int i(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeca05b7", new Object[]{nativeContainerProvider})).intValue();
        }
        int i = nativeContainerProvider.i;
        nativeContainerProvider.i = 1 + i;
        return i;
    }

    public static /* synthetic */ fnn j(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("afaf2fec", new Object[]{nativeContainerProvider});
        }
        return nativeContainerProvider.f12443a;
    }

    public static /* synthetic */ IMultiTabPerformanceListener k(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMultiTabPerformanceListener) ipChange.ipc$dispatch("7a0f6971", new Object[]{nativeContainerProvider});
        }
        return nativeContainerProvider.e;
    }

    public static /* synthetic */ int l(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51754df2", new Object[]{nativeContainerProvider})).intValue();
        }
        return nativeContainerProvider.j;
    }

    public static /* synthetic */ int m(NativeContainerProvider nativeContainerProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1216d715", new Object[]{nativeContainerProvider, new Integer(i)})).intValue();
        }
        nativeContainerProvider.j = i;
        return i;
    }

    public static /* synthetic */ void n(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852378c0", new Object[]{nativeContainerProvider});
        } else {
            nativeContainerProvider.t();
        }
    }

    public static /* synthetic */ void o(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d1a381", new Object[]{nativeContainerProvider});
        } else {
            nativeContainerProvider.u();
        }
    }

    public static /* synthetic */ void p(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7fce42", new Object[]{nativeContainerProvider});
        } else {
            nativeContainerProvider.v();
        }
    }

    public static /* synthetic */ IMultiTabStabilityListener q(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMultiTabStabilityListener) ipChange.ipc$dispatch("7b80fe71", new Object[]{nativeContainerProvider});
        }
        nativeContainerProvider.getClass();
        return null;
    }

    public static /* synthetic */ String r(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a79515c", new Object[]{nativeContainerProvider});
        }
        return nativeContainerProvider.g;
    }

    public static /* synthetic */ int s(NativeContainerProvider nativeContainerProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("878a4e78", new Object[]{nativeContainerProvider})).intValue();
        }
        return nativeContainerProvider.h;
    }

    public final JSONObject A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7d3f04e4", new Object[]{this, new Boolean(z)});
        }
        JSONObject B = B(this.c);
        B.put(com.taobao.tao.recommend4.manager.b.KEY_IS_PULL_REFRESH, (Object) Boolean.valueOf(z));
        return B;
    }

    public final JSONObject B(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f42aa86", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            return (!jSONObject.containsKey(vaj.KEY_SMART_CONTENT) || (jSONObject2 = jSONObject.getJSONObject(vaj.KEY_SMART_CONTENT)) == null || !jSONObject2.containsKey("categoryTabBizParams")) ? jSONObject3 : jSONObject2.getJSONObject("categoryTabBizParams");
        } catch (Exception e) {
            d9j.c(DX_CONTAINER, "get bizparams from tabInfo failed:" + Log.getStackTraceString(e));
            return jSONObject3;
        }
    }

    public final String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76822c60", new Object[]{this});
        }
        fnn fnnVar = this.f12443a;
        if (fnnVar != null) {
            return fnnVar.getContainerId();
        }
        return "unknown";
    }

    public final int D() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9d3335b", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.f12443a.getRecyclerView();
        if (recyclerView == null) {
            d9j.c("NativeContainerProvider", "getFirstVisiblePosition recyclerView null 0");
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof R4StaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions = ((R4StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            if (findFirstCompletelyVisibleItemPositions.length > 0 && (i4 = findFirstCompletelyVisibleItemPositions[0]) != 0) {
                i5 = i4;
            }
            if (i5 == -1 && (i3 = this.f) != -1) {
                i5 = i3;
            }
            this.f = i5;
            d9j.c("NativeContainerProvider", "getFirstVisiblePosition " + i5);
            return i5;
        }
        if (layoutManager instanceof NestedStaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions2 = ((NestedStaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            if (findFirstCompletelyVisibleItemPositions2.length > 0 && (i2 = findFirstCompletelyVisibleItemPositions2[0]) != 0) {
                i5 = i2;
            }
            if (i5 == -1 && (i = this.f) != -1) {
                i5 = i;
            }
            this.f = i5;
            d9j.c("NativeContainerProvider", "getFirstVisiblePosition " + i5);
        }
        return i5;
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bb79c72", new Object[]{this});
        }
        if (D() > 4) {
            return "rocket";
        }
        return kis.TAO;
    }

    public final View F(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd33cfc", new Object[]{this, context, str});
        }
        this.f12443a = w(str);
        View x = x(context);
        this.k = new slj(this.f12443a);
        return x;
    }

    public final void G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc6d075", new Object[]{this, context});
            return;
        }
        I();
        this.e.h(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START, System.currentTimeMillis());
        F(context, this.g);
        this.e.h(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END, System.currentTimeMillis());
        H();
        J();
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230620c3", new Object[]{this});
            return;
        }
        this.e.e(true);
        this.f12443a.u();
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
        } else {
            this.g = A(false).getString("guessChannelId");
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e6e0", new Object[]{this});
            return;
        }
        this.e.h(IMultiTabPerformanceListener.ON_REQUEST_START, System.currentTimeMillis());
        this.f12443a.w(n, B(this.c));
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a6c45b", new Object[]{this, new Boolean(z)});
            return;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
            if (currentSubTabController instanceof gnn) {
                ((gnn) currentSubTabController).h(z);
            }
        }
    }

    public final void L(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af6f9e0", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, i));
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665bdba6", new Object[]{this});
            return;
        }
        this.d = true;
        this.f12443a.x(A(true));
    }

    @Override // tb.rwc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
            return;
        }
        t();
        u();
        fve.e("NativeContainerProvider", "onTabEnter " + C());
        slj sljVar = this.k;
        if (sljVar != null) {
            sljVar.e();
        }
    }

    @Override // tb.rwc
    public View d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("29eba832", new Object[]{this, context, jSONObject});
        }
        WeakReference<FrameLayout> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            return this.b.get();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.b = new WeakReference<>(frameLayout);
        this.c = jSONObject;
        G(context);
        RecyclerView recyclerView = this.f12443a.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(z());
            recyclerView.addOnLayoutChangeListener(this.m);
            recyclerView.addOnChildAttachStateChangeListener(this.l);
            L(recyclerView, -2);
            frameLayout.removeAllViews();
            frameLayout.addView(recyclerView);
        }
        return frameLayout;
    }

    @Override // tb.rwc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WeakReference<FrameLayout> weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
            this.b = null;
        }
        fnn fnnVar = this.f12443a;
        if (fnnVar != null) {
            fnnVar.c();
        }
    }

    @Override // tb.rwc
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf611fd", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    @Override // tb.rwc
    public void f(IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79038be2", new Object[]{this, iMultiTabPerformanceListener});
        } else {
            this.e = iMultiTabPerformanceListener;
        }
    }

    @Override // tb.rwc
    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        return DX_CONTAINER;
    }

    @Override // tb.rwc
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        return E();
    }

    @Override // tb.rwc
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        fve.e("NativeContainerProvider", "onPause " + C());
        slj sljVar = this.k;
        if (sljVar != null) {
            sljVar.b();
        }
    }

    @Override // tb.rwc
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        M();
        slj sljVar = this.k;
        if (sljVar != null) {
            sljVar.c();
        }
    }

    @Override // tb.rwc
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fve.e("NativeContainerProvider", "onResume " + C());
        slj sljVar = this.k;
        if (sljVar != null) {
            sljVar.d();
        }
    }

    @Override // tb.rwc
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        fve.e("NativeContainerProvider", "onStart " + C());
    }

    @Override // tb.rwc
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        fve.e("NativeContainerProvider", "onStop " + C());
    }

    public final void t() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d22035", new Object[]{this});
            return;
        }
        if (D() == 0) {
            z = true;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
            if (currentSubTabController instanceof gnn) {
                ((gnn) currentSubTabController).b(z);
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf001fc", new Object[]{this});
            return;
        }
        ITabBarActionButtonService iTabBarActionButtonService = (ITabBarActionButtonService) c4b.i().h(ITabBarActionButtonService.class);
        if (iTabBarActionButtonService != null) {
            if (TextUtils.equals(E(), "rocket")) {
                iTabBarActionButtonService.changeToR4UButtonView();
            } else {
                iTabBarActionButtonService.changeToHomepageButtonView();
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49c03f8", new Object[]{this});
            return;
        }
        z6d c = h2b.a().c();
        if (c != null && c.q1() != null) {
            IPullDownService iPullDownService = (IPullDownService) c4b.i().h(IPullDownService.class);
            if (this.d && iPullDownService != null) {
                iPullDownService.setRefreshing(false);
                K(false);
                this.d = false;
            }
        }
    }

    public final fnn w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("5daf55c3", new Object[]{this, str});
        }
        fnn e = fnn.e(new z4a(MULTI_NATIVE_INFOFLOW_CID_PREFIX + str, "newface_home_sub_" + str, "Page_Home"));
        e.y(y());
        return e;
    }

    public final View x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("45d34ea6", new Object[]{this, context});
        }
        if (this.f12443a == null) {
            return new View(context);
        }
        d9j.c("NativeContainerProvider", "createInfoFlowView context" + context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        RecyclerView a2 = this.f12443a.a(context);
        a2.setBackgroundColor(Color.parseColor("#F0F0F0"));
        L(a2, -1);
        fve.k("NativeContainerProvider", "构建信息流视图耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return a2;
    }

    public final khd y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("7208f50a", new Object[]{this});
        }
        return new b();
    }

    public final RecyclerView.OnScrollListener z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("edb76480", new Object[]{this});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/infoflow/multitab/nativetab/NativeContainerProvider$3");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    NativeContainerProvider.o(NativeContainerProvider.this);
                    NativeContainerProvider.n(NativeContainerProvider.this);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (recyclerView.getScrollY() == 0) {
                    NativeContainerProvider.o(NativeContainerProvider.this);
                }
            }
        };
    }

    @Override // tb.rwc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeb4328", new Object[]{this});
            return;
        }
        fve.e("NativeContainerProvider", "onTabLeave " + C());
        this.j = 0;
        slj sljVar = this.k;
        if (sljVar != null) {
            sljVar.f();
        }
    }

    @Override // tb.rwc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4280459", new Object[]{this});
        } else if (TextUtils.equals(E(), "rocket")) {
            this.f12443a.getRecyclerView().smoothScrollToPosition(0);
        } else {
            K(true);
        }
    }
}
