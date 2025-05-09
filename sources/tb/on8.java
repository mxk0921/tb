package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class on8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f25504a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25505a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.f25505a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f25505a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    public static ThreadFactory b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("8411487a", new Object[]{str, new Boolean(z)});
        }
        return new a(str, z);
    }

    public synchronized ExecutorService a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d59dd3de", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        if (this.f25504a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, Integer.MAX_VALUE, i2, TimeUnit.SECONDS, new LinkedBlockingDeque(), b(str, false));
            this.f25504a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return this.f25504a;
    }
}
