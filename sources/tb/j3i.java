package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Map<String, Object> map, Map<String, ?> map2) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204611e6", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            Set<Map.Entry<String, ?>> entrySet = map2.entrySet();
            if (!entrySet.isEmpty()) {
                for (Map.Entry<String, ?> entry : entrySet) {
                    if (!(entry == null || (key = entry.getKey()) == null)) {
                        Object value = entry.getValue();
                        if (value == null) {
                            map.put(key, "empty value");
                        } else {
                            map.put(key, value);
                        }
                    }
                }
            }
        }
    }

    public static void b(Map<String, String> map, Map<String, String> map2) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15102697", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            Set<Map.Entry<String, String>> entrySet = map2.entrySet();
            if (!entrySet.isEmpty()) {
                for (Map.Entry<String, String> entry : entrySet) {
                    if (!(entry == null || (key = entry.getKey()) == null)) {
                        String value = entry.getValue();
                        if (value == null) {
                            map.put(key, "empty value");
                        } else {
                            map.put(key, value);
                        }
                    }
                }
            }
        }
    }
}
