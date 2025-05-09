package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f24248a;
    public static final float b;
    public static final int c;
    public static final int d;

    static {
        t2o.a(912262780);
        b = -1.0f;
        c = -1;
        d = -1;
        DisplayMetrics displayMetrics = d().getResources().getDisplayMetrics();
        if (d().getResources().getConfiguration().orientation == 2) {
            b = displayMetrics.density;
            c = displayMetrics.heightPixels;
            d = displayMetrics.widthPixels;
            return;
        }
        b = displayMetrics.density;
        c = displayMetrics.widthPixels;
        d = displayMetrics.heightPixels;
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) (f * d().getResources().getDisplayMetrics().density);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static boolean c(int i, int i2, float f, int[] iArr) {
        float f2;
        float f3;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214375f", new Object[]{new Integer(i), new Integer(i2), new Float(f), iArr})).booleanValue();
        }
        if (f < -0.01f) {
            iArr[0] = i;
            iArr[1] = i2;
            return false;
        }
        try {
            if ((1.0f * i) / i2 > f) {
                i3 = (int) Math.ceil(f3 * f);
                i4 = i2;
            } else {
                i4 = (int) Math.ceil(f2 / f);
                i3 = i;
            }
            iArr[0] = i3;
            iArr[1] = i4;
            return true;
        } catch (Throwable unused) {
            iArr[0] = i;
            iArr[1] = i2;
            return false;
        }
    }

    public static Application d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (f24248a == null) {
            f24248a = g();
        }
        if (f24248a == null) {
            f24248a = b5m.z().a();
        }
        return f24248a;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Application g() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static float h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fc591a4", new Object[]{str})).floatValue();
        }
        return i(str, 1.0f);
    }

    public static int j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f78b", new Object[]{new Float(f)})).intValue();
        }
        return (int) (f / d().getResources().getDisplayMetrics().density);
    }

    public static float i(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8ed0c7c", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
        } catch (Throwable th) {
            tgh.c("DisplayUtil", "parseVideoRatio failed for dimension: " + str, th);
        }
        if ("1:1".equalsIgnoreCase(str)) {
            return 1.0f;
        }
        if (!TextUtils.isEmpty(str) && str.contains(":")) {
            String[] split = str.split(":", 2);
            return split.length < 2 ? f : Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
        }
        return f;
    }
}
