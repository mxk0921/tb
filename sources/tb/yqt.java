package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ScheduledThreadPoolExecutor b;
    public static volatile ScheduledThreadPoolExecutor c;
    public static volatile ScheduledThreadPoolExecutor d;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f32288a = new AtomicInteger();
    public static final Map<String, ScheduledThreadPoolExecutor> e = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f32289a;

        static {
            t2o.a(343933187);
        }

        public a(String str) {
            this.f32289a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = yqt.a().getAndIncrement();
            Thread thread = new Thread(runnable, this.f32289a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(343933186);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return f32288a;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("af97e9d1", new Object[0]);
        }
        if (c == null) {
            synchronized (brt.class) {
                try {
                    if (c == null) {
                        c = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-IO"));
                        c.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        c.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("d0f32bda", new Object[0]);
        }
        if (d == null) {
            synchronized (brt.class) {
                try {
                    if (d == null) {
                        d = new ScheduledThreadPoolExecutor(3, new a("ACCS-SYNC-OUTER"));
                        d.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        d.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static ScheduledThreadPoolExecutor d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("783d126", new Object[]{str});
        }
        Map<String, ScheduledThreadPoolExecutor> map = e;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) ((ConcurrentHashMap) map).get(str);
        synchronized (brt.class) {
            if (scheduledThreadPoolExecutor == null) {
                try {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-Q-" + str));
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    ((ConcurrentHashMap) map).put(str, scheduledThreadPoolExecutor);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("739fdcab", new Object[0]);
        }
        if (b == null) {
            synchronized (brt.class) {
                try {
                    if (b == null) {
                        b = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-SCHEDULE"));
                        b.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        b.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }
}
