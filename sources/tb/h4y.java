package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.a.a;
import tao.reactivex.d.a.b;
import tb.gux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h4y<T> implements sxx, r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r9y<? super T> f20413a;
    public final vxx<? super sxx> b;
    public final fux c;
    public sxx d;

    static {
        t2o.a(628097408);
        t2o.a(628097368);
        t2o.a(628097533);
    }

    public h4y(r9y<? super T> r9yVar, vxx<? super sxx> vxxVar, fux fuxVar) {
        this.f20413a = r9yVar;
        this.b = vxxVar;
        this.c = fuxVar;
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.d.b();
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        try {
            ((gux.a) this.c).a();
        } catch (Throwable th) {
            uxx.a(th);
            oux.a(th);
        }
        this.d.b_();
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.d != a.DISPOSED) {
            this.f20413a.onComplete();
        }
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d != a.DISPOSED) {
            this.f20413a.onError(th);
        } else {
            oux.a(th);
        }
    }

    @Override // tb.r9y
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else {
            this.f20413a.onNext(t);
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            return;
        }
        try {
            this.b.accept(sxxVar);
            if (a.a(this.d, sxxVar)) {
                this.d = sxxVar;
                this.f20413a.onSubscribe(this);
            }
        } catch (Throwable th) {
            uxx.a(th);
            sxxVar.b_();
            this.d = a.DISPOSED;
            b.a(th, this.f20413a);
        }
    }
}
