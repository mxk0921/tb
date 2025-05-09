package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaTkQueryChanneleResponse extends BaseOutDo implements IMTOPDataObject {
    private Object data;

    static {
        t2o.a(1018167361);
        t2o.a(589299906);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Object getData() {
        return this.data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }
}
