package com.taobao.share.core.contacts.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoMclContactsSendshareResponse extends BaseOutDo {
    public ComTaobaoMclContactsSendshareResponseData data;

    static {
        t2o.a(664797235);
    }

    public void setData(ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData) {
        this.data = comTaobaoMclContactsSendshareResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMclContactsSendshareResponseData getData() {
        return this.data;
    }
}
