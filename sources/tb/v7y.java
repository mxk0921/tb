package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class v7y<T, U, V> extends j9y implements p8y<U, V>, r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final r9y<? super V> b;
    public final i6y<U> c;
    public volatile boolean d;
    public volatile boolean e;
    public Throwable f;

    static {
        t2o.a(628097411);
        t2o.a(628097496);
        t2o.a(628097533);
    }

    public v7y(r9y<? super V> r9yVar, i6y<U> i6yVar) {
        this.b = r9yVar;
        this.c = i6yVar;
    }

    public static /* synthetic */ Object ipc$super(v7y v7yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/d/g");
    }

    @Override // tb.p8y
    public final int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : this.f27895a.addAndGet(i);
    }

    public final void b(U u, boolean z, sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f9f3fa", new Object[]{this, u, new Boolean(z), sxxVar});
            return;
        }
        r9y<? super V> r9yVar = this.b;
        i6y<U> i6yVar = this.c;
        if (this.f27895a.get() != 0 || !this.f27895a.compareAndSet(0, 1)) {
            i6yVar.a(u);
            if (!e()) {
                return;
            }
        } else {
            a(r9yVar, u);
            if (a(-1) == 0) {
                return;
            }
        }
        j6y.a(i6yVar, r9yVar, z, sxxVar, this);
    }

    public final void c(U u, boolean z, sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3b62bb", new Object[]{this, u, new Boolean(z), sxxVar});
            return;
        }
        r9y<? super V> r9yVar = this.b;
        i6y<U> i6yVar = this.c;
        if (this.f27895a.get() != 0 || !this.f27895a.compareAndSet(0, 1)) {
            i6yVar.a(u);
            if (!e()) {
                return;
            }
        } else if (i6yVar.d()) {
            a(r9yVar, u);
            if (a(-1) == 0) {
                return;
            }
        } else {
            i6yVar.a(u);
        }
        j6y.a(i6yVar, r9yVar, z, sxxVar, this);
    }

    @Override // tb.p8y
    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.f27895a.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.p8y
    public final Throwable f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("f01fe52", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.p8y
    public void a(r9y<? super V> r9yVar, U u) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee218808", new Object[]{this, r9yVar, u});
        }
    }

    @Override // tb.p8y
    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }
}
