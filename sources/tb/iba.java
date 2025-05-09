package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f21207a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                u0u.a(v2s.o().f().getApplication(), "BaseGlobalContext为空，埋点数据异常，请关注");
            }
        }
    }

    static {
        t2o.a(806356066);
    }

    public static Map<String, String> A(cv1 cv1Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3af4669c", new Object[]{cv1Var, tBLiveDataModel});
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mInitParams;
        }
        return z(cv1Var);
    }

    public static void A0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4c2f57", new Object[]{str, cv1Var});
            return;
        }
        ekr.z = str;
        if (a(cv1Var)) {
            d(cv1Var).o(str);
        }
    }

    public static String B(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e01ff97", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).D();
        }
        return ekr.o();
    }

    public static void B0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd829fbb", new Object[]{str, cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).Z(str);
        }
    }

    public static String C(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20382e2d", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).F0();
        }
        return ekr.u;
    }

    public static void C0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bf01f1", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).C0(z);
        }
    }

    public static String D(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5156f167", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).i1();
        }
        return ekr.v0;
    }

    public static void D0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee1d065", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.b0(z);
        if (a(cv1Var)) {
            d(cv1Var).K1(z);
        }
    }

    public static int E(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24721b2", new Object[]{cv1Var})).intValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).J2();
        }
        return ekr.s;
    }

    public static void E0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a857628", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.q0 = z;
        if (a(cv1Var)) {
            d(cv1Var).v1(z);
        }
    }

    public static String F(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d43b5", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).V2();
        }
        return ekr.G;
    }

    public static void F0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d200275b", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).W0(z);
        }
    }

    public static String G(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac94cb3b", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).q1();
        }
        return ekr.t();
    }

    public static void G0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb581bd", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.r0 = z;
        if (a(cv1Var)) {
            d(cv1Var).u1(z);
        }
    }

    public static String H(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("256877a0", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).X1();
        }
        return ekr.d0;
    }

    public static void H0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c537274e", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.u0 = z;
        if (a(cv1Var)) {
            d(cv1Var).f0(z);
        }
    }

    public static long I(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd2ddc40", new Object[]{cv1Var})).longValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).w0();
        }
        return ekr.L;
    }

    public static void I0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e437e8", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).w2(z);
        }
    }

    public static String J(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75df3374", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).d();
        }
        return ekr.w();
    }

    public static void J0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab6a736", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).B(z);
        }
    }

    public static long K(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbb07d92", new Object[]{cv1Var})).longValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).I2();
        }
        return ekr.K;
    }

    public static void K0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac74c4b", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.p0 = z;
        if (a(cv1Var)) {
            d(cv1Var).m(z);
        }
    }

    public static String L(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f0bbe5d", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).t0();
        }
        return ekr.A();
    }

    public static void L0(JSONArray jSONArray, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383a1f14", new Object[]{jSONArray, cv1Var});
            return;
        }
        ekr.s0 = jSONArray;
        if (a(cv1Var)) {
            d(cv1Var).u0(jSONArray);
        }
    }

    public static boolean M(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36667851", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).l2();
        }
        return ekr.k0;
    }

    public static void M0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251d9662", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.q = z;
        if (a(cv1Var)) {
            d(cv1Var).L(z);
        }
    }

    public static boolean N(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30c0ecb6", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).j2();
        }
        return ekr.S();
    }

    public static void N0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2f2d64", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).U(z);
        }
    }

    public static void O(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d50208", new Object[]{alimamaInfo2, cv1Var});
            return;
        }
        ekr.U(alimamaInfo2);
        if (a(cv1Var)) {
            d(cv1Var).l1(alimamaInfo2);
        }
    }

    public static void O0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2312bfa2", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.k0(z);
        if (a(cv1Var)) {
            d(cv1Var).K2(z);
        }
    }

    public static void P(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb439b79", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.E0 = z;
        if (a(cv1Var)) {
            d(cv1Var).J(z);
        }
    }

    public static void P0(int i, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b814f58", new Object[]{new Integer(i), cv1Var});
            return;
        }
        ekr.M = i;
        if (a(cv1Var)) {
            d(cv1Var).s1(i);
        }
    }

    public static void Q(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186e1992", new Object[]{str, cv1Var});
            return;
        }
        ekr.F0 = str;
        if (a(cv1Var)) {
            d(cv1Var).E0(str);
        }
    }

    public static void Q0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6790d3b2", new Object[]{str, cv1Var});
            return;
        }
        ekr.w = str;
        if (a(cv1Var)) {
            d(cv1Var).P2(str);
        }
    }

    public static void R(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18358123", new Object[]{str, cv1Var});
            return;
        }
        ekr.H0 = str;
        if (a(cv1Var)) {
            d(cv1Var).X(str);
        }
    }

    public static void R0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c05d465", new Object[]{str, cv1Var});
            return;
        }
        ekr.X = str;
        if (a(cv1Var)) {
            d(cv1Var).L2(str);
        }
    }

    public static void S(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80879f0", new Object[]{str, cv1Var});
            return;
        }
        ekr.G0 = str;
        if (a(cv1Var)) {
            d(cv1Var).n1(str);
        }
    }

    public static void S0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53ed724", new Object[]{str, cv1Var});
            return;
        }
        ekr.v = str;
        if (a(cv1Var)) {
            d(cv1Var).h2(str);
        }
    }

    public static void T(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d53ed0", new Object[]{str, cv1Var});
            return;
        }
        ekr.o0 = str;
        if (a(cv1Var)) {
            d(cv1Var).o1(str);
        }
    }

    public static void T0(Map<String, String> map, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc61bb3", new Object[]{map, cv1Var});
            return;
        }
        ekr.c0(map);
        if (a(cv1Var)) {
            d(cv1Var).Z0(map);
        }
    }

    public static void U(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a60f2bb", new Object[]{str, cv1Var});
            return;
        }
        ekr.w0 = str;
        if (a(cv1Var)) {
            d(cv1Var).s0(str);
        }
    }

    public static void U0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117c60a1", new Object[]{str, cv1Var});
        } else if (a(cv1Var)) {
            d(cv1Var).I1(str);
        }
    }

    public static void V(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b6ae4", new Object[]{str, cv1Var});
            return;
        }
        ekr.W = str;
        if (a(cv1Var)) {
            d(cv1Var).b0(str);
        }
    }

    public static void V0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c197efe", new Object[]{str, cv1Var});
            return;
        }
        ekr.e0(str);
        if (a(cv1Var)) {
            d(cv1Var).m0(str);
        }
    }

    public static void W(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd638df", new Object[]{str, cv1Var});
            return;
        }
        ekr.X(str);
        if (a(cv1Var)) {
            d(cv1Var).H0(str);
        }
    }

    public static void W0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88df793", new Object[]{str, cv1Var});
            return;
        }
        ekr.d0(str);
        if (a(cv1Var)) {
            d(cv1Var).j(str);
        }
    }

    public static void X(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c887e21e", new Object[]{str, cv1Var});
            return;
        }
        ekr.Y(str);
        if (a(cv1Var)) {
            d(cv1Var).i(str);
        }
    }

    public static void X0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844afb92", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.e0 = z;
        if (a(cv1Var)) {
            d(cv1Var).k0(z);
        }
    }

    public static void Y(int i, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdeabf06", new Object[]{new Integer(i), cv1Var});
            return;
        }
        ekr.r = i;
        if (a(cv1Var)) {
            d(cv1Var).O0(i);
        }
    }

    public static void Y0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27caa55", new Object[]{str, cv1Var});
            return;
        }
        ekr.u = str;
        if (a(cv1Var)) {
            d(cv1Var).k1(str);
        }
    }

    public static void Z(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322b72d7", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.i0 = z;
        if (a(cv1Var)) {
            d(cv1Var).x0(z);
        }
    }

    public static void Z0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b074b9", new Object[]{str, cv1Var});
            return;
        }
        ekr.e = str;
        if (a(cv1Var)) {
            d(cv1Var).S1(str);
        }
    }

    public static boolean a(cv1 cv1Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb41616", new Object[]{cv1Var})).booleanValue();
        }
        if (!(cv1Var == null || d(cv1Var) == null)) {
            z = true;
        }
        if (!z && iw0.i()) {
            v2s.o().A().c("GlobalDataCenterUtil", Log.getStackTraceString(new Throwable()));
            Handler handler = f21207a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                handler.post(new a());
            }
        }
        return z;
    }

    public static void a0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e505d31", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.k0 = z;
        if (a(cv1Var)) {
            d(cv1Var).m2(z);
        }
    }

    public static void a1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ef0cc3", new Object[]{str, cv1Var});
            return;
        }
        ekr.v0 = str;
        if (a(cv1Var)) {
            d(cv1Var).H(str);
        }
    }

    public static ViewGroup b(Context context, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4d434a43", new Object[]{context, cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).t(context);
        }
        return ekr.d(context);
    }

    public static void b0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f5caa7", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(cv1Var)) {
            d(cv1Var).c0(z);
        }
    }

    public static void b1(int i, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f39bc4", new Object[]{new Integer(i), cv1Var});
            return;
        }
        ekr.s = i;
        if (a(cv1Var)) {
            d(cv1Var).C2(i);
        }
    }

    public static ViewGroup c(Context context, cv1 cv1Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1d4a383c", new Object[]{context, cv1Var});
        }
        ViewGroup b = b(context, cv1Var);
        if (b != null) {
            if (vc.i(context) || vc.e(context)) {
                i = iw0.g() - vc.b(context);
            } else {
                i = 0;
            }
            b.setPadding(i, 0, 0, 0);
        }
        return b;
    }

    public static void c0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43cbd29", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.j0 = z;
        if (a(cv1Var)) {
            d(cv1Var).N1(z);
        }
    }

    public static void c1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad32aa35", new Object[]{str, cv1Var});
            return;
        }
        ekr.G = str;
        if (a(cv1Var)) {
            d(cv1Var).I0(str);
        }
    }

    public static w9c d(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9c) ipChange.ipc$dispatch("49ae99d7", new Object[]{cv1Var});
        }
        return cv1Var.k();
    }

    public static void d0(long j, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1abe39", new Object[]{new Long(j), cv1Var});
            return;
        }
        ekr.n0 = j;
        if (a(cv1Var)) {
            d(cv1Var).i0(j);
        }
    }

    public static void d1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a587607", new Object[]{str, cv1Var});
            return;
        }
        ekr.g0(str);
        if (a(cv1Var)) {
            d(cv1Var).j0(str);
        }
    }

    public static String e(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f6f3407", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).y1();
        }
        return ekr.w0;
    }

    public static void e0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ed9154", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.h0 = z;
        if (a(cv1Var)) {
            d(cv1Var).N(z);
        }
    }

    public static void e1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555fe495", new Object[]{str, cv1Var});
            return;
        }
        ekr.N = str;
        if (a(cv1Var)) {
            d(cv1Var).H2(str);
        }
    }

    public static int f(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a367b430", new Object[]{cv1Var})).intValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).D1();
        }
        return ekr.r;
    }

    public static void f0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2015e3ff", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.l0 = z;
        if (a(cv1Var)) {
            d(cv1Var).t2(z);
        }
    }

    public static void f1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4abed1", new Object[]{str, cv1Var});
            return;
        }
        if (!(cv1Var == null || cv1Var.k() == null || cv1Var.k().O1() == null)) {
            cv1Var.k().S0(str);
        }
        ekr.h0(str);
    }

    public static boolean g(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33b1fba7", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).Q1();
        }
        return ekr.i0;
    }

    public static void g0(cv1 cv1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af11f023", new Object[]{cv1Var, new Boolean(z)});
            return;
        }
        if (!(cv1Var == null || cv1Var.k() == null || cv1Var.k().O1() == null)) {
            cv1Var.k().O1().g(z);
        }
        ekr.j = z;
    }

    public static void g1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa7f2aa", new Object[]{str, cv1Var});
            return;
        }
        ekr.d0 = str;
        if (a(cv1Var)) {
            d(cv1Var).I(str);
        }
    }

    public static boolean h(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69890c15", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).M();
        }
        return ekr.j0;
    }

    public static void h0(boolean z, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729f63f5", new Object[]{new Boolean(z), cv1Var});
            return;
        }
        ekr.j = z;
        if (a(cv1Var)) {
            d(cv1Var).f1(z);
        }
    }

    public static void h1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370d7484", new Object[]{str, cv1Var});
            return;
        }
        ekr.i0(str);
        if (a(cv1Var)) {
            d(cv1Var).P0(str);
        }
    }

    public static long i(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34f9005", new Object[]{cv1Var})).longValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).Y();
        }
        return ekr.n0;
    }

    public static void i0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3a0644", new Object[]{str, cv1Var});
            return;
        }
        ekr.U = str;
        if (a(cv1Var)) {
            d(cv1Var).P1(str);
        }
    }

    public static void i1(long j, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd91455e", new Object[]{new Long(j), cv1Var});
            return;
        }
        ekr.L = j;
        if (a(cv1Var)) {
            d(cv1Var).o2(j);
        }
    }

    public static boolean j(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dc5208a", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).c2();
        }
        return ekr.c();
    }

    public static void j0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d840ce78", new Object[]{str, cv1Var});
            return;
        }
        ekr.T = str;
        if (a(cv1Var)) {
            d(cv1Var).l0(str);
        }
    }

    public static void j1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383046ee", new Object[]{str, cv1Var});
            return;
        }
        ekr.j0(str);
        if (a(cv1Var)) {
            d(cv1Var).K0(str);
        }
    }

    public static boolean k(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b22df5c9", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).r();
        }
        return ekr.j;
    }

    public static void k0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b794a113", new Object[]{str, cv1Var});
            return;
        }
        ekr.S = str;
        if (a(cv1Var)) {
            d(cv1Var).Q2(str);
        }
    }

    public static void k1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a26461", new Object[]{str, cv1Var});
        } else if (a(cv1Var)) {
            d(cv1Var).S(str);
        }
    }

    public static String l(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84e481c", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).C1();
        }
        return ekr.C;
    }

    public static void l0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ce9546", new Object[]{str, cv1Var});
            return;
        }
        ekr.C = str;
        if (a(cv1Var)) {
            d(cv1Var).z0(str);
        }
    }

    public static void l1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5381062", new Object[]{str, cv1Var});
            return;
        }
        ekr.O = str;
        if (a(cv1Var)) {
            d(cv1Var).O(str);
        }
    }

    public static String m(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71165d7d", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).E1();
        }
        return ekr.J;
    }

    public static void m0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11829205", new Object[]{str, cv1Var});
            return;
        }
        ekr.J = str;
        if (a(cv1Var)) {
            d(cv1Var).G1(str);
        }
    }

    public static void m1(long j, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8d5c4c", new Object[]{new Long(j), cv1Var});
            return;
        }
        ekr.K = j;
        if (a(cv1Var)) {
            d(cv1Var).E(j);
        }
    }

    public static String n(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44019e70", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).Y0();
        }
        return null;
    }

    public static void n0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0860972", new Object[]{str, cv1Var});
        } else if (a(cv1Var)) {
            d(cv1Var).U0(str);
        }
    }

    public static void n1(cv1 cv1Var, rvd rvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2053ed9a", new Object[]{cv1Var, rvdVar});
            return;
        }
        if (a(cv1Var)) {
            d(cv1Var).o0(rvdVar);
        }
        ekr.J0 = rvdVar;
    }

    public static String o(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5d1047d", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).c();
        }
        return ekr.B;
    }

    public static void o0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d2fc7b", new Object[]{str, cv1Var});
            return;
        }
        ekr.V = str;
        if (a(cv1Var)) {
            d(cv1Var).Y1(str);
        }
    }

    public static void o1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4fb3b1", new Object[]{str, cv1Var});
            return;
        }
        ekr.l0(str);
        if (a(cv1Var)) {
            d(cv1Var).G0(str);
        }
    }

    public static String p(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beceb59a", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).R2();
        }
        return ekr.A;
    }

    public static void p0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a36505", new Object[]{str, cv1Var});
            return;
        }
        ekr.B = str;
        if (a(cv1Var)) {
            d(cv1Var).k(str);
        }
    }

    public static void p1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1b2025", new Object[]{str, cv1Var});
            return;
        }
        ekr.o0(str);
        if (a(cv1Var)) {
            d(cv1Var).u(str);
        }
    }

    public static String q(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("937d5c71", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).c1();
        }
        return ekr.j();
    }

    public static void q0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40514df0", new Object[]{str, cv1Var});
            return;
        }
        ekr.A = str;
        if (a(cv1Var)) {
            d(cv1Var).x2(str);
        }
    }

    public static void q1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d42fe6", new Object[]{str, cv1Var});
            return;
        }
        ekr.m = str;
        if (a(cv1Var)) {
            d(cv1Var).h0(str);
        }
    }

    public static String r(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("964b454e", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).n0();
        }
        return ekr.F;
    }

    public static void r0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf95fab", new Object[]{str, cv1Var});
            return;
        }
        ekr.R = str;
        if (a(cv1Var)) {
            d(cv1Var).y0(str);
        }
    }

    public static void r1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e78acf4", new Object[]{str, cv1Var});
            return;
        }
        ekr.p0(str);
        if (a(cv1Var)) {
            d(cv1Var).a0(str);
        }
    }

    public static String s(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718b7729", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).W();
        }
        return ekr.y;
    }

    public static void s0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52efb5a4", new Object[]{str, cv1Var});
            return;
        }
        ekr.E = str;
        if (a(cv1Var)) {
            d(cv1Var).A2(str);
        }
    }

    public static void s1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ceee99", new Object[]{str, cv1Var});
            return;
        }
        ekr.r0(str);
        if (a(cv1Var)) {
            d(cv1Var).q0(str);
        }
    }

    public static boolean t(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cec556ce", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).a2();
        }
        return ekr.q0;
    }

    public static void t0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974d1b6f", new Object[]{str, cv1Var});
            return;
        }
        ekr.H = str;
        if (a(cv1Var)) {
            d(cv1Var).J1(str);
        }
    }

    public static void t1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7af3d94", new Object[]{str, cv1Var});
        }
    }

    public static JSONArray u(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6788590e", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).g2();
        }
        return ekr.s0;
    }

    public static void u0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f40746", new Object[]{str, cv1Var});
            return;
        }
        ekr.x = str;
        if (a(cv1Var)) {
            d(cv1Var).e0(str);
        }
    }

    public static void u1(int i, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c573035a", new Object[]{new Integer(i), cv1Var});
            return;
        }
        ekr.t = i;
        if (a(cv1Var)) {
            d(cv1Var).n2(i);
        }
    }

    public static boolean v(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b352eebc", new Object[]{cv1Var})).booleanValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).l();
        }
        return ekr.q;
    }

    public static void v0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfb7191", new Object[]{str, cv1Var});
            return;
        }
        ekr.Z(str);
        if (a(cv1Var)) {
            d(cv1Var).H1(str);
        }
    }

    public static void v1(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8533be", new Object[]{alimamaInfo, cv1Var});
            return;
        }
        ekr.V(alimamaInfo);
        if (a(cv1Var)) {
            d(cv1Var).z1(alimamaInfo);
        }
    }

    public static int w(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6921d9e", new Object[]{cv1Var})).intValue();
        }
        if (a(cv1Var)) {
            return d(cv1Var).M0();
        }
        return ekr.M;
    }

    public static void w0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208535bc", new Object[]{str, cv1Var});
            return;
        }
        ekr.F = str;
        if (a(cv1Var)) {
            d(cv1Var).q2(str);
        }
    }

    public static void w1(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fbe96d", new Object[]{str, cv1Var});
            return;
        }
        ekr.P = str;
        if (a(cv1Var)) {
            d(cv1Var).k2(str);
        }
    }

    public static String x(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24f91098", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).R0();
        }
        return ekr.w;
    }

    public static void x0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb0add9", new Object[]{str, cv1Var});
            return;
        }
        ekr.y = str;
        if (a(cv1Var)) {
            d(cv1Var).z2(str);
        }
    }

    public static String y(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cde69e6", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).A();
        }
        return ekr.v;
    }

    public static void y0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63cc82c", new Object[]{str, cv1Var});
            return;
        }
        ekr.I = str;
        if (a(cv1Var)) {
            d(cv1Var).g1(str);
        }
    }

    public static Map<String, String> z(cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f394c863", new Object[]{cv1Var});
        }
        if (a(cv1Var)) {
            return d(cv1Var).f();
        }
        return ekr.n();
    }

    public static void z0(String str, cv1 cv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19df54fe", new Object[]{str, cv1Var});
            return;
        }
        ekr.Q = str;
        if (a(cv1Var)) {
            d(cv1Var).y(str);
        }
    }
}
