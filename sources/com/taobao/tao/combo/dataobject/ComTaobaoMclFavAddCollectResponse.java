package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoMclFavAddCollectResponse extends BaseOutDo {
    private ComTaobaoMclFavAddCollectResponseData data;

    static {
        t2o.a(764412067);
    }

    public void setData(ComTaobaoMclFavAddCollectResponseData comTaobaoMclFavAddCollectResponseData) {
        this.data = comTaobaoMclFavAddCollectResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMclFavAddCollectResponseData getData() {
        return this.data;
    }
}
