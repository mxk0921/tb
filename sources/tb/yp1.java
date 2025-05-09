package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f32253a = new byte[128];

    static {
        t2o.a(619708644);
        for (int i = 0; i < 128; i++) {
            f32253a[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f32253a[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f32253a[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f32253a[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = f32253a;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65e18561", new Object[]{bArr});
        }
        byte[] c = c(bArr);
        if (c[c.length - 2] == 61) {
            bArr2 = new byte[(((c.length / 4) - 1) * 3) + 1];
        } else if (c[c.length - 1] == 61) {
            bArr2 = new byte[(((c.length / 4) - 1) * 3) + 2];
        } else {
            bArr2 = new byte[(c.length / 4) * 3];
        }
        int i2 = 0;
        while (i < c.length - 4) {
            byte[] bArr3 = f32253a;
            byte b = bArr3[c[i]];
            byte b2 = bArr3[c[i + 1]];
            byte b3 = bArr3[c[i + 2]];
            byte b4 = bArr3[c[i + 3]];
            bArr2[i2] = (byte) ((b << 2) | (b2 >> 4));
            bArr2[i2 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
            bArr2[i2 + 2] = (byte) (b4 | (b3 << 6));
            i += 4;
            i2 += 3;
        }
        if (c[c.length - 2] == 61) {
            byte[] bArr4 = f32253a;
            bArr2[bArr2.length - 1] = (byte) ((bArr4[c[c.length - 3]] >> 4) | (bArr4[c[c.length - 4]] << 2));
        } else if (c[c.length - 1] == 61) {
            byte[] bArr5 = f32253a;
            byte b5 = bArr5[c[c.length - 4]];
            byte b6 = bArr5[c[c.length - 3]];
            byte b7 = bArr5[c[c.length - 2]];
            bArr2[bArr2.length - 2] = (byte) ((b5 << 2) | (b6 >> 4));
            bArr2[bArr2.length - 1] = (byte) ((b7 >> 2) | (b6 << 4));
        } else {
            byte[] bArr6 = f32253a;
            byte b8 = bArr6[c[c.length - 4]];
            byte b9 = bArr6[c[c.length - 3]];
            byte b10 = bArr6[c[c.length - 2]];
            byte b11 = bArr6[c[c.length - 1]];
            bArr2[bArr2.length - 3] = (byte) ((b8 << 2) | (b9 >> 4));
            bArr2[bArr2.length - 2] = (byte) ((b9 << 4) | (b10 >> 2));
            bArr2[bArr2.length - 1] = (byte) (b11 | (b10 << 6));
        }
        return bArr2;
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("222c34a5", new Object[]{bArr});
        }
        return new String(a(bArr));
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5da796e2", new Object[]{bArr});
        }
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (d(bArr[i2])) {
                bArr2[i] = bArr[i2];
                i++;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    public static boolean d(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2bf2d30", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b == 61) {
            return true;
        }
        if (b < 0 || b >= 128 || f32253a[b] == -1) {
            return false;
        }
        return true;
    }
}
