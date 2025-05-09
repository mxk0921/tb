package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class beu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3a8253e", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static Map<String, String> b(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e14c388", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                hashMap.put(str, a(list));
            }
        }
        return hashMap;
    }
}
