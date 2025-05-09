package com.uc.crashsdk.a;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.taobao.artc.internal.ArtcParams;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f14229a = {126, 147, 115, 241, 101, 198, 215, 134};
    private static final int[] b = {125, WSContextConstant.HANDSHAKE_RECEIVE_SIZE, 233, 226, 129, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR, 151, ArtcParams.SD180pVideoParams.HEIGHT};
    private static final int[] c = {238, WSContextConstant.HANDSHAKE_RECEIVE_SIZE, 233, 179, 129, SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_MIDDLE_TIER_ERROR, 151, 167};

    public static String a(String str) {
        Exception e;
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream3.read(bArr);
                g.a(fileInputStream3);
                byte[] a2 = a(bArr, f14229a);
                if (a2 == null || a2.length <= 0) {
                    g.a((Closeable) null);
                    return null;
                }
                int length = a2.length - 1;
                String str2 = a2[length] == 10 ? new String(a2, 0, length) : new String(a2);
                g.a((Closeable) null);
                return str2;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream3;
                try {
                    g.a(e);
                    g.a(fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    g.a(fileInputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream3;
                g.a(fileInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static byte[] b(byte[] bArr, int[] iArr) {
        if (!(bArr == null || iArr == null || iArr.length != 8)) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[length + 2];
                byte b2 = 0;
                for (int i = 0; i < length; i++) {
                    byte b3 = bArr[i];
                    bArr2[i] = (byte) (iArr[i % 8] ^ b3);
                    b2 = (byte) (b2 ^ b3);
                }
                bArr2[length] = (byte) (iArr[0] ^ b2);
                bArr2[length + 1] = (byte) (iArr[1] ^ b2);
                return bArr2;
            } catch (Exception e) {
                g.a(e);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = com.uc.crashsdk.a.g.e(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L_0x0003
            return r7
        L_0x0003:
            boolean r0 = com.uc.crashsdk.a.g.a(r7)
            if (r0 == 0) goto L_0x000a
            return r7
        L_0x000a:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00b1
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0022
            goto L_0x00b1
        L_0x0022:
            byte[] r1 = com.uc.crashsdk.a.g.e(r0)
            if (r1 == 0) goto L_0x00b1
            int r2 = r1.length
            if (r2 > 0) goto L_0x002d
            goto L_0x00b1
        L_0x002d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x0085
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0050
            r4.<init>()     // Catch: all -> 0x0050
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: all -> 0x004b
            r5.<init>(r4)     // Catch: all -> 0x004b
            r5.write(r1)     // Catch: all -> 0x0049
            r4.flush()     // Catch: all -> 0x0049
        L_0x0042:
            com.uc.crashsdk.a.g.a(r4)
            com.uc.crashsdk.a.g.a(r5)
            goto L_0x0058
        L_0x0049:
            r9 = move-exception
            goto L_0x0054
        L_0x004b:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L_0x0054
        L_0x0050:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L_0x0054:
            com.uc.crashsdk.a.g.a(r9)     // Catch: all -> 0x007d
            goto L_0x0042
        L_0x0058:
            byte[] r1 = r4.toByteArray()     // Catch: all -> 0x005e
            r9 = 1
            goto L_0x0063
        L_0x005e:
            r9 = move-exception
            com.uc.crashsdk.a.g.a(r9)
            r9 = 0
        L_0x0063:
            if (r9 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            int r9 = r1.length
            if (r9 > 0) goto L_0x006b
            goto L_0x007c
        L_0x006b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 1
            goto L_0x0087
        L_0x007c:
            return r7
        L_0x007d:
            r7 = move-exception
            com.uc.crashsdk.a.g.a(r4)
            com.uc.crashsdk.a.g.a(r5)
            throw r7
        L_0x0085:
            r8 = r7
            r9 = 0
        L_0x0087:
            if (r9 == 0) goto L_0x00b1
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x009a
            java.lang.String r9 = ".tmp"
            java.lang.String r9 = r8.concat(r9)
            goto L_0x009c
        L_0x009a:
            r9 = r8
            r2 = 0
        L_0x009c:
            java.io.File r3 = new java.io.File
            r3.<init>(r9)
            boolean r9 = com.uc.crashsdk.a.g.a(r3, r1)
            if (r9 != 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            if (r2 == 0) goto L_0x00b0
            r0.delete()
            r3.renameTo(r0)
        L_0x00b0:
            return r8
        L_0x00b1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b.a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private static byte[] a(byte[] bArr, int[] iArr) {
        if (bArr.length >= 2 && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            int i = length - 2;
            try {
                byte[] bArr2 = new byte[i];
                byte b2 = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    byte b3 = (byte) (bArr[i2] ^ iArr[i2 % 8]);
                    bArr2[i2] = b3;
                    b2 = (byte) (b2 ^ b3);
                }
                if (bArr[i] == ((byte) ((iArr[0] ^ b2) & 255)) && bArr[length - 1] == ((byte) ((iArr[1] ^ b2) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e) {
                g.a(e);
            }
        }
        return null;
    }

    public static boolean a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            g.a(th);
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return false;
        }
        byte[] b2 = b(str2.getBytes(), f14229a);
        if (b2 == null) {
            return false;
        }
        try {
            fileOutputStream.write(b2);
            g.a(fileOutputStream);
            return true;
        } catch (Throwable th2) {
            try {
                g.a(th2);
                return false;
            } finally {
                g.a(fileOutputStream);
            }
        }
    }
}
