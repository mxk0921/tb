package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.adapter.AbsAPMInitiator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Executor f17291a;
    public static icc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f17292a;

        public a(AtomicInteger atomicInteger) {
            this.f17292a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "APM-common-" + this.f17292a.getAndIncrement());
        }
    }

    public static HandlerThread a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("6ac83d42", new Object[]{str});
        }
        icc iccVar = b;
        if (iccVar == null) {
            return new HandlerThread(str);
        }
        return ((AbsAPMInitiator.a) iccVar).a(str);
    }

    public static void b(icc iccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2594de7c", new Object[]{iccVar});
        } else {
            b = iccVar;
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4023e7", new Object[]{runnable});
            return;
        }
        if (f17291a == null) {
            a aVar = new a(new AtomicInteger(0));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, timeUnit, new LinkedBlockingQueue(), aVar, new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutor.setKeepAliveTime(3000L, timeUnit);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f17291a = threadPoolExecutor;
        }
        ((ThreadPoolExecutor) f17291a).execute(runnable);
    }
}
