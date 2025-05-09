package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.m;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = "monitor_thread";
    public static final String n = "render_thread";
    public static final AtomicLong o = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21881a;
    public final ThreadPoolExecutor b;
    public final ThreadPoolExecutor c;
    public final ThreadPoolExecutor d;
    public final ScheduledExecutorService e;
    public final ThreadPoolExecutor f;
    public final Handler g;
    public final HandlerThread h;
    public final ThreadPoolExecutor i;
    public final ThreadPoolExecutor j;
    public final ThreadPoolExecutor k;
    public final ThreadPoolExecutor l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jb6 jb6Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "scheduled-thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21882a = new AtomicInteger(1);

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            if (zg5.O2()) {
                jb6 jb6Var = jb6.this;
                return new g(runnable, " asyncPreFetchNew# " + this.f21882a.getAndIncrement());
            }
            return new Thread(runnable, " asyncPreFetchExecutor#" + this.f21882a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21883a = new AtomicInteger(1);

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            if (zg5.O2()) {
                jb6 jb6Var = jb6.this;
                return new g(runnable, " asyncPreRenderNew # " + this.f21883a.getAndIncrement());
            }
            return new Thread(runnable, " asyncPreRenderExecutor#" + this.f21883a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21884a = new AtomicInteger(1);

        public d(jb6 jb6Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, " asyncRenderExecutorForSimple#" + this.f21884a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21885a = new AtomicInteger(1);

        public e(jb6 jb6Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, " fontExecutor#" + this.f21885a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21886a = new AtomicInteger(1);

        public f(jb6 jb6Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "viewExecutor#" + this.f21886a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public m f21887a;

        static {
            t2o.a(444597054);
        }

        public g(Runnable runnable, String str) {
            super(runnable, str);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/thread/DXRunnableManager$DXAsyncRenderThread");
        }

        public m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("4eb86fc7", new Object[]{this});
            }
            return this.f21887a;
        }

        public void b(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86f5389b", new Object[]{this, mVar});
            } else {
                this.f21887a = mVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jb6 f21888a = new jb6(null);

        static {
            t2o.a(444597055);
        }

        public static /* synthetic */ jb6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jb6) ipChange.ipc$dispatch("7a48c6e3", new Object[0]);
            }
            return f21888a;
        }
    }

    public /* synthetic */ jb6(a aVar) {
        this();
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab40bd39", new Object[]{runnable});
        } else {
            d().f21881a.removeCallbacks(runnable);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7487ff0", new Object[0]);
            return;
        }
        d().j.getQueue().clear();
        d().k.getQueue().clear();
    }

    public static HandlerThread c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("d43bb15a", new Object[0]);
        }
        return d().h;
    }

    public static jb6 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jb6) ipChange.ipc$dispatch("6528f4c9", new Object[0]);
        }
        return h.a();
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd64857", new Object[]{runnable});
        } else if (runnable instanceof t86) {
            ((t86) runnable).c = o.incrementAndGet();
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7855ef", new Object[0])).booleanValue();
        }
        if (!zg5.d5() || com.taobao.android.dinamicx.g.r() == null) {
            return false;
        }
        return true;
    }

    public static boolean g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bf7ea77", new Object[]{runnable})).booleanValue();
        }
        return d().f21881a.post(runnable);
    }

    public static void h(mu5 mu5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8011a9", new Object[]{mu5Var});
            return;
        }
        e(mu5Var);
        d().d.execute(mu5Var);
    }

    public static void i(l46 l46Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fe63e1", new Object[]{l46Var});
        } else {
            d().g.post(l46Var);
        }
    }

    public static void j(t86 t86Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09fb9f7", new Object[]{t86Var});
            return;
        }
        e(t86Var);
        d().l.execute(t86Var);
    }

    public static void k(t86 t86Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cadb51", new Object[]{t86Var});
            return;
        }
        e(t86Var);
        d().j.execute(t86Var);
    }

    public static void l(t86 t86Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46f0b23", new Object[]{t86Var});
            return;
        }
        e(t86Var);
        d().k.execute(t86Var);
    }

    public static void m(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40a3128", new Object[]{runnable});
            return;
        }
        e(runnable);
        d().c.execute(runnable);
    }

    public static void n(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else {
            d().f21881a.post(runnable);
        }
    }

    public static void o(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afce157", new Object[]{runnable, new Long(j)});
        } else {
            d().f21881a.postDelayed(runnable, j);
        }
    }

    public static boolean p(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968a2815", new Object[]{runnable})).booleanValue();
        }
        return d().f21881a.postAtFrontOfQueue(runnable);
    }

    public static void q(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380024fe", new Object[]{runnable});
            return;
        }
        e(runnable);
        d().f.execute(runnable);
    }

    public static void r(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
            return;
        }
        e(runnable);
        d().b.execute(runnable);
    }

    public static <Params, Progress, Result> void s(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17859fd", new Object[]{asyncTask, paramsArr});
        } else if (asyncTask != null) {
            asyncTask.executeOnExecutor(d().b, paramsArr);
        }
    }

    public static ScheduledExecutorService t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("f0dda920", new Object[0]);
        }
        return d().e;
    }

    public jb6() {
        this.f21881a = new Handler(Looper.getMainLooper());
        if (f()) {
            this.b = com.taobao.android.dinamicx.g.r().a(5, true, "DXVirCommon", 1);
            this.d = com.taobao.android.dinamicx.g.r().a(5, true, "DXVirDownload", 1);
            this.i = com.taobao.android.dinamicx.g.r().a(5, true, "DXVirLanguageN", 1);
        } else {
            this.b = new r86(5, true, new hi6("DXCommon", true));
            this.d = new r86(5, true, new hi6("DXDownload", true));
            this.i = new r86(5, true, new hi6("DXLanguageN", true));
        }
        this.e = new ScheduledThreadPoolExecutor(1, new a(this));
        HandlerThread handlerThread = new HandlerThread(m);
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread(n);
        this.h = handlerThread2;
        handlerThread2.start();
        int i = zg5.E3() ? 8 : 1;
        this.j = new r86(i, true, new b());
        this.l = new r86(i, true, new c());
        if (f()) {
            this.k = com.taobao.android.dinamicx.g.r().a(6, true, " virtualAsyncRenderExecutorForSimple#", 1);
        } else {
            this.k = new r86(6, true, new d(this));
        }
        if (f()) {
            this.c = com.taobao.android.dinamicx.g.r().a(2, true, " virtualFontExecutor#", 1);
        } else {
            this.c = new r86(2, true, new e(this));
        }
        if (f()) {
            this.f = com.taobao.android.dinamicx.g.r().a(1, true, "virtualViewExecutor#", 1);
        } else {
            this.f = new r86(1, true, new f(this));
        }
    }

    static {
        t2o.a(444597046);
    }
}
