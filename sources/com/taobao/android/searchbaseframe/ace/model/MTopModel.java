package com.taobao.android.searchbaseframe.ace.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MTopModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiName;
    private JSONObject params;
    private String requestAlias;
    private JSONObject requestHeaders;
    private JSONObject response;
    private JSONObject responseHeaders;
    private String status;

    static {
        t2o.a(993001594);
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.apiName;
    }

    public JSONObject getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.params;
    }

    public String getRequestAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eda8c7e2", new Object[]{this});
        }
        return this.requestAlias;
    }

    public JSONObject getRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12d2d414", new Object[]{this});
        }
        return this.requestHeaders;
    }

    public JSONObject getResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7fd55de", new Object[]{this});
        }
        return this.response;
    }

    public JSONObject getResponseHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("387481f6", new Object[]{this});
        }
        return this.responseHeaders;
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.status;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str.toLowerCase();
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

    public void setRequestAlias(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580ea8d4", new Object[]{this, str});
        } else {
            this.requestAlias = str;
        }
    }

    public void setRequestHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe91ff0", new Object[]{this, jSONObject});
        } else {
            this.requestHeaders = jSONObject;
        }
    }

    public void setResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c447e66", new Object[]{this, jSONObject});
        } else {
            this.response = jSONObject;
        }
    }

    public void setResponseHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25273de6", new Object[]{this, jSONObject});
        } else {
            this.responseHeaders = jSONObject;
        }
    }

    public void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }
}
