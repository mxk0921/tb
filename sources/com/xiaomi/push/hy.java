package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hy {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14942a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f14943a;

        /* renamed from: a  reason: collision with other field name */
        private ib f1124a;

        public a(Context context, ib ibVar) {
            this.f1124a = ibVar;
            this.f14943a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            hy.c(this.f14943a, this.f1124a);
        }
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private static void b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r9, com.xiaomi.push.ib r10) {
        /*
            java.lang.String r0 = "/tdReadTemp/tiny_data.data"
            boolean r1 = com.xiaomi.push.hy.f14942a
            if (r1 != 0) goto L_0x00d4
            r1 = 1
            com.xiaomi.push.hy.f14942a = r1
            java.io.File r1 = new java.io.File
            java.io.File r2 = r9.getFilesDir()
            java.lang.String r3 = "tiny_data.data"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            java.lang.String r3 = "TinyData no ready file to get data."
            if (r2 != 0) goto L_0x0021
            com.xiaomi.channel.commonutils.logger.b.m410a(r3)
            return
        L_0x0021:
            a(r9)
            byte[] r2 = com.xiaomi.push.service.cb.a(r9)
            r4 = 0
            java.io.File r5 = new java.io.File     // Catch: all -> 0x007b, Exception -> 0x007e
            java.io.File r6 = r9.getFilesDir()     // Catch: all -> 0x007b, Exception -> 0x007e
            java.lang.String r7 = "tiny_data.lock"
            r5.<init>(r6, r7)     // Catch: all -> 0x007b, Exception -> 0x007e
            com.xiaomi.push.x.m1105a(r5)     // Catch: all -> 0x007b, Exception -> 0x007e
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: all -> 0x007b, Exception -> 0x007e
            java.lang.String r7 = "rw"
            r6.<init>(r5, r7)     // Catch: all -> 0x007b, Exception -> 0x007e
            java.nio.channels.FileChannel r5 = r6.getChannel()     // Catch: all -> 0x0077, Exception -> 0x0079
            java.nio.channels.FileLock r4 = r5.lock()     // Catch: all -> 0x0077, Exception -> 0x0079
            java.io.File r5 = new java.io.File     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x0077, Exception -> 0x0079
            r7.<init>()     // Catch: all -> 0x0077, Exception -> 0x0079
            java.io.File r8 = r9.getFilesDir()     // Catch: all -> 0x0077, Exception -> 0x0079
            r7.append(r8)     // Catch: all -> 0x0077, Exception -> 0x0079
            r7.append(r0)     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x0077, Exception -> 0x0079
            r5.<init>(r7)     // Catch: all -> 0x0077, Exception -> 0x0079
            r1.renameTo(r5)     // Catch: all -> 0x0077, Exception -> 0x0079
            if (r4 == 0) goto L_0x0073
            boolean r1 = r4.isValid()
            if (r1 == 0) goto L_0x0073
            r4.release()     // Catch: IOException -> 0x006f
            goto L_0x0073
        L_0x006f:
            r1 = move-exception
        L_0x0070:
            com.xiaomi.channel.commonutils.logger.b.a(r1)
        L_0x0073:
            com.xiaomi.push.x.a(r6)
            goto L_0x0091
        L_0x0077:
            r9 = move-exception
            goto L_0x00c0
        L_0x0079:
            r1 = move-exception
            goto L_0x0080
        L_0x007b:
            r9 = move-exception
            r6 = r4
            goto L_0x00c0
        L_0x007e:
            r1 = move-exception
            r6 = r4
        L_0x0080:
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: all -> 0x0077
            if (r4 == 0) goto L_0x0073
            boolean r1 = r4.isValid()
            if (r1 == 0) goto L_0x0073
            r4.release()     // Catch: IOException -> 0x008f
            goto L_0x0073
        L_0x008f:
            r1 = move-exception
            goto L_0x0070
        L_0x0091:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r5 = r9.getFilesDir()
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x00b3
            com.xiaomi.channel.commonutils.logger.b.m410a(r3)
            return
        L_0x00b3:
            a(r9, r10, r1, r2)
            r10 = 0
            com.xiaomi.push.hx.a(r10)
            b(r9)
            com.xiaomi.push.hy.f14942a = r10
            return
        L_0x00c0:
            if (r4 == 0) goto L_0x00d0
            boolean r10 = r4.isValid()
            if (r10 == 0) goto L_0x00d0
            r4.release()     // Catch: IOException -> 0x00cc
            goto L_0x00d0
        L_0x00cc:
            r10 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r10)
        L_0x00d0:
            com.xiaomi.push.x.a(r6)
            throw r9
        L_0x00d4:
            java.lang.String r9 = "TinyData extractTinyData is running"
            com.xiaomi.channel.commonutils.logger.b.m410a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hy.c(android.content.Context, com.xiaomi.push.ib):void");
    }

    public static void a(Context context, ib ibVar) {
        ah.a(context).a(new a(context, ibVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        r15 = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r12, com.xiaomi.push.ib r13, java.io.File r14, byte[] r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: all -> 0x00d2, Exception -> 0x00d4
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: all -> 0x00d2, Exception -> 0x00d4
            r5.<init>(r14)     // Catch: all -> 0x00d2, Exception -> 0x00d4
            r4.<init>(r5)     // Catch: all -> 0x00d2, Exception -> 0x00d4
            r3 = 0
        L_0x0014:
            r5 = 0
            r6 = 0
        L_0x0016:
            int r7 = r4.read(r2)     // Catch: all -> 0x0037, Exception -> 0x003b
            r8 = -1
            if (r7 != r8) goto L_0x001f
            goto L_0x00b8
        L_0x001f:
            if (r7 == r1) goto L_0x003f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.<init>()     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r1 = "TinyData read from cache file failed cause lengthBuffer error. size:"
            r15.append(r1)     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.append(r7)     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r15 = r15.toString()     // Catch: all -> 0x0037, Exception -> 0x003b
        L_0x0032:
            com.xiaomi.channel.commonutils.logger.b.d(r15)     // Catch: all -> 0x0037, Exception -> 0x003b
            goto L_0x00b8
        L_0x0037:
            r12 = move-exception
            r3 = r4
            goto L_0x00dc
        L_0x003b:
            r12 = move-exception
            r3 = r4
            goto L_0x00d5
        L_0x003f:
            int r7 = com.xiaomi.push.ab.a(r2)     // Catch: all -> 0x0037, Exception -> 0x003b
            r8 = 1
            if (r7 < r8) goto L_0x00a5
            r8 = 10240(0x2800, float:1.4349E-41)
            if (r7 <= r8) goto L_0x004b
            goto L_0x00a5
        L_0x004b:
            byte[] r9 = new byte[r7]     // Catch: all -> 0x0037, Exception -> 0x003b
            int r10 = r4.read(r9)     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r10 == r7) goto L_0x006d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.<init>()     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r1 = "TinyData read from cache file failed cause buffer size not equal length. size:"
            r15.append(r1)     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.append(r10)     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r1 = "__length:"
            r15.append(r1)     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.append(r7)     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r15 = r15.toString()     // Catch: all -> 0x0037, Exception -> 0x003b
            goto L_0x0032
        L_0x006d:
            byte[] r7 = com.xiaomi.push.h.a(r15, r9)     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r7 == 0) goto L_0x009e
            int r9 = r7.length     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r9 != 0) goto L_0x0077
            goto L_0x009e
        L_0x0077:
            com.xiaomi.push.ig r9 = new com.xiaomi.push.ig     // Catch: all -> 0x0037, Exception -> 0x003b
            r9.<init>()     // Catch: all -> 0x0037, Exception -> 0x003b
            com.xiaomi.push.jm.a(r9, r7)     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r10 = "item_size"
            int r11 = r7.length     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: all -> 0x0037, Exception -> 0x003b
            r9.a(r10, r11)     // Catch: all -> 0x0037, Exception -> 0x003b
            r0.add(r9)     // Catch: all -> 0x0037, Exception -> 0x003b
            int r5 = r5 + 1
            int r7 = r7.length     // Catch: all -> 0x0037, Exception -> 0x003b
            int r6 = r6 + r7
            r7 = 8
            if (r5 >= r7) goto L_0x0096
            if (r6 < r8) goto L_0x0016
        L_0x0096:
            com.xiaomi.push.hz.a(r12, r13, r0)     // Catch: all -> 0x0037, Exception -> 0x003b
            r0.clear()     // Catch: all -> 0x0037, Exception -> 0x003b
            goto L_0x0014
        L_0x009e:
            java.lang.String r7 = "TinyData read from cache file failed cause decrypt fail"
            com.xiaomi.channel.commonutils.logger.b.d(r7)     // Catch: all -> 0x0037, Exception -> 0x003b
            goto L_0x0016
        L_0x00a5:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.<init>()     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r1 = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:"
            r15.append(r1)     // Catch: all -> 0x0037, Exception -> 0x003b
            r15.append(r7)     // Catch: all -> 0x0037, Exception -> 0x003b
            java.lang.String r15 = r15.toString()     // Catch: all -> 0x0037, Exception -> 0x003b
            goto L_0x0032
        L_0x00b8:
            com.xiaomi.push.hz.a(r12, r13, r0)     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r14 == 0) goto L_0x00ce
            boolean r12 = r14.exists()     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r12 == 0) goto L_0x00ce
            boolean r12 = r14.delete()     // Catch: all -> 0x0037, Exception -> 0x003b
            if (r12 != 0) goto L_0x00ce
            java.lang.String r12 = "TinyData delete reading temp file failed"
            com.xiaomi.channel.commonutils.logger.b.m410a(r12)     // Catch: all -> 0x0037, Exception -> 0x003b
        L_0x00ce:
            com.xiaomi.push.x.a(r4)
            goto L_0x00db
        L_0x00d2:
            r12 = move-exception
            goto L_0x00dc
        L_0x00d4:
            r12 = move-exception
        L_0x00d5:
            com.xiaomi.channel.commonutils.logger.b.a(r12)     // Catch: all -> 0x00d2
            com.xiaomi.push.x.a(r3)
        L_0x00db:
            return
        L_0x00dc:
            com.xiaomi.push.x.a(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hy.a(android.content.Context, com.xiaomi.push.ib, java.io.File, byte[]):void");
    }
}
