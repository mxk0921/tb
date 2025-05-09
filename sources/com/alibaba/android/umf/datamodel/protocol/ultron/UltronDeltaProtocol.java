package com.alibaba.android.umf.datamodel.protocol.ultron;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronDeltaProtocol implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public Map<String, Component> data;
    @Deprecated
    public Hierarchy hierarchy;
    private JSONObject mOriginData;

    static {
        t2o.a(80740666);
    }

    public UltronDeltaProtocol() {
    }

    public Map<String, Component> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        if (this.data == null) {
            JSONObject jSONObject = this.mOriginData.getJSONObject("data");
            if (jSONObject == null) {
                return null;
            }
            this.data = new HashMap();
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2 instanceof JSONObject) {
                        this.data.put(str, new Component(jSONObject2));
                    }
                }
            }
        }
        return this.data;
    }

    public Hierarchy getHierarchy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("6545d238", new Object[]{this});
        }
        if (this.hierarchy == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.hierarchy = new Hierarchy(jSONObject.getJSONObject("hierarchy"));
        }
        return this.hierarchy;
    }

    public UltronDeltaProtocol(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }
}
