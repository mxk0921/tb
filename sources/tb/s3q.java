package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.container.TBXSkuContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321553);
    }

    public static TBXSkuContainer a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBXSkuContainer) ipChange.ipc$dispatch("c7cd56a8", new Object[]{context, jSONObject});
        }
        TBXSkuContainer tBXSkuContainer = new TBXSkuContainer(context);
        tBXSkuContainer.w();
        tBXSkuContainer.N();
        tBXSkuContainer.E(jSONObject);
        tBXSkuContainer.O();
        return tBXSkuContainer;
    }
}
