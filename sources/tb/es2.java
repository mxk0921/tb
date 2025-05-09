package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class es2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static final ScheduledExecutorService INSTANCE = Executors.newSingleThreadScheduledExecutor(new b("cacheClean-init"));

        static {
            t2o.a(737148949);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f18787a;
        public final AtomicInteger b = new AtomicInteger(1);

        static {
            t2o.a(737148951);
        }

        public b(String str) {
            this.f18787a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f18787a + " #" + this.b.getAndIncrement());
        }
    }

    static {
        t2o.a(737148948);
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("aff5277b", new Object[0]);
        }
        ScheduledExecutorService scheduledExecutorService = a.INSTANCE;
        if (scheduledExecutorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) scheduledExecutorService).allowCoreThreadTimeOut(true);
        }
        return scheduledExecutorService;
    }
}
