package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile g5d d;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f19736a = of.b(1, "ARanger-single", 100);
    public final ScheduledThreadPoolExecutor c = of.b(2, "ARanger-ipc", 100);

    static {
        t2o.a(393216097);
    }

    public static g5d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5d) ipChange.ipc$dispatch("306e7ba1", new Object[0]);
        }
        if (d == null) {
            synchronized (g5d.class) {
                try {
                    if (d == null) {
                        d = new g5d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static void b(boolean z, boolean z2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13a26ae5", new Object[]{new Boolean(z), new Boolean(z2), runnable});
        } else if (z) {
            a().b.post(runnable);
        } else if (z2) {
            a().f19736a.execute(runnable);
        } else {
            a().c.execute(runnable);
        }
    }

    public static void c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{runnable, new Long(j), timeUnit});
        } else {
            a().c.schedule(runnable, j, timeUnit);
        }
    }
}
