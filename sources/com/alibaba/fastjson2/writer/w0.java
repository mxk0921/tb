package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import tb.iik;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class w0<T> extends u0<T> {
    final k2a<T, List> E;

    public w0(String str, int i, long j, String str2, String str3, Type type, Method method, k2a<T, List> k2aVar, Type type2, Class cls) {
        super(str, type, i, j, str2, str3, type2, cls, null, method);
        this.E = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        List apply = this.E.apply(t);
        if (apply == null) {
            jSONWriter.b2();
            return;
        }
        int i = 0;
        Class<?> cls = null;
        if (jSONWriter.d) {
            int size = apply.size();
            jSONWriter.d1(size);
            iik iikVar = null;
            while (i < size) {
                Object obj = apply.get(i);
                if (obj == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2 != cls) {
                        iikVar = f(jSONWriter, cls2);
                        cls = cls2;
                    }
                    iikVar.k(jSONWriter, obj);
                }
                i++;
            }
            return;
        }
        jSONWriter.c1();
        iik iikVar2 = null;
        while (i < apply.size()) {
            if (i != 0) {
                jSONWriter.t1();
            }
            Object obj2 = apply.get(i);
            if (obj2 == null) {
                jSONWriter.b2();
            } else {
                Class<?> cls3 = obj2.getClass();
                if (cls3 != cls) {
                    iikVar2 = f(jSONWriter, cls3);
                    cls = cls3;
                }
                iikVar2.k(jSONWriter, obj2);
            }
            i++;
        }
        jSONWriter.e();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.E.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            List apply = this.E.apply(t);
            if (apply == null) {
                if (((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.k1();
                return true;
            } else if ((this.d & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && apply.isEmpty()) {
                return false;
            } else {
                String Z0 = jSONWriter.Z0(this, apply);
                if (Z0 != null) {
                    A(jSONWriter);
                    jSONWriter.i2(Z0);
                    jSONWriter.X0(apply);
                    return true;
                }
                if (this.z == String.class) {
                    O(jSONWriter, true, apply);
                } else {
                    N(jSONWriter, true, apply);
                }
                jSONWriter.X0(apply);
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
