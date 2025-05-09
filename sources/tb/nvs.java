package tb;

import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import mtopsdk.mtop.domain.EnvModeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378912);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b851c8dd", new Object[0])).booleanValue();
        }
        return j0("enableGetTabsSyncLowLevelDevice0918", "true");
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d98a9df", new Object[0])).booleanValue();
        }
        return j0("enableHncccRefreshUpdateAlpha", "false");
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da6a6fc", new Object[0])).booleanValue();
        }
        return j0("enableHomeTabClickedReturnTop", "true");
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a26f57", new Object[0])).booleanValue();
        }
        return j0("channelHomeTabClickedToRefreshData", "true");
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238ef15c", new Object[0])).booleanValue();
        }
        return j0("enableImagePreload", "true");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d572bbf", new Object[0])).booleanValue();
        }
        return j0("enableJellyMarqueeScroll", "false");
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a54a0daa", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableLiveBackInsertCardNew", "true"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d316a4e", new Object[0])).booleanValue();
        }
        return j0("enableMarkingTab", "true");
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46b417af", new Object[0])).booleanValue();
        }
        return j0("enableNeedShowNodeWhenLiveStart", "true");
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a04de0a", new Object[0])).booleanValue();
        }
        return j0("enableNetworkListener", "true");
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adff12b1", new Object[0])).booleanValue();
        }
        return j0("enableTaoLiveHomeNewChannel", "true");
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("655dd44c", new Object[0])).booleanValue();
        }
        return j0("enableNewChannelPerformanceTrack", "true");
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d44813", new Object[0])).booleanValue();
        }
        return j0("enableNewLiveStyle", "true");
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e832ab8e", new Object[0])).booleanValue();
        }
        return j0("enableOptimizeWriteCache0717", "true");
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db08bfd", new Object[0])).booleanValue();
        }
        return j0("enableRefreshBottomTab", "true");
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb6c97d0", new Object[0])).booleanValue();
        }
        return j0("enableScrollUpdateAlpha", "false");
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65aafb23", new Object[0])).booleanValue();
        }
        return j0("enableSearchTextBannerClickListener", "false");
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de8fe49", new Object[0])).booleanValue();
        }
        return j0("enableSelectRefreshToTop", "false");
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3728c11f", new Object[0])).booleanValue();
        }
        return j0("enableSmartLandingEntryFix", "true");
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3933652", new Object[0])).booleanValue();
        }
        return j0("enableSystemGesturesBottom", "true");
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f4de811", new Object[0])).booleanValue();
        }
        return j0("enableOptimize0731", "true");
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("133d40c8", new Object[0])).booleanValue();
        }
        return j0("enableTvCardLoadDefaultImg0808", "true");
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfd3d2e", new Object[0])).booleanValue();
        }
        return !qw0.a() && j0("enableWalle4Back", "true") && p0.e();
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c49de9", new Object[0])).booleanValue();
        }
        return j0("enableWhenNullClearImgJellyMarquee", "false");
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fd25549", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheDeleteHeadArea", "true");
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6eef34", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheDeleteHeadAreaMiddleDevice", "true");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d7e6b8", new Object[0])).booleanValue();
        }
        return j0("channelBackRequestSearch", "true");
    }

    public static int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40986aa9", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheFeedMaxCount", "12"));
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2203d94", new Object[0])).longValue();
        }
        long e = arq.e(OrangeConfig.getInstance().getConfig("tblive", "channelJellyMarqueeScrollInterval", IDecisionResult.ENGINE_ERROR));
        if (e <= 0) {
            return 5000L;
        }
        return e;
    }

    public static int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54aec7bd", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheFeedMaxCountNewChannelDouble", "8"));
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73e037f", new Object[0])).floatValue();
        }
        return arq.d(OrangeConfig.getInstance().getConfig("tblive", "channelRefreshIntervalWhenHomeTabClicked", "0.5"));
    }

    public static int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cb8bcb4", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheFeedMaxCountNewChannelSingle", "4"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("839ba091", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "closeDXEngineConfigFullTrace", "true"));
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c5d024", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheHeadAreaCutData", "true");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("730786fd", new Object[0])).booleanValue();
        }
        return j0("closeRequestSendSessionId", "false");
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85645e58", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheHeadAreaHighDeviceHide", "false");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9613e17c", new Object[0])).booleanValue();
        }
        return j0("enableABTestWhiteList", "true") || qw0.p();
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dcd2884", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheHeadAreaLowDeviceHide", "true");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4b98146", new Object[0])).booleanValue();
        }
        return j0("enableAddEntryLiveSource", "true");
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49e98c4b", new Object[0])).booleanValue();
        }
        return j0("enableWriteCacheHeadAreaMiddleDeviceHide", "true");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b0c8450", new Object[0])).booleanValue();
        }
        return j0("enableAddFollowRecentWatch", "true");
    }

    public static int h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1305541", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheTabAreaMaxCount", "5"));
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9839232f", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "enableAddH5Tab", "true");
    }

    public static int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("797f41ec", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "channelPlayScrollSpeedRatio", "50"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f2b727", new Object[0])).booleanValue();
        }
        return j0("enableAtmosphereBenefitData", "true");
    }

    public static boolean j0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5c95057", new Object[]{str, str2})).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", str, str2));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acb52e1", new Object[0])).booleanValue();
        }
        if (qw0.a()) {
            return j0("EnableLowDeviceAutoJellyMarquee", "false");
        }
        return true;
    }

    public static String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dab41a6e", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "homeSearchEntryTips", "输入要寻找的内容");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9326b62f", new Object[0])).booleanValue();
        }
        return j0("enableBottomTabSubscript", "true");
    }

    public static String l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78673109", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "disableSingleChannel", "subChannelFollow|12921001|12613001");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0199588", new Object[0])).booleanValue();
        }
        return j0("enableBxFeature", "false");
    }

    public static String m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b3655", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvModeEnum.PREPARE.getEnvMode()) {
            return OrangeConfig.getInstance().getConfig("tblive", "H5SearchPreUrl", "https://pre-pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true&status_bar_transparent=true&largescreenstyle=fullscreen&androidKeyboard=true");
        }
        return OrangeConfig.getInstance().getConfig("tblive", "H5SearchUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true&status_bar_transparent=true&largescreenstyle=fullscreen&androidKeyboard=true");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a44afc72", new Object[0])).booleanValue();
        }
        return j0("enableChannelFollowSearchBgUpdate", "true");
    }

    public static int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580aaf1", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "getNewChannelMaxExposeNum0221", "50"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ddc594a", new Object[0])).booleanValue();
        }
        return j0("enableChannelMiddleDevicePlay", "true");
    }

    public static String o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98955674", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "padOrFoldDevicePlayABValue", "scroll");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bd34e5a", new Object[0])).booleanValue();
        }
        return j0("enableChannelPlayABType", "true");
    }

    public static int p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36ea668d", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "tbLiveNewChannelSingleVideoPlayMaxNum", "1"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c27078", new Object[0])).booleanValue();
        }
        return j0("enableCheckAppCompatActivity", "false");
    }

    public static String q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c82a3a5", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "tblHomeImageViewUserIds", "tbliveimageview_0,tbliveimageview_1,userHeaderImage,tbliveimageview_normal_0,tbliveimageview_normal_1,tbliveimageview_normal_2,tblivevideoimageview,tbliveimageview_normal,tbliveimageview_pad,tblHomePageItemPicImg_normal,tblHomePageItemPicImg_atmosphere,tblHomePageItemPicImg_normal,tblHomePageFlowPicImg");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9dc19b", new Object[0])).booleanValue();
        }
        if (qw0.a()) {
            return j0("enableClickResponseTimeOptimize", "true");
        }
        return false;
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f6acc3", new Object[0])).booleanValue();
        }
        return j0("enableDiscoverRecentWatchCard", "true");
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6feed6a5", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT != 28 || !zg5.A3()) {
            return j0("enableDXBatchPreFetchNew", "false");
        }
        return false;
    }

    public static int s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdf8d451", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "tbLiveNewChannelVideoPlayDelayTime", "500"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fad56ea", new Object[0])).booleanValue();
        }
        return j0("enableDXContainerPreLoad", "true");
    }

    public static int t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d771d", new Object[0])).intValue();
        }
        return arq.f(OrangeConfig.getInstance().getConfig("tblive", "walle4BackTime", "300"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba496ea", new Object[0])).booleanValue();
        }
        return j0("enableDXEngineConfigImageQuality", "true");
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a413b89c", new Object[0])).booleanValue();
        }
        return j0("searchParamsWithOutUtLogMap", "false");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("830b3d1", new Object[0])).booleanValue();
        }
        return j0("enableDelayWriteImageCache", "true");
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e97a4667", new Object[0])).booleanValue();
        }
        return j0("enableNewSmartCard", "true");
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41b49671", new Object[0])).booleanValue();
        }
        return j0("enableFistPageOffsetReset", "true");
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f522c54a", new Object[0])).booleanValue();
        }
        return j0("enableNewSmartCardCatch", "true");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b3ddae", new Object[0])).booleanValue();
        }
        return j0("enableFlexibleLayoutInflater", "false");
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df94fafe", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableFollowRefreshToTop", "false"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f967bf", new Object[0])).booleanValue();
        }
        return j0("enableGetTabsMiddleLevelDevice", "true");
    }
}
