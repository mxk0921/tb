package tb;

import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class aqp {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510140);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("abeefc5a", new Object[]{this})).booleanValue();
            }
            return F0("enableGoBackToAllItemFromTab3", true);
        }

        public final boolean A0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93918f94", new Object[]{this})).booleanValue();
            }
            return F0("enableZuoPinTabRedDot", true);
        }

        public final boolean B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("357f084d", new Object[]{this})).booleanValue();
            }
            return F0("enableHeaderDataAppendToPop", true);
        }

        public final boolean B0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95f51922", new Object[]{this})).booleanValue();
            }
            return F0("fixAndroidXLifecycleObserveCrash", true);
        }

        public final boolean C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4cdbbc35", new Object[]{this})).booleanValue();
            }
            return F0("enableIgnore663InShopLoft", true);
        }

        public final boolean C0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5301bf6f", new Object[]{this})).booleanValue();
            }
            return F0("fixLiveFirstFrameCallbackCrash", true);
        }

        public final boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("857994a5", new Object[]{this})).booleanValue();
            }
            return F0("enableInjectShopFetchUseMainThread", false);
        }

        public final boolean D0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69af9f51", new Object[]{this})).booleanValue();
            }
            return F0("forceDisableShopH5PageLongPressSaveImage", true);
        }

        public final boolean E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77369a84", new Object[]{this})).booleanValue();
            }
            return F0("enableInterceptAllEventByDownEventIntercept", true);
        }

        public final JSONArray E0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("df8ae951", new Object[]{this, str});
            }
            JSONArray j = brf.j(G0(str, ""));
            if (j == null) {
                return new JSONArray();
            }
            return j;
        }

        public final boolean F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("49b5a2d7", new Object[]{this})).booleanValue();
            }
            return F0("enableLiveToHomePageAnimation", false);
        }

        public final boolean F0(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f7b2213", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            try {
                return Boolean.parseBoolean(G0(str, String.valueOf(z)));
            } catch (Exception e) {
                e.printStackTrace();
                return z;
            }
        }

        public final boolean G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("135e7427", new Object[]{this})).booleanValue();
            }
            return F0("enableMiniDataRouterPreload", false);
        }

        public final String G0(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
            }
            String config = OrangeConfig.getInstance().getConfig("shop_triver_common_config", str, str2);
            ckf.f(config, "getInstance().getConfig(NAME_SPACE, configName, defaultValue)");
            return config;
        }

        public final boolean H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("587d2d4d", new Object[]{this})).booleanValue();
            }
            return F0("enableNativeShopSmsIcon", false);
        }

        public final int H0(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd78aaca", new Object[]{this, str, new Integer(i)})).intValue();
            }
            Integer n = ssq.n(G0(str, String.valueOf(i)), 10);
            if (n == null) {
                return i;
            }
            return n.intValue();
        }

        public final boolean I() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cee951b9", new Object[]{this})).booleanValue();
            }
            return F0("enableNewFragmentCreateView", true);
        }

        public final int I0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("198696d0", new Object[]{this, new Integer(i)})).intValue();
            }
            try {
                return H0("liveTabBottomExtraPadding", i);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return i;
            }
        }

        public final boolean J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("915fcf6", new Object[]{this})).booleanValue();
            }
            return F0("enableNewGuidTimeLogic", true);
        }

        public final int J0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7b54d0ac", new Object[]{this, new Integer(i)})).intValue();
            }
            try {
                return H0("liveTabTopExtraPadding", i);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return i;
            }
        }

        public final boolean K() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e3681f1", new Object[]{this})).booleanValue();
            }
            return F0("enableNewLivingStatusFromShopInfo", true);
        }

        public final long K0(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eec2bef3", new Object[]{this, str, new Long(j)})).longValue();
            }
            Long p = ssq.p(G0(str, String.valueOf(j)), 10);
            if (p == null) {
                return j;
            }
            return p.longValue();
        }

        public final boolean L() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e9d131d", new Object[]{this})).booleanValue();
            }
            return F0("enableNewRouteLogic", true);
        }

        public final long L0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f568410", new Object[]{this})).longValue();
            }
            if (khu.e()) {
                return K0("popDelayTimeLowDevice", 3200L);
            }
            if (khu.f()) {
                return K0("popDelayTimeMediumDevice", 2800L);
            }
            return K0("popDelayTimeHighDevice", f51.DEF_MAX_ASYNC_SECONDS);
        }

        public final JSONArray M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("d4087a48", new Object[]{this});
            }
            return E0("enableNewShopLoftGuidConfig");
        }

        public final boolean N() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf47177d", new Object[]{this})).booleanValue();
            }
            return F0("enableNewShopLoftOneDataShowGuid", true);
        }

        public final int N0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("689ffa1b", new Object[]{this})).intValue();
            }
            return H0("subscribeTipsInvokeTimer", 10);
        }

        public final boolean O() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("85e4c15d", new Object[]{this})).booleanValue();
            }
            return F0("enablePopDelayToPageFinish", true);
        }

        public final boolean P() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1fc67009", new Object[]{this})).booleanValue();
            }
            return F0("enablePopTriggerWhenAppEnd", false);
        }

        public final boolean Q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc2307a5", new Object[]{this})).booleanValue();
            }
            return F0("enablePostEventToWebShopIndex", true);
        }

        public final int Q0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3d4fea3c", new Object[]{this})).intValue();
            }
            return H0("newDetailSwipeThreshold", 20);
        }

        public final boolean R() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3363e13", new Object[]{this})).booleanValue();
            }
            return F0("enablePreloadBeforeComponentInit", true);
        }

        public final boolean S() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8605daf0", new Object[]{this})).booleanValue();
            }
            return F0("enablePreloadShopIndexInActivityOnCreateV2", true);
        }

        public final boolean T() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a99e2ff1", new Object[]{this})).booleanValue();
            }
            return F0("enableRecycleMemWhenMemWarning", false);
        }

        public final boolean U() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96c4856c", new Object[]{this})).booleanValue();
            }
            return F0("enableRecycleMemWhenUIBackground", true);
        }

        public final int U0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("166fc772", new Object[]{this})).intValue();
            }
            return H0("shopRedDotIntervalTimeByHours", 720);
        }

        public final boolean V() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ca10cf5", new Object[]{this})).booleanValue();
            }
            return F0("enableRemoveSaveInstanceFragments", true);
        }

        public final JSONArray V0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("b26b3f95", new Object[]{this});
            }
            return E0("shopRouteBlackSpmList");
        }

        public final boolean W() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b117d15", new Object[]{this})).booleanValue();
            }
            return F0("enableShopActivityOnConfigurationChangedRestart", true);
        }

        public final JSONArray W0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("d6c2a73f", new Object[]{this});
            }
            JSONArray E0 = E0("shopRouteWhiteSpmList");
            if (E0.size() == 0) {
                E0.add("*");
            }
            return E0;
        }

        public final boolean X() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c0ecbc20", new Object[]{this})).booleanValue();
            }
            return F0("enableShopAsyncJSBridge", true);
        }

        public final boolean Y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ada496b5", new Object[]{this})).booleanValue();
            }
            return F0("enableShopClassPreload", true);
        }

        public final boolean Z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6370b539", new Object[]{this})).booleanValue();
            }
            return F0("enableShopH5ContentRenderWhiteBackground", true);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("28b8e2d0", new Object[]{this})).booleanValue();
            }
            return F0("allItemsSupportUseNoStickHeader", true);
        }

        public final boolean a0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cba7abee", new Object[]{this})).booleanValue();
            }
            return F0("enableShopIndexPreSetPreloadStatus", true);
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf224194", new Object[]{this})).booleanValue();
            }
            return F0("directlyJumpAllItemsWhenClickAllItemsBar", true);
        }

        public final boolean b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6cb13509", new Object[]{this})).booleanValue();
            }
            return F0("enableShopIndexPreloadInNewRoute", true);
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d8841489", new Object[]{this})).booleanValue();
            }
            return F0("disable663CardRegister", true);
        }

        public final boolean c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e3ab8aa5", new Object[]{this})).booleanValue();
            }
            return F0("enableShopIndexRecycle", false);
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17046a15", new Object[]{this})).booleanValue();
            }
            return F0("disableShopLoftFirstIsLiveCloseGuid", true);
        }

        public final boolean d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55e5198b", new Object[]{this})).booleanValue();
            }
            return F0("enableShopIndexRuleBlackListCheck", true);
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4fe460fe", new Object[]{this})).booleanValue();
            }
            return F0("disableShopOptLayoutUpAndCancelEventReturn", true);
        }

        public final boolean e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("acf9ffb9", new Object[]{this})).booleanValue();
            }
            return F0("enableShopIndexWebPreload", true);
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("81125522", new Object[]{this})).booleanValue();
            }
            try {
                return F0("downgradeConfig", false);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return false;
            }
        }

        public final boolean f0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74076c84", new Object[]{this})).booleanValue();
            }
            return F0("enableShopInsidePageDowngradeToH5", true);
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8805c9ec", new Object[]{this})).booleanValue();
            }
            return F0("enable2022ShopFrameworkBigCardPullDownStyle", true);
        }

        public final boolean g0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da155812", new Object[]{this})).booleanValue();
            }
            return F0("enableShopLoftGraphicBGScale", true);
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("25a3de5e", new Object[]{this})).booleanValue();
            }
            return F0("enableANRFIX", true);
        }

        public final boolean h0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("146c9563", new Object[]{this})).booleanValue();
            }
            return F0("enableShopLoftLiveCardDisableSwipe", true);
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3cdcde5f", new Object[]{this})).booleanValue();
            }
            return F0("enableActivityRecycleFix", true);
        }

        public final boolean i0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f215f96", new Object[]{this})).booleanValue();
            }
            return F0("enableShopLoftSwipeLimit", true);
        }

        public final boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("71352bb4", new Object[]{this})).booleanValue();
            }
            return F0("enableAllItemRedDot", true);
        }

        public final boolean j0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5cbb8ec", new Object[]{this})).booleanValue();
            }
            return F0("enbaleShopLoftVideoCustom2001", false);
        }

        public final boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bce563d", new Object[]{this})).booleanValue();
            }
            return F0("enableAllItemsDeathRecover", false);
        }

        public final boolean k0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce5fa64d", new Object[]{this})).booleanValue();
            }
            return F0("enableShopNewRoute", true);
        }

        public final boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c406564", new Object[]{this})).booleanValue();
            }
            return F0("enableAllItemsPrefetch", true);
        }

        public final boolean l0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc81914", new Object[]{this})).booleanValue();
            }
            return F0("enableShopPreloadWhenManifestInitV2", false);
        }

        public final boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("52c6bf72", new Object[]{this})).booleanValue();
            }
            return F0("enableAllItemsPreload", true);
        }

        public final boolean m0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("328841d4", new Object[]{this})).booleanValue();
            }
            return F0("enableShopUCP", true);
        }

        public final boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4da780e5", new Object[]{this})).booleanValue();
            }
            return F0("enableAllItemsRefreshOnce", true);
        }

        public final boolean n0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("872fe45b", new Object[]{this})).booleanValue();
            }
            return F0("enableShopUrlSpmKeyDelete", true);
        }

        public final boolean o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5ec457d", new Object[]{this})).booleanValue();
            }
            return F0("enableAudioAutoRecoveryLogical", true);
        }

        public final boolean o0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b03cc02e", new Object[]{this})).booleanValue();
            }
            return F0("enableShowMiniLive", true);
        }

        public final boolean p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c037cb97", new Object[]{this})).booleanValue();
            }
            return F0("enableAutoScrollText", true);
        }

        public final boolean p0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f141984", new Object[]{this})).booleanValue();
            }
            return F0("enableSuperBigCardSize", true);
        }

        public final boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d96d27ab", new Object[]{this})).booleanValue();
            }
            return F0("enableBottomBarChangedVibrate", true);
        }

        public final boolean q0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("23825589", new Object[]{this})).booleanValue();
            }
            return F0("enableSwipeUpAutoCloseShopLoft", true);
        }

        public final boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5191392", new Object[]{this})).booleanValue();
            }
            return F0("enableBottomBarAutoHide2023", true);
        }

        public final boolean r0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2362e07c", new Object[]{this})).booleanValue();
            }
            return F0("enableTab3MemoryRecycle", true);
        }

        public final boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("91d577f8", new Object[]{this})).booleanValue();
            }
            return F0("enableContentShop1190BigCard", true);
        }

        public final boolean s0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d28a840", new Object[]{this})).booleanValue();
            }
            return F0("enableTab3SupportOnStartLifecycle", true);
        }

        public final boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22f1e6be", new Object[]{this})).booleanValue();
            }
            return F0("enableDeathRecoverToLastPage", true);
        }

        public final boolean t0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aadecfa3", new Object[]{this})).booleanValue();
            }
            return F0("enableTab3UseTextureMode", true);
        }

        public final boolean u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1a5d79f", new Object[]{this})).booleanValue();
            }
            return F0("enableDeathRecoveryMonitor", true);
        }

        public final boolean u0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12a8ffc", new Object[]{this})).booleanValue();
            }
            return F0("enableTabMTopPrefetch", true);
        }

        public final boolean v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3345696b", new Object[]{this})).booleanValue();
            }
            return F0("enableDowngradeTo2021Shop", true);
        }

        public final boolean v0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f1b7ca8", new Object[]{this})).booleanValue();
            }
            return F0("enableTriverInitCheck", true);
        }

        public final boolean w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f17e533a", new Object[]{this})).booleanValue();
            }
            return F0("enableExitShopSendLivePauseEvent", true);
        }

        public final boolean w0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dbf007d", new Object[]{this})).booleanValue();
            }
            return F0("enableUseShopRouteFollowStatus", true);
        }

        public final boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7df6e054", new Object[]{this})).booleanValue();
            }
            return F0("enableFlagShipFullScreenSupport", true);
        }

        public final boolean x0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d71c6378", new Object[]{this})).booleanValue();
            }
            return F0("enableViewPagerAllowDoNotDispatchToChild", true);
        }

        public final boolean y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ac6f190f", new Object[]{this})).booleanValue();
            }
            return F0("enableForceRunMainThreadWithRouteBack", true);
        }

        public final boolean y0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f21e95b", new Object[]{this})).booleanValue();
            }
            return F0("enableWebViewDestroyAndRemoveSelfFromViewTree", true);
        }

        public final boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b14f902", new Object[]{this})).booleanValue();
            }
            return F0("enableFullScreenPageCanPullDownHeader", true);
        }

        public final boolean z0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31c1ba2d", new Object[]{this})).booleanValue();
            }
            return F0("enableXSDWeexPreloadV3", true);
        }

        public a() {
        }

        public final int M0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2cb1e4c7", new Object[]{this})).intValue();
            }
            return H0("redDotMaxShopSize", 1);
        }

        public final boolean O0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1a2adbd", new Object[]{this})).booleanValue();
            }
            return F0("hideShop2022BottomBar", true);
        }

        public final boolean P0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a216152b", new Object[]{this})).booleanValue();
            }
            try {
                return F0("isComponentJsPreRelease", false);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return false;
            }
        }

        public final boolean R0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96997393", new Object[]{this})).booleanValue();
            }
            return F0("removeSpmArgsFromUTEvent", true);
        }

        public final boolean S0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f37b309", new Object[]{this})).booleanValue();
            }
            return F0("removeUrlParamToUTEvent", true);
        }

        public final boolean T0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e04378", new Object[]{this})).booleanValue();
            }
            return F0("shopLoftEnableFollowButton", false);
        }

        public final boolean X0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff6b053", new Object[]{this})).booleanValue();
            }
            return F0("shopShareLinkWithoutM", true);
        }

        public final boolean Y0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("104ff839", new Object[]{this})).booleanValue();
            }
            return F0("supportFoldDeviceInfoAddToRouteProcess", true);
        }

        public final boolean Z0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("728010d2", new Object[]{this})).booleanValue();
            }
            return F0("useNewTabParseLogic", true);
        }

        public final boolean a1() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("10e101ee", new Object[]{this})).booleanValue();
            }
            return F0("useNewVideoPlayer", false);
        }

        public final boolean b1() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68d14e07", new Object[]{this})).booleanValue();
            }
            return F0("useNewWidgetInterface", false);
        }
    }

    static {
        t2o.a(766510139);
    }
}
