package tb;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.ali.user.mobile.rpc.safe.AES;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mg0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, SecretKey> f24023a = new HashMap();

    public static SecretKey a(String str) {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec build;
        vwx.c("GCMKS", "load key");
        SecretKey secretKey = null;
        try {
            KeyStore instance = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance.load(null);
            Key key = instance.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKey = (SecretKey) key;
            } else {
                vwx.c("GCMKS", "generate key");
                KeyGenerator instance2 = KeyGenerator.getInstance("AES", AES.ANDROID_KEYSTORE);
                c4g.a();
                blockModes = j2.a(str, 3).setBlockModes("GCM");
                encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                keySize = encryptionPaddings.setKeySize(256);
                build = keySize.build();
                instance2.init(build);
                secretKey = instance2.generateKey();
            }
        } catch (IOException e) {
            vwx.b("GCMKS", "IOException : " + e.getMessage());
        } catch (InvalidAlgorithmParameterException e2) {
            vwx.b("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
        } catch (KeyStoreException e3) {
            vwx.b("GCMKS", "KeyStoreException : " + e3.getMessage());
        } catch (NoSuchAlgorithmException e4) {
            vwx.b("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
        } catch (NoSuchProviderException e5) {
            vwx.b("GCMKS", "NoSuchProviderException : " + e5.getMessage());
        } catch (UnrecoverableKeyException e6) {
            vwx.b("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
        } catch (CertificateException e7) {
            vwx.b("GCMKS", "CertificateException : " + e7.getMessage());
        } catch (Exception e8) {
            vwx.b("GCMKS", "Exception: " + e8.getMessage());
        }
        ((HashMap) f24023a).put(str, secretKey);
        return secretKey;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = (HashMap) f24023a;
        if (hashMap.get(str) == null) {
            a(str);
        }
        return (SecretKey) hashMap.get(str);
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            vwx.b("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(e(str, sva.b(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            vwx.b("GCMKS", "decrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            vwx.b("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return sva.a(h(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            vwx.b("GCMKS", "encrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            vwx.b("GCMKS", "alias or encrypt content is null");
            return bArr2;
        } else if (!b()) {
            vwx.b("GCMKS", "sdk version is too low");
            return bArr2;
        } else if (bArr.length > 12) {
            return f(c(str), bArr);
        } else {
            vwx.b("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
    }

    public static byte[] f(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            vwx.b("GCMKS", "Decrypt secret key is null");
            return bArr2;
        } else if (bArr == null) {
            vwx.b("GCMKS", "content is null");
            return bArr2;
        } else if (!b()) {
            vwx.b("GCMKS", "sdk version is too low");
            return bArr2;
        } else if (bArr.length <= 12) {
            vwx.b("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, secretKey, new GCMParameterSpec(128, copyOf));
                return instance.doFinal(bArr, 12, bArr.length - 12);
            } catch (InvalidAlgorithmParameterException e) {
                vwx.b("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
                return bArr2;
            } catch (InvalidKeyException e2) {
                vwx.b("GCMKS", "InvalidKeyException : " + e2.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e3) {
                vwx.b("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
                return bArr2;
            } catch (BadPaddingException e4) {
                vwx.b("GCMKS", "BadPaddingException : " + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                vwx.b("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e6) {
                vwx.b("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                vwx.b("GCMKS", "Exception: " + e7.getMessage());
                return bArr2;
            }
        }
    }

    public static byte[] h(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            vwx.b("GCMKS", "alias or encrypt content is null");
            return bArr2;
        } else if (b()) {
            return i(c(str), bArr);
        } else {
            vwx.b("GCMKS", "sdk version is too low");
            return bArr2;
        }
    }

    public static byte[] i(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            vwx.b("GCMKS", "content is null");
            return bArr2;
        } else if (secretKey == null) {
            vwx.b("GCMKS", "secret key is null");
            return bArr2;
        } else if (!b()) {
            vwx.b("GCMKS", "sdk version is too low");
            return bArr2;
        } else {
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(1, secretKey);
                byte[] doFinal = instance.doFinal(bArr);
                byte[] iv = instance.getIV();
                if (iv != null && iv.length == 12) {
                    byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                    System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                    return copyOf;
                }
                vwx.b("GCMKS", "IV is invalid.");
                return bArr2;
            } catch (InvalidKeyException e) {
                vwx.b("GCMKS", "InvalidKeyException : " + e.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e2) {
                vwx.b("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
                return bArr2;
            } catch (BadPaddingException e3) {
                vwx.b("GCMKS", "BadPaddingException : " + e3.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e4) {
                vwx.b("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e5) {
                vwx.b("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
                return bArr2;
            } catch (Exception e6) {
                vwx.b("GCMKS", "Exception: " + e6.getMessage());
                return bArr2;
            }
        }
    }
}
