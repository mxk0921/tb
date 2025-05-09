package com.taobao.tao.export.flickbtn.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryResponse extends BaseOutDo {
    private MtopTaobaoSharepasswordQueryEntryResponseData data;

    static {
        t2o.a(666894406);
    }

    public void setData(MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData) {
        this.data = mtopTaobaoSharepasswordQueryEntryResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoSharepasswordQueryEntryResponseData getData() {
        return this.data;
    }
}
