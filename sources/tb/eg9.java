package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3812e8a3", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists() || !file.isDirectory()) {
                file.mkdirs();
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53f33ed8", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String c(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee34405", new Object[]{context});
        }
        if (context.getExternalCacheDir() == null) {
            str = context.getCacheDir().getAbsolutePath() + File.separator + t71.MODULE_NAME;
        } else {
            str = context.getExternalCacheDir().getAbsolutePath() + File.separator + t71.MODULE_NAME;
        }
        a(str);
        return str;
    }

    public static File d(Context context) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f380878a", new Object[]{context});
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || !cacheDir.isDirectory()) {
            Log.e("CodeTrack_FileUtil", "context.getCacheDir() not available");
            throw new IllegalStateException("context.getCacheDir() not available");
        }
        File file = new File(cacheDir, String.valueOf(System.nanoTime()));
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            new StringBuilder("parentFile.mkdirs() == ").append(parentFile.mkdirs());
        }
        new StringBuilder("targetFile.createNewFile() == ").append(file.createNewFile());
        new StringBuilder("targetFile.getPath() == ").append(file.getPath());
        return file;
    }

    public static boolean e(String str, String str2) {
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f01bf0", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str2);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!file.exists() && !file.createNewFile()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    fileOutputStream2.write(str.getBytes());
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        Log.e("CodeTrack_FileUtil", e2.toString());
                    }
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    Log.e("CodeTrack_FileUtil", e.toString());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Log.e("CodeTrack_FileUtil", e4.toString());
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            Log.e("CodeTrack_FileUtil", e5.toString());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void f(byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfc08db", new Object[]{bArr, file});
            return;
        }
        try {
            qjn qjnVar = (qjn) kok.b(kok.d(file));
            qjnVar.g(bArr);
            qjnVar.flush();
            qjnVar.close();
        } catch (IOException e) {
            Log.e("CodeTrack_FileUtil", "close sink error", e);
        }
    }
}
