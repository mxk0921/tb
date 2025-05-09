package com.taobao.android.sku.performance.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.e8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PerformanceStageModel implements e8d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "stages")
    private List<PerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private e8d mParentStageModel;
    @JSONField(name = "code")
    private final String mStageCode;
    @JSONField(name = "start")
    private long mStartMills = -1;
    @JSONField(name = "end")
    private long mEndMills = -1;
    @JSONField(name = "duration")
    private long mDurationMills = -1;

    static {
        t2o.a(442499228);
        t2o.a(442499226);
    }

    public PerformanceStageModel(String str) {
        this.mStageCode = str;
    }

    public void addChildStage(PerformanceStageModel performanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4a5748", new Object[]{this, performanceStageModel});
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
    public e8d getParentModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8d) ipChange.ipc$dispatch("876e9d3d", new Object[]{this});
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
        e8d e8dVar = this.mParentStageModel;
        if (e8dVar instanceof PerformanceStageModel) {
            List<PerformanceStageModel> childStages2 = ((PerformanceStageModel) e8dVar).getChildStages();
            if (childStages2 != null) {
                childStages2.remove(this);
            }
        } else if ((e8dVar instanceof PerformanceFlowModel) && (childStages = ((PerformanceFlowModel) e8dVar).getChildStages()) != null) {
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

    public void setParentModel(e8d e8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9002673b", new Object[]{this, e8dVar});
        } else {
            this.mParentStageModel = e8dVar;
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
