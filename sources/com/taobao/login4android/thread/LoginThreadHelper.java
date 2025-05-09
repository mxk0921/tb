package com.taobao.login4android.thread;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.ReflectionHelper;
import com.taobao.tao.TaobaoApplication;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginThreadHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login_optimize";
    private static Handler mMainThreadHandler = new Handler(Looper.getMainLooper());

    static {
        t2o.a(516948002);
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static void runOnUIThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
            return;
        }
        try {
            if (!isMainThread()) {
                mMainThreadHandler.post(runnable);
            } else {
                runnable.run();
            }
        } catch (Exception e) {
            LoginTLogAdapter.w("login_optimize", "runOnUIThread failed", e);
            e.printStackTrace();
        }
    }

    public static String getCurProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        try {
            IpChange ipChange2 = TaobaoApplication.$ipChange;
            String str = (String) ReflectionHelper.invokeMethod(TaobaoApplication.class, TaobaoApplication.class.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, Context.class), context);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } catch (Throwable unused) {
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "ProcessNameNotFound";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "ProcessNameNotFound";
        } catch (Exception e) {
            e.printStackTrace();
            return "GetCurProcessException";
        }
    }
}
