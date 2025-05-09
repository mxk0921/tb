package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000OOo0 {
    private static final String O000000o = "O000OOo0";
    private static String O00000Oo = "RSA/ECB/PKCS1Padding";

    public static String O000000o(String str, RSAPublicKey rSAPublicKey) {
        try {
            byte[] O000000o2 = O000000o(rSAPublicKey, str.getBytes());
            return O000000o2 != null ? O000o000.O000000o(O000000o2) : "";
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

    public static PublicKey O000000o(String str) throws Throwable {
        try {
            return KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(O0000o.O000000o(str)));
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

    public static RSAPublicKey O000000o() {
        try {
            return (RSAPublicKey) O000000o("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5se07mkN71qsSJHjZ2Z0+Z+4LlLvf2sz7Md38VAa3EmAOvI7vZp3hbAxicL724ylcmisTPtZQhT/9C+25AELqy9PN9JmzKpwoVTUoJvxG4BoyT49+gGVl6s6zo1byNoHUzTfkmRfmC9MC53HvG8GwKP5xtcdptFjAIcgIR7oAWQIDAQAB");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] O000000o(RSAPublicKey rSAPublicKey, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(O00000Oo);
            instance.init(1, rSAPublicKey);
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
