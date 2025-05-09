package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class b<T> extends FieldWriter<T> {
    final k2a<T, BigDecimal> z;

    public b(String str, int i, long j, String str2, String str3, Method method, k2a<T, BigDecimal> k2aVar) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.z1(this.z.apply(t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            BigDecimal apply = this.z.apply(t);
            if (apply == null && ((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            A(jSONWriter);
            jSONWriter.z1(apply, this.d, this.g);
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
