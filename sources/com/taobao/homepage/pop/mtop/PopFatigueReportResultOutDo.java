package com.taobao.homepage.pop.mtop;

import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PopFatigueReportResultOutDo extends BaseOutDo {
    private PopFatigueReportResult data;

    public void setData(PopFatigueReportResult popFatigueReportResult) {
        this.data = popFatigueReportResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public PopFatigueReportResult getData() {
        return this.data;
    }
}
