package com.taobao.android.dinamicx.expression.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXMsgCenterEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String method;
    public JSONObject params;
    private String targetId;
    public String type;

    static {
        t2o.a(444596807);
    }

    public DXMsgCenterEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXMsgCenterEvent dXMsgCenterEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXMsgCenterEvent");
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.method;
    }

    public JSONObject getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.params;
    }

    public String getTargetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ee30c37", new Object[]{this});
        }
        return this.targetId;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            this.params = jSONObject;
        }
    }

    public void setTargetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385bd51f", new Object[]{this, str});
        } else {
            this.targetId = str;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }
}
