package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsWidget;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.c3p;
import tb.i6p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class olo implements ude, vyd, zpd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String KEY_USE_NO_STICK_HEADER = "useNoStickHeader";

    /* renamed from: a  reason: collision with root package name */
    public xnp f25463a;
    public jrh b;
    public CommonSearchContext c;
    public bsh d;
    public String e;
    public okn f;
    public pse g;
    public tnl<jrh> h;
    public boolean i;
    public boolean j;
    public ynp k;
    public boolean l;
    public boolean m;
    public boolean n;
    public py4 o;
    public final grh p;
    public qse q;
    public int r;
    public boolean s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793735);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final String a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2beaeb9", new Object[]{this, map});
            }
            ckf.g(map, "params");
            SearchSdk.Companion.b();
            CommonSearchContext fromMap = CommonSearchContext.fromMap(map);
            fromMap.setParam("m", r4p.VALUE_MODULE_INSHOP);
            fromMap.handleInShopSearchParams();
            jrh b = gu6.b(true, fromMap, yak.f31939a);
            b.doNewSearch();
            String c = n1p.b().c(b);
            ckf.f(c, "stashDatasource(...)");
            return c;
        }
    }

    static {
        t2o.a(815793734);
        t2o.a(993002008);
        t2o.a(815793536);
        t2o.a(815793729);
    }

    public olo(boolean z) {
        SearchSdk.Companion.b();
        grh grhVar = new grh(getCore());
        this.p = grhVar;
        grhVar.n1(z);
        grhVar.s1(ylo.CREATOR);
        grhVar.z0(new ose());
        grhVar.t1(false);
        grhVar.J0(true);
        grhVar.w0(true);
        if (l3p.INSTANCE.b() && o4p.d()) {
            k1p.d();
        }
    }

    public static final void O(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d01c08", new Object[]{oloVar});
            return;
        }
        ckf.g(oloVar, "this$0");
        okn oknVar = oloVar.f;
        if (oknVar != null && oknVar.m()) {
            oknVar.y("timeout", "");
        }
    }

    public static final /* synthetic */ int p(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcd97ee7", new Object[]{oloVar})).intValue();
        }
        return oloVar.r;
    }

    public static final /* synthetic */ boolean r(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ea6e327", new Object[]{oloVar})).booleanValue();
        }
        return oloVar.m;
    }

    public static final /* synthetic */ ynp s(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ynp) ipChange.ipc$dispatch("8d5f3c9", new Object[]{oloVar});
        }
        return oloVar.k;
    }

    public static final /* synthetic */ bsh v(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsh) ipChange.ipc$dispatch("73138c09", new Object[]{oloVar});
        }
        return oloVar.d;
    }

    public static final /* synthetic */ void w(olo oloVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14416d9b", new Object[]{oloVar, new Integer(i)});
        } else {
            oloVar.r = i;
        }
    }

    public final RecyclerView A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return F(getView());
    }

    public final jrh C(CommonSearchContext commonSearchContext) {
        jrh jrhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("d6b23cf9", new Object[]{this, commonSearchContext});
        }
        String removeParam = commonSearchContext.removeParam("inshop_preload_token");
        if (!TextUtils.isEmpty(removeParam)) {
            CommonBaseDatasource a2 = n1p.b().a(removeParam);
            if (a2 instanceof jrh) {
                jrhVar = (jrh) a2;
            } else {
                jrhVar = null;
            }
            if (jrhVar != null) {
                pse pseVar = this.g;
                if (pseVar != null) {
                    jrhVar.a1(pseVar);
                    pse pseVar2 = this.g;
                    if (pseVar2 != null) {
                        pseVar2.G(jrhVar);
                        return jrhVar;
                    }
                    ckf.y("controller");
                    throw null;
                }
                ckf.y("controller");
                throw null;
            }
        }
        pse pseVar3 = this.g;
        if (pseVar3 != null) {
            jrh a3 = gu6.a(true, commonSearchContext, pseVar3);
            ckf.f(a3, "createDataSource(...)");
            return a3;
        }
        ckf.y("controller");
        throw null;
    }

    public final void D(boolean z, boolean z2) {
        jrh jrhVar;
        jrh jrhVar2;
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cdccbb7", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        String str = null;
        if (z) {
            bsh bshVar = this.d;
            if (bshVar != null) {
                FrameLayout frameLayout = (FrameLayout) bshVar.getView();
                if (frameLayout != null) {
                    frameLayout.post(new Runnable() { // from class: tb.kmz
                        @Override // java.lang.Runnable
                        public final void run() {
                            olo.x(olo.this);
                        }
                    });
                }
            } else {
                ckf.y("widget");
                throw null;
            }
        }
        if (this.j && !this.i) {
            bsh bshVar2 = this.d;
            if (bshVar2 != null) {
                bshVar2.postEvent(zlo.a());
            } else {
                ckf.y("widget");
                throw null;
            }
        }
        if (!(!z2 || (jrhVar2 = this.b) == null || (commonSearchResult = (CommonSearchResult) jrhVar2.getLastSearchResult()) == null)) {
            String str2 = commonSearchResult.getMainInfo().abtest;
            if (z) {
                N(str2);
            }
        }
        ynp ynpVar = this.k;
        if (ynpVar != null && (jrhVar = this.b) != null) {
            String paramValue = jrhVar.getParamValue("sort");
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) jrhVar.getLastSearchResult();
            if (commonSearchResult2 != null) {
                str = commonSearchResult2.getMainInfo().abtest;
            }
            ynpVar.f(paramValue, str);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838f4012", new Object[]{this});
        } else if (this.j) {
            bsh bshVar = this.d;
            if (bshVar != null) {
                bshVar.postEvent(zlo.a());
            } else {
                ckf.y("widget");
                throw null;
            }
        }
    }

    public final RecyclerView F(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("374839d3", new Object[]{this, view});
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView F = F(viewGroup.getChildAt(i));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7af7e44", new Object[]{this});
            return;
        }
        jrh jrhVar = this.b;
        if (jrhVar != null) {
            jrhVar.a0();
        }
        jrh jrhVar2 = this.b;
        if (jrhVar2 != null) {
            jrhVar2.p0();
        }
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f4e2dda", new Object[]{this});
        }
        jrh jrhVar = this.b;
        if (jrhVar == null) {
            return null;
        }
        jrhVar.c1(true);
        return n1p.b().c(jrhVar);
    }

    public void I(py4 py4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb29b6c0", new Object[]{this, py4Var});
            return;
        }
        ckf.g(py4Var, DataReceiveMonitor.CB_LISTENER);
        this.o = py4Var;
    }

    public void J(ynp ynpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52658b0", new Object[]{this, ynpVar});
        } else {
            this.k = ynpVar;
        }
    }

    public void K(xnp xnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4b9444", new Object[]{this, xnpVar});
        } else {
            this.f25463a = xnpVar;
        }
    }

    public final void L() {
        FrameLayout frameLayout;
        Runnable imzVar;
        bsh bshVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d31a2", new Object[]{this});
        } else if (!o4p.W0() && this.s) {
            jrh jrhVar = this.b;
            if (jrhVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("shopId", jrhVar.getParamValue("shopId"));
                hashMap.put("sellerId", jrhVar.getParamValue("sellerId"));
                sen.d("InshopAllItemDetailBack", hashMap);
            }
            bsh bshVar2 = this.d;
            if (bshVar2 != null) {
                o02 a2 = ((acx) bshVar2.getModel()).a();
                ckf.e(a2, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
                CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) a2;
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                okn u = commonBaseDatasource.u();
                if (u != null) {
                    this.f = u;
                    String g = u.g();
                    if (!TextUtils.isEmpty(g)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("itemId", g);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("appId", "18193");
                        u.j(hashMap3);
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("rainbow", oen.j());
                        if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                            hashMap4.put("sessionId", commonSearchResult.sessionId);
                        }
                        u.k(hashMap4);
                        try {
                            try {
                                gtf.i().o("Page_InshopAllItem", "dynamic_card_scene", hashMap2, new h48(u));
                                bshVar = this.d;
                            } catch (Exception e) {
                                b4p.b("SFShopAuctionModule", e.getMessage());
                                ArrayMap arrayMap = new ArrayMap();
                                arrayMap.put("message", e.getMessage());
                                arrayMap.put(pg1.ATOM_stack, Log.getStackTraceString(e));
                                sen.f("jarvisTriggerAction", arrayMap);
                                bsh bshVar3 = this.d;
                                if (bshVar3 != null) {
                                    frameLayout = (FrameLayout) bshVar3.getView();
                                    if (frameLayout != null) {
                                        imzVar = new Runnable() { // from class: tb.imz
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                olo.O(olo.this);
                                            }
                                        };
                                    } else {
                                        return;
                                    }
                                } else {
                                    ckf.y("widget");
                                    throw null;
                                }
                            }
                            if (bshVar != null) {
                                frameLayout = (FrameLayout) bshVar.getView();
                                if (frameLayout != null) {
                                    imzVar = new Runnable() { // from class: tb.imz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            olo.O(olo.this);
                                        }
                                    };
                                    frameLayout.postDelayed(imzVar, 1000L);
                                    return;
                                }
                                return;
                            }
                            ckf.y("widget");
                            throw null;
                        } catch (Throwable th) {
                            bsh bshVar4 = this.d;
                            if (bshVar4 != null) {
                                FrameLayout frameLayout2 = (FrameLayout) bshVar4.getView();
                                if (frameLayout2 != null) {
                                    frameLayout2.postDelayed(new Runnable() { // from class: tb.imz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            olo.O(olo.this);
                                        }
                                    }, 1000L);
                                }
                                throw th;
                            }
                            ckf.y("widget");
                            throw null;
                        }
                    }
                }
            } else {
                ckf.y("widget");
                throw null;
            }
        }
    }

    public void M(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a68207", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        y(map);
        jrh jrhVar = this.b;
        if (jrhVar != null) {
            jrhVar.r0(map);
        }
    }

    @Override // tb.vyd
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91b06817", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.zpd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // tb.zpd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeb4328", new Object[]{this});
        }
    }

    @Override // tb.zpd
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86dcb8f", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext != null) {
            commonSearchContext.setParam(r4p.KEY_MINI_APP, str);
            jrh jrhVar = this.b;
            if (jrhVar != null) {
                jrhVar.setParam(r4p.KEY_MINI_APP, str);
                return;
            }
            return;
        }
        ckf.y("searchContext");
        throw null;
    }

    @Override // tb.zpd
    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ad2cf3", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        y(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                CommonSearchContext commonSearchContext = this.c;
                if (commonSearchContext != null) {
                    commonSearchContext.setParam(key, value);
                    jrh jrhVar = this.b;
                    if (jrhVar != null) {
                        jrhVar.setParam(key, value);
                    }
                } else {
                    ckf.y("searchContext");
                    throw null;
                }
            } else if (!TextUtils.isEmpty(key) && TextUtils.isEmpty(value)) {
                CommonSearchContext commonSearchContext2 = this.c;
                if (commonSearchContext2 != null) {
                    commonSearchContext2.removeParam(key);
                    jrh jrhVar2 = this.b;
                    if (jrhVar2 != null) {
                        jrhVar2.clearParam(key);
                    }
                } else {
                    ckf.y("searchContext");
                    throw null;
                }
            }
        }
        this.s = TextUtils.equals(map.get(r4p.VALUE_MODULE_DYNAMIC_CARD), "true");
        boolean g = cvr.INSTANCE.g(ckf.b(sse.IN_SHOP_ELDER_HIT_VALUE, map.get(r4p.KEY_SHOP_SEARCH_ELDER)));
        CommonSearchContext commonSearchContext3 = this.c;
        if (commonSearchContext3 != null) {
            commonSearchContext3.setParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(g));
            CommonSearchContext commonSearchContext4 = this.c;
            if (commonSearchContext4 != null) {
                commonSearchContext4.setParam(r4p.KEY_GRAY_HAIR, String.valueOf(g));
                jrh jrhVar3 = this.b;
                if (jrhVar3 != null) {
                    jrhVar3.setParam(r4p.KEY_GRAY_HAIR, String.valueOf(g));
                    return;
                }
                return;
            }
            ckf.y("searchContext");
            throw null;
        }
        ckf.y("searchContext");
        throw null;
    }

    @Override // tb.vyd
    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77333509", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zpd
    public void g(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c772b6bc", new Object[]{this, activity, map});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(map, "params");
        if (ckf.b(map.get(KEY_USE_NO_STICK_HEADER), "true")) {
            this.p.z0(new erh());
        }
        ScreenType.b(activity);
        y(map);
        B(activity, CommonSearchContext.fromMap(map));
    }

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        yko ykoVar = yak.f31939a;
        ckf.f(ykoVar, "CORE");
        return ykoVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // tb.zpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            return bshVar.getView();
        }
        ckf.y("widget");
        throw null;
    }

    @Override // tb.zpd
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93505ac7", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext != null) {
            commonSearchContext.setParam(r4p.KEY_MINI_APP_DETAIL_URL, str);
            jrh jrhVar = this.b;
            if (jrhVar != null) {
                jrhVar.setParam(r4p.KEY_MINI_APP_DETAIL_URL, str);
                return;
            }
            return;
        }
        ckf.y("searchContext");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.zpd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(boolean r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.olo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001a
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r3
            r2 = 1
            r4[r2] = r1
            java.lang.String r1 = "883ea89a"
            r0.ipc$dispatch(r1, r4)
            return
        L_0x001a:
            r3.i = r4
            tb.jrh r0 = r3.b
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "tb2021"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r0.setParam(r1, r2)
        L_0x002a:
            if (r4 == 0) goto L_0x0043
            tb.bsh r4 = r3.d
            r0 = 0
            if (r4 == 0) goto L_0x003c
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            androidx.core.view.ViewCompat.setBackground(r4, r0)
            goto L_0x0043
        L_0x003c:
            java.lang.String r4 = "widget"
            tb.ckf.y(r4)
            throw r0
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.olo.i(boolean):void");
    }

    @Override // tb.zpd
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eddecba", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext != null) {
            commonSearchContext.setParam(r4p.KEY_MINI_APP_CATEGORY_URL, str);
            jrh jrhVar = this.b;
            if (jrhVar != null) {
                jrhVar.setParam(r4p.KEY_MINI_APP_CATEGORY_URL, str);
                return;
            }
            return;
        }
        ckf.y("searchContext");
        throw null;
    }

    @Override // tb.zpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d594d62f", new Object[]{this});
            return;
        }
        jrh jrhVar = this.b;
        if (jrhVar != null) {
            jrhVar.doNewSearch();
        }
    }

    @Override // tb.zpd
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339a1496", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.postEvent(new c3p.f());
        } else {
            ckf.y("widget");
            throw null;
        }
    }

    @Override // tb.zpd
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c139c69d", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.zpd
    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65710a", new Object[]{this, new Integer(i)});
        }
    }

    public final void onEventMainThread(c3p.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2542ff", new Object[]{this, iVar});
            return;
        }
        ckf.g(iVar, "event");
        Intent intent = new Intent(w6f.TAOLIVE_SHOW_MINILIVE_ACTION);
        intent.putExtra("actionType", "updateLivePosition");
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(iVar.f16835a));
        hashMap.put("y", String.valueOf(iVar.b));
        intent.putExtra("actionDatas", JSON.toJSONString(hashMap));
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }

    @Override // tb.zpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.onCtxPauseInternal();
        } else {
            ckf.y("widget");
            throw null;
        }
    }

    @Override // tb.zpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.onCtxResumeInternal();
            L();
            return;
        }
        ckf.y("widget");
        throw null;
    }

    public final void y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed72d03a", new Object[]{this, map});
            return;
        }
        String str = map.get("nextCategoryGuidText");
        if (TextUtils.isEmpty(str)) {
            this.p.p1((String) null);
            this.m = false;
        } else {
            this.p.p1(str);
            this.m = true;
        }
        String str2 = map.get("bottomPadding");
        if (!TextUtils.isEmpty(str2)) {
            this.p.v().g(Integer.valueOf(qrl.e(str2, 0)));
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2cccb6", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements kuc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.kuc
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kuc
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7740ab11", new Object[]{this, new Integer(i)});
                return;
            }
            ynp s = olo.s(olo.this);
            if (s != null) {
                s.d(i);
            }
        }

        @Override // tb.kuc
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd5cfe1d", new Object[]{this, new Integer(i)});
            } else {
                olo.w(olo.this, i);
            }
        }

        @Override // tb.kuc
        public void d(int i) {
            ynp s;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2191d0d", new Object[]{this, new Integer(i)});
            } else if (olo.r(olo.this)) {
                bsh v = olo.v(olo.this);
                if (v != null) {
                    CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) ((acx) v.getModel()).e()).getTotalSearchResult();
                    if (commonSearchResult != null && commonSearchResult.isPageFinished() && olo.p(olo.this) > 150 && (s = olo.s(olo.this)) != null) {
                        s.c();
                    }
                    olo.w(olo.this, 0);
                    return;
                }
                ckf.y("widget");
                throw null;
            }
        }
    }

    public static final void u(olo oloVar, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc83392", new Object[]{oloVar, jrhVar});
            return;
        }
        ckf.g(oloVar, "this$0");
        ckf.g(jrhVar, "$dataSource");
        pse pseVar = oloVar.g;
        if (pseVar != null) {
            pseVar.l(jrhVar, true);
        } else {
            ckf.y("controller");
            throw null;
        }
    }

    public static final void x(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e0b3d4", new Object[]{oloVar});
            return;
        }
        ckf.g(oloVar, "this$0");
        bsh bshVar = oloVar.d;
        if (bshVar != null) {
            bshVar.postEvent(new i6p.a());
            if (!oloVar.l) {
                xnp xnpVar = oloVar.f25463a;
                if (xnpVar != null) {
                    xnpVar.onSearchRenderEnd();
                }
                oloVar.l = true;
                return;
            }
            return;
        }
        ckf.y("widget");
        throw null;
    }

    public void B(Activity activity, CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2d064", new Object[]{this, activity, commonSearchContext});
            return;
        }
        ckf.g(activity, "activity");
        if (commonSearchContext != null) {
            this.c = commonSearchContext;
            this.p.a0().g(new b());
            commonSearchContext.setParam("m", r4p.VALUE_MODULE_INSHOP);
            commonSearchContext.handleInShopSearchParams();
            pse pseVar = new pse(getCore(), activity);
            this.g = pseVar;
            pseVar.g1(this);
            final jrh C = C(commonSearchContext);
            pse pseVar2 = this.g;
            if (pseVar2 != null) {
                pseVar2.X0(commonSearchContext);
                pse pseVar3 = this.g;
                if (pseVar3 != null) {
                    this.h = pseVar3.v();
                    DetailPreRequestUtil.a aVar = DetailPreRequestUtil.Companion;
                    String c = aVar.a().c(true);
                    this.e = c;
                    if (c != null) {
                        C.x(c, true);
                        tnl<jrh> tnlVar = this.h;
                        if (tnlVar != null) {
                            tnlVar.q(h1p.CONFIG_LIST_CLIP_CHILDREN, Boolean.FALSE);
                            tnl<jrh> tnlVar2 = this.h;
                            if (tnlVar2 != null) {
                                tnlVar2.q(DetailPreRequestUtil.PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE, aVar.a().d(true));
                                yko ykoVar = yak.f31939a;
                                ckf.f(ykoVar, "CORE");
                                xfn xfnVar = new xfn(ykoVar, C);
                                pse pseVar4 = this.g;
                                if (pseVar4 != null) {
                                    pseVar4.W0(xfnVar);
                                    grh grhVar = this.p;
                                    pse pseVar5 = this.g;
                                    if (pseVar5 != null) {
                                        bsh bshVar = new bsh(grhVar, activity, this, pseVar5.t(), null, new k4k());
                                        this.d = bshVar;
                                        bshVar.subscribeScopeEvent(this, "childPageWidget");
                                        bsh bshVar2 = this.d;
                                        if (bshVar2 != null) {
                                            bshVar2.subscribeEvent(this);
                                            C.subscribePreSearch(this, -10);
                                            if (TextUtils.equals(commonSearchContext.getParam("isNewStyle"), "true")) {
                                                i(true);
                                            }
                                            this.b = C;
                                            bsh bshVar3 = this.d;
                                            if (bshVar3 != null) {
                                                bshVar3.attachToContainer();
                                                bsh bshVar4 = this.d;
                                                if (bshVar4 != null) {
                                                    bshVar4.w3();
                                                    bsh bshVar5 = this.d;
                                                    if (bshVar5 != null) {
                                                        pse pseVar6 = this.g;
                                                        if (pseVar6 != null) {
                                                            bshVar5.x2(pseVar6);
                                                            bsh bshVar6 = this.d;
                                                            if (bshVar6 != null) {
                                                                bshVar6.d3();
                                                                bsh bshVar7 = this.d;
                                                                if (bshVar7 != null) {
                                                                    ((juc) bshVar7.t2()).commit();
                                                                    this.q = new qse(activity, C);
                                                                    MSearchResult U0 = C.U0();
                                                                    if (U0 != null && C.R0()) {
                                                                        U0.setHeaderChange(true);
                                                                        View view = getView();
                                                                        if (view != null) {
                                                                            view.post(new Runnable() { // from class: tb.jmz
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    olo.u(olo.this, C);
                                                                                }
                                                                            });
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                ckf.y("widget");
                                                                throw null;
                                                            }
                                                            ckf.y("widget");
                                                            throw null;
                                                        }
                                                        ckf.y("controller");
                                                        throw null;
                                                    }
                                                    ckf.y("widget");
                                                    throw null;
                                                }
                                                ckf.y("widget");
                                                throw null;
                                            }
                                            ckf.y("widget");
                                            throw null;
                                        }
                                        ckf.y("widget");
                                        throw null;
                                    }
                                    ckf.y("controller");
                                    throw null;
                                }
                                ckf.y("controller");
                                throw null;
                            }
                            ckf.y("pageModel");
                            throw null;
                        }
                        ckf.y("pageModel");
                        throw null;
                    }
                    ckf.y("detailPreToken");
                    throw null;
                }
                ckf.y("controller");
                throw null;
            }
            ckf.y("controller");
            throw null;
        }
    }

    public final void N(String str) {
        xnp xnpVar;
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f006b8ff", new Object[]{this, str});
            return;
        }
        jrh jrhVar = this.b;
        if (jrhVar != null && (xnpVar = this.f25463a) != null) {
            HashMap hashMap = new HashMap();
            String paramValue = jrhVar.getParamValue("shopId");
            String str2 = "";
            if (TextUtils.isEmpty(paramValue)) {
                paramValue = str2;
            }
            hashMap.put("shop_id", paramValue);
            String paramValue2 = jrhVar.getParamValue("sellerId");
            if (TextUtils.isEmpty(paramValue2)) {
                paramValue2 = str2;
            }
            hashMap.put("seller_id", paramValue2);
            hashMap.put("bucket_id", str);
            hashMap.put("inshops", "search");
            String paramValue3 = jrhVar.getParamValue("sort");
            if (TextUtils.isEmpty(paramValue3)) {
                paramValue3 = "_coefp";
            }
            hashMap.put("sort_tag", paramValue3);
            CommonSearchContext commonSearchContext = this.c;
            if (commonSearchContext != null) {
                if (!ckf.b("category", commonSearchContext.getParam("from", str2))) {
                    String paramValue4 = jrhVar.getParamValue(r4p.KEY_KEYWORD_PATH);
                    if (!TextUtils.isEmpty(paramValue4)) {
                        str2 = paramValue4;
                    }
                    hashMap.put("shopsearchq", str2);
                }
                hashMap.put("encode_rainbow", g6p.d(oen.j()));
                CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
                if (!(commonSearchResult == null || (combo = commonSearchResult.getCombo(0)) == null)) {
                    String str3 = combo.T().rn;
                    if (str3 == null) {
                        str3 = commonSearchResult.getMainInfo().rn;
                    }
                    hashMap.put("pageid", str3);
                }
                xnpVar.onPagePropertiesUpdate(hashMap);
                return;
            }
            ckf.y("searchContext");
            throw null;
        }
    }

    @Override // tb.zpd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb5e479", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            ((jrh) ((acx) bshVar.getModel()).e()).postEvent(vxo.a());
            onEventMainThread(new CrossTipsWidget.a(false));
            return;
        }
        ckf.y("widget");
        throw null;
    }

    @Override // tb.zpd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.onCtxDestroyInternal();
            DetailPreRequestUtil a2 = DetailPreRequestUtil.Companion.a();
            String str = this.e;
            if (str != null) {
                a2.i(str, true);
                qse qseVar = this.q;
                if (qseVar != null) {
                    qseVar.a();
                } else {
                    ckf.y("gotoTopChannel");
                    throw null;
                }
            } else {
                ckf.y("detailPreToken");
                throw null;
            }
        } else {
            ckf.y("widget");
            throw null;
        }
    }

    @Override // tb.zpd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2eb35d", new Object[]{this});
        } else if (!this.i) {
            bsh bshVar = this.d;
            if (bshVar != null) {
                FrameLayout frameLayout = (FrameLayout) bshVar.getView();
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                this.j = true;
                return;
            }
            ckf.y("widget");
            throw null;
        }
    }

    public final void onEventMainThread(CrossTipsWidget.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500365e8", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "event");
        if (this.n != aVar.a()) {
            boolean a2 = aVar.a();
            this.n = a2;
            py4 py4Var = this.o;
            if (py4Var != null) {
                py4Var.a(a2);
            }
            c4p.D("moyutest", "cross shop rec ".concat(this.n ? "showed" : "hidden"), new Object[0]);
        }
    }

    public final void onEventMainThread(ayo ayoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f64efd3", new Object[]{this, ayoVar});
            return;
        }
        ckf.g(ayoVar, "scrollStop");
        ynp ynpVar = this.k;
        if (ynpVar != null) {
            ynpVar.b(ayoVar.f16078a);
        }
    }

    public final void onEventMainThread(wxo wxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0506", new Object[]{this, wxoVar});
            return;
        }
        ckf.g(wxoVar, "event");
        int i = wxoVar.f31002a + 1;
        bsh bshVar = this.d;
        if (bshVar != null) {
            int totalResultCount = ((jrh) ((acx) bshVar.getModel()).e()).getTotalResultCount();
            ynp ynpVar = this.k;
            if (ynpVar != null) {
                ynpVar.l(i, totalResultCount);
                return;
            }
            return;
        }
        ckf.y("widget");
        throw null;
    }
}
