package com.alipay.ma.util;

import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c0z;
import tb.tck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class StringEncodeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean ASSUME_SHIFT_JIS;
    public static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    public static final String ISO88591 = "ISO8859_1";
    public static final String SHIFT_JIS = "SJIS";
    public static final String TAG = "StringEncodeUtil";
    public static final String UTF8 = "UTF8";

    /* renamed from: a  reason: collision with root package name */
    public static final String f3863a;

    static {
        boolean z;
        String property = System.getProperty("file.encoding");
        f3863a = property;
        if (SHIFT_JIS.equalsIgnoreCase(property) || EUC_JP.equalsIgnoreCase(property)) {
            z = true;
        } else {
            z = false;
        }
        ASSUME_SHIFT_JIS = z;
    }

    public static boolean a(byte[] bArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd587ac9", new Object[]{bArr})).booleanValue();
        }
        boolean z2 = false;
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            if (z2) {
                int i3 = ((i & 255) << 8) | (b & 255);
                if (i3 < 41377 || i3 > 65278) {
                    z = false;
                    break;
                }
                z2 = false;
                i = 0;
            } else if ((b & c0z.STATE) != 0) {
                i = i2;
                z2 = true;
            }
        }
        if (i != 0) {
            return false;
        }
        return z;
    }

    public static boolean b(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aec7", new Object[]{bArr})).booleanValue();
        }
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i5 = 0;
        boolean z = true;
        while (i5 < i && z) {
            int i6 = i - i5;
            byte b = bArr[i5];
            if (i6 > 1) {
                i2 = bArr[i5 + 1] & 255;
            } else {
                i2 = 0;
            }
            if (i6 > 2) {
                i3 = bArr[i5 + 2] & 255;
            } else {
                i3 = 0;
            }
            if (i6 > 3) {
                i4 = bArr[i5 + 3] & 255;
            } else {
                i4 = 0;
            }
            if ((b & 248) == 240 && (i2 & tck.DETECT_WIDTH) == 128 && (i3 & tck.DETECT_WIDTH) == 128 && (i4 & tck.DETECT_WIDTH) == 128) {
                i5 += 4;
            } else if ((b & 240) == 224 && (i2 & tck.DETECT_WIDTH) == 128 && (i3 & tck.DETECT_WIDTH) == 128) {
                i5 += 3;
            } else if ((b & c0z.FIX_STR_MASK) == 192 && (i2 & tck.DETECT_WIDTH) == 128) {
                i5 += 2;
            } else if ((b & c0z.STATE) == 0) {
                i5++;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static String getStringEncode(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7fb5557", new Object[]{bArr, new Boolean(z)});
        }
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return guessEncoding(bArr, z);
            }
            return null;
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        }
    }

    public static String guessEncoding(byte[] bArr, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8b16aa4", new Object[]{bArr, new Boolean(z)});
        }
        int length = bArr.length;
        boolean b = b(bArr);
        if (!z) {
            z2 = a(bArr);
        } else {
            z2 = true;
        }
        int i3 = 0;
        boolean z4 = true;
        boolean z5 = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i3 < length && ((z && z2) || z4 || z5)) {
            int i11 = bArr[i3] & 255;
            if (z && z2 && i11 > 127 && i11 > 176 && i11 <= 247 && (i2 = i3 + 1) < length) {
                int i12 = bArr[i2] & 255;
                if (i12 <= 160 || i12 > 247) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z4) {
                if (i11 > 127 && i11 < 160) {
                    z4 = false;
                } else if (i11 > 159 && (i11 < 192 || i11 == 215 || i11 == 247)) {
                    i8++;
                }
            }
            if (z5) {
                if (i4 > 0) {
                    if (i11 >= 64 && i11 != 127 && i11 <= 252) {
                        i4--;
                    }
                } else if (!(i11 == 128 || i11 == 160 || i11 > 239)) {
                    if (i11 <= 160 || i11 >= 224) {
                        i = 1;
                        if (i11 > 127) {
                            i4++;
                            int i13 = i9 + 1;
                            if (i13 > i6) {
                                i6 = i13;
                                i9 = i6;
                            } else {
                                i9 = i13;
                            }
                        } else {
                            i9 = 0;
                        }
                        i10 = 0;
                    } else {
                        i = 1;
                        i7++;
                        int i14 = i10 + 1;
                        if (i14 > i5) {
                            i5 = i14;
                            i10 = i5;
                        } else {
                            i10 = i14;
                        }
                        i9 = 0;
                    }
                    i3 += i;
                }
                i = 1;
                z5 = false;
                i3 += i;
            }
            i = 1;
            i3 += i;
        }
        if (b) {
            return "UTF8";
        }
        if (!z5 || i4 <= 0) {
            z3 = z5;
        } else {
            z3 = false;
        }
        if (z2) {
            return GB2312;
        }
        if (z3 && (ASSUME_SHIFT_JIS || i5 >= 3 || i6 >= 3)) {
            return SHIFT_JIS;
        }
        if (!z4 || !z3) {
            if (z4) {
                return ISO88591;
            }
            if (z3) {
                return SHIFT_JIS;
            }
            return f3863a;
        } else if ((i5 != 2 || i7 != 2) && i8 * 10 < length) {
            return ISO88591;
        } else {
            return SHIFT_JIS;
        }
    }
}
