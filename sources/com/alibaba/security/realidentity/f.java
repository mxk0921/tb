package com.alibaba.security.realidentity;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2692a = "FileUtils";
    public static final String b = "/realidentity";
    public static final int c = 8192;

    public static boolean a(String str, byte[] bArr, String str2) {
        IOException e;
        FileOutputStream fileOutputStream;
        Throwable th;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8080da07", new Object[]{str, bArr, str2})).booleanValue();
        }
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists()) {
                file2.delete();
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = byteArrayInputStream2.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr2, 0, read);
                    }
                    fileOutputStream.flush();
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        return z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        a.a(f2692a, "saveBytes2File got error " + th.getMessage(), th);
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e = e5;
                                z = false;
                                e.printStackTrace();
                                return z;
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    public static void b(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2183b317", new Object[]{file, file2});
            return;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (TextUtils.isEmpty(name) || !name.contains("../")) {
                        File file3 = new File(file2, name);
                        if (nextEntry.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            file3.getParentFile().mkdirs();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            bufferedOutputStream.close();
                        }
                        zipInputStream.closeEntry();
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            zipInputStream.close();
            throw th;
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        try {
            return d(new File(str));
        } catch (Exception e) {
            a.b(f2692a, e.getLocalizedMessage());
            return 0L;
        }
    }

    public static long d(File file) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f396c516", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                a.a(f2692a, e3);
            }
            try {
                j = fileInputStream.available();
                fileInputStream.close();
            } catch (Exception e4) {
                e = e4;
                fileInputStream2 = fileInputStream;
                a.b(f2692a, e.getLocalizedMessage());
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return j;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e5) {
                        a.a(f2692a, e5);
                    }
                }
                throw th;
            }
        }
        return j;
    }

    public static String c(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d50a57", new Object[]{context, uri}) : a(context, uri, null, null);
    }

    public static boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue();
        }
        if (file != null) {
            return !file.exists() || (file.isFile() && file.delete());
        }
        return false;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : new File(str).exists();
    }

    public static String b(Context context, String str, String str2) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            sb = new StringBuilder();
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append(File.separator);
        } else {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cacheDir.getAbsolutePath());
                sb2.append(File.separator);
                sb = sb2;
            } else {
                sb = null;
            }
        }
        if (sb == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        return context.getFilesDir().getAbsolutePath() + b;
    }

    public static String b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83740678", new Object[]{context, uri});
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (b(uri)) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(":")[1]});
            }
            if (a(uri)) {
                return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            }
            return null;
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return a(context, uri, null, null);
        } else {
            if ("file".equals(uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
    }

    public static String a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5130299", new Object[]{context, uri}) : b(context, uri);
    }

    public static String a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86eea7d2", new Object[]{context, uri, str, strArr});
        }
        String[] strArr2 = {"_data"};
        try {
            cursor = context.getContentResolver().query(uri, strArr2, str, strArr, null);
            if (cursor == null) {
                return null;
            }
            try {
                if (cursor.moveToFirst()) {
                    return cursor.getString(cursor.getColumnIndexOrThrow(strArr2[0]));
                }
                return null;
            } catch (Exception unused) {
                if (cursor == null) {
                    return null;
                }
                cursor.close();
                return null;
            }
        } catch (Exception unused2) {
            cursor = null;
        }
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static synchronized boolean a(String str, byte[] bArr) {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{str, bArr})).booleanValue();
            }
            return a(new File(str), bArr);
        }
    }

    public static synchronized boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        boolean z = true;
        z = false;
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("434598ea", new Object[]{file, bArr})).booleanValue();
            }
            if (!(file == null || bArr == null)) {
                file.mkdirs();
                if (file.exists()) {
                    file.delete();
                } else {
                    file.createNewFile();
                }
                BufferedOutputStream bufferedOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.flush();
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        } catch (Throwable unused2) {
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (fileOutputStream != null) {
                                z = false;
                                fileOutputStream.close();
                            }
                            return z;
                        }
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    fileOutputStream = null;
                }
                try {
                    fileOutputStream.close();
                } catch (IOException unused6) {
                }
            }
            return z;
        }
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !b(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r4 == null) goto L_0x0031;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r4 != null) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.realidentity.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "d5108ff3"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            byte[] r4 = (byte[]) r4
            return r4
        L_0x0018:
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: all -> 0x002a
            java.io.InputStream r4 = r4.open(r5)     // Catch: all -> 0x002a
            byte[] r0 = a(r4)     // Catch: all -> 0x0028
            if (r4 == 0) goto L_0x0031
            goto L_0x002e
        L_0x0028:
            goto L_0x002c
        L_0x002a:
            r4 = r0
        L_0x002c:
            if (r4 == 0) goto L_0x0031
        L_0x002e:
            r4.close()     // Catch: IOException -> 0x0031
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.f.a(android.content.Context, java.lang.String):byte[]");
    }

    public static final byte[] a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        try {
            context.getAssets().open(str).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : new File(str).createNewFile();
    }

    public static boolean a(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
            if (file.exists()) {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception unused) {
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = null;
                    fileInputStream = fileInputStream2;
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return true;
                } catch (Exception unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused9) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = null;
        }
        return false;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return b(file);
        }
        return c(file);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        byte[] a2 = a(context, str);
        if (a2 == null) {
            return false;
        }
        return a(str2, a2);
    }
}
