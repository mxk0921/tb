package com.taobao.passivelocation.business.report_error;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopLbsReportLocationErrResponse extends BaseOutDo {
    private MtopLbsReportLocationErrResponseData data;

    static {
        t2o.a(789577831);
    }

    public void setData(MtopLbsReportLocationErrResponseData mtopLbsReportLocationErrResponseData) {
        this.data = mtopLbsReportLocationErrResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopLbsReportLocationErrResponseData getData() {
        return this.data;
    }
}
