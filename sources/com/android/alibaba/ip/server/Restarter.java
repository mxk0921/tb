package com.android.alibaba.ip.server;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.ArrayMap;
import android.widget.Toast;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Restarter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(493879336);
    }

    public static /* synthetic */ void access$000(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e57b89", new Object[]{activity});
        } else {
            updateActivity(activity);
        }
    }

    public static List<Activity> getActivities(Context context, boolean z) {
        Class<?> cls;
        Object activityThread;
        Field declaredField;
        Collection collection;
        ArrayList arrayList = new ArrayList();
        try {
            cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            activityThread = MonkeyPatcher.getActivityThread(context, cls);
            declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
        }
        if (hasAppCrashed(context, cls, activityThread)) {
            return new ArrayList();
        }
        Object obj = declaredField.get(activityThread);
        if (obj instanceof HashMap) {
            collection = ((HashMap) obj).values();
        } else {
            if (obj instanceof ArrayMap) {
                collection = ((ArrayMap) obj).values();
            }
            return arrayList;
        }
        for (Object obj2 : collection) {
            Class<?> cls2 = obj2.getClass();
            if (z) {
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj2)) {
                    arrayList.add(getActivity(obj2));
                }
            } else {
                Activity activity = getActivity(obj2);
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
        }
        return arrayList;
    }

    private static Activity getActivity(Object obj) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField("activity");
        declaredField.setAccessible(true);
        return (Activity) declaredField.get(obj);
    }

    public static Activity getForegroundActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("300e318f", new Object[]{context});
        }
        List<Activity> activities = getActivities(context, true);
        if (activities.isEmpty()) {
            return null;
        }
        return activities.get(0);
    }

    private static String getPackageName(Class cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return (String) cls.getDeclaredMethod("currentPackageName", new Class[0]).invoke(obj, new Object[0]);
    }

    private static boolean hasAppCrashed(Context context, Class cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e650607b", new Object[]{context, cls, obj})).booleanValue();
        }
        if (!(context == null || obj == null)) {
            String packageName = getPackageName(cls, obj);
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((ActivityManager) context.getSystemService("activity")).getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.processName.equals(packageName) && processErrorStateInfo.condition != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void restartActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7302d157", new Object[]{activity});
            return;
        }
        "About to restart ".concat(activity.getClass().getSimpleName());
        while (activity.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.getClass().getSimpleName());
            sb.append(" is not a top level activity; restarting ");
            sb.append(activity.getParent().getClass().getSimpleName());
            sb.append(" instead");
            activity = activity.getParent();
        }
        activity.recreate();
    }

    public static void restartActivityOnUiThread(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe5ba74", new Object[]{activity});
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.android.alibaba.ip.server.Restarter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Restarter.access$000(activity);
                    }
                }
            });
        }
    }

    public static void restartApp(Context context, Collection<Activity> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f1a140", new Object[]{context, collection});
        } else if (!collection.isEmpty()) {
            Activity foregroundActivity = getForegroundActivity(context);
            if (foregroundActivity != null) {
                ((AlarmManager) foregroundActivity.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, ya.c(foregroundActivity, 0, new Intent(foregroundActivity, foregroundActivity.getClass()), 268435456));
                StringBuilder sb = new StringBuilder("Scheduling activity ");
                sb.append(foregroundActivity);
                sb.append(" to start after exiting process");
            }
            System.exit(0);
        }
    }

    public static void showToast(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af33ec4d", new Object[]{activity, str});
            return;
        }
        StringBuilder sb = new StringBuilder("About to show toast for activity ");
        sb.append(activity);
        sb.append(": ");
        sb.append(str);
        activity.runOnUiThread(new Runnable() { // from class: com.android.alibaba.ip.server.Restarter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Context applicationContext = activity.getApplicationContext();
                    if (!(applicationContext instanceof ContextWrapper) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                        if (str.length() >= 60 || str.indexOf(10) != -1) {
                            i = 1;
                        }
                        Toast.makeText(activity, str, i).show();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private static void updateActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72d3d91", new Object[]{activity});
        } else {
            restartActivity(activity);
        }
    }
}
