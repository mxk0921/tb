package com.mobile.auth.gatewayauth.utils.security;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.c0z;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000000o {
    private static char[] O000000o = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    private static byte[] O00000Oo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String O000000o(byte[] bArr) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                byte b = bArr[i];
                int i3 = b & 255;
                if (i2 == length) {
                    stringBuffer.append(O000000o[i3 >>> 2]);
                    stringBuffer.append(O000000o[(b & 3) << 4]);
                    str = "==";
                } else {
                    int i4 = i + 2;
                    byte b2 = bArr[i2];
                    if (i4 == length) {
                        stringBuffer.append(O000000o[i3 >>> 2]);
                        stringBuffer.append(O000000o[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                        stringBuffer.append(O000000o[(b2 & 15) << 2]);
                        str = "=";
                    } else {
                        i += 3;
                        byte b3 = bArr[i4];
                        stringBuffer.append(O000000o[i3 >>> 2]);
                        stringBuffer.append(O000000o[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                        stringBuffer.append(O000000o[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
                        stringBuffer.append(O000000o[b3 & 63]);
                    }
                }
                stringBuffer.append(str);
                break;
            }
            return stringBuffer.toString();
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r5 != (-1)) goto L_0x005a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        r1.write(((r4 & 15) << 4) | ((r5 & 60) >>> 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r4 = r2 + 1;
        r2 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r2 != 61) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        return r1.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        r2 = com.mobile.auth.gatewayauth.utils.security.O000000o.O00000Oo[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        if (r4 >= r0) goto L_0x007c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
        if (r2 == (-1)) goto L_0x007a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
        if (r2 != (-1)) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] O000000o(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()     // Catch: all -> 0x004a
            int r0 = r8.length     // Catch: all -> 0x004a
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x004a
            r1.<init>(r0)     // Catch: all -> 0x004a
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x0089
        L_0x000d:
            byte[] r3 = com.mobile.auth.gatewayauth.utils.security.O000000o.O00000Oo     // Catch: all -> 0x004a
            int r4 = r2 + 1
            r2 = r8[r2]     // Catch: all -> 0x004a
            r2 = r3[r2]     // Catch: all -> 0x004a
            r3 = -1
            if (r4 >= r0) goto L_0x001d
            if (r2 == r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = r4
            goto L_0x000d
        L_0x001d:
            if (r2 != r3) goto L_0x0021
            goto L_0x0089
        L_0x0021:
            byte[] r5 = com.mobile.auth.gatewayauth.utils.security.O000000o.O00000Oo     // Catch: all -> 0x004a
            int r6 = r4 + 1
            r4 = r8[r4]     // Catch: all -> 0x004a
            r4 = r5[r4]     // Catch: all -> 0x004a
            if (r6 >= r0) goto L_0x0030
            if (r4 == r3) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r4 = r6
            goto L_0x0021
        L_0x0030:
            if (r4 != r3) goto L_0x0033
            goto L_0x0089
        L_0x0033:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)     // Catch: all -> 0x004a
        L_0x003d:
            int r2 = r6 + 1
            r5 = r8[r6]     // Catch: all -> 0x004a
            r6 = 61
            if (r5 != r6) goto L_0x004c
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x004a
            return r8
        L_0x004a:
            r8 = move-exception
            goto L_0x008e
        L_0x004c:
            byte[] r7 = com.mobile.auth.gatewayauth.utils.security.O000000o.O00000Oo     // Catch: all -> 0x004a
            r5 = r7[r5]     // Catch: all -> 0x004a
            if (r2 >= r0) goto L_0x0057
            if (r5 == r3) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = r2
            goto L_0x003d
        L_0x0057:
            if (r5 != r3) goto L_0x005a
            goto L_0x0089
        L_0x005a:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)     // Catch: all -> 0x004a
        L_0x0066:
            int r4 = r2 + 1
            r2 = r8[r2]     // Catch: all -> 0x004a
            if (r2 != r6) goto L_0x0071
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x004a
            return r8
        L_0x0071:
            byte[] r7 = com.mobile.auth.gatewayauth.utils.security.O000000o.O00000Oo     // Catch: all -> 0x004a
            r2 = r7[r2]     // Catch: all -> 0x004a
            if (r4 >= r0) goto L_0x007c
            if (r2 == r3) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r2 = r4
            goto L_0x0066
        L_0x007c:
            if (r2 != r3) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)     // Catch: all -> 0x004a
            r2 = r4
            goto L_0x000b
        L_0x0089:
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x004a
            return r8
        L_0x008e:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r8)     // Catch: all -> 0x0093
            return r0
        L_0x0093:
            r8 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(java.lang.String):byte[]");
    }
}
