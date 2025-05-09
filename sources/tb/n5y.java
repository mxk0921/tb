package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class n5y<T, U> extends jux<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lzx<? super T, ? extends U> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T, U> extends mux<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final lzx<? super T, ? extends U> e;

        static {
            t2o.a(628097425);
        }

        public a(hux<? super U> huxVar, lzx<? super T, ? extends U> lzxVar) {
            super(huxVar);
            this.e = lzxVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/e$a");
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
                return this.f24325a.b(wxx.b(this.e.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // tb.u7y
        public U c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            T c = this.c.c();
            if (c != null) {
                return (U) wxx.b(this.e.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.d) {
                try {
                    this.f24325a.onNext(wxx.b(this.e.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<T, U> extends ayx<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final lzx<? super T, ? extends U> e;

        static {
            t2o.a(628097426);
        }

        public b(cyx<? super U> cyxVar, lzx<? super T, ? extends U> lzxVar) {
            super(cyxVar);
            this.e = lzxVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/e$b");
        }

        @Override // tb.u7y
        public U c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            T c = this.c.c();
            if (c != null) {
                return (U) wxx.b(this.e.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // tb.cyx
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.d) {
                try {
                    this.f16083a.onNext(wxx.b(this.e.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    b(th);
                }
            }
        }
    }

    static {
        t2o.a(628097424);
    }

    public n5y(jzx<T> jzxVar, lzx<? super T, ? extends U> lzxVar) {
        super(jzxVar);
        this.c = lzxVar;
    }

    public static /* synthetic */ Object ipc$super(n5y n5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/e");
    }

    @Override // tb.jzx
    public void l(cyx<? super U> cyxVar) {
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
