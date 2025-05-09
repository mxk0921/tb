package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaZzAdGetResponse extends BaseOutDo implements IMTOPDataObject {
    private AlimamaZzAdGetResponseData data;

    static {
        t2o.a(1018167364);
        t2o.a(589299906);
    }

    public void setData(AlimamaZzAdGetResponseData alimamaZzAdGetResponseData) {
        this.data = alimamaZzAdGetResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public AlimamaZzAdGetResponseData getData() {
        return this.data;
    }
}
