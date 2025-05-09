package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class puh implements zoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vuh f26314a;
    public final quh b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26315a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ avh c;

        public a(String str, Object obj, avh avhVar) {
            this.f26315a = str;
            this.b = obj;
            this.c = avhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).D(this.f26315a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26316a;
        public final /* synthetic */ Object b;

        public b(String str, Object obj) {
            this.f26316a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).B(this.f26316a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fvh f26317a;

        public c(fvh fvhVar) {
            this.f26317a = fvhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).A(this.f26317a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f26318a;
        public final /* synthetic */ String b;

        public d(long j, String str) {
            this.f26318a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cuh g = cuh.g();
            g.k(this.f26318a);
            g.j(this.b);
            g.h(puh.A(puh.this));
            g.i(puh.y(puh.this));
            puh.y(puh.this).y(g);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26319a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public e(String str, String str2, String str3) {
            this.f26319a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).z(this.f26319a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26320a;
        public final /* synthetic */ uuh b;
        public final /* synthetic */ String c;

        public f(boolean z, uuh uuhVar, String str) {
            this.f26320a = z;
            this.b = uuhVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            puh.y(puh.this).K(puh.z(puh.this, this.f26320a), this.b, this.c);
            puh.B(puh.this).c(puh.y(puh.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uuh f26321a;

        public g(uuh uuhVar) {
            this.f26321a = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            puh.y(puh.this).H(puh.x(puh.this));
            puh.y(puh.this).J(this.f26321a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26322a;
        public final /* synthetic */ uuh b;

        public h(String str, uuh uuhVar) {
            this.f26322a = str;
            this.b = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).c(this.f26322a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26323a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ uuh c;
        public final /* synthetic */ String d;

        public i(String str, boolean z, uuh uuhVar, String str2) {
            this.f26323a = str;
            this.b = z;
            this.c = uuhVar;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).k(this.f26323a, puh.z(puh.this, this.b), this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26324a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ uuh d;

        public j(String str, String str2, String str3, uuh uuhVar) {
            this.f26324a = str;
            this.b = str2;
            this.c = str3;
            this.d = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).e(this.f26324a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26325a;
        public final /* synthetic */ String b;
        public final /* synthetic */ uuh c;

        public k(String str, String str2, uuh uuhVar) {
            this.f26325a = str;
            this.b = str2;
            this.c = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).d(this.f26325a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26326a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ uuh d;

        public l(String str, String str2, boolean z, uuh uuhVar) {
            this.f26326a = str;
            this.b = str2;
            this.c = z;
            this.d = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).l(this.f26326a, this.b, puh.z(puh.this, this.c), this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26327a;
        public final /* synthetic */ String b;
        public final /* synthetic */ uuh c;

        public m(String str, String str2, uuh uuhVar) {
            this.f26327a = str;
            this.b = str2;
            this.c = uuhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).f(this.f26327a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26328a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ uuh c;
        public final /* synthetic */ String d;

        public n(String str, boolean z, uuh uuhVar, String str2) {
            this.f26328a = str;
            this.b = z;
            this.c = uuhVar;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).m(this.f26328a, puh.z(puh.this, this.b), this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26329a;
        public final /* synthetic */ Object b;

        public o(String str, Object obj) {
            this.f26329a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                puh.y(puh.this).C(this.f26329a, this.b);
            }
        }
    }

    public puh(String str, String str2, fvh fvhVar, ouh ouhVar) {
        this.e = str2;
        this.d = str;
        vuh vuhVar = new vuh(str);
        this.f26314a = vuhVar;
        quh quhVar = new quh(str2, str2, fvhVar);
        this.b = quhVar;
        quhVar.F(ouhVar);
        String J = J();
        this.c = J;
        vuhVar.b(quhVar);
        quhVar.G(vuhVar);
        quhVar.H(J);
    }

    public static /* synthetic */ String A(puh puhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9840e92", new Object[]{puhVar});
        }
        return puhVar.J();
    }

    public static /* synthetic */ vuh B(puh puhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vuh) ipChange.ipc$dispatch("f155851a", new Object[]{puhVar});
        }
        return puhVar.f26314a;
    }

    public static /* synthetic */ String x(puh puhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52a3eff5", new Object[]{puhVar});
        }
        return puhVar.c;
    }

    public static /* synthetic */ quh y(puh puhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quh) ipChange.ipc$dispatch("2abd8b87", new Object[]{puhVar});
        }
        return puhVar.b;
    }

    public static /* synthetic */ int z(puh puhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("749a9dda", new Object[]{puhVar, new Boolean(z)})).intValue();
        }
        return puhVar.F(z);
    }

    public final void C(String str, String str2, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae4d923", new Object[]{this, str, str2, uuhVar});
        } else {
            wuh.b().a(new k(str, str2, uuhVar));
        }
    }

    public final void D(String str, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7424a855", new Object[]{this, str, uuhVar});
        } else {
            wuh.b().a(new h(str, uuhVar));
        }
    }

    public final String E(String str, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a99a88d2", new Object[]{this, str, uuhVar});
        }
        String J = J();
        wuh.b().a(new m(J, str, uuhVar));
        return J;
    }

    public final int F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50b022bb", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public final void G(String str, boolean z, String str2, uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87eae791", new Object[]{this, str, new Boolean(z), str2, uuhVar});
        } else {
            wuh.b().a(new l(str, str2, z, uuhVar));
        }
    }

    public final void H(String str, boolean z, uuh uuhVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc379b79", new Object[]{this, str, new Boolean(z), uuhVar, str2});
        } else {
            wuh.b().a(new i(str, z, uuhVar, str2));
        }
    }

    public final void I(String str, boolean z, uuh uuhVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4695fc", new Object[]{this, str, new Boolean(z), uuhVar, str2});
        } else {
            wuh.b().a(new n(str, z, uuhVar, str2));
        }
    }

    public final String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ceb4b0a", new Object[]{this});
        }
        return quh.o();
    }

    public final void K(uuh uuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78621798", new Object[]{this, uuhVar});
        } else {
            wuh.b().a(new g(uuhVar));
        }
    }

    public final void L(boolean z, uuh uuhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73a9704", new Object[]{this, new Boolean(z), uuhVar, str});
        } else {
            wuh.b().a(new f(z, uuhVar, str));
        }
    }

    @Override // tb.zoc
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.zoc
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4dae9a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            wuh.b().a(new d(cvh.g(), str));
        }
    }

    @Override // tb.zoc
    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3beb2345", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        uuh d2 = lth.b().c().d();
        String J = J();
        wuh.b().a(new j(J, str, str2, d2));
        return J;
    }

    @Override // tb.zoc
    public void d(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e0b2de", new Object[]{this, str, new Long(j2)});
        } else {
            D(str, lth.c(j2).c().d());
        }
    }

    @Override // tb.zoc
    public void e(boolean z, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4268f4f", new Object[]{this, new Boolean(z), new Long(j2), str});
        } else {
            L(z, lth.c(j2).c().d(), str);
        }
    }

    @Override // tb.zoc
    public void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30226ba2", new Object[]{this, str, new Boolean(z)});
        } else {
            I(str, z, lth.b().c().d(), "");
        }
    }

    @Override // tb.zoc
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167ad8a6", new Object[]{this, str});
        } else {
            D(str, lth.b().c().d());
        }
    }

    @Override // tb.zoc
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13bd196b", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.zoc
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6739916f", new Object[]{this, str, str2});
        } else {
            C(str, str2, lth.b().c().d());
        }
    }

    @Override // tb.zoc
    public void j(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0a020", new Object[]{this, str, new Boolean(z)});
        } else {
            H(str, z, lth.b().c().d(), "");
        }
    }

    @Override // tb.zoc
    public void k(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ff471d", new Object[]{this, str, obj});
        } else {
            wuh.b().a(new o(str, obj));
        }
    }

    @Override // tb.zoc
    public void l(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2012ff", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            wuh.b().a(new e(str, str2, str3));
        }
    }

    @Override // tb.zoc
    public void m(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860c2e2f", new Object[]{this, new Long(j2)});
        } else {
            K(lth.c(j2).c().d());
        }
    }

    @Override // tb.zoc
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54686b", new Object[]{this, new Boolean(z)});
        } else {
            L(z, lth.b().c().d(), "");
        }
    }

    @Override // tb.zoc
    public void o(String str, boolean z, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a863daa4", new Object[]{this, str, new Boolean(z), new Long(j2)});
        } else {
            H(str, z, lth.c(j2).c().d(), "");
        }
    }

    @Override // tb.zoc
    public String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9459ca1", new Object[]{this, str});
        }
        return E(str, lth.b().c().d());
    }

    @Override // tb.zoc
    public void q(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2066d75", new Object[]{this, new Boolean(z), str});
        } else {
            L(z, lth.b().c().d(), str);
        }
    }

    @Override // tb.zoc
    public void r(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49507e69", new Object[]{this, fvhVar});
        } else {
            wuh.b().a(new c(fvhVar));
        }
    }

    @Override // tb.zoc
    public void s(String str, Object obj, avh avhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e18b29c", new Object[]{this, str, obj, avhVar});
        } else {
            wuh.b().a(new a(str, obj, avhVar));
        }
    }

    @Override // tb.zoc
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            K(lth.b().c().d());
        }
    }

    @Override // tb.zoc
    public void t(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6abfc27", new Object[]{this, str, new Boolean(z), str2});
        } else {
            G(str, z, str2, lth.b().c().d());
        }
    }

    @Override // tb.zoc
    public void u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec273edc", new Object[]{this, str, obj});
        } else {
            wuh.b().a(new b(str, obj));
        }
    }

    @Override // tb.zoc
    public void v(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14b0ec", new Object[]{this, str, new Boolean(z), str2});
        } else {
            I(str, z, lth.b().c().d(), str2);
        }
    }

    @Override // tb.zoc
    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b9fabb", new Object[]{this});
        }
        return this.e;
    }
}
