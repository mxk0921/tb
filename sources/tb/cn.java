package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicLong f = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f17161a;
    public final ScheduledExecutorService b;
    public final Handler c;
    public final ThreadPoolExecutor d;
    public final ThreadPoolExecutor e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cn cnVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "aura-scheduled-thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17162a = new AtomicInteger(1);

        public b(cn cnVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, " aura-logExecutorService#" + this.f17162a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17163a = new AtomicInteger(1);

        public c(cn cnVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, " aura-exposureExecutorService#" + this.f17163a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final cn f17164a = new cn(null);

        static {
            t2o.a(79691931);
        }

        public static /* synthetic */ cn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cn) ipChange.ipc$dispatch("25e46069", new Object[0]);
            }
            return f17164a;
        }
    }

    static {
        t2o.a(79691927);
    }

    public /* synthetic */ cn(a aVar) {
        this();
    }

    public static cn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cn) ipChange.ipc$dispatch("9709ef43", new Object[0]);
        }
        return d.a();
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd64857", new Object[]{runnable});
        } else if (runnable instanceof ql) {
            ((ql) runnable).c = f.incrementAndGet();
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fceea26", new Object[]{runnable});
        } else {
            a().c.post(runnable);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881423ab", new Object[]{runnable});
            return;
        }
        b(runnable);
        a().d.execute(runnable);
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
            return;
        }
        b(runnable);
        a().f17161a.execute(runnable);
    }

    public cn() {
        new Handler(Looper.getMainLooper());
        pl plVar = new pl(5, true, new zn("AURACommon", true));
        this.f17161a = plVar;
        plVar.allowCoreThreadTimeOut(true);
        this.b = new ScheduledThreadPoolExecutor(1, new a(this));
        HandlerThread handlerThread = new HandlerThread("aura_monitor_thread");
        handlerThread.start();
        new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("aura_extension_thread");
        handlerThread2.start();
        this.c = new Handler(handlerThread2.getLooper());
        pl plVar2 = new pl(2, true, new b(this));
        this.d = plVar2;
        plVar2.allowCoreThreadTimeOut(true);
        pl plVar3 = new pl(2, true, new c(this));
        this.e = plVar3;
        plVar3.allowCoreThreadTimeOut(true);
    }
}
