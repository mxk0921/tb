package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O0Oo {
    public static byte[] O000000o(String str) {
        byte[] bArr;
        try {
            byte[] bArr2 = new byte[0];
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(str.getBytes("UTF-8"));
                return instance.digest();
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                e.printStackTrace();
                return bArr;
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
}
