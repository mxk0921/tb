package com.taobao.tao.infoflow.commonsubservice.recbot.impl;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetDefaultQuestionsResponse extends BaseOutDo {
    public GetDefaultQuestionsResult data;

    static {
        t2o.a(729809421);
    }

    public void setData(GetDefaultQuestionsResult getDefaultQuestionsResult) {
        this.data = getDefaultQuestionsResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetDefaultQuestionsResult getData() {
        return this.data;
    }
}
