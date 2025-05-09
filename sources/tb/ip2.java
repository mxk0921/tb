package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ip2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596849);
    }

    public static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2d84169", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return bArr[i] & 255;
    }

    public static int b(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67bcf42a", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return (bArr[i] & 255) | ((bArr[1 + i] & 255) << 8);
    }

    public static int c(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fca1a6eb", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return (bArr[i] & 255) | ((bArr[1 + i] & 255) << 8) | ((bArr[2 + i] & 255) << 16);
    }

    public static int d(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("918659ac", new Object[]{bArr, new Integer(i)})).intValue();
        }
        int i2 = (bArr[2 + i] & 255) << 16;
        return (bArr[i] & 255) | ((bArr[1 + i] & 255) << 8) | i2 | ((bArr[i + 3] & 255) << 24);
    }

    public static double e(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddb34450", new Object[]{bArr, new Integer(i)})).doubleValue();
        }
        return Double.longBitsToDouble(f(bArr, i));
    }

    public static long f(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e51924b1", new Object[]{bArr, new Integer(i)})).longValue();
        }
        return (bArr[i] & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[2 + i] & 255) << 16) | ((bArr[1 + i] & 255) << 8);
    }
}
