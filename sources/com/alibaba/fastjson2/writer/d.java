package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class d<T> extends FieldWriter<T> {
    public d(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, BigInteger.class, BigInteger.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.m1((BigInteger) a(t), this.d);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        BigInteger bigInteger = (BigInteger) a(t);
        if (bigInteger == null && ((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        A(jSONWriter);
        jSONWriter.m1(bigInteger, this.d);
        return true;
    }
}
