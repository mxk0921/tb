package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gby<T, U> extends kux<T, U> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lzx<? super T, ? extends U> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T, U> extends iux<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final lzx<? super T, ? extends U> f;

        static {
            t2o.a(628097462);
        }

        public a(r9y<? super U> r9yVar, lzx<? super T, ? extends U> lzxVar) {
            super(r9yVar);
            this.f = lzxVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/o$a");
        }

        @Override // tb.nzx
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            return b(i);
        }

        @Override // tb.u7y
        public U c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            T c = this.c.c();
            if (c != null) {
                return (U) wxx.b(this.f.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.d) {
                if (this.e != 0) {
                    this.f21593a.onNext(null);
                    return;
                }
                try {
                    this.f21593a.onNext(wxx.b(this.f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    static {
        t2o.a(628097461);
    }

    public gby(m8y<T> m8yVar, lzx<? super T, ? extends U> lzxVar) {
        super(m8yVar);
        this.d = lzxVar;
    }

    public static /* synthetic */ Object ipc$super(gby gbyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/o");
    }

    @Override // tb.l5y
    public void J(r9y<? super U> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(new a(r9yVar, this.d));
        }
    }
}
