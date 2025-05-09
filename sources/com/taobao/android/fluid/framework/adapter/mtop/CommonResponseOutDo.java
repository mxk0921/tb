package com.taobao.android.fluid.framework.adapter.mtop;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommonResponseOutDo<T extends IMTOPDataObject> extends BaseOutDo implements Serializable {
    public T data;

    static {
        t2o.a(468713831);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public T getData() {
        return this.data;
    }
}
