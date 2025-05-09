package com.taobao.android.detail.alicom.model.network;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class QueryContractPhoneNumberResult extends BaseOutDo {
    private QueryContractPhoneNumberData data;

    static {
        t2o.a(703594521);
    }

    public void setData(QueryContractPhoneNumberData queryContractPhoneNumberData) {
        this.data = queryContractPhoneNumberData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public QueryContractPhoneNumberData getData() {
        return this.data;
    }
}
