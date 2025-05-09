package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (!c()) {
            boolean b = b(hashMap);
            if (d(application, b)) {
                new n11().a();
            }
            if (Build.VERSION.SDK_INT <= 30) {
                if (e(application, b)) {
                    new dos().a();
                }
                if (f(application, b)) {
                    new m1x(application).b();
                }
            }
        }
    }

    public static boolean b(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1986659", new Object[]{map})).booleanValue();
        }
        if (map != null) {
            Object obj = map.get("appVersion");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = "1.0.0";
            }
            if (str.split("\\.").length > 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e09980e5", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            return Boolean.TRUE.equals(adk.i(Class.forName("dalvik.system.VMRuntime")).d("getRuntime").d("is64Bit").h());
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static boolean d(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c5f45d6", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = m7l.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookApkMap", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookApkMap", "false"), "true");
    }

    public static boolean e(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42b5230", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = m7l.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookTTF", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookTTF", "false"), "true");
    }

    public static boolean f(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38972927", new Object[]{application, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = m7l.a(application, "MemKeeper", 0);
        if (z) {
            return Objects.equals(a2.getString("shouldHookWebViewFactory", "true"), "true");
        }
        return Objects.equals(a2.getString("shouldHookWebViewFactory", "false"), "true");
    }
}
