package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class njo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f24777a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        String apply();
    }

    public static String d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b31da8d6", new Object[]{context});
        }
        return e("appVersion", new a() { // from class: tb.mjo
            @Override // tb.njo.a
            public final String apply() {
                String g;
                g = njo.g(context);
                return g;
            }
        });
    }

    public static String e(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73502407", new Object[]{str, aVar});
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f24777a;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String apply = aVar.apply();
        concurrentHashMap.put(str, apply);
        return apply;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        try {
            return context.getPackageName().equals(j(context));
        } catch (Throwable th) {
            ehh.d(th);
            return true;
        }
    }

    public static /* synthetic */ String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e1c559f", new Object[]{context});
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "0.0.1";
        } catch (Exception e) {
            ehh.d(e);
            return "0.0.1";
        }
    }

    public static /* synthetic */ String h() {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddb1faf", new Object[0]);
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return (String) yck.h(Class.forName(ProcessUtils.ACTIVITY_THREAD)).b("sCurrentActivityThread").d("currentProcessName").g();
            }
            processName = Application.getProcessName();
            return processName;
        } catch (Throwable th) {
            ehh.d(th);
            return "unknown";
        }
    }

    public static /* synthetic */ String i(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b6abea", new Object[]{context});
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return "unknown";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "unknown";
        } catch (Exception e) {
            ehh.d(e);
            return "unknown";
        }
    }

    public static String j(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48e4ddb9", new Object[]{context});
        }
        if (o1r.a(context).b("forbidRunningAppProcesses", false)) {
            return e("processName", new a() { // from class: tb.kjo
                @Override // tb.njo.a
                public final String apply() {
                    String h;
                    h = njo.h();
                    return h;
                }
            });
        }
        return e("processName", new a() { // from class: tb.ljo
            @Override // tb.njo.a
            public final String apply() {
                String i;
                i = njo.i(context);
                return i;
            }
        });
    }
}
