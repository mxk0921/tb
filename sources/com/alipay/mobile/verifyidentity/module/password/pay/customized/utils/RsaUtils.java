package com.alipay.mobile.verifyidentity.module.password.pay.customized.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.man;

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
    public static java.lang.String encryptAlpay(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "47be35ad"
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.encryptAlpay(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String encryptCardNoText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a137e342", new Object[]{str, str2});
        }
        try {
            byte[] bytes = str.getBytes();
            PublicKey a2 = a(man.KEY_ALGORITHM, str2);
            if (a2 == null) {
                return null;
            }
            Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
            instance.init(1, a2);
            return new String(Base64.encode(instance.doFinal(bytes), 2));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String encryptPassword(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77cc8e0f", new Object[]{str});
        }
        return encrypt_Hard_RSA_Base64(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[Catch: Exception -> 0x00ba, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ba, blocks: (B:6:0x0017, B:8:0x0028, B:9:0x003b, B:11:0x0043, B:12:0x004c, B:13:0x004f, B:15:0x0081, B:18:0x008a, B:19:0x0093, B:20:0x009b, B:23:0x00a3), top: B:26:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String encrypt_Hard_RSA_Base64(java.lang.String r10) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "RsaUtils"
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "e709aee7"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            java.lang.Object r10 = r3.ipc$dispatch(r2, r1)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x0017:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: Exception -> 0x00ba
            r3.<init>()     // Catch: Exception -> 0x00ba
            r4 = 256(0x100, float:3.59E-43)
            byte[] r5 = new byte[r4]     // Catch: Exception -> 0x00ba
            java.util.Random r6 = new java.util.Random     // Catch: Exception -> 0x00ba
            r6.<init>()     // Catch: Exception -> 0x00ba
            r7 = 0
        L_0x0026:
            if (r7 >= r4) goto L_0x003b
            r8 = 128(0x80, float:1.794E-43)
            int r9 = r6.nextInt(r8)     // Catch: Exception -> 0x00ba
            int r9 = r9 - r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: Exception -> 0x00ba
            byte r8 = r8.byteValue()     // Catch: Exception -> 0x00ba
            r5[r7] = r8     // Catch: Exception -> 0x00ba
            int r7 = r7 + r1
            goto L_0x0026
        L_0x003b:
            int r4 = r10.length()     // Catch: Exception -> 0x00ba
            r6 = 10
            if (r4 >= r6) goto L_0x004c
            java.lang.String r6 = "0"
            r3.append(r6)     // Catch: Exception -> 0x00ba
            r3.append(r4)     // Catch: Exception -> 0x00ba
            goto L_0x004f
        L_0x004c:
            r3.append(r4)     // Catch: Exception -> 0x00ba
        L_0x004f:
            r3.append(r10)     // Catch: Exception -> 0x00ba
            java.lang.String r10 = r3.toString()     // Catch: Exception -> 0x00ba
            byte[] r10 = r10.getBytes()     // Catch: Exception -> 0x00ba
            r3 = 2
            int r4 = r4 + r3
            java.lang.System.arraycopy(r10, r0, r5, r0, r4)     // Catch: Exception -> 0x00ba
            java.lang.String r10 = "RSA"
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()     // Catch: Exception -> 0x00ba
            java.lang.String r0 = r0.getEnvType()     // Catch: Exception -> 0x00ba
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: Exception -> 0x00ba
            java.lang.String r6 = "pub_key_env："
            r4.<init>(r6)     // Catch: Exception -> 0x00ba
            r4.append(r0)     // Catch: Exception -> 0x00ba
            java.lang.String r4 = r4.toString()     // Catch: Exception -> 0x00ba
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r4)     // Catch: Exception -> 0x00ba
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: Exception -> 0x00ba
            if (r4 != 0) goto L_0x0093
            java.lang.String r4 = "ONLINE"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch: Exception -> 0x00ba
            if (r0 == 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            java.lang.String r0 = "用内置线下公钥"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r0)     // Catch: Exception -> 0x00ba
            java.lang.String r0 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA+u3dJpvadxMqVJH4uEfhmY9+yjJJaplnd9iL9aX4nKty1yuRTSSDUWCaSXMF+RR/LWc1Wkt5lLWbXTZ2Bcv3vUTORrOyfRd5b3IGTJVERrcEDEJVbKN+CdX53CS18hAV3ugCUOHzI53VT4TLWh0P9OtqBXpOkBzsRvCl36Yc+L5whiBy64cTfcp+GAcRBLaUl2ZvVojg6WKwcTBinkEsGIcUdv/whftnXIWAK4jeOX7NddKcaZO7aehEq2XO1IryzgAUnRr9Og515VpRBvBYMxKBvHcXFpCGWfg8xWIalU4BiwY6etKsYyAOz9JOnt8kLMR0POyVVwRWGn20xUOuKwIDAQAB"
            goto L_0x009b
        L_0x0093:
            java.lang.String r0 = "用内置线上公钥"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r0)     // Catch: Exception -> 0x00ba
            java.lang.String r0 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv+8ILqsASxulyk44beo/JJeMs4l1JcrkQI6LAfxBsSVFFm0/RkRGjd9pLT0Y4VcPU/CfKvXesp2PcYOkdj+E74gZ49ePRtohCfvJmeIvNFcwT5etvDLcqxX04+MbwtrQt7gvluQaPmCoRIXXTTAZf9cSvDYoRKQZ9A64Rqrse/YpImurI1yuT8vGw5vf22/7P87C5qTT/lpqsPx9kVdDZ/pY1O72SON25VDrjEK7R5rwRxMQOY9TxCmgPJzj3uUXtYf1ZObZVlbIjpZ20rtPTmh48lyjYSToIWwJa6UzvF0NcwXWMI3DrgKLUVCUpktWqWeYgV7JGc9E8LZmMNLmYwIDAQAB"
        L_0x009b:
            java.security.PublicKey r10 = a(r10, r0)     // Catch: Exception -> 0x00ba
            if (r10 != 0) goto L_0x00a3
            r10 = 0
            return r10
        L_0x00a3:
            java.lang.String r0 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: Exception -> 0x00ba
            r0.init(r1, r10)     // Catch: Exception -> 0x00ba
            byte[] r10 = r0.doFinal(r5)     // Catch: Exception -> 0x00ba
            java.lang.String r0 = new java.lang.String     // Catch: Exception -> 0x00ba
            byte[] r10 = android.util.Base64.encode(r10, r3)     // Catch: Exception -> 0x00ba
            r0.<init>(r10)     // Catch: Exception -> 0x00ba
            return r0
        L_0x00ba:
            java.lang.String r10 = ""
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.RsaUtils.encrypt_Hard_RSA_Base64(java.lang.String):java.lang.String");
    }
}
