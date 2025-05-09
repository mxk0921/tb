package tb;

import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (Globals.getApplication() != null) {
            try {
                return Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "1.0.0";
            }
        } else {
            throw new RuntimeException("application is null");
        }
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a78b4bda", new Object[]{str, str2})).booleanValue();
        }
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i = 0; i < split.length; i++) {
                if (i >= split2.length) {
                    return true;
                }
                if (!split[i].equals(split2[i])) {
                    if (Integer.valueOf(split[i]).intValue() > Integer.valueOf(split2[i]).intValue()) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634339df", new Object[]{str})).booleanValue();
        }
        String a2 = a();
        if (str.endsWith(f7l.PLUS)) {
            String substring = str.substring(0, str.length() - 1);
            if (substring.equals(a2)) {
                return true;
            }
            return b(a2, substring);
        } else if (!str.endsWith("-")) {
            return str.equals(a2);
        } else {
            String substring2 = str.substring(0, str.length() - 1);
            if (substring2.equals(a2)) {
                return true;
            }
            return b(substring2, a2);
        }
    }
}
