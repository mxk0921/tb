package com.ta.audid.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppInfoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String currentProcessName = "";

    static {
        t2o.a(966787085);
    }

    public static String getAppPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cce9df25", new Object[]{context});
        }
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.packageName;
        }
        return "";
    }

    public static String getCurProcessName(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            currentProcessName = processName;
        } else {
            currentProcessName = getCurrentProcessNameByActivityThread();
        }
        return currentProcessName;
    }

    private static PackageInfo getPackageInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("7869064a", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e) {
            UtdidLogger.e("", e, new Object[0]);
            return null;
        }
    }

    public static boolean isMainProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = getCurProcessName(context);
        }
        String appPackageName = getAppPackageName(context);
        if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(appPackageName) || currentProcessName.equals(appPackageName)) {
            return true;
        }
        return false;
    }

    private static String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
