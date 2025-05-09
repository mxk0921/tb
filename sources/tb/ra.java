package tb;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTIVITY_CONFIGURATION_CHANGED = 125;
    public static final int BIND_SERVICE = 121;
    public static final int CONFIGURATION_CHANGED = 118;
    public static final int CREATE_SERVICE = 114;
    public static final int CUSTOMIZED_WHAT = 100000;
    public static final int CUSTOMIZED_WHAT_LAUNCH = 100001;
    public static final int DESTROY_ACTIVITY = 109;
    public static final int HIDE_WINDOW = 106;
    public static final int INSTALL_PROVIDER = 145;
    public static final int LAUNCH_ACTIVITY_P_BELOW = 100;
    public static final int LAUNCH_ACTIVITY_P_OR_ABOVE = 159;
    public static final int NEW_INTENT = 112;
    public static final int PAUSE_ACTIVITY = 101;
    public static final int PAUSE_ACTIVITY_FINISHING = 102;
    public static final int RECEIVER = 113;
    public static final int RELAUNCH_ACTIVITY = 126;
    public static final int RESUME_ACTIVITY = 107;
    public static final int SCHEDULE_CRASH = 134;
    public static final int SEND_RESULT = 108;
    public static final int SERVICE_ARGS = 115;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int SHOW_WINDOW = 105;
    public static final int SLEEPING = 137;
    public static final int STOP_ACTIVITY_HIDE = 104;
    public static final int STOP_ACTIVITY_SHOW = 103;
    public static final int STOP_SERVICE = 116;
    public static final int UNBIND_SERVICE = 122;

    /* renamed from: a  reason: collision with root package name */
    public static final Method f27220a;
    public static final Field b;
    public static final Method c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        Handler.Callback a(Handler.Callback callback);
    }

    public static boolean a(a aVar) {
        try {
            Object b2 = b();
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mH");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(b2);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            declaredField2.set(handler, aVar.a((Handler.Callback) declaredField2.get(handler)));
            declaredField2.setAccessible(false);
            declaredField.setAccessible(false);
            whh.a("AMSService", "delegate successfully");
            return true;
        } catch (Throwable th) {
            whh.b("AMSService", "error occurred when delegating", th);
            return false;
        }
    }

    public static Object b() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
    }

    public static Object c() throws Throwable {
        Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        return declaredField2.get(obj);
    }

    public static Object d() throws Throwable {
        Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        return declaredField2.get(obj);
    }

    public static Object e() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd8250d", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return c();
        }
        return d();
    }

    public static boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7808c3", new Object[]{new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28 || i == 159) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe9b47c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 34 || "VanillaIceCream".equals(Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }

    public static void h(BroadcastReceiver.PendingResult pendingResult) throws Throwable {
        Method method = c;
        if (method == null) {
            whh.a("AMSService", "sendReceiverFinished failed due to sSendReceiverFinishMethod is null");
            return;
        }
        try {
            method.invoke(pendingResult, e());
        } catch (IllegalStateException e) {
            whh.b("AMSService", "error occurred when sendReceiverFinished", e);
        }
        synchronized (pendingResult) {
            try {
                Field field = b;
                if (field.getBoolean(pendingResult)) {
                    whh.a("AMSService", "the receiver has already been finished, do some trick here");
                    field.set(pendingResult, Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        try {
            Class<?> cls = Class.forName("android.app.IActivityManager");
            if (g()) {
                Class<?> cls2 = Integer.TYPE;
                f27220a = cls.getDeclaredMethod("serviceDoneExecuting", IBinder.class, cls2, cls2, cls2, Intent.class);
            } else {
                Class<?> cls3 = Integer.TYPE;
                f27220a = cls.getDeclaredMethod("serviceDoneExecuting", IBinder.class, cls3, cls3, cls3);
            }
            Method method = f27220a;
            if (method != null) {
                method.setAccessible(true);
            }
            Field declaredField = BroadcastReceiver.PendingResult.class.getDeclaredField("mFinished");
            b = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Method c2 = gun.c(BroadcastReceiver.PendingResult.class, "sendFinished", cls);
            c = c2;
            c2.setAccessible(true);
        } catch (Throwable th) {
            whh.b("AMSService", "error occurred when getDeclaredMethod of serviceDoneExecuting", th);
        }
    }

    public static void i(Object obj, Object obj2, IBinder iBinder, int i, int i2, int i3) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Intent intent;
        Method method = f27220a;
        if (method == null) {
            whh.a("AMSService", "serviceDoneExecuting is null");
        } else if (!g()) {
            method.invoke(obj, iBinder, Integer.valueOf(i), Integer.valueOf(i2), 0);
        } else {
            if (i3 == 121 || i3 == 122) {
                Field declaredField = obj2.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                intent = (Intent) declaredField.get(obj2);
            } else {
                intent = null;
            }
            method.invoke(obj, iBinder, Integer.valueOf(i), Integer.valueOf(i2), 0, intent);
        }
    }
}
