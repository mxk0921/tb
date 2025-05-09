package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import tb.yzt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class t0 extends p0 {
    final yzt z;

    public t0(String str, int i, long j, String str2, String str3, Method method, yzt yztVar) {
        super(str, i, j, str2, str3, Byte.TYPE, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.p0, com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, Object obj) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        throw null;
    }

    @Override // com.alibaba.fastjson2.writer.p0, com.alibaba.fastjson2.writer.FieldWriter
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
