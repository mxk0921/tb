package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class crt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledThreadPoolExecutor f17271a;
    public static final ScheduledThreadPoolExecutor b;
    public static final ThreadPoolExecutor c;
    public static final ScheduledThreadPoolExecutor d;
    public static final ScheduledThreadPoolExecutor e;
    public static final ScheduledThreadPoolExecutor f;
    public static final ScheduledThreadPoolExecutor g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17272a = new AtomicInteger(0);
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.b + this.f17272a.incrementAndGet();
        }
    }

    static {
        ScheduledThreadPoolExecutor a2 = a(1, new a("Falco-Full-Trace"));
        f17271a = a2;
        ScheduledThreadPoolExecutor a3 = a(1, new a("Falco-Jank-Detect"));
        b = a3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor b2 = b(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new a("Falco-Full-Trace-WV"));
        c = b2;
        ScheduledThreadPoolExecutor a4 = a(1, new a("Falco-LoadAction"));
        d = a4;
        ScheduledThreadPoolExecutor a5 = a(1, new a("Falco-Screen-Monitor"));
        e = a5;
        ScheduledThreadPoolExecutor a6 = a(1, new a("Falco-Env"));
        f = a6;
        ScheduledThreadPoolExecutor a7 = a(1, new a("Falco-Lifecycle"));
        g = a7;
        a2.setKeepAliveTime(30L, timeUnit);
        a2.allowCoreThreadTimeOut(true);
        a3.setKeepAliveTime(30L, timeUnit);
        a3.allowCoreThreadTimeOut(true);
        b2.allowCoreThreadTimeOut(true);
        a4.setKeepAliveTime(30L, timeUnit);
        a4.allowCoreThreadTimeOut(true);
        a5.setKeepAliveTime(30L, timeUnit);
        a5.allowCoreThreadTimeOut(true);
        a6.setKeepAliveTime(30L, timeUnit);
        a6.allowCoreThreadTimeOut(true);
        a7.setKeepAliveTime(30L, timeUnit);
        a7.allowCoreThreadTimeOut(true);
    }

    public static ScheduledThreadPoolExecutor a(int i, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("fba101b7", new Object[]{new Integer(i), qqtVar});
        }
        return (ScheduledThreadPoolExecutor) VExecutors.getThreadPoolFactory().createScheduledExecutorService(i, qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ThreadPoolExecutor b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("60fedb69", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, qqtVar});
        }
        return (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i2, j, timeUnit, blockingQueue, qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static boolean c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c10bd00", new Object[]{runnable})).booleanValue();
        }
        return f17271a.remove(runnable);
    }

    public static Future<?> d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d3dc1568", new Object[]{runnable});
        }
        return f.submit(runnable);
    }

    public static Future<?> e(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e02b245c", new Object[]{runnable, new Long(j), timeUnit});
        }
        return f.schedule(runnable, j, timeUnit);
    }

    public static Future<?> f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("fae1a0a5", new Object[]{runnable});
        }
        return g.submit(runnable);
    }

    public static Future<?> g(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d2ac7b99", new Object[]{runnable, new Long(j), timeUnit});
        }
        return g.schedule(runnable, j, timeUnit);
    }

    public static Future<?> h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("bc1b944b", new Object[]{runnable});
        }
        return d.submit(runnable);
    }

    public static Future<?> i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("28a4992b", new Object[]{runnable});
        }
        return e.submit(runnable);
    }

    public static Future<?> j(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("557bdc1f", new Object[]{runnable, new Long(j), timeUnit});
        }
        return e.schedule(runnable, j, timeUnit);
    }

    public static Future<?> k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("6187157e", new Object[]{runnable});
        }
        return f17271a.submit(runnable);
    }

    public static Future<?> l(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d2604c72", new Object[]{runnable, new Long(j), timeUnit});
        }
        return f17271a.schedule(runnable, j, timeUnit);
    }

    public static Future<?> m(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("eea856ef", new Object[]{runnable});
        }
        return b.submit(runnable);
    }

    public static Future<?> n(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("ee7789e3", new Object[]{runnable, new Long(j), timeUnit});
        }
        return b.schedule(runnable, j, timeUnit);
    }

    public static Future<?> o(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("876b51ca", new Object[]{runnable});
        }
        return c.submit(runnable);
    }
}
