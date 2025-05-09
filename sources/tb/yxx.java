package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class yxx<T> extends jux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final f4y<? super T> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends mux<T, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final f4y<? super T> e;

        static {
            t2o.a(628097418);
        }

        public a(hux<? super T> huxVar, f4y<? super T> f4yVar) {
            super(huxVar);
            this.e = f4yVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/b$a");
        }

        @Override // tb.hux
        public boolean b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
            }
            if (this.d) {
                return false;
            }
            try {
                if (!this.e.test(t) || !this.f24325a.b(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // tb.u7y
        public T c() {
            T c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            g4y<T> g4yVar = this.c;
            f4y<? super T> f4yVar = this.e;
            do {
                c = g4yVar.c();
                if (c == null) {
                    return null;
                }
            } while (!f4yVar.test(c));
            return c;
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!b((a<T>) t)) {
                this.b.a(1L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T> extends ayx<T, T> implements hux<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final f4y<? super T> e;

        static {
            t2o.a(628097419);
            t2o.a(628097398);
        }

        public b(cyx<? super T> cyxVar, f4y<? super T> f4yVar) {
            super(cyxVar);
            this.e = f4yVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/b$b");
        }

        @Override // tb.hux
        public boolean b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
            }
            if (this.d) {
                return false;
            }
            try {
                boolean test = this.e.test(t);
                if (test) {
                    this.f16083a.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // tb.u7y
        public T c() {
            T c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            g4y<T> g4yVar = this.c;
            f4y<? super T> f4yVar = this.e;
            do {
                c = g4yVar.c();
                if (c == null) {
                    return null;
                }
            } while (!f4yVar.test(c));
            return c;
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!b((b<T>) t)) {
                this.b.a(1L);
            }
        }
    }

    static {
        t2o.a(628097417);
    }

    public yxx(jzx<T> jzxVar, f4y<? super T> f4yVar) {
        super(jzxVar);
        this.c = f4yVar;
    }

    public static /* synthetic */ Object ipc$super(yxx yxxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/b");
    }

    @Override // tb.jzx
    public void l(cyx<? super T> cyxVar) {
        jzx<T> jzxVar;
        e4y<? super T> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dee43b", new Object[]{this, cyxVar});
            return;
        }
        if (cyxVar instanceof hux) {
            jzxVar = this.b;
            bVar = new a<>((hux) cyxVar, this.c);
        } else {
            jzxVar = this.b;
            bVar = new b<>(cyxVar, this.c);
        }
        jzxVar.j(bVar);
    }
}
