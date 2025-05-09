package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n1h implements bwd, xdb, hgb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f1h f24442a;
    public r1h b;
    public boolean c = true;
    public boolean d = true;
    public ncc e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements fva {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            if (n1h.r(n1h.this) != null) {
                return n1h.r(n1h.this).getHeartParams();
            }
            return null;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f91a5973", new Object[]{this})).intValue();
            }
            return iw0.b(v2s.o().f().getApplication());
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9eec7c18", new Object[]{this})).booleanValue();
            }
            return n1h.s(n1h.this);
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfc979d5", new Object[]{this})).booleanValue();
            }
            return wir.a().b().f();
        }
    }

    static {
        t2o.a(779092328);
        t2o.a(806355924);
        t2o.a(806355919);
        t2o.a(806356088);
    }

    public static /* synthetic */ ncc r(n1h n1hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ncc) ipChange.ipc$dispatch("63339157", new Object[]{n1hVar});
        }
        return n1hVar.e;
    }

    public static /* synthetic */ boolean s(n1h n1hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2001291", new Object[]{n1hVar})).booleanValue();
        }
        return n1hVar.f;
    }

    @Override // tb.bwd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6cdf1d", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.m();
        }
    }

    @Override // tb.xdb
    public void b(Boolean bool, int i, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dd991b", new Object[]{this, bool, new Integer(i), str});
            return;
        }
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        this.f = z;
    }

    @Override // tb.bwd
    public void c(int i, String str, String str2, String str3, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b155bd57", new Object[]{this, new Integer(i), str, str2, str3, zvdVar, objArr});
        } else {
            g(i, str, null, str2, str3, zvdVar, objArr);
        }
    }

    @Override // tb.bwd
    public void d(int i, String str, int i2, int i3, int i4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8230123c", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), zvdVar, objArr});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.q(i2, i3, i4, zvdVar);
        }
    }

    @Override // tb.bwd
    public void e(boolean z, boolean z2, ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b23fd7", new Object[]{this, new Boolean(z), new Boolean(z2), nccVar});
            return;
        }
        this.c = z;
        this.d = z2;
        this.e = nccVar;
    }

    @Override // tb.bwd
    public void f(int i, String str, Map<String, Double> map, boolean z, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba32fa4d", new Object[]{this, new Integer(i), str, map, new Boolean(z), zvdVar, objArr});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.g(map, z, zvdVar);
        }
    }

    @Override // tb.bwd
    public void g(int i, String str, String str2, String str3, String str4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cabc0d", new Object[]{this, new Integer(i), str, str2, str3, str4, zvdVar, objArr});
        } else {
            k(i, str, null, str3, str4, null, zvdVar, objArr);
        }
    }

    @Override // tb.bwd
    public void h(int i, TLiveMsg tLiveMsg, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d009702", new Object[]{this, new Integer(i), tLiveMsg, new Integer(i2)});
        }
    }

    @Override // tb.bwd
    public void i(int i, TLiveMsg tLiveMsg, zvd zvdVar, Object... objArr) {
        f1h f1hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02d9a54", new Object[]{this, new Integer(i), tLiveMsg, zvdVar, objArr});
        } else if (tLiveMsg != null && (f1hVar = this.f24442a) != null) {
            f1hVar.p(tLiveMsg, zvdVar);
        }
    }

    @Override // tb.bwd
    public void j(int i, String str, String str2, String str3, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669116f0", new Object[]{this, new Integer(i), str, str2, str3, zvdVar, objArr});
        } else {
            p(i, str, null, str2, str3, zvdVar, objArr);
        }
    }

    @Override // tb.bwd
    public void k(int i, String str, String str2, String str3, String str4, String str5, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5db943", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, zvdVar, objArr});
            return;
        }
        if (this.f24442a != null) {
            zqi zqiVar = new zqi();
            zqiVar.f32948a = i;
            zqiVar.b = str;
            zqiVar.c = str2;
            zqiVar.d = str3;
            zqiVar.e = str5;
            zqiVar.f = zvdVar;
            this.f24442a.v(zqiVar);
            this.f24442a.u(this.b);
            this.f24442a = null;
        }
        this.e = null;
        v2s.o().f().b(this);
        v2s.o().m().b(v2s.o().f().getApplication(), this);
    }

    @Override // tb.bwd
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d990194", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.o();
        }
    }

    @Override // tb.bwd
    public void m(TLiveMsg tLiveMsg, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68fd7bf", new Object[]{this, tLiveMsg, new Integer(i), new Boolean(z)});
        }
    }

    @Override // tb.bwd
    public void n(int i, TLiveMsg tLiveMsg, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123e39e", new Object[]{this, new Integer(i), tLiveMsg, zvdVar, objArr});
        } else {
            i(i, tLiveMsg, zvdVar, objArr);
        }
    }

    @Override // tb.bwd
    public int o(int i, String str, awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e6aebfe", new Object[]{this, new Integer(i), str, awdVar})).intValue();
        }
        if (this.b == null) {
            this.b = new r1h();
        }
        this.b.c(awdVar);
        return 1;
    }

    @Override // tb.hgb.a
    public void onAppInBackgroud() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.i();
        }
    }

    @Override // tb.hgb.a
    public void onAppInForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.j();
        }
    }

    @Override // tb.bwd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.k();
        }
    }

    @Override // tb.bwd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        f1h f1hVar = this.f24442a;
        if (f1hVar != null) {
            f1hVar.l();
        }
    }

    @Override // tb.bwd
    public void p(int i, String str, String str2, String str3, String str4, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a164166", new Object[]{this, new Integer(i), str, str2, str3, str4, zvdVar, objArr});
        } else {
            q(i, str, null, str3, str4, null, zvdVar, objArr);
        }
    }

    @Override // tb.bwd
    public void q(int i, String str, String str2, String str3, String str4, String str5, zvd zvdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6edfa5c", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, zvdVar, objArr});
            return;
        }
        v2s.o().C().a();
        v2s.o().m().a(v2s.o().f().getApplication(), this);
        v2s.o().f().a(this);
        f1h f1hVar = new f1h(v2s.o().F().getUtdid(v2s.o().f().getApplication()), this.c, this.d, new a());
        this.f24442a = f1hVar;
        f1hVar.r(vwl.e().a());
        zqi zqiVar = new zqi();
        zqiVar.f32948a = i;
        zqiVar.b = str;
        zqiVar.c = str2;
        zqiVar.d = str3;
        zqiVar.e = str5;
        zqiVar.f = zvdVar;
        this.f24442a.t(zqiVar);
        this.f24442a.n(this.b);
    }

    @Override // tb.bwd
    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
    }
}
