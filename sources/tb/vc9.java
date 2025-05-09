package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class vc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUFFER = 1024;
    public static final String UNZIP_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    public static File f29919a;

    static {
        t2o.a(989856184);
    }

    public static boolean a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba39562e", new Object[]{file, file2})).booleanValue();
        }
        return b(file, file2, null);
    }

    public static String d(Application application, String str, String str2, boolean z) {
        File file;
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1218338", new Object[]{application, str, str2, new Boolean(z)});
        }
        String str3 = null;
        if (z) {
            wpw wpwVar = vpw.commonConfig;
            if (!wpwVar.Y || Build.VERSION.SDK_INT < 29) {
                vpw.b();
                if (wpwVar.J0) {
                    if (f29919a == null) {
                        f29919a = application.getExternalCacheDir();
                    }
                    file = f29919a;
                } else {
                    file = application.getExternalCacheDir();
                }
            } else {
                file = application.getExternalFilesDir("apk");
            }
            if (file != null) {
                sb = new StringBuilder();
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
            } else {
                File e = x74.e(application);
                if (e != null) {
                    sb = new StringBuilder();
                    sb.append(e.getAbsolutePath());
                    sb.append(File.separator);
                } else {
                    sb = null;
                }
            }
            if (!TextUtils.isEmpty(str) && sb != null) {
                sb.append(str);
                sb.append(File.separator);
                sb.append(str2);
                str3 = sb.toString();
            }
        }
        if (str3 == null) {
            str3 = f(application, str, str2);
        }
        v7t.a("FileManager", "createBaseDir path:" + str3);
        return str3;
    }

    public static File e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a47f13cc", new Object[]{context, str});
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (!TextUtils.isEmpty(str)) {
            absolutePath = absolutePath + File.separator + str;
        }
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String f(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f23e4287", new Object[]{application, str, str2});
        }
        if (application.getFilesDir() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getCacheDir().getAbsolutePath());
        if (!TextUtils.isEmpty(str)) {
            sb.append(File.separator);
            sb.append(str);
        }
        sb.append(File.separator);
        sb.append(str2);
        String sb2 = sb.toString();
        v7t.a("FileManager", "createInnerCacheStorage path:" + sb2);
        return sb2;
    }

    public static String g(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("989abf9", new Object[]{application, str, str2});
        }
        if (application.getFilesDir() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getFilesDir().getAbsolutePath());
        if (!TextUtils.isEmpty(str)) {
            sb.append(File.separator);
            sb.append(str);
        }
        sb.append(File.separator);
        sb.append(str2);
        String sb2 = sb.toString();
        v7t.a("FileManager", "createInnerfileStorage path:" + sb2);
        return sb2;
    }

    public static void c(InputStream inputStream, File file) {
        Throwable th;
        FileNotFoundException e;
        IOException e2;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e716532", new Object[]{inputStream, file});
        } else if (inputStream != null && file != null) {
            FileOutputStream fileOutputStream2 = null;
            FileOutputStream fileOutputStream3 = null;
            FileOutputStream fileOutputStream4 = null;
            try {
                try {
                    try {
                        file.createNewFile();
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                } catch (IOException e4) {
                    e2 = e4;
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 2048);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    fileOutputStream2 = bArr;
                } catch (FileNotFoundException e5) {
                    e = e5;
                    fileOutputStream4 = fileOutputStream;
                    v7t.d("FileManager", "copyFile: dest FileNotFoundException:" + e.getMessage());
                    if (fileOutputStream4 != null) {
                        fileOutputStream4.close();
                        fileOutputStream2 = fileOutputStream4;
                    }
                } catch (IOException e6) {
                    e2 = e6;
                    fileOutputStream3 = fileOutputStream;
                    v7t.d("FileManager", "copyFile: write IOException:" + e2.getMessage());
                    if (fileOutputStream3 != null) {
                        fileOutputStream3.close();
                        fileOutputStream2 = fileOutputStream3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd59d007", new Object[]{str, str2})).booleanValue();
        }
        if (!(str == null || str2 == null)) {
            try {
                return h(new FileInputStream(str), str2);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:82|21|(11:80|23|(1:25)|86|(2:31|(1:33)(1:85))|34|66|35|76|38|41)|30|86|(3:31|(0)(0)|33)|34|66|35|76|38|41) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x0068, Exception -> 0x006e, LOOP:0: B:31:0x0078->B:33:0x007f, LOOP_END, TryCatch #13 {Exception -> 0x006e, all -> 0x0068, blocks: (B:23:0x0062, B:30:0x0074, B:31:0x0078, B:33:0x007f, B:34:0x0083), top: B:80:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0083 A[EDGE_INSN: B:85:0x0083->B:34:0x0083 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.io.File r6, java.io.File r7, byte[] r8) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vc9.b(java.io.File, java.io.File, byte[]):boolean");
    }

    public static boolean h(InputStream inputStream, String str) {
        Throwable th;
        ZipInputStream zipInputStream;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("913a6052", new Object[]{inputStream, str})).booleanValue();
        }
        if (inputStream == null || str == null) {
            return false;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        FileOutputStream fileOutputStream = null;
        try {
            zipInputStream = new ZipInputStream(inputStream);
            try {
                try {
                    byte[] bArr = new byte[1024];
                    StringBuffer stringBuffer = new StringBuffer(200);
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        stringBuffer.append(nextEntry.getName());
                        if (!stringBuffer.toString().contains("../")) {
                            File file = new File(str + stringBuffer.toString());
                            stringBuffer.delete(0, stringBuffer.length());
                            if (nextEntry.isDirectory()) {
                                file.mkdirs();
                            } else {
                                if (!file.getParentFile().exists()) {
                                    file.getParentFile().mkdirs();
                                }
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                while (true) {
                                    try {
                                        int read = zipInputStream.read(bArr, 0, 1024);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, read);
                                    } catch (Exception e2) {
                                        e = e2;
                                        fileOutputStream = fileOutputStream2;
                                        v7t.d("FileManager", "unzip: IOException:" + e.getMessage());
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e3) {
                                                v7t.d("FileManager", "close Stream Exception:" + e3.getMessage());
                                                return false;
                                            }
                                        }
                                        if (zipInputStream != null) {
                                            zipInputStream.close();
                                        }
                                        inputStream.close();
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e4) {
                                                v7t.d("FileManager", "close Stream Exception:" + e4.getMessage());
                                                throw th;
                                            }
                                        }
                                        if (zipInputStream != null) {
                                            zipInputStream.close();
                                        }
                                        inputStream.close();
                                        throw th;
                                    }
                                }
                                fileOutputStream2.close();
                                fileOutputStream = fileOutputStream2;
                            }
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            v7t.d("FileManager", "close Stream Exception:" + e5.getMessage());
                        }
                    }
                    zipInputStream.close();
                    inputStream.close();
                    return true;
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zipInputStream = null;
        }
    }
}
