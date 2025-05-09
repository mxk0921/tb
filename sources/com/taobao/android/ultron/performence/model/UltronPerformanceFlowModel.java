package com.taobao.android.ultron.performence.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dav;
import tb.r5e;
import tb.t2o;
import tb.x7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class UltronPerformanceFlowModel implements r5e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bizCode")
    public final String mBizCode;
    @JSONField(name = "bizName")
    public final String mBizName;
    @JSONField(name = "stages")
    public List<UltronPerformanceStageModel> mChildStages;
    @JSONField(name = "flowCode")
    public String mFlowCode;
    @JSONField(deserialize = false, serialize = false)
    private dav mJSTrackerModel;
    private long mStartMills = -1;
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    public long mDurationMills = -1;
    @JSONField(name = "commonArgs")
    public final ConcurrentHashMap<String, String> mCommonArgs = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, serialize = false)
    private boolean mForceFinish = false;

    static {
        t2o.a(83886276);
        t2o.a(83886274);
    }

    public UltronPerformanceFlowModel(String str, String str2, String str3) {
        this.mBizCode = str;
        this.mBizName = str2;
        this.mFlowCode = str3;
    }

    private void insertToDimensionKeysOfCommonArgs(String str, String str2) {
        Map<String, x7v> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7378a0", new Object[]{this, str, str2});
            return;
        }
        dav jSTrackerModel = getJSTrackerModel();
        if (jSTrackerModel != null && (d = jSTrackerModel.d()) != null && d.containsKey(str)) {
            x7v x7vVar = d.get(str);
            jSTrackerModel.a(x7vVar.a(), x7vVar.b(), str2);
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

    public dav ensureGetJSTrackerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dav) ipChange.ipc$dispatch("f0a0c425", new Object[]{this});
        }
        if (this.mJSTrackerModel == null) {
            this.mJSTrackerModel = new dav();
        }
        return this.mJSTrackerModel;
    }

    public List<UltronPerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this});
        }
        return this.mChildStages;
    }

    public String getCommonArg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8e63eda", new Object[]{this, str});
        }
        return this.mCommonArgs.get(str);
    }

    public long getEndMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue();
        }
        return this.mEndMills;
    }

    public dav getJSTrackerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dav) ipChange.ipc$dispatch("9aacf0c3", new Object[]{this});
        }
        return this.mJSTrackerModel;
    }

    public long getStartMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue();
        }
        return this.mStartMills;
    }

    public boolean isForceFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9504fe5f", new Object[]{this})).booleanValue();
        }
        return this.mForceFinish;
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

    public void setEndMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3e39f", new Object[]{this, new Long(j)});
            return;
        }
        this.mEndMills = j;
        this.mDurationMills = j - this.mStartMills;
    }

    public void setForceFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad87bf11", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceFinish = z;
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

    public void addCommonArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d1a604", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            this.mCommonArgs.put(str, str2);
            insertToDimensionKeysOfCommonArgs(str, str2);
        }
    }
}
