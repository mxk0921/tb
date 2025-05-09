package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ekr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String A;
    public static String A0;
    public static String B;
    public static String B0;
    public static String C;
    public static String C0;
    public static String D;
    public static String D0;
    public static String E;
    public static String F;
    public static String F0;
    public static String G;
    public static String G0;
    public static String H;
    public static String H0;
    public static String I;
    public static Set<String> I0;
    public static String J;
    public static rvd J0;
    public static long K;
    public static long L;
    public static int M;
    public static String N;
    public static String O;
    public static String P;
    public static String Q;
    public static String R;
    public static String S;
    public static String T;
    public static String U;
    public static String V;
    public static String W;
    public static String X;
    public static String Y;
    public static String Z;
    public static LiveDetailMessinfoResponseData.AlimamaInfo a0;
    public static String b;
    public static LiveDetailMessinfoResponseData.AlimamaInfo2 b0;
    public static String c;
    public static String c0;
    public static String d;
    public static String d0;
    public static String e;
    public static String f;
    public static String g;
    public static boolean j;
    public static String k;
    public static String l;
    public static String m;
    public static Map<String, String> n;
    public static String o0;
    public static String p;
    public static JSONArray s0;
    public static String u;
    public static String v;
    public static String w;
    public static String x;
    public static Map<String, String> x0;
    public static String y;
    public static String y0;
    public static String z;
    public static String z0;

    /* renamed from: a  reason: collision with root package name */
    public static final String f18649a = ekr.class.getSimpleName();
    public static boolean h = false;
    public static int i = 0;
    public static VideoStatus o = VideoStatus.VIDEO_NORMAL_STATUS;
    public static boolean q = false;
    public static int r = 0;
    public static int s = 0;
    public static int t = 0;
    public static boolean e0 = false;
    public static boolean f0 = false;
    public static boolean g0 = false;
    public static boolean h0 = true;
    public static boolean i0 = false;
    public static boolean j0 = false;
    public static boolean k0 = false;
    public static boolean l0 = true;
    public static final boolean m0 = true;
    public static long n0 = 0;
    public static boolean p0 = false;
    public static boolean q0 = false;
    public static boolean r0 = false;
    public static boolean t0 = false;
    public static boolean u0 = false;
    public static String v0 = "";
    public static String w0 = null;
    public static boolean E0 = false;

    static {
        t2o.a(806355789);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[0]);
        }
        return c;
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc8d202", new Object[0]);
        }
        return d;
    }

    public static VideoInfo C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[0]);
        }
        if (v2s.o().l() == null || !(v2s.o().l().a() instanceof VideoInfo)) {
            return null;
        }
        return (VideoInfo) v2s.o().l().a();
    }

    public static VideoStatus D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("d294741", new Object[0]);
        }
        return o;
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc661985", new Object[0]);
        }
        return c0;
    }

    public static String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("739809c", new Object[0]);
        }
        return k;
    }

    public static String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8a06fee", new Object[0]);
        }
        return l;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d186c8d8", new Object[0])).booleanValue();
        }
        if (a0 == null && b0 == null && w0 == null && !a().contains(A0)) {
            return false;
        }
        return true;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c90a1f", new Object[0])).booleanValue();
        }
        if (k() != null) {
            return true;
        }
        return false;
    }

    public static boolean J(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47d21958", new Object[]{tBLiveDataModel})).booleanValue();
        }
        if (l(tBLiveDataModel) != null) {
            return true;
        }
        return false;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f04fa69", new Object[0])).booleanValue();
        }
        return "shop2F".equals(B) || (qvs.L() && e0);
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7b37d4", new Object[0])).booleanValue();
        }
        String str = B;
        if (str == null || !str.equals(qvs.E0())) {
            return false;
        }
        return true;
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc4e1867", new Object[0])).booleanValue();
        }
        return f0;
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a148e1e2", new Object[0])).booleanValue();
        }
        return m0;
    }

    public static boolean O(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764b7912", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null) {
            videoInfo = C();
        }
        if (videoInfo == null || (videoInfo.newRoomType & 256) != 256) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a43c125", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f43477f", new Object[0])).booleanValue();
        }
        return g0;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("950655d9", new Object[0])).booleanValue();
        }
        VideoInfo C2 = C();
        if (C2 == null) {
            return false;
        }
        if ("1".equals(C2.roomStatus) || "2".equals(C2.roomStatus)) {
            return true;
        }
        return false;
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bf84bf", new Object[0])).booleanValue();
        }
        if (!l0 || !qvs.H()) {
            return false;
        }
        return true;
    }

    public static void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453d7a1d", new Object[]{str});
        }
    }

    public static void U(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407a5625", new Object[]{alimamaInfo2});
        } else {
            b0 = alimamaInfo2;
        }
    }

    public static void V(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbbf93e", new Object[]{alimamaInfo});
        } else {
            a0 = alimamaInfo;
        }
    }

    public static void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b416b", new Object[]{str});
        }
    }

    public static void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce5902e", new Object[]{str});
        }
    }

    public static void Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93165cc", new Object[]{str});
        } else {
            Y = str;
        }
    }

    public static void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a01bc", new Object[]{str});
        } else {
            B0 = str;
        }
    }

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ba5969ae", new Object[0]);
        }
        if (I0 == null) {
            I0 = new HashSet();
            for (String str : v2s.o().p().b("tblive", "adLivesourceList", "ad_hudong11;ad_brandzone;ad_tanx;ad_tblive_task;ad_timemove;livesource=p4p-kgb").split(";")) {
                I0.add(str);
            }
        }
        return I0;
    }

    public static void a0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d857c42c", new Object[]{new Boolean(z2)});
        } else {
            f0 = z2;
        }
    }

    public static void b0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84be0568", new Object[]{new Boolean(z2)});
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31368121", new Object[0])).booleanValue();
        }
        return h0;
    }

    public static void c0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7188fda", new Object[]{map});
        } else {
            x0 = map;
        }
    }

    public static ViewGroup d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ad711da", new Object[]{context});
        }
        rvd rvdVar = J0;
        if (rvdVar == null) {
            return null;
        }
        return ((gmr) rvdVar).b(context);
    }

    public static void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{str});
        } else {
            A0 = str;
        }
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo2 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("67916ec1", new Object[0]);
        }
        return b0;
    }

    public static void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0153dd", new Object[]{str});
        } else {
            f = str;
        }
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("c09537fe", new Object[0]);
        }
        return a0;
    }

    public static void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2494ab85", new Object[]{str});
        } else {
            p = str;
        }
    }

    public static FandomPreLiveInfo g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("da788cc4", new Object[0]);
        }
        return null;
    }

    public static void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfb0806", new Object[]{str});
        } else {
            y0 = str;
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6299952", new Object[0]);
        }
        return Y;
    }

    public static void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cdc7c", new Object[]{str});
        } else {
            z0 = str;
        }
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        rvd rvdVar = J0;
        if (rvdVar == null) {
            return -1;
        }
        return ((gmr) rvdVar).c();
    }

    public static void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc7cb29", new Object[]{str});
        } else {
            D0 = str;
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ca85962", new Object[0]);
        }
        return B0;
    }

    public static void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static FandomInfo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6c3d3d9", new Object[0]);
        }
        if (v2s.o().l() == null || !(v2s.o().l().g() instanceof FandomInfo)) {
            return null;
        }
        return (FandomInfo) v2s.o().l().g();
    }

    public static void k0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabe2081", new Object[]{new Boolean(z2)});
        }
    }

    public static FandomInfo l(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6d047dc0", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null && v2s.o().l() != null && (v2s.o().l().b() instanceof TBLiveDataModel)) {
            tBLiveDataModel = (TBLiveDataModel) v2s.o().l().b();
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mFandomInfo;
        }
        return null;
    }

    public static void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cd439c", new Object[]{str});
        } else {
            g = str;
        }
    }

    public static Map<String, String> m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3dbecd9", new Object[0]);
        }
        if (n == null) {
            n = new HashMap();
        }
        ((HashMap) n).put("accountId", Z);
        ((HashMap) n).put("contentId", Y);
        ((HashMap) n).put("spmUrl", b);
        ((HashMap) n).put("clickId", w0);
        ((HashMap) n).put("liveSource", A0);
        Map<String, String> map = n;
        if (H()) {
            str = "1";
        } else {
            str = "";
        }
        ((HashMap) map).put("ad", str);
        ((HashMap) n).put("entryLiveSource", B);
        ((HashMap) n).put("entrySpm", F);
        ((HashMap) n).put("kandianId", k);
        ((HashMap) n).put("watchId", c0);
        ((HashMap) n).put("pvId", e);
        ((HashMap) n).put("originPage", "Livewatch");
        ((HashMap) n).put("spmCnt", null);
        ((HashMap) n).put("appKey", "21646297");
        ((HashMap) n).put("feedtype", null);
        ((HashMap) n).putAll(r());
        return n;
    }

    public static void m0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d507a", new Object[]{new Integer(i2)});
        } else {
            i = i2;
        }
    }

    public static Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57a00234", new Object[0]);
        }
        return x0;
    }

    public static void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996d54b2", new Object[]{str});
        } else {
            C0 = str;
        }
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[0]);
        }
        return A0;
    }

    public static void o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76382da8", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0198ab9", new Object[0]);
        }
        return f;
    }

    public static void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7b00b9", new Object[]{str});
        }
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4275211", new Object[0]);
        }
        return p;
    }

    public static void q0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5eeaaf", new Object[]{new Boolean(z2)});
        } else {
            g0 = z2;
        }
    }

    public static Map<String, String> r() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac9e03ca", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
        } catch (Exception e2) {
            o3s.b(f18649a, "getOtherInteractiveParams catch exception:" + e2.getMessage());
        }
        if (TextUtils.isEmpty(u)) {
            return hashMap;
        }
        Uri parse = Uri.parse(u);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames.contains("boostType")) {
            hashMap.put("boostType", parse.getQueryParameter("boostType"));
        }
        if (queryParameterNames.contains("isBoost")) {
            hashMap.put("isBoost", parse.getQueryParameter("isBoost"));
        }
        for (String str : qvs.y0().split(",")) {
            if (queryParameterNames.contains(str)) {
                hashMap.put(str, parse.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43af5b4", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static String s() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0f2062", new Object[0]);
        }
        if (v2s.o().l() == null || !(v2s.o().l().b() instanceof TBLiveDataModel)) {
            tBLiveDataModel = null;
        } else {
            tBLiveDataModel = (TBLiveDataModel) v2s.o().l().b();
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mRawData;
        }
        return null;
    }

    public static void s0(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7035b1b", new Object[]{videoStatus});
        } else {
            o = videoStatus;
        }
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae5c7d8", new Object[0]);
        }
        return y0;
    }

    public static void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97609ff9", new Object[]{str});
        } else {
            c0 = str;
        }
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f717f3a", new Object[0]);
        }
        return z0;
    }

    public static void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7adc1c2", new Object[]{str});
        } else {
            k = str;
        }
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[0]);
        }
        return D0;
    }

    public static void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34308b0", new Object[]{str});
        } else {
            l = str;
        }
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[0]);
        }
        return b;
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("943c5482", new Object[0]);
        }
        return g;
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f336528", new Object[0])).intValue();
        }
        return i;
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bce135ac", new Object[0]);
        }
        return C0;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db57fed8", new Object[]{str})).intValue();
        }
        return "shop".equals(str) ? 1 : 2;
    }
}
