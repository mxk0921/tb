package com.taobao.tao.timestamp;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GetTimestampResponse extends BaseOutDo {
    private GetTimestampResponseData data;

    static {
        t2o.a(775946405);
    }

    public void setData(GetTimestampResponseData getTimestampResponseData) {
        this.data = getTimestampResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetTimestampResponseData getData() {
        return this.data;
    }
}
