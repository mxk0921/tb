package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class szx implements Callable<Void>, sxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureTask<Void> f = new FutureTask<>(gux.c, null);

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f28381a;
    public final ExecutorService d;
    public Thread e;
    public final AtomicReference<Future<?>> c = new AtomicReference<>();
    public final AtomicReference<Future<?>> b = new AtomicReference<>();

    static {
        t2o.a(628097507);
        t2o.a(628097368);
    }

    public szx(Runnable runnable, ExecutorService executorService) {
        this.f28381a = runnable;
        this.d = executorService;
    }

    public void a(Future<?> future) {
        Future<?> future2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            future2 = this.c.get();
            if (future2 == f) {
                if (this.e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
            }
        } while (!sng.a(this.c, future2, future));
    }

    public void b(Future<?> future) {
        Future<?> future2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3419b41d", new Object[]{this, future});
            return;
        }
        do {
            future2 = this.b.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
            }
        } while (!sng.a(this.b, future2, future));
    }

    @Override // tb.sxx
    public void b_() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        AtomicReference<Future<?>> atomicReference = this.c;
        FutureTask<Void> futureTask = f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (!(andSet == null || andSet == futureTask)) {
            if (this.e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.e != Thread.currentThread()) {
                z2 = true;
            }
            andSet2.cancel(z2);
        }
    }

    public Void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("9986b453", new Object[]{this});
        }
        try {
            this.e = Thread.currentThread();
            this.f28381a.run();
            b(this.d.submit(this));
            return null;
        } finally {
            this.e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public /* synthetic */ Void call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return c();
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c.get() == f;
    }
}
