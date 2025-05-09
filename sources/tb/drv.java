package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class drv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(856686614);
    }

    public String a(z24 z24Var, hfh hfhVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32d19142", new Object[]{this, z24Var, hfhVar});
        }
        if (hfhVar == null) {
            return null;
        }
        Map<String, String> a2 = sua.a(z24Var, hfhVar);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z24Var.f != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("content", new String(z24Var.f, "utf-8"));
            jSONObject2.put("forward", (Object) linkedHashMap);
        }
        jSONObject2.put("version", (Object) uj4.version);
        jSONObject2.put("type", (Object) "REPLY");
        jSONObject2.put("headers", (Object) a2);
        jSONObject2.put("data", (Object) jSONObject);
        return xkv.a(jSONObject2.toString());
    }
}
