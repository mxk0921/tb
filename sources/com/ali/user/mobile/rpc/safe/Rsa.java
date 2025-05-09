package com.ali.user.mobile.rpc.safe;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Rsa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALGORITHM = "RSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    static {
        t2o.a(68157596);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.rpc.safe.Rsa.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "327cf920"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0018:
            r2 = 0
            java.lang.String r3 = "RSA"
            java.security.PublicKey r6 = getPublicKeyFromX509(r3, r6)     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r3 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: all -> 0x0066, Exception -> 0x0069
            r3.init(r0, r6)     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: all -> 0x0066, Exception -> 0x0069
            int r6 = r3.getBlockSize()     // Catch: all -> 0x0066, Exception -> 0x0069
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0066, Exception -> 0x0069
            r0.<init>()     // Catch: all -> 0x0066, Exception -> 0x0069
        L_0x0037:
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0043
            if (r1 >= r4) goto L_0x004f
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0043
            int r4 = r4 - r1
            if (r4 >= r6) goto L_0x0045
            int r4 = r5.length     // Catch: all -> 0x0041, Exception -> 0x0043
            int r4 = r4 - r1
            goto L_0x0046
        L_0x0041:
            r5 = move-exception
            goto L_0x006c
        L_0x0043:
            r5 = move-exception
            goto L_0x007c
        L_0x0045:
            r4 = r6
        L_0x0046:
            byte[] r4 = r3.doFinal(r5, r1, r4)     // Catch: all -> 0x0041, Exception -> 0x0043
            r0.write(r4)     // Catch: all -> 0x0041, Exception -> 0x0043
            int r1 = r1 + r6
            goto L_0x0037
        L_0x004f:
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x0041, Exception -> 0x0043
            byte[] r6 = r0.toByteArray()     // Catch: all -> 0x0041, Exception -> 0x0043
            java.lang.String r6 = com.ali.user.mobile.rpc.safe.Base64.encode(r6)     // Catch: all -> 0x0041, Exception -> 0x0043
            r5.<init>(r6)     // Catch: all -> 0x0041, Exception -> 0x0043
            r0.close()     // Catch: IOException -> 0x0060
            goto L_0x0064
        L_0x0060:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0064:
            r2 = r5
            goto L_0x0084
        L_0x0066:
            r5 = move-exception
            r0 = r2
            goto L_0x006c
        L_0x0069:
            r5 = move-exception
            r0 = r2
            goto L_0x007c
        L_0x006c:
            r5.printStackTrace()     // Catch: all -> 0x007a
            if (r0 == 0) goto L_0x0084
            r0.close()     // Catch: IOException -> 0x0075
            goto L_0x0084
        L_0x0075:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0084
        L_0x007a:
            r5 = move-exception
            goto L_0x0085
        L_0x007c:
            r5.printStackTrace()     // Catch: all -> 0x007a
            if (r0 == 0) goto L_0x0084
            r0.close()     // Catch: IOException -> 0x0075
        L_0x0084:
            return r2
        L_0x0085:
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch: IOException -> 0x008b
            goto L_0x008f
        L_0x008b:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.rpc.safe.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws NoSuchAlgorithmException, Exception {
        KeyFactory keyFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("50a9eaa8", new Object[]{str, str2});
        }
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(str2));
        try {
            try {
                keyFactory = KeyFactory.getInstance(str);
            } catch (Throwable unused) {
                keyFactory = KeyFactory.getInstance(str, p1.h);
            }
        } catch (Throwable unused2) {
            keyFactory = KeyFactory.getInstance(str);
        }
        if (keyFactory == null) {
            keyFactory = KeyFactory.getInstance(str);
        }
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }

    public static String sign(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2});
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initSign(generatePrivate);
            instance.update(str.getBytes("utf-8"));
            return Base64.encode(instance.sign());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
