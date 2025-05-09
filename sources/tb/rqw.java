package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f27560a = null;
    public static rqw b = null;

    static {
        t2o.a(989856408);
    }

    public static rqw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqw) ipChange.ipc$dispatch("d6cfd79", new Object[0]);
        }
        if (b == null) {
            b = new rqw();
        }
        return b;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        if (f27560a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new usw("WVFixedThreadPool"));
            f27560a = threadPoolExecutor;
            try {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (runnable == null) {
            v7t.n("WVThreadPool", "executeSingle is null.");
        } else {
            f27560a.execute(runnable);
        }
    }
}
