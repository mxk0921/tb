package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f24845a = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static final ScheduledExecutorService INSTANCE = nn8.a(new b("computation-threadPool"));

        static {
            t2o.a(437256346);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f24846a;
        public final AtomicInteger b = new AtomicInteger(1);

        static {
            t2o.a(437256347);
        }

        public b(String str) {
            this.f24846a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f24846a + " #" + this.b.getAndIncrement());
        }
    }

    static {
        t2o.a(437256345);
    }

    public static /* synthetic */ ScheduledExecutorService a(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("a9453062", new Object[]{threadFactory});
        }
        return b(threadFactory);
    }

    public static ScheduledExecutorService b(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("8eb23945", new Object[]{threadFactory});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(f24845a, threadFactory);
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledExecutorService c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("c39401d8", new Object[0]);
        }
        return a.INSTANCE;
    }
}
