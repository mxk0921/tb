package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import tb.bqd;
import tb.brf;
import tb.ckf;
import tb.fmi;
import tb.jpu;
import tb.jwk;
import tb.kew;
import tb.mmi;
import tb.njg;
import tb.t2o;
import tb.ups;
import tb.uqp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SubscribeViewContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ups g;
    public final Context h;
    public final njg i = kotlin.a.b(new SubscribeViewContentRender$rootContainer$2(this));
    public View j;
    public Map<String, String> k;
    public String l;
    public final Map<String, String> m;
    public String n;
    public String o;
    public final uqp p;
    public final mmi q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements bqd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bqd
        public void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
                return;
            }
            SubscribeViewContentRender.A(SubscribeViewContentRender.this, map);
            SubscribeViewContentRender.D(SubscribeViewContentRender.this);
        }

        @Override // tb.bqd
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e373f147", new Object[]{this, str});
                return;
            }
            SubscribeViewContentRender.z(SubscribeViewContentRender.this, str);
            SubscribeViewContentRender.C(SubscribeViewContentRender.this);
        }

        @Override // tb.bqd
        public void updatePageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
                return;
            }
            SubscribeViewContentRender.y(SubscribeViewContentRender.this, str);
            SubscribeViewContentRender.B(SubscribeViewContentRender.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fmi
        public final void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.event.broadcast.a aVar = new com.alibaba.triver.triver_shop.newShop.event.broadcast.a(obj);
            if (ckf.b("2.0.0", aVar.l())) {
                if (aVar.o()) {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(SubscribeViewContentRender.v(SubscribeViewContentRender.this), SubscribeViewContentRender.x(SubscribeViewContentRender.this));
                } else if (aVar.p()) {
                    UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(SubscribeViewContentRender.v(SubscribeViewContentRender.this));
                } else if (obj instanceof String) {
                    JSONObject parseObject = JSON.parseObject((String) obj);
                    if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS, parseObject.getString("_msg_name"))) {
                        String string = parseObject.getString("status");
                        if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED, string)) {
                            SubscribeViewContentRender.w(SubscribeViewContentRender.this).g((Object) null);
                        } else if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED, string)) {
                            SubscribeViewContentRender.w(SubscribeViewContentRender.this).g((Object) null);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements jwk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.jwk.a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
            }
            return SubscribeViewContentRender.w(SubscribeViewContentRender.this).c();
        }
    }

    static {
        t2o.a(766509736);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeViewContentRender(ups upsVar, Context context) {
        super(context, upsVar);
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(context, "context");
        this.g = upsVar;
        this.h = context;
        this.m = F(context);
        this.p = new uqp(context, new a());
        this.q = new mmi(context, "mashop_broadcast", new b());
    }

    public static final /* synthetic */ void A(SubscribeViewContentRender subscribeViewContentRender, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687cad38", new Object[]{subscribeViewContentRender, map});
        } else {
            subscribeViewContentRender.k = map;
        }
    }

    public static final /* synthetic */ void B(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0286d7", new Object[]{subscribeViewContentRender});
        } else {
            subscribeViewContentRender.H();
        }
    }

    public static final /* synthetic */ void C(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cea88a", new Object[]{subscribeViewContentRender});
        } else {
            subscribeViewContentRender.I();
        }
    }

    public static final /* synthetic */ void D(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa44737", new Object[]{subscribeViewContentRender});
        } else {
            subscribeViewContentRender.J();
        }
    }

    public static /* synthetic */ Object ipc$super(SubscribeViewContentRender subscribeViewContentRender, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/SubscribeViewContentRender");
        }
    }

    public static final /* synthetic */ Context v(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e890302a", new Object[]{subscribeViewContentRender});
        }
        return subscribeViewContentRender.h;
    }

    public static final /* synthetic */ uqp w(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqp) ipChange.ipc$dispatch("48c4f4a1", new Object[]{subscribeViewContentRender});
        }
        return subscribeViewContentRender.p;
    }

    public static final /* synthetic */ String x(SubscribeViewContentRender subscribeViewContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5af25d04", new Object[]{subscribeViewContentRender});
        }
        return subscribeViewContentRender.G();
    }

    public static final /* synthetic */ void y(SubscribeViewContentRender subscribeViewContentRender, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706603fe", new Object[]{subscribeViewContentRender, str});
        } else {
            subscribeViewContentRender.l = str;
        }
    }

    public static final /* synthetic */ void z(SubscribeViewContentRender subscribeViewContentRender, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec93216f", new Object[]{subscribeViewContentRender, str});
        } else {
            subscribeViewContentRender.getClass();
        }
    }

    public final FrameLayout E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("69e8e0c9", new Object[]{this});
        }
        return (FrameLayout) this.i.getValue();
    }

    public final String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.l)) {
            return "Page_DingYueShopIndexAll";
        }
        return this.l;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a41a931", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "_msg_type", "aplus.enter");
        jSONObject.put((JSONObject) "_msg_token", this.n);
        jSONObject.put((JSONObject) "_msg_source", this.o);
        jSONObject.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "isonepage", (String) Boolean.TRUE);
        jSONObject2.put((JSONObject) "pageName", G());
        jSONObject.put((JSONObject) "pageConfig", (String) jSONObject2);
        jSONObject.put((JSONObject) "params", (String) this.k);
        this.q.d(jSONObject);
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1f64", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "_msg_type", "aplus.updateNextPageProperties");
        jSONObject.put((JSONObject) "_msg_token", this.n);
        jSONObject.put((JSONObject) "_msg_source", this.o);
        jSONObject.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        jSONObject.put((JSONObject) "pageConfig", (String) null);
        jSONObject.put((JSONObject) "params", (String) null);
        this.q.d(jSONObject);
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cc0311", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "_msg_type", "aplus.updatePageProperties");
        jSONObject.put((JSONObject) "_msg_token", this.n);
        jSONObject.put((JSONObject) "_msg_source", this.o);
        jSONObject.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "pageName", G());
        jSONObject2.put((JSONObject) "isonepage", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "pageConfig", (String) jSONObject2);
        jSONObject.put((JSONObject) "params", (String) this.k);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.h, this.k);
        this.q.d(jSONObject);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        E().removeAllViews();
        this.p.d();
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(E());
        kew.Y(E());
        return E();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        if (this.j == null) {
            t();
            this.j = this.p.a(this.m);
            ShopDataParser o = this.g.o();
            if (o != null) {
                i = o.D0();
            }
            if (i == 0) {
                i = -1;
            }
            FrameLayout E = E();
            View view = this.j;
            ckf.d(view);
            E.addView(view, -1, i);
            jwk o2 = ShopExtKt.o(this.h, this.g.k());
            if (o2 != null) {
                o2.c(new c());
            }
            r();
        }
        this.p.f();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        this.p.e();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.p.e();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.p.f();
    }

    public final Map<String, String> F(Context context) {
        String q1;
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa312bcf", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        ShopDataParser o = this.g.o();
        Boolean bool = null;
        String W0 = o == null ? null : o.W0();
        ShopDataParser o2 = this.g.o();
        Pair a2 = jpu.a("sellerId", o2 == null ? null : o2.N0());
        Pair a3 = jpu.a("shopId", W0);
        Pair a4 = jpu.a("isNewStyle", Boolean.TRUE);
        ShopDataParser o3 = this.g.o();
        if (o3 != null) {
            bool = Boolean.valueOf(o3.G1());
        }
        HashMap i = kotlin.collections.a.i(a2, a3, a4, jpu.a("is2022Style", bool));
        ShopDataParser o4 = this.g.o();
        if (!(o4 == null || (q1 = o4.q1()) == null || (k = brf.k(q1)) == null)) {
            i.putAll(k);
        }
        jSONObject.put((JSONObject) "query", new JSONObject(i).toJSONString());
        jSONObject.put((JSONObject) "weexShopTabId", "2.0.0");
        jSONObject.put((JSONObject) "weexShopToken", W0);
        this.o = "2.0.0";
        this.n = W0;
        Pair a5 = jpu.a("visible", "true");
        Pair a6 = jpu.a("subscribeData", jSONObject.toJSONString());
        ShopDataParser o5 = this.g.o();
        return kotlin.collections.a.i(a5, a6, jpu.a("carShop", String.valueOf(o5 != null && o5.N1())));
    }
}
