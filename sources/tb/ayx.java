package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.g.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ayx<T, R> implements e4y<T>, g4y<R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cyx<? super R> f16083a;
    public tzx b;
    public g4y<T> c;
    public boolean d;

    static {
        t2o.a(628097478);
        t2o.a(628097386);
        t2o.a(628097401);
    }

    public ayx(cyx<? super R> cyxVar) {
        this.f16083a = cyxVar;
    }

    @Override // tb.tzx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public final void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        uxx.a(th);
        this.b.a();
        onError(th);
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
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // tb.cyx
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            this.f16083a.onComplete();
        }
    }

    @Override // tb.cyx
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d) {
            oux.a(th);
        } else {
            this.d = true;
            this.f16083a.onError(th);
        }
    }

    @Override // tb.cyx
    public final void onSubscribe(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
        } else if (g.a(this.b, tzxVar)) {
            this.b = tzxVar;
            if (tzxVar instanceof g4y) {
                this.c = (g4y) tzxVar;
            }
            if (f()) {
                this.f16083a.onSubscribe(this);
                g();
            }
        }
    }

    @Override // tb.tzx
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b.a(j);
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
}
