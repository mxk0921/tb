package com.taobao.android.virtual_thread.stub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.riw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StubExecutors {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PrivilegedAction f9895a;

        public a(PrivilegedAction privilegedAction) {
            this.f9895a = privilegedAction;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            return this.f9895a.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PrivilegedExceptionAction f9896a;

        public b(PrivilegedExceptionAction privilegedExceptionAction) {
            this.f9896a = privilegedExceptionAction;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            return this.f9896a.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends riw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger c = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9897a = new AtomicInteger(1);
        public final String b = "f" + c.getAndIncrement() + "-t-";

        static {
            t2o.a(974127115);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/stub/StubExecutors$DefaultThreadFactory");
        }

        @Override // tb.riw
        public VirtualThread newVirtualThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VirtualThread) ipChange.ipc$dispatch("61b40e34", new Object[]{this, runnable});
            }
            return new VirtualThread(runnable, this.b + this.f9897a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Callable<T> f9898a;
        public final AccessControlContext b = AccessController.getContext();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements PrivilegedExceptionAction<T> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public T run() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (T) ipChange.ipc$dispatch("b35b2be0", new Object[]{this});
                }
                return (T) d.a(d.this).call();
            }
        }

        static {
            t2o.a(974127116);
        }

        public d(Callable<T> callable) {
            this.f9898a = callable;
        }

        public static /* synthetic */ Callable a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callable) ipChange.ipc$dispatch("7bfcd78b", new Object[]{dVar});
            }
            return dVar.f9898a;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            try {
                return (T) AccessController.doPrivileged(new a(), this.b);
            } catch (PrivilegedActionException e) {
                throw e.getException();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f9900a;
        public final T b;

        static {
            t2o.a(974127118);
        }

        public e(Runnable runnable, T t) {
            this.f9900a = runnable;
            this.b = t;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            this.f9900a.run();
            return this.b;
        }
    }

    static {
        t2o.a(974127112);
    }

    private StubExecutors() {
    }

    public static <T> Callable<T> callable(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("812d8ada", new Object[]{runnable, t});
        }
        runnable.getClass();
        return new e(runnable, t);
    }

    public static ThreadFactory defaultThreadFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("b81f5477", new Object[0]);
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$main$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68df709", new Object[0]);
        } else {
            System.out.println("StubExecutors");
        }
    }

    public static void main(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e75f", new Object[]{strArr});
        } else {
            newCachedThreadPool().execute(new Runnable() { // from class: tb.dtq
                @Override // java.lang.Runnable
                public final void run() {
                    StubExecutors.lambda$main$0();
                }
            });
        }
    }

    public static ExecutorService newCachedThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("b9c0d22c", new Object[0]) : new StubThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newFixedThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("c6bdf6d9", new Object[]{new Integer(i)}) : new StubThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("5c9d018d", new Object[]{new Integer(i)}) : new StubScheduledThreadPoolExecutor(i);
    }

    public static ExecutorService newSingleThreadExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("94180b6f", new Object[0]) : new StubThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("fa1b3b79", new Object[0]) : new StubScheduledThreadPoolExecutor(1);
    }

    public static <T> Callable<T> privilegedCallable(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("b32ab8a0", new Object[]{callable});
        }
        callable.getClass();
        return new d(callable);
    }

    public static ExecutorService newCachedThreadPool(riw riwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("49215e50", new Object[]{riwVar}) : new StubThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), riwVar);
    }

    public static ExecutorService newFixedThreadPool(int i, riw riwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("716c97fd", new Object[]{new Integer(i), riwVar}) : new StubThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), riwVar);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, riw riwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("848007e9", new Object[]{new Integer(i), riwVar}) : new StubScheduledThreadPoolExecutor(i, riwVar);
    }

    public static ExecutorService newSingleThreadExecutor(riw riwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("fe37f293", new Object[]{riwVar}) : new StubThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), riwVar);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(riw riwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("2a778dd5", new Object[]{riwVar}) : new StubScheduledThreadPoolExecutor(1, riwVar);
    }

    public static Callable<Object> callable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("2a57493e", new Object[]{runnable});
        }
        runnable.getClass();
        return new e(runnable, null);
    }

    public static Callable<Object> callable(PrivilegedAction<?> privilegedAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("5edd8f44", new Object[]{privilegedAction});
        }
        privilegedAction.getClass();
        return new a(privilegedAction);
    }

    public static Callable<Object> callable(PrivilegedExceptionAction<?> privilegedExceptionAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("ca87a6b3", new Object[]{privilegedExceptionAction});
        }
        privilegedExceptionAction.getClass();
        return new b(privilegedExceptionAction);
    }
}
