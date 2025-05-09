package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoMclFavCheckcollectResponse extends BaseOutDo {
    private ComTaobaoMclFavCheckcollectResponseData data;

    static {
        t2o.a(764412069);
    }

    public void setData(ComTaobaoMclFavCheckcollectResponseData comTaobaoMclFavCheckcollectResponseData) {
        this.data = comTaobaoMclFavCheckcollectResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMclFavCheckcollectResponseData getData() {
        return this.data;
    }
}
