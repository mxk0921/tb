package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t45 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DAITaskExecutor";
    public static ScheduledExecutorService b;
    public static t45 d;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f28479a;
    public static final int c = 1;
    public static final AtomicInteger e = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f28480a = 0;

        public a(t45 t45Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder("jvs_init_t");
            int i = this.f28480a;
            this.f28480a = 1 + i;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f28481a;

        static {
            t2o.a(1034944677);
        }

        public b(int i) {
            this.f28481a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = t45.a().getAndIncrement();
            Thread thread = new Thread(runnable, "walle_c_:" + andIncrement);
            thread.setPriority(this.f28481a);
            return thread;
        }
    }

    static {
        t2o.a(1034944675);
    }

    public t45() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28479a = threadPoolExecutor;
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return e;
    }

    public static synchronized ScheduledExecutorService b() {
        synchronized (t45.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("6928218d", new Object[0]);
            }
            if (b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(ral.e().b(), new b(c));
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                b = scheduledThreadPoolExecutor;
            }
            return b;
        }
    }

    public static synchronized t45 c() {
        synchronized (t45.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t45) ipChange.ipc$dispatch("8500f092", new Object[0]);
            }
            if (d == null) {
                d = new t45();
            }
            return d;
        }
    }

    public ExecutorService d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("33b69da6", new Object[]{this});
        }
        return this.f28479a;
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
            return;
        }
        try {
            b().submit(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
