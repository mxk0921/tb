package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import tao.reactivex.d.d.e;
import tao.reactivex.d.e.b.a;
import tao.reactivex.d.e.b.c;
import tao.reactivex.d.e.b.j;
import tao.reactivex.d.e.b.m;
import tao.reactivex.d.e.b.p;
import tao.reactivex.d.e.b.q;
import tao.reactivex.d.e.b.r;
import tao.reactivex.d.e.b.s;
import tao.reactivex.d.h.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class l5y<T> implements m8y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097499);
        t2o.a(628097527);
    }

    public static int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        return jzx.a();
    }

    public static <T> l5y<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("96225991", new Object[0]);
        }
        return (l5y<T>) x7y.f31201a;
    }

    public static l5y<Long> f(long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("b5d55179", new Object[]{new Long(j), new Long(j2), timeUnit});
        }
        return g(j, j2, timeUnit, gay.a());
    }

    public static l5y<Long> g(long j, long j2, TimeUnit timeUnit, day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("631a1bcc", new Object[]{new Long(j), new Long(j2), timeUnit, dayVar});
        }
        wxx.b(timeUnit, "unit is null");
        wxx.b(dayVar, "scheduler is null");
        return new m(Math.max(0L, j), Math.max(0L, j2), timeUnit, dayVar);
    }

    public static l5y<Long> h(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("eb55e85", new Object[]{new Long(j), timeUnit});
        }
        return i(j, timeUnit, gay.a());
    }

    public static l5y<Long> i(long j, TimeUnit timeUnit, day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("858c4840", new Object[]{new Long(j), timeUnit, dayVar});
        }
        wxx.b(timeUnit, "unit is null");
        wxx.b(dayVar, "scheduler is null");
        return new s(Math.max(j, 0L), timeUnit, dayVar);
    }

    public static <T> l5y<T> l(Iterable<? extends T> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("ea76e09a", new Object[]{iterable});
        }
        wxx.b(iterable, "source is null");
        return new fay(iterable);
    }

    public static <T> l5y<T> m(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("94ebc76d", new Object[]{t});
        }
        wxx.b(t, "The item is null");
        return new a(t);
    }

    public static <T> l5y<T> n(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("c285dbb6", new Object[]{th});
        }
        wxx.b(th, "e is null");
        return o(gux.a(th));
    }

    public static <T> l5y<T> o(Callable<? extends Throwable> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("6c6525d2", new Object[]{callable});
        }
        wxx.b(callable, "errorSupplier is null");
        return new o8y(callable);
    }

    public static <T> l5y<T> x(t7y<T> t7yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("e4a3ed38", new Object[]{t7yVar});
        }
        wxx.b(t7yVar, "source is null");
        return new c(t7yVar);
    }

    public static <T> l5y<T> y(m8y<T> m8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("cc45c397", new Object[]{m8yVar});
        }
        wxx.b(m8yVar, "source is null");
        if (m8yVar instanceof l5y) {
            return (l5y) m8yVar;
        }
        return new nay(m8yVar);
    }

    public final l5y<T> A(day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("832b46b4", new Object[]{this, dayVar});
        }
        return B(dayVar, false, C());
    }

    public final l5y<T> B(day dayVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("322feca3", new Object[]{this, dayVar, new Boolean(z), new Integer(i)});
        }
        wxx.b(dayVar, "scheduler is null");
        wxx.a(i, "bufferSize");
        return new p(this, dayVar, z, i);
    }

    public final l5y<List<T>> D(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("9bf01006", new Object[]{this, new Long(j), timeUnit});
        }
        return j(j, timeUnit, gay.a(), Integer.MAX_VALUE);
    }

    public final l5y<T> E(long j, TimeUnit timeUnit, day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("be6ca8df", new Object[]{this, new Long(j), timeUnit, dayVar});
        }
        return H(i(j, timeUnit, dayVar));
    }

    public final l5y<T> F(vxx<? super sxx> vxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("bbb1e0e8", new Object[]{this, vxxVar});
        }
        return q(vxxVar, gux.f20250a);
    }

    public final <R> l5y<R> G(lzx<? super T, ? extends R> lzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("a353b747", new Object[]{this, lzxVar});
        }
        wxx.b(lzxVar, "mapper is null");
        return new gby(this, lzxVar);
    }

    public final <U> l5y<T> H(m8y<U> m8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("2d986036", new Object[]{this, m8yVar});
        }
        wxx.b(m8yVar, "other is null");
        return new i4y(this, m8yVar);
    }

    public final l5y<T> I(day dayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("e47de353", new Object[]{this, dayVar});
        }
        wxx.b(dayVar, "scheduler is null");
        return new r(this, dayVar);
    }

    public abstract void J(r9y<? super T> r9yVar);

    public final sxx K(vxx<? super T> vxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("9e208998", new Object[]{this, vxxVar});
        }
        return c(vxxVar, gux.b, gux.f20250a, gux.b());
    }

    public final l5y<T> L(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("292ac187", new Object[]{this, new Long(j), timeUnit});
        }
        return E(j, timeUnit, gay.a());
    }

    @Override // tb.m8y
    public final void a(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, r9yVar});
            return;
        }
        wxx.b(r9yVar, "observer is null");
        try {
            J(r9yVar);
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

    public final sxx b(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("4b8dc3e2", new Object[]{this, vxxVar, vxxVar2});
        }
        return c(vxxVar, vxxVar2, gux.f20250a, gux.b());
    }

    public final sxx c(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, vxx<? super sxx> vxxVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("8e8555e1", new Object[]{this, vxxVar, vxxVar2, fuxVar, vxxVar3});
        }
        wxx.b(vxxVar, "onNext is null");
        wxx.b(vxxVar2, "onError is null");
        wxx.b(fuxVar, "onComplete is null");
        wxx.b(vxxVar3, "onSubscribe is null");
        e eVar = new e(vxxVar, vxxVar2, fuxVar, vxxVar3);
        a(eVar);
        return eVar;
    }

    public final jzx<T> d(tao.reactivex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("76d8e6c0", new Object[]{this, aVar});
        }
        return new pzx(this).m();
    }

    public final l5y<List<T>> j(long j, TimeUnit timeUnit, day dayVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("1f54a1f5", new Object[]{this, new Long(j), timeUnit, dayVar, new Integer(i)});
        }
        return (l5y<List<T>>) k(j, timeUnit, dayVar, i, b.a(), false);
    }

    public final <U extends Collection<? super T>> l5y<U> k(long j, TimeUnit timeUnit, day dayVar, int i, Callable<U> callable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("d23facd8", new Object[]{this, new Long(j), timeUnit, dayVar, new Integer(i), callable, new Boolean(z)});
        }
        wxx.b(timeUnit, "unit is null");
        wxx.b(dayVar, "scheduler is null");
        wxx.b(callable, "bufferSupplier is null");
        wxx.a(i, "count");
        return new zxx(this, j, j, timeUnit, dayVar, callable, i, z);
    }

    public final l5y<T> p(vxx<? super Throwable> vxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("6493f009", new Object[]{this, vxxVar});
        }
        vxx<? super T> b = gux.b();
        fux fuxVar = gux.f20250a;
        return r(b, vxxVar, fuxVar, fuxVar);
    }

    public final l5y<T> q(vxx<? super sxx> vxxVar, fux fuxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("f6594032", new Object[]{this, vxxVar, fuxVar});
        }
        wxx.b(vxxVar, "onSubscribe is null");
        wxx.b(fuxVar, "onDispose is null");
        return new k6y(this, vxxVar, fuxVar);
    }

    public final l5y<T> r(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, fux fuxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("89bb45f1", new Object[]{this, vxxVar, vxxVar2, fuxVar, fuxVar2});
        }
        wxx.b(vxxVar, "onNext is null");
        wxx.b(vxxVar2, "onError is null");
        wxx.b(fuxVar, "onComplete is null");
        wxx.b(fuxVar2, "onAfterTerminate is null");
        return new p5y(this, vxxVar, vxxVar2, fuxVar, fuxVar2);
    }

    public final <R> l5y<R> s(lzx<? super T, ? extends m8y<? extends R>> lzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("4c35c668", new Object[]{this, lzxVar});
        }
        return t(lzxVar, false);
    }

    public final <R> l5y<R> t(lzx<? super T, ? extends m8y<? extends R>> lzxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("d62b669e", new Object[]{this, lzxVar, new Boolean(z)});
        }
        return u(lzxVar, z, Integer.MAX_VALUE);
    }

    public final <R> l5y<R> u(lzx<? super T, ? extends m8y<? extends R>> lzxVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("e2994f57", new Object[]{this, lzxVar, new Boolean(z), new Integer(i)});
        }
        return v(lzxVar, z, i, C());
    }

    public final <R> l5y<R> v(lzx<? super T, ? extends m8y<? extends R>> lzxVar, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("63e87dbe", new Object[]{this, lzxVar, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        wxx.b(lzxVar, "mapper is null");
        wxx.a(i, "maxConcurrency");
        wxx.a(i2, "bufferSize");
        if (!(this instanceof m5y)) {
            return new j(this, lzxVar, z, i, i2);
        }
        T call = ((m5y) this).call();
        if (call == null) {
            return e();
        }
        return q.a(call, lzxVar);
    }

    public final l5y<T> w(f4y<? super T> f4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("33d79cc7", new Object[]{this, f4yVar});
        }
        wxx.b(f4yVar, "predicate is null");
        return new z8y(this, f4yVar);
    }

    public final <R> l5y<R> z(i9y<? super T, ? extends R> i9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("b3e799f6", new Object[]{this, i9yVar});
        }
        return y(((i9y) wxx.b(i9yVar, "composer is null")).b(this));
    }
}
