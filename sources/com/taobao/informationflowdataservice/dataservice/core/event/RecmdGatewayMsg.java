package com.taobao.informationflowdataservice.dataservice.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.msgcenter.Message;
import java.util.List;
import tb.b5a;
import tb.i65;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecmdGatewayMsg extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587903);
    }

    private RecmdGatewayMsg() {
    }

    public static RecmdGatewayMsg getMessage(List<b5a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdGatewayMsg) ipChange.ipc$dispatch("83261ee", new Object[]{list});
        }
        if (list != null && !list.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("events", (Object) list);
                RecmdGatewayMsg recmdGatewayMsg = new RecmdGatewayMsg();
                recmdGatewayMsg.setParams(jSONObject);
                return recmdGatewayMsg;
            } catch (Throwable th) {
                i65.g("gateway2.msg", th, "generateGatewayMsg failed");
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(RecmdGatewayMsg recmdGatewayMsg, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/event/RecmdGatewayMsg");
    }

    @Override // com.taobao.android.gateway.msgcenter.Message
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return "gateway";
    }
}
