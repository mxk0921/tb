package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile mqw b;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f24241a;

    static {
        t2o.a(989856406);
    }

    public mqw() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw("WVExecutor"));
        this.f24241a = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static mqw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqw) ipChange.ipc$dispatch("c55bfaf0", new Object[0]);
        }
        if (b == null) {
            synchronized (mqw.class) {
                try {
                    if (b == null) {
                        b = new mqw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc13e81d", new Object[]{this, runnable});
            return;
        }
        ((ThreadPoolExecutor) this.f24241a).execute(runnable);
        v7t.d("WVExecutor", "runOnBackground");
    }
}
