package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final zdt f32698a = new zdt();
    public static final ScheduledExecutorService b = Executors.newScheduledThreadPool(6, new a());
    public static final AtomicInteger c = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593009);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = zdt.a().getAndIncrement();
            return new Thread(runnable, "AppMonitor:" + andIncrement);
        }
    }

    static {
        t2o.a(962593008);
    }

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return c;
    }

    public static ScheduledExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("6928218d", new Object[0]);
        }
        return b;
    }

    public static zdt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zdt) ipChange.ipc$dispatch("dbcb6733", new Object[0]);
        }
        return f32698a;
    }

    public final ScheduledFuture d(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("9b56a2dc", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        return b().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final ScheduledFuture e(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("9099172f", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        return b().scheduleAtFixedRate(runnable, 1000L, j, TimeUnit.MILLISECONDS);
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
            return;
        }
        try {
            b().submit(runnable);
        } catch (Throwable unused) {
        }
    }
}
