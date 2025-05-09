package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class z8y<T> extends kux<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final f4y<? super T> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends iux<T, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final f4y<? super T> f;

        static {
            t2o.a(628097451);
        }

        public a(r9y<? super T> r9yVar, f4y<? super T> f4yVar) {
            super(r9yVar);
            this.f = f4yVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/i$a");
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
        public T c() {
            T c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            do {
                c = this.c.c();
                if (c == null) {
                    break;
                }
            } while (!this.f.test(c));
            return c;
        }

        @Override // tb.r9y
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (this.e == 0) {
                try {
                    if (this.f.test(t)) {
                        this.f21593a.onNext(t);
                    }
                } catch (Throwable th) {
                    a(th);
                }
            } else {
                this.f21593a.onNext(null);
            }
        }
    }

    static {
        t2o.a(628097450);
    }

    public z8y(m8y<T> m8yVar, f4y<? super T> f4yVar) {
        super(m8yVar);
        this.d = f4yVar;
    }

    public static /* synthetic */ Object ipc$super(z8y z8yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/i");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
        } else {
            this.c.a(new a(r9yVar, this.d));
        }
    }
}
