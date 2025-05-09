package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.a.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class i4y<T, U> extends l5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final m8y<? extends T> c;
    public final m8y<U> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a implements r9y<U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d f21095a;
        public final r9y<? super T> b;
        public boolean c;

        /* compiled from: Taobao */
        /* renamed from: tb.i4y$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class C0941a implements r9y<T> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(628097444);
                t2o.a(628097533);
            }

            public C0941a() {
            }

            @Override // tb.r9y
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    a.this.b.onComplete();
                }
            }

            @Override // tb.r9y
            public void onError(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                } else {
                    a.this.b.onError(th);
                }
            }

            @Override // tb.r9y
            public void onNext(T t) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
                } else {
                    a.this.b.onNext(t);
                }
            }

            @Override // tb.r9y
            public void onSubscribe(sxx sxxVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
                } else {
                    a.this.f21095a.a(sxxVar);
                }
            }
        }

        static {
            t2o.a(628097443);
            t2o.a(628097533);
        }

        public a(d dVar, r9y<? super T> r9yVar) {
            this.f21095a = dVar;
            this.b = r9yVar;
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                i4y.this.c.a(new C0941a());
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.c) {
                oux.a(th);
            } else {
                this.c = true;
                this.b.onError(th);
            }
        }

        @Override // tb.r9y
        public void onNext(U u) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, u});
            } else {
                onComplete();
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else {
                this.f21095a.a(sxxVar);
            }
        }
    }

    static {
        t2o.a(628097442);
    }

    public i4y(m8y<? extends T> m8yVar, m8y<U> m8yVar2) {
        this.c = m8yVar;
        this.d = m8yVar2;
    }

    public static /* synthetic */ Object ipc$super(i4y i4yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/d");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        d dVar = new d();
        r9yVar.onSubscribe(dVar);
        this.d.a(new a(dVar, r9yVar));
    }
}
