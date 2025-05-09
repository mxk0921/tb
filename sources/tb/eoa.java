package tb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eoa {
    static {
        t2o.a(813695041);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:43:0x0050). Please submit an issue!!! */
    public static byte[] a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = null;
        bArr2 = null;
        bArr2 = null;
        r0 = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.finish();
                            bArr2 = byteArrayOutputStream.toByteArray();
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            byteArrayOutputStream.close();
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            return bArr2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        gZIPOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (gZIPOutputStream2 != null) {
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (Exception e9) {
                e = e9;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
            return bArr2;
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0041 -> B:78:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(byte[] r8) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: all -> 0x0055, Exception -> 0x0059
            r1.<init>(r8)     // Catch: all -> 0x0055, Exception -> 0x0059
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: all -> 0x004c, Exception -> 0x0051
            r8.<init>(r1)     // Catch: all -> 0x004c, Exception -> 0x0051
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch: all -> 0x0045, Exception -> 0x0049
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0045, Exception -> 0x0049
            r4.<init>()     // Catch: all -> 0x0045, Exception -> 0x0049
        L_0x0014:
            r5 = 0
            int r6 = r8.read(r3, r5, r2)     // Catch: all -> 0x0020, Exception -> 0x0023
            r7 = -1
            if (r6 == r7) goto L_0x0025
            r4.write(r3, r5, r6)     // Catch: all -> 0x0020, Exception -> 0x0023
            goto L_0x0014
        L_0x0020:
            r0 = move-exception
            goto L_0x007a
        L_0x0023:
            r2 = move-exception
            goto L_0x005d
        L_0x0025:
            r4.flush()     // Catch: all -> 0x0020, Exception -> 0x0023
            byte[] r0 = r4.toByteArray()     // Catch: all -> 0x0020, Exception -> 0x0023
            r4.close()     // Catch: Exception -> 0x0030
            goto L_0x0034
        L_0x0030:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0034:
            r8.close()     // Catch: IOException -> 0x0038
            goto L_0x003c
        L_0x0038:
            r8 = move-exception
            r8.printStackTrace()
        L_0x003c:
            r1.close()     // Catch: IOException -> 0x0040
            goto L_0x0079
        L_0x0040:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0079
        L_0x0045:
            r2 = move-exception
            r4 = r0
            r0 = r2
            goto L_0x007a
        L_0x0049:
            r2 = move-exception
            r4 = r0
            goto L_0x005d
        L_0x004c:
            r8 = move-exception
            r4 = r0
        L_0x004e:
            r0 = r8
            r8 = r4
            goto L_0x007a
        L_0x0051:
            r2 = move-exception
            r8 = r0
            r4 = r8
            goto L_0x005d
        L_0x0055:
            r8 = move-exception
            r1 = r0
            r4 = r1
            goto L_0x004e
        L_0x0059:
            r2 = move-exception
            r8 = r0
            r1 = r8
            r4 = r1
        L_0x005d:
            r2.printStackTrace()     // Catch: all -> 0x0020
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch: Exception -> 0x0066
            goto L_0x006a
        L_0x0066:
            r2 = move-exception
            r2.printStackTrace()
        L_0x006a:
            if (r8 == 0) goto L_0x0074
            r8.close()     // Catch: IOException -> 0x0070
            goto L_0x0074
        L_0x0070:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch: IOException -> 0x0040
        L_0x0079:
            return r0
        L_0x007a:
            if (r4 == 0) goto L_0x0084
            r4.close()     // Catch: Exception -> 0x0080
            goto L_0x0084
        L_0x0080:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0084:
            if (r8 == 0) goto L_0x008e
            r8.close()     // Catch: IOException -> 0x008a
            goto L_0x008e
        L_0x008a:
            r8 = move-exception
            r8.printStackTrace()
        L_0x008e:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch: IOException -> 0x0094
            goto L_0x0098
        L_0x0094:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eoa.b(byte[]):byte[]");
    }
}
