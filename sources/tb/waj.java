package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.multitab.SubWrapFrameLayout;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.hudscreen.IHudScreenService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ovq;
import tb.uaj;
import tb.zaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class waj implements txd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean x;

    /* renamed from: a  reason: collision with root package name */
    public int f30561a;
    public final gbj b;
    public JSONObject c;
    public JSONObject d;
    public zaj e;
    public IHudScreenService.a f;
    public final fuq g;
    public View i;
    public final fdc k;
    public final IMultiTabPerformanceListener l;
    public String m;
    public String o;
    public boolean p;
    public final IHomeSubTabController q;
    public a.b r;
    public final wcc s;
    public IPageLifeCycle t;
    public final a.b u;
    public final ovq.c v;
    public boolean j = false;
    public boolean n = false;
    public final zaj.a w = new c();
    public final k1b h = new k1b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            IHomeSubTabController a2 = waj.this.a();
            if (a2 != null) {
                a2.onPullDistance(i);
            }
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            IHomeSubTabController a2 = waj.this.a();
            if (a2 != null) {
                a2.onPullRefresh();
            }
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.b
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            IHomeSubTabController a2 = waj.this.a();
            if (a2 != null) {
                a2.onRefreshStateChanged(edc.a(refreshState), edc.a(refreshState2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ovq.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ovq.c
        public void b(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbefd956", new Object[]{this, iHomeSubTabController});
                return;
            }
            d9j.c("MultiTabHelper", "OnBundleLoadListener subscribeTab assign");
            waj.b(waj.this).a(iHomeSubTabController);
            int p = waj.b(waj.this).p();
            if (p == -1) {
                d9j.c("MultiTabHelper", "OnBundleLoadListener subscribeTab not create");
                return;
            }
            waj.b(waj.this).C(p);
            waj.c(waj.this).u(p, true);
            if (waj.p(waj.this) == p) {
                iHomeSubTabController.onPageSelected();
                muq.b();
            }
        }

        @Override // tb.ovq.c
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
        public void d(int i, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5a3619e", new Object[]{this, new Integer(i), jSONObject});
                return;
            }
            waj wajVar = waj.this;
            waj.n(wajVar, waj.b(wajVar).t(i));
            IHomeSubTabController q = waj.b(waj.this).q(i);
            if (q != null) {
                q.onPageUnSelected();
            }
            if (vaj.C(jSONObject)) {
                waj.f(waj.this, true);
            }
            waj.y(waj.this).c(waj.m(waj.this), i);
            d9j.c("MultiTabHelper", "onTabUnSelected: " + i + ", controller: " + q);
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
        public void a(int i, JSONObject jSONObject, boolean z) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ff5e72f", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
                return;
            }
            waj.x(waj.this, jSONObject);
            waj.q(waj.this, i);
            waj.y(waj.this).g("tabSelected");
            IHomeViewService iHomeViewService = (IHomeViewService) waj.d(waj.this).a(IHomeViewService.class);
            if (iHomeViewService != null) {
                iHomeViewService.setSelectedByTopMultiTab(false);
            }
            IHomeSubTabController a2 = waj.this.a();
            if (a2 == null) {
                d9j.c("MultiTabHelper", "current tab controller is null, pos: " + i);
                return;
            }
            a2.onTabClicked();
            waj.c(waj.this).B(false);
            if (vaj.C(jSONObject)) {
                waj.c(waj.this).e(a2);
                if (waj.e(waj.this)) {
                    a2.onPageSelected();
                    waj.g(waj.this, jSONObject);
                    waj.h(waj.this, a2);
                    waj.f(waj.this, false);
                } else {
                    r5a.t(waj.i(waj.this), waj.j(waj.this));
                }
            } else {
                waj.g(waj.this, jSONObject);
                View w = waj.b(waj.this).w(waj.p(waj.this));
                if (w instanceof SubWrapFrameLayout) {
                    z2 = ((SubWrapFrameLayout) w).isRealView();
                }
                if (waj.b(waj.this).y(waj.p(waj.this)) || !z2) {
                    d9j.c("MultiTabHelper", "MultiTabHelp -> reRenderTabView " + waj.p(waj.this));
                    waj.b(waj.this).J(waj.p(waj.this));
                    waj.c(waj.this).u(waj.p(waj.this), false);
                } else {
                    waj.c(waj.this).e(a2);
                    d9j.c("MultiTabHelper", "MultiTabHelp -> onPageSelected " + waj.p(waj.this));
                    a2.onPageSelected();
                    waj.b(waj.this).J(-1);
                }
                waj.h(waj.this, a2);
            }
            waj.k(waj.this, vaj.w(jSONObject), jSONObject, i);
            waj wajVar = waj.this;
            waj.l(wajVar, wajVar.L());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements IHudScreenService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.tao.topmultitab.service.hudscreen.IHudScreenService.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f39e510", new Object[]{this});
            } else {
                waj.this.Z();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -1392519801) {
                super.onCreateView();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/MultiTabHelper$6");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onCreateView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acffd587", new Object[]{this});
                return;
            }
            super.onCreateView();
            waj.o(waj.this);
        }
    }

    static {
        t2o.a(729809449);
        t2o.a(729810100);
    }

    public waj(fdc fdcVar, JSONObject jSONObject, IHomeSubTabController iHomeSubTabController, wcc wccVar) {
        this.f30561a = -2;
        a aVar = new a();
        b bVar = new b();
        this.d = jSONObject;
        this.s = wccVar;
        this.q = iHomeSubTabController;
        e1b e1bVar = new e1b(this, new f1b(iHomeSubTabController, fdcVar));
        this.k = e1bVar;
        fuq fuqVar = new fuq(e1bVar, bVar);
        this.g = fuqVar;
        wfz wfzVar = new wfz(fuqVar);
        this.l = wfzVar;
        ebj ebjVar = new ebj(fuqVar);
        fuqVar.I(wfzVar);
        fuqVar.K(ebjVar);
        fuqVar.M(jSONObject, M());
        fuqVar.L(new suq(fuqVar));
        gbj gbjVar = new gbj(fuqVar, jSONObject, e1bVar, wfzVar);
        this.b = gbjVar;
        gbjVar.A(C());
        gbjVar.d(aVar);
        this.f30561a = vaj.i(this.d);
        j0();
        h0();
        wfzVar.o("multiTab");
    }

    public static /* synthetic */ fuq b(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("e7b3b580", new Object[]{wajVar});
        }
        return wajVar.g;
    }

    public static /* synthetic */ gbj c(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbj) ipChange.ipc$dispatch("c190cfdb", new Object[]{wajVar});
        }
        return wajVar.b;
    }

    public static /* synthetic */ wcc d(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("d7b6a1f6", new Object[]{wajVar});
        }
        return wajVar.s;
    }

    public static /* synthetic */ boolean e(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c99bff4", new Object[]{wajVar})).booleanValue();
        }
        return wajVar.j;
    }

    public static /* synthetic */ boolean f(waj wajVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69479b6a", new Object[]{wajVar, new Boolean(z)})).booleanValue();
        }
        wajVar.j = z;
        return z;
    }

    public static /* synthetic */ void g(waj wajVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9357fe01", new Object[]{wajVar, jSONObject});
        } else {
            wajVar.p0(jSONObject);
        }
    }

    public static /* synthetic */ void h(waj wajVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d2973", new Object[]{wajVar, iHomeSubTabController});
        } else {
            wajVar.A(iHomeSubTabController);
        }
    }

    public static /* synthetic */ Activity i(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ad4dec3b", new Object[]{wajVar});
        }
        return wajVar.H();
    }

    public static /* synthetic */ Map j(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4806b0a1", new Object[]{wajVar});
        }
        return wajVar.O();
    }

    public static /* synthetic */ void k(waj wajVar, String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e42c28", new Object[]{wajVar, str, jSONObject, new Integer(i)});
        } else {
            wajVar.Y(str, jSONObject, i);
        }
    }

    public static /* synthetic */ void l(waj wajVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86ea474", new Object[]{wajVar, str});
        } else {
            wajVar.z(str);
        }
    }

    public static /* synthetic */ String m(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d63b7", new Object[]{wajVar});
        }
        return wajVar.m;
    }

    public static /* synthetic */ String n(waj wajVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99bc596f", new Object[]{wajVar, str});
        }
        wajVar.m = str;
        return str;
    }

    public static /* synthetic */ void o(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864c56e8", new Object[]{wajVar});
        } else {
            wajVar.i0();
        }
    }

    public static /* synthetic */ int p(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f73e011", new Object[]{wajVar})).intValue();
        }
        return wajVar.f30561a;
    }

    public static /* synthetic */ int q(waj wajVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1b1411a", new Object[]{wajVar, new Integer(i)})).intValue();
        }
        wajVar.f30561a = i;
        return i;
    }

    public static /* synthetic */ JSONObject r(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d5aa1d", new Object[]{wajVar});
        }
        return wajVar.d;
    }

    public static /* synthetic */ JSONObject s(waj wajVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db7e5535", new Object[]{wajVar, jSONObject});
        }
        wajVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean t(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81e085e0", new Object[]{wajVar})).booleanValue();
        }
        return wajVar.F();
    }

    public static /* synthetic */ void u(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8316d8bb", new Object[]{wajVar});
        } else {
            wajVar.k0();
        }
    }

    public static /* synthetic */ void v(waj wajVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830e6a96", new Object[]{wajVar, jSONObject});
        } else {
            wajVar.g0(jSONObject);
        }
    }

    public static /* synthetic */ void w(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85837e79", new Object[]{wajVar});
        } else {
            wajVar.B();
        }
    }

    public static /* synthetic */ JSONObject x(waj wajVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a437da3a", new Object[]{wajVar, jSONObject});
        }
        wajVar.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ IMultiTabPerformanceListener y(waj wajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMultiTabPerformanceListener) ipChange.ipc$dispatch("82705658", new Object[]{wajVar});
        }
        return wajVar.l;
    }

    public final void A(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10037ea6", new Object[]{this, iHomeSubTabController});
        } else if (iHomeSubTabController != null) {
            this.h.a();
            this.h.b(iHomeSubTabController);
            r5a.r(O());
            this.h.c(iHomeSubTabController);
        }
    }

    public final a.e C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.e) ipChange.ipc$dispatch("88b27c3f", new Object[]{this});
        }
        return new d();
    }

    public View D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View i = this.b.i(context);
        this.i = i;
        return i;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2be6a7cb", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableMultiTabOutLinkCompensate", true);
    }

    public void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388183ba", new Object[]{this, new Boolean(z)});
        } else {
            this.b.j(z);
        }
    }

    public final Activity H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        z6d c2 = h2b.a().c();
        if (c2 != null) {
            return c2.k1();
        }
        d9j.c("MultiTabHelper", "pageProvider == null");
        return null;
    }

    public View I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("632da627", new Object[]{this, str});
        }
        gbj gbjVar = this.b;
        if (gbjVar != null) {
            return gbjVar.k(str);
        }
        return null;
    }

    public String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53729d5b", new Object[]{this});
        }
        return this.g.j(this.f30561a);
    }

    public JSONObject K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3de703c3", new Object[]{this});
        }
        return this.g.s(this.f30561a);
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5d090c", new Object[]{this});
        }
        return this.g.t(this.f30561a);
    }

    public IHomeSubTabController M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("5fa52dc9", new Object[]{this});
        }
        IHomeSubTabController iHomeSubTabController = this.q;
        if (!(iHomeSubTabController instanceof gnn)) {
            return null;
        }
        IHomeSubTabController defaultSubController = ((gnn) iHomeSubTabController).getDefaultSubController();
        HomeInfoFlowDataService a2 = rue.a(yyj.e().k());
        if (defaultSubController == null || a2 == null) {
            defaultSubController = new i0b(this.k, xti.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
        }
        ((gnn) this.q).setDefaultSubTabController(defaultSubController);
        return defaultSubController;
    }

    public i0b N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0b) ipChange.ipc$dispatch("a153b7aa", new Object[]{this});
        }
        IHomeSubTabController m = this.g.m();
        if (m instanceof i0b) {
            return (i0b) m;
        }
        return null;
    }

    public final Map<String, String> O() {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1ba6d315", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = this.c;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("passOnTrack")) == null)) {
            for (String str2 : jSONObject.keySet()) {
                Object obj = jSONObject.get(str2);
                if (obj == null) {
                    str = "";
                } else {
                    str = obj.toString();
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    public JSONObject P(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a39b1c41", new Object[]{this, iHomeSubTabController});
        }
        return this.g.v(iHomeSubTabController);
    }

    public IHomeSubTabController Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("8dd100", new Object[]{this, str});
        }
        fuq fuqVar = this.g;
        if (fuqVar != null) {
            return fuqVar.r(str);
        }
        return null;
    }

    public List<String> S(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("504b8412", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            String x2 = this.g.x(this.f30561a, false);
            if (!TextUtils.isEmpty(x2)) {
                arrayList.add(x2);
            }
        }
        if (z2) {
            String x3 = this.g.x(this.f30561a, true);
            if (!TextUtils.isEmpty(x3)) {
                arrayList.add(x3);
            }
        }
        return arrayList;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43df7919", new Object[]{this})).booleanValue();
        }
        if (this.g.k() == this.g.p()) {
            return true;
        }
        return false;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39968a7", new Object[]{this})).booleanValue();
        }
        if (this.g.p() == this.f30561a) {
            return true;
        }
        return false;
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7326361a", new Object[]{this})).booleanValue();
        }
        if (this.f30561a == -2 || this.g.n() == this.f30561a) {
            return true;
        }
        return false;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b13f965", new Object[]{this})).booleanValue();
        }
        return this.b.p();
    }

    public void X(Uri uri, String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1b8f26", new Object[]{this, uri, str, bVar});
            return;
        }
        d9j.c("MultiTabHelper", "外链拉起: " + uri);
        String queryParameter = uri.getQueryParameter("categoryTabId");
        this.r = bVar;
        if (TextUtils.isEmpty(queryParameter)) {
            l0();
            a.b bVar2 = this.r;
            if (bVar2 != null) {
                ((uaj.a) bVar2).a();
            }
        } else if (!F()) {
            m0(queryParameter);
        } else if (this.p) {
            m0(queryParameter);
            d9j.c("MultiTabHelper", "外链唤起，tab已刷新过了，直接跳转: " + queryParameter);
        } else {
            this.o = queryParameter;
            d9j.c("MultiTabHelper", "外链唤起，tab尚未锚定过，等待补偿: " + queryParameter);
        }
    }

    public final void Y(String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8511644", new Object[]{this, str, jSONObject, new Integer(i)});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) this.s.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService == null || str == null) {
            fve.e("MultiTabHelper", "通知tab变化了，当前tab类型为空");
            return;
        }
        iHomePageLifecycleService.selectMultiTab(str, vaj.F(jSONObject, this.d), i);
        fve.e("MultiTabHelper", "通知tab变化了，当前tab类型：".concat(str));
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
            return;
        }
        gbj gbjVar = this.b;
        if (gbjVar != null) {
            gbjVar.s();
        }
    }

    @Override // tb.txd
    public IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("ae0b87e6", new Object[]{this});
        }
        return this.g.q(this.f30561a);
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        d9j.c("MultiTabHelper", "onStart");
        zaj zajVar = this.e;
        if (zajVar != null) {
            zajVar.d();
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        d9j.c("MultiTabHelper", "onStop");
        zaj zajVar = this.e;
        if (zajVar != null) {
            zajVar.e();
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.l;
        if (iMultiTabPerformanceListener != null) {
            ((wfz) iMultiTabPerformanceListener).m();
        }
    }

    public final void c0(v7d v7dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e2fe9", new Object[]{this, v7dVar, str});
            return;
        }
        IHomeSubTabController q = this.g.q(this.g.u(str));
        if (q != null) {
            q.passThroughData(v7dVar, null, null);
        }
    }

    public void d0(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0cdc44", new Object[]{this, v7dVar, str, str2});
        } else if (TextUtils.equals("categoryTab", str)) {
            c0(v7dVar, str2);
        } else {
            e0(v7dVar, str, str2);
        }
    }

    public final void e0(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66863ba8", new Object[]{this, v7dVar, str, str2});
            return;
        }
        IHomeSubTabController m = this.g.m();
        if (m != null) {
            m.passThroughData(v7dVar, str, str2);
        }
    }

    public View f0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        return this.b.t(context);
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da50f0e2", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) this.s.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            this.t = new f();
            iHomePageLifecycleService.getPageLifeCycleRegister().a(this.t);
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c7425a", new Object[]{this});
        } else if (b9b.h() || b9b.e()) {
            if (this.f == null) {
                this.f = new e();
            }
            IHudScreenService iHudScreenService = (IHudScreenService) this.s.a(IHudScreenService.class);
            if (iHudScreenService != null) {
                iHudScreenService.addOnScreenChangeListener(this.f);
            }
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = new zaj(this.w);
        }
        IHomeDataService iHomeDataService = (IHomeDataService) this.s.a(IHomeDataService.class);
        if (iHomeDataService != null) {
            iHomeDataService.addOnUiRefreshListener(this.e);
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc63d5f", new Object[]{this});
        } else {
            tve.c("Page_Home", "", "1.0", "MultiTab_Discard_Cache", "", null);
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a912ee5c", new Object[]{this});
        } else {
            this.b.x(this.g.n(), -1);
        }
    }

    public final void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125427a9", new Object[]{this, str});
            return;
        }
        gbj gbjVar = this.b;
        if (gbjVar != null) {
            gbjVar.y(str, this.r);
        }
    }

    public void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33080d1", new Object[]{this, str});
            return;
        }
        gbj gbjVar = this.b;
        if (gbjVar != null) {
            gbjVar.z(str);
        }
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
        } else {
            this.b.B(z);
        }
    }

    public final void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e9a4c9", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) this.s.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null && this.t != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.t);
        }
    }

    public final void r0() {
        IHudScreenService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f6b113", new Object[]{this});
            return;
        }
        IHudScreenService iHudScreenService = (IHudScreenService) this.s.a(IHudScreenService.class);
        if (iHudScreenService != null && (aVar = this.f) != null) {
            iHudScreenService.removeOnScreenChangeListener(aVar);
        }
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) this.s.a(IHomeDataService.class);
        zaj zajVar = this.e;
        if (zajVar != null && iHomeDataService != null) {
            iHomeDataService.removeOnUiRefreshListener(zajVar);
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca90bf2", new Object[]{this, str});
            return;
        }
        d9j.c("MultiTabHelper", "commitMessiah leaveTabId: " + this.m + ", enterTabId: " + str);
        if (!TextUtils.isEmpty(this.m)) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("extKey1", this.m);
            hashMap.put("extKey2", str);
            this.m = null;
            gve.b("QPS", "Page_MultiTab", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements zaj.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b6feabe", new Object[]{this, jSONObject});
                return;
            }
            d9j.c("MultiTabHelper", "onBaseRefresh onProcess ");
            waj.s(waj.this, jSONObject);
            waj wajVar = waj.this;
            waj.v(wajVar, waj.r(wajVar));
            waj.w(waj.this);
            waj.c(waj.this).C();
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c86d3107", new Object[]{this, jSONObject});
                return;
            }
            waj.s(waj.this, jSONObject);
            d9j.c("MultiTabHelper", "onDeltaRefresh onProcess ");
            boolean z = vaj.z(waj.c(waj.this).n(), vaj.x(waj.r(waj.this)));
            d9j.c("MultiTabHelper", "onProcess different：" + z);
            if (z) {
                waj wajVar = waj.this;
                waj.v(wajVar, waj.r(wajVar));
            }
            waj.c(waj.this).C();
        }

        public boolean a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fdbc8b45", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
            }
            if ("coldStart".equals(str2)) {
                waj.x = true;
                d9j.c("MultiTabHelper", "冷启请求完成");
            }
            if (!"coldStart".equals(str) || !z || waj.r(waj.this) == null || !waj.t(waj.this)) {
                return true;
            }
            d9j.c("MultiTabHelper", "冷启之后缓存上屏，直接丢弃");
            waj.u(waj.this);
            return false;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d240886b", new Object[]{this});
        } else if (x) {
            this.p = true;
            if (!TextUtils.isEmpty(this.o) && F()) {
                d9j.c("MultiTabHelper", "外链拉起补偿: " + this.o);
                m0(this.o);
                this.o = null;
            }
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        View view = this.i;
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
            d9j.c("MultiTabHelper", "removeView mContentView");
        }
        if (f4b.b("fixMultiTabMemoryLeak", true)) {
            this.i = null;
            d9j.c("MultiTabHelper", "mContentView == null");
        }
        this.g.f();
        this.b.r();
        s0();
        r0();
        q0();
        d9j.c("MultiTabHelper", "destroy");
    }

    public final void p0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44aa25b9", new Object[]{this, jSONObject});
        } else if (!vaj.B(jSONObject)) {
            d9j.c("MultiTabHelper", "不需要发请求");
        } else {
            this.n = true;
            yyj.e().F();
        }
    }

    public Map<String, String> R(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae705f2e", new Object[]{this, str});
        }
        JSONObject jSONObject3 = this.c;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject(vaj.KEY_SMART_CONTENT)) == null || (jSONObject2 = jSONObject.getJSONObject("searchParams")) == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        if (TextUtils.equals("MultiTabSelect", str) && !this.n) {
            z = false;
        }
        hpl.m(jSONObject2, z);
        hashMap.put("multiTab", JSON.toJSONString(jSONObject2));
        this.n = false;
        return hashMap;
    }

    public final void g0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee925f0", new Object[]{this, jSONObject});
            return;
        }
        d9j.c("MultiTabHelper", "refreshTabs");
        String j = dvh.j(dvh.TASK_UI_REFRESH);
        dvh.b("refreshTabs", j);
        phg.m("MultiTab.refreshTabs");
        this.j = false;
        this.g.M(jSONObject, M());
        this.b.v(jSONObject);
        phg.l("MultiTab.refreshTabs");
        dvh.f("refreshTabs", true, j);
    }
}
