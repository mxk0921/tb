package com.taobao.android.ultron.performence.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.r5e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class UltronPerformanceStageModel implements r5e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "stages")
    public List<UltronPerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private r5e mParentStageModel;
    @JSONField(name = "stageCode")
    private final String mStageCode;
    @JSONField(deserialize = false, serialize = false)
    private long mStartMills = -1;
    @JSONField(deserialize = false, serialize = false)
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;
    @JSONField(deserialize = false, serialize = false)
    private boolean mIsFreeStage = false;

    static {
        t2o.a(83886280);
        t2o.a(83886274);
    }

    public UltronPerformanceStageModel(String str) {
        this.mStageCode = str;
    }

    private void reCalculateParentStageEndMills(r5e r5eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b928ae0c", new Object[]{this, r5eVar, new Long(j)});
        } else if (!isFreeStage() && (r5eVar instanceof UltronPerformanceStageModel)) {
            UltronPerformanceStageModel ultronPerformanceStageModel = (UltronPerformanceStageModel) r5eVar;
            long endMills = ultronPerformanceStageModel.getEndMills();
            if (ultronPerformanceStageModel.isRecordFinished() && j > endMills) {
                ultronPerformanceStageModel.setEndMills(j);
            }
        }
    }

    public void addChildStage(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607dee21", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (!this.mChildStages.contains(ultronPerformanceStageModel)) {
            this.mChildStages.add(ultronPerformanceStageModel);
            ultronPerformanceStageModel.setParentModel(this);
        }
    }

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.mArgs;
    }

    public List<UltronPerformanceStageModel> getChildStages() {
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

    @JSONField(deserialize = false, serialize = false)
    public long getEndMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue();
        }
        return this.mEndMills;
    }

    public String getStageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72cddec4", new Object[]{this});
        }
        return this.mStageCode;
    }

    @JSONField(deserialize = false, serialize = false)
    public long getStartMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue();
        }
        return this.mStartMills;
    }

    public boolean isFreeStage() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faa07273", new Object[]{this})).booleanValue();
        }
        if (this.mIsFreeStage || ((map = this.mArgs) != null && Boolean.parseBoolean(map.get("doNotCalculateInFlow")))) {
            return true;
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue();
        }
        if ((this.mStartMills < 0 || this.mEndMills < 0) && this.mDurationMills < 0) {
            return false;
        }
        return true;
    }

    public void removeFromParentStage() {
        List<UltronPerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa573ecd", new Object[]{this});
            return;
        }
        r5e r5eVar = this.mParentStageModel;
        if (r5eVar instanceof UltronPerformanceFlowModel) {
            List<UltronPerformanceStageModel> childStages2 = ((UltronPerformanceFlowModel) r5eVar).getChildStages();
            if (childStages2 != null) {
                childStages2.remove(this);
            }
        } else if ((r5eVar instanceof UltronPerformanceStageModel) && (childStages = ((UltronPerformanceStageModel) r5eVar).getChildStages()) != null) {
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

    public void setEndMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3e39f", new Object[]{this, new Long(j)});
            return;
        }
        this.mEndMills = j;
        this.mDurationMills = j - this.mStartMills;
        reCalculateParentStageEndMills(this.mParentStageModel, j);
    }

    public void setFreeStage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69513b7d", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFreeStage = z;
        }
    }

    public void setParentModel(r5e r5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146f2bb8", new Object[]{this, r5eVar});
        } else {
            this.mParentStageModel = r5eVar;
        }
    }

    public void setStartMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbeae6", new Object[]{this, new Long(j)});
            return;
        }
        this.mStartMills = j;
        this.mDurationMills = this.mEndMills - j;
    }
}
