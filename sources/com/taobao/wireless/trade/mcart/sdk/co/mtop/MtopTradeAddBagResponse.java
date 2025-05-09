package com.taobao.wireless.trade.mcart.sdk.co.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTradeAddBagResponse extends BaseOutDo {
    private String data;

    static {
        t2o.a(697303060);
    }

    public void setData(String str) {
        this.data = str;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public String getData() {
        return this.data;
    }
}
