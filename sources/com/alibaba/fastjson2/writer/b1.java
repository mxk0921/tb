package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class b1<T> extends FieldWriterDate<T> {
    public b1(String str, int i, long j, String str2, String str3, Class cls, Method method) {
        super(str, i, j, str2, str3, cls, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void R(JSONWriter jSONWriter, T t) {
        t(jSONWriter, false, ((Long) a(t)).longValue());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean o(JSONWriter jSONWriter, T t) {
        s(jSONWriter, ((Long) a(t)).longValue());
        return true;
    }
}
