package com.taobao.taopai.material.request.materialdetail;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialDetailResponse extends BaseOutDo {
    private MaterialDetailData data;

    static {
        t2o.a(782237805);
    }

    public void setData(MaterialDetailData materialDetailData) {
        this.data = materialDetailData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MaterialDetailData getData() {
        return this.data;
    }
}
