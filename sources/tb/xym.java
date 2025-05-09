package tb;

import android.app.ActivityManager;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("333a0620", new Object[0])).longValue();
        }
        File file = new File("/proc/" + Process.myPid() + "/comm");
        if (file.exists()) {
            return file.lastModified();
        }
        return -1L;
    }

    public static boolean b() {
        String str;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b878ef89", new Object[0])).booleanValue();
        }
        try {
            str = w9a.g().a().getPackageName() + ":channel";
            activityManager = (ActivityManager) w9a.g().a().getSystemService("activity");
        } catch (Throwable th) {
            zq6.a("ProcessUtils", th);
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }
}
