package com.taobao.android.sku.performance.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.e8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PerformanceFlowModel implements e8d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bizName")
    public String mBizName;
    @JSONField(name = "stages")
    public List<PerformanceStageModel> mChildStages;
    @JSONField(name = "flowCode")
    public String mFlowCode;
    @JSONField(name = "start")
    public long mStartMills = -1;
    @JSONField(name = "end")
    private long mEndMills = -1;
    @JSONField(name = "duration")
    public long mDurationMills = -1;
    @JSONField(name = "commonArgs")
    public final ConcurrentHashMap<String, String> mCommonArgs = new ConcurrentHashMap<>();

    static {
        t2o.a(442499227);
        t2o.a(442499226);
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

    public void addCommonArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8130b495", new Object[]{this, map});
        } else if (map != null) {
            for (String str : map.keySet()) {
                if (str != null) {
                    addCommonArgs(str, map.get(str));
                }
            }
        }
    }

    public List<PerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this});
        }
        return this.mChildStages;
    }

    public long getEndMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue();
        }
        return this.mEndMills;
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue();
        }
        if (this.mStartMills <= 0 || this.mEndMills <= 0) {
            return false;
        }
        return true;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.mBizName = str;
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

    public void setFlowCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c284598e", new Object[]{this, str});
        } else {
            this.mFlowCode = str;
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

    public void addCommonArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d1a604", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            this.mCommonArgs.put(str, str2);
        }
    }
}
