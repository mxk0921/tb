package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.d.h.c;
import tao.reactivex.d.h.e;
import tb.i6y;
import tb.kux;
import tb.lzx;
import tb.m8y;
import tb.oux;
import tb.qzx;
import tb.r9y;
import tb.sng;
import tb.sxx;
import tb.t2o;
import tb.u7y;
import tb.uxx;
import tb.wxx;
import tb.xxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class j<T, U> extends kux<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lzx<? super T, ? extends m8y<? extends U>> d;
    public final boolean e;
    public final int f;
    public final int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T, U> extends AtomicReference<sxx> implements r9y<U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f15432a;
        public final b<T, U> b;
        public volatile boolean c;
        public volatile u7y<U> d;
        public int e;

        static {
            t2o.a(628097453);
            t2o.a(628097533);
        }

        public a(b<T, U> bVar, long j) {
            this.f15432a = j;
            this.b = bVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/j$a");
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                tao.reactivex.d.a.a.a(this);
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.c = true;
            this.b.c();
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.b.h.a(th)) {
                b<T, U> bVar = this.b;
                if (!bVar.c) {
                    bVar.f();
                }
                this.c = true;
                this.b.c();
            } else {
                oux.a(th);
            }
        }

        @Override // tb.r9y
        public void onNext(U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, u});
            } else if (this.e == 0) {
                this.b.a(u, this);
            } else {
                this.b.c();
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.b(this, sxxVar) && (sxxVar instanceof xxx)) {
                xxx xxxVar = (xxx) sxxVar;
                int a2 = xxxVar.a(7);
                if (a2 == 1) {
                    this.e = a2;
                    this.d = xxxVar;
                    this.c = true;
                    this.b.c();
                } else if (a2 == 2) {
                    this.e = a2;
                    this.d = xxxVar;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T, U> extends AtomicInteger implements sxx, r9y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a<?, ?>[] k = new a[0];
        public static final a<?, ?>[] l = new a[0];

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super U> f15433a;
        public final lzx<? super T, ? extends m8y<? extends U>> b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile i6y<U> f;
        public volatile boolean g;
        public final c h = new c();
        public volatile boolean i;
        public final AtomicReference<a<?, ?>[]> j;
        public sxx m;
        public long n;
        public long o;
        public int p;
        public Queue<m8y<? extends U>> q;
        public int r;

        static {
            t2o.a(628097454);
            t2o.a(628097368);
            t2o.a(628097533);
        }

        public b(r9y<? super U> r9yVar, lzx<? super T, ? extends m8y<? extends U>> lzxVar, boolean z, int i, int i2) {
            this.f15433a = r9yVar;
            this.b = lzxVar;
            this.c = z;
            this.d = i;
            this.e = i2;
            if (i != Integer.MAX_VALUE) {
                this.q = new ArrayDeque(i);
            }
            this.j = new AtomicReference<>(k);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/j$b");
        }

        public void a(U u, a<T, U> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78d16ab5", new Object[]{this, u, aVar});
                return;
            }
            if (get() != 0 || !compareAndSet(0, 1)) {
                u7y u7yVar = aVar.d;
                if (u7yVar == null) {
                    u7yVar = new qzx(this.e);
                    aVar.d = u7yVar;
                }
                u7yVar.a(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f15433a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            d();
        }

        public void b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1dfacb0", new Object[]{this, aVar});
                return;
            }
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (aVarArr[i] == aVar) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = k;
                        } else {
                            a<?, ?>[] aVarArr3 = new a[length - 1];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!sng.a(this.j, aVarArr, aVarArr2));
        }

        @Override // tb.sxx
        public void b_() {
            Throwable a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.i) {
                this.i = true;
                if (f() && (a2 = this.h.a()) != null && a2 != e.f15447a) {
                    oux.a(a2);
                }
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (getAndIncrement() == 0) {
                d();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
            if (r11 != null) goto L_0x009b;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tao.reactivex.d.e.b.j.b.d():void");
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
            }
            if (this.i) {
                return true;
            }
            Throwable th = this.h.get();
            if (this.c || th == null) {
                return false;
            }
            f();
            Throwable a2 = this.h.a();
            if (a2 != e.f15447a) {
                this.f15433a.onError(a2);
            }
            return true;
        }

        public boolean f() {
            a<?, ?>[] andSet;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            this.m.b_();
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = l;
            if (aVarArr == aVarArr2 || (andSet = this.j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (!this.g) {
                this.g = true;
                c();
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.g) {
                oux.a(th);
            } else if (this.h.a(th)) {
                this.g = true;
                c();
            } else {
                oux.a(th);
            }
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.g) {
                try {
                    m8y<? extends U> m8yVar = (m8y) wxx.b(this.b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            try {
                                int i = this.r;
                                if (i == this.d) {
                                    this.q.offer(m8yVar);
                                    return;
                                }
                                this.r = i + 1;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    a(m8yVar);
                } catch (Throwable th2) {
                    uxx.a(th2);
                    this.m.b_();
                    onError(th2);
                }
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.m, sxxVar)) {
                this.m = sxxVar;
                this.f15433a.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [tb.u7y] */
        public void a(Callable<? extends U> callable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d29daa9", new Object[]{this, callable});
                return;
            }
            try {
                Object call = callable.call();
                if (call != null) {
                    if (get() != 0 || !compareAndSet(0, 1)) {
                        i6y<U> i6yVar = this.f;
                        i6y<U> i6yVar2 = i6yVar;
                        if (i6yVar == null) {
                            i6y<U> qzxVar = this.d == Integer.MAX_VALUE ? new qzx(this.e) : new tao.reactivex.d.f.b(this.d);
                            this.f = qzxVar;
                            i6yVar2 = qzxVar;
                        }
                        if (!i6yVar2.a(call)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                    } else {
                        this.f15433a.onNext(call);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                    d();
                }
            } catch (Throwable th) {
                uxx.a(th);
                this.h.a(th);
                c();
            }
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
        }

        public void a(m8y<? extends U> m8yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aac0a26e", new Object[]{this, m8yVar});
                return;
            }
            while (m8yVar instanceof Callable) {
                a((Callable) m8yVar);
                if (this.d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            m8yVar = this.q.poll();
                            if (m8yVar == null) {
                                this.r--;
                                return;
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            }
            long j = this.n;
            this.n = 1 + j;
            a<T, U> aVar = new a<>(this, j);
            if (a(aVar)) {
                m8yVar.a(aVar);
            }
        }

        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1330115", new Object[]{this, aVar})).booleanValue();
            }
            do {
                aVarArr = this.j.get();
                if (aVarArr == l) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!sng.a(this.j, aVarArr, aVarArr2));
            return true;
        }
    }

    static {
        t2o.a(628097452);
    }

    public j(m8y<T> m8yVar, lzx<? super T, ? extends m8y<? extends U>> lzxVar, boolean z, int i, int i2) {
        super(m8yVar);
        this.d = lzxVar;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/j");
    }

    @Override // tb.l5y
    public void J(r9y<? super U> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else if (!q.b(this.c, r9yVar, this.d)) {
            this.c.a(new b(r9yVar, this.d, this.e, this.f, this.g));
        }
    }
}
