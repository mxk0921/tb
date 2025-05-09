package tb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class x9y {
    public static final x9y f = new x9y();

    /* renamed from: a  reason: collision with root package name */
    public final int f31242a;
    public final int b;
    public volatile Executor c;
    public volatile ExecutorService d;
    public final Object e = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public x9y() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.f31242a = availableProcessors + 1;
        this.b = (availableProcessors * 2) + 1;
    }

    public static Executor a() {
        x9y x9yVar = f;
        if (x9yVar.c == null) {
            synchronized (x9yVar.e) {
                try {
                    if (x9yVar.c == null) {
                        x9yVar.c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return x9yVar.c;
    }

    public static void b(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            ((a) a()).execute(runnable);
        }
    }

    public static ExecutorService d() {
        return f.c();
    }

    public final ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f31242a, this.b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
