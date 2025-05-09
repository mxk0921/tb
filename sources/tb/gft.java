package tb;

import android.os.SystemClock;
import android.os.Trace;
import com.alibaba.security.realidentity.r3;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.DefferReason;
import com.taobao.android.job.core.task.TaskExecutionException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class gft<T, R> implements eft<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ExecutorService b;
    public final CompletionService<dn8<T, R>> c;
    public final fft<T, R> d;

    /* renamed from: a  reason: collision with root package name */
    public final Collection<bn8<T, R>> f19956a = new CopyOnWriteArrayList();
    public final Set<T> e = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Callable<dn8<T, R>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vct f19957a;

        public a(vct vctVar) {
            this.f19957a = vctVar;
        }

        /* renamed from: a */
        public dn8<T, R> call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dn8) ipChange.ipc$dispatch("4473e52a", new Object[]{this});
            }
            Object obj = null;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (bn8 bn8Var : gft.g(gft.this)) {
                    bn8Var.c(this.f19957a, currentTimeMillis);
                }
                obj = this.f19957a.b();
                dn8<T, R> h = dn8.h(this.f19957a.c(), obj, currentTimeMillis, System.currentTimeMillis());
                h.e().e = this.f19957a.j();
                for (bn8 bn8Var2 : gft.g(gft.this)) {
                    bn8Var2.a(this.f19957a, h);
                }
                return h;
            } catch (Throwable th) {
                dn8<T, R> a2 = dn8.a(this.f19957a.c(), obj, th.getMessage());
                for (bn8 bn8Var3 : gft.g(gft.this)) {
                    bn8Var3.d(this.f19957a, a2, th);
                }
                jdh.a("TaskSchedulerImpl", "Error Execution Task # %s", this.f19957a.c(), th);
                return a2;
            }
        }
    }

    public gft(ExecutorService executorService, fft<T, R> fftVar) {
        this.b = executorService;
        this.c = new ExecutorCompletionService(executorService);
        this.d = fftVar;
        if (fftVar != null) {
            ((muo) fftVar).f(500L);
        }
        h(DefferReason.TIMEOUT_POLLING_INITIAL);
    }

    public static /* synthetic */ Collection g(gft gftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e30b6f68", new Object[]{gftVar});
        }
        return gftVar.f19956a;
    }

    @Override // tb.eft
    public void a(q35<T, R> q35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0196fd", new Object[]{this, q35Var});
            return;
        }
        fft<T, R> fftVar = this.d;
        if (fftVar != null) {
            ((muo) fftVar).b(q35Var.g());
        }
    }

    @Override // tb.eft
    public boolean b(bn8<T, R> bn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ac6ff35", new Object[]{this, bn8Var})).booleanValue();
        }
        if (bn8Var != null) {
            return ((CopyOnWriteArrayList) this.f19956a).remove(bn8Var);
        }
        return false;
    }

    @Override // tb.eft
    public void c(q35<T, R> q35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b713e", new Object[]{this, q35Var});
            return;
        }
        fft<T, R> fftVar = this.d;
        if (fftVar != null) {
            ((muo) fftVar).c(q35Var.g());
        }
    }

    @Override // tb.eft
    public boolean d(bn8<T, R> bn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("257ac0d2", new Object[]{this, bn8Var})).booleanValue();
        }
        if (bn8Var != null) {
            return ((CopyOnWriteArrayList) this.f19956a).add(bn8Var);
        }
        return false;
    }

    @Override // tb.eft
    public dn8<T, R> e(vct<T, R> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn8) ipChange.ipc$dispatch("48155751", new Object[]{this, vctVar});
        }
        T c = vctVar.c();
        jdh.i("TaskSchedulerImpl", "Received Task %s", c);
        Callable<dn8<T, R>> i = i(vctVar);
        if (!vctVar.j()) {
            ((ExecutorCompletionService) this.c).submit(i);
            ((HashSet) this.e).add(c);
            return null;
        }
        try {
            return i.call();
        } catch (Exception e) {
            return dn8.a(c, null, e.getMessage());
        }
    }

    @Override // tb.eft
    public dn8<T, R> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn8) ipChange.ipc$dispatch("7e61e8dc", new Object[]{this});
        }
        fft<T, R> fftVar = this.d;
        if (fftVar == null || !((muo) fftVar).h()) {
            try {
                return (dn8) ((ExecutorCompletionService) this.c).take().get();
            } catch (Exception e) {
                throw new TaskExecutionException("Task executed failed", e);
            }
        } else {
            jdh.h("TaskSchedulerImpl", r3.r);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                try {
                    Trace.beginSection("TaskScheduler#polling");
                    dn8<T, R> j = j();
                    ((HashSet) this.e).remove(j.b());
                    return j;
                } catch (Exception e2) {
                    throw new TaskExecutionException("Task executed failed", e2);
                }
            } finally {
                jdh.i("TaskSchedulerImpl", "processResult cost %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                Trace.endSection();
            }
        }
    }

    public final void h(String str) {
        vct<T, R> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1691f9", new Object[]{this, str});
            return;
        }
        fft<T, R> fftVar = this.d;
        if (fftVar != null && (g = ((muo) fftVar).g()) != null) {
            jdh.a("TaskSchedulerImpl", "executing deffer task due to { reason=%s }", str);
            if (g.d(null)) {
                Trace.beginSection("TaskScheduler#defferTask#" + str);
                g.b();
                Trace.endSection();
            }
            ((muo) this.d).e(g);
        }
    }

    public final Callable<dn8<T, R>> i(vct<T, R> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("1b779bbf", new Object[]{this, vctVar});
        }
        return new a(vctVar);
    }

    public final dn8<T, R> j() throws ExecutionException, InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn8) ipChange.ipc$dispatch("e8c2f08", new Object[]{this});
        }
        while (true) {
            Future poll = ((ExecutorCompletionService) this.c).poll(100L, TimeUnit.MILLISECONDS);
            if (poll != null) {
                return (dn8) poll.get();
            }
            l();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b8440d", new Object[]{this});
        } else if (!k()) {
            h(DefferReason.TIMEOUT_POLLING_SINGLE_TASK);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.b.toString();
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6985a9", new Object[]{this})).booleanValue();
        }
        fft<T, R> fftVar = this.d;
        if (fftVar == null || !((muo) fftVar).j()) {
            return false;
        }
        jdh.a("TaskSchedulerImpl", "WARNING, pollingTimeout due to timeout reached, please check the summary below:", new Object[0]);
        ((muo) this.d).i(this.b, this.e);
        h(DefferReason.TIMEOUT_POLLING_PERIOD);
        return true;
    }
}
