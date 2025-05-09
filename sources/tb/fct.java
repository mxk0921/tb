package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fct {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_PAGE = "Page_Home";

    static {
        t2o.a(729809117);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5d23c6", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            uqa.b("TapGlobalSceneUtUtils", "beginScene", "tapItem is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
            if (jSONObject2 == null) {
                uqa.b("TapGlobalSceneUtUtils", "beginScene", "clickParams is null");
                return;
            }
            String c = c(jSONObject2);
            if (!"Page_Home".equals(c)) {
                uqa.b("TapGlobalSceneUtUtils", "beginScene", "scene : " + c);
                return;
            }
            Map<String, String> d = d(jSONObject2);
            if (d == null) {
                uqa.b("TapGlobalSceneUtUtils", "beginScene", "properties is null");
            } else {
                qul.a(c, null, null, d);
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee94d042", new Object[]{str});
        } else {
            qul.b(str);
        }
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb3c97a7", new Object[]{jSONObject});
        }
        return jSONObject.getString("page");
    }

    public static Map<String, String> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d38f0964", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("multiPageUtParams");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            uqa.b("TapGlobalSceneUtUtils", "parseMultiPageUtParams", "multiPageUtParams is null");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
        while (true) {
            String str = "";
            if (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                if (next.getValue() != null) {
                    str = next.getValue().toString();
                }
                hashMap.put(key, str);
            } else {
                hashMap.put(tm2.HOME_BUCKETS, str);
                return hashMap;
            }
        }
    }
}
