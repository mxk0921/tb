package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSyncResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyTemplateSyncResponseData data;

    static {
        t2o.a(552599790);
    }

    public void setData(MtopTaobaoAlimpBentleyTemplateSyncResponseData mtopTaobaoAlimpBentleyTemplateSyncResponseData) {
        this.data = mtopTaobaoAlimpBentleyTemplateSyncResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleyTemplateSyncResponseData getData() {
        return this.data;
    }
}
