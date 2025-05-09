package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592996);
    }

    public static Map<String, String> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24af9acd", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (map == null || map.size() <= 0 || (r1 = map.keySet().iterator()) == null) {
            return null;
        }
        for (String str : map.keySet()) {
            String c = hsq.c(map.get(str));
            if (str != null) {
                hashMap.put(str, c);
            }
        }
        return hashMap;
    }

    public static Map<String, String> b(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("95503b73", new Object[]{properties});
        }
        if (properties == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : properties.keySet()) {
            if (obj instanceof String) {
                String c = hsq.c(obj);
                String c2 = hsq.c(properties.get(obj));
                if (!hsq.f(c) && !hsq.f(c2)) {
                    hashMap.put(c, c2);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a351c64", new Object[]{map});
        }
        if (map == null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (str instanceof String) {
                String str2 = map.get(str);
                if (!hsq.f(str) && !hsq.f(str2)) {
                    try {
                        hashMap.put(URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(str2, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return hashMap;
    }
}
