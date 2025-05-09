package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.xiaomi.push.bm;
import com.xiaomi.push.w;
import com.xiaomi.push.x;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class av {

    /* renamed from: a  reason: collision with root package name */
    private static long f15054a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f15055a;

        /* renamed from: a  reason: collision with other field name */
        byte[] f1564a;

        public a(byte[] bArr, int i) {
            this.f1564a = bArr;
            this.f15055a = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f15056a;

        /* renamed from: a  reason: collision with other field name */
        public Bitmap f1565a;

        public b(Bitmap bitmap, long j) {
            this.f1565a = bitmap;
            this.f15056a = j;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.m410a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        int i2 = options.outWidth;
        if (i2 <= round || (i = options.outHeight) <= round) {
            return 1;
        }
        return Math.min(i2 / round, i / round);
    }

    private static Bitmap b(Context context, String str) {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        Exception e;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", bm.a(str));
        FileInputStream fileInputStream2 = null;
        Bitmap bitmap2 = null;
        fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
                bitmap = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
        try {
            bitmap2 = BitmapFactory.decodeStream(fileInputStream);
            file.setLastModified(System.currentTimeMillis());
            x.a((Closeable) fileInputStream);
            return bitmap2;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            bitmap = bitmap2;
            com.xiaomi.channel.commonutils.logger.b.a(e);
            x.a((Closeable) fileInputStream2);
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            x.a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(android.content.Context r3, java.lang.String r4) {
        /*
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0 = 0
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: all -> 0x0035, IOException -> 0x0038
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: all -> 0x0035, IOException -> 0x0038
            int r2 = a(r3, r1)     // Catch: all -> 0x0030, IOException -> 0x0032
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: all -> 0x0030, IOException -> 0x0032
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: all -> 0x0030, IOException -> 0x0032
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: all -> 0x002b, IOException -> 0x002e
            r4.<init>()     // Catch: all -> 0x002b, IOException -> 0x002e
            r4.inSampleSize = r2     // Catch: all -> 0x002b, IOException -> 0x002e
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r0, r4)     // Catch: all -> 0x002b, IOException -> 0x002e
            com.xiaomi.push.x.a(r3)
            com.xiaomi.push.x.a(r1)
            return r4
        L_0x002b:
            r4 = move-exception
            r0 = r3
            goto L_0x0045
        L_0x002e:
            r4 = move-exception
            goto L_0x003b
        L_0x0030:
            r4 = move-exception
            goto L_0x0045
        L_0x0032:
            r4 = move-exception
            r3 = r0
            goto L_0x003b
        L_0x0035:
            r4 = move-exception
            r1 = r0
            goto L_0x0045
        L_0x0038:
            r4 = move-exception
            r3 = r0
            r1 = r3
        L_0x003b:
            com.xiaomi.channel.commonutils.logger.b.a(r4)     // Catch: all -> 0x002b
            com.xiaomi.push.x.a(r3)
            com.xiaomi.push.x.a(r1)
            return r0
        L_0x0045:
            com.xiaomi.push.x.a(r0)
            com.xiaomi.push.x.a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.av.a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
        if (r3 == null) goto L_0x00f9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r3 == null) goto L_0x00f9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.xiaomi.push.service.av.a a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.av.a(java.lang.String, boolean):com.xiaomi.push.service.av$a");
    }

    public static b a(Context context, String str, boolean z) {
        Throwable th;
        Exception e;
        a a2;
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        Bitmap b2 = b(context, str);
        try {
            if (b2 != null) {
                bVar.f1565a = b2;
                return bVar;
            }
            try {
                a2 = a(str, z);
            } catch (Exception e2) {
                e = e2;
            }
            if (a2 == null) {
                x.a((Closeable) null);
                return bVar;
            }
            bVar.f15056a = a2.f15055a;
            byte[] bArr = a2.f1564a;
            if (bArr != null) {
                if (z) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    try {
                        int a3 = a(context, byteArrayInputStream2);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = a3;
                        bVar.f1565a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        byteArrayInputStream = byteArrayInputStream2;
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayInputStream = byteArrayInputStream2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        x.a((Closeable) byteArrayInputStream);
                        return bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayInputStream = byteArrayInputStream2;
                        x.a((Closeable) byteArrayInputStream);
                        throw th;
                    }
                } else {
                    bVar.f1565a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            }
            a(context, a2.f1564a, str);
            x.a((Closeable) byteArrayInputStream);
            return bVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f15054a == 0) {
                f15054a = w.a(file);
            }
            if (f15054a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (!listFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i].lastModified()) > 1209600) {
                            listFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
                f15054a = 0L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r5, byte[] r6, java.lang.String r7) {
        /*
            if (r6 != 0) goto L_0x0008
            java.lang.String r5 = "cannot save small icon cause bitmap is null"
            com.xiaomi.channel.commonutils.logger.b.m410a(r5)
            return
        L_0x0008:
            a(r5)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "mipush_icon"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0038
            r0.mkdirs()
        L_0x0038:
            java.io.File r1 = new java.io.File
            java.lang.String r7 = com.xiaomi.push.bm.a(r7)
            r1.<init>(r0, r7)
            r7 = 0
            boolean r0 = r1.exists()     // Catch: all -> 0x004c, Exception -> 0x004f
            if (r0 != 0) goto L_0x0052
            r1.createNewFile()     // Catch: all -> 0x004c, Exception -> 0x004f
            goto L_0x0052
        L_0x004c:
            r5 = move-exception
            r0 = r7
            goto L_0x00ae
        L_0x004f:
            r6 = move-exception
            r0 = r7
            goto L_0x0072
        L_0x0052:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: all -> 0x004c, Exception -> 0x004f
            r0.<init>(r1)     // Catch: all -> 0x004c, Exception -> 0x004f
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: all -> 0x006f, Exception -> 0x0071
            r3.<init>(r0)     // Catch: all -> 0x006f, Exception -> 0x0071
            r3.write(r6)     // Catch: all -> 0x0069, Exception -> 0x006c
            r3.flush()     // Catch: all -> 0x0069, Exception -> 0x006c
            com.xiaomi.push.x.a(r3)
        L_0x0065:
            com.xiaomi.push.x.a(r0)
            goto L_0x0079
        L_0x0069:
            r5 = move-exception
            r7 = r3
            goto L_0x00ae
        L_0x006c:
            r6 = move-exception
            r7 = r3
            goto L_0x0072
        L_0x006f:
            r5 = move-exception
            goto L_0x00ae
        L_0x0071:
            r6 = move-exception
        L_0x0072:
            com.xiaomi.channel.commonutils.logger.b.a(r6)     // Catch: all -> 0x006f
            com.xiaomi.push.x.a(r7)
            goto L_0x0065
        L_0x0079:
            long r6 = com.xiaomi.push.service.av.f15054a
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r5 = r5.getPath()
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            long r5 = com.xiaomi.push.w.a(r6)
            long r0 = r1.length()
            long r5 = r5 + r0
            com.xiaomi.push.service.av.f15054a = r5
        L_0x00ad:
            return
        L_0x00ae:
            com.xiaomi.push.x.a(r7)
            com.xiaomi.push.x.a(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.av.a(android.content.Context, byte[], java.lang.String):void");
    }
}
