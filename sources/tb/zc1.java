package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zc1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889308);
    }

    public static void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3ebae2", new Object[]{map, str, str2});
        } else if (TextUtils.isEmpty(map.get(str))) {
            map.put(str, str2);
        }
    }

    public static String c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{obj, str});
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static boolean d(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50522fde", new Object[]{window, new Boolean(z)})).booleanValue();
        }
        if (z) {
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(9472);
            window.addFlags(Integer.MIN_VALUE);
        } else {
            window.clearFlags(201334784);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
        }
        window.setStatusBarColor(0);
        if (e()) {
            f(window, z);
        }
        return true;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue();
        }
        return "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static void g(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc67f7f", new Object[]{context, str, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Nav.from(context).toUri(buildUpon.build());
    }

    public static int h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("908ddcc2", new Object[]{new Float(f)})).intValue();
        }
        int a2 = (int) (((750.0f / vyv.a()) * f) + 0.5d);
        if (a2 != 0 || f <= 0.0f) {
            return a2;
        }
        return 1;
    }

    public static int i(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cc870e2", new Object[]{new Float(f)})).intValue();
        }
        float a2 = ((vyv.a() / 750.0f) * f) + 0.5f;
        if (a2 != 0.0f || f <= 0.0f) {
            return (int) a2;
        }
        return 1;
    }

    public static boolean b(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Integer.parseInt((String) obj) > 0;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() > 0;
        }
        return z;
    }

    public static boolean f(Window window, boolean z) {
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Class<?> cls2 = window.getClass();
            Class<?> cls3 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
