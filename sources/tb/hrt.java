package tb;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface hrt {
    ExecutorService createExecutorService(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler);

    ScheduledExecutorService createScheduledExecutorService(int i, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler);

    ExecutorService defaultSharedThreadPool();

    void runImmediately(Runnable runnable);
}
