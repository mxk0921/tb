package anet.channel.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.ProcessStatistic;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.lang.reflect.Method;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HARMONY_OS = "harmony";
    private static final String TAG = "awcn.Utils";
    private static String harmonyVersion;
    public static Context context = null;
    private static Boolean isHarmony = null;

    static {
        t2o.a(607125961);
    }

    public static String getAbStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bafc428f", new Object[0]);
        }
        return "";
    }

    public static Context getAppContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        synchronized (Utils.class) {
            Context context3 = context;
            if (context3 != null) {
                return context3;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                context = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                ALog.w(TAG, "getAppContext", null, e, new Object[0]);
            }
            return context;
        }
    }

    public static String getDeviceId(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad7270e6", new Object[]{context2});
        }
        return UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78984e4a", new Object[]{context2});
        }
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static float getNetworkTimeFactor() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c26a10b", new Object[0])).floatValue();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == NetworkStatusHelper.NetworkStatus.G4 || status == NetworkStatusHelper.NetworkStatus.G5 || status == NetworkStatusHelper.NetworkStatus.WIFI) {
            f = 0.8f;
        } else {
            f = 1.0f;
        }
        if (BandWidthSampler.getInstance().getNetworkSpeed() == NetworkSpeed.Fast.getCode()) {
            return f * 0.75f;
        }
        return f;
    }

    public static Object invokeStaticFieldThrowException(String str, String str2) throws Exception {
        if (str == null || str2 == null) {
            return null;
        }
        return Class.forName(str).getDeclaredField(str2).get(null);
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        Method method;
        if (str == null || str2 == null) {
            return null;
        }
        Class<?> cls = Class.forName(str);
        if (clsArr != null) {
            method = cls.getDeclaredMethod(str2, clsArr);
        } else {
            method = cls.getDeclaredMethod(str2, new Class[0]);
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        if (objArr != null) {
            return method.invoke(cls, objArr);
        }
        return method.invoke(cls, new Object[0]);
    }

    public static boolean isHarmonyOS() {
        Boolean bool = isHarmony;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            z = HARMONY_OS.equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
        }
        Boolean bool2 = new Boolean(z);
        isHarmony = bool2;
        return bool2.booleanValue();
    }

    public static String getHarmonyVersion() {
        String str;
        String str2 = harmonyVersion;
        if (str2 != null) {
            return str2;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "hw_sc.build.platform.version");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        harmonyVersion = str;
        return str;
    }

    private static String getProcessName(Context context2, int i, ProcessStatistic processStatistic, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5df62d7e", new Object[]{context2, new Integer(i), processStatistic, new Long(j)});
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            } else {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_GET_PROCESS_NULL, ErrorConstant.formatMsg(ErrorConstant.ERROR_GET_PROCESS_NULL, "BuildVersion=" + String.valueOf(Build.VERSION.SDK_INT)), "rt"));
            }
        } catch (Exception e) {
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_GET_PROCESS_NULL, e.toString(), "rt"));
        }
        str = "";
        if (TextUtils.isEmpty(str)) {
            str = getProcessNameNew(i);
        }
        if (processStatistic != null) {
            processStatistic.costTime = System.currentTimeMillis() - j;
            if (str != null && !str.isEmpty() && !"".equals(str)) {
                processStatistic.ret = 1;
            }
            AppMonitor.getInstance().commitStat(processStatistic);
            ALog.e(TAG, "ProcessStatistic =" + processStatistic.toString(), null, new Object[0]);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r11 = r5[8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
        r8.close();
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
        anet.channel.util.ALog.e(anet.channel.util.Utils.TAG, "getProcessNameNew ", null, r1, new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getProcessNameNew(int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessNameNew(int):java.lang.String");
    }

    public static String getProcessNameNormal(Context context2) {
        String str;
        ProcessStatistic processStatistic = new ProcessStatistic();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (AwcnConfig.isProcessNameUpdateEnable()) {
                processStatistic.isProcessNameUpdateEnable = true;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = Application.getProcessName();
                } else {
                    str = "";
                }
                if (str == null || str.isEmpty() || "".equals(str)) {
                    Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentProcessName", new Class[0]);
                    declaredMethod.setAccessible(true);
                    String str2 = (String) declaredMethod.invoke(null, new Object[0]);
                    if (str2 == null || str2.isEmpty() || "".equals(str2)) {
                        processStatistic.newRet = 0;
                    } else {
                        processStatistic.costTime = System.currentTimeMillis() - currentTimeMillis;
                        processStatistic.ret = 1;
                        processStatistic.newRet = 1;
                        AppMonitor.getInstance().commitStat(processStatistic);
                        ALog.e(TAG, "ProcessStatistic =" + processStatistic.toString(), null, new Object[0]);
                        return str2;
                    }
                } else {
                    processStatistic.costTime = System.currentTimeMillis() - currentTimeMillis;
                    processStatistic.ret = 1;
                    processStatistic.newRet = 1;
                    AppMonitor.getInstance().commitStat(processStatistic);
                    ALog.e(TAG, "ProcessStatistic =" + processStatistic.toString(), null, new Object[0]);
                    return str;
                }
            } else {
                processStatistic.isProcessNameUpdateEnable = false;
            }
            return getProcessName(context2, Process.myPid(), processStatistic, currentTimeMillis);
        } catch (Throwable th) {
            ALog.e(TAG, "getProcessNameNormal ", null, "e", th);
            return getProcessName(context2, Process.myPid(), processStatistic, currentTimeMillis);
        }
    }
}
