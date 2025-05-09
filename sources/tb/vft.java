package tb;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vft {
    public static final int CORE_POOL_SIZE;
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static final String DEFAULT_SCHEDULER_NAME = o3r.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: a  reason: collision with root package name */
    public static final puo f29991a = xij.INSTANCE;
    public static final gdt NonBlockingContext = new idt(0);
    public static final gdt BlockingContext = new idt(1);

    static {
        long f;
        int e;
        int e2;
        long f2;
        f = q3r.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        WORK_STEALING_TIME_RESOLUTION_NS = f;
        e = q3r.e("kotlinx.coroutines.scheduler.core.pool.size", hfn.c(o3r.a(), 2), 1, 0, 8, null);
        CORE_POOL_SIZE = e;
        e2 = q3r.e("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 0, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, null);
        MAX_POOL_SIZE = e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2 = q3r.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        IDLE_WORKER_KEEP_ALIVE_NS = timeUnit.toNanos(f2);
    }
}
