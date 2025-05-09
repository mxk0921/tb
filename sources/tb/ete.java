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
public final class ete extends BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510045);
    }

    public static final /* synthetic */ int B(ete eteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb50d76b", new Object[]{eteVar})).intValue();
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(ete eteVar, String str, Object... objArr) {
        if (str.hashCode() != -1436352665) {
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/IndexNavComponent");
        }
        Context context = (Context) objArr[0];
        ShopDataParser shopDataParser = (ShopDataParser) objArr[1];
        ShopDXEngine shopDXEngine = (ShopDXEngine) objArr[2];
        JSONObject jSONObject = (JSONObject) objArr[3];
        throw null;
    }
}
