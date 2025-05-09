package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15922a;

    static {
        t2o.a(468714606);
        f15922a = "AB_fullscreenpage_android.lowdeviceopt.";
        if (akt.p2("ShortVideo.quickOpenOPTUseNewAB", true)) {
            f15922a = "AB_fullscreenpage_android.QuickOpenOpt.";
        }
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d6397d3", new Object[0])).booleanValue();
        }
        return h("forbidUpgradeExposedCard", false);
    }

    public static float B(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8e59afa", new Object[]{str, new Float(f)})).floatValue();
        }
        IRemoteConfigAdapter remoteConfigAdapter = FluidSDK.getRemoteConfigAdapter();
        return nwv.q(remoteConfigAdapter.getABTestStringConfig(f15922a + str, String.valueOf(f)), f);
    }

    public static int C(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daf0150d", new Object[]{str, new Integer(i)})).intValue();
        }
        IRemoteConfigAdapter remoteConfigAdapter = FluidSDK.getRemoteConfigAdapter();
        return nwv.t(remoteConfigAdapter.getABTestStringConfig(f15922a + str, String.valueOf(i)), i);
    }

    public static float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e0f6aed", new Object[0])).floatValue();
        }
        return B("downdrageNoUseCacheRatio", -1.0f);
    }

    public static double E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffb27d66", new Object[0])).doubleValue();
        }
        return B("mockDWCostTimeAlpha", 0.4f);
    }

    public static double F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdafecbe", new Object[0])).doubleValue();
        }
        return B("mockDWCostTimeBelta", 400.0f);
    }

    public static double G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46762cef", new Object[0])).doubleValue();
        }
        return C("mockDWCostTimeMaxValue", 1000);
    }

    public static int H() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b584e078", new Object[0])).intValue();
        }
        if (vr9.c()) {
            i = 15000;
        }
        return C("mockDWCostTimeThreshold", i);
    }

    public static int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9da1fe9c", new Object[0])).intValue();
        }
        return C(RemoteMessageConst.TTL, -1);
    }

    public static int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754c81f8", new Object[0])).intValue();
        }
        return C("preloadSizeInPath", 0);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d9421f", new Object[0])).booleanValue();
        }
        return h("onlyCacheTab3", false);
    }

    public static int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60ed140f", new Object[0])).intValue();
        }
        return C("preloadThresholdAtLowDevice", 0);
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf87cf5", new Object[0])).booleanValue();
        }
        return h("rollBackToSingleDetailCache", false);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c666e4f", new Object[0])).booleanValue();
        }
        return h("rollbackToNoP2ffAddView", false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2a289ed", new Object[0])).booleanValue();
        }
        return h("disableCacheVideoForScheduleMsg", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f53c4f2", new Object[0])).booleanValue();
        }
        return h("disableLoadRemoteAtWarmup", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f0dfbd", new Object[0])).booleanValue();
        }
        return h("enableAvoidPlayerCacheServer", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be14880c", new Object[0])).booleanValue();
        }
        return h("changeExposedCardPriority", false);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cba4d7ab", new Object[0])).booleanValue();
        }
        return h("loadCacheAsyncEarly", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e476444", new Object[0])).booleanValue();
        }
        return h("loadPlayerEarly", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5b1ee5", new Object[0])).booleanValue();
        }
        if (vr9.c() || h("enableMockDWCostTime", false)) {
            return true;
        }
        return false;
    }

    public static boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51797101", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return lwl.d(f15922a + str, z);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00e5c88", new Object[0])).booleanValue();
        }
        return h("pickNewestDetail", false);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65b62eed", new Object[0])).booleanValue();
        }
        return h("enablePlayerCachePriority", false);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe0abc29", new Object[0])).booleanValue();
        }
        return h("enablePlayerOptHitCache", false);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a8f17d3", new Object[0])).booleanValue();
        }
        return h("playerSetupDecoderOPT", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e84720", new Object[0])).booleanValue();
        }
        return h("enablePlayerUseMediaInfoLength", true);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a66fec2b", new Object[0])).booleanValue();
        }
        return h("enablePlayerUseRealVideoLength", false);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e399930a", new Object[0])).booleanValue();
        }
        return h("predownloadToCache", true);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a70160da", new Object[0])).booleanValue();
        }
        return h("preloadAfterExpired", true);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39019c2", new Object[0])).booleanValue();
        }
        return h("enablePreloadQueueDepthForRealDownload", true);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbede62a", new Object[0])).booleanValue();
        }
        return h("saveCacheDynamicRecommend", true);
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e44bdc", new Object[0])).booleanValue();
        }
        return h("saveDownloadErrorState", true);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8126070", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ac435a4", new Object[0])).booleanValue();
        }
        return !h("recoverCacheSaveGet10_40_0", false);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c864b1", new Object[0])).booleanValue();
        }
        return h("videoCacheFirst", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a15e72ac", new Object[0])).booleanValue();
        }
        return h("warmUpPlayerCacheServer", true);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b4b2a2b", new Object[0])).booleanValue();
        }
        return h("warmUpPlayerSo", true);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4075c05e", new Object[0])).booleanValue();
        }
        return h("warmupNewUIConfig", true);
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d957e16", new Object[0])).booleanValue();
        }
        return h("exposedataNotDownlload", true);
    }
}
