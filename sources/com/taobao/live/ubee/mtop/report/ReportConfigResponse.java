package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ReportConfigResponse extends BaseOutDo {
    private ReportConfigData data;

    static {
        t2o.a(779092262);
    }

    public void setData(ReportConfigData reportConfigData) {
        this.data = reportConfigData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ReportConfigData getData() {
        return this.data;
    }
}
