package com.taobao.android.gateway.msgcenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Message implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String channelId;
    private JSONObject params;

    static {
        t2o.a(475005026);
    }

    public String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return this.channelId;
    }

    public JSONObject getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.params;
    }

    public void setChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800868cd", new Object[]{this, str});
        } else {
            this.channelId = str;
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
}
