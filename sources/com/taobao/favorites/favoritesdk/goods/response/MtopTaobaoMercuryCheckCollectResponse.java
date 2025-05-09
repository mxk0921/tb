package com.taobao.favorites.favoritesdk.goods.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryCheckCollectResponse extends BaseOutDo {
    private MtopTaobaoMercuryCheckCollectResponseData data;

    static {
        t2o.a(707788865);
    }

    public void setData(MtopTaobaoMercuryCheckCollectResponseData mtopTaobaoMercuryCheckCollectResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryCheckCollectResponse", "public void setData(MtopTaobaoMercuryCheckCollectResponseData data)", "20180112");
        this.data = mtopTaobaoMercuryCheckCollectResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoMercuryCheckCollectResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryCheckCollectResponse", "public MtopTaobaoMercuryCheckCollectResponseData getData()", "20180112");
        return this.data;
    }
}
