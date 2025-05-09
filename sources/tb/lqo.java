package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f23515a;
    public static Class<?> b;
    public static Class<?> c;
    public static Object d;
    public static Class<?> e;
    public static ab0 f;

    public static /* synthetic */ void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fccc668", new Object[]{list});
        } else {
            c(list);
        }
    }

    public static Application.ActivityLifecycleCallbacks b(Application application) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("7b1d1868", new Object[]{application});
        }
        return new a(e(application));
    }

    public static void c(List list) {
        if (list != null) {
            synchronized (list) {
                try {
                    for (Object obj : list) {
                        if (obj != null) {
                            if (!h()) {
                                if (obj.getClass().getName().toLowerCase(Locale.ROOT).contains("androidx")) {
                                    f23515a = obj.getClass().getClassLoader();
                                    if (h()) {
                                        break;
                                    }
                                }
                                if (obj.getClass().getName().equals("com.taobao.android.compat.ActivityLifecycleCallbacksWrapper")) {
                                    try {
                                        Field declaredField = obj.getClass().getDeclaredField("mCallbacks");
                                        declaredField.setAccessible(true);
                                        Object obj2 = declaredField.get(obj);
                                        if (obj2 instanceof Application.ActivityLifecycleCallbacks) {
                                            f23515a = obj2.getClass().getClassLoader();
                                            if (h()) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (Exception e2) {
                                        TLog.loge("TBAutoSize.WindowExt", "findLoader: ", e2);
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static ab0 d() {
        Class<?> cls;
        if (!(b == null || (cls = c) == null || e == null)) {
            ab0 ab0Var = f;
            if (ab0Var != null) {
                return ab0Var;
            }
            try {
                Method declaredMethod = cls.getDeclaredMethod("getActivityEmbeddingComponent", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(d, new Object[0]);
                if (e.equals(declaredMethod.getReturnType())) {
                    ab0 ab0Var2 = new ab0(e, invoke);
                    f = ab0Var2;
                    return ab0Var2;
                }
            } catch (Exception e2) {
                TLog.loge("TBAutoSize.WindowExt", "getActivityEmbeddingComponent: ", e2);
            }
        }
        return null;
    }

    public static List e(Application application) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
        declaredField.setAccessible(true);
        return (List) declaredField.get(application);
    }

    public static void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab29fdd5", new Object[]{application});
            return;
        }
        try {
            try {
                f23515a = new PathClassLoader("/system_ext/framework/androidx.window.extensions.jar", lqo.class.getClassLoader());
            } catch (Exception e2) {
                TLog.loge("TBAutoSize.WindowExt", "initLoader: ", e2);
            }
            if (!h()) {
                List e3 = e(application);
                if (e3 != null) {
                    synchronized (e3) {
                        e3.add(b(application));
                    }
                }
            }
        } finally {
            i();
            g();
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b16cca7", new Object[0])).booleanValue();
        }
        try {
            if (e != null) {
                return true;
            }
            ClassLoader classLoader = f23515a;
            if (classLoader == null) {
                return false;
            }
            Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
            e = loadClass;
            if (loadClass != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isActivityEmbeddingComponentPresent: ", e2);
            return false;
        } catch (NoClassDefFoundError e3) {
            TLog.loge("TBAutoSize.WindowExt", "isActivityEmbeddingComponentPresent: ", e3);
            return false;
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8590978", new Object[0])).booleanValue();
        }
        try {
            if (b != null) {
                return true;
            }
            ClassLoader classLoader = f23515a;
            if (classLoader == null) {
                return false;
            }
            Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            b = loadClass;
            if (loadClass != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsPresent: ", e2);
            return false;
        } catch (NoClassDefFoundError e3) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsPresent: ", e3);
            return false;
        }
    }

    public static boolean i() {
        ClassLoader classLoader;
        Class<?> loadClass;
        if (!h()) {
            return false;
        }
        try {
            Method declaredMethod = b.getDeclaredMethod("getWindowExtensions", new Class[0]);
            declaredMethod.setAccessible(true);
            d = declaredMethod.invoke(null, new Object[0]);
            if (c == null && (classLoader = f23515a) != null && (loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions")) == declaredMethod.getReturnType()) {
                c = loadClass;
            }
            if (c != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e5);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f23516a;

        public a(List list) {
            this.f23516a = list;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
            } else {
                lqo.a(this.f23516a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
