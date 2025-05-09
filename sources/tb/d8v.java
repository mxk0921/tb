package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699204);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26739a00", new Object[]{jSONObject, jSONObject2, obj});
        }
        JSONObject jSONObject3 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            String b = b(string, jSONObject2, obj);
            if ("null".equals(b)) {
                jSONObject3.put(str, (Object) string);
            } else {
                jSONObject3.put(str, (Object) b);
            }
        }
        return jSONObject3;
    }

    public static String b(String str, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78001bea", new Object[]{str, jSONObject, obj});
        }
        bn7.b h = new bn7.b().j(jSONObject).h(obj);
        if (obj instanceof DXRuntimeContext) {
            h.g(((DXRuntimeContext) obj).O());
        }
        return String.valueOf(qm7.a(str, "", h.f()));
    }
}
