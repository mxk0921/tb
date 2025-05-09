package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31088a;
        public String b;

        static {
            t2o.a(455082031);
        }
    }

    static {
        t2o.a(455082029);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aff3291", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2aa4a739", new Object[]{new Long(j)})).longValue();
        }
        long a2 = a();
        if (a2 > 0) {
            return a2 - j;
        }
        return 0L;
    }

    public static String c(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47da6c5f", new Object[]{str});
        }
        String str2 = "";
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return str2;
        }
        String authority = parse.getAuthority();
        String path = parse.getPath();
        if (!TextUtils.isEmpty(authority)) {
            str2 = authority;
        }
        if (TextUtils.isEmpty(path)) {
            return str2;
        }
        return str2 + path;
    }

    public static Map<String, String> d(Map<String, String> map, Map<String, String> map2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11e314d1", new Object[]{map, map2});
        }
        if (map == null || map.isEmpty()) {
            return map2;
        }
        if (map2 == null || map2.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (map.containsKey(key)) {
                String str2 = map.get(key);
                String str3 = map2.get(key);
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str = "";
                } else {
                    str = str2 + "&";
                }
                sb.append(str);
                sb.append(str3);
                hashMap.put(key, sb.toString());
            } else {
                hashMap.put(key, entry.getValue());
            }
        }
        return hashMap;
    }

    public static b e(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b910a976", new Object[]{str, str2});
        }
        b bVar = new b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (indexOf = str.indexOf(str2)) != -1) {
            bVar.b = str.substring(0, indexOf);
            str.substring(indexOf + 1, str.length());
            bVar.f31088a = true;
        }
        return bVar;
    }

    public static Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("40a3ee56", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return (Map) JSON.parseObject(str, new a(), new Feature[0]);
            } catch (Exception e) {
                bcu.a("BaseUtil:stringToMap Exception message" + e.getMessage());
            }
        }
        return null;
    }

    public static <T> T g(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4dbeb3b1", new Object[]{str, cls});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return (T) JSON.parseObject(str, cls);
            } catch (Exception e) {
                bcu.a("BaseUtil:stringToObject Exception message" + e.getMessage());
            }
        } else {
            bcu.a("BaseUtil:stringToObject data empty");
        }
        return null;
    }
}
