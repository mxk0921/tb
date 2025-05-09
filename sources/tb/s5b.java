package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s5b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488984);
    }

    public static void a(Context context, FloutNewConfigData floutNewConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e2b7a1", new Object[]{context, floutNewConfigData});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        vp9.a("linkx", "hookAMS: sdkInt=" + i);
        if (floutNewConfigData == null || !floutNewConfigData.system10HookEnable) {
            if (i >= 26) {
                b(context);
            } else {
                d(context);
            }
        } else if (i > 28) {
            c(context);
        } else if (i >= 26) {
            b(context);
        } else {
            d(context);
        }
    }

    public static void b(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new qa(obj2, context)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                Class<?> cls = Class.forName("android.app.IActivityTaskManager");
                declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new qa(obj2, context)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new qa(obj2, context)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
