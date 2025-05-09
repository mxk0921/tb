package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EventReportResponse extends BaseOutDo {
    private EventReportData data;

    static {
        t2o.a(779092259);
    }

    public void setData(EventReportData eventReportData) {
        this.data = eventReportData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public EventReportData getData() {
        return this.data;
    }
}
