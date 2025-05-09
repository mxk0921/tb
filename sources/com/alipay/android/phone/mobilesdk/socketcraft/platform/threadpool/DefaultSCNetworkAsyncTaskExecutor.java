package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultSCNetworkAsyncTaskExecutor implements SCNetworkAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f3763a;
    public final ScheduledThreadPoolExecutor b;

    public DefaultSCNetworkAsyncTaskExecutor() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, Integer.MAX_VALUE, 2L, timeUnit, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
        this.f3763a = threadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.b = scheduledThreadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setKeepAliveTime(6L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f3763a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb33be0", new Object[]{this, runnable});
        } else {
            this.f3763a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3570e", new Object[]{this, runnable});
        } else {
            this.f3763a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeLowPri(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de336c0d", new Object[]{this, runnable});
        } else {
            this.f3763a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public void executeSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c5104e", new Object[]{this, runnable});
        } else {
            this.f3763a.execute(runnable);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{this, runnable, new Long(j), timeUnit}) : this.b.schedule(runnable, j, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        return this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        return this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.f3763a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submitLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("bbcf7947", new Object[]{this, runnable});
        }
        return this.f3763a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("353875c7", new Object[]{this, runnable});
        }
        return this.f3763a.submit(runnable);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{this, callable, new Long(j), timeUnit}) : this.b.schedule(callable, j, timeUnit);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskExecutor
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.f3763a.submit(callable);
    }
}
