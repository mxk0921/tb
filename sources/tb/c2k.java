package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.a;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import tb.fuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c2k extends fuo.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f16793a;
    public volatile boolean b;

    static {
        t2o.a(973078538);
    }

    public c2k(riw riwVar) {
        this.f16793a = quo.a(riwVar);
    }

    public static /* synthetic */ Object ipc$super(c2k c2kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/NewThreadWorker");
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            this.f16793a.shutdownNow();
        }
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public Disposable schedule(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("2b50b7b8", new Object[]{this, runnable}) : schedule(runnable, 0L, null);
    }

    public ScheduledRunnable scheduleActual(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        Future future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledRunnable) ipChange.ipc$dispatch("5fd179a2", new Object[]{this, runnable, new Long(j), timeUnit, disposableContainer});
        }
        zjo.m(runnable);
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j <= 0) {
                future = this.f16793a.submit((Callable) scheduledRunnable);
            } else {
                future = this.f16793a.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
        } catch (RejectedExecutionException e) {
            disposableContainer.remove(scheduledRunnable);
            zjo.j(e);
        }
        return scheduledRunnable;
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("38285f5", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        zjo.m(runnable);
        try {
            if (j <= 0) {
                future = this.f16793a.submit(runnable);
            } else {
                future = this.f16793a.schedule(runnable, j, timeUnit);
            }
            return a.c(future);
        } catch (RejectedExecutionException e) {
            zjo.j(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("f7b7b3fc", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        zjo.m(runnable);
        try {
            return a.c(this.f16793a.scheduleAtFixedRate(runnable, j, j2, timeUnit));
        } catch (RejectedExecutionException e) {
            zjo.j(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (this.b) {
            return EmptyDisposable.INSTANCE;
        }
        return scheduleActual(runnable, j, timeUnit, null);
    }
}
