package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vpr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBMiniLiveThreadPoolGetter";

    /* renamed from: a  reason: collision with root package name */
    public static ThreadPoolExecutor f30160a;
    public static vpr b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(vpr vprVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, vpr.TAG);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(vpr vprVar) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            } else {
                efs.a(vpr.TAG, "rejectedExecution ");
            }
        }
    }

    static {
        t2o.a(779092039);
    }

    public vpr() {
        f30160a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(1), new a(this), new b(this));
        if (pvs.O()) {
            f30160a.allowCoreThreadTimeOut(true);
        }
    }

    public static vpr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpr) ipChange.ipc$dispatch("78b8eec7", new Object[0]);
        }
        if (b == null) {
            synchronized (vpr.class) {
                try {
                    if (b == null) {
                        b = new vpr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = f30160a;
        if (threadPoolExecutor != null && runnable != null) {
            threadPoolExecutor.execute(runnable);
        }
    }
}
