package com.taobao.informationflowdataservice.dataservice.bizcode.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecommendDeleteResultOutDo_ extends BaseOutDo {
    private RecommendDeleteResult data;

    static {
        t2o.a(487587850);
    }

    public void setData(RecommendDeleteResult recommendDeleteResult) {
        this.data = recommendDeleteResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public RecommendDeleteResult getData() {
        return this.data;
    }
}
