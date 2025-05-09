package com.taobao.jacoco.data;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoCoverageMetaInfoSaveResponse extends BaseOutDo {
    private MtopTaobaoCoverageMetaInfoSaveResponseData data;

    public void setData(MtopTaobaoCoverageMetaInfoSaveResponseData mtopTaobaoCoverageMetaInfoSaveResponseData) {
        this.data = mtopTaobaoCoverageMetaInfoSaveResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoCoverageMetaInfoSaveResponseData getData() {
        return this.data;
    }
}
