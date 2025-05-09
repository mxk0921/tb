package com.taobao.favorites.favoritesdk.goods.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryDelCollectsResponse extends BaseOutDo {
    private MtopTaobaoMercuryDelCollectsResponseData data;

    static {
        t2o.a(707788868);
    }

    public void setData(MtopTaobaoMercuryDelCollectsResponseData mtopTaobaoMercuryDelCollectsResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryDelCollectsResponse", "public void setData(MtopTaobaoMercuryDelCollectsResponseData data)", "20180112");
        this.data = mtopTaobaoMercuryDelCollectsResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoMercuryDelCollectsResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryDelCollectsResponse", "public MtopTaobaoMercuryDelCollectsResponseData getData()", "20180112");
        return this.data;
    }
}
