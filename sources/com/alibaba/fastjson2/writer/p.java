package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.util.Date;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class p<T> extends FieldWriterDate<T> {
    final k2a<T, Date> J;

    public p(String str, int i, long j, String str2, String str3, Method method, k2a<T, Date> k2aVar) {
        super(str, i, j, str2, str3, Date.class, Date.class, null, method);
        this.J = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Date apply = this.J.apply(t);
        if (apply == null) {
            jSONWriter.b2();
        } else {
            t(jSONWriter, false, apply.getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.J.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        Date apply = this.J.apply(t);
        if (apply != null) {
            s(jSONWriter, apply.getTime());
            return true;
        } else if (((this.d | jSONWriter.A()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        } else {
            A(jSONWriter);
            jSONWriter.b2();
            return true;
        }
    }
}
