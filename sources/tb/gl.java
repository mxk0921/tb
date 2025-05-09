package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740654);
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

    public static Map b(String str, Component component) {
        int e;
        Event event;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4dfbba5", new Object[]{str, component});
        }
        if (!TextUtils.isEmpty(str) && component != null) {
            if (l(str)) {
                return component.getFields();
            }
            if (k(str)) {
                String[] split = str.split("\\.");
                List<Event> list = component.getEvents().get(f(split[1]));
                if (list == null || list.isEmpty() || (e = e(split[1])) < 0 || e >= list.size() || (event = list.get(e)) == null) {
                    return null;
                }
                return event.getFields();
            }
        }
        return null;
    }

    public static List c(Map<String, Object> map, String str) {
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

    public static Object d(String[] strArr, Map<String, Object> map) {
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
                    obj = g(strArr[i], map2);
                } else {
                    obj = map2.get(strArr[i]);
                }
                i++;
                map2 = obj;
            } catch (Exception unused) {
                return null;
            }
        }
        return map2;
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("453ed794", new Object[]{str})).intValue();
        }
        if (!a(str)) {
            return -1;
        }
        try {
            return Integer.valueOf(str.substring(str.indexOf("[") + 1, str.indexOf("]"))).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b8a6172", new Object[]{str});
        }
        if (!a(str)) {
            return null;
        }
        return str.substring(0, str.indexOf("["));
    }

    public static Object g(String str, Map<String, Object> map) {
        List c;
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9745854d", new Object[]{str, map});
        }
        if (!TextUtils.isEmpty(str) && map != null) {
            String f = f(str);
            if (!TextUtils.isEmpty(f) && (c = c(map, f)) != null && (e = e(str)) >= 0 && e <= c.size()) {
                return c.get(e);
            }
        }
        return null;
    }

    public static Map<String, Object> h(Map<String, Object> map, String str) {
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

    public static String i(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e1c0143", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String[] j(String str) {
        Pattern pattern;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f079faf7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (l(str)) {
            pattern = Pattern.compile("^fields");
        } else if (k(str)) {
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

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e0faaf1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^events\\..+\\[.+\\]\\.fields.*")) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78b82cb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^fields.*")) {
            return false;
        }
        return true;
    }

    public static void m(String[] strArr, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fb49b7", new Object[]{strArr, map, obj});
        } else if (strArr != null && strArr.length != 0 && map != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (a(strArr[i])) {
                    String f = f(strArr[i]);
                    List c = c(map, f);
                    if (c == null) {
                        c = new JSONArray();
                        map.put(f, c);
                    }
                    int e = e(strArr[i]);
                    if (i == strArr.length - 1) {
                        if (e < 0 || e >= c.size()) {
                            c.add(obj);
                        } else {
                            c.remove(e);
                            c.add(e, obj);
                        }
                    } else if (e < 0 || e >= c.size()) {
                        map = new JSONObject();
                        c.add(map);
                    } else if (!(c.get(e) instanceof Map)) {
                        map = new JSONObject();
                        c.remove(e);
                        c.add(e, map);
                    } else {
                        map = (Map) c.get(e);
                    }
                } else if (i == strArr.length - 1) {
                    map.put(strArr[i], obj);
                } else {
                    Object h = h(map, strArr[i]);
                    if (h == null) {
                        h = new JSONObject();
                        map.put(strArr[i], h);
                    }
                    map = h;
                }
            }
        }
    }
}
