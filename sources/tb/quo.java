package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class quo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean PURGE_ENABLED;
    public static final String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    public static final String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    public static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    public static final Map<ScheduledExecutorService, Object> POOLS = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = new ArrayList(quo.POOLS.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) it.next();
                    if (scheduledExecutorService.isShutdown()) {
                        quo.POOLS.remove(scheduledExecutorService);
                    } else if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                        ((ScheduledThreadPoolExecutor) scheduledExecutorService).purge();
                    }
                }
            } catch (Throwable th) {
                zjo.j(th);
            }
        }
    }

    public static ScheduledExecutorService a(riw riwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("1db4c0c3", new Object[]{riwVar});
        }
        ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(1, riwVar);
        POOLS.put(newScheduledThreadPool, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(1, new wko("RxSchedulerPurge"));
                if (sng.a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                    a aVar = new a();
                    long j = PURGE_PERIOD_SECONDS;
                    newScheduledThreadPool.scheduleAtFixedRate(aVar, j, j, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            } else {
                return;
            }
        }
    }

    static {
        int i;
        t2o.a(973078541);
        Properties properties = System.getProperties();
        boolean z = true;
        if (properties.containsKey(PURGE_ENABLED_KEY)) {
            boolean z2 = Boolean.getBoolean(PURGE_ENABLED_KEY);
            if (!z2 || !properties.containsKey(PURGE_PERIOD_SECONDS_KEY)) {
                z = z2;
            } else {
                i = Integer.getInteger(PURGE_PERIOD_SECONDS_KEY, 1).intValue();
                z = z2;
                PURGE_ENABLED = z;
                PURGE_PERIOD_SECONDS = i;
                b();
            }
        }
        i = 1;
        PURGE_ENABLED = z;
        PURGE_PERIOD_SECONDS = i;
        b();
    }
}
