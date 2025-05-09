package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowDeleteResultOutDo extends BaseOutDo {
    private InfoFlowDeleteResult data;

    static {
        t2o.a(491782491);
    }

    public void setData(InfoFlowDeleteResult infoFlowDeleteResult) {
        this.data = infoFlowDeleteResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public InfoFlowDeleteResult getData() {
        return this.data;
    }
}
