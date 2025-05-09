package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c0z;
import tb.tck;
import tb.wh6;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Base64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3988a = new byte[128];
    public static final char[] b = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            f3988a[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            f3988a[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            f3988a[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            f3988a[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = f3988a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            b[i6] = (char) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            b[i7] = (char) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            b[i9] = (char) (i + 48);
            i9++;
            i++;
        }
        char[] cArr = b;
        cArr[62] = '+';
        cArr[63] = wh6.DIR;
    }

    public static boolean a(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c)})).booleanValue();
        }
        if (c == '=') {
            return true;
        }
        return false;
    }

    public static boolean b(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d655b8", new Object[]{new Character(c)})).booleanValue();
        }
        if (c >= 128 || f3988a[c] == -1) {
            return false;
        }
        return true;
    }

    public static byte[] decode(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            i = 0;
            for (char c : charArray) {
                if (!(c == ' ' || c == '\r' || c == '\n' || c == '\t')) {
                    charArray[i] = c;
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i2 = i / 4;
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2 * 3];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i2 - 1;
            byte[] bArr2 = f3988a;
            if (i3 < i6) {
                int i7 = i4 + 1;
                char c2 = charArray[i4];
                if (!b(c2)) {
                    break;
                }
                int i8 = i4 + 2;
                char c3 = charArray[i7];
                if (!b(c3)) {
                    break;
                }
                int i9 = i4 + 3;
                char c4 = charArray[i8];
                if (!b(c4)) {
                    break;
                }
                i4 += 4;
                char c5 = charArray[i9];
                if (!b(c5)) {
                    break;
                }
                byte b2 = bArr2[c2];
                byte b3 = bArr2[c3];
                byte b4 = bArr2[c4];
                byte b5 = bArr2[c5];
                bArr[i5] = (byte) ((b2 << 2) | (b3 >> 4));
                int i10 = i5 + 2;
                bArr[i5 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                i5 += 3;
                bArr[i10] = (byte) ((b4 << 6) | b5);
                i3++;
            } else {
                int i11 = i4 + 1;
                char c6 = charArray[i4];
                if (!b(c6)) {
                    return null;
                }
                int i12 = i4 + 2;
                char c7 = charArray[i11];
                if (!b(c7)) {
                    return null;
                }
                byte b6 = bArr2[c6];
                byte b7 = bArr2[c7];
                char c8 = charArray[i12];
                char c9 = charArray[i4 + 3];
                if (b(c8) && b(c9)) {
                    byte b8 = bArr2[c8];
                    byte b9 = bArr2[c9];
                    bArr[i5] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr[1 + i5] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
                    bArr[i5 + 2] = (byte) (b9 | (b8 << 6));
                    return bArr;
                } else if (!a(c8) || !a(c9)) {
                    if (a(c8) || !a(c9)) {
                        return null;
                    }
                    byte b10 = bArr2[c8];
                    if ((b10 & 3) != 0) {
                        return null;
                    }
                    int i13 = i3 * 3;
                    byte[] bArr3 = new byte[i13 + 2];
                    System.arraycopy(bArr, 0, bArr3, 0, i13);
                    bArr3[i5] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr3[1 + i5] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
                    return bArr3;
                } else if ((b7 & 15) != 0) {
                    return null;
                } else {
                    int i14 = i3 * 3;
                    byte[] bArr4 = new byte[1 + i14];
                    System.arraycopy(bArr, 0, bArr4, 0, i14);
                    bArr4[i5] = (byte) ((b6 << 2) | (b7 >> 4));
                    return bArr4;
                }
            }
        }
        return null;
    }

    public static String encode(byte[] bArr) {
        int i;
        char[] cArr;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bd317fc", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i4 = length % 24;
        int i5 = length / 24;
        if (i4 != 0) {
            i = i5 + 1;
        } else {
            i = i5;
        }
        char[] cArr2 = new char[i * 4];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            cArr = b;
            if (i3 >= i5) {
                break;
            }
            byte b2 = bArr[i6];
            int i8 = i6 + 2;
            byte b3 = bArr[i6 + 1];
            i6 += 3;
            byte b4 = bArr[i8];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i9 = b2 & c0z.STATE;
            int i10 = b2 >> 2;
            if (i9 != 0) {
                i10 ^= tck.DETECT_WIDTH;
            }
            byte b7 = (byte) i10;
            int i11 = b3 & c0z.STATE;
            int i12 = b3 >> 4;
            if (i11 != 0) {
                i12 ^= 240;
            }
            byte b8 = (byte) i12;
            if ((b4 & c0z.STATE) == 0) {
                i2 = b4 >> 6;
            } else {
                i2 = (b4 >> 6) ^ 252;
            }
            byte b9 = (byte) i2;
            cArr2[i7] = cArr[b7];
            cArr2[i7 + 1] = cArr[b8 | (b6 << 4)];
            int i13 = i7 + 3;
            cArr2[i7 + 2] = cArr[(b5 << 2) | b9];
            i7 += 4;
            cArr2[i13] = cArr[b4 & 63];
            i3++;
        }
        if (i4 == 8) {
            byte b10 = bArr[i6];
            byte b11 = (byte) (b10 & 3);
            int i14 = b10 & c0z.STATE;
            int i15 = b10 >> 2;
            if (i14 != 0) {
                i15 ^= tck.DETECT_WIDTH;
            }
            cArr2[i7] = cArr[(byte) i15];
            cArr2[1 + i7] = cArr[b11 << 4];
            cArr2[i7 + 2] = '=';
            cArr2[i7 + 3] = '=';
        } else if (i4 == 16) {
            byte b12 = bArr[i6];
            byte b13 = bArr[i6 + 1];
            byte b14 = (byte) (b13 & 15);
            byte b15 = (byte) (b12 & 3);
            int i16 = b12 & c0z.STATE;
            int i17 = b12 >> 2;
            if (i16 != 0) {
                i17 ^= tck.DETECT_WIDTH;
            }
            byte b16 = (byte) i17;
            int i18 = b13 & c0z.STATE;
            int i19 = b13 >> 4;
            if (i18 != 0) {
                i19 ^= 240;
            }
            byte b17 = (byte) i19;
            cArr2[i7] = cArr[b16];
            cArr2[1 + i7] = cArr[b17 | (b15 << 4)];
            cArr2[i7 + 2] = cArr[b14 << 2];
            cArr2[i7 + 3] = '=';
        }
        return new String(cArr2);
    }
}
