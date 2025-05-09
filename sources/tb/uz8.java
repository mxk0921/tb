package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29696a;
    public static ActivityManager b;
    public static Boolean c;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41b6dcc1", new Object[0]);
        }
        return zxv.b();
    }

    public static String b(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdc92c4b", new Object[]{context});
        }
        if (TextUtils.isEmpty(f29696a)) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f29696a = processName;
            } else {
                f29696a = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(f29696a)) {
                f29696a = c(context, Process.myPid());
            }
        }
        return f29696a;
    }

    public static String c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec675fa", new Object[]{context, new Integer(i)});
        }
        try {
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(context.getPackageName().equals(b(context)));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d219c873", new Object[0]);
        }
        try {
            return Login.getUserId();
        } catch (Throwable unused) {
            return "";
        }
    }
}
