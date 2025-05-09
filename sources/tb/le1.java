package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class le1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23285a;
    public final ExecutorService b;
    public final HandlerThread c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(le1 le1Var) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "tbsearch_cache";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final le1 f23286a = new le1(null);

        static {
            t2o.a(815792131);
        }

        public static /* synthetic */ le1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (le1) ipChange.ipc$dispatch("ce5df8d1", new Object[0]);
            }
            return f23286a;
        }
    }

    static {
        t2o.a(815792129);
    }

    public /* synthetic */ le1(a aVar) {
        this();
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("992aaecb", new Object[0]);
        }
        return b.a().b;
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[0]);
        }
        return b.a().f23285a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2d7f1a", new Object[0]);
        } else {
            b.a().d();
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39023067", new Object[0]);
        } else {
            b.a().f();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a94810a", new Object[]{this});
        } else if (this.c.getPriority() != 5) {
            this.c.setPriority(5);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6b97dd", new Object[]{this});
        } else if (this.c.getPriority() != 10) {
            this.c.setPriority(10);
        }
    }

    public le1() {
        HandlerThread a2 = wsa.a("tbsearch_load");
        this.c = a2;
        a2.setPriority(10);
        a2.start();
        this.f23285a = new Handler(a2.getLooper());
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(1, new a(this), new ThreadPoolExecutor.DiscardOldestPolicy());
        this.b = newFixedThreadPool;
        if (newFixedThreadPool instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }
}
