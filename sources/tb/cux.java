package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(499122197);
    }

    public static RandomAccessFile a(Context context, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("de82815c", new Object[]{context, str});
        }
        File file = new File(context.getFilesDir(), "alive");
        if (!file.exists()) {
            file.mkdir();
        }
        return new RandomAccessFile(new File(file, str + ".lk"), "rw");
    }

    public static List<ActivityManager.RunningAppProcessInfo> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.startsWith(packageName)) {
                    arrayList.add(runningAppProcessInfo);
                }
            }
        } catch (Throwable th) {
            pxx.f26392a.d("KUtils", "getRunningAppProcess err", th, new Object[0]);
        }
        return arrayList;
    }

    public static void c(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46de60f", new Object[]{context, componentName});
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable th) {
            pxx.f26392a.d("KUtils", "disableComponent err", th, new Object[0]);
        }
    }

    public static void d(Context context, String str, String str2) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = a(context, str);
            try {
                fileLock = randomAccessFile.getChannel().lock();
                randomAccessFile.write(str2.getBytes());
            } catch (Throwable th2) {
                th = th2;
                try {
                    pxx.f26392a.d("KUtils", "safeWriteFile err", th, new Object[0]);
                } finally {
                    e(fileLock, randomAccessFile);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static void e(FileLock fileLock, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79e82a9", new Object[]{fileLock, randomAccessFile});
            return;
        }
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    public static String f(Context context, String str, String str2) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = a(context, str);
            try {
                fileLock = randomAccessFile.getChannel().lock();
                return randomAccessFile.readLine();
            } catch (Throwable th2) {
                th = th2;
                try {
                    pxx.f26392a.d("KUtils", "safeReadFile err", th, new Object[0]);
                    return str2;
                } finally {
                    e(fileLock, randomAccessFile);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static void g(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee38690", new Object[]{context, componentName});
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            pxx.f26392a.d("KUtils", "enableComponent err", th, new Object[0]);
        }
    }

    public static void h(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        if (izx.b == null) {
            izx.b = of.a(2, "alive-io");
        }
        izx.b.execute(new Runnable() { // from class: tb.vrx
            @Override // java.lang.Runnable
            public final void run() {
                cux.d(context, str, str2);
            }
        });
    }
}
