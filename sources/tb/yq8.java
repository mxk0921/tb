package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f32280a;
    public static final Set<String> b;
    public static final Set<String> c;
    public static final Set<String> d;
    public static final Set<String> e;

    public static Object a(Object obj, Object obj2, Object obj3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5bb57747", new Object[]{obj, obj2, obj3, str});
        }
        if (!((HashSet) e).contains(str) || !str.equals("?:")) {
            throw new RuntimeException("invalid operator : " + str);
        }
        try {
            if (((Boolean) obj).booleanValue()) {
                return obj2;
            }
            return obj3;
        } catch (ClassCastException unused) {
            throw new RuntimeException("invalid condition of operator : ".concat(str));
        }
    }

    public static Object c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("202bf27f", new Object[]{obj, str});
        }
        if (!((HashSet) c).contains(str) || !str.equals(f7l.AND_NOT)) {
            throw new RuntimeException("invalid operator : " + str);
        }
        try {
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        } catch (ClassCastException unused) {
            throw new RuntimeException("invalid usage of operator: ".concat(str));
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50066d63", new Object[]{obj, obj2, str});
        }
        if (((HashSet) d).contains(str)) {
            if (str.equals("==")) {
                return Boolean.valueOf(obj.equals(obj2));
            }
            if (str.equals("!=")) {
                return Boolean.valueOf(!obj.equals(obj2));
            }
        }
        if (((HashSet) f32280a).contains(str)) {
            Float f = (Float) obj;
            Float f2 = (Float) obj2;
            if (str.equals(f7l.PLUS)) {
                return Float.valueOf(f.floatValue() + f2.floatValue());
            }
            if (str.equals("-")) {
                return Float.valueOf(f.floatValue() - f2.floatValue());
            }
            if (str.equals("*")) {
                return Float.valueOf(f.floatValue() * f2.floatValue());
            }
            if (str.equals("/")) {
                return Float.valueOf(f.floatValue() / f2.floatValue());
            }
            if (str.equals(">")) {
                if (f.floatValue() <= f2.floatValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (str.equals(">=")) {
                if (f.floatValue() < f2.floatValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("<")) {
                if (f.floatValue() >= f2.floatValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("<=")) {
                if (f.floatValue() > f2.floatValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        if (((HashSet) b).contains(str)) {
            Boolean valueOf = Boolean.valueOf(obj.toString());
            Boolean valueOf2 = Boolean.valueOf(obj2.toString());
            if (str.equals("&&")) {
                if (!valueOf.booleanValue() || !valueOf2.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (str.equals("||")) {
                if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        throw new RuntimeException("invalid operator : " + str);
    }

    static {
        t2o.a(503317240);
        HashSet hashSet = new HashSet();
        f32280a = hashSet;
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        HashSet hashSet3 = new HashSet();
        c = hashSet3;
        HashSet hashSet4 = new HashSet();
        d = hashSet4;
        HashSet hashSet5 = new HashSet();
        e = hashSet5;
        hashSet.add(f7l.PLUS);
        hashSet.add("-");
        hashSet.add("*");
        hashSet.add("/");
        hashSet.add(">");
        hashSet.add(">=");
        hashSet.add("<");
        hashSet.add("<=");
        hashSet2.add("&&");
        hashSet2.add("||");
        hashSet4.add("==");
        hashSet4.add("!=");
        hashSet3.add(f7l.AND_NOT);
        hashSet5.add("?:");
    }
}
