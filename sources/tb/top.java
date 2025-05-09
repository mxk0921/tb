package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class top extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String i = "tb_shop_header_loft_content_2022";
    public boolean j;

    static {
        t2o.a(766510055);
    }

    public static /* synthetic */ Object ipc$super(top topVar, String str, Object... objArr) {
        if (str.hashCode() == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopHeaderLoftContentTemplate");
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23e6393b", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7265ff1", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        super.k(context, shopDataParser, shopDXEngine, jSONObject);
        shopDXEngine.k().a("", new l77(context, this));
        if (this.j || !shopDataParser.a3() || !shopDataParser.Y1()) {
            jSONObject2 = shopDataParser.r(this.i);
        } else {
            JSONObject c1 = shopDataParser.c1();
            jSONObject2 = null;
            if (!(c1 == null || (jSONObject3 = c1.getJSONObject("liveWidgetVO")) == null)) {
                jSONObject3.put("url", (Object) jSONObject3.getString("targetUrl"));
                jSONObject2 = jSONObject3;
            }
        }
        if (jSONObject2 == null) {
            jSONObject2 = brf.a(jpu.a("url", "https://dinamicx.alibabausercontent.com/pub/tb_shop_header_loft_content_2022/1663556116218/tb_shop_header_loft_content_2022.zip"), jpu.a("version", "2"), jpu.a("name", this.i));
        }
        JSONObject a2 = brf.a(jpu.a("headerData", shopDataParser.o0()), jpu.a("loftInfo", shopDataParser.b1().getJSONObject("loftInfo")), jpu.a("shopInfo", shopDataParser.Z0()), jpu.a("widgetData", jSONObject2.getJSONObject("data")));
        if (shopDataParser.a3() && !B()) {
            a2.put("isDisableShopCard", (Object) Boolean.TRUE);
        }
        xhv xhvVar = xhv.INSTANCE;
        BaseTemplateComponent.r(this, jSONObject2, a2, false, 4, null);
    }
}
