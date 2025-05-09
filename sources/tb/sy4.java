package tb;

import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sy4 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f28352a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] b = {48, 48, 48, 48, 48, 48, 48, 48};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final char[] f28353a = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
        public static final byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
            if (r6 == (-1)) goto L_0x007c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
            r1.write(((r4 & 15) << 4) | ((r6 & 60) >>> 2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
            r4 = r2 + 1;
            r2 = r9[r2];
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            if (r2 != 61) goto L_0x0067;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
            return r1.toByteArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
            r2 = r3[r2];
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
            if (r4 >= r0) goto L_0x0070;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
            if (r2 == (-1)) goto L_0x006e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
            r2 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
            if (r2 == (-1)) goto L_0x007c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
            r1.write(r2 | ((r6 & 3) << 6));
            r2 = r4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static byte[] a(java.lang.String r9) {
            /*
                byte[] r9 = r9.getBytes()
                int r0 = r9.length
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r1.<init>(r0)
                r2 = 0
            L_0x000b:
                if (r2 >= r0) goto L_0x007c
            L_0x000d:
                byte[] r3 = tb.sy4.a.b
                int r4 = r2 + 1
                r2 = r9[r2]
                r2 = r3[r2]
                r5 = -1
                if (r4 >= r0) goto L_0x001d
                if (r2 == r5) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r2 = r4
                goto L_0x000d
            L_0x001d:
                if (r2 == r5) goto L_0x007c
            L_0x001f:
                int r6 = r4 + 1
                r4 = r9[r4]
                r4 = r3[r4]
                if (r6 >= r0) goto L_0x002c
                if (r4 == r5) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r4 = r6
                goto L_0x001f
            L_0x002c:
                if (r4 == r5) goto L_0x007c
                int r2 = r2 << 2
                r7 = r4 & 48
                int r7 = r7 >>> 4
                r2 = r2 | r7
                r1.write(r2)
            L_0x0038:
                int r2 = r6 + 1
                r6 = r9[r6]
                r7 = 61
                if (r6 != r7) goto L_0x0045
                byte[] r9 = r1.toByteArray()
                return r9
            L_0x0045:
                r6 = r3[r6]
                if (r2 >= r0) goto L_0x004e
                if (r6 == r5) goto L_0x004c
                goto L_0x004e
            L_0x004c:
                r6 = r2
                goto L_0x0038
            L_0x004e:
                if (r6 == r5) goto L_0x007c
                r4 = r4 & 15
                int r4 = r4 << 4
                r8 = r6 & 60
                int r8 = r8 >>> 2
                r4 = r4 | r8
                r1.write(r4)
            L_0x005c:
                int r4 = r2 + 1
                r2 = r9[r2]
                if (r2 != r7) goto L_0x0067
                byte[] r9 = r1.toByteArray()
                return r9
            L_0x0067:
                r2 = r3[r2]
                if (r4 >= r0) goto L_0x0070
                if (r2 == r5) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r2 = r4
                goto L_0x005c
            L_0x0070:
                if (r2 == r5) goto L_0x007c
                r3 = r6 & 3
                int r3 = r3 << 6
                r2 = r2 | r3
                r1.write(r2)
                r2 = r4
                goto L_0x000b
            L_0x007c:
                byte[] r9 = r1.toByteArray()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.sy4.a.a(java.lang.String):byte[]");
        }

        public static String b(byte[] bArr) {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                byte b2 = bArr[i];
                int i3 = b2 & 255;
                char[] cArr = f28353a;
                if (i2 == length) {
                    stringBuffer.append(cArr[i3 >>> 2]);
                    stringBuffer.append(cArr[(b2 & 3) << 4]);
                    str = "==";
                } else {
                    int i4 = i + 2;
                    byte b3 = bArr[i2];
                    if (i4 == length) {
                        stringBuffer.append(cArr[i3 >>> 2]);
                        stringBuffer.append(cArr[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                        stringBuffer.append(cArr[(b3 & 15) << 2]);
                        str = "=";
                    } else {
                        i += 3;
                        byte b4 = bArr[i4];
                        stringBuffer.append(cArr[i3 >>> 2]);
                        stringBuffer.append(cArr[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                        stringBuffer.append(cArr[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
                        stringBuffer.append(cArr[b4 & 63]);
                    }
                }
                stringBuffer.append(str);
                break;
            }
            return stringBuffer.toString();
        }
    }

    public static IvParameterSpec a(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    public static SecretKey b(String str) throws Exception {
        return new SecretKeySpec(k(str).substring(0, 24).getBytes("UTF-8"), "DESede");
    }

    public static byte[] c(String str, int i, byte[] bArr, byte[] bArr2) throws Exception {
        IvParameterSpec ivParameterSpec;
        SecretKey b2 = b(str);
        if (bArr == null) {
            ivParameterSpec = a(b);
        } else {
            ivParameterSpec = a(bArr);
        }
        Cipher instance = Cipher.getInstance("DESede/CBC/NoPadding");
        instance.init(i, b2, ivParameterSpec);
        return instance.doFinal(bArr2);
    }

    public static byte[] d(byte[] bArr, String str) throws Exception {
        return c(str, 2, null, bArr);
    }

    public static String e(String str, String str2) throws Exception {
        return f(str, str2, "UTF-8");
    }

    public static String f(String str, String str2, String str3) throws Exception {
        return new String(d(a.a(str), str2), str3).trim();
    }

    public static char[] g(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f28352a;
            cArr[i] = cArr2[(b2 & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return cArr;
    }

    public static byte[] h(byte[] bArr, String str) throws Exception {
        return c(str, 1, null, bArr);
    }

    public static String i(String str, String str2) throws Exception {
        return j(str, str2, "UTF-8");
    }

    public static String j(String str, String str2, String str3) throws Exception {
        int length = str.getBytes(str3).length % 8;
        if (length != 0) {
            int i = 8 - length;
            StringBuffer stringBuffer = new StringBuffer(str);
            for (int i2 = 0; i2 < i; i2++) {
                stringBuffer.append(' ');
            }
            str = new String(stringBuffer);
        }
        return a.b(h(str.getBytes(str3), str2)).replaceAll("[\\n\\r]", "");
    }

    public static String k(String str) throws Exception {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("UTF-8"));
        return new String(g(instance.digest()));
    }
}
