package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tao.reactivex.d.a.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fay<T> extends l5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Iterable<? extends T> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends ozx<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f19160a;
        public final Iterator<? extends T> b;
        public volatile boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        static {
            t2o.a(628097456);
        }

        public a(r9y<? super T> r9yVar, Iterator<? extends T> it) {
            this.f19160a = r9yVar;
            this.b = it;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/k$a");
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
            this.d = true;
            return 1;
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                this.c = true;
            }
        }

        @Override // tb.u7y
        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            return (T) wxx.b(this.b.next(), "The iterator returned a null value");
        }

        @Override // tb.u7y
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        @Override // tb.u7y
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.e = true;
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            while (!b()) {
                try {
                    this.f19160a.onNext(wxx.b(this.b.next(), "The iterator returned a null value"));
                    if (!b()) {
                        try {
                            if (!this.b.hasNext()) {
                                if (!b()) {
                                    this.f19160a.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            uxx.a(th);
                            this.f19160a.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    uxx.a(th2);
                    this.f19160a.onError(th2);
                    return;
                }
            }
        }
    }

    static {
        t2o.a(628097455);
    }

    public fay(Iterable<? extends T> iterable) {
        this.c = iterable;
    }

    public static /* synthetic */ Object ipc$super(fay fayVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/k");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        try {
            Iterator<? extends T> it = this.c.iterator();
            try {
                if (!it.hasNext()) {
                    b.a((r9y<?>) r9yVar);
                    return;
                }
                a aVar = new a(r9yVar, it);
                r9yVar.onSubscribe(aVar);
                if (!aVar.d) {
                    aVar.f();
                }
            } catch (Throwable th) {
                uxx.a(th);
                b.a(th, r9yVar);
            }
        } catch (Throwable th2) {
            uxx.a(th2);
            b.a(th2, r9yVar);
        }
    }
}
