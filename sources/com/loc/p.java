package com.loc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5749a = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    private static final byte[] b = new byte[128];

    static {
        int i = 48;
        for (int i2 = 0; i2 < 128; i2++) {
            b[i2] = -1;
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            b[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 97; i4 <= 122; i4++) {
            b[i4] = (byte) (i4 - 71);
        }
        while (true) {
            byte[] bArr = b;
            if (i <= 57) {
                bArr[i] = (byte) (i + 4);
                i++;
            } else {
                bArr[43] = 62;
                bArr[47] = 63;
                return;
            }
        }
    }

    public static String a(String str) {
        return x.a(b(str));
    }

    public static String b(byte[] bArr) {
        try {
            return d(bArr);
        } catch (Throwable th) {
            as.a(th, "er", "e64");
            return null;
        }
    }

    public static String c(byte[] bArr) {
        try {
            return d(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String d(byte[] bArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                char[] cArr = f5749a;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                str = "==";
            } else {
                int i4 = i + 2;
                byte b3 = bArr[i2];
                if (i4 == length) {
                    char[] cArr2 = f5749a;
                    stringBuffer.append(cArr2[i3 >>> 2]);
                    stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                    stringBuffer.append(cArr2[(b3 & 15) << 2]);
                    str = "=";
                } else {
                    i += 3;
                    byte b4 = bArr[i4];
                    char[] cArr3 = f5749a;
                    stringBuffer.append(cArr3[i3 >>> 2]);
                    stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                    stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
                    stringBuffer.append(cArr3[b4 & 63]);
                }
            }
            stringBuffer.append(str);
            break;
        }
        return stringBuffer.toString();
    }

    public static byte[] a(byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        KeyGenerator instance = KeyGenerator.getInstance(x.c("EQUVT"));
        if (instance == null) {
            return null;
        }
        instance.init(256);
        byte[] encoded = instance.generateKey().getEncoded();
        PublicKey d = x.d();
        if (d == null) {
            return null;
        }
        byte[] a2 = a(encoded, d);
        byte[] a3 = a(encoded, bArr);
        byte[] bArr2 = new byte[a2.length + a3.length];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(a3, 0, bArr2, a2.length, a3.length);
        return bArr2;
    }

    public static byte[] b(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3 = 0;
        if (str == null) {
            return new byte[0];
        }
        byte[] a2 = x.a(str);
        int length = a2.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                b2 = b[a2[i3]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i3 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = b[a2[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (i2 != length) {
                int i4 = i2 + 1;
                byte b4 = a2[i2];
                if (b4 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b5 = b[b4];
                if (i4 >= length || b5 != -1) {
                    if (b5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(((b3 & 15) << 4) | ((b5 & 60) >>> 2));
                    while (i4 != length) {
                        int i5 = i4 + 1;
                        byte b6 = a2[i4];
                        if (b6 == 61) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byte b7 = b[b6];
                        if (i5 >= length || b7 != -1) {
                            if (b7 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(b7 | ((b5 & 3) << 6));
                            i3 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
                i2 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, x.c("EQUVT"));
        Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        try {
            instance.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return instance.doFinal(bArr2);
    }

    public static byte[] a(byte[] bArr, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance(x.c("CUlNBL0VDQi9QS0NTMVBhZGRpbmc"));
        instance.init(1, key);
        return instance.doFinal(bArr);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        return c(bArr, bArr2, bArr3);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return c(bArr, bArr2, x.c());
        } catch (Throwable th) {
            as.a(th, "er", "asEn");
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, x.c("EQUVT"));
        Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        instance.init(2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr2);
    }
}
