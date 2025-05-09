package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.n;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.z1;
import com.taobao.media.MediaConstant;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.KParameter;
import tb.e62;
import tb.f79;
import tb.nk4;
import tb.oij;
import tb.pg1;
import tb.zyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BeanUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<char[]> f2472a = new AtomicReference<>();
    public static final oij[] b = new oij[2048];
    public static final Type[] c = new Type[0];
    public static final ConcurrentMap<Class, Field[]> d = new ConcurrentHashMap();
    public static final ConcurrentMap<Class, Map<String, Field>> e = new ConcurrentHashMap();
    public static final ConcurrentMap<Class, Field[]> f = new ConcurrentHashMap();
    public static final ConcurrentMap<Class, Method[]> g = new ConcurrentHashMap();
    public static final ConcurrentMap<Class, Constructor[]> h = new ConcurrentHashMap();
    public static volatile boolean i;
    public static volatile Constructor<?> j;
    public static volatile Method k;
    public static volatile Method l;
    public static volatile Method m;
    public static volatile boolean n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = BeanUtils.h(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !BeanUtils.r(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return BeanUtils.n0(this.componentType) + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                BeanUtils.i(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = BeanUtils.h(type);
            }
            this.ownerType = type3;
            this.rawType = BeanUtils.h(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                BeanUtils.j(this.typeArguments[i]);
                BeanUtils.k(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = BeanUtils.h(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !BeanUtils.r(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ BeanUtils.P(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return BeanUtils.n0(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(BeanUtils.n0(this.rawType));
            sb.append("<");
            sb.append(BeanUtils.n0(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(BeanUtils.n0(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            BeanUtils.i(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            BeanUtils.i(z2);
            if (typeArr2.length == 1) {
                BeanUtils.j(typeArr2[0]);
                BeanUtils.k(typeArr2[0]);
                BeanUtils.i(typeArr[0] != Object.class ? false : z3);
                this.lowerBound = BeanUtils.h(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            BeanUtils.j(typeArr[0]);
            BeanUtils.k(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = BeanUtils.h(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !BeanUtils.r(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : BeanUtils.c;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            int i;
            Type type = this.lowerBound;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + BeanUtils.n0(this.lowerBound);
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                return "? extends " + BeanUtils.n0(this.upperBound);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field A(java.lang.Class r14, java.lang.reflect.Method r15) {
        /*
            java.lang.String r5 = r15.getName()
            int r1 = r5.length()
            java.lang.Class r0 = r15.getReturnType()
            r2 = 3
            r7 = 1
            r8 = 0
            r3 = 2
            if (r1 <= r3) goto L_0x005c
            char r4 = r5.charAt(r8)
            char r6 = r5.charAt(r7)
            char r9 = r5.charAt(r3)
            r10 = 105(0x69, float:1.47E-43)
            r11 = 115(0x73, float:1.61E-43)
            if (r4 != r10) goto L_0x0032
            if (r6 != r11) goto L_0x0032
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r0 == r4) goto L_0x002e
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r0 != r4) goto L_0x005c
        L_0x002e:
            r4 = 1
        L_0x002f:
            r6 = 0
        L_0x0030:
            r9 = 0
            goto L_0x005e
        L_0x0032:
            r10 = 103(0x67, float:1.44E-43)
            r12 = 116(0x74, float:1.63E-43)
            r13 = 101(0x65, float:1.42E-43)
            if (r4 != r10) goto L_0x0046
            if (r6 != r13) goto L_0x0046
            if (r9 != r12) goto L_0x0046
            if (r1 <= r2) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            r6 = r4
            r4 = 0
            goto L_0x0030
        L_0x0046:
            if (r4 != r11) goto L_0x005c
            if (r6 != r13) goto L_0x005c
            if (r9 != r12) goto L_0x005c
            if (r1 <= r2) goto L_0x0057
            java.lang.Class[] r4 = r15.getParameterTypes()
            int r4 = r4.length
            if (r4 != r7) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            r9 = r4
            r4 = 0
            r6 = 0
            goto L_0x005e
        L_0x005c:
            r4 = 0
            goto L_0x002f
        L_0x005e:
            java.lang.reflect.Field[] r10 = new java.lang.reflect.Field[r3]
            if (r4 != 0) goto L_0x0066
            if (r6 != 0) goto L_0x0066
            if (r9 == 0) goto L_0x008a
        L_0x0066:
            if (r4 != 0) goto L_0x0072
            if (r6 == 0) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            java.lang.Class[] r15 = r15.getParameterTypes()
            r15 = r15[r8]
            goto L_0x0073
        L_0x0072:
            r15 = r0
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            r2 = 2
        L_0x0076:
            int r0 = r1 - r2
            char[] r0 = new char[r0]
            r5.getChars(r2, r1, r0, r8)
            char r4 = r0[r8]
            tb.g62 r9 = new tb.g62
            r0 = r9
            r3 = r15
            r6 = r10
            r0.<init>()
            n(r14, r9)
        L_0x008a:
            r14 = r10[r8]
            if (r14 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r14 = r10[r7]
        L_0x0091:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.A(java.lang.Class, java.lang.reflect.Method):java.lang.reflect.Field");
    }

    public static void B(Class cls, f79 f79Var, ObjectReaderProvider objectReaderProvider, String str, String str2, String str3) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f;
        Field[] fieldArr = (Field[]) concurrentHashMap.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getDeclaredFields();
            concurrentHashMap.put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            int modifiers = field.getModifiers();
            if ((modifiers & 8) == 0) {
                if ((modifiers & 1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String name = field.getName();
                if (name.equals(str)) {
                    if (z) {
                        objectReaderProvider.C(f79Var, cls, field);
                    }
                    f79Var.e |= f79.FIELD_MASK;
                } else if (name.equals(str2)) {
                    if (z) {
                        objectReaderProvider.C(f79Var, cls, field);
                    }
                    f79Var.e |= f79.FIELD_MASK;
                } else if (name.equals(str3)) {
                    if (z) {
                        objectReaderProvider.C(f79Var, cls, field);
                    }
                    f79Var.e |= f79.FIELD_MASK;
                }
            }
        }
    }

    public static Type C(n nVar, Class<?> cls, Member member, Type type) {
        Class<?> cls2;
        Type type2;
        if (member == null) {
            cls2 = null;
        } else {
            cls2 = member.getDeclaringClass();
        }
        while (cls != Object.class) {
            if (nVar == null) {
                type2 = null;
            } else {
                type2 = nVar.c();
            }
            if (cls2 == cls) {
                return c0(type2, cls2, type, new HashMap());
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            nVar = n.a(c0(type2, cls, genericSuperclass, new HashMap()));
            cls = nVar.b();
        }
        return null;
    }

    public static Type D(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return D(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (cls != null && !cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return D(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static String[] F(Class<?> cls) {
        if (j == null && !i) {
            try {
                j = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                i = true;
            }
        }
        if (j == null) {
            return null;
        }
        if (k == null && !i) {
            try {
                k = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            } catch (Throwable unused2) {
                i = true;
            }
        }
        if (l == null && !i) {
            try {
                l = zyf.class.getMethod("getParameters", new Class[0]);
            } catch (Throwable unused3) {
                i = true;
            }
        }
        if (m == null && !i) {
            try {
                m = KParameter.class.getMethod("getName", new Class[0]);
            } catch (Throwable unused4) {
                i = true;
            }
        }
        if (n) {
            return null;
        }
        try {
            Iterator it = ((Iterable) k.invoke(j.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) l.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) l.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                strArr[i2] = (String) m.invoke(list2.get(i2), new Object[0]);
            }
            return strArr;
        } catch (Throwable unused5) {
            n = true;
            return null;
        }
    }

    public static Method G(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = g;
        Method[] methodArr = (Method[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            ((ConcurrentHashMap) concurrentMap).put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Method H(Class cls, Method method) {
        if (!(cls == null || cls == Object.class || cls == Serializable.class)) {
            ConcurrentMap<Class, Method[]> concurrentMap = g;
            Method[] methodArr = (Method[]) ((ConcurrentHashMap) concurrentMap).get(cls);
            if (methodArr == null) {
                methodArr = cls.getMethods();
                ((ConcurrentHashMap) concurrentMap).put(cls, methodArr);
            }
            for (Method method2 : methodArr) {
                if (method2.getName().equals(method.getName()) && method2.getParameterTypes().length == method.getParameterTypes().length) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        if (!parameterTypes[i2].equals(parameterTypes2[i2])) {
                            break;
                        }
                    }
                    return method2;
                }
            }
        }
        return null;
    }

    public static Type I(n nVar, Class<?> cls, Class cls2, Type type) {
        while (cls != Object.class) {
            if (cls2 == cls) {
                return c0(nVar.c(), cls2, type, new HashMap());
            }
            nVar = n.a(c0(nVar.c(), cls, cls.getGenericSuperclass(), new HashMap()));
            cls = nVar.b();
        }
        return null;
    }

    public static Class<?> J(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            i(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(J(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return J(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    public static String K(String str, String str2) {
        String str3;
        int i2;
        boolean z;
        char c2;
        int i3 = 2;
        if (str2 == null) {
            str3 = "CamelCase";
        } else {
            str3 = str2;
        }
        int length = str.length();
        boolean startsWith = str.startsWith("is", 0);
        boolean startsWith2 = str.startsWith("get", 0);
        if (startsWith) {
            i2 = 2;
        } else if (startsWith2) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        if (length == i2) {
            return str;
        }
        char c3 = 65535;
        switch (str3.hashCode()) {
            case -2068429102:
                if (str3.equals("UpperCase")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1863045342:
                if (str3.equals("UpperCaseWithDots")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1112704575:
                if (str3.equals("NeverUseThisValueExceptDefaultValue")) {
                    c3 = 2;
                    break;
                }
                break;
            case 601822360:
                if (str3.equals("UpperCaseWithDashes")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1336502620:
                if (str3.equals("PascalCase")) {
                    c3 = 4;
                    break;
                }
                break;
            case 1371349591:
                if (str3.equals("UpperCamelCaseWithSpaces")) {
                    c3 = 5;
                    break;
                }
                break;
            case 1460726553:
                if (str3.equals("KebabCase")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1655544038:
                if (str3.equals("CamelCase")) {
                    c3 = 7;
                    break;
                }
                break;
            case 1839922637:
                if (str3.equals("CamelCase1x")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 1976554305:
                if (str3.equals("UpperCaseWithUnderScores")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 2087942256:
                if (str3.equals("SnakeCase")) {
                    c3 = '\n';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return str.substring(i2).toUpperCase();
            case 1:
                return p(str, i2, true);
            case 2:
            case 7:
                int i4 = length - i2;
                AtomicReference<char[]> atomicReference = f2472a;
                char[] andSet = atomicReference.getAndSet(null);
                if (andSet == null || andSet.length < i4) {
                    andSet = new char[Math.max(32, i4)];
                }
                try {
                    str.getChars(i2, length, andSet, 0);
                    char c4 = andSet[0];
                    if (andSet.length <= 1 || (c2 = andSet[1]) < 'A' || c2 > 'Z') {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (c4 >= 'A' && c4 <= 'Z' && !z) {
                        andSet[0] = (char) (c4 + ' ');
                    }
                    if (i4 <= 8) {
                        long j2 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                char c5 = andSet[i5];
                                if (c5 > 128) {
                                    j2 = 0;
                                } else {
                                    j2 = (j2 << 8) + c5;
                                    i5++;
                                }
                            }
                        }
                        if (j2 != 0) {
                            oij[] oijVarArr = b;
                            int length2 = ((int) j2) & (oijVarArr.length - 1);
                            oij oijVar = oijVarArr[length2];
                            if (oijVar == null) {
                                String str4 = new String(andSet, 0, i4);
                                oijVarArr[length2] = new oij(str4, j2);
                                atomicReference.set(andSet);
                                return str4;
                            } else if (oijVar.b == j2) {
                                String str5 = oijVar.f25409a;
                                atomicReference.set(andSet);
                                return str5;
                            }
                        }
                    }
                    String str6 = new String(andSet, 0, i4);
                    atomicReference.set(andSet);
                    return str6;
                } catch (Throwable th) {
                    atomicReference.set(andSet);
                    throw th;
                }
            case 3:
                return m(str, i2, true);
            case 4:
                return a0(str, length, i2);
            case 5:
                return p0(str, i2, ' ');
            case 6:
                if (!startsWith) {
                    if (startsWith2) {
                        i3 = 3;
                    } else {
                        i3 = 0;
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int i6 = i3; i6 < str.length(); i6++) {
                    char charAt = str.charAt(i6);
                    if (charAt >= 'A' && charAt <= 'Z') {
                        charAt = (char) (charAt + ' ');
                        if (i6 > i3) {
                            sb.append('-');
                        }
                    }
                    sb.append(charAt);
                }
                return sb.toString();
            case '\b':
                char[] cArr = new char[length - i2];
                str.getChars(i2, length, cArr, 0);
                char c6 = cArr[0];
                if (c6 >= 'A' && c6 <= 'Z') {
                    cArr[0] = (char) (c6 + ' ');
                }
                return new String(cArr);
            case '\t':
                return o0(str, i2, true);
            case '\n':
                return j0(str, i2);
            default:
                throw new JSONException("TODO : ".concat(str3));
        }
    }

    public static String L(Method method, boolean z, String str) {
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z)) {
            return name;
        }
        String K = K(name, str);
        if (K.length() <= 2 || K.charAt(0) < 'A' || K.charAt(0) > 'Z' || K.charAt(1) < 'A' || K.charAt(1) > 'Z') {
            return K;
        }
        char[] charArray = K.toCharArray();
        charArray[0] = (char) (charArray[0] + ' ');
        Field v = v(method.getDeclaringClass(), new String(charArray));
        if (v == null || !Modifier.isPublic(v.getModifiers())) {
            return K;
        }
        return v.getName();
    }

    public static void M(Class cls, Class cls2, nk4<Method> nk4Var) {
        N(cls, cls2, false, nk4Var);
    }

    public static void O(Class cls, nk4<Method> nk4Var) {
        M(cls, null, nk4Var);
    }

    public static int P(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int Q(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean R(AnnotatedElement annotatedElement) {
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            String name = annotation.annotationType().getName();
            if (name.equals("com.alibaba.fastjson.annotation.JSONField") || name.equals("com.alibaba.fastjson2.annotation.JSONField")) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(Class cls, Class cls2) {
        Class<?> enclosingClass = cls2.getEnclosingClass();
        if (enclosingClass == null || (cls != null && !cls.equals(enclosingClass))) {
            return false;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = h;
        Constructor<?>[] constructorArr = (Constructor[]) ((ConcurrentHashMap) concurrentMap).get(cls2);
        if (constructorArr == null) {
            constructorArr = cls2.getDeclaredConstructors();
            ((ConcurrentHashMap) concurrentMap).put(cls2, constructorArr);
        }
        if (constructorArr.length == 0) {
            return false;
        }
        Class<?>[] parameterTypes = constructorArr[0].getParameterTypes();
        if (parameterTypes.length == 0) {
            return false;
        }
        return enclosingClass.equals(parameterTypes[0]);
    }

    public static boolean T(Class cls) {
        Annotation[] declaredAnnotations;
        for (final Annotation annotation : cls.getDeclaredAnnotations()) {
            JSONType jSONType = (JSONType) t(annotation, JSONType.class);
            if (jSONType != null) {
                return jSONType.writeEnumAsJavaBean();
            }
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if ("com.alibaba.fastjson.annotation.JSONType".equals(annotationType.getName())) {
                final e62 e62Var = new e62();
                e(annotationType, new nk4() { // from class: tb.f62
                    @Override // tb.nk4
                    public final void accept(Object obj) {
                        BeanUtils.b0(e62.this, annotation, (Method) obj);
                    }
                });
                if (e62Var.o) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void U(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && R(method2)) {
            atomicReference.set(method);
        }
    }

    public static /* synthetic */ void V(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && R(method2)) {
            atomicReference.set(method);
        }
    }

    public static /* synthetic */ void W(int i2, int i3, Class cls, char c2, String str, Field[] fieldArr, Field field) {
        String name = field.getName();
        int length = name.length();
        if (length != i2 - i3) {
            return;
        }
        if (field.getType() != cls && !cls.isAssignableFrom(field.getType())) {
            return;
        }
        if (c2 >= 'A' && c2 <= 'Z' && c2 + ' ' == name.charAt(0) && name.regionMatches(1, str, i3 + 1, length - 1)) {
            fieldArr[0] = field;
        } else if (name.regionMatches(0, str, i3, length)) {
            fieldArr[1] = field;
        }
    }

    public static String[] Y(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (Throwable.class.isAssignableFrom(declaringClass)) {
            int length = parameterTypes.length;
            if (length == 1) {
                Class<?> cls = parameterTypes[0];
                if (cls == String.class) {
                    return new String[]{"message"};
                }
                if (Throwable.class.isAssignableFrom(cls)) {
                    return new String[]{"cause"};
                }
            } else if (length == 2 && parameterTypes[0] == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                return new String[]{"message", "cause"};
            }
        }
        int length2 = parameterTypes.length;
        String[] strArr = new String[length2];
        if (length2 > 0 && parameterTypes[0] == declaringClass.getDeclaringClass() && !Modifier.isStatic(declaringClass.getModifiers())) {
            strArr[0] = "this.$0";
        }
        return strArr;
    }

    public static ParameterizedType Z(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static String a0(String str, int i2, int i3) {
        char c2;
        char c3;
        int i4 = i2 - i3;
        char[] cArr = new char[i4];
        str.getChars(i3, i2, cArr, 0);
        char c4 = cArr[0];
        if (c4 >= 'a' && c4 <= 'z' && i4 > 1) {
            cArr[0] = (char) (c4 - ' ');
        } else if (c4 == '_' && i4 > 2 && (c2 = cArr[1]) >= 'a' && c2 <= 'z' && (c3 = cArr[2]) >= 'a' && c3 <= 'z') {
            cArr[1] = (char) (c2 - ' ');
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
        if (r0 == null) goto L_0x00e8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type c0(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.c0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static Type d0(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> o = o(typeVariable);
        if (o == null) {
            return typeVariable;
        }
        Type D = D(type, cls, o);
        if (!(D instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) D).getActualTypeArguments()[Q(o.getTypeParameters(), typeVariable)];
    }

    public static GenericArrayType f(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static String f0(String str, int i2) {
        char c2;
        int length = str.length();
        int i3 = length - i2;
        char[] cArr = new char[i3];
        str.getChars(i2, length, cArr, 0);
        char c3 = cArr[0];
        boolean z = true;
        if (i3 <= 1 || (c2 = cArr[1]) < 'A' || c2 > 'Z') {
            z = false;
        }
        if (c3 >= 'A' && c3 <= 'Z' && !z) {
            cArr[0] = (char) (c3 + ' ');
        }
        return new String(cArr);
    }

    public static Method g(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = g;
        Method[] methodArr = (Method[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            ((ConcurrentHashMap) concurrentMap).put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Type h(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new GenericArrayTypeImpl(h(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void i0(Class cls, boolean z, nk4<Method> nk4Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
        Method[] methodArr = (Method[]) concurrentHashMap.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            concurrentHashMap.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            int length = method.getParameterTypes().length;
            if (length == 0) {
                String name = method.getName();
                if (!z || (name.length() > 3 && name.startsWith("get", 0))) {
                    Class<?> returnType = method.getReturnType();
                    if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || Collection.class.isAssignableFrom(returnType)) {
                        nk4Var.accept(method);
                    }
                }
            }
            if (length == 1 && !Modifier.isStatic(method.getModifiers())) {
                String name2 = method.getName();
                int length2 = name2.length();
                if (!z || (length2 > 3 && name2.startsWith("set", 0))) {
                    nk4Var.accept(method);
                }
            }
        }
    }

    public static <T> T j(T t) {
        t.getClass();
        return t;
    }

    public static String j0(String str, int i2) {
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i3 = i2;
        int i4 = 0;
        while (i3 < length) {
            try {
                char charAt = str.charAt(i3);
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                    if (i3 > i2) {
                        andSet[i4] = '_';
                        i4++;
                    }
                }
                andSet[i4] = charAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                TypeUtils.e.set(TypeUtils.d, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i4);
        TypeUtils.e.set(TypeUtils.d, andSet);
        return str2;
    }

    public static void k(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        i(z);
    }

    public static void k0(Class cls, nk4<Method> nk4Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
        Method[] methodArr = (Method[]) concurrentHashMap.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            concurrentHashMap.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (Modifier.isStatic(method.getModifiers())) {
                nk4Var.accept(method);
            }
        }
    }

    public static void l(Class cls, nk4<Constructor> nk4Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h;
        Constructor<?>[] constructorArr = (Constructor[]) concurrentHashMap.get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            concurrentHashMap.put(cls, constructorArr);
        }
        for (Constructor<?> constructor : constructorArr) {
            nk4Var.accept(constructor);
        }
    }

    public static WildcardType l0(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new WildcardTypeImpl(typeArr, c);
    }

    public static String m(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt < 'A' || charAt > 'Z') {
                        if (charAt >= 'a' && charAt <= 'z') {
                            i3 = charAt - ' ';
                            charAt = (char) i3;
                        }
                    } else if (i4 > i2) {
                        andSet[i5] = '-';
                        i5++;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                } else {
                    if (charAt >= 'A' && charAt <= 'Z') {
                        if (i4 > i2) {
                            andSet[i5] = '-';
                            i5++;
                        }
                        i3 = charAt + ' ';
                        charAt = (char) i3;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                }
            } catch (Throwable th) {
                TypeUtils.e.set(TypeUtils.d, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i5);
        TypeUtils.e.set(TypeUtils.d, andSet);
        return str2;
    }

    public static WildcardType m0(Type type) {
        Type[] typeArr;
        Type[] typeArr2 = {Object.class};
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new WildcardTypeImpl(typeArr2, typeArr);
    }

    public static void n(Class cls, nk4<Field> nk4Var) {
        boolean z;
        if (!(cls == null || nk4Var == null)) {
            Class superclass = cls.getSuperclass();
            if (superclass == null || superclass == Object.class) {
                z = false;
            } else {
                z = superclass.getName().equals("com.google.protobuf.GeneratedMessageV3");
                if (!z) {
                    n(superclass, nk4Var);
                }
            }
            ConcurrentMap<Class, Field[]> concurrentMap = f;
            Field[] fieldArr = (Field[]) ((ConcurrentHashMap) concurrentMap).get(cls);
            if (fieldArr == null) {
                try {
                    fieldArr = cls.getDeclaredFields();
                    ((ConcurrentHashMap) concurrentMap).put(cls, fieldArr);
                } catch (Throwable unused) {
                    fieldArr = new Field[0];
                }
                int length = fieldArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                        ArrayList arrayList = new ArrayList(fieldArr.length);
                        for (Field field : fieldArr) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                arrayList.add(field);
                            }
                        }
                        fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    } else {
                        i2++;
                    }
                }
                ((ConcurrentHashMap) d).put(cls, fieldArr);
            }
            for (Field field2 : fieldArr) {
                if ((field2.getModifiers() & 8) == 0) {
                    if (z) {
                        String name = field2.getName();
                        Class<?> type = field2.getType();
                        if ("cardsmap_".equals(name) && type.getName().equals("com.google.protobuf.MapField")) {
                            return;
                        }
                    }
                    Class<?> declaringClass = field2.getDeclaringClass();
                    if (!(declaringClass == AbstractMap.class || declaringClass == HashMap.class || declaringClass == LinkedHashMap.class || declaringClass == TreeMap.class || declaringClass == ConcurrentHashMap.class)) {
                        nk4Var.accept(field2);
                    }
                }
            }
        }
    }

    public static String n0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static Class<?> o(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static String o0(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt >= 'A' && charAt <= 'Z') {
                        if (i4 > i2) {
                            andSet[i5] = '_';
                            i5++;
                        }
                        andSet[i5] = charAt;
                        i4++;
                        i5++;
                    }
                    if (charAt >= 'a' && charAt <= 'z') {
                        i3 = charAt - ' ';
                        charAt = (char) i3;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                } else {
                    if (charAt >= 'A' && charAt <= 'Z') {
                        if (i4 > i2) {
                            andSet[i5] = '_';
                            i5++;
                        }
                        i3 = charAt + ' ';
                        charAt = (char) i3;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                }
            } catch (Throwable th) {
                TypeUtils.e.set(TypeUtils.d, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i5);
        TypeUtils.e.set(TypeUtils.d, andSet);
        return str2;
    }

    public static String p(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt < 'A' || charAt > 'Z') {
                        if (charAt >= 'a' && charAt <= 'z') {
                            i3 = charAt - ' ';
                            charAt = (char) i3;
                        }
                    } else if (i4 > i2) {
                        andSet[i5] = '.';
                        i5++;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                } else {
                    if (charAt >= 'A' && charAt <= 'Z') {
                        if (i4 > i2) {
                            andSet[i5] = '.';
                            i5++;
                        }
                        i3 = charAt + ' ';
                        charAt = (char) i3;
                    }
                    andSet[i5] = charAt;
                    i4++;
                    i5++;
                }
            } catch (Throwable th) {
                TypeUtils.e.set(TypeUtils.d, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i5);
        TypeUtils.e.set(TypeUtils.d, andSet);
        return str2;
    }

    public static String p0(String str, int i2, char c2) {
        int i3;
        char charAt;
        char charAt2;
        int i4;
        int i5;
        char charAt3;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i8 = i2;
        int i9 = 0;
        while (i8 < length) {
            try {
                char charAt6 = str.charAt(i8);
                if (i8 == i2) {
                    if (charAt6 >= 'a' && charAt6 <= 'z' && (i7 = i8 + 1) < length && (charAt5 = str.charAt(i7)) >= 'a' && charAt5 <= 'z') {
                        charAt6 = (char) (charAt6 - ' ');
                    } else if (charAt6 == '_' && (i6 = i8 + 1) < length && (charAt4 = str.charAt(i6)) >= 'a' && charAt4 <= 'z') {
                        andSet[i9] = charAt6;
                        charAt6 = (char) (charAt4 - ' ');
                        i9++;
                        i8 = i6;
                    }
                } else if (charAt6 < 'A' || charAt6 > 'Z' || (i5 = i8 + 1) >= length || ((charAt3 = str.charAt(i5)) >= 'A' && charAt3 <= 'Z')) {
                    if (charAt6 >= 'A' && charAt6 <= 'Z' && i8 > i2 && (i3 = i8 + 1) < length && (charAt = str.charAt(i3)) >= 'A' && charAt <= 'Z' && (charAt2 = str.charAt(i8 - 1)) >= 'a' && charAt2 <= 'z') {
                        i4 = i9 + 1;
                        andSet[i9] = c2;
                        i9 = i4;
                    }
                } else if (i8 > i2) {
                    i4 = i9 + 1;
                    andSet[i9] = c2;
                    i9 = i4;
                }
                andSet[i9] = charAt6;
                i8++;
                i9++;
            } catch (Throwable th) {
                TypeUtils.e.set(TypeUtils.d, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i9);
        TypeUtils.e.set(TypeUtils.d, andSet);
        return str2;
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static boolean r(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!q(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return r(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static String s(String str, String str2) {
        char c2;
        char charAt;
        char charAt2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        char c3 = 65535;
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1863045342:
                if (str2.equals("UpperCaseWithDots")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    c3 = 2;
                    break;
                }
                break;
            case -46641534:
                if (str2.equals("LowerCaseWithUnderScores")) {
                    c3 = 3;
                    break;
                }
                break;
            case 246111473:
                if (str2.equals("NoChange")) {
                    c3 = 4;
                    break;
                }
                break;
            case 572594479:
                if (str2.equals("UpperCamelCaseWithUnderScores")) {
                    c3 = 5;
                    break;
                }
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    c3 = 6;
                    break;
                }
                break;
            case 928600554:
                if (str2.equals("UpperCamelCaseWithDashes")) {
                    c3 = 7;
                    break;
                }
                break;
            case 975280372:
                if (str2.equals("UpperCamelCaseWithDots")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 1315531521:
                if (str2.equals("LowerCaseWithDots")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    c3 = '\f';
                    break;
                }
                break;
            case 1488507313:
                if (str2.equals("LowerCase")) {
                    c3 = '\r';
                    break;
                }
                break;
            case 1492440247:
                if (str2.equals("LowerCaseWithDashes")) {
                    c3 = 14;
                    break;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    c3 = 15;
                    break;
                }
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    c3 = 16;
                    break;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    c3 = 17;
                    break;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    c3 = 18;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return str.toUpperCase();
            case 1:
                return p(str, 0, true);
            case 2:
            case 4:
            case 15:
                char charAt3 = str.charAt(0);
                if (str.length() > 1) {
                    c2 = str.charAt(1);
                } else {
                    c2 = 0;
                }
                if (charAt3 < 'A' || charAt3 > 'Z' || str.length() <= 1 || (c2 >= 'A' && c2 <= 'Z')) {
                    return str;
                }
                char[] charArray = str.toCharArray();
                charArray[0] = (char) (charAt3 + ' ');
                return new String(charArray);
            case 3:
                return o0(str, 0, false);
            case 5:
                return p0(str, 0, '_');
            case 6:
                return m(str, 0, true);
            case 7:
                return p0(str, 0, '-');
            case '\b':
                return p0(str, 0, '.');
            case '\t':
                return p(str, 0, false);
            case '\n':
                char charAt4 = str.charAt(0);
                if (charAt4 >= 'a' && charAt4 <= 'z' && str.length() > 1 && (charAt2 = str.charAt(1)) >= 'a' && charAt2 <= 'z') {
                    char[] charArray2 = str.toCharArray();
                    charArray2[0] = (char) (charAt4 - ' ');
                    return new String(charArray2);
                } else if (charAt4 != '_' || str.length() <= 1 || (charAt = str.charAt(1)) < 'a' || charAt > 'z') {
                    return str;
                } else {
                    char[] charArray3 = str.toCharArray();
                    charArray3[1] = (char) (charAt - ' ');
                    return new String(charArray3);
                }
            case 11:
                return p0(str, 0, ' ');
            case '\f':
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt5 = str.charAt(i2);
                    if (charAt5 >= 'A' && charAt5 <= 'Z') {
                        charAt5 = (char) (charAt5 + ' ');
                        if (i2 > 0) {
                            sb.append('-');
                        }
                    }
                    sb.append(charAt5);
                }
                return sb.toString();
            case '\r':
                return str.toLowerCase();
            case 14:
                return m(str, 0, false);
            case 16:
                char charAt6 = str.charAt(0);
                if (charAt6 < 'A' || charAt6 > 'Z' || str.length() <= 1) {
                    return str;
                }
                char[] charArray4 = str.toCharArray();
                charArray4[0] = (char) (charAt6 + ' ');
                return new String(charArray4);
            case 17:
                return o0(str, 0, true);
            case 18:
                return j0(str, 0);
            default:
                throw new JSONException("TODO : ".concat(str2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A extends Annotation> A t(Annotation annotation, Class<A> cls) {
        if (annotation == 0) {
            throw new NullPointerException("annotation must not be null");
        } else if (cls == null) {
            throw new NullPointerException("annotationType must not be null");
        } else if (annotation.annotationType() == cls) {
            return annotation;
        } else {
            return null;
        }
    }

    public static <A extends Annotation> A u(AnnotatedElement annotatedElement, Class<A> cls) {
        if (cls != null) {
            return (A) annotatedElement.getAnnotation(cls);
        }
        throw new NullPointerException("annotationType must not be null");
    }

    public static Field v(Class cls, String str) {
        ConcurrentMap<Class, Map<String, Field>> concurrentMap = e;
        Map map = (Map) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (map == null) {
            HashMap hashMap = new HashMap();
            ConcurrentMap<Class, Field[]> concurrentMap2 = f;
            Field[] fieldArr = (Field[]) ((ConcurrentHashMap) concurrentMap2).get(cls);
            if (fieldArr == null) {
                try {
                    fieldArr = cls.getDeclaredFields();
                    ((ConcurrentHashMap) concurrentMap2).put(cls, fieldArr);
                } catch (Throwable unused) {
                    fieldArr = new Field[0];
                }
                int length = fieldArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                        ArrayList arrayList = new ArrayList(fieldArr.length);
                        for (Field field : fieldArr) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                arrayList.add(field);
                            }
                        }
                        fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    } else {
                        i2++;
                    }
                }
                ((ConcurrentHashMap) d).put(cls, fieldArr);
            }
            for (Field field2 : fieldArr) {
                hashMap.put(field2.getName(), field2);
            }
            ((ConcurrentHashMap) concurrentMap).put(cls, hashMap);
            map = (Map) ((ConcurrentHashMap) concurrentMap).get(cls);
        }
        return (Field) map.get(str);
    }

    public static Constructor w(Class cls, boolean z) {
        Class<?> declaringClass;
        if (cls == StackTraceElement.class) {
            return null;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = h;
        Constructor<?>[] constructorArr = (Constructor[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            ((ConcurrentHashMap) concurrentMap).put(cls, constructorArr);
        }
        for (Constructor<?> constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 0) {
                return constructor;
            }
        }
        if (z && (declaringClass = cls.getDeclaringClass()) != null) {
            for (Constructor<?> constructor2 : constructorArr) {
                if (constructor2.getParameterTypes().length == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                    return constructor2;
                }
            }
        }
        return null;
    }

    public static String[] x(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr = new String[length];
        ConcurrentMap<Class, Field[]> concurrentMap = d;
        Field[] fieldArr = (Field[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            ((ConcurrentHashMap) concurrentMap).put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            String name = field.getName();
            int i2 = 0;
            while (true) {
                if (i2 < enumArr.length) {
                    String name2 = enumArr[i2].name();
                    if (name.equals(name2)) {
                        JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
                        if (jSONField != null) {
                            String name3 = jSONField.name();
                            if (name3.length() != 0 && !name3.equals(name2)) {
                                strArr[i2] = name3;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (strArr[i4] == null) {
                i3++;
            }
        }
        if (i3 == length) {
            return null;
        }
        return strArr;
    }

    public static Field z(Class cls, String str) {
        ConcurrentMap<Class, Field[]> concurrentMap = d;
        Field[] fieldArr = (Field[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            ((ConcurrentHashMap) concurrentMap).put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            if (field.getName().equals(str)) {
                return field;
            }
        }
        return null;
    }

    public static void E(Class<?> cls, e62 e62Var) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = h;
        Constructor<?>[] constructorArr = (Constructor[]) ((ConcurrentHashMap) concurrentMap).get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            ((ConcurrentHashMap) concurrentMap).put(cls, constructorArr);
        }
        String[] strArr = e62Var.l;
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : constructorArr) {
            int length = constructor2.getParameterTypes().length;
            if (strArr == null || length == strArr.length) {
                if (length > 2) {
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes[length - 2] == Integer.TYPE && "tb.a07".equals(parameterTypes[length - 1].getName())) {
                        e62Var.j = constructor2;
                    }
                }
                if (constructor == null || constructor.getParameterTypes().length < length) {
                    constructor = constructor2;
                }
            }
        }
        e62Var.i = constructor;
    }

    public static void e(Class cls, nk4<Method> nk4Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
        Method[] methodArr = (Method[]) concurrentHashMap.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            concurrentHashMap.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (method.getParameterTypes().length == 0 && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                name.hashCode();
                char c2 = 65535;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1444986633:
                        if (name.equals("annotationType")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    default:
                        nk4Var.accept(method);
                        continue;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r9.equals("CamelCase") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g0(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.g0(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void b0(e62 e62Var, Annotation annotation, Method method) {
        char c2;
        char c3;
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            String name = method.getName();
            switch (name.hashCode()) {
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1210506547:
                    if (name.equals("alphabetic")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1052827512:
                    if (name.equals("naming")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008770331:
                    if (name.equals("orders")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -940893828:
                    if (name.equals("serialzeFeatures")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -676507419:
                    if (name.equals("typeName")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 90259659:
                    if (name.equals(pg1.ATOM_EXT_includes)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1752415457:
                    if (name.equals(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1869860669:
                    if (name.equals("serializeFeatures")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    Class[] clsArr = (Class[]) invoke;
                    if (clsArr.length != 0) {
                        e62Var.f = clsArr;
                        return;
                    }
                    return;
                case 1:
                    String str = (String) invoke;
                    if (!str.isEmpty()) {
                        e62Var.b = str;
                        return;
                    }
                    return;
                case 2:
                    String str2 = (String) invoke;
                    if (!str2.isEmpty()) {
                        e62Var.f18305a = str2;
                        return;
                    }
                    return;
                case 3:
                    if (!((Boolean) invoke).booleanValue()) {
                        e62Var.z = false;
                        return;
                    }
                    return;
                case 4:
                case 5:
                    for (Enum r16 : (Enum[]) invoke) {
                        String name2 = r16.name();
                        switch (name2.hashCode()) {
                            case -1937516631:
                                if (name2.equals("WriteNullNumberAsZero")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1779797023:
                                if (name2.equals("IgnoreErrorGetter")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -335314544:
                                if (name2.equals("WriteEnumUsingToString")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -211922948:
                                if (name2.equals("BrowserCompatible")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -102443356:
                                if (name2.equals("WriteNullStringAsEmpty")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -62964779:
                                if (name2.equals("NotWriteRootClassName")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1009181687:
                                if (name2.equals("WriteNullListAsEmpty")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1519175029:
                                if (name2.equals("WriteNonStringValueAsString")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1808123471:
                                if (name2.equals("WriteNullBooleanAsFalse")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1879776036:
                                if (name2.equals("WriteClassName")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2049970061:
                                if (name2.equals("WriteMapNullValue")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                e62Var.n |= JSONWriter.Feature.WriteNulls.mask;
                                break;
                            case 1:
                                e62Var.n |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                                break;
                            case 2:
                                e62Var.n |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                                break;
                            case 3:
                                e62Var.n |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                                break;
                            case 4:
                                e62Var.n |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                                break;
                            case 5:
                                e62Var.n |= JSONWriter.Feature.BrowserCompatible.mask;
                                break;
                            case 6:
                                e62Var.n |= JSONWriter.Feature.WriteClassName.mask;
                                break;
                            case 7:
                                e62Var.n |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                                break;
                            case '\b':
                                e62Var.n |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                                break;
                            case '\t':
                                e62Var.n |= JSONWriter.Feature.NotWriteRootClassName.mask;
                                break;
                            case '\n':
                                e62Var.n |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                                break;
                        }
                    }
                    return;
                case 6:
                    if (((Boolean) invoke).booleanValue()) {
                        e62Var.o = true;
                        return;
                    }
                    return;
                case 7:
                    e62Var.p = ((Enum) invoke).name();
                    return;
                case '\b':
                    String[] strArr = (String[]) invoke;
                    if (strArr.length == 0) {
                        return;
                    }
                    if (e62Var.q == null) {
                        e62Var.q = strArr;
                        return;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (String str3 : e62Var.q) {
                        linkedHashSet.add(str3);
                    }
                    Collections.addAll(linkedHashSet, strArr);
                    e62Var.q = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                    return;
                case '\t':
                    String[] strArr2 = (String[]) invoke;
                    if (strArr2.length != 0) {
                        e62Var.s = strArr2;
                        return;
                    }
                    return;
                case '\n':
                    String[] strArr3 = (String[]) invoke;
                    if (strArr3.length != 0) {
                        e62Var.r = strArr3;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    public static void e0(Object obj, Object obj2) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Field[] fieldArr = (Field[]) ((ConcurrentHashMap) f).get(cls);
            if (fieldArr == null) {
                fieldArr = cls.getDeclaredFields();
                int length = fieldArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                        ArrayList arrayList = new ArrayList(fieldArr.length);
                        for (Field field : fieldArr) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                arrayList.add(field);
                            }
                        }
                        fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    } else {
                        i2++;
                    }
                }
                ((ConcurrentHashMap) d).put(cls, fieldArr);
            }
            Field field2 = null;
            for (Field field3 : fieldArr) {
                if ("this$0".equals(field3.getName())) {
                    field2 = field3;
                }
            }
            if (field2 != null) {
                field2.setAccessible(true);
                try {
                    field2.set(obj, obj2);
                } catch (IllegalAccessException unused) {
                    throw new JSONException("setNoneStaticMemberClassParent error, class " + cls);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0263, code lost:
        if (r16 != false) goto L_0x0265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (r10 != false) goto L_0x026e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0180, code lost:
        if (u(r14, com.alibaba.fastjson2.annotation.JSONField.class) == null) goto L_0x0041;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void N(java.lang.Class r23, java.lang.Class r24, boolean r25, tb.nk4<java.lang.reflect.Method> r26) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.N(java.lang.Class, java.lang.Class, boolean, tb.nk4):void");
    }

    public static Member y(Class cls, Object obj) {
        boolean z;
        Class<?> declaringClass;
        Class cls2;
        Field v;
        if (cls == null) {
            return null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
        Method[] methodArr = (Method[]) concurrentHashMap.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            concurrentHashMap.put(cls, methodArr);
        }
        for (final Method method : methodArr) {
            if (!(method.getReturnType() == Void.class || (declaringClass = method.getDeclaringClass()) == Enum.class || declaringClass == Object.class)) {
                final String name = method.getName();
                if (!name.equals(pg1.ATOM_values) && method.getParameterTypes().length == 0) {
                    if (R(method)) {
                        return method;
                    }
                    if (name.startsWith("get", 0) && (v = v(cls, K(name, null))) != null && R(v)) {
                        return method;
                    }
                    final AtomicReference atomicReference = new AtomicReference();
                    for (Class<?> cls3 : interfaces) {
                        O(cls3, new nk4() { // from class: tb.h62
                            @Override // tb.nk4
                            public final void accept(Object obj2) {
                                BeanUtils.U(name, atomicReference, method, (Method) obj2);
                            }
                        });
                        if (obj instanceof ObjectReaderProvider) {
                            cls2 = ((ObjectReaderProvider) obj).F(cls3);
                        } else if (obj instanceof z1) {
                            cls2 = ((z1) obj).i(cls3);
                        } else {
                            cls2 = JSONFactory.defaultObjectWriterProvider.i(cls3);
                        }
                        if (cls2 != null) {
                            O(cls2, new nk4() { // from class: tb.i62
                                @Override // tb.nk4
                                public final void accept(Object obj2) {
                                    BeanUtils.V(name, atomicReference, method, (Method) obj2);
                                }
                            });
                        }
                    }
                    Member member = (Member) atomicReference.get();
                    if (member != null) {
                        return member;
                    }
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) d;
        Field[] fieldArr = (Field[]) concurrentHashMap2.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            concurrentHashMap2.put(cls, fieldArr);
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        for (Field field : fieldArr) {
            if (enumArr != null) {
                String name2 = field.getName();
                for (Enum r8 : enumArr) {
                    if (name2.equals(r8.name())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (R(field) && !z) {
                return field;
            }
        }
        return null;
    }

    public static void h0(Class cls, e62 e62Var, Class cls2, nk4<Method> nk4Var) {
        Method H;
        int i2 = 3;
        int i3 = 2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
        Method[] methodArr = (Method[]) concurrentHashMap.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            concurrentHashMap.put(cls, methodArr);
        }
        int length = methodArr.length;
        int i4 = 0;
        while (i4 < length) {
            Method method = methodArr[i4];
            if (!Modifier.isStatic(method.getModifiers()) && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                name.hashCode();
                char c2 = 65535;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1295482945:
                        if (name.equals("equals")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3059573:
                        if (name.equals("copy")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 3:
                        break;
                    case 2:
                        if (e62Var != null && e62Var.t) {
                            break;
                        }
                        break;
                    default:
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        int length2 = parameterTypes.length;
                        if (length2 == 0) {
                            if (name.length() > i2 && name.startsWith("get", 0)) {
                                Class<?> returnType = method.getReturnType();
                                if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || returnType == AtomicReference.class || Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType)) {
                                    nk4Var.accept(method);
                                    break;
                                }
                            }
                        }
                        if (length2 != i3 || method.getReturnType() != Void.TYPE || parameterTypes[0] != String.class) {
                            if (length2 != 1) {
                                break;
                            } else {
                                boolean z = name.length() > i2 && name.startsWith("set", 0);
                                if (!(z || cls2 == null || (H = H(cls2, method)) == null)) {
                                    Annotation[] declaredAnnotations = H.getDeclaredAnnotations();
                                    int length3 = declaredAnnotations.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length3) {
                                            Annotation annotation = declaredAnnotations[i5];
                                            if (annotation.annotationType() != JSONField.class) {
                                                i5++;
                                            } else if (!((JSONField) annotation).unwrapped()) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    Annotation[] declaredAnnotations2 = method.getDeclaredAnnotations();
                                    int length4 = declaredAnnotations2.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length4) {
                                            Annotation annotation2 = declaredAnnotations2[i6];
                                            if (annotation2.annotationType() != JSONField.class) {
                                                i6++;
                                            } else if (!((JSONField) annotation2).unwrapped()) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    nk4Var.accept(method);
                                    break;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            Annotation[] declaredAnnotations3 = method.getDeclaredAnnotations();
                            int length5 = declaredAnnotations3.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length5) {
                                    JSONField jSONField = (JSONField) t(declaredAnnotations3[i7], JSONField.class);
                                    if (jSONField != null && jSONField.unwrapped()) {
                                        nk4Var.accept(method);
                                        break;
                                    } else {
                                        i7++;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
            i4++;
            i2 = 3;
            i3 = 2;
        }
    }
}
