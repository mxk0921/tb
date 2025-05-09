package com.alipay.sdk.m.e;

import com.android.alibaba.ip.runtime.IpChange;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4524a = new byte[128];
    public static final char[] b = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            f4524a[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            f4524a[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            f4524a[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            f4524a[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = f4524a;
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

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a2 = a(charArray);
        if (a2 % 4 != 0) {
            return null;
        }
        int i = a2 / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i * 3];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i - 1;
            byte[] bArr2 = f4524a;
            if (i2 < i5) {
                int i6 = i3 + 1;
                char c = charArray[i3];
                if (!b(c)) {
                    break;
                }
                int i7 = i3 + 2;
                char c2 = charArray[i6];
                if (!b(c2)) {
                    break;
                }
                int i8 = i3 + 3;
                char c3 = charArray[i7];
                if (!b(c3)) {
                    break;
                }
                i3 += 4;
                char c4 = charArray[i8];
                if (!b(c4)) {
                    break;
                }
                byte b2 = bArr2[c];
                byte b3 = bArr2[c2];
                byte b4 = bArr2[c3];
                byte b5 = bArr2[c4];
                bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                int i9 = i4 + 2;
                bArr[i4 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                i4 += 3;
                bArr[i9] = (byte) ((b4 << 6) | b5);
                i2++;
            } else {
                int i10 = i3 + 1;
                char c5 = charArray[i3];
                if (!b(c5)) {
                    return null;
                }
                int i11 = i3 + 2;
                char c6 = charArray[i10];
                if (!b(c6)) {
                    return null;
                }
                byte b6 = bArr2[c5];
                byte b7 = bArr2[c6];
                char c7 = charArray[i11];
                char c8 = charArray[i3 + 3];
                if (b(c7) && b(c8)) {
                    byte b8 = bArr2[c7];
                    byte b9 = bArr2[c8];
                    bArr[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr[1 + i4] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
                    bArr[i4 + 2] = (byte) (b9 | (b8 << 6));
                    return bArr;
                } else if (!c(c7) || !c(c8)) {
                    if (c(c7) || !c(c8)) {
                        return null;
                    }
                    byte b10 = bArr2[c7];
                    if ((b10 & 3) != 0) {
                        return null;
                    }
                    int i12 = i2 * 3;
                    byte[] bArr3 = new byte[i12 + 2];
                    System.arraycopy(bArr, 0, bArr3, 0, i12);
                    bArr3[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                    bArr3[1 + i4] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
                    return bArr3;
                } else if ((b7 & 15) != 0) {
                    return null;
                } else {
                    int i13 = i2 * 3;
                    byte[] bArr4 = new byte[1 + i13];
                    System.arraycopy(bArr, 0, bArr4, 0, i13);
                    bArr4[i4] = (byte) ((b6 << 2) | (b7 >> 4));
                    return bArr4;
                }
            }
        }
        return null;
    }

    public static boolean b(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c)})).booleanValue();
        }
        if (c >= 128 || f4524a[c] == -1) {
            return false;
        }
        return true;
    }

    public static boolean c(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d655b8", new Object[]{new Character(c)})).booleanValue();
        }
        if (c == '=') {
            return true;
        }
        return false;
    }

    public static boolean d(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b2e57", new Object[]{new Character(c)})).booleanValue();
        }
        if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
            return true;
        }
        return false;
    }

    public static int a(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196ae3", new Object[]{cArr})).intValue();
        }
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!d(cArr[i2])) {
                i++;
                cArr[i] = cArr[i2];
            }
        }
        return i;
    }
}
