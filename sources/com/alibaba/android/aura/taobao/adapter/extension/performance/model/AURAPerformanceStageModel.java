package com.alibaba.android.aura.taobao.adapter.extension.performance.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ecb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAPerformanceStageModel implements ecb, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "stages")
    private List<AURAPerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private ecb mParentStageModel;
    @JSONField(name = "stageCode")
    private final String mStageCode;
    @JSONField(name = "startTimeMills")
    private long mStartMills = -1;
    @JSONField(name = "endTimeMills")
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;

    static {
        t2o.a(81789190);
        t2o.a(81789192);
    }

    public AURAPerformanceStageModel(String str) {
        this.mStageCode = str;
    }

    public void addChildStage(AURAPerformanceStageModel aURAPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04d5eca", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (!this.mChildStages.contains(aURAPerformanceStageModel)) {
            this.mChildStages.add(aURAPerformanceStageModel);
            aURAPerformanceStageModel.setParentModel(this);
        }
    }

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.mArgs;
    }

    public List<AURAPerformanceStageModel> getChildStages() {
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
    public ecb getParentModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ecb) ipChange.ipc$dispatch("7b2f9b27", new Object[]{this});
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
        List<AURAPerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa573ecd", new Object[]{this});
            return;
        }
        ecb ecbVar = this.mParentStageModel;
        if (ecbVar instanceof AURAPerformanceFlowModel) {
            List<AURAPerformanceStageModel> childStages2 = ((AURAPerformanceFlowModel) ecbVar).getChildStages();
            if (childStages2 != null) {
                childStages2.remove(this);
            }
        } else if ((ecbVar instanceof AURAPerformanceStageModel) && (childStages = ((AURAPerformanceStageModel) ecbVar).getChildStages()) != null) {
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

    public void setParentModel(ecb ecbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985794a3", new Object[]{this, ecbVar});
        } else {
            this.mParentStageModel = ecbVar;
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
