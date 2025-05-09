package com.taobao.tao.infoflow.commonsubservice.recbot.impl;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecbotResponse extends BaseOutDo {
    public RecbotDataResult data;

    static {
        t2o.a(729809425);
    }

    public void setData(RecbotDataResult recbotDataResult) {
        this.data = recbotDataResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public RecbotDataResult getData() {
        return this.data;
    }
}
