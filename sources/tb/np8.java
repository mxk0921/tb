package tb;

import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class np8 extends ByteArrayOutputStream {
    public np8(int i) {
        super(i);
    }

    public final byte[] e() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        ckf.f(bArr, "buf");
        return bArr;
    }
}
