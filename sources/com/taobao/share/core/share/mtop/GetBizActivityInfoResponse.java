package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetBizActivityInfoResponse extends BaseOutDo {
    public GetBizActivityInfoResponseData data;

    static {
        t2o.a(664797273);
    }

    public void setData(GetBizActivityInfoResponseData getBizActivityInfoResponseData) {
        this.data = getBizActivityInfoResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetBizActivityInfoResponseData getData() {
        return this.data;
    }
}
