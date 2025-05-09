package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.iik;
import tb.njk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class a0<T> extends FieldWriter<T> {
    public a0(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Short sh = (Short) a(t);
        if (sh == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.L1(sh.shortValue());
        }
    }

    public final void S(JSONWriter jSONWriter, short s) {
        if ((jSONWriter.A() & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            A(jSONWriter);
            jSONWriter.k2(Short.toString(s));
            return;
        }
        A(jSONWriter);
        jSONWriter.J1(s);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        return njk.f24776a;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Short sh = (Short) a(t);
            if (sh != null) {
                S(jSONWriter, sh.shortValue());
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
