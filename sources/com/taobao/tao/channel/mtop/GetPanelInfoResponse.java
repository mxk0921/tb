package com.taobao.tao.channel.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetPanelInfoResponse extends BaseOutDo {
    public GetPanelInfoResponseData data;

    static {
        t2o.a(666894382);
    }

    public void setData(GetPanelInfoResponseData getPanelInfoResponseData) {
        this.data = getPanelInfoResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetPanelInfoResponseData getData() {
        return this.data;
    }
}
