package com.taobao.passivelocation.business.report_location;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopLbsPosServiceResponse extends BaseOutDo {
    private MtopLbsPosServiceResponseData data;

    static {
        t2o.a(789577834);
    }

    public void setData(MtopLbsPosServiceResponseData mtopLbsPosServiceResponseData) {
        this.data = mtopLbsPosServiceResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopLbsPosServiceResponseData getData() {
        return this.data;
    }
}
