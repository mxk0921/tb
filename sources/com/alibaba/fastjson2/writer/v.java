package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class v extends u {
    final k2a H;

    public v(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, k2a k2aVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.H = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.H.apply(obj);
    }
}
