package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class trr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENGINE_LIB_NAME = "tbuprofen-engine";

    static {
        t2o.a(822083598);
    }

    public static File c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("470da126", new Object[]{context});
        }
        File file = new File(context.getFilesDir(), "tbuprofen");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(Context context) {
        Path path;
        Path path2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("342d4cc2", new Object[]{context});
        }
        urr.a("TBPFileManager", "Find TBP Plugin Library.....", new Object[0]);
        try {
            d(context);
            if (zrr.c().a()) {
                String b = zrr.c().b("tbuprofen-agent-v1");
                if (!TextUtils.isEmpty(b)) {
                    File file = new File(b);
                    if (!file.equals(a(context)) && file.exists() && file.length() > 0) {
                        urr.a("TBPFileManager", "Get agent from remote", new Object[0]);
                        return file;
                    }
                }
            }
            File file2 = new File(c(context), "tbuprofen-agent-v1.so");
            if (!file2.exists() || file2.length() == 0) {
                File a2 = a(context);
                if (a2 == null) {
                    urr.g("TBPFileManager", "Can't find the agent in apk!", new Object[0]);
                    return null;
                }
                path = Paths.get(a2.getAbsolutePath(), new String[0]);
                path2 = Paths.get(file2.getAbsolutePath(), new String[0]);
                Files.copy(path, path2, new CopyOption[0]);
                urr.a("TBPFileManager", "Copy the tbp agent library from " + a2.getAbsolutePath() + "===>" + file2.getAbsolutePath(), new Object[0]);
            }
            return file2;
        } catch (Exception e) {
            urr.c("TBPFileManager", e, "GetAgentLib Exception", new Object[0]);
            return null;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de01662", new Object[]{context});
            return;
        }
        try {
            File file = new File(context.getFilesDir(), "jvmti");
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static File a(Context context) {
        String str;
        try {
            str = (String) ClassLoader.class.getDeclaredMethod("findLibrary", String.class).invoke(context.getClassLoader(), "tbuprofen-agent-v1");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
