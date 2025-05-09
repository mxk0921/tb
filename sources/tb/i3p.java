package tb;

import android.os.AsyncTask;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import tb.rg3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yko f21075a;
    public Object b;
    public Object c;
    public Object d;
    public ay4<Void, HandlerThread> e;
    public final a f = new a();
    public final d g = new d();
    public final c h = new c();
    public final b i = new b();
    public final e j = new e(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f21076a = p1p.a(152.0f);
        public final int b = p1p.a(390.0f);
        public final int c = -1184275;

        static {
            t2o.a(993001740);
        }

        public a() {
        }

        public void a(String str, es1<? extends BaseCellBean> es1Var, rg3.b bVar, rg3.b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40ae9ef7", new Object[]{this, str, es1Var, bVar, bVar2});
                return;
            }
            i3p.a(i3p.this).b().c(str, es1Var);
            i3p.a(i3p.this).a().e(ListStyle.LIST, es1Var.b(), bVar);
            i3p.a(i3p.this).a().e(ListStyle.WATERFALL, es1Var.b(), bVar2);
        }

        public void b(es1<? extends BaseCellBean> es1Var, rg3.b bVar, rg3.b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42c0af2d", new Object[]{this, es1Var, bVar, bVar2});
                return;
            }
            i3p.a(i3p.this).b().d(es1Var);
            i3p.a(i3p.this).a().e(ListStyle.LIST, es1Var.b(), bVar);
            i3p.a(i3p.this).a().e(ListStyle.WATERFALL, es1Var.b(), bVar2);
        }

        public void c(ay4<w02, ? extends WidgetViewHolder> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78a0f6f", new Object[]{this, ay4Var});
            } else {
                i3p.a(i3p.this).j().c.b = ay4Var;
            }
        }

        public void d(ay4<w02, ? extends WidgetViewHolder> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52ce45fb", new Object[]{this, ay4Var});
            } else {
                i3p.a(i3p.this).j().b.b = ay4Var;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001741);
        }

        public b() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fc60203", new Object[]{this, str});
            } else {
                i3p.a(i3p.this).d().b = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7edc4c5", new Object[]{this, str});
            } else {
                i3p.a(i3p.this).c().f9338a = str;
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8a7861e", new Object[]{this, str});
            } else {
                i3p.a(i3p.this).d().f28897a = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f21078a = false;
        public boolean b = true;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public Class<? extends z8e> g = null;
        public mit h = null;

        static {
            t2o.a(993001742);
        }

        public c() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b209287b", new Object[]{this, str});
            } else {
                i3p.a(i3p.this).l().s(str);
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b95ff0be", new Object[]{this, new Boolean(z)});
            }
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aede8d", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void d(mit mitVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc27541f", new Object[]{this, mitVar});
            } else {
                this.h = mitVar;
            }
        }

        public void e(Class<? extends z8e> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb9749e2", new Object[]{this, cls});
            } else {
                this.g = cls;
            }
        }

        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2f8c485", new Object[]{this, str});
            }
        }

        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("271cdbc3", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001743);
        }

        public d() {
        }

        public void a(ay4<gu1, ? extends pwc> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78a0f6f", new Object[]{this, ay4Var});
            } else {
                i3p.a(i3p.this).j().c.f28608a = ay4Var;
            }
        }

        public void b(ay4<gu1, ? extends tce> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52ce45fb", new Object[]{this, ay4Var});
            } else {
                i3p.a(i3p.this).j().b.f28609a = ay4Var;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Executor f21080a;
        public final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;

        static {
            t2o.a(993001744);
        }

        public e(i3p i3pVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f("tbsearch"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f21080a = new h(threadPoolExecutor);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger d = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final ThreadGroup f21081a;
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        static {
            t2o.a(993001745);
        }

        public f(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f21081a = threadGroup;
            str = TextUtils.isEmpty(str) ? "tbsearch" : str;
            this.c = str + "-pool-" + d.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ThreadGroup threadGroup = this.f21081a;
            Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g extends AbstractExecutorService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f21082a;

        static {
            t2o.a(993001746);
        }

        public g(ExecutorService executorService) {
            this.f21082a = executorService;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/config/SearchFrameConfig$SearchDelegatedExecutorService");
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
            }
            return this.f21082a.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.f21082a.execute(runnable);
            }
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0aab466", new Object[]{this, collection}) : this.f21082a.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8c2ecc66", new Object[]{this, collection}) : (T) this.f21082a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue();
            }
            return this.f21082a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
            }
            return this.f21082a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            } else {
                this.f21082a.shutdown();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
            }
            return this.f21082a.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.f21082a.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e74164f2", new Object[]{this, collection, new Long(j), timeUnit}) : this.f21082a.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9962f5f2", new Object[]{this, collection, new Long(j), timeUnit}) : (T) this.f21082a.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.f21082a.submit(callable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : this.f21082a.submit(runnable, t);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h extends g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001747);
        }

        public h(ExecutorService executorService) {
            super(executorService);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1943090074:
                    return hVar.invokeAny((Collection) objArr[0]);
                case -1721567758:
                    return hVar.invokeAny((Collection) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
                case -1306036184:
                    return hVar.submit((Callable) objArr[0]);
                case -1264443469:
                    return hVar.submit((Runnable) objArr[0]);
                case -794119066:
                    return hVar.invokeAll((Collection) objArr[0]);
                case -646688520:
                    return new Boolean(hVar.isTerminated());
                case -611890611:
                    return new Boolean(hVar.awaitTermination(((Number) objArr[0]).longValue(), (TimeUnit) objArr[1]));
                case -415144718:
                    return hVar.invokeAll((Collection) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
                case -342309312:
                    return hVar.shutdownNow();
                case -303734229:
                    return new Boolean(hVar.isShutdown());
                case -227606449:
                    return hVar.submit((Runnable) objArr[0], objArr[1]);
                case 452660730:
                    hVar.execute((Runnable) objArr[0]);
                    return null;
                case 457600989:
                    hVar.shutdown();
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/config/SearchFrameConfig$SearchFinalizableDelegatedExecutorService");
            }
        }

        public void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            } else {
                shutdown();
            }
        }
    }

    static {
        t2o.a(993001739);
    }

    public i3p(yko ykoVar) {
        this.f21075a = ykoVar;
    }

    public static /* synthetic */ yko a(i3p i3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("c124b3bf", new Object[]{i3pVar});
        }
        return i3pVar.f21075a;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e014c7c", new Object[]{this});
        }
        return this.f;
    }

    public b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b482132", new Object[]{this});
        }
        return this.i;
    }

    public HandlerThread d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("8a13d9a9", new Object[]{this});
        }
        ay4<Void, HandlerThread> ay4Var = this.e;
        if (ay4Var == null) {
            return null;
        }
        return ay4Var.a(null);
    }

    public <T> T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7c3c791e", new Object[]{this});
        }
        return (T) this.b;
    }

    public <T> T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("16169686", new Object[]{this});
        }
        return (T) this.d;
    }

    public <T> T g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2e6ccfad", new Object[]{this});
        }
        return (T) this.c;
    }

    public c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e57d7be8", new Object[]{this});
        }
        return this.h;
    }

    public d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fcdea5d2", new Object[]{this});
        }
        return this.g;
    }

    public e j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4b57f3b2", new Object[]{this});
        }
        return this.j;
    }

    public void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f03794", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public void l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db65b52c", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    public void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a74aa5", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void n(ay4<Void, HandlerThread> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c35375b", new Object[]{this, ay4Var});
        } else {
            this.e = ay4Var;
        }
    }
}
