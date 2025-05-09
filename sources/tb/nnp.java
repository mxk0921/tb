package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nnp extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510459);
    }

    public static /* synthetic */ Object ipc$super(nnp nnpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            View view = (View) objArr[0];
            throw null;
        } else if (hashCode != -1436352665) {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023SubTabTemplate");
        } else {
            Context context = (Context) objArr[0];
            ShopDataParser shopDataParser = (ShopDataParser) objArr[1];
            ShopDXEngine shopDXEngine = (ShopDXEngine) objArr[2];
            JSONObject jSONObject = (JSONObject) objArr[3];
            throw null;
        }
    }
}
