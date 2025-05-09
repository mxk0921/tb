package com.taobao.tbliveinteractive.business.tradetrack.sign;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopContentlivekitComponentTradeSignResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;

    static {
        t2o.a(806356584);
    }

    public static /* synthetic */ Object ipc$super(MtopContentlivekitComponentTradeSignResponse mtopContentlivekitComponentTradeSignResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveinteractive/business/tradetrack/sign/MtopContentlivekitComponentTradeSignResponse");
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }
}
