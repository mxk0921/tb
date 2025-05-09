package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f18327a;
    public final ScheduledThreadPoolExecutor b;
    public final ThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18328a;

        public a(e6s e6sVar, String str) {
            this.f18328a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f18328a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18329a;

        public b(e6s e6sVar, String str) {
            this.f18329a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f18329a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18330a;

        public c(e6s e6sVar, String str) {
            this.f18330a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f18330a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(e6s e6sVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "tlog-main-thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final e6s f18331a = new e6s(null);

        static {
            t2o.a(767557747);
        }

        public static /* synthetic */ e6s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e6s) ipChange.ipc$dispatch("ad49fc8a", new Object[0]);
            }
            return f18331a;
        }
    }

    static {
        t2o.a(767557742);
    }

    public /* synthetic */ e6s(a aVar) {
        this();
    }

    public static e6s d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e6s) ipChange.ipc$dispatch("887730e4", new Object[0]);
        }
        return e.a();
    }

    public final ScheduledThreadPoolExecutor a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2ab7e02f", new Object[]{this, new Boolean(z), str});
        }
        if (z) {
            return (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(1, new a(this, str));
        }
        return new ScheduledThreadPoolExecutor(1, new b(this, str));
    }

    public final ThreadPoolExecutor b(boolean z, long j, String str, ThreadPoolExecutor.AbortPolicy abortPolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("d72637e7", new Object[]{this, new Boolean(z), new Long(j), str, abortPolicy});
        }
        if (z) {
            return (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(1, 1, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(this, str), abortPolicy);
        }
        return new ThreadPoolExecutor(1, 1, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(this));
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33cfa16", new Object[]{this, runnable});
        } else {
            this.f18327a.execute(runnable);
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c118cdaf", new Object[]{this, runnable});
        } else {
            this.c.execute(runnable);
        }
    }

    public void g(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.b.schedule(runnable, j, timeUnit);
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ef3f5c", new Object[]{this})).booleanValue();
        }
        try {
            IpChange ipChange2 = VExecutors.$ipChange;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public e6s() {
        boolean h = h();
        ScheduledThreadPoolExecutor a2 = a(h, "tlog-inner-thread");
        this.b = a2;
        ThreadPoolExecutor.AbortPolicy abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        ThreadPoolExecutor b2 = b(h, 3L, "tlog-write-thread", abortPolicy);
        this.f18327a = b2;
        ThreadPoolExecutor b3 = b(h, 5L, "tlog-main-thread", abortPolicy);
        this.c = b3;
        a2.setKeepAliveTime(1L, TimeUnit.SECONDS);
        a2.allowCoreThreadTimeOut(true);
        b2.allowCoreThreadTimeOut(true);
        b3.allowCoreThreadTimeOut(true);
        Log.e("TLog.TLogThreadPool", "TLogThreadPool constructor done.");
    }
}
