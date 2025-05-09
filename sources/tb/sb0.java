package tb;

import android.app.ActivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sb0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(List<Observer> list) {
        Object obj;
        try {
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            if (Build.VERSION.SDK_INT >= 26) {
                obj = pa9.a(null, ActivityManager.class.getDeclaredField("IActivityManagerSingleton"));
            } else {
                obj = pa9.a(null, cls.getDeclaredField("gDefault"));
            }
            Class<?> cls2 = Class.forName("android.util.Singleton");
            try {
                Method declaredMethod = cls2.getDeclaredMethod("get", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
            Field declaredField = cls2.getDeclaredField("mInstance");
            Object a2 = pa9.a(obj, declaredField);
            if (a2 != null) {
                Class<?> cls3 = Class.forName("android.app.IActivityManager");
                ub0 ub0Var = new ub0(a2);
                for (Observer observer : list) {
                    ub0Var.addObserver(observer);
                }
                pa9.b(obj, declaredField, a2, Proxy.newProxyInstance(sb0.class.getClassLoader(), new Class[]{cls3}, ub0Var));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
