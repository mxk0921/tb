package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class phr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093364);
    }

    public static boolean a(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a2b27a6", new Object[]{cbaVar})).booleanValue();
        }
        if (cbaVar == null) {
            return true;
        }
        return !cbaVar.L();
    }

    public static String b(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa45bf6d", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.get(0) == null)) {
                    componentName = runningTasks.get(0).topActivity;
                    if (componentName != null) {
                        componentName2 = runningTasks.get(0).topActivity;
                        return String.valueOf(componentName2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
