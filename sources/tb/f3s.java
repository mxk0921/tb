package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f3s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f18983a;
    public static List<String> b;
    public static HashSet<String> c;

    static {
        t2o.a(779092101);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47369492", new Object[]{context})).booleanValue();
        }
        int e = new n81(context).e(1);
        if (e == 2) {
            return false;
        }
        if (e == 0) {
            return v74.e(context);
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7a8ec8", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "closeMiniLiveWhenWeexVideoStart", "true"));
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81125522", new Object[0])).booleanValue();
        }
        String tacticsPerformance = Downgrade.getInstance().getDowngradeStrategy("taolive").getTacticsPerformance();
        efs.a("TLiveConfig", "downgradeConfig " + tacticsPerformance);
        return TextUtils.equals(tacticsPerformance, "degrade");
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93181b1d", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "liveDetailCDNUrl", "https://alive-interact.alicdn.com/livedetail/common/");
        }
        return "";
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f66592", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "miniLiveFavor", "https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png");
        }
        return "https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png";
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a712d1a9", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "miniLivingIcon", "https://gw.alicdn.com/tfs/TB1A4mayFY7gK0jSZKzXXaikpXa-228-72.png");
        }
        return "https://gw.alicdn.com/tfs/TB1A4mayFY7gK0jSZKzXXaikpXa-228-72.png";
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4af50a3d", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return zqq.j(v2s.o().p().b("tblive", "checkMiniLivePermissionInterval", "4320"));
        }
        return 4320;
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c59f161", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return zqq.j(v2s.o().p().b("tblive", "globalMiniLiveCloseTimes", "2"));
        }
        return 2;
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e190fd5", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return zqq.j(v2s.o().p().b("tblive", "checkMiniLiveShowInterval", "4320"));
        }
        return 4320;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a4be163", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "miniLiveUrl", "http://h5.m.taobao.com/taolive/video.html?livesource=miniLive&spm=a2141.7631565.a2191d.15026470");
        }
        return "http://h5.m.taobao.com/taolive/video.html?livesource=miniLive&spm=a2141.7631565.a2191d.15026470";
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8ecc09", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "isNeedShowMiniLiveByLiveRoom", "true"));
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a29a2e72", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return zqq.j(v2s.o().p().b("tblive", "aliMiniLivePaddingY", "0"));
        }
        return 0;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72da0ccf", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return zqq.j(v2s.o().p().b("tblive", "aliMiniLivePaddingX", "0"));
        }
        return 0;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5a3fc9", new Object[0])).booleanValue();
        }
        if (v2s.o().p() == null || e() || !t()) {
            return false;
        }
        return true;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c19a156b", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("TBMiniLive", "miniLive").getVariation("openMiniLive");
        if (variation == null) {
            return true;
        }
        String valueAsString = variation.getValueAsString("true");
        if (!TextUtils.isEmpty(valueAsString)) {
            return Boolean.valueOf(valueAsString).booleanValue();
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52256e", new Object[0])).booleanValue();
        }
        if (v2s.o().p() == null || e() || !t()) {
            return false;
        }
        return true;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f90bb3cf", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "globalMiniLiveEnabledInShopBugFix", "true"));
        }
        return false;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d0340fd", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "globalMiniLiveEnabledInShopReceiver", "true"));
        }
        return false;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da09590c", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("TBMiniLive", "quickStartLive").getVariation("quickStartLive");
        if (variation != null) {
            return zqq.c(variation.getValueAsString("true"));
        }
        return true;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99960935", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "shopPlayerStateChange", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7b7833a", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("TBMiniLive", "showBenefits").getVariation("showBenefits");
        if (variation == null) {
            return true;
        }
        String valueAsString = variation.getValueAsString("true");
        if (!TextUtils.isEmpty(valueAsString)) {
            return Boolean.valueOf(valueAsString).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:6:0x0015, B:8:0x001f, B:11:0x003a, B:13:0x003e, B:15:0x004c, B:20:0x0058, B:22:0x0066, B:27:0x0074, B:28:0x007b), top: B:31:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A(android.content.Context r13) {
        /*
            r0 = 1
            java.lang.String r1 = "showMiniLive"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.f3s.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r1 = "e1d4dd21"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r13
            r2.ipc$dispatch(r1, r0)
            return
        L_0x0015:
            tb.v2s r2 = tb.v2s.o()     // Catch: Exception -> 0x0052
            tb.wvd r2 = r2.g()     // Catch: Exception -> 0x0052
            if (r2 == 0) goto L_0x008a
            tb.v2s r2 = tb.v2s.o()     // Catch: Exception -> 0x0052
            tb.wvd r2 = r2.g()     // Catch: Exception -> 0x0052
            java.lang.Object r2 = r2.a(r13, r1)     // Catch: Exception -> 0x0052
            long r3 = com.taobao.taobaocompat.lifecycle.TimestampSynchronizer.getServerTime()     // Catch: Exception -> 0x0052
            boolean r5 = r2 instanceof com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x0052
            java.lang.String r6 = "count"
            r7 = 0
            java.lang.String r9 = "optTime"
            if (r5 == 0) goto L_0x0056
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: Exception -> 0x0052
            if (r2 == 0) goto L_0x0056
            long r10 = r2.getLongValue(r9)     // Catch: Exception -> 0x0052
            int r5 = k()     // Catch: Exception -> 0x0052
            boolean r5 = tb.v74.f(r5, r10)     // Catch: Exception -> 0x0052
            if (r5 != 0) goto L_0x0054
            int r2 = r2.getIntValue(r6)     // Catch: Exception -> 0x0052
            int r2 = r2 + r0
            goto L_0x0058
        L_0x0052:
            r13 = move-exception
            goto L_0x0087
        L_0x0054:
            r2 = 1
            goto L_0x0058
        L_0x0056:
            r10 = r7
            goto L_0x0054
        L_0x0058:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x0052
            r5.<init>()     // Catch: Exception -> 0x0052
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch: Exception -> 0x0052
            r5.put(r6, r12)     // Catch: Exception -> 0x0052
            if (r2 != r0) goto L_0x006e
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: Exception -> 0x0052
            r5.put(r9, r0)     // Catch: Exception -> 0x0052
            goto L_0x007b
        L_0x006e:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = r10
        L_0x0074:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: Exception -> 0x0052
            r5.put(r9, r0)     // Catch: Exception -> 0x0052
        L_0x007b:
            tb.v2s r0 = tb.v2s.o()     // Catch: Exception -> 0x0052
            tb.wvd r0 = r0.g()     // Catch: Exception -> 0x0052
            r0.b(r13, r1, r5)     // Catch: Exception -> 0x0052
            goto L_0x008a
        L_0x0087:
            r13.printStackTrace()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f3s.A(android.content.Context):void");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c985c52", new Object[]{str})).booleanValue();
        }
        if (v2s.o().p() != null) {
            String b2 = v2s.o().p().b("tblive", "blockMiniLivePageList", "");
            if (!TextUtils.isEmpty(b2)) {
                return b2.contains(str);
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24234f35", new Object[]{context})).booleanValue();
        }
        if (v2s.o().g() != null) {
            Object a2 = v2s.o().g().a(context, "showMiniLive");
            int j = j();
            efs.a("TBLiveService", "canShowMiniLive displayCount = " + j);
            if (a2 instanceof JSONObject) {
                try {
                    JSONObject jSONObject = (JSONObject) a2;
                    if (jSONObject != null && jSONObject.getIntValue("count") >= j) {
                        boolean f = v74.f(k(), jSONObject.getLongValue("optTime"));
                        efs.a("TBLiveService", "canShowMiniLive is more than interval = " + f);
                        return f;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    efs.a("TBLiveService", "canShowMiniLive Exception  e= " + e.getMessage());
                }
            }
        }
        return true;
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d69e157", new Object[]{str})).booleanValue();
        }
        if (c == null) {
            c = new HashSet<>();
            if (v2s.o().p() != null) {
                String b2 = v2s.o().p().b("tblive", "getTopActivityBlacks", "com.taobao.message.ui.biz.redpackage.activity.WeexAlphaBgActivity");
                if (!TextUtils.isEmpty(b2)) {
                    c.addAll(Arrays.asList(b2.split(";")));
                }
            }
        }
        return !c.contains(str);
    }

    public static boolean o(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40635c4", new Object[]{str})).booleanValue();
        }
        if ((f18983a == null || b == null) && v2s.o().p() != null) {
            f18983a = Boolean.valueOf(zqq.c(v2s.o().p().b("tblive", "isNewTaoliveMiniLiveUI", "true")));
            b = Arrays.asList(v2s.o().p().b("tblive", "isNewTaoliveMiniLiveWhites", "shop").split(";"));
        }
        Boolean bool = f18983a;
        return bool != null && bool.booleanValue() && (list = b) != null && list.contains(str);
    }

    public static boolean r(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9a26af", new Object[]{str})).booleanValue();
        }
        if (v2s.o().p() != null) {
            String b2 = v2s.o().p().b("tblive", "needShowWindowBiz", "search;huichang;juhuasuan");
            if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(str) && (split = b2.split(";")) != null && split.length > 0 && !TextUtils.isEmpty(str)) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
