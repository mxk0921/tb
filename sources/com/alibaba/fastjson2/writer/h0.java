package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class h0<T> extends f0<T> {
    public h0(String str, int i, long j, String str2, String str3, Method method, Class cls) {
        super(str, i, j, str2, str3, cls, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        }
    }
}
