package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rfr INSTANCE = new rfr();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f27347a = new AtomicInteger(1);
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final ThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable);
            thread.setName("eventHandler thread " + rfr.a(rfr.INSTANCE).getAndIncrement());
            return thread;
        }
    }

    static {
        t2o.a(803209254);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a.INSTANCE);
        c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static final /* synthetic */ AtomicInteger a(rfr rfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("c594ec3a", new Object[]{rfrVar});
        }
        return f27347a;
    }

    public final void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f56345", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        c.execute(runnable);
    }

    public final void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        b.post(runnable);
    }
}
