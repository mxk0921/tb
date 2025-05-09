package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File[] fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7a9c2f", new Object[]{fileArr});
        } else if (fileArr != null) {
            for (File file : fileArr) {
                f(file);
            }
        }
    }

    public static File b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b52e3247", new Object[]{file});
        }
        if (!file.isDirectory()) {
            try {
                c(file);
                file.mkdirs();
            } catch (Exception e) {
                ehh.d(e);
            }
        }
        return file;
    }

    public static void c(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ff84b4", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        f(file);
    }

    public static String d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649fb7fb", new Object[]{file});
        }
        if (!file.exists()) {
            return null;
        }
        return e(file);
    }

    public static String e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("635d4b7a", new Object[]{file});
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = fileReader.read(cArr, 0, 1024);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
                fileReader.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOError | IOException e) {
            ehh.d(e);
        }
        return sb.toString();
    }

    public static boolean f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebac4b88", new Object[]{file})).booleanValue();
        }
        if (file != null) {
            try {
                if (file.exists()) {
                    return file.delete();
                }
            } catch (Exception e) {
                ehh.d(e);
            }
        }
        return false;
    }

    public static boolean g(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("372fe4dc", new Object[]{file, str})).booleanValue();
        }
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (Exception e) {
            ehh.d(e);
            return false;
        }
    }
}
