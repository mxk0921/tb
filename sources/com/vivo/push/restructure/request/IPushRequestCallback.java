package com.vivo.push.restructure.request;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IPushRequestCallback<T> {
    void onError(int i);

    void onSuccess(T t);
}
