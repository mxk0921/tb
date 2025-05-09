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
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gnp extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510440);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final gnp a(ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
            ShopComponentModel shopComponentModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gnp) ipChange.ipc$dispatch("67bfe4bd", new Object[]{this, shopDataParser, shopDXEngine});
            }
            ckf.g(shopDataParser, "shopData");
            ckf.g(shopDXEngine, "shopDXEngine");
            Map<String, ShopComponentModel> m = shopDataParser.O0().m();
            if (m == null || (shopComponentModel = m.get("tb_shop_native_header_follow_button")) == null) {
                return null;
            }
            gnp gnpVar = new gnp(shopComponentModel);
            Context Q = shopDataParser.Q();
            ckf.d(Q);
            gnpVar.k(Q, shopDataParser, shopDXEngine, null);
            return gnpVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(766510439);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnp(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
    }

    public static /* synthetic */ Object ipc$super(gnp gnpVar, String str, Object... objArr) {
        if (str.hashCode() == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderFollowButton");
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
