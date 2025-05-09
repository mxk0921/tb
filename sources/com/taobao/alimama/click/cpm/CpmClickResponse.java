package com.taobao.alimama.click.cpm;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpmClickResponse extends BaseOutDo implements IMTOPDataObject {
    private CpmClickResponseData data;

    static {
        t2o.a(1017118745);
        t2o.a(589299906);
    }

    public void setData(CpmClickResponseData cpmClickResponseData) {
        this.data = cpmClickResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CpmClickResponseData getData() {
        return this.data;
    }
}
