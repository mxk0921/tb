package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pvs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public static int f26345a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    public static int f = -1;
    public static int g = -1;
    public static String h = null;
    public static String i = null;
    public static int j = -1;
    public static int k = -1;
    public static int l = -1;
    public static int m = -1;
    public static List<String> n = null;
    public static int o = -1;
    public static String p;

    static {
        t2o.a(779093373);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47d9271f", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableCompensateSEIDispatcherInit", "true"));
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b3a91f", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveRoomDrawDelayed", "false"));
    }

    public static boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6bb6585", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSurfaceViewJumpType1", "true"));
    }

    public static String A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bc5ac5a", new Object[0]);
        }
        return v2s.o().p().b("tblive", "TaoLiveIDV2", "221082344881");
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc2ccda6", new Object[0])).booleanValue();
        }
        return qvs.d0() && yqq.h(v2s.o().p().b("tblive", "enableDataDestorySwitch", "true"));
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2dc3c19", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveRoomUrls", "true"));
    }

    public static boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb79069", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableSyncLiveSourcePre", "true"));
        }
        return false;
    }

    public static boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc53e757", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "EnableTaoLiveSwitch", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef8d1f9", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "defaultRefreshAllData", "true"));
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c699324", new Object[0])).booleanValue();
        }
        if (k == -1 && v2s.o().p() != null) {
            if (yqq.h(v2s.o().p().b("tblive", "enableLiveRoomWarmOpen", "true"))) {
                k = D0() ? 1 : 0;
            } else {
                k = 0;
            }
        }
        return k == 1;
    }

    public static boolean C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ba827bf", new Object[0])).booleanValue();
        }
        return d4s.e("enableTLiveRoomAnalysis", true);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ef84dda", new Object[0])).booleanValue();
        }
        return d4s.e("enableDeleteDestroyVideo", true);
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea2d6085", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().c().b("taolive", "EnableLiveRoomWarmOpenAB", "enableEnableLiveRoomWarmOpenAB", "true"));
        }
        return false;
    }

    public static boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f9f6437", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableTaoLiveBugfix", "true"));
    }

    public static int D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8b660bd", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "UpDownSwitchADCheckInterval", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453014a7", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableDirectReplayUrl", "true"));
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2adb39a9", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveUrlListWarmup", "true"));
    }

    public static boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89aaeb78", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableTaoLiveFixHalfInit", "false"));
    }

    public static int E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9df7e37e", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "SwitchRoomTppFeedCount", "50"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc457db3", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableDisableVerticalScroll", "true"));
        }
        return false;
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f61b01ca", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLockFrame", "true"));
    }

    public static boolean F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f547dcbb", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableTaoliveStackManager", "true"));
        }
        return true;
    }

    public static int F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7212372d", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "UpDownSwitchFeedListSizeForHomepage", "30"));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bdf4994", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableDisplaySupportKandianChannel", true) || !l0()) {
            return false;
        }
        return true;
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a2ca585", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLockFrameForbidden", "true"));
    }

    public static boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("498c9155", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableTimeMoveBackToReplay", "true"));
    }

    public static int G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7067ae46", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "UpDownRequestInterval", "2"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9944442", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enableDxSmartPreLoad", "true"));
        }
        return false;
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3273d7f8", new Object[0])).booleanValue();
        }
        if (f26345a == -1 && v2s.o().p() != null) {
            f26345a = yqq.h(v2s.o().p().b("tblive", "enableLpmOpt20230301", "true")) ? 1 : 0;
        }
        return f26345a == 1;
    }

    public static boolean H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("961d91e3", new Object[0])).booleanValue();
        }
        return d4s.e("enableTimeMoveRecDupCheck", true);
    }

    public static int H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("953c7331", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "NewSwitchRequestPageSize", "5"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e31bcb1", new Object[0])).booleanValue();
        }
        if (c == -1 && v2s.o().p() != null) {
            c = yqq.h(v2s.o().p().b("tblive", "enableEnterDelayDidAppear", "true")) ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4b9200", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableMixLiveReturn", "true"));
        }
        return true;
    }

    public static boolean I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f04f3df", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableTppParamRefpid", "true"));
    }

    public static boolean I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93fcc831", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "initRecommendPopBugfix", "true"));
        }
        return true;
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b145d", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableEntryLiveRoomSmartLandingGoods", "true"));
        }
        return true;
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18c4d719", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableMixOfficialFollowStatusFix", Boolean.TRUE).booleanValue();
    }

    public static boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f0f9873", new Object[0])).booleanValue();
        }
        if (j == -1 && v2s.o().p() != null) {
            j = yqq.h(v2s.o().p().b("tblive", "enableTransPmParams", "true")) ? 1 : 0;
        }
        return j == 1;
    }

    public static List<String> J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e3b6d203", new Object[0]);
        }
        if (h == null && v2s.o().p() != null) {
            h = v2s.o().p().b("tblive", "interactiveExperimentList", "taolive_HotStrategy_turnOn");
        }
        return Z2(h);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9038954d", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableFeedBackLandscapeFix", "true"));
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ab344f", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableMoreLiveOnKeyDownIntercept", "true"));
    }

    public static boolean K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b24b918", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableUpDownGuideLiveBg", "true"));
    }

    public static boolean K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d00a711e", new Object[0])).booleanValue();
        }
        if (tfo.a() == null) {
            return false;
        }
        String str = tfo.a().accountId;
        try {
            for (String str2 : v2s.o().p().b("tblive", "topAnchors", "null").split(";")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cfecd2b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableFeedBackScrollFix", "true"));
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be46dee0", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableMotuReportException", "true"));
    }

    public static boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5edb07", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableUpDownMonitoringLog", "true"));
        }
        return false;
    }

    public static String L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb28caad", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().getStringSharedPreference("tblive", "liveAndHomeMixTemplate", "taolive_home_and_live_tab");
        }
        return "";
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8613983a", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableFirstAlimamaQuery", "true"));
        }
        return true;
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c996e2", new Object[0])).booleanValue();
        }
        return qvs.M();
    }

    public static boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb60945", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableNewAPIForUpDownSwitch", "true"));
    }

    public static int M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3a3b30d", new Object[0])).intValue();
        }
        if (v2s.o().p() != null) {
            return yqq.o(v2s.o().p().getStringSharedPreference("tblive", "liveAndHomeMixTemplateHeight", "40"));
        }
        return 40;
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d02af9c", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableFirstLoginLiveCloseUIFix", "true"));
        }
        return true;
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1b794b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableOpenGetOriginUrl", "true"));
    }

    public static boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e29777", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableUpDownSwitch4RecV2", "false"));
    }

    public static List<String> N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7d0d89a", new Object[0]);
        }
        if (i == null && v2s.o().p() != null) {
            i = v2s.o().p().b("tblive", "mainSearchLiveSourceList", "mainsearchlive;livegiraffe;livecloudtheme;ad_timemove");
        }
        return Z2(i);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d76c9c4", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixMiniLiveThreadPoolBug", true);
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b721bbd6", new Object[0])).booleanValue();
        }
        if (e == -1 && v2s.o().p() != null) {
            e = yqq.h(v2s.o().p().b("tblive", "enableOpenKeepMute", "true")) ? 1 : 0;
        }
        return e == 1;
    }

    public static boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd1979c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableUpDownSwitchADCheck", "false"));
    }

    public static long O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50c3b22d", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "negativeFeedbackRemoveDelayMills", "400"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca4b640a", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixNewOOM", true);
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a9740fe", new Object[0])).booleanValue();
        }
        return d4s.e("enableOpenSlideSmallWindow", true);
    }

    public static boolean P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9a0fb1", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableUpDownSwitchMonitor", "true"));
    }

    public static String P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8488ec0b", new Object[0]);
        }
        blc p2 = v2s.o().p();
        if (p2 != null) {
            return p2.b("tblive", "prePlayCustomPlayCtrlParamsWhiteList", "mainsearchlive,tb_tab2.guangguang_hudonglive.ad,homepage.gongge,follow");
        }
        return null;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2982472c", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixPreloadInstanceOOM", false);
    }

    public static boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("600f78c0", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableOuterParam", "true"));
    }

    public static boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1fcaf1c", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableUpDownSwitchTimer", "true"));
        }
        return false;
    }

    public static String Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9045cba", new Object[0]);
        }
        blc p2 = v2s.o().p();
        if (p2 != null) {
            return p2.b("tblive", "prePlayReplayBlackList", "anchorwin.playback");
        }
        return null;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2c5fd7", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixStreamMistake", true);
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e38c7670", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableOverScrollModeNever", "true"));
    }

    public static boolean R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c635652d", new Object[0])).booleanValue();
        }
        if (d == -1 && v2s.o().p() != null) {
            d = yqq.h(v2s.o().p().b("tblive", "enableUpdateAllDataWhenRefresh", "true")) ? 1 : 0;
        }
        return d == 1;
    }

    public static String R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19d21ac", new Object[0]);
        }
        return v2s.o().p().b("tblive", "preRequestRecommendBlackList", "");
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a012e54", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enableFoldDeviceForcePortraitFix", "true"));
        }
        return false;
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("136fbafb", new Object[0])).booleanValue();
        }
        return d4s.e("enableP2ffUseSurfaceView", true);
    }

    public static boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eb5019e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableUpdateDisPatchTrackInfo", "true"));
    }

    public static final int S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b8ac37", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "scrollDownHidePxToHideBottomGuide", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
    }

    public static boolean T(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968cf20e", new Object[]{context})).booleanValue();
        }
        boolean e2 = d4s.e("enableFoldableAPadShowBlurBg", true);
        if (!vc.a() || !vc.h(context)) {
            z = false;
        } else {
            z = true;
        }
        if (!e2 || !z) {
            return false;
        }
        return true;
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ec28f5", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enablePageTrackAddExtendJson", "true"));
        }
        return false;
    }

    public static boolean T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3292a80", new Object[0])).booleanValue();
        }
        return qvs.i0();
    }

    public static final int T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92013ade", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "ScrollUpHidePxToHideBottomGuide", "1"));
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2529575c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableFootprintManager", "true"));
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1812a17", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableParseEntryUtparam", "true"));
    }

    public static boolean U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9675d4d1", new Object[0])).booleanValue();
        }
        return qvs.j0();
    }

    public static final boolean U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b22dcb6", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "SendGoDetailMessage", "true"));
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbe32c9", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableFullScreenIconFix", "true"));
    }

    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a43a141", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableParseNeedRecommend", "true"));
    }

    public static boolean V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8fdf7a0", new Object[0])).booleanValue();
        }
        if (!i4s.a(OrangeConfig.getInstance().getConfig("tblive", "enableMediaCardFastStart", "true"), true)) {
            return false;
        }
        if (p == null) {
            p = v2s.o().c().c("taolive", "EnableMediaCardFastStart", "enableMediaCardFastStart", "false");
        }
        return i4s.a(p, false);
    }

    public static boolean V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("597f1fa2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "shareShowGoodList", "false"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("717efa34", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "goodsDXMangeDestroy", "true"));
        }
        return true;
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e06400e", new Object[0])).booleanValue();
        }
        return d4s.e("enableParseTopicIDUseFirst", true);
    }

    public static boolean W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("353bc101", new Object[0])).booleanValue();
        }
        if (l == -1 && v2s.o().p() != null) {
            l = yqq.h(v2s.o().p().b("tblive", "enableUpdwonSwitchEvent", "true")) ? 1 : 0;
        }
        return l == 1;
    }

    public static boolean W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115ac77b", new Object[0])).booleanValue();
        }
        return qvs.R0();
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dbec485", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableGoodsNextPageUtParams", true);
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f60b2690", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enablePlayBackToLive", "true"));
        }
        return true;
    }

    public static boolean X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e21edaf1", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableUseQuickUrl2", "true"));
        }
        return true;
    }

    public static boolean X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b90dffd", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "smallWindowClickBugfix", "true"));
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("494871a4", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("goodlist", "enableGoodsTakeOpt", "true"));
    }

    public static boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35a0d8e", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enablePlayReportFeedType", "true"));
        }
        return true;
    }

    public static boolean Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a268d3", new Object[0])).booleanValue();
        }
        return d4s.e("enableUseVideoLoopCompleteListener", true);
    }

    public static float Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ae81904", new Object[0])).floatValue();
        }
        return yqq.j(v2s.o().p().b("tblive", "smoothScrollSpeedSlow", "40.0"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ccf225", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableH5EmbedViewH5UT", "false"));
    }

    public static boolean Z0(ux9 ux9Var) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77f7cd5a", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var instanceof cdr) {
            cdr cdrVar = (cdr) ux9Var;
            if (cdrVar.J0() != null) {
                z = cdrVar.J0().enableReplyStyleUpgrade;
                if (z && d4s.e(d4s.SWITCH_ENABLE_PLAY_BACK_NEW_UI, true)) {
                    z2 = true;
                }
                o3s.b("SampleConfigUtil", "enablePlaybackUpdate, ret:" + z2 + ",enableReplyStyleUpgrade:" + z);
                return z2;
            }
        }
        z = false;
        if (z) {
            z2 = true;
        }
        o3s.b("SampleConfigUtil", "enablePlaybackUpdate, ret:" + z2 + ",enableReplyStyleUpgrade:" + z);
        return z2;
    }

    public static boolean Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2a2dcf", new Object[0])).booleanValue();
        }
        return qvs.l0();
    }

    public static List<String> Z2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("235857e4", new Object[]{str});
        }
        return Arrays.asList(str.split(";"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af396453", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "bugFixAddUriParamsIntoInitparams", "true"));
        }
        return true;
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26db8a78", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableH5EmbedViewUT", "true"));
    }

    public static boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e9c77b", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return qvs.d0() && yqq.h(v2s.o().p().b("tblive", "enablePlayerCoverImg", "true"));
        }
        return true;
    }

    public static boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d47a8f0", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "fixClickIdVoluation", "true"));
        }
        return true;
    }

    public static boolean a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34000bfa", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "switchToPortraitOrLandscapeDelayBugfix", "true"));
        }
        return false;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55cad641", new Object[0])).longValue();
        }
        String b2 = v2s.o().p().b("tblive", "delayCheckMistakeTime", "1500");
        o3s.b("SampleConfigUtil", "delayForceStartTime, delayForceStartTime:" + b2);
        return yqq.n(b2, 1500L);
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa38f911", new Object[0])).booleanValue();
        }
        return qvs.d0() && yqq.h(v2s.o().p().b("tblive", "enableHandleDetailData618", "true"));
    }

    public static boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8988da0e", new Object[0])).booleanValue();
        }
        return d4s.e("enablePostFirstFrameMainThread", false);
    }

    public static boolean b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba47c97", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "fixFollowServerLeak", "true"));
        }
        return true;
    }

    public static boolean b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e5ed90", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "tpp88TrackInfo", "true"));
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cad8502", new Object[0])).longValue();
        }
        String b2 = v2s.o().p().b("tblive", "delayForceStartTime", "3000");
        o3s.b("SampleConfigUtil", "delayForceStartTime, delayForceStartTime:" + b2);
        return yqq.n(b2, 3000L);
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9316b25f", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableHighlightInTab3", "true"));
        }
        return true;
    }

    public static boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c034f5c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enablePreLoadVideoSimpleData2", "false")) && yqq.h(v2s.o().c().c("taolive", "enablePreStartSimpleRequestDetailNew", "enablePreSimpleVideo2", "false"));
    }

    public static boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9ed3303", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "修复店铺相关方法", "true"));
        }
        return false;
    }

    public static boolean c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c924658", new Object[0])).booleanValue();
        }
        return d3();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04ca84", new Object[0])).booleanValue();
        }
        return qvs.i();
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b636a5af", new Object[0])).booleanValue();
        }
        return d4s.e("enableHighlightIntelligencePlay", true);
    }

    public static boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bf2ef8", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePrePlayDestroyOpt", "true"));
    }

    public static List<String> d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b16db268", new Object[0]);
        }
        if (n == null) {
            n = Z2(i9l.b("tblive", "addItemIdLiveSourceFilter", "mainsearchlive;mainsearchpicture.feeds"));
        }
        return n;
    }

    public static final boolean d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3b1a36", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "useNewNativeGoodList2", "true")) && !K2();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a34acb2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "disableRealControllerOnKeyDownWhenBackLive", "true"));
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("165246c8", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableHighlightKeyPointId", "true"));
    }

    public static boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f5c804a", new Object[0])).booleanValue();
        }
        return hjr.E("enablePreReleasePlayerWhenUpdown", true);
    }

    public static int e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de64f0ba", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "LiveRoomAlimamaExpTime", "0"));
    }

    public static boolean e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3c02547", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "useRefreshForH5EmbedView", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9837bb3d", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "disableOnKeyDownWhenMoreLiveShow", "true"));
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68ca3d2", new Object[0])).booleanValue();
        }
        return d4s.e("enableHorizontalReplayUseTextureView", true);
    }

    public static boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe3de5b3", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePreRequestPrePlay1", "true"));
    }

    public static int f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9db42f74", new Object[0])).intValue();
        }
        if (o == -1 && v2s.o().p() != null) {
            o = yqq.l(v2s.o().p().b("tblive", "getAutoSlideTimeS", "5"), 5);
        }
        return o;
    }

    public static boolean f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a371fb5", new Object[0])).booleanValue();
        }
        return d4s.e("enableMtopTimeMovingUrlOpt", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1db89d", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enable302", "true"));
        }
        return false;
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49974e29", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "huanduanParamsLivedetail", "true"));
    }

    public static boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8582025e", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enablePrecisionSeek", "true"));
    }

    public static boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdc6976", new Object[0])).booleanValue();
        }
        return d4s.e("enableFixTimeMove2ReplayPlayError", true);
    }

    public static boolean g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b5a7afd", new Object[0])).booleanValue();
        }
        return d4s.e("enableScrollEnabledBugfix", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a0002e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableADPayFromUrl", "false"));
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee70f11b", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableInsideDetail2", "false"));
        }
        return false;
    }

    public static boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe7e5b9", new Object[0])).booleanValue();
        }
        return d4s.e("enablePushControlInfo", true);
    }

    public static String h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd9f51a", new Object[0]);
        }
        return v2s.o().p().b("tblive", "OpenDetailIconUrl", "https://img.alicdn.com/imgextra/i1/O1CN01VMlQ7m1vNKj6xUWCA_!!6000000006160-54-tps-64-64.apng");
    }

    public static boolean h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7919b2aa", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cd82441", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableAPMCustomData", "true"));
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b719187", new Object[0])).booleanValue();
        }
        return k0() && d4s.e("kmpLiveDetailRequestEnable", true);
    }

    public static boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa3d765", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableQueryReplayTimeMoveCardV2", "true"));
    }

    public static boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25e92be", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "EnableBackToLiveForTimeShift1", "true"));
    }

    public static boolean i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5884454", new Object[0])).booleanValue();
        }
        return d4s.e("enableLivePlayerRestDataSource", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a23a1f4", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableAddSpmUrlInGetLiveRoomInfo", "true"));
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37f9c65a", new Object[0])).booleanValue();
        }
        if (!i0() || !qvs.u() || !d4s.e("kmpLiveRoomPowerMsgEnable2", false)) {
            return false;
        }
        return d4s.c("EnableLiveRoomPowerMsg", "enbale", false);
    }

    public static boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2ab5302", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableQueryReplayTimeMoveCardShow", "true"));
    }

    public static boolean j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("848d8bd8", new Object[0])).booleanValue();
        }
        return qvs.v0();
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84db1457", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableAdjustBBConnectionVideoSize", "true"));
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b723c0b6", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableKMPMasterSwitch", false)) {
            return false;
        }
        return d4s.e("EnableKMPOpenArch5", false);
    }

    public static boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6866897", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableRefreshImageUrl", "true"));
    }

    public static String k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("266f4d47", new Object[0]);
        }
        return v2s.o().p().b("tblive", "fandomLiveShareTips", "蹲点%s的宝宝圈，主播宠粉互动，还有精彩福利剧透等你来！");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d9d7bf", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableAlimamaAdMonitor", "true"));
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ad36851", new Object[0])).booleanValue();
        }
        return v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableKandianAlive", "true"));
    }

    public static boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae93bf1", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableRefreshOfficialUrlListV2", "true"));
    }

    public static int l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e065ce4c", new Object[0])).intValue();
        }
        if (f == -1 && v2s.o().p() != null) {
            f = yqq.l(v2s.o().p().b("tblive", "getKeepMuteTimeS", "15"), 15);
        }
        return f;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e214eb33", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableAlimamaQzt", "true"));
        }
        return false;
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11852028", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().c().b("taolive", "enableKandianJump4Mix", "enable", "true"));
        }
        return true;
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e2af98b", new Object[0])).booleanValue();
        }
        return d4s.e("enableRegisterAppBackgroundListenerInStandardPlayer", true);
    }

    public static int m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("557efaa9", new Object[0])).intValue();
        }
        if (g == -1 && v2s.o().p() != null) {
            g = yqq.l(v2s.o().p().b("tblive", "getKeepRTimeS", "3"), 3);
        }
        return g;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f340bbb8", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableAlimamaTrackFix", "true"));
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ed33e03", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableKandianRefreshUrlEnterFix", "true"));
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3df51640", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableReplayPlayOpt", "true"));
    }

    public static String n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611d253e", new Object[0]);
        }
        return v2s.o().p().b("tblive", "LiveDegradeInfoH5Url", "http://huodong.m.taobao.com/act/9rumcu.html");
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cce52f3", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableAutoRecommend2", "true"));
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f8ad42", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableKandianUpdownABTestNew", "true"));
        }
        return false;
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e0250e4", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableResumeAndPauseWarmTask", "true"));
    }

    public static int o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fea907f", new Object[0])).intValue();
        }
        if (v2s.o().p() == null) {
            return 5;
        }
        return yqq.o(v2s.o().p().b("tblive", "getLiveRoomWarmDelayTimeMS", "1500"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f36f1ca0", new Object[0])).booleanValue();
        }
        return d4s.e("enableBackToLiveUrlSMLBugFix", true);
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a792776d", new Object[0])).booleanValue();
        }
        return d4s.e("enableKeepMuteManagerFrameReady", true);
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26b9ecb4", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableRightTopCloseClickFix", "true"));
        }
        return true;
    }

    public static String p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5f238dc", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "getNetWorkCoverImageSize", "_600x600q75b40.jpg");
        }
        return "_600x600q75b40.jpg";
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48a000c1", new Object[0])).booleanValue();
        }
        return d4s.e("enableBackupStartOpt", true);
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa10345", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLandscapeInputFrameFix", "true"));
    }

    public static boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e768a94b", new Object[0])).booleanValue();
        }
        return d4s.e("enableSMLGenerateLiveContextKey", true);
    }

    public static String q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c270fe5", new Object[]{str});
        }
        return v2s.o().p() != null ? v2s.o().p().b("tblive", "officialLiveUTList", str) : str;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc3c889", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableBottomShareErrorFix", "true"));
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29192df", new Object[0])).booleanValue();
        }
        if (m == -1 && v2s.o().p() != null) {
            m = yqq.h(v2s.o().p().b("tblive", "enableLeftRightSwitchEvent", "true")) ? 1 : 0;
        }
        return m == 1;
    }

    public static boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9aed9f1", new Object[0])).booleanValue();
        }
        return yqq.h(i9l.b("tblive", "enableShopCardShow", "true"));
    }

    public static long r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ce65f3", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "playPrecisionSeekStep", "8"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82aecc2a", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableBottomSlideNewGuide", "true"));
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c90d20fc", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLifeCycleTrackFix", "true"));
    }

    public static boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e64cfd80", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableSoftInputLeakFix", "true"));
    }

    public static long s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d0a0520", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "playSpeedGuideShowPosition", "10"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6efeaaa", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableBugFixTab3Good", "true"));
        }
        return true;
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0b6eef", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLifecycleTrack", "true"));
    }

    public static boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d9374d", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableSpecialLive", "true"));
        }
        return false;
    }

    public static int t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49ae2ad3", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "preLoadRecCountForNewController", "2"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19663561", new Object[0])).booleanValue();
        }
        return qvs.d0() && yqq.h(v2s.o().p().b("tblive", "enableCPUAdeMonBootsCpu", "false"));
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2c613c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "EnableLinkLiveSEIDetect", "true"));
    }

    public static boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a574f79b", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableSpecialLive4TimeMove", "true"));
        }
        return false;
    }

    public static String u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87cbbcc8", new Object[0]);
        }
        return v2s.o().p().b("tblive", "getRedPacketRainAliveId", "1774");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5dd586", new Object[0])).booleanValue();
        }
        return d4s.e("enableCacheEntryQueryParams", true);
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b9372e", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enableLiveAndHomeMixOrange", "true"));
        }
        return false;
    }

    public static boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20d4488d", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() != null) {
            return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableSpmUrl", "true"));
        }
        return true;
    }

    public static String v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14de6829", new Object[0]);
        }
        return v2s.o().p().b("tblive", "getRedPacketRainBgImageUrl", "https://gw.alicdn.com/imgextra/i1/O1CN01WHq5n71zhGTTtxyK2_!!6000000006745-54-tps-227-410.apng");
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328bad77", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableCannotNotifyWhileLayout", "true"));
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9f731", new Object[0])).booleanValue();
        }
        if (v2s.o().c() != null) {
            return yqq.h(v2s.o().p().b("tblive", "enableLiveNewErrorPage", "true"));
        }
        return true;
    }

    public static boolean w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82fba9f7", new Object[0])).booleanValue();
        }
        return d4s.e("enableStandardDeleteDestroyVideo", true);
    }

    public static String w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a9f635", new Object[0]);
        }
        return v2s.o().p().b("tblive", "getRedPacketRainIconImageUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01mVFuQZ1MpGNCT8h5U_!!6000000001483-2-tps-190-68.png");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50ad19f5", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().getStringSharedPreference("tblive", "enableCheckDisplayCutoutBugfix", "true"));
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20a0154f", new Object[0])).booleanValue();
        }
        return d4s.e("enableLivePunish", true);
    }

    public static boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb9b54f", new Object[0])).booleanValue();
        }
        return d4s.e("enableStandardInitiativeMiniPlayerV2", true);
    }

    public static String x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5a0898", new Object[0]);
        }
        return qvs.D0();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7408c175", new Object[0])).booleanValue();
        }
        if (b == -1 && v2s.o().p() != null) {
            b = yqq.h(v2s.o().p().b("tblive", "enableCheckUrl", "true")) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd048f3", new Object[0])).booleanValue();
        }
        if (!x0() || !d4s.e("enableLivePunishResetPlayerController", true)) {
            return false;
        }
        return true;
    }

    public static boolean y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c4cace", new Object[0])).booleanValue();
        }
        return d4s.e("enableStandardScreenAdapter", true);
    }

    public static int y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b2ba58f", new Object[0])).intValue();
        }
        if (v2s.o().p() == null) {
            return 3;
        }
        return yqq.o(v2s.o().p().b("tblive", "getSwitchTipTimeS", "5"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be9f61e", new Object[0])).booleanValue();
        }
        if (v2s.o().p() == null) {
            return false;
        }
        return yqq.h(v2s.o().p().b("tblive", "enableClearMediaInfoWhenUpdownSwitch", "true"));
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ca59ba", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "EnableLiveRoomAlimamaAdTransParams", "true"));
    }

    public static boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb9cfc41", new Object[0])).booleanValue();
        }
        return d4s.e("enableStandardWeexVideoController", true);
    }

    public static int z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd252ca8", new Object[0])).intValue();
        }
        return yqq.o(v2s.o().p().b("tblive", "TBTVSwitchIdDelay", "10"));
    }

    public static String C2(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f03f812", new Object[]{context});
        }
        if (PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0) == 1) {
            str = "https://market.wapa.taobao.com/app/mtb/app-live-anchor-growth/pages/PullList";
        } else {
            str = "https://market.m.taobao.com/app/mtb/app-live-anchor-growth/pages/PullList";
        }
        return v2s.o().p().b("tblive", "TobeCastUrl", str);
    }
}
