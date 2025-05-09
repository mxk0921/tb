package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.safe.AES;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ig0 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e) {
            vwx.b(AES.BLOCK_MODE, "get encryptword exception : " + e.getMessage());
            return "";
        }
    }

    public static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e) {
                vwx.b(AES.BLOCK_MODE, "mix exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "encrypt 5 content is null");
            return new byte[0];
        } else if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 5 key is null");
            return new byte[0];
        } else if (bArr.length < 16) {
            vwx.b(AES.BLOCK_MODE, "encrypt 5 key error: 5 key length less than 16 bytes.");
            return new byte[0];
        } else if (bArr2 == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 5 iv is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            vwx.b(AES.BLOCK_MODE, "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            return new byte[0];
        } else {
            try {
                return m(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e) {
                vwx.b(AES.BLOCK_MODE, " cbc encrypt data error" + e.getMessage());
                return new byte[0];
            }
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e) {
            vwx.b(AES.BLOCK_MODE, "getIv exception : " + e.getMessage());
            return "";
        }
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "decrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            vwx.b(AES.BLOCK_MODE, "decrypt 1 key is null");
            return "";
        } else {
            byte[] b = sva.b(str2);
            if (b.length >= 16) {
                return g(str, b);
            }
            vwx.b(AES.BLOCK_MODE, "decrypt 1 key error: 1 key length less than 16 bytes.");
            return "";
        }
    }

    public static String g(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "decrypt 2 content is null");
            return "";
        } else if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 2 key is null");
            return "";
        } else if (bArr.length < 16) {
            vwx.b(AES.BLOCK_MODE, "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        } else {
            String e = e(str);
            String a2 = a(str);
            if (TextUtils.isEmpty(e)) {
                vwx.b(AES.BLOCK_MODE, "decrypt 2 iv is null");
                return "";
            } else if (!TextUtils.isEmpty(a2)) {
                return h(a2, bArr, sva.b(e));
            } else {
                vwx.b(AES.BLOCK_MODE, "decrypt 2 encrypt content is null");
                return "";
            }
        }
    }

    public static String h(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "decrypt 4 content is null");
            return "";
        } else if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 4 key is null");
            return "";
        } else if (bArr.length < 16) {
            vwx.b(AES.BLOCK_MODE, "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        } else if (bArr2 == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 4 iv is null");
            return "";
        } else if (bArr2.length < 16) {
            vwx.b(AES.BLOCK_MODE, "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        } else {
            try {
                return new String(i(sva.b(str), bArr, bArr2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                vwx.b(AES.BLOCK_MODE, " cbc decrypt data error" + e.getMessage());
                return "";
            }
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        } else if (bArr3 == null) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 16) {
            vwx.b(AES.BLOCK_MODE, "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return instance.doFinal(bArr);
            } catch (NullPointerException e) {
                vwx.b(AES.BLOCK_MODE, "NullPointerException: " + e.getMessage());
                return new byte[0];
            } catch (InvalidAlgorithmParameterException e2) {
                vwx.b(AES.BLOCK_MODE, "InvalidAlgorithmParameterException: " + e2.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e3) {
                vwx.b(AES.BLOCK_MODE, "InvalidKeyException: " + e3.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e4) {
                vwx.b(AES.BLOCK_MODE, "NoSuchAlgorithmException: " + e4.getMessage());
                return new byte[0];
            } catch (BadPaddingException e5) {
                vwx.b(AES.BLOCK_MODE, "BadPaddingException: " + e5.getMessage());
                vwx.b(AES.BLOCK_MODE, "key is not right");
                return new byte[0];
            } catch (IllegalBlockSizeException e6) {
                vwx.b(AES.BLOCK_MODE, "IllegalBlockSizeException: " + e6.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e7) {
                vwx.b(AES.BLOCK_MODE, "NoSuchPaddingException: " + e7.getMessage());
                return new byte[0];
            }
        }
    }

    public static String j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "encrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            vwx.b(AES.BLOCK_MODE, "encrypt 1 key is null");
            return "";
        } else {
            byte[] b = sva.b(str2);
            if (b.length >= 16) {
                return k(str, b);
            }
            vwx.b(AES.BLOCK_MODE, "encrypt 1 key error: 1 key length less than 16 bytes.");
            return "";
        }
    }

    public static String k(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            vwx.b(AES.BLOCK_MODE, "encrypt 2 content is null");
            return "";
        } else if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 2 key is null");
            return "";
        } else if (bArr.length < 16) {
            vwx.b(AES.BLOCK_MODE, "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        } else {
            byte[] c = ce8.c(16);
            byte[] c2 = c(str, bArr, c);
            if (c2 == null || c2.length == 0) {
                return "";
            }
            return b(sva.a(c), sva.a(c2));
        }
    }

    public static byte[] l(byte[] bArr, byte[] bArr2) {
        byte[] c = ce8.c(16);
        return d(c, m(bArr, bArr2, c));
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        } else if (bArr3 == null) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 16) {
            vwx.b(AES.BLOCK_MODE, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return instance.doFinal(bArr);
            } catch (NullPointerException e) {
                vwx.b(AES.BLOCK_MODE, "NullPointerException: " + e.getMessage());
                return new byte[0];
            } catch (InvalidAlgorithmParameterException e2) {
                vwx.b(AES.BLOCK_MODE, "InvalidAlgorithmParameterException: " + e2.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e3) {
                vwx.b(AES.BLOCK_MODE, "InvalidKeyException: " + e3.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e4) {
                vwx.b(AES.BLOCK_MODE, "NoSuchAlgorithmException: " + e4.getMessage());
                return new byte[0];
            } catch (BadPaddingException e5) {
                vwx.b(AES.BLOCK_MODE, "BadPaddingException: " + e5.getMessage());
                return new byte[0];
            } catch (IllegalBlockSizeException e6) {
                vwx.b(AES.BLOCK_MODE, "IllegalBlockSizeException: " + e6.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e7) {
                vwx.b(AES.BLOCK_MODE, "NoSuchPaddingException: " + e7.getMessage());
                return new byte[0];
            }
        }
    }
}
