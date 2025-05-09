package com.o2o.ad.click.cps;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OCpsSendResponse extends BaseOutDo implements IMTOPDataObject, Serializable {
    private O2OCpsSendResponseData data;

    static {
        t2o.a(1019215897);
        t2o.a(589299906);
    }

    public void setData(O2OCpsSendResponseData o2OCpsSendResponseData) {
        this.data = o2OCpsSendResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public O2OCpsSendResponseData getData() {
        return this.data;
    }
}
