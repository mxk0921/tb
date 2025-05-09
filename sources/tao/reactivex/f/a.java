package tao.reactivex.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import tb.gux;
import tb.sxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class a extends AtomicReference<Future<?>> implements sxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureTask<Void> c;
    public static final FutureTask<Void> d;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f15452a;
    public Thread b;

    static {
        t2o.a(628097502);
        t2o.a(628097368);
        Runnable runnable = gux.c;
        c = new FutureTask<>(runnable, null);
        d = new FutureTask<>(runnable, null);
    }

    public a(Runnable runnable) {
        this.f15452a = runnable;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/a");
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            future2 = get();
            if (future2 != c) {
                if (future2 == d) {
                    if (this.b == Thread.currentThread()) {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // tb.sxx
    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Future<?> future = get();
        if (future == c || future == d) {
            return true;
        }
        return false;
    }

    @Override // tb.sxx
    public final void b_() {
        FutureTask<Void> futureTask;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        Future<?> future = get();
        if (future != c && future != (futureTask = d) && compareAndSet(future, futureTask) && future != null) {
            if (this.b != Thread.currentThread()) {
                z = true;
            }
            future.cancel(z);
        }
    }
}
