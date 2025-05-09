package com.meizu.cloud.pushsdk.util;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.e.h.a;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f5923a = Charset.forName("UTF-8");

    public static String a(String str, String str2) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return new String(a(b(str), a(str2)), f5923a);
                }
            } catch (Exception e) {
                DebugLogger.e("RSAUtils", "decrypt " + e.getMessage());
            }
        }
        return null;
    }

    private static RSAPublicKey b(String str) {
        Throwable e;
        StringBuilder sb;
        try {
            return (RSAPublicKey) KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(a(str)));
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            sb = new StringBuilder("loadPublicKey NoSuchAlgorithmException ");
            sb.append(e.getMessage());
            DebugLogger.e("RSAUtils", sb.toString());
            return null;
        } catch (InvalidKeySpecException e3) {
            e = e3;
            sb = new StringBuilder("loadPublicKey InvalidKeySpecException ");
            sb.append(e.getMessage());
            DebugLogger.e("RSAUtils", sb.toString());
            return null;
        }
    }

    private static byte[] a(String str) {
        return a.a(str);
    }

    private static byte[] a(PublicKey publicKey, byte[] bArr) throws Exception {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(2, publicKey);
        return instance.doFinal(bArr);
    }
}
