package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.spduLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class frt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f19491a;
    public static final AtomicInteger b = new AtomicInteger();
    public static final ThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19492a;

        public a(String str) {
            this.f19492a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = frt.a().getAndIncrement();
            Thread thread = new Thread(runnable, this.f19492a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("tnet-thread"));
        c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return b;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            c().execute(runnable);
        } catch (Throwable th) {
            spduLog.Tloge("adapter.ThreadPoolExecutorFactory", "execute fail", th.toString(), new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("46f0cbe6", new Object[0]);
        }
        if (f19491a == null) {
            synchronized (frt.class) {
                try {
                    if (f19491a == null) {
                        f19491a = new ScheduledThreadPoolExecutor(1, new a("TNET"));
                        f19491a.setKeepAliveTime(3L, TimeUnit.SECONDS);
                        f19491a.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19491a;
    }

    public static Future<?> d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b4bb0ccc", new Object[]{runnable});
        }
        return c.submit(runnable);
    }
}
