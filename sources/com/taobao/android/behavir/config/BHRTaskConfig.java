package com.taobao.android.behavir.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kg4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BHRTaskConfig extends BHRTaskConfigBase implements Comparable<BHRTaskConfig> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BHRTaskConfig EMPTY_CONFIG = new BHRTaskConfig(new JSONObject(0));
    private JSONArray actionNameIn;
    private JSONArray actionTypeIn;
    private JSONObject bizArgsIn;
    private JSONObject bizArgsNIn;
    private JSONArray bizIdIn;
    private kg4 configModel;
    private JSONObject intentionIn;
    private JSONArray sceneIn;
    private JSONArray sceneNIn;

    static {
        t2o.a(404750360);
    }

    public BHRTaskConfig(JSONObject jSONObject) {
        super(jSONObject);
        this.sceneIn = jSONObject.getJSONArray("sceneIn");
        this.sceneNIn = jSONObject.getJSONArray("sceneNIn");
        this.actionTypeIn = jSONObject.getJSONArray("actionTypeIn");
        this.actionNameIn = jSONObject.getJSONArray("actionNameIn");
        this.bizIdIn = jSONObject.getJSONArray("bizIdIn");
        this.bizArgsIn = jSONObject.getJSONObject("bizArgsIn");
        this.bizArgsNIn = jSONObject.getJSONObject("bizArgsNIn");
        this.intentionIn = jSONObject.getJSONObject("intentionIn");
        this.configModel = new kg4(this.sceneIn, this.sceneNIn, this.actionTypeIn, this.actionNameIn, this.bizArgsIn, this.bizArgsNIn, this.intentionIn);
    }

    public static /* synthetic */ Object ipc$super(BHRTaskConfig bHRTaskConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/config/BHRTaskConfig");
    }

    public JSONArray getActionNameIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("969e5dfb", new Object[]{this});
        }
        return this.actionNameIn;
    }

    public JSONArray getActionTypeIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6830daac", new Object[]{this});
        }
        return this.actionTypeIn;
    }

    public JSONObject getBizArgsIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("beb10746", new Object[]{this});
        }
        return this.bizArgsIn;
    }

    public kg4 getConfigModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kg4) ipChange.ipc$dispatch("35fd1111", new Object[]{this});
        }
        return this.configModel;
    }

    @Override // com.taobao.android.behavir.config.BHRTaskConfigBase
    public BHRTaskConfigType getConfigType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigType) ipChange.ipc$dispatch("e116d30b", new Object[]{this});
        }
        return BHRTaskConfigType.kBHRTaskConfigTypeBR;
    }

    public JSONArray getSceneIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("485d3c5c", new Object[]{this});
        }
        return this.sceneIn;
    }

    @Override // com.taobao.android.behavir.config.BHRTaskConfigBase
    public String getTaskType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68802a44", new Object[]{this});
        }
        return "br";
    }

    public int compareTo(BHRTaskConfig bHRTaskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4f67e8", new Object[]{this, bHRTaskConfig})).intValue();
        }
        if (bHRTaskConfig == null) {
            return 0;
        }
        JSONObject taskInfo = bHRTaskConfig.getTaskInfo();
        JSONObject taskInfo2 = getTaskInfo();
        if (taskInfo == null || taskInfo2 == null) {
            return 0;
        }
        return taskInfo.getIntValue("priority") - taskInfo2.getIntValue("priority");
    }
}
