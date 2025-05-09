package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.d.a.a;
import tb.fux;
import tb.gux;
import tb.oux;
import tb.r9y;
import tb.sxx;
import tb.t2o;
import tb.uxx;
import tb.vxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class e<T> extends AtomicReference<sxx> implements sxx, r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vxx<? super T> f15426a;
    public final vxx<? super Throwable> b;
    public final fux c;
    public final vxx<? super sxx> d;

    static {
        t2o.a(628097409);
        t2o.a(628097368);
        t2o.a(628097533);
    }

    public e(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, vxx<? super sxx> vxxVar3) {
        this.f15426a = vxxVar;
        this.b = vxxVar2;
        this.c = fuxVar;
        this.d = vxxVar3;
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/d/e");
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (get() == a.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            a.a((AtomicReference<sxx>) this);
        }
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (!b()) {
            lazySet(a.DISPOSED);
            try {
                ((gux.a) this.c).a();
            } catch (Throwable th) {
                uxx.a(th);
                oux.a(th);
            }
        }
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (!b()) {
            lazySet(a.DISPOSED);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                uxx.a(th2);
                oux.a(new tao.reactivex.b.a(th, th2));
            }
        }
    }

    @Override // tb.r9y
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (!b()) {
            try {
                this.f15426a.accept(t);
            } catch (Throwable th) {
                uxx.a(th);
                get().b_();
                onError(th);
            }
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
        } else if (a.b(this, sxxVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                uxx.a(th);
                sxxVar.b_();
                onError(th);
            }
        }
    }
}
