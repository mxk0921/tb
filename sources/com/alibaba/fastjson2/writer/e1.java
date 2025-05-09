package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.iik;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class e1<T> extends FieldWriterObject<T> {
    final Type E;
    final Class F;
    volatile iik G;
    final boolean H;

    public e1(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.E = type;
        this.F = cls;
        this.H = !z1.n(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        boolean z;
        Object a2 = a(t);
        if (a2 == null) {
            jSONWriter.b2();
            return;
        }
        boolean z2 = false;
        if (!this.H || !jSONWriter.B0()) {
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
        iik g = g(jSONWriter, this.F);
        if ((jSONWriter.C(this.d) & JSONWriter.Feature.BeanToArray.mask) != 0) {
            z2 = true;
        }
        if (jSONWriter.d) {
            if (z2) {
                g.l(jSONWriter, a2, this.f2478a, this.E, this.d);
            } else {
                g.e(jSONWriter, a2, this.f2478a, this.E, this.d);
            }
        } else if (z2) {
            g.C(jSONWriter, a2, this.f2478a, this.E, this.d);
        } else {
            g.y(jSONWriter, a2, this.f2478a, this.E, this.d);
        }
        if (z) {
            jSONWriter.X0(a2);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        if (this.F != cls) {
            return super.g(jSONWriter, cls);
        }
        if (this.G != null) {
            return this.G;
        }
        iik g = super.g(jSONWriter, cls);
        this.G = g;
        return g;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Object a2 = a(t);
            if (a2 != null) {
                iik g = g(jSONWriter, this.F);
                A(jSONWriter);
                if (jSONWriter.d) {
                    g.e(jSONWriter, a2, this.f2478a, this.E, this.d);
                } else {
                    g.y(jSONWriter, a2, this.f2478a, this.E, this.d);
                }
                return true;
            } else if (((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            } else {
                A(jSONWriter);
                if (this.F.isArray()) {
                    jSONWriter.k1();
                } else {
                    Class cls = this.F;
                    if (cls == StringBuffer.class || cls == StringBuilder.class) {
                        jSONWriter.p2();
                    } else {
                        jSONWriter.b2();
                    }
                }
                return true;
            }
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
