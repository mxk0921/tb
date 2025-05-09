package com.taobao.tao.recommend3.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendDeleteResultOutDo_ extends BaseOutDo {
    private RecommendDeleteResult data;

    static {
        t2o.a(729809867);
    }

    public void setData(RecommendDeleteResult recommendDeleteResult) {
        this.data = recommendDeleteResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public RecommendDeleteResult getData() {
        return this.data;
    }
}
