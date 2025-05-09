package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class hwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855875);
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ece06fc2", new Object[]{map});
        }
        if (map == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            return hashMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.length() == 27 && key.equalsIgnoreCase("Access-Control-Allow-Origin")) {
                return map;
            }
        }
        HashMap hashMap2 = new HashMap(map);
        hashMap2.put("Access-Control-Allow-Origin", "*");
        return hashMap2;
    }

    public static Map<String, String> b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9706ca8", new Object[]{str, map});
        }
        if (ssw.a(str)) {
            return a(map);
        }
        return map;
    }
}
