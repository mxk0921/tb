package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809752);
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

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba9c6d45", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        return jSONObject3;
    }

    public static w1e c(JSONObject jSONObject) {
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
