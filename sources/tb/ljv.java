package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.update.datasource.local.UpdateInfo;
import com.taobao.update.framework.UpdateRuntime;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ljv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String sCurrentProcessName;
    public static String TAG = "UpdateUtils";
    public static int SilentDownloadSpaceSize = 200;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(950009907);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            if (Pattern.matches("cpu[0-9]", file.getName())) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(950009906);
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56709450", new Object[]{connectivityManager})).booleanValue();
        }
        try {
            return connectivityManager.isActiveNetworkMetered();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getApkPath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f7bea8a", new Object[]{context});
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppNameString(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cead3801", new Object[]{new Integer(i), str}) : kjv.sContext.getString(i).replaceAll("\\{app_name\\}", str);
    }

    public static String getFreeSizeRange(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0fd989d", new Object[]{new Long(j)});
        }
        if (j < 50) {
            return ">50M";
        }
        if (j < 100) {
            return "50M<n<100M";
        }
        if (j < 200) {
            return "100M<n<200M";
        }
        if (j < 500) {
            return "200M<n<500M";
        }
        return ">500M";
    }

    public static boolean getInnerUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35104b96", new Object[0])).booleanValue();
        }
        try {
            return kjv.getInstance().getApplication().getSharedPreferences(gjv.INNER_USER_CONFIG, 0).getBoolean(mk7.IS_INNER_USER, false);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static long getLastPopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc8d6b8d", new Object[0])).longValue();
        }
        try {
            return kjv.getInstance().getApplication().getSharedPreferences(gjv.LAST_POP_TIME_CONFIG, 0).getLong("last_pop_time", 0L);
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static int getNetworkType() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[0])).intValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) kjv.sContext.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 9) {
                return 2;
            }
            if (activeNetworkInfo.getType() != 1) {
                return 3;
            }
            if (a(connectivityManager)) {
                return 1;
            }
            return 2;
        } catch (Throwable unused) {
            return 2;
        }
    }

    public static int getNumCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            int length = listFiles.length;
            return listFiles.length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!TextUtils.isEmpty(sCurrentProcessName)) {
            return sCurrentProcessName;
        }
        int myPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str = runningAppProcessInfo.processName;
                    sCurrentProcessName = str;
                    return str;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getStorePath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1516638f", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static long getUsableSpace(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e035156a", new Object[]{file})).longValue();
        }
        if (file == null) {
            return -1L;
        }
        return (file.getUsableSpace() / 1024) / 1024;
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        Application application = kjv.sContext;
        if (application != null) {
            try {
                return application.getPackageManager().getPackageInfo(kjv.sContext.getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.printStackTrace();
                return "1.0.0";
            }
        } else {
            throw new RuntimeException("application is null");
        }
    }

    public static boolean greaterThen(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5202056", new Object[]{str, str2})).booleanValue();
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

    public static boolean hasEnoughSpace(Context context, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("637d2b43", new Object[]{context, new Long(j)})).booleanValue() : hasEnoughSpace(getStorePath(context), j);
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isProguard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed4baed", new Object[0])).booleanValue();
        }
        try {
            IpChange ipChange2 = UpdateRuntime.$ipChange;
            return false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void killChildProcesses(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac96b4e2", new Object[]{context});
            return;
        }
        try {
            long j = context.getApplicationInfo().uid;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                if (runningAppProcessInfo.uid == j && !runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean shouldSilentDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5824c51b", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable unused) {
        }
        if (getUsableSpace(Environment.getDataDirectory()) > SilentDownloadSpaceSize) {
            return true;
        }
        return false;
    }

    public static final <T> T toJavaObject(JSON json, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("36b5e941", new Object[]{json, cls});
        }
        try {
            return (T) JSON.toJavaObject(json, cls);
        } catch (Throwable unused) {
            try {
                return (T) JSON.parseObject(json.toJSONString(), cls);
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    public static UpdateInfo convert2UpdateInfo(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("b1101ddc", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        UpdateInfo updateInfo = new UpdateInfo();
        updateInfo.appVersion = nkv.getVersionName();
        for (String str2 : jSONObject.keySet()) {
            Object obj = jSONObject.get(str2);
            if (obj != null && (obj instanceof JSONObject)) {
                Log.e("UpdateSDK", "use old mtop update convert");
                UpdateInfo.UpdateData updateData = new UpdateInfo.UpdateData();
                updateData.name = str2;
                updateData.value = (JSONObject) obj;
                updateData.valid = true;
                updateData.from = str;
                updateInfo.updateList.put(str2, updateData);
            }
        }
        return updateInfo;
    }

    public static String getAppNameString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2dac894b", new Object[]{new Integer(i)}) : kjv.sContext.getString(i);
    }

    public static boolean hasEnoughSpace(String str, long j) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db6d145b", new Object[]{str, new Long(j)})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            statFs = new StatFs(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            statFs = null;
        }
        return (statFs != null ? ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) : 0L) >= j + 2097152;
    }

    public static boolean isNotificationPermissioned() {
        boolean areNotificationsEnabled;
        Application application = kjv.sContext;
        try {
            NotificationManager notificationManager = (NotificationManager) application.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (Build.VERSION.SDK_INT >= 24) {
                areNotificationsEnabled = notificationManager.areNotificationsEnabled();
                return areNotificationsEnabled;
            }
            Object systemService = application.getSystemService("appops");
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            String packageName = application.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Class<?> cls = systemService.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) systemService.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(null);
            num.intValue();
            return ((Integer) method.invoke(systemService, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public static UpdateInfo convert2EmasUpdateInfo(JSONObject jSONObject, String str) {
        Exception e;
        JSONObject jSONObject2 = jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("40bf3722", new Object[]{jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return null;
        }
        UpdateInfo updateInfo = new UpdateInfo();
        updateInfo.appVersion = nkv.getVersionName();
        String string = jSONObject2.containsKey("biz") ? jSONObject2.getString("biz") : null;
        if (string == null) {
            return null;
        }
        long j = 0;
        long longValue = jSONObject2.containsKey(upx.PRODUCT_ID) ? jSONObject2.getLongValue(upx.PRODUCT_ID) : 0L;
        long longValue2 = jSONObject2.containsKey("applicationId") ? jSONObject2.getLongValue("applicationId") : 0L;
        if (jSONObject2.containsKey("batchId")) {
            j = jSONObject2.getLongValue("batchId");
        }
        for (String str2 : jSONObject.keySet()) {
            try {
                Object obj = jSONObject2.get(str2);
                if (obj != null && (obj instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    jSONObject3.put(upx.PRODUCT_ID, (Object) Long.valueOf(longValue));
                    jSONObject3.put("applicationId", (Object) Long.valueOf(longValue2));
                    jSONObject3.put("batchId", (Object) Long.valueOf(j));
                    UpdateInfo.UpdateData updateData = new UpdateInfo.UpdateData();
                    updateData.name = string;
                    updateData.value = jSONObject3;
                    try {
                        updateData.valid = true;
                        updateData.from = str;
                        updateInfo.updateList.put(string, updateData);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        jSONObject2 = jSONObject;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
            jSONObject2 = jSONObject;
        }
        return updateInfo;
    }
}
