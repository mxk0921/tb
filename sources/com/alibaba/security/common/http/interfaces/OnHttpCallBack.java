package com.alibaba.security.common.http.interfaces;

import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface OnHttpCallBack<T extends HttpResponse> {
    void onFail(HttpRequest httpRequest, Exception exc);

    void onSuccess(HttpRequest httpRequest, T t);
}
