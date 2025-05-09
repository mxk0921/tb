package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.day;
import tb.l5y;
import tb.r9y;
import tb.sxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class m extends l5y<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final day c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends AtomicReference<sxx> implements Runnable, sxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r9y<? super Long> f15434a;
        public long b;

        static {
            t2o.a(628097459);
            t2o.a(628097368);
        }

        public a(r9y<? super Long> r9yVar) {
            this.f15434a = r9yVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/m$a");
        }

        public void a(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a041a2", new Object[]{this, sxxVar});
            } else {
                tao.reactivex.d.a.a.b(this, sxxVar);
            }
        }

        @Override // tb.sxx
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (get() == tao.reactivex.d.a.a.DISPOSED) {
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
                tao.reactivex.d.a.a.a((AtomicReference<sxx>) this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (get() != tao.reactivex.d.a.a.DISPOSED) {
                r9y<? super Long> r9yVar = this.f15434a;
                long j = this.b;
                this.b = 1 + j;
                r9yVar.onNext(Long.valueOf(j));
            }
        }
    }

    static {
        t2o.a(628097458);
    }

    public m(long j, long j2, TimeUnit timeUnit, day dayVar) {
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
        this.c = dayVar;
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/b/m");
    }

    @Override // tb.l5y
    public void J(r9y<? super Long> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314745cb", new Object[]{this, r9yVar});
            return;
        }
        a aVar = new a(r9yVar);
        r9yVar.onSubscribe(aVar);
        aVar.a(this.c.b(aVar, this.d, this.e, this.f));
    }
}
