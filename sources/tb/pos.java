package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pos {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadPoolExecutor mExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26216a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.f26216a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f26216a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(912262859);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(3, Math.min(availableProcessors - 1, 6)), (availableProcessors * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), c("TTThreadPoolExecutor", false));
        mExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            mExecutor.execute(runnable);
        }
    }

    public static <T> Future<T> b(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable});
        }
        return mExecutor.submit(callable);
    }

    public static ThreadFactory c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("8411487a", new Object[]{str, new Boolean(z)});
        }
        return new a(str, z);
    }
}
