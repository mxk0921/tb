package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.iik;
import tb.pjk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class f0<T> extends FieldWriter<T> {
    final boolean z;

    public f0(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0 || "string".equals(str2);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void L(JSONWriter jSONWriter, int i) {
        if (this.z) {
            A(jSONWriter);
            jSONWriter.k2(Integer.toString(i));
            return;
        }
        A(jSONWriter);
        String str = this.f;
        if (str != null) {
            jSONWriter.M1(i, str);
        } else {
            jSONWriter.L1(i);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Integer num = (Integer) a(t);
        if (num == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.L1(num.intValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        if (cls == this.c) {
            return pjk.f26129a;
        }
        return jSONWriter.F(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Integer num = (Integer) a(t);
            if (num != null) {
                L(jSONWriter, num.intValue());
                return true;
            } else if (((this.d | jSONWriter.A()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullNumberAsZero.mask)) == 0) {
                return false;
            } else {
                A(jSONWriter);
                jSONWriter.c2();
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
