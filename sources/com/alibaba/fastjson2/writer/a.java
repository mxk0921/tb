package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class a<T> extends FieldWriter<T> {
    public a(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.z1((BigDecimal) a(t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        BigDecimal bigDecimal = (BigDecimal) a(t);
        if (bigDecimal == null && ((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        A(jSONWriter);
        jSONWriter.z1(bigDecimal, this.d, this.g);
        return true;
    }
}
