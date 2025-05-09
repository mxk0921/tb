package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class osw implements wae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f25627a = new AtomicInteger(0);
    public final ScheduledExecutorService b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25628a;

        public a(String str) {
            this.f25628a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f25628a + osw.b(osw.this).getAndIncrement());
        }
    }

    static {
        t2o.a(989856410);
        t2o.a(989856403);
    }

    public osw(int i, String str) {
        this.b = Executors.newScheduledThreadPool(i, new a(str));
    }

    public static /* synthetic */ AtomicInteger b(osw oswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("26ac4dfd", new Object[]{oswVar});
        }
        return oswVar.f25627a;
    }

    @Override // tb.wae
    public ScheduledFuture<?> a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7befb845", new Object[]{this, runnable, new Long(j)});
        }
        return this.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // tb.xae
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // tb.xae
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable});
        }
        return this.b.submit(runnable);
    }
}
