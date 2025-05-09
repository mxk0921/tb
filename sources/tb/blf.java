package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.cyw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class blf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<File, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(793772121);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/utils/IoUtils$ClearTask");
        }

        /* renamed from: a */
        public Void doInBackground(File... fileArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("4be4fb56", new Object[]{this, fileArr});
            }
            try {
                for (File file : fileArr) {
                    if (file != null && file.exists() && file.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("delete file: ");
                        sb.append(file.getAbsolutePath());
                    }
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(793772120);
    }

    public static void a(Closeable... closeableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60dc7b5", new Object[]{closeableArr});
        } else if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void c(File... fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f8d8d9", new Object[]{fileArr});
        } else if (fileArr != null && fileArr.length > 0) {
            new a().execute(fileArr);
        }
    }

    public static void d(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6e782c", new Object[]{strArr});
        } else if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new File(str));
                }
            }
            c((File[]) arrayList.toArray(new File[0]));
        }
    }

    public static boolean e(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16600e9f", new Object[]{context, str, bVar})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return f(context, str, bVar);
        }
        File file = new File(str);
        File b2 = b(file, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
        if (b2 == null || !b2.exists()) {
            c(file);
            return false;
        }
        if (bVar != null) {
            ((cyw.a) bVar).a(b2.getAbsolutePath());
        }
        return true;
    }

    public static boolean g(String str, String str2) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd59d007", new Object[]{str, str2})).booleanValue();
        }
        try {
            File file2 = new File(str);
            File file3 = new File(str2);
            if (!file3.exists() && !file3.isDirectory()) {
                file3.mkdir();
            }
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file2)));
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                } else if (nextEntry.getName().contains("../")) {
                    zipInputStream.close();
                    return false;
                } else {
                    File file4 = new File(file3, nextEntry.getName());
                    if (nextEntry.isDirectory()) {
                        file = file4;
                    } else {
                        file = file4.getParentFile();
                    }
                    if (!file.isDirectory() && !file.mkdirs()) {
                        throw new FileNotFoundException("Failed to ensure directory: " + file.getAbsolutePath());
                    }
                    if (!nextEntry.isDirectory()) {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.close();
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static File b(File file, File file2) {
        FileOutputStream fileOutputStream;
        Exception e;
        File file3;
        FileOutputStream fileOutputStream2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c1bd7987", new Object[]{file, file2});
        }
        FileInputStream fileInputStream = null;
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            fileInputStream = new FileInputStream(file);
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            file3 = new File(file2, file.getName());
            fileOutputStream2 = new FileOutputStream(file3);
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            a(fileInputStream, fileOutputStream);
            throw th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    fileOutputStream2.flush();
                    a(fileInputStream, fileOutputStream2);
                    return file3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = fileOutputStream2;
            try {
                Log.e("tag", e.getMessage());
                a(fileInputStream, fileOutputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                a(fileInputStream, fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = fileInputStream;
            fileOutputStream = fileOutputStream2;
            a(fileInputStream, fileOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.content.Context r9, java.lang.String r10, tb.blf.b r11) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.blf.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "7d79d13c"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r1] = r10
            r5[r0] = r11
            java.lang.Object r9 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001f:
            java.io.File r3 = new java.io.File
            r3.<init>(r10)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = "_display_name"
            java.lang.String r6 = r3.getName()
            r4.put(r5, r6)
            java.lang.String r5 = "title"
            java.lang.String r6 = r3.getName()
            r4.put(r5, r6)
            java.lang.String r5 = "mime_type"
            java.lang.String r6 = "video/mp4"
            r4.put(r5, r6)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.String r8 = "date_modified"
            r4.put(r8, r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "date_added"
            r4.put(r6, r5)
            java.lang.String r5 = "relative_path"
            java.lang.String r6 = "DCIM"
            r4.put(r5, r6)
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.net.Uri r4 = r9.insert(r5, r4)
            r5 = 0
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: all -> 0x00a2, IOException -> 0x00a5
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: all -> 0x00a2, IOException -> 0x00a5
            r7.<init>(r10)     // Catch: all -> 0x00a2, IOException -> 0x00a5
            r6.<init>(r7)     // Catch: all -> 0x00a2, IOException -> 0x00a5
            if (r4 == 0) goto L_0x0083
            java.io.OutputStream r5 = r9.openOutputStream(r4)     // Catch: all -> 0x007f, IOException -> 0x0081
            goto L_0x0083
        L_0x007f:
            r9 = move-exception
            goto L_0x00cf
        L_0x0081:
            r9 = move-exception
            goto L_0x00a7
        L_0x0083:
            if (r5 == 0) goto L_0x0097
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch: all -> 0x007f, IOException -> 0x0081
        L_0x0089:
            int r10 = r6.read(r9)     // Catch: all -> 0x007f, IOException -> 0x0081
            r4 = -1
            if (r10 == r4) goto L_0x0094
            r5.write(r9, r2, r10)     // Catch: all -> 0x007f, IOException -> 0x0081
            goto L_0x0089
        L_0x0094:
            r5.flush()     // Catch: all -> 0x007f, IOException -> 0x0081
        L_0x0097:
            java.io.Closeable[] r9 = new java.io.Closeable[r0]
            r9[r2] = r5
            r9[r1] = r6
            a(r9)
            r9 = 1
            goto L_0x00b4
        L_0x00a2:
            r9 = move-exception
            r6 = r5
            goto L_0x00cf
        L_0x00a5:
            r9 = move-exception
            r6 = r5
        L_0x00a7:
            r9.printStackTrace()     // Catch: all -> 0x007f
            java.io.Closeable[] r9 = new java.io.Closeable[r0]
            r9[r2] = r5
            r9[r1] = r6
            a(r9)
            r9 = 0
        L_0x00b4:
            if (r9 == 0) goto L_0x00ce
            java.lang.String r10 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r10 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            if (r11 == 0) goto L_0x00c7
            java.lang.String r10 = r10.getAbsolutePath()
            tb.cyw$a r11 = (tb.cyw.a) r11
            r11.a(r10)
        L_0x00c7:
            java.io.File[] r10 = new java.io.File[r1]
            r10[r2] = r3
            c(r10)
        L_0x00ce:
            return r9
        L_0x00cf:
            java.io.Closeable[] r10 = new java.io.Closeable[r0]
            r10[r2] = r5
            r10[r1] = r6
            a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blf.f(android.content.Context, java.lang.String, tb.blf$b):boolean");
    }
}
