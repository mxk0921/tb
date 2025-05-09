package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.day;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zxx<T, U extends Collection<? super T>> extends kux<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long d;
    public final long e;
    public final TimeUnit f;
    public final day g;
    public final Callable<U> h;
    public final int i;
    public final boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T, U extends Collection<? super T>> extends v7y<T, U, U> implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final TimeUnit i;
        public final day.c l;
        public sxx n;
        public sxx o;
        public final int p;
        public final boolean q;
        public U r;
        public long s;
        public long t;

        static {
            t2o.a(628097435);
            t2o.a(628097368);
        }

        public a(r9y<? super U> r9yVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, day.c cVar) {
            super(r9yVar, new tao.reactivex.d.f.a());
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.p = i;
            this.q = z;
            this.l = cVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/b$a");
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.d) {
                this.d = true;
                this.o.b_();
                this.l.b_();
                synchronized (this) {
                    this.r = null;
                }
            }
        }

        /* renamed from: g */
        public void a(r9y<? super U> r9yVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, r9yVar, u});
            } else {
                r9yVar.onNext(u);
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.l.b_();
            synchronized (this) {
                u = this.r;
                this.r = null;
            }
            this.c.a(u);
            this.e = true;
            if (e()) {
                j6y.a(this.c, this.b, false, this, this);
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            synchronized (this) {
                this.r = null;
            }
            this.b.onError(th);
            this.l.b_();
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                try {
                    U u = this.r;
                    if (u != null) {
                        u.add(t);
                        if (u.size() >= this.p) {
                            this.r = null;
                            this.s++;
                            if (this.q) {
                                this.n.b_();
                            }
                            c(u, false, this);
                            try {
                                U u2 = (U) ((Collection) wxx.b(this.g.call(), "The buffer supplied is null"));
                                synchronized (this) {
                                    this.r = u2;
                                    this.t++;
                                }
                                if (this.q) {
                                    day.c cVar = this.l;
                                    long j = this.h;
                                    this.n = cVar.c(this, j, j, this.i);
                                }
                            } catch (Throwable th) {
                                uxx.a(th);
                                this.b.onError(th);
                                b_();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.o, sxxVar)) {
                this.o = sxxVar;
                try {
                    this.r = (U) ((Collection) wxx.b(this.g.call(), "The buffer supplied is null"));
                    this.b.onSubscribe(this);
                    day.c cVar = this.l;
                    long j = this.h;
                    this.n = cVar.c(this, j, j, this.i);
                } catch (Throwable th) {
                    uxx.a(th);
                    sxxVar.b_();
                    tao.reactivex.d.a.b.a(th, this.b);
                    this.l.b_();
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
            try {
                U u = (U) ((Collection) wxx.b(this.g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    U u2 = this.r;
                    if (u2 != null && this.s == this.t) {
                        this.r = u;
                        c(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                uxx.a(th);
                b_();
                this.b.onError(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T, U extends Collection<? super T>> extends v7y<T, U, U> implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final TimeUnit i;
        public final day j;
        public sxx k;
        public U p;
        public final AtomicReference<sxx> q = new AtomicReference<>();

        static {
            t2o.a(628097436);
            t2o.a(628097368);
        }

        public b(r9y<? super U> r9yVar, Callable<U> callable, long j, TimeUnit timeUnit, day dayVar) {
            super(r9yVar, new tao.reactivex.d.f.a());
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.j = dayVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/b$b");
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (this.q.get() == tao.reactivex.d.a.a.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
                return;
            }
            tao.reactivex.d.a.a.a(this.q);
            this.k.b_();
        }

        /* renamed from: g */
        public void a(r9y<? super U> r9yVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, r9yVar, u});
            } else {
                this.b.onNext(u);
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            synchronized (this) {
                u = this.p;
                this.p = null;
            }
            if (u != null) {
                this.c.a(u);
                this.e = true;
                if (e()) {
                    j6y.a(this.c, this.b, false, null, this);
                }
            }
            tao.reactivex.d.a.a.a(this.q);
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            synchronized (this) {
                this.p = null;
            }
            this.b.onError(th);
            tao.reactivex.d.a.a.a(this.q);
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                try {
                    U u = this.p;
                    if (u != null) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.k, sxxVar)) {
                this.k = sxxVar;
                try {
                    this.p = (U) ((Collection) wxx.b(this.g.call(), "The buffer supplied is null"));
                    this.b.onSubscribe(this);
                    if (!this.d) {
                        day dayVar = this.j;
                        long j = this.h;
                        sxx b = dayVar.b(this, j, j, this.i);
                        if (!sng.a(this.q, null, b)) {
                            b.b_();
                        }
                    }
                } catch (Throwable th) {
                    uxx.a(th);
                    b_();
                    tao.reactivex.d.a.b.a(th, this.b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                U u2 = (U) ((Collection) wxx.b(this.g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    try {
                        u = this.p;
                        if (u != null) {
                            this.p = u2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (u == null) {
                    tao.reactivex.d.a.a.a(this.q);
                } else {
                    b(u, false, this);
                }
            } catch (Throwable th2) {
                uxx.a(th2);
                this.b.onError(th2);
                b_();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c<T, U extends Collection<? super T>> extends v7y<T, U, U> implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Callable<U> g;
        public final long h;
        public final long i;
        public final day.c k;
        public sxx m;
        public final TimeUnit p;
        public final List<U> q = new LinkedList();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final U f33092a;

            static {
                t2o.a(628097438);
            }

            public a(U u) {
                this.f33092a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (c.this) {
                    c.this.q.remove(this.f33092a);
                }
                c cVar = c.this;
                c.g(cVar, this.f33092a, false, cVar.k);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final U f33093a;

            static {
                t2o.a(628097439);
            }

            public b(U u) {
                this.f33093a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (c.this) {
                    c.this.q.remove(this.f33093a);
                }
                c cVar = c.this;
                c.i(cVar, this.f33093a, false, cVar.k);
            }
        }

        static {
            t2o.a(628097437);
            t2o.a(628097368);
        }

        public c(r9y<? super U> r9yVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, day.c cVar) {
            super(r9yVar, new tao.reactivex.d.f.a());
            this.g = callable;
            this.h = j;
            this.i = j2;
            this.p = timeUnit;
            this.k = cVar;
        }

        public static /* synthetic */ void g(c cVar, Object obj, boolean z, sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b93be129", new Object[]{cVar, obj, new Boolean(z), sxxVar});
            } else {
                cVar.c(obj, z, sxxVar);
            }
        }

        public static /* synthetic */ void i(c cVar, Object obj, boolean z, sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55a9dd88", new Object[]{cVar, obj, new Boolean(z), sxxVar});
            } else {
                cVar.c(obj, z, sxxVar);
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/b$c");
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.d) {
                this.d = true;
                j();
                this.m.b_();
                this.k.b_();
            }
        }

        /* renamed from: h */
        public void a(r9y<? super U> r9yVar, U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38086fdd", new Object[]{this, r9yVar, u});
            } else {
                r9yVar.onNext(u);
            }
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.q.clear();
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            ArrayList arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.q);
                this.q.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.a((Collection) it.next());
            }
            this.e = true;
            if (e()) {
                j6y.a(this.c, this.b, false, this.k, this);
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.e = true;
            j();
            this.b.onError(th);
            this.k.b_();
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                return;
            }
            synchronized (this) {
                try {
                    for (U u : this.q) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.m, sxxVar)) {
                this.m = sxxVar;
                try {
                    Collection collection = (Collection) wxx.b(this.g.call(), "The buffer supplied is null");
                    this.q.add(collection);
                    this.b.onSubscribe(this);
                    day.c cVar = this.k;
                    long j = this.i;
                    cVar.c(this, j, j, this.p);
                    this.k.d(new b(collection), this.h, this.p);
                } catch (Throwable th) {
                    uxx.a(th);
                    sxxVar.b_();
                    tao.reactivex.d.a.b.a(th, this.b);
                    this.k.b_();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.d) {
                try {
                    Collection collection = (Collection) wxx.b(this.g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        try {
                            if (!this.d) {
                                this.q.add(collection);
                                this.k.d(new a(collection), this.h, this.p);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    uxx.a(th2);
                    this.b.onError(th2);
                    b_();
                }
            }
        }
    }

    static {
        t2o.a(628097434);
    }

    public zxx(m8y<T> m8yVar, long j, long j2, TimeUnit timeUnit, day dayVar, Callable<U> callable, int i, boolean z) {
        super(m8yVar);
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
        this.g = dayVar;
        this.h = callable;
        this.i = i;
        this.j = z;
    }

    public static /* synthetic */ Object ipc$super(zxx zxxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/b");
    }

    @Override // tb.l5y
    public void J(r9y<? super U> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else if (this.d == this.e && this.i == Integer.MAX_VALUE) {
            this.c.a(new b(new eay(r9yVar), this.h, this.d, this.f, this.g));
        } else {
            day.c d = this.g.d();
            int i = (this.d > this.e ? 1 : (this.d == this.e ? 0 : -1));
            m8y<T> m8yVar = this.c;
            if (i == 0) {
                m8yVar.a(new a(new eay(r9yVar), this.h, this.d, this.f, this.i, this.j, d));
            } else {
                m8yVar.a(new c(new eay(r9yVar), this.h, this.d, this.e, this.f, d));
            }
        }
    }
}
