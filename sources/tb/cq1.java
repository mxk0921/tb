package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class cq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BASELENGTH = 255;
    public static final int CHUNK_SIZE = 76;
    public static final int EIGHTBIT = 8;
    public static final int FOURBYTE = 4;
    public static final int LOOKUPLENGTH = 64;
    public static final byte PAD = 61;
    public static final int SIGN = -128;
    public static final int SIXTEENBIT = 16;
    public static final int TWENTYFOURBITGROUP = 24;
    public static final byte[] CHUNK_SEPARATOR = "\r\n".getBytes();

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17226a = new byte[255];
    public static final byte[] b = new byte[64];

    static {
        t2o.a(775946255);
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            f17226a[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            f17226a[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            f17226a[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            f17226a[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = f17226a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            b[i6] = (byte) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            b[i7] = (byte) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            b[i9] = (byte) (i + 48);
            i9++;
            i++;
        }
        byte[] bArr2 = b;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a7c9206a", new Object[]{bArr});
        }
        return d(bArr, false);
    }

    public static byte[] d(byte[] bArr, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("51707a9c", new Object[]{bArr, new Boolean(z)});
        }
        int length = bArr.length * 8;
        int i5 = length % 24;
        int i6 = length / 24;
        if (i5 != 0) {
            i = (i6 + 1) * 4;
        } else {
            i = i6 * 4;
        }
        if (z) {
            byte[] bArr2 = CHUNK_SEPARATOR;
            if (bArr2.length == 0) {
                i2 = 0;
            } else {
                i2 = (int) Math.ceil(i / 76.0f);
            }
            i += bArr2.length * i2;
        } else {
            i2 = 0;
        }
        byte[] bArr3 = new byte[i];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 76;
        while (i7 < i6) {
            int i11 = i7 * 3;
            byte b2 = bArr[i11];
            byte b3 = bArr[i11 + 1];
            byte b4 = bArr[i11 + 2];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i12 = b2 >> 2;
            if ((b2 & c0z.STATE) != 0) {
                i12 ^= tck.DETECT_WIDTH;
            }
            byte b7 = (byte) i12;
            int i13 = b3 >> 4;
            if ((b3 & c0z.STATE) != 0) {
                i13 ^= 240;
            }
            byte b8 = (byte) i13;
            int i14 = b4 >> 6;
            if ((b4 & c0z.STATE) != 0) {
                i14 ^= 252;
            }
            byte b9 = (byte) i14;
            byte[] bArr4 = b;
            bArr3[i8] = bArr4[b7];
            bArr3[i8 + 1] = bArr4[(b6 << 4) | b8];
            bArr3[i8 + 2] = bArr4[(b5 << 2) | b9];
            bArr3[i8 + 3] = bArr4[b4 & 63];
            i8 += 4;
            if (z && i8 == i10) {
                byte[] bArr5 = CHUNK_SEPARATOR;
                System.arraycopy(bArr5, 0, bArr3, i8, bArr5.length);
                int i15 = i9 + 1;
                i10 = ((i9 + 2) * 76) + (bArr5.length * i15);
                i8 += bArr5.length;
                i9 = i15;
            }
            i7++;
        }
        int i16 = i7 * 3;
        if (i5 == 8) {
            byte b10 = bArr[i16];
            byte b11 = (byte) (b10 & 3);
            if ((b10 & c0z.STATE) == 0) {
                i4 = b10 >> 2;
            } else {
                i4 = (b10 >> 2) ^ tck.DETECT_WIDTH;
            }
            byte b12 = (byte) i4;
            byte[] bArr6 = b;
            bArr3[i8] = bArr6[b12];
            bArr3[1 + i8] = bArr6[b11 << 4];
            bArr3[i8 + 2] = 61;
            bArr3[i8 + 3] = 61;
        } else if (i5 == 16) {
            byte b13 = bArr[i16];
            byte b14 = bArr[i16 + 1];
            byte b15 = (byte) (b14 & 15);
            byte b16 = (byte) (b13 & 3);
            if ((b13 & c0z.STATE) == 0) {
                i3 = b13 >> 2;
            } else {
                i3 = (b13 >> 2) ^ tck.DETECT_WIDTH;
            }
            byte b17 = (byte) i3;
            int i17 = b14 & c0z.STATE;
            int i18 = b14 >> 4;
            if (i17 != 0) {
                i18 ^= 240;
            }
            byte b18 = (byte) i18;
            byte[] bArr7 = b;
            bArr3[i8] = bArr7[b17];
            bArr3[1 + i8] = bArr7[b18 | (b16 << 4)];
            bArr3[i8 + 2] = bArr7[b15 << 2];
            bArr3[i8 + 3] = 61;
        }
        if (z && i9 < i2) {
            byte[] bArr8 = CHUNK_SEPARATOR;
            System.arraycopy(bArr8, 0, bArr3, i - bArr8.length, bArr8.length);
        }
        return bArr3;
    }

    public static boolean e(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55d15da0", new Object[]{new Byte(b2)})).booleanValue();
        }
        if (b2 != 61 && f17226a[b2] == -1) {
            return false;
        }
        return true;
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f0fdcb92", new Object[]{bArr});
        }
        byte[] b2 = b(bArr);
        if (b2.length == 0) {
            return new byte[0];
        }
        int length = b2.length / 4;
        int length2 = b2.length;
        while (b2[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[length2 - length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 4;
            byte b3 = b2[i3 + 2];
            byte b4 = b2[i3 + 3];
            byte[] bArr3 = f17226a;
            byte b5 = bArr3[b2[i3]];
            byte b6 = bArr3[b2[i3 + 1]];
            if (b3 != 61 && b4 != 61) {
                byte b7 = bArr3[b3];
                byte b8 = bArr3[b4];
                bArr2[i] = (byte) ((b5 << 2) | (b6 >> 4));
                bArr2[i + 1] = (byte) (((b6 & 15) << 4) | ((b7 >> 2) & 15));
                bArr2[i + 2] = (byte) ((b7 << 6) | b8);
            } else if (b3 == 61) {
                bArr2[i] = (byte) ((b6 >> 4) | (b5 << 2));
            } else if (b4 == 61) {
                byte b9 = bArr3[b3];
                bArr2[i] = (byte) ((b5 << 2) | (b6 >> 4));
                bArr2[i + 1] = (byte) (((b6 & 15) << 4) | ((b9 >> 2) & 15));
            }
            i += 3;
        }
        return bArr2;
    }

    public static byte[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f202a5d1", new Object[]{bArr});
        }
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (e(bArr[i2])) {
                i++;
                bArr2[i] = bArr[i2];
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }
}
