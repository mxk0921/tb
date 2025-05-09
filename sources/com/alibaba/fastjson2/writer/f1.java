package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.k2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class f1<T> extends FieldWriterObject<T> {
    final k2a E;
    final boolean F;

    public f1(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, k2a k2aVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        boolean z;
        this.E = k2aVar;
        if (cls == AtomicIntegerArray.class || cls == AtomicLongArray.class || cls == AtomicReferenceArray.class || cls.isArray()) {
            z = true;
        } else {
            z = false;
        }
        this.F = z;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.E.apply(obj);
    }
}
