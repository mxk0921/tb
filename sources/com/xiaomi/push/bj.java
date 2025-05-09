package com.xiaomi.push;

import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bj {

    /* renamed from: a  reason: collision with other field name */
    private static byte[] f770a;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14782a = System.getProperty("line.separator");

    /* renamed from: a  reason: collision with other field name */
    private static char[] f771a = new char[64];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            f771a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            f771a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            f771a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = f771a;
        cArr[i] = '+';
        cArr[i + 1] = wh6.DIR;
        f770a = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = f770a;
            if (i2 < bArr.length) {
                bArr[i2] = -1;
                i2++;
            }
        }
        for (int i3 = 0; i3 < 64; i3++) {
            f770a[f771a[i3]] = (byte) i3;
        }
    }

    public static String a(String str) {
        return new String(a(str.getBytes()));
    }

    public static String b(String str) {
        return new String(m516a(str));
    }

    /* renamed from: a  reason: collision with other method in class */
    public static byte[] m516a(String str) {
        return a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) {
        return a(cArr, 0, cArr.length);
    }

    public static byte[] a(char[] cArr, int i, int i2) {
        char c;
        if (i2 % 4 == 0) {
            while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
                i2--;
            }
            int i3 = (i2 * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = i2 + i;
            int i5 = 0;
            while (i < i4) {
                char c2 = cArr[i];
                int i6 = i + 2;
                char c3 = cArr[i + 1];
                char c4 = 'A';
                if (i6 < i4) {
                    i += 3;
                    c = cArr[i6];
                } else {
                    i = i6;
                    c = 'A';
                }
                if (i < i4) {
                    i++;
                    c4 = cArr[i];
                }
                if (c2 > 127 || c3 > 127 || c > 127 || c4 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte[] bArr2 = f770a;
                byte b = bArr2[c2];
                byte b2 = bArr2[c3];
                byte b3 = bArr2[c];
                byte b4 = bArr2[c4];
                if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i7 = (b << 2) | (b2 >>> 4);
                int i8 = ((b2 & 15) << 4) | (b3 >>> 2);
                int i9 = ((b3 & 3) << 6) | b4;
                int i10 = i5 + 1;
                bArr[i5] = (byte) i7;
                if (i10 < i3) {
                    i10 = i5 + 2;
                    bArr[i10] = (byte) i8;
                }
                if (i10 < i3) {
                    i5 = i10 + 1;
                    bArr[i10] = (byte) i9;
                } else {
                    i5 = i10;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static char[] a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[((i2 + 2) / 3) * 4];
        int i7 = i2 + i;
        int i8 = 0;
        while (i < i7) {
            int i9 = i + 1;
            byte b = bArr[i];
            int i10 = b & 255;
            if (i9 < i7) {
                i3 = i + 2;
                i4 = bArr[i9] & 255;
            } else {
                i3 = i9;
                i4 = 0;
            }
            if (i3 < i7) {
                i = i3 + 1;
                i5 = bArr[i3] & 255;
            } else {
                i = i3;
                i5 = 0;
            }
            int i11 = ((b & 3) << 4) | (i4 >>> 4);
            int i12 = ((i4 & 15) << 2) | (i5 >>> 6);
            int i13 = i5 & 63;
            char[] cArr2 = f771a;
            cArr[i8] = cArr2[i10 >>> 2];
            int i14 = i8 + 2;
            cArr[i8 + 1] = cArr2[i11];
            char c = '=';
            cArr[i14] = i14 < i6 ? cArr2[i12] : '=';
            int i15 = i8 + 3;
            if (i15 < i6) {
                c = cArr2[i13];
            }
            cArr[i15] = c;
            i8 += 4;
        }
        return cArr;
    }
}
