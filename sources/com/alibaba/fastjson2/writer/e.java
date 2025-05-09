package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class e<T> extends FieldWriter<T> {
    final k2a<T, BigInteger> z;

    public e(String str, int i, long j, String str2, String str3, Method method, k2a<T, BigInteger> k2aVar) {
        super(str, i, j, str2, str3, BigInteger.class, BigInteger.class, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        jSONWriter.m1((BigInteger) a(t), this.d);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        BigInteger apply = this.z.apply(t);
        if (apply == null && ((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        A(jSONWriter);
        jSONWriter.m1(apply, this.d);
        return true;
    }
}
