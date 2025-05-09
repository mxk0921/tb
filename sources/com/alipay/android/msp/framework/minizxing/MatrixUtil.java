package com.alipay.android.msp.framework.minizxing;

import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MatrixUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f3636a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR, -1}, new int[]{6, 30, 58, 86, 114, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, Shop2023BottomBarNativeComponent.bottomBarHeightWithBottomMarginRpxValue}, new int[]{6, 26, 54, 82, 110, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_CLASS_ERROR, 166}, new int[]{6, 30, 58, 86, 114, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961ec5c1", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (d(byteMatrix.get(i4, i2))) {
                byteMatrix.set(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static void b(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5d3560", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (d(byteMatrix.get(i, i4))) {
                byteMatrix.set(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a3c290", new Object[]{bitArray, errorCorrectionLevel, version, new Integer(i), byteMatrix});
            return;
        }
        clearMatrix(byteMatrix);
        embedBasicPatterns(version, byteMatrix);
        embedTypeInfo(errorCorrectionLevel, i, byteMatrix);
        maybeEmbedVersionInfo(version, byteMatrix);
        embedDataBits(bitArray, i, byteMatrix);
    }

    public static void c(int i, int i2, ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9ba4ff", new Object[]{new Integer(i), new Integer(i2), byteMatrix});
            return;
        }
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.set(i + i4, i2 + i3, f3636a[i3][i4]);
            }
        }
    }

    public static int calculateBCHCode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("957af128", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 != 0) {
            int findMSBSet = findMSBSet(i2);
            int i3 = i << (findMSBSet - 1);
            while (findMSBSet(i3) >= findMSBSet) {
                i3 ^= i2 << (findMSBSet(i3) - findMSBSet);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void clearMatrix(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f419ff4", new Object[]{byteMatrix});
        } else {
            byteMatrix.clear((byte) -1);
        }
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == -1) {
            return true;
        }
        return false;
    }

    public static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ab0d24", new Object[]{version, byteMatrix});
            return;
        }
        int length = f3636a[0].length;
        c(0, 0, byteMatrix);
        c(byteMatrix.getWidth() - length, 0, byteMatrix);
        c(0, byteMatrix.getWidth() - length, byteMatrix);
        a(0, 7, byteMatrix);
        a(byteMatrix.getWidth() - 8, 7, byteMatrix);
        a(0, byteMatrix.getWidth() - 8, byteMatrix);
        b(7, 0, byteMatrix);
        b(byteMatrix.getHeight() - 8, 0, byteMatrix);
        b(7, byteMatrix.getHeight() - 7, byteMatrix);
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) != 0) {
            byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
            if (version.getVersionNumber() >= 2) {
                int[] iArr = c[version.getVersionNumber() - 1];
                for (int i : iArr) {
                    for (int i2 : iArr) {
                        if (!(i2 == -1 || i == -1 || !d(byteMatrix.get(i2, i)))) {
                            int i3 = i2 - 2;
                            int i4 = i - 2;
                            for (int i5 = 0; i5 < 5; i5++) {
                                for (int i6 = 0; i6 < 5; i6++) {
                                    byteMatrix.set(i3 + i6, i4 + i5, b[i5][i6]);
                                }
                            }
                        }
                    }
                }
            }
            int i7 = 8;
            while (i7 < byteMatrix.getWidth() - 8) {
                int i8 = i7 + 1;
                int i9 = i8 % 2;
                if (d(byteMatrix.get(i7, 6))) {
                    byteMatrix.set(i7, 6, i9);
                }
                if (d(byteMatrix.get(6, i7))) {
                    byteMatrix.set(6, i7, i9);
                }
                i7 = i8;
            }
            return;
        }
        throw new WriterException();
    }

    public static void embedDataBits(BitArray bitArray, int i, ByteMatrix byteMatrix) throws WriterException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa6401c", new Object[]{bitArray, new Integer(i), byteMatrix});
            return;
        }
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i2 = 0;
        int i3 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < byteMatrix.getHeight()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = width - i4;
                    if (d(byteMatrix.get(i5, height))) {
                        if (i2 < bitArray.getSize()) {
                            z = bitArray.get(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && MaskUtil.getDataMaskBit(i, i5, height)) {
                            z = !z;
                        }
                        byteMatrix.set(i5, height, z);
                    }
                }
                height += i3;
            }
            i3 = -i3;
            height += i3;
            width -= 2;
        }
        if (i2 != bitArray.getSize()) {
            throw new WriterException("Not all bits consumed: " + i2 + wh6.DIR + bitArray.getSize());
        }
    }

    public static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52f0b52", new Object[]{errorCorrectionLevel, new Integer(i), byteMatrix});
            return;
        }
        BitArray bitArray = new BitArray();
        makeTypeInfoBits(errorCorrectionLevel, i, bitArray);
        for (int i2 = 0; i2 < bitArray.getSize(); i2++) {
            boolean z = bitArray.get((bitArray.getSize() - 1) - i2);
            int[] iArr = d[i2];
            byteMatrix.set(iArr[0], iArr[1], z);
            if (i2 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i2) - 1, 8, z);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i2 - 8), z);
            }
        }
    }

    public static int findMSBSet(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ab81050", new Object[]{new Integer(i)})).intValue();
        }
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static void makeVersionInfoBits(Version version, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5375bb", new Object[]{version, bitArray});
            return;
        }
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(calculateBCHCode(version.getVersionNumber(), 7973), 12);
        if (bitArray.getSize() != 18) {
            throw new WriterException("should not happen but we got: " + bitArray.getSize());
        }
    }

    public static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535680c7", new Object[]{version, byteMatrix});
        } else if (version.getVersionNumber() >= 7) {
            BitArray bitArray = new BitArray();
            makeVersionInfoBits(version, bitArray);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean z = bitArray.get(i);
                    i--;
                    byteMatrix.set(i2, (byteMatrix.getHeight() - 11) + i3, z);
                    byteMatrix.set((byteMatrix.getHeight() - 11) + i3, i2, z);
                }
            }
        }
    }

    public static void makeTypeInfoBits(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb855b4", new Object[]{errorCorrectionLevel, new Integer(i), bitArray});
        } else if (QRCode.isValidMaskPattern(i)) {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            bitArray.appendBits(bits, 5);
            bitArray.appendBits(calculateBCHCode(bits, 1335), 10);
            BitArray bitArray2 = new BitArray();
            bitArray2.appendBits(21522, 15);
            bitArray.xor(bitArray2);
            if (bitArray.getSize() != 15) {
                throw new WriterException("should not happen but we got: " + bitArray.getSize());
            }
        } else {
            throw new WriterException("Invalid mask pattern");
        }
    }
}
