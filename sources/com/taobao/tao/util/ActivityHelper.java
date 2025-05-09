package com.taobao.tao.util;

import android.app.ActivityManager;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946410);
    }

    public static void kill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdee0e5", new Object[0]);
            return;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) Globals.getApplication().getSystemService("activity")).getRunningAppProcesses();
            String packageName = Globals.getApplication().getPackageName();
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                String str = runningAppProcessInfo.processName;
                if (!str.equalsIgnoreCase(packageName + ":channel")) {
                    String str2 = runningAppProcessInfo.processName;
                    if (!str2.equalsIgnoreCase(packageName + ":utremote")) {
                        String str3 = runningAppProcessInfo.processName;
                        if (!str3.equalsIgnoreCase(packageName + ":qupai_media")) {
                            String str4 = runningAppProcessInfo.processName;
                            if (!str4.equalsIgnoreCase(packageName + ":widgetProvider")) {
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("kill RunningAppProcessInfo:");
                sb.append(runningAppProcessInfo.processName);
                Process.killProcess(runningAppProcessInfo.pid);
            }
        } catch (Exception unused) {
        }
    }
}
