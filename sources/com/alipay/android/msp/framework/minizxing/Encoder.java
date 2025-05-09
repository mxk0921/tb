package com.alipay.android.msp.framework.minizxing;

import com.alipay.android.msp.framework.minizxing.Version;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Encoder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3633a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.minizxing.Encoder$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$minizxing$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$alipay$android$msp$framework$minizxing$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$minizxing$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$minizxing$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$minizxing$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Version a(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Version) ipChange.ipc$dispatch("d8301963", new Object[]{new Integer(i), errorCorrectionLevel});
        }
        for (int i2 = 2; i2 <= 40; i2++) {
            Version versionForNumber = Version.getVersionForNumber(i2);
            if (versionForNumber.getTotalCodewords() - versionForNumber.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i + 7) / 8) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    public static void append8BitBytes(String str, BitArray bitArray, String str2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cfcb03", new Object[]{str, bitArray, str2});
            return;
        }
        try {
            for (byte b : str.getBytes(str2)) {
                bitArray.appendBits(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    public static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) throws WriterException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99f9", new Object[]{charSequence, bitArray});
            return;
        }
        int length = charSequence.length();
        while (i < length) {
            int alphanumericCode = getAlphanumericCode(charSequence.charAt(i));
            if (alphanumericCode != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int alphanumericCode2 = getAlphanumericCode(charSequence.charAt(i2));
                    if (alphanumericCode2 != -1) {
                        bitArray.appendBits((alphanumericCode * 45) + alphanumericCode2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    bitArray.appendBits(alphanumericCode, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    public static void appendBytes(String str, Mode mode, BitArray bitArray, String str2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12503363", new Object[]{str, mode, bitArray, str2});
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$minizxing$Mode[mode.ordinal()];
        if (i == 1) {
            appendNumericBytes(str, bitArray);
        } else if (i == 2) {
            appendAlphanumericBytes(str, bitArray);
        } else if (i == 3) {
            append8BitBytes(str, bitArray, str2);
        } else if (i == 4) {
            appendKanjiBytes(str, bitArray);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[LOOP:0: B:8:0x001c->B:21:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void appendKanjiBytes(java.lang.String r8, com.alipay.android.msp.framework.minizxing.BitArray r9) throws com.alipay.android.msp.framework.minizxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.framework.minizxing.Encoder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "808aebc7"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            java.lang.String r3 = "Shift_JIS"
            byte[] r8 = r8.getBytes(r3)     // Catch: UnsupportedEncodingException -> 0x0060
            int r3 = r8.length
        L_0x001c:
            if (r1 >= r3) goto L_0x005f
            r4 = r8[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 33088(0x8140, float:4.6366E-41)
            r6 = -1
            if (r4 < r5) goto L_0x0038
            r7 = 40956(0x9ffc, float:5.7392E-41)
            if (r4 > r7) goto L_0x0038
        L_0x0036:
            int r4 = r4 - r5
            goto L_0x0047
        L_0x0038:
            r5 = 57408(0xe040, float:8.0446E-41)
            if (r4 < r5) goto L_0x0046
            r5 = 60351(0xebbf, float:8.457E-41)
            if (r4 > r5) goto L_0x0046
            r5 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0036
        L_0x0046:
            r4 = -1
        L_0x0047:
            if (r4 == r6) goto L_0x0057
            int r5 = r4 >> 8
            int r5 = r5 * 192
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r4
            r4 = 13
            r9.appendBits(r5, r4)
            int r1 = r1 + r2
            goto L_0x001c
        L_0x0057:
            com.alipay.android.msp.framework.minizxing.WriterException r8 = new com.alipay.android.msp.framework.minizxing.WriterException
            java.lang.String r9 = "Invalid byte sequence"
            r8.<init>(r9)
            throw r8
        L_0x005f:
            return
        L_0x0060:
            r8 = move-exception
            com.alipay.android.msp.framework.minizxing.WriterException r9 = new com.alipay.android.msp.framework.minizxing.WriterException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.minizxing.Encoder.appendKanjiBytes(java.lang.String, com.alipay.android.msp.framework.minizxing.BitArray):void");
    }

    public static void appendLengthInfo(int i, Version version, Mode mode, BitArray bitArray) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314c5ab", new Object[]{new Integer(i), version, mode, bitArray});
            return;
        }
        int characterCountBits = mode.getCharacterCountBits(version);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            bitArray.appendBits(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    public static void appendModeInfo(Mode mode, BitArray bitArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff071c9", new Object[]{mode, bitArray});
        } else {
            bitArray.appendBits(mode.getBits(), 4);
        }
    }

    public static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186ec0e3", new Object[]{charSequence, bitArray});
            return;
        }
        int length = charSequence.length();
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    bitArray.appendBits((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    bitArray.appendBits(charAt, 4);
                }
            }
        }
    }

    public static Mode b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("e3cfd084", new Object[]{str, str2});
        }
        if (!"Shift_JIS".equals(str2)) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    z2 = true;
                } else if (getAlphanumericCode(charAt) == -1) {
                    return Mode.BYTE;
                } else {
                    z = true;
                }
            }
            if (z) {
                return Mode.ALPHANUMERIC;
            }
            if (z2) {
                return Mode.NUMERIC;
            }
            return Mode.BYTE;
        } else if (c(str)) {
            return Mode.KANJI;
        } else {
            return Mode.BYTE;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53e977cc", new Object[]{str})).booleanValue();
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static Mode chooseMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("7c11776a", new Object[]{str});
        }
        return b(str, null);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QRCode) ipChange.ipc$dispatch("3010eb61", new Object[]{str, errorCorrectionLevel}) : encode(str, errorCorrectionLevel, null);
    }

    public static byte[] generateECBytes(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ccb8a5a0", new Object[]{bArr, new Integer(i)});
        }
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static int getAlphanumericCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5be7a89d", new Object[]{new Integer(i)})).intValue();
        }
        if (i < 96) {
            return f3633a[i];
        }
        return -1;
    }

    public static void getNumDataBytesAndNumECBytesForBlockID(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ec7c8f", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, iArr2});
        } else if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = 1 + i9;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    public static BitArray interleaveWithECBytes(BitArray bitArray, int i, int i2, int i3) throws WriterException {
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitArray) ipChange.ipc$dispatch("f9a4dc26", new Object[]{bitArray, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bitArray.getSizeInBytes() == i2) {
            ArrayList arrayList = new ArrayList(i3);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i7 < i3) {
                int[] iArr = new int[i4];
                int[] iArr2 = new int[i4];
                getNumDataBytesAndNumECBytesForBlockID(i, i2, i3, i7, iArr, iArr2);
                int i9 = iArr[0];
                byte[] bArr = new byte[i9];
                bitArray.toBytes(i8 * 8, bArr, 0, i9);
                byte[] generateECBytes = generateECBytes(bArr, iArr2[0]);
                arrayList.add(new BlockPair(bArr, generateECBytes));
                i6 = Math.max(i6, i9);
                i5 = Math.max(i5, generateECBytes.length);
                i8 += iArr[0];
                i7++;
                i4 = 1;
            }
            if (i2 == i8) {
                BitArray bitArray2 = new BitArray();
                for (int i10 = 0; i10 < i6; i10++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] dataBytes = ((BlockPair) it.next()).getDataBytes();
                        if (i10 < dataBytes.length) {
                            bitArray2.appendBits(dataBytes[i10], 8);
                        }
                    }
                }
                for (int i11 = 0; i11 < i5; i11++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] errorCorrectionBytes = ((BlockPair) it2.next()).getErrorCorrectionBytes();
                        if (i11 < errorCorrectionBytes.length) {
                            bitArray2.appendBits(errorCorrectionBytes[i11], 8);
                        }
                    }
                }
                if (i == bitArray2.getSizeInBytes()) {
                    return bitArray2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + bitArray2.getSizeInBytes() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    public static void terminateBits(int i, BitArray bitArray) throws WriterException {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5773931", new Object[]{new Integer(i), bitArray});
            return;
        }
        int i3 = i * 8;
        if (bitArray.getSize() <= i3) {
            for (int i4 = 0; i4 < 4 && bitArray.getSize() < i3; i4++) {
                bitArray.appendBit(false);
            }
            int size = bitArray.getSize() & 7;
            if (size > 0) {
                while (size < 8) {
                    bitArray.appendBit(false);
                    size++;
                }
            }
            int sizeInBytes = i - bitArray.getSizeInBytes();
            for (int i5 = 0; i5 < sizeInBytes; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                bitArray.appendBits(i2, 8);
            }
            if (bitArray.getSize() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i3);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        CharacterSetECI characterSetECIByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QRCode) ipChange.ipc$dispatch("ec48c4ac", new Object[]{str, errorCorrectionLevel, map});
        }
        String str2 = map == null ? null : (String) map.get(EncodeHintType.CHARACTER_SET);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        Mode b = b(str, str2);
        BitArray bitArray = new BitArray();
        Mode mode = Mode.BYTE;
        if (b == mode && !"ISO-8859-1".equals(str2) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2)) != null) {
            bitArray.appendBits(Mode.ECI.getBits(), 4);
            bitArray.appendBits(characterSetECIByName.getValue(), 8);
        }
        appendModeInfo(b, bitArray);
        BitArray bitArray2 = new BitArray();
        appendBytes(str, b, bitArray2, str2);
        Version a2 = a(bitArray.getSize() + b.getCharacterCountBits(a(bitArray.getSize() + b.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray2.getSize(), errorCorrectionLevel)) + bitArray2.getSize(), errorCorrectionLevel);
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBitArray(bitArray);
        appendLengthInfo(b == mode ? bitArray2.getSizeInBytes() : str.length(), a2, b, bitArray3);
        bitArray3.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel = a2.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = a2.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        terminateBits(totalCodewords, bitArray3);
        BitArray interleaveWithECBytes = interleaveWithECBytes(bitArray3, a2.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(b);
        qRCode.setVersion(a2);
        int dimensionForVersion = a2.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            MatrixUtil.buildMatrix(interleaveWithECBytes, errorCorrectionLevel, a2, i3, byteMatrix);
            int applyMaskPenaltyRule1 = MaskUtil.applyMaskPenaltyRule1(byteMatrix) + MaskUtil.applyMaskPenaltyRule2(byteMatrix) + MaskUtil.applyMaskPenaltyRule3(byteMatrix) + MaskUtil.applyMaskPenaltyRule4(byteMatrix);
            if (applyMaskPenaltyRule1 < i) {
                i2 = i3;
                i = applyMaskPenaltyRule1;
            }
        }
        qRCode.setMaskPattern(i2);
        MatrixUtil.buildMatrix(interleaveWithECBytes, errorCorrectionLevel, a2, i2, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }
}
