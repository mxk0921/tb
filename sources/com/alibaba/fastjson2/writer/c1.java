package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import tb.ekk;
import tb.iik;
import tb.ijk;
import tb.lik;
import tb.ljk;
import tb.yik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class c1<T> extends FieldWriter<T> {
    final Class A;
    iik B;
    final Type z;

    public c1(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field) {
        super(str, i, j, str2, str3, type2, cls, field, null);
        this.z = type;
        if (type instanceof Class) {
            this.A = (Class) type;
        } else {
            this.A = TypeUtils.m(type);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a(t);
        if (objArr == null) {
            jSONWriter.b2();
        } else {
            S(jSONWriter, false, objArr);
        }
    }

    public void S(JSONWriter jSONWriter, boolean z, Object[] objArr) {
        boolean z2;
        Class<?> cls;
        iik iikVar;
        boolean z3;
        Class<?> cls2;
        iik iikVar2;
        String Y0;
        String a1;
        long A = jSONWriter.A() | this.d;
        if ((JSONWriter.Feature.ReferenceDetection.mask & A) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (objArr.length != 0 || (JSONWriter.Feature.NotWriteEmptyArray.mask & A) == 0) {
                A(jSONWriter);
            } else {
                return;
            }
        }
        if (!z2 || (a1 = jSONWriter.a1(this.f2478a, objArr)) == null) {
            Class<?> cls3 = null;
            if (jSONWriter.d) {
                Class<?> cls4 = objArr.getClass();
                if (cls4 != this.c) {
                    jSONWriter.s2(TypeUtils.n(cls4));
                }
                int length = objArr.length;
                jSONWriter.d1(length);
                iik iikVar3 = null;
                boolean z4 = z2;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        jSONWriter.b2();
                    } else {
                        Class<?> cls5 = obj.getClass();
                        if (cls5 != cls3) {
                            boolean B0 = jSONWriter.B0();
                            iik f = f(jSONWriter, cls5);
                            if (B0) {
                                B0 = !z1.n(cls5);
                            }
                            iikVar2 = f;
                            z3 = B0;
                            cls2 = cls5;
                        } else {
                            iikVar2 = iikVar3;
                            cls2 = cls3;
                            z3 = z4;
                        }
                        if (!z3 || (Y0 = jSONWriter.Y0(i, obj)) == null) {
                            iikVar2.e(jSONWriter, obj, Integer.valueOf(i), this.z, this.d);
                            if (z3) {
                                jSONWriter.X0(obj);
                            }
                        } else {
                            jSONWriter.i2(Y0);
                            jSONWriter.X0(obj);
                        }
                        iikVar3 = iikVar2;
                        cls3 = cls2;
                        z4 = z3;
                    }
                }
                if (z2) {
                    jSONWriter.X0(objArr);
                    return;
                }
                return;
            }
            jSONWriter.c1();
            iik iikVar4 = null;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                if (i2 != 0) {
                    jSONWriter.t1();
                }
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls6 = obj2.getClass();
                    if (cls6 == cls3) {
                        iikVar = iikVar4;
                        cls = cls3;
                    } else {
                        iikVar = f(jSONWriter, cls6);
                        cls = cls6;
                    }
                    iikVar4 = iikVar;
                    iikVar4.y(jSONWriter, obj2, Integer.valueOf(i2), this.b, A);
                    cls3 = cls;
                }
            }
            jSONWriter.e();
            return;
        }
        jSONWriter.i2(a1);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik f(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.z) {
            return jSONWriter.L(type, TypeUtils.i(type));
        }
        iik iikVar = this.B;
        if (iikVar != null) {
            return iikVar;
        }
        if (type == Double.class) {
            this.B = new ijk(new DecimalFormat(this.f));
        } else if (type == Float.class) {
            this.B = new ljk(new DecimalFormat(this.f));
        } else if (type != BigDecimal.class || this.g == null) {
            this.B = jSONWriter.L(this.z, this.A);
        } else {
            this.B = new yik(this.g, null);
        }
        return this.B;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        if (cls == String[].class) {
            return ekk.c;
        }
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

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a(t);
        if (objArr != null) {
            S(jSONWriter, true, objArr);
            return true;
        } else if (((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        } else {
            A(jSONWriter);
            jSONWriter.k1();
            return true;
        }
    }
}
