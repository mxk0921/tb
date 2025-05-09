package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowOverlayResultOutDo extends BaseOutDo {
    private InfoFlowOverlayResult data;

    static {
        t2o.a(491782496);
    }

    public void setData(InfoFlowOverlayResult infoFlowOverlayResult) {
        this.data = infoFlowOverlayResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public InfoFlowOverlayResult getData() {
        return this.data;
    }
}
