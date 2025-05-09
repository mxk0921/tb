package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data;

    static {
        t2o.a(530579474);
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData getData() {
        return this.data;
    }
}
