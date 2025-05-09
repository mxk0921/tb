package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Delta implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mOriginData;
    @Deprecated
    public String opType;
    @Deprecated
    public String position;
    @Deprecated
    public String root;
    @Deprecated
    public String target;

    static {
        t2o.a(80740672);
    }

    public Delta() {
    }

    public String getOpType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec24bbe8", new Object[]{this});
        }
        if (this.opType == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.opType = jSONObject.getString("opType");
        }
        return this.opType;
    }

    public String getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        if (this.position == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.position = jSONObject.getString("position");
        }
        return this.position;
    }

    public String getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb1a0ca1", new Object[]{this});
        }
        if (this.root == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.root = jSONObject.getString("root");
        }
        return this.root;
    }

    public String getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
        }
        if (this.target == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.target = jSONObject.getString("target");
        }
        return this.target;
    }

    public Delta(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }
}
