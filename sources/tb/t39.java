package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.MTOPRequestMethod;
import com.taobao.nanocompose.megability.ability.MTOPSessionOption;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28452a;
    public final qg1 b = rg1.a(false);
    public final ArrayList<k8n> c = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements wio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28453a;
        public final /* synthetic */ t39 b;

        public a(String str, t39 t39Var) {
            this.f28453a = str;
            this.b = t39Var;
        }

        @Override // tb.wio
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("addCache  " + this.f28453a);
            t39.z(this.b, this.f28453a, null, 2, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements q4j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xoh f28454a;
        public final /* synthetic */ t39 b;
        public final /* synthetic */ s29 c;
        public final /* synthetic */ af0 d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements wio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ xoh f28455a;
            public final /* synthetic */ t39 b;
            public final /* synthetic */ eth c;
            public final /* synthetic */ s29 d;

            public a(xoh xohVar, t39 t39Var, eth ethVar, s29 s29Var) {
                this.f28455a = xohVar;
                this.b = t39Var;
                this.c = ethVar;
                this.d = s29Var;
            }

            @Override // tb.wio
            public void run() {
                Object obj;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rdp.INSTANCE.a().a(this.f28455a.a(), this.f28455a.c());
                t39 t39Var = this.b;
                String c = this.f28455a.c();
                Map<String, Object> c2 = this.c.c();
                Boolean bool = null;
                if (c2 != null) {
                    obj = c2.get("hitLongTimeNoCollect");
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                t39.k(t39Var, c, bool);
                k9m.INSTANCE.b(true, this.f28455a);
                this.d.onSuccess(true);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.t39$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C1059b implements wio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ xoh f28456a;
            public final /* synthetic */ t39 b;
            public final /* synthetic */ eth c;
            public final /* synthetic */ s29 d;
            public final /* synthetic */ af0 e;

            public C1059b(xoh xohVar, t39 t39Var, eth ethVar, s29 s29Var, af0 af0Var) {
                this.f28456a = xohVar;
                this.b = t39Var;
                this.c = ethVar;
                this.d = s29Var;
                this.e = af0Var;
            }

            @Override // tb.wio
            public void run() {
                Object obj;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                l4s.INSTANCE.e("addFavorite success biz=" + this.f28456a.a());
                t39 t39Var = this.b;
                String c = this.f28456a.c();
                Map<String, Object> c2 = this.c.c();
                Boolean bool = null;
                if (c2 != null) {
                    obj = c2.get("hitLongTimeNoCollect");
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                t39.k(t39Var, c, bool);
                k9m.INSTANCE.b(true, this.f28456a);
                this.d.onSuccess(true);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("api", this.e.a());
                t39.j(this.b, linkedHashMap);
            }
        }

        public b(xoh xohVar, t39 t39Var, s29 s29Var, af0 af0Var) {
            this.f28454a = xohVar;
            this.b = t39Var;
            this.c = s29Var;
            this.d = af0Var;
        }

        @Override // tb.q4j
        public void c(eth ethVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0a22009", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            lrt.b(zqt.INSTANCE.e(), new C1059b(this.f28454a, this.b, ethVar, this.c, this.d));
        }

        @Override // tb.q4j
        public void a(bi8 bi8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b16690", new Object[]{this, bi8Var});
                return;
            }
            ckf.g(bi8Var, "result");
            l4s l4sVar = l4s.INSTANCE;
            String a2 = bi8Var.a();
            l4sVar.c(a2, "addFavorite error " + bi8Var.b());
            k9m.INSTANCE.b(false, this.f28454a);
            s29 s29Var = this.c;
            String a3 = bi8Var.a();
            String b = bi8Var.b();
            if (b == null) {
                b = "其它错误";
            }
            s29Var.onError(a3, b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.d.a());
            t39.i(this.b, bi8Var.a(), bi8Var.b(), linkedHashMap);
        }

        @Override // tb.q4j
        public void b(eth ethVar) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c2e2", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            l4s l4sVar = l4s.INSTANCE;
            cth d = ethVar.d();
            String str3 = null;
            String e = d != null ? d.e() : null;
            StringBuilder sb = new StringBuilder("addFavorite error ");
            cth d2 = ethVar.d();
            sb.append(d2 != null ? d2.b() : null);
            sb.append(" biz=");
            sb.append(this.f28454a.a());
            l4sVar.c(e, sb.toString());
            List<String> f = ethVar.f();
            if (ckf.b(f != null ? (String) i04.d0(f, 0) : null, "ALREADY_COLLECT::已经收藏")) {
                lrt.b(zqt.INSTANCE.e(), new a(this.f28454a, this.b, ethVar, this.c));
                return;
            }
            k9m.INSTANCE.b(false, this.f28454a);
            s29 s29Var = this.c;
            cth d3 = ethVar.d();
            if (d3 == null || (str = d3.e()) == null) {
                str = "-1";
            }
            cth d4 = ethVar.d();
            if (d4 == null || (str2 = d4.b()) == null) {
                str2 = "其它错误";
            }
            s29Var.onError(str, str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.d.a());
            t39 t39Var = this.b;
            cth d5 = ethVar.d();
            String e2 = d5 != null ? d5.e() : null;
            cth d6 = ethVar.d();
            if (d6 != null) {
                str3 = d6.b();
            }
            t39.i(t39Var, e2, str3, linkedHashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements wio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.wio
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("initSource " + t39.f(t39.this));
            t39.h(t39.this);
            k29 k29Var = k29.INSTANCE;
            l29 d = k29Var.d(t39.f(t39.this));
            if (d == null) {
                t39.m(t39.this);
            } else if (!d.c()) {
                k29Var.c(t39.f(t39.this));
                t39.m(t39.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements wio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ s29 c;

        public d(String str, s29 s29Var) {
            this.b = str;
            this.c = s29Var;
        }

        @Override // tb.wio
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (t39.g(t39.this).b()) {
                k8n k8nVar = new k8n(this.b, this.c);
                if (!t39.e(t39.this).contains(k8nVar)) {
                    t39.e(t39.this).add(k8nVar);
                }
            } else {
                t39.d(t39.this, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements qxb<l29> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public void onData(l29 l29Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e3990ed", new Object[]{this, l29Var});
                return;
            }
            ckf.g(l29Var, "data");
            t39.b(t39.this, l29Var);
            t39.a(t39.this, l29Var);
            k9m.INSTANCE.f(true, l29Var);
        }

        @Override // tb.qxb
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            l4s.INSTANCE.e("end rebaseFavoriteStatus");
            t39.g(t39.this).a(false);
            t39.c(t39.this);
        }

        @Override // tb.qxb
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                return;
            }
            t39.g(t39.this).a(false);
            k9m.INSTANCE.f(false, null);
            l4s.INSTANCE.c(str, str2);
            t39.c(t39.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements q4j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qxb<l29> b;
        public final /* synthetic */ lln c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements wio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t39 f28461a;
            public final /* synthetic */ eth b;
            public final /* synthetic */ qxb<l29> c;
            public final /* synthetic */ lln d;

            public a(t39 t39Var, eth ethVar, qxb<l29> qxbVar, lln llnVar) {
                this.f28461a = t39Var;
                this.b = ethVar;
                this.c = qxbVar;
                this.d = llnVar;
            }

            @Override // tb.wio
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                l4s l4sVar = l4s.INSTANCE;
                l4sVar.e("rebaseRemoteFavoriteStatus success " + t39.f(this.f28461a));
                Map<String, Object> c = this.b.c();
                JSONArray jSONArray = null;
                Object obj = c != null ? c.get("result") : null;
                if (obj instanceof JSONArray) {
                    jSONArray = (JSONArray) obj;
                }
                List<Object> list = new KMPJsonArray(jSONArray).toList();
                ArrayList arrayList = new ArrayList(zz3.q(list, 10));
                for (Object obj2 : list) {
                    arrayList.add(String.valueOf(obj2));
                }
                this.c.onData(new l29(i04.E0(arrayList), bvt.d(ftt.Companion)));
                this.c.onComplete();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("api", this.d.b());
                t39.j(this.f28461a, linkedHashMap);
            }
        }

        public f(qxb<l29> qxbVar, lln llnVar) {
            this.b = qxbVar;
            this.c = llnVar;
        }

        @Override // tb.q4j
        public void a(bi8 bi8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b16690", new Object[]{this, bi8Var});
                return;
            }
            ckf.g(bi8Var, "result");
            this.b.onError(bi8Var.a(), bi8Var.b(), bi8Var);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.c.b());
            t39.i(t39.this, bi8Var.a(), bi8Var.b(), linkedHashMap);
        }

        @Override // tb.q4j
        public void b(eth ethVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c2e2", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            qxb<l29> qxbVar = this.b;
            cth d = ethVar.d();
            String str = null;
            String e = d != null ? d.e() : null;
            cth d2 = ethVar.d();
            qxbVar.onError(e, d2 != null ? d2.b() : null, ethVar.d());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.c.b());
            t39 t39Var = t39.this;
            cth d3 = ethVar.d();
            String e2 = d3 != null ? d3.e() : null;
            cth d4 = ethVar.d();
            if (d4 != null) {
                str = d4.b();
            }
            t39.i(t39Var, e2, str, linkedHashMap);
        }

        @Override // tb.q4j
        public void c(eth ethVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0a22009", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            lrt.b(zqt.INSTANCE.e(), new a(t39.this, ethVar, this.b, this.c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class g implements q4j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ xoh b;
        public final /* synthetic */ s29 c;
        public final /* synthetic */ szn d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements wio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ xoh f28463a;
            public final /* synthetic */ t39 b;
            public final /* synthetic */ s29 c;

            public a(xoh xohVar, t39 t39Var, s29 s29Var) {
                this.f28463a = xohVar;
                this.b = t39Var;
                this.c = s29Var;
            }

            @Override // tb.wio
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rdp.INSTANCE.a().b(this.f28463a.a(), this.f28463a.c());
                t39.l(this.b, this.f28463a.c());
                k9m.INSTANCE.g(true, this.f28463a);
                this.c.onSuccess(true);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements wio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t39 f28464a;
            public final /* synthetic */ xoh b;
            public final /* synthetic */ s29 c;
            public final /* synthetic */ szn d;

            public b(t39 t39Var, xoh xohVar, s29 s29Var, szn sznVar) {
                this.f28464a = t39Var;
                this.b = xohVar;
                this.c = s29Var;
                this.d = sznVar;
            }

            @Override // tb.wio
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                l4s.INSTANCE.e("removeFavorite success");
                t39.l(this.f28464a, this.b.c());
                k9m.INSTANCE.g(true, this.b);
                this.c.onSuccess(true);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("api", this.d.a());
                t39.j(this.f28464a, linkedHashMap);
            }
        }

        public g(xoh xohVar, s29 s29Var, szn sznVar) {
            this.b = xohVar;
            this.c = s29Var;
            this.d = sznVar;
        }

        @Override // tb.q4j
        public void c(eth ethVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0a22009", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            lrt.b(zqt.INSTANCE.e(), new b(t39.this, this.b, this.c, this.d));
        }

        @Override // tb.q4j
        public void a(bi8 bi8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b16690", new Object[]{this, bi8Var});
                return;
            }
            ckf.g(bi8Var, "result");
            l4s l4sVar = l4s.INSTANCE;
            String a2 = bi8Var.a();
            l4sVar.c(a2, "removeFavorite error  " + bi8Var.b());
            k9m.INSTANCE.g(false, this.b);
            s29 s29Var = this.c;
            String a3 = bi8Var.a();
            String b2 = bi8Var.b();
            if (b2 == null) {
                b2 = "其它错误";
            }
            s29Var.onError(a3, b2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.d.a());
            t39.i(t39.this, bi8Var.a(), bi8Var.b(), linkedHashMap);
        }

        @Override // tb.q4j
        public void b(eth ethVar) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c2e2", new Object[]{this, ethVar});
                return;
            }
            ckf.g(ethVar, "result");
            l4s l4sVar = l4s.INSTANCE;
            cth d = ethVar.d();
            String str3 = null;
            String e = d != null ? d.e() : null;
            StringBuilder sb = new StringBuilder("removeFavorite error  ");
            cth d2 = ethVar.d();
            sb.append(d2 != null ? d2.b() : null);
            l4sVar.c(e, sb.toString());
            List<String> f = ethVar.f();
            if (ckf.b(f != null ? (String) i04.d0(f, 0) : null, "IS_NOT_EXIT::收藏对象不存在")) {
                lrt.b(zqt.INSTANCE.e(), new a(this.b, t39.this, this.c));
                return;
            }
            k9m.INSTANCE.g(false, this.b);
            s29 s29Var = this.c;
            cth d3 = ethVar.d();
            if (d3 == null || (str = d3.e()) == null) {
                str = "-1";
            }
            cth d4 = ethVar.d();
            if (d4 == null || (str2 = d4.b()) == null) {
                str2 = "其它错误";
            }
            s29Var.onError(str, str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("api", this.d.a());
            t39 t39Var = t39.this;
            cth d5 = ethVar.d();
            String e2 = d5 != null ? d5.e() : null;
            cth d6 = ethVar.d();
            if (d6 != null) {
                str3 = d6.b();
            }
            t39.i(t39Var, e2, str3, linkedHashMap);
        }
    }

    static {
        t2o.a(1007681574);
    }

    public t39(String str) {
        ckf.g(str, "userId");
        this.f28452a = str;
        u();
    }

    public static final /* synthetic */ void a(t39 t39Var, l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d84f6", new Object[]{t39Var, l29Var});
        } else {
            t39Var.o(l29Var);
        }
    }

    public static final /* synthetic */ void b(t39 t39Var, l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3b0f1a", new Object[]{t39Var, l29Var});
        } else {
            t39Var.q(l29Var);
        }
    }

    public static final /* synthetic */ void c(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71af299", new Object[]{t39Var});
        } else {
            t39Var.r();
        }
    }

    public static final /* synthetic */ void d(t39 t39Var, String str, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aed48a0", new Object[]{t39Var, str, s29Var});
        } else {
            t39Var.s(str, s29Var);
        }
    }

    public static final /* synthetic */ ArrayList e(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ddb85350", new Object[]{t39Var});
        }
        return t39Var.c;
    }

    public static final /* synthetic */ String f(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a628fcb", new Object[]{t39Var});
        }
        return t39Var.f28452a;
    }

    public static final /* synthetic */ qg1 g(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qg1) ipChange.ipc$dispatch("bd6ce815", new Object[]{t39Var});
        }
        return t39Var.b;
    }

    public static final /* synthetic */ void h(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bf4b3e", new Object[]{t39Var});
        } else {
            t39Var.v();
        }
    }

    public static final /* synthetic */ void i(t39 t39Var, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312d64dc", new Object[]{t39Var, str, str2, map});
        } else {
            t39Var.w(str, str2, map);
        }
    }

    public static final /* synthetic */ void j(t39 t39Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523a8e6b", new Object[]{t39Var, map});
        } else {
            t39Var.x(map);
        }
    }

    public static final /* synthetic */ void k(t39 t39Var, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5617bb0", new Object[]{t39Var, str, bool});
        } else {
            t39Var.y(str, bool);
        }
    }

    public static final /* synthetic */ void l(t39 t39Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f6171c", new Object[]{t39Var, str});
        } else {
            t39Var.A(str);
        }
    }

    public static final /* synthetic */ void m(t39 t39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a06eeb", new Object[]{t39Var});
        } else {
            t39Var.C();
        }
    }

    public static /* synthetic */ void z(t39 t39Var, String str, Boolean bool, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff41eb2", new Object[]{t39Var, str, bool, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        t39Var.y(str, bool);
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516f2c5c", new Object[]{this, str});
            return;
        }
        l29 d2 = k29.INSTANCE.d(this.f28452a);
        if (d2 != null && d2.b().contains(str)) {
            ArrayList arrayList = new ArrayList(d2.b());
            arrayList.remove(str);
            l29 l29Var = new l29(arrayList, d2.a());
            q(l29Var);
            o(l29Var);
        }
    }

    public final void B(String str, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7f84f4", new Object[]{this, str, s29Var});
            return;
        }
        ckf.g(str, "itemId");
        ckf.g(s29Var, "callback");
        lrt.b(zqt.INSTANCE.e(), new d(str, s29Var));
    }

    public final void D(qxb<l29> qxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7172860a", new Object[]{this, qxbVar});
            return;
        }
        lln llnVar = new lln();
        f4j.INSTANCE.e(llnVar.b(), llnVar.e(), MTOPRequestMethod.POST, true, null, llnVar.c(), new f(qxbVar, llnVar));
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5958f32", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        lrt.b(zqt.INSTANCE.e(), new a(str, this));
    }

    public final void o(l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41782288", new Object[]{this, l29Var});
        } else {
            faj.c(l29Var);
        }
    }

    public final void q(l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61823be4", new Object[]{this, l29Var});
        } else {
            k29.INSTANCE.e(this.f28452a, l29Var);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e5eb", new Object[]{this});
            return;
        }
        l4s l4sVar = l4s.INSTANCE;
        l4sVar.e("callBackCacheQueryRequest " + this.c.size());
        if (this.c.size() > 0) {
            Iterator<k8n> it = this.c.iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                k8n next = it.next();
                ckf.f(next, "next(...)");
                k8n k8nVar = next;
                s(k8nVar.b(), k8nVar.a());
            }
            this.c.clear();
        }
    }

    public final void s(String str, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db0fb3e", new Object[]{this, str, s29Var});
        } else if (k29.INSTANCE.b(this.f28452a, str)) {
            s29Var.onSuccess(true);
        } else {
            s29Var.onSuccess(false);
        }
    }

    public final void t() {
        l29 d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d34a69", new Object[]{this});
        } else if (!this.b.b() && (d2 = k29.INSTANCE.d(this.f28452a)) != null && !d2.c()) {
            C();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4429452", new Object[]{this});
        } else {
            lrt.b(zqt.INSTANCE.e(), new c());
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f328c6a6", new Object[]{this});
            return;
        }
        l29 a2 = faj.a();
        if (a2 != null && a2.c()) {
            l4s.INSTANCE.e("addCacheFrom loadDiskCache");
            k29.INSTANCE.e(this.f28452a, a2);
        }
        k9m.INSTANCE.e(a2);
    }

    public final void w(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b81782", new Object[]{this, str, str2, map});
        } else {
            y61.INSTANCE.c("Favorite_SDK", "MtopApiCallV2", str, str2, map);
        }
    }

    public final void x(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef228dbb", new Object[]{this, map});
        } else {
            y61.INSTANCE.e("Favorite_SDK", "MtopApiCallV2", map);
        }
    }

    public final void y(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd5012", new Object[]{this, str, bool});
            return;
        }
        if (bool != null) {
            i29.INSTANCE.b(this.f28452a, bool.booleanValue());
        }
        l29 d2 = k29.INSTANCE.d(this.f28452a);
        if (d2 != null && !d2.b().contains(str)) {
            ArrayList arrayList = new ArrayList(d2.b());
            arrayList.add(str);
            l29 l29Var = new l29(arrayList, d2.a());
            q(l29Var);
            o(l29Var);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db884d9", new Object[]{this});
        } else if (!ckf.b(this.f28452a, ovy.DEFAULT_USERID)) {
            l4s.INSTANCE.e("start rebaseFavoriteStatus");
            this.b.a(true);
            D(new e());
        }
    }

    public final void E(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c5ec6e", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        k9m.INSTANCE.d(xohVar);
        Set<Map.Entry<String, Object>> set = null;
        KMPJsonArray kMPJsonArray = new KMPJsonArray(null, 1, null);
        kMPJsonArray.add(xohVar.c());
        KMPJsonObject kMPJsonObject = new KMPJsonObject(null, 1, null);
        Map<String, Object> b2 = xohVar.b();
        if (b2 != null) {
            set = b2.entrySet();
        }
        if (set != null) {
            for (Map.Entry<String, Object> entry : set) {
                kMPJsonObject.put(entry.getKey(), entry.getValue());
            }
        }
        szn sznVar = new szn(kMPJsonArray);
        f4j.INSTANCE.e(sznVar.a(), sznVar.c(), MTOPRequestMethod.GET, true, MTOPSessionOption.AUTO_LOGIN_AND_MANUAL_LOGIN.getRawValue(), sznVar.b(), new g(xohVar, s29Var, sznVar));
    }

    public final void p(xoh xohVar, s29 s29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5959cb", new Object[]{this, xohVar, s29Var});
            return;
        }
        ckf.g(xohVar, "param");
        ckf.g(s29Var, "callback");
        k9m.INSTANCE.c(xohVar);
        Set<Map.Entry<String, Object>> set = null;
        KMPJsonObject kMPJsonObject = new KMPJsonObject(null, 1, null);
        Map<String, Object> b2 = xohVar.b();
        if (b2 != null) {
            set = b2.entrySet();
        }
        if (set != null) {
            for (Map.Entry<String, Object> entry : set) {
                kMPJsonObject.put(entry.getKey(), entry.getValue());
            }
        }
        af0 af0Var = new af0(xohVar.c(), kMPJsonObject.toJsonString());
        f4j.INSTANCE.e(af0Var.a(), af0Var.c(), MTOPRequestMethod.GET, true, MTOPSessionOption.AUTO_LOGIN_AND_MANUAL_LOGIN.getRawValue(), af0Var.b(), new b(xohVar, this, s29Var, af0Var));
    }
}
