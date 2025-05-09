package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f22626a = new AtomicInteger(0);
    public static ThreadPoolExecutor b = null;
    public static ThreadPoolExecutor c = null;
    public static ThreadPoolExecutor d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f22627a;

        static {
            t2o.a(343932966);
        }

        public a(String str) {
            this.f22627a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f22627a + kf.a().incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(343932965);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return f22626a;
    }

    public static ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c03c82d2", new Object[0]);
        }
        if (d == null) {
            synchronized (kf.class) {
                try {
                    if (d == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("aprefs-file-load"));
                        d = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static ThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b0193567", new Object[0]);
        }
        if (b == null) {
            synchronized (kf.class) {
                try {
                    if (b == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("aprefs-file-write"));
                        b = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static ThreadPoolExecutor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("566457c2", new Object[0]);
        }
        if (c == null) {
            synchronized (kf.class) {
                try {
                    if (c == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("aprefs-stat"));
                        c = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85c2448", new Object[]{runnable});
            return;
        }
        try {
            b().submit(runnable);
        } catch (Exception unused) {
        }
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990aaeaa", new Object[]{runnable});
            return;
        }
        try {
            d().submit(runnable);
        } catch (Exception unused) {
        }
    }

    public static void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312b651", new Object[]{runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Exception unused) {
        }
    }
}
