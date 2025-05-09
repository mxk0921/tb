package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f22183a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ npk f22184a;

        public a(npk npkVar) {
            this.f22184a = npkVar;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            npk npkVar = this.f22184a;
            if (npkVar != null) {
                npkVar.onEvent(i);
            }
        }
    }

    static {
        t2o.a(1030750346);
        "0123456789ABCDEF".toCharArray();
    }

    public static void b(Context context) {
        try {
            Object systemService = context.getSystemService("statusbar");
            systemService.getClass().getMethod("collapsePanels", new Class[0]).invoke(systemService, new Object[0]);
        } catch (Throwable th) {
            irg.b("link_tag", "LinkUtils === collapseStatusBar === 关闭通知栏异常：" + th);
        }
    }

    public static int c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 == 0) {
            for (int i3 = i; i3 < split.length; i3++) {
                if (Integer.parseInt(split[i3]) > 0) {
                    return 1;
                }
            }
            while (i < split2.length) {
                if (Integer.parseInt(split2[i]) > 0) {
                    return -1;
                }
                i++;
            }
            return 0;
        } else if (i2 > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static ApplicationInfo d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplicationInfo) ipChange.ipc$dispatch("34a50f40", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
            } catch (Exception unused) {
                return null;
            }
        }
        return context.getPackageManager().getApplicationInfo(str, 0);
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca2b0ee2", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        return context.getPackageManager().getNameForUid(Binder.getCallingUid());
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    public static String g(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ebf7644", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static List<String> h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2d1997c4", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || queryIntentActivities.size() == 0)) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        return arrayList;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return g(instance);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int j(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        return Login.getUserId();
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        return UTDevice.getUtdid(context);
    }

    public static boolean m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fac223c", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str) || d(context, str) == null) {
            return false;
        }
        return true;
    }

    public static boolean n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36cb6bdf", new Object[]{new Long(j)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f22183a < j) {
            return true;
        }
        f22183a = currentTimeMillis;
        return false;
    }

    public static boolean p(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5665ba8a", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (f() - j < j2) {
            return true;
        }
        return false;
    }

    public static Map<String, Object> s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f6cb709a", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    hashMap.put(next, s((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    hashMap.put(next, x((JSONArray) opt));
                } else {
                    hashMap.put(next, opt);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c617b214", new Object[]{context});
        } else if (context != null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.putExtra("jump_source", "assistant");
            intent.addFlags(270532608);
            context.startActivity(intent);
        }
    }

    public static void u(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258ea3dc", new Object[]{context, str, str2, str3, str4});
        } else if (context != null && !TextUtils.isEmpty(str3)) {
            Uri parse = Uri.parse(str3);
            Intent intent = new Intent();
            intent.setFlags(268468224);
            intent.setData(parse);
            if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("AliAgooMsgID", str4);
            }
            if (TextUtils.equals("true", str)) {
                intent.setPackage("com.taobao.taobao");
                intent.putExtra("source", str2);
                intent.putExtra("messageId", str4);
                intent.putExtra("afcDeskTopMessage", "true");
            }
            context.startActivity(intent);
            irg.a("link_tag", "LinkUtils === jumpInLink === 跳转打开：" + intent);
        }
    }

    public static void v(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fe0e8c", new Object[]{context, str, str2, str3, str4});
            return;
        }
        try {
            u(context, aqg.g(context, "afc_message_open", "true"), str3, str, str4);
        } catch (Exception e) {
            irg.b("link_tag", "LinkUtils === jumpPage === 跳转异常：" + e);
        }
    }

    public static void w(Context context, npk npkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7b24f5", new Object[]{context, npkVar});
        } else {
            c21.c(new a(npkVar));
        }
    }

    public static List<Object> x(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bee424ad", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        if (arrayList.size() == 0) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(s((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(x((JSONArray) obj));
            } else {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b36c986c", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public static boolean o(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db1a89c", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
            List<String> h = h(context);
            componentName = runningTasks.get(0).topActivity;
            return h.contains(componentName.getPackageName());
        } catch (Throwable th) {
            irg.a("link_tag", "LinkUtils === isHome === 判断异常" + th);
            return false;
        }
    }

    public static boolean r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316efd1b", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                ArrayList arrayList = (ArrayList) ((ActivityManager) context.getSystemService("activity")).getRunningServices(1000);
                if (!(arrayList == null || arrayList.size() == 0)) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (((ActivityManager.RunningServiceInfo) arrayList.get(i)).service.getClassName().equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                irg.a("link_tag", "AssistantUtils === isServiceRunning === 判断服务是否开启异常：" + th);
            }
        }
        return false;
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
                irg.a("link_tag", "LinkUtils === checkFloatPermission === 小于23版本，返回 = " + declaredField2.getInt(cls2));
                return intValue == declaredField2.getInt(cls2);
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
                irg.a("link_tag", "LinkUtils === checkFloatPermission === 大于26版本，返回" + z);
                return z;
            } else {
                canDrawOverlays = Settings.canDrawOverlays(context);
                irg.a("link_tag", "LinkUtils === checkFloatPermission === 大于23  小于26版本，返回" + canDrawOverlays);
                return canDrawOverlays;
            }
        } catch (Throwable th) {
            TLog.loge("linkManagerCommon", "assistant", "异常=" + th);
            return false;
        }
    }
}
