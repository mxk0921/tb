package com.taobao.alimama.click.extend.cpm;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ExtendCpmClickResponse extends BaseOutDo implements IMTOPDataObject {
    private ExtendCpmClickResponseData data;

    static {
        t2o.a(1017118762);
        t2o.a(589299906);
    }

    public void setData(ExtendCpmClickResponseData extendCpmClickResponseData) {
        this.data = extendCpmClickResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ExtendCpmClickResponseData getData() {
        return this.data;
    }
}
