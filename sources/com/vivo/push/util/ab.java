package com.vivo.push.util;

import android.util.Base64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ab {

    /* renamed from: a  reason: collision with root package name */
    private static String f14658a = "RSA";

    public static String a(Key key) {
        return Base64.encodeToString(key.getEncoded(), 2);
    }

    public static PublicKey a(String str) throws Exception {
        try {
            return KeyFactory.getInstance(f14658a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("公钥非法");
        }
    }

    public static boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) throws Exception {
        Signature instance = Signature.getInstance("MD5withRSA");
        instance.initVerify(publicKey);
        instance.update(bArr);
        return instance.verify(bArr2);
    }
}
