package tb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static float f22172a = -1.0f;
    public static int b = -1;

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * d()) + 0.5f);
    }

    public static int c() {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f7254aa", new Object[0])).intValue();
        }
        if (!f(Globals.getApplication()) || (identifier = (resources = Globals.getApplication().getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        if (f22172a < 0.0f) {
            g();
        }
        return f22172a;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        if (b < 0) {
            g();
        }
        return b;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("674a9e3b", new Object[]{context})).booleanValue();
        }
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !"huawei".equals(str.toLowerCase())) {
            return h(context);
        }
        return i(context);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa2585", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
        String str = Build.DEVICE;
        str.equalsIgnoreCase("mx2");
        Configuration configuration = Globals.getApplication().getResources().getConfiguration();
        str.equalsIgnoreCase("mx2");
        if (configuration.orientation == 2) {
            int i = displayMetrics.heightPixels;
            f22172a = displayMetrics.density;
            b = i;
            return;
        }
        int i2 = displayMetrics.widthPixels;
        f22172a = displayMetrics.density;
        b = i2;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d70d573", new Object[]{context})).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        String b2 = b();
        if ("1".equals(b2)) {
            return false;
        }
        if ("0".equals(b2)) {
            return true;
        }
        return z;
    }

    public static int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9931417b", new Object[]{new Integer(i)})).intValue();
        }
        if (b <= 0) {
            g();
        }
        return (int) (i * ((b * 1.0f) / 750.0f));
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a271c3d9", new Object[]{context})).booleanValue();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return point2.y != point.y;
    }

    public static String b() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            return null;
        }
    }
}
