package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cui {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APNG_ACTL_OFFSET = 37;
    public static final int AVIF_HEADER_LENGTH = 4;
    public static final int BMP_HEADER_LENGTH = 2;
    public static final int GIF_HEADER_LENGTH = 6;
    public static final int HEIF_HEADER_LENGTH = 4;
    public static final int JPEG_HEADER_LENGTH = 2;
    public static final int PNG_HEADER_LENGTH = 41;
    public static final int WEBP_A_HEADER_LENGTH = 21;
    public static final int WEBP_HEADER_LENGTH = 21;
    public static final byte[] PNG_HEADER = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] APNG_ACTL_BYTES = {97, 99, 84, 76};

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17329a = a("RIFF");
    public static final byte[] b = a("WEBP");
    public static final byte[] c = a("VP8X");
    public static final byte[] d = a("GIF87a");
    public static final byte[] e = a("GIF89a");
    public static final byte[] f = a("BM");
    public static final byte[] g = a("heic");
    public static final byte[] h = a("avif");

    static {
        t2o.a(618659899);
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8f039f92", new Object[]{str});
        }
        try {
            return str.getBytes("ASCII");
        } catch (Exception e2) {
            xv8.c(p0m.TAG, "check image format asciiBytes error=%s", e2);
            return null;
        }
    }

    public static boolean b(byte[] bArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37043a51", new Object[]{bArr})).booleanValue();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (byteArrayInputStream.skip(33L) != 33) {
            return false;
        }
        do {
            try {
                byte[] o = o(byteArrayInputStream);
                if (o == null) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                int length = o.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X", Byte.valueOf(o[i])));
                }
                int parseInt = Integer.parseInt(sb.toString(), 16);
                byte[] o2 = o(byteArrayInputStream);
                if (o2 == null) {
                    break;
                }
                String str = new String(o2);
                if ("acTL".equals(str)) {
                    return true;
                }
                if ("fcTL".equals(str) || "IDAT".equals(str) || "fdAT".equals(str)) {
                    break;
                }
                j = parseInt + 4;
            } catch (Throwable unused) {
            }
        } while (byteArrayInputStream.skip(j) == j);
        return false;
    }

    public static boolean c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77775edb", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 4 || !n(bArr, 8, h)) {
            return false;
        }
        return true;
    }

    public static boolean d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57801bfa", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 2 || !n(bArr, 0, f)) {
            return false;
        }
        return true;
    }

    public static boolean e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4033c7b9", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 6) {
            return false;
        }
        if (n(bArr, 0, d) || n(bArr, 0, e)) {
            return true;
        }
        return false;
    }

    public static boolean f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae261a3", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 4 || !n(bArr, 20, g)) {
            return false;
        }
        return true;
    }

    public static boolean g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b17f8e31", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 2 || ((bArr[1] & 255) | ((bArr[0] << 8) & 65280)) != 65496) {
            return false;
        }
        return true;
    }

    public static boolean h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a37c8901", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 41 || !n(bArr, 0, PNG_HEADER) || b(bArr) || bArr[25] < 3) {
            return false;
        }
        return true;
    }

    public static boolean i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c27a9e", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || bArr.length < 41 || !n(bArr, 0, PNG_HEADER) || b(bArr) || bArr[25] >= 3) {
            return false;
        }
        return true;
    }

    public static boolean j(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d93e493a", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || !m(bArr) || !k(bArr)) {
            return false;
        }
        return true;
    }

    public static boolean k(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("472e9b7", new Object[]{bArr})).booleanValue();
        }
        if (bArr.length < 21 || !n(bArr, 12, c) || (bArr[20] & 16) != 16) {
            return false;
        }
        return true;
    }

    public static boolean l(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361b4f45", new Object[]{bArr})).booleanValue();
        }
        if (bArr == null || !m(bArr) || k(bArr)) {
            return false;
        }
        return true;
    }

    public static boolean m(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f389597", new Object[]{bArr})).booleanValue();
        }
        if (bArr.length < 21 || !n(bArr, 0, f17329a) || !n(bArr, 8, b)) {
            return false;
        }
        return true;
    }

    public static boolean n(byte[] bArr, int i, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c01111bd", new Object[]{bArr, new Integer(i), bArr2})).booleanValue();
        }
        if (bArr == null || bArr2 == null || i < 0 || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] o(ByteArrayInputStream byteArrayInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2f1914d", new Object[]{byteArrayInputStream});
        }
        byte[] bArr = new byte[4];
        if (byteArrayInputStream.read(bArr, 0, 4) != 4) {
            return null;
        }
        return bArr;
    }
}
