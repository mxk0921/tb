package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RsaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static PublicKey a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("76a79e19", new Object[]{str, str2});
        }
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
        } catch (Exception unused) {
            return null;
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.RsaUtils.$ipChange
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.RsaUtils.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }
}
