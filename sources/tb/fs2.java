package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912763);
    }

    public static void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ac805f", new Object[]{file});
            return;
        }
        File file2 = new File(file.getAbsolutePath() + "tmp");
        file.renameTo(file2);
        file2.delete();
    }

    public static void clear(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a36b60", new Object[]{context, new Boolean(z)});
            return;
        }
        a(context.getFilesDir().getParentFile(), true, z);
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null && externalCacheDir.getParentFile() != null) {
            File parentFile = externalCacheDir.getParentFile();
            a(parentFile, true, z);
            parentFile.delete();
        }
    }

    public static void deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8c8420", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                deleteDir(file2);
            }
        }
        file.delete();
    }

    public static void a(File file, boolean z, boolean z2) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54398fbe", new Object[]{file, new Boolean(z), new Boolean(z2)});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!z2 || !file2.getName().startsWith("UTCrashHandler")) {
                        b(file2);
                    }
                } else if (!z || !file2.getName().equals("lib")) {
                    a(file2, false, z2);
                    file2.delete();
                }
            }
        }
    }

    public static void clear(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e05f4", new Object[]{context});
        } else {
            clear(context, true);
        }
    }
}
