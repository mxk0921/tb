package tb;

import android.os.Build;
import android.taobao.windvane.config.WVConfigManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class vpw implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f30165a = false;
    public static final wpw commonConfig = new wpw();
    public static volatile vpw b = null;

    static {
        t2o.a(989855786);
        t2o.a(989855775);
    }

    public static vpw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpw) ipChange.ipc$dispatch("2c2d6f2e", new Object[0]);
        }
        if (b == null) {
            synchronized (vpw.class) {
                try {
                    if (b == null) {
                        b = new vpw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // tb.ipb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d449d5", new Object[]{this, str});
            return;
        }
        f(str);
        xg4.m(WVConfigManager.SPNAME_CONFIG, "commonwv-data", str);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563df8f4", new Object[]{this})).booleanValue();
        }
        return this.f30165a;
    }

    public final int f(String str) {
        JSONObject jSONObject;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        psu psuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f758f499", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArr5 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            v7t.d("WVCommonConfig", x74.i(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return 0;
        }
        if (!jSONObject.has("v") && !TextUtils.equals(yaa.f().b(), jSONObject.optString("appVersion"))) {
            return 0;
        }
        v7t.i("WVConfig", "当前更新orange配置，是否有v=[" + jSONObject.has("v") + "]");
        if (jSONObject.optLong("configUpdateInterval", 0L) >= 0) {
            commonConfig.getClass();
        }
        wpw wpwVar = commonConfig;
        jSONObject.optDouble("packagePriorityWeight", 0.1d);
        wpwVar.getClass();
        wpwVar.f30848a = jSONObject.optInt("monitorStatus", 2);
        jSONObject.optInt("urlRuleStatus", 2);
        jSONObject.optInt("packageMaxAppCount", 100);
        jSONObject.optString("urlScheme", "http").replace(":", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("verifySampleRate");
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        try {
            strArr = e(jSONObject, "monitoredApps");
        } catch (Throwable unused) {
            strArr = null;
        }
        if (strArr != null) {
            commonConfig.getClass();
        }
        try {
            strArr2 = e(jSONObject, "systemBlacks");
        } catch (Throwable unused2) {
            strArr2 = null;
        }
        if (strArr2 != null) {
            commonConfig.u = strArr2;
        }
        try {
            strArr3 = e(jSONObject, "brandBlacks");
        } catch (Throwable unused3) {
            strArr3 = null;
        }
        if (strArr2 != null) {
            commonConfig.v = strArr3;
        }
        try {
            strArr4 = e(jSONObject, "modelBlacks");
        } catch (Throwable unused4) {
            strArr4 = null;
        }
        if (strArr2 != null) {
            commonConfig.w = strArr4;
        }
        try {
            strArr5 = e(jSONObject, "aliNetworkDegradeDomains");
        } catch (Throwable unused5) {
        }
        if (strArr5 != null) {
            commonConfig.getClass();
        }
        try {
            commonConfig.b = e(jSONObject, "disableMixViews");
        } catch (Throwable unused6) {
        }
        String optString = jSONObject.optString("disableInstallPeriod");
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.trim().split("-");
            if (split.length == 2) {
                if (split[0].matches("^[0-9]*$")) {
                    wpw wpwVar2 = commonConfig;
                    Long.parseLong(split[0]);
                    wpwVar2.getClass();
                }
                if (split[1].matches("^[0-9]*$")) {
                    wpw wpwVar3 = commonConfig;
                    Long.parseLong(split[1]);
                    wpwVar3.getClass();
                }
            }
        }
        String optString2 = jSONObject.optString("ucParam", "");
        if (!TextUtils.isEmpty(optString2) && (psuVar = commonConfig.i) != null) {
            psuVar.h(optString2);
        }
        wpw wpwVar4 = commonConfig;
        jSONObject.optBoolean("enableUCShareCore", true);
        wpwVar4.getClass();
        wpwVar4.e = jSONObject.optBoolean("useSystemWebView", false);
        wpwVar4.f = jSONObject.optBoolean("ucInitOptV1", wpwVar4.f);
        wpwVar4.c = jSONObject.optDouble("ucsdk_alinetwork_rate", 1.0d);
        jSONObject.optBoolean("reduceCameraPermissionOfStorage", true);
        jSONObject.optBoolean("reduceGalleryPermissionOfStorageWrite", true);
        wpwVar4.d = jSONObject.optDouble("ucsdk_image_strategy_rate", 1.0d);
        wpwVar4.g = jSONObject.optString("cookieUrlRule", "");
        wpwVar4.h = jSONObject.optString("ucCoreUrl", "");
        wpwVar4.j = jSONObject.optString("shareBlankList", "");
        jSONObject.optBoolean("isOpenCombo", false);
        jSONObject.optBoolean("isCheckCleanup", true);
        jSONObject.optBoolean("isAutoRegisterApp", false);
        jSONObject.optBoolean("isUseTBDownloader", true);
        jSONObject.optBoolean("isUseAliNetworkDelegate", true);
        jSONObject.optInt("packageDownloadLimit", 30);
        jSONObject.optInt("packageAccessInterval", 3000);
        jSONObject.optInt("packageRemoveInterval", 432000000);
        jSONObject.optInt("recoveryInterval", 432000000);
        jSONObject.optInt("customsComboLimit", 1);
        jSONObject.optInt("customsDirectQueryLimit", 10);
        jSONObject.optString("packageZipPrefix", "");
        jSONObject.optString("packageZipPreviewPrefix", "");
        jSONObject.optBoolean("ucSkipOldKernel", true);
        wpwVar4.n = jSONObject.optBoolean("ucKernelReuse", wpwVar4.n);
        wpwVar4.m = jSONObject.optBoolean("useUCPlayer", false);
        wpwVar4.o = jSONObject.optBoolean("enableUCPrecache", false);
        wpwVar4.p = jSONObject.optString("precachePackageName", "");
        wpwVar4.q = jSONObject.optBoolean("enableUCPrecacheDoc", false);
        jSONObject.optInt("initWebPolicy", 48);
        wpwVar4.E = jSONObject.optBoolean("openExperiment", wpwVar4.E);
        wpwVar4.F = jSONObject.optBoolean("openUCImageExperiment", wpwVar4.F);
        wpwVar4.J = jSONObject.optBoolean("discardableFreeIfHasGpuDecode", wpwVar4.J);
        wpwVar4.G = jSONObject.optInt("ucMultiRetryTimes", wpwVar4.G);
        wpwVar4.s = jSONObject.optInt("ucMultiTimeOut", wpwVar4.s);
        wpwVar4.t = jSONObject.optInt("ucMultiStartTime", wpwVar4.t);
        wpwVar4.x = jSONObject.optInt("recoverMultiInterval", wpwVar4.x);
        jSONObject.optBoolean("ucMultiServiceSpeedUp", false);
        wpwVar4.y = jSONObject.optInt("downloadCoreType", wpwVar4.y);
        wpwVar4.z = jSONObject.optBoolean("openLog", false);
        jSONObject.optBoolean("openTLog", true);
        wpwVar4.C = jSONObject.optBoolean("useOldBridge", false);
        wpwVar4.D = jSONObject.optString("ffmegSoPath", wpwVar4.D);
        wpwVar4.K = jSONObject.optBoolean("enableSgRequestCheck", wpwVar4.K);
        wpwVar4.L = jSONObject.optBoolean("filterSgRequestCheck", wpwVar4.L);
        wpwVar4.H = jSONObject.optBoolean("enableExtImgDecoder", true);
        wpwVar4.I = jSONObject.optBoolean("enableExchangeImgUrl", true);
        wpwVar4.M = jSONObject.optBoolean("skipPreRenderBackgroundWhitePage", true);
        wpwVar4.N = jSONObject.optBoolean("fixWhitePageBug", false);
        wpwVar4.O = jSONObject.optBoolean("enablePreStartup", true);
        wpwVar4.A = jSONObject.optBoolean("useURLConfig", wpwVar4.A);
        wpwVar4.B = jSONObject.optBoolean("useURLConfigInServerConfig", wpwVar4.B);
        wpwVar4.P = jSONObject.optBoolean("useNewWindvaneCoreJs", true);
        wpwVar4.Q = jSONObject.optBoolean("fixCoreEventCallback", true);
        wpwVar4.R = jSONObject.optBoolean("enableGpuGoneReload", wpwVar4.R);
        wpwVar4.S = jSONObject.optBoolean("open5GAdapter", true);
        wpwVar4.T = jSONObject.optBoolean("fixAddUrlParam", wpwVar4.T);
        wpwVar4.Y = jSONObject.optBoolean("targetSdkAdapte", wpwVar4.Y);
        wpwVar4.U = jSONObject.optBoolean("enableZCacheAdpter", wpwVar4.U);
        wpwVar4.V = jSONObject.optLong("zcacheResponseTimeOut", wpwVar4.V);
        wpwVar4.Z = jSONObject.optBoolean("authContact", wpwVar4.Z);
        wpwVar4.X = jSONObject.optBoolean("enableMimeTypeSet", true);
        jSONObject.optBoolean("enablePreinit", true);
        jSONObject.optBoolean("enableMultiExecutor", true);
        wpwVar4.a0 = jSONObject.optInt("preloadMainHtmlRequestTimeout", wpwVar4.a0);
        wpwVar4.b0 = jSONObject.optInt("defaultPreloadMainHtmlTimeout", wpwVar4.b0);
        wpwVar4.c0 = jSONObject.optInt("goToMainTimeout", wpwVar4.c0);
        wpwVar4.d0 = jSONObject.optString("additionMockHeader", wpwVar4.d0);
        wpwVar4.f0 = jSONObject.optBoolean("loadUrlDealUrlScheme", true);
        wpwVar4.e0 = jSONObject.optBoolean("needAutoFlushCookie", true);
        wpwVar4.g0 = jSONObject.optInt("UCCookieType", wpwVar4.g0);
        wpwVar4.h0 = jSONObject.optBoolean("useNewJSerror", true);
        wpwVar4.W = jSONObject.optLong("sysZcacheResponseTimeOut", wpwVar4.W);
        wpwVar4.i0 = jSONObject.optBoolean("fixwvSysWebView", false);
        wpwVar4.j0 = jSONObject.optInt("splashHideTimeout", wpwVar4.j0);
        wpwVar4.k0 = jSONObject.optString("alwaysAllowJSAPIPermission", wpwVar4.k0);
        wpwVar4.m0 = jSONObject.optDouble("hscJsErrorSampleRate", wpwVar4.m0);
        wpwVar4.p0 = jSONObject.optDouble("hscMtopPluginSampleRate", wpwVar4.p0);
        wpwVar4.o0 = jSONObject.optDouble("hscNetworkSampleRate", wpwVar4.o0);
        wpwVar4.n0 = jSONObject.optDouble("hscWhitePageSampleRate", wpwVar4.n0);
        wpwVar4.s0 = jSONObject.optDouble("hscPerformanceSampleRate", wpwVar4.s0);
        wpwVar4.q0 = jSONObject.optDouble("hscZcacheResponseSampleRate", wpwVar4.q0);
        wpwVar4.l0 = jSONObject.optBoolean("hscEnable", wpwVar4.l0);
        wpwVar4.r0 = jSONObject.optBoolean("jsBridgeMonitorEnable", wpwVar4.r0);
        wpwVar4.t0 = jSONObject.optBoolean("fixCameraPermission", wpwVar4.t0);
        wpwVar4.u0 = jSONObject.optString("jstFspScript");
        wpwVar4.v0 = jSONObject.optBoolean("fixNotificationSetting", wpwVar4.v0);
        wpwVar4.w0 = jSONObject.optBoolean("disallowCallAfterDestroy", wpwVar4.w0);
        wpwVar4.x0 = jSONObject.optBoolean("fixGetLocation", wpwVar4.x0);
        wpwVar4.y0 = jSONObject.optString("meetingPattern", wpwVar4.y0);
        wpwVar4.z0 = jSONObject.optBoolean("enableOverrideBizCode", wpwVar4.z0);
        wpwVar4.A0 = jSONObject.optBoolean("fixConfigStorageBug", wpwVar4.A0);
        wpwVar4.E0 = jSONObject.optBoolean("enableReportWhitePage", wpwVar4.E0);
        wpwVar4.B0 = jSONObject.optBoolean("enableThreadWatchdog", wpwVar4.B0);
        wpwVar4.C0 = jSONObject.optBoolean("enableOpenCheck", wpwVar4.C0);
        wpwVar4.D0 = jSONObject.optBoolean("enableApiCheck", wpwVar4.D0);
        wpwVar4.F0 = g(jSONObject.optString("hscResponseCodeSampleRate"));
        wpwVar4.G0 = jSONObject.optBoolean("enableContactPermissionExplain", wpwVar4.G0);
        wpwVar4.H0 = jSONObject.optBoolean("enableOnFinishedReported", wpwVar4.H0);
        wpwVar4.I0 = jSONObject.optBoolean("enableWVFullTrace", wpwVar4.I0);
        wpwVar4.J0 = jSONObject.optBoolean("storeCachedDir", wpwVar4.J0);
        wpwVar4.K0 = jSONObject.optBoolean("enableUCUploadToTlog", wpwVar4.K0);
        wpwVar4.L0 = jSONObject.optBoolean("enableUCUploadStartupToTlog", wpwVar4.L0);
        wpwVar4.M0 = jSONObject.optBoolean("enableSafeControl", wpwVar4.M0);
        wpwVar4.N0 = jSONObject.optBoolean("disallowFileAccess", wpwVar4.N0);
        wpwVar4.O0 = jSONObject.optBoolean("newMultiPictReturn", wpwVar4.O0);
        wpwVar4.P0 = jSONObject.optBoolean("allowResendRequest", wpwVar4.P0);
        wpwVar4.Q0 = jSONObject.optBoolean("uploadPPAfterJs", wpwVar4.Q0);
        wpwVar4.R0 = jSONObject.optBoolean("enableBizCodeLimit", wpwVar4.R0);
        wpwVar4.S0 = jSONObject.optBoolean("enableNewHEIC", wpwVar4.S0);
        wpwVar4.T0 = jSONObject.optBoolean("fixTouchActionIndexOutRange", wpwVar4.T0);
        wpwVar4.U0 = jSONObject.optBoolean("__temp_enable_filter_response_report__", wpwVar4.U0);
        wpwVar4.V0 = jSONObject.optString("__http_request_url_filter_pattern__", wpwVar4.V0);
        wpwVar4.W0 = jSONObject.optBoolean("enableNativeLogApi", true);
        wpwVar4.X0 = jSONObject.optBoolean("__fix_native_call_verification1__", wpwVar4.X0);
        wpwVar4.Y0 = jSONObject.optBoolean("__enable_mark_api__", true);
        wpwVar4.Z0 = jSONObject.optBoolean("__enable_init_widget_component__", true);
        wpwVar4.a1 = jSONObject.optBoolean("__enable_fix_npe__", wpwVar4.a1);
        wpwVar4.b1 = jSONObject.optBoolean("__enable_fix_wrong_apm_data1__", wpwVar4.b1);
        wpwVar4.c1 = jSONObject.optBoolean("__enable_add_riverlogger__", wpwVar4.c1);
        wpwVar4.d1 = jSONObject.optBoolean("__enable_riverlogger_bridge_info__", wpwVar4.d1);
        wpwVar4.e1 = jSONObject.optBoolean("enableOpenBrowserApi", wpwVar4.e1);
        wpwVar4.f1 = jSONObject.optInt("tlogMaxSizeKB", wpwVar4.f1);
        wpwVar4.g1 = jSONObject.optBoolean("enable_mega_bridge", wpwVar4.g1);
        wpwVar4.h1 = jSONObject.optBoolean("enable_report_expire_timeout", wpwVar4.h1);
        wpwVar4.i1 = jSONObject.optBoolean("enable_uc_max_cache_size_v2", wpwVar4.i1);
        wpwVar4.j1 = jSONObject.optInt("ucMaxCacheSizeByte", wpwVar4.j1);
        wpwVar4.k1 = jSONObject.optBoolean("__enable_create_ev_withContainer_v2__", wpwVar4.k1);
        wpwVar4.l1 = jSONObject.optBoolean("__enable_fix_api_authentication__", wpwVar4.l1);
        wpwVar4.m1 = jSONObject.optBoolean("__enable_add_custom_property__", wpwVar4.m1);
        wpwVar4.n1 = jSONObject.optBoolean("__enable_mtop_ssr_request__", wpwVar4.n1);
        wpwVar4.o1 = jSONObject.optBoolean("__enable_use_new_on_event__", wpwVar4.o1);
        wpwVar4.p1 = jSONObject.optBoolean("__enable_skip_verification__", wpwVar4.p1);
        wpwVar4.q1 = jSONObject.optBoolean("enable_document_preload", wpwVar4.q1);
        wpwVar4.r1 = jSONObject.optBoolean("enableHeicAcceptV1", wpwVar4.r1);
        wpwVar4.s1 = jSONObject.optBoolean("enableHeicWithTransparencyV1", wpwVar4.s1);
        wpwVar4.t1 = jSONObject.optBoolean("enableReportHttpSchemaUrl", wpwVar4.t1);
        wpwVar4.v1 = jSONObject.optBoolean("enableChangeImageAccept", wpwVar4.v1);
        wpwVar4.y1 = jSONObject.optBoolean("enableFontResourceIntercept", wpwVar4.y1);
        wpwVar4.w1 = jSONObject.optBoolean("enableAddClientContextHeader", wpwVar4.w1);
        wpwVar4.x1 = jSONObject.optBoolean("enableSystemWebView", wpwVar4.x1);
        wpwVar4.z1 = jSONObject.optBoolean("enableSsrRequestInSystemWebView", wpwVar4.z1);
        wpwVar4.A1 = jSONObject.optString("httpUrlWhiteList", wpwVar4.A1);
        wpwVar4.B1 = jSONObject.optBoolean("enableWebviewLoadUrlSchema", wpwVar4.B1);
        wpwVar4.C1 = jSONObject.optBoolean("enableUCSettingBeforeUCInit", wpwVar4.C1);
        wpwVar4.D1 = jSONObject.optInt("ucInitWebViewMaxWaitMills", wpwVar4.D1);
        wpwVar4.E1 = jSONObject.optBoolean("enableAddUcCoreInfoToCrash", wpwVar4.E1);
        wpwVar4.F1 = jSONObject.optBoolean("enableFixMonitorNpe", wpwVar4.F1);
        wpwVar4.G1 = jSONObject.optBoolean("enableCommitSystemWebViewInfo", wpwVar4.G1);
        wpwVar4.u1 = jSONObject.optBoolean("enableReportLoadUrl", wpwVar4.u1);
        wpwVar4.H1 = jSONObject.optBoolean("enable_wvmega_pass", wpwVar4.H1);
        wpwVar4.I1 = jSONObject.optBoolean("enableDestroyAbilityHubV2", wpwVar4.I1);
        wpwVar4.J1 = jSONObject.optBoolean("enableWebpResourceLoadMonitor", wpwVar4.J1);
        wpwVar4.K1 = jSONObject.optDouble("webpResourceLoadMonitorSample", wpwVar4.K1);
        wpwVar4.L1 = jSONObject.optBoolean("enableUseLoadUrlForRefer", wpwVar4.L1);
        wpwVar4.M1 = jSONObject.optBoolean("enableFixNetworkForWebView", wpwVar4.M1);
        wpwVar4.N1 = jSONObject.optBoolean("enableReportBaseAPIParams", wpwVar4.N1);
        wpwVar4.O1 = jSONObject.optBoolean("enableFixTakePhotoApi", wpwVar4.O1);
        wpwVar4.P1 = jSONObject.optBoolean("enableChunkCacheV2", wpwVar4.P1);
        wpwVar4.Q1 = jSONObject.optBoolean("enableAndroid14Adaptation", wpwVar4.Q1);
        wpwVar4.R1 = jSONObject.optBoolean("enableCloseMultiPhoto", wpwVar4.R1);
        wpwVar4.S1 = jSONObject.optInt("wvPrefetchPoolSize", wpwVar4.S1);
        wpwVar4.T1 = jSONObject.optInt("wvPrerenderResourceLimit", wpwVar4.T1);
        wpwVar4.U1 = jSONObject.optBoolean("enableSSRPrerender", wpwVar4.U1);
        wpwVar4.V1 = jSONObject.optBoolean("enablePreCreateWebViewV2", wpwVar4.V1);
        wpwVar4.W1 = jSONObject.optBoolean("enableAddBrowserUserAgent", wpwVar4.W1);
        wpwVar4.X1 = jSONObject.optBoolean("enableEncodeAPIInfo", wpwVar4.X1);
        wpwVar4.Y1 = jSONObject.optBoolean("enableAppDevToolsV1", wpwVar4.Y1);
        wpwVar4.Z1 = jSONObject.optBoolean("enableUseProtoDB", wpwVar4.Z1);
        wpwVar4.a2 = jSONObject.optLong("webViewCreateDelayTimeMs", wpwVar4.a2);
        wpwVar4.b2 = jSONObject.optInt("webViewPoolSizeLimit", wpwVar4.b2);
        wpwVar4.c2 = jSONObject.optString("asyncApiWhiteList", wpwVar4.c2);
        wpwVar4.d2 = jSONObject.optBoolean("enableFixMegaBridgeContext", wpwVar4.d2);
        wpwVar4.e2 = jSONObject.optBoolean("enableFixMegaBridgeJS", wpwVar4.e2);
        wpwVar4.g2 = jSONObject.optBoolean("enableFixSSRDowngradeError", wpwVar4.g2);
        wpwVar4.h2 = jSONObject.optBoolean("enableUCTlog", wpwVar4.h2);
        wpwVar4.i2 = jSONObject.optBoolean("enableFlushCookieAsync", wpwVar4.i2);
        wpwVar4.j2 = jSONObject.optBoolean("enableReloadInForeground", wpwVar4.j2);
        wpwVar4.k2 = jSONObject.optBoolean("enableSkipAPMReport", wpwVar4.k2);
        wpwVar4.l2 = jSONObject.optBoolean("enableInjectFCPScript", wpwVar4.l2);
        wpwVar4.m2 = jSONObject.optBoolean("enableSharedResourcePrefetch", wpwVar4.m2);
        wpwVar4.n2 = jSONObject.optBoolean("enableLoadRemoteQKingLib", wpwVar4.n2);
        wpwVar4.o2 = jSONObject.optBoolean("enableChangeBizId", wpwVar4.o2);
        wpwVar4.p2 = jSONObject.optBoolean("enableFirstChunkPriority", wpwVar4.p2);
        wpwVar4.q2 = jSONObject.optInt("firstChunkMaxAgeDays", wpwVar4.q2);
        wpwVar4.r2 = jSONObject.optBoolean("enableFixAPMDataLost", wpwVar4.r2);
        wpwVar4.s2 = jSONObject.optBoolean("enablePrefetchWithZCache", wpwVar4.s2);
        wpwVar4.t2 = jSONObject.optBoolean("enableFixStoragePermission", wpwVar4.t2);
        wpwVar4.u2 = jSONObject.optInt("preRenderPoolSizeLimit", wpwVar4.u2);
        wpwVar4.v2 = jSONObject.optBoolean("enableReportWormhole302", wpwVar4.v2);
        wpwVar4.w2 = jSONObject.optBoolean("enableOptimizeChunkStorage", wpwVar4.w2);
        wpwVar4.x2 = jSONObject.optBoolean("enableAudioOutputUseAAudio", wpwVar4.x2);
        wpwVar4.y2 = jSONObject.optBoolean("enableCustomEventCallback", wpwVar4.y2);
        wpwVar4.z2 = jSONObject.optBoolean("enableExportMainFrameResponse", wpwVar4.z2);
        wpwVar4.A2 = jSONObject.optBoolean("enableLogUnexpectedAPICall", wpwVar4.A2);
        wpwVar4.B2 = jSONObject.optBoolean("enableDisableVerifyClass", wpwVar4.B2);
        wpwVar4.f2 = jSONObject.optBoolean("enableSnapshotIsolation", wpwVar4.f2);
        wpwVar4.C2 = jSONObject.optBoolean("enableAsyncCallBridgeLogging", wpwVar4.C2);
        wpwVar4.D2 = jSONObject.optBoolean("enableNewMegaJSBridgeV1", wpwVar4.D2);
        wpwVar4.E2 = jSONObject.optBoolean("enableOptimizeContentDescription", wpwVar4.E2);
        wpwVar4.F2 = jSONObject.optBoolean("enableReportWVAPICall", wpwVar4.F2);
        wpwVar4.G2 = jSONObject.optInt("clearModeOnJSErrorV1", wpwVar4.G2);
        wpwVar4.H2 = jSONObject.optBoolean("enableReportInitialization", wpwVar4.H2);
        wpwVar4.I2 = jSONObject.optBoolean("enableReportFirstChunkTS", wpwVar4.I2);
        wpwVar4.J2 = jSONObject.optBoolean("enableRefactorPageModel", wpwVar4.J2);
        wpwVar4.K2 = jSONObject.optBoolean("enable_resource_prewarm", wpwVar4.K2);
        wpwVar4.L2 = jSONObject.optBoolean("enableFCCHitHeader", wpwVar4.L2);
        wpwVar4.M2 = jSONObject.optBoolean("enableOptimizeZCacheReferrer", wpwVar4.M2);
        wpwVar4.N2 = jSONObject.optBoolean("enableReportInjectJSCost", wpwVar4.N2);
        wpwVar4.O2 = jSONObject.optBoolean("wvEnableHeicWithTransparency", wpwVar4.O2);
        wpwVar4.P2 = jSONObject.optBoolean("wvEnableHeicAccept", wpwVar4.P2);
        wpwVar4.Q2 = jSONObject.optBoolean("enableOptimizeRemoteSoFetch", wpwVar4.Q2);
        wpwVar4.R2 = jSONObject.optBoolean("enablePrioritizeCoreEventCallback", wpwVar4.R2);
        wpwVar4.S2 = jSONObject.optBoolean("enableCacheFetchLocalResult", wpwVar4.S2);
        wpwVar4.T2 = jSONObject.optBoolean("enablePreWarmupUCCorePartial", wpwVar4.T2);
        wpwVar4.U2 = jSONObject.optBoolean("enableDelegateUCTaskExecutor", wpwVar4.U2);
        wpwVar4.V2 = jSONObject.optBoolean("enableSSRHeaderCompatible", wpwVar4.V2);
        wpwVar4.n3 = jSONObject.optBoolean("enableFccStrategyCache", wpwVar4.n3);
        wpwVar4.W2 = jSONObject.optBoolean("enableLowVersionDex2Oat", wpwVar4.W2);
        wpwVar4.X2 = jSONObject.optBoolean("enableAddFCCVersionHeader", wpwVar4.X2);
        wpwVar4.Y2 = jSONObject.optBoolean("enableFixJsiSoPath", wpwVar4.Y2);
        wpwVar4.Z2 = jSONObject.optBoolean("forceV8JsiMode", wpwVar4.Z2);
        wpwVar4.a3 = jSONObject.optBoolean("enableDex2oat", wpwVar4.a3);
        wpwVar4.b3 = jSONObject.optString("disableSnapshotWhiteList", wpwVar4.b3);
        wpwVar4.c3 = jSONObject.optInt("entryDeviceScoreThreshold", wpwVar4.c3);
        wpwVar4.d3 = jSONObject.optBoolean("enableDisableSnapshotWhenFirstLoad", wpwVar4.d3);
        wpwVar4.e3 = jSONObject.optBoolean("enableFccNoStorageCache", wpwVar4.e3);
        wpwVar4.f3 = jSONObject.optBoolean("enableFccCheckHtmlEmpty", wpwVar4.f3);
        wpwVar4.g3 = jSONObject.optBoolean("enableFixBrowserInitTask", wpwVar4.g3);
        wpwVar4.h3 = jSONObject.optBoolean("enableJSIReuseCore", wpwVar4.h3);
        wpwVar4.o3 = jSONObject.optBoolean("enableFccReportChunkMetaSize", wpwVar4.o3);
        wpwVar4.i3 = jSONObject.optBoolean("enableGPUInProcess", wpwVar4.i3);
        wpwVar4.j3 = jSONObject.optBoolean("enableDowngradeImage", wpwVar4.j3);
        wpwVar4.k3 = jSONObject.optBoolean("enableDexPreload", wpwVar4.k3);
        wpwVar4.l3 = jSONObject.optBoolean("enableDexPreloadInXiaoMi", wpwVar4.l3);
        wpwVar4.m3 = jSONObject.optBoolean("enableHeifAlpha1", wpwVar4.m3);
        wpwVar4.p3 = jSONObject.optBoolean("enableFixMonitorNetworkFinish", wpwVar4.p3);
        wpwVar4.q3 = jSONObject.optString("fccDowngradeFailOverWhiteList", wpwVar4.q3);
        wpwVar4.r3 = jSONObject.optString("fccDowngradeFailOverBlackList", wpwVar4.r3);
        wpwVar4.s3 = jSONObject.optBoolean("enableFccDowngradeRequestReuse", wpwVar4.s3);
        h(jSONObject);
        lqw.d().e(6012);
        v7t.d("WVCommonConfig", "config:" + jSONObject.toString());
        return jSONObject.length();
    }

    public final Map<String, String> g(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36b94c2f", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                concurrentHashMap.put(next, jSONObject.get(next).toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return concurrentHashMap;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f30165a) {
            synchronized (this) {
                try {
                    if (!this.f30165a) {
                        f(xg4.i(WVConfigManager.SPNAME_CONFIG, "commonwv-data"));
                        this.f30165a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String[] e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("7d39718a", new Object[]{this, jSONObject, str});
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            String optString = jSONObject.optString(str, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            if (TextUtils.isEmpty(optString) || optString.length() < 2) {
                return null;
            }
            return optString.substring(1, optString.length() - 1).split(",");
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                strArr[i] = optJSONArray.getString(i);
            } catch (JSONException e) {
                v7t.f("WVCommonConfig", "obtain array error ==>", e.getMessage());
            }
        }
        return strArr;
    }

    public final void h(JSONObject jSONObject) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da34f14", new Object[]{this, jSONObject});
            return;
        }
        try {
            wpw wpwVar = commonConfig;
            wpwVar.k = jSONObject.optInt("zipDegradeMode", 0);
            wpwVar.l = jSONObject.optString("zipDegradeList", "");
            String str = Build.BRAND + "@" + Build.VERSION.RELEASE;
            String str2 = wpwVar.l;
            if (!(TextUtils.isEmpty(str2) || (split = str2.split(",")) == null)) {
                for (String str3 : split) {
                    if (str.equalsIgnoreCase(str3)) {
                        v7t.d("WVCommonConfig", "Degrade unzip: " + str);
                        wpw wpwVar2 = commonConfig;
                        wpwVar2.getClass();
                        if (wpwVar2.k == 2) {
                            v7t.n("WVCommonConfig", "Disable package app");
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
