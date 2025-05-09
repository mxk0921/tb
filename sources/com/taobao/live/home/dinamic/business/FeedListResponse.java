package com.taobao.live.home.dinamic.business;

import com.taobao.live.home.dinamic.model.FeedListData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FeedListResponse<responseData extends FeedListData> extends BaseOutDo {
    private responseData data;

    static {
        t2o.a(806355400);
    }

    public void setData(responseData responsedata) {
        this.data = responsedata;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public responseData getData() {
        return this.data;
    }
}
