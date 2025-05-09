package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import tb.e0u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class e0 extends a0 {
    final e0u z;

    public e0(String str, int i, long j, String str2, String str3, Method method, e0u e0uVar) {
        super(str, i, j, str2, str3, Short.TYPE, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.a0, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, Object obj) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.a0, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, Object obj) {
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
