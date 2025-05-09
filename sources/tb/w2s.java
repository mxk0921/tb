package tb;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356508);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda1bc1", new Object[]{new Float(f)})).intValue();
        }
        return Math.round(i3s.e() * (f / 375.0f));
    }

    public static int b(String str, String str2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99db8cae", new Object[]{str, str2})).intValue();
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int max = Math.max(split.length, split2.length);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < split.length) {
                i = i4s.b(split[i3], 0);
            } else {
                i = 0;
            }
            if (i3 < split2.length) {
                i2 = i4s.b(split2[i3], 0);
            } else {
                i2 = 0;
            }
            if (i != i2) {
                return Integer.compare(i, i2);
            }
        }
        return 0;
    }

    public static int c(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            o3s.b("TLiveAndroidUtils", e.toString());
            return null;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857f4a09", new Object[0]);
        }
        return Globals.getVersionName();
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("415fdeba", new Object[]{context})).intValue();
        }
        return context.getResources().getConfiguration().orientation;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf13c565", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        try {
            if ((v2s.o().f().getApplication().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{context})).booleanValue();
        }
        if (g(context) == 2) {
            return true;
        }
        return false;
    }

    public static int l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7726f6d3", new Object[]{new Float(f)})).intValue();
        }
        return Math.round(f / (i3s.f() / 375.0f));
    }

    public static int m(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6da9ec0", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * 750.0f) / i3s.e());
    }

    public static int o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c60377", new Object[]{new Integer(i)})).intValue();
        }
        return (int) ((i / 750.0f) * i3s.e());
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
