package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class p0<T> extends FieldWriter<T> {
    public p0(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Byte b = (Byte) a(t);
        if (b == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.L1(b.byteValue());
        }
    }

    public final void S(JSONWriter jSONWriter, byte b) {
        if ((jSONWriter.A() & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            A(jSONWriter);
            jSONWriter.k2(Byte.toString(b));
            return;
        }
        A(jSONWriter);
        jSONWriter.R1(b);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Byte b = (Byte) a(t);
            if (b != null) {
                S(jSONWriter, b.byteValue());
                return true;
            } else if (((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
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
