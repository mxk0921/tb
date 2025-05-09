package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class p5y<T> extends kux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final vxx<? super T> d;
    public final vxx<? super Throwable> e;
    public final fux f;
    public final fux g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> implements sxx, r9y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f25896a;
        public final vxx<? super T> b;
        public final vxx<? super Throwable> c;
        public final fux d;
        public final fux e;
        public sxx f;
        public boolean g;

        static {
            t2o.a(628097446);
            t2o.a(628097368);
            t2o.a(628097533);
        }

        public a(r9y<? super T> r9yVar, vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, fux fuxVar2) {
            this.f25896a = r9yVar;
            this.b = vxxVar;
            this.c = vxxVar2;
            this.d = fuxVar;
            this.e = fuxVar2;
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.f.b();
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                this.f.b_();
            }
        }

        @Override // tb.r9y
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (!this.g) {
                try {
                    ((gux.a) this.d).a();
                    this.g = true;
                    this.f25896a.onComplete();
                    try {
                        ((gux.a) this.e).a();
                    } catch (Throwable th) {
                        uxx.a(th);
                        oux.a(th);
                    }
                } catch (Throwable th2) {
                    uxx.a(th2);
                    onError(th2);
                }
            }
        }

        @Override // tb.r9y
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.g) {
                oux.a(th);
            } else {
                this.g = true;
                try {
                    this.c.accept(th);
                } catch (Throwable th2) {
                    uxx.a(th2);
                    th = new tao.reactivex.b.a(th, th2);
                }
                this.f25896a.onError(th);
                try {
                    ((gux.a) this.e).a();
                } catch (Throwable th3) {
                    uxx.a(th3);
                    oux.a(th3);
                }
            }
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.g) {
                try {
                    this.b.accept(t);
                    this.f25896a.onNext(t);
                } catch (Throwable th) {
                    uxx.a(th);
                    this.f.b_();
                    onError(th);
                }
            }
        }

        @Override // tb.r9y
        public void onSubscribe(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
            } else if (tao.reactivex.d.a.a.a(this.f, sxxVar)) {
                this.f = sxxVar;
                this.f25896a.onSubscribe(this);
            }
        }
    }

    static {
        t2o.a(628097445);
    }

    public p5y(m8y<T> m8yVar, vxx<? super T> vxxVar, vxx<? super Throwable> vxxVar2, fux fuxVar, fux fuxVar2) {
        super(m8yVar);
        this.d = vxxVar;
        this.e = vxxVar2;
        this.f = fuxVar;
        this.g = fuxVar2;
    }

    public static /* synthetic */ Object ipc$super(p5y p5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/e");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(new a(r9yVar, this.d, this.e, this.f, this.g));
        }
    }
}
