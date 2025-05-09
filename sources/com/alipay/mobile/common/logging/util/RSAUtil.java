package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RSAUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Cipher f3996a;
    public static Cipher b;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r8 == null) goto L_0x0076;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized byte[] decrypt(byte[] r7, java.lang.String r8) {
        /*
            r0 = 128(0x80, float:1.794E-43)
            r1 = 0
            r2 = 2
            java.lang.Class<com.alipay.mobile.common.logging.util.RSAUtil> r3 = com.alipay.mobile.common.logging.util.RSAUtil.class
            monitor-enter(r3)
            com.android.alibaba.ip.runtime.IpChange r4 = com.alipay.mobile.common.logging.util.RSAUtil.$ipChange     // Catch: all -> 0x001e
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001e
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = "b18cb518"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: all -> 0x001e
            r2[r1] = r7     // Catch: all -> 0x001e
            r7 = 1
            r2[r7] = r8     // Catch: all -> 0x001e
            java.lang.Object r7 = r4.ipc$dispatch(r0, r2)     // Catch: all -> 0x001e
            byte[] r7 = (byte[]) r7     // Catch: all -> 0x001e
            monitor-exit(r3)
            return r7
        L_0x001e:
            r7 = move-exception
            goto L_0x007e
        L_0x0020:
            r4 = 0
            javax.crypto.Cipher r5 = com.alipay.mobile.common.logging.util.RSAUtil.b     // Catch: all -> 0x0044, Exception -> 0x0070
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = "RSA"
            byte[] r8 = com.alipay.mobile.common.logging.util.Base64.decode(r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.spec.PKCS8EncodedKeySpec r6 = new java.security.spec.PKCS8EncodedKeySpec     // Catch: all -> 0x0044, Exception -> 0x0070
            r6.<init>(r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.KeyFactory r8 = java.security.KeyFactory.getInstance(r5)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.PrivateKey r8 = r8.generatePrivate(r6)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.lang.String r5 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: all -> 0x0044, Exception -> 0x0070
            com.alipay.mobile.common.logging.util.RSAUtil.b = r5     // Catch: all -> 0x0044, Exception -> 0x0070
            r5.init(r2, r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            goto L_0x0046
        L_0x0044:
            r7 = move-exception
            goto L_0x0078
        L_0x0046:
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0044, Exception -> 0x0070
            r8.<init>()     // Catch: all -> 0x0044, Exception -> 0x0070
        L_0x004b:
            int r2 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            if (r1 >= r2) goto L_0x0065
            javax.crypto.Cipher r2 = com.alipay.mobile.common.logging.util.RSAUtil.b     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r5 - r1
            if (r5 >= r0) goto L_0x005a
            int r5 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r5 - r1
            goto L_0x005c
        L_0x0057:
            r7 = move-exception
            r4 = r8
            goto L_0x0078
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            byte[] r2 = r2.doFinal(r7, r1, r5)     // Catch: all -> 0x0057, Exception -> 0x0071
            r8.write(r2)     // Catch: all -> 0x0057, Exception -> 0x0071
            int r1 = r1 + r0
            goto L_0x004b
        L_0x0065:
            r8.flush()     // Catch: all -> 0x0057, Exception -> 0x0071
            byte[] r4 = r8.toByteArray()     // Catch: all -> 0x0057, Exception -> 0x0071
        L_0x006c:
            r8.close()     // Catch: all -> 0x001e, IOException -> 0x0076
            goto L_0x0076
        L_0x0070:
            r8 = r4
        L_0x0071:
            com.alipay.mobile.common.logging.util.RSAUtil.b = r4     // Catch: all -> 0x0057
            if (r8 == 0) goto L_0x0076
            goto L_0x006c
        L_0x0076:
            monitor-exit(r3)
            return r4
        L_0x0078:
            if (r4 == 0) goto L_0x007d
            r4.close()     // Catch: all -> 0x001e, IOException -> 0x007d
        L_0x007d:
            throw r7     // Catch: all -> 0x001e
        L_0x007e:
            monitor-exit(r3)     // Catch: all -> 0x001e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.RSAUtil.decrypt(byte[], java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r8 == null) goto L_0x0076;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized byte[] encrypt(byte[] r7, java.lang.String r8) {
        /*
            r0 = 117(0x75, float:1.64E-43)
            r1 = 1
            r2 = 0
            java.lang.Class<com.alipay.mobile.common.logging.util.RSAUtil> r3 = com.alipay.mobile.common.logging.util.RSAUtil.class
            monitor-enter(r3)
            com.android.alibaba.ip.runtime.IpChange r4 = com.alipay.mobile.common.logging.util.RSAUtil.$ipChange     // Catch: all -> 0x001e
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001e
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = "f5ebff40"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: all -> 0x001e
            r5[r2] = r7     // Catch: all -> 0x001e
            r5[r1] = r8     // Catch: all -> 0x001e
            java.lang.Object r7 = r4.ipc$dispatch(r0, r5)     // Catch: all -> 0x001e
            byte[] r7 = (byte[]) r7     // Catch: all -> 0x001e
            monitor-exit(r3)
            return r7
        L_0x001e:
            r7 = move-exception
            goto L_0x007e
        L_0x0020:
            r4 = 0
            javax.crypto.Cipher r5 = com.alipay.mobile.common.logging.util.RSAUtil.f3996a     // Catch: all -> 0x0044, Exception -> 0x0070
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = "RSA"
            byte[] r8 = com.alipay.mobile.common.logging.util.Base64.decode(r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.spec.X509EncodedKeySpec r6 = new java.security.spec.X509EncodedKeySpec     // Catch: all -> 0x0044, Exception -> 0x0070
            r6.<init>(r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.KeyFactory r8 = java.security.KeyFactory.getInstance(r5)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.security.PublicKey r8 = r8.generatePublic(r6)     // Catch: all -> 0x0044, Exception -> 0x0070
            java.lang.String r5 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: all -> 0x0044, Exception -> 0x0070
            com.alipay.mobile.common.logging.util.RSAUtil.f3996a = r5     // Catch: all -> 0x0044, Exception -> 0x0070
            r5.init(r1, r8)     // Catch: all -> 0x0044, Exception -> 0x0070
            goto L_0x0046
        L_0x0044:
            r7 = move-exception
            goto L_0x0078
        L_0x0046:
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0044, Exception -> 0x0070
            r8.<init>()     // Catch: all -> 0x0044, Exception -> 0x0070
        L_0x004b:
            int r1 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            if (r2 >= r1) goto L_0x0065
            javax.crypto.Cipher r1 = com.alipay.mobile.common.logging.util.RSAUtil.f3996a     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r5 - r2
            if (r5 >= r0) goto L_0x005a
            int r5 = r7.length     // Catch: all -> 0x0057, Exception -> 0x0071
            int r5 = r5 - r2
            goto L_0x005c
        L_0x0057:
            r7 = move-exception
            r4 = r8
            goto L_0x0078
        L_0x005a:
            r5 = 117(0x75, float:1.64E-43)
        L_0x005c:
            byte[] r1 = r1.doFinal(r7, r2, r5)     // Catch: all -> 0x0057, Exception -> 0x0071
            r8.write(r1)     // Catch: all -> 0x0057, Exception -> 0x0071
            int r2 = r2 + r0
            goto L_0x004b
        L_0x0065:
            r8.flush()     // Catch: all -> 0x0057, Exception -> 0x0071
            byte[] r4 = r8.toByteArray()     // Catch: all -> 0x0057, Exception -> 0x0071
        L_0x006c:
            r8.close()     // Catch: all -> 0x001e, IOException -> 0x0076
            goto L_0x0076
        L_0x0070:
            r8 = r4
        L_0x0071:
            com.alipay.mobile.common.logging.util.RSAUtil.f3996a = r4     // Catch: all -> 0x0057
            if (r8 == 0) goto L_0x0076
            goto L_0x006c
        L_0x0076:
            monitor-exit(r3)
            return r4
        L_0x0078:
            if (r4 == 0) goto L_0x007d
            r4.close()     // Catch: all -> 0x001e, IOException -> 0x007d
        L_0x007d:
            throw r7     // Catch: all -> 0x001e
        L_0x007e:
            monitor-exit(r3)     // Catch: all -> 0x001e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.RSAUtil.encrypt(byte[], java.lang.String):byte[]");
    }
}
