package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import tb.akk;
import tb.hjk;
import tb.iik;
import tb.ijk;
import tb.ljk;
import tb.yik;
import tb.yjk;
import tb.zjk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class u0<T> extends FieldWriter<T> {
    final Class A;
    final boolean B;
    iik C;
    iik D;
    final Type z;

    public u0(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type2, cls, field, method);
        Type type3;
        boolean z;
        if (type == null) {
            type3 = Object.class;
        } else {
            type3 = type;
        }
        this.z = type3;
        if (type3 instanceof Class) {
            Class cls2 = (Class) type;
            this.A = cls2;
            if (cls2 != null) {
                if (Enum.class.isAssignableFrom(cls2)) {
                    this.C = new zjk(cls, cls2, j);
                } else if (cls2 == String.class) {
                    this.C = akk.f15790a;
                } else {
                    this.C = new yjk(cls, type2, cls2, type, j);
                }
            }
        } else {
            this.A = TypeUtils.m(type);
        }
        Class cls3 = this.A;
        if (cls3 == null || !z1.n(cls3)) {
            z = false;
        } else {
            z = true;
        }
        this.B = z;
        if (str2 != null && this.A == Date.class) {
            this.D = new hjk(str2, null);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void N(JSONWriter jSONWriter, boolean z, List list) {
        boolean z2;
        iik iikVar;
        Class<?> cls;
        boolean z3;
        String Y0;
        if (jSONWriter.d) {
            S(jSONWriter, z, list);
            return;
        }
        long C = jSONWriter.C(this.d);
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & C) == 0 || !list.isEmpty() || !z) {
            if ((JSONWriter.Feature.ReferenceDetection.mask & C) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                A(jSONWriter);
            }
            jSONWriter.c1();
            Class<?> cls2 = null;
            iik iikVar2 = null;
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                Object obj = list.get(i);
                if (obj == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls3 = obj.getClass();
                    if (cls3 == String.class) {
                        jSONWriter.k2((String) obj);
                    } else {
                        if (cls3 == cls2) {
                            z3 = z2;
                            cls = cls2;
                            iikVar = iikVar2;
                        } else {
                            boolean B0 = jSONWriter.B0();
                            iik f = f(jSONWriter, cls3);
                            if (B0) {
                                B0 = !z1.n(cls3);
                            }
                            z3 = B0;
                            iikVar = f;
                            cls = cls3;
                        }
                        if (!z3 || (Y0 = jSONWriter.Y0(i, obj)) == null) {
                            iikVar.y(jSONWriter, obj, null, this.z, C);
                            if (z3) {
                                jSONWriter.X0(obj);
                            }
                        } else {
                            jSONWriter.i2(Y0);
                            jSONWriter.X0(obj);
                        }
                        z2 = z3;
                        cls2 = cls;
                        iikVar2 = iikVar;
                    }
                }
            }
            jSONWriter.e();
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void O(JSONWriter jSONWriter, boolean z, List<String> list) {
        if (z) {
            A(jSONWriter);
        }
        if (jSONWriter.d && jSONWriter.O0(list, this.c)) {
            jSONWriter.s2(TypeUtils.n(list.getClass()));
        }
        jSONWriter.l2(list);
    }

    public final void S(JSONWriter jSONWriter, boolean z, List list) {
        boolean z2;
        boolean z3;
        iik iikVar;
        Class<?> cls;
        boolean z4;
        Object obj;
        String Y0;
        iik f;
        boolean n;
        long C = jSONWriter.C(this.d);
        if ((JSONWriter.Feature.BeanToArray.mask & C) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & C) == 0 || !list.isEmpty() || !z) {
            if ((JSONWriter.Feature.ReferenceDetection.mask & C) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                A(jSONWriter);
            }
            int size = list.size();
            if (jSONWriter.O0(list, this.c)) {
                jSONWriter.s2(TypeUtils.n(list.getClass()));
            }
            jSONWriter.d1(size);
            Class<?> cls2 = null;
            iik iikVar2 = null;
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls3 = obj2.getClass();
                    if (cls3 != cls2) {
                        boolean B0 = jSONWriter.B0();
                        if (cls3 != this.z || (f = this.D) == null) {
                            f = f(jSONWriter, cls3);
                        }
                        if (B0) {
                            if (cls3 == this.A) {
                                n = this.B;
                            } else {
                                n = z1.n(cls3);
                            }
                            B0 = !n;
                        }
                        z4 = B0;
                        iikVar = f;
                        cls = cls3;
                    } else {
                        z4 = z3;
                        cls = cls2;
                        iikVar = iikVar2;
                    }
                    if (!z4 || (Y0 = jSONWriter.Y0(i, obj2)) == null) {
                        if (z2) {
                            obj = obj2;
                            iikVar.l(jSONWriter, obj2, Integer.valueOf(i), this.z, C);
                        } else {
                            obj = obj2;
                            iikVar.e(jSONWriter, obj, Integer.valueOf(i), this.z, C);
                        }
                        if (z4) {
                            jSONWriter.X0(obj);
                        }
                    } else {
                        jSONWriter.i2(Y0);
                        jSONWriter.X0(obj2);
                    }
                    z3 = z4;
                    cls2 = cls;
                    iikVar2 = iikVar;
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Class d() {
        return this.A;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Type e() {
        return this.z;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik f(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.z) {
            return jSONWriter.L(type, TypeUtils.i(type));
        }
        iik iikVar = this.D;
        if (iikVar != null) {
            return iikVar;
        }
        if (this.f != null) {
            if (type == Double.class) {
                ijk ijkVar = new ijk(new DecimalFormat(this.f));
                this.D = ijkVar;
                return ijkVar;
            } else if (type == Float.class) {
                ljk ljkVar = new ljk(new DecimalFormat(this.f));
                this.D = ljkVar;
                return ljkVar;
            } else if (type == BigDecimal.class) {
                yik yikVar = new yik(new DecimalFormat(this.f), null);
                this.D = yikVar;
                return yikVar;
            }
        }
        iik L = jSONWriter.L(this.z, this.A);
        this.D = L;
        return L;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        iik iikVar = this.C;
        if (iikVar != null && this.c.isAssignableFrom(cls)) {
            return iikVar;
        }
        if (iikVar != null || cls != this.c) {
            return jSONWriter.F(cls);
        }
        iik F = jSONWriter.F(cls);
        this.C = F;
        return F;
    }
}
