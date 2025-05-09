package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vsx implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Activity f30235a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final vsx f30236a = new vsx();

        static {
            t2o.a(253755407);
        }
    }

    static {
        t2o.a(253755406);
    }

    public Activity a() {
        StringBuilder sb;
        Throwable e;
        Activity activity = this.f30235a;
        if (activity != null) {
            return activity;
        }
        c3j.a("ActivityLifeCallBack", "get activity from reflect");
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            sb = new StringBuilder("getActivityReflect: ");
            sb.append(e.getMessage());
            c3j.b("ActivityLifeCallBack", sb.toString());
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder("getActivityReflect: ");
            sb.append(e.getMessage());
            c3j.b("ActivityLifeCallBack", sb.toString());
            return null;
        } catch (NoSuchFieldException e4) {
            e = e4;
            sb = new StringBuilder("getActivityReflect: ");
            sb.append(e.getMessage());
            c3j.b("ActivityLifeCallBack", sb.toString());
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            sb = new StringBuilder("getActivityReflect: ");
            sb.append(e.getMessage());
            c3j.b("ActivityLifeCallBack", sb.toString());
            return null;
        } catch (InvocationTargetException e6) {
            e = e6;
            sb = new StringBuilder("getActivityReflect: ");
            sb.append(e.getMessage());
            c3j.b("ActivityLifeCallBack", sb.toString());
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c3j.f("ActivityLifeCallBack", "onActivityCreated ".concat(activity.getClass().getSimpleName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f30235a = activity;
        c3j.f("ActivityLifeCallBack", "onActivityResumed ".concat(activity.getClass().getSimpleName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c3j.f("ActivityLifeCallBack", "onActivityStopped ".concat(activity.getClass().getSimpleName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f30235a = null;
        c3j.f("ActivityLifeCallBack", "onActivityPaused ".concat(activity.getClass().getSimpleName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
