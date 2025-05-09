package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.a.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class iux<T, R> implements xxx<R>, r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r9y<? super R> f21593a;
    public sxx b;
    public xxx<T> c;
    public boolean d;
    public int e;

    static {
        t2o.a(628097405);
        t2o.a(628097399);
        t2o.a(628097533);
    }

    public iux(r9y<? super R> r9yVar) {
        this.f21593a = r9yVar;
    }

    public final void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        uxx.a(th);
        this.b.b_();
        onError(th);
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        xxx<T> xxxVar = this.c;
        if (xxxVar == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = xxxVar.a(i);
        if (a2 != 0) {
            this.e = a2;
        }
        return a2;
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            this.b.b_();
        }
    }

    @Override // tb.u7y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.c.d();
    }

    @Override // tb.u7y
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.e();
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            this.f21593a.onComplete();
        }
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d) {
            oux.a(th);
        } else {
            this.d = true;
            this.f21593a.onError(th);
        }
    }

    @Override // tb.r9y
    public final void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
        } else if (a.a(this.b, sxxVar)) {
            this.b = sxxVar;
            if (sxxVar instanceof xxx) {
                this.c = (xxx) sxxVar;
            }
            if (f()) {
                this.f21593a.onSubscribe(this);
                g();
            }
        }
    }

    @Override // tb.u7y
    public final boolean a(R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, r})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.b();
    }
}
