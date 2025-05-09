package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PREFETCH_COUNT_ONCE = 100;

    /* renamed from: a  reason: collision with root package name */
    public final oyi f20169a;
    public final List<String> b;
    public s8d<lqm> c;
    public final lqm d;

    static {
        t2o.a(620757099);
    }

    public gqm a(s8d<lqm> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gqm) ipChange.ipc$dispatch("91f63a45", new Object[]{this, s8dVar});
        }
        this.c = s8dVar;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62c9e41", new Object[]{this});
            return;
        }
        fiv.a("Prefetch", "Start to prefetch with business=%s, total=%d", this.f20169a.f25749a, Integer.valueOf(this.d.f23514a));
        cqm v = s0m.B().v();
        lzm<nqm, a> b = v.b();
        if (b == null) {
            fiv.c("Prefetch", "Cannot prefetch before Phenix.build() calling", new Object[0]);
            this.d.f.addAll(this.b);
            s8d<lqm> s8dVar = this.c;
            if (s8dVar != null) {
                s8dVar.onHappen(this.d);
                return;
            }
            return;
        }
        mle s = s0m.B().s();
        for (String str : this.b) {
            rqm rqmVar = new rqm(c(str), this);
            rqmVar.q(s);
            b.a(rqmVar.e(v.c().a()));
        }
    }

    public final a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5c295805", new Object[]{this, str});
        }
        a aVar = new a(str, s0m.B().o(), s0m.B().R0());
        aVar.y0(this.f20169a.f25749a);
        aVar.q(1);
        aVar.x0(this.f20169a.c);
        aVar.t0(this.f20169a.d);
        aVar.v(this.f20169a.e, 2);
        aVar.v(this.f20169a.f, 4);
        return aVar;
    }

    public void d(a aVar, nqm nqmVar, Throwable th) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06de47f", new Object[]{this, aVar, nqmVar, th});
            return;
        }
        if (nqmVar != null) {
            this.d.e.add(aVar.O());
            lqm lqmVar = this.d;
            lqmVar.c = (int) (lqmVar.c + nqmVar.f24892a);
        } else {
            this.d.f.add(aVar.O());
            if (th != null) {
                ((ArrayList) this.d.g).add(th);
            }
        }
        lqm lqmVar2 = this.d;
        int i = lqmVar2.b + 1;
        lqmVar2.b = i;
        if (this.c != null && i == lqmVar2.f23514a) {
            if (lqmVar2.f.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            lqmVar2.d = z;
            fiv.a("Prefetch", "Complete on happen with business=%s, event=%s", this.f20169a.f25749a, this.d);
            this.c.onHappen(this.d);
        }
    }

    public gqm(oyi oyiVar, List<String> list) {
        fpm.d(oyiVar, "module strategy for prefetch cannot be null");
        fpm.b(list != null && list.size() > 0, "Urls of prefetch cannot be empty");
        this.f20169a = oyiVar;
        this.b = list;
        lqm lqmVar = new lqm(new ArrayList(), new ArrayList());
        this.d = lqmVar;
        int size = list.size();
        if (size > 100) {
            lqmVar.f.addAll(list.subList(100, size));
            this.b = list.subList(0, 100);
            fiv.k("Prefetch", "fetch count exceed MAX_PREFETCH_COUNT_ONCE(%d), slice the part exceeding to list of failed", 100);
        }
        lqmVar.f23514a = this.b.size();
    }
}
