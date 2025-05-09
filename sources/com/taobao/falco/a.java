package com.taobao.falco;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.b;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105e33d8", new Object[]{this, aVar});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            c(aVar);
        } else if (i >= 26) {
            b(aVar);
        } else {
            d(aVar);
        }
    }

    public final void b(b.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new b(obj2, aVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(b.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                Class<?> cls = Class.forName("android.app.IActivityTaskManager");
                declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new b(obj2, aVar)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d(b.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new b(obj2, aVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
