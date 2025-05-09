package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792531);
    }

    public static void a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b278d3", new Object[]{map, map2});
        } else if (map == null || map2 == null) {
            b4p.b("GlobalParamsUtil", "fillGlobalParams:targetParams或originalParams为空");
        } else {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (TextUtils.isEmpty(key)) {
                    b4p.b("GlobalParamsUtil", "fillGlobalParams:key为空");
                } else if (!key.startsWith(r4p.GLOBAL_PARAM_PREFIX)) {
                    b4p.b("GlobalParamsUtil", "fillGlobalParams:非全局参数");
                } else {
                    if (value == null) {
                        value = "";
                    }
                    map.put(key, value);
                }
            }
        }
    }

    public static String b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a296ac09", new Object[]{map, str});
        }
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return map.get(r4p.GLOBAL_PARAM_PREFIX + str);
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63460d21", new Object[]{map});
        } else if (map == null) {
            b4p.b("GlobalParamsUtil", "replaceGlobalParams:params为空");
        } else {
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && str.startsWith(r4p.GLOBAL_PARAM_PREFIX)) {
                    if (2 >= str.length()) {
                        b4p.b("GlobalParamsUtil", "replaceGlobalParams:参数前缀位置超长");
                    } else {
                        String substring = str.substring(2);
                        if (TextUtils.isEmpty(substring)) {
                            b4p.b("GlobalParamsUtil", "replaceGlobalParams:realParams为空");
                        } else {
                            String remove = map.remove(str);
                            if (TextUtils.isEmpty(remove)) {
                                b4p.b("GlobalParamsUtil", "replaceGlobalParams:value为空");
                            } else {
                                map.put(substring, remove);
                                b4p.a("GlobalParamsUtil", "真实参数：" + substring + " " + remove);
                            }
                        }
                    }
                }
            }
        }
    }
}
