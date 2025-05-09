package tb;

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f21151a = null;
    public static Resources b = null;
    public static DisplayMetrics c = null;

    static {
        t2o.a(439353346);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (f21151a == null) {
            try {
                f21151a = b5m.z().a();
            } catch (Exception unused) {
            }
            if (f21151a == null) {
                f21151a = f();
            }
        }
        return f21151a;
    }

    public static DisplayMetrics b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("7ffda3c1", new Object[0]);
        }
        if (c == null) {
            c = c().getDisplayMetrics();
        }
        return c;
    }

    public static Resources c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[0]);
        }
        if (b == null) {
            b = a().getResources();
        }
        return b;
    }

    public static float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        return b().density;
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a33e938", new Object[]{new Integer(i)})).intValue();
        }
        return (int) (i * d());
    }

    public static Application f() {
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
}
