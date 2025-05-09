package com.sina.weibo.sdk.net;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g implements f {
    private int code;
    private InputStream p;

    static {
        t2o.a(988807229);
        t2o.a(988807228);
    }

    public g(int i, InputStream inputStream) {
        this.code = i;
        this.p = inputStream;
    }

    @Override // com.sina.weibo.sdk.net.f
    public final String f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = this.p.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            }
        }
    }
}
