package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1019215909);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57462ed6", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    hashMap.put(str, JSON.toJSONString(obj));
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7c800a5c", new Object[]{str});
        }
        try {
            return a(JSON.parseObject(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
