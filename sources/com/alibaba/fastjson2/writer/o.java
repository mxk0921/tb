package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class o<T> extends FieldWriterDate<T> {
    public o(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Date.class, Date.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        Date date = (Date) a(t);
        if (date == null) {
            jSONWriter.b2();
        } else {
            t(jSONWriter, false, date.getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        Date date = (Date) a(t);
        if (date != null) {
            s(jSONWriter, date.getTime());
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
