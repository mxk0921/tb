package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.android.agoo.common.AgooConstants;
import tb.a0g;
import tb.app;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.dun;
import tb.glk;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.mjn;
import tb.mop;
import tb.npp;
import tb.t2o;
import tb.xpd;
import tb.yz3;
import tb.z9u;
import tb.z9w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponent {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a A;

    /* renamed from: a  reason: collision with root package name */
    public ShopLoftComponentView f2990a;
    public Context b;
    public int d;
    public final mjn f;
    public Bundle g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Uri m;
    public boolean n;
    public boolean o;
    public JSONObject q;
    public JSONObject r;
    public String t;
    public String u;
    public String v;
    public String w;
    public JSONObject z;
    public final ShopLoftComponentListAdapter c = new ShopLoftComponentListAdapter();
    public final int e = 10;
    public boolean p = true;
    public final boolean s = true;
    public final JSONObject x = new JSONObject();
    public final JSONArray y = new JSONArray();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(boolean z);

        void c(ArrayList<JSONObject> arrayList);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b implements ShopContentRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftComponent f2991a;

        static {
            t2o.a(766509154);
            t2o.a(766509140);
        }

        public b(ShopLoftComponent shopLoftComponent) {
            ckf.g(shopLoftComponent, "this$0");
            this.f2991a = shopLoftComponent;
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9312b648", new Object[]{this});
                return;
            }
            npp.Companion.b("swipe to bottom");
            this.f2991a.L();
            c a0 = ShopLoftComponent.a(this.f2991a).a0();
            if (a0 != null) {
                a0.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void a();

        void b(String str);

        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements xpd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xpd.a.AbstractC1101a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
            }
        }

        @Override // tb.xpd.b
        public void d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec2c32a", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                ShopLoftComponent.c(ShopLoftComponent.this).add(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends glk<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopLoftComponent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, Object obj2, ShopLoftComponent shopLoftComponent) {
            super(obj2);
            this.b = shopLoftComponent;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$special$$inlined$observable$1");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, bool, bool2});
                return;
            }
            ckf.g(a0gVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            ShopLoftComponentView e = ShopLoftComponent.e(this.b);
            if (e != null) {
                e.setHasNext(booleanValue);
            } else {
                ckf.y("componentView");
                throw null;
            }
        }
    }

    public ShopLoftComponent() {
        Boolean bool = Boolean.TRUE;
        this.f = new e(bool, bool, this);
    }

    public static final /* synthetic */ ShopLoftComponentListAdapter a(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponentListAdapter) ipChange.ipc$dispatch("b6716707", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.c;
    }

    public static final /* synthetic */ boolean b(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("922534f2", new Object[]{shopLoftComponent})).booleanValue();
        }
        return shopLoftComponent.o;
    }

    public static final /* synthetic */ JSONArray c(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1deedf48", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.y;
    }

    public static final /* synthetic */ String d(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8da20a3", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.w;
    }

    public static final /* synthetic */ ShopLoftComponentView e(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponentView) ipChange.ipc$dispatch("c09ede06", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.f2990a;
    }

    public static final /* synthetic */ String f(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baac42e8", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.v;
    }

    public static final /* synthetic */ JSONObject g(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41989715", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.r;
    }

    public static final /* synthetic */ boolean h(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec52c379", new Object[]{shopLoftComponent})).booleanValue();
        }
        return shopLoftComponent.p;
    }

    public static final /* synthetic */ boolean i(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f50198", new Object[]{shopLoftComponent})).booleanValue();
        }
        return shopLoftComponent.n;
    }

    public static final /* synthetic */ int j(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("759baf4f", new Object[]{shopLoftComponent})).intValue();
        }
        return shopLoftComponent.d;
    }

    public static final /* synthetic */ String k(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12d1c46d", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.t;
    }

    public static final /* synthetic */ JSONObject l(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("389fef23", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.q;
    }

    public static final /* synthetic */ String m(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ed9ea7", new Object[]{shopLoftComponent});
        }
        return shopLoftComponent.h;
    }

    public static final /* synthetic */ boolean n(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef615963", new Object[]{shopLoftComponent})).booleanValue();
        }
        return shopLoftComponent.s;
    }

    public static final /* synthetic */ void o(ShopLoftComponent shopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffbf58e", new Object[]{shopLoftComponent});
        } else {
            shopLoftComponent.I();
        }
    }

    public static final /* synthetic */ void p(ShopLoftComponent shopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a850d41a", new Object[]{shopLoftComponent, new Boolean(z)});
        } else {
            shopLoftComponent.o = z;
        }
    }

    public static final /* synthetic */ void q(ShopLoftComponent shopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e804c70b", new Object[]{shopLoftComponent, new Boolean(z)});
        } else {
            shopLoftComponent.p = z;
        }
    }

    public static final /* synthetic */ void r(ShopLoftComponent shopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9ac629", new Object[]{shopLoftComponent, new Boolean(z)});
        } else {
            shopLoftComponent.O(z);
        }
    }

    public static final /* synthetic */ void s(ShopLoftComponent shopLoftComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a37eb33", new Object[]{shopLoftComponent, new Integer(i)});
        } else {
            shopLoftComponent.d = i;
        }
    }

    public static final /* synthetic */ void t(ShopLoftComponent shopLoftComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50910b11", new Object[]{shopLoftComponent, str});
        } else {
            shopLoftComponent.t = str;
        }
    }

    public final View A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        ShopLoftComponentView shopLoftComponentView = this.f2990a;
        if (shopLoftComponentView != null) {
            return shopLoftComponentView;
        }
        ckf.y("componentView");
        throw null;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded4168d", new Object[]{this});
            return;
        }
        xpd.a X = this.c.X();
        Context context = this.b;
        if (context != null) {
            X.c("shopLoftVideoController", new z9w(context));
            xpd.a X2 = this.c.X();
            Context context2 = this.b;
            if (context2 != null) {
                X2.c("shopLoftDXEngine", new app(new ShopLoftDXEngine((Activity) context2)));
                this.c.X().c("shopLoftPerformanceMonitorObject", new d());
                return;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final void D(long j, long j2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a12d3b", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.x.put((JSONObject) mop.KEY_CONTAINER_START, (String) Long.valueOf(j));
        this.x.put((JSONObject) "containerEnd", (String) Long.valueOf(j2));
        this.x.put((JSONObject) "cardPerformanceData", (String) this.y);
        this.x.put((JSONObject) "shopId", this.i);
        this.x.put((JSONObject) "sellerId", this.j);
        if (khu.d()) {
            str = "high";
        } else {
            str = "unknown";
        }
        if (khu.e()) {
            str = "low";
        }
        if (khu.f()) {
            str = "middle";
        }
        this.x.put((JSONObject) "deviceLevel", str);
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f0c2d7e", new Object[]{this})).booleanValue();
        }
        ShopLoftComponentView shopLoftComponentView = this.f2990a;
        if (shopLoftComponentView != null) {
            ShopContentRecyclerView recyclerView = shopLoftComponentView.getRecyclerView();
            if (recyclerView == null) {
                return false;
            }
            return recyclerView.isSlideToTop();
        }
        ckf.y("componentView");
        throw null;
    }

    public final void F() {
        xpd d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = this.c.W();
        if (!(W == null || (d0 = W.d0()) == null)) {
            d0.onActivityPause();
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W2 = this.c.W();
        if (W2 != null) {
            W2.o0();
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W3 = this.c.W();
        if (W3 != null) {
            W3.p0(true);
        }
    }

    public final void G() {
        xpd d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = this.c.W();
        if (!(W == null || (d0 = W.d0()) == null)) {
            d0.onActivityResume();
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W2 = this.c.W();
        if (W2 != null) {
            W2.n0();
        }
    }

    public final void H() {
        xpd d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = this.c.W();
        if (W != null && (d0 = W.d0()) != null) {
            d0.onActivityStop();
        }
    }

    public final void I() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d5b60f", new Object[]{this});
        } else if (!ckf.b("shop", this.h) && (str = this.i) != null) {
            String p = ckf.p("https://shop.m.taobao.com/shop/shop_index.htm?shop_id=", str);
            Context context = this.b;
            if (context != null) {
                khu.h(context, p);
            } else {
                ckf.y("context");
                throw null;
            }
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        this.c.f0();
        ShopExtKt.u0(this.x);
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        Bundle bundle = this.g;
        if (bundle != null) {
            bundle.getString("title");
        }
        Bundle bundle2 = this.g;
        String str = null;
        this.i = bundle2 == null ? null : bundle2.getString("shop_id");
        Bundle bundle3 = this.g;
        this.j = bundle3 == null ? null : bundle3.getString("seller_id");
        Bundle bundle4 = this.g;
        this.h = bundle4 == null ? null : bundle4.getString("source");
        Bundle bundle5 = this.g;
        String string = bundle5 == null ? null : bundle5.getString("first_media_id");
        if (string == null) {
            JSONObject jSONObject = this.q;
            string = jSONObject == null ? null : jSONObject.getString("id");
        }
        this.k = string;
        Bundle bundle6 = this.g;
        String string2 = bundle6 == null ? null : bundle6.getString("first_media_scene");
        if (string2 == null) {
            JSONObject jSONObject2 = this.q;
            string2 = jSONObject2 == null ? null : jSONObject2.getString("sceneId");
        }
        this.l = string2;
        Bundle bundle7 = this.g;
        if (bundle7 != null) {
            str = bundle7.getString("entrySpm");
        }
        this.u = str;
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889a0e1e", new Object[]{this});
        } else if (x()) {
            JSONObject a2 = brf.a(jpu.a("entrysource", this.h), jpu.a("entryspm", this.u));
            Context context = this.b;
            if (context != null) {
                ShopMoreUtils.INSTANCE.g(context, this.j, this.k, this.l, String.valueOf(this.d), String.valueOf(this.e), this.s, this.t, this.m, a2, new ShopLoftComponent$requestListData$1(this));
                return;
            }
            ckf.y("context");
            throw null;
        }
    }

    public final void M(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8f7178", new Object[]{this, aVar});
        } else {
            this.A = aVar;
        }
    }

    public final void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a96e2d", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopLoftComponentView shopLoftComponentView = this.f2990a;
        if (shopLoftComponentView == null) {
            return;
        }
        if (shopLoftComponentView != null) {
            shopLoftComponentView.setEnableSwipeUpAutoCloseShopLoft(z);
        } else {
            ckf.y("componentView");
            throw null;
        }
    }

    public final void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c367c22", new Object[]{this, new Boolean(z)});
        } else {
            ((glk) this.f).a(this, $$delegatedProperties[0], Boolean.valueOf(z));
        }
    }

    public final void P(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c57fca6", new Object[]{this, jSONObject});
        } else {
            this.z = jSONObject;
        }
    }

    public final void Q(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74061232", new Object[]{this, cVar});
        } else {
            this.c.k0(cVar);
        }
    }

    public final JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dbcafb67", new Object[]{this});
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = this.c.W();
        if (W == null) {
            return null;
        }
        return W.getData();
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0188ffc", new Object[]{this});
        }
        ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = this.c.W();
        if (W == null) {
            return null;
        }
        return W.getType();
    }

    public final a w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("54938f2c", new Object[]{this});
        }
        return this.A;
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ff6182", new Object[]{this})).booleanValue();
        }
        return ((Boolean) ((glk) this.f).b(this, $$delegatedProperties[0])).booleanValue();
    }

    public final ShareContent y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return this.c.Y();
    }

    public final JSONObject z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52271136", new Object[]{this});
        }
        return this.z;
    }

    public final void B(Context context, Bundle bundle) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bd8f23", new Object[]{this, context, bundle});
            return;
        }
        ckf.g(context, "context");
        ShopExtKt.v0();
        long currentTimeMillis = System.currentTimeMillis();
        this.b = context;
        this.g = bundle;
        C();
        ShopLoftComponentView shopLoftComponentView = new ShopLoftComponentView(context);
        this.f2990a = shopLoftComponentView;
        shopLoftComponentView.setClosePageCallback(new ShopLoftComponent$init$1(this));
        ShopLoftComponentView shopLoftComponentView2 = this.f2990a;
        if (shopLoftComponentView2 != null) {
            shopLoftComponentView2.setSwipeToBottomCallback(new b(this));
            ShopLoftComponentView shopLoftComponentView3 = this.f2990a;
            if (shopLoftComponentView3 != null) {
                kew.T(shopLoftComponentView3);
                this.q = brf.k(bundle == null ? null : bundle.getString("loftData"));
                JSONObject k = brf.k(bundle == null ? null : bundle.getString(AgooConstants.MESSAGE_EXT));
                if (k == null) {
                    k = new JSONObject();
                }
                this.r = k;
                Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) context);
                this.v = pageAllProperties == null ? null : pageAllProperties.get(z9u.KEY_UTPARAM_URL);
                if (!(bundle == null || (string = bundle.getString("loftUrl")) == null)) {
                    Uri parse = Uri.parse(string);
                    this.m = parse;
                    String queryParameter = parse == null ? null : parse.getQueryParameter("clickid");
                    this.w = queryParameter;
                    JSONObject jSONObject2 = this.r;
                    if (jSONObject2 != null) {
                        jSONObject2.put("clickid", (Object) queryParameter);
                    }
                }
                K();
                JSONObject jSONObject3 = this.r;
                if (!(jSONObject3 == null || (jSONObject = this.q) == null)) {
                    this.n = true;
                    jSONObject.putAll(jSONObject3);
                }
                JSONObject jSONObject4 = this.q;
                if (jSONObject4 != null) {
                    jSONObject4.put("source", (Object) this.h);
                }
                if (aqp.Companion.C()) {
                    JSONObject jSONObject5 = this.q;
                    if (ckf.b("663", jSONObject5 == null ? null : jSONObject5.getString("sceneId"))) {
                        this.q = null;
                    }
                }
                JSONObject jSONObject6 = this.q;
                this.n = jSONObject6 != null;
                if (jSONObject6 != null) {
                    this.c.setDataList(yz3.g(jSONObject6));
                    a aVar = this.A;
                    if (aVar != null) {
                        JSONObject jSONObject7 = this.q;
                        if (jSONObject7 != null) {
                            aVar.a(jSONObject7);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    JSONObject jSONObject8 = this.q;
                    if (ShopLoftViewManager.isMarketType(jSONObject8 == null ? null : jSONObject8.getString("sceneId"))) {
                        JSONObject jSONObject9 = this.q;
                        if (ckf.b("13", jSONObject9 == null ? null : jSONObject9.getString("contentType"))) {
                            ShopLoftComponentView shopLoftComponentView4 = this.f2990a;
                            if (shopLoftComponentView4 != null) {
                                shopLoftComponentView4.setLastItemIsLiveCard(true);
                            } else {
                                ckf.y("componentView");
                                throw null;
                            }
                        }
                    }
                } else {
                    this.c.setDataList(new ArrayList());
                }
                this.c.i0(bundle);
                ShopLoftComponentView shopLoftComponentView5 = this.f2990a;
                if (shopLoftComponentView5 != null) {
                    shopLoftComponentView5.setAdapter(this.c);
                    ShopLoftComponentView shopLoftComponentView6 = this.f2990a;
                    if (shopLoftComponentView6 != null) {
                        shopLoftComponentView6.init();
                        L();
                        D(currentTimeMillis, System.currentTimeMillis());
                        return;
                    }
                    ckf.y("componentView");
                    throw null;
                }
                ckf.y("componentView");
                throw null;
            }
            ckf.y("componentView");
            throw null;
        }
        ckf.y("componentView");
        throw null;
    }

    static {
        t2o.a(766509152);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(dun.b(ShopLoftComponent.class), "hasNext", "getHasNext()Z");
        dun.f(mutablePropertyReference1Impl);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
    }
}
