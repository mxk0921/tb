package com.taobao.favorites.favoritesdk.category.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryCreateShareListResponse extends BaseOutDo {
    private ComTaobaoMercuryCreateShareListResponseData data;

    static {
        t2o.a(707788845);
    }

    public void setData(ComTaobaoMercuryCreateShareListResponseData comTaobaoMercuryCreateShareListResponseData) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryCreateShareListResponse", "public void setData(ComTaobaoMercuryCreateShareListResponseData data)", "20180112");
        this.data = comTaobaoMercuryCreateShareListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMercuryCreateShareListResponseData getData() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryCreateShareListResponse", "public ComTaobaoMercuryCreateShareListResponseData getData()", "20180112");
        return this.data;
    }
}
