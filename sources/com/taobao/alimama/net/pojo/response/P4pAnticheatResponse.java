package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class P4pAnticheatResponse extends BaseOutDo implements IMTOPDataObject {
    private static final long serialVersionUID = -3871455772294398291L;
    private Object location;

    static {
        t2o.a(1018167366);
        t2o.a(589299906);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Object getData() {
        return this.location;
    }

    public void setData(Object obj) {
        this.location = obj;
    }
}
