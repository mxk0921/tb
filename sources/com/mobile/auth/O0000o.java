package com.mobile.auth;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.c0z;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000o {
    private static String O000000o = "O0000o";
    private static char[] O00000Oo = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    private static byte[] O00000o0 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String O000000o(byte[] bArr) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                byte b = bArr[i];
                int i3 = b & 255;
                if (i2 == length) {
                    stringBuffer.append(O00000Oo[i3 >>> 2]);
                    stringBuffer.append(O00000Oo[(b & 3) << 4]);
                    str = "==";
                } else {
                    int i4 = i + 2;
                    byte b2 = bArr[i2];
                    if (i4 == length) {
                        stringBuffer.append(O00000Oo[i3 >>> 2]);
                        stringBuffer.append(O00000Oo[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                        stringBuffer.append(O00000Oo[(b2 & 15) << 2]);
                        str = "=";
                    } else {
                        i += 3;
                        byte b3 = bArr[i4];
                        stringBuffer.append(O00000Oo[i3 >>> 2]);
                        stringBuffer.append(O00000Oo[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                        stringBuffer.append(O00000Oo[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
                        stringBuffer.append(O00000Oo[b3 & 63]);
                    }
                }
                stringBuffer.append(str);
                break;
            }
            return stringBuffer.toString();
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

    private static byte[] O00000Oo(String str) throws Throwable {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bytes = str.getBytes(EncodingUtils.US_ASCII);
            int length = bytes.length;
            int i5 = 0;
            while (i5 < length) {
                while (true) {
                    i = i5 + 1;
                    b = O00000o0[bytes[i5]];
                    if (i >= length || b != -1) {
                        break;
                    }
                    i5 = i;
                }
                if (b == -1) {
                    break;
                }
                while (true) {
                    i2 = i + 1;
                    b2 = O00000o0[bytes[i]];
                    if (i2 >= length || b2 != -1) {
                        break;
                    }
                    i = i2;
                }
                if (b2 == -1) {
                    break;
                }
                stringBuffer.append((char) ((b << 2) | ((b2 & 48) >>> 4)));
                while (true) {
                    i3 = i2 + 1;
                    byte b5 = bytes[i2];
                    if (b5 != 61) {
                        b3 = O00000o0[b5];
                        if (i3 >= length || b3 != -1) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                }
                if (b3 == -1) {
                    break;
                }
                stringBuffer.append((char) (((b2 & 15) << 4) | ((b3 & 60) >>> 2)));
                while (true) {
                    i4 = i3 + 1;
                    byte b6 = bytes[i3];
                    if (b6 != 61) {
                        b4 = O00000o0[b6];
                        if (i4 >= length || b4 != -1) {
                            break;
                        }
                        i3 = i4;
                    } else {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                }
                if (b4 == -1) {
                    break;
                }
                stringBuffer.append((char) (b4 | ((b3 & 3) << 6)));
                i5 = i4;
            }
            return stringBuffer.toString().getBytes("iso8859-1");
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

    public static byte[] O000000o(String str) {
        try {
            return O00000Oo(str);
        } catch (Throwable unused) {
            try {
                return new byte[0];
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
}
