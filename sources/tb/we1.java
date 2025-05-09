package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class we1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends riw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/adapter/asynctask/AsyncTaskHooker$1");
        }

        @Override // tb.riw
        public VirtualThread newVirtualThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VirtualThread) ipChange.ipc$dispatch("61b40e34", new Object[]{this, runnable});
            }
            return new VirtualThread(runnable, "AsyncTask:vt");
        }
    }

    static {
        t2o.a(970981378);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b1302a", new Object[0]);
            return;
        }
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (executor instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
            a aVar = new a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            StubThreadPoolExecutor stubThreadPoolExecutor = new StubThreadPoolExecutor(8, 8, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, new LinkedBlockingQueue(), aVar, threadPoolExecutor.getRejectedExecutionHandler());
            stubThreadPoolExecutor.allowCoreThreadTimeOut(threadPoolExecutor.allowsCoreThreadTimeOut());
            b(stubThreadPoolExecutor);
        }
    }

    public static boolean b(ThreadPoolExecutor threadPoolExecutor) {
        try {
            Field declaredField = AsyncTask.class.getDeclaredField("THREAD_POOL_EXECUTOR");
            declaredField.setAccessible(true);
            declaredField.set(null, threadPoolExecutor);
            return true;
        } catch (Exception unused) {
            ghh.a("AsyncTaskHooker", "Failed to install THREAD_POOL_EXECUTOR as default executor of AsyncTask.");
            return false;
        }
    }
}
