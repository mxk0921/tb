package tao.reactivex.h;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.oux;
import tb.r9y;
import tb.sng;
import tb.sxx;
import tb.t2o;
import tb.uzx;
import tb.wxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a<T> extends uzx<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final C0872a[] f15455a = new C0872a[0];
    public static final C0872a[] b = new C0872a[0];
    public final AtomicReference<C0872a<T>[]> k = new AtomicReference<>(b);
    public Throwable l;

    /* compiled from: Taobao */
    /* renamed from: tao.reactivex.h.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class C0872a<T> extends AtomicBoolean implements sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f15456a;
        public final a<T> b;

        static {
            t2o.a(628097529);
            t2o.a(628097368);
        }

        public C0872a(r9y<? super T> r9yVar, a<T> aVar) {
            this.f15456a = r9yVar;
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(C0872a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/h/a$a");
        }

        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else if (!get()) {
                this.f15456a.onNext(t);
            }
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return get();
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else if (compareAndSet(false, true)) {
                this.b.O(this);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!get()) {
                this.f15456a.onComplete();
            }
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else if (get()) {
                oux.a(th);
            } else {
                this.f15456a.onError(th);
            }
        }
    }

    static {
        t2o.a(628097528);
    }

    public static <T> a<T> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2b56a7de", new Object[0]);
        }
        return new a<>();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/h/a");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        C0872a<T> aVar = new C0872a<>(r9yVar, this);
        r9yVar.onSubscribe(aVar);
        if (!N(aVar)) {
            Throwable th = this.l;
            if (th != null) {
                r9yVar.onError(th);
            } else {
                r9yVar.onComplete();
            }
        } else if (aVar.b()) {
            O(aVar);
        }
    }

    public boolean N(C0872a<T> aVar) {
        C0872a<T>[] aVarArr;
        C0872a[] aVarArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ddebac3", new Object[]{this, aVar})).booleanValue();
        }
        do {
            aVarArr = this.k.get();
            if (aVarArr == f15455a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C0872a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!sng.a(this.k, aVarArr, aVarArr2));
        return true;
    }

    public void O(C0872a<T> aVar) {
        C0872a<T>[] aVarArr;
        C0872a[] aVarArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb80dde", new Object[]{this, aVar});
            return;
        }
        do {
            aVarArr = this.k.get();
            if (aVarArr != f15455a && aVarArr != b) {
                int length = aVarArr.length;
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
                        aVarArr2 = b;
                    } else {
                        C0872a[] aVarArr3 = new C0872a[length - 1];
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
        } while (!sng.a(this.k, aVarArr, aVarArr2));
    }

    @Override // tb.r9y
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        C0872a<T>[] aVarArr = this.k.get();
        C0872a<T>[] aVarArr2 = f15455a;
        if (aVarArr != aVarArr2) {
            for (C0872a<T> aVar : this.k.getAndSet(aVarArr2)) {
                aVar.c();
            }
        }
    }

    @Override // tb.r9y
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        wxx.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C0872a<T>[] aVarArr = this.k.get();
        C0872a<T>[] aVarArr2 = f15455a;
        if (aVarArr == aVarArr2) {
            oux.a(th);
            return;
        }
        this.l = th;
        for (C0872a<T> aVar : this.k.getAndSet(aVarArr2)) {
            aVar.a(th);
        }
    }

    @Override // tb.r9y
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            return;
        }
        wxx.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.k.get() != f15455a) {
            for (C0872a<T> aVar : this.k.get()) {
                aVar.a((C0872a<T>) t);
            }
        }
    }

    @Override // tb.r9y
    public void onSubscribe(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb4c498", new Object[]{this, sxxVar});
        } else if (this.k.get() == f15455a) {
            sxxVar.b_();
        }
    }
}
