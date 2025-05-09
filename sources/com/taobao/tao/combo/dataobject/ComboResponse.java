package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComboResponse extends BaseOutDo {
    private ComboData data;

    static {
        t2o.a(764412077);
    }

    public void setData(ComboData comboData) {
        this.data = comboData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComboData getData() {
        return this.data;
    }
}
