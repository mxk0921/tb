package tb;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ns3 implements wyf<Object>, ls3 {
    public static final a Companion = new a(null);
    public static final Map<Class<? extends f1a<?>>, Integer> b;
    public static final HashMap<String, String> c;
    public static final Map<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f24920a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            ckf.g(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) ns3.c.get(componentType.getName())) != null) {
                    str2 = str.concat(pg1.ATOM_Array);
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) ns3.c.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }

        public final String b(Class<?> cls) {
            ckf.g(cls, "jClass");
            String str = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return wsq.I0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return wsq.H0(simpleName, '$', null, 2, null);
                }
                return wsq.I0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    String str2 = (String) ((LinkedHashMap) ns3.d).get(componentType.getName());
                    if (str2 != null) {
                        str = str2.concat(pg1.ATOM_Array);
                    }
                }
                if (str == null) {
                    return pg1.ATOM_Array;
                }
                return str;
            } else {
                String str3 = (String) ((LinkedHashMap) ns3.d).get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }

        public final boolean c(Object obj, Class<?> cls) {
            ckf.g(cls, "jClass");
            Map map = ns3.b;
            ckf.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return kqu.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = gyf.c(gyf.d(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List l = yz3.l(d1a.class, g1a.class, u1a.class, w1a.class, y1a.class, a2a.class, c2a.class, e2a.class, g2a.class, i2a.class, e1a.class, h1a.class, i1a.class, j1a.class, k1a.class, l1a.class, m1a.class, n1a.class, o1a.class, p1a.class, r1a.class, s1a.class, t1a.class);
        ArrayList arrayList = new ArrayList(zz3.q(l, 10));
        for (Object obj : l) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(jpu.a((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                yz3.p();
                throw null;
            }
        }
        b = kotlin.collections.a.p(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        ckf.f(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            ckf.d(str);
            sb.append(wsq.K0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Pair a2 = jpu.a(sb.toString(), str.concat(".Companion"));
            hashMap3.put(a2.getFirst(), a2.getSecond());
        }
        for (Map.Entry<Class<? extends f1a<?>>, Integer> entry : b.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            ckf.d(str2);
            linkedHashMap.put(key, wsq.K0(str2, '.', null, 2, null));
        }
        d = linkedHashMap;
    }

    public ns3(Class<?> cls) {
        ckf.g(cls, "jClass");
        this.f24920a = cls;
    }

    @Override // tb.wyf
    public boolean a(Object obj) {
        return Companion.c(obj, b());
    }

    @Override // tb.ls3
    public Class<?> b() {
        return this.f24920a;
    }

    @Override // tb.wyf
    public String c() {
        return Companion.a(b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ns3) || !ckf.b(gyf.c(this), gyf.c((wyf) obj))) {
            return false;
        }
        return true;
    }

    @Override // tb.wyf
    public String getSimpleName() {
        return Companion.b(b());
    }

    public int hashCode() {
        return gyf.c(this).hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
