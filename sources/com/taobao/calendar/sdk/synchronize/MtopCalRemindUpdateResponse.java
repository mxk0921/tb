package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopCalRemindUpdateResponse extends BaseOutDo {
    private MtopCalRemindUpdateResponseData data;

    static {
        t2o.a(414187595);
    }

    public void setData(MtopCalRemindUpdateResponseData mtopCalRemindUpdateResponseData) {
        this.data = mtopCalRemindUpdateResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopCalRemindUpdateResponseData getData() {
        return this.data;
    }
}
