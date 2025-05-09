package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VirtualExecutors {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger c = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9883a = new AtomicInteger(1);
        public final String b = "vt-" + c.getAndIncrement();

        static {
            t2o.a(969932814);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new VirtualThread(runnable, this.b + this.f9883a.getAndIncrement());
        }
    }

    static {
        t2o.a(969932813);
    }

    private VirtualExecutors() {
    }

    public static ThreadFactory defaultThreadFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("b81f5477", new Object[0]);
        }
        return new a();
    }

    public static ExecutorService newCachedVirtualThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("235f07e5", new Object[0]) : new VirtualThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newFixedVirtualThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("db210c5c", new Object[]{new Integer(i)}) : new VirtualThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ScheduledExecutorService newScheduledVirtualThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("2edcdabc", new Object[]{new Integer(i)}) : new ScheduledVirtualThreadPoolExecutor(i);
    }

    public static ExecutorService newSingleVirtualThreadExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("3892b734", new Object[0]) : new VirtualThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ScheduledExecutorService newSingleVirtualThreadScheduledExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("477e5ffe", new Object[0]) : new ScheduledVirtualThreadPoolExecutor(1);
    }

    public static ExecutorService newCachedVirtualThreadPool(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("9b676c7e", new Object[]{threadFactory}) : new VirtualThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public static ExecutorService newFixedVirtualThreadPool(int i, ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("dc7ac175", new Object[]{new Integer(i), threadFactory}) : new VirtualThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static ScheduledExecutorService newScheduledVirtualThreadPool(int i, ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("e16ca943", new Object[]{new Integer(i), threadFactory}) : new ScheduledVirtualThreadPoolExecutor(i, threadFactory);
    }

    public static ExecutorService newSingleVirtualThreadExecutor(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1d79e04d", new Object[]{threadFactory}) : new VirtualThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static ScheduledExecutorService newSingleVirtualThreadScheduledExecutor(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("3fb43585", new Object[]{threadFactory}) : new ScheduledVirtualThreadPoolExecutor(1, threadFactory);
    }
}
