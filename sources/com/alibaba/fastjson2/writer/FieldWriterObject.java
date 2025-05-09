package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.z1;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.ckk;
import tb.f79;
import tb.gjk;
import tb.h30;
import tb.iik;
import tb.jik;
import tb.jjk;
import tb.lik;
import tb.mjk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FieldWriterObject<T> extends FieldWriter<T> {
    static final AtomicReferenceFieldUpdater<FieldWriterObject, Class> D = AtomicReferenceFieldUpdater.newUpdater(FieldWriterObject.class, Class.class, AmnetConstant.VAL_SUPPORT_ZSTD);
    final boolean A;
    final boolean B;
    final boolean C;
    volatile Class z;

    public FieldWriterObject(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        boolean z;
        boolean z2 = false;
        if ((f79.UNWRAPPED_MASK & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.A = z;
        if (cls == Currency.class) {
            this.z = cls;
            this.x = gjk.c;
        }
        this.B = (cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class) ? true : z2;
        this.C = Number.class.isAssignableFrom(cls);
    }

    private iik S(JSONWriter jSONWriter, Class cls) {
        iik iikVar;
        if (!Map.class.isAssignableFrom(cls)) {
            iikVar = jSONWriter.F(cls);
        } else if (this.c.isAssignableFrom(cls)) {
            iikVar = ckk.h(this.b, cls);
        } else {
            iikVar = ckk.d(cls);
        }
        h30.a(FieldWriter.y, this, null, iikVar);
        return iikVar;
    }

    private iik T(JSONWriter jSONWriter, Class cls) {
        if (!Map.class.isAssignableFrom(cls)) {
            String str = this.f;
            iik iikVar = null;
            if (str != null) {
                iikVar = FieldWriter.h(this.b, this.c, str, null, cls);
            }
            if (iikVar == null) {
                return jSONWriter.F(cls);
            }
            return iikVar;
        } else if (this.c.isAssignableFrom(cls)) {
            return ckk.h(this.b, cls);
        } else {
            return ckk.d(cls);
        }
    }

    private iik U(JSONWriter jSONWriter, Class cls) {
        iik iikVar;
        boolean z;
        if (this.f == null) {
            JSONWriter.a aVar = jSONWriter.f2458a;
            if (((this.d | aVar.d()) & JSONWriter.Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            iikVar = aVar.f2459a.l(cls, cls, z);
        } else {
            iikVar = null;
        }
        DecimalFormat decimalFormat = this.g;
        if (cls == Float[].class) {
            if (decimalFormat != null) {
                iikVar = new lik(Float.class, decimalFormat);
            } else {
                iikVar = lik.FLOAT_ARRAY;
            }
        } else if (cls == Double[].class) {
            if (decimalFormat != null) {
                iikVar = new lik(Double.class, decimalFormat);
            } else {
                iikVar = lik.DOUBLE_ARRAY;
            }
        } else if (cls == float[].class) {
            if (decimalFormat != null) {
                iikVar = new mjk(decimalFormat);
            } else {
                iikVar = mjk.c;
            }
        } else if (cls == double[].class) {
            if (decimalFormat != null) {
                iikVar = new jjk(decimalFormat);
            } else {
                iikVar = jjk.b;
            }
        }
        if (iikVar == null) {
            iikVar = FieldWriter.h(this.b, this.c, this.f, null, cls);
        }
        if (iikVar == null) {
            boolean a2 = h30.a(D, this, null, cls);
            iik F = jSONWriter.F(cls);
            if (a2) {
                h30.a(FieldWriter.y, this, null, F);
            }
            return F;
        } else if (this.x != null || !h30.a(D, this, null, cls)) {
            return iikVar;
        } else {
            h30.a(FieldWriter.y, this, null, iikVar);
            return iikVar;
        }
    }

    public static boolean V(Class cls, Class cls2) {
        if ((cls == Integer.TYPE && cls2 == Integer.class) || ((cls == Long.TYPE && cls2 == Long.class) || ((cls == Boolean.TYPE && cls2 == Boolean.class) || ((cls == Short.TYPE && cls2 == Short.class) || ((cls == Byte.TYPE && cls2 == Byte.class) || ((cls == Float.TYPE && cls2 == Float.class) || ((cls == Double.TYPE && cls2 == Double.class) || (cls == Character.TYPE && cls2 == Character.class)))))))) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        iik iikVar;
        boolean z;
        Object a2 = a(t);
        if (a2 == null) {
            jSONWriter.b2();
            return;
        }
        Class<?> cls = a2.getClass();
        if (this.z == null) {
            this.z = cls;
            iikVar = g(jSONWriter, cls);
            h30.a(FieldWriter.y, this, null, iikVar);
        } else if (this.z == cls) {
            iikVar = this.x;
        } else {
            iikVar = jSONWriter.F(cls);
        }
        if (iikVar != null) {
            if (!jSONWriter.B0() || z1.n(cls)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (a2 == t) {
                    jSONWriter.i2("..");
                    return;
                }
                String a1 = jSONWriter.a1(this.f2478a, a2);
                if (a1 != null) {
                    jSONWriter.i2(a1);
                    jSONWriter.X0(a2);
                    return;
                }
            }
            if (!jSONWriter.d) {
                iikVar.y(jSONWriter, a2, this.f2478a, this.c, this.d);
            } else if (jSONWriter.f0()) {
                iikVar.l(jSONWriter, a2, this.f2478a, this.c, this.d);
            } else {
                iikVar.e(jSONWriter, a2, this.f2478a, this.c, this.d);
            }
            if (z) {
                jSONWriter.X0(a2);
                return;
            }
            return;
        }
        throw new JSONException("get value writer error, valueType : " + cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik b() {
        return this.x;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        boolean z;
        Class cls2 = this.z;
        if (cls2 == null || this.x == z1.a.INSTANCE) {
            return U(jSONWriter, cls);
        }
        if (cls2 == cls || ((cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls)))) {
            z = true;
        } else {
            z = false;
        }
        if (!z && cls2.isPrimitive()) {
            z = V(cls2, cls);
        }
        if (!z) {
            return T(jSONWriter, cls);
        }
        if (this.x == null) {
            return S(jSONWriter, cls);
        }
        return this.x;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean n() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        Field field;
        Class cls;
        long A = this.d | jSONWriter.A();
        if (!(this.r || (JSONWriter.Feature.IgnoreNoneSerializable.mask & A) == 0)) {
            return false;
        }
        try {
            Object a2 = a(t);
            if (a2 == null) {
                if ((JSONWriter.Feature.WriteNulls.mask & A) == 0 || (JSONWriter.Feature.NotWriteDefaultValue.mask & A) != 0) {
                    long j = JSONWriter.Feature.WriteNullNumberAsZero.mask;
                    long j2 = JSONWriter.Feature.NullAsDefaultValue.mask;
                    if (((j | j2) & A) != 0 && this.C) {
                        A(jSONWriter);
                        jSONWriter.L1(0);
                        return true;
                    } else if ((A & (JSONWriter.Feature.WriteNullBooleanAsFalse.mask | j2)) == 0 || ((cls = this.c) != Boolean.class && cls != AtomicBoolean.class)) {
                        return false;
                    } else {
                        A(jSONWriter);
                        jSONWriter.o1(false);
                        return true;
                    }
                } else {
                    A(jSONWriter);
                    if (this.B) {
                        jSONWriter.k1();
                    } else if (this.C) {
                        jSONWriter.c2();
                    } else {
                        Class cls2 = this.c;
                        if (cls2 == Appendable.class || cls2 == StringBuffer.class || cls2 == StringBuilder.class) {
                            jSONWriter.p2();
                        } else {
                            jSONWriter.b2();
                        }
                    }
                    return true;
                }
            } else if (a2 == t && this.c == Throwable.class && (field = this.i) != null && field.getDeclaringClass() == Throwable.class) {
                return false;
            } else {
                if (!((JSONWriter.Feature.IgnoreNoneSerializable.mask & A) == 0 || (a2 instanceof Serializable))) {
                    return false;
                }
                boolean C0 = jSONWriter.C0(a2);
                if (C0) {
                    if (a2 == t) {
                        A(jSONWriter);
                        jSONWriter.i2("..");
                        return true;
                    }
                    String Z0 = jSONWriter.Z0(this, a2);
                    if (Z0 != null) {
                        A(jSONWriter);
                        jSONWriter.i2(Z0);
                        jSONWriter.X0(a2);
                        return true;
                    }
                }
                Class<?> cls3 = a2.getClass();
                if (cls3 == byte[].class) {
                    p(jSONWriter, (byte[]) a2);
                    return true;
                }
                iik g = g(jSONWriter, cls3);
                if (g != null) {
                    boolean z = this.A;
                    boolean z2 = jSONWriter.d;
                    if (z) {
                        if (a2 instanceof Map) {
                            for (Map.Entry entry : ((Map) a2).entrySet()) {
                                String obj = entry.getKey().toString();
                                Object value = entry.getValue();
                                if (value != null || (JSONWriter.Feature.WriteNulls.mask & A) != 0) {
                                    jSONWriter.W1(obj);
                                    if (!z2) {
                                        jSONWriter.s1();
                                    }
                                    if (value == null) {
                                        jSONWriter.b2();
                                    } else {
                                        jSONWriter.F(value.getClass()).k(jSONWriter, value);
                                    }
                                }
                            }
                            if (C0) {
                                jSONWriter.X0(a2);
                            }
                            return true;
                        } else if (g instanceof jik) {
                            for (FieldWriter fieldWriter : ((jik) g).g) {
                                fieldWriter.o(jSONWriter, a2);
                            }
                            return true;
                        }
                    }
                    A(jSONWriter);
                    long j3 = this.d;
                    if ((JSONWriter.Feature.BeanToArray.mask & j3) != 0) {
                        if (z2) {
                            g.l(jSONWriter, a2, this.f2478a, this.b, j3);
                        } else {
                            g.C(jSONWriter, a2, this.f2478a, this.b, j3);
                        }
                    } else if (z2) {
                        g.e(jSONWriter, a2, this.f2478a, this.b, j3);
                    } else {
                        g.y(jSONWriter, a2, this.f2478a, this.b, j3);
                    }
                    if (C0) {
                        jSONWriter.X0(a2);
                    }
                    return true;
                }
                throw new JSONException("get objectWriter error : " + cls3);
            }
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
