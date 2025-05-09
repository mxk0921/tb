package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import tb.d0u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class o0<T> extends k0<T> {
    final d0u A;

    public o0(String str, int i, long j, String str2, String str3, Method method, d0u d0uVar) {
        super(str, i, j, str2, str3, Long.TYPE, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.k0, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.k0, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        try {
            throw null;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
