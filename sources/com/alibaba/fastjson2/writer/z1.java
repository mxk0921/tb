package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.c;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import tb.ajk;
import tb.akk;
import tb.bjk;
import tb.bkk;
import tb.buf;
import tb.cjk;
import tb.ckk;
import tb.djk;
import tb.dkk;
import tb.e1n;
import tb.e62;
import tb.ejk;
import tb.ekk;
import tb.f79;
import tb.fjk;
import tb.fkk;
import tb.gjk;
import tb.gkk;
import tb.h1n;
import tb.hik;
import tb.hjk;
import tb.hkk;
import tb.iik;
import tb.ijk;
import tb.ikk;
import tb.jik;
import tb.jjk;
import tb.k2a;
import tb.kik;
import tb.kjk;
import tb.lik;
import tb.ljk;
import tb.mik;
import tb.mjk;
import tb.njk;
import tb.nk4;
import tb.ojk;
import tb.pg1;
import tb.pjk;
import tb.qij;
import tb.qjk;
import tb.rik;
import tb.rjk;
import tb.rkk;
import tb.sik;
import tb.sjk;
import tb.tik;
import tb.tjk;
import tb.uh9;
import tb.uik;
import tb.ujk;
import tb.vik;
import tb.vjk;
import tb.wik;
import tb.wjk;
import tb.wqx;
import tb.wtf;
import tb.xik;
import tb.xjk;
import tb.y1w;
import tb.yik;
import tb.yjk;
import tb.ykk;
import tb.zik;
import tb.ztf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z1 {
    public static jik e;
    public static final int[] f;
    public static final int[] g;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<Type, iik> f2479a = new ConcurrentHashMap();
    public final ConcurrentMap<Type, iik> b = new ConcurrentHashMap();
    public final ConcurrentMap<Class, Class> c = new ConcurrentHashMap();
    public final y1 d = y1.INSTANCE;

    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, UUID.class, Locale.class, String.class, StackTraceElement.class, Collections.emptyList().getClass(), Collections.emptyMap().getClass(), Collections.emptySet().getClass()};
        int[] iArr = new int[28];
        for (int i = 0; i < 28; i++) {
            iArr[i] = System.identityHashCode(clsArr[i]);
        }
        Arrays.sort(iArr);
        f = iArr;
        int[] copyOf = Arrays.copyOf(iArr, 31);
        copyOf[copyOf.length - 1] = System.identityHashCode(Class.class);
        copyOf[copyOf.length - 2] = System.identityHashCode(int[].class);
        copyOf[copyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(copyOf);
        g = copyOf;
    }

    public static boolean n(Class<?> cls) {
        if (Arrays.binarySearch(g, System.identityHashCode(cls)) >= 0 || ((cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class)) {
            return true;
        }
        return false;
    }

    public static boolean o(Class<?> cls) {
        if (Arrays.binarySearch(f, System.identityHashCode(cls)) >= 0 || ((cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class)) {
            return true;
        }
        return false;
    }

    public final void c(f79 f79Var, Enum[] enumArr) {
        for (Enum r3 : enumArr) {
            String name = r3.name();
            name.hashCode();
            char c = 65535;
            switch (name.hashCode()) {
                case -1937516631:
                    if (name.equals("WriteNullNumberAsZero")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1779797023:
                    if (name.equals("IgnoreErrorGetter")) {
                        c = 1;
                        break;
                    }
                    break;
                case -527123134:
                    if (name.equals("UseISO8601DateFormat")) {
                        c = 2;
                        break;
                    }
                    break;
                case -348914872:
                    if (name.equals("WriteBigDecimalAsPlain")) {
                        c = 3;
                        break;
                    }
                    break;
                case -335314544:
                    if (name.equals("WriteEnumUsingToString")) {
                        c = 4;
                        break;
                    }
                    break;
                case -211922948:
                    if (name.equals("BrowserCompatible")) {
                        c = 5;
                        break;
                    }
                    break;
                case -102443356:
                    if (name.equals("WriteNullStringAsEmpty")) {
                        c = 6;
                        break;
                    }
                    break;
                case -62964779:
                    if (name.equals("NotWriteRootClassName")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1009181687:
                    if (name.equals("WriteNullListAsEmpty")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1519175029:
                    if (name.equals("WriteNonStringValueAsString")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1808123471:
                    if (name.equals("WriteNullBooleanAsFalse")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1879776036:
                    if (name.equals("WriteClassName")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2049970061:
                    if (name.equals("WriteMapNullValue")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    f79Var.e |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                    break;
                case 1:
                    f79Var.e |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                    break;
                case 2:
                    f79Var.b = "iso8601";
                    break;
                case 3:
                    f79Var.e |= JSONWriter.Feature.WriteBigDecimalAsPlain.mask;
                    break;
                case 4:
                    f79Var.e |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                    break;
                case 5:
                    f79Var.e |= JSONWriter.Feature.BrowserCompatible.mask;
                    break;
                case 6:
                    f79Var.e |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                    break;
                case 7:
                    f79Var.e |= JSONWriter.Feature.NotWriteRootClassName.mask;
                    break;
                case '\b':
                    f79Var.e |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                    break;
                case '\t':
                    f79Var.e |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                    break;
                case '\n':
                    f79Var.e |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                    break;
                case 11:
                    f79Var.e |= JSONWriter.Feature.WriteClassName.mask;
                    break;
                case '\f':
                    f79Var.e |= JSONWriter.Feature.WriteNulls.mask;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.iik d(java.lang.Class r10) {
        /*
            r9 = this;
            boolean r0 = r10.isEnum()
            if (r0 != 0) goto L_0x0012
            java.lang.Class r0 = r10.getSuperclass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L_0x0012
            r4 = r0
            goto L_0x0013
        L_0x0012:
            r4 = r10
        L_0x0013:
            java.lang.reflect.Member r10 = com.alibaba.fastjson2.util.BeanUtils.y(r4, r9)
            if (r10 != 0) goto L_0x0035
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r9.c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Member r0 = com.alibaba.fastjson2.util.BeanUtils.y(r0, r9)
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0039
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: NoSuchFieldException | NoSuchMethodException -> 0x0037
            java.lang.String r0 = r0.getName()     // Catch: NoSuchFieldException | NoSuchMethodException -> 0x0037
            java.lang.reflect.Field r10 = r4.getField(r0)     // Catch: NoSuchFieldException | NoSuchMethodException -> 0x0037
        L_0x0035:
            r5 = r10
            goto L_0x004b
        L_0x0037:
            goto L_0x0035
        L_0x0039:
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L_0x0035
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r0 = r0.getName()
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r10 = r4.getMethod(r0, r1)
            goto L_0x0035
        L_0x004b:
            tb.e62 r10 = new tb.e62
            r10.<init>()
            r9.e(r10, r4)
            boolean r10 = r10.o
            if (r10 == 0) goto L_0x0059
            r10 = 0
            return r10
        L_0x0059:
            java.lang.String[] r6 = com.alibaba.fastjson2.util.BeanUtils.x(r4)
            tb.kjk r10 = new tb.kjk
            r3 = 0
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.z1.d(java.lang.Class):tb.iik");
    }

    public void e(final e62 e62Var, Class cls) {
        Class cls2;
        Class superclass;
        String str;
        if (cls != null && (superclass = cls.getSuperclass()) != Object.class && superclass != null && superclass != Enum.class) {
            e(e62Var, superclass);
            if (e62Var.f != null && e62Var.g != null) {
                int i = 0;
                while (true) {
                    Class[] clsArr = e62Var.f;
                    if (i >= clsArr.length) {
                        break;
                    }
                    if (clsArr[i] == cls) {
                        String[] strArr = e62Var.g;
                        if (!(i >= strArr.length || (str = strArr[i]) == null || str.length() == 0)) {
                            e62Var.b = str;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        JSONType jSONType = null;
        final Annotation annotation = null;
        int i2 = 0;
        while (i2 < declaredAnnotations.length) {
            Annotation annotation2 = declaredAnnotations[i2];
            Class<? extends Annotation> annotationType = annotation2.annotationType();
            JSONType jSONType2 = (JSONType) BeanUtils.t(annotation2, JSONType.class);
            if (jSONType2 != annotation2) {
                String name = annotationType.getName();
                if (name.equals("kotlin.Metadata")) {
                    e62Var.t = true;
                    BeanUtils.E(cls, e62Var);
                    e62Var.l = BeanUtils.F(cls);
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation2;
                }
            }
            i2++;
            jSONType = jSONType2;
        }
        if (jSONType == null && (cls2 = (Class) ((ConcurrentHashMap) this.c).get(cls)) != null) {
            e62Var.getClass();
            Annotation[] declaredAnnotations2 = cls2.getDeclaredAnnotations();
            int i3 = 0;
            while (i3 < declaredAnnotations2.length) {
                Annotation annotation3 = declaredAnnotations2[i3];
                Class<? extends Annotation> annotationType2 = annotation3.annotationType();
                JSONType jSONType3 = (JSONType) BeanUtils.t(annotation3, JSONType.class);
                if (jSONType3 != annotation3 && annotationType2.getName().equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation3;
                }
                i3++;
                jSONType = jSONType3;
            }
        }
        if (jSONType != null) {
            Class<?>[] seeAlso = jSONType.seeAlso();
            if (seeAlso.length != 0) {
                e62Var.f = seeAlso;
            }
            String typeKey = jSONType.typeKey();
            if (!typeKey.isEmpty()) {
                e62Var.f18305a = typeKey;
            }
            String typeName = jSONType.typeName();
            if (!typeName.isEmpty()) {
                e62Var.b = typeName;
            }
            for (JSONWriter.Feature feature : jSONType.serializeFeatures()) {
                e62Var.n |= feature.mask;
            }
            e62Var.p = jSONType.naming().name();
            String[] ignores = jSONType.ignores();
            if (ignores.length > 0) {
                e62Var.q = ignores;
            }
            String[] includes = jSONType.includes();
            if (includes.length > 0) {
                e62Var.s = includes;
            }
            String[] orders = jSONType.orders();
            if (orders.length > 0) {
                e62Var.r = orders;
            }
            Class<?> serializer = jSONType.serializer();
            if (iik.class.isAssignableFrom(serializer)) {
                e62Var.u = serializer;
            }
            Class<? extends uh9>[] serializeFilters = jSONType.serializeFilters();
            if (serializeFilters.length != 0) {
                e62Var.w = serializeFilters;
            }
            String format = jSONType.format();
            if (!format.isEmpty()) {
                e62Var.x = format;
            }
            String locale = jSONType.locale();
            if (!locale.isEmpty()) {
                String[] split = locale.split("_");
                if (split.length == 2) {
                    e62Var.y = new Locale(split[0], split[1]);
                }
            }
            if (!jSONType.alphabetic()) {
                e62Var.z = false;
            }
            if (jSONType.writeEnumAsJavaBean()) {
                e62Var.o = true;
            }
        } else if (annotation != null) {
            BeanUtils.e(annotation.annotationType(), new nk4() { // from class: tb.nkk
                @Override // tb.nk4
                public final void accept(Object obj) {
                    BeanUtils.b0(e62.this, annotation, (Method) obj);
                }
            });
        }
        Class[] clsArr2 = e62Var.f;
        if (!(clsArr2 == null || clsArr2.length == 0)) {
            String str2 = e62Var.b;
            if (str2 == null || str2.length() == 0) {
                for (Class cls3 : e62Var.f) {
                    if (cls3 == cls) {
                        e62Var.b = cls.getSimpleName();
                        return;
                    }
                }
            }
        }
    }

    public iik f(String str, Class cls) {
        str.hashCode();
        if (str.equals("java.sql.Time")) {
            return ztf.J(null);
        }
        if (str.equals("java.sql.Timestamp")) {
            return new buf(null);
        }
        if (Clob.class.isAssignableFrom(cls)) {
            return new wtf();
        }
        return null;
    }

    public void g(e62 e62Var, f79 f79Var, Class cls, Field field) {
        Annotation[] declaredAnnotations;
        Class cls2;
        Field field2;
        ConcurrentMap<Class, Class> concurrentMap = this.c;
        JSONField jSONField = null;
        if (!(cls == null || (cls2 = (Class) ((ConcurrentHashMap) concurrentMap).get(cls)) == null || cls2 == cls)) {
            try {
                field2 = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                field2 = null;
            }
            if (field2 != null) {
                g(e62Var, f79Var, cls2, field2);
            }
        }
        if (((Class) ((ConcurrentHashMap) concurrentMap).get(field.getType())) != null) {
            f79Var.j = true;
        }
        if (Modifier.isTransient(field.getModifiers())) {
            f79Var.f = true;
        }
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if (!(jSONField == null && (jSONField = (JSONField) BeanUtils.t(annotation, JSONField.class)) == annotation) && annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                u(f79Var, annotation);
            }
        }
        if (jSONField != null) {
            r(f79Var, jSONField);
            Class<?> writeUsing = jSONField.writeUsing();
            if (iik.class.isAssignableFrom(writeUsing)) {
                f79Var.h = writeUsing;
            }
            Class<?> serializeUsing = jSONField.serializeUsing();
            if (iik.class.isAssignableFrom(serializeUsing)) {
                f79Var.h = serializeUsing;
            }
            if (jSONField.jsonDirect()) {
                f79Var.e |= f79.RAW_VALUE_MASK;
            }
            if (!((f79Var.e & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0 || String.class.equals(field.getType()) || f79Var.h != null)) {
                f79Var.h = gkk.class;
            }
        }
    }

    public void h(e62 e62Var, f79 f79Var, Class cls, Method method) {
        Field A;
        Method method2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class cls2 = (Class) concurrentHashMap.get(cls);
        String name = method.getName();
        if (!(cls2 == null || cls2 == cls)) {
            try {
                method2 = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                method2 = null;
            }
            if (method2 != null) {
                h(e62Var, f79Var, cls2, method2);
            }
        }
        if (((Class) concurrentHashMap.get(method.getReturnType())) != null) {
            f79Var.j = true;
        }
        int i = 0;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method H = BeanUtils.H(superclass, method);
            if (H != null) {
                h(e62Var, f79Var, superclass, H);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                Method H2 = BeanUtils.H(cls3, method);
                if (H2 != null) {
                    h(e62Var, f79Var, superclass, H2);
                }
            }
        }
        t(f79Var, method.getDeclaredAnnotations());
        if (!cls.getName().startsWith("java.lang", 0) && (A = BeanUtils.A(cls, method)) != null) {
            f79Var.e |= f79.FIELD_MASK;
            g(e62Var, f79Var, cls, A);
        }
        boolean z = e62Var.t;
        if (z && e62Var.i != null && e62Var.l != null) {
            String L = BeanUtils.L(method, z, null);
            while (true) {
                String[] strArr = e62Var.l;
                if (i < strArr.length) {
                    if (L.equals(strArr[i])) {
                        Annotation[][] parameterAnnotations = e62Var.i.getParameterAnnotations();
                        if (i < parameterAnnotations.length) {
                            t(f79Var, parameterAnnotations[i]);
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public Class i(Class cls) {
        return (Class) ((ConcurrentHashMap) this.c).get(cls);
    }

    public iik j(Class cls) {
        return k(cls, cls, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (r3.equals("android.net.Uri$OpaqueUri") == false) goto L_0x00a4;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.iik k(java.lang.reflect.Type r6, java.lang.Class r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Class r0 = r7.getSuperclass()
            boolean r1 = r7.isEnum()
            if (r1 != 0) goto L_0x0017
            if (r0 == 0) goto L_0x0017
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L_0x0017
            tb.iik r6 = r5.k(r0, r0, r8)
            return r6
        L_0x0017:
            if (r8 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L_0x002c
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.google.protobuf.GeneratedMessageV3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002c
            r8 = 0
        L_0x002c:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, tb.iik> r0 = r5.f2479a
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, tb.iik> r1 = r5.b
            if (r8 == 0) goto L_0x003c
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r2 = r2.get(r6)
            tb.iik r2 = (tb.iik) r2
            goto L_0x0045
        L_0x003c:
            r2 = r0
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r2 = r2.get(r6)
            tb.iik r2 = (tb.iik) r2
        L_0x0045:
            if (r2 == 0) goto L_0x0048
            return r2
        L_0x0048:
            if (r8 == 0) goto L_0x005b
            java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x005b
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 != 0) goto L_0x005b
            goto L_0x0078
        L_0x005b:
            tb.iik r2 = r5.m(r6, r7)
            if (r2 == 0) goto L_0x0078
            if (r8 == 0) goto L_0x006c
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r6 = r1.put(r6, r2)
            tb.iik r6 = (tb.iik) r6
            goto L_0x0074
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r6 = r0.put(r6, r2)
            tb.iik r6 = (tb.iik) r6
        L_0x0074:
            if (r6 == 0) goto L_0x0077
            r2 = r6
        L_0x0077:
            return r2
        L_0x0078:
            java.lang.String r3 = r7.getName()
            java.lang.String r4 = "android.net.Uri$HierarchicalUri"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a2
            java.lang.String r4 = "android.net.Uri$StringUri"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a2
            java.lang.String r4 = "com.alibaba.fastjson.JSONObject"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x009d
            java.lang.String r4 = "android.net.Uri$OpaqueUri"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a2
            goto L_0x00a4
        L_0x009d:
            tb.ckk r2 = tb.ckk.d(r7)
            goto L_0x00a4
        L_0x00a2:
            tb.gkk r2 = tb.gkk.INSTANCE
        L_0x00a4:
            if (r2 != 0) goto L_0x00cb
            if (r8 == 0) goto L_0x00ad
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            goto L_0x00af
        L_0x00ad:
            r2 = 0
        L_0x00af:
            com.alibaba.fastjson2.writer.y1 r4 = r5.d
            tb.iik r2 = r4.j(r7, r2, r5)
            if (r8 == 0) goto L_0x00c0
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r6 = r1.put(r6, r2)
            tb.iik r6 = (tb.iik) r6
            goto L_0x00c8
        L_0x00c0:
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r6 = r0.put(r6, r2)
            tb.iik r6 = (tb.iik) r6
        L_0x00c8:
            if (r6 == 0) goto L_0x00cb
            r2 = r6
        L_0x00cb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.z1.k(java.lang.reflect.Type, java.lang.Class, boolean):tb.iik");
    }

    public iik l(Type type, Class cls, boolean z) {
        if (z) {
            return (iik) ((ConcurrentHashMap) this.b).get(type);
        }
        return (iik) ((ConcurrentHashMap) this.f2479a).get(type);
    }

    public final /* synthetic */ void q(Annotation annotation, f79 f79Var, Method method) {
        String name = method.getName();
        char c = 0;
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            switch (name.hashCode()) {
                case -1371565692:
                    if (name.equals("serializeUsing")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1268779017:
                    if (name.equals("format")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1206994319:
                    if (name.equals("ordinal")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -987658292:
                    if (name.equals("unwrapped")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -940893828:
                    if (name.equals("serialzeFeatures")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -659125328:
                    if (name.equals(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -573479200:
                    if (name.equals(DraftMediaHelper.DraftType.SERIALIZE)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (name.equals("name")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 12396273:
                    if (name.equals("jsonDirect")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 102727412:
                    if (name.equals("label")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String str = (String) invoke;
                    if (!str.isEmpty()) {
                        f79Var.f19065a = str;
                        return;
                    }
                    return;
                case 1:
                    s(f79Var, (String) invoke);
                    return;
                case 2:
                    String str2 = (String) invoke;
                    if (!str2.isEmpty()) {
                        f79Var.c = str2;
                        return;
                    }
                    return;
                case 3:
                    String str3 = (String) invoke;
                    if (!str3.isEmpty()) {
                        f79Var.k = str3;
                        return;
                    }
                    return;
                case 4:
                    Integer num = (Integer) invoke;
                    if (num.intValue() != 0) {
                        f79Var.d = num.intValue();
                        return;
                    }
                    return;
                case 5:
                    if (!((Boolean) invoke).booleanValue()) {
                        f79Var.f = true;
                        return;
                    }
                    return;
                case 6:
                    if (((Boolean) invoke).booleanValue()) {
                        f79Var.e |= f79.UNWRAPPED_MASK;
                        return;
                    }
                    return;
                case 7:
                    c(f79Var, (Enum[]) invoke);
                    return;
                case '\b':
                    Class<?> cls = (Class) invoke;
                    if (iik.class.isAssignableFrom(cls)) {
                        f79Var.h = cls;
                        return;
                    }
                    return;
                case '\t':
                    if (((Boolean) invoke).booleanValue()) {
                        f79Var.e |= f79.RAW_VALUE_MASK;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    public final void r(f79 f79Var, JSONField jSONField) {
        String name = jSONField.name();
        if (!name.isEmpty()) {
            f79Var.f19065a = name;
        }
        String defaultValue = jSONField.defaultValue();
        if (!defaultValue.isEmpty()) {
            f79Var.k = defaultValue;
        }
        s(f79Var, jSONField.format());
        String label = jSONField.label();
        if (!label.isEmpty()) {
            f79Var.c = label;
        }
        if (!f79Var.f) {
            f79Var.f = !jSONField.serialize();
        }
        if (jSONField.unwrapped()) {
            f79Var.e |= f79.UNWRAPPED_MASK;
        }
        for (JSONWriter.Feature feature : jSONField.serializeFeatures()) {
            f79Var.e |= feature.mask;
        }
        int ordinal = jSONField.ordinal();
        if (ordinal != 0) {
            f79Var.d = ordinal;
        }
        if (jSONField.value()) {
            f79Var.e |= f79.VALUE_MASK;
        }
        if (jSONField.jsonDirect()) {
            f79Var.e |= f79.RAW_VALUE_MASK;
        }
        Class<?> serializeUsing = jSONField.serializeUsing();
        if (iik.class.isAssignableFrom(serializeUsing)) {
            f79Var.h = serializeUsing;
        }
    }

    public final void s(f79 f79Var, String str) {
        if (!str.isEmpty()) {
            String trim = str.trim();
            if (trim.indexOf(84) != -1 && !trim.contains("'T'")) {
                trim = trim.replaceAll("T", "'T'");
            }
            if (!trim.isEmpty()) {
                f79Var.b = trim;
            }
        }
    }

    public final void t(f79 f79Var, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.t(annotation, JSONField.class);
            if (jSONField != null) {
                r(f79Var, jSONField);
            } else {
                String name = annotationType.getName();
                if (name.equals("java.beans.Transient")) {
                    f79Var.f = true;
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    u(f79Var, annotation);
                }
            }
        }
    }

    public final void u(final f79 f79Var, final Annotation annotation) {
        BeanUtils.e(annotation.getClass(), new nk4() { // from class: tb.okk
            @Override // tb.nk4
            public final void accept(Object obj) {
                z1.this.q(annotation, f79Var, (Method) obj);
            }
        });
    }

    public iik m(Type type, Class cls) {
        Class cls2;
        iik d;
        Type type2 = type;
        if (type2 == String.class) {
            return dkk.f17883a;
        }
        if (cls != null) {
            cls2 = cls;
        } else if (type2 instanceof Class) {
            cls2 = (Class) type2;
        } else {
            cls2 = TypeUtils.m(type);
        }
        String name = cls2.getName();
        iik f2 = f(name, cls2);
        if (f2 != null) {
            return f2;
        }
        if (name.equals("java.util.regex.Pattern") || name.equals("net.sf.json.JSONNull") || name.equals("java.net.Inet6Address") || name.equals("java.net.Inet4Address") || name.equals("java.text.SimpleDateFormat") || name.equals("java.net.InetSocketAddress")) {
            return ikk.f21365a;
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class || rawType == ArrayList.class) {
                if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                    return akk.f15790a;
                }
                type2 = rawType;
            }
            if (Map.class.isAssignableFrom(cls2)) {
                return ckk.h(type2, cls2);
            }
        }
        if (type2 == LinkedList.class) {
            return yjk.g;
        }
        if (type2 == ArrayList.class || type2 == List.class || List.class.isAssignableFrom(cls2)) {
            return yjk.g;
        }
        if (Collection.class.isAssignableFrom(cls2)) {
            return fjk.f19342a;
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return ckk.d(cls2);
        }
        if (type2 == Integer.class) {
            return pjk.f26129a;
        }
        if (type2 == AtomicInteger.class) {
            return tik.f28734a;
        }
        if (type2 == Byte.class) {
            return vjk.f30044a;
        }
        if (type2 == Short.class) {
            return njk.f24776a;
        }
        if (type2 == Long.class) {
            return sjk.f28090a;
        }
        if (type2 == AtomicLong.class) {
            return vik.f30035a;
        }
        if (type2 == AtomicReference.class) {
            return xik.f31411a;
        }
        if (type2 == Float.class) {
            return ljk.b;
        }
        if (type2 == Double.class) {
            return ijk.b;
        }
        if (type2 == BigInteger.class) {
            return mik.f24063a;
        }
        if (type2 == BigDecimal.class) {
            return yik.c;
        }
        if (type2 == Boolean.class) {
            return ajk.f15776a;
        }
        if (type2 == AtomicBoolean.class) {
            return sik.f28075a;
        }
        if (type2 == AtomicIntegerArray.class) {
            return uik.f29402a;
        }
        if (type2 == AtomicLongArray.class) {
            return wik.f30722a;
        }
        if (type2 == Character.class) {
            return djk.f17871a;
        }
        if (type2 instanceof Class) {
            Class cls3 = (Class) type2;
            if (TimeUnit.class.isAssignableFrom(cls3)) {
                return new kjk(null, TimeUnit.class, null, null, 0L);
            }
            if (Enum.class.isAssignableFrom(cls3) && (d = d(cls3)) != null) {
                return d;
            }
            if (c.class.isAssignableFrom(cls3)) {
                return gkk.INSTANCE;
            }
            if (cls3 == boolean[].class) {
                return zik.b;
            }
            if (cls3 == char[].class) {
                return cjk.b;
            }
            if (cls3 == StringBuffer.class || cls3 == StringBuilder.class) {
                return gkk.INSTANCE;
            }
            if (cls3 == byte[].class) {
                return xjk.b;
            }
            if (cls3 == short[].class) {
                return ojk.b;
            }
            if (cls3 == int[].class) {
                return rjk.b;
            }
            if (cls3 == long[].class) {
                return ujk.b;
            }
            if (cls3 == float[].class) {
                return mjk.c;
            }
            if (cls3 == double[].class) {
                return jjk.b;
            }
            if (cls3 == Byte[].class) {
                return wjk.f30730a;
            }
            if (cls3 == Integer[].class) {
                return qjk.f26787a;
            }
            if (cls3 == Long[].class) {
                return tjk.f28750a;
            }
            if (String[].class == cls3) {
                return ekk.c;
            }
            if (BigDecimal[].class == cls3) {
                return rik.f27404a;
            }
            if (Object[].class.isAssignableFrom(cls3)) {
                if (cls3 == Object[].class) {
                    return kik.d;
                }
                Class<?> componentType = cls3.getComponentType();
                if (Modifier.isFinal(componentType.getModifiers())) {
                    return new lik(componentType, null);
                }
                return new kik(componentType);
            } else if (cls3 == UUID.class) {
                return hkk.f20705a;
            } else {
                if (cls3 == Locale.class) {
                    return bkk.f16448a;
                }
                if (cls3 == Currency.class) {
                    return gjk.b;
                }
                if (TimeZone.class.isAssignableFrom(cls3)) {
                    return fkk.f19363a;
                }
                if (cls3 == URI.class || cls3 == URL.class || cls3 == File.class || wqx.class.isAssignableFrom(cls3) || Charset.class.isAssignableFrom(cls3)) {
                    return gkk.INSTANCE;
                }
                iik f3 = f(cls3.getName(), cls3);
                if (f3 != null) {
                    return f3;
                }
                e62 e62Var = new e62();
                Class i = i(cls3);
                if (i != null) {
                    e(e62Var, i);
                }
                if (Date.class.isAssignableFrom(cls3)) {
                    if (e62Var.x == null && e62Var.y == null) {
                        return hjk.l;
                    }
                    return new hjk(e62Var.x, e62Var.y);
                } else if (Calendar.class.isAssignableFrom(cls3)) {
                    if (e62Var.x == null && e62Var.y == null) {
                        return bjk.l;
                    }
                    return new bjk(e62Var.x, e62Var.y);
                } else if (StackTraceElement.class == cls3) {
                    if (e == null) {
                        e = new jik(StackTraceElement.class, null, null, 0L, Arrays.asList(ykk.a("fileName", String.class, new k2a() { // from class: tb.kkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((StackTraceElement) obj).getFileName();
                            }
                        }), ykk.b(pg1.ATOM_lineNumber, new rkk()), ykk.a("className", String.class, new k2a() { // from class: tb.skk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((StackTraceElement) obj).getClassName();
                            }
                        }), ykk.a(FluidException.METHOD_NAME, String.class, new k2a() { // from class: tb.tkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((StackTraceElement) obj).getMethodName();
                            }
                        })));
                    }
                    return e;
                } else if (Class.class == cls3) {
                    return ejk.f18622a;
                } else {
                    if (Method.class == cls3) {
                        return new jik(Method.class, null, null, 0L, Arrays.asList(ykk.a("declaringClass", Class.class, new k2a() { // from class: tb.ukk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((Method) obj).getDeclaringClass();
                            }
                        }), ykk.a("name", String.class, new k2a() { // from class: tb.vkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((Method) obj).getName();
                            }
                        }), ykk.a("parameterTypes", Class[].class, new k2a() { // from class: tb.wkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((Method) obj).getParameterTypes();
                            }
                        })));
                    }
                    if (Field.class == cls3) {
                        return new jik(Method.class, null, null, 0L, Arrays.asList(ykk.a("declaringClass", Class.class, new k2a() { // from class: tb.xkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((Field) obj).getDeclaringClass();
                            }
                        }), ykk.a("name", String.class, new k2a() { // from class: tb.lkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((Field) obj).getName();
                            }
                        })));
                    }
                    if (ParameterizedType.class.isAssignableFrom(cls3)) {
                        return ykk.c(ParameterizedType.class, ykk.a("actualTypeArguments", Type[].class, new k2a() { // from class: tb.mkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((ParameterizedType) obj).getActualTypeArguments();
                            }
                        }), ykk.a("ownerType", Type.class, new k2a() { // from class: tb.pkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((ParameterizedType) obj).getOwnerType();
                            }
                        }), ykk.a("rawType", Type.class, new k2a() { // from class: tb.qkk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return ((ParameterizedType) obj).getRawType();
                            }
                        }));
                    }
                }
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements iik {
        public static final a INSTANCE = new a();

        @Override // tb.iik
        public /* synthetic */ void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            hik.i(this, jSONWriter, obj, obj2, type, j);
            throw null;
        }

        @Override // tb.iik
        public /* synthetic */ void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            hik.e(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // tb.iik
        public /* synthetic */ FieldWriter E(long j) {
            return null;
        }

        @Override // tb.iik
        public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            hik.g(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // tb.iik
        public /* synthetic */ void k(JSONWriter jSONWriter, Object obj) {
            hik.d(this, jSONWriter, obj);
        }

        @Override // tb.iik
        public /* synthetic */ void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            hik.f(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // tb.iik
        public /* synthetic */ boolean n(JSONWriter jSONWriter) {
            return hik.b(this, jSONWriter);
        }

        @Override // tb.iik
        public /* synthetic */ List p() {
            return hik.a(this);
        }

        @Override // tb.iik
        public /* synthetic */ void A(e1n e1nVar) {
        }

        @Override // tb.iik
        public /* synthetic */ void c(h1n h1nVar) {
        }

        @Override // tb.iik
        public /* synthetic */ void f(qij qijVar) {
        }

        @Override // tb.iik
        public /* synthetic */ void g(y1w y1wVar) {
        }

        @Override // tb.iik
        public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        }
    }
}
