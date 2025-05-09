package com.taobao.downgrade.rule;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.downgrade.a;
import java.io.Serializable;
import java.util.List;
import tb.ai7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultRule implements Serializable {
    @JSONField(name = "androidCpuOpen")
    public boolean androidCpuOpen;
    @JSONField(name = "dataPickRate")
    public String dataPickRate;
    @JSONField(name = "degrade")
    public boolean degrade;
    @JSONField(name = "globalId")
    public String globalId;
    @JSONField(name = ai7.KEY_OLD_SCORE)
    public OldDeviceScore oldDeviceScore;
    @JSONField(name = "performanceWeights")
    public PerformanceWeights performanceWeights;
    @JSONField(name = "power")
    public boolean power;
    @JSONField(name = "scoreLevelVariable")
    public ScoreLevelVariable scoreLevelVariable;
    @JSONField(name = "scoreTacticsMapping")
    public ScoreTacticsMapping scoreTacticsMapping;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OldDeviceScore implements Serializable {
        @JSONField(name = "high")
        public String high;
        @JSONField(name = "low")
        public String low;
        @JSONField(name = "middle")
        public String middle;
        @JSONField(name = "oldDeviceScoreId")
        public String oldDeviceScoreId;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PerformanceWeights implements Serializable {
        @JSONField(name = "coldLaunch")
        public String coldLaunch;
        @JSONField(name = a.HARDWARE)
        public String hardware;
        @JSONField(name = "performanceWeightsId")
        public String performanceWeightsId;
        @JSONField(name = "runtimeCPU")
        public String runtimeCPU;
        @JSONField(name = "runtimeMEM")
        public String runtimeMEM;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScoreLevelVariable implements Serializable {
        @JSONField(name = "coldLaunch")
        public List<String> coldLaunch;
        @JSONField(name = "runtimeCPU")
        public List<String> runtimeCPU;
        @JSONField(name = "runtimeMEM")
        public List<String> runtimeMEM;
        @JSONField(name = "scoreLevelVariableId")
        public String scoreLevelVariableId;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScoreTacticsMapping implements Serializable {
        @JSONField(name = "high")
        public String high;
        @JSONField(name = "low")
        public String low;
        @JSONField(name = "scoreTacticsMappingId")
        public String scoreTacticsMappingId;
    }
}
