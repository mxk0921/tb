package com.alibaba.android.split.core.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InternalHacker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Object _sActivityThread = null;
    private static Object _mLoadedApk = null;
    private static List<ProviderInfo> providerInfos = new ArrayList();

    static {
        t2o.a(677380144);
    }

    public static void clearProviders(Context context) {
        Object boundApplication = getBoundApplication(context);
        try {
            Field declaredField = Class.forName("android.app.ActivityThread$AppBindData").getDeclaredField("providers");
            declaredField.setAccessible(true);
            List<ProviderInfo> list = (List) declaredField.get(boundApplication);
            providerInfos = list;
            if (list != null && list.size() > 0) {
                declaredField.set(boundApplication, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getActivityThread(Context context) throws Exception {
        Field field;
        if (_sActivityThread == null) {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                _sActivityThread = declaredMethod.invoke(null, new Object[0]);
            }
            if (_sActivityThread == null && context != null) {
                if (_mLoadedApk == null) {
                    if (context instanceof Application) {
                        field = context.getClass().getField("mLoadedApk");
                    } else {
                        field = context.getClass().getDeclaredField("mPackageInfo");
                    }
                    field.setAccessible(true);
                    _mLoadedApk = field.get(context);
                }
                Field declaredField = _mLoadedApk.getClass().getDeclaredField("mActivityThread");
                declaredField.setAccessible(true);
                _sActivityThread = declaredField.get(_mLoadedApk);
            }
        }
        return _sActivityThread;
    }

    public static Field getAllApplicationField() {
        Field field;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("dc7d1f19", new Object[0]);
        }
        try {
            field = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mAllApplications");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            field = null;
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            field = null;
            field.setAccessible(true);
            return field;
        }
        field.setAccessible(true);
        return field;
    }

    private static Object getBoundApplication(Context context) {
        try {
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            return declaredField.get(getActivityThread(context));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Field getInstrumentationField() {
        Field field;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("df89f626", new Object[0]);
        }
        try {
            field = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInstrumentation");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            field = null;
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            field = null;
            field.setAccessible(true);
            return field;
        }
        field.setAccessible(true);
        return field;
    }

    public static Object getLoadedApk(Object obj, String str) throws Exception {
        Object obj2 = _mLoadedApk;
        if (obj2 != null) {
            return obj2;
        }
        Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mPackages");
        declaredField.setAccessible(true);
        WeakReference weakReference = (WeakReference) ((Map) declaredField.get(obj)).get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        _mLoadedApk = weakReference.get();
        return weakReference.get();
    }

    public static void initApplication(Application application, String str) throws Exception {
        Class<?> cls;
        try {
            cls = Class.forName("android.app.LoadedApk");
        } catch (Exception unused) {
            cls = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        declaredField.set(getLoadedApk(getActivityThread(application), str), application);
        Field declaredField2 = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInitialApplication");
        declaredField2.setAccessible(true);
        declaredField2.set(getActivityThread(application), application);
    }

    public static void installProviders(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread$AppBindData").getDeclaredField("providers");
            declaredField.setAccessible(true);
            List<ProviderInfo> list = providerInfos;
            if (list != null && list.size() > 0) {
                declaredField.set(getBoundApplication(context), providerInfos);
                Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("installContentProviders", Context.class, List.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(getActivityThread(context), context, providerInfos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
