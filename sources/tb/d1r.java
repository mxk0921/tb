package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe2299d", new Object[]{str})).booleanValue();
        }
        try {
            boolean isFile = new File("/data/local/tmp/swallows", str).isFile();
            if (isFile) {
                RSoLog.d("SwitchUtils.read(" + str + ") = true");
            }
            return isFile;
        } catch (Throwable th) {
            RSoLog.c("SwitchUtils.read err", th);
            return false;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a7a82cc", new Object[]{str});
        }
        try {
            File file = new File("/data/local/tmp/swallows", str);
            if (file.isFile() && file.length() >= 1) {
                String str2 = new String(jg9.p(file));
                if (trq.e(str2)) {
                    RSoLog.d("SwitchUtils.readContent(" + str + ") = exist");
                }
                return str2;
            }
            return null;
        } catch (Throwable th) {
            RSoLog.c("readContent", th);
            return null;
        }
    }

    public static Properties c(String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("842ff527", new Object[]{str});
        }
        Properties properties = new Properties();
        try {
            file = new File("/data/local/tmp/swallows", str);
        } catch (Throwable th) {
            RSoLog.c("readKV", th);
        }
        if (file.isFile() && file.length() >= 1) {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            fileInputStream.close();
            return properties;
        }
        return properties;
    }
}
