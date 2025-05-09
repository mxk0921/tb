package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f26878a;
    public static final Pattern b = Pattern.compile("\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26879a;
        public Object b;

        static {
            t2o.a(83886249);
        }

        public b() {
        }
    }

    public static Object d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a76404ac", new Object[]{obj, str});
        }
        return e(obj, str, true);
    }

    public static Object e(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5b30a8a4", new Object[]{obj, str, new Boolean(z)});
        }
        return f(obj, null, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(java.lang.Object r5, java.lang.Object r6, java.lang.String r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.qq8.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0021
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r8)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r5
            r5 = 1
            r8[r5] = r6
            r5 = 2
            r8[r5] = r7
            r5 = 3
            r8[r5] = r1
            java.lang.String r5 = "46ffd4de"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r8)
            return r5
        L_0x0021:
            if (r5 == 0) goto L_0x008c
            if (r7 != 0) goto L_0x0026
            goto L_0x008c
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.util.regex.Pattern r7 = tb.qq8.b
            java.util.regex.Matcher r7 = r7.matcher(r0)
        L_0x0031:
            boolean r1 = r7.find()
            if (r1 == 0) goto L_0x0087
            int r1 = r7.start()
            int r2 = r7.end()
            int r3 = r0.length()
            java.lang.String r7 = r7.group()
            android.util.Pair r4 = h(r7)
            if (r4 == 0) goto L_0x0063
            if (r8 != 0) goto L_0x0050
            goto L_0x006f
        L_0x0050:
            java.lang.Object r7 = r4.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r4.second
            tb.qq8$b r7 = g(r7, r4, r5)
            java.lang.Object r4 = r7.b
            boolean r7 = r7.f26879a
            if (r7 == 0) goto L_0x0061
            return r4
        L_0x0061:
            r7 = r4
            goto L_0x006f
        L_0x0063:
            java.lang.Object r4 = tb.dq8.a(r5, r7)
            if (r4 != 0) goto L_0x0061
            if (r6 == 0) goto L_0x0061
            java.lang.Object r7 = tb.dq8.a(r6, r7)
        L_0x006f:
            if (r1 != 0) goto L_0x0074
            if (r2 != r3) goto L_0x0074
            return r7
        L_0x0074:
            if (r7 != 0) goto L_0x0079
            java.lang.String r7 = ""
            goto L_0x007d
        L_0x0079:
            java.lang.String r7 = r7.toString()
        L_0x007d:
            r0.replace(r1, r2, r7)
            java.util.regex.Pattern r7 = tb.qq8.b
            java.util.regex.Matcher r7 = r7.matcher(r0)
            goto L_0x0031
        L_0x0087:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x008c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qq8.f(java.lang.Object, java.lang.Object, java.lang.String, boolean):java.lang.Object");
    }

    public static b g(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b6d2e781", new Object[]{str, obj, obj2});
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

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d998dbd", new Object[]{str})).booleanValue();
        }
        return ((HashSet) f26878a).contains(str.toLowerCase());
    }

    public static void a(Object obj, Object obj2, b bVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a91a806", new Object[]{obj, obj2, bVar});
            return;
        }
        bVar.b = d(obj, "${" + obj2 + "}");
        if (b(obj, obj2) <= 0) {
            z = false;
        }
        bVar.f26879a = z;
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

    public static Pair<String, String> h(String str) {
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
        if (i(str2)) {
            return new Pair<>(str2, trim.substring(str2.length()));
        }
        return null;
    }

    static {
        t2o.a(83886247);
        HashSet hashSet = new HashSet();
        f26878a = hashSet;
        hashSet.add("empty");
        hashSet.add("not");
        hashSet.add("deleteifnull");
    }
}
