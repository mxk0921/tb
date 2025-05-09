package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.template.standard.WidgetTaoGuessReceiver;
import java.util.List;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256344);
    }

    public static int b(String str, String str2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int max = Math.max(split.length, split2.length);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < split.length) {
                i = Integer.parseInt(split[i3]);
            } else {
                i = 0;
            }
            if (i3 < split2.length) {
                i2 = Integer.parseInt(split2[i3]);
            } else {
                i2 = 0;
            }
            if (i > i2) {
                return 1;
            }
            if (i < i2) {
                return -1;
            }
        }
        return 0;
    }

    public static int c(Context context, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2e0474c", new Object[]{context, str})).intValue();
        }
        try {
            i = context.getApplicationContext().getPackageManager().getPackageInfo(str, 0).versionCode;
            hgh.b("getApkVersion" + str + " version = " + i);
            return i;
        } catch (PackageManager.NameNotFoundException e) {
            hgh.d("DeviceUtils getApkVersion error" + e.getMessage());
            return i;
        }
    }

    public static boolean d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47adb0ee", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData.getBoolean(str2, false);
            }
            return false;
        } catch (Exception e) {
            hgh.d("getBooleanFromMetaData error" + e.getMessage());
            return false;
        }
    }

    public static String e(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            hgh.d("DeviceUtils getPropertyString error" + e.getMessage());
            return str2;
        }
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef22f5c5", new Object[]{context})).intValue();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            hgh.d("DeviceUtils getVersionCode error" + e.getMessage());
            return 0;
        }
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            hgh.d("DeviceUtils getVersionName error" + e.getMessage());
            return "";
        }
    }

    public static boolean h(Context context) {
        boolean z = true;
        boolean z2 = false;
        try {
            String packageName = context.getApplicationContext().getPackageName();
            int i = context.getApplicationInfo().uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class).invoke((AppOpsManager) context.getSystemService("appops"), Integer.valueOf((int) cdw.T_BORDER_SELECTOR), Integer.valueOf(i), packageName);
            if (invoke instanceof Integer) {
                if (((Integer) invoke).intValue() != 0) {
                    z = false;
                }
                z2 = z;
            }
            hgh.d("hasShortcutPermissionMIUI isAllowed: " + z2);
        } catch (Exception e) {
            hgh.b("hasShortcutPermissionMIUI error: " + e.getMessage());
        }
        return z2;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e3f6920", new Object[0])).booleanValue();
        }
        boolean z = c21.g().getBoolean("isFullNewInstall", false);
        hgh.d("isFirstInstall：" + z);
        return z;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b46fbc9", new Object[0])).booleanValue();
        }
        String e = e("hw_sc.build.platform.version", "");
        hgh.b("isHmOS2Above osVersion: " + e);
        return !TextUtils.isEmpty(e) && e.compareTo("2.0.0") > 0;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86276fe8", new Object[0])).booleanValue();
        }
        StringBuilder sb = new StringBuilder("DeviceInfo brand: ");
        String str = Build.BRAND;
        sb.append(str);
        hgh.b(sb.toString());
        return "OPPO".equalsIgnoreCase(str);
    }

    public static boolean o(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bf1091d", new Object[]{context})).booleanValue();
        }
        try {
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception e) {
            hgh.d("getRunningAppProcesses error" + e.getMessage());
        }
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f36703c", new Object[0])).booleanValue();
        }
        return "vivo".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8735738d", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        return "xiaomi".equalsIgnoreCase(str) || TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE.equalsIgnoreCase(str);
    }

    public static void s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248cb860", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            context.startActivity(intent);
        } catch (Exception e) {
            hgh.d("startHome error" + e.getMessage());
        }
    }

    public static void t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6088571a", new Object[]{context, str});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("vivo://com.bbk.launcher2/origin?pkg=" + str));
            context.startActivity(intent);
        } catch (Exception e) {
            hgh.d("WidgetOpenJsBridge widgetVivoAdd error" + e.getMessage());
        }
    }

    public static void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ebd896", new Object[]{context});
        } else {
            t(context, "com.taobao.widgetvivo");
        }
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4457f8e6", new Object[]{context})).booleanValue();
        }
        return d(context, "com.bbk.launcher2", "vivo.widget.widgetListJump.support");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c23b0712", new Object[0])).booleanValue();
        }
        return "honor".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean k(Context context, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e03581db", new Object[]{context, str})).booleanValue();
        }
        try {
            Bundle call = context.getContentResolver().call(Uri.parse("content://com.miui.personalassistant.widget.external"), str, (String) null, (Bundle) null);
            if (call != null) {
                z = call.getBoolean(str);
            }
        } catch (Exception e) {
            hgh.d("isMiuiSupported error" + e.getMessage());
        }
        hgh.b(str + ":" + z);
        return z;
    }

    public static boolean u(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208bcfd1", new Object[]{context, str})).booleanValue();
        }
        try {
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                str2 = JSON.parseObject(str).getString("typeId");
            }
            return q(context, str2);
        } catch (Exception e) {
            hgh.d("WidgetOpenJsBridge widgetVivoAddSupport error：" + e.getMessage());
            return false;
        }
    }

    public static boolean a(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("610d672a", new Object[]{jSONArray, new Integer(i)})).booleanValue();
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int intValue = jSONObject.getInteger("start").intValue();
                int intValue2 = jSONObject.getInteger("end").intValue();
                if (i >= intValue && i < intValue2) {
                    hgh.d("isVivoSupport brand not support: " + i);
                    bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().w("widget_vivo_add").m(Integer.valueOf(i)));
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c206ae55", new Object[]{context})).booleanValue();
        }
        return r() && k(context, "isMiuiWidgetDetailPageSupported");
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6015a935", new Object[]{context})).booleanValue();
        }
        return r() && k(context, "isMiuiWidgetSupported") && l(context);
    }

    public static boolean q(Context context, String str) {
        JSONObject parseObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eefa640", new Object[]{context, str})).booleanValue();
        }
        try {
            if (!p()) {
                return false;
            }
            String B = b9l.B(context);
            if (TextUtils.isEmpty(B) || (parseObject = JSON.parseObject(B)) == null) {
                return false;
            }
            JSONObject jSONObject = parseObject.getJSONObject("os_version");
            String str2 = Build.VERSION.RELEASE;
            String string = jSONObject.getString("start");
            String string2 = jSONObject.getString("end");
            if (b(str2, string) < 0 || b(str2, string2) >= 0) {
                hgh.d("isVivoSupport os not support: " + str2);
                return false;
            }
            int c = c(context, "com.bbk.launcher2");
            String e = e("ro.product.device", "");
            hgh.d("isVivoSupport apkVersion: " + c + " device:" + e + "typeId: " + str);
            JSONArray jSONArray2 = parseObject.getJSONArray("typeId");
            if (jSONArray2 == null || !jSONArray2.contains(str)) {
                jSONArray = parseObject.getJSONArray("default_config");
            } else {
                jSONArray = parseObject.getJSONArray("white_config");
            }
            if (!a(jSONArray, c)) {
                return false;
            }
            return (TextUtils.equals(e, "PD2178") && c > 110500027) || c > 110000134;
        } catch (Throwable th) {
            hgh.d("isVivoSupport error" + th.getMessage());
            return false;
        }
    }

    public static boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64dab4c4", new Object[]{str})).booleanValue();
        }
        if (!x() || !TextUtils.equals(WidgetTaoGuessReceiver.class.getName(), str)) {
            return false;
        }
        hgh.d("isHonorComponent receiverName: " + str);
        return true;
    }
}
