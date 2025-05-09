package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tao.reactivex.d.a.b;
import tao.reactivex.f.g;
import tao.reactivex.f.h;
import tao.reactivex.f.i;
import tb.day;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class r5y extends day.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f27130a;
    public volatile boolean b;

    static {
        t2o.a(628097512);
        t2o.a(628097368);
    }

    public r5y(ThreadFactory threadFactory) {
        this.f27130a = u9y.a(threadFactory);
    }

    public static /* synthetic */ Object ipc$super(r5y r5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/e");
    }

    @Override // tb.day.c
    public sxx b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sxx) ipChange.ipc$dispatch("895389e0", new Object[]{this, runnable}) : d(runnable, 0L, null);
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            this.f27130a.shutdownNow();
        }
    }

    @Override // tb.day.c
    public sxx d(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("57bda9d4", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (this.b) {
            return b.INSTANCE;
        }
        return e(runnable, j, timeUnit, null);
    }

    public i e(Runnable runnable, long j, TimeUnit timeUnit, kzx kzxVar) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f2fb06bd", new Object[]{this, runnable, new Long(j), timeUnit, kzxVar});
        }
        i iVar = new i(runnable, kzxVar);
        if (kzxVar != null && !kzxVar.a(iVar)) {
            return iVar;
        }
        try {
            if (j <= 0) {
                future = this.f27130a.submit((Callable) iVar);
            } else {
                future = this.f27130a.schedule((Callable) iVar, j, timeUnit);
            }
            iVar.a(future);
        } catch (RejectedExecutionException e) {
            if (kzxVar != null) {
                kzxVar.b(iVar);
            }
            oux.a(e);
        }
        return iVar;
    }

    public sxx f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("d3eda6eb", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (j2 <= 0) {
            szx szxVar = new szx(runnable, this.f27130a);
            try {
                if (j <= 0) {
                    future = this.f27130a.submit(szxVar);
                } else {
                    future = this.f27130a.schedule(szxVar, j, timeUnit);
                }
                szxVar.a(future);
                return szxVar;
            } catch (RejectedExecutionException e) {
                oux.a(e);
                return b.INSTANCE;
            }
        } else {
            g gVar = new g(runnable);
            try {
                gVar.a(this.f27130a.scheduleAtFixedRate(gVar, j, j2, timeUnit));
                return gVar;
            } catch (RejectedExecutionException e2) {
                oux.a(e2);
                return b.INSTANCE;
            }
        }
    }

    public sxx g(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("8b6bd495", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        h hVar = new h(runnable);
        try {
            if (j <= 0) {
                future = this.f27130a.submit(hVar);
            } else {
                future = this.f27130a.schedule(hVar, j, timeUnit);
            }
            hVar.a(future);
            return hVar;
        } catch (RejectedExecutionException e) {
            oux.a(e);
            return b.INSTANCE;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            this.f27130a.shutdown();
        }
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }
}
