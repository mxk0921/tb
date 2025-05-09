package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.rp0;
import tb.s0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ja1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ArrayList<Double> L;
    public static volatile ArrayList<Double> M;
    public static volatile ArrayList<Double> N;
    public static volatile ArrayList<Double> O;
    public static volatile ArrayList<Integer> V0;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f21858a;
    public static volatile int b;
    public static volatile int c;
    public static volatile boolean d;
    public static volatile Boolean l0;
    public static volatile Boolean z;
    public static volatile boolean W0 = false;
    public static volatile int e = -1;
    public static volatile boolean f = true;
    public static volatile boolean g = true;
    public static volatile boolean h = true;
    public static volatile boolean i = true;
    public static volatile boolean j = false;
    public static volatile boolean k = false;
    public static volatile boolean l = true;
    public static volatile boolean m = false;
    public static File n = null;
    public static volatile int o = 0;
    public static volatile int p = 0;
    public static volatile boolean q = false;
    public static volatile int r = 0;
    public static volatile int s = 0;
    public static volatile Boolean t = null;
    public static volatile int u = -100;
    public static volatile int v = -1;
    public static final Map<String, Long> w = new ConcurrentHashMap();
    public static final Map<String, Long> mBucketIdIdMap = new ConcurrentHashMap();
    public static final Map<String, Long> x = new ConcurrentHashMap();
    public static volatile double y = 23000.0d;
    public static volatile int A = -1;
    public static volatile Boolean B = Boolean.FALSE;
    public static volatile boolean C = false;
    public static volatile boolean D = false;
    public static volatile boolean E = false;
    public static volatile int F = 20;
    public static volatile int G = 300;
    public static volatile float H = 0.5f;
    public static volatile float I = 0.5f;
    public static volatile JSONArray J = new JSONArray();
    public static volatile int K = 10;
    public static volatile Boolean P = null;
    public static volatile int Q = 256000;
    public static volatile String R = "[\"guangguang_pick\",\"ggpick_preload\"]";
    public static volatile int S = 125;
    public static volatile float T = 1.0f;
    public static volatile float U = 0.5f;
    public static volatile float V = 2.0f;
    public static volatile float W = 1.0f;
    public static volatile boolean X = true;
    public static volatile boolean Y = true;
    public static volatile String Z = "[-10608,-5,-110]";
    public static final AtomicBoolean a0 = new AtomicBoolean(true);
    public static AtomicReference<String> b0 = new AtomicReference<>("");
    public static final AtomicBoolean c0 = new AtomicBoolean(true);
    public static final AtomicBoolean d0 = new AtomicBoolean(false);
    public static final AtomicReference<String> mGlobalABRtcConfigParams = new AtomicReference<>("");
    public static final AtomicBoolean e0 = new AtomicBoolean(true);
    public static final AtomicReference<String> mGlobalABRtcAdaptionParamJson = new AtomicReference<>("");
    public static final AtomicReference<String> mGlobalABRtcSwitchParamJson = new AtomicReference<>("");
    public static final AtomicBoolean f0 = new AtomicBoolean(false);
    public static final AtomicBoolean g0 = new AtomicBoolean(false);
    public static final AtomicBoolean h0 = new AtomicBoolean(false);
    public static final AtomicInteger i0 = new AtomicInteger(JosStatusCodes.RTN_CODE_COMMON_ERROR);
    public static final AtomicBoolean j0 = new AtomicBoolean(false);
    public static final AtomicReference<String> mGlobalABRtcSRSCommonParams = new AtomicReference<>("");
    public static volatile AtomicInteger k0 = new AtomicInteger(0);
    public static volatile String m0 = "";
    public static final AtomicBoolean n0 = new AtomicBoolean(true);
    public static final AtomicBoolean o0 = new AtomicBoolean(false);
    public static final AtomicBoolean p0 = new AtomicBoolean(true);
    public static final AtomicBoolean mUseRtcAbr = new AtomicBoolean(true);
    public static final AtomicBoolean mRtcAbrDynamicEnable = new AtomicBoolean(false);
    public static final AtomicBoolean mRtcAdaptionAutoSwitch = new AtomicBoolean(true);
    public static final AtomicBoolean mEnableLowDeviceSwitchUd = new AtomicBoolean(false);
    public static final AtomicInteger mUseRtcAbrId = new AtomicInteger(0);
    public static final AtomicReference<String> mRtcAdaptionParamJson = new AtomicReference<>("");
    public static final AtomicReference<String> mBufferStorageParamJson = new AtomicReference<>("");
    public static final AtomicReference<String> mRtcSwitchParamJson = new AtomicReference<>("");
    public static final AtomicBoolean q0 = new AtomicBoolean(true);
    public static final AtomicBoolean r0 = new AtomicBoolean(false);
    public static final AtomicBoolean mUseLowSpeedPolicy = new AtomicBoolean(false);
    public static final AtomicBoolean mLowSpeedPolicy = new AtomicBoolean(false);
    public static final AtomicBoolean mEnableLowSpeedPolicyAB = new AtomicBoolean(false);
    public static final AtomicInteger mLowSpeedPolicyABId = new AtomicInteger(0);
    public static final AtomicReference<String> mLowSpeedPolicyABConfigValue = new AtomicReference<>("");
    public static final AtomicBoolean mLowSpeedPolicyOperator = new AtomicBoolean(false);
    public static final AtomicReference<String> mLowSpeedArtpCommonParamsJson = new AtomicReference<>("");
    public static final AtomicBoolean mEnableSRSByRTCWeakNetFlag = new AtomicBoolean(false);
    public static final AtomicBoolean mLiveRtcWeakNetFlag = new AtomicBoolean(false);
    public static final AtomicBoolean mEnableLiveRtcWeakNetSVCDrop = new AtomicBoolean(false);
    public static final AtomicBoolean mEnableLiveRtcWeakNetHoldMode = new AtomicBoolean(false);
    public static final AtomicInteger mWeakNetFlagLifeTime = new AtomicInteger(JosStatusCodes.RTN_CODE_COMMON_ERROR);
    public static final AtomicBoolean mEnableLiveRtcHomePageCardSVCDrop = new AtomicBoolean(false);
    public static final AtomicBoolean mEnableCdnStartPlaySpeed = new AtomicBoolean(true);
    public static final AtomicInteger mDefinitionDeciseWindow = new AtomicInteger(180000);
    public static final AtomicReference<String> mLowSpeedNewPolicyConfigValue = new AtomicReference<>("{\"ud\":{\"max_rtt\":\"40\",\"max_v_loss_rate\":\"0.2\",\"max_stall_time_msps\":\"50\",\"network_type_black_list\":[\"2G\",\"3G\",\"4G\",\"*\"]},\"hd\":{}}");
    public static volatile int s0 = 0;
    public static volatile boolean t0 = true;
    public static volatile boolean u0 = true;
    public static volatile Map<String, Integer> v0 = new HashMap();
    public static volatile Map<String, Integer> w0 = new HashMap();
    public static volatile boolean x0 = false;
    public static volatile boolean y0 = true;
    public static volatile boolean z0 = false;
    public static volatile boolean A0 = false;
    public static volatile boolean B0 = false;
    public static volatile boolean C0 = false;
    public static volatile boolean D0 = false;
    public static volatile boolean E0 = false;
    public static volatile String F0 = "[\"LiveCard\", \"LiveRoom\"]";
    public static volatile boolean G0 = true;
    public static volatile boolean H0 = true;
    public static volatile int I0 = 2;
    public static volatile boolean J0 = false;
    public static volatile boolean K0 = false;
    public static volatile String L0 = "[0,1,2]";
    public static volatile boolean M0 = false;
    public static volatile boolean N0 = false;
    public static volatile boolean O0 = true;
    public static volatile int P0 = 3000;
    public static volatile int Q0 = JosStatusCodes.RTN_CODE_COMMON_ERROR;
    public static volatile int R0 = 500;
    public static volatile feh S0 = new feh("ApplicationUtils", "Global");
    public static volatile boolean T0 = false;
    public static volatile boolean U0 = false;
    public static volatile boolean X0 = false;
    public static volatile boolean Y0 = false;
    public static volatile boolean Z0 = false;
    public static volatile boolean a1 = false;
    public static volatile String b1 = "[\"V2309A\",\"24129PN74C\"]";
    public static volatile String c1 = "[\"guangguang_pick\"]";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements rp0.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rp0.a
        public void a(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25a84069", new Object[]{this, new Integer(i), new Float(f)});
            } else {
                ja1.b(qp0.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("taolive", MediaConstant.ABTEST_RTC_LIVE_PARAMS_MODULE_DEBUG);
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("params");
                    if (variation != null) {
                        ja1.b0.set(variation.getValueAsString(""));
                    }
                    AVSDKLog.e(ja1.S0, "get initRtcLiveParamFromAB success");
                    ja1.c().set(false);
                }
            } catch (Throwable th) {
                feh fehVar = ja1.S0;
                AVSDKLog.e(fehVar, "get initRtcLiveParamFromAB info failed: " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("AB_TBLIVE_RTC_BUFFER_STORAGE_COMPONENT", "AB_TBLIVE_RTC_BUFFER_STORAGE_MODULE_20241212");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("rtcBufferStorageParamJson");
                    if (variation != null) {
                        ja1.mBufferStorageParamJson.set(variation.getValueAsString(""));
                    }
                    AVSDKLog.e(ja1.S0, "get initTBLiveBufferStorageFromAB info success");
                    ja1.e().set(false);
                    ja1.n().put("AB_TBLIVE_RTC_BUFFER_STORAGE", Long.valueOf(activate.getExperimentId()));
                    ja1.mBucketIdIdMap.put("AB_TBLIVE_RTC_BUFFER_STORAGE", Long.valueOf(activate.getExperimentBucketId()));
                    ja1.o().put("AB_TBLIVE_RTC_BUFFER_STORAGE", Long.valueOf(activate.getExperimentReleaseId()));
                }
            } catch (Throwable th) {
                feh fehVar = ja1.S0;
                AVSDKLog.e(fehVar, "get initTBLiveBufferStorageFromAB info failed: " + th.toString());
            }
        }
    }

    public static ArrayList<Double> A() {
        ArrayList<Double> v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("71eb4cd8", new Object[0]);
        }
        synchronized (ja1.class) {
            v2 = v(M);
        }
        return v2;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19860066", new Object[0])).booleanValue();
        }
        return ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_RTC_VVC, "true"));
    }

    public static long C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("faaa763d", new Object[]{str})).longValue();
        }
        Map<String, Long> map = mBucketIdIdMap;
        if (map.containsKey(str)) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public static long D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fe78073", new Object[]{str})).longValue();
        }
        Map<String, Long> map = w;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return ((Long) ((ConcurrentHashMap) map).get(str)).longValue();
        }
        return 0L;
    }

    public static long E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34febe14", new Object[]{str})).longValue();
        }
        Map<String, Long> map = x;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return ((Long) ((ConcurrentHashMap) map).get(str)).longValue();
        }
        return 0L;
    }

    public static File F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f15f32b3", new Object[0]);
        }
        if (!m) {
            n = Environment.getExternalStorageDirectory();
            m = true;
        }
        return n;
    }

    public static ArrayList<Double> G() {
        ArrayList<Double> v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a631f2d1", new Object[0]);
        }
        synchronized (ja1.class) {
            v2 = v(N);
        }
        return v2;
    }

    public static void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672edfb9", new Object[0]);
        } else if (!O0) {
            P0 = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_SHOW_TIME_AFTER_CALL_START, "3000"));
            Q0 = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_TOAST_AFTER_CALL_START, Constant.CODE_GET_TOKEN_SUCCESS));
            R0 = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_SHOW_TIME_WHEN_PLAYING, "500"));
        }
    }

    public static int I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfc7481e", new Object[]{str})).intValue();
        }
        if (v0 == null) {
            return 0;
        }
        if (((HashMap) v0).get(str) != null) {
            return ((Integer) ((HashMap) v0).get(str)).intValue();
        }
        if (((HashMap) v0).get("*") == null) {
            return 0;
        }
        return ((Integer) ((HashMap) v0).get("*")).intValue();
    }

    public static int J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("319a1f92", new Object[]{str})).intValue();
        }
        if (w0 == null) {
            return 0;
        }
        if (((HashMap) w0).get(str) != null) {
            return ((Integer) ((HashMap) w0).get(str)).intValue();
        }
        if (((HashMap) w0).get("*") == null) {
            return 0;
        }
        return ((Integer) ((HashMap) w0).get("*")).intValue();
    }

    public static String K(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cea21257", new Object[]{context, str, str2, str3});
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, str3);
        if (!s()) {
            return config;
        }
        String P2 = P(context, str, str2);
        if (TextUtils.isEmpty(P2)) {
            return config;
        }
        feh fehVar = S0;
        AVSDKLog.e(fehVar, "mockConfig success, value is " + P2);
        return P2;
    }

    public static synchronized int L() {
        synchronized (ja1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39546d5e", new Object[0])).intValue();
            }
            return s0;
        }
    }

    public static int M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1acfded4", new Object[]{context})).intValue();
        }
        if (v != -1) {
            return v;
        }
        if (context != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                v = (int) ((memoryInfo.totalMem / 1024) / 1024);
            } catch (Exception unused) {
                v = -1;
                AVSDKLog.e(S0, "getRunMemory failed.");
            }
        }
        return v;
    }

    public static String O(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868780e0", new Object[]{context, str, str2, str3, str4});
        }
        try {
        } catch (Throwable th) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "get SharedPreferences value failed: " + th.toString());
        }
        if (context == null) {
            AVSDKLog.e(S0, "getSharedPreferencesABMockValue failed by context is null ");
            return "";
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("ab_mock_value", 0);
        if (sharedPreferences == null) {
            return "";
        }
        String string = sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (TextUtils.isEmpty(str4)) {
            return string;
        }
        JSONObject parseObject = JSON.parseObject(string);
        if (parseObject.containsKey(str4)) {
            return parseObject.getString(str4);
        }
        return "";
    }

    public static ArrayList<Double> Q() {
        ArrayList<Double> v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("52b35a13", new Object[0]);
        }
        synchronized (ja1.class) {
            v2 = v(L);
        }
        return v2;
    }

    public static synchronized void R() {
        synchronized (ja1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cee663f3", new Object[0]);
            } else {
                s0++;
            }
        }
    }

    public static void S(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd78582", new Object[]{application});
        } else if (u < 0) {
            try {
                new rp0().b(application).c(new Handler()).d(new a()).e();
            } catch (Exception unused) {
                AVSDKLog.e(S0, "start AliHardwareInitializer failed.");
            }
        }
    }

    public static void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedb1294", new Object[0]);
        } else if (l0.booleanValue()) {
            try {
                VariationSet activate = UTABTest.activate("flvconfig_component", "flvconfig_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("config");
                    if (variation != null) {
                        m0 = variation.getValueAsString("");
                    }
                    l0 = Boolean.FALSE;
                }
            } catch (Throwable th) {
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "get initFlvConfigFromAB info failed: " + th.toString());
            }
        }
    }

    public static void X(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea063be", new Object[]{context});
        } else if (!z0 || s()) {
            try {
                VariationSet activate = UTABTest.activate("RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enableRtcConnectOnlyAtWarmup");
                    if (variation != null) {
                        A0 = variation.getValueAsBoolean(false);
                    }
                    ((ConcurrentHashMap) w).put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentId()));
                    mBucketIdIdMap.put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentBucketId()));
                    ((ConcurrentHashMap) x).put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentReleaseId()));
                }
                z0 = true;
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "get mHasGetRtcConnectOnlyConfig info succeed, mEnableRtcConnectOnlyAtWarmup is " + A0);
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get mHasGetRtcConnectOnlyConfig info failed: " + th.toString());
            }
            if (s()) {
                if (!TextUtils.isEmpty(O(context, "RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module", "enableRtcConnectOnlyAtWarmup", ""))) {
                    A0 = Boolean.parseBoolean(O(context, "RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module", "enableRtcConnectOnlyAtWarmup", ""));
                    feh fehVar3 = S0;
                    AVSDKLog.e(fehVar3, "mEnableRtcConnectOnlyAtWarmup is " + A0);
                }
                String N2 = N(context, "RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module", "");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put("RtcConnectOnlyAtWarmup", Long.valueOf(N2));
                }
            }
        }
    }

    public static void Y() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bbc655", new Object[0]);
        } else if (u0) {
            try {
                VariationSet activate = UTABTest.activate("rtcDelayAndRetain_component", "rtcDelayAndRetain_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("rtcDelayParams");
                    if (variation != null) {
                        String valueAsString = variation.getValueAsString("");
                        feh fehVar = S0;
                        AVSDKLog.e(fehVar, "get artp_master_rtc_delay and paramsJsonStr = " + valueAsString);
                        if (!TextUtils.isEmpty(valueAsString) && (parseObject = JSON.parseObject(valueAsString)) != null) {
                            for (String str : parseObject.keySet()) {
                                JSONObject jSONObject = parseObject.getJSONObject(str);
                                if (jSONObject != null) {
                                    Integer integer = jSONObject.getInteger("masterRtcDelay");
                                    if (!(integer == null || v0 == null)) {
                                        ((HashMap) v0).put(str, integer);
                                    }
                                    Integer integer2 = jSONObject.getInteger("rtcGopCacheRetainMs");
                                    if (!(integer2 == null || w0 == null)) {
                                        ((HashMap) w0).put(str, integer2);
                                    }
                                }
                            }
                        }
                    }
                    u0 = false;
                }
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get getRtcDelayAndRetainParamFromAB info failed: " + th.toString());
            }
        }
    }

    public static void Z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335eaec6", new Object[]{context});
            return;
        }
        U(context);
        AtomicBoolean atomicBoolean = a0;
        if (atomicBoolean.get() || c0.get()) {
            if (j0.get() && !c0.get()) {
                AtomicBoolean atomicBoolean2 = d0;
                if (!atomicBoolean2.get()) {
                    feh fehVar = S0;
                    StringBuilder sb = new StringBuilder("get initRtcLiveParamFromAB overwrite by mGlobalABRtcConfigParams: ");
                    AtomicReference<String> atomicReference = mGlobalABRtcConfigParams;
                    sb.append(atomicReference.toString());
                    AVSDKLog.e(fehVar, sb.toString());
                    b0 = atomicReference;
                    atomicBoolean.set(false);
                    atomicBoolean2.set(true);
                    return;
                }
            }
            if (!d0.get() && atomicBoolean.get()) {
                dq.b().execute(new b());
            }
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1785af5e", new Object[]{context});
        } else if (y0 || s()) {
            try {
                s0.a aVar = new s0.a("AudioGain_component", "enableAudioGain_module", "222987");
                VariationSet h2 = s0.h(aVar);
                if (h2 != null && h2.size() > 0) {
                    D0 = ew0.s(s0.e(h2, context, aVar, "enableAudioGain", "false"));
                    y0 = false;
                }
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "get AudioGainParamFromAB mEnableAudioGainABtest:" + D0);
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get AudioGainParamFromAB info failed: " + th.toString());
            }
        }
    }

    public static /* synthetic */ int b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i2)})).intValue();
        }
        u = i2;
        return i2;
    }

    public static void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ea13e3", new Object[0]);
        } else if (p0.get()) {
            dq.b().execute(new d());
        }
    }

    public static /* synthetic */ AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba88d1f8", new Object[0]);
        }
        return a0;
    }

    public static void c0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565270dc", new Object[]{context});
            return;
        }
        U(context);
        AtomicBoolean atomicBoolean = j0;
        if (atomicBoolean.get() && !c0.get()) {
            AtomicBoolean atomicBoolean2 = o0;
            if (!atomicBoolean2.get()) {
                feh fehVar = S0;
                StringBuilder sb = new StringBuilder("get initTBLiveRtcAbrFromAB overwrite by mGlobalABRtcSRSEnabled: ");
                sb.append(atomicBoolean.get());
                sb.append("mGlobalABRtcAdaptionID: ");
                sb.append(k0.get());
                sb.append("mGlobalABRtcAdaptionEnabled: ");
                AtomicBoolean atomicBoolean3 = e0;
                sb.append(atomicBoolean3.get());
                sb.append("mGlobalABRtcAdaptionParamJson: ");
                AtomicReference<String> atomicReference = mGlobalABRtcAdaptionParamJson;
                sb.append(atomicReference.get());
                sb.append("mGlobalABRtcSwitchParamJson: ");
                AtomicReference<String> atomicReference2 = mGlobalABRtcSwitchParamJson;
                sb.append(atomicReference2.get());
                AVSDKLog.e(fehVar, sb.toString());
                mUseRtcAbrId.set(k0.get());
                mUseRtcAbr.set(atomicBoolean3.get());
                mRtcAdaptionParamJson.set(atomicReference.get());
                mRtcSwitchParamJson.set(atomicReference2.get());
                atomicBoolean2.set(true);
                n0.set(false);
                return;
            }
        }
        if (n0.get()) {
            dq.b().execute(new e());
        }
    }

    public static /* synthetic */ AtomicBoolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("559f3a66", new Object[0]);
        }
        return c0;
    }

    public static void d0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74378c6", new Object[]{context});
        } else if (!B0 || s()) {
            try {
                VariationSet activate = UTABTest.activate("WarmupManagerOpt_component", "WarmupManagerOpt_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation(MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT);
                    if (variation != null) {
                        C0 = variation.getValueAsBoolean(false);
                    }
                    ((ConcurrentHashMap) w).put("WarmupManagerOpt", Long.valueOf(activate.getExperimentId()));
                    mBucketIdIdMap.put("WarmupManagerOpt", Long.valueOf(activate.getExperimentBucketId()));
                    ((ConcurrentHashMap) x).put("WarmupManagerOpt", Long.valueOf(activate.getExperimentReleaseId()));
                }
                B0 = true;
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "get mHasGetWarmupManagerConfig info succeed, mEnableWarmupManagerOpt is " + C0);
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get mHasGetWarmupManagerConfig info failed: " + th.toString());
            }
            if (s()) {
                if (!TextUtils.isEmpty(O(context, "WarmupManagerOpt_component", "WarmupManagerOpt_module", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, ""))) {
                    C0 = Boolean.parseBoolean(O(context, "WarmupManagerOpt_component", "WarmupManagerOpt_module", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, ""));
                    feh fehVar3 = S0;
                    AVSDKLog.e(fehVar3, "mEnableWarmupManagerOpt is " + C0);
                }
                String N2 = N(context, "WarmupManagerOpt_component", "WarmupManagerOpt_module", "");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put("WarmupManagerOpt", Long.valueOf(N2));
                }
            }
        }
    }

    public static /* synthetic */ AtomicBoolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5528d467", new Object[0]);
        }
        return p0;
    }

    public static boolean e0() {
        MediaCodecInfo[] codecInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a19ac06", new Object[0])).booleanValue();
        }
        if (P != null) {
            return P.booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                P = Boolean.TRUE;
                return true;
            }
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.equalsIgnoreCase("video/hevc")) {
                            String name = mediaCodecInfo.getName();
                            P = Boolean.valueOf(!ew0.y(name, "OMX.google.") && !ew0.y(name, "c2.android.") && (ew0.y(name, "OMX.") || ew0.y(name, "c2.")));
                        }
                        if (P.booleanValue()) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (Exception e2) {
            AVSDKLog.e(S0, "isMediaCodecListContainH265HardWare error:" + e2.toString());
            P = Boolean.TRUE;
            return true;
        }
    }

    public static /* synthetic */ AtomicBoolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("54b26e68", new Object[0]);
        }
        return n0;
    }

    public static void f0(Context context) {
        Display display;
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e06b8", new Object[]{context});
        } else if (!T0) {
            if (V0 == null) {
                V0 = new ArrayList<>();
            }
            if (Build.VERSION.SDK_INT > 26) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    display = displayManager.getDisplay(0);
                } else {
                    display = null;
                }
                isHdr = display.isHdr();
                U0 = isHdr;
                if (U0) {
                    hdrCapabilities = display.getHdrCapabilities();
                    supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    for (int i2 : supportedHdrTypes) {
                        V0.add(Integer.valueOf(i2));
                    }
                }
            }
            T0 = true;
        }
    }

    public static /* synthetic */ AtomicBoolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("543c0869", new Object[0]);
        }
        return q0;
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfe12779", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "forceUseSoftwareDecodeModeList", "[\"2311DRK48C\",\"23078RKD5C\",\"2407FRK8EC\",\"23090RA98C\"]");
        String str = Build.MODEL;
        boolean n2 = ew0.n(str, config);
        feh fehVar = S0;
        AVSDKLog.e(fehVar, "mForceUseSoftwareDecodeModeList: " + config + ", model: " + str + ", useSoftwareDecide:" + n2);
        return n2;
    }

    public static /* synthetic */ AtomicBoolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba126bf9", new Object[0]);
        }
        return e0;
    }

    public static boolean h0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cefe1fe5", new Object[]{context})).booleanValue();
        }
        if (t == null && context != null) {
            if ("com.taobao.avsdk.test".equals(context.getPackageName())) {
                t = Boolean.TRUE;
            } else {
                t = Boolean.FALSE;
            }
        }
        return t.booleanValue();
    }

    public static /* synthetic */ AtomicBoolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b99c05fa", new Object[0]);
        }
        return f0;
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10361a", new Object[0])).booleanValue();
        }
        return c21.g().getBoolean("isInBackground", true);
    }

    public static /* synthetic */ AtomicBoolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b9259ffb", new Object[0]);
        }
        return g0;
    }

    public static boolean j0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("118c9e74", new Object[]{context})).booleanValue();
        }
        if (!j && context != null) {
            j = true;
            if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion > 196608) {
                k = true;
            }
        }
        return k;
    }

    public static /* synthetic */ AtomicBoolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b8af39fc", new Object[0]);
        }
        return h0;
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a880d358", new Object[0])).booleanValue();
        }
        if (ew0.n(Build.MODEL, OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264))) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ AtomicInteger l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("62a161a7", new Object[0]);
        }
        return i0;
    }

    public static String l0(String str, String str2, String str3) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc5a8902", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        for (String str4 : str2.split(str3)) {
            if (str4.contains(str)) {
                return str4.substring(str4.indexOf("=") + 1);
            }
        }
        return null;
    }

    public static /* synthetic */ AtomicBoolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b7c26dfe", new Object[0]);
        }
        return j0;
    }

    public static String m0(String str, String str2, String str3, String str4, int i2) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e98eff", new Object[]{str, str2, str3, str4, new Integer(i2)});
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
            return str3;
        }
        String[] split = str3.split(str4);
        if (i2 > 0) {
            sb = new StringBuilder(i2);
        } else {
            sb = new StringBuilder();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < split.length; i3++) {
            String str5 = split[i3];
            if (str5.contains(str) && str5.indexOf("=") != -1) {
                if (str5.startsWith(str + "=")) {
                    str5 = str + "=" + str2;
                    z2 = true;
                }
            }
            sb.append(str5);
            if (i3 < split.length - 1) {
                sb.append(str4);
            }
        }
        if (!z2) {
            if (sb.length() > 0) {
                sb.append(str4);
            }
            sb.append(str);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static /* synthetic */ Map n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2db5e974", new Object[0]);
        }
        return w;
    }

    public static void n0(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebeef69", new Object[]{application});
        } else if (f21858a == null) {
            synchronized (ja1.class) {
                try {
                    if (f21858a == null) {
                        f21858a = application;
                        MediaSystemUtils.sApplication = application;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ Map o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a4edef5", new Object[0]);
        }
        return x;
    }

    public static void p(ArrayList<Double> arrayList, Double d2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afe2716", new Object[]{arrayList, d2, new Integer(i2)});
            return;
        }
        while (arrayList.size() > i2) {
            arrayList.remove(0);
        }
        arrayList.add(d2);
    }

    public static void p0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907838be", new Object[]{jSONObject});
            return;
        }
        if (L == null) {
            L = new ArrayList<>();
        }
        if (M == null) {
            M = new ArrayList<>();
        }
        if (N == null) {
            N = new ArrayList<>();
        }
        if (O == null) {
            O = new ArrayList<>();
        }
        if (jSONObject != null) {
            Double d2 = jSONObject.getDouble("totalSize");
            if (d2 != null) {
                p(L, d2, K);
            }
            Double d3 = jSONObject.getDouble("duration");
            if (d3 != null) {
                p(M, d3, K);
            }
            Double d4 = jSONObject.getDouble("firstDataTime");
            if (d4 != null) {
                p(N, d4, K);
            }
            Double d5 = jSONObject.getDouble("recDataTime");
            if (d5 != null) {
                p(O, d5, K);
            }
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcd96c74", new Object[0])).booleanValue();
        }
        return l;
    }

    public static boolean q0(long j2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb96bc84", new Object[]{new Long(j2), new Integer(i2)})).booleanValue();
        }
        if (i2 <= 0 || i2 >= 64 || (j2 & (1 << (i2 - 1))) == 0) {
            return false;
        }
        return true;
    }

    public static synchronized void r() {
        synchronized (ja1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b390f17", new Object[0]);
            } else {
                s0--;
            }
        }
    }

    public static void r0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8002bbf5", new Object[]{context});
        } else if (!X0 || s()) {
            try {
                VariationSet activate = UTABTest.activate("HDRPlayback_component", "HDRPlayback_module");
                if (activate == null || activate.size() <= 0) {
                    AVSDKLog.e(S0, "HDR init ABParam by default");
                } else {
                    Variation variation = activate.getVariation("HDRPlayback");
                    if (variation != null) {
                        Y0 = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("FixSurfaceControl");
                    if (variation2 != null) {
                        a1 = variation2.getValueAsBoolean(false);
                    }
                    Variation variation3 = activate.getVariation("HDRDevices");
                    if (variation3 != null) {
                        b1 = variation3.getValueAsString("[\"24129PN74C\"]");
                    }
                    Variation variation4 = activate.getVariation("HDRSBTForVideo");
                    if (variation4 != null) {
                        c1 = variation4.getValueAsString("[\"guangguang_pick\"]");
                    }
                    ((ConcurrentHashMap) w).put("HDRPlayback", Long.valueOf(activate.getExperimentId()));
                    mBucketIdIdMap.put("HDRPlayback", Long.valueOf(activate.getExperimentBucketId()));
                    ((ConcurrentHashMap) x).put("HDRPlayback", Long.valueOf(activate.getExperimentReleaseId()));
                    X0 = true;
                    feh fehVar = S0;
                    AVSDKLog.e(fehVar, "HDR init ABParam succeed mEnableHDR " + Y0 + " mFixedSurfaceControl " + a1 + " Devices " + b1 + " SBTForVideo " + c1);
                }
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get mInitHDRPlaybackParams info failed: " + th.toString());
            }
            if (s()) {
                if (!TextUtils.isEmpty(O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRPlayback", ""))) {
                    Y0 = Boolean.parseBoolean(O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRPlayback", ""));
                    feh fehVar3 = S0;
                    AVSDKLog.e(fehVar3, "HDR initParam HDRPlayback " + Y0);
                }
                if (!TextUtils.isEmpty(O(context, "HDRPlayback_component", "HDRPlayback_module", "ForceHDRPlayback", ""))) {
                    Z0 = Boolean.parseBoolean(O(context, "HDRPlayback_component", "HDRPlayback_module", "ForceHDRPlayback", ""));
                    feh fehVar4 = S0;
                    AVSDKLog.e(fehVar4, "HDR initParam mForceRealHDR " + Z0);
                }
                if (!TextUtils.isEmpty(O(context, "HDRPlayback_component", "HDRPlayback_module", "FixSurfaceControl", ""))) {
                    a1 = Boolean.parseBoolean(O(context, "HDRPlayback_component", "HDRPlayback_module", "FixSurfaceControl", ""));
                    feh fehVar5 = S0;
                    AVSDKLog.e(fehVar5, "HDR initParam mFixedSurfaceControl " + a1);
                }
                if (!TextUtils.isEmpty(O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRDevices", ""))) {
                    b1 = O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRDevices", "");
                    feh fehVar6 = S0;
                    AVSDKLog.e(fehVar6, "HDR initParam mEnableHDRDevices " + b1);
                }
                if (!TextUtils.isEmpty(O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRSBTForVideo", ""))) {
                    c1 = O(context, "HDRPlayback_component", "HDRPlayback_module", "HDRSBTForVideo", "");
                    feh fehVar7 = S0;
                    AVSDKLog.e(fehVar7, "HDR initParam mEnableHDRSBTForVideo " + c1);
                }
                String N2 = N(context, "HDRPlayback_component", "HDRPlayback_module", "");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put("HDRPlayback", Long.valueOf(N2));
                }
            }
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c3fb8", new Object[0])).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable() || ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableMockRelease", "false"))) {
            return true;
        }
        return false;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48f5338", new Object[0])).booleanValue();
        }
        return x0;
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb304f", new Object[0]);
            return;
        }
        try {
            X = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_DETECT_TID_AND_ACTIVE_DROP_FRAME, "true"));
            Y = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_CHECK_AVG_FPS_AT_60FPS_DROP, "true"));
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HIGH_DEVICE_DISABLE_DROP_FRAME_AT_60_FPS_LIVE, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            tug tugVar = new tug();
            tugVar.d("model", "" + Build.MODEL);
            tugVar.g(config);
            if (tugVar.e()) {
                X = false;
            }
        } catch (Throwable th) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "60fpssupport:get activeDropFrame_component info failed: " + th.toString());
        }
    }

    public static ArrayList<Double> v(ArrayList<Double> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7491dc25", new Object[]{arrayList});
        }
        ArrayList<Double> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Double> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
        }
        return arrayList2;
    }

    public static long w(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73b2874b", new Object[]{context, str, str2})).longValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && context != null) {
            StringBuilder sb = new StringBuilder(128);
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("videoCacheId=" + str);
            }
            String b2 = ew0.b(str2, sb);
            try {
                t7b d2 = a7m.d(context);
                if (d2 == null) {
                    return 0L;
                }
                boolean D2 = d2.D();
                long n2 = D2 ? d2.n(b2) : 0L;
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "check if url=" + b2 + " is hit localFile, bUseVideoCache=" + D2 + ", cacheLength=" + n2);
                return n2;
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "getCacheLengthByCacheKeyAndUrl failed: " + th.toString());
            }
        }
        return 0L;
    }

    public static long x(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81852747", new Object[]{context, str, str2})).longValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && context != null) {
            StringBuilder sb = new StringBuilder(128);
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("videoCacheId=" + str);
            }
            String b2 = ew0.b(str2, sb);
            try {
                t7b d2 = a7m.d(context);
                if (d2 == null) {
                    return 0L;
                }
                long n2 = d2.n(b2);
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "shengjian::check if url=" + b2 + " is hit localFile, cacheLength=" + n2);
                return n2;
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "getCacheLengthByCacheKeyAndUrl failed: " + th.toString());
            }
        }
        return 0L;
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fa781e1", new Object[0])).intValue();
        }
        if (!z.booleanValue()) {
            return -1;
        }
        z = Boolean.valueOf(ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_DYNAMIC_DEBUG_LEVEL, "false")));
        A = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEBUG_LEVEL, "-1"));
        return A;
    }

    public static int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (u >= 0 && u <= 2) {
            return u;
        }
        try {
            u = qp0.b();
        } catch (Throwable unused) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "get deviceLevel error=" + u);
            u = -100;
        }
        return u;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                VariationSet activate = UTABTest.activate(MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG);
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("rtcAdaptionEnabled");
                    if (variation != null) {
                        ja1.h().set(variation.getValueAsBoolean(true));
                    }
                    Variation variation2 = activate.getVariation("rtcAdaptionParamJson");
                    if (variation2 != null) {
                        ja1.mGlobalABRtcAdaptionParamJson.set(variation2.getValueAsString(""));
                    }
                    Variation variation3 = activate.getVariation("rtcSwitchParamJson");
                    if (variation3 != null) {
                        ja1.mGlobalABRtcSwitchParamJson.set(variation3.getValueAsString(""));
                    }
                    Variation variation4 = activate.getVariation("rtcSRSWeakNetFlagEnable");
                    if (variation4 != null) {
                        ja1.i().set(variation4.getValueAsBoolean(false));
                    }
                    Variation variation5 = activate.getVariation("rtcSRSWeakNetSVCDropEnable");
                    if (variation5 != null) {
                        ja1.j().set(variation5.getValueAsBoolean(false));
                    }
                    Variation variation6 = activate.getVariation("rtcSRSWeakNetHoldModeEnable");
                    if (variation6 != null) {
                        ja1.k().set(variation6.getValueAsBoolean(false));
                    }
                    Variation variation7 = activate.getVariation("playerCoreWeakFlagLifeTime");
                    if (variation7 != null) {
                        ja1.l().set(variation7.getValueAsInt(JosStatusCodes.RTN_CODE_COMMON_ERROR));
                    }
                    Variation variation8 = activate.getVariation("rtcSRSCommonParams");
                    if (variation8 != null) {
                        ja1.mGlobalABRtcSRSCommonParams.set(variation8.getValueAsString(""));
                    }
                    Variation variation9 = activate.getVariation("rtcAdaptionID");
                    if (variation9 != null) {
                        ja1.k0.set(variation9.getValueAsInt(0));
                    }
                    Variation variation10 = activate.getVariation("isEnabled");
                    if (variation10 != null) {
                        ja1.m().set(variation10.getValueAsBoolean(false));
                    }
                    Variation variation11 = activate.getVariation("rtcConfigParams");
                    if (variation11 != null) {
                        ja1.mGlobalABRtcConfigParams.set(variation11.getValueAsString(""));
                    }
                    ja1.n().put("AB_GLOBAL_RTC", Long.valueOf(activate.getExperimentId()));
                    ja1.mBucketIdIdMap.put("AB_GLOBAL_RTC", Long.valueOf(activate.getExperimentBucketId()));
                    ja1.o().put("AB_GLOBAL_RTC", Long.valueOf(activate.getExperimentReleaseId()));
                    AVSDKLog.e(ja1.S0, "get initGlobalParamFromAB success");
                    ja1.d().set(false);
                }
            } catch (Throwable th) {
                feh fehVar = ja1.S0;
                AVSDKLog.e(fehVar, "get initGlobalParamFromAB info failed: " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("AB_TBLIVE_RTC_ABR_COMPONENT", "AB_TBLIVE_RTC_ABR_MODULE_20230731");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("useRtcAbr");
                    if (variation != null) {
                        ja1.mUseRtcAbr.set(variation.getValueAsBoolean(true));
                    }
                    Variation variation2 = activate.getVariation("rtcAbrId");
                    if (variation2 != null) {
                        ja1.mUseRtcAbrId.set(variation2.getValueAsInt(0));
                    }
                    Variation variation3 = activate.getVariation("rtcAdaptionParamJson");
                    if (variation3 != null) {
                        ja1.mRtcAdaptionParamJson.set(variation3.getValueAsString(""));
                    }
                    Variation variation4 = activate.getVariation("rtcSwitchParamJson");
                    if (variation4 != null) {
                        ja1.mRtcSwitchParamJson.set(variation4.getValueAsString(""));
                    }
                    Variation variation5 = activate.getVariation("rtcAbrDynamicEnable");
                    if (variation5 != null) {
                        ja1.mRtcAbrDynamicEnable.set(variation5.getValueAsBoolean(false));
                    }
                    Variation variation6 = activate.getVariation("rtcAdaptionAutoSwitch");
                    if (variation6 != null) {
                        ja1.mRtcAdaptionAutoSwitch.set(variation6.getValueAsBoolean(true));
                    }
                    Variation variation7 = activate.getVariation("enableLowDeviceSwitchUd");
                    if (variation7 != null) {
                        ja1.mEnableLowDeviceSwitchUd.set(variation7.getValueAsBoolean(false));
                    }
                    ja1.n().put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentId()));
                    ja1.mBucketIdIdMap.put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentBucketId()));
                    ja1.o().put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentReleaseId()));
                    AVSDKLog.e(ja1.S0, "get initRtcLiveParamFromAB info success");
                    ja1.f().set(false);
                }
            } catch (Throwable th) {
                feh fehVar = ja1.S0;
                AVSDKLog.e(fehVar, "get initRtcLiveParamFromAB info failed: " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("lowspeed_component", "lowspeed_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enable");
                    if (variation != null) {
                        ja1.mEnableLowSpeedPolicyAB.set(variation.getValueAsBoolean(false));
                    }
                    Variation variation2 = activate.getVariation("id");
                    if (variation2 != null) {
                        ja1.mLowSpeedPolicyABId.set(variation2.getValueAsInt(0));
                    }
                    Variation variation3 = activate.getVariation("config");
                    if (variation3 != null) {
                        ja1.mLowSpeedPolicyABConfigValue.set(variation3.getValueAsString(""));
                    }
                    Variation variation4 = activate.getVariation(x96.PATH_OPERATOR);
                    if (variation4 != null) {
                        ja1.mLowSpeedPolicyOperator.set(variation4.getValueAsBoolean(false));
                    }
                    Variation variation5 = activate.getVariation("enableRtcWeakNetFlag");
                    if (variation5 != null) {
                        ja1.mEnableSRSByRTCWeakNetFlag.set(variation5.getValueAsBoolean(false));
                    }
                    Variation variation6 = activate.getVariation("enableRtcWeakNetSVCDrop");
                    if (variation6 != null) {
                        ja1.mEnableLiveRtcWeakNetSVCDrop.set(variation6.getValueAsBoolean(false));
                    }
                    Variation variation7 = activate.getVariation("enableRtcWeakNetHoldMode");
                    if (variation7 != null) {
                        ja1.mEnableLiveRtcWeakNetHoldMode.set(variation7.getValueAsBoolean(false));
                    }
                    Variation variation8 = activate.getVariation("configOfNewPolicy");
                    if (variation8 != null) {
                        ja1.mLowSpeedNewPolicyConfigValue.set(variation8.getValueAsString(""));
                    }
                    Variation variation9 = activate.getVariation("defDeciseWindow");
                    if (variation9 != null) {
                        ja1.mDefinitionDeciseWindow.set(variation9.getValueAsInt(180000));
                    }
                    Variation variation10 = activate.getVariation("enCdnStartPlaySpeed");
                    if (variation10 != null) {
                        ja1.mEnableCdnStartPlaySpeed.set(variation10.getValueAsBoolean(true));
                    }
                    Variation variation11 = activate.getVariation("artpCommonParams");
                    if (variation11 != null) {
                        ja1.mLowSpeedArtpCommonParamsJson.set(variation11.getValueAsString(""));
                    }
                    Variation variation12 = activate.getVariation("enableHomePageCardSVCDrop");
                    if (variation12 != null) {
                        ja1.mEnableLiveRtcHomePageCardSVCDrop.set(variation12.getValueAsBoolean(false));
                    }
                    ja1.n().put("lowspeed", Long.valueOf(activate.getExperimentId()));
                    ja1.mBucketIdIdMap.put("lowspeed", Long.valueOf(activate.getExperimentBucketId()));
                    ja1.o().put("lowspeed", Long.valueOf(activate.getExperimentReleaseId()));
                    ja1.g().set(false);
                }
            } catch (Throwable th) {
                feh fehVar = ja1.S0;
                AVSDKLog.e(fehVar, "initLowSpeedPolicyABIfNeeded error: " + th.toString());
            }
        }
    }

    public static String N(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73f14ae", new Object[]{context, str, str2, str3});
        }
        try {
        } catch (Throwable th) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "get SharedPreferences value failed: " + th.toString());
        }
        if (context == null) {
            AVSDKLog.e(S0, "getSharedPreferencesABMockValue failed by context is null ");
            return "";
        }
        SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("ab_mock_value", 0);
        if (sharedPreferences2 == null) {
            AVSDKLog.e(S0, "prefs is null ");
        } else {
            String string = sharedPreferences2.getString(str + "_" + str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject parseObject = JSON.parseObject(string);
                if (parseObject.containsKey("experimentBucketId")) {
                    return parseObject.getString("experimentBucketId");
                }
            }
        }
        if (TextUtils.isEmpty(str3) || (sharedPreferences = context.getApplicationContext().getSharedPreferences("CheckedStates", 0)) == null) {
            return "";
        }
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.containsKey(str3)) {
            Object obj = all.get(str3);
            if (obj instanceof Integer) {
                String valueOf = String.valueOf(obj);
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, str + "_" + str2 + "_BucketId" + valueOf);
                return valueOf;
            }
        }
        return "";
    }

    public static String P(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b135a7", new Object[]{context, str, str2});
        }
        try {
            sharedPreferences = context.getApplicationContext().getSharedPreferences("orange_mock_value", 0);
        } catch (Throwable th) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "get SharedPreferences value failed: " + th.toString());
        }
        if (sharedPreferences == null) {
            return "";
        }
        String string = sharedPreferences.getString(str + "_" + str2, "");
        feh fehVar2 = S0;
        StringBuilder sb = new StringBuilder("get SharedPreferences value is ");
        sb.append(string);
        AVSDKLog.e(fehVar2, sb.toString());
        return !TextUtils.isEmpty(string) ? string : "";
    }

    public static void U(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577281dc", new Object[]{context});
            return;
        }
        AtomicBoolean atomicBoolean = c0;
        if (atomicBoolean.get()) {
            if (MediaSystemUtils.isApkDebuggable()) {
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionEnabled", ""))) {
                    e0.set(Boolean.parseBoolean(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionEnabled", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionParamJson", ""))) {
                    mGlobalABRtcAdaptionParamJson.set(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionParamJson", ""));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSwitchParamJson", ""))) {
                    mGlobalABRtcSwitchParamJson.set(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSwitchParamJson", ""));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetFlagEnable", ""))) {
                    f0.set(Boolean.parseBoolean(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetFlagEnable", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetSVCDropEnable", ""))) {
                    g0.set(Boolean.parseBoolean(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetSVCDropEnable", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetHoldModeEnable", ""))) {
                    h0.set(Boolean.parseBoolean(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSWeakNetHoldModeEnable", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "playerCoreWeakFlagLifeTime", ""))) {
                    i0.set(Integer.parseInt(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "playerCoreWeakFlagLifeTime", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSCommonParams", ""))) {
                    mGlobalABRtcSRSCommonParams.set(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcSRSCommonParams", ""));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionID", ""))) {
                    k0.set(Integer.parseInt(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcAdaptionID", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "isEnabled", ""))) {
                    j0.set(Boolean.parseBoolean(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "isEnabled", "")));
                }
                if (!TextUtils.isEmpty(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcConfigParams", ""))) {
                    mGlobalABRtcConfigParams.set(O(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "rtcConfigParams", ""));
                }
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "initGlobalParamFromAB mock mGlobalABRtcAdaptionEnabled is " + e0 + ", mGlobalABRtcAdaptionParamJson:" + mGlobalABRtcAdaptionParamJson + ", mGlobalABRtcSwitchParamJson:" + mGlobalABRtcSwitchParamJson + ", mGlobalABRtcSRSWeakNetFlagEnable:" + f0 + ", mGlobalABRtcSRSWeakNetSVCDropEnable:" + g0 + ", mGlobalABRtcSRSWeakNetHoldModeEnable:" + h0 + ", mGlobalABRtcSRSCommonParams:" + mGlobalABRtcSRSCommonParams + ", mGlobalABRtcAdaptionID:" + k0 + ", mGlobalABIsEnabled:" + j0 + ", mGlobalABRtcConfigParams:" + mGlobalABRtcConfigParams);
                String N2 = N(context, MediaConstant.ABTEST_GLOBAL_PARAMS_COMOPONENT_DEBUG, MediaConstant.ABTEST_GLOBAL_PARAMS_MODULE_DEBUG, "");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put("AB_GLOBAL_RTC", Long.valueOf(N2));
                }
                atomicBoolean.set(false);
                return;
            }
            dq.b().execute(new c());
        }
    }

    public static void W(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16080ae0", new Object[]{context});
        } else if (G0) {
            try {
                s0.a aVar = new s0.a("reuseMediaCodec_component", "reuseMediaCodec_module", "233709");
                VariationSet h2 = s0.h(aVar);
                if (h2 != null && h2.size() > 0) {
                    E0 = ew0.s(s0.e(h2, context, aVar, "enable", "false"));
                    F0 = s0.e(h2, context, aVar, "sbtWhiteList", "[\"LiveRoom\"]");
                    H0 = ew0.s(s0.e(h2, context, aVar, "newCodecAfterConfigError", "false"));
                    I0 = ew0.u(s0.e(h2, context, aVar, "mediaCodecPoolSize", "2"));
                    L0 = s0.e(h2, context, aVar, "deviceLevelWhiteList", "[0,1,2]");
                    G0 = false;
                }
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "ReuseVideoMediaCodec initReuseMediaCodecFromAB is " + E0 + ", mMediaCodecReuseSBTWhiteList:" + F0 + ", mNewMediaCodecAfterConfigError:" + H0 + ", mediaCodecPoolSize:" + I0);
            } catch (Throwable th) {
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "get initReuseMediaCodecFromAB info failed: " + th.toString());
            }
        }
    }

    public static void a0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21d5f19", new Object[]{context});
        } else if (!B.booleanValue() || s()) {
            try {
                VariationSet activate = UTABTest.activate("RtcNewBuffer_component", "RtcNewBuffer_module");
                if (activate == null || activate.size() <= 0) {
                    AVSDKLog.e(S0, "RtcNewBuffer_component RtcNewBuffer_module init failed.");
                } else {
                    Variation variation = activate.getVariation("enableRtcNewBufferStrategy");
                    if (variation != null) {
                        C = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("enableAudioFFmpegPlc");
                    if (variation2 != null) {
                        D = variation2.getValueAsBoolean(false);
                    }
                    Variation variation3 = activate.getVariation("disableAudioSlowPlay");
                    if (variation3 != null) {
                        E = variation3.getValueAsBoolean(false);
                    }
                    Variation variation4 = activate.getVariation("sourcerPipeMaxBufferRatio");
                    if (variation4 != null) {
                        F = variation4.getValueAsInt(20);
                    }
                    Variation variation5 = activate.getVariation("fastFrameTime");
                    if (variation5 != null) {
                        G = variation5.getValueAsInt(300);
                    }
                    Variation variation6 = activate.getVariation("sourcerPipeStartRatio");
                    if (variation6 != null) {
                        H = variation6.getValueAsFloat(0.5f);
                    }
                    Variation variation7 = activate.getVariation("sourcerPipeBufferingRatio");
                    if (variation7 != null) {
                        I = variation7.getValueAsFloat(0.5f);
                    }
                    ((ConcurrentHashMap) w).put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentId()));
                    mBucketIdIdMap.put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentBucketId()));
                    ((ConcurrentHashMap) x).put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentReleaseId()));
                    AVSDKLog.e(S0, "RtcNewBuffer_component RtcNewBuffer_module init success.");
                    B = Boolean.TRUE;
                }
            } catch (Throwable th) {
                feh fehVar = S0;
                AVSDKLog.e(fehVar, "get RtcNewBuffer_component info failed: " + th.toString());
            }
            if (s()) {
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableRtcNewBufferStrategy", ""))) {
                    C = Boolean.parseBoolean(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableRtcNewBufferStrategy", ""));
                    feh fehVar2 = S0;
                    AVSDKLog.e(fehVar2, "mEnableRtcNewBufferStrategy is " + C);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableAudioFFmpegPlc", ""))) {
                    D = Boolean.parseBoolean(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableAudioFFmpegPlc", ""));
                    feh fehVar3 = S0;
                    AVSDKLog.e(fehVar3, "mEnableAudioFFmpegPlc is " + D);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "disableAudioSlowPlay", ""))) {
                    E = Boolean.parseBoolean(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "disableAudioSlowPlay", ""));
                    feh fehVar4 = S0;
                    AVSDKLog.e(fehVar4, "mDisableAudioSlowPlay is " + E);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeMaxBufferRatio", ""))) {
                    F = Integer.parseInt(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeMaxBufferRatio", ""));
                    feh fehVar5 = S0;
                    AVSDKLog.e(fehVar5, "mSourcerPipeMaxBufferRatio is " + F);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "fastFrameTime", ""))) {
                    G = Integer.parseInt(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "fastFrameTime", ""));
                    feh fehVar6 = S0;
                    AVSDKLog.e(fehVar6, "mFastFrameTime is " + G);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeStartBufferRatio", ""))) {
                    H = Float.parseFloat(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeStartBufferRatio", ""));
                    feh fehVar7 = S0;
                    AVSDKLog.e(fehVar7, "mSourcerPipeStartRatio is " + H);
                }
                if (!TextUtils.isEmpty(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeBufferingRatio", ""))) {
                    I = Float.parseFloat(O(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeBufferingRatio", ""));
                    feh fehVar8 = S0;
                    AVSDKLog.e(fehVar8, "mSourcerPipeBufferingRatio is " + I);
                }
                String N2 = N(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "220201");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(N2));
                }
            }
        }
    }

    public static void o0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befae6c4", new Object[]{jSONObject});
            return;
        }
        try {
            if (J == null) {
                J = new JSONArray();
            }
            synchronized (ja1.class) {
                if (J.size() >= K) {
                    J.remove(0);
                }
                J.add(jSONObject);
                p0(jSONObject);
            }
        } catch (Exception e2) {
            feh fehVar = S0;
            AVSDKLog.e(fehVar, "setNetCutList failed!" + e2.toString());
        }
    }

    public static void V(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3321e1", new Object[]{context});
            return;
        }
        U(context);
        AtomicBoolean atomicBoolean = j0;
        if (atomicBoolean.get() && !c0.get()) {
            AtomicBoolean atomicBoolean2 = r0;
            if (!atomicBoolean2.get()) {
                feh fehVar = S0;
                StringBuilder sb = new StringBuilder("get initLowSpeedPolicyFromAB overwrite by mGlobalABRtcSRSEnabled: ");
                sb.append(atomicBoolean.get());
                sb.append("mGlobalABRtcSRSWeakNetFlagEnable: ");
                AtomicBoolean atomicBoolean3 = f0;
                sb.append(atomicBoolean3.get());
                sb.append("mGlobalABRtcSRSWeakNetSVCDropEnable: ");
                AtomicBoolean atomicBoolean4 = g0;
                sb.append(atomicBoolean4.get());
                sb.append("mGlobalABRtcSRSWeakNetHoldModeEnable: ");
                AtomicBoolean atomicBoolean5 = h0;
                sb.append(atomicBoolean5.get());
                sb.append("mGlobalABPlayerCoreWeakFlagLifeTime:");
                AtomicInteger atomicInteger = i0;
                sb.append(atomicInteger.get());
                sb.append("mGlobalABRtcSRSCommonParams: ");
                AtomicReference<String> atomicReference = mGlobalABRtcSRSCommonParams;
                sb.append(atomicReference.get());
                AVSDKLog.e(fehVar, sb.toString());
                mEnableSRSByRTCWeakNetFlag.set(atomicBoolean3.get());
                mEnableLiveRtcWeakNetSVCDrop.set(atomicBoolean4.get());
                mEnableLiveRtcWeakNetHoldMode.set(atomicBoolean5.get());
                mWeakNetFlagLifeTime.set(atomicInteger.get());
                mLowSpeedArtpCommonParamsJson.set(atomicReference.get());
                atomicBoolean2.set(true);
                q0.set(false);
                return;
            }
        }
        if (q0.get()) {
            if (MediaSystemUtils.isApkDebuggable()) {
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "id", ""))) {
                    mLowSpeedPolicyABId.set(Integer.parseInt(O(context, "lowspeed_component", "lowspeed_module", "id", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetFlag", ""))) {
                    mEnableSRSByRTCWeakNetFlag.set(Boolean.parseBoolean(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetFlag", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "playerCoreWeakFlagLifeTime", ""))) {
                    mWeakNetFlagLifeTime.set(Integer.parseInt(O(context, "lowspeed_component", "lowspeed_module", "playerCoreWeakFlagLifeTime", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetSVCDrop", ""))) {
                    mEnableLiveRtcWeakNetSVCDrop.set(Boolean.parseBoolean(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetSVCDrop", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetHoldMode", ""))) {
                    mEnableLiveRtcWeakNetHoldMode.set(Boolean.parseBoolean(O(context, "lowspeed_component", "lowspeed_module", "enableRtcWeakNetHoldMode", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "enableHomePageCardSVCDrop", ""))) {
                    mEnableLiveRtcHomePageCardSVCDrop.set(Boolean.parseBoolean(O(context, "lowspeed_component", "lowspeed_module", "enableHomePageCardSVCDrop", "")));
                }
                if (!TextUtils.isEmpty(O(context, "lowspeed_component", "lowspeed_module", "artpCommonParams", ""))) {
                    mLowSpeedArtpCommonParamsJson.set(O(context, "lowspeed_component", "lowspeed_module", "artpCommonParams", ""));
                }
                feh fehVar2 = S0;
                AVSDKLog.e(fehVar2, "initLowSpeedPolicyFromAB mock mLowSpeedPolicyABId is " + mLowSpeedPolicyABId + ", mEnableSRSByRTCWeakNetFlag:" + mEnableSRSByRTCWeakNetFlag + ", mEnableLiveRtcWeakNetSVCDrop:" + mEnableLiveRtcWeakNetSVCDrop + ", mEnableLiveRtcHomePageCardSVCDrop:" + mEnableLiveRtcHomePageCardSVCDrop + ", mLowSpeedArtpCommonParamsJson:" + mLowSpeedArtpCommonParamsJson);
                String N2 = N(context, "lowspeed_component", "lowspeed_module", "");
                if (!TextUtils.isEmpty(N2)) {
                    mBucketIdIdMap.put("lowspeed", Long.valueOf(N2));
                    return;
                }
                return;
            }
            dq.b().execute(new f());
        }
    }

    static {
        t2o.a(774897857);
        Boolean bool = Boolean.TRUE;
        z = bool;
        l0 = bool;
    }
}
