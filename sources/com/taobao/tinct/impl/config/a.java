package com.taobao.tinct.impl.config;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tinct.impl.config.TinctConfig;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import tb.h9f;
import tb.m7l;
import tb.n48;
import tb.owt;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_IS_TINCT_ENABLE = "tinctEnable";
    public static final String CONFIG_IS_TINCT_LAUNCH_ENABLE = "tinctLaunchEnable";
    public static final String CONFIG_ORANGE_BIZ_MAP = "mtopMapper";
    public static final String CONFIG_TICNT_JSON = "tinct_json_config";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13830a = true;
    public static TinctConfig b;
    public static Map<String, BizMapperModel> c;
    public static int d;
    public static String e;
    public static String f;
    public static boolean g;

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2200e413", new Object[0])).booleanValue();
        }
        return b.inlineStatisticsConfig.isMonitorEnable;
    }

    public static boolean B(h9f h9fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb8fcf6", new Object[]{h9fVar})).booleanValue();
        }
        if (!b.inlineStatisticsConfig.isStatisticsEnable || h9fVar == null || !InstantPatchChangeInfo.TYPE_BETA.equals(h9fVar.getVerType())) {
            return false;
        }
        int i = b.inlineStatisticsConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b38849f", new Object[0])).booleanValue();
        }
        return b.instantStatisticsConfig.isMonitorEnable;
    }

    public static boolean D(InstantPatchChangeInfo instantPatchChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c49d64", new Object[]{instantPatchChangeInfo})).booleanValue();
        }
        if (!b.instantStatisticsConfig.isStatisticsEnable || instantPatchChangeInfo == null || !InstantPatchChangeInfo.TYPE_BETA.equals(instantPatchChangeInfo.getVerType())) {
            return false;
        }
        int i = b.instantStatisticsConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22c99c43", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean F(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631e6d1", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null) {
            return false;
        }
        return e2.launchStatistics;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7f8ea6", new Object[0])).booleanValue();
        }
        return b.orangeStatisticsConfig.isMonitorEnable;
    }

    public static boolean I(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d6e1d6", new Object[]{orangeChangeInfo})).booleanValue();
        }
        TinctConfig.OrangeConfig orangeConfig = b.orangeStatisticsConfig;
        if (!orangeConfig.isStatisticsEnable) {
            return false;
        }
        if ((orangeConfig.onlyGray && !orangeChangeInfo.isGray()) || b.orangeStatisticsConfig.blackList.contains(orangeChangeInfo.getNameSpace())) {
            return false;
        }
        int i = b.orangeStatisticsConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f62146e", new Object[0])).booleanValue();
        }
        return f13830a;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88c425de", new Object[0])).booleanValue();
        }
        return b.touchstoneConfig.isMonitorEnable;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80177f61", new Object[0])).booleanValue();
        }
        TinctConfig.TouchstoneConfig touchstoneConfig = b.touchstoneConfig;
        if (!touchstoneConfig.isStatisticsEnable || touchstoneConfig.whiteList.size() <= 0) {
            return false;
        }
        int i = b.touchstoneConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static Map<String, BizMapperModel> M(String str) {
        BizMapperModel bizMapperModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fdc1a47", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONArray parseArray = JSON.parseArray(str);
            for (int i = 0; i < parseArray.size(); i++) {
                String string = parseArray.getString(i);
                if (!TextUtils.isEmpty(string) && (bizMapperModel = (BizMapperModel) JSON.parseObject(string, BizMapperModel.class)) != null) {
                    hashMap.put(bizMapperModel.getBizName(), bizMapperModel);
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("TinctSP", "failed to parseBizMapper!");
            return null;
        }
    }

    public static void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4c33ca", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            b = new TinctConfig();
        } else {
            try {
                b = (TinctConfig) JSON.parseObject(str, TinctConfig.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.e("TinctSP", "failed to parseTinctConfig!");
                b = new TinctConfig();
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f709941", new Object[0]);
        }
        return f;
    }

    public static List<String> b(String str) {
        BizMapperModel bizMapperModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7ab30081", new Object[]{str});
        }
        Map<String, BizMapperModel> map = c;
        if (map == null || (bizMapperModel = map.get(str)) == null) {
            return null;
        }
        return bizMapperModel.getOrangeNamespace();
    }

    public static long c(CustomChangeInfo customChangeInfo) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0532d0c", new Object[]{customChangeInfo})).longValue();
        }
        long j = b.customConfig.fullExpire * 86400000;
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null || (i = e2.expire) <= 0) {
            return j;
        }
        return i * 86400000;
    }

    public static long d(CustomChangeInfo customChangeInfo) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdcf3cb8", new Object[]{customChangeInfo})).longValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null || (i = e2.grayExpire) <= 0) {
            return 4147200000L;
        }
        return i * 3600000;
    }

    public static TinctConfig.CustomItemConfig e(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TinctConfig.CustomItemConfig) ipChange.ipc$dispatch("5b554d2e", new Object[]{customChangeInfo});
        }
        TinctConfig.CustomItemConfig customItemConfig = b.customConfig.config.get(customChangeInfo.getHashKey());
        if (customItemConfig == null) {
            return b.customConfig.config.get(customChangeInfo.getCustomType());
        }
        return customItemConfig;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4565d855", new Object[0])).intValue();
        }
        return d;
    }

    public static <T> T g(HashMap<String, Object> hashMap, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d2164ceb", new Object[]{hashMap, str, t});
        }
        try {
            T t2 = (T) hashMap.get(str);
            if (t2 != null) {
                return t2;
            }
            return t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return t;
        }
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6d5e25e", new Object[0])).longValue();
        }
        return b.orangeStatisticsConfig.orangeExpire * 86400000;
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769f2721", new Object[0])).longValue();
        }
        return b.orangeStatisticsConfig.grayExpire * 86400000;
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        return e;
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        try {
            long myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "com.taobao.taobao";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "com.taobao.taobao";
        }
    }

    public static SharedPreferences l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        if (context != null) {
            return m7l.a(context, "TinctSP", 0);
        }
        return null;
    }

    public static int m(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d08182d", new Object[]{customChangeInfo})).intValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null) {
            return 0;
        }
        return e2.statisticsType;
    }

    public static List<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7029d95", new Object[0]);
        }
        return b.touchstoneConfig.whiteList;
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd7f7c37", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "1.0.0";
        }
    }

    public static void p(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
            return;
        }
        try {
            q(context, hashMap);
            SharedPreferences l = l(context);
            if (l != null) {
                N(l.getString(CONFIG_TICNT_JSON, ""));
                c = M(l.getString(CONFIG_ORANGE_BIZ_MAP, ""));
            }
            if (b == null) {
                b = new TinctConfig();
            }
            TinctConfig tinctConfig = b;
            boolean z = tinctConfig.orangeStatisticsConfig.isMonitorEnable;
            boolean z2 = tinctConfig.abTestStatisticsConfig.isMonitorEnable;
            boolean z3 = tinctConfig.instantStatisticsConfig.isMonitorEnable;
            boolean z4 = tinctConfig.inlineStatisticsConfig.isMonitorEnable;
            boolean z5 = tinctConfig.touchstoneConfig.isMonitorEnable;
            owt.a(context);
        } catch (Exception e2) {
            e2.printStackTrace();
            TLog.loge("tinct", "TinctSP", "init failed: " + e2.getMessage());
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("573d426b", new Object[0])).booleanValue();
        }
        return b.abTestStatisticsConfig.isMonitorEnable;
    }

    public static boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("557862f8", new Object[]{str})).booleanValue();
        }
        TinctConfig.ABTestConfig aBTestConfig = b.abTestStatisticsConfig;
        if (!aBTestConfig.isStatisticsEnable || !aBTestConfig.whiteList.contains(str)) {
            return false;
        }
        int i = b.abTestStatisticsConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean t(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5c7c1e3", new Object[]{customChangeInfo})).booleanValue();
        }
        if (!b.customConfig.enable) {
            Log.e("TinctSP", "customConfig.enable = false");
            return false;
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null) {
            Log.e("TinctSP", "Can't find the config for: " + customChangeInfo.getTinctTag());
            return false;
        } else if (customChangeInfo.getGrayFlag() == null) {
            if (e2.monitorType == 2) {
                return true;
            }
            return false;
        } else if (e2.monitorType == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean u(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98261b9", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        if (i < 0) {
            return false;
        }
        if (i != 0 && System.currentTimeMillis() - j <= i * 3600000) {
            return false;
        }
        return true;
    }

    public static boolean v(CustomChangeInfo customChangeInfo) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cbfddb2", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null) {
            return true;
        }
        int i = e2.monitorType;
        if (i == 2) {
            List<TinctConfig.CustomMonitor> list = e2.monitor;
            if (list == null) {
                return true;
            }
            for (TinctConfig.CustomMonitor customMonitor : list) {
                if (TextUtils.equals(customMonitor.ver, customChangeInfo.getVersion())) {
                    if (!TextUtils.isEmpty(customMonitor.configType)) {
                        z = TextUtils.equals(customMonitor.configType, customChangeInfo.getConfigType());
                    } else {
                        z = true;
                    }
                    if (z) {
                        return !customMonitor.isGray;
                    }
                }
            }
            return true;
        } else if (i == 1) {
            return !Boolean.TRUE.equals(customChangeInfo.getGrayFlag());
        } else {
            return true;
        }
    }

    public static boolean w(CustomChangeInfo customChangeInfo) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dbc1e5e", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null) {
            return false;
        }
        int i = e2.monitorType;
        if (i == 2) {
            List<TinctConfig.CustomMonitor> list = e2.monitor;
            if (list == null) {
                return false;
            }
            for (TinctConfig.CustomMonitor customMonitor : list) {
                if (TextUtils.equals(customMonitor.ver, customChangeInfo.getVersion())) {
                    if (!TextUtils.isEmpty(customMonitor.configType)) {
                        z = TextUtils.equals(customMonitor.configType, customChangeInfo.getConfigType());
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (!customMonitor.isGray || u(e2.grayExpire, customChangeInfo.getUpdateTime())) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            return false;
        } else if (i != 1 || !Boolean.TRUE.equals(customChangeInfo.getGrayFlag())) {
            return false;
        } else {
            return !u(e2.grayExpire, customChangeInfo.getUpdateTime());
        }
    }

    public static boolean x(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("225f5310", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig e2 = e(customChangeInfo);
        if (e2 == null || !e2.statistics) {
            return false;
        }
        int i = e2.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return customChangeInfo.isGray();
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8bcba53", new Object[0])).booleanValue();
        }
        return b.dynamicConfig.isMonitorEnable;
    }

    public static boolean z(n48 n48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5127a976", new Object[]{n48Var})).booleanValue();
        }
        if (!b.dynamicConfig.isStatisticsEnable || n48Var == null || !n48Var.d()) {
            return false;
        }
        int i = b.dynamicConfig.sampling;
        if (i == 10000 || i >= new Random().nextInt(10000)) {
            return true;
        }
        return false;
    }

    public static boolean G(Context context, String str, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c84817e0", new Object[]{context, str, new Integer(i)})).booleanValue();
        }
        try {
            SharedPreferences l = l(context);
            if (l != null) {
                boolean z2 = l.getBoolean(CONFIG_IS_TINCT_ENABLE, true);
                f13830a = z2;
                if (!z2 || !l.getBoolean(CONFIG_IS_TINCT_LAUNCH_ENABLE, false)) {
                    z = false;
                }
                if (z) {
                    b = new TinctConfig();
                    e = str;
                    d = i;
                    f = o(context);
                }
                return z;
            }
        } catch (Exception e2) {
            Log.e("TinctSP", "isLaunchTinchEnable exception", e2);
        }
        return false;
    }

    public static void q(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709a71a8", new Object[]{context, hashMap});
            return;
        }
        f = (String) g(hashMap, "appVersion", o(context));
        e = (String) g(hashMap, "process", k(context));
        int intValue = ((Integer) g(hashMap, OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        d = intValue;
        if (intValue == 0) {
            d = PreferenceManager.getDefaultSharedPreferences(context).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        }
        g = ((Boolean) g(hashMap, v4s.PARAM_IS_INNER, Boolean.FALSE)).booleanValue();
        String.format("Process: %s, AppVe: %s, EvnIndex: %d", e, f, Integer.valueOf(d));
    }
}
