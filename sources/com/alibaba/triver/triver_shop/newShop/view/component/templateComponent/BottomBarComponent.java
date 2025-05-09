package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import kotlin.b;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kht;
import tb.l77;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BottomBarComponent extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1a<Integer, xhv> i;
    public final d1a<xhv> j;
    public final String k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ d1a f3251a;

        public a(d1a d1aVar) {
            this.f3251a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3251a.invoke();
            }
        }
    }

    static {
        t2o.a(766510035);
    }

    public /* synthetic */ BottomBarComponent(g1a g1aVar, d1a d1aVar, int i, a07 a07Var) {
        this(g1aVar, (i & 2) != 0 ? null : d1aVar);
    }

    public static final /* synthetic */ d1a B(BottomBarComponent bottomBarComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("7c908ad4", new Object[]{bottomBarComponent});
        }
        return bottomBarComponent.j;
    }

    public static final /* synthetic */ g1a C(BottomBarComponent bottomBarComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("bf7752ab", new Object[]{bottomBarComponent});
        }
        return bottomBarComponent.i;
    }

    public static final /* synthetic */ void D(BottomBarComponent bottomBarComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa9c50e", new Object[]{bottomBarComponent, new Integer(i)});
        } else {
            bottomBarComponent.G(i);
        }
    }

    public static /* synthetic */ Object ipc$super(BottomBarComponent bottomBarComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BottomBarComponent");
        }
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e65680e2", new Object[]{this});
        }
        return this.k;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c8e21", new Object[]{this});
        } else {
            ShopExtKt.e(i());
        }
    }

    public final void G(int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc1dd61", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (ckf.b(i().P(), mop.KEY_DONG_TAI)) {
            jSONObject.put((JSONObject) mop.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, (String) Boolean.FALSE);
            r54.P("updateZuoPinTabCount", new BottomBarComponent$onBottomTabChangedCheckRedDotStatusAndUpdateIndex$1(this));
        }
        if (ckf.b(i().P(), mop.KEY_ALL_ITEMS)) {
            try {
                if (ckf.b(Boolean.TRUE, ((DXRootView) f()).getData().get(mop.KEY_SHOW_ALL_ITEM_RED_DOT))) {
                    F();
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
            jSONObject.put((JSONObject) mop.KEY_SHOW_ALL_ITEM_RED_DOT, (String) Boolean.FALSE);
        }
        jSONObject.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(i));
        A(jSONObject);
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433a809", new Object[]{this, new Integer(i)});
        } else {
            G(i);
        }
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09471f2", new Object[]{this, new Boolean(z)});
            return;
        }
        BottomBarComponent$updateTransparentStatus$action$1 bottomBarComponent$updateTransparentStatus$action$1 = new BottomBarComponent$updateTransparentStatus$action$1(this, z);
        if (l()) {
            bottomBarComponent$updateTransparentStatus$action$1.invoke();
        } else {
            a(new a(bottomBarComponent$updateTransparentStatus$action$1));
        }
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
        o();
        if (!ckf.b(i().P(), mop.KEY_DONG_TAI)) {
            ShopExtKt.N(i(), new BottomBarComponent$createViewCallback$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(final Context context, final ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
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
        JSONObject h = shopDataParser.h();
        h.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(shopDataParser.d0()));
        BaseTemplateComponent.r(this, r, h, false, 4, null);
        shopDXEngine.k().a(kht.bottomBarArea, new l77(context) { // from class: com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BottomBarComponent$init$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(BottomBarComponent$init$1 bottomBarComponent$init$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BottomBarComponent$init$1");
            }

            @Override // tb.kht.b
            public void f(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c902b4b", new Object[]{this, obj});
                    return;
                }
                d1a B = BottomBarComponent.B(BottomBarComponent.this);
                if (B != null) {
                    B.invoke();
                }
            }

            @Override // tb.kht.b
            public void h(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                } else if (obj != null && (obj instanceof String)) {
                    int L = r54.L((String) obj);
                    g1a C = BottomBarComponent.C(BottomBarComponent.this);
                    if (C != null) {
                        C.invoke(Integer.valueOf(L));
                    }
                    BottomBarComponent.D(BottomBarComponent.this, L);
                    r54.C(new BottomBarComponent$init$1$switchTabTo$1(shopDataParser, L));
                }
            }
        });
        ShopUTExposeEventKt.e(shopDataParser, shopDataParser.d0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomBarComponent(g1a<? super Integer, xhv> g1aVar, d1a<xhv> d1aVar) {
        this.i = g1aVar;
        this.j = d1aVar;
        this.k = "tb_shop_bottom_bar_2022";
    }
}
