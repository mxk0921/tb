package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jnp extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean l;
    public final boolean m;

    static {
        t2o.a(766510458);
    }

    public /* synthetic */ jnp(ShopComponentModel shopComponentModel, boolean z, boolean z2, int i, a07 a07Var) {
        this(shopComponentModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    public static /* synthetic */ Object ipc$super(jnp jnpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023LiveWidgetTemplate");
        }
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1428e3c4", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("959e257c", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        String name = D().getName();
        if (name != null) {
            h().k().d().add(name);
        }
        h().k().b((DXRootView) view, new l77(e(), this));
        super.b(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnp(ShopComponentModel shopComponentModel, boolean z, boolean z2) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
        this.l = z;
        this.m = z2;
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
        if (D().canRenderDXTemplate()) {
            JSONObject dXJSONConfig = D().getDXJSONConfig();
            JSONObject t = shopDataParser.O0().t(D().getData());
            if (J()) {
                t.getJSONObject("nativeData").put("contentListUrl", (Object) ShopExtKt.v(shopDataParser, null, null));
            }
            if (!I()) {
                t.getJSONObject("nativeData").put("isDisableShopCard", (Object) Boolean.valueOf(!I()));
            }
            xhv xhvVar = xhv.INSTANCE;
            BaseTemplateComponent.r(this, dXJSONConfig, t, false, 4, null);
        }
    }
}
