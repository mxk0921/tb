package com.taobao.favorites.favoritesdk.goods.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryAddCollectResponse extends BaseOutDo {
    private MtopTaobaoMercuryAddCollectResponseData data;

    static {
        t2o.a(707788863);
    }

    public void setData(MtopTaobaoMercuryAddCollectResponseData mtopTaobaoMercuryAddCollectResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryAddCollectResponse", "public void setData(MtopTaobaoMercuryAddCollectResponseData data)", "20180112");
        this.data = mtopTaobaoMercuryAddCollectResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoMercuryAddCollectResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryAddCollectResponse", "public MtopTaobaoMercuryAddCollectResponseData getData()", "20180112");
        return this.data;
    }
}
