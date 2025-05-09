package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class i1<T> extends FieldWriter<T> {
    public i1(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, String.class, String.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        String str = (String) a(t);
        if (str == null) {
            jSONWriter.b2();
            return;
        }
        if (this.u) {
            str = str.trim();
        }
        if (this.v) {
            jSONWriter.f2(str);
        } else {
            jSONWriter.k2(str);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        String str = (String) a(t);
        if (str == null) {
            long A = this.d | jSONWriter.A();
            long j = JSONWriter.Feature.WriteNulls.mask;
            long j2 = JSONWriter.Feature.NullAsDefaultValue.mask;
            long j3 = JSONWriter.Feature.WriteNullStringAsEmpty.mask;
            if (((j | j2 | j3) & A) == 0 || (JSONWriter.Feature.NotWriteDefaultValue.mask & A) != 0) {
                return false;
            }
            if ((A & (j2 | j3)) != 0) {
                A(jSONWriter);
                jSONWriter.k2("");
                return true;
            }
        }
        if (this.u && str != null) {
            str = str.trim();
        }
        A(jSONWriter);
        if (this.t && jSONWriter.d) {
            jSONWriter.r2(str);
        } else if (this.v) {
            jSONWriter.f2(str);
        } else {
            jSONWriter.k2(str);
        }
        return true;
    }
}
