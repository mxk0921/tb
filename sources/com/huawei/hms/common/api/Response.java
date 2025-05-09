package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Response<T extends Result> {
    protected T result;

    public Response() {
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T t) {
        this.result = t;
    }

    public Response(T t) {
        this.result = t;
    }
}
