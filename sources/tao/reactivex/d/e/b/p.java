package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.d.b;
import tb.day;
import tb.kux;
import tb.m8y;
import tb.oux;
import tb.qzx;
import tb.r9y;
import tb.sxx;
import tb.t2o;
import tb.u7y;
import tb.uxx;
import tb.xxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class p<T> extends kux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final day d;
    public final boolean e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends b<T> implements Runnable, r9y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f15435a;
        public final day.c b;
        public final boolean c;
        public final int d;
        public u7y<T> e;
        public sxx f;
        public Throwable g;
        public volatile boolean h;
        public volatile boolean i;
        public int j;
        public boolean k;

        static {
            t2o.a(628097464);
            t2o.a(628097533);
        }

        public a(r9y<? super T> r9yVar, day.c cVar, boolean z, int i) {
            this.f15435a = r9yVar;
            this.b = cVar;
            this.c = z;
            this.d = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/p$a");
        }

        @Override // tao.reactivex.d.d.b, tb.nzx
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 2) == 0) {
                return 0;
            }
            this.k = true;
            return 2;
        }

        @Override // tao.reactivex.d.d.b, tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        @Override // tao.reactivex.d.d.b, tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (!this.i) {
                this.i = true;
                this.f.b_();
                this.b.b_();
                if (getAndIncrement() == 0) {
                    this.e.e();
                }
            }
        }

        @Override // tao.reactivex.d.d.b, tb.u7y
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            return this.e.c();
        }

        @Override // tao.reactivex.d.d.b, tb.u7y
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            return this.e.d();
        }

        @Override // tao.reactivex.d.d.b, tb.u7y
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.e.e();
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }

        public void g() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            u7y<T> u7yVar = this.e;
            r9y<? super T> r9yVar = this.f15435a;
            int i = 1;
            while (!a(this.h, u7yVar.d(), r9yVar)) {
                while (true) {
                    boolean z2 = this.h;
                    try {
                        Object obj = (T) u7yVar.c();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!a(z2, z, r9yVar)) {
                            if (z) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                r9yVar.onNext(obj);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        uxx.a(th);
                        this.f.b_();
                        u7yVar.e();
                        r9yVar.onError(th);
                        this.b.b_();
                        return;
                    }
                }
            }
        }

        public void h() {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            while (!this.i) {
                boolean z = this.h;
                Throwable th = this.g;
                if (this.c || !z || th == null) {
                    this.f15435a.onNext(null);
                    if (z) {
                        Throwable th2 = this.g;
                        if (th2 != null) {
                            this.f15435a.onError(th2);
                        } else {
                            this.f15435a.onComplete();
                        }
                        this.b.b_();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f15435a.onError(th);
                    this.b.b_();
                    return;
                }
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (!this.h) {
                this.h = true;
                f();
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.h) {
                oux.a(th);
            } else {
                this.g = th;
                this.h = true;
                f();
            }
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.h) {
                if (this.j != 2) {
                    this.e.a(t);
                }
                f();
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.f, sxxVar)) {
                this.f = sxxVar;
                if (sxxVar instanceof xxx) {
                    xxx xxxVar = (xxx) sxxVar;
                    int a2 = xxxVar.a(7);
                    if (a2 == 1) {
                        this.j = a2;
                        this.e = xxxVar;
                        this.h = true;
                        this.f15435a.onSubscribe(this);
                        f();
                        return;
                    } else if (a2 == 2) {
                        this.j = a2;
                        this.e = xxxVar;
                        this.f15435a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new qzx(this.d);
                this.f15435a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.k) {
                h();
            } else {
                g();
            }
        }

        public boolean a(boolean z, boolean z2, r9y<? super T> r9yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f061bab0", new Object[]{this, new Boolean(z), new Boolean(z2), r9yVar})).booleanValue();
            }
            if (this.i) {
                this.e.e();
                return true;
            }
            if (z) {
                Throwable th = this.g;
                if (this.c) {
                    if (z2) {
                        if (th != null) {
                            r9yVar.onError(th);
                        } else {
                            r9yVar.onComplete();
                        }
                        this.b.b_();
                        return true;
                    }
                } else if (th != null) {
                    this.e.e();
                    r9yVar.onError(th);
                    this.b.b_();
                    return true;
                } else if (z2) {
                    r9yVar.onComplete();
                    this.b.b_();
                    return true;
                }
            }
            return false;
        }
    }

    static {
        t2o.a(628097463);
    }

    public p(m8y<T> m8yVar, day dayVar, boolean z, int i) {
        super(m8yVar);
        this.d = dayVar;
        this.e = z;
        this.f = i;
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/p");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(new a(r9yVar, this.d.d(), this.e, this.f));
        }
    }
}
