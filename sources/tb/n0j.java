package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n0j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MACROS_TANX_MONITOR_PLACEHOLDER = "__EXT_MAP__";

    static {
        t2o.a(1017118864);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebc3724a", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.contains(MACROS_TANX_MONITOR_PLACEHOLDER)) {
            return str;
        }
        return str.replace(MACROS_TANX_MONITOR_PLACEHOLDER, str2);
    }

    public static String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16862607", new Object[]{str, map});
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && str.contains(key)) {
                        str = str.replace(key, value);
                    }
                }
            }
        }
        return str;
    }
}
