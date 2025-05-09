package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import tb.iik;
import tb.ijk;
import tb.lik;
import tb.ljk;
import tb.yik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class d1<T> extends FieldWriter<T> {
    final Class A;
    iik B;
    final Type z;

    public d1(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Method method) {
        super(str, i, j, str2, str3, type2, cls, null, method);
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
        Class<?> cls;
        boolean z2;
        iik iikVar;
        String Y0;
        String a1;
        if (z) {
            A(jSONWriter);
        }
        boolean B0 = jSONWriter.B0();
        if (!B0 || (a1 = jSONWriter.a1(this.f2478a, objArr)) == null) {
            Class<?> cls2 = null;
            if (jSONWriter.d) {
                Class<?> cls3 = objArr.getClass();
                if (cls3 != this.c) {
                    jSONWriter.s2(TypeUtils.n(cls3));
                }
                int length = objArr.length;
                jSONWriter.d1(length);
                iik iikVar2 = null;
                boolean z3 = B0;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        jSONWriter.b2();
                    } else {
                        Class<?> cls4 = obj.getClass();
                        if (cls4 != cls2) {
                            boolean B02 = jSONWriter.B0();
                            iik f = f(jSONWriter, cls4);
                            if (B02) {
                                B02 = !z1.n(cls4);
                            }
                            z2 = B02;
                            iikVar = f;
                            cls = cls4;
                        } else {
                            iikVar = iikVar2;
                            z2 = z3;
                            cls = cls2;
                        }
                        if (!z2 || (Y0 = jSONWriter.Y0(i, obj)) == null) {
                            iikVar.e(jSONWriter, obj, Integer.valueOf(i), this.z, this.d);
                            if (z2) {
                                jSONWriter.X0(obj);
                            }
                        } else {
                            jSONWriter.i2(Y0);
                            jSONWriter.X0(obj);
                        }
                        iikVar2 = iikVar;
                        z3 = z2;
                        cls2 = cls;
                    }
                }
                if (B0) {
                    jSONWriter.X0(objArr);
                    return;
                }
                return;
            }
            jSONWriter.c1();
            iik iikVar3 = null;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                if (i2 != 0) {
                    jSONWriter.t1();
                }
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls5 = obj2.getClass();
                    if (cls5 != cls2) {
                        iikVar3 = f(jSONWriter, cls5);
                        cls2 = cls5;
                    }
                    iikVar3.k(jSONWriter, obj2);
                }
            }
            jSONWriter.e();
            return;
        }
        jSONWriter.i2(a1);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("field.get error, " + this.f2478a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik f(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.z) {
            return jSONWriter.L(type, null);
        }
        iik iikVar = this.B;
        if (iikVar != null) {
            return iikVar;
        }
        if (type == Float[].class) {
            if (this.g != null) {
                return new lik(Float.class, this.g);
            }
            return lik.FLOAT_ARRAY;
        } else if (type == Double[].class) {
            if (this.g != null) {
                return new lik(Double.class, this.g);
            }
            return lik.DOUBLE_ARRAY;
        } else if (type == BigDecimal[].class) {
            if (this.g != null) {
                return new lik(BigDecimal.class, this.g);
            }
            return lik.DECIMAL_ARRAY;
        } else if (type == Float.class) {
            if (this.g != null) {
                return new ljk(this.g);
            }
            return ljk.b;
        } else if (type == Double.class) {
            if (this.g != null) {
                return new ijk(this.g);
            }
            return ijk.b;
        } else if (type != BigDecimal.class) {
            iik L = jSONWriter.L(this.z, this.A);
            this.B = L;
            return L;
        } else if (this.g != null) {
            return new yik(this.g, null);
        } else {
            return yik.c;
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
