package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoMclFavDelcollectResponse extends BaseOutDo {
    private ComTaobaoMclFavDelcollectResponseData data;

    static {
        t2o.a(764412071);
    }

    public void setData(ComTaobaoMclFavDelcollectResponseData comTaobaoMclFavDelcollectResponseData) {
        this.data = comTaobaoMclFavDelcollectResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoMclFavDelcollectResponseData getData() {
        return this.data;
    }
}
