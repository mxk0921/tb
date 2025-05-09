package com.taobao.unit.center.sync.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSingleResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyTemplateSingleResponseData data;

    static {
        t2o.a(552599810);
    }

    public void setData(MtopTaobaoAlimpBentleyTemplateSingleResponseData mtopTaobaoAlimpBentleyTemplateSingleResponseData) {
        this.data = mtopTaobaoAlimpBentleyTemplateSingleResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleyTemplateSingleResponseData getData() {
        return this.data;
    }
}
