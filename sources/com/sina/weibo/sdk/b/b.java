package com.sina.weibo.sdk.b;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import tb.ryp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b {
    static {
        t2o.a(988807212);
    }

    public static String a(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (b(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (c(uri)) {
                return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else if (d(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return a(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (e(uri)) {
                return uri.getLastPathSegment();
            }
            return b(context, uri);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static String b(File file) {
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            String str = options.outMimeType;
            if (!str.contains(ryp.FILE_TYPE_IMAGE_JPG) && !str.contains("gif") && !str.contains("png")) {
                if (!str.contains("jpeg")) {
                    return null;
                }
            }
            return "image/*";
        } catch (Exception unused) {
            return "*/*";
        }
    }

    private static boolean c(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static long e(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return 0L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
    }

    public static boolean c(File file) {
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    private static boolean e(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static String b(Context context, Uri uri) {
        String uri2 = uri.toString();
        return new File(context.getExternalFilesDir(null), uri2.substring(uri2.lastIndexOf("/"))).getAbsolutePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r7 != null) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r7 == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        return b(r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: all -> 0x0027, Exception -> 0x0029
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: all -> 0x0027, Exception -> 0x0029
            if (r7 == 0) goto L_0x002b
            boolean r10 = r7.moveToFirst()     // Catch: all -> 0x0027, Exception -> 0x0029
            if (r10 == 0) goto L_0x002b
            int r10 = r7.getColumnIndexOrThrow(r0)     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.String r8 = r7.getString(r10)     // Catch: all -> 0x0027, Exception -> 0x0029
            r7.close()
            return r8
        L_0x0027:
            r8 = move-exception
            goto L_0x0031
        L_0x0029:
            goto L_0x0037
        L_0x002b:
            if (r7 == 0) goto L_0x003a
        L_0x002d:
            r7.close()
            goto L_0x003a
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            r7.close()
        L_0x0036:
            throw r8
        L_0x0037:
            if (r7 == 0) goto L_0x003a
            goto L_0x002d
        L_0x003a:
            java.lang.String r8 = b(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.b.b.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
