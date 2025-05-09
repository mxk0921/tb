package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.d.g.g;
import tb.cyx;
import tb.day;
import tb.e4y;
import tb.jux;
import tb.jzx;
import tb.k4y;
import tb.pux;
import tb.t2o;
import tb.tzx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h<T> extends jux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final day c;
    public final boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends AtomicReference<Thread> implements Runnable, e4y<T>, tzx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cyx<? super T> f15429a;
        public final day.c b;
        public final AtomicReference<tzx> c = new AtomicReference<>();
        public final AtomicLong d = new AtomicLong();
        public final boolean e;
        public pux<T> f;

        /* compiled from: Taobao */
        /* renamed from: tao.reactivex.d.e.a.h$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class RunnableC0870a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final tzx f15430a;
            private final long b;

            static {
                t2o.a(628097432);
            }

            public RunnableC0870a(tzx tzxVar, long j) {
                this.f15430a = tzxVar;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f15430a.a(this.b);
                }
            }
        }

        static {
            t2o.a(628097431);
            t2o.a(628097386);
            t2o.a(628097526);
        }

        public a(cyx<? super T> cyxVar, day.c cVar, pux<T> puxVar, boolean z) {
            this.f15429a = cyxVar;
            this.b = cVar;
            this.f = puxVar;
            this.e = !z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/h$a");
        }

        @Override // tb.tzx
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            g.a(this.c);
            this.b.b_();
        }

        @Override // tb.cyx
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.f15429a.onComplete();
            this.b.b_();
        }

        @Override // tb.cyx
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.f15429a.onError(th);
            this.b.b_();
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else {
                this.f15429a.onNext(t);
            }
        }

        @Override // tb.cyx
        public void onSubscribe(tzx tzxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f24cb1", new Object[]{this, tzxVar});
            } else if (g.a(this.c, tzxVar)) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, tzxVar);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lazySet(Thread.currentThread());
            pux<T> puxVar = this.f;
            this.f = null;
            ((jzx) puxVar).i(this);
        }

        @Override // tb.tzx
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else if (g.b(j)) {
                tzx tzxVar = this.c.get();
                if (tzxVar != null) {
                    a(j, tzxVar);
                    return;
                }
                k4y.b(this.d, j);
                tzx tzxVar2 = this.c.get();
                if (tzxVar2 != null) {
                    long andSet = this.d.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, tzxVar2);
                    }
                }
            }
        }

        public void a(long j, tzx tzxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd74b247", new Object[]{this, new Long(j), tzxVar});
            } else if (this.e || Thread.currentThread() == get()) {
                tzxVar.a(j);
            } else {
                this.b.b(new RunnableC0870a(tzxVar, j));
            }
        }
    }

    static {
        t2o.a(628097430);
    }

    public h(jzx<T> jzxVar, day dayVar, boolean z) {
        super(jzxVar);
        this.c = dayVar;
        this.h = z;
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/h");
    }

    @Override // tb.jzx
    public void l(cyx<? super T> cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dee43b", new Object[]{this, cyxVar});
            return;
        }
        day.c d = this.c.d();
        a aVar = new a(cyxVar, d, this.b, this.h);
        cyxVar.onSubscribe(aVar);
        d.b(aVar);
    }
}
