package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262826);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b36701", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^.+\\[.+\\]$")) {
            return false;
        }
        return true;
    }

    public static String[] b(String str) {
        Pattern pattern;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6bf9a236", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (k(str)) {
            pattern = Pattern.compile("^fields");
        } else if (j(str)) {
            pattern = Pattern.compile("^events\\..+\\[.+\\]\\.fields");
        } else {
            pattern = null;
        }
        if (pattern == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return null;
        }
        return matcher.replaceFirst("").substring(1).split("\\.");
    }

    public static Map c(String str, nb4 nb4Var) {
        int f;
        ir irVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("524a53ab", new Object[]{str, nb4Var});
        }
        if (!TextUtils.isEmpty(str) && nb4Var != null) {
            if (k(str)) {
                return nb4Var.f();
            }
            if (j(str)) {
                String[] split = str.split("\\.");
                List<ir> b = nb4Var.b(g(split[1]));
                if (b == null || b.isEmpty() || (f = f(split[1])) < 0 || f >= b.size() || (irVar = b.get(f)) == null) {
                    return null;
                }
                return irVar.a();
            }
        }
        return null;
    }

    public static List d(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8809e48e", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public static Object e(String[] strArr, Map<String, Object> map) {
        Object obj;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1be4b429", new Object[]{strArr, map});
        }
        if (strArr == null || map == null) {
            return null;
        }
        Map<String, Object> map2 = map;
        if (strArr.length == 0) {
            return map;
        }
        while (i < strArr.length) {
            try {
                if (i != strArr.length - 1 && !(map2 instanceof Map)) {
                    return null;
                }
                if (a(strArr[i])) {
                    obj = h(strArr[i], map2);
                } else {
                    obj = map2.get(strArr[i]);
                }
                i++;
                map2 = obj;
            } catch (Throwable unused) {
                return null;
            }
        }
        return map2;
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("453ed794", new Object[]{str})).intValue();
        }
        try {
            return Integer.valueOf(str.substring(str.indexOf("[") + 1, str.indexOf("]"))).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b8a6172", new Object[]{str});
        }
        return str.substring(0, str.indexOf("["));
    }

    public static Object h(String str, Map<String, Object> map) {
        List d;
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9745854d", new Object[]{str, map});
        }
        if (!TextUtils.isEmpty(str) && map != null) {
            String g = g(str);
            if (!TextUtils.isEmpty(g) && (d = d(map, g)) != null && (f = f(str)) >= 0 && f <= d.size()) {
                return d.get(f);
            }
        }
        return null;
    }

    public static Map<String, Object> i(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c07eded1", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2.isEmpty() || (map2.keySet().iterator().next() instanceof String)) {
            return map2;
        }
        return null;
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e0faaf1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^events\\..+\\[.+\\]\\.fields.*")) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78b82cb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^fields.*")) {
            return false;
        }
        return true;
    }

    public static void l(String[] strArr, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fb49b7", new Object[]{strArr, map, obj});
        } else if (strArr != null && strArr.length != 0 && map != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (a(strArr[i])) {
                    String g = g(strArr[i]);
                    List d = d(map, g);
                    if (d == null) {
                        d = new JSONArray();
                        map.put(g, d);
                    }
                    int f = f(strArr[i]);
                    if (i == strArr.length - 1) {
                        if (f >= 0 && f < d.size()) {
                            d.remove(f);
                            d.add(f, obj);
                        } else if (f < 0) {
                            d.add(0, obj);
                        } else {
                            d.add(obj);
                        }
                    } else if (f < 0 || f >= d.size()) {
                        if (f < 0) {
                            map = new JSONObject();
                            d.add(0, map);
                        } else {
                            map = new JSONObject();
                            d.add(map);
                        }
                    } else if (!(d.get(f) instanceof Map)) {
                        map = new JSONObject();
                        d.remove(f);
                        d.add(f, map);
                    } else {
                        map = (Map) d.get(f);
                    }
                } else if (i == strArr.length - 1) {
                    map.put(strArr[i], obj);
                } else {
                    Object i2 = i(map, strArr[i]);
                    if (i2 == null) {
                        i2 = new JSONObject();
                        map.put(strArr[i], i2);
                    }
                    map = i2;
                }
            }
        }
    }
}
