package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.h.d;
import java.io.Closeable;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class l implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m.a(f());
    }

    public final InputStream e() {
        return f().d();
    }

    public abstract d f();
}
