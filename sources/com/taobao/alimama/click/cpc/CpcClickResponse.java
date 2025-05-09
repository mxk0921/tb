package com.taobao.alimama.click.cpc;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpcClickResponse extends BaseOutDo implements IMTOPDataObject {
    private CpcClickResponseData data;

    static {
        t2o.a(1017118737);
        t2o.a(589299906);
    }

    public void setData(CpcClickResponseData cpcClickResponseData) {
        this.data = cpcClickResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CpcClickResponseData getData() {
        return this.data;
    }
}
