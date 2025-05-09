package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaskUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(ByteMatrix byteMatrix, boolean z) {
        int i;
        int i2;
        byte b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb7c5ec6", new Object[]{byteMatrix, new Boolean(z)})).intValue();
        }
        if (z) {
            i = byteMatrix.getHeight();
        } else {
            i = byteMatrix.getWidth();
        }
        if (z) {
            i2 = byteMatrix.getWidth();
        } else {
            i2 = byteMatrix.getHeight();
        }
        byte[][] array = byteMatrix.getArray();
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = array[i4][i6];
                } else {
                    b = array[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    b2 = b;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }

    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f39130f", new Object[]{byteMatrix})).intValue();
        }
        return a(byteMatrix, true) + a(byteMatrix, false);
    }

    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("453cde6e", new Object[]{byteMatrix})).intValue();
        }
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height - 1; i2++) {
            int i3 = 0;
            while (i3 < width - 1) {
                byte[] bArr = array[i2];
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = array[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    public static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b40a9cd", new Object[]{byteMatrix})).intValue();
        }
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                byte[] bArr = array[i2];
                int i4 = i3 + 6;
                if (i4 < width && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (b(bArr, i3 - 4, i3) || b(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < height && array[i2][i3] == 1 && array[i2 + 1][i3] == 0 && array[i2 + 2][i3] == 1 && array[i2 + 3][i3] == 1 && array[i2 + 4][i3] == 1 && array[i2 + 5][i3] == 0 && array[i5][i3] == 1 && (c(array, i3, i2 - 4, i2) || c(array, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5144752c", new Object[]{byteMatrix})).intValue();
        }
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            byte[] bArr = array[i2];
            for (int i3 = 0; i3 < width; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        return ((Math.abs((i * 2) - height2) * 10) / height2) * 10;
    }

    public static boolean b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb6ab7d3", new Object[]{bArr, new Integer(i), new Integer(i2)})).booleanValue();
        }
        while (i < i2) {
            if (i >= 0 && i < bArr.length && bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean c(byte[][] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa343d73", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        while (i2 < i3) {
            if (i2 >= 0 && i2 < bArr.length && bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean getDataMaskBit(int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55813b5f", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }
}
