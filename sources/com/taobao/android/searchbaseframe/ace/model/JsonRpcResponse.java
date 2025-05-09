package com.taobao.android.searchbaseframe.ace.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rho;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsonRpcResponse implements rho {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private String jsonrpc;
    private JSONObject result;

    static {
        t2o.a(993001593);
        t2o.a(993001597);
    }

    @Override // tb.rho
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public String getJsonrpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c735a192", new Object[]{this});
        }
        return this.jsonrpc;
    }

    public JSONObject getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce08713a", new Object[]{this});
        }
        return this.result;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setJsonrpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2682198c", new Object[]{this, str});
        } else {
            this.jsonrpc = str;
        }
    }

    public void setResult(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7db8a", new Object[]{this, jSONObject});
        } else {
            this.result = jSONObject;
        }
    }
}
