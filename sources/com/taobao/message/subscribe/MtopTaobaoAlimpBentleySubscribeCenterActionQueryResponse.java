package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data;

    static {
        t2o.a(530579477);
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData getData() {
        return this.data;
    }
}
