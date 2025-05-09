package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597775);
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
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int c(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fca1a6eb", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return (bArr[i + 2] & 255) | ((bArr[1 + i] & 255) << 8) | ((bArr[i] & 255) << 16);
    }

    public static int d(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("918659ac", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return (bArr[i + 3] & 255) | ((bArr[1 + i] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[2 + i] & 255) << 8);
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

    public static int g(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95ae6bdf", new Object[]{new Integer(i), bArr, new Integer(i2)})).intValue();
        }
        if (i == 1) {
            return a(bArr, i2);
        }
        if (i == 2) {
            return b(bArr, i2);
        }
        if (i == 3) {
            return c(bArr, i2);
        }
        if (i != 4) {
            return 0;
        }
        return d(bArr, i2);
    }
}
