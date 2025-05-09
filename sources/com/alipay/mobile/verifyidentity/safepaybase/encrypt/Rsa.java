package com.alipay.mobile.verifyidentity.safepaybase.encrypt;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Rsa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    public static PublicKey a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("50a9eaa8", new Object[]{str, str2});
        }
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
    }

    public static String decrypt(String str, String str2) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, generatePrivate);
            byte[] decode = Base64.decode(str, 2);
            int blockSize = instance.getBlockSize();
            byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < decode.length; i2 += blockSize) {
                try {
                    if (decode.length - i2 < blockSize) {
                        i = decode.length - i2;
                    } else {
                        i = blockSize;
                    }
                    byteArrayOutputStream.write(instance.doFinal(decode, i2, i));
                } catch (Exception unused) {
                    if (byteArrayOutputStream == null) {
                        return null;
                    }
                    try {
                        byteArrayOutputStream.close();
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            String str3 = new String(byteArrayOutputStream.toByteArray());
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused4) {
            }
            return str3;
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "327cf920"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0018:
            r3 = 0
            java.lang.String r4 = "RSA"
            java.security.PublicKey r7 = a(r4, r7)     // Catch: all -> 0x005c, Exception -> 0x005e
            java.lang.String r4 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: all -> 0x005c, Exception -> 0x005e
            r4.init(r0, r7)     // Catch: all -> 0x005c, Exception -> 0x005e
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: all -> 0x005c, Exception -> 0x005e
            int r7 = r4.getBlockSize()     // Catch: all -> 0x005c, Exception -> 0x005e
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x005c, Exception -> 0x005e
            r0.<init>()     // Catch: all -> 0x005c, Exception -> 0x005e
        L_0x0037:
            int r5 = r6.length     // Catch: all -> 0x0041, Exception -> 0x0044
            if (r1 >= r5) goto L_0x0050
            int r5 = r6.length     // Catch: all -> 0x0041, Exception -> 0x0044
            int r5 = r5 - r1
            if (r5 >= r7) goto L_0x0046
            int r5 = r6.length     // Catch: all -> 0x0041, Exception -> 0x0044
            int r5 = r5 - r1
            goto L_0x0047
        L_0x0041:
            r6 = move-exception
            r3 = r0
            goto L_0x0060
        L_0x0044:
            goto L_0x0067
        L_0x0046:
            r5 = r7
        L_0x0047:
            byte[] r5 = r4.doFinal(r6, r1, r5)     // Catch: all -> 0x0041, Exception -> 0x0044
            r0.write(r5)     // Catch: all -> 0x0041, Exception -> 0x0044
            int r1 = r1 + r7
            goto L_0x0037
        L_0x0050:
            byte[] r6 = r0.toByteArray()     // Catch: all -> 0x0041, Exception -> 0x0044
            java.lang.String r3 = android.util.Base64.encodeToString(r6, r2)     // Catch: all -> 0x0041, Exception -> 0x0044
        L_0x0058:
            r0.close()     // Catch: IOException -> 0x006a
            goto L_0x006a
        L_0x005c:
            r6 = move-exception
            goto L_0x0060
        L_0x005e:
            goto L_0x0066
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch: IOException -> 0x0065
        L_0x0065:
            throw r6
        L_0x0066:
            r0 = r3
        L_0x0067:
            if (r0 == 0) goto L_0x006a
            goto L_0x0058
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r0 == null) goto L_0x0066;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encryptToByteArray(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "bbee6af1"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            byte[] r5 = (byte[]) r5
            return r5
        L_0x0018:
            r2 = 0
            java.lang.String r3 = "RSA"
            java.security.PublicKey r6 = a(r3, r6)     // Catch: all -> 0x0058, Exception -> 0x005a
            java.lang.String r3 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: all -> 0x0058, Exception -> 0x005a
            r3.init(r0, r6)     // Catch: all -> 0x0058, Exception -> 0x005a
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: all -> 0x0058, Exception -> 0x005a
            int r6 = r3.getBlockSize()     // Catch: all -> 0x0058, Exception -> 0x005a
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0058, Exception -> 0x005a
            r0.<init>()     // Catch: all -> 0x0058, Exception -> 0x005a
        L_0x0037:
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0044
            if (r1 >= r4) goto L_0x0050
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0044
            int r4 = r4 - r1
            if (r4 >= r6) goto L_0x0046
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0044
            int r4 = r4 - r1
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            r2 = r0
            goto L_0x005c
        L_0x0044:
            goto L_0x0063
        L_0x0046:
            r4 = r6
        L_0x0047:
            byte[] r4 = r3.doFinal(r5, r1, r4)     // Catch: all -> 0x0041, Exception -> 0x0044
            r0.write(r4)     // Catch: all -> 0x0041, Exception -> 0x0044
            int r1 = r1 + r6
            goto L_0x0037
        L_0x0050:
            byte[] r2 = r0.toByteArray()     // Catch: all -> 0x0041, Exception -> 0x0044
        L_0x0054:
            r0.close()     // Catch: IOException -> 0x0066
            goto L_0x0066
        L_0x0058:
            r5 = move-exception
            goto L_0x005c
        L_0x005a:
            goto L_0x0062
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch: IOException -> 0x0061
        L_0x0061:
            throw r5
        L_0x0062:
            r0 = r2
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            goto L_0x0054
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa.encryptToByteArray(java.lang.String, java.lang.String):byte[]");
    }

    public static String sign(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2});
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initSign(generatePrivate);
            instance.update(str.getBytes("utf-8"));
            return Base64.encodeToString(instance.sign(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean doCheck(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405d4c26", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initVerify(generatePublic);
            instance.update(str.getBytes("utf-8"));
            return instance.verify(Base64.decode(str2, 2));
        } catch (Exception unused) {
            return false;
        }
    }
}
