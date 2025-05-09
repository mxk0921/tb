package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.Locale;
import tb.c0z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000O0o0 {
    private static final String O000000o = "O000O0o0";
    private final int[] O00000Oo = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
    private int[] O00000o0 = new int[5];
    private int[] O00000o = new int[80];

    private int O000000o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int O00000Oo(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private byte[] O00000o(byte[] bArr) {
        int i;
        int i2;
        try {
            int length = bArr.length;
            int i3 = length % 64;
            if (i3 < 56) {
                i = 55 - i3;
                i2 = (length - i3) + 64;
            } else if (i3 == 56) {
                i2 = length + 72;
                i = 63;
            } else {
                i = 119 - i3;
                i2 = ((length + 64) - i3) + 64;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            int i4 = length + 1;
            bArr2[length] = c0z.STATE;
            int i5 = 0;
            while (i5 < i) {
                bArr2[i4] = 0;
                i5++;
                i4++;
            }
            long j = length * 8;
            byte b = (byte) ((j >> 8) & 255);
            byte b2 = (byte) ((j >> 16) & 255);
            byte b3 = (byte) ((j >> 24) & 255);
            byte b4 = (byte) ((j >> 32) & 255);
            byte b5 = (byte) ((j >> 40) & 255);
            byte b6 = (byte) (j >> 56);
            bArr2[i4] = b6;
            bArr2[i4 + 1] = (byte) (255 & (j >> 48));
            bArr2[i4 + 2] = b5;
            bArr2[i4 + 3] = b4;
            bArr2[i4 + 4] = b3;
            int i6 = i4 + 6;
            bArr2[i4 + 5] = b2;
            bArr2[i6] = b;
            bArr2[i4 + 7] = (byte) (j & 255);
            return bArr2;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private int O00000o0(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int O000000o(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    public static String O00000Oo(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder("");
            if (bArr != null && bArr.length > 0) {
                for (byte b : bArr) {
                    String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.CHINA);
                    if (upperCase.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(upperCase);
                }
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private int O00000o0(byte[] bArr) {
        try {
            int[] iArr = this.O00000Oo;
            System.arraycopy(iArr, 0, this.O00000o0, 0, iArr.length);
            byte[] O00000o = O00000o(bArr);
            int length = O00000o.length / 64;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < 16; i2++) {
                    this.O00000o[i2] = O000000o(O00000o, (i * 64) + (i2 * 4));
                }
                O000000o();
            }
            return 20;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    private int O000000o(byte[] bArr, int i) {
        try {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    private void O000000o() {
        for (int i = 16; i <= 79; i++) {
            try {
                int[] iArr = this.O00000o;
                iArr[i] = O000000o(((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16], 1);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return;
                }
            }
        }
        int[] iArr2 = new int[5];
        for (int i2 = 0; i2 < 5; i2++) {
            iArr2[i2] = this.O00000o0[i2];
        }
        for (int i3 = 0; i3 <= 19; i3++) {
            iArr2[4] = iArr2[3];
            iArr2[3] = iArr2[2];
            iArr2[2] = O000000o(iArr2[1], 30);
            iArr2[1] = iArr2[0];
            iArr2[0] = O000000o(iArr2[0], 5) + O000000o(iArr2[1], iArr2[2], iArr2[3]) + iArr2[4] + this.O00000o[i3] + 1518500249;
        }
        for (int i4 = 20; i4 <= 39; i4++) {
            iArr2[4] = iArr2[3];
            iArr2[3] = iArr2[2];
            iArr2[2] = O000000o(iArr2[1], 30);
            iArr2[1] = iArr2[0];
            iArr2[0] = O000000o(iArr2[0], 5) + O00000Oo(iArr2[1], iArr2[2], iArr2[3]) + iArr2[4] + this.O00000o[i4] + 1859775393;
        }
        for (int i5 = 40; i5 <= 59; i5++) {
            iArr2[4] = iArr2[3];
            iArr2[3] = iArr2[2];
            iArr2[2] = O000000o(iArr2[1], 30);
            iArr2[1] = iArr2[0];
            iArr2[0] = (((O000000o(iArr2[0], 5) + O00000o0(iArr2[1], iArr2[2], iArr2[3])) + iArr2[4]) + this.O00000o[i5]) - 1894007588;
        }
        for (int i6 = 60; i6 <= 79; i6++) {
            iArr2[4] = iArr2[3];
            iArr2[3] = iArr2[2];
            iArr2[2] = O000000o(iArr2[1], 30);
            iArr2[1] = iArr2[0];
            iArr2[0] = (((O000000o(iArr2[0], 5) + O00000Oo(iArr2[1], iArr2[2], iArr2[3])) + iArr2[4]) + this.O00000o[i6]) - 899497514;
        }
        for (int i7 = 0; i7 < 5; i7++) {
            int[] iArr3 = this.O00000o0;
            iArr3[i7] = iArr3[i7] + iArr2[i7];
        }
        int i8 = 0;
        while (true) {
            int[] iArr4 = this.O00000o;
            if (i8 < iArr4.length) {
                iArr4[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }

    private void O000000o(int i, byte[] bArr, int i2) {
        try {
            bArr[i2] = (byte) (i >>> 24);
            bArr[i2 + 1] = (byte) (i >>> 16);
            bArr[i2 + 2] = (byte) (i >>> 8);
            bArr[i2 + 3] = (byte) i;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static byte[] O000000o(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                byte[] bArr = new byte[64];
                byte[] bArr2 = new byte[64];
                byte[] bArr3 = new byte[64];
                int length = str2.length();
                O000O0o0 o000O0o0 = new O000O0o0();
                if (str2.length() > 64) {
                    byte[] O000000o2 = o000O0o0.O000000o(O000o000.O00000Oo(str2));
                    length = O000000o2.length;
                    for (int i = 0; i < length; i++) {
                        bArr3[i] = O000000o2[i];
                    }
                } else {
                    byte[] O00000Oo = O000o000.O00000Oo(str2);
                    for (int i2 = 0; i2 < O00000Oo.length; i2++) {
                        bArr3[i2] = O00000Oo[i2];
                    }
                }
                while (length < 64) {
                    bArr3[length] = 0;
                    length++;
                }
                for (int i3 = 0; i3 < 64; i3++) {
                    bArr[i3] = (byte) (bArr3[i3] ^ 54);
                    bArr2[i3] = (byte) (bArr3[i3] ^ 92);
                }
                return o000O0o0.O000000o(O000000o(bArr2, o000O0o0.O000000o(O000000o(bArr, O000o000.O00000Oo(str)))));
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public byte[] O000000o(byte[] bArr) {
        try {
            O00000o0(bArr);
            byte[] bArr2 = new byte[20];
            int i = 0;
            while (true) {
                int[] iArr = this.O00000o0;
                if (i >= iArr.length) {
                    return bArr2;
                }
                O000000o(iArr[i], bArr2, i * 4);
                i++;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static byte[] O000000o(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = bArr[i];
            }
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr3[bArr.length + i2] = bArr2[i2];
            }
            return bArr3;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
