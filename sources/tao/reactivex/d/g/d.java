package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.b.a;
import tb.e4y;
import tb.fux;
import tb.gux;
import tb.oux;
import tb.sxx;
import tb.t2o;
import tb.tzx;
import tb.uxx;
import tb.vxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class d<T> extends AtomicReference<tzx> implements sxx, e4y<T>, tzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vxx<? super T> f15443a;
    public final vxx<? super Throwable> b;
    public final fux c;
    public final vxx<? super tzx> d;

    static {
        t2o.a(628097480);
        t2o.a(628097368);
        t2o.a(628097386);
        t2o.a(628097526);
    }

    public d(vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, vxx<? super tzx> vxxVar3) {
        this.f15443a = vxxVar;
        this.b = vxxVar2;
        this.c = fuxVar;
        this.d = vxxVar3;
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/g/d");
    }

    @Override // tb.tzx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            g.a(this);
        }
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (get() == g.CANCELLED) {
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
            a();
        }
    }

    @Override // tb.cyx
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        tzx tzxVar = get();
        g gVar = g.CANCELLED;
        if (tzxVar != gVar) {
            lazySet(gVar);
            try {
                ((gux.a) this.c).a();
            } catch (Throwable th) {
                uxx.a(th);
                oux.a(th);
            }
        }
    }

    @Override // tb.cyx
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        tzx tzxVar = get();
        g gVar = g.CANCELLED;
        if (tzxVar != gVar) {
            lazySet(gVar);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                uxx.a(th2);
                oux.a(new a(th, th2));
            }
        } else {
            oux.a(th);
        }
    }

    @Override // tb.cyx
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (!b()) {
            try {
                this.f15443a.accept(t);
            } catch (Throwable th) {
                uxx.a(th);
                get().a();
                onError(th);
            }
        }
    }

    @Override // tb.cyx
    public void onSubscribe(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
        } else if (g.a((AtomicReference<tzx>) this, tzxVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                uxx.a(th);
                tzxVar.a();
                onError(th);
            }
        }
    }

    @Override // tb.tzx
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            get().a(j);
        }
    }
}
