package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.ButtonStateHelper;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wda {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean U;
    public static Boolean V;

    /* renamed from: a  reason: collision with root package name */
    public int f30632a;
    public boolean b;
    public boolean c = true;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public int k;
    public boolean l;
    public boolean m;
    public static Boolean n = null;
    public static Integer o = null;
    public static Boolean p = null;
    public static Boolean q = null;
    public static Boolean r = null;
    public static Boolean s = null;
    public static Boolean t = null;
    public static Boolean u = null;
    public static Integer v = null;
    public static Boolean w = null;
    public static Boolean x = null;
    public static Boolean y = null;
    public static Boolean z = null;
    public static Boolean A = null;
    public static Boolean B = null;
    public static Boolean C = null;
    public static Boolean D = null;
    public static Boolean E = null;
    public static Boolean F = null;
    public static Boolean G = null;
    public static Boolean H = null;
    public static Boolean I = null;
    public static Boolean J = null;
    public static Boolean K = null;
    public static Boolean L = null;
    public static Boolean M = null;
    public static Boolean N = null;
    public static Boolean O = null;
    public static Boolean P = null;
    public static Boolean Q = null;
    public static Boolean R = null;
    public static Boolean S = null;
    public static Boolean T = null;
    public static Boolean W = null;
    public static Boolean X = null;

    static {
        t2o.a(295699273);
    }

    public wda(VideoInfo videoInfo) {
        O(videoInfo);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeae83", new Object[0])).booleanValue();
        }
        return fik.a(N, false);
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f87d128", new Object[0])).booleanValue();
        }
        if (K == null) {
            K = Boolean.valueOf(vvs.b("goodlist", "enableTabIndicator", true));
        }
        return K.booleanValue();
    }

    public static Boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("54a8ab51", new Object[0]);
        }
        if (Q == null) {
            Q = Boolean.valueOf(vvs.b("goodlist", "enableTintTrack", true));
        }
        return Q;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21d122a", new Object[0])).booleanValue();
        }
        Boolean bool = t;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ade525", new Object[0])).intValue();
        }
        Integer num = v;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99b94476", new Object[0])).booleanValue();
        }
        if (v == null) {
            return false;
        }
        Boolean bool = w;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        if (v.intValue() == 1 || v.intValue() >= 100) {
            return true;
        }
        return false;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54504a6b", new Object[0])).booleanValue();
        }
        Integer num = v;
        if (num == null) {
            return false;
        }
        if (num.intValue() == 2 || v.intValue() >= 100) {
            return true;
        }
        return false;
    }

    public static int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7bacc12", new Object[0])).intValue();
        }
        Integer num = o;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525185c0", new Object[0])).booleanValue();
        }
        Boolean bool = p;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static Boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("740393f6", new Object[0]);
        }
        Boolean bool = u;
        if (bool == null) {
            return Boolean.FALSE;
        }
        return bool;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec38d86", new Object[0])).booleanValue();
        }
        return fik.a(M, false);
    }

    public static String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("122f199b", new Object[0]);
        }
        return vvs.i("goodlist", "remainNumAtmoBg2", "https://gw.alicdn.com/imgextra/i1/O1CN01ybkbhO1ERtGRcYuUT_!!6000000000349-54-tps-330-68.apng");
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fccbc3de", new Object[0])).booleanValue();
        }
        Integer num = v;
        if (num == null) {
            return false;
        }
        if (num.intValue() == 3 || v.intValue() >= 100) {
            return true;
        }
        return false;
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60692b4e", new Object[0])).booleanValue();
        }
        Boolean bool = y;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665a6aac", new Object[0])).booleanValue();
        }
        if (W == null) {
            W = Boolean.valueOf(vvs.b("goodlist", "remainCount", true));
        }
        return W.booleanValue();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b01db38", new Object[0])).booleanValue();
        }
        if (!i9l.a("goodlist", "enableBigCard", Boolean.TRUE).booleanValue() || pfa.D()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1986b7d", new Object[0])).booleanValue();
        }
        return fik.a(G, false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491fef68", new Object[0])).booleanValue();
        }
        Boolean bool = F;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a41728", new Object[0])).booleanValue();
        }
        Boolean bool = B;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d16befb", new Object[0])).booleanValue();
        }
        return x();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd4c160e", new Object[0])).booleanValue();
        }
        Boolean bool = D;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f2fb1f1", new Object[0])).booleanValue();
        }
        Boolean bool = E;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665c988e", new Object[0])).booleanValue();
        }
        if (J == null) {
            J = Boolean.valueOf(vvs.b("goodlist", "enableLVRenderPost", true));
        }
        return J.booleanValue();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d28a6489", new Object[0])).booleanValue();
        }
        if (I == null) {
            if (!N() && vvs.b("goodlist", "enableLVTrack", true)) {
                z2 = true;
            }
            I = Boolean.valueOf(z2);
        }
        return I.booleanValue();
    }

    public static Boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("94f85f0f", new Object[0]);
        }
        if (S == null) {
            S = Boolean.valueOf(vvs.b("goodlist", "enableLiveItemTopRequestTintReport", true));
        }
        return S;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dba904", new Object[0])).booleanValue();
        }
        Boolean bool = n;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb09c335", new Object[0])).booleanValue();
        }
        Boolean bool = A;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1e52b30", new Object[0])).booleanValue();
        }
        return fik.a(L, false);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("884c8396", new Object[0])).booleanValue();
        }
        Boolean bool = C;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static Boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("22a7a9fc", new Object[0]);
        }
        Boolean bool = q;
        if (bool == null) {
            return Boolean.FALSE;
        }
        return bool;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764baed3", new Object[0])).booleanValue();
        }
        if (V == null) {
            V = Boolean.valueOf(vvs.b("goodlist", "enablePmCdnSortOpt", true));
        }
        return V.booleanValue();
    }

    public static Boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8c75dcab", new Object[0]);
        }
        if (U == null) {
            U = Boolean.valueOf(vvs.b("goodlist", "enablePopLayerEntanceRequestTintReport", true));
        }
        return U;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baa10a56", new Object[0])).booleanValue();
        }
        Boolean bool = r;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static Boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f2ecb2c7", new Object[0]);
        }
        if (P == null) {
            P = Boolean.valueOf(vvs.b("goodlist", "enableReportMonitor", true));
        }
        return P;
    }

    public static Boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9f0c2928", new Object[0]);
        }
        if (R == null) {
            R = Boolean.valueOf(vvs.b("goodlist", "enableRightsRequestTintReport", true));
        }
        return R;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fbaeba5", new Object[0])).booleanValue();
        }
        Boolean bool = s;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static Boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("eabe5b3e", new Object[0]);
        }
        if (T == null) {
            T = Boolean.valueOf(vvs.b("goodlist", "enableShowTrackTintReport", true));
        }
        return T;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ee49cf", new Object[0])).booleanValue();
        }
        Boolean bool = O;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dc3a365", new Object[0])).booleanValue();
        }
        if (H == null) {
            H = Boolean.valueOf(vvs.b("goodlist", "enableLVRender", true));
        }
        return H.booleanValue();
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3140644b", new Object[0])).booleanValue();
        }
        Boolean bool = z;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void Q(DinamicXEngine dinamicXEngine, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfb648", new Object[]{this, dinamicXEngine, context});
        } else if (this.k < 0) {
            this.k = nw0.c(dinamicXEngine, context, 375.0f);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GoodConfigContainer{speakingCardOpt=" + this.d + ", enableFirstDetailStash=" + this.g + ", enablePcgShowCase=" + this.h + ", enablePcgRecCarouselShow=" + this.i + ", pcgShowcaseConfig='" + this.j + '}';
    }

    public static void P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad39cbd", new Object[]{context});
            return;
        }
        if (y == null && context != null) {
            boolean j = w2s.j();
            y = Boolean.valueOf(j);
            hha.f20639a = j;
            hha.b = y.booleanValue();
        }
        if (n == null) {
            n = Boolean.valueOf(vvs.b("goodlist", "multiSecKill2", true));
        }
        if (o == null) {
            o = Integer.valueOf(yga.Y());
        }
        if (p == null) {
            p = Boolean.valueOf(vvs.b("goodlist", "enableGoodsListRemoveOpt", true));
        }
        if (q == null) {
            q = Boolean.valueOf(vvs.b("goodlist", "enablePadKandianSwitch", true));
        }
        if (r == null) {
            r = Boolean.valueOf(vvs.b("goodlist", "enableRecSort", true));
        }
        if (s == null) {
            s = Boolean.valueOf(vvs.b("goodlist", "enableSeckillPreheatAddCart", true));
        }
        if (t == null) {
            t = Boolean.valueOf(vvs.b("goodlist", "fixHeaderShow", true));
        }
        if (u == null) {
            u = Boolean.valueOf(vvs.b("goodlist", "startRefresh", true));
        }
        if (v == null) {
            v = Integer.valueOf(vvs.b("goodlist", "enableGLPerformance5", true) ? 200 : 0);
        }
        if (w == null) {
            w = Boolean.valueOf(vvs.b("goodlist", "enableGLPerformance4_1", true));
        }
        if (x == null) {
            x = Boolean.valueOf(vvs.b("goodlist", "enableGLPerformance4_4", true));
        }
        if (z == null) {
            z = Boolean.valueOf(vvs.b("goodlist", "showcasePerformance2", false));
        }
        if (A == null) {
            A = Boolean.valueOf(vvs.b("goodlist", "enableNewResume", true));
        }
        if (B == null) {
            B = Boolean.valueOf(vvs.b("goodlist", "enableGLCdnCache", true));
        }
        if (C == null) {
            C = Boolean.valueOf(vvs.b("goodlist", "enableAllTabPMDelete", true));
        }
        if (D == null) {
            D = Boolean.valueOf(vvs.b("goodlist", "enableHotItemSubscribe", true));
        }
        if (E == null) {
            E = Boolean.valueOf(vvs.b("goodlist", "enableHotRec", true));
        }
        if (F == null) {
            F = Boolean.valueOf(vvs.b("goodlist", "enableZhuahongbao", true));
        }
        if (G == null) {
            G = Boolean.valueOf(vvs.b("goodlist", "enableEngineCreateOpt", true));
        }
        if (L == null) {
            L = Boolean.valueOf(vvs.b("goodlist", "enableNewSearch", true));
        }
        if (M == null) {
            M = Boolean.valueOf(vvs.b("goodlist", "identifierCreate", true));
        }
        if (N == null) {
            N = Boolean.valueOf(vvs.b("goodlist", "enableTabDataReuse", true));
        }
        if (O == null) {
            O = Boolean.valueOf(vvs.b("goodlist", "enableShowcaseFrameReplay", true));
        }
        if (P == null) {
            P = Boolean.valueOf(vvs.b("goodlist", "enableReportMonitor", true));
        }
        hha.b("GoodConfigContainer", "loadConfigActvityCycle | sEnableMultiSecKill=" + n + "   sBuyGiftMultiState=" + o + "   sEnableListAllDelete=" + p + " sEnableGLCdnCache=" + B + " sEnableGLPerformance=" + v + " sEnableShowcaseLV=" + x() + " sEnableNewSearch=" + L + " enablePMMergeOpt=" + yga.y());
    }

    public static boolean y(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a53e76f", new Object[]{xeaVar})).booleanValue();
        }
        if (X == null) {
            X = Boolean.valueOf(vvs.b("goodlist", "enableRemainAtom", true));
        }
        return X.booleanValue() && ((xeaVar == null || xeaVar.H() == null || xeaVar.H().itemConfigInfo == null) ? false : urf.c(xeaVar.H().itemConfigInfo, "needDisplayInventoryRemain", false));
    }

    public final void O(VideoInfo videoInfo) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1742469e", new Object[]{this, videoInfo});
            return;
        }
        this.f30632a = yga.o0();
        this.b = videoInfo.shopHasVip && !videoInfo.shopVip;
        this.c = true;
        this.d = yga.q0();
        this.g = yga.d();
        this.h = yga.B();
        this.i = yga.z();
        this.j = "{\"showDelay\":\"10\",\"showTime\":\"10\",\"showEnd\":\"30\",\"itemNum\":\"5\"}";
        this.e = videoInfo.hasAddCart && yga.C();
        if (ButtonStateHelper.c(videoInfo.nbItemStatus) && yga.V()) {
            z2 = true;
        }
        this.f = z2;
        this.l = vvs.b("goodlist", "enableTopEntryViewCardAnimation", true);
        this.k = -1;
        this.m = vvs.b("goodlist", "enableOrderTimeout", true);
        hha.c("GoodConfigContainer", "loadConfig | config=" + this);
    }
}
