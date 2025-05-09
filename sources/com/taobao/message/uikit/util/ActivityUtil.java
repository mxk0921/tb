package com.taobao.message.uikit.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ActivityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "ActivityUtil";

    static {
        t2o.a(529531090);
    }

    public static int getActivityNumInCurTask(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f61635", new Object[]{context})).intValue();
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
        if (runningTasks == null || runningTasks.size() <= 0) {
            return 0;
        }
        i = runningTasks.get(0).numActivities;
        return i;
    }

    private static List<ActivityManager.RunningTaskInfo> getRunningTasks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15d7c30b", new Object[]{context});
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getRunningTasks(1);
        }
        return null;
    }

    public static boolean onlyOneActivity(Context context, String str) {
        int i;
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d990546", new Object[]{context, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
            if (runningTasks != null && runningTasks.size() > 0) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                i = runningTaskInfo.numActivities;
                if (i == 1) {
                    componentName = runningTaskInfo.topActivity;
                    if (str.equals(componentName.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        return false;
    }

    public static boolean onlyOneActivity(Context context) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e696497c", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
            if (runningTasks != null && runningTasks.size() > 0) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                StringBuilder sb = new StringBuilder("ActivityUtil:onlyOneActivity:");
                i = runningTaskInfo.numActivities;
                sb.append(i);
                TLog.loge(sb.toString(), new String[0]);
                i2 = runningTaskInfo.numActivities;
                if (i2 == 1) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        return false;
    }
}
