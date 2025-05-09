package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class af {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r5, java.lang.String r6, long r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            if (r0 < r1) goto L_0x0010
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = com.xiaomi.push.g.d(r5, r0)
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: all -> 0x004d, IOException -> 0x0050
            java.io.File r3 = r5.getExternalFilesDir(r0)     // Catch: all -> 0x004d, IOException -> 0x0050
            java.lang.String r4 = "/.vdevdir/"
            r1.<init>(r3, r4)     // Catch: all -> 0x004d, IOException -> 0x0050
            java.io.File r3 = new java.io.File     // Catch: all -> 0x004d, IOException -> 0x0050
            java.lang.String r4 = "lcfp.lock"
            r3.<init>(r1, r4)     // Catch: all -> 0x004d, IOException -> 0x0050
            com.xiaomi.push.x.m1105a(r3)     // Catch: all -> 0x004d, IOException -> 0x0050
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: all -> 0x004d, IOException -> 0x0050
            java.lang.String r4 = "rw"
            r1.<init>(r3, r4)     // Catch: all -> 0x004d, IOException -> 0x0050
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: all -> 0x0049, IOException -> 0x004b
            java.nio.channels.FileLock r0 = r3.lock()     // Catch: all -> 0x0049, IOException -> 0x004b
            boolean r5 = b(r5, r6, r7)     // Catch: all -> 0x0049, IOException -> 0x004b
            if (r0 == 0) goto L_0x0045
            boolean r6 = r0.isValid()
            if (r6 == 0) goto L_0x0045
            r0.release()     // Catch: IOException -> 0x0045
        L_0x0045:
            com.xiaomi.push.x.a(r1)
            return r5
        L_0x0049:
            r5 = move-exception
            goto L_0x0064
        L_0x004b:
            r5 = move-exception
            goto L_0x0052
        L_0x004d:
            r5 = move-exception
            r1 = r0
            goto L_0x0064
        L_0x0050:
            r5 = move-exception
            r1 = r0
        L_0x0052:
            r5.printStackTrace()     // Catch: all -> 0x0049
            if (r0 == 0) goto L_0x0060
            boolean r5 = r0.isValid()
            if (r5 == 0) goto L_0x0060
            r0.release()     // Catch: IOException -> 0x0060
        L_0x0060:
            com.xiaomi.push.x.a(r1)
            return r2
        L_0x0064:
            if (r0 == 0) goto L_0x006f
            boolean r6 = r0.isValid()
            if (r6 == 0) goto L_0x006f
            r0.release()     // Catch: IOException -> 0x006f
        L_0x006f:
            com.xiaomi.push.x.a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.af.a(android.content.Context, java.lang.String, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[Catch: all -> 0x00ea, IOException -> 0x00ec, LOOP:0: B:38:0x00d4->B:40:0x00da, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x00ea, blocks: (B:37:0x00d0, B:38:0x00d4, B:40:0x00da, B:48:0x00f7), top: B:54:0x00c6 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.af.b(android.content.Context, java.lang.String, long):boolean");
    }
}
