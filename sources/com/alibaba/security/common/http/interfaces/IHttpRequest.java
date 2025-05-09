package com.alibaba.security.common.http.interfaces;

import com.alibaba.security.common.http.model.HttpRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IHttpRequest {
    void asyncRequest(HttpRequest httpRequest, OnHttpCallBack onHttpCallBack);
}
