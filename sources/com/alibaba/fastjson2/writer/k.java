package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class k extends j {
    final k2a H;

    public k(String str, int i, long j, String str2, String str3, Method method, k2a k2aVar) {
        super(str, i, j, str2, str3, Boolean.class, Boolean.class, null, method);
        this.H = k2aVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.H.apply(obj);
    }
}
