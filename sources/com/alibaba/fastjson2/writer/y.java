package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class y<T> extends FieldWriter<T> {
    public y(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method) {
        super(str, i, j, str2, str3, type, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Float f = (Float) a(t);
        if (f == null) {
            jSONWriter.c2();
            return;
        }
        float floatValue = f.floatValue();
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.E1(floatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(floatValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            Float f = (Float) a(t);
            if (f == null) {
                long C = jSONWriter.C(this.d);
                if ((JSONWriter.Feature.WriteNulls.mask & C) == 0 || (C & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                    return false;
                }
                A(jSONWriter);
                jSONWriter.c2();
                return true;
            }
            A(jSONWriter);
            float floatValue = f.floatValue();
            DecimalFormat decimalFormat = this.g;
            if (decimalFormat != null) {
                jSONWriter.E1(floatValue, decimalFormat);
            } else {
                jSONWriter.writeFloat(floatValue);
            }
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
