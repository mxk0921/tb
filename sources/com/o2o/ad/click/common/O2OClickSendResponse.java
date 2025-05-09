package com.o2o.ad.click.common;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OClickSendResponse extends BaseOutDo implements IMTOPDataObject, Serializable {
    private O2OClickSendResponseData data;

    static {
        t2o.a(1019215883);
        t2o.a(589299906);
    }

    public void setData(O2OClickSendResponseData o2OClickSendResponseData) {
        this.data = o2OClickSendResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public O2OClickSendResponseData getData() {
        return this.data;
    }
}
