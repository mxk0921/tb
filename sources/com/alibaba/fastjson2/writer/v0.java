package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class v0<T> extends u0<T> {
    public v0(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field) {
        super(str, type, i, j, str2, str3, type2, cls, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        String a1;
        List list = (List) a(t);
        if (list == null) {
            jSONWriter.b2();
            return;
        }
        boolean B0 = jSONWriter.B0();
        if (!B0 || (a1 = jSONWriter.a1(this.f2478a, list)) == null) {
            N(jSONWriter, false, list);
            if (B0) {
                jSONWriter.X0(list);
                return;
            }
            return;
        }
        jSONWriter.i2(a1);
        jSONWriter.X0(list);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        List<String> list = (List) a(t);
        JSONWriter.a aVar = jSONWriter.f2458a;
        if (list != null) {
            String Z0 = jSONWriter.Z0(this, list);
            if (Z0 != null) {
                A(jSONWriter);
                jSONWriter.i2(Z0);
                jSONWriter.X0(list);
                return true;
            }
            if (this.z == String.class) {
                O(jSONWriter, true, list);
            } else {
                N(jSONWriter, true, list);
            }
            jSONWriter.X0(list);
            return true;
        } else if (((this.d | aVar.d()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        } else {
            A(jSONWriter);
            jSONWriter.k1();
            return true;
        }
    }
}
