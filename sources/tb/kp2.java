package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kp2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592981);
    }

    public static int a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3e1ce8a", new Object[]{bArr})).intValue();
        }
        if (bArr == null || bArr.length > 4) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (((bArr.length - i2) - 1) * 8);
        }
        return i;
    }

    public static int b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42b6e52a", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || bArr.length < i + i2) {
            return 0;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i];
            i++;
        }
        return a(bArr2);
    }

    public static byte[] c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e8949d91", new Object[]{new Integer(i)}) : new byte[]{(byte) (i & 255)};
    }

    public static byte[] d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("1d7ad8d2", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("52611413", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("87474f54", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cae38884", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null || i < 0 || i2 < 0 || bArr.length < (i3 = i + i2)) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i4 = i; i4 < i3; i4++) {
            bArr2[i4 - i] = bArr[i4];
        }
        return bArr2;
    }
}
