package com.ut.share.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(662700086);
    }

    public static String appendQueryInOverrideMode(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ee7df8e", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.clearQuery();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            for (String str3 : parse.getQueryParameterNames()) {
                if (!map.containsKey(str3)) {
                    buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
                }
            }
            return buildUpon.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] bmp2Bytes(android.graphics.Bitmap r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ut.share.utils.ShareUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "3cbbe2d4"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            byte[] r4 = (byte[]) r4
            return r4
        L_0x0015:
            r0 = 0
            if (r4 != 0) goto L_0x0019
            return r0
        L_0x0019:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0037, Exception -> 0x0039
            r1.<init>()     // Catch: all -> 0x0037, Exception -> 0x0039
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x0032, Exception -> 0x0035
            r3 = 85
            r4.compress(r2, r3, r1)     // Catch: all -> 0x0032, Exception -> 0x0035
            byte[] r0 = r1.toByteArray()     // Catch: all -> 0x0032, Exception -> 0x0035
            r1.close()     // Catch: IOException -> 0x002d
            goto L_0x0043
        L_0x002d:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0043
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0044
        L_0x0035:
            r4 = move-exception
            goto L_0x003b
        L_0x0037:
            r4 = move-exception
            goto L_0x0044
        L_0x0039:
            r4 = move-exception
            r1 = r0
        L_0x003b:
            r4.printStackTrace()     // Catch: all -> 0x0032
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch: IOException -> 0x002d
        L_0x0043:
            return r0
        L_0x0044:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch: IOException -> 0x004a
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.share.utils.ShareUtils.bmp2Bytes(android.graphics.Bitmap):byte[]");
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1af80ff", new Object[]{bitmap, new Boolean(z)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }

    public static Bitmap imageFromPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7db7ca59", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && Environment.getExternalStorageState().equals("mounted") && new File(str).exists()) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    public static Bitmap imageZoom(Bitmap bitmap, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4cba14c3", new Object[]{bitmap, new Double(d)});
        }
        if (d > 400.0d) {
            d = 400.0d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        double length = byteArrayOutputStream.toByteArray().length / 1024;
        if (length <= d) {
            return bitmap;
        }
        double d2 = length / (d * 0.8d);
        return zoomImage(bitmap, bitmap.getWidth() / Math.sqrt(d2), bitmap.getHeight() / Math.sqrt(d2));
    }

    public static boolean saveBitmap(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a29e7c5", new Object[]{bitmap, file, str, compressFormat})).booleanValue();
        }
        if (!(bitmap == null || file == null || str == null || compressFormat == null)) {
            File file2 = new File(file, str);
            FileOutputStream fileOutputStream = null;
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bitmap.compress(compressFormat, 100, fileOutputStream2);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return true;
                } catch (Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r8 > 375.0d) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r8 > 750.0d) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        r8 = ((float) r8) / r10;
        r5.postScale(r8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        return android.graphics.Bitmap.createBitmap(r7, 0, 0, (int) r10, (int) r11, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r8 > 300.0d) goto L_0x0045;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap zoomImage(android.graphics.Bitmap r7, double r8, double r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ut.share.utils.ShareUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0025
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r8)
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r10)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r1
            r7 = 2
            r9[r7] = r8
            java.lang.String r7 = "4af0451d"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r9)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            return r7
        L_0x0025:
            int r10 = r7.getWidth()
            float r10 = (float) r10
            int r11 = r7.getHeight()
            float r11 = (float) r11
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r0 = r11 / r10
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0047
            r0 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
        L_0x0045:
            r8 = r0
            goto L_0x0061
        L_0x0047:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            r0 = 4645304685958266880(0x4077700000000000, double:375.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            goto L_0x0045
        L_0x0057:
            r0 = 4649808285585637376(0x4087700000000000, double:750.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            goto L_0x0045
        L_0x0061:
            float r8 = (float) r8
            float r8 = r8 / r10
            r5.postScale(r8, r8)
            int r3 = (int) r10
            int r4 = (int) r11
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.share.utils.ShareUtils.zoomImage(android.graphics.Bitmap, double, double):android.graphics.Bitmap");
    }

    public static Bitmap thumbnailImageFromPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("69fd5dcd", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !Environment.getExternalStorageState().equals("mounted") || !new File(str).exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = (int) Math.round((((options.outWidth * options.outHeight) * 16.0d) / 49152.0d) + 1.0d);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_4444;
        return BitmapFactory.decodeFile(str, options);
    }
}
