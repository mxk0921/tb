package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import tb.a1v;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.cv4;
import tb.d1a;
import tb.h1p;
import tb.i04;
import tb.jpu;
import tb.jwk;
import tb.kew;
import tb.mmi;
import tb.npp;
import tb.olo;
import tb.r4p;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.v3i;
import tb.wsq;
import tb.xhv;
import tb.xnp;
import tb.yj4;
import tb.ynp;
import tb.zpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AllItemsContentRender extends BaseShopContentRender implements ynp, xnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public boolean B;
    public boolean C;
    public final Context g;
    public final ups h;
    public final FrameLayout i;
    public zpd j;
    public int k;
    public Map<String, String> m;
    public Map<String, String> n;
    public boolean p;
    public Shop2023CategoryNativeComponent r;
    public jwk s;
    public final mmi t;
    public cv4 u;
    public int w;
    public int x;
    public boolean y;
    public final a z;
    public final String l = "Page_Shop_All_Item";
    public final Map<String, String> o = new LinkedHashMap();
    public final boolean q = aqp.Companion.n();
    public final int v = 13;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements jwk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jwk.a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
            }
            if (AllItemsContentRender.z(AllItemsContentRender.this) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(766509591);
        t2o.a(815792535);
        t2o.a(815792533);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender(Context context, ups upsVar) {
        super(context, upsVar);
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.g = context;
        this.h = upsVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        this.t = new mmi(context, "shop_allitem", null);
        ShopDataParser o = upsVar.o();
        if (o != null) {
            o.Y2("nativeAllItemContainer", "true");
        }
        frameLayout.setBackgroundColor(-1);
        this.z = new a(Looper.getMainLooper());
    }

    public static final /* synthetic */ void A(AllItemsContentRender allItemsContentRender, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5621bcdd", new Object[]{allItemsContentRender, bundle});
        } else {
            allItemsContentRender.M(bundle);
        }
    }

    public static final /* synthetic */ void B(AllItemsContentRender allItemsContentRender, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a21c84", new Object[]{allItemsContentRender, new Boolean(z)});
        } else {
            allItemsContentRender.y = z;
        }
    }

    public static final /* synthetic */ void C(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3366139", new Object[]{allItemsContentRender});
        } else {
            allItemsContentRender.O();
        }
    }

    public static /* synthetic */ void I(AllItemsContentRender allItemsContentRender, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5cd497", new Object[]{allItemsContentRender, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        allItemsContentRender.H(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(AllItemsContentRender allItemsContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 877680342:
                super.k();
                return null;
            case 1065519279:
                super.j();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/AllItemsContentRender");
        }
    }

    public static final /* synthetic */ zpd v(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpd) ipChange.ipc$dispatch("bb8bd8cc", new Object[]{allItemsContentRender});
        }
        return allItemsContentRender.j;
    }

    public static final /* synthetic */ Shop2023CategoryNativeComponent w(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023CategoryNativeComponent) ipChange.ipc$dispatch("f0b7ed75", new Object[]{allItemsContentRender});
        }
        return allItemsContentRender.r;
    }

    public static final /* synthetic */ cv4 x(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv4) ipChange.ipc$dispatch("47d19797", new Object[]{allItemsContentRender});
        }
        return allItemsContentRender.u;
    }

    public static final /* synthetic */ a y(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4aae574a", new Object[]{allItemsContentRender});
        }
        return allItemsContentRender.z;
    }

    public static final /* synthetic */ int z(AllItemsContentRender allItemsContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd1657ca", new Object[]{allItemsContentRender})).intValue();
        }
        return allItemsContentRender.k;
    }

    public final void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5717a0d7", new Object[]{this, map});
            return;
        }
        String str = map.get("from_spm");
        if (str == null && (str = map.get("spm")) == null) {
            str = "";
        }
        map.put("from_spm", str);
        map.put("mainse_query", K(map));
        map.put("bxConfigInvokeId", "shop.request.allitem");
        map.put("bxConfigBizId", "PageShop");
        map.put("bxConfigCurScene", ShopConstants.PAGE_SHOP);
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be30ce5", new Object[]{this});
        } else if (this.p && this.q) {
            this.p = false;
            L();
            I(this, null, 1, null);
        }
    }

    public final Context F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.g;
    }

    public final ups G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("dd6916a6", new Object[]{this});
        }
        return this.h;
    }

    public final void L() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fb2d65", new Object[]{this});
            return;
        }
        this.i.removeAllViews();
        try {
            zpd zpdVar = this.j;
            this.j = null;
            if (zpdVar != null) {
                zpdVar.onDestroy();
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public final void O() {
        JSONObject c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31924b21", new Object[]{this});
            return;
        }
        Map<String, String> map = this.m;
        String str = null;
        String str2 = map == null ? null : map.get("spm-cnt");
        ShopDataParser o = this.h.o();
        String string = (o == null || (c3 = o.c3(this.h.k())) == null) ? null : c3.getString("spm");
        if (!(string == null || string.length() == 0)) {
            str2 = string;
        }
        Context context = this.g;
        ShopDataParser o2 = this.h.o();
        a1v.g(context, "identityCode", o2 == null ? null : o2.s0());
        Context context2 = this.g;
        ShopDataParser o3 = this.h.o();
        if (o3 != null) {
            str = o3.f3();
        }
        a1v.g(context2, "identityType", str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.g, this.n);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.g, this.o);
        a1v.i(this.g, str2, this.l);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(v3i.f(jpu.a("spm-url", str2)));
    }

    @Override // tb.ynp
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ea01d4", new Object[]{this});
            return;
        }
        Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = this.r;
        if (shop2023CategoryNativeComponent != null) {
            shop2023CategoryNativeComponent.B();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = this.r;
        if (shop2023CategoryNativeComponent != null) {
            shop2023CategoryNativeComponent.D();
        }
        zpd zpdVar = this.j;
        if (zpdVar != null) {
            ((olo) zpdVar).onDestroy();
        }
        this.j = null;
        this.t.a();
    }

    @Override // tb.ynp
    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c0fcdb", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> map = this.m;
        if (map != null) {
            map.put("sort_tag", str);
        }
        Map<String, String> map2 = this.m;
        if (map2 != null) {
            map2.put("bucket_id", str2);
        }
        O();
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        View c;
        View c2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        r54.E(new AllItemsContentRender$onViewSelectedByViewPager$1(this), 200L);
        zpd zpdVar = this.j;
        if (zpdVar != null) {
            ((olo) zpdVar).a();
        }
        N();
        Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = this.r;
        if (shop2023CategoryNativeComponent != null) {
            Shop2023CategoryNativeComponent.M(shop2023CategoryNativeComponent, false, 1, null);
        }
        cv4 cv4Var = this.u;
        if (cv4Var != null) {
            i = cv4Var.d();
        }
        if (i > this.v) {
            cv4 cv4Var2 = this.u;
            if (cv4Var2 != null && (c2 = cv4Var2.c()) != null) {
                kew.g0(c2);
                return;
            }
            return;
        }
        cv4 cv4Var3 = this.u;
        if (cv4Var3 != null && (c = cv4Var3.c()) != null) {
            kew.C(c);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        View c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        zpd zpdVar = this.j;
        if (zpdVar != null) {
            zpdVar.b();
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.g);
        cv4 cv4Var = this.u;
        if (cv4Var != null && (c = cv4Var.c()) != null) {
            kew.C(c);
        }
    }

    @Override // tb.ynp
    public void l(int i, int i2) {
        View c;
        cv4 cv4Var;
        View c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73cd391", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        cv4 cv4Var2 = this.u;
        if (cv4Var2 != null) {
            cv4Var2.j(i2);
        }
        cv4 cv4Var3 = this.u;
        if (cv4Var3 != null) {
            cv4Var3.i(i);
        }
        this.x = i;
        if (i <= this.v) {
            cv4 cv4Var4 = this.u;
            if (cv4Var4 != null && (c = cv4Var4.c()) != null) {
                kew.C(c);
            }
        } else if (a() && (cv4Var = this.u) != null && (c2 = cv4Var.c()) != null) {
            kew.g0(c2);
        }
    }

    @Override // tb.xnp
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        zpd zpdVar = this.j;
        if (zpdVar != null) {
            zpdVar.onPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        zpd zpdVar = this.j;
        if (zpdVar != null) {
            ((olo) zpdVar).onResume();
        }
        if (a()) {
            O();
        }
    }

    public final Map<String, String> J() {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2c0d6714", new Object[]{this});
        }
        Uri parse = Uri.parse(this.h.n());
        ckf.f(parse, "parse(tabBarItemDataModel.getRenderUrl())");
        Map<String, String> p = r54.p(parse);
        p.remove("appId");
        this.o.put("inNativeShop", "true");
        this.o.put("inShop", "true");
        Map<String, String> map = this.o;
        ShopDataParser o = this.h.o();
        String str = null;
        map.put("shop_id", o == null ? null : o.W0());
        Map<String, String> map2 = this.o;
        ShopDataParser o2 = this.h.o();
        if (o2 != null) {
            str = o2.N0();
        }
        map2.put("seller_id", str);
        p.put("nativeAllItemContainer", "true");
        ShopDataParser o3 = this.h.o();
        if (o3 != null && o3.G1()) {
            pair = new Pair("a2141", "b37071050");
        } else {
            pair = new Pair("a2141", "7631671");
        }
        p.put("shopAuctionSpmCnt", ((String) pair.getFirst()) + '.' + ((String) pair.getSecond()));
        p.put("spm-cnt", ((String) pair.getFirst()) + '.' + ((String) pair.getSecond()) + ".0.0");
        D(p);
        p.put(r4p.KEY_IS_WEEX_SHOP, "true");
        return p;
    }

    public final String K(Map<String, String> map) {
        JSONObject jSONObject;
        String string;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1647c2c", new Object[]{this, map});
        }
        String str2 = map.get("upText");
        if (str2 == null) {
            str2 = "";
        }
        JSONObject k = brf.k(map.get(yj4.PARAM_UT_PARAMS));
        if (!(k == null || k.get(h1p.LIST_PARAM_KEY) != null || (jSONObject = k.getJSONObject("s_utmap")) == null || (string = jSONObject.getString(h1p.LIST_PARAM_KEY)) == null || (str = (String) i04.d0(wsq.z0(string, new String[]{"_"}, false, 0, 6, null), 0)) == null)) {
            str2 = str;
        }
        String str3 = map.get("mainse_query");
        if (str3 != null) {
            str2 = str3;
        }
        return str2.length() > 10 ? "" : str2;
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6620994d", new Object[]{this});
            return;
        }
        JSONObject jSONObject = null;
        if (this.j != null) {
            ShopDataParser o = this.h.o();
            if (o != null) {
                jSONObject = o.F0(this.h.k());
            }
            if (jSONObject == null) {
                E();
                return;
            }
            ShopDataParser o2 = this.h.o();
            if (o2 != null) {
                o2.p2(this.h.k());
            }
            npp.Companion.b("refresh allItems");
            L();
            H(jSONObject);
            return;
        }
        I(this, null, 1, null);
    }

    public final void M(Bundle bundle) {
        String H;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e31c971", new Object[]{this, bundle});
            return;
        }
        if (this.r == null) {
            z = false;
        }
        if (z || this.y) {
            npp.a aVar = npp.Companion;
            aVar.b("allitems not save instance, crossShop : " + this.y + " , category : " + z);
            return;
        }
        npp.Companion.b("allitems save instance data");
        zpd zpdVar = this.j;
        if ((zpdVar instanceof olo) && (H = ((olo) zpdVar).H()) != null) {
            bundle.putInt("allItems_last_index", this.x);
            bundle.putString("inshop_preload_token", H);
        }
    }

    @Override // tb.xnp
    public void onSearchRenderEnd() {
        ShopDataParser.h g1;
        RecyclerView A;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
            return;
        }
        r();
        ShopDataParser o = this.h.o();
        if (o != null) {
            o.Z2("shopAuctionSearchRenderEnd", Long.valueOf(System.currentTimeMillis()));
        }
        ShopDataParser o2 = this.h.o();
        if (o2 != null && (g1 = o2.g1()) != null && g1.a()) {
            zpd zpdVar = this.j;
            olo oloVar = zpdVar instanceof olo ? (olo) zpdVar : null;
            if (oloVar != null && (A = oloVar.A()) != null && (F() instanceof Activity)) {
                Bundle extras = ((Activity) F()).getIntent().getExtras();
                if (extras != null) {
                    i = extras.getInt("allItems_last_index", 0);
                }
                Bundle extras2 = ((Activity) F()).getIntent().getExtras();
                if (extras2 != null) {
                    extras2.remove("allItems_last_index");
                }
                if (i != 0) {
                    r54.E(new AllItemsContentRender$onSearchRenderEnd$1$1(A, i), 300L);
                }
            }
        }
    }

    @Override // tb.ynp
    public void b(int i) {
        jwk jwkVar;
        ShopDataParser.ShopViewContext m1;
        d1a<xhv> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966f8e6", new Object[]{this, new Integer(i)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b(ckf.p("onSearchScrollStop : ", Integer.valueOf(i)));
        this.A = i;
        if (this.B) {
            aVar.b("onSearchScrollStop");
            this.B = false;
            ShopDataParser o = this.h.o();
            if (!(o == null || (m1 = o.m1()) == null || (h = m1.h()) == null)) {
                h.invoke();
            }
        }
        if (this.C) {
            this.C = false;
            this.t.d(brf.a(jpu.a("_msg_name", "scrollEnd"), jpu.a("offset", Integer.valueOf(i))));
        }
        if (!(i != 0 || this.w == 0 || (jwkVar = this.s) == null)) {
            jwkVar.b();
        }
        cv4 cv4Var = this.u;
        if (cv4Var != null) {
            cv4Var.l();
        }
        this.w = 0;
    }

    @Override // tb.ynp
    public void d(int i) {
        ShopDataParser.ShopViewContext m1;
        d1a<xhv> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29d45c8", new Object[]{this, new Integer(i)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b(ckf.p("onSearchScroll : ", Integer.valueOf(i)));
        this.w += i;
        int i2 = this.k - i;
        this.k = i;
        if (!this.B && i2 < 0 && Math.abs(this.A - i) >= 500) {
            aVar.b("onSearchScroll");
            this.B = true;
            ShopDataParser o = this.h.o();
            if (!(o == null || (m1 = o.m1()) == null || (g = m1.g()) == null)) {
                g.invoke();
            }
        }
        if (!this.C) {
            cv4 cv4Var = this.u;
            if (cv4Var != null) {
                cv4Var.k();
            }
            this.C = true;
            this.t.d(brf.a(jpu.a("_msg_name", "scrollStart"), jpu.a("offset", Integer.valueOf(i))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.view.ViewGroup] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(com.alibaba.fastjson.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.AllItemsContentRender.H(com.alibaba.fastjson.JSONObject):void");
    }
}
