package com.taobao.umipublish.extension.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CommonResponseOutDo<T extends IMTOPDataObject> extends BaseOutDo {
    public T data;

    static {
        t2o.a(944767016);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public T getData() {
        return this.data;
    }
}
