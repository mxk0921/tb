package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.UUID;
import tb.hkk;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class l1<T> extends e1<T> {
    final k2a I;

    public l1(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, k2a k2aVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.I = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.I.apply(obj);
    }

    @Override // com.alibaba.fastjson2.writer.e1, com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        UUID uuid = (UUID) this.I.apply(t);
        if (uuid != null) {
            A(jSONWriter);
            if (this.G == null) {
                this.G = g(jSONWriter, UUID.class);
            }
            if (this.G != hkk.f20705a) {
                this.G.y(jSONWriter, uuid, this.f2478a, this.F, this.d);
            } else {
                jSONWriter.u2(uuid);
            }
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
