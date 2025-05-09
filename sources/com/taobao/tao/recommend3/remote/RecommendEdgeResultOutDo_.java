package com.taobao.tao.recommend3.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendEdgeResultOutDo_ extends BaseOutDo {
    private RecommendEdgeResult data;

    static {
        t2o.a(729809873);
    }

    public void setData(RecommendEdgeResult recommendEdgeResult) {
        this.data = recommendEdgeResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public RecommendEdgeResult getData() {
        return this.data;
    }
}
