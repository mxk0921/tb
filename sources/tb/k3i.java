package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262813);
    }

    public static JSONObject a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc8cb3b8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : jSONObject.keySet()) {
            if (str2 != null) {
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                jSONObject2.put(str2, (Object) str);
            }
        }
        return jSONObject2;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96544593", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : jSONObject.keySet()) {
            if (str2 != null) {
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    public static Map<String, Object> c(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9906d14e", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            if (str2 != null) {
                Object obj = map.get(str2);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }
}
