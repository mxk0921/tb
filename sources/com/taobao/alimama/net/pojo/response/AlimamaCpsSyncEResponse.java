package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaCpsSyncEResponse extends BaseOutDo implements IMTOPDataObject {
    private AlimamaCpsSyncEResponseData data;

    static {
        t2o.a(1018167358);
        t2o.a(589299906);
    }

    public void setData(AlimamaCpsSyncEResponseData alimamaCpsSyncEResponseData) {
        this.data = alimamaCpsSyncEResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public AlimamaCpsSyncEResponseData getData() {
        return this.data;
    }
}
