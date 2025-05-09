package com.alibaba.wireless.security.open.edgecomputing;

/* renamed from: com.alibaba.wireless.security.open.edgecomputing.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0164 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* renamed from: а  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m218(byte[] r5) {
        /*
            r0 = 0
            java.util.zip.Deflater r1 = new java.util.zip.Deflater     // Catch: all -> 0x0033, Exception -> 0x003a
            r1.<init>()     // Catch: all -> 0x0033, Exception -> 0x003a
            r2 = 9
            r1.setLevel(r2)     // Catch: all -> 0x0033, Exception -> 0x003a
            r1.setInput(r5)     // Catch: all -> 0x0033, Exception -> 0x003a
            r1.finish()     // Catch: all -> 0x0033, Exception -> 0x003a
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0033, Exception -> 0x003a
            int r5 = r5.length     // Catch: all -> 0x0033, Exception -> 0x003a
            r2.<init>(r5)     // Catch: all -> 0x0033, Exception -> 0x003a
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: all -> 0x0030, Exception -> 0x003b
        L_0x001b:
            boolean r3 = r1.finished()     // Catch: all -> 0x0030, Exception -> 0x003b
            if (r3 != 0) goto L_0x002a
            int r3 = r1.deflate(r5)     // Catch: all -> 0x0030, Exception -> 0x003b
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: all -> 0x0030, Exception -> 0x003b
            goto L_0x001b
        L_0x002a:
            r2.close()     // Catch: Exception -> 0x002e
            goto L_0x003e
        L_0x002e:
            goto L_0x003e
        L_0x0030:
            r5 = move-exception
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch: Exception -> 0x0039
        L_0x0039:
            throw r5
        L_0x003a:
            r2 = r0
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x002a
        L_0x003e:
            if (r2 == 0) goto L_0x0044
            byte[] r0 = r2.toByteArray()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.edgecomputing.C0164.m218(byte[]):byte[]");
    }
}
