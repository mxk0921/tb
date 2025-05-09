package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.CarrierCachedPoolImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.o93;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CarrierCachedPoolImpl implements o93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final o93 INSTANCE = new CarrierCachedPoolImpl();
    private int sCount = 0;
    private final ThreadPoolExecutor services = new ThreadPoolExecutor(10, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: tb.p93
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread lambda$new$0;
            lambda$new$0 = CarrierCachedPoolImpl.this.lambda$new$0(runnable);
            return lambda$new$0;
        }
    });

    static {
        t2o.a(969932803);
        t2o.a(969932802);
    }

    private CarrierCachedPoolImpl() {
    }

    public static o93 instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o93) ipChange.ipc$dispatch("35edeeb5", new Object[0]);
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("4e66d8b3", new Object[]{this, runnable});
        }
        StringBuilder sb = new StringBuilder("ca-");
        int i = this.sCount;
        this.sCount = 1 + i;
        sb.append(i);
        return new Carrier(runnable, sb.toString());
    }

    @Override // tb.o93
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.services.execute(runnable);
        }
    }

    public int getActiveCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4edbaf6d", new Object[]{this})).intValue();
        }
        return this.services.getActiveCount();
    }

    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.services.submit(runnable);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.services.toString();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.services.submit(callable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : this.services.submit(runnable, t);
    }
}
