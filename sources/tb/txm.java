package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.orange.OConstant;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class txm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48838554", new Object[]{context, map});
            return;
        }
        ProcedureGlobal.f().i(context);
        c(context, map);
        vxm vxmVar = vxm.b;
        xxi xxiVar = ProcedureGlobal.PROCEDURE_MANAGER;
        vxmVar.d(xxiVar);
        snl.f28161a.a(xxiVar);
        sxm.b.b(ProcedureGlobal.PROCEDURE_FACTORY);
    }

    public static void c(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea9b881", new Object[]{context, map});
            return;
        }
        oua.f25661a = context.getPackageName();
        oua.b = g(map.get(OConstant.LAUNCH_ONLINEAPPKEY), "12278902");
        oua.c = g(map.get(uj4.KEY_APP_BUILD), "");
        oua.d = e(map);
        oua.e = g(map.get("appPatch"), "");
        oua.f = g(map.get("channel"), "");
        oua.g = g(map.get("deviceId"), "");
        oua.h = Build.BRAND;
        oua.i = Build.MODEL;
        a();
        oua.o = f(map);
        oua.n = String.valueOf(System.currentTimeMillis());
        g(map.get("ttid"), "");
        oua.q = g(map.get("packageTag"), "");
        oua.p = g(map.get("speedFlag"), "normal");
        oua.l = g(map.get("userId"), null);
    }

    public static boolean d() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null || classLoader.getParent() != null) {
                return false;
            }
            return "harmony".equals(method.invoke(cls, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static String f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a73e558f", new Object[]{map});
        }
        Object obj = map.get("process");
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return yym.a();
    }

    public static String g(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd16055", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }

    public static String e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d760d26", new Object[]{map});
        }
        Object obj = map.get("appVersion");
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        Context a2 = ProcedureGlobal.f().a();
        try {
            return a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a() {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: Exception -> 0x0033
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: Exception -> 0x0033
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch: Exception -> 0x0033
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: Exception -> 0x0033
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: Exception -> 0x0033
            java.lang.String r5 = "ro.yunos.version"
            r4[r0] = r5     // Catch: Exception -> 0x0033
            java.lang.Object r4 = r3.invoke(r2, r4)     // Catch: Exception -> 0x0033
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x0033
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0031
            java.lang.String r5 = "java.vm.name"
            r1[r0] = r5     // Catch: Exception -> 0x0031
            java.lang.Object r0 = r3.invoke(r2, r1)     // Catch: Exception -> 0x0031
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x0031
            r2 = r0
            goto L_0x0038
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            r0 = move-exception
            r4 = r2
        L_0x0035:
            r0.printStackTrace()
        L_0x0038:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0043
            tb.oua.k = r4
            tb.oua.j = r2
            goto L_0x0054
        L_0x0043:
            boolean r0 = d()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "harmony"
            goto L_0x004e
        L_0x004c:
            java.lang.String r0 = "android"
        L_0x004e:
            tb.oua.j = r0
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            tb.oua.k = r0
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.txm.a():void");
    }
}
