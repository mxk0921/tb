package com.taobao.favorites.favoritesdk.category.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryEditShareListResponse extends BaseOutDo {
    private ComTaobaoMercuryEditShareListResponseData data;

    static {
        t2o.a(707788847);
    }

    public void setData(ComTaobaoMercuryEditShareListResponseData comTaobaoMercuryEditShareListResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryEditShareListResponse", "public void setData(ComTaobaoMercuryEditShareListResponseData data)", "20180112");
        this.data = comTaobaoMercuryEditShareListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMercuryEditShareListResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryEditShareListResponse", "public ComTaobaoMercuryEditShareListResponseData getData()", "20180112");
        return this.data;
    }
}
