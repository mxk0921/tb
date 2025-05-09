package com.taobao.android.behavir.config;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.a;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import tb.iaa;
import tb.rja;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BHRTaskConfigBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BHRTaskConfigBase";
    public static final String TYPE_CONFIG_BR = "br";
    public static final String TYPE_CONFIG_UT = "ut";
    private JSONObject attributes;
    private final String configId;
    private final String configName;
    private final Boolean hasDynamicString;
    private boolean isBatchUpload;
    private boolean isDebugLog;
    private final transient JSONObject original;
    private final JSONObject originalTaskInfo;
    private JSONObject taskInfo;
    private double UCPTrackSampling = vu3.b.GEO_NOT_SUPPORT;
    private final String taskType = getTaskType();
    public final BHRTaskConfigType configType = getConfigType();

    static {
        t2o.a(404750361);
    }

    public BHRTaskConfigBase(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.original = jSONObject;
        this.configId = jSONObject.getString("configId");
        this.configName = jSONObject.getString(OConstant.DIMEN_CONFIG_NAME);
        Object obj = jSONObject.get("task");
        obj = obj == null ? jSONObject.get("taskArray") : obj;
        if (obj instanceof JSONObject) {
            this.taskInfo = (JSONObject) obj;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() > 0) {
                this.taskInfo = jSONArray.getJSONObject(0);
            } else {
                this.taskInfo = null;
            }
        } else {
            this.taskInfo = null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("attributes");
        if (!(jSONObject3 == null || (jSONObject2 = this.taskInfo) == null)) {
            jSONObject2.putAll(jSONObject3);
        }
        this.originalTaskInfo = this.taskInfo;
        this.hasDynamicString = Boolean.valueOf(checkHasDynamicString());
    }

    private boolean isMatchTrackSampling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584d5c62", new Object[]{this})).booleanValue();
        }
        return isMatchTrackSimpling(this.UCPTrackSampling);
    }

    public boolean checkHasDynamicString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98e769", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean enableDebugLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbfe011f", new Object[]{this})).booleanValue();
        }
        return this.isDebugLog;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BHRTaskConfigBase)) {
            return false;
        }
        BHRTaskConfigBase bHRTaskConfigBase = (BHRTaskConfigBase) obj;
        if (!TextUtils.equals(this.configId, bHRTaskConfigBase.configId) || !TextUtils.equals(this.configName, bHRTaskConfigBase.configName)) {
            return false;
        }
        return true;
    }

    public String getConfigId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f992a366", new Object[]{this});
        }
        return this.configId;
    }

    public String getConfigName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d054f1f6", new Object[]{this});
        }
        return this.configName;
    }

    public BHRTaskConfigType getConfigType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigType) ipChange.ipc$dispatch("e116d30b", new Object[]{this});
        }
        String str = this.taskType;
        str.hashCode();
        if (str.equals("br")) {
            return BHRTaskConfigType.kBHRTaskConfigTypeBR;
        }
        if (!str.equals(TYPE_CONFIG_UT)) {
            return BHRTaskConfigType.kBHRTaskConfigTypeUndefined;
        }
        return BHRTaskConfigType.kBHRTaskConfigTypeUT;
    }

    public JSONObject getOriginal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f09436e", new Object[]{this});
        }
        return this.original;
    }

    public JSONObject getTaskInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee9a2470", new Object[]{this});
        }
        JSONObject jSONObject = this.taskInfo;
        if (jSONObject != null) {
            return jSONObject;
        }
        return a.EMPTY_JSON;
    }

    public String getTaskType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68802a44", new Object[]{this});
        }
        JSONObject jSONObject = this.original;
        if (jSONObject == null) {
            return "";
        }
        return Utils.k(jSONObject.getString("type"));
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return new Pair(this.configId, this.configName).hashCode();
    }

    public boolean isBatchUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c0a8e5c", new Object[]{this})).booleanValue();
        }
        return this.isBatchUpload;
    }

    public boolean shouldUploadTrackSampling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503392a9", new Object[]{this})).booleanValue();
        }
        if (rja.b()) {
            return true;
        }
        if (this.UCPTrackSampling > vu3.b.GEO_NOT_SUPPORT) {
            if (isMatchTrackSampling()) {
                return true;
            }
        } else if (enableDebugLog()) {
            return true;
        }
        return false;
    }

    public JSONObject toJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        return this.original;
    }

    public static boolean isMatchTrackSimpling(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeebba9c", new Object[]{new Double(d)})).booleanValue();
        }
        if (Double.compare(d, 1.0d) >= 0) {
            return true;
        }
        if (TextUtils.isEmpty(iaa.f21189a)) {
            return false;
        }
        try {
            return ((double) (Long.parseLong(iaa.f21189a) % 10000)) < d * 10000.0d;
        } catch (Throwable th) {
            TLog.loge("UtUtils", "parse user id error.", th);
            return false;
        }
    }
}
