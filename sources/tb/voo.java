package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class voo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT = "addition_result";
    public static final String MOUDLE = "safe_addition";

    static {
        t2o.a(654311452);
    }

    public static void c(final String str, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93e3e08", new Object[]{str, new Integer(i), str2});
        } else {
            ist.d(new Runnable() { // from class: tb.uoo
                @Override // java.lang.Runnable
                public final void run() {
                    voo.e(str, i, str2);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a43940c", new Object[]{str});
        } else {
            ist.d(new Runnable() { // from class: tb.too
                @Override // java.lang.Runnable
                public final void run() {
                    voo.f(str);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void e(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59e1b3e", new Object[]{str, new Integer(i), str2});
        } else {
            AppMonitor.Alarm.commitFail(MOUDLE, MONITOR_POINT, str, String.valueOf(i), str2);
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
