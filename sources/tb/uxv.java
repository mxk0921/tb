package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f29662a = new long[256];

    static {
        long j;
        t2o.a(83886151);
        for (int i = 0; i < 256; i++) {
            long j2 = i;
            for (int i2 = 0; i2 < 8; i2++) {
                if ((((int) j2) & 1) != 0) {
                    j = -7661587058870466123L;
                } else {
                    j = 0;
                }
                j2 = (j2 >> 1) ^ j;
            }
            f29662a[i] = j2;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError();
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a44f8933", new Object[]{str})).longValue();
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return c(d(str));
    }

    public static long c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7af05e30", new Object[]{bArr})).longValue();
        }
        long j = -1;
        for (byte b : bArr) {
            j = (j >> 8) ^ f29662a[(((int) j) ^ b) & 255];
        }
        return j;
    }

    public static byte[] d(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9f7f617", new Object[]{str});
        }
        byte[] bArr = new byte[str.length() * 2];
        int i = 0;
        for (char c : str.toCharArray()) {
            int i2 = i + 1;
            bArr[i] = (byte) (c & 255);
            i += 2;
            bArr[i2] = (byte) (c >> '\b');
        }
        return bArr;
    }
}
