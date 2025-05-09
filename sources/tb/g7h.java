package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g7h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLT_CACHE_DIR = "image_search";

    static {
        t2o.a(481297450);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1ffa720", new Object[]{context, str, str2});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            File d = d(context, boh.a(str) + str2);
            if (d != null && d.exists() && d.length() > 0) {
                agh.h("LocalCacheFileManager", "find file " + d.getAbsolutePath());
                return d.getAbsolutePath();
            }
        }
        return "";
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b18f1e1", new Object[]{context, str});
        }
        return a(context, str, "");
    }

    public static String c(Application application, String str, String str2) {
        File d;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51ec5080", new Object[]{application, str, str2});
        }
        if (application == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (d = d(application, boh.a(str))) == null || !d.exists() || d.length() == 0) {
            return "";
        }
        int length = (int) d.length();
        byte[] bArr = new byte[length];
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(d));
            try {
                bufferedInputStream2.read(bArr, 0, length);
                e2d.a(bufferedInputStream2);
                if (!TextUtils.equals(boh.c(bArr), str2)) {
                    yf9.c(d);
                    return "";
                }
                agh.h("LocalCacheFileManager", "findModelFileWithMd5: " + d.getAbsolutePath());
                return d.getAbsolutePath();
            } catch (Exception unused) {
                bufferedInputStream = bufferedInputStream2;
                e2d.a(bufferedInputStream);
                return "";
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                e2d.a(bufferedInputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static File d(Context context, String str) {
        File cacheDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ab985e88", new Object[]{context, str});
        }
        File file = new File(context.getCacheDir().getAbsolutePath(), str);
        if (lg4.y()) {
            String str2 = cacheDir.getAbsolutePath() + File.separator + "image_search";
            File file2 = new File(str2);
            if ((!file2.exists() || !file2.isDirectory()) && !file2.mkdirs()) {
                agh.h("LocalCacheFileManager", "create parent file failed " + file2.getAbsolutePath());
                return null;
            }
            File file3 = new File(str2, str);
            if (file3.exists()) {
                if (file.exists()) {
                    agh.h("LocalCacheFileManager", "target file exist, old file delete " + file.getAbsolutePath());
                    file.delete();
                }
                return file3;
            } else if (!file.exists() || !yf9.a(file.getAbsolutePath(), file3)) {
                agh.h("LocalCacheFileManager", "old file not exist or copy failed");
                return null;
            } else {
                agh.h("LocalCacheFileManager", "target file not exist, copy old file success");
                file.delete();
                return file3;
            }
        } else if (file.exists()) {
            agh.h("LocalCacheFileManager", "use old file " + file.getAbsolutePath());
            return file;
        } else {
            agh.h("LocalCacheFileManager", "old file not exist");
            return null;
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d344e96c", new Object[]{context});
        }
        File cacheDir = context.getCacheDir();
        if (!lg4.y()) {
            return cacheDir.getAbsolutePath();
        }
        return cacheDir.getAbsolutePath() + File.separator + "image_search";
    }

    public static String g(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43698976", new Object[]{context, str, bArr});
        }
        return f(context, str, bArr, "");
    }

    public static String f(Context context, String str, byte[] bArr, String str2) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40718a3d", new Object[]{context, str, bArr, str2});
        }
        if (!(context == null || TextUtils.isEmpty(str) || bArr == null || bArr.length == 0)) {
            String str3 = boh.a(str) + str2;
            String e = e(context);
            File file = new File(e);
            if (!file.exists() && !file.mkdirs()) {
                return "";
            }
            File file2 = new File(e, str3);
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                agh.h("LocalCacheFileManager", "saveFile: " + file2.getAbsolutePath());
                String absolutePath = file2.getAbsolutePath();
                e2d.a(bufferedOutputStream);
                return absolutePath;
            } catch (IOException unused2) {
                bufferedOutputStream2 = bufferedOutputStream;
                e2d.a(bufferedOutputStream2);
                return "";
            } catch (Throwable th3) {
                th = th3;
                e2d.a(bufferedOutputStream);
                throw th;
            }
        }
        return "";
    }
}
