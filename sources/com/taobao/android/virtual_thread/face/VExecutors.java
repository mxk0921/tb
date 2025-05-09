package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.c;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.ez4;
import tb.hrt;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VExecutors {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static hrt threadPoolFactory = new DefaultThreadPoolFactory();
    private static c threadLocalFactory = new a();
    private static ez4 currentThreadGetter = new ez4() { // from class: tb.xzv
        @Override // tb.ez4
        public final Thread a() {
            return Thread.currentThread();
        }
    };

    static {
        t2o.a(972029962);
    }

    public static Thread currentThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("98f2c31d", new Object[0]);
        }
        return currentThreadGetter.a();
    }

    public static ExecutorService defaultSharedThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("f32acc88", new Object[0]);
        }
        return threadPoolFactory.defaultSharedThreadPool();
    }

    public static hrt getThreadPoolFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrt) ipChange.ipc$dispatch("16723ce0", new Object[0]);
        }
        return threadPoolFactory;
    }

    public static boolean isVirtualEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2635dd37", new Object[0])).booleanValue();
        }
        return threadPoolFactory instanceof DefaultThreadPoolFactory;
    }

    public static boolean isWorkingOn(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f63c62", new Object[]{thread})).booleanValue();
        }
        if (currentThreadGetter.a() == thread || Thread.currentThread() == thread) {
            return true;
        }
        return false;
    }

    public static ExecutorService newCachedThreadPool(qqt qqtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("8312841e", new Object[]{qqtVar}) : threadPoolFactory.createExecutorService(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService newFixedThreadPool(int i, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("c576068b", new Object[]{new Integer(i), qqtVar}) : threadPoolFactory.createExecutorService(i, i, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("e0589b5b", new Object[]{new Integer(i), qqtVar}) : threadPoolFactory.createScheduledExecutorService(i, qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService newSingleThreadExecutor(qqt qqtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("4cd513a1", new Object[]{qqtVar}) : threadPoolFactory.createExecutorService(1, 1, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(qqt qqtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("e6865647", new Object[]{qqtVar}) : threadPoolFactory.createScheduledExecutorService(1, qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static <T> ThreadLocal<T> newThreadLocalWithInitial(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("8bcaf5a4", new Object[]{aVar});
        }
        return threadLocalFactory.a(aVar);
    }

    public static void runImmediately(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46191f8", new Object[]{runnable});
        } else {
            threadPoolFactory.runImmediately(runnable);
        }
    }

    public static void setCurrentThreadGetter(ez4 ez4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7ebe08", new Object[]{ez4Var});
            return;
        }
        Objects.requireNonNull(ez4Var);
        currentThreadGetter = ez4Var;
    }

    public static void setThreadLocalFactory(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27bda32", new Object[]{cVar});
            return;
        }
        Objects.requireNonNull(cVar);
        threadLocalFactory = cVar;
    }

    public static void setThreadPoolFactory(hrt hrtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8faec8", new Object[]{hrtVar});
            return;
        }
        Objects.requireNonNull(hrtVar);
        threadPoolFactory = hrtVar;
    }

    public static ExecutorService newCachedThreadPool(qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("dc60593f", new Object[]{qqtVar, rejectedExecutionHandler}) : threadPoolFactory.createExecutorService(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qqtVar, rejectedExecutionHandler);
    }

    public static ExecutorService newFixedThreadPool(int i, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("75178332", new Object[]{new Integer(i), qqtVar, rejectedExecutionHandler}) : threadPoolFactory.createExecutorService(i, i, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), qqtVar, rejectedExecutionHandler);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("10d6fe66", new Object[]{new Integer(i), qqtVar, rejectedExecutionHandler}) : threadPoolFactory.createScheduledExecutorService(i, qqtVar, rejectedExecutionHandler);
    }

    public static ExecutorService newSingleThreadExecutor(qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("617abf5c", new Object[]{qqtVar, rejectedExecutionHandler}) : threadPoolFactory.createExecutorService(1, 1, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), qqtVar, rejectedExecutionHandler);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("3f733dfa", new Object[]{qqtVar, rejectedExecutionHandler}) : threadPoolFactory.createScheduledExecutorService(1, qqtVar, rejectedExecutionHandler);
    }
}
