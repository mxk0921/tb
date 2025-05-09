package tb;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.vzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class kqu {
    public static Collection a(Object obj) {
        if (!(obj instanceof rzf) || (obj instanceof szf)) {
            return f(obj);
        }
        q(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Iterable b(Object obj) {
        if (!(obj instanceof rzf) || (obj instanceof tzf)) {
            return g(obj);
        }
        q(obj, "kotlin.collections.MutableIterable");
        throw null;
    }

    public static List c(Object obj) {
        if (!(obj instanceof rzf) || (obj instanceof uzf)) {
            return h(obj);
        }
        q(obj, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map d(Object obj) {
        if (!(obj instanceof rzf) || (obj instanceof vzf)) {
            return i(obj);
        }
        q(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Object e(Object obj, int i) {
        if (obj == null || k(obj, i)) {
            return obj;
        }
        q(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            p(e);
            throw null;
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            p(e);
            throw null;
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            p(e);
            throw null;
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            p(e);
            throw null;
        }
    }

    public static int j(Object obj) {
        if (obj instanceof m2a) {
            return ((m2a) obj).getArity();
        }
        if (obj instanceof d1a) {
            return 0;
        }
        if (obj instanceof g1a) {
            return 1;
        }
        if (obj instanceof u1a) {
            return 2;
        }
        if (obj instanceof w1a) {
            return 3;
        }
        if (obj instanceof y1a) {
            return 4;
        }
        if (obj instanceof a2a) {
            return 5;
        }
        if (obj instanceof c2a) {
            return 6;
        }
        if (obj instanceof e2a) {
            return 7;
        }
        if (obj instanceof g2a) {
            return 8;
        }
        if (obj instanceof i2a) {
            return 9;
        }
        if (obj instanceof e1a) {
            return 10;
        }
        if (obj instanceof h1a) {
            return 11;
        }
        if (obj instanceof i1a) {
            return 12;
        }
        if (obj instanceof j1a) {
            return 13;
        }
        if (obj instanceof k1a) {
            return 14;
        }
        if (obj instanceof l1a) {
            return 15;
        }
        if (obj instanceof m1a) {
            return 16;
        }
        if (obj instanceof n1a) {
            return 17;
        }
        if (obj instanceof o1a) {
            return 18;
        }
        if (obj instanceof p1a) {
            return 19;
        }
        if (obj instanceof r1a) {
            return 20;
        }
        if (obj instanceof s1a) {
            return 21;
        }
        if (obj instanceof t1a) {
            return 22;
        }
        return -1;
    }

    public static boolean k(Object obj, int i) {
        if (!(obj instanceof f1a) || j(obj) != i) {
            return false;
        }
        return true;
    }

    public static boolean l(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof rzf) && !(obj instanceof uzf))) {
            return false;
        }
        return true;
    }

    public static boolean m(Object obj) {
        if (!(obj instanceof Map) || ((obj instanceof rzf) && !(obj instanceof vzf))) {
            return false;
        }
        return true;
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof Map.Entry) || ((obj instanceof rzf) && !(obj instanceof vzf.a))) {
            return false;
        }
        return true;
    }

    public static <T extends Throwable> T o(T t) {
        ckf.o(t, kqu.class.getName());
        return t;
    }

    public static ClassCastException p(ClassCastException classCastException) {
        o(classCastException);
        throw classCastException;
    }

    public static void q(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        r(str2 + " cannot be cast to " + str);
        throw null;
    }

    public static void r(String str) {
        p(new ClassCastException(str));
        throw null;
    }
}
