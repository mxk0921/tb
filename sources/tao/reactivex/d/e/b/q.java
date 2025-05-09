package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import tb.l5y;
import tb.lzx;
import tb.m8y;
import tb.r9y;
import tb.t2o;
import tb.uxx;
import tb.wxx;
import tb.xxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends AtomicInteger implements Runnable, xxx<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f15436a;
        public final T b;

        static {
            t2o.a(628097466);
            t2o.a(628097399);
        }

        public a(r9y<? super T> r9yVar, T t) {
            this.f15436a = r9yVar;
            this.b = t;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/q$a");
        }

        @Override // tb.nzx
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (get() == 3) {
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
                set(3);
            }
        }

        @Override // tb.u7y
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        @Override // tb.u7y
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // tb.u7y
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                lazySet(3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (get() == 0 && compareAndSet(0, 2)) {
                this.f15436a.onNext((T) this.b);
                if (get() == 2) {
                    lazySet(3);
                    this.f15436a.onComplete();
                }
            }
        }

        @Override // tb.u7y
        public boolean a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
            }
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T, R> extends l5y<R> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final T c;
        public final lzx<? super T, ? extends m8y<? extends R>> d;

        static {
            t2o.a(628097467);
        }

        public b(T t, lzx<? super T, ? extends m8y<? extends R>> lzxVar) {
            this.c = t;
            this.d = lzxVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/q$b");
        }

        @Override // tb.l5y
        public void J(r9y<? super R> r9yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
                return;
            }
            try {
                m8y m8yVar = (m8y) wxx.b(this.d.apply((T) this.c), "The mapper returned a null ObservableSource");
                if (m8yVar instanceof Callable) {
                    try {
                        Object call = ((Callable) m8yVar).call();
                        if (call == null) {
                            tao.reactivex.d.a.b.a((r9y<?>) r9yVar);
                            return;
                        }
                        a aVar = new a(r9yVar, call);
                        r9yVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        uxx.a(th);
                        tao.reactivex.d.a.b.a(th, r9yVar);
                    }
                } else {
                    m8yVar.a(r9yVar);
                }
            } catch (Throwable th2) {
                tao.reactivex.d.a.b.a(th2, r9yVar);
            }
        }
    }

    static {
        t2o.a(628097465);
    }

    public static <T, U> l5y<U> a(T t, lzx<? super T, ? extends m8y<? extends U>> lzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("d627730c", new Object[]{t, lzxVar});
        }
        return new b(t, lzxVar);
    }

    public static <T, R> boolean b(m8y<T> m8yVar, r9y<? super R> r9yVar, lzx<? super T, ? extends m8y<? extends R>> lzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137cd505", new Object[]{m8yVar, r9yVar, lzxVar})).booleanValue();
        }
        if (!(m8yVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) m8yVar).call();
            if (obj == 0) {
                tao.reactivex.d.a.b.a((r9y<?>) r9yVar);
                return true;
            }
            m8y m8yVar2 = (m8y) wxx.b(lzxVar.apply(obj), "The mapper returned a null ObservableSource");
            if (m8yVar2 instanceof Callable) {
                Object call = ((Callable) m8yVar2).call();
                if (call == null) {
                    tao.reactivex.d.a.b.a((r9y<?>) r9yVar);
                    return true;
                }
                a aVar = new a(r9yVar, call);
                r9yVar.onSubscribe(aVar);
                aVar.run();
            } else {
                m8yVar2.a(r9yVar);
            }
            return true;
        } catch (Throwable th) {
            uxx.a(th);
            tao.reactivex.d.a.b.a(th, r9yVar);
            return true;
        }
    }
}
