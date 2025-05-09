package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import java.util.concurrent.atomic.AtomicReference;
import tb.h6y;
import tb.l5y;
import tb.oux;
import tb.r9y;
import tb.sxx;
import tb.t2o;
import tb.t7y;
import tb.uxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class c<T> extends l5y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final t7y<T> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends AtomicReference<sxx> implements sxx, h6y<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super T> f15431a;

        static {
            t2o.a(628097441);
            t2o.a(628097368);
            t2o.a(628097501);
        }

        public a(r9y<? super T> r9yVar) {
            this.f15431a = r9yVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/c$a");
        }

        @Override // tb.rxx
        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else if (t == null) {
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!b()) {
                this.f15431a.onNext(t);
            }
        }

        @Override // tb.rxx
        public void a_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aad651a5", new Object[]{this});
            } else if (!b()) {
                try {
                    this.f15431a.onComplete();
                } finally {
                    b_();
                }
            }
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : tao.reactivex.d.a.a.a(get());
        }

        @Override // tb.sxx
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                tao.reactivex.d.a.a.a((AtomicReference<sxx>) this);
            }
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else if (!b(th)) {
                oux.a(th);
            }
        }

        public boolean b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd742bb0", new Object[]{this, th})).booleanValue();
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (b()) {
                return false;
            }
            try {
                this.f15431a.onError(th);
                return true;
            } finally {
                b_();
            }
        }
    }

    static {
        t2o.a(628097440);
    }

    public c(t7y<T> t7yVar) {
        this.c = t7yVar;
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/c");
    }

    @Override // tb.l5y
    public void J(r9y<? super T> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        a aVar = new a(r9yVar);
        r9yVar.onSubscribe(aVar);
        try {
            ((MtopConnection.b) this.c).a(aVar);
        } catch (Throwable th) {
            uxx.a(th);
            aVar.a(th);
        }
    }
}
