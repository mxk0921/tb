package com.taobao.downgrade;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.t81;
import tb.tvn;
import tb.x4v;
import tb.xxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD_LAUNCH = "cold_launch";
    public static final String HARDWARE = "hardware";
    public static final String OLD_SCORE_HIGH = "high";
    public static final String OLD_SCORE_LOW = "low";
    public static final String OLD_SCORE_MID = "middle";
    public static final String RUNTIME_CPU = "runtime_CPU";
    public static final String RUNTIME_MEM = "runtime_MEM";
    public static final String TACTICS_FUNCTION_BIZ_DEGRADE = "bizDegrade";
    public static final String TACTICS_FUNCTION_BIZ_GRAY = "bizGray";
    public static final String TACTICS_FUNCTION_NORMAL = "normal";
    public static final String TACTICS_FUNCTION_UNAVAILABLE = "unavailable";
    public static final String TACTICS_PERFORMANCE_DEGRADE = "degrade";
    public static final String TACTICS_PERFORMANCE_NORMAL = "normal";
    public static final String TACTICS_PERFORMANCE_PART_DEGRADE = "partDegrade";
    public static final SimpleDateFormat US_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public static DowngradeStrategy a(Pair<DowngradeStrategy, String> pair, String str, BusinessRule businessRule, DefaultRule defaultRule, int i, int i2, String str2, String str3) {
        DowngradeStrategy downgradeStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("e0a76020", new Object[]{pair, str, businessRule, defaultRule, new Integer(i), new Integer(i2), str2, str3});
        }
        if (pair == null || (downgradeStrategy = (DowngradeStrategy) pair.first) == null) {
            return null;
        }
        if (Downgrade.isTest) {
            Map<String, String> l = l(businessRule, defaultRule, i, i2, str2, str3);
            y(l, downgradeStrategy, (String) pair.second);
            downgradeStrategy.setTraceMap(l);
        }
        return downgradeStrategy;
    }

    public static int b(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd03d64", new Object[]{str, str2})).intValue();
        }
        String[] split = !str.contains(".") ? new String[]{str} : str.split("\\.");
        String[] split2 = !str2.contains(".") ? new String[]{str2} : str2.split("\\.");
        if (split.length > split2.length) {
            i = split2.length;
        } else {
            i = split.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!split[i2].equals(split2[i2])) {
                if (tvn.d(split[i2]) > tvn.d(split2[i2])) {
                    return 1;
                } else {
                    if (tvn.d(split[i2]) == tvn.d(split2[i2])) {
                        return 0;
                    }
                    return -1;
                }
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        if (split.length == split2.length) {
            return 0;
        }
        return -1;
    }

    public static float c(DefaultRule defaultRule) {
        List<String> list;
        DefaultRule.ScoreLevelVariable scoreLevelVariable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68b0499b", new Object[]{defaultRule})).floatValue();
        }
        if (defaultRule == null || (scoreLevelVariable = defaultRule.scoreLevelVariable) == null) {
            list = null;
        } else {
            list = scoreLevelVariable.coldLaunch;
        }
        return t81.c(list);
    }

    public static float g(DefaultRule defaultRule, Integer num) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78ef15d0", new Object[]{defaultRule, num})).floatValue();
        }
        if (!defaultRule.androidCpuOpen || num == null || num.intValue() == 0) {
            return 0.0f;
        }
        DefaultRule.ScoreLevelVariable scoreLevelVariable = defaultRule.scoreLevelVariable;
        if (scoreLevelVariable != null) {
            list = scoreLevelVariable.runtimeCPU;
        } else {
            list = null;
        }
        return t81.x(list);
    }

    public static float h(DefaultRule defaultRule) {
        List<String> list;
        DefaultRule.ScoreLevelVariable scoreLevelVariable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("766ee954", new Object[]{defaultRule})).floatValue();
        }
        if (defaultRule == null || (scoreLevelVariable = defaultRule.scoreLevelVariable) == null) {
            list = null;
        } else {
            list = scoreLevelVariable.runtimeMEM;
        }
        return t81.y(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<com.taobao.downgrade.DowngradeStrategy, java.lang.String> j(java.util.List<com.taobao.downgrade.rule.BusinessRule.Rule> r6, int r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Integer> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.downgrade.a.j(java.util.List, int, java.lang.String, java.util.Map, boolean):android.util.Pair");
    }

    public static DowngradeStrategy k(BusinessRule businessRule, DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("29df0d2b", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null || defaultRule == null) {
            return null;
        }
        Pair<Map<String, Integer>, String> f = f(businessRule, defaultRule);
        Map map = (Map) f.first;
        if (map == null) {
            return null;
        }
        String str2 = (String) f.second;
        float c = c(defaultRule);
        float h = h(defaultRule);
        float g = g(defaultRule, (Integer) map.get(RUNTIME_CPU));
        int r = t81.r();
        int k = t81.k(map, c, g, h, r);
        Pair<Map<String, Integer>, String> i = i(businessRule, defaultRule);
        Map map2 = (Map) i.first;
        String str3 = (String) i.second;
        if (map2 == null) {
            return null;
        }
        DowngradeStrategy a2 = a(j(businessRule.unavailableFilters, k, TACTICS_FUNCTION_UNAVAILABLE, map2, defaultRule.androidCpuOpen), TACTICS_FUNCTION_UNAVAILABLE, businessRule, defaultRule, k, r, str2, str3);
        if (a2 != null) {
            return a2;
        }
        DowngradeStrategy a3 = a(j(businessRule.bizDegradeFilters, k, TACTICS_FUNCTION_BIZ_DEGRADE, map2, defaultRule.androidCpuOpen), TACTICS_FUNCTION_BIZ_DEGRADE, businessRule, defaultRule, k, r, str2, str3);
        if (a3 != null) {
            return a3;
        }
        DowngradeStrategy a4 = a(j(businessRule.bizGrayFilters, k, TACTICS_FUNCTION_BIZ_GRAY, map2, defaultRule.androidCpuOpen), TACTICS_FUNCTION_BIZ_GRAY, businessRule, defaultRule, k, r, str2, str3);
        if (a4 != null) {
            return a4;
        }
        if (k > ((Integer) map2.get("high")).intValue()) {
            str = "normal";
        } else if (k <= ((Integer) map2.get("high")).intValue() && k > ((Integer) map2.get("low")).intValue()) {
            str = TACTICS_PERFORMANCE_PART_DEGRADE;
        } else if (k <= ((Integer) map2.get("low")).intValue()) {
            str = "degrade";
        }
        if (!Downgrade.isTest) {
            return new DowngradeStrategy.b().g("normal").h(str).e();
        }
        Map<String, String> l = l(businessRule, defaultRule, k, r, str2, str3);
        l.put(xxl.PERFORMANCE_WEIGHTS_ID, str2);
        l.put(xxl.TACTICS_FUNCTION, "normal");
        l.put(xxl.TACTICS_PERFORMANCE, str);
        l.put(xxl.CPU_ARCH, String.valueOf(t81.e()));
        return new DowngradeStrategy.b().g("normal").h(str).i(l).e();
    }

    public static Map<String, String> l(BusinessRule businessRule, DefaultRule defaultRule, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b12bbf2", new Object[]{businessRule, defaultRule, new Integer(i), new Integer(i2), str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(xxl.UPLOAD_TYPE, x4v.EVENT_PAGE_SLAVE);
        hashMap.put(xxl.BIZ_ID, businessRule.businessRuleName);
        hashMap.put(xxl.DEVICE_RUNTIME_SORE, String.valueOf(i));
        hashMap.put(xxl.HARDWARE_SORE, String.valueOf(i2));
        hashMap.put("page_url", t81.t());
        hashMap.put(xxl.DEVICE_MEM_LEFT, String.valueOf(t81.i()));
        hashMap.put(xxl.DEVICE_MEM_PERCENT, String.valueOf(t81.j()));
        hashMap.put(xxl.DEVICE_CPU_PERCENT, String.valueOf(t81.g(defaultRule.androidCpuOpen)));
        hashMap.put("cold_launch_time", String.valueOf(t81.b()));
        hashMap.put(xxl.DEVICE_TEMPERATURE, String.valueOf(t81.l()));
        hashMap.put(xxl.PERFORMANCE_WEIGHTS_ID, str);
        hashMap.put(xxl.SCORE_TACTICS_MAPPING_ID, str2);
        hashMap.put(xxl.PERCENT, String.valueOf(t81.u()));
        DefaultRule.OldDeviceScore oldDeviceScore = defaultRule.oldDeviceScore;
        if (oldDeviceScore != null) {
            hashMap.put(xxl.OLD_DEVICE_SCORE_ID, oldDeviceScore.oldDeviceScoreId);
        }
        DefaultRule.ScoreLevelVariable scoreLevelVariable = defaultRule.scoreLevelVariable;
        if (scoreLevelVariable != null) {
            hashMap.put(xxl.SCORE_LEVEL_VARIABLE_ID, scoreLevelVariable.scoreLevelVariableId);
        }
        return hashMap;
    }

    public static boolean m(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a436963f", new Object[]{list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean o(List<BusinessRule.Filter> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e33428", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        for (BusinessRule.Filter filter : list) {
            if (filter != null && n(filter, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(List<BusinessRule.Filter> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208c1e11", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        for (BusinessRule.Filter filter : list) {
            if (filter != null && q(filter, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(BusinessRule.PerformanceWeightsFilter performanceWeightsFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3130433", new Object[]{performanceWeightsFilter})).booleanValue();
        }
        List<BusinessRule.Time> list = performanceWeightsFilter.availableTime;
        if (list != null && !w(list)) {
            return false;
        }
        List<BusinessRule.Filter> list2 = performanceWeightsFilter.osFilters;
        if (list2 != null && !o(list2, t81.w())) {
            return false;
        }
        List<BusinessRule.Filter> list3 = performanceWeightsFilter.deviceFilters;
        if (list3 != null && !o(list3, t81.p())) {
            return false;
        }
        List<BusinessRule.Filter> list4 = performanceWeightsFilter.brandFilters;
        if (list4 != null && !o(list4, t81.o())) {
            return false;
        }
        List<BusinessRule.Filter> list5 = performanceWeightsFilter.appVersionFilters;
        if (list5 == null || o(list5, t81.a())) {
            return true;
        }
        return false;
    }

    public static boolean s(List<BusinessRule.PerformanceWeightsFilter> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb36fbe9", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.PerformanceWeightsFilter performanceWeightsFilter : list) {
            if (o(performanceWeightsFilter.osFilters, t81.w()) && o(performanceWeightsFilter.brandFilters, t81.o()) && o(performanceWeightsFilter.deviceFilters, t81.p()) && o(performanceWeightsFilter.appVersionFilters, t81.a())) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(List<BusinessRule.Rule> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f53b6e2", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.Rule rule : list) {
            if (o(rule.osFilters, t81.w()) && o(rule.brandFilters, t81.o()) && o(rule.deviceFilters, t81.p()) && o(rule.appVersionFilters, t81.a())) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(List<BusinessRule.ScoreTacticsMappingFilter> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cf9a6fc", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (BusinessRule.ScoreTacticsMappingFilter scoreTacticsMappingFilter : list) {
            if (o(scoreTacticsMappingFilter.osFilters, t81.w()) && o(scoreTacticsMappingFilter.brandFilters, t81.o()) && o(scoreTacticsMappingFilter.deviceFilters, t81.p()) && o(scoreTacticsMappingFilter.appVersionFilters, t81.a())) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(BusinessRule.ScoreTacticsMappingFilter scoreTacticsMappingFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e637a82", new Object[]{scoreTacticsMappingFilter})).booleanValue();
        }
        List<BusinessRule.Time> list = scoreTacticsMappingFilter.availableTime;
        if (list != null && !w(list)) {
            return false;
        }
        List<BusinessRule.Filter> list2 = scoreTacticsMappingFilter.osFilters;
        if (list2 != null && !o(list2, t81.w())) {
            return false;
        }
        List<BusinessRule.Filter> list3 = scoreTacticsMappingFilter.deviceFilters;
        if (list3 != null && !o(list3, t81.p())) {
            return false;
        }
        List<BusinessRule.Filter> list4 = scoreTacticsMappingFilter.brandFilters;
        if (list4 != null && !o(list4, t81.o())) {
            return false;
        }
        List<BusinessRule.Filter> list5 = scoreTacticsMappingFilter.appVersionFilters;
        if (list5 == null || o(list5, t81.a())) {
            return true;
        }
        return false;
    }

    public static boolean w(List<BusinessRule.Time> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c1ce78", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        try {
            for (BusinessRule.Time time : list) {
                SimpleDateFormat simpleDateFormat = US_DATE_FORMAT;
                Date parse = simpleDateFormat.parse(time.startTime);
                Date parse2 = simpleDateFormat.parse(time.endTime);
                Date parse3 = simpleDateFormat.parse(t81.f());
                if (parse.before(parse3) && parse2.after(parse3)) {
                    return true;
                }
            }
        } catch (ParseException unused) {
        }
        return false;
    }

    public static boolean x(BusinessRule businessRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26376ab", new Object[]{businessRule})).booleanValue();
        }
        if (!t(businessRule.unavailableFilters) && !t(businessRule.bizDegradeFilters) && !t(businessRule.bizGrayFilters) && !u(businessRule.scoreTacticsMappingFilters) && !s(businessRule.performanceWeightsFilters)) {
            return false;
        }
        return true;
    }

    public static void y(Map<String, String> map, DowngradeStrategy downgradeStrategy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334f1af6", new Object[]{map, downgradeStrategy, str});
            return;
        }
        map.put(xxl.TACTICS_FUNCTION, downgradeStrategy.getTacticsFunction());
        map.put(xxl.TACTICS_PERFORMANCE, downgradeStrategy.getTacticsPerformance());
        map.put(xxl.BIZ_FILTER_ID, str);
    }

    public static Map<String, Integer> d(DefaultRule defaultRule) {
        DefaultRule.PerformanceWeights performanceWeights;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e349c092", new Object[]{defaultRule});
        }
        HashMap hashMap = new HashMap(4);
        if (defaultRule == null || (performanceWeights = defaultRule.performanceWeights) == null) {
            return null;
        }
        hashMap.put(COLD_LAUNCH, Integer.valueOf(tvn.e(performanceWeights.coldLaunch, 0)));
        hashMap.put(RUNTIME_CPU, Integer.valueOf(tvn.e(defaultRule.performanceWeights.runtimeCPU, 0)));
        hashMap.put(RUNTIME_MEM, Integer.valueOf(tvn.e(defaultRule.performanceWeights.runtimeMEM, 0)));
        hashMap.put(HARDWARE, Integer.valueOf(tvn.e(defaultRule.performanceWeights.hardware, 100)));
        return hashMap;
    }

    public static DowngradeStrategy e(DefaultRule defaultRule, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("7a2d3269", new Object[]{defaultRule, str});
        }
        Map<String, Integer> d = d(defaultRule);
        float c = c(defaultRule);
        float h = h(defaultRule);
        float g = g(defaultRule, d.get(RUNTIME_CPU));
        String str3 = defaultRule.oldDeviceScore.oldDeviceScoreId;
        int r = t81.r();
        int k = t81.k(d, c, g, h, r);
        HashMap hashMap = new HashMap(2);
        hashMap.put("high", Integer.valueOf(tvn.e(defaultRule.scoreTacticsMapping.high, 40)));
        hashMap.put("low", Integer.valueOf(tvn.e(defaultRule.scoreTacticsMapping.low, 20)));
        String str4 = defaultRule.scoreTacticsMapping.scoreTacticsMappingId;
        if (k > ((Integer) hashMap.get("high")).intValue()) {
            str2 = "normal";
        } else if (k > ((Integer) hashMap.get("low")).intValue()) {
            str2 = TACTICS_PERFORMANCE_PART_DEGRADE;
        } else {
            str2 = "degrade";
        }
        if (!Downgrade.isTest) {
            return new DowngradeStrategy.b().g("normal").h(str2).e();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(xxl.UPLOAD_TYPE, x4v.EVENT_PAGE_SLAVE);
        hashMap2.put(xxl.DEVICE_RUNTIME_SORE, String.valueOf(k));
        hashMap2.put(xxl.HARDWARE_SORE, String.valueOf(r));
        hashMap2.put("page_url", t81.t());
        hashMap2.put(xxl.DEVICE_MEM_LEFT, String.valueOf(t81.i()));
        hashMap2.put(xxl.DEVICE_MEM_PERCENT, String.valueOf(t81.j()));
        hashMap2.put(xxl.DEVICE_CPU_PERCENT, String.valueOf(t81.g(defaultRule.androidCpuOpen)));
        hashMap2.put("cold_launch_time", String.valueOf(t81.b()));
        hashMap2.put(xxl.DEVICE_TEMPERATURE, String.valueOf(t81.l()));
        hashMap2.put(xxl.PERCENT, String.valueOf(t81.u()));
        hashMap2.put(xxl.PERFORMANCE_WEIGHTS_ID, str3);
        hashMap2.put(xxl.SCORE_TACTICS_MAPPING_ID, str4);
        DefaultRule.OldDeviceScore oldDeviceScore = defaultRule.oldDeviceScore;
        if (oldDeviceScore != null) {
            hashMap2.put(xxl.OLD_DEVICE_SCORE_ID, oldDeviceScore.oldDeviceScoreId);
        }
        DefaultRule.ScoreLevelVariable scoreLevelVariable = defaultRule.scoreLevelVariable;
        if (scoreLevelVariable != null) {
            hashMap2.put(xxl.SCORE_LEVEL_VARIABLE_ID, scoreLevelVariable.scoreLevelVariableId);
        }
        hashMap2.put(xxl.TACTICS_FUNCTION, "normal");
        hashMap2.put(xxl.TACTICS_PERFORMANCE, str2);
        return new DowngradeStrategy.b().g("normal").h(str2).i(hashMap2).e();
    }

    public static Pair<Map<String, Integer>, String> f(BusinessRule businessRule, DefaultRule defaultRule) {
        List<BusinessRule.PerformanceWeightsFilter> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e9ab6eff", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null && defaultRule == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        if (businessRule != null && (list = businessRule.performanceWeightsFilters) != null) {
            Iterator<BusinessRule.PerformanceWeightsFilter> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BusinessRule.PerformanceWeightsFilter next = it.next();
                if (r(next)) {
                    hashMap.put(COLD_LAUNCH, Integer.valueOf(tvn.e(next.coldLaunch, 0)));
                    hashMap.put(RUNTIME_CPU, Integer.valueOf(tvn.e(next.runtimeCPU, 0)));
                    hashMap.put(RUNTIME_MEM, Integer.valueOf(tvn.e(next.runtimeMEM, 0)));
                    hashMap.put(HARDWARE, Integer.valueOf(tvn.e(next.hardware, 100)));
                    str = next.performanceWeightsId;
                    break;
                }
            }
        }
        boolean isEmpty = hashMap.isEmpty();
        Object obj = hashMap;
        if (isEmpty) {
            Object d = d(defaultRule);
            str = defaultRule.performanceWeights.performanceWeightsId;
            obj = d;
        }
        return new Pair<>(obj, str);
    }

    public static Pair<Map<String, Integer>, String> i(BusinessRule businessRule, DefaultRule defaultRule) {
        List<BusinessRule.ScoreTacticsMappingFilter> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9a12313c", new Object[]{businessRule, defaultRule});
        }
        String str = null;
        if (businessRule == null && defaultRule == null) {
            return null;
        }
        HashMap hashMap = new HashMap(2);
        if (businessRule != null && (list = businessRule.scoreTacticsMappingFilters) != null) {
            Iterator<BusinessRule.ScoreTacticsMappingFilter> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BusinessRule.ScoreTacticsMappingFilter next = it.next();
                if (v(next)) {
                    hashMap.put("high", Integer.valueOf(tvn.e(next.high, 40)));
                    hashMap.put("low", Integer.valueOf(tvn.e(next.low, 20)));
                    str = next.scoreTacticsMappingId;
                    break;
                }
            }
        }
        if (hashMap.isEmpty()) {
            hashMap.put("high", Integer.valueOf(tvn.e(defaultRule.scoreTacticsMapping.high, 40)));
            hashMap.put("low", Integer.valueOf(tvn.e(defaultRule.scoreTacticsMapping.low, 20)));
            str = defaultRule.scoreTacticsMapping.scoreTacticsMappingId;
        }
        return new Pair<>(hashMap, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r3.equals("more") == false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(com.taobao.downgrade.rule.BusinessRule.Filter r6, java.lang.String r7) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.downgrade.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "aedd7b5d"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.String r3 = r6.compare
            if (r3 == 0) goto L_0x00b2
            java.lang.String r6 = r6.value
            if (r6 == 0) goto L_0x00b2
            if (r7 != 0) goto L_0x0028
            goto L_0x00b2
        L_0x0028:
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -415169006: goto L_0x006e;
                case 3318169: goto L_0x0062;
                case 3357525: goto L_0x0058;
                case 96757556: goto L_0x004d;
                case 514320470: goto L_0x0041;
                case 1552455713: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = -1
            goto L_0x0079
        L_0x0035:
            java.lang.String r0 = "notEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x0033
        L_0x003f:
            r0 = 5
            goto L_0x0079
        L_0x0041:
            java.lang.String r0 = "lessAndEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x0033
        L_0x004b:
            r0 = 4
            goto L_0x0079
        L_0x004d:
            java.lang.String r0 = "equal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            r0 = 3
            goto L_0x0079
        L_0x0058:
            java.lang.String r5 = "more"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0079
            goto L_0x0033
        L_0x0062:
            java.lang.String r0 = "less"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x0033
        L_0x006c:
            r0 = 1
            goto L_0x0079
        L_0x006e:
            java.lang.String r0 = "moreAndEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x0033
        L_0x0078:
            r0 = 0
        L_0x0079:
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0098;
                case 3: goto L_0x008f;
                case 4: goto L_0x0086;
                case 5: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            return r2
        L_0x007d:
            int r6 = r7.compareTo(r6)
            if (r6 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            return r1
        L_0x0086:
            int r6 = b(r7, r6)
            if (r6 > 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            return r1
        L_0x008f:
            int r6 = r7.compareTo(r6)
            if (r6 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            return r1
        L_0x0098:
            int r6 = b(r7, r6)
            if (r6 <= 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            return r1
        L_0x00a1:
            int r6 = b(r7, r6)
            if (r6 >= 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            return r1
        L_0x00aa:
            int r6 = b(r7, r6)
            if (r6 < 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.downgrade.a.n(com.taobao.downgrade.rule.BusinessRule$Filter, java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r3.equals("more") == false) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(com.taobao.downgrade.rule.BusinessRule.Filter r6, java.lang.String r7) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.downgrade.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "bde2c02e"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.String r3 = r6.compare
            if (r3 == 0) goto L_0x00bb
            java.lang.String r6 = r6.value
            if (r6 == 0) goto L_0x00bb
            if (r7 != 0) goto L_0x0028
            goto L_0x00bb
        L_0x0028:
            float r7 = tb.tvn.b(r7)
            float r6 = tb.tvn.b(r6)
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -415169006: goto L_0x0076;
                case 3318169: goto L_0x006a;
                case 3357525: goto L_0x0060;
                case 96757556: goto L_0x0055;
                case 514320470: goto L_0x0049;
                case 1552455713: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = -1
            goto L_0x0081
        L_0x003d:
            java.lang.String r0 = "notEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x003b
        L_0x0047:
            r0 = 5
            goto L_0x0081
        L_0x0049:
            java.lang.String r0 = "lessAndEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x003b
        L_0x0053:
            r0 = 4
            goto L_0x0081
        L_0x0055:
            java.lang.String r0 = "equal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x003b
        L_0x005e:
            r0 = 3
            goto L_0x0081
        L_0x0060:
            java.lang.String r5 = "more"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0081
            goto L_0x003b
        L_0x006a:
            java.lang.String r0 = "less"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x003b
        L_0x0074:
            r0 = 1
            goto L_0x0081
        L_0x0076:
            java.lang.String r0 = "moreAndEqual"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x003b
        L_0x0080:
            r0 = 0
        L_0x0081:
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0097;
                case 4: goto L_0x008e;
                case 5: goto L_0x0085;
                default: goto L_0x0084;
            }
        L_0x0084:
            return r2
        L_0x0085:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            return r1
        L_0x008e:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 > 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            return r1
        L_0x0097:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            return r1
        L_0x00a0:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 <= 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r1 = 0
        L_0x00a8:
            return r1
        L_0x00a9:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 >= 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            return r1
        L_0x00b2:
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 < 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            return r1
        L_0x00bb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.downgrade.a.q(com.taobao.downgrade.rule.BusinessRule$Filter, java.lang.String):boolean");
    }
}
