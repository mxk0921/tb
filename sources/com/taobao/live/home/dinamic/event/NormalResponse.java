package com.taobao.live.home.dinamic.event;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NormalResponse extends BaseOutDo {
    private JSONObject data;

    static {
        t2o.a(806355423);
    }

    public void setData(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public JSONObject getData() {
        return this.data;
    }
}
