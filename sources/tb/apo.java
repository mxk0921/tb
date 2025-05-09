package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class apo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT = "clean_result";
    public static final String MOUDLE = "safe_clean";

    static {
        t2o.a(654311453);
    }

    public static void c(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f90e79", new Object[]{str, str2, str3});
        } else {
            ist.d(new Runnable() { // from class: tb.yoo
                @Override // java.lang.Runnable
                public final void run() {
                    apo.e(str, str2, str3);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a43940c", new Object[]{str});
        } else {
            ist.d(new Runnable() { // from class: tb.zoo
                @Override // java.lang.Runnable
                public final void run() {
                    apo.f(str);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d748403", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail(MOUDLE, MONITOR_POINT, str, str2, str3);
        }
    }

    public static /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbff95", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitSuccess(MOUDLE, MONITOR_POINT, str);
        }
    }
}
