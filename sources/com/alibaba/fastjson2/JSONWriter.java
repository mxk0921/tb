package com.alibaba.fastjson2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.z1;
import com.alipay.android.msp.framework.okio.SegmentPool;
import com.taobao.media.MediaConstant;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.f7l;
import tb.iik;
import tb.oij;
import tb.q7h;
import tb.w1r;
import tb.wqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class JSONWriter implements Closeable {
    public static final char[] p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public final a f2458a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final char f;
    public final int g;
    public boolean h;
    public int i;
    public Object j;
    public IdentityHashMap<Object, b> k;
    public b l;
    public String m;
    public final boolean n;
    public int o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        BeanToArray(8),
        WriteNulls(16),
        WriteMapNullValue(16),
        BrowserCompatible(32),
        NullAsDefaultValue(64),
        WriteBooleanAsNumber(128),
        WriteNonStringValueAsString(256),
        WriteClassName(512),
        NotWriteRootClassName(1024),
        NotWriteHashMapArrayListClassName(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
        NotWriteDefaultValue(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
        WriteEnumsUsingName(8192),
        WriteEnumUsingToString(16384),
        IgnoreErrorGetter(32768),
        PrettyFormat(SegmentPool.MAX_SIZE),
        ReferenceDetection(131072),
        WriteNameAsSymbol(262144),
        WriteBigDecimalAsPlain(524288),
        UseSingleQuotes(1048576),
        MapSortField(2097152),
        WriteNullListAsEmpty(4194304),
        WriteNullStringAsEmpty(8388608),
        WriteNullNumberAsZero(16777216),
        WriteNullBooleanAsFalse(33554432),
        NotWriteEmptyArray(67108864),
        WriteNonStringKeyAsString(134217728),
        WritePairAsJavaBean(268435456),
        OptimizedForAscii(536870912),
        EscapeNoneAscii(1073741824),
        WriteByteArrayAsBase64(2147483648L),
        IgnoreNonFieldGetter(4294967296L),
        LargeObject(8589934592L),
        WriteLongAsString(17179869184L),
        BrowserSecure(34359738368L),
        WriteEnumUsingOrdinal(68719476736L),
        WriteThrowableClassName(137438953472L),
        UnquoteFieldName(274877906944L),
        NotWriteSetClassName(549755813888L),
        NotWriteNumberClassName(1099511627776L);
        
        public final long mask;

        Feature(long j) {
            this.mask = j;
        }
    }

    public JSONWriter(a aVar, w1r w1rVar, boolean z, Charset charset) {
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        int i;
        this.f2458a = aVar;
        this.d = z;
        boolean z5 = false;
        if (z || charset != StandardCharsets.UTF_8) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.b = z2;
        if (z || charset != StandardCharsets.UTF_16) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.c = z3;
        if (z || (aVar.c & Feature.UseSingleQuotes.mask) == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.e = z4;
        if (z4) {
            c = '\'';
        } else {
            c = '\"';
        }
        this.f = c;
        long j = aVar.c;
        if ((Feature.LargeObject.mask & j) != 0) {
            i = 1073741824;
        } else {
            i = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        this.g = i;
        this.n = (j & Feature.PrettyFormat.mask) != 0 ? true : z5;
    }

    public static boolean S0(GenericArrayType genericArrayType, Class cls) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
        }
        if (cls.isArray()) {
            return cls.getComponentType().equals(genericComponentType);
        }
        return false;
    }

    public static JSONWriter T0() {
        a aVar = new a(JSONFactory.defaultObjectWriterProvider);
        long j = Feature.OptimizedForAscii.mask;
        if (0 != 0) {
            return new m(aVar);
        }
        return new l(aVar);
    }

    public static JSONWriter U0(a aVar) {
        if (aVar == null) {
            aVar = JSONFactory.f();
        }
        if ((aVar.c & Feature.OptimizedForAscii.mask) != 0) {
            return new m(aVar);
        }
        return new l(aVar);
    }

    public static JSONWriter V0(Feature... featureArr) {
        a g = JSONFactory.g(featureArr);
        if ((g.c & Feature.OptimizedForAscii.mask) != 0) {
            return new m(g);
        }
        return new l(g);
    }

    public static JSONWriter W0(Feature... featureArr) {
        return new k(new a(JSONFactory.defaultObjectWriterProvider, featureArr), null);
    }

    public final long A() {
        return this.f2458a.c;
    }

    public final void A1(double d, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.d) {
            writeDouble(d);
        } else if (Double.isNaN(d) || Double.isInfinite(d)) {
            b2();
        } else {
            f2(decimalFormat.format(d));
        }
    }

    public final boolean B0() {
        if ((this.f2458a.c & Feature.ReferenceDetection.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract void B1(double[] dArr);

    public final long C(long j) {
        return j | this.f2458a.c;
    }

    public final boolean C0(Object obj) {
        if ((this.f2458a.c & Feature.ReferenceDetection.mask) == 0 || obj == null || z1.n(obj.getClass())) {
            return false;
        }
        return true;
    }

    public final void C1(double[] dArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.d) {
            B1(dArr);
        } else if (dArr == null) {
            b2();
        } else {
            c1();
            for (int i = 0; i < dArr.length; i++) {
                if (i != 0) {
                    t1();
                }
                f2(decimalFormat.format(dArr[i]));
            }
            e();
        }
    }

    public final boolean D0() {
        return this.b;
    }

    public void D1(Enum r8) {
        if (r8 == null) {
            b2();
            return;
        }
        long j = this.f2458a.c;
        if ((Feature.WriteEnumUsingToString.mask & j) != 0) {
            k2(r8.toString());
        } else if ((j & Feature.WriteEnumsUsingName.mask) != 0) {
            k2(r8.name());
        } else {
            L1(r8.ordinal());
        }
    }

    public final boolean E0(Object obj, Class cls, long j) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f2458a.c;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0 && cls2 == HashMap.class) {
            return false;
        }
        if ((j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public final void E1(float f, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.d) {
            writeFloat(f);
        } else if (Float.isNaN(f) || Float.isInfinite(f)) {
            b2();
        } else {
            f2(decimalFormat.format(f));
        }
    }

    public final iik F(Class cls) {
        boolean z;
        a aVar = this.f2458a;
        if ((aVar.c & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return aVar.f2459a.k(cls, cls, z);
    }

    public abstract void F1(float[] fArr);

    public final void G1(float[] fArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.d) {
            F1(fArr);
        } else if (fArr == null) {
            b2();
        } else {
            c1();
            for (int i = 0; i < fArr.length; i++) {
                if (i != 0) {
                    t1();
                }
                f2(decimalFormat.format(fArr[i]));
            }
            e();
        }
    }

    public abstract void H1(byte[] bArr);

    public void I1(long j, int i) {
        throw new JSONException("TODO");
    }

    public abstract void J1(short s);

    public void K1(short[] sArr) {
        if (sArr == null) {
            k1();
            return;
        }
        c1();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                t1();
            }
            J1(sArr[i]);
        }
        e();
    }

    public final iik L(Type type, Class cls) {
        boolean z;
        a aVar = this.f2458a;
        if ((aVar.c & Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return aVar.f2459a.k(type, cls, z);
    }

    public final boolean L0() {
        if ((this.f2458a.c & Feature.WriteNulls.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract void L1(int i);

    public final boolean M0(Object obj) {
        Class<?> cls;
        long j = this.f2458a.c;
        if ((Feature.WriteClassName.mask & j) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j) != 0 && obj != null && ((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return false;
        }
        if ((j & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public final void M1(int i, String str) {
        if (str == null || this.d) {
            L1(i);
        } else {
            k2(String.format(str, Integer.valueOf(i)));
        }
    }

    public final boolean N0(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.f2458a.c;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0 && obj != null && ((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return false;
        }
        if ((j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public abstract void N1(int[] iArr);

    public final boolean O0(Object obj, Class cls) {
        Class<?> cls2;
        long j = this.f2458a.c;
        if ((Feature.WriteClassName.mask & j) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j) != 0 && (cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return false;
        }
        if ((j & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public abstract void O1(long j);

    public final boolean P0(Object obj, Class cls, long j) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f2458a.c;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        if ((j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public abstract void P1(long[] jArr);

    public final boolean Q0(Object obj, Type type) {
        Class<?> cls;
        long j = this.f2458a.c;
        if ((Feature.WriteClassName.mask & j) == 0 || obj == null) {
            return false;
        }
        Class<?> cls2 = obj.getClass();
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type instanceof GenericArrayType) {
                if (S0((GenericArrayType) type, cls2)) {
                    return false;
                }
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    cls = (Class) rawType;
                }
            }
            cls = null;
        }
        if (cls2 == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j) != 0 && (cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return false;
        }
        if ((j & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public final void Q1() {
        if ((this.f2458a.c & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            O1(0L);
        } else {
            b2();
        }
    }

    public final boolean R0(Object obj, Type type, long j) {
        Class<?> cls;
        long j2 = j | this.f2458a.c;
        if ((Feature.WriteClassName.mask & j2) == 0 || obj == null) {
            return false;
        }
        Class<?> cls2 = obj.getClass();
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    cls = (Class) rawType;
                }
            }
            cls = null;
        }
        if (cls2 == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        if ((j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.j) {
            return true;
        }
        return false;
    }

    public abstract void R1(byte b2);

    public abstract void S1(q7h q7hVar);

    public void T1(long j) {
        O1(j);
    }

    public final void U1(int i) {
        if (this.h) {
            this.h = false;
        } else {
            t1();
        }
        L1(i);
    }

    public final void V1(long j) {
        if (this.h) {
            this.h = false;
        } else {
            t1();
        }
        O1(j);
    }

    public void W1(String str) {
        boolean z;
        boolean z2 = false;
        if (this.h) {
            this.h = false;
        } else {
            t1();
        }
        if ((this.f2458a.c & Feature.UnquoteFieldName.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (str.indexOf(this.f) < 0 && str.indexOf(92) < 0)) {
            z2 = z;
        }
        if (z2) {
            f2(str);
        } else {
            k2(str);
        }
    }

    public final void X0(Object obj) {
        b bVar = this.l;
        if (bVar != null && (this.f2458a.c & Feature.ReferenceDetection.mask) != 0 && obj != Collections.EMPTY_LIST && obj != Collections.EMPTY_SET) {
            this.l = bVar.f2460a;
        }
    }

    public void X1(Object obj) {
        if (this.h) {
            this.h = false;
        } else {
            t1();
        }
        j1(obj);
    }

    public final String Y0(int i, Object obj) {
        b bVar;
        b bVar2;
        if (!((this.f2458a.c & Feature.ReferenceDetection.mask) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET)) {
            if (i == 0) {
                b bVar3 = this.l;
                bVar = bVar3.e;
                if (bVar == null) {
                    bVar = new b(bVar3, i);
                    bVar3.e = bVar;
                }
            } else if (i == 1) {
                b bVar4 = this.l;
                bVar = bVar4.f;
                if (bVar == null) {
                    bVar = new b(bVar4, i);
                    bVar4.f = bVar;
                }
            } else {
                bVar = new b(this.l, i);
            }
            this.l = bVar;
            if (obj == this.j) {
                bVar2 = b.ROOT;
            } else {
                IdentityHashMap<Object, b> identityHashMap = this.k;
                if (identityHashMap == null || (bVar2 = identityHashMap.get(obj)) == null) {
                    if (this.k == null) {
                        this.k = new IdentityHashMap<>(8);
                    }
                    this.k.put(obj, this.l);
                }
            }
            return bVar2.toString();
        }
        return null;
    }

    public abstract void Y1(byte[] bArr);

    public final boolean Z(long j) {
        a aVar = this.f2458a;
        aVar.getClass();
        if ((j & aVar.c) != 0) {
            return true;
        }
        return false;
    }

    public final String Z0(FieldWriter fieldWriter, Object obj) {
        b bVar;
        IdentityHashMap<Object, b> identityHashMap;
        if (!((this.f2458a.c & Feature.ReferenceDetection.mask) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET)) {
            b bVar2 = this.l;
            b bVar3 = b.ROOT;
            if (bVar2 == bVar3) {
                bVar = fieldWriter.j();
            } else {
                bVar = fieldWriter.i(bVar2);
            }
            this.l = bVar;
            if (obj == this.j || ((identityHashMap = this.k) != null && (bVar3 = identityHashMap.get(obj)) != null)) {
                return bVar3.toString();
            }
            if (this.k == null) {
                this.k = new IdentityHashMap<>(8);
            }
            this.k.put(obj, this.l);
        }
        return null;
    }

    public void Z1(byte[] bArr, long j) {
        throw new JSONException("UnsupportedOperation");
    }

    public final void a(Feature feature, boolean z) {
        this.f2458a.a(feature, z);
    }

    public final String a1(String str, Object obj) {
        b bVar;
        if (!((this.f2458a.c & Feature.ReferenceDetection.mask) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET)) {
            this.l = new b(this.l, str);
            if (obj == this.j) {
                bVar = b.ROOT;
            } else {
                IdentityHashMap<Object, b> identityHashMap = this.k;
                if (identityHashMap == null || (bVar = identityHashMap.get(obj)) == null) {
                    if (this.k == null) {
                        this.k = new IdentityHashMap<>(8);
                    }
                    this.k.put(obj, this.l);
                }
            }
            return bVar.toString();
        }
        return null;
    }

    public abstract void a2(char[] cArr);

    public final void b1(Object obj) {
        this.j = obj;
        this.l = b.ROOT;
    }

    public void b2() {
        f2("null");
    }

    public final boolean c0(boolean z) {
        a aVar = this.f2458a;
        aVar.getClass();
        if (!z || (aVar.c & Feature.IgnoreNonFieldGetter.mask) == 0) {
            return false;
        }
        return true;
    }

    public abstract void c1();

    public final void c2() {
        if ((this.f2458a.c & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            L1(0);
        } else {
            b2();
        }
    }

    public void d1(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    public void d2(byte b2) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void e();

    public abstract void e1();

    public abstract void e2(char c);

    public final boolean f0() {
        if ((this.f2458a.c & Feature.BeanToArray.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract void f1(JSONObject jSONObject);

    public abstract void f2(String str);

    public abstract void g();

    public abstract void g1(List list);

    public abstract void g2(byte[] bArr);

    public void h1(Map map) {
        if (map == null) {
            b2();
            return;
        }
        long j = Feature.ReferenceDetection.mask | Feature.PrettyFormat.mask | Feature.NotWriteEmptyArray.mask | Feature.NotWriteDefaultValue.mask;
        a aVar = this.f2458a;
        if ((j & aVar.c) != 0) {
            aVar.e(map.getClass()).y(this, map, null, null, 0L);
            return;
        }
        i1('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                i1(',');
            }
            j1(entry.getKey());
            i1(f7l.CONDITION_IF_MIDDLE);
            j1(entry.getValue());
            z = false;
        }
        i1('}');
    }

    public void h2(char[] cArr, int i, int i2) {
        throw new JSONException("UnsupportedOperation");
    }

    public final boolean i0(long j) {
        if ((j & this.f2458a.c) != 0) {
            return true;
        }
        return false;
    }

    public abstract void i1(char c);

    public abstract void i2(String str);

    public void j1(Object obj) {
        if (obj == null) {
            b2();
            return;
        }
        Class<?> cls = obj.getClass();
        this.f2458a.f(cls, cls).y(this, obj, null, null, 0L);
    }

    public final void j2(Reader reader) {
        char c = this.f;
        e2(c);
        try {
            char[] cArr = new char[2048];
            while (true) {
                int read = reader.read(cArr, 0, 2048);
                if (read < 0) {
                    e2(c);
                    return;
                } else if (read > 0) {
                    n2(cArr, 0, read, false);
                }
            }
        } catch (Exception e) {
            throw new JSONException("read string from reader error", e);
        }
    }

    public void k1() {
        String str;
        if ((this.f2458a.c & (Feature.NullAsDefaultValue.mask | Feature.WriteNullListAsEmpty.mask)) != 0) {
            str = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        } else {
            str = "null";
        }
        f2(str);
    }

    public abstract void k2(String str);

    public abstract void l1(byte[] bArr);

    public void l2(List<String> list) {
        c1();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                t1();
            }
            k2(list.get(i));
        }
        e();
    }

    public abstract void m1(BigInteger bigInteger, long j);

    public abstract void m2(char[] cArr, int i, int i2);

    public final boolean n0(Feature feature) {
        if ((this.f2458a.c & feature.mask) != 0) {
            return true;
        }
        return false;
    }

    public void n1(byte[] bArr) {
        if (bArr == null) {
            k1();
        } else if ((this.f2458a.c & Feature.WriteByteArrayAsBase64.mask) != 0) {
            l1(bArr);
        } else {
            c1();
            for (int i = 0; i < bArr.length; i++) {
                if (i != 0) {
                    t1();
                }
                L1(bArr[i]);
            }
            e();
        }
    }

    public abstract void n2(char[] cArr, int i, int i2, boolean z);

    public void o1(boolean z) {
        String str;
        if ((this.f2458a.c & Feature.WriteBooleanAsNumber.mask) != 0) {
            i1(z ? '1' : '0');
            return;
        }
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        f2(str);
    }

    public abstract void o2(String[] strArr);

    public void p1(boolean[] zArr) {
        if (zArr == null) {
            k1();
            return;
        }
        c1();
        for (int i = 0; i < zArr.length; i++) {
            if (i != 0) {
                t1();
            }
            o1(zArr[i]);
        }
        e();
    }

    public void p2() {
        String str;
        long j = this.f2458a.c;
        if (((Feature.NullAsDefaultValue.mask | Feature.WriteNullStringAsEmpty.mask) & j) == 0) {
            str = "null";
        } else if ((j & Feature.UseSingleQuotes.mask) != 0) {
            str = "''";
        } else {
            str = "\"\"";
        }
        f2(str);
    }

    public final void q1() {
        if ((this.f2458a.c & (Feature.NullAsDefaultValue.mask | Feature.WriteNullBooleanAsFalse.mask)) != 0) {
            o1(false);
        } else {
            b2();
        }
    }

    public void q2(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void r1(char c);

    public void r2(String str) {
        k2(str);
    }

    public abstract void s1();

    public void s2(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void t1();

    public boolean t2(byte[] bArr, long j) {
        throw new JSONException("UnsupportedOperation");
    }

    public final boolean u0() {
        if ((this.f2458a.c & Feature.IgnoreErrorGetter.mask) != 0) {
            return true;
        }
        return false;
    }

    public abstract void u1(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void u2(UUID uuid);

    public abstract void v1(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract byte[] w();

    public abstract void w1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    public abstract void writeDouble(double d);

    public abstract void writeFloat(float f);

    public abstract void x1(int i, int i2, int i3);

    public abstract void y1(int i, int i2, int i3);

    public abstract void z1(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static final b ROOT = new b((b) null, "$");

        /* renamed from: a  reason: collision with root package name */
        public final b f2460a;
        public final String b;
        public final int c;
        public String d;
        public b e;
        public b f;

        public b(b bVar, String str) {
            this.f2460a = bVar;
            this.b = str;
            this.c = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.c;
            int i2 = bVar.c;
            b bVar2 = this.f2460a;
            b bVar3 = bVar.f2460a;
            if (i == i2 && bVar2 == bVar3) {
                return true;
            }
            String str = this.b;
            String str2 = bVar.b;
            if (bVar2 != null && bVar2.equals(bVar3) && str == str2) {
                return true;
            }
            if (str == null || !str.equals(str2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f2460a, this.b, Integer.valueOf(this.c)});
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x0178 A[FALL_THROUGH] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 488
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.b.toString():java.lang.String");
        }

        public b(b bVar, int i) {
            this.f2460a = bVar;
            this.b = null;
            this.c = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final z1 f2459a;
        public DateTimeFormatter b;
        public long c;
        public wqx d;

        public a(z1 z1Var) {
            if (z1Var != null) {
                oij[] oijVarArr = JSONFactory.f2450a;
                this.c = 0L;
                this.f2459a = z1Var;
                this.d = null;
                return;
            }
            throw new IllegalArgumentException("objectWriterProvider must not null");
        }

        public void a(Feature feature, boolean z) {
            if (z) {
                this.c = feature.mask | this.c;
                return;
            }
            this.c = (~feature.mask) & this.c;
        }

        public String b() {
            return null;
        }

        public DateTimeFormatter c() {
            return this.b;
        }

        public long d() {
            return this.c;
        }

        public <T> iik<T> e(Class<T> cls) {
            boolean z;
            if ((this.c & Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            return this.f2459a.k(cls, cls, z);
        }

        public <T> iik<T> f(Type type, Class<T> cls) {
            boolean z;
            if ((this.c & Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            return this.f2459a.k(type, cls, z);
        }

        public wqx g() {
            if (this.d == null) {
                this.d = wqx.d;
            }
            return this.d;
        }

        public boolean h() {
            return false;
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public boolean k(long j) {
            if ((j & this.c) != 0) {
                return true;
            }
            return false;
        }

        public boolean l(Feature feature) {
            if ((this.c & feature.mask) != 0) {
                return true;
            }
            return false;
        }

        public boolean m() {
            return false;
        }

        public a(z1 z1Var, Feature... featureArr) {
            if (z1Var != null) {
                oij[] oijVarArr = JSONFactory.f2450a;
                this.c = 0L;
                this.f2459a = z1Var;
                this.d = null;
                for (Feature feature : featureArr) {
                    this.c |= feature.mask;
                }
                oij[] oijVarArr2 = JSONFactory.f2450a;
                return;
            }
            throw new IllegalArgumentException("objectWriterProvider must not null");
        }
    }
}
