package com.taobao.taobao.scancode.encode.longtoshort.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoXcodeQrcodeCreateResponse extends BaseOutDo {
    private ComTaobaoXcodeQrcodeCreateResponseData data;

    static {
        t2o.a(760217668);
    }

    public void setData(ComTaobaoXcodeQrcodeCreateResponseData comTaobaoXcodeQrcodeCreateResponseData) {
        this.data = comTaobaoXcodeQrcodeCreateResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ComTaobaoXcodeQrcodeCreateResponseData getData() {
        return this.data;
    }
}
