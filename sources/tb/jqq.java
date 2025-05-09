package tb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class jqq implements qmi<String> {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f22164a = Charset.forName("UTF8");
    public static final jqq INSTANCE = new jqq();

    static {
        t2o.a(945815777);
        t2o.a(945815765);
    }

    /* renamed from: c */
    public String a(ByteBuffer byteBuffer) {
        int i;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f22164a);
    }

    /* renamed from: d */
    public ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f22164a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    public static void e() {
    }
}
