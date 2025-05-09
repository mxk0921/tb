package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoAlimpBentleyLayoutSyncResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyLayoutSyncResponseData data;

    static {
        t2o.a(552599787);
    }

    public void setData(MtopTaobaoAlimpBentleyLayoutSyncResponseData mtopTaobaoAlimpBentleyLayoutSyncResponseData) {
        this.data = mtopTaobaoAlimpBentleyLayoutSyncResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoAlimpBentleyLayoutSyncResponseData getData() {
        return this.data;
    }
}
