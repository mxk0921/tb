package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f25041a = null;

    static {
        t2o.a(578814064);
    }

    public static boolean a(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
            return true;
        } catch (Throwable th) {
            TLog.loge("AnimationUtils", "convertActivityFromTranslucent", th.getMessage());
            return false;
        }
    }

    public static boolean b(Activity activity) {
        try {
            Method c = c(Activity.class.getDeclaredClasses());
            c.setAccessible(true);
            c.invoke(activity, null, null);
            return true;
        } catch (Throwable th) {
            TLog.loge("AnimationUtils", "convertActivityToTranslucent", th.getMessage());
            return false;
        }
    }

    public static Method c(Class<?>[] clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("eb8e9dce", new Object[]{clsArr});
        }
        if (f25041a == null) {
            for (Class<?> cls : clsArr) {
                if (cls.getSimpleName().contains("TranslucentConversionListener")) {
                    f25041a = cls;
                }
            }
        }
        return Activity.class.getDeclaredMethod("convertToTranslucent", f25041a, ActivityOptions.class);
    }
}
