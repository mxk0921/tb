package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data;

    static {
        t2o.a(530579471);
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData getData() {
        return this.data;
    }
}
