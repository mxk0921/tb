package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ad0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15673a;
    public final boolean b;
    public final int c;
    public final List<AdMonitorType> d;
    public final rrj e;
    public final scy f;
    public final veb g;
    public final boolean h;
    public final String i;
    public final String j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final qzc f;
        public final z7e g;
        public veb h;
        public String j;
        public String k;
        public boolean l;

        /* renamed from: a  reason: collision with root package name */
        public int f15674a = ocy.a();
        public boolean b = true;
        public boolean c = true;
        public int d = 5;
        public List<AdMonitorType> e = Arrays.asList(AdMonitorType.CLICK, AdMonitorType.EXPOSE, AdMonitorType.INTERACT);
        public boolean i = false;

        static {
            t2o.a(283115522);
        }

        public a(qzc qzcVar, z7e z7eVar) {
            this.f = qzcVar;
            this.g = z7eVar;
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62435e14", new Object[]{aVar})).intValue();
            }
            return aVar.f15674a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61ccf826", new Object[]{aVar})).booleanValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9591c610", new Object[]{aVar});
            }
            return aVar.k;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc6cfa95", new Object[]{aVar})).booleanValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61569227", new Object[]{aVar})).booleanValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("60e02c17", new Object[]{aVar})).intValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ List g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("4cac5d82", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ qzc h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qzc) ipChange.ipc$dispatch("d0772412", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ z7e i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z7e) ipChange.ipc$dispatch("e9685126", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ veb j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (veb) ipChange.ipc$dispatch("bcc51265", new Object[]{aVar});
            }
            return aVar.h;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e902e2d", new Object[]{aVar})).booleanValue();
            }
            return aVar.i;
        }

        public static /* synthetic */ String l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f8d845b6", new Object[]{aVar});
            }
            return aVar.j;
        }

        public a m(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c70416f6", new Object[]{this, str, str2});
            }
            this.j = str;
            this.k = str2;
            return this;
        }

        public ad0 n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ad0) ipChange.ipc$dispatch("7185fbe2", new Object[]{this});
            }
            return new ad0(this);
        }

        public a o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("84c2e870", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c6d73df9", new Object[]{this, new Integer(i)});
            }
            this.f15674a = i;
            return this;
        }

        public a q(veb vebVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b28d62f6", new Object[]{this, vebVar});
            }
            this.h = vebVar;
            return this;
        }

        public a r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("879af83c", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public a s(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26214be6", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69893811", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7652146c", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a v(List<AdMonitorType> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aaeb70e8", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }
    }

    static {
        t2o.a(283115521);
    }

    public ad0(a aVar) {
        int a2 = a.a(aVar);
        this.f15673a = a.b(aVar);
        this.b = a.e(aVar);
        this.c = a.f(aVar);
        this.d = a.g(aVar);
        this.e = new rrj(a.h(aVar));
        this.f = new scy(a.i(aVar));
        this.g = a.j(aVar);
        this.h = a.k(aVar);
        this.i = a.l(aVar);
        this.j = a.c(aVar);
        qgh.f(a.d(aVar));
        ocy.b(a2);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.j;
    }

    public veb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (veb) ipChange.ipc$dispatch("3f12b3a4", new Object[]{this});
        }
        return this.g;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("710aacc6", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public qzc d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzc) ipChange.ipc$dispatch("9626b129", new Object[]{this});
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.i;
    }

    public List<AdMonitorType> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1abcbf76", new Object[]{this});
        }
        return this.d;
    }

    public scy g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scy) ipChange.ipc$dispatch("708364a3", new Object[]{this});
        }
        return this.f;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0d69d2", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("320d3833", new Object[]{this})).booleanValue();
        }
        return this.f15673a;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0a310ce", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
