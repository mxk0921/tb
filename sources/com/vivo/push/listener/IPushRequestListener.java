package com.vivo.push.listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IPushRequestListener<T, V> {
    void onFail(V v);

    void onSuccess(T t);
}
