package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ja8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f21864a;
    public static final ScheduledThreadPoolExecutor b;
    public static final ScheduledThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21865a = new AtomicInteger(0);
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.b + this.f21865a.incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, timeUnit, new LinkedBlockingDeque(), new a("Elastic-Dispatcher"));
        f21864a = threadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Elastic-Scheduler"));
        b = scheduledThreadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Elastic-High-Scheduler-"));
        c = scheduledThreadPoolExecutor2;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setKeepAliveTime(30L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor2.setKeepAliveTime(30L, timeUnit);
        scheduledThreadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("117d1715", new Object[]{runnable});
        }
        return f21864a.submit(runnable);
    }

    public static Future<?> b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("9012b75b", new Object[]{runnable});
        }
        return c.submit(runnable);
    }

    public static Future<?> c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("44b76c19", new Object[]{runnable});
        }
        return b.submit(runnable);
    }

    public static Future<?> d(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a057770d", new Object[]{runnable, new Long(j), timeUnit});
        }
        return b.schedule(runnable, j, timeUnit);
    }
}
