package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a75fa73", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder("{");
        if (map != null && map.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(key == null || value == null)) {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        sb3.append(JSON.toJSONString(key));
                        sb3.append(":");
                        sb3.append(JSON.toJSONString(value));
                        sb3.append(",");
                        sb2.append((CharSequence) sb3);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            int length = sb2.toString().length();
            if (length > 1) {
                sb.append(sb2.substring(0, length - 1));
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
