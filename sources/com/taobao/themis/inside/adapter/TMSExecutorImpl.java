package com.taobao.themis.inside.adapter;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSExecutorImpl implements IExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int o;
    public static int p;
    public static final int q;
    public static final int r;
    public static final qqt s = new j();
    public static final qqt t = new k();

    /* renamed from: a  reason: collision with root package name */
    public ScheduledExecutorService f13533a;
    public volatile Executor d;
    public volatile Executor e;
    public final BlockingQueue<Runnable> b = new PriorityBlockingQueue(256);
    public final BlockingQueue<Runnable> c = new PriorityBlockingQueue(128);
    public final Handler f = new Handler(Looper.getMainLooper());
    public final ExecutorService g = VExecutors.newSingleThreadExecutor(new c(this));
    public final ScheduledExecutorService h = VExecutors.newSingleThreadScheduledExecutor(new d(this));
    public final Executor k = new e(this);
    public final Executor l = new f();
    public final Executor m = a();
    public final Executor n = new g(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis_Audio_Executor";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis_JSAPI_Executor";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis_Manifest_Executor";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                TMSExecutorImpl.access$000(TMSExecutorImpl.this).post(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                CommonExtKt.b().post(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ExecutorType f13535a;
        public final /* synthetic */ Executor b;

        public h(TMSExecutorImpl tMSExecutorImpl, ExecutorType executorType, Executor executor) {
            this.f13535a = executorType;
            this.b = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.b.execute(new l(runnable, this.f13535a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(TMSExecutorImpl tMSExecutorImpl) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis-Scheduled-Executor";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f13536a = new AtomicInteger(1);

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis #" + this.f13536a.getAndIncrement();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f13537a = new AtomicInteger(1);

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Themis ##" + this.f13537a.getAndIncrement();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l implements Runnable, Comparable<l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ExecutorType f13538a;
        private Runnable b;

        static {
            t2o.a(837812288);
        }

        public l(Runnable runnable, ExecutorType executorType) {
            this.f13538a = executorType;
            this.b = runnable;
        }

        /* renamed from: a */
        public int compareTo(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6a88b78", new Object[]{this, lVar})).intValue();
            }
            ExecutorType executorType = this.f13538a;
            if (executorType == null) {
                return -1;
            }
            ExecutorType executorType2 = lVar.f13538a;
            if (executorType2 == null) {
                return 1;
            }
            if (executorType.equals(executorType2)) {
                return 0;
            }
            return this.f13538a.ordinal() - lVar.f13538a.ordinal();
        }

        public ExecutorType b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorType) ipChange.ipc$dispatch("b94e69c1", new Object[]{this});
            }
            return this.f13538a;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.run();
            }
        }
    }

    static {
        t2o.a(837812277);
        t2o.a(839909537);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        o = availableProcessors;
        q = availableProcessors + 1;
        r = (availableProcessors * 2) + 1;
    }

    public static /* synthetic */ Handler access$000(TMSExecutorImpl tMSExecutorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d7d252d0", new Object[]{tMSExecutorImpl});
        }
        return tMSExecutorImpl.f;
    }

    public final Executor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("f991f7a0", new Object[]{this});
        }
        return VExecutors.newSingleThreadExecutor(new a(this));
    }

    @Override // com.taobao.themis.kernel.executor.IExecutorService
    public Executor getExecutor(ExecutorType executorType) {
        Executor executor;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("411ccf18", new Object[]{this, executorType});
        }
        p = Math.max(4, o + 4);
        if (executorType == ExecutorType.UI) {
            return this.l;
        }
        if (executorType == ExecutorType.URGENT_DISPLAY) {
            return this.n;
        }
        if (executorType == ExecutorType.SYNC) {
            return this.k;
        }
        if (executorType == ExecutorType.JSAPI) {
            return this.g;
        }
        if (executorType == ExecutorType.AUDIO) {
            return this.m;
        }
        if (executorType == ExecutorType.MANIFEST) {
            return this.h;
        }
        if (executorType == ExecutorType.SERIAL) {
            return AsyncTask.SERIAL_EXECUTOR;
        }
        if (executorType == ExecutorType.NORMAL || executorType == ExecutorType.IDLE || executorType == ExecutorType.IO || executorType == ExecutorType.NETWORK) {
            if (this.e == null) {
                synchronized (this) {
                    try {
                        if (this.e == null) {
                            int i4 = q;
                            int i5 = r / 2;
                            if (i5 < i4) {
                                i2 = i4;
                            } else {
                                i2 = i5;
                            }
                            this.e = VExecutors.getThreadPoolFactory().createExecutorService(i4, i2, 30L, TimeUnit.SECONDS, this.c, t, new ThreadPoolExecutor.AbortPolicy());
                        }
                    } finally {
                    }
                }
            }
            executor = this.e;
        } else {
            if (this.d == null) {
                synchronized (this) {
                    try {
                        if (this.d == null) {
                            int i6 = p;
                            int i7 = r;
                            if (i7 < i6) {
                                i3 = i6;
                            } else {
                                i3 = i7;
                            }
                            this.d = VExecutors.getThreadPoolFactory().createExecutorService(i6, i3, 30L, TimeUnit.SECONDS, this.b, s, new ThreadPoolExecutor.AbortPolicy());
                        }
                    } finally {
                    }
                }
            }
            executor = this.d;
        }
        return new h(this, executorType, executor);
    }

    @Override // com.taobao.themis.kernel.executor.IExecutorService
    public ScheduledExecutorService getScheduledExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("4263fd5", new Object[]{this});
        }
        if (this.f13533a == null) {
            synchronized (this) {
                try {
                    if (this.f13533a == null) {
                        this.f13533a = VExecutors.newScheduledThreadPool(4, new i(this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13533a;
    }
}
