package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mvl<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public sxx f24333a = null;
    public final tao.reactivex.h.a<T> b = tao.reactivex.h.a.P();
    public l5y<T> c;
    public long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vxx<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vxx f24334a;

        /* compiled from: Taobao */
        /* renamed from: tb.mvl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0998a implements f4y<List<T>> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0998a() {
            }

            /* renamed from: a */
            public boolean test(List<T> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("9ab86b0e", new Object[]{this, list})).booleanValue();
                }
                if (list.size() > 0 || mvl.a(mvl.this) == null) {
                    return true;
                }
                mvl.a(mvl.this).b_();
                mvl.b(mvl.this, null);
                return false;
            }
        }

        public a(vxx vxxVar) {
            this.f24334a = vxxVar;
        }

        @Override // tb.vxx
        public void accept(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, t});
                return;
            }
            if (mvl.a(mvl.this) == null) {
                mvl mvlVar = mvl.this;
                mvl.b(mvlVar, mvl.d(mvlVar).D(mvl.c(mvl.this), TimeUnit.MILLISECONDS).w(new C0998a()).K(this.f24334a));
            }
            mvl.d(mvl.this).onNext(t);
        }
    }

    static {
        t2o.a(628097164);
    }

    public static /* synthetic */ sxx a(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("397d8ca5", new Object[]{mvlVar});
        }
        return mvlVar.f24333a;
    }

    public static /* synthetic */ sxx b(mvl mvlVar, sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxx) ipChange.ipc$dispatch("2740677b", new Object[]{mvlVar, sxxVar});
        }
        mvlVar.f24333a = sxxVar;
        return sxxVar;
    }

    public static /* synthetic */ long c(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e89d783e", new Object[]{mvlVar})).longValue();
        }
        return mvlVar.d;
    }

    public static /* synthetic */ tao.reactivex.h.a d(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao.reactivex.h.a) ipChange.ipc$dispatch("6b835e5d", new Object[]{mvlVar});
        }
        return mvlVar.b;
    }

    public mvl<T> e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mvl) ipChange.ipc$dispatch("685a168f", new Object[]{this, new Long(j)});
        }
        this.d = j;
        return this;
    }

    public mvl<T> f(l5y<T> l5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mvl) ipChange.ipc$dispatch("dead05da", new Object[]{this, l5yVar});
        }
        this.c = l5yVar;
        return this;
    }

    public void g(vxx<List<T>> vxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ad9fd7", new Object[]{this, vxxVar});
            return;
        }
        l5y<T> l5yVar = this.c;
        if (l5yVar != null) {
            l5yVar.K(new a(vxxVar));
        }
    }
}
