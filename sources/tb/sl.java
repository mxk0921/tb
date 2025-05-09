package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740655);
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50df9cf", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject.get("data") == null || (jSONObject2 = jSONObject.getJSONObject("hierarchy")) == null) {
            return false;
        }
        return (jSONObject2.get("structure") == null && jSONObject2.get("delta") == null) ? false : true;
    }
}
