package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317049);
    }

    public static Object c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("761dc5b6", new Object[]{obj});
        }
        if (obj == null) {
            obj = "";
        }
        if ((obj instanceof Map) || (obj instanceof List)) {
            return obj.toString();
        }
        return obj;
    }

    public static Number d(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("2362fa30", new Object[]{obj, obj2});
        }
        return n(g(obj).floatValue() / g(obj2).floatValue());
    }

    public static Object e(String str, Object obj, iuo iuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ad2ccca", new Object[]{str, obj, iuoVar});
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list != null) {
                try {
                    return a(str, list, iuoVar);
                } catch (Exception e) {
                    tfs.e("Expression", e.getMessage());
                }
            }
            return "";
        } else if (!(obj instanceof Map)) {
            return obj;
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll((Map) obj);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                jSONObject.put((JSONObject) entry.getKey(), (String) e(str, entry.getValue(), iuoVar));
            }
            return jSONObject;
        }
    }

    public static Number g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("ffb6306", new Object[]{obj});
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf((String) obj);
            } catch (Exception unused) {
            }
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public static boolean h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debd8069", new Object[]{obj})).booleanValue();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return ((String) obj).startsWith("$.");
    }

    public static Boolean i(Object obj, Object obj2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7a916952", new Object[]{obj, obj2});
        }
        Number g = g(obj);
        Number g2 = g(obj2);
        if (!(g instanceof Integer) || !(g2 instanceof Integer)) {
            if (g.floatValue() < g2.floatValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (g.intValue() < g2.intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean j(Object obj, Object obj2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8862c1f8", new Object[]{obj, obj2});
        }
        Number g = g(obj);
        Number g2 = g(obj2);
        if (!(g instanceof Integer) || !(g2 instanceof Integer)) {
            if (g.floatValue() <= g2.floatValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (g.intValue() <= g2.intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Number k(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("c770be19", new Object[]{obj, obj2});
        }
        Number g = g(obj);
        Number g2 = g(obj2);
        if (!(g instanceof Integer) || !(g2 instanceof Integer)) {
            return n(g.floatValue() - g2.floatValue());
        }
        return Integer.valueOf(g.intValue() - g2.intValue());
    }

    public static Number l(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("82716fc7", new Object[]{obj, obj2});
        }
        return Integer.valueOf(g(obj).intValue() % g(obj2).intValue());
    }

    public static Number m(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("b60b042f", new Object[]{obj, obj2});
        }
        Number g = g(obj);
        Number g2 = g(obj2);
        if (!(g instanceof Integer) || !(g2 instanceof Integer)) {
            return n(g.floatValue() + g2.floatValue());
        }
        return Integer.valueOf(g.intValue() + g2.intValue());
    }

    public static Number n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("db361909", new Object[]{new Float(f)});
        }
        int i = (int) f;
        if (i == f) {
            return Integer.valueOf(i);
        }
        return Float.valueOf(f);
    }

    public static Number o(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("c3c53403", new Object[]{obj, obj2});
        }
        Number g = g(obj);
        Number g2 = g(obj2);
        if (!(g instanceof Integer) || !(g2 instanceof Integer)) {
            return n(g.floatValue() * g2.floatValue());
        }
        return Integer.valueOf(g.intValue() * g2.intValue());
    }

    public static Boolean f(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6a0d9d52", new Object[]{obj});
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            if (obj.equals("true")) {
                return Boolean.TRUE;
            }
            if (obj.equals("false")) {
                return Boolean.FALSE;
            }
        }
        if (g(obj).floatValue() > 0.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r8.equals(tb.f7l.PLUS) == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(java.lang.Object r6, java.lang.Object r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eq8.b(java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128 A[LOOP:1: B:63:0x0124->B:65:0x0128, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r12, java.util.List r13, tb.iuo r14) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eq8.a(java.lang.String, java.util.List, tb.iuo):java.lang.Object");
    }
}
