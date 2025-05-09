package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kb0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final uw9 f22526a;

    static {
        uw9 uw9Var;
        try {
            uw9Var = new ww9();
        } catch (ClassNotFoundException e) {
            whh.b("ActivityLifeCycleCallbacksCompact", "ActivityLifeCycleCallbacksCompact error occurred:", e);
            uw9Var = new vw9();
        }
        f22526a = uw9Var;
    }

    public static void a(Application application, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Application.class.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(application, objArr);
            }
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksCompact", "invokeActivityLifeCycles error occurred:", e);
        } catch (NoSuchMethodException e2) {
            whh.b("ActivityLifeCycleCallbacksCompact", "invokeActivityLifeCycles error occurred:", e2);
        } catch (InvocationTargetException e3) {
            whh.b("ActivityLifeCycleCallbacksCompact", "invokeActivityLifeCycles error occurred:", e3);
        }
    }

    public static void b(FragmentManager fragmentManager, String str, List<FragmentManager.FragmentLifecycleCallbacks> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cdf6e", new Object[]{fragmentManager, str, list});
        } else {
            f22526a.b(fragmentManager, str, list);
        }
    }

    public static boolean c(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("497b00a0", new Object[]{activity})).booleanValue();
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        return intent.getBooleanExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT, false);
    }

    public static void d(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490c460", new Object[]{activity});
        } else if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT, true);
        }
    }

    public static List<Application.ActivityLifecycleCallbacks> e(Application application) {
        try {
            Field declaredField = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
            declaredField.setAccessible(true);
            List<Application.ActivityLifecycleCallbacks> list = (List) declaredField.get(application);
            declaredField.setAccessible(false);
            return list;
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksCompact", "obtainActivityLifecycleCallbacks error occurred:", e);
            return Collections.emptyList();
        } catch (NoSuchFieldException e2) {
            whh.b("ActivityLifeCycleCallbacksCompact", "obtainActivityLifecycleCallbacks error occurred:", e2);
            return Collections.emptyList();
        }
    }

    public static List<FragmentManager.FragmentLifecycleCallbacks> f(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3dfd67c", new Object[]{fragmentManager});
        }
        return f22526a.a(fragmentManager);
    }

    public static void g(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef11b76", new Object[]{activity});
        } else if (activity != null && (intent = activity.getIntent()) != null) {
            intent.removeExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT);
        }
    }
}
