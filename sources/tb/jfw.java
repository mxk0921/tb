package tb;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a G;
    public b H;
    public Object I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int Q;
    public int R;
    public Boolean V;
    public int c;
    public String c0;
    public int d;
    public String d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public Rect g0;
    public int h;
    public boolean h0;
    public int i;
    public int j;
    public Map j0;
    public int k;
    public float k0;
    public int l;
    public float l0;
    public int m;
    public float m0;
    public int n;
    public float n0;
    public YogaAlign o;
    public float o0;
    public YogaAlign p;
    public YogaAlign q;
    public float r;
    public List<c> r0;
    public float s;
    public int[] s0;
    public float t;
    public float u;
    public n u0;
    public Map v0;
    public YogaJustify w;
    public YogaWrap x;
    public YogaDisplay y;
    public YogaPositionType z;

    /* renamed from: a  reason: collision with root package name */
    public int f21973a = -1;
    public int b = -1;
    public YogaFlexDirection v = YogaFlexDirection.COLUMN;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = 1;
    public int F = 1;
    public int P = 1;
    public boolean S = false;
    public float T = 1.0f;
    public boolean U = true;
    public boolean W = true;
    public String X = null;
    public String Y = null;
    public boolean Z = false;
    public boolean a0 = true;
    public int b0 = 1000;
    public double i0 = 1.0d;
    public float p0 = 1.0f;
    public float q0 = 1.0f;
    public boolean t0 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f21976a;
        public final int b;
        public final String c;
        public final int d;

        static {
            t2o.a(503317353);
        }

        public c(String str) {
            this.b = 300;
            this.c = Constants.TimeFunction.EASE;
            this.d = 0;
            List<String> H = nwv.H(str.trim(), ' ');
            int size = H.size();
            if (size > 0) {
                this.f21976a = H.get(0);
                if (size > 1) {
                    String str2 = H.get(1);
                    if (str2.endsWith("ms")) {
                        this.b = nwv.t(str2.substring(0, str2.length() - 2), 0);
                    } else if (str2.endsWith("s")) {
                        this.b = nwv.t(str2.substring(0, str2.length() - 1), 0) * 1000;
                    } else {
                        this.b = nwv.t(str2, 0);
                    }
                }
                if (size > 2) {
                    this.c = H.get(2);
                }
                if (size > 3) {
                    String str3 = H.get(3);
                    if (str3.endsWith("ms")) {
                        this.d = nwv.t(str3.substring(0, str3.length() - 2), 0);
                    } else if (str3.endsWith("s")) {
                        this.d = nwv.t(str3.substring(0, str3.length() - 1), 0) * 1000;
                    } else {
                        this.d = nwv.t(str3, 0);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static tb.jfw.c a(java.lang.String r4, java.util.List<tb.jfw.c> r5) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = tb.jfw.c.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "1e4e11d4"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r4 = 1
                r2[r4] = r5
                java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
                tb.jfw$c r4 = (tb.jfw.c) r4
                return r4
            L_0x0018:
                if (r5 == 0) goto L_0x003d
                java.util.Iterator r5 = r5.iterator()
            L_0x001e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x003d
                java.lang.Object r0 = r5.next()
                tb.jfw$c r0 = (tb.jfw.c) r0
                java.lang.String r1 = r0.f21976a
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto L_0x003c
                java.lang.String r1 = r0.f21976a
                java.lang.String r2 = "all"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x001e
            L_0x003c:
                return r0
            L_0x003d:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.jfw.c.a(java.lang.String, java.util.List):tb.jfw$c");
        }

        public static List<c> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("bfd3bc48", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            List<String> H = nwv.H(str.trim(), ',');
            ArrayList arrayList = new ArrayList(H.size());
            for (String str2 : H) {
                arrayList.add(new c(str2));
            }
            return arrayList;
        }

        public qy0 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qy0) ipChange.ipc$dispatch("11b0f79b", new Object[]{this});
            }
            qy0 qy0Var = new qy0();
            qy0Var.f26995a = this.b;
            qy0Var.b = this.d;
            qy0Var.e = w7l.a(this.c);
            qy0Var.g = new wy0();
            return qy0Var;
        }
    }

    static {
        t2o.a(503317350);
    }

    @Deprecated
    public static int F(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40decb2b", new Object[]{context, obj})).intValue();
        }
        if (obj instanceof Number) {
            return s6o.T(context, ((Number) obj).toString());
        }
        return s6o.T(context, nwv.E0(obj));
    }

    public static int G(n nVar, Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9559e3f1", new Object[]{nVar, context, obj})).intValue();
        }
        if (obj instanceof Number) {
            return s6o.U(nVar, context, ((Number) obj).floatValue());
        }
        return s6o.V(nVar, context, nwv.E0(obj));
    }

    public static Rect r(n nVar, Context context, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a6677da6", new Object[]{nVar, context, str});
        }
        if (str == null || (split = str.split(",")) == null || split.length != 4) {
            return null;
        }
        return new Rect(s6o.V(nVar, context, b(split[0])), s6o.V(nVar, context, b(split[1])), s6o.V(nVar, context, b(split[2])), s6o.V(nVar, context, b(split[3])));
    }

    public void D(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdd57d6", new Object[]{this, context, obj});
        } else {
            this.f0 = nwv.t(obj, 0);
        }
    }

    public void E(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc148d7", new Object[]{this, nVar});
        } else if (nVar != null) {
            nVar.P();
            this.u0 = nVar;
        }
    }

    public int H(n nVar, Context context, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15e34e89", new Object[]{this, nVar, context, obj, new Boolean(z)})).intValue();
        }
        if (obj instanceof Number) {
            return s6o.U(nVar, context, ((Number) obj).intValue());
        }
        return s6o.W(nVar, context, nwv.E0(obj), z);
    }

    public void a(jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121fef99", new Object[]{this, jfwVar});
            return;
        }
        this.f21973a = jfwVar.f21973a;
        this.b = jfwVar.b;
        this.c = jfwVar.c;
        this.d = jfwVar.d;
        this.e = jfwVar.e;
        this.f = jfwVar.f;
        this.g = jfwVar.g;
        this.h = jfwVar.h;
        this.i = jfwVar.i;
        this.j = jfwVar.j;
        this.k = jfwVar.k;
        this.l = jfwVar.l;
        this.m = jfwVar.m;
        this.n = jfwVar.n;
        this.o = jfwVar.o;
        this.p = jfwVar.p;
        this.q = jfwVar.q;
        this.r = jfwVar.r;
        this.s = jfwVar.s;
        this.t = jfwVar.t;
        this.u = jfwVar.u;
        this.v = jfwVar.v;
        this.w = jfwVar.w;
        this.x = jfwVar.x;
        this.y = jfwVar.y;
        this.z = jfwVar.z;
        this.A = jfwVar.A;
        this.B = jfwVar.B;
        this.C = jfwVar.C;
        this.D = jfwVar.D;
        this.E = jfwVar.E;
        this.F = jfwVar.F;
        this.H = jfwVar.H;
        this.I = jfwVar.I;
        this.J = jfwVar.J;
        this.K = jfwVar.K;
        this.L = jfwVar.L;
        this.M = jfwVar.M;
        this.N = jfwVar.N;
        this.O = jfwVar.O;
        this.P = jfwVar.P;
        this.S = jfwVar.S;
        this.T = jfwVar.T;
        this.U = jfwVar.U;
        this.W = jfwVar.W;
        this.Q = jfwVar.Q;
        this.R = jfwVar.R;
        this.h0 = jfwVar.h0;
        this.i0 = jfwVar.i0;
    }

    public final Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7bfb0069", new Object[]{this});
        }
        Map map = this.v0;
        if (map != null) {
            return map;
        }
        n nVar = this.u0;
        if (nVar != null) {
            return nVar.I();
        }
        return null;
    }

    public Object d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d4d1312e", new Object[]{this, str, obj});
        }
        n.i h = h();
        if (h != null && h.b && !TextUtils.isEmpty(h.f12248a) && !j() && ("auto".equals(h.f12248a) || ir2.THEME_FORCE_DARK.equals(h.f12248a))) {
            if (k() && "auto".equals(h.f12248a)) {
                String str2 = "dark-theme-" + str;
                Map c2 = c();
                if (c2 != null && c2.containsKey(str2)) {
                    return c2.get(str2);
                }
            } else if (ir2.THEME_FORCE_DARK.equals(h.f12248a)) {
                String str3 = "forcedark-theme-" + str;
                Map c3 = c();
                if (c3 != null && c3.containsKey(str3)) {
                    return c3.get(str3);
                }
            }
        }
        return obj;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5da34c9", new Object[]{this});
        }
        return null;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("568c34b0", new Object[]{this})).intValue();
        }
        return 0;
    }

    public n g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("45ec8f69", new Object[]{this});
        }
        return this.u0;
    }

    public n.i h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n.i) ipChange.ipc$dispatch("d09de537", new Object[]{this});
        }
        n nVar = this.u0;
        if (nVar != null) {
            return nVar.g0().p0();
        }
        return null;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb54c423", new Object[]{this})).booleanValue();
        }
        if (this.J > 0 || this.M > 0 || this.N > 0 || this.L > 0 || this.K > 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77b079f4", new Object[]{this})).booleanValue();
        }
        nxb h = od0.D().h();
        if (h == null || this.u0.N() == null || !h.a(this.u0.N()) || !h.c(this.u0.N())) {
            return false;
        }
        return true;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("788b2141", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("hidden", this.Y);
    }

    public void m(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e681d907", new Object[]{this, context, obj});
        } else {
            this.S = nwv.o(obj, false);
        }
    }

    public void n(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd44f85c", new Object[]{this, context, obj});
        } else {
            this.H = b.a(context, 2, nwv.I(d("background", obj), null), h(), j());
        }
    }

    public void o(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4dbedb", new Object[]{this, context, obj});
        } else {
            this.E = ir2.f(context, 2, d(pg1.ATOM_EXT_UDL_background_color, obj), h(), j());
        }
    }

    public void p(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7969f5e3", new Object[]{this, context, obj});
        } else {
            this.I = obj;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r9.equals(tb.pg1.ATOM_EXT_UDL_border_width) == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 4
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = tb.jfw.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "27a442e8"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r4] = r8
            r3[r1] = r9
            r3[r0] = r10
            r5.ipc$dispatch(r6, r3)
            return
        L_0x001b:
            r9.hashCode()
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1820411228: goto L_0x0068;
                case -1032412580: goto L_0x005d;
                case 292087426: goto L_0x0052;
                case 310371557: goto L_0x0049;
                case 609634231: goto L_0x003e;
                case 881039699: goto L_0x0033;
                case 1466337535: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0072
        L_0x0028:
            java.lang.String r0 = "border-top-left-radius"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r0 = 6
            goto L_0x0072
        L_0x0033:
            java.lang.String r0 = "border-radius"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r0 = 5
            goto L_0x0072
        L_0x003e:
            java.lang.String r0 = "border-bottom-left-radius"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x0026
        L_0x0047:
            r0 = 4
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "border-width"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x0026
        L_0x0052:
            java.lang.String r0 = "border-color"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x0026
        L_0x005b:
            r0 = 2
            goto L_0x0072
        L_0x005d:
            java.lang.String r0 = "border-top-right-radius"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0026
        L_0x0066:
            r0 = 1
            goto L_0x0072
        L_0x0068:
            java.lang.String r0 = "border-bottom-right-radius"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0026
        L_0x0071:
            r0 = 0
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x00ad;
                case 2: goto L_0x009a;
                case 3: goto L_0x0091;
                case 4: goto L_0x0088;
                case 5: goto L_0x007f;
                case 6: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00be
        L_0x0076:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.K = r8
            goto L_0x00be
        L_0x007f:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.J = r8
            goto L_0x00be
        L_0x0088:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.M = r8
            goto L_0x00be
        L_0x0091:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.O = r8
            goto L_0x00be
        L_0x009a:
            java.lang.Object r9 = r7.d(r9, r10)
            com.taobao.tao.flexbox.layoutmanager.core.n$i r10 = r7.h()
            boolean r0 = r7.j()
            int r8 = tb.ir2.f(r8, r4, r9, r10, r0)
            r7.P = r8
            goto L_0x00be
        L_0x00ad:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.L = r8
            goto L_0x00be
        L_0x00b6:
            com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.u0
            int r8 = G(r9, r8, r10)
            r7.N = r8
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jfw.q(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    public void s(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26842e65", new Object[]{this, context, obj});
            return;
        }
        try {
            this.G = a.a(this.u0, context, nwv.I(d(pg1.ATOM_EXT_UDL_box_shadow, obj), null), h(), j());
        } catch (Exception e) {
            tfs.d(e.getMessage());
        }
    }

    public void t(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf01f64", new Object[]{this, context, obj});
        } else {
            this.a0 = nwv.o(obj, true);
        }
    }

    public void u(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45e37ef", new Object[]{this, context, obj});
        } else {
            this.W = nwv.o(obj, true);
        }
    }

    public void v(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
        }
    }

    public void w(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ac6270", new Object[]{this, context, obj});
        } else {
            this.F = ir2.f(context, 1, d("foreground-color", obj), h(), j());
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c63e24", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.endsWith("wx")) {
            trim = trim.substring(0, trim.length() - 2);
        }
        return !trim.endsWith("px") ? trim.concat("px") : trim;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3107acd", new Object[]{this})).booleanValue();
        }
        Map map = this.v0;
        if (map != null) {
            return nwv.o(map.get("theme-auto-color-enabled"), true);
        }
        n nVar = this.u0;
        if (nVar != null) {
            return nwv.o(nVar.H("theme-auto-color-enabled"), true);
        }
        return true;
    }

    public void x(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92405e5", new Object[]{this, context, obj});
        } else {
            this.T = nwv.r(d("opacity", obj), 1);
        }
    }

    public final void y(Context context, HashMap hashMap, zdu zduVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ca1b37", new Object[]{this, context, hashMap, zduVar});
            return;
        }
        Object obj = hashMap.get("rotate");
        int t = obj != null ? nwv.t(obj, 0) : 0;
        Object obj2 = hashMap.get("rotateX");
        int t2 = obj2 != null ? nwv.t(obj2, 0) : 0;
        Object obj3 = hashMap.get("rotateY");
        if (obj3 != null) {
            i = nwv.t(obj3, 0);
        }
        if (zduVar != null) {
            float f = zduVar.c;
            if (f != -2.14748365E9f) {
                t = (int) f;
            }
            float f2 = zduVar.f32699a;
            if (f2 != -2.14748365E9f) {
                t2 = (int) f2;
            }
            float f3 = zduVar.b;
            if (f3 != -2.14748365E9f) {
                i = (int) f3;
            }
        }
        this.m0 = t;
        this.n0 = t2;
        this.o0 = i;
    }

    public final void A(Context context, HashMap hashMap, zdu zduVar) {
        PointF pointF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c7f8e4", new Object[]{this, context, hashMap, zduVar});
            return;
        }
        Object obj = hashMap.get("translateX");
        int G = obj != null ? G(this.u0, context, obj) : 0;
        Object obj2 = hashMap.get("translateY");
        int G2 = obj2 != null ? G(this.u0, context, obj2) : 0;
        Object obj3 = hashMap.get("translate");
        if (obj3 != null) {
            List<String> H = nwv.H(obj3.toString().trim(), ' ');
            if (!H.isEmpty()) {
                if (H.size() == 1) {
                    G = G(this.u0, context, H.get(0));
                    G2 = G(this.u0, context, H.get(0));
                } else if (H.size() > 1) {
                    G = G(this.u0, context, H.get(0));
                    G2 = G(this.u0, context, H.get(1));
                }
            }
        }
        if (!(zduVar == null || (pointF = zduVar.e) == null)) {
            G = (int) pointF.x;
            G2 = (int) pointF.y;
        }
        this.k0 = G;
        this.l0 = G2;
    }

    public void C(Context context, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751775f8", new Object[]{this, context, obj});
            return;
        }
        if (!"true".equals(nwv.E0(obj)) && !"visible".equals(nwv.E0(obj))) {
            z = false;
        }
        this.U = z;
    }

    public final void z(Context context, HashMap hashMap, zdu zduVar) {
        PointF pointF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f69a460", new Object[]{this, context, hashMap, zduVar});
            return;
        }
        Object obj = hashMap.get("scaleX");
        float f = 1.0f;
        float r = obj != null ? nwv.r(obj, 1) : 1.0f;
        Object obj2 = hashMap.get("scaleY");
        if (obj2 != null) {
            f = nwv.r(obj2, 1);
        }
        Object obj3 = hashMap.get("scale");
        if (obj3 != null) {
            List<String> H = nwv.H(obj3.toString().trim(), ' ');
            if (!H.isEmpty()) {
                if (H.size() == 1) {
                    r = nwv.q(H.get(0), r);
                    f = nwv.q(H.get(0), f);
                } else if (H.size() > 1) {
                    r = nwv.q(H.get(0), r);
                    f = nwv.q(H.get(1), f);
                }
            }
        }
        if (!(zduVar == null || (pointF = zduVar.d) == null)) {
            r = pointF.x;
            f = pointF.y;
        }
        this.p0 = r;
        this.q0 = f;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f21975a;
        public int b;
        public int c;

        static {
            t2o.a(503317352);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f21975a == bVar.f21975a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Objects.hash(Integer.valueOf(this.f21975a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public static b a(Context context, int i, String str, n.i iVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5c7c82af", new Object[]{context, new Integer(i), str, iVar, new Boolean(z)});
            }
            String[] p = ir2.p(str);
            if (p == null || p.length != 4) {
                return null;
            }
            b bVar = new b();
            if (p[1].equalsIgnoreCase("top")) {
                bVar.f21975a = 0;
            } else if (p[1].equalsIgnoreCase("bottom")) {
                bVar.f21975a = 1;
            } else if (p[1].equalsIgnoreCase("left")) {
                bVar.f21975a = 2;
            } else if (p[1].equalsIgnoreCase("right")) {
                bVar.f21975a = 3;
            }
            bVar.b = ir2.f(context, i, p[2], iVar, z);
            bVar.c = ir2.f(context, i, p[3], iVar, z);
            return bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f21974a;
        public int b;
        public int c;
        public int d;
        public int e = 1;

        static {
            t2o.a(503317351);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "BoxShadowParams{offsetX=" + this.f21974a + ", offsetY=" + this.b + ", blurRadius=" + this.c + ", spreadRadius=" + this.d + ", shadowColor=" + this.e + '}';
        }

        public static a a(n nVar, Context context, String str, n.i iVar, boolean z) {
            String[] G;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("baa19ad0", new Object[]{nVar, context, str, iVar, new Boolean(z)});
            }
            a aVar = null;
            if (str != null && ((str.contains("#") || str.contains("rgba")) && (G = nwv.G(str, ' ')) != null)) {
                aVar = new a();
                if (G.length == 3) {
                    aVar.f21974a = jfw.G(nVar, context, G[0]);
                    aVar.b = jfw.G(nVar, context, G[1]);
                    aVar.e = ir2.f(context, 2, G[2], iVar, z);
                } else if (G.length == 4) {
                    aVar.f21974a = jfw.G(nVar, context, G[0]);
                    aVar.b = jfw.G(nVar, context, G[1]);
                    aVar.c = jfw.G(nVar, context, G[2]);
                    aVar.e = ir2.f(context, 2, G[3], iVar, z);
                } else if (G.length == 5) {
                    aVar.f21974a = jfw.G(nVar, context, G[0]);
                    aVar.b = jfw.G(nVar, context, G[1]);
                    aVar.c = jfw.G(nVar, context, G[2]);
                    aVar.d = jfw.G(nVar, context, G[3]);
                    aVar.e = ir2.f(context, 2, G[4], iVar, z);
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void B(Context context, HashMap hashMap) {
        char c2;
        YogaFlexDirection yogaFlexDirection;
        int i = 4;
        int i2 = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
            return;
        }
        Object obj = hashMap.get("attrs");
        if (obj instanceof Map) {
            hashMap.putAll((Map) obj);
        }
        this.v0 = hashMap;
        zdu zduVar = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.hashCode();
            switch (str.hashCode()) {
                case -1880840443:
                    if (str.equals("theme-fontlevel-enabled")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1850307423:
                    if (str.equals("layout-animation")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1820411228:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_bottom_right_radius)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1802976921:
                    if (str.equals(pg1.ATOM_EXT_UDL_flex_grow)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1802500706:
                    if (str.equals(pg1.ATOM_EXT_UDL_flex_wrap)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1779213470:
                    if (str.equals(pg1.ATOM_EXT_UDL_box_shadow)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1662432227:
                    if (str.equals(pg1.ATOM_EXT_UDL_max_width)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1609594047:
                    if (str.equals("enabled")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1546463658:
                    if (str.equals("aspect-ratio")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1502084711:
                    if (str.equals(pg1.ATOM_EXT_UDL_padding_top)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1483602118:
                    if (str.equals("auto-focus")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1454606755:
                    if (str.equals(pg1.ATOM_EXT_UDL_flex_shrink)) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1332194002:
                    if (str.equals("background")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1275203969:
                    if (str.equals("border-image-slice")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1089145580:
                    if (str.equals(pg1.ATOM_EXT_UDL_align_self)) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1032412580:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_top_right_radius)) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -925180581:
                    if (str.equals("rotate")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -889953653:
                    if (str.equals(pg1.ATOM_EXT_UDL_min_width)) {
                        c2 = JSONLexer.EOI;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -887955139:
                    if (str.equals(pg1.ATOM_EXT_UDL_margin_right)) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -698087727:
                    if (str.equals("fading-edge")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -681210700:
                    if (str.equals("highlight")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -528615460:
                    if (str.equals("clip-children")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -428786256:
                    if (str.equals(pg1.ATOM_EXT_UDL_max_height)) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -396426912:
                    if (str.equals(pg1.ATOM_EXT_UDL_padding_right)) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -386831417:
                    if (str.equals("target-transition-name")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 122:
                    if (str.equals(AmnetConstant.VAL_SUPPORT_ZSTD)) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3145721:
                    if (str.equals("flex")) {
                        c2 = WXUtils.PERCENT;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 18045802:
                    if (str.equals("click-interval")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 122090044:
                    if (str.equals(pg1.ATOM_EXT_UDL_justify_content)) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 143541095:
                    if (str.equals(pg1.ATOM_EXT_UDL_padding_bottom)) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 292087426:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_color)) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 310371557:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_width)) {
                        c2 = '.';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 366328779:
                    if (str.equals("dash-width")) {
                        c2 = wh6.DIR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 370434080:
                    if (str.equals("hidden-over-parent")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 587430648:
                    if (str.equals(pg1.ATOM_EXT_UDL_align_items)) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 605322756:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_color)) {
                        c2 = '3';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 606085328:
                    if (str.equals("theme-font-scale")) {
                        c2 = '4';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 609634231:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_bottom_left_radius)) {
                        c2 = '5';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 610793468:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_image)) {
                        c2 = '6';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 679766083:
                    if (str.equals(pg1.ATOM_EXT_UDL_padding_left)) {
                        c2 = '7';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 695731883:
                    if (str.equals(pg1.ATOM_EXT_UDL_flex_direction)) {
                        c2 = '8';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 715446705:
                    if (str.equals(pg1.ATOM_EXT_UDL_align_content)) {
                        c2 = '9';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        c2 = f7l.CONDITION_IF_MIDDLE;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 881039699:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_radius)) {
                        c2 = ';';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 941004998:
                    if (str.equals(pg1.ATOM_EXT_UDL_margin_left)) {
                        c2 = '<';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 961048153:
                    if (str.equals("foreground-color")) {
                        c2 = '=';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c2 = '>';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1052832078:
                    if (str.equals("translate")) {
                        c2 = f7l.CONDITION_IF;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1118783052:
                    if (str.equals("accessibility-text")) {
                        c2 = '@';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1384173149:
                    if (str.equals("rotateX")) {
                        c2 = 'A';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1384173150:
                    if (str.equals("rotateY")) {
                        c2 = 'B';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1387629604:
                    if (str.equals("horizontal")) {
                        c2 = 'C';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1389003308:
                    if (str.equals("enable-self-transition")) {
                        c2 = ohh.LEVEL_D;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1466337535:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_top_left_radius)) {
                        c2 = ohh.LEVEL_E;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1558777425:
                    if (str.equals("source-transition-name")) {
                        c2 = 'F';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        c2 = 'G';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1765726747:
                    if (str.equals("dash-gap")) {
                        c2 = 'H';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c2 = ohh.LEVEL_I;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1970025654:
                    if (str.equals(pg1.ATOM_EXT_UDL_margin_top)) {
                        c2 = 'J';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2043213058:
                    if (str.equals(pg1.ATOM_EXT_UDL_min_height)) {
                        c2 = 'K';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2045742989:
                    if (str.equals("apm-valid")) {
                        c2 = ohh.LEVEL_L;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2086035242:
                    if (str.equals(pg1.ATOM_EXT_UDL_margin_bottom)) {
                        c2 = 'M';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    this.h0 = nwv.o(value, false);
                    continue;
                    i = 4;
                    i2 = -1;
                case 1:
                    nwv.o(value, false);
                    continue;
                    i = 4;
                    i2 = -1;
                case 2:
                    this.N = G(this.u0, context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 3:
                    this.s = nwv.r(value, 0);
                    continue;
                    i = 4;
                    i2 = -1;
                case 4:
                    this.x = ir2.x((String) value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 5:
                    s(context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 6:
                    this.r0 = c.b(nwv.E0(value));
                    continue;
                    i = 4;
                    i2 = -1;
                case 7:
                case '\b':
                case '?':
                    z = true;
                    continue;
                    i = 4;
                    i2 = -1;
                case '\t':
                    this.e = G(this.u0, context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case '\n':
                    u(context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 11:
                    this.u = nwv.r(value, 0);
                    continue;
                    i = 4;
                    i2 = -1;
                case '\f':
                    this.i = G(this.u0, context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case '\r':
                    m(context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 14:
                    this.t = nwv.r(value, 0);
                    continue;
                    i = 4;
                    i2 = -1;
                case 15:
                    this.D = G(this.u0, context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 16:
                    n(context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 17:
                    String I = nwv.I(value, null);
                    if (I != null) {
                        this.g0 = r(this.u0, context, I);
                        continue;
                    } else {
                        this.g0 = null;
                    }
                    i = 4;
                    i2 = -1;
                case 18:
                    x(context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 19:
                    this.b = G(this.u0, context, value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 20:
                    this.q = ir2.c((String) value);
                    continue;
                    i = 4;
                    i2 = -1;
                case 21:
                    String[] G = nwv.G(nwv.E0(value), ',');
                    if (G.length == 1) {
                        int V = s6o.V(this.u0, context, G[0]);
                        this.n = V;
                        this.l = V;
                        this.m = V;
                        this.k = V;
                        break;
                    } else {
                        this.k = s6o.V(this.u0, context, G[0]);
                        this.m = s6o.V(this.u0, context, G[1]);
                        this.l = s6o.V(this.u0, context, G[2]);
                        this.n = s6o.V(this.u0, context, G[3]);
                        continue;
                        i = 4;
                        i2 = -1;
                    }
                case 22:
                    this.L = G(this.u0, context, value);
                    break;
                case 23:
                case 'A':
                case 'B':
                    z2 = true;
                    break;
                case 24:
                case 25:
                case ')':
                    z3 = true;
                    break;
                case 26:
                    this.c = G(this.u0, context, value);
                    break;
                case 27:
                    this.l = G(this.u0, context, value);
                    break;
                case 28:
                    String[] G2 = nwv.G(nwv.E0(value), ',');
                    if (G2.length == 1) {
                        int V2 = s6o.V(this.u0, context, G2[0]);
                        this.j = V2;
                        this.i = V2;
                        this.h = V2;
                        this.g = V2;
                    } else {
                        this.g = s6o.V(this.u0, context, G2[0]);
                        this.i = s6o.V(this.u0, context, G2[1]);
                        this.h = s6o.V(this.u0, context, G2[2]);
                        this.j = s6o.V(this.u0, context, G2[3]);
                    }
                    break;
                case 29:
                    String I2 = nwv.I(value, null);
                    if (!TextUtils.isEmpty(I2)) {
                        List asList = Arrays.asList(I2.split(","));
                        if (this.s0 == null) {
                            this.s0 = new int[i];
                        }
                        if (asList.size() == 2) {
                            this.s0[0] = G(g(), context, asList.get(0));
                            this.s0[1] = G(g(), context, asList.get(1));
                            int[] iArr = this.s0;
                            iArr[3] = 0;
                            iArr[2] = 0;
                        } else if (asList.size() == 1) {
                            int[] iArr2 = this.s0;
                            int G3 = G(g(), context, asList.get(0));
                            iArr2[1] = G3;
                            iArr2[0] = G3;
                            int[] iArr3 = this.s0;
                            iArr3[3] = 0;
                            iArr3[2] = 0;
                        } else if (asList.size() == 3) {
                            this.s0[0] = G(g(), context, asList.get(0));
                            this.s0[1] = G(g(), context, asList.get(1));
                            this.s0[2] = G(g(), context, asList.get(2));
                            this.s0[3] = 0;
                        } else if (asList.size() == i) {
                            this.s0[0] = G(g(), context, asList.get(0));
                            this.s0[1] = G(g(), context, asList.get(1));
                            this.s0[2] = G(g(), context, asList.get(2));
                            this.s0[3] = G(g(), context, asList.get(3));
                        }
                    }
                    break;
                case 30:
                    this.j0 = nwv.z(value, null);
                    break;
                case 31:
                    t(context, value);
                    break;
                case ' ':
                    this.f = G(this.u0, context, value);
                    break;
                case '!':
                    this.h = G(this.u0, context, value);
                    break;
                case '\"':
                    this.d0 = nwv.I(value, null);
                    break;
                case '#':
                    D(context, value);
                    break;
                case '$':
                    this.C = G(this.u0, context, value);
                    break;
                case '%':
                    this.r = nwv.r(value, 0);
                    break;
                case '&':
                    this.A = G(this.u0, context, value);
                    break;
                case '\'':
                    int t = nwv.t(value, i2);
                    if (t >= 0) {
                        this.b0 = t;
                    }
                    break;
                case '(':
                    this.B = G(this.u0, context, value);
                    break;
                case '*':
                    this.f21973a = G(this.u0, context, value);
                    break;
                case '+':
                    this.w = ir2.t((String) value);
                    break;
                case ',':
                    this.j = G(this.u0, context, value);
                    break;
                case '-':
                    this.P = ir2.f(context, 1, d(str, value), h(), j());
                    break;
                case '.':
                    this.O = G(this.u0, context, value);
                    break;
                case '/':
                    this.Q = G(this.u0, context, value);
                    break;
                case '0':
                    this.Z = nwv.o(value, false);
                    break;
                case '1':
                    this.Y = nwv.I(value, null);
                    break;
                case '2':
                    this.p = ir2.c((String) value);
                    break;
                case '3':
                    o(context, value);
                    break;
                case '4':
                    this.i0 = nwv.p(value, 1.0d);
                    break;
                case '5':
                    this.M = G(this.u0, context, value);
                    break;
                case '6':
                    p(context, value);
                    break;
                case '7':
                    this.g = G(this.u0, context, value);
                    break;
                case '8':
                    this.v = ir2.o((String) value);
                    break;
                case '9':
                    this.o = ir2.c((String) value);
                    break;
                case ':':
                    this.z = ir2.u((String) value);
                    break;
                case ';':
                    this.J = G(this.u0, context, value);
                    break;
                case '<':
                    this.k = G(this.u0, context, value);
                    break;
                case '=':
                    w(context, value);
                    break;
                case '>':
                    zduVar = w7l.f(this.u0, context, value);
                    z = true;
                    z2 = true;
                    z3 = true;
                    break;
                case '@':
                    this.X = nwv.I(value, null);
                    break;
                case 'C':
                    if (nwv.o(hashMap.get("horizontal"), false)) {
                        yogaFlexDirection = YogaFlexDirection.ROW;
                    } else {
                        yogaFlexDirection = YogaFlexDirection.COLUMN;
                    }
                    this.v = yogaFlexDirection;
                    break;
                case 'D':
                    this.e0 = nwv.o(value, false);
                    break;
                case 'E':
                    this.K = G(this.u0, context, value);
                    break;
                case 'F':
                    this.c0 = nwv.I(value, null);
                    break;
                case 'G':
                    this.y = ir2.m(nwv.I(value, "flex"));
                    break;
                case 'H':
                    this.R = G(this.u0, context, value);
                    break;
                case 'I':
                    C(context, value);
                    break;
                case 'J':
                    this.m = G(this.u0, context, value);
                    break;
                case 'K':
                    this.d = G(this.u0, context, value);
                    break;
                case 'L':
                    this.t0 = nwv.o(value, true);
                    break;
                case 'M':
                    this.n = G(this.u0, context, value);
                    break;
                default:
                    v(context, str, value);
                    break;
            }
            i = 4;
            i2 = -1;
        }
        if (z) {
            A(context, hashMap, zduVar);
        }
        if (z2) {
            y(context, hashMap, zduVar);
        }
        if (z3) {
            z(context, hashMap, zduVar);
        }
        this.v0 = null;
    }
}
