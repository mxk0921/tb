package com.ali.alihadeviceevaluator.network;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class MtopTaobaoHaQueryResponse extends BaseOutDo {
    private MtopTaobaoHaQueryResponseData data;

    public void setData(MtopTaobaoHaQueryResponseData mtopTaobaoHaQueryResponseData) {
        this.data = mtopTaobaoHaQueryResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoHaQueryResponseData getData() {
        return this.data;
    }
}
