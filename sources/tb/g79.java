package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.c;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class g79<T> implements Comparable<g79> {

    /* renamed from: a  reason: collision with root package name */
    public final int f19769a;
    public final String b;
    public final Class c;
    public final Type d;
    public final long e;
    public final String f;
    public final Method g;
    public final Field h;
    protected final long i;
    public final Object j;
    public final Locale k;
    final boolean l;
    final long m;
    final long n;
    volatile jdk o;
    volatile c p;
    final boolean q;
    final boolean r;
    Type s;
    Class t;
    volatile jdk u;

    public g79(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field) {
        boolean z;
        boolean z2;
        long j2;
        Class<?> cls2;
        this.b = str;
        this.d = type;
        this.c = cls;
        boolean z3 = false;
        if (cls == null || (!cls.isPrimitive() && cls != String.class && cls != List.class && !Serializable.class.isAssignableFrom(cls) && !Modifier.isInterface(cls.getModifiers()))) {
            z = false;
        } else {
            z = true;
        }
        this.l = z;
        this.e = j;
        this.m = ls9.a(str);
        this.n = ls9.b(str);
        this.f19769a = i;
        this.f = str2;
        this.k = locale;
        this.j = obj;
        this.g = method;
        this.h = field;
        if ((field == null || !Modifier.isFinal(field.getModifiers())) && (f79.READ_ONLY & j) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.r = z2;
        if (field == null || (j & f79.DISABLE_UNSAFE) != 0) {
            j2 = -1;
        } else {
            j2 = opf.UNSAFE.objectFieldOffset(field);
        }
        this.i = j2;
        if (j2 == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        if (!(cls == null || cls.isPrimitive() || cls == String.class || cls == List.class || cls == Map.class || cls.isEnum())) {
            if (method != null) {
                cls2 = method.getDeclaringClass();
            } else if (field != null) {
                cls2 = field.getDeclaringClass();
            } else {
                cls2 = null;
            }
            z3 = BeanUtils.S(cls2, cls);
        }
        this.q = z3;
    }

    public static jdk r(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String o = TypeUtils.o(type);
        o.hashCode();
        char c = 65535;
        switch (o.hashCode()) {
            case -1374008726:
                if (o.equals("byte[]")) {
                    c = 0;
                    break;
                }
                break;
            case 2887:
                if (o.equals("[B")) {
                    c = 1;
                    break;
                }
                break;
            case 1087757882:
                if (o.equals("java.sql.Date")) {
                    c = 2;
                    break;
                }
                break;
            case 1088242009:
                if (o.equals("java.sql.Time")) {
                    c = 3;
                    break;
                }
                break;
            case 1252880906:
                if (o.equals("java.sql.Timestamp")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new bfk(str);
            case 2:
                return new xtf(str, locale);
            case 3:
                return new ytf(str, locale);
            case 4:
                return new auf(str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return aek.J(str, locale);
                }
                if (cls == Date.class) {
                    return fek.J(str, locale);
                }
                return null;
        }
    }

    public jdk A(ObjectReaderProvider objectReaderProvider) {
        boolean z;
        if (this.o != null) {
            return this.o;
        }
        if ((this.e & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(this.d, z);
        this.o = J;
        return J;
    }

    public boolean B() {
        return this.r;
    }

    public boolean C() {
        if ((this.e & f79.UNWRAPPED_MASK) != 0) {
            return true;
        }
        return false;
    }

    public void J(JSONReader jSONReader, Object obj) {
        jSONReader.b3();
    }

    public abstract Object K(JSONReader jSONReader);

    public abstract void L(JSONReader jSONReader, T t);

    public void M(JSONReader jSONReader, T t) {
        L(jSONReader, t);
    }

    public boolean N(Class cls) {
        if (this.c == cls) {
            return true;
        }
        return false;
    }

    public void a(T t, byte b) {
        h(t, Byte.valueOf(b));
    }

    public void b(T t, char c) {
        h(t, Character.valueOf(c));
    }

    public void d(T t, double d) {
        h(t, Double.valueOf(d));
    }

    public void e(T t, float f) {
        h(t, Float.valueOf(f));
    }

    public void f(T t, int i) {
        h(t, Integer.valueOf(i));
    }

    public void g(T t, long j) {
        h(t, Long.valueOf(j));
    }

    public abstract void h(T t, Object obj);

    public void i(T t, short s) {
        h(t, Short.valueOf(s));
    }

    public void j(T t, boolean z) {
        h(t, Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(T r16, java.lang.Object r17, long r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g79.k(java.lang.Object, java.lang.Object, long):void");
    }

    public void l(T t) {
        Object obj = this.j;
        if (obj != null) {
            h(t, obj);
        }
    }

    public void n(JSONReader jSONReader, Object obj, String str) {
        c cVar;
        if (this.p == null || !this.p.toString().equals(str)) {
            cVar = c.b(str);
            this.p = cVar;
        } else {
            cVar = this.p;
        }
        jSONReader.e(this, obj, cVar);
    }

    public void o(JSONReader jSONReader, List list, int i, String str) {
        jSONReader.b(list, i, c.b(str));
    }

    public jdk p(JSONReader jSONReader) {
        return null;
    }

    /* renamed from: q */
    public int compareTo(g79 g79Var) {
        int i;
        Class<?> cls;
        Class<?> cls2;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        int compareTo = this.b.compareTo(g79Var.b);
        if (compareTo != 0) {
            int i2 = this.f19769a;
            int i3 = g79Var.f19769a;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            return compareTo;
        }
        if (B() == g79Var.B()) {
            i = 0;
        } else if (B()) {
            i = 1;
        } else {
            i = -1;
        }
        if (i != 0) {
            return i;
        }
        Member member = this.h;
        if (member == null) {
            member = this.g;
        }
        Member member2 = g79Var.h;
        if (member2 == null) {
            member2 = g79Var.g;
        }
        if (!(member == null || member2 == null || member.getClass() == member2.getClass() || (declaringClass2 = member.getDeclaringClass()) == (declaringClass = member2.getDeclaringClass()))) {
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return 1;
            }
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return -1;
            }
        }
        Field field = this.h;
        if (!(field == null || g79Var.h == null)) {
            Class<?> declaringClass3 = field.getDeclaringClass();
            Class<?> declaringClass4 = g79Var.h.getDeclaringClass();
            for (Class<? super Object> superclass = declaringClass3.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                if (superclass == declaringClass4) {
                    return 1;
                }
            }
            do {
                declaringClass4 = declaringClass4.getSuperclass();
                if (!(declaringClass4 == null || declaringClass4 == Object.class)) {
                }
            } while (declaringClass4 != declaringClass3);
            return -1;
        }
        Method method = this.g;
        if (!(method == null || g79Var.g == null)) {
            Class<?> declaringClass5 = method.getDeclaringClass();
            Class<?> declaringClass6 = g79Var.g.getDeclaringClass();
            for (Class<? super Object> superclass2 = declaringClass5.getSuperclass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                if (superclass2 == declaringClass6) {
                    return -1;
                }
            }
            do {
                declaringClass6 = declaringClass6.getSuperclass();
                if (declaringClass6 == null || declaringClass6 == Object.class) {
                    Class<?>[] parameterTypes = this.g.getParameterTypes();
                    Class<?>[] parameterTypes2 = g79Var.g.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes2.length == 1 && (cls = parameterTypes[0]) != (cls2 = parameterTypes2[0])) {
                        if (cls.isAssignableFrom(cls2)) {
                            return 1;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            return -1;
                        }
                        if (cls.isEnum() && (cls2 == Integer.class || cls2 == Integer.TYPE)) {
                            return 1;
                        }
                        if (cls2.isEnum() && (cls == Integer.class || cls == Integer.TYPE)) {
                            return -1;
                        }
                        JSONField jSONField = (JSONField) BeanUtils.u(this.g, JSONField.class);
                        JSONField jSONField2 = (JSONField) BeanUtils.u(g79Var.g, JSONField.class);
                        if (jSONField != null && jSONField2 == null) {
                            return -1;
                        }
                        if (jSONField == null && jSONField2 != null) {
                            return 1;
                        }
                    }
                    String name = this.g.getName();
                    String name2 = g79Var.g.getName();
                    if (!name.equals(name2)) {
                        String g0 = BeanUtils.g0(name, null);
                        String g02 = BeanUtils.g0(name2, null);
                        if (this.b.equals(g0) && !g79Var.b.equals(g02)) {
                            return 1;
                        }
                        if (g79Var.b.equals(g02) && !this.b.equals(g0)) {
                            return -1;
                        }
                    }
                }
            } while (declaringClass6 != declaringClass5);
            return 1;
        }
        jdk s = s();
        jdk s2 = g79Var.s();
        if (s != null && s2 == null) {
            return -1;
        }
        if (s == null && s2 != null) {
            return 1;
        }
        Class cls3 = this.c;
        Class cls4 = g79Var.c;
        boolean isPrimitive = cls3.isPrimitive();
        boolean isPrimitive2 = cls4.isPrimitive();
        if (isPrimitive && !isPrimitive2) {
            return -1;
        }
        if (!isPrimitive && isPrimitive2) {
            return 1;
        }
        boolean startsWith = cls3.getName().startsWith("java.", 0);
        boolean startsWith2 = cls4.getName().startsWith("java.", 0);
        if (startsWith && !startsWith2) {
            return -1;
        }
        if (startsWith || !startsWith2) {
            return i;
        }
        return 1;
    }

    public jdk s() {
        return null;
    }

    public Class t() {
        Type type = this.s;
        if (type == null) {
            return null;
        }
        if (this.t == null) {
            this.t = TypeUtils.i(type);
        }
        return this.t;
    }

    public String toString() {
        Member member = this.g;
        if (member == null) {
            member = this.h;
        }
        if (member != null) {
            return member.getName();
        }
        return this.b;
    }

    public long u() {
        Class t = t();
        if (t == null) {
            return 0L;
        }
        return ls9.a(t.getName());
    }

    public jdk v(JSONReader.c cVar) {
        if (this.u != null) {
            return this.u;
        }
        jdk g = cVar.g(this.s);
        this.u = g;
        return g;
    }

    public jdk w(JSONReader jSONReader) {
        return v(jSONReader.f2453a);
    }

    public Type x() {
        return this.s;
    }

    public jdk y(JSONReader.c cVar) {
        if (this.o != null) {
            return this.o;
        }
        jdk g = cVar.g(this.d);
        this.o = g;
        return g;
    }

    public jdk z(JSONReader jSONReader) {
        if (this.o != null) {
            return this.o;
        }
        jdk R0 = jSONReader.R0(this.d);
        this.o = R0;
        return R0;
    }

    public void m(Object obj, String str, Object obj2) {
    }
}
