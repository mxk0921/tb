package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f25090a = null;
    public static boolean b = false;
    public static boolean c = false;

    static {
        t2o.a(962593010);
    }

    public static String a() {
        try {
            Field declaredField = Build.class.getDeclaredField("YUNOS_BUILD_VERSION");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (String) declaredField.get(new String());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8312b388", new Object[0]);
        }
        String a2 = m3r.a("ro.aliyun.clouduuid");
        if (hsq.f(a2)) {
            a2 = m3r.a("ro.sys.aliyun.clouduuid");
        }
        return hsq.f(a2) ? d() : a2;
    }

    public static String d() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c22bc", new Object[]{context})).booleanValue();
        }
        if (c) {
            return b;
        }
        if (context == null) {
            return false;
        }
        if (f(context) || g(context)) {
            z = true;
        }
        b = z;
        c = true;
        return z;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45fd76d9", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a12dbb86", new Object[0])).booleanValue();
        }
        if ((System.getProperty("java.vm.name") == null || !System.getProperty("java.vm.name").toLowerCase().contains("lemur")) && TextUtils.isEmpty(System.getProperty("ro.yunos.version")) && TextUtils.isEmpty(m3r.a("ro.yunos.build.version"))) {
            return i();
        }
        return true;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("341d08a8", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(m3r.a("ro.yunos.product.chip")) || !TextUtils.isEmpty(m3r.a("ro.yunos.hardware"));
    }

    public static synchronized void k(Context context) {
        synchronized (o1v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2c28d35", new Object[]{context});
            } else {
                j(context, f25090a);
            }
        }
    }

    public static synchronized Map<String, String> b(Context context) {
        synchronized (o1v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("9487013c", new Object[]{context});
            }
            Map<String, String> map = f25090a;
            if (map != null) {
                return map;
            }
            if (context == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            try {
                try {
                    hashMap.put(oeh.UTDID, UTDevice.getUtdid(context));
                } catch (Exception unused) {
                    Log.e("", "utdid4all jar doesn't exist");
                }
                hashMap.put("IMEI", w1m.a(context));
                hashMap.put("IMSI", w1m.c(context));
                hashMap.put(oeh.DEVICE_MODEL, Build.MODEL);
                hashMap.put(oeh.BRAND, Build.BRAND);
                hashMap.put(oeh.OSVERSION, Build.VERSION.RELEASE);
                hashMap.put(oeh.OS, "a");
                try {
                    hashMap.put(oeh.APPVERSION, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
                } catch (PackageManager.NameNotFoundException unused2) {
                    hashMap.put(oeh.APPVERSION, "Unknown");
                }
                if (h()) {
                    hashMap.put(oeh.OS, "y");
                    String c2 = c();
                    if (!hsq.f(c2)) {
                        hashMap.put(oeh.DEVICE_ID, c2);
                    }
                    String property = System.getProperty("ro.yunos.version");
                    if (!hsq.f(property)) {
                        hashMap.put(oeh.OSVERSION, property);
                    }
                    String a2 = a();
                    if (!hsq.f(a2)) {
                        hashMap.put(oeh.OSVERSION, a2);
                    }
                }
                if (i()) {
                    hashMap.put(oeh.OS, "a");
                }
                try {
                    Configuration configuration = new Configuration();
                    Settings.System.getConfiguration(context.getContentResolver(), configuration);
                    Locale locale = configuration.locale;
                    if (locale != null) {
                        hashMap.put(oeh.LANGUAGE, locale.toString());
                    } else {
                        hashMap.put(oeh.LANGUAGE, "Unknown");
                    }
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    if (i2 > i) {
                        hashMap.put(oeh.RESOLUTION, i2 + "*" + i);
                    } else {
                        hashMap.put(oeh.RESOLUTION, i + "*" + i2);
                    }
                } catch (Exception unused3) {
                    hashMap.put(oeh.RESOLUTION, "Unknown");
                }
                j(context, hashMap);
                f25090a = hashMap;
                return hashMap;
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fff41bd", new Object[]{context})).booleanValue();
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void j(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b059a445", new Object[]{context, map});
        } else if (context != null && map != null) {
            nhh.f("UTMCDevice", "updateDeviceNetworkStatus");
            try {
                String[] f = NetworkUtil.f(context);
                map.put(oeh.ACCESS, f[0]);
                if (f[0].equals(NetworkUtil.NETWORK_CLASS_2_3_G)) {
                    map.put(oeh.ACCESS_SUBTYPE, f[1]);
                } else if (f[1].equals("5G")) {
                    map.put(oeh.ACCESS_SUBTYPE, "5G");
                } else {
                    map.put(oeh.ACCESS_SUBTYPE, "Unknown");
                }
            } catch (Exception unused) {
                map.put(oeh.ACCESS, "Unknown");
                map.put(oeh.ACCESS_SUBTYPE, "Unknown");
            }
            map.put(oeh.CARRIER, ztj.c());
        }
    }
}
