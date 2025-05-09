package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pop extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String i = "tb_shop_header_four_tab_2022";

    static {
        t2o.a(766510049);
    }

    public static /* synthetic */ Object ipc$super(pop popVar, String str, Object... objArr) {
        if (str.hashCode() == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/ShopFourTabTemplate");
    }

    public final void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396166a3", new Object[]{this, new Boolean(z)});
        } else {
            y(mop.KEY_HAS_BIG_CARD_STYLE, Boolean.valueOf(z));
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
        JSONObject r = shopDataParser.r(this.i);
        if (r == null) {
            r = brf.a(jpu.a("name", "tb_shop_header_four_tab_2022"), jpu.a("version", 3), jpu.a("url", "https://dinamicx.alibabausercontent.com/pub/tb_shop_header_four_tab_2022/1660015391189/tb_shop_header_four_tab_2022.zip"));
        }
        BaseTemplateComponent.r(this, r, brf.a(jpu.a("headerData", shopDataParser.o0()), jpu.a("shopInfo", shopDataParser.Z0())), false, 4, null);
        shopDXEngine.k().a(kht.fourTabArea, new l77(context, this));
        if (shopDataParser.d0() == 0) {
            ShopUTExposeEventKt.p(shopDataParser);
        }
    }
}
