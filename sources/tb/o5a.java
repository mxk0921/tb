package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587933);
    }

    public static JSONObject a(JSONObject jSONObject, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("90eb50c3", new Object[]{jSONObject, w1eVar});
        }
        if (w1eVar == null) {
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("gatewayTrace", (Object) w1eVar);
        return jSONObject;
    }

    public static w1e b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("b36a3759", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Object obj = jSONObject.get("gatewayTrace");
        if (!(obj instanceof w1e)) {
            return null;
        }
        return (w1e) obj;
    }
}
