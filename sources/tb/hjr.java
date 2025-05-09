package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hjr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KMPTag = "kmpTag";
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    public static List<String> g;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Boolean> f20687a = new HashMap<>();
    public static final HashMap<String, String> b = new HashMap<>();
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    public static int f = -1;
    public static String h = null;
    public static int i = -1;
    public static int j = 10;

    static {
        t2o.a(806356492);
    }

    public static String A(String str, String str2, String str3, String str4) {
        u9b c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3d05ae9", new Object[]{str, str2, str3, str4});
        }
        HashMap<String, String> hashMap = b;
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

    public static String B(String str, String str2, String str3) {
        u9b c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7131911", new Object[]{str, str2, str3});
        }
        HashMap<String, String> hashMap = b;
        String str4 = hashMap.get(str3);
        if (str4 == null && (c2 = v2s.o().c()) != null) {
            str4 = c2.b(str, str2, str3, "");
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(str3, str4);
            }
        }
        return str4;
    }

    public static long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cca1e39d", new Object[0])).longValue();
        }
        if (v2s.o().p() != null) {
            return zqq.h(v2s.o().p().b("tblive", "getAutoSwitchStreamWhenManualLimit", String.valueOf(86400000L)));
        }
        return 86400000L;
    }

    public static long D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9adaf214", new Object[0])).longValue();
        }
        if (v2s.o().p() != null) {
            return zqq.h(v2s.o().p().b("tblive", "getAutoSwitchStreamWhenManualTipLimit", String.valueOf(604800000L)));
        }
        return 604800000L;
    }

    public static boolean E(String str, boolean z) {
        blc p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abdcb197", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        HashMap<String, Boolean> hashMap = f20687a;
        Boolean bool = hashMap.get(str);
        if (bool == null && (p = v2s.o().p()) != null) {
            bool = Boolean.valueOf(zqq.c(p.b("tblive", str, String.valueOf(z))));
            hashMap.put(str, bool);
        }
        return bool != null ? bool.booleanValue() : z;
    }

    public static long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e6f58a", new Object[0])).longValue();
        }
        return zqq.i(v2s.o().p().b("tblive", "officialEndDelayMillis", "3000"), 3000L);
    }

    public static String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c91c1551", new Object[0]);
        }
        return v2s.o().p().b("tblive", "officialLiveEndToastMsg", v2s.o().f().getApplication().getString(R.string.taolive_official_live_end_toast));
    }

    public static String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55f621bf", new Object[0]);
        }
        return v2s.o().p().b("tblive", "officialLiveNextToastMsg", v2s.o().f().getApplication().getString(R.string.taolive_official_live_next_toast));
    }

    public static String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("654078a5", new Object[0]);
        }
        return v2s.o().p().b("tblive", "officialLiveNextWhenToastMsg", v2s.o().f().getApplication().getString(R.string.taolive_official_live_next_when_toast));
    }

    public static long J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7eb9ef", new Object[0])).longValue();
        }
        return zqq.i(v2s.o().p().b("tblive", "officialSwitchDelayMillis", "3000"), 3000L);
    }

    public static String K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6311391f", new Object[]{str, str2});
        }
        return v2s.o().p() != null ? v2s.o().p().b("tblive", str, str2) : str2;
    }

    public static List<String> L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("45c61c57", new Object[0]);
        }
        if (g == null) {
            g = Arrays.asList(v2s.o().p().b("tblive", "commissionDataAttributesKeyList", "mediafrom;itemId").split(";"));
        }
        return g;
    }

    public static List<String> M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("235857e4", new Object[]{str});
        }
        return Arrays.asList(str.split(";"));
    }

    public static List<String> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16f564e8", new Object[0]);
        }
        if (h == null && v2s.o().p() != null) {
            h = v2s.o().p().b("tblive", "tcpAddLiveAlgoParamsKeyList", "combineKey;hyperSpaceBucket");
        }
        return M(h);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cdec6f5", new Object[0])).booleanValue();
        }
        return d4s.e("enableAdvanceInteractBizCenterFrameInit", true);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62207ce1", new Object[0])).intValue();
        }
        return vvs.e("tblive", "bottomSlideGuideGapHeight", 16);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78dabc91", new Object[0])).booleanValue();
        }
        if (c == -1 && v2s.o().p() != null && zqq.c(v2s.o().p().b("tblive", "enableAutoSwitchStreamWhenManual20240102", "false"))) {
            c = c() ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef9e2b2", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return zqq.c(v2s.o().c().b("taolive", "EnableAutoSwitchStreamWhenManual20240102", "enableAutoSwitch", "false"));
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eeb185b", new Object[0])).booleanValue();
        }
        return d4s.e("enableBizPmStabilityReportV2", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba97e9a", new Object[0])).booleanValue();
        }
        return d4s.e("enableSecondLevelHeartbeat", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab6228b6", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableClientABTestHeartParams", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5881e0c6", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableComponentJoinSchedule", true) || !d4s.c("enableComponentJoinSchedule", "enableComponentJoinSchedule", false)) {
            return false;
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fab3318", new Object[0])).booleanValue();
        }
        return d4s.e("enableKMPMasterSwitch", false);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e91c6d8", new Object[0])).booleanValue();
        }
        if (!h()) {
            return false;
        }
        return d4s.e("KMPMessageProvider5", false);
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65ea9de9", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            j = i4s.b(v2s.o().p().b("tblive", "secondLevelHeartbeatLoopInterval", "10"), 10);
        }
        return j;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f7a5189", new Object[0])).booleanValue();
        }
        boolean e2 = d4s.e("enableLiveKmpComponent", true);
        o3s.b(KMPTag, "orange enableLiveKmpComponent = " + e2);
        return e2;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c606c2", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableMergeDataAttributesParam", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f538942", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableNotDestroyWebContainer", "true"));
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de9732b8", new Object[0])).booleanValue();
        }
        return zqq.c(i9l.b("tblive", "enableRedirectNotifyLeaveFail", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c749887", new Object[0])).booleanValue();
        }
        if (f == -1 && v2s.o().p() != null) {
            if (zqq.c(v2s.o().p().b("tblive", "enableShowPMErrorToast", "true"))) {
                f = 1;
            } else {
                f = 0;
            }
        }
        return f == 1;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("750d1b93", new Object[0])).booleanValue();
        }
        if (i == -1 && v2s.o().p() != null) {
            i = zqq.c(v2s.o().p().b("tblive", "enableTcpAddLiveAlgoParams", "true")) ? 1 : 0;
        }
        return i == 1;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0643be", new Object[0])).booleanValue();
        }
        if (e == -1 && v2s.o().p() != null) {
            if (zqq.c(v2s.o().p().b("tblive", "enableUseFragmentJumpDetail", "true"))) {
                e = 1;
            } else {
                e = 0;
            }
        }
        return e == 1;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35afb78e", new Object[0])).booleanValue();
        }
        if (d == -1 && v2s.o().p() != null && zqq.c(v2s.o().p().b("tblive", "enableUseNewQueueMessageService2", "false"))) {
            d = 1;
        }
        return d == 1;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9275f48", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableWebFragmentUnregisterEvent", "true"));
        }
        return true;
    }
}
