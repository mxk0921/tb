package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.analytics.core.logbuilder.GoogleAdvertisingIdClient;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.sync.UploadMode;
import com.alibaba.analytics.core.sync.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o2w s_instance = new o2w();

    /* renamed from: a  reason: collision with root package name */
    public Context f25115a = null;
    public volatile x4e b = null;
    public boolean c = false;
    public String d = null;
    public Map<String, String> e = null;
    public String f = null;
    public boolean g = false;
    public volatile boolean h = false;
    public volatile boolean i = false;
    public xzu j = null;
    public volatile String k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public String r = null;
    public boolean s = false;
    public boolean t = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o2w.b(o2w.this);
            }
        }
    }

    static {
        t2o.a(962592814);
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9597dd7c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void b(o2w o2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d935355", new Object[]{o2wVar});
        } else {
            o2wVar.b0();
        }
    }

    public static o2w k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2w) ipChange.ipc$dispatch("303327a2", new Object[0]);
        }
        return s_instance;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b0e0df", new Object[]{this});
            return;
        }
        Context context = this.f25115a;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("UTRealTimeDebug", 0);
            long j = sharedPreferences.getLong("debug_date", 0L);
            nhh.f("", "debugDate", Long.valueOf(j));
            if (System.currentTimeMillis() - j <= 14400000) {
                HashMap hashMap = new HashMap();
                hashMap.put("debug_api_url", sharedPreferences.getString("debug_api_url", ""));
                hashMap.put("debug_key", sharedPreferences.getString("debug_key", ""));
                a(hashMap);
            }
        }
    }

    public final void B() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543623b1", new Object[]{this});
        } else if (!this.t && (context = this.f25115a) != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("UTRealTimeDebug", 0);
            long j = sharedPreferences.getLong("debug_date", 0L);
            nhh.m("", "debugDate", Long.valueOf(j));
            if (System.currentTimeMillis() - j <= 14400000) {
                String string = sharedPreferences.getString("debug_key", "");
                nhh.m("", "debugKey", string);
                if (hsq.h(string)) {
                    R(string);
                    V();
                }
            }
            this.t = true;
        }
    }

    public synchronized void C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9297f", new Object[]{this, context});
        } else if (context == null) {
            nhh.v("Variables", "AnalyticsImp init failed, context is null");
        } else {
            z(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.i && x0i.b().c()) {
                vyp.i().w();
                GoogleAdvertisingIdClient.c(this.f25115a);
                vyp.i().j();
                B();
                bmv.b().c();
                vyp.i().u();
            }
            this.i = true;
            nhh.m("Variables", "initSimple", Boolean.valueOf(this.i), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public synchronized boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24657935", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b013c735", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5864ed0", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public synchronized boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69e5d48e", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public synchronized boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fd83009", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public synchronized boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b47a057", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public synchronized void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa6f78c", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public synchronized void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabce38b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            vyp.i().y(str);
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
        } else {
            vyp.i().z(str);
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        } else {
            nhh.s(z);
        }
    }

    public synchronized void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6662a59f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public synchronized void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266ed2b4", new Object[]{this});
            return;
        }
        this.g = true;
        j71.f21807a = true;
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b73750", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public synchronized void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c1aec2", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public synchronized void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d19259", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public synchronized void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29db619", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void X(x4e x4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890eeed9", new Object[]{this, x4eVar});
            return;
        }
        this.b = x4eVar;
        if (x4eVar != null) {
            vyp.i().x(x4eVar.getAppkey());
        }
    }

    public synchronized void Y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7854497", new Object[]{this, map});
            return;
        }
        this.e = map;
        if (map == null || map.size() <= 0) {
            this.f = "";
        } else {
            this.f = hsq.b(map);
        }
    }

    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e915c2f", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void a0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7098e24b", new Object[]{this, map});
        } else if (this.f25115a != null) {
            nhh.l("", map);
            SharedPreferences.Editor edit = this.f25115a.getSharedPreferences("UTRealTimeDebug", 0).edit();
            if (map == null || !map.containsKey("debug_store")) {
                edit.putLong("debug_date", 0L);
            } else {
                edit.putString("debug_api_url", map.get("debug_api_url"));
                edit.putString("debug_key", map.get("debug_key"));
                edit.putLong("debug_date", System.currentTimeMillis());
            }
            edit.commit();
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2716a0", new Object[]{this});
            return;
        }
        try {
            Map<String, String> f = u51.f(this.f25115a);
            if (f != null && f.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(oeh.EVENTID, "1021");
                hashMap.putAll(f);
                ozu.getInstance().transferLog(hashMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return vyp.i().d();
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6d9edb", new Object[]{this});
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return vyp.i().e();
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
            return;
        }
        nhh.d();
        M();
        R(null);
        c.p().t(UploadMode.INTERVAL);
        a0(null);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        return vyp.i().f();
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            Q(true);
        }
    }

    public xzu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xzu) ipChange.ipc$dispatch("5f0914f9", new Object[]{this});
        }
        return this.j;
    }

    public void f0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
            return;
        }
        a(map);
        a0(map);
    }

    public Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return vyp.i().g();
    }

    public void g0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
        } else {
            vyp.i().K(str, str2, str3);
        }
    }

    public c55 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c55) ipChange.ipc$dispatch("56dc57cd", new Object[]{this});
        }
        return vyp.i().h();
    }

    public void h0(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
        } else {
            vyp.i().L(str, str2, str3, str4);
        }
    }

    public synchronized String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4802bb7", new Object[]{this});
        }
        return this.d;
    }

    public synchronized boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("103eed44", new Object[]{this})).booleanValue();
        } else if (mp7.b()) {
            return false;
        } else {
            return this.g;
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("465d35b4", new Object[]{this});
        }
        return vyp.i().k();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1778450", new Object[]{this});
        }
        return vyp.i().l();
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85e714a6", new Object[]{this});
        }
        return vyp.i().m();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5167c9fe", new Object[]{this});
        }
        return vyp.i().o();
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a26572a0", new Object[]{this});
        }
        if (this.s) {
            return this.r;
        }
        Context g = g();
        if (g == null) {
            return null;
        }
        String i = u51.i(g, "build_id");
        this.r = i;
        this.s = true;
        return i;
    }

    public x4e q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4e) ipChange.ipc$dispatch("b7635f01", new Object[]{this});
        }
        return this.b;
    }

    public synchronized Map<String, String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d8e4e76f", new Object[]{this});
        }
        return this.e;
    }

    public synchronized String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c5933d5", new Object[]{this});
        }
        return this.f;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37e918f", new Object[]{this});
        }
        return this.k;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1331774", new Object[]{this});
        }
        if (this.k != null) {
            return String.valueOf(this.k.hashCode());
        }
        return null;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f8218d1", new Object[]{this});
        }
        return vyp.i().q();
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee0635d", new Object[]{this});
        }
        return vyp.i().r();
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a716a55", new Object[]{this});
        }
        return vyp.i().s();
    }

    public final void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da3ab02", new Object[]{this, context});
        } else if (context != null && this.f25115a == null) {
            this.f25115a = context;
            vyp.i().A(this.f25115a);
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("653bd2c8", new Object[]{this})).booleanValue();
        }
        if (this.q) {
            return this.p;
        }
        Context g = g();
        if (g == null) {
            return false;
        }
        if ("1".equalsIgnoreCase(u51.i(g, "package_type"))) {
            this.p = true;
            this.q = true;
        }
        return this.p;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6444c11", new Object[]{this, map});
            return;
        }
        nhh.d();
        if ("0".equalsIgnoreCase(x2r.f().e("real_time_debug"))) {
            nhh.v("Variables", "Server Config turn off RealTimeDebug Mode!");
        } else if (mp7.b()) {
            nhh.v("Variables", "Server Config(disable_ut_debug) turn off RealTimeDebug Mode!");
        } else if (map == null) {
        } else {
            if ((!k().K() || !map.containsKey("debug_normal")) && map.containsKey("debug_api_url") && map.containsKey("debug_key")) {
                String str = map.get("debug_key");
                if (!hsq.f(map.get("debug_api_url")) && !hsq.f(str)) {
                    V();
                    R(str);
                }
                if (map.containsKey("debug_sampling_option")) {
                    S();
                }
                if (!map.containsKey("debug_normal")) {
                    Q(true);
                    c.p().t(UploadMode.REALTIME);
                }
            }
        }
    }

    public synchronized void y(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        if (!(application == null || application.getApplicationContext() == null)) {
            z(application.getApplicationContext());
            nhh.m("Variables", "init", Boolean.valueOf(this.h));
            if (!this.h) {
                vyp.i().w();
                GoogleAdvertisingIdClient.c(this.f25115a);
                Object obj = null;
                rhv.b().d(this.f25115a);
                gx4.b().c();
                w9p.a().b();
                vyp.i().j();
                vyp.i().u();
                NetworkUtil.m(this.f25115a);
                try {
                    IpChange ipChange2 = OrangeConfig.$ipChange;
                    obj = OrangeConfig.class;
                } catch (Throwable unused) {
                }
                if (obj != null) {
                    this.j = new z1v();
                } else {
                    this.j = new t0v();
                }
                this.j.f(q2v.d());
                this.j.f(new h0v());
                this.j.f(sa.h());
                this.j.f(n2v.g());
                try {
                    this.j.f(x2r.f());
                    szt.d().g();
                    x2r.f().i(ds3.KEY, ds3.d());
                    x2r.f().i(iv6.KEY, new iv6());
                    x2r.f().i(rh1.KEY, new rh1());
                    x2r.f().i(vnx.KEY, new vnx());
                    x2r.f().i(mp7.KEY, new mp7());
                    x2r.f().i(bbq.KEY, new bbq());
                    x2r.f().i(c1v.KEY, c1v.e());
                    x2r.f().i(q1v.KEY, q1v.c());
                    x2r.f().i(d4v.KEY, d4v.d());
                    x2r.f().i(x0i.KEY, x0i.b());
                    uzt.b().f();
                } catch (Throwable unused2) {
                }
                this.j.h();
                lut.m().n();
                j71.d(application);
                A();
                c.p().q(this.f25115a);
                zdt.c().f(new a());
                this.h = true;
                nhh.m("Variables", "init", Boolean.valueOf(this.h));
            } else {
                m0v.a();
            }
            return;
        }
        nhh.v("Variables", "AnalyticsImp init failed, context is null");
    }
}
