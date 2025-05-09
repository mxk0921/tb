package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fck {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY = 2;
    public static volatile ThreadPoolExecutor d;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f19189a = new AtomicInteger();
    public static final ScheduledThreadPoolExecutor b = new e(2, new c());
    public static final ScheduledThreadPoolExecutor c = new e(1, new b());
    public static final ScheduledThreadPoolExecutor e = new e(1, new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "Orange_Critical_Fetch");
            thread.setPriority(5);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(613417002);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/OThreadFactory$DiskThreadFactory");
        }

        @Override // tb.fck.c, java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "Orange_Disk");
            thread.setPriority(5);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(613417004);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "Orange_Listener");
            thread.setPriority(5);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e extends ScheduledThreadPoolExecutor {
        static {
            t2o.a(613417005);
        }

        public e(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
            setKeepAliveTime(10L, TimeUnit.SECONDS);
            allowCoreThreadTimeOut(true);
        }
    }

    static {
        t2o.a(613417000);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return f19189a;
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2472237f", new Object[0]);
        }
        return b;
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            d(runnable, 0L);
        }
    }

    public static void d(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            j().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", xpc.RECORD_EXECUTE, th, new Object[0]);
        }
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc115c6b", new Object[]{runnable});
        } else {
            f(runnable, 0L);
        }
    }

    public static void f(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61aa7b9", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            k().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", "execute_config_net", th, new Object[0]);
        }
    }

    public static void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302e2637", new Object[]{runnable});
        } else {
            h(runnable, 0L);
        }
    }

    public static void h(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d597176d", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            l().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            OLog.e("OThreadPool", "execute_config_disk", th, new Object[0]);
        }
    }

    public static void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb8b5ce", new Object[]{runnable});
            return;
        }
        if (d == null) {
            synchronized (fck.class) {
                try {
                    if (d == null) {
                        d = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d());
                        d.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        try {
            d.execute(runnable);
        } catch (Throwable th) {
            OLog.e("OThreadPool", "execute listener", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5b66ba88", new Object[0]);
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("184e7dbc", new Object[0]);
        }
        return e;
    }

    public static ScheduledThreadPoolExecutor l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("ee8dac0e", new Object[0]);
        }
        return c;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(613417003);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = fck.a().getAndIncrement();
            Thread thread = new Thread(runnable, "Orange:" + andIncrement);
            OLog.i("OThreadPool", "newThread", "index", Integer.valueOf(andIncrement), "poolSize", Integer.valueOf(fck.b().getPoolSize()));
            thread.setPriority(5);
            return thread;
        }
    }
}
