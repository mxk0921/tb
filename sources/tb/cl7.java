package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514150);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ef4ae2a", new Object[0]);
        }
        return c("hw_sc.build.platform.version");
    }

    public static <T> T b(Map<String, ?> map, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("359c4b59", new Object[]{map, str, t});
        }
        try {
            T t2 = (T) map.get(str);
            if (t2 != null) {
                return t2;
            }
            return t;
        } catch (Exception e) {
            idh.c("DiagnoseUtils", "getMapValue", e);
            return t;
        }
    }

    public static String c(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "default");
        } catch (Exception e) {
            idh.c("DiagnoseUtils", "getSystemParameters", e);
            return "";
        }
    }

    public static boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96def6e3", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea8c0752", new Object[]{str})).booleanValue();
        }
        return Build.BRAND.equalsIgnoreCase(str);
    }

    public static boolean f() {
        if (!e(SystemUtils.PRODUCT_HUAWEI) && !e(SystemUtils.PRODUCT_HONOR)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable th) {
            idh.c("DiagnoseUtils", "isHarmony", th);
            return false;
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4728fa3", new Object[]{context})).booleanValue();
        }
        return d(context, "com.alibaba.android.security.activity");
    }

    public static String h(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856bcd30", new Object[]{file});
        }
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    fileInputStream.close();
                    return sb2;
                }
            }
        } catch (Exception e) {
            idh.c("DiagnoseUtils", "readFile", e);
            return null;
        }
    }

    public static String j(long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("733e0a9f", new Object[]{new Long(j)});
        }
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "KB";
        } else {
            str = "";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "MB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "GB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = RVEnvironmentService.PLATFORM_TB;
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "PB";
        }
        if (f < 1.0f) {
            str2 = String.format(Locale.ENGLISH, "%.2f", Float.valueOf(f));
        } else if (f < 10.0f) {
            str2 = String.format(Locale.ENGLISH, "%.1f", Float.valueOf(f));
        } else if (f < 100.0f) {
            str2 = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f));
        } else {
            str2 = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f));
        }
        return str2.concat(str);
    }

    public static boolean i(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a29825", new Object[]{file, str})).booleanValue();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            try {
                channel.write(Charset.forName("utf8").encode(str));
                channel.close();
                fileOutputStream.close();
                return true;
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        } catch (Exception e) {
            idh.c("DiagnoseUtils", "saveFile", e);
            return false;
        }
    }
}
