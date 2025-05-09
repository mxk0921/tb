package tb;

import com.alibaba.fastjson2.util.DateUtils;
import com.uc.webview.export.extension.UCExtension;
import java.io.Closeable;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b2d {
    public static final short[] PACKED_DIGITS;
    public static final int[] PACKED_DIGITS_UTF16;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f16137a = {9, 99, 999, krg.LOG_LEVEL_DEBUG, 99999, 999999, 9999999, 99999999, DateUtils.MAX_VALUE, Integer.MAX_VALUE};
    public static final int[] DIGITS_K = new int[1000];
    public static final byte[] b = "-2147483648".getBytes();
    public static final char[] c = "-2147483648".toCharArray();
    public static final byte[] d = "-9223372036854775808".getBytes();
    public static final char[] e = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[] f = new int[256];

    static {
        int i;
        short[] sArr = new short[100];
        sArr[0] = 12336;
        sArr[1] = 12592;
        sArr[2] = 12848;
        sArr[3] = 13104;
        sArr[4] = 13360;
        sArr[5] = 13616;
        sArr[6] = 13872;
        sArr[7] = 14128;
        sArr[8] = 14384;
        sArr[9] = 14640;
        sArr[10] = 12337;
        sArr[11] = 12593;
        sArr[12] = 12849;
        sArr[13] = 13105;
        sArr[14] = 13361;
        sArr[15] = 13617;
        sArr[16] = 13873;
        sArr[17] = 14129;
        sArr[18] = 14385;
        sArr[19] = 14641;
        sArr[20] = 12338;
        sArr[21] = 12594;
        sArr[22] = 12850;
        sArr[23] = 13106;
        sArr[24] = 13362;
        sArr[25] = 13618;
        sArr[26] = 13874;
        sArr[27] = 14130;
        sArr[28] = 14386;
        sArr[29] = 14642;
        sArr[30] = 12339;
        sArr[31] = 12595;
        sArr[32] = 12851;
        sArr[33] = 13107;
        sArr[34] = 13363;
        sArr[35] = 13619;
        sArr[36] = 13875;
        sArr[37] = 14131;
        sArr[38] = 14387;
        sArr[39] = 14643;
        sArr[40] = 12340;
        sArr[41] = 12596;
        sArr[42] = 12852;
        sArr[43] = 13108;
        sArr[44] = 13364;
        sArr[45] = 13620;
        sArr[46] = 13876;
        sArr[47] = 14132;
        sArr[48] = 14388;
        sArr[49] = 14644;
        sArr[50] = 12341;
        sArr[51] = 12597;
        sArr[52] = 12853;
        sArr[53] = 13109;
        sArr[54] = 13365;
        sArr[55] = 13621;
        sArr[56] = 13877;
        sArr[57] = 14133;
        sArr[58] = 14389;
        sArr[59] = 14645;
        sArr[60] = 12342;
        sArr[61] = 12598;
        sArr[62] = 12854;
        sArr[63] = 13110;
        sArr[64] = 13366;
        sArr[65] = 13622;
        sArr[66] = 13878;
        sArr[67] = 14134;
        sArr[68] = 14390;
        sArr[69] = 14646;
        sArr[70] = 12343;
        sArr[71] = 12599;
        sArr[72] = 12855;
        sArr[73] = 13111;
        sArr[74] = 13367;
        sArr[75] = 13623;
        sArr[76] = 13879;
        sArr[77] = 14135;
        sArr[78] = 14391;
        sArr[79] = 14647;
        sArr[80] = 12344;
        sArr[81] = 12600;
        sArr[82] = 12856;
        sArr[83] = 13112;
        sArr[84] = 13368;
        sArr[85] = 13624;
        sArr[86] = 13880;
        sArr[87] = 14136;
        sArr[88] = 14392;
        sArr[89] = 14648;
        sArr[90] = 12345;
        sArr[91] = 12601;
        sArr[92] = 12857;
        sArr[93] = 13113;
        sArr[94] = 13369;
        sArr[95] = 13625;
        sArr[96] = 13881;
        sArr[97] = 14137;
        sArr[98] = 14393;
        sArr[99] = 14649;
        int[] iArr = new int[100];
        iArr[0] = 3145776;
        iArr[1] = 3211312;
        iArr[2] = 3276848;
        iArr[3] = 3342384;
        iArr[4] = 3407920;
        iArr[5] = 3473456;
        iArr[6] = 3538992;
        iArr[7] = 3604528;
        iArr[8] = 3670064;
        iArr[9] = 3735600;
        iArr[10] = 3145777;
        iArr[11] = 3211313;
        iArr[12] = 3276849;
        iArr[13] = 3342385;
        iArr[14] = 3407921;
        iArr[15] = 3473457;
        iArr[16] = 3538993;
        iArr[17] = 3604529;
        iArr[18] = 3670065;
        iArr[19] = 3735601;
        iArr[20] = 3145778;
        iArr[21] = 3211314;
        iArr[22] = 3276850;
        iArr[23] = 3342386;
        iArr[24] = 3407922;
        iArr[25] = 3473458;
        iArr[26] = 3538994;
        iArr[27] = 3604530;
        iArr[28] = 3670066;
        iArr[29] = 3735602;
        iArr[30] = 3145779;
        iArr[31] = 3211315;
        iArr[32] = 3276851;
        iArr[33] = 3342387;
        iArr[34] = 3407923;
        iArr[35] = 3473459;
        iArr[36] = 3538995;
        iArr[37] = 3604531;
        iArr[38] = 3670067;
        iArr[39] = 3735603;
        iArr[40] = 3145780;
        iArr[41] = 3211316;
        iArr[42] = 3276852;
        iArr[43] = 3342388;
        iArr[44] = 3407924;
        iArr[45] = 3473460;
        iArr[46] = 3538996;
        iArr[47] = 3604532;
        iArr[48] = 3670068;
        iArr[49] = 3735604;
        iArr[50] = 3145781;
        iArr[51] = 3211317;
        iArr[52] = 3276853;
        iArr[53] = 3342389;
        iArr[54] = 3407925;
        iArr[55] = 3473461;
        iArr[56] = 3538997;
        iArr[57] = 3604533;
        iArr[58] = 3670069;
        iArr[59] = 3735605;
        iArr[60] = 3145782;
        iArr[61] = 3211318;
        iArr[62] = 3276854;
        iArr[63] = 3342390;
        iArr[64] = 3407926;
        iArr[65] = 3473462;
        iArr[66] = 3538998;
        iArr[67] = 3604534;
        iArr[68] = 3670070;
        iArr[69] = 3735606;
        iArr[70] = 3145783;
        iArr[71] = 3211319;
        iArr[72] = 3276855;
        iArr[73] = 3342391;
        iArr[74] = 3407927;
        iArr[75] = 3473463;
        iArr[76] = 3538999;
        iArr[77] = 3604535;
        iArr[78] = 3670071;
        iArr[79] = 3735607;
        iArr[80] = 3145784;
        iArr[81] = 3211320;
        iArr[82] = 3276856;
        iArr[83] = 3342392;
        iArr[84] = 3407928;
        iArr[85] = 3473464;
        iArr[86] = 3539000;
        iArr[87] = 3604536;
        iArr[88] = 3670072;
        iArr[89] = 3735608;
        iArr[90] = 3145785;
        iArr[91] = 3211321;
        iArr[92] = 3276857;
        iArr[93] = 3342393;
        iArr[94] = 3407929;
        iArr[95] = 3473465;
        iArr[96] = 3539001;
        iArr[97] = 3604537;
        iArr[98] = 3670073;
        iArr[99] = 3735609;
        if (opf.BIG_ENDIAN) {
            for (int i2 = 0; i2 < 100; i2++) {
                sArr[i2] = Short.reverseBytes(sArr[i2]);
            }
            for (int i3 = 0; i3 < 100; i3++) {
                iArr[i3] = Integer.reverseBytes(iArr[i3] << 8);
            }
        }
        PACKED_DIGITS = sArr;
        PACKED_DIGITS_UTF16 = iArr;
        Arrays.fill(f, -1);
        int length = e.length;
        for (int i4 = 0; i4 < length; i4++) {
            f[e[i4]] = i4;
        }
        f[61] = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = DIGITS_K;
            if (i5 < iArr2.length) {
                if (i5 < 10) {
                    i = UCExtension.EXTEND_INPUT_TYPE_IDCARD;
                } else if (i5 < 100) {
                    i = 16777216;
                } else {
                    i = 0;
                }
                iArr2[i5] = i + (((i5 / 100) + 48) << 16) + ((((i5 / 10) % 10) + 48) << 8) + (i5 % 10) + 48;
                i5++;
            } else {
                return;
            }
        }
    }

    public static long a(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static byte[] c(String str) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            iArr = f;
            if (i5 >= i4 || iArr[str.charAt(i5) & 255] >= 0) {
                break;
            }
            i5++;
        }
        while (i4 > 0 && iArr[str.charAt(i4) & 255] < 0) {
            i4--;
        }
        if (str.charAt(i4) != '=') {
            i = 0;
        } else if (str.charAt(i4 - 1) == '=') {
            i = 2;
        } else {
            i = 1;
        }
        int i6 = (i4 - i5) + 1;
        if (length > 76) {
            if (str.charAt(76) == '\r') {
                i3 = i6 / 78;
            } else {
                i3 = 0;
            }
            i2 = i3 << 1;
        } else {
            i2 = 0;
        }
        int i7 = (((i6 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = (iArr[str.charAt(i5)] << 18) | (iArr[str.charAt(i5 + 1)] << 12) | (iArr[str.charAt(i5 + 2)] << 6) | iArr[str.charAt(i5 + 3)];
            int i12 = i5 + 4;
            bArr[i9] = (byte) (i11 >> 16);
            bArr[i9 + 1] = (byte) (i11 >> 8);
            bArr[i9 + 2] = (byte) i11;
            i9 += 3;
            if (i2 <= 0 || (i10 = i10 + 1) != 19) {
                i5 = i12;
            } else {
                i5 += 6;
                i10 = 0;
            }
        }
        if (i9 < i7) {
            int i13 = 0;
            int i14 = 0;
            while (i5 <= i4 - i) {
                i13 |= iArr[str.charAt(i5)] << (18 - (i14 * 6));
                i14++;
                i5++;
            }
            int i15 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i13 >> i15);
                i15 -= 8;
                i9++;
            }
        }
        return bArr;
    }

    public static int d(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        char c2;
        int i6 = i + i2;
        int min = Math.min(i2, bArr.length) + i3;
        while (i3 < min && (c2 = cArr[i]) < 128) {
            i++;
            bArr[i3] = (byte) c2;
            i3++;
        }
        while (i < i6) {
            int i7 = i + 1;
            char c3 = cArr[i];
            if (c3 < 128) {
                i4 = i3 + 1;
                bArr[i3] = (byte) c3;
            } else {
                if (c3 < 2048) {
                    bArr[i3] = (byte) ((c3 >> 6) | tck.DETECT_WIDTH);
                    bArr[i3 + 1] = (byte) ((c3 & f7l.CONDITION_IF) | 128);
                    i3 += 2;
                } else if (c3 < 55296 || c3 >= 57344) {
                    bArr[i3] = (byte) ((c3 >> '\f') | 224);
                    bArr[i3 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                    bArr[i3 + 2] = (byte) ((c3 & f7l.CONDITION_IF) | 128);
                    i3 += 3;
                } else if (c3 < 56320) {
                    if (i6 - i < 2) {
                        i5 = -1;
                    } else {
                        char c4 = cArr[i + 1];
                        if (c4 < 56320 || c4 >= 57344) {
                            i4 = i3 + 1;
                            bArr[i3] = 63;
                        } else {
                            i5 = ((c3 << '\n') + c4) - 56613888;
                        }
                    }
                    if (i5 < 0) {
                        i4 = i3 + 1;
                        bArr[i3] = 63;
                    } else {
                        bArr[i3] = (byte) ((i5 >> 18) | 240);
                        bArr[i3 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                        bArr[i3 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                        bArr[i3 + 3] = (byte) ((i5 & 63) | 128);
                        i7 = i + 2;
                        i4 = i3 + 4;
                    }
                } else {
                    i4 = i3 + 1;
                    bArr[i3] = 63;
                }
                i = i7;
            }
            i3 = i4;
            i = i7;
        }
        return i3;
    }

    public static long e(long j, long j2) {
        long j3 = j / j2;
        if ((j ^ j2) >= 0 || j2 * j3 == j) {
            return j3;
        }
        return j3 - 1;
    }

    public static long f(long j, long j2) {
        return j - (e(j, j2) * j2);
    }

    public static int g(byte[] bArr, int i) {
        int i2 = opf.UNSAFE.getInt(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i);
        if (opf.BIG_ENDIAN) {
            return i2;
        }
        return Integer.reverseBytes(i2);
    }

    public static boolean h(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '+' || charAt == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean i(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 == '+' || c2 == '-') {
                if (i != 0) {
                    return false;
                }
            } else if (c2 < '0' || c2 > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static long j(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && (j != Long.MIN_VALUE || j2 != -1))) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int k(int i) {
        int i2 = 0;
        while (i > f16137a[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    public static int l(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                byte[] bArr2 = b;
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                return i + bArr2.length;
            }
            i2 = -i2;
            bArr[i] = 45;
            i++;
        }
        if (i2 < 1000) {
            int i4 = DIGITS_K[i2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                bArr[i] = (byte) (i4 >> 16);
                bArr[i + 1] = (byte) (i4 >> 8);
                i += 2;
            } else if (i5 == 1) {
                bArr[i] = (byte) (i4 >> 8);
                i++;
            }
            int i6 = i + 1;
            bArr[i] = (byte) i4;
            return i6;
        }
        int i7 = i2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[i2 - (i7 * 1000)];
        if (i2 < 1000000) {
            int i9 = iArr[i7];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                bArr[i] = (byte) (i9 >> 16);
                bArr[i + 1] = (byte) (i9 >> 8);
                i += 2;
            } else if (i10 == 1) {
                bArr[i] = (byte) (i9 >> 8);
                i++;
            }
            bArr[i] = (byte) i9;
            bArr[i + 1] = (byte) (i8 >> 16);
            bArr[i + 2] = (byte) (i8 >> 8);
            bArr[i + 3] = (byte) i8;
            return i + 4;
        }
        int i11 = i7 / 1000;
        int i12 = i11 / 1000;
        int i13 = iArr[i7 - (i11 * 1000)];
        if (i12 == 0) {
            int i14 = iArr[i11];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                bArr[i] = (byte) (i14 >> 16);
                bArr[i + 1] = (byte) (i14 >> 8);
                i += 2;
            } else if (i15 == 1) {
                bArr[i] = (byte) (i14 >> 8);
                i++;
            }
            i3 = i + 1;
            bArr[i] = (byte) i14;
        } else {
            bArr[i] = (byte) (i12 + 48);
            int i16 = iArr[i11 - (i12 * 1000)];
            bArr[i + 1] = (byte) (i16 >> 16);
            bArr[i + 2] = (byte) (i16 >> 8);
            bArr[i + 3] = (byte) i16;
            i3 = i + 4;
        }
        bArr[i3] = (byte) (i13 >> 16);
        bArr[i3 + 1] = (byte) (i13 >> 8);
        bArr[i3 + 2] = (byte) i13;
        bArr[i3 + 3] = (byte) (i8 >> 16);
        bArr[i3 + 4] = (byte) (i8 >> 8);
        bArr[i3 + 5] = (byte) i8;
        return i3 + 6;
    }

    public static int m(char[] cArr, int i, int i2) {
        int i3;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                char[] cArr2 = c;
                System.arraycopy(cArr2, 0, cArr, i, cArr2.length);
                return i + cArr2.length;
            }
            i2 = -i2;
            cArr[i] = '-';
            i++;
        }
        if (i2 < 1000) {
            int i4 = DIGITS_K[i2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                cArr[i] = (char) ((byte) (i4 >> 16));
                cArr[i + 1] = (char) ((byte) (i4 >> 8));
                i += 2;
            } else if (i5 == 1) {
                cArr[i] = (char) ((byte) (i4 >> 8));
                i++;
            }
            int i6 = i + 1;
            cArr[i] = (char) ((byte) i4);
            return i6;
        }
        int i7 = i2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[i2 - (i7 * 1000)];
        if (i2 < 1000000) {
            int i9 = iArr[i7];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                cArr[i] = (char) ((byte) (i9 >> 16));
                cArr[i + 1] = (char) ((byte) (i9 >> 8));
                i += 2;
            } else if (i10 == 1) {
                cArr[i] = (char) ((byte) (i9 >> 8));
                i++;
            }
            cArr[i] = (char) ((byte) i9);
            cArr[i + 1] = (char) ((byte) (i8 >> 16));
            cArr[i + 2] = (char) ((byte) (i8 >> 8));
            cArr[i + 3] = (char) ((byte) i8);
            return i + 4;
        }
        int i11 = i7 / 1000;
        int i12 = i11 / 1000;
        int i13 = iArr[i7 - (i11 * 1000)];
        if (i12 == 0) {
            int i14 = iArr[i11];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                cArr[i] = (char) ((byte) (i14 >> 16));
                cArr[i + 1] = (char) ((byte) (i14 >> 8));
                i += 2;
            } else if (i15 == 1) {
                cArr[i] = (char) ((byte) (i14 >> 8));
                i++;
            }
            i3 = i + 1;
            cArr[i] = (char) ((byte) i14);
        } else {
            cArr[i] = (char) ((byte) (i12 + 48));
            int i16 = iArr[i11 - (i12 * 1000)];
            cArr[i + 1] = (char) ((byte) (i16 >> 16));
            cArr[i + 2] = (char) ((byte) (i16 >> 8));
            cArr[i + 3] = (char) ((byte) i16);
            i3 = i + 4;
        }
        cArr[i3] = (char) ((byte) (i13 >> 16));
        cArr[i3 + 1] = (char) ((byte) (i13 >> 8));
        cArr[i3 + 2] = (char) ((byte) i13);
        cArr[i3 + 3] = (char) ((byte) (i8 >> 16));
        cArr[i3 + 4] = (char) ((byte) (i8 >> 8));
        cArr[i3 + 5] = (char) ((byte) i8);
        return i3 + 6;
    }

    public static int n(byte[] bArr, int i, long j) {
        int i2;
        int i3 = i;
        long j2 = j;
        if (j2 < 0) {
            if (j2 == Long.MIN_VALUE) {
                byte[] bArr2 = d;
                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                return bArr2.length + i3;
            }
            j2 = -j2;
            bArr[i3] = 45;
            i3++;
        }
        if (j2 < 1000) {
            int i4 = DIGITS_K[(int) j2];
            int i5 = i4 >> 24;
            if (i5 == 0) {
                bArr[i3] = (byte) (i4 >> 16);
                bArr[i3 + 1] = (byte) (i4 >> 8);
                i3 += 2;
            } else if (i5 == 1) {
                bArr[i3] = (byte) (i4 >> 8);
                i3++;
            }
            int i6 = i3 + 1;
            bArr[i3] = (byte) i4;
            return i6;
        }
        long j3 = j2 / 1000;
        int[] iArr = DIGITS_K;
        int i7 = iArr[(int) (j2 - (j3 * 1000))];
        if (j2 < 1000000) {
            int i8 = iArr[(int) j3];
            int i9 = i8 >> 24;
            if (i9 == 0) {
                bArr[i3] = (byte) (i8 >> 16);
                bArr[i3 + 1] = (byte) (i8 >> 8);
                i3 += 2;
            } else if (i9 == 1) {
                bArr[i3] = (byte) (i8 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i8;
            bArr[i3 + 1] = (byte) (i7 >> 16);
            bArr[i3 + 2] = (byte) (i7 >> 8);
            bArr[i3 + 3] = (byte) i7;
            return i3 + 4;
        }
        long j4 = j3 / 1000;
        int i10 = iArr[(int) (j3 - (j4 * 1000))];
        if (j2 < 1000000000) {
            int i11 = iArr[(int) j4];
            int i12 = i11 >> 24;
            if (i12 == 0) {
                bArr[i3] = (byte) (i11 >> 16);
                bArr[i3 + 1] = (byte) (i11 >> 8);
                i3 += 2;
            } else if (i12 == 1) {
                bArr[i3] = (byte) (i11 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i11;
            bArr[i3 + 1] = (byte) (i10 >> 16);
            bArr[i3 + 2] = (byte) (i10 >> 8);
            bArr[i3 + 3] = (byte) i10;
            bArr[i3 + 4] = (byte) (i7 >> 16);
            bArr[i3 + 5] = (byte) (i7 >> 8);
            bArr[i3 + 6] = (byte) i7;
            return i3 + 7;
        }
        long j5 = j4 / 1000;
        int i13 = iArr[(int) (j4 - (j5 * 1000))];
        if (j2 < 1000000000000L) {
            int i14 = iArr[(int) j5];
            int i15 = i14 >> 24;
            if (i15 == 0) {
                bArr[i3] = (byte) (i14 >> 16);
                bArr[i3 + 1] = (byte) (i14 >> 8);
                i3 += 2;
            } else if (i15 == 1) {
                bArr[i3] = (byte) (i14 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i14;
            bArr[i3 + 1] = (byte) (i13 >> 16);
            bArr[i3 + 2] = (byte) (i13 >> 8);
            bArr[i3 + 3] = (byte) i13;
            bArr[i3 + 4] = (byte) (i10 >> 16);
            bArr[i3 + 5] = (byte) (i10 >> 8);
            bArr[i3 + 6] = (byte) i10;
            bArr[i3 + 7] = (byte) (i7 >> 16);
            bArr[i3 + 8] = (byte) (i7 >> 8);
            bArr[i3 + 9] = (byte) i7;
            return i3 + 10;
        }
        int i16 = (int) (j5 / 1000);
        int i17 = iArr[(int) (j5 - (i16 * 1000))];
        if (j2 < 1000000000000000L) {
            int i18 = iArr[i16];
            int i19 = i18 >> 24;
            if (i19 == 0) {
                bArr[i3] = (byte) (i18 >> 16);
                bArr[i3 + 1] = (byte) (i18 >> 8);
                i3 += 2;
            } else if (i19 == 1) {
                bArr[i3] = (byte) (i18 >> 8);
                i3++;
            }
            bArr[i3] = (byte) i18;
            bArr[i3 + 1] = (byte) (i17 >> 16);
            bArr[i3 + 2] = (byte) (i17 >> 8);
            bArr[i3 + 3] = (byte) i17;
            bArr[i3 + 4] = (byte) (i13 >> 16);
            bArr[i3 + 5] = (byte) (i13 >> 8);
            bArr[i3 + 6] = (byte) i13;
            bArr[i3 + 7] = (byte) (i10 >> 16);
            bArr[i3 + 8] = (byte) (i10 >> 8);
            bArr[i3 + 9] = (byte) i10;
            bArr[i3 + 10] = (byte) (i7 >> 16);
            bArr[i3 + 11] = (byte) (i7 >> 8);
            bArr[i3 + 12] = (byte) i7;
            return i3 + 13;
        }
        int i20 = i16 / 1000;
        int i21 = i20 / 1000;
        int i22 = iArr[i16 - (i20 * 1000)];
        if (i21 == 0) {
            int i23 = iArr[i20];
            int i24 = i23 >> 24;
            if (i24 == 0) {
                bArr[i3] = (byte) (i23 >> 16);
                bArr[i3 + 1] = (byte) (i23 >> 8);
                i3 += 2;
            } else if (i24 == 1) {
                bArr[i3] = (byte) (i23 >> 8);
                i3++;
            }
            i2 = i3 + 1;
            bArr[i3] = (byte) i23;
        } else {
            bArr[i3] = (byte) (i21 + 48);
            int i25 = iArr[i20 - (i21 * 1000)];
            bArr[i3 + 1] = (byte) (i25 >> 16);
            bArr[i3 + 2] = (byte) (i25 >> 8);
            bArr[i3 + 3] = (byte) i25;
            i2 = i3 + 4;
        }
        bArr[i2] = (byte) (i22 >> 16);
        bArr[i2 + 1] = (byte) (i22 >> 8);
        bArr[i2 + 2] = (byte) i22;
        bArr[i2 + 3] = (byte) (i17 >> 16);
        bArr[i2 + 4] = (byte) (i17 >> 8);
        bArr[i2 + 5] = (byte) i17;
        bArr[i2 + 6] = (byte) (i13 >> 16);
        bArr[i2 + 7] = (byte) (i13 >> 8);
        bArr[i2 + 8] = (byte) i13;
        bArr[i2 + 9] = (byte) (i10 >> 16);
        bArr[i2 + 10] = (byte) (i10 >> 8);
        bArr[i2 + 11] = (byte) i10;
        bArr[i2 + 12] = (byte) (i7 >> 16);
        bArr[i2 + 13] = (byte) (i7 >> 8);
        bArr[i2 + 14] = (byte) i7;
        return i2 + 15;
    }

    public static int o(char[] cArr, int i, long j) {
        int i2;
        int i3;
        long j2 = j;
        if (j2 >= 0) {
            i2 = i;
        } else if (j2 == Long.MIN_VALUE) {
            int i4 = 0;
            while (true) {
                byte[] bArr = d;
                if (i4 >= bArr.length) {
                    return i + bArr.length;
                }
                cArr[i + i4] = (char) bArr[i4];
                i4++;
            }
        } else {
            j2 = -j2;
            i2 = i + 1;
            cArr[i] = '-';
        }
        if (j2 < 1000) {
            int i5 = DIGITS_K[(int) j2];
            int i6 = i5 >> 24;
            if (i6 == 0) {
                cArr[i2] = (char) ((byte) (i5 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i5 >> 8));
                i2 += 2;
            } else if (i6 == 1) {
                cArr[i2] = (char) ((byte) (i5 >> 8));
                i2++;
            }
            int i7 = i2 + 1;
            cArr[i2] = (char) ((byte) i5);
            return i7;
        }
        long j3 = j2 / 1000;
        int[] iArr = DIGITS_K;
        int i8 = iArr[(int) (j2 - (j3 * 1000))];
        if (j2 < 1000000) {
            int i9 = iArr[(int) j3];
            int i10 = i9 >> 24;
            if (i10 == 0) {
                cArr[i2] = (char) ((byte) (i9 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i9 >> 8));
                i2 += 2;
            } else if (i10 == 1) {
                cArr[i2] = (char) ((byte) (i9 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i9);
            cArr[i2 + 1] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 3] = (char) ((byte) i8);
            return i2 + 4;
        }
        long j4 = j3 / 1000;
        int i11 = iArr[(int) (j3 - (j4 * 1000))];
        if (j2 < 1000000000) {
            int i12 = iArr[(int) j4];
            int i13 = i12 >> 24;
            if (i13 == 0) {
                cArr[i2] = (char) ((byte) (i12 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i12 >> 8));
                i2 += 2;
            } else if (i13 == 1) {
                cArr[i2] = (char) ((byte) (i12 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i12);
            cArr[i2 + 1] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 3] = (char) ((byte) i11);
            cArr[i2 + 4] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 6] = (char) ((byte) i8);
            return i2 + 7;
        }
        long j5 = j4 / 1000;
        int i14 = iArr[(int) (j4 - (j5 * 1000))];
        if (j2 < 1000000000000L) {
            int i15 = iArr[(int) j5];
            int i16 = i15 >> 24;
            if (i16 == 0) {
                cArr[i2] = (char) ((byte) (i15 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i15 >> 8));
                i2 += 2;
            } else if (i16 == 1) {
                cArr[i2] = (char) ((byte) (i15 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i15);
            cArr[i2 + 1] = (char) ((byte) (i14 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i14 >> 8));
            cArr[i2 + 3] = (char) ((byte) i14);
            cArr[i2 + 4] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 6] = (char) ((byte) i11);
            cArr[i2 + 7] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 8] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 9] = (char) ((byte) i8);
            return i2 + 10;
        }
        int i17 = (int) (j5 / 1000);
        int i18 = iArr[(int) (j5 - (i17 * 1000))];
        if (j2 < 1000000000000000L) {
            int i19 = iArr[i17];
            int i20 = i19 >> 24;
            if (i20 == 0) {
                cArr[i2] = (char) ((byte) (i19 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i19 >> 8));
                i2 += 2;
            } else if (i20 == 1) {
                cArr[i2] = (char) ((byte) (i19 >> 8));
                i2++;
            }
            cArr[i2] = (char) ((byte) i19);
            cArr[i2 + 1] = (char) ((byte) (i18 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i18 >> 8));
            cArr[i2 + 3] = (char) ((byte) i18);
            cArr[i2 + 4] = (char) ((byte) (i14 >> 16));
            cArr[i2 + 5] = (char) ((byte) (i14 >> 8));
            cArr[i2 + 6] = (char) ((byte) i14);
            cArr[i2 + 7] = (char) ((byte) (i11 >> 16));
            cArr[i2 + 8] = (char) ((byte) (i11 >> 8));
            cArr[i2 + 9] = (char) ((byte) i11);
            cArr[i2 + 10] = (char) ((byte) (i8 >> 16));
            cArr[i2 + 11] = (char) ((byte) (i8 >> 8));
            cArr[i2 + 12] = (char) ((byte) i8);
            return i2 + 13;
        }
        int i21 = i17 / 1000;
        int i22 = i21 / 1000;
        int i23 = iArr[i17 - (i21 * 1000)];
        if (i22 == 0) {
            int i24 = iArr[i21];
            int i25 = i24 >> 24;
            if (i25 == 0) {
                cArr[i2] = (char) ((byte) (i24 >> 16));
                cArr[i2 + 1] = (char) ((byte) (i24 >> 8));
                i2 += 2;
            } else if (i25 == 1) {
                cArr[i2] = (char) ((byte) (i24 >> 8));
                i2++;
            }
            i3 = i2 + 1;
            cArr[i2] = (char) ((byte) i24);
        } else {
            cArr[i2] = (char) ((byte) (i22 + 48));
            int i26 = iArr[i21 - (i22 * 1000)];
            cArr[i2 + 1] = (char) ((byte) (i26 >> 16));
            cArr[i2 + 2] = (char) ((byte) (i26 >> 8));
            cArr[i2 + 3] = (char) ((byte) i26);
            i3 = i2 + 4;
        }
        cArr[i3] = (char) ((byte) (i23 >> 16));
        cArr[i3 + 1] = (char) ((byte) (i23 >> 8));
        cArr[i3 + 2] = (char) ((byte) i23);
        cArr[i3 + 3] = (char) ((byte) (i18 >> 16));
        cArr[i3 + 4] = (char) ((byte) (i18 >> 8));
        cArr[i3 + 5] = (char) ((byte) i18);
        cArr[i3 + 6] = (char) ((byte) (i14 >> 16));
        cArr[i3 + 7] = (char) ((byte) (i14 >> 8));
        cArr[i3 + 8] = (char) ((byte) i14);
        cArr[i3 + 9] = (char) ((byte) (i11 >> 16));
        cArr[i3 + 10] = (char) ((byte) (i11 >> 8));
        cArr[i3 + 11] = (char) ((byte) i11);
        cArr[i3 + 12] = (char) ((byte) (i8 >> 16));
        cArr[i3 + 13] = (char) ((byte) (i8 >> 8));
        cArr[i3 + 14] = (char) ((byte) i8);
        return i3 + 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int p(byte[] r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 45
            if (r12 >= 0) goto L_0x000b
            int r1 = r11 + 1
            r10[r11] = r0
            int r12 = -r12
        L_0x0009:
            r11 = r1
            goto L_0x0016
        L_0x000b:
            r1 = 9999(0x270f, float:1.4012E-41)
            if (r12 <= r1) goto L_0x0016
            int r1 = r11 + 1
            r2 = 43
            r10[r11] = r2
            goto L_0x0009
        L_0x0016:
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r12 >= r1) goto L_0x0039
            int r1 = r12 / 100
            int r2 = r1 * 100
            int r12 = r12 - r2
            sun.misc.Unsafe r2 = tb.opf.UNSAFE
            long r3 = tb.opf.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r11
            long r7 = r3 + r5
            short[] r9 = tb.b2d.PACKED_DIGITS
            short r1 = r9[r1]
            r2.putShort(r10, r7, r1)
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 + r5
            short r12 = r9[r12]
            r2.putShort(r10, r3, r12)
            int r11 = r11 + 4
            goto L_0x003d
        L_0x0039:
            int r11 = l(r10, r11, r12)
        L_0x003d:
            r10[r11] = r0
            sun.misc.Unsafe r12 = tb.opf.UNSAFE
            long r1 = tb.opf.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r11
            long r5 = r1 + r3
            r7 = 1
            long r5 = r5 + r7
            short[] r7 = tb.b2d.PACKED_DIGITS
            short r13 = r7[r13]
            r12.putShort(r10, r5, r13)
            int r13 = r11 + 3
            r10[r13] = r0
            long r1 = r1 + r3
            r3 = 4
            long r1 = r1 + r3
            short r13 = r7[r14]
            r12.putShort(r10, r1, r13)
            int r11 = r11 + 6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b2d.p(byte[], int, int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int q(char[] r8, int r9, int r10, int r11, int r12) {
        /*
            r0 = 45
            if (r10 >= 0) goto L_0x000b
            int r1 = r9 + 1
            r8[r9] = r0
            int r10 = -r10
        L_0x0009:
            r9 = r1
            goto L_0x0016
        L_0x000b:
            r1 = 9999(0x270f, float:1.4012E-41)
            if (r10 <= r1) goto L_0x0016
            int r1 = r9 + 1
            r2 = 43
            r8[r9] = r2
            goto L_0x0009
        L_0x0016:
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r10 >= r1) goto L_0x003c
            int r1 = r10 / 100
            int r2 = r1 * 100
            int r10 = r10 - r2
            sun.misc.Unsafe r2 = tb.opf.UNSAFE
            long r3 = tb.opf.ARRAY_CHAR_BASE_OFFSET
            int r5 = r9 << 1
            long r5 = (long) r5
            long r5 = r5 + r3
            int[] r7 = tb.b2d.PACKED_DIGITS_UTF16
            r1 = r7[r1]
            r2.putInt(r8, r5, r1)
            int r1 = r9 + 2
            int r1 = r1 << 1
            long r5 = (long) r1
            long r3 = r3 + r5
            r10 = r7[r10]
            r2.putInt(r8, r3, r10)
            int r9 = r9 + 4
            goto L_0x0040
        L_0x003c:
            int r9 = m(r8, r9, r10)
        L_0x0040:
            r8[r9] = r0
            sun.misc.Unsafe r10 = tb.opf.UNSAFE
            long r1 = tb.opf.ARRAY_CHAR_BASE_OFFSET
            int r3 = r9 + 1
            int r3 = r3 << 1
            long r3 = (long) r3
            long r3 = r3 + r1
            int[] r5 = tb.b2d.PACKED_DIGITS_UTF16
            r11 = r5[r11]
            r10.putInt(r8, r3, r11)
            int r11 = r9 + 3
            r8[r11] = r0
            int r11 = r9 + 4
            int r11 = r11 << 1
            long r3 = (long) r11
            long r1 = r1 + r3
            r11 = r5[r12]
            r10.putInt(r8, r1, r11)
            int r9 = r9 + 6
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b2d.q(char[], int, int, int, int):int");
    }

    public static int r(byte[] bArr, int i, x9h x9hVar) {
        int i2;
        int[] iArr = DIGITS_K;
        int i3 = iArr[x9hVar.f31233a];
        bArr[i] = (byte) (i3 >> 8);
        bArr[i + 1] = (byte) i3;
        bArr[i + 2] = 58;
        int i4 = iArr[x9hVar.b];
        bArr[i + 3] = (byte) (i4 >> 8);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = 58;
        int i5 = iArr[x9hVar.c];
        bArr[i + 6] = (byte) (i5 >> 8);
        bArr[i + 7] = (byte) i5;
        int i6 = i + 8;
        int i7 = x9hVar.d;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i7 / 1000;
        int i9 = i8 / 1000;
        int i10 = i7 - (i8 * 1000);
        bArr[i6] = 46;
        int i11 = iArr[i9];
        bArr[i + 9] = (byte) (i11 >> 16);
        bArr[i + 10] = (byte) (i11 >> 8);
        bArr[i + 11] = (byte) i11;
        int i12 = i + 12;
        if (i10 == 0) {
            int i13 = i8 - (i9 * 1000);
            if (i13 == 0) {
                return i12;
            }
            i2 = iArr[i13];
        } else {
            i2 = iArr[i8 - (i9 * 1000)];
        }
        bArr[i12] = (byte) (i2 >> 16);
        bArr[i + 13] = (byte) (i2 >> 8);
        bArr[i + 14] = (byte) i2;
        int i14 = i + 15;
        if (i10 == 0) {
            return i14;
        }
        int i15 = iArr[i10];
        bArr[i14] = (byte) (i15 >> 16);
        bArr[i + 16] = (byte) (i15 >> 8);
        bArr[i + 17] = (byte) i15;
        return i + 18;
    }

    public static int s(char[] cArr, int i, x9h x9hVar) {
        int i2;
        int[] iArr = DIGITS_K;
        int i3 = iArr[x9hVar.f31233a];
        cArr[i] = (char) ((byte) (i3 >> 8));
        cArr[i + 1] = (char) ((byte) i3);
        cArr[i + 2] = f7l.CONDITION_IF_MIDDLE;
        int i4 = iArr[x9hVar.b];
        cArr[i + 3] = (char) ((byte) (i4 >> 8));
        cArr[i + 4] = (char) ((byte) i4);
        cArr[i + 5] = f7l.CONDITION_IF_MIDDLE;
        int i5 = iArr[x9hVar.c];
        cArr[i + 6] = (char) ((byte) (i5 >> 8));
        cArr[i + 7] = (char) ((byte) i5);
        int i6 = i + 8;
        int i7 = x9hVar.d;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i7 / 1000;
        int i9 = i8 / 1000;
        int i10 = i7 - (i8 * 1000);
        cArr[i6] = '.';
        int i11 = iArr[i9];
        cArr[i + 9] = (char) ((byte) (i11 >> 16));
        cArr[i + 10] = (char) ((byte) (i11 >> 8));
        cArr[i + 11] = (char) ((byte) i11);
        int i12 = i + 12;
        if (i10 == 0) {
            int i13 = i8 - (i9 * 1000);
            if (i13 == 0) {
                return i12;
            }
            i2 = iArr[i13];
        } else {
            i2 = iArr[i8 - (i9 * 1000)];
        }
        cArr[i12] = (char) ((byte) (i2 >> 16));
        cArr[i + 13] = (char) ((byte) (i2 >> 8));
        cArr[i + 14] = (char) ((byte) i2);
        int i14 = i + 15;
        if (i10 == 0) {
            return i14;
        }
        int i15 = iArr[i10];
        cArr[i14] = (char) ((byte) (i15 >> 16));
        cArr[i + 16] = (char) ((byte) (i15 >> 8));
        cArr[i + 17] = (char) ((byte) i15);
        return i + 18;
    }
}
