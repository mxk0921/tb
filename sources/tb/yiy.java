package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class yiy extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String templateName = "tb_shop_bottom_bar_2025";
    public final g1a<Integer, xhv> n;
    public final d1a<xhv> o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510411);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends l77 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context) {
            super(context, yiy.this);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/FlagShipV25BottomBarTemplate$createViewCallback$1");
        }

        @Override // tb.kht.b
        public void f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c902b4b", new Object[]{this, obj});
                return;
            }
            d1a N = yiy.N(yiy.this);
            if (N != null) {
                N.invoke();
            }
        }

        @Override // tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
            } else if (obj != null && (obj instanceof String)) {
                int L = r54.L((String) obj);
                g1a I = yiy.I(yiy.this);
                if (I != null) {
                    I.invoke(Integer.valueOf(L));
                }
                yiy.J(yiy.this, L);
                brp.o(i(), L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32123a;
        public final /* synthetic */ yiy b;

        public c(int i, yiy yiyVar) {
            this.f32123a = i;
            this.b = yiyVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(this.f32123a));
            this.b.A(jSONObject);
        }
    }

    static {
        t2o.a(766510410);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yiy(g1a<? super Integer, xhv> g1aVar, d1a<xhv> d1aVar, ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
        this.n = g1aVar;
        this.o = d1aVar;
    }

    public static final /* synthetic */ g1a I(yiy yiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("fdc88d6d", new Object[]{yiyVar});
        }
        return yiyVar.n;
    }

    public static final /* synthetic */ void J(yiy yiyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4313852b", new Object[]{yiyVar, new Integer(i)});
        } else {
            yiyVar.L(i);
        }
    }

    public static final /* synthetic */ d1a N(yiy yiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("d9b18006", new Object[]{yiyVar});
        }
        return yiyVar.o;
    }

    public static /* synthetic */ Object ipc$super(yiy yiyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/FlagShipV25BottomBarTemplate");
        }
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433a809", new Object[]{this, new Integer(i)});
        } else {
            L(i);
        }
    }

    public final View K(String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        WeakReference<View> wRView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93eb911b", new Object[]{this, str});
        }
        ckf.g(str, "tabName");
        if (!m()) {
            return null;
        }
        View f = f();
        if (!(f instanceof DXRootView) || (queryWidgetNodeByUserId = ((DXRootView) f).getExpandWidgetNode().queryRootWidgetNode().queryWidgetNodeByUserId(ckf.p("shop25_", str))) == null || (wRView = queryWidgetNodeByUserId.getWRView()) == null) {
            return null;
        }
        return wRView.get();
    }

    public final void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a9476e", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = new c(i, this);
        if (!l()) {
            B(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        h().k().b((DXRootView) view, new b(e()));
        super.b(view);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
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
        JSONObject h = shopDataParser.h();
        h.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(shopDataParser.d0()));
        BaseTemplateComponent.r(this, D().getDXJSONConfig(), h, false, 4, null);
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1352b004", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("transparentBgColor", Boolean.valueOf(z))));
        }
    }
}
