package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.n;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rdk {
    public static final rdk INSTANCE = new rdk();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class b implements nk4 {

        /* renamed from: a  reason: collision with root package name */
        public final Class f27298a;
        public final Type b;
        public final String c;
        public final f79 d;
        public final Map<String, g79> e;
        public final ObjectReaderProvider f;
        public final e62 g;
        public final boolean h;

        public b(Class cls, Type type, String str, f79 f79Var, Map<String, g79> map, ObjectReaderProvider objectReaderProvider, e62 e62Var, boolean z) {
            this.f27298a = cls;
            this.b = type;
            this.c = str;
            this.d = f79Var;
            this.e = map;
            this.f = objectReaderProvider;
            this.g = e62Var;
            this.h = z;
        }

        @Override // tb.nk4
        public void accept(Object obj) {
            String name;
            String str;
            String[] strArr;
            int i;
            int i2;
            Map<String, g79> map;
            b bVar = this;
            Field field = (Field) obj;
            f79 f79Var = bVar.d;
            f79Var.b();
            if (bVar.h) {
                f79Var.e |= JSONReader.Feature.FieldBased.mask;
            } else {
                boolean z = true;
                if ((field.getModifiers() & 1) != 0) {
                    z = false;
                }
                f79Var.f = z;
            }
            long j = f79Var.e;
            e62 e62Var = bVar.g;
            f79Var.e = j | e62Var.m;
            f79Var.b = e62Var.x;
            ObjectReaderProvider objectReaderProvider = bVar.f;
            objectReaderProvider.C(f79Var, bVar.f27298a, field);
            if (!f79Var.f || ((f79Var.e & f79.UNWRAPPED_MASK) != 0 && Map.class.isAssignableFrom(field.getType()))) {
                String str2 = f79Var.f19065a;
                if (str2 == null || str2.isEmpty()) {
                    name = field.getName();
                    String str3 = bVar.c;
                    if (str3 != null) {
                        name = BeanUtils.s(name, str3);
                    }
                } else {
                    name = f79Var.f19065a;
                }
                String[] strArr2 = e62Var.r;
                if (strArr2 != null && strArr2.length > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < strArr2.length) {
                            if (name.equals(strArr2[i3])) {
                                f79Var.d = i3;
                                break;
                            }
                            i3++;
                        } else if (f79Var.d == 0) {
                            f79Var.d = strArr2.length;
                        }
                    }
                }
                Class<?> type = field.getType();
                Type genericType = field.getGenericType();
                jdk z2 = rdk.z(objectReaderProvider, genericType, type, f79Var);
                g79 h = rdk.this.h(bVar.f27298a, bVar.b, name, f79Var.d, f79Var.e, f79Var.b, f79Var.l, f79Var.k, genericType, type, field, z2);
                Map<String, g79> map2 = bVar.e;
                String str4 = name;
                g79 g79Var = map2.get(str4);
                if (g79Var == null) {
                    map2.put(str4, h);
                } else if (h.compareTo(g79Var) > 0) {
                    map2.put(str4, h);
                }
                String[] strArr3 = f79Var.g;
                if (strArr3 != null) {
                    int length = strArr3.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str5 = strArr3[i4];
                        if (str4.equals(str5)) {
                            i2 = i4;
                            i = length;
                            strArr = strArr3;
                            str = str4;
                            map = map2;
                        } else {
                            int i5 = f79Var.d;
                            long j2 = f79Var.e;
                            Locale locale = f79Var.l;
                            String str6 = f79Var.k;
                            Type type2 = bVar.b;
                            rdk rdkVar = rdk.this;
                            Class cls = bVar.f27298a;
                            i2 = i4;
                            i = length;
                            strArr = strArr3;
                            str = str4;
                            map = map2;
                            g79 h2 = rdkVar.h(cls, type2, str5, i5, j2, null, locale, str6, genericType, type, field, null);
                            if (map.get(str5) == null) {
                                map.put(str5, h2);
                            }
                        }
                        i4 = i2 + 1;
                        map2 = map;
                        length = i;
                        strArr3 = strArr;
                        str4 = str;
                        bVar = this;
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object A(Method method, Object obj) {
        try {
            return method.invoke(obj, new Object[0]);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }

    public static /* synthetic */ void D(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, e62 e62Var, String str, f79 f79Var, Method method) {
        if (method.getReturnType() == cls) {
            f79 f79Var2 = new f79();
            objectReaderProvider.D(f79Var2, cls2, method);
            String str2 = f79Var2.f19065a;
            if (str2 == null) {
                str2 = BeanUtils.L(method, e62Var.t, PropertyNamingStrategy.CamelCase.name());
            }
            if (f79Var2.i != null && str.equals(str2)) {
                f79Var.i = f79Var2.i;
            }
        }
    }

    public static jdk z(ObjectReaderProvider objectReaderProvider, Type type, Class cls, f79 f79Var) {
        jdk jdkVar;
        jdk a2 = f79Var.a();
        if (a2 != null) {
            return a2;
        }
        if (cls == BigDecimal.class) {
            jdkVar = objectReaderProvider.J(BigDecimal.class, false);
            if (jdkVar == vdk.c) {
                return a2;
            }
        } else if (cls == BigInteger.class) {
            jdkVar = objectReaderProvider.J(BigInteger.class, false);
            if (jdkVar == wdk.b) {
                return a2;
            }
        } else if (cls != Date.class || (jdkVar = objectReaderProvider.J(Date.class, false)) == fek.INSTANCE) {
            return a2;
        }
        return jdkVar;
    }

    public final /* synthetic */ void C(f79 f79Var, ObjectReaderProvider objectReaderProvider, Class cls, String str, Class cls2, e62 e62Var, int i, Map map, Type type, Method method) {
        String str2;
        int i2;
        String[] strArr;
        f79Var.b();
        objectReaderProvider.D(f79Var, cls, method);
        if (!f79Var.f) {
            String name = method.getName();
            String str3 = f79Var.f19065a;
            if (str3 != null && !str3.isEmpty()) {
                name = f79Var.f19065a;
            } else if (name.length() > str.length() && name.startsWith(str, 0)) {
                name = BeanUtils.f0(name, i);
            } else if (method.getDeclaringClass() != Object.class && method.getReturnType() == cls2) {
                if (method.getAnnotation(JSONField.class) == null && (e62Var.m & JSONReader.Feature.SupportSmartMatch.mask) == 0) {
                    return;
                }
            } else {
                return;
            }
            if (method.getParameterTypes().length == 0) {
                g79 i3 = i(cls2, cls2, name, f79Var.d, f79Var.e, f79Var.b, f79Var.l, f79Var.k, method.getGenericReturnType(), method.getReturnType(), method, null);
                g79 g79Var = (g79) map.get(name);
                if (g79Var == null) {
                    map.put(name, i3);
                } else if (g79Var.compareTo(i3) > 0) {
                    map.put(name, i3);
                }
            } else {
                Type type2 = method.getGenericParameterTypes()[0];
                Class<?> cls3 = method.getParameterTypes()[0];
                method.setAccessible(true);
                g79 i4 = i(cls2, type, name, f79Var.d, f79Var.e, f79Var.b, f79Var.l, f79Var.k, type2, cls3, method, null);
                String str4 = name;
                g79 g79Var2 = (g79) map.get(str4);
                if (g79Var2 == null) {
                    map.put(str4, i4);
                } else if (g79Var2.compareTo(i4) > 0) {
                    map.put(str4, i4);
                }
                String[] strArr2 = f79Var.g;
                if (strArr2 != null) {
                    int i5 = 0;
                    while (i5 < strArr2.length) {
                        String str5 = strArr2[i5];
                        if (!str4.equals(str5) && ((g79) map.get(str5)) == null) {
                            i2 = i5;
                            strArr = strArr2;
                            str2 = str4;
                            map.put(str5, i(cls2, type, str5, f79Var.d, f79Var.e, f79Var.b, f79Var.l, f79Var.k, type2, cls3, method, null));
                        } else {
                            i2 = i5;
                            strArr = strArr2;
                            str2 = str4;
                        }
                        i5 = i2 + 1;
                        strArr2 = strArr;
                        str4 = str2;
                    }
                }
            }
        }
    }

    public <T, R> k2a<T, R> e(final Method method) {
        method.setAccessible(true);
        return new k2a() { // from class: tb.qdk
            @Override // tb.k2a
            public final Object apply(Object obj) {
                Object A;
                A = rdk.A(method, obj);
                return A;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[LOOP:4: B:49:0x00f1->B:50:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.jdk f(java.lang.Class r12, java.lang.reflect.Method r13, com.alibaba.fastjson2.reader.ObjectReaderProvider r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rdk.f(java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.ObjectReaderProvider):tb.jdk");
    }

    public <T> k2a<Map<Long, Object>, T> g(Method method, String... strArr) {
        method.setAccessible(true);
        return new sx8(method, strArr);
    }

    public <T> g79<T> h(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, Type type2, Class cls2, Field field, jdk jdkVar) {
        Class<?> cls3;
        Type type3;
        Object obj2 = obj;
        if ((obj2 instanceof String) && cls2.isEnum()) {
            obj2 = Enum.valueOf(cls2, (String) obj2);
        }
        if (!(obj2 == null || obj2.getClass() == cls2)) {
            k2a M = JSONFactory.k().M(obj2.getClass(), type2);
            if (M != null) {
                obj2 = M.apply(obj2);
            } else {
                throw new JSONException("illegal defaultValue : " + obj2 + ", class " + cls2.getName());
            }
        }
        if (field != null && !cls.getName().startsWith("java.lang", 0)) {
            field.setAccessible(true);
        }
        if (jdkVar != null) {
            ga9 ga9Var = new ga9(str, type2, cls2, i, j | f79.READ_USING_MASK, str2, obj2, field);
            ga9Var.v = jdkVar;
            return ga9Var;
        } else if (cls2 == Integer.TYPE) {
            return new h99(str, cls2, i, str2, (Integer) obj2, field);
        } else {
            if (cls2 == Integer.class) {
                return new c99(str, cls2, i, j, str2, (Integer) obj2, field);
            }
            if (cls2 == Long.TYPE) {
                return new p99(str, cls2, i, j, str2, (Long) obj2, field);
            }
            if (cls2 == Long.class) {
                return new k99(str, cls2, i, j, str2, (Long) obj2, field);
            }
            if (cls2 == Short.TYPE) {
                return new z89(str, cls2, i, j, str2, (Short) obj2, field);
            }
            if (cls2 == Short.class) {
                return new v89(str, cls2, i, j, str2, (Short) obj2, field);
            }
            if (cls2 == Boolean.TYPE) {
                return new b89(str, i, j, str2, (Boolean) obj2, field);
            }
            if (cls2 == Boolean.class) {
                return new x79(str, cls2, i, j, str2, (Boolean) obj2, field);
            }
            if (cls2 == Byte.TYPE) {
                return new w99(str, cls2, i, j, str2, (Byte) obj2, field);
            }
            if (cls2 == Byte.class) {
                return new s99(str, cls2, i, j, str2, (Byte) obj2, field);
            }
            if (cls2 == Float.TYPE) {
                return new s89(str, cls2, i, j, str2, (Float) obj2, field);
            }
            if (cls2 == Float.class) {
                return new p89(str, cls2, i, j, str2, (Float) obj2, field);
            }
            if (cls2 == Double.TYPE) {
                return new m89(str, cls2, i, j, str2, (Double) obj2, field);
            }
            if (cls2 == Double.class) {
                return new j89(str, cls2, i, j, str2, (Double) obj2, field);
            }
            if (cls2 == Character.TYPE) {
                return new d89(str, i, j, str2, (Character) obj2, field);
            }
            if (cls2 == BigDecimal.class) {
                return new r79(str, cls2, i, j, str2, (BigDecimal) obj2, field);
            }
            if (cls2 == BigInteger.class) {
                return new u79(str, cls2, i, j, str2, (BigInteger) obj2, field);
            }
            if (cls2 == String.class) {
                return new la9(str, cls2, i, j, str2, (String) obj2, field);
            }
            if (cls2 == Date.class) {
                return new h89(str, type2, cls2, i, j, str2, locale, obj2, field, null, null);
            }
            if (cls2 == AtomicBoolean.class) {
                return new i79(str, cls2, i, str2, (AtomicBoolean) obj2, field);
            }
            if (cls2 == AtomicReference.class) {
                return new p79(str, type2, cls2, i, str2, field);
            }
            Type type4 = null;
            if (!(type2 instanceof Class)) {
                type3 = BeanUtils.C(n.a(type), cls, field, type2);
                cls3 = TypeUtils.m(type3);
            } else {
                type3 = null;
                cls3 = null;
            }
            boolean isFinal = Modifier.isFinal(field.getModifiers());
            if (Collection.class.isAssignableFrom(cls2)) {
                if (type3 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type3).getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type5 = actualTypeArguments[0];
                        Class<?> m = TypeUtils.m(type5);
                        if (m != String.class) {
                            return new aa9(str, type3, cls3, type5, m, i, j, str2, locale, (Collection) obj2, field);
                        }
                        if (!isFinal) {
                            return new aa9(str, type3, cls3, String.class, String.class, i, j, str2, locale, null, field);
                        }
                        if ((j & JSONReader.Feature.FieldBased.mask) != 0) {
                            return new aa9(str, type3, cls3, String.class, String.class, i, j, str2, locale, null, field);
                        }
                        return new f89(str, type3, cls3, i, j, str2, field);
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                    if (actualTypeArguments2.length > 0) {
                        type4 = actualTypeArguments2[0];
                    }
                }
                Class cls4 = type4 == null ? Object.class : type4;
                return new aa9(str, type2, cls2, cls4, TypeUtils.i(cls4), i, j, str2, locale, (Collection) obj2, field);
            } else if (Map.class.isAssignableFrom(cls2) && (type3 instanceof ParameterizedType) && ((ParameterizedType) type3).getActualTypeArguments().length == 2 && isFinal && (j & JSONReader.Feature.FieldBased.mask) == 0) {
                return new ca9(str, type3, cls3, i, j, str2, field);
            } else {
                if (isFinal) {
                    if (cls2 == int[].class) {
                        return new g99(str, cls2, i, j, str2, (int[]) obj2, field);
                    }
                    if (cls2 == long[].class) {
                        return new o99(str, cls2, i, j, str2, (long[]) obj2, field);
                    }
                }
                if (cls3 == null) {
                    return new ga9(str, type2, cls2, i, j, str2, obj2, field);
                }
                if ((j & f79.UNWRAPPED_MASK) == 0 || !Map.class.isAssignableFrom(cls3)) {
                    return new ga9(str, type3, cls2, i, j, str2, obj2, field);
                }
                return new ca9(str, type3, cls2, i, j, str2, field);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> tb.g79 i(java.lang.Class<T> r17, java.lang.reflect.Type r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.util.Locale r24, java.lang.Object r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.reflect.Method r28, tb.jdk r29) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rdk.i(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, tb.jdk):tb.g79");
    }

    public <T> g79 j(Class<T> cls, Type type, String str, int i, long j, String str2, Type type2, Class cls2, String str3, Class cls3, jdk jdkVar) {
        return k(cls, type, str, i, j, str2, null, null, type2, cls2, str3, cls3, jdkVar);
    }

    public <T> g79 k(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, Type type2, Class cls2, String str3, Class cls3, jdk jdkVar) {
        if (jdkVar != null) {
            ia9 ia9Var = new ia9(str, type2, cls2, str3, i, j, str2, locale, obj);
            ia9Var.v = jdkVar;
            return ia9Var;
        } else if (type2 == Byte.TYPE || type2 == Byte.class) {
            return new v99(str, cls2, str3, i, j, str2, locale, obj);
        } else {
            if (type2 == Short.TYPE || type2 == Short.class) {
                return new y89(str, cls2, str3, i, j, str2, locale, obj);
            }
            if (type2 == Integer.TYPE || type2 == Integer.class) {
                return new f99(str, cls2, str3, i, j, str2, locale, obj);
            }
            if (type2 == Long.TYPE || type2 == Long.class) {
                return new n99(str, cls2, str3, i, j, str2, locale, obj);
            }
            Class cls4 = null;
            if ((type2 instanceof Class) || type == null) {
                cls4 = null;
            } else {
                Type I = BeanUtils.I(n.a(type), cls, cls3, type2);
                if (I != null) {
                    cls4 = TypeUtils.m(I);
                }
                cls4 = I;
            }
            return new ia9(str, cls4 == null ? type2 : cls4, cls4 == null ? cls2 : cls4, str3, i, j, str2, locale, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.g79[] l(com.alibaba.fastjson2.reader.ObjectReaderProvider r31, java.lang.Class r32, java.lang.reflect.Type r33, java.lang.reflect.AccessibleObject r34, java.lang.Class[] r35, java.lang.String... r36) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rdk.l(com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.Class, java.lang.reflect.Type, java.lang.reflect.AccessibleObject, java.lang.Class[], java.lang.String[]):tb.g79[]");
    }

    public <T> g79[] m(Class<T> cls, Type type, e62 e62Var, boolean z, ObjectReaderProvider objectReaderProvider) {
        e62 e62Var2;
        if (e62Var == null) {
            e62 e62Var3 = new e62();
            objectReaderProvider.u(e62Var3, cls);
            e62Var2 = e62Var3;
        } else {
            e62Var2 = e62Var;
        }
        String str = e62Var2.p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f79 f79Var = new f79();
        String[] strArr = e62Var2.r;
        b bVar = new b(cls, type, str, f79Var, linkedHashMap, objectReaderProvider, e62Var2, z);
        if (z) {
            BeanUtils.n(cls, bVar);
        } else {
            BeanUtils.n(cls, bVar);
            a aVar = new a(cls, type, str, strArr, e62Var2, f79Var, linkedHashMap, objectReaderProvider);
            BeanUtils.h0(cls, e62Var2, (Class) ((ConcurrentHashMap) objectReaderProvider.d).get(cls), aVar);
            if (cls.isInterface()) {
                BeanUtils.O(cls, aVar);
            }
        }
        g79[] g79VarArr = new g79[linkedHashMap.size()];
        linkedHashMap.values().toArray(g79VarArr);
        Arrays.sort(g79VarArr);
        return g79VarArr;
    }

    public <T> k2a<Map<Long, Object>, T> n(Constructor constructor, Constructor constructor2, String... strArr) {
        if (constructor2 == null) {
            constructor.setAccessible(true);
        } else {
            constructor2.setAccessible(true);
        }
        return new ck4(null, constructor, null, null, constructor2, strArr);
    }

    public <T> k2a<Map<Long, Object>, T> o(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        return new ck4(null, constructor, null, null, null, strArr);
    }

    public <T> jdk<T> p(Class<T> cls) {
        return s(cls, cls, false, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> jdk<T> q(Class<T> cls, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        return r(cls, null, j, supplier, k2aVar, g79VarArr);
    }

    public <T> jdk<T> r(Class<T> cls, String str, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new kdk(cls, str, null, j, supplier, k2aVar, g79VarArr);
            }
        }
        switch (g79VarArr.length) {
            case 1:
                return new ddk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            case 2:
                return new edk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            case 3:
                return new fdk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            case 4:
                return new gdk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            case 5:
                return new hdk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            case 6:
                return new idk(cls, null, null, j, supplier, k2aVar, g79VarArr);
            default:
                return new kdk(cls, str, null, j, supplier, k2aVar, g79VarArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> tb.jdk<T> s(java.lang.Class<T> r27, java.lang.reflect.Type r28, boolean r29, com.alibaba.fastjson2.reader.ObjectReaderProvider r30) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rdk.s(java.lang.Class, java.lang.reflect.Type, boolean, com.alibaba.fastjson2.reader.ObjectReaderProvider):tb.jdk");
    }

    public <T> jdk<T> t(Class cls, k2a<Map<Long, Object>, T> k2aVar, g79... g79VarArr) {
        return new wgk(cls, null, null, 0L, k2aVar, null, g79VarArr, null, null, null);
    }

    public <T> jdk<T> u(Constructor constructor, String... strArr) {
        k2a<Map<Long, Object>, T> o = o(constructor, strArr);
        Class<T> declaringClass = constructor.getDeclaringClass();
        return t(declaringClass, o, l(JSONFactory.defaultObjectReaderProvider, declaringClass, declaringClass, constructor, constructor.getParameterTypes(), strArr));
    }

    public <T> jdk<T> v(Class<T> cls, String str, Class[] clsArr, String[] strArr, Class cls2, g79... g79VarArr) {
        return new yhk(cls, y(cls), str, clsArr, strArr, cls2, g79VarArr);
    }

    public <T> jdk<T> x(final Class<T> cls, Type type, final ObjectReaderProvider objectReaderProvider, final e62 e62Var) {
        Class[] parameterTypes;
        Class declaringClass;
        String[] strArr;
        Type[] genericParameterTypes;
        Annotation[][] parameterAnnotations;
        String[] strArr2;
        LinkedHashMap linkedHashMap;
        f79 f79Var;
        boolean z;
        int i;
        Class[] clsArr;
        String[] strArr3;
        k2a<Map<Long, Object>, T> g;
        g79[] g79VarArr;
        Type type2;
        Class<?> cls2;
        String str;
        String[] strArr4;
        f79 f79Var2;
        int i2;
        Class cls3 = cls;
        ObjectReaderProvider objectReaderProvider2 = objectReaderProvider;
        e62 e62Var2 = e62Var;
        final f79 f79Var3 = new f79();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Constructor constructor = e62Var2.i;
        if (constructor != null) {
            parameterTypes = constructor.getParameterTypes();
            declaringClass = e62Var2.i.getDeclaringClass();
            strArr = BeanUtils.Y(e62Var2.i);
            genericParameterTypes = e62Var2.i.getGenericParameterTypes();
            parameterAnnotations = e62Var2.i.getParameterAnnotations();
        } else {
            parameterTypes = e62Var2.k.getParameterTypes();
            declaringClass = e62Var2.k.getDeclaringClass();
            strArr = new String[parameterTypes.length];
            genericParameterTypes = e62Var2.k.getGenericParameterTypes();
            parameterAnnotations = e62Var2.k.getParameterAnnotations();
        }
        Class[] clsArr2 = parameterTypes;
        String[] strArr5 = strArr;
        int i3 = 0;
        while (true) {
            if (i3 >= clsArr2.length) {
                strArr2 = strArr5;
                linkedHashMap = linkedHashMap2;
                f79Var = f79Var3;
                z = true;
                i = 0;
                clsArr = clsArr2;
                break;
            }
            f79Var3.b();
            Constructor constructor2 = e62Var2.i;
            if (constructor2 != null) {
                z = true;
                objectReaderProvider.B(f79Var3, cls, constructor2, i3, parameterAnnotations);
            } else {
                z = true;
                objectReaderProvider2.E(f79Var3, cls3, e62Var2.k, i3);
            }
            if (clsArr2.length == z && (f79Var3.e & f79.VALUE_MASK) != 0) {
                strArr2 = strArr5;
                clsArr = clsArr2;
                linkedHashMap = linkedHashMap2;
                f79Var = f79Var3;
                i = 0;
                break;
            }
            String str2 = f79Var3.f19065a;
            if (str2 == null || str2.isEmpty()) {
                String[] strArr6 = e62Var2.l;
                if (strArr6 != null && i3 < strArr6.length) {
                    str2 = strArr6[i3];
                }
                if (str2 == null || str2.isEmpty()) {
                    str2 = "arg" + i3;
                }
            }
            if (!str2.startsWith("arg", 0)) {
                strArr5[i3] = str2;
            } else if (strArr5.length > i3) {
                str2 = strArr5[i3];
            }
            final String str3 = str2;
            final Class cls4 = clsArr2[i3];
            BeanUtils.O(cls3, new nk4() { // from class: tb.ndk
                @Override // tb.nk4
                public final void accept(Object obj) {
                    e62 e62Var3 = e62Var;
                    String str4 = str3;
                    rdk.D(cls4, objectReaderProvider, cls, e62Var3, str4, f79Var3, (Method) obj);
                }
            });
            if (str3 == null || str3.isEmpty()) {
                str3 = "arg" + i3;
            }
            Type type3 = genericParameterTypes[i3];
            jdk z2 = z(objectReaderProvider2, type3, cls4, f79Var3);
            f79 f79Var4 = f79Var3;
            String str4 = str3;
            linkedHashMap2.put(str4, j(cls, type, str3, i3, f79Var3.e, f79Var3.b, type3, cls4, str3, declaringClass, z2));
            String[] strArr7 = f79Var4.g;
            if (strArr7 != null) {
                int i4 = 0;
                while (i4 < strArr7.length) {
                    String str5 = strArr7[i4];
                    if (!str4.equals(str5) && ((g79) linkedHashMap2.get(str5)) == null) {
                        f79Var2 = f79Var4;
                        i2 = i4;
                        strArr4 = strArr7;
                        str = str4;
                        linkedHashMap2.put(str5, j(cls, type, str5, i3, f79Var4.e, f79Var4.b, type3, cls4, str4, declaringClass, null));
                    } else {
                        i2 = i4;
                        strArr4 = strArr7;
                        str = str4;
                        f79Var2 = f79Var4;
                    }
                    i4 = i2 + 1;
                    f79Var4 = f79Var2;
                    strArr7 = strArr4;
                    str4 = str;
                }
            }
            i3++;
            objectReaderProvider2 = objectReaderProvider;
            e62Var2 = e62Var;
            linkedHashMap2 = linkedHashMap2;
            strArr5 = strArr5;
            clsArr2 = clsArr2;
            f79Var3 = f79Var4;
            cls3 = cls;
        }
        if (clsArr.length != z || (f79Var.e & f79.VALUE_MASK) == 0) {
            Constructor constructor3 = e62Var.i;
            if (constructor3 != null) {
                strArr3 = strArr2;
                g = n(constructor3, e62Var.j, strArr3);
            } else {
                strArr3 = strArr2;
                g = g(e62Var.k, strArr3);
            }
            g79[] g79VarArr2 = new g79[linkedHashMap.size()];
            linkedHashMap.values().toArray(g79VarArr2);
            Arrays.sort(g79VarArr2);
            g79[] m = m(cls, type, null, false, objectReaderProvider);
            Arrays.sort(m);
            boolean[] zArr = null;
            int i5 = 0;
            for (int i6 = 0; i6 < m.length; i6++) {
                if (linkedHashMap.containsKey(m[i6].b)) {
                    if (zArr == null) {
                        zArr = new boolean[m.length];
                    }
                    zArr[i6] = z;
                    i5++;
                }
            }
            if (i5 > 0) {
                g79[] g79VarArr3 = new g79[m.length - i5];
                for (int i7 = 0; i7 < m.length; i7++) {
                    if (!zArr[i7]) {
                        g79VarArr3[i] = m[i7];
                        i++;
                    }
                }
                g79VarArr = g79VarArr3;
            } else {
                g79VarArr = m;
            }
            return new wgk(cls, e62Var.f18305a, e62Var.b, e62Var.m, g, strArr3, g79VarArr2, g79VarArr, e62Var.f, e62Var.g);
        }
        if (e62Var.i == null) {
            type2 = e62Var.k.getGenericParameterTypes()[i];
        } else {
            type2 = genericParameterTypes[i];
        }
        Constructor constructor4 = e62Var.i;
        if (constructor4 == null) {
            cls2 = e62Var.k.getParameterTypes()[i];
        } else {
            cls2 = constructor4.getParameterTypes()[i];
        }
        Object obj = f79Var.k;
        if (!(obj == null || obj.getClass() == cls2)) {
            k2a M = JSONFactory.k().M(obj.getClass(), type2);
            if (M != null) {
                obj = M.apply(obj);
            } else {
                throw new JSONException("illegal defaultValue : " + obj + ", class " + cls2.getName());
            }
        }
        return new tgk(cls, type2, cls2, f79Var.e, f79Var.b, obj, e62Var.i, e62Var.k, null);
    }

    public <T> Supplier<T> y(Class<T> cls) {
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return new dk4(declaredConstructor);
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                throw new JSONException("get constructor error, class ".concat(cls.getName()), th);
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class a implements nk4 {

        /* renamed from: a  reason: collision with root package name */
        public final Class f27297a;
        public final Type b;
        public final String c;
        public final String[] d;
        public final e62 e;
        public final f79 f;
        public final Map<String, g79> g;
        public final ObjectReaderProvider h;

        public a(Class cls, Type type, String str, String[] strArr, e62 e62Var, f79 f79Var, Map<String, g79> map, ObjectReaderProvider objectReaderProvider) {
            this.f27297a = cls;
            this.b = type;
            this.c = str;
            this.d = strArr;
            this.e = e62Var;
            this.f = f79Var;
            this.g = map;
            this.h = objectReaderProvider;
        }

        @Override // tb.nk4
        public void accept(Object obj) {
            int i;
            char charAt;
            Method method = (Method) obj;
            f79 f79Var = this.f;
            f79Var.b();
            long j = f79Var.e;
            e62 e62Var = this.e;
            f79Var.e = j | e62Var.m;
            f79Var.b = e62Var.x;
            ObjectReaderProvider objectReaderProvider = this.h;
            Class cls = this.f27297a;
            objectReaderProvider.D(f79Var, cls, method);
            if (!f79Var.f) {
                String str = f79Var.f19065a;
                if (str == null) {
                    String name = method.getName();
                    boolean startsWith = name.startsWith("set", 0);
                    String str2 = this.c;
                    if (startsWith) {
                        str = BeanUtils.g0(name, str2);
                        if (f79Var.g == null) {
                            String substring = name.substring(3);
                            if (BeanUtils.v(cls, substring) != null) {
                                f79Var.g = new String[]{substring};
                            }
                        }
                    } else {
                        str = BeanUtils.L(method, e62Var.t, str2);
                    }
                    int length = str.length();
                    char charAt2 = length > 0 ? str.charAt(0) : (char) 0;
                    if ((length == 1 && charAt2 >= 'a' && charAt2 <= 'z') || (length > 2 && charAt2 >= 'A' && charAt2 <= 'Z' && (charAt = str.charAt(1)) >= 'A' && charAt <= 'Z')) {
                        char[] charArray = str.toCharArray();
                        if (length == 1) {
                            charArray[0] = (char) (charArray[0] - ' ');
                        } else {
                            charArray[0] = (char) (charArray[0] + ' ');
                        }
                        Field v = BeanUtils.v(cls, new String(charArray));
                        if (v != null) {
                            if (Modifier.isPublic(v.getModifiers())) {
                                str = v.getName();
                            } else if (length == 1) {
                                f79Var.g = new String[]{str};
                                str = v.getName();
                            }
                        }
                    }
                }
                String[] strArr = this.d;
                if (strArr != null && strArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < strArr.length) {
                            if (str.equals(strArr[i2])) {
                                f79Var.d = i2;
                                break;
                            }
                            i2++;
                        } else if (f79Var.d == 0) {
                            f79Var.d = strArr.length;
                        }
                    }
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length2 = parameterTypes.length;
                Map<String, g79> map = this.g;
                if (length2 == 0) {
                    g79 i3 = rdk.this.i(this.f27297a, this.b, str, f79Var.d, f79Var.e | f79.READ_ONLY, f79Var.b, f79Var.l, f79Var.k, method.getGenericReturnType(), method.getReturnType(), method, f79Var.a());
                    g79 g79Var = map.get(str);
                    if (g79Var == null) {
                        map.put(str, i3);
                    } else if (g79Var.compareTo(i3) > 0) {
                        map.put(str, i3);
                    }
                } else if (length2 == 2) {
                    Class<?> cls2 = parameterTypes[1];
                    Type type = method.getGenericParameterTypes()[1];
                    method.setAccessible(true);
                    map.put("$$any$$", new h79(type, cls2, f79Var.d, f79Var.e, f79Var.b, method));
                } else {
                    Class<?> cls3 = parameterTypes[0];
                    Class cls4 = (cls3.isPrimitive() || cls3 == String.class || cls3.isEnum()) ? cls3 : method.getGenericParameterTypes()[0];
                    if ((cls4 instanceof Class) && Collection.class.isAssignableFrom(cls4)) {
                        for (Class<?> cls5 : cls.getInterfaces()) {
                            Method H = BeanUtils.H(cls5, method);
                            if (H != null) {
                                Type[] genericParameterTypes = H.getGenericParameterTypes();
                                if (genericParameterTypes.length == 1) {
                                    Type type2 = genericParameterTypes[0];
                                    if (type2 instanceof ParameterizedType) {
                                        cls4 = type2;
                                    }
                                }
                            }
                        }
                    }
                    jdk z = rdk.z(objectReaderProvider, cls4, cls3, f79Var);
                    String str3 = str;
                    f79 f79Var2 = f79Var;
                    g79 i4 = rdk.this.i(this.f27297a, this.b, str, f79Var.d, f79Var.e, f79Var.b, f79Var.l, f79Var.k, cls4, cls3, method, z);
                    Map<String, g79> map2 = map;
                    g79 g79Var2 = map2.get(str3);
                    if (g79Var2 == null) {
                        map2.put(str3, i4);
                    } else if (g79Var2.compareTo(i4) > 0) {
                        map2.put(str3, i4);
                    }
                    String[] strArr2 = f79Var2.g;
                    if (strArr2 != null) {
                        int length3 = strArr2.length;
                        int i5 = 0;
                        while (i5 < length3) {
                            String str4 = strArr2[i5];
                            if (!str3.equals(str4) && map2.get(str4) == null) {
                                int i6 = f79Var2.d;
                                long j2 = f79Var2.e;
                                String str5 = f79Var2.b;
                                Locale locale = f79Var2.l;
                                String str6 = f79Var2.k;
                                str3 = str3;
                                i = i5;
                                length3 = length3;
                                strArr2 = strArr2;
                                f79Var2 = f79Var2;
                                map2 = map2;
                                map2.put(str4, rdk.this.i(this.f27297a, this.b, str4, i6, j2, str5, locale, str6, cls4, cls3, method, z));
                            } else {
                                str3 = str3;
                                i = i5;
                                length3 = length3;
                                strArr2 = strArr2;
                                f79Var2 = f79Var2;
                                map2 = map2;
                            }
                            i5 = i + 1;
                        }
                    }
                }
            }
        }
    }

    public <T> jdk<T> w(final Class<T> cls, final Type type, final ObjectReaderProvider objectReaderProvider, final e62 e62Var) {
        Method method = e62Var.d;
        k2a e = method != null ? e(method) : null;
        final Class<T> cls2 = e62Var.c;
        final String str = e62Var.e;
        if (str == null || str.isEmpty()) {
            str = pg1.ATOM_with;
        }
        final int length = str.length();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final f79 f79Var = new f79();
        BeanUtils.i0(cls2, false, new nk4() { // from class: tb.odk
            @Override // tb.nk4
            public final void accept(Object obj) {
                int i = length;
                Map map = linkedHashMap;
                rdk.this.C(f79Var, objectReaderProvider, cls, str, cls2, e62Var, i, map, type, (Method) obj);
            }
        });
        g79[] g79VarArr = new g79[linkedHashMap.size()];
        linkedHashMap.values().toArray(g79VarArr);
        Arrays.sort(g79VarArr);
        return q(cls2, 0L, y(cls2), e, g79VarArr);
    }
}
