package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> OPS;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f25569a = Pattern.compile("\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25570a;
        public Object b;

        static {
            t2o.a(912262342);
        }

        public b() {
        }
    }

    static {
        t2o.a(912262340);
        HashSet hashSet = new HashSet();
        OPS = hashSet;
        hashSet.add("empty");
        hashSet.add("not");
        hashSet.add("deleteifnull");
    }

    public static Object d(Object obj, String str) {
        Object obj2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a76404ac", new Object[]{obj, str});
        }
        if (obj == null || str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (Matcher matcher = f25569a.matcher(sb); matcher.find(); matcher = f25569a.matcher(sb)) {
            int start = matcher.start();
            int end = matcher.end();
            int length = sb.length();
            String group = matcher.group();
            Pair<String, String> f = f(group);
            if (f != null) {
                b e = e((String) f.first, f.second, obj);
                obj2 = e.b;
                if (e.f25570a) {
                    return obj2;
                }
            } else {
                obj2 = cq8.a(obj, group);
            }
            if (start == 0 && end == length) {
                return obj2;
            }
            if (obj2 == null) {
                str2 = "";
            } else {
                str2 = obj2.toString();
            }
            sb.replace(start, end, str2);
        }
        return sb.toString();
    }

    public static b e(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aef83d37", new Object[]{str, obj, obj2});
        }
        b bVar = new b();
        if ("empty".equalsIgnoreCase(str)) {
            bVar.b = Integer.valueOf(b(obj2, obj));
            return bVar;
        } else if ("not".equalsIgnoreCase(str)) {
            bVar.b = Integer.valueOf(c(obj2, obj));
            return bVar;
        } else if ("deleteIfNull".equalsIgnoreCase(str)) {
            a(obj2, obj, bVar);
            return bVar;
        } else {
            bVar.b = obj;
            return bVar;
        }
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d998dbd", new Object[]{str})).booleanValue();
        }
        return OPS.contains(str.toLowerCase());
    }

    public static void a(Object obj, Object obj2, b bVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e4a4c", new Object[]{obj, obj2, bVar});
            return;
        }
        bVar.b = d(obj, "${" + obj2 + "}");
        if (b(obj, obj2) <= 0) {
            z = false;
        }
        bVar.f25570a = z;
    }

    public static int b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e855ab34", new Object[]{obj, obj2})).intValue();
        }
        if (obj2 instanceof String) {
            Object d = d(obj, "${" + obj2 + "}");
            if (!(d instanceof String)) {
                return b(obj, d);
            }
            String trim = ((String) d).trim();
            if ("true".equalsIgnoreCase(trim)) {
                return 0;
            }
            return (!"false".equalsIgnoreCase(trim) && trim.length() > 0) ? 0 : 1;
        } else if (obj2 == null) {
            return 1;
        } else {
            if (obj2 instanceof Number) {
                return ((Number) obj2).intValue() != 0 ? 0 : 1;
            }
            if (obj2 instanceof Boolean) {
                return !((Boolean) obj2).booleanValue();
            }
            if (obj2 instanceof List) {
                return ((List) obj2).isEmpty() ? 1 : 0;
            }
            if (obj2.getClass().isArray()) {
                try {
                    return Array.getLength(obj2) > 0 ? 0 : 1;
                } catch (Exception unused) {
                    return 0;
                }
            } else if (obj2 instanceof Map) {
                return ((Map) obj2).isEmpty() ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    public static int c(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("824d1bfa", new Object[]{obj, obj2})).intValue();
        }
        if (obj2 instanceof String) {
            String str = "${" + obj2 + "}";
            Object d = d(obj, str);
            if (!(d instanceof String)) {
                return c(obj, d);
            }
            String str2 = (String) d;
            if ("true".equalsIgnoreCase(str2)) {
                return 0;
            }
            if ("false".equalsIgnoreCase(str2)) {
                return 1;
            }
            try {
                return Integer.parseInt(str2) == 0 ? 1 : 0;
            } catch (Exception unused) {
                return str.length() > 0 ? 0 : 1;
            }
        } else if (obj2 instanceof Number) {
            return ((Number) obj2).intValue() != 0 ? 0 : 1;
        } else {
            if (obj2 instanceof Boolean) {
                return !((Boolean) obj2).booleanValue();
            }
            return 0;
        }
    }

    public static Pair<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f329056f", new Object[]{str});
        }
        String trim = str.substring(str.indexOf("{") + 1, str.length() - 1).trim();
        String[] split = trim.split(" ");
        if (split.length <= 0) {
            return null;
        }
        String str2 = split[0];
        if (g(str2)) {
            return new Pair<>(str2, trim.substring(str2.length()));
        }
        return null;
    }
}
