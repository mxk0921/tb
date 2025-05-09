package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import tb.c0u;
import tb.e62;
import tb.f79;
import tb.hjk;
import tb.iik;
import tb.jik;
import tb.k2a;
import tb.kjk;
import tb.uh9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y1 {
    public static final y1 INSTANCE = new y1();

    public static void d(e62 e62Var, jik jikVar) {
        Class<? extends uh9>[] clsArr;
        for (Class<? extends uh9> cls : e62Var.w) {
            if (uh9.class.isAssignableFrom(cls)) {
                try {
                    jikVar.i((uh9) cls.newInstance());
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    public static String n(Class cls, e62 e62Var, f79 f79Var, Method method) {
        char c;
        char charAt;
        String str = f79Var.f19065a;
        if (str != null && !str.isEmpty()) {
            return f79Var.f19065a;
        }
        String L = BeanUtils.L(method, e62Var.t, e62Var.p);
        int length = L.length();
        if (length > 0) {
            c = L.charAt(0);
        } else {
            c = 0;
        }
        if ((length == 1 && c >= 'a' && c <= 'z') || (length > 2 && c >= 'A' && c <= 'Z' && (charAt = L.charAt(1)) >= 'A' && charAt <= 'Z')) {
            char[] charArray = L.toCharArray();
            if (c < 'a' || c > 'z') {
                charArray[0] = (char) (charArray[0] + ' ');
            } else {
                charArray[0] = (char) (charArray[0] - ' ');
            }
            Field v = BeanUtils.v(cls, new String(charArray));
            if (v != null && (length == 1 || Modifier.isPublic(v.getModifiers()))) {
                return v.getName();
            }
        }
        return L;
    }

    public <T, V> FieldWriter<T> f(z1 z1Var, Class<T> cls, String str, int i, long j, String str2, String str3, Type type, Class<V> cls2, Method method, k2a<T, V> k2aVar) {
        iik iikVar;
        if (cls2 == Byte.class) {
            return new q0(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == Short.class) {
            return new b0(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == Integer.class) {
            return new g0(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == Long.class) {
            return new l0(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == BigInteger.class) {
            return new e(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == BigDecimal.class) {
            return new b(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == String.class) {
            return new j1(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == Date.class) {
            return new p(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2 == UUID.class) {
            return new l1(str, i, j, str2, str3, type, cls2, method, k2aVar);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return new l(str, i, j, str2, str3, method, k2aVar);
        }
        if (cls2.isEnum()) {
            e62 e62Var = new e62();
            z1 z1Var2 = z1Var == null ? JSONFactory.defaultObjectWriterProvider : z1Var;
            z1Var2.e(e62Var, cls2);
            boolean z = e62Var.o;
            if (!z && (iikVar = (iik) ((ConcurrentHashMap) z1Var2.f2479a).get(cls2)) != null && !(iikVar instanceof kjk)) {
                z = true;
            }
            if (!z && BeanUtils.y(cls2, z1Var2) == null && BeanUtils.x(cls2) == null) {
                return new v(str, i, j, str2, str3, type, cls2, method, k2aVar);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                if (type2 == String.class) {
                    return new y0(str, i, j, str2, str3, method, k2aVar, type, cls2);
                }
                return new w0(str, i, j, str2, str3, type2, method, k2aVar, type, cls2);
            }
        }
        if (Modifier.isFinal(cls2.getModifiers())) {
            return new g1(str, i, j, str2, str3, type, cls2, method, k2aVar);
        }
        return new f1(str, i, j, str2, str3, type, cls2, method, k2aVar);
    }

    public <T, V> FieldWriter h(String str, Class cls, k2a<T, V> k2aVar) {
        return f(null, null, str, 0, 0L, null, null, cls, cls, null, k2aVar);
    }

    public <T> FieldWriter i(String str, c0u<T> c0uVar) {
        return new j0(str, 0, 0L, null, null, null, c0uVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.iik j(final java.lang.Class r20, long r21, final com.alibaba.fastjson2.writer.z1 r23) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.y1.j(java.lang.Class, long, com.alibaba.fastjson2.writer.z1):tb.iik");
    }

    public iik k(Class cls, long j, FieldWriter... fieldWriterArr) {
        if (fieldWriterArr.length == 0) {
            return j(cls, j, JSONFactory.defaultObjectWriterProvider);
        }
        if (cls != null) {
            String name = cls.getName();
            if ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(name)) {
                return new jik(cls, null, null, j, Arrays.asList(fieldWriterArr));
            }
        }
        switch (fieldWriterArr.length) {
            case 1:
                if ((fieldWriterArr[0].d & f79.VALUE_MASK) == 0) {
                    return new p1(cls, null, null, j, Arrays.asList(fieldWriterArr));
                }
                return new jik(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 2:
                return new q1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 3:
                return new r1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 4:
                return new s1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 5:
                return new t1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 6:
                return new u1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 7:
                return new v1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 8:
                return new w1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 9:
                return new x1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 10:
                return new m1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 11:
                return new n1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 12:
                return new o1(cls, null, null, j, Arrays.asList(fieldWriterArr));
            default:
                return new jik(cls, null, null, j, Arrays.asList(fieldWriterArr));
        }
    }

    public iik l(Class cls, FieldWriter... fieldWriterArr) {
        return k(cls, 0L, fieldWriterArr);
    }

    public FieldWriter m(Class cls, long j, z1 z1Var, e62 e62Var, f79 f79Var, Field field) {
        String str;
        String str2;
        String str3;
        String[] strArr;
        f79Var.e = j;
        z1Var.g(e62Var, f79Var, cls, field);
        iik iikVar = null;
        if (f79Var.f) {
            return null;
        }
        String str4 = f79Var.f19065a;
        if (str4 == null || str4.isEmpty()) {
            str = field.getName();
            String str5 = e62Var.p;
            if (str5 != null) {
                str = BeanUtils.s(str, str5);
            }
        } else {
            str = f79Var.f19065a;
        }
        if (e62Var.r != null) {
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = e62Var.r;
                if (i >= strArr.length) {
                    break;
                }
                if (str.equals(strArr[i])) {
                    f79Var.d = i;
                    z = true;
                }
                i++;
            }
            if (!z && f79Var.d == 0) {
                f79Var.d = strArr.length;
            }
        }
        String[] strArr2 = e62Var.s;
        if (strArr2 != null && strArr2.length > 0) {
            for (String str6 : strArr2) {
                if (!str6.equals(str)) {
                }
            }
            return null;
        }
        Class<?> cls2 = f79Var.h;
        if (cls2 != null) {
            try {
                Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                iikVar = (iik) declaredConstructor.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create writeUsing Writer error", e);
            }
        }
        try {
            field.setAccessible(true);
        } catch (Throwable unused) {
        }
        if (iikVar == null && f79Var.j) {
            iikVar = z1.a.INSTANCE;
        }
        if (iikVar == null) {
            Class<?> type = field.getType();
            if (type == Date.class) {
                iik iikVar2 = (iik) ((ConcurrentHashMap) z1Var.f2479a).get(type);
                if (iikVar2 != hjk.l) {
                    iikVar = iikVar2;
                }
            } else {
                Map.class.isAssignableFrom(type);
            }
        }
        String str7 = f79Var.b;
        if (str7 != null || (str3 = e62Var.x) == null) {
            str2 = str7;
        } else {
            str2 = str3;
        }
        return g(z1Var, str, f79Var.d, f79Var.e, str2, f79Var.c, field, iikVar);
    }

    public iik o(z1 z1Var, Class cls) {
        if (cls == Date.class) {
            z1Var.getClass();
            return null;
        } else if (cls == Long.TYPE || cls == Long.class) {
            z1Var.getClass();
            return null;
        } else if (cls == BigDecimal.class) {
            z1Var.getClass();
            return null;
        } else if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        } else {
            iik iikVar = (iik) ((ConcurrentHashMap) z1Var.f2479a).get(cls);
            if (!(iikVar instanceof kjk)) {
                return iikVar;
            }
            return null;
        }
    }

    public void p(e62 e62Var, List<FieldWriter> list) {
        String[] strArr = e62Var.q;
        if (!(strArr == null || strArr.length == 0)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                FieldWriter fieldWriter = list.get(size);
                String[] strArr2 = e62Var.q;
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr2[i].equals(fieldWriter.f2478a)) {
                        list.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final /* synthetic */ void q(f79 f79Var, Class cls, long j, z1 z1Var, e62 e62Var, Map map, Field field) {
        f79Var.b();
        FieldWriter m = m(cls, j, z1Var, e62Var, f79Var, field);
        if (m != null) {
            map.put(m.f2478a, m);
        }
    }

    public final /* synthetic */ void r(f79 f79Var, Class cls, long j, z1 z1Var, e62 e62Var, Map map, Field field) {
        f79Var.b();
        boolean z = true;
        if ((field.getModifiers() & 1) != 0) {
            z = false;
        }
        f79Var.f = z;
        FieldWriter m = m(cls, j, z1Var, e62Var, f79Var, field);
        if (m != null) {
            FieldWriter fieldWriter = (FieldWriter) map.get(m.f2478a);
            if (fieldWriter == null) {
                map.put(m.f2478a, m);
            }
            if (fieldWriter != null && fieldWriter.compareTo(m) > 0) {
                map.put(m.f2478a, m);
            }
        }
    }

    public final /* synthetic */ void s(f79 f79Var, long j, e62 e62Var, z1 z1Var, Class cls, Map map, Method method) {
        iik iikVar;
        String[] strArr;
        f79Var.b();
        f79Var.e = j;
        f79Var.b = e62Var.x;
        z1Var.h(e62Var, f79Var, cls, method);
        if (!f79Var.f) {
            String n = n(cls, e62Var, f79Var, method);
            String[] strArr2 = e62Var.s;
            if (strArr2 != null && strArr2.length > 0) {
                for (String str : strArr2) {
                    if (!str.equals(n)) {
                    }
                }
                return;
            }
            if ((e62Var.n & JSONWriter.Feature.WriteClassName.mask) == 0 || !n.equals(e62Var.f18305a)) {
                if (e62Var.r != null) {
                    int i = 0;
                    boolean z = false;
                    while (true) {
                        strArr = e62Var.r;
                        if (i >= strArr.length) {
                            break;
                        }
                        if (n.equals(strArr[i])) {
                            f79Var.d = i;
                            z = true;
                        }
                        i++;
                    }
                    if (!z && f79Var.d == 0) {
                        f79Var.d = strArr.length;
                    }
                }
                Class<?> cls2 = f79Var.h;
                if (cls2 != null) {
                    try {
                        Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        iikVar = (iik) declaredConstructor.newInstance(new Object[0]);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        throw new JSONException("create writeUsing Writer error", e);
                    }
                } else {
                    iikVar = null;
                }
                if (iikVar == null && f79Var.j) {
                    iikVar = z1.a.INSTANCE;
                }
                FieldWriter e2 = e(z1Var, cls, n, f79Var.d, f79Var.e, f79Var.b, f79Var.c, method, iikVar);
                FieldWriter fieldWriter = (FieldWriter) map.get(e2.f2478a);
                if (fieldWriter == null) {
                    map.put(e2.f2478a, e2);
                }
                if (fieldWriter != null && fieldWriter.compareTo(e2) > 0) {
                    map.put(n, e2);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(3:138|4|(9:6|(2:8|(1:10))|12|14|136|15|16|(1:21)(1:20)|(3:23|(1:25)|26)(4:27|(1:29)(1:30)|31|(2:134|135)(2:35|(2:132|133)(2:39|(2:130|131)(2:43|(2:128|129)(2:47|(1:(2:126|127)(2:124|125))(2:51|(2:117|118)(2:55|(2:115|116)(2:59|(2:113|114)(2:63|(2:65|66)(2:67|(2:77|(3:(2:80|(1:82)(1:83))(1:84)|85|86)(2:87|(2:89|90)(2:91|(4:93|(1:95)(1:96)|97|98)(2:99|(2:101|102)(2:103|(2:105|106)(2:107|(2:109|110)(2:111|112)))))))(2:75|76)))))))))))))|13|14|136|15|16|(0)|21|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> e(com.alibaba.fastjson2.writer.z1 r16, java.lang.Class<T> r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.lang.String r23, java.lang.reflect.Method r24, tb.iik r25) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.y1.e(com.alibaba.fastjson2.writer.z1, java.lang.Class, java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.reflect.Method, tb.iik):com.alibaba.fastjson2.writer.FieldWriter");
    }

    public <T> FieldWriter<T> g(z1 z1Var, String str, int i, long j, String str2, String str3, Field field, iik iikVar) {
        iik iikVar2;
        Type type = null;
        Method G = (field.getDeclaringClass() != Throwable.class || !field.getName().equals("stackTrace")) ? null : BeanUtils.G(Throwable.class, "getStackTrace");
        if (G != null) {
            return e(z1Var, Throwable.class, str, i, j, str2, str3, G, iikVar);
        }
        Class<?> type2 = field.getType();
        Type genericType = field.getGenericType();
        if (iikVar != null) {
            FieldWriterObject fieldWriterObject = new FieldWriterObject(str, i, j, str2, str3, genericType, type2, field, null);
            fieldWriterObject.z = type2;
            if (iikVar != z1.a.INSTANCE) {
                fieldWriterObject.x = iikVar;
            }
            return fieldWriterObject;
        } else if (type2 == Boolean.TYPE) {
            return new h(str, i, j, str2, str3, field, type2);
        } else {
            if (type2 == Byte.TYPE) {
                return new s0(str, i, j, str2, str3, field);
            }
            if (type2 == Short.TYPE) {
                return new d0(str, i, j, str2, str3, field);
            }
            if (type2 == Integer.TYPE) {
                return new i0(str, i, j, str2, str3, field);
            }
            if (type2 == Long.TYPE) {
                if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
                    return new n0(str, i, j, str2, str3, field);
                }
                return new z0(str, i, j, str2, str3, field);
            } else if (type2 == Float.TYPE) {
                return new z(str, i, j, str2, str3, field);
            } else {
                if (type2 == Float.class) {
                    return new x(str, i, j, str2, str3, field);
                }
                if (type2 == Double.TYPE) {
                    return new t(str, i, str2, str3, field);
                }
                if (type2 == Double.class) {
                    return new r(str, i, j, str2, str3, field);
                }
                if (type2 == Character.TYPE) {
                    return new n(str, i, j, str2, str3, field);
                }
                if (type2 == BigInteger.class) {
                    return new d(str, i, j, str2, str3, field);
                }
                if (type2 == BigDecimal.class) {
                    return new a(str, i, j, str2, str3, field);
                }
                if (type2 == Date.class) {
                    return new o(str, i, j, str2, str3, field);
                }
                if (type2 == String.class) {
                    return new i1(str, i, j, str2, str3, field);
                }
                if (type2.isEnum()) {
                    e62 e62Var = new e62();
                    z1Var.e(e62Var, type2);
                    boolean z = e62Var.o;
                    if (!z && (iikVar2 = (iik) ((ConcurrentHashMap) z1Var.f2479a).get(type2)) != null && !(iikVar2 instanceof kjk)) {
                        z = true;
                    }
                    if (BeanUtils.y(type2, z1Var) == null && !z && BeanUtils.x(type2) == null) {
                        return new u(str, i, j, str2, str3, genericType, type2, field, null);
                    }
                }
                if (type2 == List.class || type2 == ArrayList.class) {
                    if (genericType instanceof ParameterizedType) {
                        type = ((ParameterizedType) genericType).getActualTypeArguments()[0];
                    }
                    return new v0(str, type, i, j, str2, str3, genericType, type2, field);
                } else if (!type2.isArray() || type2.getComponentType().isPrimitive()) {
                    return new FieldWriterObject(str, i, j, str2, str3, field.getGenericType(), type2, field, null);
                } else {
                    Class<?> componentType = type2.getComponentType();
                    return new c1(str, componentType, i, j, str2, str3, componentType, type2, field);
                }
            }
        }
    }
}
