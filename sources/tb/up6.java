package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class up6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f29543a = new Handler(Looper.getMainLooper());

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
                u0u.a(v2s.o().f().getApplication(), "FrameContext为空，埋点数据异常，请关注");
            }
        }
    }

    static {
        t2o.a(806356062);
    }

    public static FandomInfo A(TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("82d89298", new Object[]{tBLiveDataModel, ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).F1(tBLiveDataModel);
        }
        return ekr.l(tBLiveDataModel);
    }

    public static boolean A0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a3397ba", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).d1();
        }
        return ekr.u0;
    }

    public static FandomInfo B(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("3a12c9b1", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).g();
        }
        return ekr.k();
    }

    public static boolean B0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b61e01", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).p1();
        }
        return ekr.R();
    }

    public static boolean C(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c925e9f2", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).n();
        }
        return ekr.p0;
    }

    public static boolean C0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("970d62e7", new Object[]{ux9Var})).booleanValue();
        }
        return iba.N(vx9.f(ux9Var));
    }

    public static String D(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27d2e429", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).r2();
        }
        return ekr.D;
    }

    public static void D0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d3ca45", new Object[]{str, ux9Var});
            return;
        }
        ekr.T(str);
        if (a(ux9Var)) {
            l(ux9Var).s(str);
        }
    }

    public static Map<String, String> E(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b02fe76", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).A1();
        }
        return ekr.m();
    }

    public static void E0(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed72f2e2", new Object[]{new Boolean(z), ux9Var});
            return;
        }
        IpChange ipChange2 = ekr.$ipChange;
        if (a(ux9Var)) {
            l(ux9Var).p2(z);
        }
    }

    public static Map<String, String> F(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("420c5601", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).e();
        }
        return ekr.m();
    }

    public static void F0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9408bcf1", new Object[]{str, ux9Var});
            return;
        }
        ekr.W = str;
        if (a(ux9Var)) {
            iba.V(str, vx9.f(ux9Var));
        }
    }

    public static int G(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d0139fd", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).M0();
        }
        return ekr.M;
    }

    public static void G0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0b4f93", new Object[]{str, ux9Var});
            return;
        }
        ekr.W(str);
        if (a(ux9Var)) {
            l(ux9Var).p(str);
        }
    }

    public static String H(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46d94835", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).i2();
        }
        return ekr.F();
    }

    public static void H0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fbe02a", new Object[]{str, ux9Var});
            return;
        }
        ekr.Z = str;
        if (a(ux9Var)) {
            l(ux9Var).D0(str);
        }
    }

    public static String I(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("402294a6", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).z();
        }
        return ekr.X;
    }

    public static void I0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b645c6f7", new Object[]{str, ux9Var});
            return;
        }
        ekr.Y = str;
        if (a(ux9Var)) {
            l(ux9Var).i(str);
        }
    }

    public static Map<String, String> J(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a2c9e5c", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).f();
        }
        return ekr.n();
    }

    public static void J0(ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44bec1b0", new Object[]{ux9Var, new Boolean(z)});
            return;
        }
        ekr.j = z;
        if (a(ux9Var)) {
            iba.h0(z, vx9.f(ux9Var));
        }
    }

    public static String K(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("354412a7", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).g0();
        }
        return ekr.p();
    }

    public static void K0(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96776f0", new Object[]{ux9Var, str});
            return;
        }
        ekr.J = str;
        if (a(ux9Var)) {
            iba.m0(str, vx9.f(ux9Var));
        }
    }

    public static String L(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa81cd4", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).D();
        }
        return ekr.o();
    }

    public static void L0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538f496d", new Object[]{str, ux9Var});
            return;
        }
        ekr.D = str;
        if (a(ux9Var)) {
            l(ux9Var).v(str);
        }
    }

    public static String M(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef477087", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).d2();
        }
        return ekr.G();
    }

    public static void M0(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e43bcef", new Object[]{new Boolean(z), ux9Var});
            return;
        }
        ekr.a0(z);
        if (a(ux9Var)) {
            l(ux9Var).R(z);
        }
    }

    public static String N(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7927b4e9", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).O2();
        }
        return ekr.q();
    }

    public static void N0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cc45e1", new Object[]{str, ux9Var});
            return;
        }
        ekr.u0(str);
        if (a(ux9Var)) {
            l(ux9Var).d0(str);
            Z0(ux9Var, "kandianid", p(ux9Var) + "_" + str);
        }
    }

    public static String O(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea8df6fe", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).F0();
        }
        return ekr.u;
    }

    public static void O0(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37cb99c", new Object[]{new Boolean(z), ux9Var});
            return;
        }
        ekr.t0 = z;
        if (l(ux9Var) != null) {
            l(ux9Var).A0(z);
        }
    }

    public static String P(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6477ecfa", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).b2();
        }
        return ekr.e;
    }

    public static void P0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedf5bcf", new Object[]{str, ux9Var});
            return;
        }
        ekr.v0(str);
        if (a(ux9Var)) {
            l(ux9Var).V(str);
        }
    }

    public static String Q(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1245c3a", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).T();
        }
        return ekr.s();
    }

    public static void Q0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7107a3ad", new Object[]{str, ux9Var});
            return;
        }
        ekr.f0(str);
        if (a(ux9Var)) {
            l(ux9Var).C(str);
        }
    }

    public static int R(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86d8c69", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).J2();
        }
        return ekr.s;
    }

    public static void R0(int i, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60e5a2", new Object[]{new Integer(i), ux9Var});
            return;
        }
        ekr.m0(i);
        if (a(ux9Var)) {
            l(ux9Var).Q(i);
        }
    }

    public static String S(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8bc5312", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).G();
        }
        return ekr.u();
    }

    public static void S0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d6e1da", new Object[]{str, ux9Var});
            return;
        }
        ekr.n0(str);
        if (a(ux9Var)) {
            l(ux9Var).s2(str);
        }
    }

    public static String T(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("245818c5", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).S2();
        }
        return ekr.v();
    }

    public static void T0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e07a2f", new Object[]{str, ux9Var});
            return;
        }
        ekr.m = str;
        if (a(ux9Var)) {
            iba.q1(str, vx9.f(ux9Var));
        }
    }

    public static String U(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("305af197", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).d();
        }
        return ekr.w();
    }

    public static void U0(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13e79fa", new Object[]{new Boolean(z), ux9Var});
            return;
        }
        ekr.h = z;
        if (a(ux9Var)) {
            l(ux9Var).E2(z);
        }
    }

    public static String V(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee5d01a2", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).b();
        }
        IpChange ipChange2 = ekr.$ipChange;
        return null;
    }

    public static void V0(boolean z, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4b8ea9", new Object[]{new Boolean(z), ux9Var});
            return;
        }
        ekr.q0(z);
        if (a(ux9Var)) {
            l(ux9Var).h1(z);
        }
    }

    public static long W(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c541b6b", new Object[]{ux9Var})).longValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).I2();
        }
        return ekr.K;
    }

    public static void W0(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c508e", new Object[]{tBLiveDataModel, videoInfo, ux9Var});
        } else if (a(ux9Var)) {
            l(ux9Var).x1(tBLiveDataModel, videoInfo);
        }
    }

    public static String X(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4a6b05a", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).P();
        }
        return ekr.x();
    }

    public static void X0(VideoStatus videoStatus, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285a9943", new Object[]{videoStatus, ux9Var});
            return;
        }
        ekr.s0(videoStatus);
        if (a(ux9Var)) {
            l(ux9Var).v2(videoStatus);
        }
    }

    public static int Y(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9ed8d50", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).T1();
        }
        return ekr.y();
    }

    public static void Y0(String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680ef041", new Object[]{str, ux9Var});
            return;
        }
        ekr.t0(str);
        if (a(ux9Var)) {
            l(ux9Var).M2(str);
            Z0(ux9Var, "watchID", str);
        }
    }

    public static String Z(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f77e0b84", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).m1();
        }
        return ekr.z();
    }

    public static void Z0(ux9 ux9Var, String str, Object obj) {
        m2g fetchEntity;
        mky openArchDataComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464dbfaf", new Object[]{ux9Var, str, obj});
        } else if (ux9Var != null && ux9Var.n() != null && (fetchEntity = d9m.P().fetchEntity(ux9Var.n())) != null && (openArchDataComponent = d9m.P().getOpenArchDataComponent(fetchEntity)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, obj);
            openArchDataComponent.s(hashMap);
        }
    }

    public static boolean a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c22c587", new Object[]{ux9Var})).booleanValue();
        }
        return b(ux9Var, false);
    }

    public static String a0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6819cce", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).t0();
        }
        return ekr.A();
    }

    public static boolean b(ux9 ux9Var, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8369db5", new Object[]{ux9Var, new Boolean(z)})).booleanValue();
        }
        if (l(ux9Var) == null) {
            z2 = false;
        }
        if (!z2 && !z && iw0.i()) {
            v2s.o().A().c("DataCenterUtil", Log.getStackTraceString(new Throwable()));
            Handler handler = f29543a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                handler.post(new a());
            }
        }
        return z2;
    }

    public static String b0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd1a278f", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).F2();
        }
        return ekr.m;
    }

    public static void c(ux9 ux9Var, VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ad6cb5", new Object[]{ux9Var, videoStatus});
        } else if (ux9Var == null) {
            X0(videoStatus, vx9.d());
        } else {
            X0(videoStatus, ux9Var);
        }
    }

    public static VideoInfo c0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("f5ad153f", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).a();
        }
        return ekr.C();
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo2 d(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("28e35be9", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).V1();
        }
        return ekr.e();
    }

    public static VideoStatus d0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("d6615b19", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).r0();
        }
        return ekr.D();
    }

    public static String e(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("324dac3b", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).e1();
        }
        return ekr.F0;
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo e0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("cca6105d", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).L1();
        }
        return ekr.f();
    }

    public static String f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b7cf064", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).t1();
        }
        return ekr.H0;
    }

    public static int f0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f808532", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).D1();
        }
        return ekr.r;
    }

    public static String g(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fa4cc31", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).T2();
        }
        return ekr.G0;
    }

    public static String g0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("267bd344", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).a1();
        }
        return ekr.E();
    }

    public static String h(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f3e079", new Object[]{ux9Var});
        }
        if (b(ux9Var, true)) {
            return l(ux9Var).y2();
        }
        return ekr.o0;
    }

    public static int h0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6fc66b0", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).U2();
        }
        return ekr.t;
    }

    public static String i(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ef6e664", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).y1();
        }
        return ekr.w0;
    }

    public static String i0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c277116", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).w();
        }
        return ekr.P;
    }

    public static FandomPreLiveInfo j(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("534e84ba", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).v0();
        }
        return ekr.g();
    }

    public static boolean j0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdad8800", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).u2();
        }
        return ekr.H();
    }

    public static String k(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb823bc7", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).L0();
        }
        return ekr.h();
    }

    public static boolean k0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1c8cff4", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).K();
        }
        return ekr.E0;
    }

    public static sxb l(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxb) ipChange.ipc$dispatch("d913add7", new Object[]{ux9Var});
        }
        if (ux9Var != null) {
            return ux9Var.g();
        }
        return null;
    }

    public static boolean l0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4601cc2", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).Q1();
        }
        return ekr.i0;
    }

    public static int m(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3142b43a", new Object[]{ux9Var})).intValue();
        }
        if (a(ux9Var)) {
            return xj7.a();
        }
        return ekr.i();
    }

    public static boolean m0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3ebb5ac", new Object[]{ux9Var})).booleanValue();
        }
        return iba.M(vx9.f(ux9Var));
    }

    public static long n(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e871a58", new Object[]{ux9Var})).longValue();
        }
        return iba.i(vx9.f(ux9Var));
    }

    public static boolean n0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b398783f", new Object[]{ux9Var})).booleanValue();
        }
        return iba.j(vx9.f(ux9Var));
    }

    public static boolean o(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16addf34", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return iba.k(vx9.f(ux9Var));
        }
        return ekr.j;
    }

    public static boolean o0(TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23cd5880", new Object[]{tBLiveDataModel, ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).b1(tBLiveDataModel);
        }
        return ekr.J(tBLiveDataModel);
    }

    public static String p(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27d499ef", new Object[]{ux9Var});
        }
        return iba.l(vx9.f(ux9Var));
    }

    public static boolean p0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3474847", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).B2();
        }
        return ekr.I();
    }

    public static String q(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("862801ae", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).E1();
        }
        return ekr.J;
    }

    public static boolean q0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7bdd291", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).B0();
        }
        return ekr.K();
    }

    public static String r(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db793aae", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).c();
        }
        return ekr.B;
    }

    public static boolean r0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f538d2fc", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).D2();
        }
        return ekr.L();
    }

    public static String s(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a47a31", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).R2();
        }
        return ekr.A;
    }

    public static boolean s0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e79da3", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).a2();
        }
        return ekr.q0;
    }

    public static String t(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26f739e5", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).M1();
        }
        return ekr.E;
    }

    public static boolean t0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3881efa8", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).N0();
        }
        return ekr.r0;
    }

    public static String u(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5368d7b0", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).V2();
        }
        return ekr.G;
    }

    public static boolean u0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1268ea1", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).F();
        }
        return ekr.M();
    }

    public static String v(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6abe953a", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).c1();
        }
        return ekr.j();
    }

    public static boolean v0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e853bbc4", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).h();
        }
        return ekr.t0;
    }

    public static String w(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b07c54fd", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).n0();
        }
        return ekr.F;
    }

    public static boolean w0(VideoInfo videoInfo, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02c423a", new Object[]{videoInfo, ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).r1(videoInfo);
        }
        return ekr.O(videoInfo);
    }

    public static String x(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b70982", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).W();
        }
        return ekr.y;
    }

    public static boolean x0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98a9354d", new Object[]{ux9Var})).booleanValue();
        }
        return ekr.P();
    }

    public static String y(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ae8d16d", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).w1();
        }
        return ekr.I;
    }

    public static boolean y0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3490e3a6", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).V0();
        }
        return ekr.h;
    }

    public static String z(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9626c3f", new Object[]{ux9Var});
        }
        if (a(ux9Var)) {
            return l(ux9Var).x();
        }
        return ekr.Q;
    }

    public static boolean z0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7769e5a7", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var)) {
            return l(ux9Var).G2();
        }
        return ekr.Q();
    }
}
