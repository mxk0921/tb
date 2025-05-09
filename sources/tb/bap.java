package tb;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bap {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f16281a;
    public static final int b = 1;
    public static final AtomicInteger INTEGER = new AtomicInteger();
    public static boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final int f16282a;

        static {
            t2o.a(813694987);
        }

        public a(int i) {
            this.f16282a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int andIncrement = bap.INTEGER.getAndIncrement();
            Thread thread = new Thread(runnable, "RestSend:" + andIncrement);
            thread.setPriority(this.f16282a);
            return thread;
        }
    }

    static {
        t2o.a(813694986);
    }

    public static boolean a() {
        return c;
    }

    public static void b(boolean z) {
        c = z;
    }

    public synchronized void c(Runnable runnable) {
        try {
            if (f16281a == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2, new a(b));
                f16281a = newScheduledThreadPool;
                if (c && (newScheduledThreadPool instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(1L, TimeUnit.SECONDS);
                    ((ThreadPoolExecutor) f16281a).allowCoreThreadTimeOut(true);
                }
            }
            f16281a.submit(runnable);
        } finally {
        }
    }
}
