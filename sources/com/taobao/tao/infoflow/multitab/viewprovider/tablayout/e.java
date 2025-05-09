package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.topmultitab.service.festival.IFestivalService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.topmultitab.service.statusbar.IStatusBarService;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bx;
import tb.c4b;
import tb.cqv;
import tb.d9j;
import tb.fbz;
import tb.fuq;
import tb.h9z;
import tb.hbz;
import tb.i2b;
import tb.ibz;
import tb.l6c;
import tb.m5a;
import tb.maj;
import tb.p2b;
import tb.phg;
import tb.qps;
import tb.r5a;
import tb.s2b;
import tb.srs;
import tb.t2o;
import tb.taj;
import tb.trs;
import tb.uaj;
import tb.vaj;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e implements com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a, a.AbstractC0710a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public l6c A;
    public final qps B;
    public final IMultiTabPerformanceListener C;
    public TUrlImageView E;
    public final com.taobao.tao.infoflow.multitab.viewprovider.tablayout.b F;
    public LinearLayout H;
    public Map<String, String> I;
    public final fbz O;
    public final ibz P;
    public final h9z Q;

    /* renamed from: a  reason: collision with root package name */
    public MultiTabLayout f12457a;
    public FrameLayout b;
    public FrameLayout c;
    public TUrlImageView d;
    public TUrlImageView e;
    public List<JSONObject> f;
    public JSONObject g;
    public final srs m;
    public final com.taobao.tao.infoflow.multitab.viewprovider.tablayout.g o;
    public final taj p;
    public LinearLayout q;
    public View r;
    public TailFadeFrameLayout s;
    public final com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f t;
    public final fuq v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final List<a.e> h = new CopyOnWriteArrayList();
    public final List<a.d> i = new CopyOnWriteArrayList();
    public final List<TBSwipeRefreshLayout.OnPullRefreshListener> j = new CopyOnWriteArrayList();
    public final List<bx> k = new CopyOnWriteArrayList();
    public int l = -1;
    public int n = 0;
    public final List<a.AbstractC0710a> u = new CopyOnWriteArrayList();
    public int D = -1;
    public boolean G = false;
    public final a.d J = new i();
    public final a.AbstractC0708a K = new j();
    public final TabLayout.d L = new k();
    public final bx M = new b();
    public final TBSwipeRefreshLayout.OnPullRefreshListener N = new m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!e.n(e.this)) {
                e eVar = e.this;
                e.s(eVar, e.q(eVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends bx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/TabLayoutProvider$11");
        }

        @Override // tb.bx
        public void q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            e.u(e.this);
            e.B(e.this);
            for (bx bxVar : e.v(e.this)) {
                bxVar.q();
            }
        }

        @Override // tb.bx
        public void r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            for (bx bxVar : e.v(e.this)) {
                bxVar.r();
            }
            e.w(e.this);
            e.x(e.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12460a;
        public final /* synthetic */ a.b b;

        public c(int i, a.b bVar) {
            this.f12460a = i;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TabLayout.f tabAt = e.t(e.this).getTabAt(this.f12460a);
            if (tabAt != null) {
                tabAt.l();
                a.b bVar = this.b;
                if (bVar != null) {
                    ((uaj.a) bVar).a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public d(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.i(e.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.e$e  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0709e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0709e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.t(e.this).updateIndicatorPosition(e.y(e.this).o(), 0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.D(e.this).D(0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public g(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TabLayout.f tabAt = e.t(e.this).getTabAt(this.b);
            if (tabAt != null) {
                tabAt.l();
            }
            e.t(e.this).updateIndicatorPosition(this.b, 0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ List c;

        public h(int i, List list) {
            this.b = i;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TabLayout.f tabAt = e.t(e.this).getTabAt(this.b);
            if (tabAt != null) {
                tabAt.l();
            }
            e.F(e.this, e.E(e.this), this.c);
            e.t(e.this).updateIndicatorPosition(this.b, 0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
                return;
            }
            for (a.d dVar : e.H(e.this)) {
                dVar.b(i);
            }
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
        public void onScrollStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616aa2a8", new Object[]{this});
                return;
            }
            int E = e.E(e.this);
            if (E != -1) {
                e eVar = e.this;
                e.F(eVar, E, e.L(eVar));
                d9j.c("TabLayoutProvider", "last index: " + E);
            }
            e.G(e.this);
            for (a.d dVar : e.H(e.this)) {
                dVar.onScrollStopped();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements a.AbstractC0708a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("826dc4fc", new Object[]{this, new Integer(i)});
                return;
            }
            d9j.c("TabLayoutProvider", "onPreCreate tabIndex:" + i);
            e.I(e.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements TabLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1c8ee3b", new Object[]{this, fVar});
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c48ba408", new Object[]{this, fVar});
                return;
            }
            e.I(e.this, fVar.f());
            e.l(e.this);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca6e1a1", new Object[]{this, fVar});
            } else {
                e.m(e.this, fVar.f());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements l6c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.l6c
        public void onFestivalChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d12b9844", new Object[]{this});
                return;
            }
            e eVar = e.this;
            e.z(eVar, e.y(eVar).o());
            e.A(e.this).i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : e.C(e.this)) {
                onPullRefreshListener.onPullDistance(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : e.C(e.this)) {
                onPullRefreshListener.onRefresh();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : e.C(e.this)) {
                onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements h9z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f12470a;

            public a(JSONObject jSONObject) {
                this.f12470a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.this.O(this.f12470a);
                }
            }
        }

        public n() {
        }

        @Override // tb.h9z
        public void p(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4d37024", new Object[]{this, str, jSONObject});
            } else if (TextUtils.equals(str, h9z.EVENT_ON_REFRESH_LOCATION)) {
                m5a.a().i(new a(jSONObject));
            }
        }
    }

    static {
        t2o.a(729809513);
        t2o.a(729809494);
        t2o.a(729809585);
    }

    public e(taj tajVar, fuq fuqVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        n nVar = new n();
        this.p = tajVar;
        this.v = fuqVar;
        srs srsVar = new srs(fuqVar);
        this.m = srsVar;
        this.C = iMultiTabPerformanceListener;
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c cVar = new com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c(srsVar);
        this.o = new com.taobao.tao.infoflow.multitab.viewprovider.tablayout.g(srsVar, cVar, fuqVar);
        this.B = new qps(tajVar, fuqVar);
        this.F = new com.taobao.tao.infoflow.multitab.viewprovider.tablayout.b(srsVar, tajVar, fuqVar);
        fbz fbzVar = new fbz(srsVar);
        this.O = fbzVar;
        ibz ibzVar = new ibz(nVar);
        this.P = ibzVar;
        fbzVar.j(new hbz(ibzVar));
        this.t = new com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f(srsVar, cVar, fuqVar, fbzVar);
        l0();
        n0();
        k0();
        j();
        U();
    }

    public static /* synthetic */ com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f A(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f) ipChange.ipc$dispatch("e7d0f78b", new Object[]{eVar});
        }
        return eVar.t;
    }

    public static /* synthetic */ void B(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e2196e", new Object[]{eVar});
        } else {
            eVar.m0();
        }
    }

    public static /* synthetic */ List C(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f10e6b34", new Object[]{eVar});
        }
        return eVar.j;
    }

    public static /* synthetic */ qps D(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qps) ipChange.ipc$dispatch("4eace5cf", new Object[]{eVar});
        }
        return eVar.B;
    }

    public static /* synthetic */ int E(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbd0fdb2", new Object[]{eVar})).intValue();
        }
        return eVar.d0();
    }

    public static /* synthetic */ void F(e eVar, int i2, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de129d6", new Object[]{eVar, new Integer(i2), list});
        } else {
            eVar.o0(i2, list);
        }
    }

    public static /* synthetic */ void G(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e53c1c", new Object[]{eVar});
        } else {
            eVar.X();
        }
    }

    public static /* synthetic */ List H(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8dac8eac", new Object[]{eVar});
        }
        return eVar.i;
    }

    public static /* synthetic */ void I(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ba6de9", new Object[]{eVar, new Integer(i2)});
        } else {
            eVar.f0(i2);
        }
    }

    public static /* synthetic */ List L(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2e3e26aa", new Object[]{eVar});
        }
        return eVar.f;
    }

    public static int c0(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42bdd426", new Object[]{context, jSONObject})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        float f2 = 0.0f;
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("marginTop");
            if (!TextUtils.isEmpty(string)) {
                try {
                    f2 = Integer.parseInt(string);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return trs.a(context, f2);
    }

    public static /* synthetic */ void i(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee6fce", new Object[]{eVar, jSONObject});
        } else {
            eVar.N(jSONObject);
        }
    }

    public static /* synthetic */ void l(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab99cb4", new Object[]{eVar});
        } else {
            eVar.g0();
        }
    }

    public static /* synthetic */ int m(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4e8f285", new Object[]{eVar, new Integer(i2)})).intValue();
        }
        eVar.D = i2;
        return i2;
    }

    public static /* synthetic */ boolean n(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("681c70f6", new Object[]{eVar})).booleanValue();
        }
        return eVar.z;
    }

    public static /* synthetic */ boolean q(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96cddb15", new Object[]{eVar})).booleanValue();
        }
        return eVar.x;
    }

    public static /* synthetic */ void s(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6a13a4", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.q0(z);
        }
    }

    public static /* synthetic */ MultiTabLayout t(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("43ee9553", new Object[]{eVar});
        }
        return eVar.f12457a;
    }

    public static /* synthetic */ void u(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f430af4f", new Object[]{eVar});
        } else {
            eVar.j0();
        }
    }

    public static /* synthetic */ List v(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1873231a", new Object[]{eVar});
        }
        return eVar.k;
    }

    public static /* synthetic */ void w(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8044edac", new Object[]{eVar});
        } else {
            eVar.r0();
        }
    }

    public static /* synthetic */ void x(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef657cb", new Object[]{eVar});
        } else {
            eVar.t0();
        }
    }

    public static /* synthetic */ fuq y(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("12620621", new Object[]{eVar});
        }
        return eVar.v;
    }

    public static /* synthetic */ void z(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9479cb2e", new Object[]{eVar, new Integer(i2)});
        } else {
            eVar.y0(i2);
        }
    }

    public final Map<String, String> J(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acd91299", new Object[]{this, new Integer(i2)});
        }
        TabLayout.f tabAt = this.f12457a.getTabAt(i2);
        if (tabAt == null) {
            return new HashMap();
        }
        View j2 = this.o.j(tabAt.d());
        return vaj.I(this.I, j2, this.o.m(j2), this.o.k(i2));
    }

    public final void K(int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a179e90", new Object[]{this, new Integer(i2), jSONObject});
            return;
        }
        vaj.a(jSONObject, J(i2));
        r5a.d(this.g, jSONObject);
        Z(i2);
    }

    public final void M(int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2073a3", new Object[]{this, new Integer(i2), jSONObject});
            return;
        }
        vaj.b(jSONObject, J(i2));
        r5a.l(jSONObject);
    }

    public void P(bx bxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0ac8df", new Object[]{this, bxVar});
        } else {
            this.k.add(bxVar);
        }
    }

    public void Q(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f626d4b", new Object[]{this, onPullRefreshListener});
        } else {
            this.j.add(onPullRefreshListener);
        }
    }

    public void R(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467d3962", new Object[]{this, dVar});
        } else {
            this.i.add(dVar);
        }
    }

    public void S(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ca6b81", new Object[]{this, cVar});
        } else {
            this.F.a(cVar);
        }
    }

    public final boolean T(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d4fd26", new Object[]{this, view})).booleanValue();
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            return false;
        }
        iHomeSearchBarService.addViewToMultiTabContainer(view);
        return true;
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abecb1c", new Object[]{this});
        } else {
            c(this.O);
        }
    }

    public final void X() {
        int tabCount;
        View childTabView;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a5765a", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f12457a;
        if (multiTabLayout != null && this.s != null && this.e != null && (tabCount = multiTabLayout.getTabCount() - 1) >= 0 && (childTabView = this.f12457a.getChildTabView(tabCount)) != null) {
            Rect rect = new Rect();
            boolean globalVisibleRect = childTabView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            boolean globalVisibleRect2 = this.e.getGlobalVisibleRect(rect2);
            if (globalVisibleRect && globalVisibleRect2) {
                int width = childTabView.getWidth();
                int i2 = rect.right;
                int i3 = rect.left;
                if (i2 > rect2.left || i2 - i3 < width) {
                    z = true;
                }
                this.s.showFade(z);
            }
            if (!globalVisibleRect) {
                this.s.showFade(true);
            }
        }
    }

    public final void Y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e383052", new Object[]{this, jSONObject});
            return;
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout != null && (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            int c0 = c0(this.b.getContext(), jSONObject);
            if (marginLayoutParams.topMargin != c0) {
                marginLayoutParams.topMargin = c0;
                this.b.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public View a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("632da627", new Object[]{this, str});
        }
        if (!this.w || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12457a.getChildTabView(this.v.u(str));
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8888d7ba", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.height = trs.a(this.c.getContext(), 34.0f);
        this.c.setLayoutParams(layoutParams);
        MultiTabLayout multiTabLayout = this.f12457a;
        multiTabLayout.setPadding(0, 0, 0, trs.a(multiTabLayout.getContext(), 2.0f));
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba871471", new Object[]{this, jSONObject});
            return;
        }
        d9j.c("TabLayoutProvider", "triggerCustomPanelShow  triggerCustomPanelShow");
        this.F.f(this.g, this.f12457a, jSONObject);
    }

    public final l6c b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6c) ipChange.ipc$dispatch("417b612a", new Object[]{this});
        }
        return new l();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void c(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38996d01", new Object[]{this, eVar});
        } else {
            this.h.add(eVar);
        }
    }

    @Override // tb.ywc
    public void d(LinearLayout linearLayout) {
        LayoutInflater layoutInflater;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5600888b", new Object[]{this, linearLayout});
            return;
        }
        if (vxl.b().B()) {
            this.b = new HomepageTabLayoutFrameLayout(linearLayout.getContext());
        } else {
            if (!vxl.b().z()) {
                layoutInflater = LayoutInflater.from(linearLayout.getContext());
            } else {
                layoutInflater = LayoutInflater.from(linearLayout.getContext()).cloneInContext(linearLayout.getContext());
            }
            this.b = (FrameLayout) layoutInflater.inflate(R.layout.homepage_recommend_multi_tab_view, (ViewGroup) null);
        }
        this.c = (FrameLayout) this.b.findViewById(R.id.tab_layout_container);
        this.f12457a = (MultiTabLayout) this.b.findViewById(R.id.multi_tab);
        this.d = (TUrlImageView) this.b.findViewById(R.id.tab_bg_img);
        this.q = (LinearLayout) this.b.findViewById(R.id.multi_sub_container);
        this.H = (LinearLayout) this.b.findViewById(R.id.multi_container);
        this.r = this.b.findViewById(R.id.more_tab_container);
        this.e = (TUrlImageView) this.b.findViewById(R.id.iv_more_tab);
        this.E = (TUrlImageView) this.b.findViewById(R.id.iv_right_top_icon);
        this.s = (TailFadeFrameLayout) this.b.findViewById(R.id.fade_container);
        a0();
        this.f12457a.setPreCreateListener(this.K);
        this.f12457a.addOnTabSelectedListener(this.L);
        this.f12457a.setScrollListener(this.J);
        linearLayout.addView(this.b);
        this.B.H();
        this.w = true;
        this.y = true;
    }

    public final int d0() {
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1682f1d", new Object[]{this})).intValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d9j.c("TabLayoutProvider", "getLastVisibleTabIndex start");
        Rect rect = new Rect();
        int tabCount = this.f12457a.getTabCount();
        int i2 = -1;
        for (int i3 = 0; i3 < tabCount; i3++) {
            TabLayout.f tabAt = this.f12457a.getTabAt(i3);
            if (!(tabAt == null || (d2 = tabAt.d()) == null || !d2.getLocalVisibleRect(rect))) {
                i2 = i3;
            }
        }
        d9j.c("TabLayoutProvider", "getLastVisibleTabIndex end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return i2;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81dffd38", new Object[]{this})).booleanValue();
        }
        d9j.c("TabLayoutProvider", "isEmbedTopBar: " + this.x);
        return this.x;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public int[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4575745a", new Object[]{this, str});
        }
        View a2 = a(str);
        int[] iArr = new int[2];
        if (a2 == null) {
            return iArr;
        }
        a2.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (a2.getWidth() / 2);
        if (TextUtils.equals(str, this.v.t(0))) {
            iArr[0] = iArr[0] + this.m.o;
        }
        iArr[1] = iArr[1] + a2.getHeight();
        return iArr;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void g(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9433ea4f", new Object[]{this, str, bVar});
        } else if (this.w && !TextUtils.isEmpty(str) && this.f12457a != null) {
            this.f12457a.post(new c(this.v.u(str), bVar));
        }
    }

    public final void g0() {
        JSONObject s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d1c752", new Object[]{this});
            return;
        }
        int i2 = this.D;
        if (i2 != -1 && (s = this.v.s(i2)) != null) {
            Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
            while (it.hasNext()) {
                ((a.e) it.next()).d(this.D, s);
            }
            this.D = -1;
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void h(String str) {
        TabLayout.f tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41f42a5", new Object[]{this, str});
        } else if (this.w && !TextUtils.isEmpty(str) && this.f12457a != null && (tabAt = this.f12457a.getTabAt(this.v.u(str))) != null) {
            tabAt.l();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0d4151", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.b bVar = this.F;
        if (bVar != null) {
            c(bVar);
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0612ba6", new Object[]{this});
            return;
        }
        IFestivalService iFestivalService = (IFestivalService) c4b.i().h(IFestivalService.class);
        if (iFestivalService != null) {
            this.A = b0();
            iFestivalService.getFestivalChangeRegister().a(this.A);
        }
    }

    public final void k() {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f35152", new Object[]{this});
            return;
        }
        IStatusBarService iStatusBarService = (IStatusBarService) c4b.i().h(IStatusBarService.class);
        if (iStatusBarService == null) {
            return;
        }
        if (this.m.q) {
            Context context = this.f12457a.getContext();
            if (this.m.x()) {
                i2 = 2;
            }
            iStatusBarService.updateStatusBar(context, i2);
            return;
        }
        iStatusBarService.updateStatusBar(this.f12457a.getContext(), 0);
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a864ae", new Object[]{this});
            return;
        }
        qps qpsVar = this.B;
        if (qpsVar != null && !this.G) {
            ((CopyOnWriteArrayList) this.u).add(qpsVar);
            S(this.B);
            P(this.B);
            R(this.B);
            c(this.B);
            Q(this.B);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f866ce6", new Object[]{this});
        } else {
            s2b.c().r(this.M);
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce68495", new Object[]{this});
            return;
        }
        IPullDownService iPullDownService = (IPullDownService) c4b.i().h(IPullDownService.class);
        if (iPullDownService != null) {
            iPullDownService.addPullRefreshListener(this.N);
        }
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac0c874", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f fVar = this.t;
        if (fVar != null) {
            this.u.add(fVar);
            R(this.t);
            c(this.t);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f12457a;
        if (multiTabLayout != null && this.f != null) {
            this.m.v(multiTabLayout.getContext(), this.f);
            this.F.e();
            h0(this.f);
        }
    }

    @Override // tb.ywc
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ((CopyOnWriteArrayList) this.u).clear();
        ((CopyOnWriteArrayList) this.h).clear();
        ((CopyOnWriteArrayList) this.i).clear();
        ((CopyOnWriteArrayList) this.j).clear();
        ((CopyOnWriteArrayList) this.k).clear();
        s0();
        this.B.C();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrollStateChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 == 1) {
            this.n = 2;
        }
        Iterator it = ((CopyOnWriteArrayList) this.u).iterator();
        while (it.hasNext()) {
            ((a.AbstractC0710a) it.next()).onPageScrollStateChanged(i2);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrolled(int i2, float f2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
            return;
        }
        this.f12457a.updateIndicatorPosition(i2, f2);
        Iterator it = ((CopyOnWriteArrayList) this.u).iterator();
        while (it.hasNext()) {
            ((a.AbstractC0710a) it.next()).onPageScrolled(i2, f2, i3);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageSelected(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            return;
        }
        TabLayout.f tabAt = this.f12457a.getTabAt(i2);
        if (tabAt != null) {
            tabAt.l();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a
    public void p(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4338f3b", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.w) {
            this.n = i3;
            TabLayout.f tabAt = this.f12457a.getTabAt(i2);
            if (tabAt != null) {
                tabAt.l();
            }
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d25778", new Object[]{this});
            return;
        }
        MultiTabLayout multiTabLayout = this.f12457a;
        if (multiTabLayout != null && !this.G) {
            multiTabLayout.post(new f());
        }
    }

    public final void q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e7c181", new Object[]{this, new Boolean(z)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d9j.c("TabLayoutProvider", "updateTabData checkTabParent");
        if (z) {
            this.z = T(this.b);
        }
        d9j.c("TabLayoutProvider", "updateTabData checkTabParent time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6fd01f", new Object[]{this});
            return;
        }
        IFestivalService iFestivalService = (IFestivalService) c4b.i().h(IFestivalService.class);
        if (iFestivalService != null && this.A != null) {
            iFestivalService.getFestivalChangeRegister().b(this.A);
        }
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1f20cd", new Object[]{this});
        } else {
            s2b.c().u(this.M);
        }
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ac6f3c", new Object[]{this});
            return;
        }
        IPullDownService iPullDownService = (IPullDownService) c4b.i().h(IPullDownService.class);
        if (iPullDownService != null) {
            iPullDownService.removePullRefreshListener(this.N);
        }
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e946e8cd", new Object[]{this});
            return;
        }
        int l2 = this.m.l();
        if (!maj.b(maj.INDICATOR_COLOR, l2)) {
            this.f12457a.updateIndicatorStyle(l2, this.G, trs.a(this.f12457a.getContext(), this.m.n));
        }
    }

    public final void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817f232b", new Object[]{this});
        } else if (!this.G) {
            String g2 = this.m.g(true);
            if (!TextUtils.isEmpty(g2) && !maj.c(maj.MORE_IMAGE, g2)) {
                p2b.q(this.e, g2, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                this.e.setImageUrl(g2);
            }
        }
    }

    public final void w0(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9b3ea", new Object[]{this, view, new Integer(i2)});
            return;
        }
        int j2 = this.m.j();
        if (!maj.b(maj.TAB_BG + i2, j2)) {
            view.setBackgroundColor(j2);
        }
    }

    public final void N(JSONObject jSONObject) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d42dfd", new Object[]{this, jSONObject});
            return;
        }
        this.O.f(this.H);
        this.O.e(jSONObject, this.m.q(), this.P.t());
        View childCustomView = this.f12457a.getChildCustomView(0);
        if (childCustomView != null && (findViewWithTag = ((FrameLayout) childCustomView).findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAB_TAG)) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewWithTag.getLayoutParams();
            if (this.O.h() > 0) {
                layoutParams.leftMargin = trs.a(this.f12457a.getContext(), 12.0f);
            } else {
                layoutParams.leftMargin = trs.a(Globals.getApplication(), this.m.o);
            }
            findViewWithTag.setLayoutParams(layoutParams);
            findViewWithTag.post(new RunnableC0709e());
        }
    }

    public final void Z(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81ef4a6", new Object[]{this, new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickBizCode", this.v.t(i2));
        cqv.t("Page_Home", "tabClick_BehaviX_UT", null, null, hashMap, new String[0]);
    }

    @Override // tb.ywc
    public synchronized void r(JSONObject jSONObject, List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f32641", new Object[]{this, jSONObject, list, new Boolean(z)});
        } else if (this.w) {
            if (!(jSONObject == null || list == null || list.isEmpty())) {
                phg.m("TabLayout.uiRefresh");
                if (this.g != jSONObject) {
                    this.f = list;
                    this.g = jSONObject;
                    this.m.w(jSONObject, this.f12457a.getContext());
                    Y(jSONObject);
                    this.I = vaj.t(jSONObject);
                    int i0 = i0(list, z);
                    if (i0 == this.v.n()) {
                        this.t.e(this.f12457a, this.b, this.q, this.s, i0);
                    }
                    boolean D = vaj.D(jSONObject);
                    this.G = D;
                    this.F.g(jSONObject, list, this.f12457a, this.r, this.s, this.e, this.E, D);
                    boolean A = vaj.A(jSONObject);
                    d9j.c("TabLayoutProvider", "updateTabData isCurEmbed:" + A);
                    if (A != this.x || this.y || !this.z) {
                        this.x = A;
                        this.y = false;
                        q0(A);
                    }
                    this.P.w(jSONObject);
                    k();
                    phg.l("TabLayout.uiRefresh");
                }
            }
        }
    }

    public void O(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa7d8d9", new Object[]{this, jSONObject});
        } else if (this.t.n()) {
            d9j.c("TabLayoutProvider", "refreshLeftLocationIcon: refresh stickView");
            this.t.b(0);
            TabLayout.f tabAt = this.f12457a.getTabAt(1);
            if (tabAt != null) {
                tabAt.l();
            }
            this.H.post(new d(jSONObject));
        } else {
            N(jSONObject);
        }
    }

    public final void f0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465f78ca", new Object[]{this, new Integer(i2)});
        } else if (this.l == i2) {
            d9j.c("TabLayoutProvider", "onTabSelected pos already select ");
        } else {
            this.l = i2;
            this.v.H(i2);
            JSONObject s = this.v.s(i2);
            if (s != null) {
                y0(i2);
                this.C.i(this.v.t(i2), i2);
                com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.p.b(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
                boolean z = i2 == this.v.n() && i2 > 0 && this.v.p() == i2 + (-1);
                if (aVar != null) {
                    aVar.m(i2);
                    aVar.k(z);
                }
                Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
                while (it.hasNext()) {
                    ((a.e) it.next()).a(i2, s, this.n == 0);
                }
                if (this.n == 0) {
                    K(i2, s);
                }
                this.n = 0;
                this.f12457a.post(new a());
                k();
            }
        }
    }

    public final synchronized void h0(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf2abc", new Object[]{this, list});
            return;
        }
        int selectedTabPosition = this.f12457a.getSelectedTabPosition();
        try {
            this.f12457a.removeAllTabs();
        } catch (Exception e) {
            d9j.d("TabLayoutProvider", "rebuildTabLayout removeAllTabs error", e);
        }
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).getJSONObject("content") == null) {
                MultiTabLayout multiTabLayout = this.f12457a;
                multiTabLayout.addTab(multiTabLayout.newTab());
            } else {
                this.f12457a.addTab(this.f12457a.newTab(this.o.g(this.f12457a, i2, selectedTabPosition, this.I)), i2 == selectedTabPosition);
            }
            i2++;
        }
        this.f12457a.post(new g(selectedTabPosition));
    }

    public final synchronized int i0(List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4494f821", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        phg.m("TabLayout.refreshTabUi");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d9j.c("TabLayoutProvider", "refreshTabUi start");
        this.b.setBackgroundColor(this.m.g);
        if (!TextUtils.isEmpty(this.m.l)) {
            p2b.q(this.d, this.m.l, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
            this.d.setImageUrl(this.m.l);
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        try {
            this.f12457a.removeAllTabs();
        } catch (Exception e) {
            d9j.d("TabLayoutProvider", "refreshTabUi removeAllTabs error", e);
        }
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            JSONObject jSONObject = list.get(i2).getJSONObject("content");
            if (jSONObject == null) {
                MultiTabLayout multiTabLayout = this.f12457a;
                multiTabLayout.addTab(multiTabLayout.newTab());
            } else {
                if (z) {
                    i3 = jSONObject.getBooleanValue(vaj.KEY_DEFAULT_SELECTED) ? i2 : this.v.n();
                } else {
                    i3 = this.v.o();
                }
                View i4 = this.o.i(i2, i3 == i2);
                if (i4 != null) {
                    d9j.c("TabLayoutProvider", "refreshTabUi updateTabStyle currentTabRemoved:" + z + ",selectedPos:" + i3);
                    this.o.q(i4, i2, i3);
                } else {
                    d9j.c("TabLayoutProvider", "refreshTabUi updateTabStyle buildView:" + i2 + ",selectedPos:" + i3);
                    i4 = this.o.g(this.f12457a, i2, i3, this.I);
                }
                d9j.c("TabLayoutProvider", "refreshTabUi createNewTab currentTabRemoved:" + z + ",selectedPos:" + i3);
                this.f12457a.addTab(this.f12457a.newTab(i4), false);
            }
            i2++;
        }
        this.f12457a.setShowIndicator(this.m.m);
        this.f12457a.updateIndicatorStyle(this.m.l(), this.G, trs.a(this.f12457a.getContext(), this.m.n));
        MultiTabLayout multiTabLayout2 = this.f12457a;
        multiTabLayout2.setIndicatorBottomOffset(DensityUtil.dip2px(multiTabLayout2.getContext(), 4.0f));
        this.f12457a.post(new h(i3, list));
        d9j.c("TabLayoutProvider", "refreshTabUi end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        phg.l("TabLayout.refreshTabUi");
        return i3;
    }

    public final void o0(int i2, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dd0f65", new Object[]{this, new Integer(i2), list});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d9j.c("TabLayoutProvider", "reportTabExposure start");
        if (list != null && !list.isEmpty() && i2 > 0 && i2 < list.size()) {
            for (int i3 = 0; i3 <= i2; i3++) {
                JSONObject jSONObject = list.get(i3);
                if (!jSONObject.getBooleanValue("isTracked")) {
                    M(i3, jSONObject);
                }
            }
            d9j.c("TabLayoutProvider", "reportTabExposure end:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final void y0(int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f46893", new Object[]{this, new Integer(i2)});
            return;
        }
        d9j.c("TabLayoutProvider", "updateTabSelectStyle");
        if (this.f12457a != null) {
            int i3 = 0;
            while (i3 < this.f12457a.getTabCount()) {
                TabLayout.f tabAt = this.f12457a.getTabAt(i3);
                if (!(tabAt == null || tabAt.d() == null)) {
                    View d2 = tabAt.d();
                    srs.b bVar = (srs.b) ((ConcurrentHashMap) this.m.A).get(Integer.valueOf(i3));
                    if (bVar != null) {
                        w0(d2, i3);
                        String str2 = bVar.f28239a;
                        if (!TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(",");
                            if (i2 == i3) {
                                str = "已选中";
                            } else {
                                str = "未选中";
                            }
                            sb.append(str);
                            d2.setContentDescription(sb.toString());
                        }
                        this.o.v(d2, i3, i2 == i3);
                    }
                }
                i3++;
            }
            u0();
            v0();
            this.o.u(i2, this.f12457a);
        }
    }
}
