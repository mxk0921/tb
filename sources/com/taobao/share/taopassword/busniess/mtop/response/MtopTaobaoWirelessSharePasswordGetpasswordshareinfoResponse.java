package com.taobao.share.taopassword.busniess.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse extends BaseOutDo {
    private MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData data;

    static {
        t2o.a(665845890);
    }

    public void setData(MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData) {
        this.data = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData getData() {
        return this.data;
    }
}
