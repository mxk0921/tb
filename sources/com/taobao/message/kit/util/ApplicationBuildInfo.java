package com.taobao.message.kit.util;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ApplicationBuildInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static PackageInfo packageInfo;
    public static String sAppName;
    public static int sVersionCode;
    public static String sVersionName;
    private static String currentProcessName = "";
    private static int sDebug = -1;

    static {
        t2o.a(529530973);
    }

    private ApplicationBuildInfo() {
    }

    private static int debug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f41cb94d", new Object[0])).intValue();
        }
        int i = sDebug;
        if (i > -1) {
            return i;
        }
        if (ApplicationUtil.getApplication() == null) {
            return 0;
        }
        sDebug = 0;
        try {
            if ((ApplicationUtil.getApplication().getPackageManager().getPackageInfo(ApplicationUtil.getApplication().getPackageName(), 0).applicationInfo.flags & 2) == 2) {
                sDebug = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sDebug;
    }

    public static final String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[0]);
        }
        if (!TextUtils.isEmpty(sAppName)) {
            return sAppName;
        }
        String str = "AppName";
        try {
            ApplicationInfo applicationInfo = ApplicationUtil.getApplication().getPackageManager().getApplicationInfo(ApplicationUtil.getApplication().getPackageName(), 128);
            if (applicationInfo == null) {
                return str;
            }
            str = ApplicationUtil.getApplication().getPackageManager().getApplicationLabel(applicationInfo).toString();
            sAppName = str;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static final String getAppVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[0]);
        }
        if (!TextUtils.isEmpty(sVersionName)) {
            return sVersionName;
        }
        String str = getPackageInfo().versionName;
        sVersionName = str;
        if (str == null || str.length() <= 0) {
            return "";
        }
        return sVersionName;
    }

    public static String getCurProcessName() {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e7e4c9", new Object[0]);
        }
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        int myPid = Process.myPid();
        if (ApplicationUtil.getApplication() == null) {
            activityManager = null;
        } else {
            activityManager = (ActivityManager) ApplicationUtil.getApplication().getSystemService("activity");
        }
        if (activityManager == null) {
            return getProcessNameFromProc();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            return getProcessNameFromProc();
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                currentProcessName = next.processName;
                break;
            }
        }
        return currentProcessName;
    }

    public static String getDeviceBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e94cc43e", new Object[0]);
        }
        return Build.BRAND;
    }

    private static PackageInfo getPackageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[0]);
        }
        PackageInfo packageInfo2 = packageInfo;
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        try {
            packageInfo = ApplicationUtil.getApplication().getPackageManager().getPackageInfo(ApplicationUtil.getApplication().getPackageName(), 0);
        } catch (Exception e) {
            TLog.loge("VersionInfo", TLogTracker.SCENE_EXCEPTION, e);
            packageInfo = new PackageInfo();
        }
        return packageInfo;
    }

    private static String getProcessNameFromProc() {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a915eed5", new Object[0]);
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader2.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                String sb2 = sb.toString();
                try {
                    bufferedReader2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return sb2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    th.printStackTrace();
                    if (bufferedReader == null) {
                        return "";
                    }
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return "";
                    }
                } catch (Throwable th3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String getSystemModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1d5475", new Object[0]);
        }
        return Build.MODEL;
    }

    public static String getSystemVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2d238e6", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static final int getVersionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[0])).intValue();
        }
        int i = sVersionCode;
        if (i > 0) {
            return i;
        }
        int i2 = getPackageInfo().versionCode;
        sVersionCode = i2;
        return i2;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (debug() == 1) {
            return true;
        }
        return false;
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        String curProcessName = getCurProcessName();
        if (TextUtils.isEmpty(curProcessName) || !curProcessName.contains(":")) {
            return true;
        }
        return false;
    }
}
