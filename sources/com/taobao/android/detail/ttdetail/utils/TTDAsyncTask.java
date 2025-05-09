package com.taobao.android.detail.ttdetail.utils;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class TTDAsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Executor SERIAL_EXECUTOR = new g(null);
    public static final Executor THREAD_POOL_EXECUTOR;
    public static f g;

    /* renamed from: a  reason: collision with root package name */
    public final h<Params, Result> f6972a;
    public final FutureTask<Result> b;
    public volatile Status c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final Handler f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/TTDAsyncTask$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("1e46b524", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f6973a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "TTDAsyncTask #" + this.f6973a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends h<Params, Result> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TTDAsyncTask b;

        public b(TTDAsyncTask tTDAsyncTask) {
            super(null);
            this.b = tTDAsyncTask;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/TTDAsyncTask$2");
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Result) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            TTDAsyncTask.a(this.b).set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) this.b.f(this.f6978a);
                Binder.flushPendingCommands();
                return result;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends FutureTask<Result> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Callable callable) {
            super(callable);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/TTDAsyncTask$3");
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45231709", new Object[]{this});
                return;
            }
            try {
                TTDAsyncTask.d(TTDAsyncTask.this, get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                TTDAsyncTask.d(TTDAsyncTask.this, null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail$ttdetail$utils$TTDAsyncTask$Status;

        static {
            int[] iArr = new int[Status.values().length];
            $SwitchMap$com$taobao$android$detail$ttdetail$utils$TTDAsyncTask$Status = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail$ttdetail$utils$TTDAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final TTDAsyncTask f6975a;
        public final Data[] b;

        static {
            t2o.a(912262847);
        }

        public e(TTDAsyncTask tTDAsyncTask, Data... dataArr) {
            this.f6975a = tTDAsyncTask;
            this.b = dataArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262848);
        }

        public f(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/TTDAsyncTask$InternalHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                TTDAsyncTask.e(eVar.f6975a, eVar.b[0]);
            } else if (i == 2) {
                eVar.f6975a.p(eVar.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f6978a;

        static {
            t2o.a(912262852);
        }

        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        t2o.a(912262842);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), (availableProcessors * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new a());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
    }

    public TTDAsyncTask() {
        this(null);
    }

    public static /* synthetic */ AtomicBoolean a(TTDAsyncTask tTDAsyncTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4b432c3a", new Object[]{tTDAsyncTask});
        }
        return tTDAsyncTask.e;
    }

    public static /* synthetic */ AtomicBoolean b(TTDAsyncTask tTDAsyncTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("74aaa519", new Object[]{tTDAsyncTask});
        }
        return tTDAsyncTask.d;
    }

    public static /* synthetic */ Object c(TTDAsyncTask tTDAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b8de911e", new Object[]{tTDAsyncTask, obj});
        }
        return tTDAsyncTask.q(obj);
    }

    public static /* synthetic */ void d(TTDAsyncTask tTDAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14aa673", new Object[]{tTDAsyncTask, obj});
        } else {
            tTDAsyncTask.r(obj);
        }
    }

    public static /* synthetic */ void e(TTDAsyncTask tTDAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3e0c52", new Object[]{tTDAsyncTask, obj});
        } else {
            tTDAsyncTask.h(obj);
        }
    }

    public static Handler j() {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[0]);
        }
        synchronized (TTDAsyncTask.class) {
            try {
                if (g == null) {
                    g = new f(Looper.getMainLooper());
                }
                fVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public abstract Result f(Params... paramsArr);

    public final TTDAsyncTask<Params, Progress, Result> g(Executor executor, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDAsyncTask) ipChange.ipc$dispatch("6aeeca0c", new Object[]{this, executor, paramsArr});
        }
        if (this.c != Status.PENDING) {
            int i = d.$SwitchMap$com$taobao$android$detail$ttdetail$utils$TTDAsyncTask$Status[this.c.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.c = Status.RUNNING;
        o();
        this.f6972a.f6978a = paramsArr;
        executor.execute(this.b);
        return this;
    }

    public final void h(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aed8cf6", new Object[]{this, result});
            return;
        }
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.c = Status.FINISHED;
    }

    public final Handler i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.f;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.d.get();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c581b9", new Object[]{this});
        }
    }

    public void m(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2bd555", new Object[]{this, result});
        } else {
            l();
        }
    }

    public void n(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, result});
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a6298", new Object[]{this});
        }
    }

    public void p(Progress... progressArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9c3295", new Object[]{this, progressArr});
        }
    }

    public final Result q(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("d9e82d72", new Object[]{this, result});
        }
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public final void r(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63204376", new Object[]{this, result});
        } else if (!this.e.get()) {
            q(result);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<Runnable> f6976a;
        public Runnable b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f6977a;

            public a(Runnable runnable) {
                this.f6977a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f6977a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        static {
            t2o.a(912262849);
        }

        public g() {
            this.f6976a = new ArrayDeque<>();
        }

        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
                return;
            }
            Runnable poll = this.f6976a.poll();
            this.b = poll;
            if (poll != null) {
                TTDAsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            this.f6976a.offer(new a(runnable));
            if (this.b == null) {
                a();
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public TTDAsyncTask(Looper looper) {
        this.c = Status.PENDING;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        this.f = (looper == null || looper == Looper.getMainLooper()) ? j() : new Handler(looper);
        b bVar = new b(this);
        this.f6972a = bVar;
        this.b = new c(bVar);
    }
}
