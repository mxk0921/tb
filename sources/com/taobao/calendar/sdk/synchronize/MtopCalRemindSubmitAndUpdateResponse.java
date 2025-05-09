package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopCalRemindSubmitAndUpdateResponse extends BaseOutDo {
    private MtopCalRemindSubmitAndUpdateResponseData data;

    static {
        t2o.a(414187592);
    }

    public void setData(MtopCalRemindSubmitAndUpdateResponseData mtopCalRemindSubmitAndUpdateResponseData) {
        this.data = mtopCalRemindSubmitAndUpdateResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopCalRemindSubmitAndUpdateResponseData getData() {
        return this.data;
    }
}
