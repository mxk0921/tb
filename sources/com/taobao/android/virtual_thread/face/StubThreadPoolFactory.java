package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VThread;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.face.StubThreadPoolFactory;
import com.taobao.android.virtual_thread.stub.StubScheduledThreadPoolExecutor;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.hrt;
import tb.qqt;
import tb.riw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StubThreadPoolFactory implements hrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService sharedPool = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: tb.ftq
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread lambda$static$0;
            lambda$static$0 = StubThreadPoolFactory.lambda$static$0(runnable);
            return lambda$static$0;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends riw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final qqt f9892a;

        static {
            t2o.a(974127108);
        }

        public a(qqt qqtVar) {
            this.f9892a = qqtVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/face/StubThreadPoolFactory$DefaultThreadFactory");
        }

        @Override // tb.riw
        public VirtualThread newVirtualThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VirtualThread) ipChange.ipc$dispatch("61b40e34", new Object[]{this, runnable});
            }
            return new VirtualThread(runnable, this.f9892a.newThreadName());
        }
    }

    static {
        t2o.a(974127107);
        t2o.a(972029961);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("b5ab8d0b", new Object[]{runnable});
        }
        return new Thread(runnable, "shared-pool");
    }

    @Override // tb.hrt
    public ExecutorService createExecutorService(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("259b801c", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, qqtVar, rejectedExecutionHandler});
        }
        return new StubThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new a(qqtVar), rejectedExecutionHandler);
    }

    @Override // tb.hrt
    public ScheduledExecutorService createScheduledExecutorService(int i, qqt qqtVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("a12c864", new Object[]{this, new Integer(i), qqtVar, rejectedExecutionHandler});
        }
        return new StubScheduledThreadPoolExecutor(i, new a(qqtVar), rejectedExecutionHandler);
    }

    @Override // tb.hrt
    public ExecutorService defaultSharedThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("f32acc88", new Object[]{this});
        }
        return sharedPool;
    }

    @Override // tb.hrt
    public void runImmediately(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46191f8", new Object[]{this, runnable});
        } else {
            new VThread(runnable, "v-imm-task").start();
        }
    }
}
