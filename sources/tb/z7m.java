package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import tb.i3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class z7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z7m INSTANCE = new z7m();

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f32590a;

    @JvmStatic
    public static final Future<Map<String, String>> a(Callable<Map<String, String>> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a29e8463", new Object[]{callable});
        }
        ckf.g(callable, "task");
        return f32590a.submit(callable);
    }

    @JvmStatic
    public static final Future<Object> b(Callable<Object> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("403e5381", new Object[]{callable});
        }
        ckf.g(callable, "task");
        Future<Object> submit = f32590a.submit(callable);
        ckf.f(submit, "PIP_LINE_EXECUTOR.submit(task)");
        return submit;
    }

    @JvmStatic
    public static final void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b6161f", new Object[]{runnable});
        } else if (runnable != null) {
            ((ThreadPoolExecutor) f32590a).execute(runnable);
        }
    }

    static {
        t2o.a(481297332);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new i3p.f("pltpipline"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f32590a = threadPoolExecutor;
    }
}
