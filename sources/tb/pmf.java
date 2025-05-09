package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26182a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static volatile boolean g;
    public static volatile int i;
    public static volatile String k;
    public static volatile String r;
    public static volatile int s;
    public static volatile String u;
    public static final pmf INSTANCE = new pmf();
    public static volatile int f = -1;
    public static volatile int h = -1;
    public static volatile long j = -1;
    public static volatile long l = -1;
    public static volatile long m = -1;
    public static volatile long n = -1;
    public static volatile long o = -1;
    public static volatile long p = -1;
    public static volatile long q = -1;
    public static volatile int t = -1;
    public static volatile long v = -1;
    public static volatile long w = -1;
    public static volatile long x = -1;
    public static volatile long y = -1;
    public static volatile long z = -1;
    public static volatile long A = -1;
    public static volatile long B = -1;
    public static volatile long C = -1;
    public static volatile long D = -1;
    public static volatile long E = -1;
    public static volatile long F = -1;
    public static volatile long G = -1;
    public static volatile long H = -1;
    public static volatile long I = -1;
    public static volatile long J = -1;
    public static volatile long K = -1;
    public static volatile long L = -1;
    public static volatile long M = -1;
    public static volatile long N = -1;
    public static volatile long O = -1;
    public static volatile long P = -1;
    public static volatile long Q = -1;
    public static volatile long R = -1;
    public static volatile long S = -1;
    public static volatile long T = -1;
    public static volatile long U = -1;
    public static volatile long V = -1;
    public static volatile long W = -1;
    public static volatile long X = -1;
    public static volatile long Y = -1;
    public static volatile long Z = -1;
    public static volatile long a0 = -1;
    public static volatile long d0 = -1;
    public static volatile long b0 = -1;
    public static volatile long c0 = -1;
    public static volatile long e0 = -1;

    static {
        t2o.a(481297181);
    }

    @JvmStatic
    public static final void A0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a99022", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            F = h19.h(jSONObject, "irpHybridDataTransferEnd", 0L);
            G = h19.h(jSONObject, "irpHybridPageProcessEnd", 0L);
            H = h19.h(jSONObject, "irpHybridListProcessEnd", 0L);
        }
    }

    @JvmStatic
    public static final void B0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b36584", new Object[]{l2});
        } else if (l2 != null) {
            x = l2.longValue();
        }
    }

    @JvmStatic
    public static final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975785ec", new Object[0]);
        } else {
            O = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void D0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8015656", new Object[]{l2});
        } else if (l2 != null) {
            A = l2.longValue();
        }
    }

    @JvmStatic
    public static final void E0(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce4722c", new Object[]{mtopStatistics});
        } else if (mtopStatistics != null) {
            pmf pmfVar = INSTANCE;
            pmfVar.N0(mtopStatistics.totalTime);
            NetworkStats networkStats = mtopStatistics.getNetworkStats();
            if (networkStats != null) {
                pmfVar.O0(networkStats.oneWayTime_ANet);
                pmfVar.S0(networkStats.serverRT);
                pmfVar.P0(networkStats.recvSize);
                pmfVar.Q0(networkStats.recDataTime);
                pmfVar.R0(networkStats.sendSize);
            }
        }
    }

    @JvmStatic
    public static final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4370a250", new Object[0]);
        } else {
            V = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c689e8", new Object[0]);
        } else {
            SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f60e256", new Object[0]);
        } else {
            SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36a2c5e", new Object[0]);
        } else {
            SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void J0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee788a79", new Object[]{new Boolean(z2)});
            return;
        }
        if (P > 0 || Y <= 0) {
            long j2 = Y - Q;
            if (j2 >= 200 && j2 <= 10000) {
                if (z2 || (Z > 0 && b0 > 0)) {
                    tmf.f(INSTANCE);
                    K0();
                    return;
                }
                return;
            }
        }
        K0();
    }

    @JvmStatic
    public static final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        f26182a = false;
        b = null;
        c = null;
        d = null;
        e = null;
        g = false;
        f = -1;
        h = -1;
        i = 0;
        pmf pmfVar = INSTANCE;
        pmfVar.M0();
        pmfVar.L0();
    }

    @JvmStatic
    public static final void T0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45be0b6b", new Object[]{new Integer(i2)});
        } else {
            h = i2;
        }
    }

    @JvmStatic
    public static final void U0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1536b303", new Object[]{new Integer(i2)});
        } else {
            i = i2;
        }
    }

    @JvmStatic
    public static final void V0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f41de0", new Object[]{new Boolean(z2)});
        } else {
            g = z2;
        }
    }

    @JvmStatic
    public static final void c0(String str, String str2, String str3, String str4, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1ca0ed", new Object[]{str, str2, str3, str4, new Boolean(z2)});
            return;
        }
        b = str;
        c = str2;
        d = str3;
        e = str4;
        f26182a = z2;
    }

    @JvmStatic
    public static final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6217499", new Object[0]);
            return;
        }
        K0();
        P = SystemClock.elapsedRealtime();
    }

    @JvmStatic
    public static final void f0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeddc37", new Object[]{l2});
        } else if (l2 != null) {
            v = l2.longValue();
        }
    }

    @JvmStatic
    public static final void g0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3906622b", new Object[]{l2});
        } else if (l2 != null) {
            n = l2.longValue();
        }
    }

    @JvmStatic
    public static final void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a2d65", new Object[]{str});
            return;
        }
        ckf.g(str, "compressFormatType");
        u = str;
    }

    @JvmStatic
    public static final void i0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3488b5", new Object[]{new Integer(i2)});
        } else {
            t = i2;
        }
    }

    @JvmStatic
    public static final void j0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f611b300", new Object[]{new Integer(i2)});
        } else {
            s = i2;
        }
    }

    @JvmStatic
    public static final void k0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15994997", new Object[]{l2});
        }
    }

    @JvmStatic
    public static final void l0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f7e1ea", new Object[]{l2});
        } else if (l2 != null) {
            l = l2.longValue();
        }
    }

    @JvmStatic
    public static final void m0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3daef2", new Object[]{l2});
        } else if (l2 != null) {
            w = l2.longValue();
        }
    }

    @JvmStatic
    public static final void n0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2096cced", new Object[]{l2});
        } else if (l2 != null) {
            j = l2.longValue();
        }
    }

    @JvmStatic
    public static final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453e5e57", new Object[0]);
        } else {
            U = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e592d9", new Object[]{str});
            return;
        }
        ckf.g(str, "size");
        k = str;
    }

    @JvmStatic
    public static final void q0(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0343d4", new Object[]{l2});
        } else if (l2 != null) {
            q = l2.longValue();
        }
    }

    @JvmStatic
    public static final void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c7ff01", new Object[]{str});
            return;
        }
        ckf.g(str, "size");
        r = str;
    }

    @JvmStatic
    public static final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ad89f8", new Object[0]);
        } else {
            R = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff7c7f", new Object[0]);
            return;
        }
        if (P <= 0 || SystemClock.elapsedRealtime() - P > 10000) {
            e0();
        }
        Q = SystemClock.elapsedRealtime();
    }

    @JvmStatic
    public static final void u0(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ba765d", new Object[]{y5pVar});
            return;
        }
        ckf.g(y5pVar, "event");
        b0 = SystemClock.elapsedRealtime();
        c0 = SystemClock.uptimeMillis();
        e0 = System.currentTimeMillis();
        L = y5pVar.k;
        J = y5pVar.i;
        K = y5pVar.s;
        M = y5pVar.t;
        N = y5pVar.B - y5pVar.A;
        J0(false);
    }

    @JvmStatic
    public static final void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5efa1a", new Object[0]);
            return;
        }
        Y = SystemClock.elapsedRealtime();
        I = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4510f7e", new Object[0]);
            return;
        }
        Z = SystemClock.elapsedRealtime();
        a0 = SystemClock.uptimeMillis();
        d0 = System.currentTimeMillis();
        J0(false);
    }

    @JvmStatic
    public static final void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701d0d75", new Object[0]);
            return;
        }
        W = SystemClock.elapsedRealtime();
        X = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b3ef59", new Object[0]);
        } else {
            T = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb020da0", new Object[0]);
        } else {
            S = SystemClock.elapsedRealtime();
        }
    }

    public final long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27f942d2", new Object[]{this})).longValue();
        }
        return N;
    }

    public final long B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd129edd", new Object[]{this})).longValue();
        }
        return J;
    }

    public final long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("194b68f8", new Object[]{this})).longValue();
        }
        return M;
    }

    public final long D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4590572", new Object[]{this})).longValue();
        }
        return K;
    }

    public final long E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("738374a5", new Object[]{this})).longValue();
        }
        return Y;
    }

    public final long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40e0ccfb", new Object[]{this})).longValue();
        }
        return Z;
    }

    public final long G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccaccaf2", new Object[]{this})).longValue();
        }
        return W;
    }

    public final long H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b70e2fd", new Object[]{this})).longValue();
        }
        return X;
    }

    public final long I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94a42024", new Object[]{this})).longValue();
        }
        return T;
    }

    public final long J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60a964ab", new Object[]{this})).longValue();
        }
        return S;
    }

    public final long K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddd5f7c9", new Object[]{this})).longValue();
        }
        return I;
    }

    public final long L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e77b550", new Object[]{this})).longValue();
        }
        return x;
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f128dc", new Object[]{this});
            return;
        }
        P = -1L;
        Q = -1L;
        R = -1L;
        S = -1L;
        T = -1L;
        U = -1L;
        V = -1L;
        Y = -1L;
        Z = -1L;
        d0 = -1L;
        a0 = -1L;
        b0 = -1L;
        c0 = -1L;
        e0 = -1L;
        X = -1L;
        F = -1L;
        H = -1L;
        G = -1L;
        W = -1L;
        I = -1L;
    }

    public final long M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f7c0077", new Object[]{this})).longValue();
        }
        return O;
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c146a7", new Object[]{this});
            return;
        }
        j = -1L;
        k = null;
        l = -1L;
        m = -1L;
        n = -1L;
        o = -1L;
        p = -1L;
        q = -1L;
        r = null;
        t = -1;
        s = 0;
        u = null;
        v = -1L;
        w = -1L;
        x = -1L;
        y = -1L;
        z = -1L;
        A = -1L;
        B = -1L;
        C = -1L;
        D = -1L;
        E = -1L;
        M = -1L;
        K = -1L;
        J = -1L;
        L = -1L;
        N = -1L;
        O = -1L;
    }

    public final long N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f02350f", new Object[]{this})).longValue();
        }
        return y;
    }

    public final void N0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b7e7d", new Object[]{this, new Long(j2)});
        } else {
            y = j2;
        }
    }

    public final long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fcdd5aa", new Object[]{this})).longValue();
        }
        return z;
    }

    public final void O0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ba20da", new Object[]{this, new Long(j2)});
        } else {
            z = j2;
        }
    }

    public final long P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f366062", new Object[]{this})).longValue();
        }
        return A;
    }

    public final void P0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab29c9e", new Object[]{this, new Long(j2)});
        } else {
            C = j2;
        }
    }

    public final long Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ab934ce", new Object[]{this})).longValue();
        }
        return C;
    }

    public final void Q0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f460952", new Object[]{this, new Long(j2)});
        } else {
            B = j2;
        }
    }

    public final long R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c6b619a", new Object[]{this})).longValue();
        }
        return B;
    }

    public final void R0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1df5d3c", new Object[]{this, new Long(j2)});
        } else {
            E = j2;
        }
    }

    public final long S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62b42e0d", new Object[]{this})).longValue();
        }
        return V;
    }

    public final void S0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55ad9a0", new Object[]{this, new Long(j2)});
        } else {
            D = j2;
        }
    }

    public final long T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34c2e870", new Object[]{this})).longValue();
        }
        return E;
    }

    public final long U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57744f8c", new Object[]{this})).longValue();
        }
        return D;
    }

    public final long V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e15216f8", new Object[]{this})).longValue();
        }
        return p;
    }

    public final long W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af89a031", new Object[]{this})).longValue();
        }
        return o;
    }

    public final long W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46c6a6cd", new Object[]{this})).longValue();
        }
        return e0;
    }

    public final int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a187bc46", new Object[]{this})).intValue();
        }
        return i;
    }

    public final long X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc20a176", new Object[]{this})).longValue();
        }
        return d0;
    }

    public final String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85bf1bc8", new Object[]{this});
        }
        return e;
    }

    public final String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cf7a473", new Object[]{this});
        }
        return c;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58952014", new Object[]{this});
        }
        return d;
    }

    public final String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this});
        }
        return b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea1b0ec7", new Object[]{this})).intValue();
        }
        return h;
    }

    public final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b632ffcb", new Object[]{this})).booleanValue();
        }
        return g;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d409476", new Object[]{this})).intValue();
        }
        return f;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("328c4cd6", new Object[]{this})).longValue();
        }
        return P;
    }

    public final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d242768d", new Object[]{this})).booleanValue();
        }
        return f26182a;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc657788", new Object[]{this})).longValue();
        }
        return c0;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("395d8c7f", new Object[]{this})).longValue();
        }
        return a0;
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76ac31d0", new Object[]{this})).longValue();
        }
        return n;
    }

    public final long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d36f6c", new Object[]{this})).longValue();
        }
        return m;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82b78494", new Object[]{this})).longValue();
        }
        return F;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f221a812", new Object[]{this})).longValue();
        }
        return H;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a868a043", new Object[]{this})).longValue();
        }
        return G;
    }

    public final long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50681fb5", new Object[]{this})).longValue();
        }
        return v;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d019a9fc", new Object[]{this});
        }
        return u;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e47fbc18", new Object[]{this})).intValue();
        }
        return t;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a431b62d", new Object[]{this})).intValue();
        }
        return s;
    }

    public final long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52c937e8", new Object[]{this})).longValue();
        }
        return l;
    }

    public final long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d745bbf0", new Object[]{this})).longValue();
        }
        return w;
    }

    public final long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f068072b", new Object[]{this})).longValue();
        }
        return j;
    }

    public final long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6481ea14", new Object[]{this})).longValue();
        }
        return U;
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55ead33d", new Object[]{this});
        }
        return k;
    }

    public final long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f9f0660", new Object[]{this})).longValue();
        }
        return q;
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9a812", new Object[]{this});
        }
        return r;
    }

    public final long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78d9eeb5", new Object[]{this})).longValue();
        }
        return R;
    }

    public final long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea5d2fc", new Object[]{this})).longValue();
        }
        return Q;
    }

    public final long y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c9cc762", new Object[]{this})).longValue();
        }
        return L;
    }

    public final long z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883248c", new Object[]{this})).longValue();
        }
        return b0;
    }
}
