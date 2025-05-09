package com.taobao.favorites.favoritesdk.category.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryQueryShareListResponse extends BaseOutDo {
    private ComTaobaoMercuryQueryShareListResponseData data;

    static {
        t2o.a(707788849);
    }

    public void setData(ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponse", "public void setData(ComTaobaoMercuryQueryShareListResponseData data)", "20180112");
        this.data = comTaobaoMercuryQueryShareListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMercuryQueryShareListResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponse", "public ComTaobaoMercuryQueryShareListResponseData getData()", "20180112");
        return this.data;
    }
}
