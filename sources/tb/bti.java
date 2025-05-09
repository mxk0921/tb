package tb;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, Application application, HashMap hashMap) {
        try {
            Object newInstance = Class.forName(str).newInstance();
            Method declaredMethod = newInstance.getClass().getDeclaredMethod("init", Application.class, HashMap.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(newInstance, application, hashMap);
        } catch (Exception e) {
            Log.e("MethodInvoker", "failed to invoke: " + str, e);
        }
    }

    public static void b(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b721e0cd", new Object[]{str, runnable});
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            k1j.a(LauncherRuntime.g, str, th);
            whh.b(str, "error occurred when run task", th);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e975ad90", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            a.a(str, null);
        }
    }
}
