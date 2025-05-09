package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.taobao.tao.shop.common.ShopConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPOutputStream;
import tb.b2d;
import tb.bjk;
import tb.buf;
import tb.ckk;
import tb.f79;
import tb.f7l;
import tb.hjk;
import tb.iik;
import tb.lik;
import tb.ls9;
import tb.opf;
import tb.p7h;
import tb.pg1;
import tb.q7h;
import tb.tck;
import tb.vcf;
import tb.w1r;
import tb.wqx;
import tb.x9h;
import tb.xqx;
import tb.yik;
import tb.yqf;
import tb.ztf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FieldWriter<T> implements Comparable {
    static final AtomicReferenceFieldUpdater<FieldWriter, iik> y = AtomicReferenceFieldUpdater.newUpdater(FieldWriter.class, iik.class, "x");

    /* renamed from: a  reason: collision with root package name */
    public final String f2478a;
    public final Type b;
    public final Class c;
    public final long d;
    public final int e;
    public final String f;
    public final DecimalFormat g;
    public final String h;
    public final Field i;
    public final Method j;
    protected final long k;
    protected final boolean l;
    final long m;
    final byte[] n;
    final char[] o;
    final byte[] p;
    long q;
    final boolean r;
    final JSONWriter.b s;
    final boolean t;
    final boolean u;
    final boolean v;
    transient JSONWriter.b w;
    volatile iik x;

    public FieldWriter(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        if ("string".equals(str2) && cls != String.class) {
            j |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
        }
        this.f2478a = str;
        this.e = i;
        this.f = str2;
        this.h = str3;
        this.m = ls9.a(str);
        this.d = j;
        this.b = TypeUtils.p(type);
        this.c = cls;
        this.r = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.i = field;
        this.j = method;
        this.l = cls.isPrimitive();
        this.p = yqf.a(str);
        this.g = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.k = field != null ? opf.UNSAFE.objectFieldOffset(field) : -1L;
        this.t = pg1.ATOM_symbol.equals(str2);
        this.u = "trim".equals(str2);
        this.v = (j & f79.RAW_VALUE_MASK) != 0;
        this.s = new JSONWriter.b(JSONWriter.b.ROOT, str);
        int length = str.length();
        int i2 = length + 3;
        int i3 = i2;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt < 1 || charAt > 127) {
                i3 = charAt > 2047 ? i3 + 2 : i3 + 1;
            }
        }
        byte[] bArr = new byte[i3];
        bArr[0] = 34;
        int i5 = 1;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 1 && charAt2 <= 127) {
                i5++;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 > 2047) {
                bArr[i5] = (byte) (((charAt2 >> '\f') & 15) | 224);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                i5 += 3;
                bArr[i7] = (byte) ((charAt2 & f7l.CONDITION_IF) | 128);
            } else {
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >> 6) & 31) | tck.DETECT_WIDTH);
                i5 += 2;
                bArr[i8] = (byte) ((charAt2 & f7l.CONDITION_IF) | 128);
            }
        }
        bArr[i5] = 34;
        bArr[i5 + 1] = 58;
        this.n = bArr;
        char[] cArr = new char[i2];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = '\"';
        cArr[length + 2] = f7l.CONDITION_IF_MIDDLE;
        this.o = cArr;
    }

    private boolean B(JSONWriter jSONWriter, w1r w1rVar) {
        int identityHashCode = System.identityHashCode(w1rVar);
        long j = this.q;
        if (j == 0) {
            throw null;
        } else if (((int) j) == identityHashCode) {
            int i = (int) (j >> 32);
            if (i == -1) {
                return false;
            }
            jSONWriter.q2(-i);
            return true;
        } else {
            throw null;
        }
    }

    public static iik h(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            if (cls.isAssignableFrom(cls2)) {
                return ckk.h(type, cls2);
            }
            return ckk.d(cls2);
        } else if (Calendar.class.isAssignableFrom(cls2)) {
            if (str == null || str.isEmpty()) {
                return bjk.l;
            }
            return new bjk(str, locale);
        } else if (BigDecimal.class == cls2) {
            if (str == null || str.isEmpty()) {
                return yik.c;
            }
            return new yik(new DecimalFormat(str), null);
        } else if (BigDecimal[].class != cls2) {
            String name = cls2.getName();
            if (name.equals("java.sql.Date")) {
                return new hjk(str, locale);
            }
            if (name.equals("java.sql.Time")) {
                return ztf.J(str);
            }
            if (!name.equals("java.sql.Timestamp")) {
                return null;
            }
            return new buf(str);
        } else if (str == null || str.isEmpty()) {
            return new lik(BigDecimal.class, null);
        } else {
            return new lik(BigDecimal.class, new DecimalFormat(str));
        }
    }

    public final void A(JSONWriter jSONWriter) {
        if (jSONWriter.d) {
            jSONWriter.Z1(this.p, this.m);
            return;
        }
        if (!jSONWriter.e && (jSONWriter.f2458a.d() & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.b) {
                jSONWriter.Y1(this.n);
                return;
            } else if (jSONWriter.c) {
                jSONWriter.a2(this.o);
                return;
            }
        }
        jSONWriter.W1(this.f2478a);
        jSONWriter.s1();
    }

    public void C(JSONWriter jSONWriter, float f) {
        A(jSONWriter);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(f, decimalFormat);
        } else {
            jSONWriter.writeFloat(f);
        }
    }

    public void J(JSONWriter jSONWriter, float[] fArr) {
        if (fArr != null || jSONWriter.L0()) {
            A(jSONWriter);
            jSONWriter.F1(fArr);
        }
    }

    public void K(JSONWriter jSONWriter, short[] sArr) {
        if (sArr != null || jSONWriter.L0()) {
            A(jSONWriter);
            jSONWriter.K1(sArr);
        }
    }

    public void L(JSONWriter jSONWriter, int i) {
        A(jSONWriter);
        jSONWriter.L1(i);
    }

    public void M(JSONWriter jSONWriter, long j) {
        A(jSONWriter);
        if ((this.d & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.k2(Long.toString(j));
        } else {
            jSONWriter.O1(j);
        }
    }

    public void N(JSONWriter jSONWriter, boolean z, List list) {
        throw new UnsupportedOperationException();
    }

    public void O(JSONWriter jSONWriter, boolean z, List<String> list) {
        throw new UnsupportedOperationException();
    }

    public void P(JSONWriter jSONWriter, String str) {
        A(jSONWriter);
        if (str != null || (this.d & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
            if (this.u && str != null) {
                str = str.trim();
            }
            if (this.t && jSONWriter.d) {
                jSONWriter.r2(str);
            } else if (this.v) {
                jSONWriter.f2(str);
            } else {
                jSONWriter.k2(str);
            }
        } else {
            jSONWriter.k2("");
        }
    }

    public void Q(JSONWriter jSONWriter, char[] cArr) {
        if (cArr != null || jSONWriter.L0()) {
            A(jSONWriter);
            if (cArr == null) {
                jSONWriter.p2();
            } else {
                jSONWriter.m2(cArr, 0, cArr.length);
            }
        }
    }

    public abstract void R(JSONWriter jSONWriter, T t);

    public Object a(T t) {
        Throwable e;
        if (t != null) {
            Field field = this.i;
            if (field != null) {
                try {
                    long j = this.k;
                    if (j == -1 || this.l) {
                        return field.get(t);
                    }
                    return opf.UNSAFE.getObject(t, j);
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw new JSONException("field.get error, " + this.f2478a, e);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    throw new JSONException("field.get error, " + this.f2478a, e);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            throw new JSONException("field.get error, " + this.f2478a);
        }
    }

    public iik b() {
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Class<?> declaringClass;
        Class<?> declaringClass2;
        FieldWriter fieldWriter = (FieldWriter) obj;
        int i = this.e;
        int i2 = fieldWriter.e;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int compareTo = this.f2478a.compareTo(fieldWriter.f2478a);
        if (compareTo != 0) {
            return compareTo;
        }
        Member member = this.i;
        if (member == null) {
            member = this.j;
        }
        Member member2 = fieldWriter.i;
        if (member2 == null) {
            member2 = fieldWriter.j;
        }
        if (!(member == null || member2 == null || (declaringClass2 = member.getDeclaringClass()) == (declaringClass = member2.getDeclaringClass()))) {
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return 1;
            }
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return -1;
            }
        }
        if ((member instanceof Field) && (member2 instanceof Method)) {
            return -1;
        }
        boolean z = member instanceof Method;
        if (z && (member2 instanceof Field)) {
            return 1;
        }
        Class cls = fieldWriter.c;
        Class<?> cls2 = this.c;
        if (!(cls2 == cls || cls2 == null || cls == null)) {
            if (cls2.isAssignableFrom(cls)) {
                return 1;
            }
            if (cls.isAssignableFrom(cls2)) {
                return -1;
            }
        }
        Class cls3 = Boolean.TYPE;
        if (cls2 == cls3 && cls != cls3) {
            return 1;
        }
        if (cls2 == Boolean.class && cls == Boolean.class && z && (member2 instanceof Method)) {
            String name = ((Method) member).getName();
            String name2 = ((Method) member2).getName();
            if (name.startsWith("is") && name2.startsWith("get")) {
                return 1;
            }
            if (name.startsWith("get") && name2.startsWith("is")) {
                return -1;
            }
        }
        if (z && (member2 instanceof Method)) {
            String name3 = ((Method) member).getName();
            String name4 = ((Method) member2).getName();
            if (!name3.equals(name4)) {
                String K = BeanUtils.K(name3, null);
                String K2 = BeanUtils.K(name4, null);
                if (this.f2478a.equals(K) && !fieldWriter.f2478a.equals(K2)) {
                    return 1;
                }
                if (this.f2478a.equals(K2) && !fieldWriter.f2478a.equals(K)) {
                    return -1;
                }
            }
        }
        return compareTo;
    }

    public Class d() {
        return null;
    }

    public Type e() {
        return null;
    }

    public iik f(JSONWriter jSONWriter, Type type) {
        return jSONWriter.L(type, null);
    }

    public iik g(JSONWriter jSONWriter, Class cls) {
        if (cls == Float[].class) {
            if (this.g != null) {
                return new lik(Float.class, this.g);
            }
            return lik.FLOAT_ARRAY;
        } else if (cls == Double[].class) {
            if (this.g != null) {
                return new lik(Double.class, this.g);
            }
            return lik.DOUBLE_ARRAY;
        } else if (cls != BigDecimal[].class) {
            return jSONWriter.F(cls);
        } else {
            if (this.g != null) {
                return new lik(BigDecimal.class, this.g);
            }
            return lik.DECIMAL_ARRAY;
        }
    }

    public final JSONWriter.b i(JSONWriter.b bVar) {
        JSONWriter.b bVar2 = this.w;
        if (bVar2 == null) {
            JSONWriter.b bVar3 = new JSONWriter.b(bVar, this.f2478a);
            this.w = bVar3;
            return bVar3;
        } else if (bVar2.f2460a == bVar) {
            return bVar2;
        } else {
            return new JSONWriter.b(bVar, this.f2478a);
        }
    }

    public final JSONWriter.b j() {
        return this.s;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return this.r;
    }

    public boolean n() {
        return false;
    }

    public abstract boolean o(JSONWriter jSONWriter, T t);

    public void q(JSONWriter jSONWriter, boolean z) {
        throw new UnsupportedOperationException();
    }

    public void r(JSONWriter jSONWriter, boolean[] zArr) {
        if (zArr != null || jSONWriter.L0()) {
            A(jSONWriter);
            jSONWriter.p1(zArr);
        }
    }

    public void s(JSONWriter jSONWriter, long j) {
        t(jSONWriter, true, j);
    }

    public void t(JSONWriter jSONWriter, boolean z, long j) {
        vcf d;
        long j2;
        if (jSONWriter.d) {
            jSONWriter.T1(j);
            return;
        }
        if (!l()) {
            JSONWriter.a aVar = jSONWriter.f2458a;
            if (!aVar.i()) {
                wqx g = aVar.g();
                if (aVar.b() == null) {
                    long a2 = vcf.d(j).f29921a + g.a(d);
                    long e = b2d.e(a2, 86400L);
                    int f = (int) b2d.f(a2, 86400L);
                    long j3 = 719468 + e;
                    if (j3 < 0) {
                        long j4 = ((e + 719469) / 146097) - 1;
                        j2 = j4 * 400;
                        j3 += (-j4) * 146097;
                    } else {
                        j2 = 0;
                    }
                    long j5 = ((j3 * 400) + 591) / 146097;
                    long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
                    if (j6 < 0) {
                        j5--;
                        j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
                    }
                    int i = (int) j6;
                    int i2 = ((i * 5) + 2) / 153;
                    int i3 = ((i2 + 2) % 12) + 1;
                    int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
                    int c = q7h.c(j5 + j2 + (i2 / 10));
                    long j7 = f;
                    q7h.b(j7);
                    int i5 = (int) (j7 / 3600);
                    long j8 = j7 - (i5 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                    int i6 = (int) (j8 / 60);
                    int i7 = (int) (j8 - (i6 * 60));
                    if (z) {
                        A(jSONWriter);
                    }
                    jSONWriter.v1(c, i3, i4, i5, i6, i7);
                    return;
                }
                xqx d2 = xqx.d(vcf.d(j), g);
                if (k() || aVar.h()) {
                    q7h q7hVar = d2.f31549a;
                    p7h p7hVar = q7hVar.f26561a;
                    int i8 = p7hVar.f25919a;
                    x9h x9hVar = q7hVar.b;
                    jSONWriter.w1(i8, p7hVar.b, p7hVar.c, x9hVar.f31233a, x9hVar.b, x9hVar.c, x9hVar.d / 1000000, d2.b, true);
                    return;
                }
                String c2 = aVar.c().c(d2);
                if (z) {
                    A(jSONWriter);
                }
                jSONWriter.k2(c2);
                return;
            }
        }
        if (z) {
            A(jSONWriter);
        }
        jSONWriter.O1(j);
    }

    public String toString() {
        return this.f2478a;
    }

    public void u(JSONWriter jSONWriter, boolean z, Date date) {
        if (date == null) {
            if (z) {
                A(jSONWriter);
            }
            jSONWriter.b2();
            return;
        }
        t(jSONWriter, z, date.getTime());
    }

    public void v(JSONWriter jSONWriter, double d) {
        A(jSONWriter);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.A1(d, decimalFormat);
        } else {
            jSONWriter.writeDouble(d);
        }
    }

    public void w(JSONWriter jSONWriter, Double d) {
        if (d == null) {
            long C = jSONWriter.C(this.d);
            if ((JSONWriter.Feature.WriteNulls.mask & C) != 0 && (C & JSONWriter.Feature.NotWriteDefaultValue.mask) == 0) {
                A(jSONWriter);
                jSONWriter.c2();
                return;
            }
            return;
        }
        A(jSONWriter);
        jSONWriter.writeDouble(d.doubleValue());
    }

    public void x(JSONWriter jSONWriter, double[] dArr) {
        if (dArr != null || jSONWriter.L0()) {
            A(jSONWriter);
            jSONWriter.B1(dArr);
        }
    }

    public void y(JSONWriter jSONWriter, Enum r2) {
        A(jSONWriter);
        jSONWriter.D1(r2);
    }

    public void z(JSONWriter jSONWriter, Enum r2) {
        throw new UnsupportedOperationException();
    }

    public void p(JSONWriter jSONWriter, byte[] bArr) {
        if (bArr != null) {
            A(jSONWriter);
            if ("base64".equals(this.f) || (this.f == null && (jSONWriter.C(this.d) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0)) {
                jSONWriter.l1(bArr);
            } else if ("hex".equals(this.f)) {
                jSONWriter.H1(bArr);
            } else if ("gzip,base64".equals(this.f) || "gzip".equals(this.f)) {
                GZIPOutputStream gZIPOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (bArr.length < 512) {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                        } else {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        }
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        b2d.b(gZIPOutputStream);
                        jSONWriter.l1(byteArray);
                    } catch (IOException e) {
                        throw new JSONException("write gzipBytes error", e);
                    }
                } catch (Throwable th) {
                    b2d.b(gZIPOutputStream);
                    throw th;
                }
            } else {
                jSONWriter.n1(bArr);
            }
        } else if (jSONWriter.L0()) {
            A(jSONWriter);
            jSONWriter.k1();
        }
    }
}
