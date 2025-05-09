package tb;

import android.os.Handler;
import android.os.Looper;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aet implements pzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f15697a;
    public boolean c;
    public Handler e;
    public final qqt b = new o77();
    public ContainerType d = ContainerType.KSerial;

    static {
        t2o.a(1029701668);
        t2o.a(1029701654);
    }

    public static final void m(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d278d7a6", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public static final void n(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e620ab27", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public static final void o(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5110602", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public static final void p(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b8d983", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public static final void q(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e376668", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    @Override // tb.pzf
    public void a(final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3582568d", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "task");
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new Runnable() { // from class: tb.sdt
                @Override // java.lang.Runnable
                public final void run() {
                    aet.q(d1a.this);
                }
            });
        }
    }

    @Override // tb.pzf
    public void b(double d, final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2fde58", new Object[]{this, new Double(d), d1aVar});
            return;
        }
        ckf.g(d1aVar, "task");
        if (j() == ContainerType.KMain) {
            Handler handler = this.e;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: tb.tdt
                    @Override // java.lang.Runnable
                    public final void run() {
                        aet.o(d1a.this);
                    }
                }, (long) d);
                return;
            }
            return;
        }
        ExecutorService k = k();
        ckf.e(k, "null cannot be cast to non-null type java.util.concurrent.ScheduledThreadPoolExecutor");
        ((ScheduledThreadPoolExecutor) k).schedule(new Runnable() { // from class: tb.udt
            @Override // java.lang.Runnable
            public final void run() {
                aet.p(d1a.this);
            }
        }, (long) d, TimeUnit.MILLISECONDS);
    }

    @Override // tb.pzf
    public void d(final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5508f64d", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "task");
        if (j() == ContainerType.KMain) {
            Handler handler = this.e;
            if (handler != null) {
                handler.post(new Runnable() { // from class: tb.qdt
                    @Override // java.lang.Runnable
                    public final void run() {
                        aet.m(d1a.this);
                    }
                });
                return;
            }
            return;
        }
        k().execute(new Runnable() { // from class: tb.rdt
            @Override // java.lang.Runnable
            public final void run() {
                aet.n(d1a.this);
            }
        });
    }

    public final ContainerType j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerType) ipChange.ipc$dispatch("a99a8103", new Object[]{this});
        }
        return this.d;
    }

    public final ExecutorService k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("992aaecb", new Object[]{this});
        }
        if (j() == ContainerType.KMain || this.f15697a != null) {
            ExecutorService executorService = this.f15697a;
            if (executorService != null) {
                return executorService;
            }
            ckf.y(BaseExecutor.EXECUTOR_SUFFIX);
            throw null;
        }
        throw new IllegalStateException("ExecutorService is not initialized, please invoke func createContainer");
    }

    public final aet l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aet) ipChange.ipc$dispatch("b8cc4b63", new Object[]{this});
        }
        return this;
    }

    @Override // tb.pzf
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        if (!this.c) {
            ExecutorService executorService = this.f15697a;
            if (executorService != null) {
                if (executorService != null) {
                    executorService.shutdown();
                } else {
                    ckf.y(BaseExecutor.EXECUTOR_SUFFIX);
                    throw null;
                }
            }
            this.c = true;
        }
        Handler handler = this.e;
        if (handler != null) {
            ckf.d(handler);
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
    }

    @Override // tb.pzf
    public void c(String str, ContainerType containerType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b99fd4", new Object[]{this, str, containerType, new Integer(i)});
            return;
        }
        ckf.g(str, "label");
        ckf.g(containerType, "type");
        this.d = containerType;
        if (containerType == ContainerType.KSerial) {
            this.f15697a = VExecutors.newScheduledThreadPool(1, this.b);
        } else if (containerType == ContainerType.KParallel || containerType == ContainerType.KGlobal) {
            this.f15697a = VExecutors.newScheduledThreadPool(i, this.b);
        } else {
            this.e = new Handler(Looper.getMainLooper());
        }
    }
}
