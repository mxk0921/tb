package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f17018a;
    public static ScheduledExecutorService b;
    public static cet d;
    public static final int c = 1;
    public static final AtomicInteger e = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f17019a;

        static {
            t2o.a(404750669);
        }

        public a(int i) {
            this.f17019a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = cet.a().getAndIncrement();
            Thread thread = new Thread(runnable, "bhx_task" + andIncrement);
            thread.setPriority(this.f17019a);
            return thread;
        }
    }

    static {
        t2o.a(404750668);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]);
        }
        return e;
    }

    public static synchronized ScheduledExecutorService b() {
        synchronized (cet.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("bdd68a4d", new Object[0]);
            }
            if (f17018a == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new a(c));
                scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                f17018a = scheduledThreadPoolExecutor;
            }
            return f17018a;
        }
    }

    public static synchronized ScheduledExecutorService c() {
        synchronized (cet.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("161a80e", new Object[0]);
            }
            if (b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new a(10));
                scheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                b = scheduledThreadPoolExecutor;
            }
            return b;
        }
    }

    public static synchronized cet d() {
        synchronized (cet.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cet) ipChange.ipc$dispatch("e0d10434", new Object[0]);
            }
            if (d == null) {
                d = new cet();
            }
            return d;
        }
    }

    public final ScheduledFuture e(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("9b56a2dc", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        return b().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
            return;
        }
        try {
            b().submit(runnable);
        } catch (Throwable th) {
            q82.f("TaskExecutor.submit", null, null, th);
        }
    }

    public void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e99e69b", new Object[]{this, runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Throwable th) {
            q82.f("TaskExecutor.submit", null, null, th);
        }
    }
}
