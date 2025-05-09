package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.e.a.d$a;
import tao.reactivex.d.e.a.f;
import tao.reactivex.d.e.a.h;
import tao.reactivex.d.g.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class jzx<T> implements pux<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f22315a = Math.max(1, s15.d().b());

    static {
        t2o.a(628097381);
        t2o.a(628097524);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        return f22315a;
    }

    public final sxx b(vxx<? super T> vxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("8f561f5a", new Object[]{this, vxxVar});
        }
        return c(vxxVar, gux.b, gux.f20250a, d$a.INSTANCE);
    }

    public final sxx c(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, vxx<? super tzx> vxxVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("8e8555e1", new Object[]{this, vxxVar, vxxVar2, fuxVar, vxxVar3});
        }
        wxx.b(vxxVar, "onNext is null");
        wxx.b(vxxVar2, "onError is null");
        wxx.b(fuxVar, "onComplete is null");
        wxx.b(vxxVar3, "onSubscribe is null");
        d dVar = new d(vxxVar, vxxVar2, fuxVar, vxxVar3);
        j(dVar);
        return dVar;
    }

    public final jzx<T> d(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("39491a46", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        wxx.a(i, "bufferSize");
        return new f(this, i, z2, z, gux.f20250a);
    }

    public final <R> jzx<R> e(lzx<? super T, ? extends R> lzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("4c35c62a", new Object[]{this, lzxVar});
        }
        wxx.b(lzxVar, "mapper is null");
        return new n5y(this, lzxVar);
    }

    public final jzx<T> f(f4y<? super T> f4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("33d79c89", new Object[]{this, f4yVar});
        }
        wxx.b(f4yVar, "predicate is null");
        return new yxx(this, f4yVar);
    }

    public final jzx<T> g(day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("832b4676", new Object[]{this, dayVar});
        }
        wxx.b(dayVar, "scheduler is null");
        return h(dayVar, true);
    }

    public final jzx<T> h(day dayVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("7de5ef94", new Object[]{this, dayVar, new Boolean(z)});
        }
        wxx.b(dayVar, "scheduler is null");
        return new h(this, dayVar, z);
    }

    public final void i(cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadd555c", new Object[]{this, cyxVar});
        } else if (cyxVar instanceof e4y) {
            j((e4y) cyxVar);
        } else {
            wxx.b(cyxVar, "s is null");
            j(new tao.reactivex.d.g.f(cyxVar));
        }
    }

    public final void j(e4y<? super T> e4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabed0f2", new Object[]{this, e4yVar});
            return;
        }
        wxx.b(e4yVar, "s is null");
        try {
            wxx.b(e4yVar, "Plugin returned null Subscriber");
            l(e4yVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            uxx.a(th);
            oux.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final jzx<T> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("a2bb4ed4", new Object[]{this});
        }
        return new w7y(this);
    }

    public abstract void l(cyx<? super T> cyxVar);

    public final jzx<T> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("af544455", new Object[]{this});
        }
        return d(a(), false, true);
    }
}
