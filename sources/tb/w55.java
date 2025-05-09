package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMRequester;
import com.taobao.android.ultron.datamodel.imp.NextRpcRequester;
import java.util.List;
import java.util.Map;
import tb.eq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w55 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "trade_debug";

    /* renamed from: a  reason: collision with root package name */
    public String f30468a;
    public String b;
    public String e;
    public String f;
    public int g;
    public Map<String, String> j;
    public Map<String, String> k;
    public fsb n;
    public IDMComponent p;
    public String s;
    public final Context v;
    public final SharedPreferences w;
    public boolean y;
    public boolean z;
    public boolean c = true;
    public boolean d = true;
    public boolean h = true;
    public boolean i = false;
    public String l = "default";
    public String m = "";
    public boolean o = false;
    public final boolean q = true;
    public boolean r = false;
    public boolean t = false;
    public boolean u = true;
    public boolean x = true;
    public boolean A = true;
    public final double B = 30.0d;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = true;
    public boolean G = true;
    public boolean H = true;
    public Handler I = null;
    public boolean J = false;
    public int K = 0;

    static {
        t2o.a(83886119);
    }

    public w55(Context context) {
        this.v = context;
        if (yv6.b(context)) {
            this.w = context.getApplicationContext().getSharedPreferences(NAMESPACE, 0);
        }
    }

    public fsb A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("ba1b82d9", new Object[]{this});
        }
        return this.n;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.e;
    }

    public List<eq6.a> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32c4fe3f", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.k;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be3cf212", new Object[]{this})).intValue();
        }
        return this.K;
    }

    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.j;
    }

    public Class<?> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d7ccf95", new Object[]{this});
        }
        return null;
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.s;
    }

    public IDMComponent I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("6d202ba6", new Object[]{this});
        }
        return this.p;
    }

    public String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.f;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (!yv6.b(this.v)) {
            return this.b;
        }
        SharedPreferences sharedPreferences = this.w;
        return sharedPreferences.getString(this.f30468a + ".version", this.b);
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28628159", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0622afd", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23572630", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cf7a97f", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d06c728", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a67e1b20", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public w55 S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("e40ea9c2", new Object[]{this, new Boolean(z)});
        }
        this.z = z;
        return this;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45516c2", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public w55 U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("d6495067", new Object[]{this, new Boolean(z)});
        }
        this.A = z;
        return this;
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef51b27", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f430765d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f770dae3", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public w55 Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("c62074bf", new Object[]{this, new Boolean(z)});
        }
        this.x = z;
        return this;
    }

    public w55 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("1910f0a3", new Object[]{this, new Boolean(z)});
        }
        this.r = z;
        return this;
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ab717f", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public w55 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("1860038d", new Object[]{this, str});
        }
        this.f30468a = str;
        return this;
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a99b176", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public w55 c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("fb6aa60a", new Object[]{this, new Integer(i)});
        }
        this.g = i;
        return this;
    }

    public w55 c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("83789592", new Object[]{this, new Boolean(z)});
        }
        this.F = z;
        return this;
    }

    public w55 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("f3ba34e9", new Object[]{this, str});
        }
        this.l = str;
        return this;
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("658cfe92", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public w55 e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("29dbac8b", new Object[]{this, str});
        }
        this.m = str;
        return this;
    }

    public w55 e0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("3aad4d1f", new Object[]{this, new Boolean(z)});
        }
        this.y = z;
        return this;
    }

    public zv f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zv) ipChange.ipc$dispatch("1cef68", new Object[]{this, new Boolean(z)});
        }
        this.H = z;
        return new n7h(this);
    }

    public boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb0051df", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public NextRpcRequester g(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRpcRequester) ipChange.ipc$dispatch("7ea4334c", new Object[]{this, fsbVar});
        }
        if (!l() || fsbVar == null) {
            return null;
        }
        this.n = fsbVar;
        return new NextRpcRequester(this);
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ef56d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public hsb h(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hsb) ipChange.ipc$dispatch("c5ec1205", new Object[]{this, fsbVar});
        }
        if (!l() || fsbVar == null) {
            return null;
        }
        this.n = fsbVar;
        return new DMRequester(this);
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public opq i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("288dedd5", new Object[]{this});
        }
        if (!l()) {
            return null;
        }
        return new opq(this);
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d53e4278", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public opq j(IDMComponent iDMComponent, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("55087d6c", new Object[]{this, iDMComponent, fsbVar});
        }
        if (!l() || fsbVar == null) {
            return null;
        }
        this.p = iDMComponent;
        this.o = true;
        this.n = fsbVar;
        return new opq(this);
    }

    public w55 j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("bafa4a7", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public opq k(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("dd0448c", new Object[]{this, fsbVar});
        }
        if (!l() || fsbVar == null) {
            return null;
        }
        this.n = fsbVar;
        return new opq(this);
    }

    public w55 k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("d88a7beb", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public final boolean l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        String str2 = this.f30468a;
        if (str2 == null || str2.length() <= 0 || (str = this.b) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public w55 l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("8fde5685", new Object[]{this, new Boolean(z)});
        }
        this.D = z;
        return this;
    }

    public Handler m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("74d20826", new Object[]{this});
        }
        return this.I;
    }

    public boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c5b83c5", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public w55 n(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("bd0da408", new Object[]{this, handler});
        }
        this.I = handler;
        return this;
    }

    public w55 n0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("2cec1197", new Object[]{this, new Boolean(z)});
        }
        this.E = z;
        return this;
    }

    public w55 o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("55858aa3", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7da057", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public w55 p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("a366c6c9", new Object[]{this, new Boolean(z)});
        }
        this.G = z;
        return this;
    }

    public w55 p0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("dad44600", new Object[]{this, map});
        }
        this.j = map;
        return this;
    }

    public w55 q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("402e19de", new Object[]{this, new Boolean(z)});
        }
        this.J = z;
        return this;
    }

    public w55 q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("bbfc292c", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public w55 r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("ca8a59d6", new Object[]{this, new Boolean(z)});
        }
        this.C = z;
        return this;
    }

    public w55 r0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("3b232971", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public double s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806693e", new Object[]{this})).doubleValue();
        }
        return this.B;
    }

    public w55 s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("768cd478", new Object[]{this, new Boolean(z)});
        }
        this.t = z;
        return this;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        if (!yv6.b(this.v)) {
            return this.f30468a;
        }
        SharedPreferences sharedPreferences = this.w;
        String str = this.f30468a;
        return sharedPreferences.getString(str, str);
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9747738", new Object[]{this, new Integer(i)});
        } else {
            this.K = i;
        }
    }

    public NextRpcRequester.NextRpcAttachedResponseStrategy u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRpcRequester.NextRpcAttachedResponseStrategy) ipChange.ipc$dispatch("83528a05", new Object[]{this});
        }
        return null;
    }

    public w55 u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("ef19ca7", new Object[]{this, str});
        }
        this.s = str;
        return this;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public w55 v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("d89ef870", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.l;
    }

    public boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1afc1068", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return this.m;
    }

    public w55 x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("65b9207", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec203201", new Object[]{this});
        }
        return null;
    }

    public w55 y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("10d16e82", new Object[]{this, new Boolean(z)});
        }
        this.u = z;
        return this;
    }

    public Context z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.v;
    }

    public w55 z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("4d76ce0f", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }
}
