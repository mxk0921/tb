package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.dataservice.datasource.MainPageServerDataSource;
import com.taobao.mytaobao.dataservice.datasource.PageBackServerDataSource;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m0i implements jqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f23688a;
    public u1a<? super iln, ? super JSONObject, xhv> b;
    public w1a<? super iln, ? super JSONObject, ? super JSONObject, xhv> c;
    public u1a<? super iln, ? super JSONArray, xhv> d;
    public u1a<? super iln, ? super List<String>, xhv> e;
    public u1a<? super iln, ? super JSONObject, xhv> f;
    public g1a<? super String, xhv> g;
    public final n0i h;
    public final MainPageServerDataSource i;
    public final PageBackServerDataSource j = new PageBackServerDataSource(this);
    public JSONObject k;
    public cr6 l;
    public boolean m;
    public long n;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m0i.p(m0i.this).o(this.b, m0i.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public b(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m0i.q(m0i.this).i(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g1a r = m0i.r(m0i.this);
            if (r != null) {
                xhv xhvVar = (xhv) r.invoke(this.b);
            }
        }
    }

    static {
        t2o.a(745537694);
        t2o.a(745537693);
    }

    public m0i(String str) {
        ckf.h(str, "userId");
        n0i n0iVar = new n0i(str);
        this.h = n0iVar;
        MainPageServerDataSource mainPageServerDataSource = new MainPageServerDataSource();
        this.i = mainPageServerDataSource;
        mainPageServerDataSource.p(n0iVar);
    }

    public static final /* synthetic */ MainPageServerDataSource p(m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPageServerDataSource) ipChange.ipc$dispatch("66e779c2", new Object[]{m0iVar});
        }
        return m0iVar.i;
    }

    public static final /* synthetic */ PageBackServerDataSource q(m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageBackServerDataSource) ipChange.ipc$dispatch("554d5f66", new Object[]{m0iVar});
        }
        return m0iVar.j;
    }

    public static final /* synthetic */ g1a r(m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f8c78ac7", new Object[]{m0iVar});
        }
        return m0iVar.g;
    }

    public final void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec01f", new Object[]{this, new Integer(i)});
            return;
        }
        this.f23688a = System.currentTimeMillis();
        p3j.g(new a(i));
    }

    public final void B() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4ef66d", new Object[]{this});
            return;
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            jSONObject = cr6Var.h();
        } else {
            jSONObject = null;
        }
        if (!this.m) {
            p3j.g(new b(jSONObject));
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f9780", new Object[]{this, str});
        } else {
            p3j.f(new c(str));
        }
    }

    public final void D(iln ilnVar, cr6 cr6Var) {
        u1a<? super iln, ? super JSONObject, xhv> u1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5675add3", new Object[]{this, ilnVar, cr6Var});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(cr6Var, "dataMerger");
        this.l = cr6Var;
        JSONObject i = cr6Var.i();
        if (i != null && (u1aVar = this.f) != null) {
            u1aVar.invoke(ilnVar, i);
        }
    }

    public final void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7281188", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final void F(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deba8dce", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
        }
    }

    @Override // tb.jqc
    public void a(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cc123e", new Object[]{this, g1aVar});
            return;
        }
        ckf.h(g1aVar, "refreshFailedListener");
        this.g = g1aVar;
    }

    @Override // tb.jqc
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fd160cb", new Object[]{this});
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            return cr6Var.d();
        }
        return null;
    }

    @Override // tb.jqc
    public void c(w1a<? super iln, ? super JSONObject, ? super JSONObject, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23a289b", new Object[]{this, w1aVar});
            return;
        }
        ckf.h(w1aVar, "dataChangeListener");
        this.c = w1aVar;
        this.i.k();
    }

    @Override // tb.jqc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e986d4df", new Object[]{this});
        } else {
            this.f23688a = 0L;
        }
    }

    @Override // tb.jqc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786ce346", new Object[]{this});
        }
    }

    @Override // tb.jqc
    public void f(u1a<? super iln, ? super JSONObject, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdca35e9", new Object[]{this, u1aVar});
            return;
        }
        ckf.h(u1aVar, "fullDataChangeListener");
        this.f = u1aVar;
    }

    @Override // tb.jqc
    public void g(u1a<? super iln, ? super JSONArray, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adba009d", new Object[]{this, u1aVar});
            return;
        }
        ckf.h(u1aVar, "templateChangeListener");
        this.d = u1aVar;
    }

    @Override // tb.jqc
    public String getUserNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this});
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            return cr6Var.o();
        }
        return null;
    }

    @Override // tb.jqc
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("767a76f6", new Object[]{this});
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            return cr6Var.n();
        }
        return null;
    }

    @Override // tb.jqc
    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1795108", new Object[]{this, new Integer(i)});
        } else {
            A(i);
        }
    }

    @Override // tb.jqc
    public boolean is88Vip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c9c91e", new Object[]{this})).booleanValue();
        }
        cr6 cr6Var = this.l;
        if (cr6Var == null || !cr6Var.p()) {
            return false;
        }
        return true;
    }

    @Override // tb.jqc
    public void j(u1a<? super iln, ? super List<String>, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7f310d", new Object[]{this, u1aVar});
            return;
        }
        ckf.h(u1aVar, "layoutChangeListener");
        this.e = u1aVar;
    }

    @Override // tb.jqc
    public void k(u1a<? super iln, ? super JSONObject, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a65a490", new Object[]{this, u1aVar});
            return;
        }
        ckf.h(u1aVar, "globalChangeListener");
        this.b = u1aVar;
    }

    @Override // tb.jqc
    public void l() {
        long j;
        Long k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f23688a;
        cr6 cr6Var = this.l;
        if (cr6Var == null || (k = cr6Var.k()) == null) {
            j = 480;
        } else {
            j = k.longValue();
        }
        if (currentTimeMillis > j * 1000) {
            A(3);
        } else {
            B();
        }
    }

    @Override // tb.jqc
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd05495", new Object[]{this});
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            return cr6Var.m();
        }
        return null;
    }

    @Override // tb.jqc
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65273e6a", new Object[]{this});
        }
        cr6 cr6Var = this.l;
        if (cr6Var != null) {
            return cr6Var.c();
        }
        return null;
    }

    @Override // tb.jqc
    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("951dbc76", new Object[]{this});
        }
        return m();
    }

    public final w1a<iln, JSONObject, JSONObject, xhv> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("15b779ef", new Object[]{this});
        }
        return this.c;
    }

    public final long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f3e439e", new Object[]{this})).longValue();
        }
        return this.n;
    }

    public final u1a<iln, JSONObject, xhv> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("4932f077", new Object[]{this});
        }
        return this.b;
    }

    public final u1a<iln, List<String>, xhv> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("a52073d0", new Object[]{this});
        }
        return this.e;
    }

    public final cr6 x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cr6) ipChange.ipc$dispatch("78a96287", new Object[]{this});
        }
        return this.l;
    }

    public final u1a<iln, JSONArray, xhv> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("93e200", new Object[]{this});
        }
        return this.d;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebfea998", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    @Override // tb.jqc
    public JSONObject m() {
        iln ilnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0b90726", new Object[]{this});
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            return jSONObject;
        }
        q3j q3jVar = q3j.INSTANCE;
        q3jVar.n();
        q3jVar.r();
        String b2 = this.h.b();
        if (b2 != null) {
            ilnVar = new iln(2);
            q3jVar.w(false);
        } else {
            b2 = this.h.a();
            iln ilnVar2 = new iln(1);
            MtbGlobalEnv.k = false;
            q3jVar.w(true);
            ilnVar = ilnVar2;
        }
        JSONObject parseObject = JSON.parseObject(b2);
        if (ilnVar.b() == 2) {
            ckf.c(parseObject, "dataJSON");
            parseObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, (String) 2);
        }
        q3jVar.s();
        q3jVar.p();
        this.k = parseObject;
        cr6 cr6Var = new cr6(parseObject);
        q3jVar.q();
        q3jVar.o();
        D(ilnVar, cr6Var);
        ckf.c(parseObject, "dataJSON");
        return parseObject;
    }
}
