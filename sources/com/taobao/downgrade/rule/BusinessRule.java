package com.taobao.downgrade.rule;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.downgrade.a;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BusinessRule implements Serializable {
    @JSONField(name = "bizDegradeFilters")
    public List<Rule> bizDegradeFilters;
    @JSONField(name = "bizGrayFilters")
    public List<Rule> bizGrayFilters;
    @JSONField(name = "businessRuleName")
    public String businessRuleName;
    @JSONField(name = "performanceWeightsFilters")
    public List<PerformanceWeightsFilter> performanceWeightsFilters;
    @JSONField(name = "scoreTacticsMappingFilters")
    public List<ScoreTacticsMappingFilter> scoreTacticsMappingFilters;
    @JSONField(name = "unavailableFilters")
    public List<Rule> unavailableFilters;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Filter implements Serializable {
        @JSONField(name = "compare")
        public String compare;
        @JSONField(name = "value")
        public String value;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class PerformanceWeightsFilter implements Serializable {
        @JSONField(name = "appVersionFilters")
        public List<Filter> appVersionFilters;
        @JSONField(name = "availableTime")
        public List<Time> availableTime;
        @JSONField(name = "brandFilters")
        public List<Filter> brandFilters;
        @JSONField(name = a.COLD_LAUNCH)
        public String coldLaunch;
        @JSONField(name = "deviceFilters")
        public List<Filter> deviceFilters;
        @JSONField(name = a.HARDWARE)
        public String hardware;
        @JSONField(name = "osFilters")
        public List<Filter> osFilters;
        @JSONField(name = "performanceWeightsId")
        public String performanceWeightsId;
        @JSONField(name = a.RUNTIME_CPU)
        public String runtimeCPU;
        @JSONField(name = a.RUNTIME_MEM)
        public String runtimeMEM;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Rule implements Serializable {
        @JSONField(name = "appVersionFilters")
        public List<Filter> appVersionFilters;
        @JSONField(name = "availableTime")
        public List<Time> availableTime;
        @JSONField(name = "bizFilterId")
        public String bizFilterId;
        @JSONField(name = "brandFilters")
        public List<Filter> brandFilters;
        @JSONField(name = "cpuArchFilters")
        public List<Filter> cpuArchFilters;
        @JSONField(name = "cpuFilters")
        public List<Filter> cpuFilters;
        @JSONField(name = "deviceFilters")
        public List<Filter> deviceFilters;
        @JSONField(name = "deviceScoreFilters")
        public List<Filter> deviceScoreFilters;
        @JSONField(name = "forceTactics")
        public String forceTactics;
        @JSONField(name = "gpuScoreFilters")
        public List<Filter> gpuScoreFilters;
        @JSONField(name = "memFilters")
        public List<Filter> memFilters;
        @JSONField(name = "osFilters")
        public List<Filter> osFilters;
        @JSONField(name = "paramMap")
        public Map<String, String> paramMap;
        @JSONField(name = "percentFilters")
        public List<Filter> percentFilters;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ScoreTacticsMappingFilter implements Serializable {
        @JSONField(name = "appVersionFilters")
        public List<Filter> appVersionFilters;
        @JSONField(name = "availableTime")
        public List<Time> availableTime;
        @JSONField(name = "brandFilters")
        public List<Filter> brandFilters;
        @JSONField(name = "deviceFilters")
        public List<Filter> deviceFilters;
        @JSONField(name = "high")
        public String high;
        @JSONField(name = "low")
        public String low;
        @JSONField(name = "osFilters")
        public List<Filter> osFilters;
        @JSONField(name = "scoreTacticsMappingId")
        public String scoreTacticsMappingId;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Time implements Serializable {
        @JSONField(name = "endTime")
        public String endTime;
        @JSONField(name = "startTime")
        public String startTime;
    }
}
