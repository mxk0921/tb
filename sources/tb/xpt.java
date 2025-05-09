package tb;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xpt implements xsx {
    public static final int KEEP_ALIVE_TIME = 60;
    public static final int MAX_POOL_SIZE = Integer.MAX_VALUE;
    public static xsx b;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f31537a = new ThreadPoolExecutor(CORE_POOL_SIZE, Integer.MAX_VALUE, 60, TIME_UNIT, WORK_QUEUE, c("MSP-ThreadPool", false));
    public static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2;
    public static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    public static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31538a;
        public final /* synthetic */ boolean b;

        static {
            t2o.a(253755418);
        }

        public a(xpt xptVar, String str, boolean z) {
            this.f31538a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f31538a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        t2o.a(253755417);
        t2o.a(253755419);
    }

    public static xsx b() {
        if (b == null) {
            b = new xpt();
        }
        return b;
    }

    public void a(Runnable runnable) {
        Executor executor = this.f31537a;
        if (executor != null) {
            ((ThreadPoolExecutor) executor).execute(runnable);
        }
    }

    public final ThreadFactory c(String str, boolean z) {
        return new a(this, str, z);
    }
}
