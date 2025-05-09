package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import tb.a07;
import tb.aqp;
import tb.brf;
import tb.brp;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.jpu;
import tb.kht;
import tb.l77;
import tb.npp;
import tb.oop;
import tb.t2o;
import tb.vpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopHeaderComponent extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1a<ShopHeaderComponent, xhv> i;
    public final d1a<Boolean> j;
    public final String k;
    public boolean l;
    public final a m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends oop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopHeaderComponent$followCallback$1");
        }

        @Override // tb.oop.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                return;
            }
            ShopHeaderComponent.E(ShopHeaderComponent.this, z);
            ShopHeaderComponent.this.y("followStatus", Boolean.valueOf(z));
            ShopExtKt.i0(ShopHeaderComponent.this.i(), z);
            vpd I = ShopHeaderComponent.this.i().I();
            if (I != null) {
                I.b(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends l77 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context e;
        public final /* synthetic */ ShopDataParser f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, ShopDataParser shopDataParser) {
            super(context, ShopHeaderComponent.this);
            this.e = context;
            this.f = shopDataParser;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1329866066) {
                super.b(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopHeaderComponent$init$2");
        }

        @Override // tb.kht.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a493f194", new Object[]{this, obj});
            } else if (ShopHeaderComponent.D(ShopHeaderComponent.this)) {
                oop.c((Activity) this.e, this.f.N0(), ShopHeaderComponent.C(ShopHeaderComponent.this));
                brp.d(this.f);
            } else {
                oop.a((Activity) this.e, this.f.N0(), ShopHeaderComponent.C(ShopHeaderComponent.this));
                brp.c(this.f);
            }
        }

        @Override // tb.l77, tb.kht.b
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f442552", new Object[]{this, obj});
                return;
            }
            d1a B = ShopHeaderComponent.B(ShopHeaderComponent.this);
            if (B == null || ((Boolean) B.invoke()).booleanValue()) {
                super.b(obj);
            }
        }
    }

    static {
        t2o.a(766510050);
    }

    public ShopHeaderComponent() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ d1a B(ShopHeaderComponent shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("cdd9c470", new Object[]{shopHeaderComponent});
        }
        return shopHeaderComponent.j;
    }

    public static final /* synthetic */ a C(ShopHeaderComponent shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dda89002", new Object[]{shopHeaderComponent});
        }
        return shopHeaderComponent.m;
    }

    public static final /* synthetic */ boolean D(ShopHeaderComponent shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c3d416b", new Object[]{shopHeaderComponent})).booleanValue();
        }
        return shopHeaderComponent.l;
    }

    public static final /* synthetic */ void E(ShopHeaderComponent shopHeaderComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b759c7c1", new Object[]{shopHeaderComponent, new Boolean(z)});
        } else {
            shopHeaderComponent.l = z;
        }
    }

    public static /* synthetic */ Object ipc$super(ShopHeaderComponent shopHeaderComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopHeaderComponent");
        }
    }

    public final String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40a170b1", new Object[]{this});
        }
        return this.k;
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5264d0d7", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("clearScreenStatus", Boolean.valueOf(z))));
        }
    }

    public final void H(boolean z, JSONObject jSONObject) {
        Object obj;
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7611facf", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        y("followStatus", Boolean.valueOf(z));
        try {
            View f = f();
            if (f instanceof DXRootView) {
                dXRootView = (DXRootView) f;
            } else {
                dXRootView = null;
            }
            ShopExtKt.T(dXRootView, jSONObject);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e927f576", new Object[]{this, new Boolean(z)});
        } else {
            y("hasNavView", Boolean.valueOf(z));
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        } else if (z) {
            y("styleStatus", "live");
        }
    }

    public final void L(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4da2f3", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "default";
        } else {
            str = "folded";
        }
        y("styleStatus", str);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        super.b(view);
        g1a<ShopHeaderComponent, xhv> g1aVar = this.i;
        if (g1aVar != null) {
            g1aVar.invoke(this);
        }
        oop.a shopHeaderComponent$createViewCallback$followCallback$1 = new oop.a() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent$createViewCallback$followCallback$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopHeaderComponent$createViewCallback$followCallback$1 shopHeaderComponent$createViewCallback$followCallback$12, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopHeaderComponent$createViewCallback$followCallback$1");
            }

            @Override // tb.oop.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                    return;
                }
                ShopHeaderComponent.E(ShopHeaderComponent.this, z);
                ShopHeaderComponent.this.y("followStatus", Boolean.valueOf(z));
                if (!z) {
                    ShopExtKt.q0(ShopHeaderComponent.this.i(), false, new ShopHeaderComponent$createViewCallback$followCallback$1$followResult$1(ShopHeaderComponent.this));
                }
                npp.Companion.b(ckf.p("first follow status : ", Boolean.valueOf(z)));
            }
        };
        if (aqp.Companion.w0()) {
            shopHeaderComponent$createViewCallback$followCallback$1.a(i().U1());
        } else {
            oop.b((Activity) e(), i().N0(), shopHeaderComponent$createViewCallback$followCallback$1);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        super.k(context, shopDataParser, shopDXEngine, jSONObject);
        JSONObject r = shopDataParser.r(this.k);
        if (r == null) {
            npp.Companion.b(ckf.p("can not find shop template : ", this.k));
            shopDXEngine.g();
            return;
        }
        JSONObject D1 = shopDataParser.D1();
        Object obj = D1.get("nativeData");
        if (obj != null) {
            boolean b2 = ckf.b(shopDataParser.S(shopDataParser.d0(), shopDataParser.f0()), "live");
            ((JSONObject) obj).put("isLivePage", (Object) Boolean.valueOf(b2));
            npp.Companion.f(ckf.p("ShopHeaderComponent init isDirectLivePage ", Boolean.valueOf(b2)));
            xhv xhvVar = xhv.INSTANCE;
            BaseTemplateComponent.r(this, r, D1, false, 4, null);
            shopDXEngine.k().a(kht.headerInfoArea, new b(context, shopDataParser));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }

    public /* synthetic */ ShopHeaderComponent(g1a g1aVar, d1a d1aVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : g1aVar, (i & 2) != 0 ? null : d1aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShopHeaderComponent(g1a<? super ShopHeaderComponent, xhv> g1aVar, d1a<Boolean> d1aVar) {
        this.i = g1aVar;
        this.j = d1aVar;
        this.k = "tb_shop_flagship_header_info_2022";
        this.m = new a();
    }

    public final void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb5615f", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("isLivePage", Boolean.valueOf(z))));
        }
    }
}
