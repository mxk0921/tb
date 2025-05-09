package com.taobao.taopai2.material.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Response<R> extends BaseOutDo {
    public R data;
    public int errorCode;
    public String errorMsg;

    static {
        t2o.a(782237935);
    }

    public Response() {
    }

    public void from(Response<?> response) {
        setApi(response.getApi());
        setRet(response.getRet());
        setV(response.getV());
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public R getData() {
        return this.data;
    }

    public Response(R r) {
        this.data = r;
    }

    public Response(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}
