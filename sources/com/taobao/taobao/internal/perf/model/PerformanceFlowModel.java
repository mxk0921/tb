package com.taobao.taobao.internal.perf.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.d8d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PerformanceFlowModel implements d8d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bizCode")
    private final String mBizCode;
    @JSONField(name = "bizName")
    private final String mBizName;
    @JSONField(name = "childBizCode")
    private final String mChildBizCode;
    @JSONField(name = "childBizName")
    private final String mChildBizName;
    @JSONField(name = "stages")
    private List<PerformanceStageModel> mChildStages;
    @JSONField(name = "commonArgs")
    private Map<String, String> mCommonArgs;
    @JSONField(name = "flowCode")
    private final String mFlowCode;
    @JSONField(name = "startTimeMills")
    private long mStartMills = -1;
    @JSONField(name = "endTimeMills")
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;

    public PerformanceFlowModel(String str, String str2, String str3, String str4, String str5) {
        this.mBizCode = str;
        this.mBizName = str2;
        this.mChildBizCode = str3;
        this.mChildBizName = str4;
        this.mFlowCode = str5;
    }

    public void addChildStage(PerformanceStageModel performanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de333dc4", new Object[]{this, performanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (!this.mChildStages.contains(performanceStageModel)) {
            this.mChildStages.add(performanceStageModel);
            performanceStageModel.setParentModel(this);
        }
    }

    public void addCommonArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8130b495", new Object[]{this, map});
        } else if (map != null) {
            if (this.mCommonArgs == null) {
                this.mCommonArgs = new ConcurrentHashMap();
            }
            this.mCommonArgs.putAll(map);
        }
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.mBizCode;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.mBizName;
    }

    public String getChildBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a644fdf", new Object[]{this});
        }
        return this.mChildBizCode;
    }

    public String getChildBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec203201", new Object[]{this});
        }
        return this.mChildBizName;
    }

    public PerformanceStageModel getChildStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceStageModel) ipChange.ipc$dispatch("325d71c7", new Object[]{this, str});
        }
        List<PerformanceStageModel> list = this.mChildStages;
        if (list == null) {
            return null;
        }
        for (PerformanceStageModel performanceStageModel : list) {
            if (str.equals(performanceStageModel.getStageCode())) {
                return performanceStageModel;
            }
        }
        return null;
    }

    public List<PerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this});
        }
        return this.mChildStages;
    }

    public Map<String, String> getCommonArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b2b7c5a", new Object[]{this});
        }
        return this.mCommonArgs;
    }

    public long getDurationMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb380e8", new Object[]{this})).longValue();
        }
        return this.mDurationMills;
    }

    public long getEndMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue();
        }
        return this.mEndMills;
    }

    public String getFlowCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this});
        }
        return this.mFlowCode;
    }

    public long getStartMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue();
        }
        return this.mStartMills;
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue();
        }
        if (getStartMills() <= 0 || getEndMills() <= 0) {
            return false;
        }
        return true;
    }

    public void setDurationMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e8965c", new Object[]{this, new Long(j)});
        } else {
            this.mDurationMills = j;
        }
    }

    public void setEndMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3e39f", new Object[]{this, new Long(j)});
            return;
        }
        this.mEndMills = j;
        this.mDurationMills = j - this.mStartMills;
    }

    public void setStartMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbeae6", new Object[]{this, new Long(j)});
        } else {
            this.mStartMills = j;
        }
    }
}
