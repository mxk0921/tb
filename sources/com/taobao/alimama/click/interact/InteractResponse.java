package com.taobao.alimama.click.interact;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InteractResponse extends BaseOutDo implements IMTOPDataObject {
    private InteractResponseData data;

    static {
        t2o.a(1017118769);
        t2o.a(589299906);
    }

    public void setData(InteractResponseData interactResponseData) {
        this.data = interactResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public InteractResponseData getData() {
        return this.data;
    }
}
