package com.taobao.activelocation.mtop.pois;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopPoiResponse extends BaseOutDo {
    private MtopPoiResponseData data;

    static {
        t2o.a(789577751);
    }

    public void setData(MtopPoiResponseData mtopPoiResponseData) {
        this.data = mtopPoiResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopPoiResponseData getData() {
        return this.data;
    }
}
