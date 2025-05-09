package com.meizu.cloud.pushsdk.e.h;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface m extends Closeable {
    long b(b bVar, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.l
    void close() throws IOException;
}
