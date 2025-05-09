package tb;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yf9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297599);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r13, java.io.File r14) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "copy close"
            java.lang.String r3 = "FileUtil"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.yf9.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r2 = "eda0cb41"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r13
            r3[r0] = r14
            java.lang.Object r13 = r4.ipc$dispatch(r2, r3)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0020:
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: all -> 0x0059, Exception -> 0x005c
            r5.<init>(r13)     // Catch: all -> 0x0059, Exception -> 0x005c
            java.nio.channels.FileChannel r13 = r5.getChannel()     // Catch: all -> 0x0059, Exception -> 0x005c
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: all -> 0x004f, Exception -> 0x0054
            r5.<init>(r14)     // Catch: all -> 0x004f, Exception -> 0x0054
            java.nio.channels.FileChannel r4 = r5.getChannel()     // Catch: all -> 0x004f, Exception -> 0x0054
            long r10 = r13.size()     // Catch: all -> 0x004f, Exception -> 0x0054
            r8 = 0
            r6 = r4
            r7 = r13
            r6.transferFrom(r7, r8, r10)     // Catch: all -> 0x004f, Exception -> 0x0054
            r13.close()     // Catch: IOException -> 0x0042
            goto L_0x0046
        L_0x0042:
            r13 = move-exception
            tb.agh.d(r3, r2, r13)
        L_0x0046:
            r4.close()     // Catch: IOException -> 0x004a
            goto L_0x004e
        L_0x004a:
            r13 = move-exception
            tb.agh.d(r3, r2, r13)
        L_0x004e:
            return r0
        L_0x004f:
            r14 = move-exception
            r12 = r4
            r4 = r13
            r13 = r12
            goto L_0x0079
        L_0x0054:
            r14 = move-exception
            r12 = r4
            r4 = r13
            r13 = r12
            goto L_0x005e
        L_0x0059:
            r14 = move-exception
            r13 = r4
            goto L_0x0079
        L_0x005c:
            r14 = move-exception
            r13 = r4
        L_0x005e:
            java.lang.String r0 = "copy"
            tb.agh.d(r3, r0, r14)     // Catch: all -> 0x0078
            if (r4 == 0) goto L_0x006d
            r4.close()     // Catch: IOException -> 0x0069
            goto L_0x006d
        L_0x0069:
            r14 = move-exception
            tb.agh.d(r3, r2, r14)
        L_0x006d:
            if (r13 == 0) goto L_0x0077
            r13.close()     // Catch: IOException -> 0x0073
            goto L_0x0077
        L_0x0073:
            r13 = move-exception
            tb.agh.d(r3, r2, r13)
        L_0x0077:
            return r1
        L_0x0078:
            r14 = move-exception
        L_0x0079:
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch: IOException -> 0x007f
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            tb.agh.d(r3, r2, r0)
        L_0x0083:
            if (r13 == 0) goto L_0x008d
            r13.close()     // Catch: IOException -> 0x0089
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            tb.agh.d(r3, r2, r13)
        L_0x008d:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yf9.a(java.lang.String, java.io.File):boolean");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18ba3508", new Object[]{str})).booleanValue();
        }
        try {
            if (!h(str)) {
                return false;
            }
            return c(new File(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("807b73c9", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z &= c(file2);
        }
        return file.delete() & z;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb2024c", new Object[]{str})).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (Exception e) {
            agh.d(cg9.TAG, "check exist" + str, e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r9 != null) goto L_0x004c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r9 == null) goto L_0x005e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.yf9.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = "60014887"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            r9 = 1
            r3[r9] = r10
            r9 = 2
            r3[r9] = r11
            r9 = 3
            r3[r9] = r12
            java.lang.Object r9 = r1.ipc$dispatch(r2, r3)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001e:
            java.lang.String r1 = "_data"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r8 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: all -> 0x0050, Exception -> 0x0052
            r7 = 0
            r3 = r10
            r4 = r1
            r5 = r11
            r6 = r12
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: all -> 0x0050, Exception -> 0x0052
            if (r9 == 0) goto L_0x004a
            boolean r10 = r9.moveToFirst()     // Catch: all -> 0x0045, Exception -> 0x0048
            if (r10 == 0) goto L_0x004a
            r10 = r1[r0]     // Catch: all -> 0x0045, Exception -> 0x0048
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch: all -> 0x0045, Exception -> 0x0048
            java.lang.String r8 = r9.getString(r10)     // Catch: all -> 0x0045, Exception -> 0x0048
            goto L_0x004a
        L_0x0045:
            r10 = move-exception
            r8 = r9
            goto L_0x0055
        L_0x0048:
            goto L_0x005b
        L_0x004a:
            if (r9 == 0) goto L_0x005e
        L_0x004c:
            r9.close()
            goto L_0x005e
        L_0x0050:
            r10 = move-exception
            goto L_0x0055
        L_0x0052:
            r9 = r8
            goto L_0x005b
        L_0x0055:
            if (r8 == 0) goto L_0x005a
            r8.close()
        L_0x005a:
            throw r10
        L_0x005b:
            if (r9 == 0) goto L_0x005e
            goto L_0x004c
        L_0x005e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yf9.e(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String f(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90d5f731", new Object[]{context, uri});
        }
        return g(context, uri);
    }

    public static boolean h(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f1fa2e", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("content:") && (split = str.split("/")) != null && split.length != 0) {
                boolean z = false;
                boolean z2 = false;
                for (String str2 : split) {
                    if ("com.taobao.taobao".equalsIgnoreCase(str2)) {
                        z = true;
                    } else if ("cache".equalsIgnoreCase(str2)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        break;
                    }
                }
                if (!z || !z2) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8404a08", new Object[]{uri})).booleanValue();
        }
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean j(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7abf0963", new Object[]{uri})).booleanValue();
        }
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean k(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c4c46af", new Object[]{uri})).booleanValue();
        }
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String g(Context context, Uri uri) {
        Uri uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9108ad8c", new Object[]{context, uri});
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (k(uri)) {
                String[] split = documentId.split(":");
                String str = split[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (!"audio".equals(str)) {
                    return null;
                } else {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return e(context, uri2, "_id=?", new String[]{split[1]});
            } else if (i(uri)) {
                return e(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            } else {
                if (!j(uri)) {
                    return null;
                }
                String[] split2 = documentId.split(":");
                if (split2.length < 2 || !"primary".equalsIgnoreCase(split2[0])) {
                    return null;
                }
                return Environment.getExternalStorageDirectory() + "/" + split2[1];
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return e(context, uri, null, null);
        } else {
            if ("file".equals(uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
    }
}
