package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import mtopsdk.mtop.domain.EnvModeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yga {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GL = "goodlist";

    /* renamed from: a  reason: collision with root package name */
    public static String f32075a = null;

    static {
        t2o.a(295699253);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a62607c4", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enableGLPcgRec", "true"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efc4bcc9", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enablePcgShowCase", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31738f92", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePreSale", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971e3f8a", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableUrgeReceivePrivilege", true);
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b845e33", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableRecCardShowWhenIdle", true);
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4765449", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableRefreshTopOperateViewStatus", true);
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931f16e3", new Object[0])).booleanValue();
        }
        return zqq.c(i9l.b("goodlist", "enableSabAtmosphereThreshold", "true"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f5b1b67", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableSearchUIOptimize", true);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba10071c", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableShowGoodTopOperateView", true);
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b099a4", new Object[0])).booleanValue();
        }
        if (vvs.b("goodlist", "showGoodsItemCardQueryData", true)) {
            String X = X("showGoodsItemCardQueryDataV2", "enable", "false");
            hha.b("GoodsListConfig", "showGoodsItemCardQueryData | orange=true ab=" + X);
            return zqq.d(X, false);
        }
        hha.b("GoodsListConfig", "showGoodsItemCardQueryData | result=false");
        return false;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fd46d9c", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enableShowGoodsSearchItem", "true"));
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc4ce592", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "showcaseAuctionExclude", "true"));
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da798d35", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "showcaseRefFix", Boolean.TRUE).booleanValue();
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c0b12", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableSimpleRight", "true"));
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f4d368", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableTcpJumpTarget", Boolean.TRUE).booleanValue();
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("990273bc", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "templateOutSet", "true"));
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("662f17b3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTimingUp", "true"));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("452f660", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableTryRequestCategory", true);
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae219d80", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableAppearTryRequestGoodsList", true);
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8825b079", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableAppearTryRequestRight", true);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad092591", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableTryRequestTopOperate", true);
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c074966", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTwoButton", "true"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9be1957d", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableUndertakeEnhance", true);
    }

    public static String X(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f12bc262", new Object[]{str, str2, str3});
        }
        return v2s.o().c() != null ? v2s.o().c().b("taolive", str, str2, str3) : str3;
    }

    public static int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7bacc12", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("goodlist", "enableMultiGiftActivity", "1"), 1);
    }

    public static int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b3b6854", new Object[0])).intValue();
        }
        return zqq.j(i9l.b("goodlist", "goodsIconAnimDaysLimit", "7"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faa9856e", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "couponUseServerToast", "true"));
    }

    public static int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82e7838d", new Object[0])).intValue();
        }
        return zqq.j(i9l.b("goodlist", "goodsIconAnimLoopInterval", "10"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77789ba8", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGoodsNumberBrokenCompensate", "true"));
    }

    public static String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd8c98a", new Object[0]);
        }
        return i9l.b("goodlist", "goodslistPromptAnimationUrls", "{\"normal\":\"https://gw.alicdn.com/imgextra/i4/O1CN01p9RQWd1VtEKTU8dQ4_!!6000000002710-54-tps-159-150.apng\",\"show\":\"https://gw.alicdn.com/imgextra/i4/O1CN01srX6dm1CjAvw0AspV_!!6000000000116-54-tps-159-150.apng\",\"hide\":\"https://gw.alicdn.com/imgextra/i3/O1CN01yHqQ3R1IXcdTm4LJx_!!6000000000903-54-tps-159-150.apng\"}");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60069f50", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "destroyRemoveGLView", Boolean.TRUE).booleanValue();
    }

    public static String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aefd4a25", new Object[0]);
        }
        return v2s.o().p().b("goodlist", "goodsListSearchMoreURLPrefixNew", f0());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3188282", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enableFirstDetailStash", "true"));
    }

    public static int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a53a59c2", new Object[0])).intValue();
        }
        return zqq.j(i9l.b("goodlist", "enableGoodsLPM", "1"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd494dc", new Object[0])).booleanValue();
        }
        return vvs.b("taolive", "enableForbidGoodsCardAtmosphere", true);
    }

    public static long e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("106d19b2", new Object[0])).longValue();
        }
        if (f32075a == null) {
            f32075a = X("goodsPreRequestDelay", "delaytime", "0");
        }
        return zqq.h(f32075a);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8016c78", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableGLAssetsConfig", Boolean.TRUE).booleanValue();
    }

    public static String f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b3655", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvModeEnum.PREPARE.getEnvMode()) {
            return OrangeConfig.getInstance().getConfig("tblive", "H5SearchPreUrl", "https://pre-pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&disableNav=YES");
        }
        return OrangeConfig.getInstance().getConfig("tblive", "H5SearchUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb518436", new Object[0])).booleanValue();
        }
        if (!i9l.a("goodlist", "enableGLCoordinatorOpt", Boolean.TRUE).booleanValue() || pfa.D()) {
            return false;
        }
        return true;
    }

    public static String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("446d6749", new Object[0]);
        }
        return v2s.o().p().b("tblive", "highAtmosphereBgUrl", "https://gw.alicdn.com/imgextra/i1/O1CN01w7663f1N9s8uTgTYT_!!6000000001528-2-tps-280-160.png");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5ff18c3", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableSpeakingCheckLastTimePoint", Boolean.TRUE).booleanValue();
    }

    public static String h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae1e4fd", new Object[0]);
        }
        return v2s.o().p().b("tblive", "highAtmosphereIconUrl", "https://gw.alicdn.com/imgextra/i4/O1CN0130TbN31tk7Bl63g4W_!!6000000005939-2-tps-198-114.png");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75d238bf", new Object[0])).booleanValue();
        }
        if (!k() || e0() <= 0) {
            return false;
        }
        return true;
    }

    public static String i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f8deba3", new Object[0]);
        }
        return v2s.o().p().b("tblive", "hotAtmosphereLottieUrl", "https://g.alicdn.com/ani-assets/4e567184a6ffee05bf46b0a79583a9ac/0.0.1/lottie.json");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365c7b4c", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("goodlist", "enableLVPreload", "true"));
    }

    public static String j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3df56a4f", new Object[0]);
        }
        return v2s.o().p().b("tblive", "lowAtmosphereBgUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01FihN3c1lT9azsqg2W_!!6000000004819-54-tps-350-64.apng");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dbe9d13", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableGLShowPerformanceOpt", Boolean.TRUE).booleanValue();
    }

    public static String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32753e83", new Object[0]);
        }
        return v2s.o().p().b("tblive", "lowAtmosphereIconUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01qEjFgd1TEo6YAQWoD_!!6000000002351-2-tps-95-49.png");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71b51b43", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableGoodListTopRight88vip", Boolean.TRUE).booleanValue();
    }

    public static String l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ebe722d", new Object[0]);
        }
        return i9l.b("goodlist", "newStyleGoodsIconUrls", "{\"static\":\"https://gw.alicdn.com/imgextra/i2/O1CN01Z89O9W1lqVsuDMSdr_!!6000000004870-2-tps-159-150.png\",\"animations\":{\"normal\":\"https://gw.alicdn.com/imgextra/i3/O1CN01j0NM821T4H5Yey988_!!6000000002328-54-tps-159-150.apng\",\"show\":\"https://gw.alicdn.com/imgextra/i3/O1CN01cJHaBG27vTjB889Ci_!!6000000007859-54-tps-159-150.apng\",\"hide\":\"https://gw.alicdn.com/imgextra/i1/O1CN01LeCIxN24rrkybHXRg_!!6000000007445-54-tps-159-150.apng\"}}");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d934df22", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "searchGoodsEntranceEnabled", "true"));
    }

    public static String m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e011e69", new Object[0]);
        }
        return v2s.o().p().b("tblive", "showcaseTime", "");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb8a504", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "searchHistoryEnabled", "true"));
    }

    public static int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("973b0cae", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("tblive", "triggerMayClickMaxIndex", "1000"), 1000);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8f278b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHiglightInsideDetail1", "true"));
    }

    public static int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b72fe95", new Object[0])).intValue();
        }
        try {
            zqq.j(v2s.o().p().b("tblive", "nativeShopVipTryTimes", "1"));
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf8f6a0c", new Object[0])).booleanValue();
        }
        return vvs.b("taolive", "enableInterceptGoodsCardClick", true);
    }

    public static int p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("786d3af1", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("tblive", "triggerScrollDuration", "1000"), 1000);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89086fa3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableAggregationComponent", "true"));
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0dac39e", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enableSpeakingGoodsAfterShowcase", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f60859b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enableItemGroupTake", "true"));
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d26214fe", new Object[0])).booleanValue();
        }
        if (vvs.b("goodlist", "supportClientDefaultCategoryIds", true)) {
            String X = X("supportClientDefaultCategoryIds", "enable", "false");
            hha.b("GoodsListConfig", "supportClientDefaultCategoryIds | orange=true ab=" + X);
            return zqq.d(X, false);
        }
        hha.b("GoodsListConfig", "supportClientDefaultCategoryIds | result=false");
        return false;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bde50bf", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableLandScopeShowGoodTopOperateView", false);
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ea532d6", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "supportDefaultCategoryId", true);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3475b088", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enablePreheatButton", "true"));
    }

    public static int t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7e4af7d", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("tblive", "triggerClickDuration", "1000"), 1000);
    }

    public static long u0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6e631a0", new Object[]{new Long(j)})).longValue();
        }
        return vvs.g("goodlist", "xinrenTabTimeLimit", j);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f202e29", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "goodLiveIdCheck", "true"));
    }

    public static int v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98b5c587", new Object[0])).intValue();
        }
        return zqq.g(i9l.b("goodlist", "zhuahongbaoDelay", "300"), 300);
    }

    public static Boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("25de8ff6", new Object[0]);
        }
        return Boolean.valueOf(zqq.c(v2s.o().p().b("tblive", "enableNewHotAtmosphere", "true")));
    }

    public static String w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82c4bb68", new Object[0]);
        }
        return vvs.i("goodlist", "goodslistRedPacketToastInfo", "{\"leftIconImageViewUrl\": \"https://gw.alicdn.com/imgextra/i4/O1CN015pshdw1bMbobMIfOY_!!6000000003451-2-tps-108-114.png\",\"rightArrowImageViewUrl\":\"https://gw.alicdn.com/imgextra/i1/O1CN01WvKjy61h0410OPOAo_!!6000000004214-2-tps-42-38.png\",\"tieleText\":\"下滑找红包 最多3个\",\"showTime\": \"3\"}");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ca30fd7", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enableNewtonParamsBetter", false);
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dddb165", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableHotAtomFix", Boolean.TRUE).booleanValue();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a18ff546", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "enablePMMergeOptShowcase", true);
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b661642", new Object[0])).booleanValue();
        }
        return i9l.a("goodlist", "enableSecKillQueryOpt", Boolean.TRUE).booleanValue();
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7cf727", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("goodlist", "enablePcgRecCarouselShow", "true"));
    }

    public static boolean u(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e70207f4", new Object[]{jSONObject})).booleanValue();
        }
        boolean c = zqq.c(v2s.o().p().b("tblive", "goodAutoUpdate", "true"));
        boolean z = jSONObject != null && jSONObject.getBooleanValue("useItemCacheExpire");
        hha.c("GoodsListConfig", "enableListAutoUpdate | orange=" + c + "  serverValue=" + z);
        return c && z;
    }
}
