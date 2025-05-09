package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.schedule.CentralSchedulerQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gh3 implements huo, pn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f19991a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final CentralSchedulerQueue c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, gh3.d(gh3.this) + gh3.g(gh3.this).getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public gh3(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        fpm.b(z, "corePoolSize must be >=0");
        fpm.b(i2 >= i ? true : z2, "maxPoolSize shouldn't be less than corePoolSize");
        this.d = str;
        CentralSchedulerQueue centralSchedulerQueue = new CentralSchedulerQueue(this, i4, i5);
        this.c = centralSchedulerQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, centralSchedulerQueue, new a(), new b(this));
        this.f19991a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ String d(gh3 gh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59525b8c", new Object[]{gh3Var});
        }
        return gh3Var.d;
    }

    public static /* synthetic */ AtomicInteger g(gh3 gh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("e7453dbf", new Object[]{gh3Var});
        }
        return gh3Var.b;
    }

    @Override // tb.huo
    public void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
            return;
        }
        if (xv8.g(3)) {
            xv8.a("RxSysLog", getStatus(), new Object[0]);
        }
        this.f19991a.execute(buoVar);
    }

    @Override // tb.pn8
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1431f003", new Object[]{this})).booleanValue();
        }
        if (this.f19991a.getPoolSize() < this.f19991a.getMaximumPoolSize()) {
            return true;
        }
        return false;
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.c.size();
    }

    @Override // tb.huo
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.huo
    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.d + " status: queue=" + this.c.size() + " active=" + this.f19991a.getActiveCount() + " pool=" + this.f19991a.getPoolSize() + " largest=" + this.f19991a.getLargestPoolSize();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(gh3 gh3Var) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            xv8.a("RxSysLog", "queue is full and no more available thread, directly run in thread(%s)", Thread.currentThread().getName());
            if (!threadPoolExecutor.isShutdown()) {
                runnable.run();
            }
        }
    }
}
