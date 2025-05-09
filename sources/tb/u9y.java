package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.f.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class u9y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    public static final Map<ScheduledThreadPoolExecutor, Object> d = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29254a = s15.d().f();
    public static final int b = s15.d().h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097519);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = new ArrayList(u9y.d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        u9y.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            } catch (Throwable th) {
                oux.a(th);
            }
        }
    }

    static {
        t2o.a(628097518);
        b();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("95029313", new Object[]{threadFactory});
        }
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f29254a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) newScheduledThreadPool;
            if (s15.d().g()) {
                scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            d.put(scheduledThreadPoolExecutor, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f29254a) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new f("PmSchedulerPurge"));
                    if (sng.a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                        a aVar = new a();
                        long j = b;
                        newScheduledThreadPool.scheduleAtFixedRate(aVar, j, j, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
