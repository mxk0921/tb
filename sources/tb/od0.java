package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.LiteTaoApplicationImpl;
import com.taobao.android.layoutmanager.adapter.impl.TBLogin;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class od0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g0o A;

    /* renamed from: a  reason: collision with root package name */
    public ImageLoader f25306a;
    public h2e b;
    public hzc c;
    public ILogin d;
    public te8 e;
    public rxl f;
    public fnc g;
    public o6c h;
    public IStorage i;
    public fqf j;
    public mrd k;
    public sdc l;
    public hpb m;
    public t9b n;
    public IDeviceInfo o;
    public fhb p;
    public nxb q;
    public wgb r;
    public IFestival s;
    public h1e t;
    public iee u;
    public bcd v;
    public e0e w;
    public gcd x;
    public yyc y;
    public rkd z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static final od0 INSTANCE = new od0();

        static {
            t2o.a(503316565);
        }
    }

    static {
        t2o.a(503316563);
    }

    public static od0 D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (od0) ipChange.ipc$dispatch("de5dea29", new Object[0]);
        }
        return b.INSTANCE;
    }

    public e0e A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0e) ipChange.ipc$dispatch("2b0d043f", new Object[]{this});
        }
        if (this.w == null) {
            this.w = new uot();
        }
        return this.w;
    }

    public h1e B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1e) ipChange.ipc$dispatch("50797a83", new Object[]{this});
        }
        if (this.t == null) {
            this.t = new vxr();
        }
        return this.t;
    }

    public iee C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iee) ipChange.ipc$dispatch("ec531551", new Object[]{this});
        }
        if (this.u == null) {
            this.u = new bix();
        }
        return this.u;
    }

    public ImageLoader a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader) ipChange.ipc$dispatch("b990ffe8", new Object[]{this});
        }
        return n().f();
    }

    public NotifyManager.g b(NotifyManager.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifyManager.g) ipChange.ipc$dispatch("fd010f47", new Object[]{this, hVar});
        }
        return C().a(hVar);
    }

    public t9b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9b) ipChange.ipc$dispatch("e5a8b771", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new h0();
        }
        return this.n;
    }

    public h2e d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2e) ipChange.ipc$dispatch("eba8bed3", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new xuv();
        }
        return this.b;
    }

    public wgb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wgb) ipChange.ipc$dispatch("9ac42b1", new Object[]{this});
        }
        if (this.r == null) {
            this.r = new m71();
        }
        return this.r;
    }

    public fhb f() {
        LiteTaoApplicationImpl liteTaoApplicationImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhb) ipChange.ipc$dispatch("6e141f35", new Object[]{this});
        }
        if (this.p == null) {
            if (o.J().getPackageName().equals("com.taobao.litetao")) {
                liteTaoApplicationImpl = new LiteTaoApplicationImpl();
            } else {
                liteTaoApplicationImpl = new n6r();
            }
            this.p = (fhb) liteTaoApplicationImpl;
        }
        return this.p;
    }

    public hpb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpb) ipChange.ipc$dispatch("748181d1", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new s8l();
        }
        return this.m;
    }

    public nxb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nxb) ipChange.ipc$dispatch("a9bb47f1", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new uar();
        }
        return this.q;
    }

    public IDeviceInfo i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDeviceInfo) ipChange.ipc$dispatch("e29907f5", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new gbr();
        }
        return this.o;
    }

    public te8 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (te8) ipChange.ipc$dispatch("8c88c60e", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new ue8();
        }
        return this.e;
    }

    public IFestival k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFestival) ipChange.ipc$dispatch("50c0c91", new Object[]{this});
        }
        if (this.s == null) {
            this.s = new ecr();
        }
        return this.s;
    }

    public o6c l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o6c) ipChange.ipc$dispatch("e5244fc3", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new mbr();
        }
        return this.h;
    }

    public sdc m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdc) ipChange.ipc$dispatch("158b8a91", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new n17();
        }
        return this.l;
    }

    @Deprecated
    public ImageLoader n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader) ipChange.ipc$dispatch("46997f4e", new Object[]{this});
        }
        if (this.f25306a == null) {
            this.f25306a = new e1m();
        }
        return this.f25306a;
    }

    public fqf o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fqf) ipChange.ipc$dispatch("91ee0102", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new gqf();
        }
        return this.j;
    }

    public fnc p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnc) ipChange.ipc$dispatch("69a8ecc9", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new tdh();
        }
        return this.g;
    }

    public ILogin q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILogin) ipChange.ipc$dispatch("6dfe60ff", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new TBLogin();
        }
        return this.d;
    }

    public yyc r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyc) ipChange.ipc$dispatch("dd3420b1", new Object[]{this});
        }
        if (this.y == null) {
            this.y = new aoj();
        }
        return this.y;
    }

    public hzc s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hzc) ipChange.ipc$dispatch("33d1011a", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new rqr();
        }
        return this.c;
    }

    public rxl t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxl) ipChange.ipc$dispatch("bf8bd33", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new pxl();
        }
        return this.f;
    }

    public bcd u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bcd) ipChange.ipc$dispatch("2d3d0931", new Object[]{this});
        }
        if (this.v == null) {
            this.v = new yfs();
        }
        return this.v;
    }

    public gcd v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gcd) ipChange.ipc$dispatch("b3b6cca7", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new erm();
        }
        return this.x;
    }

    public g0o w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0o) ipChange.ipc$dispatch("f237a559", new Object[]{this});
        }
        if (this.A == null) {
            synchronized (od0.class) {
                try {
                    if (this.A == null) {
                        this.A = new PageRenderIntercept();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.A;
    }

    public rkd x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkd) ipChange.ipc$dispatch("da7ed911", new Object[]{this});
        }
        if (this.z == null) {
            synchronized (od0.class) {
                try {
                    if (this.z == null) {
                        this.z = new dvr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.z;
    }

    public mrd y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrd) ipChange.ipc$dispatch("2b0a68b1", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new vwr();
        }
        return this.k;
    }

    public IStorage z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("1820139b", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new kfs();
        }
        return this.i;
    }

    public od0() {
    }
}
