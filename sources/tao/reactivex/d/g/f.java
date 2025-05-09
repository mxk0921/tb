package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.d.h.c;
import tb.cyx;
import tb.e4y;
import tb.m6y;
import tb.t2o;
import tb.tzx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f<T> extends AtomicInteger implements e4y<T>, tzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cyx<? super T> f15444a;
    public final c b = new c();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference<tzx> d = new AtomicReference<>();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    static {
        t2o.a(628097482);
        t2o.a(628097386);
        t2o.a(628097526);
    }

    public f(cyx<? super T> cyxVar) {
        this.f15444a = cyxVar;
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/g/f");
    }

    @Override // tb.tzx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f) {
            g.a(this.d);
        }
    }

    @Override // tb.cyx
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        this.f = true;
        m6y.c(this.f15444a, this, this.b);
    }

    @Override // tb.cyx
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        this.f = true;
        m6y.b(this.f15444a, th, this, this.b);
    }

    @Override // tb.cyx
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else {
            m6y.a(this.f15444a, t, this, this.b);
        }
    }

    @Override // tb.cyx
    public void onSubscribe(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
        } else if (this.e.compareAndSet(false, true)) {
            this.f15444a.onSubscribe(this);
            g.a(this.d, this.c, tzxVar);
        } else {
            tzxVar.a();
            a();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // tb.tzx
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
            a();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
        } else {
            g.a(this.d, this.c, j);
        }
    }
}
