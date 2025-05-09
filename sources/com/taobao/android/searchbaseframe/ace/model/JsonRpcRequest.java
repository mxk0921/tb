package com.taobao.android.searchbaseframe.ace.model;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.UUID;
import tb.oho;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsonRpcRequest implements Serializable, oho {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private final String jsonrpc = "2.0";
    private String method;
    private JSON params;

    static {
        t2o.a(993001592);
        t2o.a(993001596);
    }

    public static JsonRpcRequest obtainMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("f10dfcf2", new Object[]{str});
        }
        JsonRpcRequest jsonRpcRequest = new JsonRpcRequest();
        jsonRpcRequest.setMethod(str);
        return jsonRpcRequest;
    }

    public static JsonRpcRequest obtainRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("3c551d7a", new Object[]{str});
        }
        JsonRpcRequest jsonRpcRequest = new JsonRpcRequest();
        jsonRpcRequest.setId(UUID.randomUUID().toString());
        jsonRpcRequest.setMethod(str);
        return jsonRpcRequest;
    }

    @Override // tb.oho
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
        return "2.0";
    }

    @Override // tb.oho
    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.method;
    }

    public JSON getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("5cf85ee2", new Object[]{this});
        }
        return this.params;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    public void setParams(JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47683180", new Object[]{this, json});
        } else {
            this.params = json;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }
}
