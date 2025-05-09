package com.taobao.share.core.contacts.mtop.response;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoGetContactsMessageResponse extends BaseOutDo implements Serializable {
    public ComTaobaoGetContactsMessageResponseData data;

    static {
        t2o.a(664797229);
    }

    public void setData(ComTaobaoGetContactsMessageResponseData comTaobaoGetContactsMessageResponseData) {
        this.data = comTaobaoGetContactsMessageResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoGetContactsMessageResponseData getData() {
        return this.data;
    }
}
