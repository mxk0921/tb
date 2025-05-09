package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class brt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f16582a = of.a(1, "ACCS-SCHEDULE");
    public static volatile ScheduledThreadPoolExecutor b = of.a(1, "ACCS-SCHEDULE-V2");
    public static volatile ScheduledThreadPoolExecutor c = of.a(1, "ACCS-SEND");
    public static volatile ScheduledThreadPoolExecutor d = of.a(1, "ACCS-SEND-V2");
    public static volatile ScheduledThreadPoolExecutor e = of.a(1, "ACCS-IO");
    public static volatile ScheduledThreadPoolExecutor f = of.a(1, "ACCS-CB");
    public static volatile ScheduledThreadPoolExecutor g = of.a(1, "ACCS-CB-V2");
    public static volatile ScheduledThreadPoolExecutor h = of.a(1, "ACCS-ACCEPT");
    public static volatile ScheduledThreadPoolExecutor i = of.a(1, "ACCS-API");
    public static final AtomicInteger j = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343933047);
        }

        public a(String str) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = brt.a().getAndIncrement();
            Thread thread = new Thread(runnable, "ACCS-IPC" + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(343933046);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return j;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            h().execute(runnable);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2ae5f", new Object[]{runnable});
            return;
        }
        try {
            f().execute(runnable);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("d8ef90f4", new Object[0]);
        }
        return i;
    }

    public static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("c1f33f", new Object[0]);
        }
        return h;
    }

    public static ScheduledThreadPoolExecutor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("6400d28b", new Object[0]);
        }
        return f;
    }

    public static ScheduledThreadPoolExecutor g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("86b4530c", new Object[0]);
        }
        return e;
    }

    public static ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("46f0cbe6", new Object[0]);
        }
        return f16582a;
    }

    public static ScheduledThreadPoolExecutor i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("9d5fed4a", new Object[0]);
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("7e84168e", new Object[0]);
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("bf305ea7", new Object[0]);
        }
        return g;
    }

    public static ScheduledThreadPoolExecutor l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("15b610aa", new Object[0]);
        }
        return d;
    }

    public static ScheduledFuture<?> m(Runnable runnable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j2), timeUnit});
        }
        try {
            return h().schedule(runnable, j2, timeUnit);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory schedule", th, new Object[0]);
            return null;
        }
    }
}
