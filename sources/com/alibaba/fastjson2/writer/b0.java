package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class b0<T> extends a0<T> {
    final k2a<T, Short> z;

    public b0(String str, int i, long j, String str2, String str3, Method method, k2a<T, Short> k2aVar) {
        super(str, i, j, str2, str3, Short.class, null, method);
        this.z = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }
}
