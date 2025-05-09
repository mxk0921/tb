package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ejr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f18626a = -1;
    public static int b = -1;
    public static int c = -1;
    public static final HashMap<String, Boolean> d = new HashMap<>();
    public static final HashMap<String, String> e = new HashMap<>();
    public static int f = -1;
    public static int g = -1;
    public static int h = -1;
    public static List<String> i = null;
    public static List<String> j = null;
    public static List<String> k = null;

    static {
        t2o.a(779093541);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa7b5d26", new Object[0])).longValue();
        }
        if (f18626a == -1 && v2s.o().p() != null) {
            f18626a = zqq.h(v2s.o().p().b("tblive", "delayDestroyTimeMs", "1000"));
        }
        return f18626a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e49f72", new Object[0])).booleanValue();
        }
        return zqq.c(i9l.b("tblive", "enableDefaultImmersiveExperience", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb9a8805", new Object[0])).booleanValue();
        }
        if (g == -1 && v2s.o().p() != null) {
            g = yqq.h(v2s.o().p().b("tblive", "enableDetailToSmallWindowWithFlag", "true")) ? 1 : 0;
        }
        return g == 1;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77738f", new Object[0])).booleanValue();
        }
        if (h == -1 && v2s.o().p() != null) {
            h = yqq.h(v2s.o().p().b("tblive", "enableExtCustomPageParams", "true")) ? 1 : 0;
        }
        return h == 1;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d91220bd", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHalfDetailMiniPlayerCloseMute", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c171db8d", new Object[0])).booleanValue();
        }
        if (!zqq.c(i9l.b("tblive", "enableImmersiveExperience1021", "true")) || v2s.o().c() == null) {
            return false;
        }
        return zqq.c(v2s.o().c().b("taolive", "ImmersiveExperience", "enabled", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("213c891a", new Object[0])).booleanValue();
        }
        return p("enableInterceptPlayerProcess", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5a68b6a", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enableNewPlayReporterLiveStartSuccess", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("787332d9", new Object[0])).booleanValue();
        }
        if (f == -1 && v2s.o().p() != null) {
            f = yqq.h(v2s.o().p().b("tblive", "enableOnlyHalfScreenToSmallWindow", "true")) ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c48f62d2", new Object[0])).booleanValue();
        }
        if (b == -1 && v2s.o().p() != null) {
            b = zqq.c(v2s.o().p().b("tblive", "enableOpenOuterTraceLogic", "true")) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21bd3dba", new Object[0])).booleanValue();
        }
        try {
            return zqq.c(v2s.o().p().b("tblive", "enableSupportPlayLiveVideo", "true"));
        } catch (Exception e2) {
            o3s.b("TBLiveCommonSDKConfig", "enableSupportPlayLiveVideo:" + e2.getMessage());
            return false;
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("571fbf87", new Object[0])).booleanValue();
        }
        if (c == -1 && v2s.o().p() != null) {
            c = yqq.h(v2s.o().p().b("tblive", "enableTBCommonKeepOpenCardLastFrame", "true")) ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("443e272c", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableUseSurfaceViewABTest", "true"));
        }
        return false;
    }

    public static String o(String str, String str2, String str3, String str4) {
        u9b c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3d05ae9", new Object[]{str, str2, str3, str4});
        }
        HashMap<String, String> hashMap = e;
        String str5 = hashMap.get(str3);
        if (str5 == null && (c2 = v2s.o().c()) != null) {
            str5 = c2.b(str, str2, str3, str4);
            hashMap.put(str3, str5);
        }
        if (str5 != null) {
            return str5;
        }
        return str4;
    }

    public static boolean p(String str, boolean z) {
        blc p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abdcb197", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        HashMap<String, Boolean> hashMap = d;
        Boolean bool = hashMap.get(str);
        if (bool == null && (p = v2s.o().p()) != null) {
            bool = Boolean.valueOf(yqq.h(p.b("tblive", str, String.valueOf(z))));
            hashMap.put(str, bool);
        }
        return bool != null ? bool.booleanValue() : z;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ce211ca", new Object[0])).intValue();
        }
        return Math.min(Math.max(1, zqq.j(OrangeConfig.getInstance().getConfig("tblive", "maxMediaNumV2", "1"))), 1);
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53caafdb", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "getPlayerErrorAnchorLeaveUrl", "https://gw.alicdn.com/imgextra/i3/O1CN01Xpv5Vd23DGw8GiyuX_!!6000000007221-2-tps-450-450.png");
        }
        return "https://gw.alicdn.com/imgextra/i3/O1CN01Xpv5Vd23DGw8GiyuX_!!6000000007221-2-tps-450-450.png";
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa6194a7", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "getPlayerErrorNetWorkUrl", "https://gw.alicdn.com/imgextra/i4/O1CN011zu0aX1JkH9VJmDRW_!!6000000001066-2-tps-450-450.png");
        }
        return "https://gw.alicdn.com/imgextra/i4/O1CN011zu0aX1JkH9VJmDRW_!!6000000001066-2-tps-450-450.png";
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73478329", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "getPlayerLiveEndLeaveUrl", "https://gw.alicdn.com/imgextra/i2/O1CN01frWh5y28JkcOkOUYc_!!6000000007912-2-tps-450-450.png");
        }
        return "https://gw.alicdn.com/imgextra/i2/O1CN01frWh5y28JkcOkOUYc_!!6000000007912-2-tps-450-450.png";
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9f1f4d2", new Object[0])).intValue();
        }
        return zqq.g(i9l.b("tblive", "VideoImmersiveConfig", "100"), 0);
    }

    public static List<String> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1642d241", new Object[0]);
        }
        if (j == null && v2s.o().p() != null) {
            j = z(v2s.o().p().b("tblive", "immersiveExcludeBizCodeList", ""));
        }
        return j;
    }

    public static List<String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f2b37ff", new Object[0]);
        }
        if (k == null && v2s.o().p() != null) {
            k = z(v2s.o().p().b("tblive", "immersiveExcludeH5UrlList", "https://pages-fast.m.taobao.com/wow/z/app/tb-vip/month-card-ssr/external"));
        }
        return k;
    }

    public static List<String> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5d80a195", new Object[0]);
        }
        if (i == null && v2s.o().p() != null) {
            i = z(v2s.o().p().b("tblive", "immersiveExcludeSceneList", ""));
        }
        return i;
    }

    public static List<String> z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("235857e4", new Object[]{str});
        }
        return Arrays.asList(str.split(";"));
    }

    public static int u(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("831b375", new Object[]{new Integer(i2)})).intValue();
        }
        if (!p("getSurfaceViewSDKVersion", true)) {
            return i2;
        }
        String o = o("taolive", "SurfaceViewSDKVersion", "surfaceViewSDKVersion", "" + i2);
        return !TextUtils.isEmpty(o) ? yqq.l(o, i2) : i2;
    }

    public static boolean m(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7e3f94e", new Object[]{cbaVar})).booleanValue();
        }
        if (cbaVar == null) {
            return false;
        }
        if (cbaVar.H == -1) {
            if (!n() || v2s.o().c() == null) {
                cbaVar.H = 0;
            } else {
                cbaVar.H = yqq.h(v2s.o().c().b("taolive", "enableUseSurfaceViewFormal", "enableUseSurfaceView", "false")) ? 1 : 0;
            }
        }
        return cbaVar.H == 1;
    }
}
