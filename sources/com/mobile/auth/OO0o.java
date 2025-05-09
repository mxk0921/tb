package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.c0z;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OO0o {
    private static char[] O000000o = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    private static byte[] O00000Oo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String O000000o(String str) {
        try {
            return str.replaceAll("\\+", "%2B");
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (r2 == (-1)) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] O00000Oo(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()     // Catch: all -> 0x0047
            int r0 = r8.length     // Catch: all -> 0x0047
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0047
            r1.<init>(r0)     // Catch: all -> 0x0047
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x0084
        L_0x000d:
            byte[] r3 = com.mobile.auth.OO0o.O00000Oo     // Catch: all -> 0x0047
            int r4 = r2 + 1
            r2 = r8[r2]     // Catch: all -> 0x0047
            r2 = r3[r2]     // Catch: all -> 0x0047
            r3 = -1
            if (r4 >= r0) goto L_0x001d
            if (r2 == r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = r4
            goto L_0x000d
        L_0x001d:
            if (r2 == r3) goto L_0x0084
        L_0x001f:
            byte[] r5 = com.mobile.auth.OO0o.O00000Oo     // Catch: all -> 0x0047
            int r6 = r4 + 1
            r4 = r8[r4]     // Catch: all -> 0x0047
            r4 = r5[r4]     // Catch: all -> 0x0047
            if (r6 >= r0) goto L_0x002e
            if (r4 == r3) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = r6
            goto L_0x001f
        L_0x002e:
            if (r4 == r3) goto L_0x0084
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)     // Catch: all -> 0x0047
        L_0x003a:
            int r2 = r6 + 1
            r5 = r8[r6]     // Catch: all -> 0x0047
            r6 = 61
            if (r5 != r6) goto L_0x0049
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x0047
            return r8
        L_0x0047:
            r8 = move-exception
            goto L_0x0089
        L_0x0049:
            byte[] r7 = com.mobile.auth.OO0o.O00000Oo     // Catch: all -> 0x0047
            r5 = r7[r5]     // Catch: all -> 0x0047
            if (r2 >= r0) goto L_0x0054
            if (r5 == r3) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r6 = r2
            goto L_0x003a
        L_0x0054:
            if (r5 == r3) goto L_0x0084
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)     // Catch: all -> 0x0047
        L_0x0062:
            int r4 = r2 + 1
            r2 = r8[r2]     // Catch: all -> 0x0047
            if (r2 != r6) goto L_0x006d
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x0047
            return r8
        L_0x006d:
            byte[] r7 = com.mobile.auth.OO0o.O00000Oo     // Catch: all -> 0x0047
            r2 = r7[r2]     // Catch: all -> 0x0047
            if (r4 >= r0) goto L_0x0078
            if (r2 == r3) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r2 = r4
            goto L_0x0062
        L_0x0078:
            if (r2 == r3) goto L_0x0084
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)     // Catch: all -> 0x0047
            r2 = r4
            goto L_0x000b
        L_0x0084:
            byte[] r8 = r1.toByteArray()     // Catch: all -> 0x0047
            return r8
        L_0x0089:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO0o.O00000Oo(java.lang.String):byte[]");
    }

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
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
