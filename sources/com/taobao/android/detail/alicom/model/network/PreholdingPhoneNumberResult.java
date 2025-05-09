package com.taobao.android.detail.alicom.model.network;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreholdingPhoneNumberResult extends BaseOutDo {
    private PreholdingPhoneNumberData data;

    static {
        t2o.a(703594518);
    }

    public void setData(PreholdingPhoneNumberData preholdingPhoneNumberData) {
        this.data = preholdingPhoneNumberData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public PreholdingPhoneNumberData getData() {
        return this.data;
    }
}
