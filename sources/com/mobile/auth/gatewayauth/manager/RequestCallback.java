package com.mobile.auth.gatewayauth.manager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface RequestCallback<T, K> {
    void onError(K k);

    void onSuccess(T t);
}
