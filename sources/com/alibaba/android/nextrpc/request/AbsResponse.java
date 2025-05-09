package com.alibaba.android.nextrpc.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private String body;
    private final Map<String, List<String>> headers;
    private JSONObject originBody;
    private final String reqId;

    public AbsResponse(String str, Map<String, List<String>> map) {
        this.reqId = str;
        this.headers = map;
    }

    public String getBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8904be1", new Object[]{this});
        }
        String str = this.body;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = this.originBody;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toJSONString();
    }

    public Map<String, List<String>> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.headers;
    }

    public JSONObject getOriginBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f874e85", new Object[]{this});
        }
        return this.originBody;
    }

    public String getReqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        return this.reqId;
    }

    public void setBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf870b5", new Object[]{this, str});
        } else {
            this.body = str;
        }
    }

    public void setOriginBody(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246dcd9f", new Object[]{this, jSONObject});
        } else {
            this.originBody = jSONObject;
        }
    }

    public AbsResponse(String str, String str2, Map<String, List<String>> map) {
        this.reqId = str;
        this.body = str2;
        this.headers = map;
    }
}
