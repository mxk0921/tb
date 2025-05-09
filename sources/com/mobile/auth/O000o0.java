package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000o0 {
    private static final String O000000o = "O000o0";
    private static byte[] O00000Oo = {68, 64, 94, 49, 69, 35, 50, 83};
    private static final Charset O00000o0 = Charset.forName("UTF-8");

    public static String O000000o(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = bArr[i];
                for (byte b : O00000Oo) {
                    bArr2[i] = (byte) (b ^ bArr2[i]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }
}
