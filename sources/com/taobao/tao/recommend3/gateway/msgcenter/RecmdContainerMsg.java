package com.taobao.tao.recommend3.gateway.msgcenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.msgcenter.Message;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecmdContainerMsg extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809708);
    }

    private RecmdContainerMsg() {
    }

    public static RecmdContainerMsg getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecmdContainerMsg) ipChange.ipc$dispatch("b5d0b79e", new Object[0]) : new RecmdContainerMsg();
    }

    public static /* synthetic */ Object ipc$super(RecmdContainerMsg recmdContainerMsg, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/gateway/msgcenter/RecmdContainerMsg");
    }

    @Override // com.taobao.android.gateway.msgcenter.Message
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return "recmd.container";
    }

    public static RecmdContainerMsg getMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdContainerMsg) ipChange.ipc$dispatch("d69fdde", new Object[]{jSONObject});
        }
        RecmdContainerMsg recmdContainerMsg = new RecmdContainerMsg();
        if (jSONObject != null) {
            recmdContainerMsg.setParams(jSONObject);
        }
        return recmdContainerMsg;
    }
}
