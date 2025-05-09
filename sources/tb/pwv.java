package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.BatteryManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.adaemon.power.APower;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f26367a = pwv.class.getName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1017118858);
        }

        public static byte[] a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("17d0e411", new Object[]{bArr});
            }
            if (bArr != null && bArr.length > 0) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    instance.update(bArr);
                    return instance.digest();
                } catch (NoSuchAlgorithmException e) {
                    String a2 = pwv.a();
                    TaoLog.Logd(a2, "SHA-1 encode exception,info:" + e.toString());
                } catch (Exception e2) {
                    String a3 = pwv.a();
                    TaoLog.Logd(a3, "SHA-1 encode exception,info:" + e2.toString());
                }
            }
            return null;
        }
    }

    static {
        t2o.a(1017118857);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f26367a;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4af6bd9f", new Object[]{context})).intValue();
        }
        if (context == null) {
            return -1;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (!isEnabled || !isTouchExplorationEnabled) {
                return 0;
            }
            return 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            try {
                Class<?> cls = Class.forName("android.content.Context");
                Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                if (!(obj instanceof String)) {
                    return -1;
                }
                Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
                Class<?> cls2 = Class.forName("android.app.AppOpsManager");
                Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
                declaredField2.setAccessible(true);
                Class<?> cls3 = Integer.TYPE;
                if (((Integer) cls2.getMethod("checkOp", cls3, cls3, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == declaredField2.getInt(cls2)) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
                return -1;
            }
        } else if (i < 26) {
            return gzl.a(context) ? 1 : 0;
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (appOpsManager == null) {
                return -1;
            }
            int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
            if (gzl.a(context) || checkOpNoThrow == 0 || checkOpNoThrow == 1) {
                return 1;
            }
            return 0;
        }
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfa3ee62", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe673959", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2775ba", new Object[]{context})).intValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return new Long(memoryInfo.availMem / 1048576).intValue();
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a14e748", new Object[]{context})).intValue();
        }
        return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f7f9c32", new Object[0]);
        }
        return NetworkStatusHelper.getWifiBSSID();
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad7270e6", new Object[]{context});
        }
        return MunionDeviceUtil.getUtdid();
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21674313", new Object[0]);
        }
        return Build.MODEL;
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{context});
        }
        return "-1";
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cceff8", new Object[]{context});
        }
        return "-1";
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[0]);
        }
        String str = Build.MANUFACTURER;
        if (str == null || str.length() <= 32) {
            return str;
        }
        return str.substring(0, 32);
    }

    public static int o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == NetworkStatusHelper.NetworkStatus.WIFI) {
            return 1;
        }
        if (status == NetworkStatusHelper.NetworkStatus.NO || status == NetworkStatusHelper.NetworkStatus.NONE) {
            return -1;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G2) {
            return 2;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G3) {
            return 3;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G4) {
            return 4;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G5) {
            return 5;
        }
        return 0;
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33324938", new Object[0])).intValue();
        }
        return Build.VERSION.SDK_INT & 255;
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96bc41d9", new Object[]{context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.packageName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f26367a;
            TaoLog.Logd(str, "Get package name exception,info:" + e.toString());
            return null;
        }
    }

    public static double r(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36e4c8eb", new Object[]{new Double(d)})).doubleValue();
        }
        return new BigDecimal(Double.toString(d)).subtract(new BigDecimal(Integer.toString((int) d))).floatValue();
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82aefbc8", new Object[0]);
        }
        return NetworkStatusHelper.getWifiSSID();
    }

    public static int u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fae", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int v(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb5d221e", new Object[]{context})).intValue();
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
        if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null) {
            return -1;
        }
        return sensorList.size();
    }

    public static int w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13c9745", new Object[]{context})).intValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem / 1048576).intValue();
    }

    public static String x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2752b51", new Object[]{str});
        }
        if (str != null) {
            return str.replace("\r\n", "").replace("\r", "").replace("\n", "");
        }
        return null;
    }

    public static int t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d1fe198", new Object[]{context})).intValue();
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            String str = f26367a;
            TaoLog.Logd(str, "Get screen bright exception,info:" + e.toString());
            return 0;
        }
    }

    public static int n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f768ef55", new Object[]{context})).intValue();
        }
        try {
            int proxy_getNetworkType = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"));
            if (proxy_getNetworkType == 4) {
                return 0;
            }
            if (proxy_getNetworkType == 2) {
                return 1;
            }
            if (proxy_getNetworkType == 5) {
                return 2;
            }
            if (proxy_getNetworkType == 6) {
                return 3;
            }
            if (proxy_getNetworkType == 1) {
                return 4;
            }
            if (proxy_getNetworkType == 8) {
                return 5;
            }
            if (proxy_getNetworkType == 10) {
                return 6;
            }
            if (proxy_getNetworkType == 9) {
                return 7;
            }
            return proxy_getNetworkType == 3 ? 8 : 9;
        } catch (Exception unused) {
            return -1;
        }
    }
}
