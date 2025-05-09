package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f7l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AND = "&&";
    public static final String AND_NOT = "!";
    public static final char ARRAY_END = ']';
    public static final String ARRAY_END_STR = "]";
    public static final char ARRAY_SEPRATOR = ',';
    public static final String ARRAY_SEPRATOR_STR = ",";
    public static final char ARRAY_START = '[';
    public static final String ARRAY_START_STR = "[";
    public static final char BLOCK_END = '}';
    public static final String BLOCK_END_STR = "}";
    public static final char BLOCK_START = '{';
    public static final String BLOCK_START_STR = "{";
    public static final char BRACKET_END = ')';
    public static final String BRACKET_END_STR = ")";
    public static final char BRACKET_START = '(';
    public static final String BRACKET_START_STR = "(";
    public static final char CONDITION_IF = '?';
    public static final char CONDITION_IF_MIDDLE = ':';
    public static final String CONDITION_IF_STRING = "?";
    public static final String DIV = "/";
    public static final char DOLLAR = '$';
    public static final String DOLLAR_STR = "$";
    public static final char DOT = '.';
    public static final String DOT_STR = ".";
    public static final String EQUAL = "===";
    public static final String EQUAL2 = "==";
    public static final String G = ">";
    public static final String GE = ">=";
    public static final Map<String, Object> KEYWORDS;
    public static final String L = "<";
    public static final String LE = "<=";
    public static final String MOD = "%";
    public static final String MUL = "*";
    public static final String NOT_EQUAL = "!==";
    public static final String NOT_EQUAL2 = "!=";
    public static final String OR = "||";
    public static final String PLUS = "+";
    public static final char QUOTE = '\"';
    public static final char SINGLE_QUOTE = '\'';
    public static final char SPACE = ' ';
    public static final String SPACE_STR = " ";
    public static final String SUB = "-";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f19076a;

    public static Object a(m1u m1uVar, m1u m1uVar2, m1u m1uVar3, Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7b0e82b7", new Object[]{m1uVar, m1uVar2, m1uVar3, obj});
        }
        if (m1uVar != null) {
            z = k(m1uVar.a(obj));
        }
        if (z) {
            if (m1uVar2 != null) {
                return m1uVar2.a(obj);
            }
            return null;
        } else if (m1uVar3 != null) {
            return m1uVar3.a(obj);
        } else {
            return null;
        }
    }

    public static Object b(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("958b7ec0", new Object[]{m1uVar, m1uVar2, obj});
        }
        Object obj3 = null;
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        }
        return Double.valueOf(e(obj2) / e(obj3));
    }

    public static Object c(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object a2;
        Object obj2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57ea5f08", new Object[]{m1uVar, m1uVar2, obj});
        }
        if (m1uVar == null || m1uVar2 == null || (a2 = m1uVar.a(obj)) == null) {
            return null;
        }
        if (m1uVar2.c() != 0) {
            Object a3 = m1uVar2.a(obj);
            if (a3 instanceof Double) {
                a3 = Integer.valueOf(((Double) a3).intValue());
            }
            if (a3 == null) {
                str = "";
            } else {
                str = a3.toString().trim();
            }
            obj2 = d(a2, str);
        } else {
            obj2 = m1uVar2.a(a2);
        }
        if (obj2 != null) {
            return obj2;
        }
        return o(a2, m1uVar2.b());
    }

    public static Object d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("470be85e", new Object[]{obj, str});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof sb1) {
            sb1 sb1Var = (sb1) obj;
            for (int i = sb1Var.i() - 1; i >= 0; i--) {
                Object b = sb1Var.b(i);
                if (b instanceof Map) {
                    Map map = (Map) b;
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                }
            }
        }
        if (obj instanceof Stack) {
            Stack stack = (Stack) obj;
            for (int size = stack.size() - 1; size >= 0; size--) {
                Object obj2 = stack.get(size);
                if (obj2 instanceof Map) {
                    Map map2 = (Map) obj2;
                    if (map2.containsKey(str)) {
                        return map2.get(str);
                    }
                }
            }
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof List) {
            try {
                return ((List) obj).get(Integer.parseInt(str));
            } catch (Exception unused) {
            }
        }
        if (obj.getClass().isArray()) {
            try {
                return Array.get(obj, Integer.parseInt(str));
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static double e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bcc3590", new Object[]{obj})).doubleValue();
        }
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception unused) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2db64914", new Object[]{str})).booleanValue();
        }
        char charAt = str.charAt(0);
        if (charAt == '.' || charAt == '[') {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean h(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fd4b5ae", new Object[]{m1uVar, m1uVar2, obj})).booleanValue();
        }
        if (m1uVar == null && m1uVar2 == null) {
            return true;
        }
        Object obj3 = null;
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        }
        if (obj2 == null) {
            if (obj3 == null) {
                return true;
            }
            if (!(obj3 instanceof CharSequence) || !g(obj3.toString())) {
                return false;
            }
            return true;
        } else if (obj3 == null) {
            if (g(obj2.toString())) {
                return true;
            }
            return false;
        } else if (obj2 instanceof Number) {
            if (obj3 instanceof Number) {
                if (((Number) obj2).doubleValue() == ((Number) obj3).doubleValue()) {
                    return true;
                }
                return false;
            } else if (((Number) obj2).doubleValue() == e(obj3)) {
                return true;
            } else {
                return false;
            }
        } else if (obj3 instanceof Number) {
            if (e(obj2) == ((Number) obj3).doubleValue()) {
                return true;
            }
            return false;
        } else if ((obj2 instanceof CharSequence) || (obj3 instanceof CharSequence)) {
            return obj2.toString().trim().equals(obj3.toString().trim());
        } else {
            return obj2.equals(obj3);
        }
    }

    public static boolean i(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3122eaa", new Object[]{new Character(c)})).booleanValue();
        }
        if (c == ')' || c == ']' || c == ' ' || c == ',') {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aaecec5", new Object[]{str})).booleanValue();
        }
        return i(str.charAt(0));
    }

    public static Object l(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9a45772f", new Object[]{m1uVar, m1uVar2, obj});
        }
        Object obj3 = null;
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        }
        return Double.valueOf(e(obj2) % e(obj3));
    }

    public static Object m(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("faaf102d", new Object[]{m1uVar, m1uVar2, obj});
        }
        Object obj3 = null;
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        }
        return Double.valueOf(e(obj2) * e(obj3));
    }

    public static Object n(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c1db9597", new Object[]{m1uVar, m1uVar2, obj});
        }
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        } else {
            obj3 = null;
        }
        String str = "";
        if ((obj2 instanceof CharSequence) || (obj3 instanceof CharSequence)) {
            if (obj2 == null) {
                return obj3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj2.toString());
            if (obj3 != null) {
                str = obj3.toString();
            }
            sb.append(str);
            return sb.toString();
        } else if ((obj2 instanceof Number) || (obj3 instanceof Number)) {
            return Double.valueOf(e(obj2) + e(obj3));
        } else {
            if (obj2 == null && obj3 == null) {
                return null;
            }
            if (obj2 == null) {
                return obj3.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj2.toString());
            if (obj3 != null) {
                str = obj3.toString();
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    public static Object o(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a61ce6ff", new Object[]{obj, str});
        }
        if (!pg1.ATOM_length.equals(str)) {
            return null;
        }
        if (obj instanceof CharSequence) {
            return Integer.valueOf(((CharSequence) obj).length());
        }
        boolean z = obj instanceof Map;
        if (z) {
            return Integer.valueOf(((Map) obj).size());
        }
        if (z) {
            return Integer.valueOf(((Map) obj).size());
        }
        if (obj instanceof List) {
            return Integer.valueOf(((List) obj).size());
        }
        if (obj.getClass().isArray()) {
            return Integer.valueOf(Array.getLength(obj));
        }
        return null;
    }

    public static Object p(m1u m1uVar, m1u m1uVar2, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ed30c631", new Object[]{m1uVar, m1uVar2, obj});
        }
        Object obj3 = null;
        if (m1uVar != null) {
            obj2 = m1uVar.a(obj);
        } else {
            obj2 = null;
        }
        if (m1uVar2 != null) {
            obj3 = m1uVar2.a(obj);
        }
        return Double.valueOf(e(obj2) - e(obj3));
    }

    public static double q(m1u m1uVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa13d7d2", new Object[]{m1uVar, obj})).doubleValue();
        }
        if (m1uVar == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return e(m1uVar.a(obj));
    }

    public static boolean r(m1u m1uVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f0bead", new Object[]{m1uVar, obj})).booleanValue();
        }
        if (m1uVar == null) {
            return false;
        }
        return k(m1uVar.a(obj));
    }

    public static boolean k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f999e07f", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != vu3.b.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        return !"false".equals(trim) && !"undefined".equals(trim) && !"null".equals(trim) && !g(trim);
    }

    static {
        t2o.a(985661616);
        HashMap hashMap = new HashMap();
        f19076a = hashMap;
        hashMap.put("}", 0);
        hashMap.put(BRACKET_END_STR, 0);
        hashMap.put(" ", 0);
        hashMap.put(",", 0);
        hashMap.put("]", 0);
        hashMap.put("||", 1);
        hashMap.put("&&", 1);
        hashMap.put(EQUAL, 2);
        hashMap.put("==", 2);
        hashMap.put(NOT_EQUAL, 2);
        hashMap.put("!=", 2);
        hashMap.put(">", 7);
        hashMap.put(">=", 7);
        hashMap.put("<", 7);
        hashMap.put("<=", 8);
        hashMap.put(PLUS, 9);
        hashMap.put("-", 9);
        hashMap.put("*", 10);
        hashMap.put("/", 10);
        hashMap.put(MOD, 10);
        hashMap.put(AND_NOT, 11);
        hashMap.put(".", 15);
        hashMap.put("[", 16);
        hashMap.put(BRACKET_START_STR, 17);
        hashMap.put("{", 17);
        HashMap hashMap2 = new HashMap();
        KEYWORDS = hashMap2;
        hashMap2.put("null", null);
        hashMap2.put("true", Boolean.TRUE);
        hashMap2.put("false", Boolean.FALSE);
        hashMap2.put("undefined", null);
    }
}
