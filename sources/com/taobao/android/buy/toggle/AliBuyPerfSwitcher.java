package com.taobao.android.buy.toggle;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.Constants;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.ck;
import tb.dn;
import tb.ey1;
import tb.qf;
import tb.qp0;
import tb.rbb;
import tb.t2o;
import tb.th;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliBuyPerfSwitcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HOLD_INTERVAL_IN_MILLS = 60000;
    private static final String ORANGE_GROUP_NAME = "aura_purchase_perf";
    private static final String PERF_AB_TEST = "perfABTest";
    private static final String TAG = "AliBuyPerfSwitcher";
    private static long sLastRefreshTime;
    private static final Map<String, Boolean> sRealResult;
    private static final Map<String, Boolean> sCacheOrange = new HashMap();
    private static volatile String sCacheBucket = null;
    private static boolean sHasInit = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AliBuyPerfSwitcher.access$000();
            }
        }
    }

    static {
        t2o.a(301990095);
        HashMap hashMap = new HashMap();
        sRealResult = hashMap;
        Boolean bool = Boolean.FALSE;
        hashMap.put("enableTouchDownPerf", bool);
        hashMap.put("enableFragmentPerf", bool);
        hashMap.put("enableAnimPerf", bool);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            loadBucket();
        }
    }

    public static void asyncLoadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8cc893", new Object[0]);
        } else {
            dn.h(new a());
        }
    }

    private static boolean disableLocalSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32c21cc", new Object[]{str})).booleanValue();
        }
        return new File(ey1.SWITCH_FILE_DIR + str).exists();
    }

    public static void dumpLog() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da11e937", new Object[0]);
            return;
        }
        rbb g = ck.g();
        StringBuilder sb = new StringBuilder("一休开关：");
        sb.append(sCacheOrange);
        sb.append("\n 真实开关：");
        Map<String, Boolean> map = sRealResult;
        sb.append(map);
        String sb2 = sb.toString();
        ck.b i = ck.b.b().i("AURA/performance");
        if (sCacheBucket == null) {
            str = "null";
        } else {
            str = sCacheBucket;
        }
        g.e(sb2, i.g(TBImageFlowMonitor.BUCKET_INFO, str).a());
        map.clear();
    }

    public static boolean enableAnimPerf() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7232d48", new Object[0])).booleanValue();
        }
        if (isCurrentPerfEnable("enableAnimPerf", "hitFourStagePerf", "enableAnimPerf", "true") && isHighDeviceLevel()) {
            z = true;
        }
        recordLog("enableAnimPerf", z);
        return z;
    }

    public static boolean enableAsyncPreloadMainPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615db1a3", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableAsyncPreloadMainPage", "true");
        recordLog("enableAsyncPreloadMainPage", isEnable);
        return isEnable;
    }

    public static boolean enableAsyncUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c5fa3", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableAsyncUT", "true");
        recordLog("enableAsyncUT", isEnable);
        return isEnable;
    }

    public static boolean enableAuraPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c57e0ae", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableAuraPreload", "true");
        recordLog("enableAuraPreload", isEnable);
        return isEnable;
    }

    public static boolean enableBoostCpu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("398ce633", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableBoostCpu", "hitBoostCpu", "enableBoostCpu", "true");
        recordLog("enableBoostCpu", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableBudgetCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f9ed45", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableBudgetCache", "hitBudgetCache", "enableBudgetCache", "true");
        recordLog("enableBudgetCache", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableCombineRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a1127d", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableCombineRender", "true");
        recordLog("enableCombineRender", isEnable);
        return isEnable;
    }

    public static boolean enableForceMainThreadPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec63ae7f", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableForceMainThreadPerf", "true");
        recordLog("enableForceMainThreadPerf", isEnable);
        return isEnable;
    }

    public static boolean enableFragmentPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ce5507", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableFragmentPerf", "hitFragmentPerf", "enableFragmentPerf", "true");
        recordLog("enableFragmentPerf", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableIdlePerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e7a380b", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableIdlePerf", "true");
        recordLog("enableIdlePerf", isEnable);
        return isEnable;
    }

    public static boolean enableIdleRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fcfe78", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableIdleRender", "true");
        recordLog("enableIdleRender", isEnable);
        return isEnable;
    }

    public static boolean enableInteractionPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894690a3", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableInteractionPerf", "true");
        recordLog("enableInteractionPerf", isEnable);
        return isEnable;
    }

    public static boolean enableJSBridgePreRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a149350c", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableJSBridgePreRequest", "true");
        if (!isEnable) {
            isEnable = isEnable("enableTouchDownPerf", "true");
        }
        recordLog("enableJSBridgePreRequest", isEnable);
        return isEnable;
    }

    private static boolean enableLocalSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d91e91", new Object[]{str})).booleanValue();
        }
        return new File(ey1.SWITCH_FILE_DIR + str).exists();
    }

    public static boolean enableLogPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfcde0d5", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableLogPerf", "true");
        recordLog("enableLogPerf", isEnable);
        return isEnable;
    }

    public static boolean enableLogicPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d22c7af", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableLogicV2Perf", "true");
        recordLog("enableLogicV2Perf", isEnable);
        return isEnable;
    }

    public static boolean enableNativeRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7724a3b", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableNativeRender", "hitNativeRender", "enableNativeRender", "true");
        recordLog("enableNativeRender", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableNavPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d9597b4", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableNavPerf", "true");
        recordLog("enableNavPerf", isEnable);
        return isEnable;
    }

    public static boolean enableNavResolve() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("504fbbb7", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableNavResolve", "true");
        recordLog("enableNavResolve", isEnable);
        return isEnable;
    }

    public static boolean enableOtherPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2e58561", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableOtherV2Perf", "true");
        recordLog("enableOtherPerf", isEnable);
        return isEnable;
    }

    public static boolean enableParsePerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b2ce04", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableParsePerf", "true");
        recordLog("enableParsePerf", isEnable);
        return isEnable;
    }

    public static boolean enableParsePerfV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8807b060", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableParsePerfV4", "true");
        recordLog("enableParsePerfV4", isEnable);
        return isEnable;
    }

    public static boolean enablePopupWindowStreamResponse() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59cefe05", new Object[0])).booleanValue();
        }
        z = isCurrentPerfEnable("enablePopupWindowStreamResponseV2", "hitPopupWindowStreamResponse", "enablePopupWindowStreamResponse", "true");
        if (th.c()) {
            if (z && !disableLocalSwitch(".disablePopupWindowStreamResponse")) {
                z = true;
            }
        }
        recordLog("enablePopupWindowStreamResponseV2", z);
        return z;
    }

    public static boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enablePreRender", "true");
        recordLog("enablePreRender", isEnable);
        return isEnable;
    }

    public static boolean enablePrefetch() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44938025", new Object[0])).booleanValue();
        }
        z = isEnable("enablePrefetchPerf", "true");
        if (th.c()) {
            if (z && !disableLocalSwitch(".disablePrefetchPerf")) {
                z = true;
            }
        }
        recordLog("enablePrefetchPerf", z);
        return z;
    }

    public static boolean enablePrefetchV2() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2845e41", new Object[0])).booleanValue();
        }
        z = isEnable("enablePrefetchV2", "true");
        if (th.c()) {
            if (z && !disableLocalSwitch(".disablePrefetchPerf")) {
                z = true;
            }
        }
        recordLog("enablePrefetchV2", z);
        return z;
    }

    public static boolean enablePreloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4119d6", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enablePreloadView", "true");
        recordLog("enablePreloadView", isEnable);
        return isEnable;
    }

    public static boolean enableSchedulePerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33dcce4e", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableSchedulePerf", "hitSchedulePerf", "enableSchedulePerf", "true");
        recordLog("enableSchedulePerf", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableSmoothButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eff73e7c", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableSmoothButter", "hitSmoothButter", "enableSmoothButter", "true");
        recordLog("enablePreRender", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableStreamJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("741d8176", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableStreamJson", "true");
        recordLog("enableStreamJson", isEnable);
        return isEnable;
    }

    public static boolean enableStreamResponse() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c59acf", new Object[0])).booleanValue();
        }
        z = isCurrentPerfEnable("enableStreamResponse", "hitStreamResponse", "enableStreamResponse", "true");
        if (th.c()) {
            if (z && !disableLocalSwitch(".disableStreamResponse")) {
                z = true;
            }
        }
        recordLog("enableStreamResponse", z);
        return z;
    }

    public static boolean enableThreadPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80ccb381", new Object[0])).booleanValue();
        }
        boolean z = !isCurrentPerfEnable("enableThreadPerf", "hitThreadPerf", "enableThreadPerf", "true");
        recordLog("enableThreadPerf", z);
        return z;
    }

    public static boolean enableTouchDownPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f6df52", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableTouchDownPerf", "true");
        if (!isEnable) {
            isEnable = isEnable("enableJSBridgePreRequest", "true");
        }
        recordLog("enableTouchDownPerf", isEnable);
        return isEnable;
    }

    public static Map<String, Object> getABTestParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4597facb", new Object[0]);
        }
        String realBucket = getRealBucket();
        if (TextUtils.isEmpty(realBucket)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PERF_AB_TEST, (Object) new JSONObject(realBucket) { // from class: com.taobao.android.buy.toggle.AliBuyPerfSwitcher.2
            public final /* synthetic */ String val$hit;

            {
                this.val$hit = realBucket;
                put("hit", (Object) realBucket);
            }
        });
        return jSONObject;
    }

    private static String getBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[0]);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - sLastRefreshTime > 60000) {
            sLastRefreshTime = uptimeMillis;
            asyncLoadBucket();
        }
        return sCacheBucket;
    }

    public static String getRealBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2de9949b", new Object[0]);
        }
        return getBucket();
    }

    public static String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, str2);
    }

    private static boolean isCurrentPerfEnable(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e77d14e", new Object[]{str, str2, str3, str4})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, "enableAllPerf", "false");
        String config2 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str2, "false");
        String config3 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str3, "false");
        String string = getString(str, str4);
        String bucket = getBucket();
        if (Boolean.parseBoolean(string)) {
            if ("true".equalsIgnoreCase(config)) {
                return true;
            }
            if (!"0".equalsIgnoreCase(bucket) && (("1".equalsIgnoreCase(bucket) && "true".equalsIgnoreCase(config3)) || str3.equals(bucket) || "true".equalsIgnoreCase(config2))) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder(Constants.LOCAL_SWITCH_PREFIX);
        sb.append(str);
        return new File(sb.toString()).exists();
    }

    private static boolean isEnable(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b153486c", new Object[]{str, str2})).booleanValue();
        }
        return "true".equals(getString(str, str2));
    }

    public static boolean isHighDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4e8e8cd", new Object[0])).booleanValue();
        }
        if (qp0.b() == 0) {
            return true;
        }
        return false;
    }

    private static boolean isSwitchOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94046c8", new Object[]{context, str})).booleanValue();
        }
        return EVO.isSwitchOpened(context, str);
    }

    private static void loadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815d02f7", new Object[0]);
            return;
        }
        sCacheBucket = qf.a("AB_BUY", "BUY_PERFORMANCE_EXPERIMENT", "hit", "");
        rbb g = ck.g();
        g.d("sCacheBucket " + sCacheBucket);
    }

    private static void recordLog(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9210fd0", new Object[]{str, new Boolean(z)});
        } else {
            sCacheOrange.put(str, Boolean.valueOf(z));
        }
    }

    public static void syncPreloadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cd2aff", new Object[0]);
        } else if (!sHasInit) {
            loadBucket();
            sHasInit = true;
        }
    }

    public static void updatePerfSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b868ee7d", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            if (sCacheOrange.get(str).booleanValue() != z) {
                rbb g = ck.g();
                g.e("当前开关" + str + ",更新值：" + z, ck.b.b().i("AURA/performance").a());
                sRealResult.put(str, Boolean.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean isCurrentPerfEnable(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3417f3a", new Object[]{str, str2})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, "enableAllPerf", "false");
        String string = getString(str, str2);
        String bucket = getBucket();
        if (!"true".equals(config)) {
            return Boolean.parseBoolean(string) && !"0".equalsIgnoreCase(bucket);
        }
        return true;
    }
}
