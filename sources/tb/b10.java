package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tb.m4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class b10<ExposeKey, ExposeData> implements j4c<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final n4c<ExposeKey, ExposeData> f16120a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class a<ExposeKey, ExposeData, CacheDataType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final m4c.a<ExposeKey, ExposeData> f16121a;
        public final List<Pair<h4c<ExposeKey, ExposeData>, String>> b = new ArrayList();
        public final i4c<ExposeKey, ExposeData, CacheDataType> c;
        public n4c<ExposeKey, ExposeData> d;

        static {
            t2o.a(444597121);
        }

        public a(m4c.a<ExposeKey, ExposeData> aVar, i4c<ExposeKey, ExposeData, CacheDataType> i4cVar) {
            this.f16121a = aVar;
            this.c = i4cVar;
        }

        public j4c<ExposeKey, ExposeData> a() {
            m4c m4cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j4c) ipChange.ipc$dispatch("fb48cb77", new Object[]{this});
            }
            if (this.d == null) {
                this.d = new v07();
            }
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                if (obj != null) {
                    m4cVar = ((RecyclerViewZone.a) this.f16121a).d((h4c) pair.first, (String) obj);
                } else {
                    m4cVar = ((RecyclerViewZone.a) this.f16121a).c((h4c) pair.first);
                }
                ((v07) this.d).m(m4cVar);
            }
            n4c<ExposeKey, ExposeData> n4cVar = this.d;
            if (n4cVar == null) {
                n4cVar = new v07<>();
            }
            return b(n4cVar, ((v07) this.d).h());
        }

        public abstract j4c<ExposeKey, ExposeData> b(n4c<ExposeKey, ExposeData> n4cVar, Collection<m4c<ExposeKey, ExposeData>> collection);

        public a<ExposeKey, ExposeData, CacheDataType> c(qp8<ExposeKey, ExposeData> qp8Var, long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("86368a38", new Object[]{this, qp8Var, new Long(j), str});
            }
            i4c<ExposeKey, ExposeData, CacheDataType> i4cVar = this.c;
            if (i4cVar != null) {
                return d(((u07) i4cVar).a(qp8Var, j), str);
            }
            return this;
        }

        public a<ExposeKey, ExposeData, CacheDataType> d(h4c<ExposeKey, ExposeData> h4cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae32e52c", new Object[]{this, h4cVar, str});
            }
            ((ArrayList) this.b).add(new Pair(h4cVar, str));
            return this;
        }
    }

    static {
        t2o.a(444597120);
        t2o.a(444597126);
    }

    public b10(n4c<ExposeKey, ExposeData> n4cVar) {
        this.f16120a = n4cVar;
    }

    @Override // tb.j4c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e2f2b6", new Object[]{this});
            return;
        }
        for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.h()) {
            m4cVar.b();
        }
    }

    @Override // tb.j4c
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861a892d", new Object[]{this, str});
            return;
        }
        for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.l(str)) {
            m4cVar.a().c(m4cVar.key());
        }
    }

    @Override // tb.j4c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf7aba5", new Object[]{this});
            return;
        }
        for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.h()) {
            m4cVar.a().d();
        }
    }

    @Override // tb.n4c
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72620428", new Object[]{this, str});
        } else {
            this.f16120a.e(str);
        }
    }

    @Override // tb.n4c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8e3c55", new Object[]{this});
        } else {
            this.f16120a.f();
        }
    }

    @Override // tb.j4c
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce68223", new Object[]{this});
            return;
        }
        for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.h()) {
            m4cVar.a().c(m4cVar.key());
        }
    }

    @Override // tb.n4c
    public Collection<m4c<ExposeKey, ExposeData>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("7a6f9e39", new Object[]{this});
        }
        return this.f16120a.h();
    }

    @Override // tb.n4c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04edadf", new Object[]{this, str});
        } else {
            this.f16120a.i(str);
        }
    }

    @Override // tb.n4c
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2755de", new Object[]{this});
        } else {
            this.f16120a.j();
        }
    }

    @Override // tb.j4c
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab11b00", new Object[]{this, str});
            return;
        }
        for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.l(str)) {
            m4cVar.b();
        }
    }

    @Override // tb.n4c
    public List<m4c<ExposeKey, ExposeData>> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eade0924", new Object[]{this, str});
        }
        return this.f16120a.l(str);
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
        } else if (str == null) {
            f();
        } else {
            i(str);
        }
    }
}
