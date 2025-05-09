package tb;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledThreadPoolExecutor f24047a;
    public static final ThreadPoolExecutor b;

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Falco Scheduler"));
        f24047a = scheduledThreadPoolExecutor;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new a("Falco Worker"));
        b = threadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(30L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("faf62535", new Object[]{runnable});
        }
        return f24047a.submit(runnable);
    }

    public static Future<?> b(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("890ac029", new Object[]{runnable, new Long(j), timeUnit});
        }
        return f24047a.schedule(runnable, j, timeUnit);
    }

    public static Future<?> c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a3240d09", new Object[]{runnable});
        }
        return b.submit(runnable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f24048a = new AtomicInteger(0);
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
            Thread thread = new Thread(runnable, this.b + this.f24048a.incrementAndGet());
            ALog.i("npm.ThreadFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }
}
