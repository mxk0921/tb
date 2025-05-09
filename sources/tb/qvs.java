package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qvs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static Set<Integer> d = null;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static long k = 0;
    public static long l = 0;
    public static long m = 0;
    public static final String newKandian = "newKandian";
    public static final String newKandian_guakao_liyidian = "newKandian_guakao_liyidian";
    public static final String newKandian_guakao_liyidian_jiegouhua = "newKandian_guakao_liyidian_jiegouhua";
    public static final String oldKandian = "oldKandian";

    /* renamed from: a  reason: collision with root package name */
    public static int f26961a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int n = -1;
    public static int o = -1;
    public static long p = -1;
    public static long q = -1;
    public static int r = -1;
    public static int s = -1;

    static {
        t2o.a(806356498);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aee97ac", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "goodListAnchorEnabled", true);
    }

    public static int A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d409aa9", new Object[0])).intValue();
        }
        if (b == -1) {
            b = vvs.e("tblive", "getLottieOptFrameRate", 5);
        }
        return b;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5df886a8", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableGotoDetailRemote", Boolean.TRUE).booleanValue();
    }

    public static int B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("693a7e95", new Object[0])).intValue();
        }
        if (c == -1) {
            c = vvs.e("tblive", "getLottieOptFrameStep", 2);
        }
        return c;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b4fd62", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableH5ContainerScrollFix", true);
    }

    public static String C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bce1bd63", new Object[0]);
        }
        return vvs.i("tblive", "needRecommendDetailServerApi", "mtop.tblive.live.recommend.home");
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d30215", new Object[0])).booleanValue();
        }
        try {
            return zqq.c(OrangeConfig.getInstance().getConfig("tblive", "enableInitialCompensationTLiveAdapter2", "true"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5a0898", new Object[0]);
        }
        return vvs.i("tblive", "liveShareTips", "");
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74dfd866", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableGoodsJSBridgeRemote", Boolean.TRUE).booleanValue();
    }

    public static String E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc5d78a5", new Object[0]);
        }
        return vvs.i("tblive", "ShopEmbedLiveSource", "shop_card2021");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e91a6abb", new Object[0])).booleanValue();
        }
        if (o == -1) {
            if (uvs.b("tblive", "enableLiveDetailMessInfoMultiCaseOpt", "enable", true)) {
                o = 1;
            } else {
                o = 0;
            }
            if (iw0.i()) {
                if (o == 1) {
                    o3s.b("FrameContext", "命中直播间额外接口多实例");
                } else {
                    o3s.b("FrameContext", "未命中直播间额外接口多实例");
                }
            }
        }
        return o == 1;
    }

    public static int F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69805e53", new Object[0])).intValue();
        }
        return vvs.e("tblive", "slidingValue", 200);
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d77f07", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableLiveIsAD", Boolean.TRUE).booleanValue();
    }

    public static long G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("340db1bf", new Object[0])).longValue();
        }
        return vvs.g("tblive", "getStreamSwitchDurationMs", 10000L);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7925ec", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableLiveRoomZoomFunc2", true);
    }

    public static long H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b85c0ac3", new Object[0])).longValue();
        }
        if (q == -1) {
            q = vvs.g("tblive", "getStrongMuteMarkLimit", 43200L);
        }
        return q;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcafd163", new Object[0])).booleanValue();
        }
        if (!J()) {
            return false;
        }
        return vvs.b("tblive", "moreLiveEntryEnable", true);
    }

    public static int I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aae5770c", new Object[0])).intValue();
        }
        return new Random(System.currentTimeMillis()).nextInt(vvs.e("tblive", "SwitchStreamRandomInterval", 5) * 1000);
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a74a4660", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableMoreLiveRightFrame", true);
    }

    public static int J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0c856e2", new Object[0])).intValue();
        }
        if (!P()) {
            return 0;
        }
        if (f26961a == -1) {
            f26961a = vvs.d("tblive", "getWarmMockMode");
        }
        return f26961a;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9573b7f", new Object[0])).booleanValue();
        }
        return d4s.e("enableMtopResponseReceiveResult", true);
    }

    public static void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ebc4a7", new Object[0]);
            return;
        }
        uvs.e("taolive", "TimeShiftFlattenAB", "ABType", oldKandian);
        uvs.a("taolive", "TimeShiftFlattenAB", "UseOldPlayer");
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa67b82", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableNewFromShop2FCheck", true);
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b6e58", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "small_window_switch", true);
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c996e2", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableNewSpm4Shop", true);
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8edfca", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "needHeartFandom", true);
    }

    public static boolean N(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d417221", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null || TextUtils.isEmpty(ext.timeMovingPlayInfo) || ((LiveItem.TimeMovingPlayInfo) JSON.parseObject(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null) {
            return false;
        }
        return true;
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ebfdee", new Object[0])).booleanValue();
        }
        return vvs.a("tblive", "needLiveDetailDegrade");
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85adf408", new Object[0])).booleanValue();
        }
        if (giv.c().b()) {
            return false;
        }
        return vvs.b("tblive", "enableNoticePauseFrameLock", true);
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a7555a6", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "needOpenCDNRetry", true);
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10bce9c7", new Object[0])).booleanValue();
        }
        return hjr.E("enableOpenWarmMock", false);
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("727c6eaf", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "miniLiveShouldSubPMMsg", true);
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14020532", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enablePMEXTParams", true);
    }

    public static String Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacb9037", new Object[0]);
        }
        return v2s.o().p().b("tblive", "preRequestRecommendBlackList", "search");
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbe4899", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "PerformanceLiveRoomStart", true);
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115ac77b", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "showNewBrandLive", true);
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a14410d0", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableTBLivePlayerErrorCodeReport", true);
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eedffb2", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "trackPMsg", true);
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bae40ce", new Object[0])).booleanValue();
        }
        return vvs.a("tblive", "EnableRegisterPM1");
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7012a4ce", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "unregisterPowerDispatch", true);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3116046d", new Object[0])).booleanValue();
        }
        return d4s.e("enableRequestCommonCommission", true);
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db9f31cd", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableChatRoom", true);
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36117063", new Object[0])).booleanValue();
        }
        return vvs.a("tblive", "enableSendUserAtmosphere2");
    }

    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e866c93", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "wholeDeviceLevelSwitchOpt", true) || xj7.a() == 2;
    }

    public static Set<Integer> W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("413c1f20", new Object[0]);
        }
        if (d == null) {
            d = new HashSet();
            for (String str : vvs.i("tblive", "enableSendUserAtmosphereMap", "10010;10055;10031;10033;10058").split(";")) {
                d.add(Integer.valueOf(zqq.j(str)));
            }
        }
        return d;
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd462917", new Object[0])).booleanValue();
        }
        return d4s.e("enableGenerateLiveContextKeyNew", true);
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbababd7", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableShopCardPMunified", true);
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("192c06fe", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae870eb6", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - m <= vvs.g("tblive", "enableShowQualitySwitchTipsLimit", 86400000L)) {
            return false;
        }
        m = System.currentTimeMillis();
        return true;
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2f99f6", new Object[0])).booleanValue();
        }
        if (d4s.e("enableSmallWindowSwitchOpt", true)) {
            return d4s.a("taolive", "EnableSmallWindowSwitchOpt", "enableSmallWindowSwitchOpt", false);
        }
        return false;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b8b8934", new Object[0])).longValue();
        }
        return vvs.g("tblive", "checkFloatWindowPermissonInterval", 360L);
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44a5ac1", new Object[0])).booleanValue();
        }
        return d4s.e("enableDestroyOffScreenVH", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a7cf99a", new Object[0])).booleanValue();
        }
        boolean a2 = vvs.a("tblive", "TBLIVE_ORANGE_ARTP_Enable_NewV2");
        if (!a2 || !e()) {
            return a2;
        }
        return false;
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f813083d", new Object[0])).booleanValue();
        }
        if (!f) {
            e = vvs.b("tblive", "enableStickerChat", true);
            f = true;
        }
        return e;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3acd08c6", new Object[0])).booleanValue();
        }
        if (iw0.i() && !TextUtils.isEmpty(iw0.d("enableBfrtc"))) {
            return true;
        }
        boolean a2 = vvs.a("tblive", "TBLIVE_ORANGE_BFRTC_Enable_V1");
        if (!a2 || !f()) {
            return a2;
        }
        return false;
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef49c364", new Object[0])).booleanValue();
        }
        if (s == -1) {
            if (!d4s.e("enableTBLiveRecEngineKMP3", true) || v2s.o().c() == null) {
                s = 0;
            } else {
                s = yqq.h(v2s.o().c().b("taolive", "TBLiveRecEngineV3", "enabled", "false")) ? 1 : 0;
            }
            StringBuilder sb = new StringBuilder("enableTBLiveRecEngineKMP 本次取值 = ");
            sb.append(s == 1);
            o3s.b("tblivesdk TaoLiveConfig", sb.toString());
        }
        return s == 1;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366b4096", new Object[0])).booleanValue();
        }
        if (iw0.i() && !TextUtils.isEmpty(iw0.d("enableRtcLive"))) {
            return true;
        }
        boolean b2 = vvs.b("tblive", "TBLIVE_ORANGE_RTCLIVE_Enable_V3", true);
        if (!b2 || !g()) {
            return b2;
        }
        return false;
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("446d5282", new Object[0])).booleanValue();
        }
        boolean b2 = vvs.b("tblive", "enableTaoliveUpDownSwitchOpt", true);
        boolean b3 = uvs.b("taolive", "enableTaoliveUpDownSwitchOptAB", "enableTaoliveUpDownSwitchOpt", true);
        o3s.b("TaoliveUpDownSwitchOpt", "orangeSwitch:" + b2 + "enableTaoliveUpDownSwitchOptAB:" + b3);
        return b2 && V0() && b3;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6965e5b8", new Object[0])).booleanValue();
        }
        String h2 = vvs.h("tblive", "ARTPDeviceBlackist");
        if (TextUtils.isEmpty(h2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = h2.split(";");
        if (split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1383b840", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableTrackPmGoodItem", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("718e4702", new Object[0])).booleanValue();
        }
        String i2 = vvs.i("tblive", "BFRTCDeviceBlackist", "");
        if (TextUtils.isEmpty(i2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = i2.split(";");
        if (split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7e3ccd", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableUniversalToastUIFix", Boolean.TRUE).booleanValue();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f518e72", new Object[0])).booleanValue();
        }
        String i2 = vvs.i("tblive", "RTCLIVEDeviceBlackist", "");
        if (TextUtils.isEmpty(i2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = i2.split(";");
        if (split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b32d780", new Object[0])).booleanValue();
        }
        return d4s.e("enableUpDownBizParamsKMP", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50702f51", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "defaultEnableBackgroundPlay", true);
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("182f5b9c", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableUpDownSwipeTrack", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04ca84", new Object[0])).booleanValue();
        }
        return vvs.a("tblive", "TBLiveDisableChangeLandscapeBtn");
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3292a80", new Object[0])).booleanValue();
        }
        return vvs.a("tblive", "enableUpdateNextPageClickId");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78761379", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableDXTemplateAsync", Boolean.TRUE).booleanValue();
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9675d4d1", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableUpdateNextPageRealProperties4Detail", true) && k0();
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa9c300e", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableAlimamaQztGoodClick", true);
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22feaf2", new Object[0])).booleanValue();
        }
        return uvs.b("taolive", "enableUpdateNextPageRealProperties4Detail", "enable", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40a71875", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - k <= vvs.g("tblive", "enableAskSwitchStreamLimit", 300000L)) {
            return false;
        }
        k = System.currentTimeMillis();
        return true;
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2a2dcf", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableUtparamUrl", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0902c3d", new Object[0])).booleanValue();
        }
        return d0() && vvs.b("tblive", "enableAsyncTaskSwitch", true);
    }

    public static List<String> m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aff58a68", new Object[0]);
        }
        String i2 = vvs.i("tblive", "eventCenterWhitelist", "TaoLiveController2,TaoLiveDXHomePage");
        if (!TextUtils.isEmpty(i2)) {
            return Arrays.asList(i2.split(","));
        }
        return null;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43529451", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - l <= vvs.g("tblive", "enableAutoSwitchStreamLimit", 60000L)) {
            return false;
        }
        l = System.currentTimeMillis();
        return true;
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29c4801", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "fetchCdnItem", true);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cceca7f0", new Object[0])).booleanValue();
        }
        return true;
    }

    public static int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2e1e04c", new Object[0])).intValue();
        }
        return vvs.e("tblive", "fetchItemInterval", 5) * 1000;
    }

    public static String p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8bce61d", new Object[0]);
        }
        return vvs.i("tblive", "BlackListRoomType", "[67108864,517,4096]");
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4f91e02", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableChatMessageQueueDropAddLog", Boolean.TRUE).booleanValue();
    }

    public static String q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bfa50a5", new Object[0]);
        }
        return vvs.i("tblive", "CDNDomainUrl", "http://live-spare.alicdn.com/mediaplatform/");
    }

    public static long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78c1f241", new Object[0])).longValue();
        }
        return vvs.f("tblive", "enableCommentReceiveUT");
    }

    public static String r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9074552b", new Object[0]);
        }
        return vvs.i("tblive", "fetchCdnMSG", "10015,10101");
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793dfed9", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableCommentUseLMSDK2", true) && uvs.b("taolive", "enableCommentUseLMSDK", "enable", true);
    }

    public static int s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7d16475", new Object[0])).intValue();
        }
        return vvs.e("tblive", "cdnQueueSize", 100);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef09a47a", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "componentDelayLoad", true) && uvs.b("tblive", "componentDelayLoad", "enable", true);
    }

    public static int t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44734914", new Object[0])).intValue();
        }
        return vvs.e("tblive", "chatMessageBufferSize", 100);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8883f060", new Object[0])).booleanValue();
        }
        if (r == -1) {
            if (!d4s.e("enableConsistentLifeCycle", true) || v2s.o().c() == null) {
                r = 0;
            } else {
                r = yqq.h(v2s.o().c().b("taolive", "ConsistentLifeCycleAB", "enabled", "false")) ? 1 : 0;
                StringBuilder sb = new StringBuilder("enableConsistentLifeCycle, 本次AB实验取值:");
                sb.append(r == 1);
                o3s.b("TaoLiveConfig", sb.toString());
            }
        }
        return r == 1;
    }

    public static String u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa8a4e4e", new Object[0]);
        }
        return vvs.i("tblive", "commentCdnUrl", "https://alive-interact.alicdn.com/comment/barrage/");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2173a0f3", new Object[0])).booleanValue();
        }
        if (i) {
            o3s.d("TaoLiveConfig", "has read enableDetailRequestPre:" + j);
            return j;
        }
        i = true;
        if (vvs.b("tblive", "enableDetailRequestPre2", true)) {
            i = true;
            boolean b2 = uvs.b("taolive", "enableDetailRequestAhead", "enable", true);
            o3s.d("TaoLiveConfig", "enableOptFirstFrame: " + b2);
            j = b2;
            return b2;
        }
        o3s.d("TaoLiveConfig", "enableDetailRequestPre: false");
        return false;
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("848d8bd8", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "EnablePlayRate", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9535e94c", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableDuplicationCommentFix", Boolean.TRUE).booleanValue();
    }

    public static long w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea5afd4f", new Object[0])).longValue();
        }
        if (p == -1) {
            p = vvs.g("tblive", "getEnterAnimationDelayTimeMs", 500L);
        }
        return p;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6dc212", new Object[0])).booleanValue();
        }
        if (n == -1) {
            if (uvs.b("tblive", "enableEventCenterOpt", "enable", true)) {
                n = 1;
            } else {
                n = 0;
            }
            if (iw0.i()) {
                if (n == 1) {
                    o3s.b("FrameContext", "命中EventCenter多实例");
                } else {
                    o3s.b("FrameContext", "未命中EventCenter多实例");
                }
            }
        }
        return n == 1;
    }

    public static String x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91fafe2f", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "goodsDefaultCpsTcpInfo", "{\"taobao\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"},\"tmall\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"}}");
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d195fe", new Object[0])).booleanValue();
        }
        if (!h) {
            g = vvs.b("tblive", "enableFansLight", true);
            h = true;
        }
        return g;
    }

    public static String y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("889e6a6c", new Object[0]);
        }
        return vvs.i("tblive", "interactiveParamsKey", "liveTest1,LiveTest2");
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25389b1e", new Object[0])).booleanValue();
        }
        return i9l.a("tblive", "enableFirstFrameOpt", Boolean.TRUE).booleanValue();
    }

    public static int z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("903df696", new Object[0])).intValue();
        }
        return vvs.e("tblive", "likeAtmosThreshold", 10);
    }
}
