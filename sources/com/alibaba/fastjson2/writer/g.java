package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class g extends j {
    public g(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
    }

    @Override // com.alibaba.fastjson2.writer.j, com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, Object obj) {
        try {
            boolean booleanValue = ((Boolean) a(obj)).booleanValue();
            if (!booleanValue && ((this.d | jSONWriter.A()) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            q(jSONWriter, booleanValue);
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.u0()) {
                return false;
            }
            throw e;
        }
    }
}
