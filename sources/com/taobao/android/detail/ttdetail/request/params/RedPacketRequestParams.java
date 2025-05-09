package com.taobao.android.detail.ttdetail.request.params;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RedPacketRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;

    static {
        t2o.a(912262190);
        t2o.a(912262184);
    }

    public RedPacketRequestParams(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        return JSON.toJSONString(this.data);
    }
}
