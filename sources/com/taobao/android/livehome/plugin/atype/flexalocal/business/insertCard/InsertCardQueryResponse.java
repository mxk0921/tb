package com.taobao.android.livehome.plugin.atype.flexalocal.business.insertCard;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InsertCardQueryResponse extends BaseOutDo {
    private InsertCardQueryResponseData data;

    static {
        t2o.a(310378521);
    }

    public void setData(InsertCardQueryResponseData insertCardQueryResponseData) {
        this.data = insertCardQueryResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public InsertCardQueryResponseData getData() {
        return this.data;
    }
}
