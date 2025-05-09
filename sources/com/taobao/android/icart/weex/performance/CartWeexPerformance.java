package com.taobao.android.icart.weex.performance;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import kotlin.a;
import tb.c21;
import tb.c9x;
import tb.ckf;
import tb.hav;
import tb.ne3;
import tb.njg;
import tb.pwl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartWeexPerformance {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public String f8069a = "";
    public final njg b = a.b(new CartWeexPerformance$appLauncherStartTime$2(this));
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;
    public long l = -1;
    public long m = -1;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long r = -1;
    public long s = -1;
    public long t = -1;
    public long u = -1;
    public long v = -1;
    public long w = -1;
    public long x = -1;
    public long y = -1;
    public long z = -1;
    public long A = -1;
    public boolean C = true;

    static {
        t2o.a(478151027);
    }

    public static final /* synthetic */ long a(CartWeexPerformance cartWeexPerformance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12dac428", new Object[]{cartWeexPerformance})).longValue();
        }
        return cartWeexPerformance.d();
    }

    public final void A(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4368c3fa", new Object[]{this, new Long(j)});
        } else {
            this.t = j;
        }
    }

    public final void B(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13577df7", new Object[]{this, new Long(j)});
        } else {
            this.m = j;
        }
    }

    public final void C(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78dc9d0", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }

    public final void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f64a25c", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public final void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f9cf0b", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public final void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68260a81", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1f8ea3", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final void H(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cdea46", new Object[]{this, new Long(j)});
        } else {
            this.z = j;
        }
    }

    public final void I(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11a5e5f", new Object[]{this, new Long(j)});
        } else {
            this.y = j;
        }
    }

    public final void J(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30891449", new Object[]{this, new Long(j)});
        } else {
            this.w = j;
        }
    }

    public final void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb313a2", new Object[]{this, new Long(j)});
        } else {
            this.v = j;
        }
    }

    public final void L(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83f8a0c", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public final void M(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a324a5", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public final void N(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790ffd1f", new Object[]{this, new Long(j)});
        } else {
            this.k = j;
        }
    }

    public final void O(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1231ef8", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }

    public final long b() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("8cb7895f", new Object[]{this});
        } else {
            value = this.b.getValue();
        }
        return ((Number) value).longValue();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5010a983", new Object[]{this});
        }
        return this.f8069a;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b75066", new Object[]{this})).longValue();
        }
        try {
            long j = c21.g().getLong("startProcessSystemClockTime", -1L);
            if (j <= 0) {
                return -1L;
            }
            return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25e853e8", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "isRecreated", (String) Boolean.valueOf(this.B));
        jSONObject2.put((JSONObject) "isRunIdleTask", (String) Boolean.valueOf(this.C));
        jSONObject2.put((JSONObject) "isTouchDown", (String) Boolean.valueOf(this.D));
        jSONObject.put((JSONObject) "dimensions", (String) jSONObject2);
        jSONObject.put((JSONObject) "jt_pt_appLauncherStartTime", (String) Long.valueOf(b()));
        jSONObject.put((JSONObject) "jt_pt_navStartTime", (String) Long.valueOf(this.d));
        jSONObject.put((JSONObject) "jt_pt_navTime", (String) Long.valueOf(this.f));
        jSONObject.put((JSONObject) "jt_pt_isRecreated", (String) Boolean.valueOf(this.B));
        jSONObject.put((JSONObject) "jt_pt_isRunIdleTask", (String) Boolean.valueOf(this.C));
        long j = this.i;
        long j2 = this.h;
        if (j > j2) {
            jSONObject.put((JSONObject) "jt_pt_weexRestitutionInitStartTime", (String) Long.valueOf(j2));
            jSONObject.put((JSONObject) "jt_pt_weexRestitutionInitEndTime", (String) Long.valueOf(this.i));
        }
        long j3 = this.z;
        long j4 = this.y;
        if (j3 > j4) {
            jSONObject.put((JSONObject) "jt_pt_weexForcePreRenderStartTime", (String) Long.valueOf(j4));
            jSONObject.put((JSONObject) "jt_pt_weexForcePreRenderEndTime", (String) Long.valueOf(this.z));
        }
        if (this.w > this.e) {
            jSONObject.put((JSONObject) "jt_pt_weexInstanceCreateStartTime", (String) Long.valueOf(this.v));
            jSONObject.put((JSONObject) "jt_pt_weexInstanceCreateEndTime", (String) Long.valueOf(this.w));
            long j5 = this.k;
            long j6 = this.j;
            if (j5 > j6) {
                jSONObject.put((JSONObject) "jt_pt_zcacheStartTime", (String) Long.valueOf(j6));
                jSONObject.put((JSONObject) "jt_pt_zcacheEndTime", (String) Long.valueOf(this.k));
            }
            long j7 = this.m;
            long j8 = this.l;
            if (j7 > j8) {
                jSONObject.put((JSONObject) "jt_pt_rawFileStartTime", (String) Long.valueOf(j8));
                jSONObject.put((JSONObject) "jt_pt_rawFileEndTime", (String) Long.valueOf(this.m));
            }
            long j9 = this.o;
            long j10 = this.n;
            if (j9 > j10) {
                jSONObject.put((JSONObject) "jt_pt_firstCacheStartTime", (String) Long.valueOf(j10));
                jSONObject.put((JSONObject) "jt_pt_firstCacheEndTime", (String) Long.valueOf(this.o));
            }
            long j11 = this.s;
            long j12 = this.r;
            if (j11 > j12) {
                jSONObject.put((JSONObject) "jt_pt_hideItemsStartTime", (String) Long.valueOf(j12));
                jSONObject.put((JSONObject) "jt_pt_hideItemsEndTime", (String) Long.valueOf(this.s));
            }
            long j13 = this.q;
            long j14 = this.p;
            if (j13 > j14) {
                jSONObject.put((JSONObject) "jt_pt_globalStatusStartTime", (String) Long.valueOf(j14));
                jSONObject.put((JSONObject) "jt_pt_globalStatusEndTime", (String) Long.valueOf(this.q));
            }
            long j15 = this.u;
            long j16 = this.t;
            if (j15 > j16) {
                jSONObject.put((JSONObject) "jt_pt_queryParamsStartTime", (String) Long.valueOf(j16));
                jSONObject.put((JSONObject) "jt_pt_queryParamsEndTime", (String) Long.valueOf(this.u));
            }
        }
        jSONObject.put((JSONObject) "jt_pt_jsStartTime", (String) Long.valueOf(this.x));
        jSONObject.put((JSONObject) "jt_pt_containerEndTime", (String) Long.valueOf(this.A));
        return jSONObject;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8981f5b", new Object[]{this})).longValue();
        }
        return this.w;
    }

    public final void g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd40d34a", new Object[]{this});
            return;
        }
        ne3.b bVar = new ne3.b("fsp");
        long j = this.i;
        long j2 = this.h;
        if (1 <= j2 && j > j2) {
            bVar.a("weexRestitutionInitStage", j - j2);
        }
        bVar.a("navStage", this.f - this.d);
        bVar.a("containerTotalStage", this.A - this.d);
        long j3 = this.k;
        long j4 = this.j;
        if (j3 > j4) {
            bVar.a("zcacheStage", j3 - j4);
        }
        long j5 = this.m;
        long j6 = this.l;
        if (j5 > j6) {
            bVar.a("rawFileStage", j5 - j6);
        }
        long j7 = this.o;
        long j8 = this.n;
        if (j7 > j8) {
            bVar.a("firstCacheStage", j7 - j8);
        }
        long j9 = this.s;
        long j10 = this.r;
        if (j9 > j10) {
            bVar.a("hideItemsStage", j9 - j10);
        }
        long j11 = this.q;
        long j12 = this.p;
        if (j11 > j12) {
            bVar.a("globalStatusStage", j11 - j12);
        }
        long j13 = this.u;
        long j14 = this.t;
        if (j13 > j14) {
            bVar.a("queryParamsStage", j13 - j14);
        }
        bVar.a("getResourceStage", this.g);
        bVar.a("weexInstanceCreate", this.w - this.v);
        long j15 = this.z - this.y;
        if (j15 > 0) {
            bVar.a("weexForcePreRender", j15);
        }
        long j16 = -1;
        if (b() != -1) {
            j16 = System.currentTimeMillis() - b();
        }
        if (j16 < 0) {
            str = "小于0";
        } else if (j16 < 1000) {
            str = "[0,1秒)";
        } else if (j16 < 2000) {
            str = "[1,2秒)";
        } else if (j16 < 3000) {
            str = "[2,3秒)";
        } else if (j16 < 4000) {
            str = "[3,4秒)";
        } else {
            int i = (j16 > 5000 ? 1 : (j16 == 5000 ? 0 : -1));
            if (i < 0) {
                str = "[4,5秒)";
            } else if (i >= 0) {
                str = "[5秒以上]";
            } else {
                str = "异常值" + j16;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("是否主Tab：", String.valueOf(this.H));
        linkedHashMap.put("是否命中缓存：", String.valueOf(this.E));
        linkedHashMap.put("是否命中ZCache：", String.valueOf(this.F));
        linkedHashMap.put("是否命中预热：", String.valueOf(this.G));
        linkedHashMap.put("是否销毁重建", String.valueOf(this.B));
        linkedHashMap.put("冷起快进分布：", str);
        linkedHashMap.put("是否执行购物车闲时任务：", String.valueOf(this.C));
        linkedHashMap.put("是否执行冷起快进TouchDown", String.valueOf(this.D));
        bVar.c(linkedHashMap);
        ne3.Companion.g(bVar);
        StringBuilder sb = new StringBuilder("dimensions=");
        sb.append(linkedHashMap);
        sb.append(",stages=");
        pwl.a d = bVar.d();
        sb.append(d != null ? d.c() : null);
        sb.append(",performance=");
        sb.append(toString());
        String sb2 = sb.toString();
        hav.d(c9x.TAG, "reportEnterPV msg=" + sb2);
        h(sb2, str);
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e6b25", new Object[]{this, str, str2});
            return;
        }
        ne3.a aVar = new ne3.a("EnterCartWeexPage");
        aVar.tag("进入Weex购物车").message(str).dimension("d1", String.valueOf(this.H)).dimension("d2", String.valueOf(this.E)).dimension("d3", String.valueOf(this.F)).dimension("d4", String.valueOf(this.G)).dimension("d5", String.valueOf(this.B)).dimension("d6", str2).dimension("d7", String.valueOf(this.C)).dimension("d8", String.valueOf(this.D));
        ne3.Companion.c(aVar);
    }

    public final void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9056b1b4", new Object[]{this, new Long(j)});
        } else {
            this.A = j;
        }
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccf4ca9", new Object[]{this, new Long(j)});
        } else {
            this.o = j;
        }
    }

    public final void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824cb402", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
        }
    }

    public final void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05afba2", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public final void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23c698e", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751e3c41", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public final void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5a66c", new Object[]{this, new Long(j)});
        } else {
            this.q = j;
        }
    }

    public final void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d43a905", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public final void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca66b551", new Object[]{this, new Long(j)});
        } else {
            this.s = j;
        }
    }

    public final void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ac92aa", new Object[]{this, new Long(j)});
        } else {
            this.r = j;
        }
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3478292", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba053d35", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("PerformanceMetrics：");
        if (b() != -1) {
            sb.append("appLauncherStartTime=" + b() + ", ");
        }
        if (this.c != -1) {
            sb.append("touchDownTime=" + this.c + ',');
        }
        if (this.d != -1) {
            sb.append("navStartTime=" + this.d + ", ");
        }
        if (this.e != -1) {
            sb.append("fragmentInitTime=" + this.e + ", ");
        }
        if (this.f != -1) {
            sb.append("fragmentCreateTime=" + this.f + ", ");
        }
        if (this.h != -1) {
            sb.append("weexRestitutionInitStartTime=" + this.h + ", ");
        }
        if (this.i != -1) {
            sb.append("weexRestitutionInitEndTime=" + this.i + ", ");
        }
        if (this.g != -1) {
            sb.append("getResourceStage=" + this.g + ", ");
        }
        if (this.j != -1) {
            sb.append("ZCacheStartTime=" + this.j + ", ");
        }
        if (this.k != -1) {
            sb.append("ZCacheEndTime=" + this.k + ", ");
        }
        if (this.l != -1) {
            sb.append("rawFileStartTime=" + this.l + ", ");
        }
        if (this.m != -1) {
            sb.append("rawFileEndTime=" + this.m + ", ");
        }
        if (this.n != -1) {
            sb.append("firstCacheStartTime=" + this.n + ", ");
        }
        if (this.o != -1) {
            sb.append("firstCacheEndTime=" + this.o + ", ");
        }
        if (this.p != -1) {
            sb.append("globalStatusStartTime=" + this.p + ", ");
        }
        if (this.q != -1) {
            sb.append("globalStatusEndTime=" + this.q + ", ");
        }
        if (this.r != -1) {
            sb.append("hideItemsStartTime=" + this.r + ", ");
        }
        if (this.s != -1) {
            sb.append("hideItemsEndTime=" + this.s + ", ");
        }
        if (this.t != -1) {
            sb.append("queryParamsStartTime=" + this.t + ", ");
        }
        if (this.u != -1) {
            sb.append("queryParamsEndTime=" + this.u + ", ");
        }
        if (this.v != -1) {
            sb.append("weexInstanceCreateStartTime=" + this.v + ", ");
        }
        if (this.w != -1) {
            sb.append("weexInstanceCreateEndTime=" + this.w + ", ");
        }
        if (this.y != -1) {
            sb.append("weexForcePreRenderStartTime=" + this.y + ", ");
        }
        if (this.z != -1) {
            sb.append("weexForcePreRenderEndTime=" + this.z + ", ");
        }
        if (this.x != -1) {
            sb.append("jsStartTime=" + this.x + ", ");
        }
        if (this.A != -1) {
            sb.append("containerEndTime=" + this.A);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "sb.toString()");
        return sb2;
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9703dc74", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a2fb53", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f8069a = str;
    }

    public final void w(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4d7459", new Object[]{this, new Long(j)});
        } else {
            this.x = j;
        }
    }

    public final void x(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a2407a", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public final void y(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1e1ef", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void z(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331efaa1", new Object[]{this, new Long(j)});
        } else {
            this.u = j;
        }
    }
}
