package com.xiaomi.push;

import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gl extends gf {
    public gl() {
        a("PING", (String) null);
        a("0");
        a(0);
    }

    @Override // com.xiaomi.push.gf
    /* renamed from: a */
    public ByteBuffer mo719a(ByteBuffer byteBuffer) {
        if (m722a().length == 0) {
            return byteBuffer;
        }
        return super.mo719a(byteBuffer);
    }

    @Override // com.xiaomi.push.gf
    public int c() {
        if (m722a().length == 0) {
            return 0;
        }
        return super.c();
    }
}
