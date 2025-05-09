package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class c<T> extends FieldWriter<T> {
    public c(String str, int i, long j, String str2, String str3, Method method) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.z1((BigDecimal) a(t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            BigDecimal bigDecimal = (BigDecimal) a(t);
            if (bigDecimal == null && ((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            A(jSONWriter);
            jSONWriter.z1(bigDecimal, this.d, this.g);
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
