package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopGetScheduleByScanCodeResponse extends BaseOutDo {
    private MtopGetScheduleByScanCodeResponseData data;

    static {
        t2o.a(414187598);
    }

    public void setData(MtopGetScheduleByScanCodeResponseData mtopGetScheduleByScanCodeResponseData) {
        this.data = mtopGetScheduleByScanCodeResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopGetScheduleByScanCodeResponseData getData() {
        return this.data;
    }
}
