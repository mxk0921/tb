package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mti {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mti d = new mti();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24295a;
    public volatile Executor b;
    public final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f24296a;

        public a(mti mtiVar, AtomicInteger atomicInteger) {
            this.f24296a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "Metric-common-" + this.f24296a.getAndIncrement());
        }
    }

    public mti() {
        HandlerThread handlerThread = new HandlerThread("Metric-Kit");
        handlerThread.start();
        this.f24295a = new Handler(handlerThread.getLooper());
    }

    public static mti c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mti) ipChange.ipc$dispatch("fd30691a", new Object[0]);
        }
        return d;
    }

    public Executor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        a aVar = new a(this, new AtomicInteger(0));
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, timeUnit, new LinkedBlockingQueue(), aVar, new ThreadPoolExecutor.AbortPolicy());
                        threadPoolExecutor.setKeepAliveTime(3000L, timeUnit);
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.b = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.f24295a;
    }
}
