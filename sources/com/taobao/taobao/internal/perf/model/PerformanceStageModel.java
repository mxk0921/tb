package com.taobao.taobao.internal.perf.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.d8d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PerformanceStageModel implements d8d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "stages")
    private List<PerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private d8d mParentStageModel;
    @JSONField(name = "stageCode")
    private final String mStageCode;
    @JSONField(name = "startTimeMills")
    private long mStartMills = -1;
    @JSONField(name = "endTimeMills")
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;

    public PerformanceStageModel(String str) {
        this.mStageCode = str;
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

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.mArgs;
    }

    public List<PerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this});
        }
        return this.mChildStages;
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

    @JSONField(serialize = false)
    public d8d getParentModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d8d) ipChange.ipc$dispatch("a8307487", new Object[]{this});
        }
        return this.mParentStageModel;
    }

    public String getStageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72cddec4", new Object[]{this});
        }
        return this.mStageCode;
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

    public void removeFromParentStage() {
        List<PerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa573ecd", new Object[]{this});
            return;
        }
        d8d d8dVar = this.mParentStageModel;
        if (d8dVar instanceof PerformanceFlowModel) {
            List<PerformanceStageModel> childStages2 = ((PerformanceFlowModel) d8dVar).getChildStages();
            if (childStages2 != null) {
                childStages2.remove(this);
            }
        } else if ((d8dVar instanceof PerformanceStageModel) && (childStages = ((PerformanceStageModel) d8dVar).getChildStages()) != null) {
            childStages.remove(this);
        }
    }

    public void setArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.mArgs = map;
        }
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

    public void setParentModel(d8d d8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2fc1c3", new Object[]{this, d8dVar});
        } else {
            this.mParentStageModel = d8dVar;
        }
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
