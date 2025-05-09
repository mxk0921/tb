package com.mobile.auth;

import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000o00 {
    private static final String O000000o = "O0000o00";
    private static byte[] O00000Oo = EncryptUtils.IV_PARAMETER_SPEC.getBytes();
    private static byte[] O00000o0 = "vrf5g7h0tededwx3".getBytes();

    public static String O000000o(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(O00000Oo);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bytes = str.getBytes("utf-8");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return O000o000.O000000o(instance.doFinal(bytes));
        } catch (Throwable unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:8:0x002f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static java.lang.String O00000Oo(java.lang.String r3, java.lang.String r4) {
        /*
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: all -> 0x002c
            byte[] r1 = com.mobile.auth.O0000o00.O00000Oo     // Catch: all -> 0x002c
            r0.<init>(r1)     // Catch: all -> 0x002c
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: all -> 0x002c
            byte[] r4 = r4.getBytes()     // Catch: all -> 0x002c
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)     // Catch: all -> 0x002c
            java.lang.String r4 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: all -> 0x002c
            r2 = 2
            r4.init(r2, r1, r0)     // Catch: all -> 0x002c
            byte[] r3 = com.mobile.auth.O000o000.O000000o(r3)     // Catch: all -> 0x002c
            byte[] r3 = r4.doFinal(r3)     // Catch: all -> 0x002c
            if (r3 == 0) goto L_0x002c
            java.lang.String r4 = new java.lang.String     // Catch: all -> 0x002c
            r4.<init>(r3)     // Catch: all -> 0x002c
            return r4
        L_0x002c:
            java.lang.String r3 = ""
            return r3
        L_0x002f:
            r3 = move-exception
            r4 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r3)     // Catch: all -> 0x0035
            return r4
        L_0x0035:
            r3 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O0000o00.O00000Oo(java.lang.String, java.lang.String):java.lang.String");
    }
}
