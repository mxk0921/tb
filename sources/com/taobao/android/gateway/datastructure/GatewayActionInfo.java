package com.taobao.android.gateway.datastructure;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.b5a;
import tb.t2o;
import tb.x4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GatewayActionInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String actionName;
    private JSONObject actionParam;
    private JSONObject callbackConfig;
    private x4a targetComponent;
    private b5a triggerEvent;

    static {
        t2o.a(475004955);
    }

    public GatewayActionInfo(String str, x4a x4aVar, b5a b5aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.actionName = str;
        this.targetComponent = x4aVar;
        this.triggerEvent = b5aVar;
        this.actionParam = jSONObject;
        this.callbackConfig = jSONObject2;
    }

    public String getActionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd957182", new Object[]{this});
        }
        return this.actionName;
    }

    public JSONObject getActionParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("15e629e8", new Object[]{this});
        }
        return this.actionParam;
    }

    public JSONObject getCallbackConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91be3e04", new Object[]{this});
        }
        return this.callbackConfig;
    }

    public x4a getTargetComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4a) ipChange.ipc$dispatch("eaf33691", new Object[]{this});
        }
        return this.targetComponent;
    }

    public b5a getTriggerEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5a) ipChange.ipc$dispatch("80764196", new Object[]{this});
        }
        return this.triggerEvent;
    }

    public void setActionName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c024634", new Object[]{this, str});
        } else {
            this.actionName = str;
        }
    }

    public void setActionParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307bfa34", new Object[]{this, jSONObject});
        } else {
            this.actionParam = jSONObject;
        }
    }

    public void setCallbackConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6af400", new Object[]{this, jSONObject});
        } else {
            this.callbackConfig = jSONObject;
        }
    }

    public void setTargetComponent(x4a x4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43fbc53", new Object[]{this, x4aVar});
        } else {
            this.targetComponent = x4aVar;
        }
    }

    public void setTriggerEvent(b5a b5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7350dbc", new Object[]{this, b5aVar});
        } else {
            this.triggerEvent = b5aVar;
        }
    }

    public void updateActionParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416f6c9b", new Object[]{this, jSONObject});
        } else {
            this.actionParam = jSONObject;
        }
    }

    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return (this.actionName == null || this.targetComponent == null || this.triggerEvent == null) ? false : true;
    }
}
