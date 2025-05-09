package com.meizu.cloud.pushsdk.e.h;

import java.io.IOException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class f implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f5842a;

    public f(l lVar) {
        if (lVar != null) {
            this.f5842a = lVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) throws IOException {
        this.f5842a.a(bVar, j);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5842a.close();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() throws IOException {
        this.f5842a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + f7l.BRACKET_START_STR + this.f5842a.toString() + f7l.BRACKET_END_STR;
    }
}
