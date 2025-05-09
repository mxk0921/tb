package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import java.util.Map;
import tb.gy;
import tb.m1p;
import tb.r5j;
import tb.weq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class hy<RESULT extends SearchResult> implements z4p<RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yko f20955a;
    public final xno b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements weq.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nld f20956a;
        public final /* synthetic */ weq b;

        public a(nld nldVar, weq weqVar) {
            this.f20956a = nldVar;
            this.b = weqVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.weq.a
        public void a(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831416fe", new Object[]{this, nsjVar});
                return;
            }
            SearchResult a2 = ((gy.b) this.f20956a).a();
            hy.this.o(nsjVar, a2, this.b, null);
            ((gy.b) this.f20956a).e(a2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.weq.a
        public void b(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bde5cfff", new Object[]{this, nsjVar});
                return;
            }
            SearchResult a2 = ((gy.b) this.f20956a).a();
            NetError b = nsjVar.b();
            if (b != null) {
                a2.setResultError(new ResultError(b.getCode(), b.getMsg()));
            } else {
                a2.setResultError(new ResultError(0, ""));
            }
            ((gy.b) this.f20956a).c(a2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.weq.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88be5788", new Object[]{this});
                return;
            }
            SearchResult a2 = ((gy.b) this.f20956a).a();
            a2.setSseFinished(true);
            ((gy.b) this.f20956a).d(a2);
        }

        @Override // tb.weq.a
        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return ((gy.b) this.f20956a).b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.weq.a
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            SearchResult a2 = ((gy.b) this.f20956a).a();
            a2.setSseFinished(true);
            ((gy.b) this.f20956a).d(a2);
        }
    }

    static {
        t2o.a(993001791);
        t2o.a(993001794);
    }

    public hy(yko ykoVar, xno xnoVar) {
        this.f20955a = ykoVar;
        this.b = xnoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.z4p
    public void b(Map<String, String> map, gy.c cVar, nld<RESULT> nldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd00068", new Object[]{this, map, cVar, nldVar});
            return;
        }
        weq<?, ?> d = this.f20955a.o().d();
        if (d == null) {
            gy.b bVar = (gy.b) nldVar;
            SearchResult a2 = bVar.a();
            a2.setResultError(new ResultError(6, ""));
            bVar.c(a2);
            return;
        }
        d.b(d(map, cVar), new a(nldVar, d));
    }

    @Override // tb.z4p
    public void c(RESULT result, Object obj, y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0015b2", new Object[]{this, result, obj, y5pVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        m(obj, result);
        y5pVar.k = System.currentTimeMillis() - currentTimeMillis;
    }

    public abstract bsj d(Map<String, String> map, gy.c cVar);

    public abstract r7b e(Map<String, String> map);

    public abstract bsj f(Map<String, String> map, bsj bsjVar);

    public final yko g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.f20955a;
    }

    public final boolean h(qrj qrjVar, RESULT result, Map<String, String> map, y5p y5pVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca62091e", new Object[]{this, qrjVar, result, map, y5pVar, new Long(j)})).booleanValue();
        }
        r7b e = e(map);
        if (e == null) {
            return false;
        }
        nsj b = qrjVar.b(e);
        if (b.h()) {
            result.setResultError(new ResultError(b.b()));
            return false;
        }
        y5pVar.j = System.currentTimeMillis() - j;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            m(nsj.c(b), result);
            if (result.isFailed()) {
                return false;
            }
            y5pVar.k = System.currentTimeMillis() - currentTimeMillis;
            y5pVar.y = b.e();
            y5pVar.x = "";
            return true;
        } catch (ResultException e2) {
            result.setResultError(e2.getError());
            return false;
        }
    }

    public boolean i(RESULT result, nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7eafb6c", new Object[]{this, result, nsjVar, map})).booleanValue();
        }
        return false;
    }

    public void j(nsj nsjVar, ResultError resultError, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cded5b96", new Object[]{this, nsjVar, resultError, map});
        }
    }

    public void k(nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c3218", new Object[]{this, nsjVar, map});
        }
    }

    public abstract void l(nsj nsjVar, RESULT result, qrj qrjVar, m1p.a aVar, y5p y5pVar);

    public abstract void m(Object obj, RESULT result);

    public abstract void n(nsj nsjVar, RESULT result, m1p.a aVar);

    public abstract void o(nsj nsjVar, RESULT result, weq weqVar, m1p.a aVar);

    public abstract boolean p(bsj bsjVar);

    @Override // tb.z4p
    public void a(RESULT result, Map<String, String> map, y5p y5pVar, m1p.a aVar, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995e54c", new Object[]{this, result, map, y5pVar, aVar, cVar});
            return;
        }
        qrj<?, ?> a2 = this.f20955a.o().a();
        qrj<?, ?> c = this.f20955a.o().c();
        qrj<r7b, nsj> b = this.f20955a.o().b();
        if (a2 == null) {
            result.setResultError(new ResultError(0, "no apiAdapter"));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        bsj d = d(map, cVar);
        if (!p(d) || c == null) {
            nsj c2 = a2.c(d, this.b);
            y5pVar.j = System.currentTimeMillis() - currentTimeMillis;
            y5pVar.d = q5j.c;
            if (c2.h() && b != null) {
                if (!i(result, c2, map)) {
                    j(c2, new ResultError(2, "dont need fallback"), map);
                } else if (h(b, result, map, y5pVar, currentTimeMillis)) {
                    k(c2, map);
                    return;
                } else {
                    ResultError error = result.getError();
                    if (error == null) {
                        error = new ResultError(0, "fallback unknown error");
                    }
                    j(c2, error, map);
                }
            }
            y5pVar.n = System.currentTimeMillis();
            l(c2, result, a2, aVar, y5pVar);
            y5pVar.k = y5pVar.o - y5pVar.n;
            y5pVar.y = c2.e();
            y5pVar.x = c2.g();
            return;
        }
        bsj f = f(map, d);
        nsj b2 = c.b(f);
        y5pVar.j = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis2 = System.currentTimeMillis();
        n(b2, result, aVar);
        y5pVar.k = System.currentTimeMillis() - currentTimeMillis2;
        y5pVar.y = b2.e();
        y5pVar.x = b2.g();
        r5j r5jVar = (r5j) d;
        if (f instanceof r7b) {
            p80.c(this.f20955a, ((r5j.a) r5jVar.f16602a).c, (r7b) f, b2);
        }
    }
}
