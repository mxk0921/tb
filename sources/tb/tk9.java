package tb;

import android.content.Context;
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
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tk9 extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510420);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final tk9 a(ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tk9) ipChange.ipc$dispatch("9efd4410", new Object[]{this, shopDataParser, shopDXEngine});
            }
            ckf.g(shopDataParser, "shopData");
            ckf.g(shopDXEngine, "shopDXEngine");
            JSONObject r = shopDataParser.r("tb_shop_native_header_follow_button");
            if (r == null) {
                return null;
            }
            tk9 tk9Var = new tk9(new ShopComponentModel(null, false, null, null, "dx", r.getString("name"), r.getString("url"), r.getString("version"), 100, null, null));
            Context Q = shopDataParser.Q();
            ckf.d(Q);
            tk9Var.k(Q, shopDataParser, shopDXEngine, null);
            return tk9Var;
        }
    }

    static {
        t2o.a(766510419);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk9(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(tk9 tk9Var, String str, Object... objArr) {
        if (str.hashCode() == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/FlagShopHeaderFollowButton");
    }

    public final void I(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5893205d", new Object[]{this, jSONObject});
        } else if (m()) {
            ShopExtKt.T((DXRootView) f(), jSONObject);
        }
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
            BaseTemplateComponent.r(this, D().getDXJSONConfig(), new ShopDataParser.e(shopDataParser).t(D().getData()), false, 4, null);
        }
    }
}
