package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.android.agoo.huawei.HuaWeiRegister;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f31309a = null;
    public static final String channelService = "com.taobao.accs.ChannelService";
    public static final String msgService = "com.taobao.accs.data.MsgDistributeService";
    public static Boolean b = null;
    public static Boolean c = null;
    public static Boolean d = null;

    static {
        t2o.a(343933227);
    }

    public static boolean a(Context context) {
        boolean canDrawOverlays;
        boolean canDrawOverlays2;
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        try {
            if (i < 23) {
                Class<?> cls = Class.forName("android.content.Context");
                Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                if (!(obj instanceof String)) {
                    return false;
                }
                Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
                Class<?> cls2 = Class.forName("android.app.AppOpsManager");
                Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
                declaredField2.setAccessible(true);
                Class<?> cls3 = Integer.TYPE;
                int intValue = ((Integer) cls2.getMethod("checkOp", cls3, cls3, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
                ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 小于23版本，返回 = " + declaredField2.getInt(cls2), new Object[0]);
                if (intValue == declaredField2.getInt(cls2)) {
                    return true;
                }
                return false;
            } else if (i >= 26) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                if (appOpsManager == null) {
                    return false;
                }
                int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
                canDrawOverlays2 = Settings.canDrawOverlays(context);
                if (!canDrawOverlays2 && checkOpNoThrow != 0) {
                    z = false;
                }
                ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 大于26版本，返回" + z, new Object[0]);
                return z;
            } else {
                canDrawOverlays = Settings.canDrawOverlays(context);
                ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 大于23  小于26版本，返回" + canDrawOverlays, new Object[0]);
                return canDrawOverlays;
            }
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", sz4.CHECK_FLOAT_PERMISSION, th, new Object[0]);
            return false;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad7270e6", new Object[]{context});
        }
        return UTDevice.getUtdid(context);
    }

    public static String d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38cdb21", new Object[]{th});
        }
        return e(th.getStackTrace());
    }

    public static String e(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("230a88e9", new Object[]{stackTraceElementArr});
        }
        return cp.c(stackTraceElementArr);
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2deb6633", new Object[0])).longValue();
        }
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1L;
            }
            return dataDirectory.getUsableSpace();
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "getUsableSpace", th, new Object[0]);
            return -1L;
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context})).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean equals = UtilityImpl.getChannelProcessName(context).equals(h5d.f());
        d = Boolean.valueOf(equals);
        return equals;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean equals = context.getPackageName().equals(h5d.f());
        c = Boolean.valueOf(equals);
        return equals;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b91949c7", new Object[]{context, str})).booleanValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = GlobalClientInfo.getInstance(context).getActivityManager().getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            ALog.e("AdapterUtilityImpl", "isProcessAlive error ", e, new Object[0]);
            return false;
        }
    }

    public static boolean l(Context context) {
        try {
            Method declaredMethod = HuaWeiRegister.class.getDeclaredMethod(txq.IS_SUPPORT_KEY, Context.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, context)).booleanValue();
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "isSupportHMS err", th, new Object[0]);
            return false;
        }
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7729ed2d", new Object[]{context})).booleanValue();
        }
        if (b == null) {
            try {
                b = Boolean.valueOf("com.taobao.taobao".equals(context.getPackageName()));
                ALog.e("AdapterUtilityImpl", "isTaobao=" + b, new Object[0]);
            } catch (Exception e) {
                ALog.e("AdapterUtilityImpl", "isTaobao err", e, new Object[0]);
                return true;
            }
        }
        return b.booleanValue();
    }

    public static final boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94c4444", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        StatFs statFs = new StatFs(str);
        int blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        StringBuilder sb = new StringBuilder("st.getAvailableBlocks()=");
        sb.append(statFs.getAvailableBlocks());
        sb.append(",st.getAvailableBlocks() * blockSize=");
        long j = blockSize;
        sb.append(statFs.getAvailableBlocks() * j);
        return statFs.getAvailableBlocks() > 10 && availableBlocks * j > ((long) i);
    }

    public static String j(Context context) {
        boolean areNotificationsEnabled;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
                return String.valueOf(areNotificationsEnabled);
            } catch (Throwable th) {
                ALog.e("AdapterUtilityImpl", "Android above 7.0 isNotificationEnabled", th, new Object[0]);
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager);
                num.intValue();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() != 0) {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Throwable th2) {
                ALog.e("AdapterUtilityImpl", "isNotificationEnabled", th2, new Object[0]);
            }
        }
        return "unknown";
    }
}
