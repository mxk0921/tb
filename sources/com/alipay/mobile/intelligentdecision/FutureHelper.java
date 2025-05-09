package com.alipay.mobile.intelligentdecision;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FutureHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final Object a(Callable<Object> callable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d6046357", new Object[]{this, callable, new Long(j)});
        }
        return b(new FutureTask<>(callable), j);
    }

    public final Object b(FutureTask<Object> futureTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("47e021e7", new Object[]{this, futureTask, new Long(j)});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.alipay.mobile.intelligentdecision.FutureHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final AtomicInteger b = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "Intelligent_future_thread_" + this.b.incrementAndGet());
            }
        });
        try {
            try {
                threadPoolExecutor.setKeepAliveTime(5L, TimeUnit.SECONDS);
                threadPoolExecutor.execute(futureTask);
                return futureTask.get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                return "TIME_OUT";
            }
        } catch (TimeoutException unused2) {
            threadPoolExecutor.shutdown();
            return "TIME_OUT";
        } catch (Throwable th) {
            try {
                String str = "EXCEPTION:" + th.getMessage();
                try {
                    threadPoolExecutor.shutdown();
                } catch (Throwable unused3) {
                }
                return str;
            } finally {
                try {
                    threadPoolExecutor.shutdown();
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
