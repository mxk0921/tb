package com.o2o.ad.click.cpa;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OCpaSendResponse extends BaseOutDo implements IMTOPDataObject, Serializable {
    private O2OCpaSendResponseData data;

    static {
        t2o.a(1019215889);
        t2o.a(589299906);
    }

    public void setData(O2OCpaSendResponseData o2OCpaSendResponseData) {
        this.data = o2OCpaSendResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public O2OCpaSendResponseData getData() {
        return this.data;
    }
}
