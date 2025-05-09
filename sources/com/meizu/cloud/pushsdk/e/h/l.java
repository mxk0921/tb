package com.meizu.cloud.pushsdk.e.h;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface l extends Closeable, Flushable {
    void a(b bVar, long j) throws IOException;

    @Override // java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.l
    void close() throws IOException;

    void flush() throws IOException;
}
