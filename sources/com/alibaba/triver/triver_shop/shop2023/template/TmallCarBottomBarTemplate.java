package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
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
public final class TmallCarBottomBarTemplate extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1a<Integer, xhv> i;
    public final String j = "tb_shop_bottom_bar_car";
    public int k = 121;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ d1a f3355a;

        public a(d1a d1aVar) {
            this.f3355a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3355a.invoke();
            }
        }
    }

    static {
        t2o.a(766510467);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TmallCarBottomBarTemplate(g1a<? super Integer, xhv> g1aVar) {
        this.i = g1aVar;
    }

    public static final /* synthetic */ g1a B(TmallCarBottomBarTemplate tmallCarBottomBarTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("294cc2e2", new Object[]{tmallCarBottomBarTemplate});
        }
        return tmallCarBottomBarTemplate.i;
    }

    public static final /* synthetic */ void C(TmallCarBottomBarTemplate tmallCarBottomBarTemplate, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93e1785", new Object[]{tmallCarBottomBarTemplate, new Integer(i)});
        } else {
            tmallCarBottomBarTemplate.F(i);
        }
    }

    public static /* synthetic */ Object ipc$super(TmallCarBottomBarTemplate tmallCarBottomBarTemplate, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/TmallCarBottomBarTemplate");
        }
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e65680e2", new Object[]{this});
        }
        return this.j;
    }

    public final int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c897fd21", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc1dd61", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(i));
        A(jSONObject);
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bb4aa1", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433a809", new Object[]{this, new Integer(i)});
        } else {
            F(i);
        }
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09471f2", new Object[]{this, new Boolean(z)});
            return;
        }
        TmallCarBottomBarTemplate$updateTransparentStatus$action$1 tmallCarBottomBarTemplate$updateTransparentStatus$action$1 = new TmallCarBottomBarTemplate$updateTransparentStatus$action$1(this, z);
        if (l()) {
            tmallCarBottomBarTemplate$updateTransparentStatus$action$1.invoke();
        } else {
            a(new a(tmallCarBottomBarTemplate$updateTransparentStatus$action$1));
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
        ckf.b(i().P(), mop.KEY_DONG_TAI);
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
        JSONObject r = shopDataParser.r(this.j);
        if (r == null) {
            npp.Companion.b(ckf.p("can not find shop template : ", this.j));
            shopDXEngine.g();
            return;
        }
        String string = r.getString("renderHeight");
        if (string != null) {
            G(r54.L(string));
            if (E() == 0) {
                G(121);
            }
        }
        JSONObject h = shopDataParser.h();
        h.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(shopDataParser.d0()));
        h.put((JSONObject) "height", (String) Integer.valueOf(this.k));
        BaseTemplateComponent.r(this, r, h, false, 4, null);
        shopDXEngine.k().a(kht.bottomBarArea, new l77(context) { // from class: com.alibaba.triver.triver_shop.shop2023.template.TmallCarBottomBarTemplate$init$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(TmallCarBottomBarTemplate$init$2 tmallCarBottomBarTemplate$init$2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/TmallCarBottomBarTemplate$init$2");
            }

            @Override // tb.kht.b
            public void h(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                } else if (obj != null && (obj instanceof String)) {
                    int L = r54.L((String) obj);
                    g1a B = TmallCarBottomBarTemplate.B(TmallCarBottomBarTemplate.this);
                    if (B != null) {
                        B.invoke(Integer.valueOf(L));
                    }
                    TmallCarBottomBarTemplate.C(TmallCarBottomBarTemplate.this, L);
                    r54.C(new TmallCarBottomBarTemplate$init$2$switchTabTo$1(shopDataParser, L));
                }
            }
        });
        ShopUTExposeEventKt.e(shopDataParser, shopDataParser.d0());
    }
}
