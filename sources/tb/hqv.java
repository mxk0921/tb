package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750472);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return str.replace(" ", "");
    }

    public static Map<String, String> b(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("213f7e7f", new Object[]{map});
        }
        if (map == null) {
            return new HashMap(1);
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (!(str == null || str.length() < 1 || (obj = map.get(str)) == null)) {
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        if (hashMap.keySet().size() < 1) {
            return null;
        }
        return hashMap;
    }

    public static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b0571b7", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String[] d(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e1dbf7c9", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map);
        if (hashMap.size() == 0) {
            return null;
        }
        String[] strArr = new String[hashMap.size()];
        for (String str : hashMap.keySet()) {
            strArr[i] = str + "=" + ((String) hashMap.get(str));
            i++;
        }
        return strArr;
    }

    public static String e(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f4c0916", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj instanceof String) {
                str = (String) obj;
            } else if (obj == null) {
                str = null;
            } else {
                str = obj.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(str2);
                sb.append("=");
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String f(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4737669", new Object[]{strArr});
        }
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                if (!hsq.f(strArr[i])) {
                    if (z) {
                        sb.append(",");
                    }
                    sb.append(strArr[i]);
                    z = true;
                }
            }
        }
        return sb.toString();
    }

    public static Map<String, String> g(String[] strArr) {
        int indexOf;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("683d0021", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            if (!hsq.f(str2) && (indexOf = str2.indexOf("=")) >= 0) {
                String substring = str2.substring(0, indexOf);
                if (!TextUtils.isEmpty(substring)) {
                    if (indexOf < str2.length()) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = "";
                    }
                    hashMap.put(substring, str);
                }
            }
        }
        return hashMap;
    }

    public static Set<String> h(Class<?> cls) {
        HashSet hashSet = new HashSet();
        for (Field field : cls.getDeclaredFields()) {
            try {
                Object obj = field.get(cls);
                if (obj instanceof String) {
                    hashSet.add((String) obj);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return hashSet;
    }

    public static String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19ebc8eb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toJSONString();
    }

    public static <K, V> String j(Map<K, V> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9ff13b5", new Object[]{map, str, str2});
        }
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(str2);
            }
            sb.append(entry.getKey() + str + entry.getValue());
        }
        return sb.toString();
    }

    public static String k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69ee5792", new Object[]{map});
        }
        if (map == null) {
            return "";
        }
        return JSON.toJSONString(map);
    }

    public static String l(String str, boolean z, boolean z2, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f745bff", new Object[]{str, new Boolean(z), new Boolean(z2), str2});
        }
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        while (z && i <= length && str2.indexOf(str.charAt(i)) >= 0) {
            i++;
        }
        while (z2 && length >= i && str2.indexOf(str.charAt(length)) >= 0) {
            length--;
        }
        return str.substring(i, length + 1);
    }

    public static String m(String str, String... strArr) {
        String a2;
        int indexOf;
        int indexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf733c70", new Object[]{str, strArr});
        }
        String str2 = "";
        if (!(strArr == null || strArr.length == 0)) {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            for (String str3 : strArr) {
                if (str3 != null && (indexOf = (a2 = a(str3)).indexOf(str)) >= 0 && (indexOf2 = a2.indexOf("=", indexOf)) >= 0 && str.length() == indexOf2) {
                    int i = indexOf2 + 1;
                    int indexOf3 = a2.indexOf(",");
                    if (indexOf3 < 0) {
                        indexOf3 = a2.length();
                    }
                    if (indexOf3 < i) {
                        return str2;
                    }
                    str2 = a2.substring(i, indexOf3);
                }
            }
        }
        return str2;
    }

    public static Collection<String> n(String str, String str2, boolean z, Collection<String> collection) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("5b30f03c", new Object[]{str, str2, new Boolean(z), collection});
        }
        if (str == null) {
            return null;
        }
        if (collection == null) {
            collection = new ArrayList<>();
        }
        if (str2 == null || str2.length() == 0) {
            collection.add(str);
            return collection;
        }
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            String substring = str.substring(i, indexOf);
            if (z) {
                substring = r(substring);
            }
            if (!z || substring.length() > 0) {
                collection.add(substring);
            }
            i = str2.length() + indexOf;
        }
        String substring2 = str.substring(i);
        if (z) {
            substring2 = r(substring2);
        }
        if (!z || substring2.length() > 0) {
            collection.add(substring2);
        }
        return collection;
    }

    public static LinkedList<String> o(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("cd52abf4", new Object[]{str, str2, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        n(str, str2, z, linkedList);
        return linkedList;
    }

    public static HashMap<String, String> p(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3918c877", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            hashMap.put(r(str), "");
            return hashMap;
        }
        Iterator<String> it = o(str, str2, false).iterator();
        int length = str3.length();
        while (it.hasNext()) {
            String next = it.next();
            int indexOf = next.indexOf(str3);
            if (indexOf > 0) {
                String substring = next.substring(indexOf + length);
                if (z) {
                    substring = r(substring);
                }
                hashMap.put(r(next.substring(0, indexOf)), substring);
            } else {
                hashMap.put(r(next), "");
            }
        }
        return hashMap;
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1cafc66", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f514017", new Object[]{str});
        }
        return l(str, true, true, " \r\n\t\u3000   ");
    }

    public static String[] s(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("133ef0c0", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = str + "=" + string;
                i++;
            }
        }
        return strArr;
    }
}
