package com.taobao.relationship.mtop;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BasicOperationResponse extends BasicResponse {
    private OperationResult data;

    static {
        t2o.a(759169044);
    }

    public void setData(OperationResult operationResult) {
        this.data = operationResult;
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    public OperationResult getData() {
        return this.data;
    }
}
