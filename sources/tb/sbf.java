package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f27927a;

    static {
        t2o.a(912262024);
    }

    public static void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4caee4", new Object[]{activity, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 30) {
            b(activity, z);
        } else {
            c(activity, z);
        }
    }

    public static void b(Activity activity, boolean z) {
        try {
            if (z) {
                Method e = e(Activity.class.getDeclaredClasses());
                e.setAccessible(true);
                e.invoke(activity, null, null);
            } else {
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity, new Object[0]);
            }
        } catch (Throwable th) {
            tgh.c("InsideDetailUtils", "convertActivityTranslucent error, translucent: " + z, th);
        }
    }

    public static void d(Activity activity) {
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            if (i == 26 || i == 27) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e) {
                    tgh.b("InsideDetailUtils", "fixScreenOrientationOnSDK_O error : " + e.getMessage());
                    activity.setRequestedOrientation(-1);
                }
            }
        }
    }

    public static Method e(Class<?>[] clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("eb8e9dce", new Object[]{clsArr});
        }
        if (f27927a == null) {
            for (Class<?> cls : clsArr) {
                if (cls.getSimpleName().contains("TranslucentConversionListener")) {
                    f27927a = cls;
                }
            }
        }
        return Activity.class.getDeclaredMethod("convertToTranslucent", f27927a, ActivityOptions.class);
    }

    public static boolean f(Activity activity) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc225f94", new Object[]{activity})).booleanValue();
        }
        if (activity == null || activity.getIntent().getData() == null || nj7.h()) {
            tgh.b("InsideDetailUtils", "not inside");
            return false;
        }
        Uri data = activity.getIntent().getData();
        if (Boolean.TRUE.toString().equals(data.getQueryParameter(bia.UNDER_TAKE_INSIDE_DETAIL))) {
            tgh.b("InsideDetailUtils", "is inside , has insideDetail=true");
            return true;
        }
        String uri = data.toString();
        if (uri.startsWith("http://h5.m.taobao.com/awp/core/detail/inside.htm") || uri.startsWith("https://h5.m.taobao.com/awp/core/detail/inside.htm")) {
            z = true;
        }
        tgh.b("InsideDetailUtils", "is inside pathMatch : " + z);
        return z;
    }

    public static void c(Activity activity, boolean z) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("setTranslucent", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, Boolean.valueOf(z));
        } catch (Throwable th) {
            tgh.c("InsideDetailUtils", "convertActivityTranslucent error, translucent: " + z, th);
        }
    }
}
