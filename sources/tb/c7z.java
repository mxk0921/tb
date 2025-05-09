package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class c7z extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String templateName = "tb_shop_header_black_gold_bar_25";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510415);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510414);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7z(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(c7z c7zVar, String str, Object... objArr) {
        if (str.hashCode() == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/FlagShipV25HeaderBlackGoldBarTemplate");
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
        D().getRenderHeight();
        BaseTemplateComponent.r(this, D().getDXJSONConfig(), shopDataParser.O0().t(D().getData()), false, 4, null);
    }
}
