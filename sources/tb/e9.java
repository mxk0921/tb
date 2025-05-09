package tb;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class e9 implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTACH_MODE_ACTIVITY = "activity";
    public static final String ATTACH_MODE_VIEW = "view";
    public static final String ATTACH_MODE_WINDOW = "popWindow";
    public static final a Companion = new a(null);
    public static final String DROID_PAN_ENABLE = "droidPanEnable";
    public static boolean P = false;
    public static final int PERCENT_100 = 10000;
    public static final float SIZE_FULL = 1.0f;
    public static final float SIZE_MATCH_CONTENT = -2.0f;
    public static final String TAK_ABILITY_MATCH_CONTENT = "matchContent";
    public static final String TAK_ABILITY_SHOW_POP_MAX_HEIGHT = "maxHeight";
    public static final String TAK_ABILITY_SHOW_POP_MAX_WIDTH = "maxWidth";
    public boolean A;
    public boolean B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public String O;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18364a;
    public boolean b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(336592994);
        }

        public a() {
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5eefd660", new Object[]{this})).booleanValue();
            }
            return e9.a();
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b14f4404", new Object[]{this, new Boolean(z)});
            } else {
                e9.f(z);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final e9 b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e9) ipChange.ipc$dispatch("ee3c33ac", new Object[]{this, jSONObject});
            }
            e9 e9Var = new e9(null);
            e9.d(e9Var, vwf.g(jSONObject, "backgroundMode", "normal"));
            e9Var.C0(vwf.g(jSONObject, "animation", null));
            e9.e(e9Var, vwf.g(jSONObject, "backgroundStyle", ""));
            e9.l(e9Var, vwf.b(jSONObject, "tapEnable", true));
            e9.j(e9Var, vwf.b(jSONObject, "panEnable", abl.c()));
            e9Var.x0(vwf.b(jSONObject, e9.TAK_ABILITY_MATCH_CONTENT, false));
            float f = 10000;
            int c = hfn.c(0, (int) (vwf.c(jSONObject, "offset", 0.0f) * f));
            if (jSONObject == null || !jSONObject.containsKey("originHeight")) {
                e9Var.y0((int) (vwf.c(jSONObject, "maxHeight", 0.9f) * f));
                e9Var.A0(e9Var.Q() - c);
            } else {
                float c2 = vwf.c(jSONObject, "originHeight", 0.9f);
                e9Var.A0((int) (c2 * f));
                e9Var.y0((int) (vwf.c(jSONObject, "maxHeight", c2) * f));
            }
            e9Var.y0(hfn.f(10000, hfn.c(0, e9Var.Q())));
            e9Var.A0(hfn.f(e9Var.Q(), hfn.c(0, e9Var.S())));
            if (jSONObject == null || !jSONObject.containsKey("originWidth")) {
                e9Var.z0((int) (vwf.c(jSONObject, "maxWidth", 1.0f) * f));
                e9Var.B0(e9Var.R() - c);
            } else {
                float c3 = vwf.c(jSONObject, "originWidth", 1.0f);
                e9Var.B0((int) (c3 * f));
                e9Var.z0((int) (vwf.c(jSONObject, "maxWidth", c3) * f));
            }
            e9Var.z0(hfn.f(10000, hfn.c(0, e9Var.R())));
            e9Var.B0(hfn.f(e9Var.R(), hfn.c(0, e9Var.T())));
            e9Var.m0(vwf.b(jSONObject, "shouldBlockClose", false));
            e9.p(e9Var, vwf.b(jSONObject, "showLoading", false));
            String g = vwf.g(jSONObject, "contentBackColor", null);
            if (g != null) {
                try {
                    e9Var.n0(Color.parseColor(g));
                } catch (IllegalArgumentException unused) {
                }
            }
            e9.b(e9Var, vwf.g(jSONObject, "attachMode", "view"));
            e9Var.o0(vwf.d(jSONObject, hij.KEY_CORNER_RADIUS, xbm.a()));
            if (e9Var.C() < 0) {
                e9Var.o0(0);
            }
            e9.c(e9Var, vwf.b(jSONObject, "autoKeyboard", true));
            e9Var.r0(vwf.b(jSONObject, e9.DROID_PAN_ENABLE, false));
            e9.h(e9Var, vwf.b(jSONObject, "droidFullScreen", true));
            e9Var.u0(vwf.g(jSONObject, "gravity", null));
            e9.n(e9Var, vwf.b(jSONObject, "isOpaque", true));
            e9.q(e9Var, vwf.b(jSONObject, a1v.SKIP_PAGE, false));
            e9.o(e9Var, vwf.b(jSONObject, "shouldShowClose", false));
            e9.r(e9Var, vwf.b(jSONObject, "useH5UTFlag", false));
            e9.i(e9Var, vwf.b(jSONObject, nbf.STDPOP_CONFIG_BACK, true));
            e9.k(e9Var, vwf.b(jSONObject, "enableSendEventToFromPage", false));
            e9Var.p0(vwf.g(jSONObject, "drawerMode", null));
            e9Var.q0(vwf.b(jSONObject, "drawerNotModal", false));
            e9Var.k0(vwf.b(jSONObject, "autoRotate", a()));
            e9Var.i0(vwf.b(jSONObject, "adaptSpecificPadPop", false));
            e9.g(e9Var, vwf.b(jSONObject, "droidBlockHandleBack", false));
            e9.m(e9Var, vwf.b(jSONObject, nbf.STDPOP_CONFIG_WINDOW_NOTIFY, false));
            e9Var.j0(vwf.b(jSONObject, nbf.STDPOP_ANIM_BACKGROUND, true));
            e9Var.s0(vwf.b(jSONObject, "enableBindingX", false));
            e9Var.v0(vwf.g(jSONObject, "landScapeAnimation", null));
            e9Var.w0(vwf.c(jSONObject, "leftMargin", 0.0f));
            e9Var.G0(vwf.c(jSONObject, "topMargin", 0.0f));
            e9Var.l0(vwf.c(jSONObject, "bottomMargin", 0.0f));
            e9Var.E0(vwf.c(jSONObject, "rightMargin", 0.0f));
            e9Var.F0(vwf.g(jSONObject, "title", null));
            e9Var.D0(vwf.d(jSONObject, "popContainerId", -1));
            e9Var.t0(vwf.d(jSONObject, "enterAnimDuration", -1));
            return e9Var;
        }
    }

    static {
        t2o.a(336592993);
    }

    public /* synthetic */ e9(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7794a67", new Object[0])).booleanValue();
        }
        return P;
    }

    public static final /* synthetic */ void b(e9 e9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d09afe", new Object[]{e9Var, str});
        } else {
            e9Var.o = str;
        }
    }

    public static final /* synthetic */ void c(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1e8ce", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.q = z;
        }
    }

    @JvmStatic
    public static final e9 c0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e9) ipChange.ipc$dispatch("ee3c33ac", new Object[]{jSONObject});
        }
        return Companion.b(jSONObject);
    }

    public static final /* synthetic */ void d(e9 e9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7049f535", new Object[]{e9Var, str});
        } else {
            e9Var.i = str;
        }
    }

    public static final /* synthetic */ void e(e9 e9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a87007", new Object[]{e9Var, str});
        } else {
            e9Var.j = str;
        }
    }

    public static final /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817d0d45", new Object[]{new Boolean(z)});
        } else {
            P = z;
        }
    }

    public static final /* synthetic */ void g(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83d9498", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.z = z;
        }
    }

    public static final /* synthetic */ void h(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b40f4b", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.s = z;
        }
    }

    public static final /* synthetic */ void i(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c69b2", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.y = z;
        }
    }

    public static final /* synthetic */ void j(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca31dcee", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.b = z;
        }
    }

    public static final /* synthetic */ void k(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374a0057", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.A = z;
        }
    }

    public static final /* synthetic */ void l(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3983c8f4", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.f18364a = z;
        }
    }

    public static final /* synthetic */ void m(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ef75b", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.B = z;
        }
    }

    public static final /* synthetic */ void n(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2e6a39", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.u = z;
        }
    }

    public static final /* synthetic */ void o(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12e54f", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.w = z;
        }
    }

    public static final /* synthetic */ void p(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcbaa53", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.m = z;
        }
    }

    public static final /* synthetic */ void q(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a030abc6", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.v = z;
        }
    }

    public static final /* synthetic */ void r(e9 e9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787ccb33", new Object[]{e9Var, new Boolean(z)});
        } else {
            e9Var.x = z;
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc08076", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final void A0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc0474d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64c8db55", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public final void B0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effd4d9e", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b7", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public final void C0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6209f686", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3500f0f", new Object[]{this});
        }
        return this.C;
    }

    public final void D0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be65a40f", new Object[]{this, new Integer(i)});
        } else {
            this.I = i;
        }
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e96020ac", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public final void E0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772d03f1", new Object[]{this, new Float(f)});
        } else {
            this.N = f;
        }
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9ccbf81", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final void F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.O = str;
        }
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b8d54c", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public final void G0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304af98", new Object[]{this, new Float(f)});
        } else {
            this.K = f;
        }
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fca9e5", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e2beb3", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("864be497", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public final boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ecef758", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31a5c", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public final int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e064da01", new Object[]{this})).intValue();
        }
        return this.J;
    }

    public final String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f47bfe1", new Object[]{this});
        }
        return this.t;
    }

    public final String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94ae0f3a", new Object[]{this});
        }
        return this.d;
    }

    public final float P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c680af82", new Object[]{this})).floatValue();
        }
        return this.L;
    }

    public final int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d041faef", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("632e55d", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9294c84", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5113fbf0", new Object[]{this});
        }
        return this.c;
    }

    public final int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87befb5b", new Object[]{this})).intValue();
        }
        return this.I;
    }

    public final float W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d0002b", new Object[]{this})).floatValue();
        }
        return this.N;
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a51b450", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57f53654", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.O;
    }

    public final float a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3710f6a4", new Object[]{this})).floatValue();
        }
        return this.K;
    }

    public final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1d5734", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    public final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945cbe9b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6811daa1", new Object[]{this})).booleanValue();
        }
        return this.f18364a;
    }

    public final boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2a302c9", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce718cf6", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca155483", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public final void i0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fb789d", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a831d0a0", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public final void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad424c1", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public final void l0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ade73be", new Object[]{this, new Float(f)});
        } else {
            this.M = f;
        }
    }

    public final void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8326da16", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8297c355", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public final void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public final void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9b5a47", new Object[]{this, str});
        } else {
            this.C = str;
        }
    }

    public final void q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e966a0", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final void r0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cde0487", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57f0f7a7", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public final void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91762015", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b97b4644", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public final void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7a76c1", new Object[]{this, new Integer(i)});
        } else {
            this.J = i;
        }
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fc7003b", new Object[]{this});
        }
        return this.o;
    }

    public final void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b3c51d", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae137b7", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e5937c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("339b46b", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public final void w0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406c43e2", new Object[]{this, new Float(f)});
        } else {
            this.L = f;
        }
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afb10c72", new Object[]{this});
        }
        return this.i;
    }

    public final void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d59b077", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e8fe2c", new Object[]{this});
        }
        return this.j;
    }

    public final void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final float z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54e726", new Object[]{this})).floatValue();
        }
        return this.M;
    }

    public final void z0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public e9() {
        this.f18364a = true;
        this.y = true;
        this.G = true;
        this.I = -1;
        this.J = -1;
    }
}
