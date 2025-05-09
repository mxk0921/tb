package com.mobile.auth;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.ali.user.mobile.rpc.safe.AES;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.security.auth.x500.X500Principal;
import tb.c4g;
import tb.j2;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O0O0o {
    private static byte[] O000000o;

    public static String O000000o(Context context, String str) {
        O000000o();
        byte[] O00000Oo = O00000Oo(context);
        if (O00000Oo != null) {
            return O0O00o.O000000o(O00000Oo, str, O000000o);
        }
        O000000o();
        return null;
    }

    private static String O00000Oo() {
        return O0OO0O.O00000Oo("AES_KEY", "");
    }

    private static String O00000o0() {
        return O0OO0O.O00000Oo("AES_IV", "");
    }

    public static void O000000o() {
        O0OO0O.O000000o("AES_KEY");
    }

    public static String O00000Oo(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] O00000Oo = O00000Oo(context);
        if (O00000Oo != null) {
            return O0O00o.O00000Oo(O00000Oo, str, O000000o);
        }
        O000000o();
        return null;
    }

    private static boolean O000000o(Context context) {
        KeyGenParameterSpec.Builder digests;
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder randomizedEncryptionRequired;
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec build;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                KeyGenerator instance = KeyGenerator.getInstance("AES", AES.ANDROID_KEYSTORE);
                c4g.a();
                digests = j2.a("CMCC_SDK_V1", 3).setDigests("SHA-256", "SHA-512");
                blockModes = digests.setBlockModes(AES.BLOCK_MODE);
                encryptionPaddings = blockModes.setEncryptionPaddings(AES.PADDING);
                randomizedEncryptionRequired = encryptionPaddings.setRandomizedEncryptionRequired(false);
                keySize = randomizedEncryptionRequired.setKeySize(256);
                build = keySize.build();
                instance.init(build);
                Thread.sleep(1000L);
                instance.generateKey();
                return true;
            }
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            instance3.add(1, 30);
            KeyPairGeneratorSpec build2 = new KeyPairGeneratorSpec.Builder(context).setAlias("CMCC_SDK_V1").setSubject(new X500Principal("CN=CMCC_SDK_V1")).setSerialNumber(BigInteger.TEN).setStartDate(instance2.getTime()).setEndDate(instance3.getTime()).build();
            KeyPairGenerator instance4 = KeyPairGenerator.getInstance(man.KEY_ALGORITHM, AES.ANDROID_KEYSTORE);
            instance4.initialize(build2);
            Thread.sleep(1000L);
            instance4.generateKeyPair();
            return true;
        } catch (Exception e) {
            O0O0O.O000000o("KeystoreUtil", e.getMessage());
            return false;
        }
    }

    private static synchronized byte[] O00000Oo(Context context) {
        byte[] bArr;
        Cipher instance;
        String str;
        String str2;
        Cipher cipher;
        synchronized (O0O0O0o.class) {
            try {
                try {
                    KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
                    instance2.load(null);
                    if (!O000000o(context, false)) {
                        return null;
                    }
                    String O00000Oo = O00000Oo();
                    if (TextUtils.isEmpty(O00000Oo)) {
                        bArr = OO0oO.O000000o();
                        O000000o = OO0oO.O000000o();
                        Key key = instance2.getKey("CMCC_SDK_V1", null);
                        if (key instanceof SecretKey) {
                            O0O0O.O00000Oo("KeystoreUtil", "随机生成aes秘钥");
                            cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                            cipher.init(1, key, new IvParameterSpec(O000000o));
                        } else if (!(key instanceof PrivateKey)) {
                            return null;
                        } else {
                            PublicKey publicKey = instance2.getCertificate("CMCC_SDK_V1").getPublicKey();
                            cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                            O0O0O.O00000Oo("KeystoreUtil", "生成rsa密");
                            cipher.init(1, publicKey);
                        }
                        String encodeToString = Base64.encodeToString(cipher.doFinal(bArr), 0);
                        String encodeToString2 = Base64.encodeToString(O000000o, 0);
                        HashMap hashMap = new HashMap();
                        hashMap.put("AES_IV", encodeToString2);
                        hashMap.put("AES_KEY", encodeToString);
                        O0OO0O.O000000o(hashMap);
                    } else {
                        O000000o = Base64.decode(O00000o0(), 0);
                        byte[] decode = Base64.decode(O00000Oo, 0);
                        Key key2 = instance2.getKey("CMCC_SDK_V1", null);
                        if (key2 == null) {
                            return null;
                        }
                        if (key2 instanceof SecretKey) {
                            instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
                            instance.init(2, key2, new IvParameterSpec(O000000o));
                            str = "KeystoreUtil";
                            str2 = "使用aes";
                        } else if (!(key2 instanceof PrivateKey)) {
                            return null;
                        } else {
                            instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
                            instance.init(2, key2);
                            str = "KeystoreUtil";
                            str2 = "使用rsa";
                        }
                        O0O0O.O00000Oo(str, str2);
                        bArr = instance.doFinal(decode);
                        StringBuilder sb = new StringBuilder("是否解密出秘钥：");
                        sb.append(!TextUtils.isEmpty(Base64.encodeToString(bArr, 0)));
                        O0O0O.O00000Oo("KeystoreUtil", sb.toString());
                    }
                    return bArr;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean O000000o(Context context, boolean z) {
        try {
            KeyStore instance = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance.load(null);
            if (instance.getKey("CMCC_SDK_V1", null) != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            return O000000o(context);
        }
        return false;
    }
}
