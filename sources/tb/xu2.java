package tb;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159048);
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            ggh.d("CalenderHuaweiManager.getRoValue error：" + e.getMessage());
            return "";
        }
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce78d104", new Object[]{context, str});
        }
        String str2 = "";
        try {
            str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            ggh.d("CalenderHuaweiManager.isFixCalendarVersion versionName：" + str2);
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            ggh.d("CalenderHuaweiManager.isFixCalendarVersion error：" + e.getMessage());
            return str2;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a95662a4", new Object[0])).booleanValue();
        }
        String a2 = a("hw_sc.build.platform.version");
        ggh.d("CalenderHuaweiManager.isHuaWeiHmOS3：" + a2);
        if (TextUtils.isEmpty(a2) || a2.compareTo("3.0.0") < 0) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44a03800", new Object[]{context})).booleanValue();
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return false;
            }
            if (contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar") != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ggh.d("CalenderHuaweiManager.isSupport：" + th);
            return false;
        }
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9941c7b", new Object[]{context})).booleanValue();
        }
        if (!d() || c(context, "com.huawei.calendar").compareTo("13.0.11.340") < 0) {
            return false;
        }
        return true;
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2d45037", new Object[]{context});
        }
        if (!q8l.c()) {
            return "error: huawei calender service orange disable";
        }
        if (!e(context) || !b(context)) {
            return "error: not support huawei calender service";
        }
        if (!f(context)) {
            return "error: not fix huawei calender dp link";
        }
        ggh.d("CalenderHuaweiManager serviceEnable true");
        return "";
    }

    public static boolean b(Context context) {
        ContentProviderClient acquireUnstableContentProviderClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f62686", new Object[]{context})).booleanValue();
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null || (acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar")) == null) {
            return false;
        }
        try {
            String string = acquireUnstableContentProviderClient.call("query_version", null, null).getString("version");
            ggh.d("CalenderHuaweiManager.getSupportVersion：" + string);
            return Float.parseFloat(string) >= 2.0f;
        } catch (BadParcelableException | RemoteException e) {
            ggh.d("CalenderHuaweiManager.getSupportVersion.error." + e.getMessage());
            return false;
        }
    }
}
